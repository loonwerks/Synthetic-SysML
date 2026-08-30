package Vehicle_Mode_Coordinator {

  private import HAMR::*;

  enum def ReportedCondition {
    enum Normal;
    enum Degraded;
    enum Invalid;
  }

  enum def ReportCurrency {
    enum Current;
    enum Stale;
  }

  enum def ConditionAssessment {
    enum CurrentNormal;
    enum CurrentDegraded;
    enum Unusable;
  }

  enum def ControllerMode {
    enum Off;
    enum Starting;
    enum On;
    enum Maintenance;
    enum Degraded;
  }

  enum def RecoveryTarget {
    enum Off;
    enum Starting;
    enum On;
  }

  enum def ParkingBrakeDisposition {
    enum Apply;
    enum Release;
  }

  enum def CoordinationStatus {
    enum IdleOff;
    enum StartingSequence;
    enum Operating;
    enum MaintenanceHandoff;
    enum DegradedCondition;
    enum DegradedInvalid;
    enum RecoveryResumed;
    enum ShutdownDominant;
    enum RequestConflict;
    enum RequestInapplicable;
  }

  enum def SelectedIntent {
    enum SelectOff;
    enum SelectInvalidDegraded;
    enum SelectConditionDegraded;
    enum SelectMaintenance;
    enum SelectReturn;
    enum SelectOn;
    enum SelectStart;
    enum SelectHold;
  }

  enum def QualifiedTransition {
    enum QualifiedStay;
    enum QualifiedGoOff;
    enum QualifiedGoStarting;
    enum QualifiedGoOn;
    enum QualifiedGoMaintenance;
    enum QualifiedGoDegraded;
    enum QualifiedResumeStored;
    enum QualifiedReject;
  }

  enum def TransitionKind {
    enum Stay;
    enum GoOff;
    enum GoStarting;
    enum GoOn;
    enum GoMaintenance;
    enum GoDegraded;
    enum ResumeStored;
    enum Reject;
  }

  part def LifecycleLevels :> Data {
    attribute startLevel : Base_Types::Boolean;
    attribute onLevel : Base_Types::Boolean;
    attribute offLevel : Base_Types::Boolean;
  }

  part def ServiceLevels :> Data {
    attribute maintenanceLevel : Base_Types::Boolean;
    attribute returnNormalLevel : Base_Types::Boolean;
  }

  part def ConditionEvidence :> Data {
    attribute reportedCondition : ReportedCondition;
    attribute reportCurrency : ReportCurrency;
  }

  part def LifecycleFacts :> Data {
    attribute freshStart : Base_Types::Boolean;
    attribute freshOn : Base_Types::Boolean;
    attribute offActive : Base_Types::Boolean;
    attribute lifecycleConflict : Base_Types::Boolean;
  }

  part def ServiceFacts :> Data {
    attribute freshMaintenance : Base_Types::Boolean;
    attribute freshReturn : Base_Types::Boolean;
    attribute serviceConflict : Base_Types::Boolean;
  }

  part def ArbitrationResult :> Data {
    attribute selectedIntent : SelectedIntent;
    attribute priorityConflict : Base_Types::Boolean;
  }

  part def TransitionResolution :> Data {
    attribute nextMode : ControllerMode;
    attribute kind : TransitionKind;
    attribute accepted : Base_Types::Boolean;
  }

  part def CoordinationOutcome :> Data {
    attribute parkingBrake : ParkingBrakeDisposition;
    attribute status : CoordinationStatus;
  }

  part def LifecycleEventOwner :> Thread {
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    port lifecycleFacts : DataPort { out :>> type : LifecycleFacts; }

    language "GUMBO" /*{
      state
        previousStart: Base_Types::Boolean;
        previousOn: Base_Types::Boolean;
        previousOff: Base_Types::Boolean;

      initialize
        guarantee INITIAL_LIFECYCLE_HISTORY:
          previousStart == false &
          previousOn == false &
          previousOff == false &
          lifecycleFacts.freshStart == false &
          lifecycleFacts.freshOn == false &
          lifecycleFacts.offActive == false &
          lifecycleFacts.lifecycleConflict == false;

      compute
        modifies previousStart, previousOn, previousOff;
        guarantee LIFECYCLE_RISING_EDGES:
          lifecycleFacts.freshStart == (lifecycleLevels.startLevel & not In(previousStart)) &
          lifecycleFacts.freshOn == (lifecycleLevels.onLevel & not In(previousOn)) &
          lifecycleFacts.offActive == lifecycleLevels.offLevel;
        guarantee LIFECYCLE_CONFLICT:
          lifecycleFacts.lifecycleConflict ==
            ((lifecycleLevels.startLevel & lifecycleLevels.onLevel) |
             (lifecycleLevels.startLevel & lifecycleLevels.offLevel) |
             (lifecycleLevels.onLevel & lifecycleLevels.offLevel));
        guarantee STORE_LIFECYCLE_LEVELS:
          previousStart == lifecycleLevels.startLevel &
          previousOn == lifecycleLevels.onLevel &
          previousOff == lifecycleLevels.offLevel;
    }*/
  }

  part def ServiceEventOwner :> Thread {
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    port serviceFacts : DataPort { out :>> type : ServiceFacts; }

    language "GUMBO" /*{
      state
        previousMaintenance: Base_Types::Boolean;
        previousReturn: Base_Types::Boolean;

      initialize
        guarantee INITIAL_SERVICE_HISTORY:
          previousMaintenance == false &
          previousReturn == false &
          serviceFacts.freshMaintenance == false &
          serviceFacts.freshReturn == false &
          serviceFacts.serviceConflict == false;

      compute
        modifies previousMaintenance, previousReturn;
        guarantee SERVICE_RISING_EDGES:
          serviceFacts.freshMaintenance ==
            (serviceLevels.maintenanceLevel & not In(previousMaintenance)) &
          serviceFacts.freshReturn ==
            (serviceLevels.returnNormalLevel & not In(previousReturn));
        guarantee SERVICE_CONFLICT:
          serviceFacts.serviceConflict ==
            (serviceLevels.maintenanceLevel & serviceLevels.returnNormalLevel);
        guarantee STORE_SERVICE_LEVELS:
          previousMaintenance == serviceLevels.maintenanceLevel &
          previousReturn == serviceLevels.returnNormalLevel;
    }*/

                        
           
                                                  
                                             

                
                                                     
                 
                            
                                                                                                
                                                            
                                                                                
                                              

             
                                                     
                          
                                                                                       
                                          
                                                                            
                                     
                                                                       

                         
                                                                                                   
                                         
                                                                               

                          
                                                                                             
                                                                 
                                                            
       
  }

  part def ConditionAssessmentOwner :> Thread {
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    port conditionAssessment : DataPort { out :>> type : ConditionAssessment; }

    language "GUMBO" /*{
      compute
        guarantee CONDITION_QUALIFICATION:
          (conditionEvidence.reportCurrency == ReportCurrency::Stale implies
            conditionAssessment == ConditionAssessment::Unusable) &
          (conditionEvidence.reportCurrency == ReportCurrency::Current &
           conditionEvidence.reportedCondition == ReportedCondition::Invalid implies
            conditionAssessment == ConditionAssessment::Unusable) &
          (conditionEvidence.reportCurrency == ReportCurrency::Current &
           conditionEvidence.reportedCondition == ReportedCondition::Degraded implies
            conditionAssessment == ConditionAssessment::CurrentDegraded) &
          (conditionEvidence.reportCurrency == ReportCurrency::Current &
           conditionEvidence.reportedCondition == ReportedCondition::Normal implies
            conditionAssessment == ConditionAssessment::CurrentNormal);
    }*/

                        
             
                         
                                                                                                                   
                                                                             
                                                                    
                                                                        
                                                                                     
                                                                    
                                                                        
                                                                                      
                                                                           
                                                                        
                                                                                    
                                                                        
       
  }

  part def IntentArbitrationOwner :> Thread {
    port lifecycleFacts : DataPort { in :>> type : LifecycleFacts; }
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port conditionAssessment : DataPort { in :>> type : ConditionAssessment; }
    port arbitrationForQualification : DataPort { out :>> type : ArbitrationResult; }
    port arbitrationForPublication : DataPort { out :>> type : ArbitrationResult; }

    language "GUMBO" /*{
      functions
        @strictpure def atLeastTwoCandidates(
          a: Base_Types::Boolean, b: Base_Types::Boolean, c: Base_Types::Boolean,
          d: Base_Types::Boolean, e: Base_Types::Boolean, f: Base_Types::Boolean,
          g: Base_Types::Boolean): Base_Types::Boolean :=
          (a & (b | c | d | e | f | g)) |
          (b & (c | d | e | f | g)) |
          (c & (d | e | f | g)) |
          (d & (e | f | g)) |
          (e & (f | g)) |
          (f & g);

      compute
        guarantee PRIORITY_CONFLICT:
          arbitrationForQualification.priorityConflict ==
            (lifecycleFacts.lifecycleConflict |
             serviceFacts.serviceConflict |
             atLeastTwoCandidates(
               lifecycleFacts.offActive,
               conditionAssessment == ConditionAssessment::Unusable,
               conditionAssessment == ConditionAssessment::CurrentDegraded,
               serviceFacts.freshMaintenance,
               serviceFacts.freshReturn,
               lifecycleFacts.freshOn,
               lifecycleFacts.freshStart)) &
          arbitrationForPublication.priorityConflict ==
            arbitrationForQualification.priorityConflict;
        guarantee PUBLISH_ARBITRATION:
          arbitrationForPublication.selectedIntent ==
            arbitrationForQualification.selectedIntent;
        compute_cases
          case CASE_01_OFF:
            assume lifecycleFacts.offActive;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent::SelectOff;
          case CASE_02_UNUSABLE:
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment::Unusable;
            guarantee arbitrationForQualification.selectedIntent ==
              SelectedIntent::SelectInvalidDegraded;
          case CASE_03_DEGRADED:
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment::CurrentDegraded;
            guarantee arbitrationForQualification.selectedIntent ==
              SelectedIntent::SelectConditionDegraded;
          case CASE_04_MAINTENANCE:
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment::CurrentNormal &
              serviceFacts.freshMaintenance;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent::SelectMaintenance;
          case CASE_05_RETURN:
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment::CurrentNormal &
              not serviceFacts.freshMaintenance & serviceFacts.freshReturn;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent::SelectReturn;
          case CASE_06_ON:
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment::CurrentNormal &
              not serviceFacts.freshMaintenance & not serviceFacts.freshReturn &
              lifecycleFacts.freshOn;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent::SelectOn;
          case CASE_07_START:
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment::CurrentNormal &
              not serviceFacts.freshMaintenance & not serviceFacts.freshReturn &
              not lifecycleFacts.freshOn & lifecycleFacts.freshStart;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent::SelectStart;
          case CASE_08_HOLD:
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment::CurrentNormal &
              not serviceFacts.freshMaintenance & not serviceFacts.freshReturn &
              not lifecycleFacts.freshOn & not lifecycleFacts.freshStart;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent::SelectHold;
    }*/

                        
               
                                 
                                  
                                  
                                  
                                  
                                  
                                  
                                                           
                                           
                                       
                                   
                               
                           
                    

             
                        
                                                                                                               
                                                         
                                                                              
                                  
                                        
                                                                   
                                                                          
                                             
                                        
                                      
                                            
                                                       
                                                         

                        
                                                                                                       
                                                     
                                                       

                     
                           
                                                                      
                                            
                                                                                             

                           
                                                                                  
                                                 
                                                                  
                                                                                                         

                           
                                                                                                 
                                                 
                                                                         
                                                                                                           

                           
                                                                                       
                                                 
                                                                        
                                            
                                                                                                     

                           
                                                                                        
                                                 
                                                                        
                                                                           
                                                                                                

                           
                                                                                              
                                                 
                                                                        
                                                                                
                                     
                                                                                            

                           
                                                                                            
                                                 
                                                                        
                                                                                
                                                                     
                                                                                               

                           
                                                        
                                                 
                                                                        
                                                                                
                                                                         
                                                                                              
       
  }

  part def TransitionQualificationOwner :> Thread {
    port arbitrationResult : DataPort { in :>> type : ArbitrationResult; }
    port currentMode : DataPort { in :>> type : ControllerMode; }
    port qualifiedTransition : DataPort { out :>> type : QualifiedTransition; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_09_OFF:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectOff;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedGoOff;
          case CASE_10_FORCED_DEGRADED:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectInvalidDegraded |
              arbitrationResult.selectedIntent == SelectedIntent::SelectConditionDegraded;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedGoDegraded;
          case CASE_11_MAINTENANCE_APPLICABLE:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectMaintenance &
              currentMode != ControllerMode::Degraded;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedGoMaintenance;
          case CASE_12_MAINTENANCE_REJECTED:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectMaintenance &
              currentMode == ControllerMode::Degraded;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedReject;
          case CASE_13_RESUME:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectReturn &
              currentMode == ControllerMode::Degraded;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedResumeStored;
          case CASE_14_LEAVE_MAINTENANCE:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectReturn &
              currentMode == ControllerMode::Maintenance;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedGoOff;
          case CASE_15_RETURN_REJECTED:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectReturn &
              (currentMode == ControllerMode::Off |
               currentMode == ControllerMode::Starting |
               currentMode == ControllerMode::On);
            guarantee qualifiedTransition == QualifiedTransition::QualifiedReject;
          case CASE_16_ON_APPLICABLE:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectOn &
              currentMode == ControllerMode::Starting;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedGoOn;
          case CASE_17_ON_REJECTED:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectOn &
              currentMode != ControllerMode::Starting;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedReject;
          case CASE_18_START_APPLICABLE:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectStart &
              currentMode == ControllerMode::Off;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedGoStarting;
          case CASE_19_START_REJECTED:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectStart &
              currentMode != ControllerMode::Off;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedReject;
          case CASE_20_HOLD:
            assume arbitrationResult.selectedIntent == SelectedIntent::SelectHold;
            guarantee qualifiedTransition == QualifiedTransition::QualifiedStay;
    }*/

                        
             
                     
                           
                                                                                     
                                                                                
                                                                                

                           
                                                                                                              
                                                                                             
                                                                                         
                                                                                     

                           
                                                                                                       
                                                                                         
                                                     
                                                                                        

                           
                                                                                     
                                                                                         
                                                     
                                                                                 

                           
                                                                                    
                                                                                    
                                                     
                                                                                       

                           
                                                                                    
                                                                                    
                                                        
                                                                                

                           
                                                                                                   
                                                                                    
                                                  
                                                       
                                                 
                                                                                 

                           
                                                                           
                                                                                
                                                     
                                                                               

                           
                                                                                 
                                                                                
                                                     
                                                                                 

                           
                                                                            
                                                                                   
                                                
                                                                                     

                           
                                                                                  
                                                                                   
                                                
                                                                                 

                           
                                                                              
                                                                                 
                                                                               
       
  }

  part def ModeTransitionApplicationOwner :> Thread {
    port storedRecoveryTarget : DataPort { in :>> type : RecoveryTarget; }
    port qualifiedTransition : DataPort { in :>> type : QualifiedTransition; }
    port modeForQualification : DataPort { out :>> type : ControllerMode; }
    port modeForRecovery : DataPort { out :>> type : ControllerMode; }
    port resolutionForRecovery : DataPort { out :>> type : TransitionResolution; }
    port resolutionForPublication : DataPort { out :>> type : TransitionResolution; }
    port appliedNextMode : DataPort { out :>> type : ControllerMode; }

    language "GUMBO" /*{
      state
        controllerMode: ControllerMode;

      initialize
        guarantee INITIAL_CONTROLLER_MODE:
          controllerMode == ControllerMode::Off &
          modeForQualification == ControllerMode::Off &
          modeForRecovery == ControllerMode::Off &
          resolutionForRecovery.nextMode == ControllerMode::Off &
          resolutionForRecovery.kind == TransitionKind::Stay &
          resolutionForRecovery.accepted &
          resolutionForPublication.nextMode == ControllerMode::Off &
          resolutionForPublication.kind == TransitionKind::Stay &
          resolutionForPublication.accepted &
          appliedNextMode == ControllerMode::Off;

      compute
        modifies controllerMode;
        guarantee PUBLISH_PRE_MODE:
          modeForQualification == In(controllerMode) &
          modeForRecovery == In(controllerMode);
        guarantee APPLY_STAY_OR_REJECT:
          (qualifiedTransition == QualifiedTransition::QualifiedStay implies
            resolutionForRecovery.nextMode == In(controllerMode) &
            resolutionForRecovery.kind == TransitionKind::Stay &
            resolutionForRecovery.accepted) &
          (qualifiedTransition == QualifiedTransition::QualifiedReject implies
            resolutionForRecovery.nextMode == In(controllerMode) &
            resolutionForRecovery.kind == TransitionKind::Reject &
            not resolutionForRecovery.accepted);
        guarantee APPLY_GO_DIRECTIVES:
          (qualifiedTransition == QualifiedTransition::QualifiedGoOff implies
            resolutionForRecovery.nextMode == ControllerMode::Off &
            resolutionForRecovery.kind == TransitionKind::GoOff &
            resolutionForRecovery.accepted) &
          (qualifiedTransition == QualifiedTransition::QualifiedGoStarting implies
            resolutionForRecovery.nextMode == ControllerMode::Starting &
            resolutionForRecovery.kind == TransitionKind::GoStarting &
            resolutionForRecovery.accepted) &
          (qualifiedTransition == QualifiedTransition::QualifiedGoOn implies
            resolutionForRecovery.nextMode == ControllerMode::On &
            resolutionForRecovery.kind == TransitionKind::GoOn &
            resolutionForRecovery.accepted) &
          (qualifiedTransition == QualifiedTransition::QualifiedGoMaintenance implies
            resolutionForRecovery.nextMode == ControllerMode::Maintenance &
            resolutionForRecovery.kind == TransitionKind::GoMaintenance &
            resolutionForRecovery.accepted) &
          (qualifiedTransition == QualifiedTransition::QualifiedGoDegraded implies
            resolutionForRecovery.nextMode == ControllerMode::Degraded &
            resolutionForRecovery.kind == TransitionKind::GoDegraded &
            resolutionForRecovery.accepted);
        guarantee APPLY_STORED_RESUME:
          (qualifiedTransition == QualifiedTransition::QualifiedResumeStored &
           storedRecoveryTarget == RecoveryTarget::Off implies
            resolutionForRecovery.nextMode == ControllerMode::Off) &
          (qualifiedTransition == QualifiedTransition::QualifiedResumeStored &
           storedRecoveryTarget == RecoveryTarget::Starting implies
            resolutionForRecovery.nextMode == ControllerMode::Starting) &
          (qualifiedTransition == QualifiedTransition::QualifiedResumeStored &
           storedRecoveryTarget == RecoveryTarget::On implies
            resolutionForRecovery.nextMode == ControllerMode::On) &
          (qualifiedTransition == QualifiedTransition::QualifiedResumeStored implies
            resolutionForRecovery.kind == TransitionKind::ResumeStored &
            resolutionForRecovery.accepted);
        guarantee PUBLISH_APPLIED_RESOLUTION:
          resolutionForPublication.nextMode == resolutionForRecovery.nextMode &
          resolutionForPublication.kind == resolutionForRecovery.kind &
          resolutionForPublication.accepted == resolutionForRecovery.accepted;
        guarantee COMMIT_AND_DELIVER_MODE:
          controllerMode == resolutionForRecovery.nextMode &
          appliedNextMode == resolutionForRecovery.nextMode;
    }*/

                        
           
                                        

                
                                
                 
                            
                                                                                                        
                                                  
                                                        
                                                   
                                                                  
                                                               
                                            
                                                                     
                                                                  
                                               
                                                  

             
                                
                          
                                                                                                              
                                                      
                                                

                          
                                                                                                        
                                                                             
                                                                   
                                                                
                                               
                                                                               
                                                                   
                                                                  
                                                  

                          
                                                                                                   
                                                                              
                                                                   
                                                                                                    
                                                                                   
                                                                        
                                                                                                         
                                                                             
                                                                  
                                                                                                   
                                                                                      
                                                                           
                                                                                                            
                                                                                   
                                                                        
                                                                                                        

                          
                                                                                                                           
                                                                                    
                                                                  
                                                                         
                                                                       
                                                                              
                                                                 
                                                                        
                                                                        
                                             

                        
                                                                                                          
                                                                               
                                                                       
                                                                              

                         
                                                                                                                  
                                                            
                                                            
       
  }

  part def CoordinationPublicationOwner :> Thread {
    port arbitrationResult : DataPort { in :>> type : ArbitrationResult; }
    port appliedResolution : DataPort { in :>> type : TransitionResolution; }
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_COORDINATION_OUTCOME:
          coordinationOutcome.parkingBrake == ParkingBrakeDisposition::Apply &
          coordinationOutcome.status == CoordinationStatus::IdleOff;

      compute
        guarantee PARKING_BRAKE_COHERENCE:
          (coordinationOutcome.parkingBrake == ParkingBrakeDisposition::Release) ==
            (appliedResolution.nextMode == ControllerMode::On);
        guarantee STATUS_PRECEDENCE:
          coordinationOutcome.status ==
            (if arbitrationResult.selectedIntent == SelectedIntent::SelectOff &
                arbitrationResult.priorityConflict ? CoordinationStatus::ShutdownDominant else
             if appliedResolution.kind == TransitionKind::Reject ? CoordinationStatus::RequestInapplicable else
             if appliedResolution.kind == TransitionKind::ResumeStored ? CoordinationStatus::RecoveryResumed else
             if arbitrationResult.selectedIntent == SelectedIntent::SelectInvalidDegraded ? CoordinationStatus::DegradedInvalid else
             if arbitrationResult.selectedIntent == SelectedIntent::SelectConditionDegraded |
                (not arbitrationResult.priorityConflict &
                 appliedResolution.nextMode == ControllerMode::Degraded) ? CoordinationStatus::DegradedCondition else
             if arbitrationResult.priorityConflict ? CoordinationStatus::RequestConflict else
             if appliedResolution.nextMode == ControllerMode::Off ? CoordinationStatus::IdleOff else
             if appliedResolution.nextMode == ControllerMode::Starting ? CoordinationStatus::StartingSequence else
             if appliedResolution.nextMode == ControllerMode::On ? CoordinationStatus::Operating else
             CoordinationStatus::MaintenanceHandoff);
    }*/

                        
                
                 
                          
                                                                                                                 
                                                                               
                                                                     

             
                        
                                                                                              
                                                                                   
                                                               

                        
                                                                                                                   
                                                                                 
                                                                           
                                                   
                                                                                    
                                                                                
                                                       
                                                                
                                                                                
                                                                                
                                                       
                                                              
                                                                      
                                                                                
                                                                                
                                                       
                                                              
                                                                    
                                                                                         
                                                                                  
                                                                                 
                                                        
                                                               
                                                                     
                                                                                           
                                                                                 
                                                        
                                                               
                                                                     
                                                                                        
                                                                                          
                                                      
                                                                        
                                                                                
                                                                                
                                                       
                                                              
                                                                    
                                                                                       
                                                                                         
                                                   
                                                                        
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                 
                                                                                 
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                      
                                                                          
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                
                                                                                   
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                        
       
  }

  part def RecoveryTargetOwner :> Thread {
    port currentMode : DataPort { in :>> type : ControllerMode; }
    port appliedResolution : DataPort { in :>> type : TransitionResolution; }
    port storedRecoveryTarget : DataPort { out :>> type : RecoveryTarget; }

    language "GUMBO" /*{
      state
        recoveryTarget: RecoveryTarget;

      initialize
        guarantee INITIAL_RECOVERY_TARGET:
          recoveryTarget == RecoveryTarget::Off &
          storedRecoveryTarget == RecoveryTarget::Off;

      compute
        modifies recoveryTarget;
        guarantee PUBLISH_PRE_UPDATE_TARGET:
          storedRecoveryTarget == In(recoveryTarget);
        guarantee UPDATE_RECOVERY_TARGET:
          (currentMode == ControllerMode::Starting &
           appliedResolution.nextMode == ControllerMode::Degraded implies
            recoveryTarget == RecoveryTarget::Starting) &
          (currentMode == ControllerMode::On &
           appliedResolution.nextMode == ControllerMode::Degraded implies
            recoveryTarget == RecoveryTarget::On) &
          ((currentMode == ControllerMode::Off |
            currentMode == ControllerMode::Maintenance) &
           appliedResolution.nextMode == ControllerMode::Degraded implies
            recoveryTarget == RecoveryTarget::Off) &
          (currentMode == ControllerMode::Degraded &
           appliedResolution.nextMode == ControllerMode::Degraded implies
            recoveryTarget == In(recoveryTarget)) &
          (currentMode == ControllerMode::Degraded &
           appliedResolution.nextMode != ControllerMode::Degraded implies
            recoveryTarget == RecoveryTarget::Off) &
          (currentMode != ControllerMode::Degraded &
           appliedResolution.nextMode != ControllerMode::Degraded implies
            recoveryTarget == In(recoveryTarget));
    }*/

                        
           
                                        

                
                                
                 
                            
                                                                                                  
                                                  
                                                       

             
                                
                        
                                                                                                                  
                                                     

                          
                                                                                                                                 
                                                    
                                                                          
                                                            
                                              
                                                                          
                                                      
                                                
                                                         
                                                                          
                                                       
                                                    
                                                                          
                                                       
                                                    
                                                                          
                                                       
                                                    
                                                                          
                                                      
       
  }

  part def VehicleModeCoordinationProcess :> Process {
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    port controllerMode : DataPort { out :>> type : ControllerMode; }
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    part lifecycleEventOwner : LifecycleEventOwner;
    part serviceEventOwner : ServiceEventOwner;
    part conditionAssessmentOwner : ConditionAssessmentOwner;
    part intentArbitrationOwner : IntentArbitrationOwner;
    part coordinationPublicationOwner : CoordinationPublicationOwner;
    part recoveryTargetOwner : RecoveryTargetOwner;
    part transitionQualificationOwner : TransitionQualificationOwner;
    part modeTransitionApplicationOwner : ModeTransitionApplicationOwner;

    connection int01 : PortConnection connect lifecycleLevels to lifecycleEventOwner.lifecycleLevels;
    connection int02 : PortConnection connect serviceLevels to serviceEventOwner.serviceLevels;
    connection int03 : PortConnection connect conditionEvidence to conditionAssessmentOwner.conditionEvidence;
    connection int04 : PortConnection connect lifecycleEventOwner.lifecycleFacts to intentArbitrationOwner.lifecycleFacts;
    connection int05 : PortConnection connect serviceEventOwner.serviceFacts to intentArbitrationOwner.serviceFacts;
    connection int06 : PortConnection connect conditionAssessmentOwner.conditionAssessment to intentArbitrationOwner.conditionAssessment;
    connection int07 : PortConnection connect intentArbitrationOwner.arbitrationForQualification to transitionQualificationOwner.arbitrationResult;
    connection int08 : PortConnection connect modeTransitionApplicationOwner.modeForQualification to transitionQualificationOwner.currentMode;
    connection int09 : PortConnection connect recoveryTargetOwner.storedRecoveryTarget to modeTransitionApplicationOwner.storedRecoveryTarget;
    connection int10 : PortConnection connect transitionQualificationOwner.qualifiedTransition to modeTransitionApplicationOwner.qualifiedTransition;
    connection int11 : PortConnection connect modeTransitionApplicationOwner.modeForRecovery to recoveryTargetOwner.currentMode;
    connection int12 : PortConnection connect modeTransitionApplicationOwner.resolutionForRecovery to recoveryTargetOwner.appliedResolution;
    connection int13 : PortConnection connect modeTransitionApplicationOwner.resolutionForPublication to coordinationPublicationOwner.appliedResolution;
    connection int14 : PortConnection connect intentArbitrationOwner.arbitrationForPublication to coordinationPublicationOwner.arbitrationResult;
    connection int15 : PortConnection connect modeTransitionApplicationOwner.appliedNextMode to controllerMode;
    connection int16 : PortConnection connect coordinationPublicationOwner.coordinationOutcome to coordinationOutcome;
  }

  part def VehicleControllerOperatingModeCoordinator :> System {
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    port controllerMode : DataPort { out :>> type : ControllerMode; }
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    part vehicleModeCoordinationProcess : VehicleModeCoordinationProcess;

    connection supportInt01 : PortConnection connect lifecycleLevels to vehicleModeCoordinationProcess.lifecycleLevels;
    connection supportInt02 : PortConnection connect serviceLevels to vehicleModeCoordinationProcess.serviceLevels;
    connection supportInt03 : PortConnection connect conditionEvidence to vehicleModeCoordinationProcess.conditionEvidence;
    connection supportInt15 : PortConnection connect vehicleModeCoordinationProcess.controllerMode to controllerMode;
    connection supportInt16 : PortConnection connect vehicleModeCoordinationProcess.coordinationOutcome to coordinationOutcome;
  }

  part vehicleControllerOperatingModeCoordinator : VehicleControllerOperatingModeCoordinator;
}
