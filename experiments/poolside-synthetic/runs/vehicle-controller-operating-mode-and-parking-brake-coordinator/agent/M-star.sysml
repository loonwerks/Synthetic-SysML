// Canonical SysML/GUMBO realization of approved baseline SA-VEH-HARD-R2-01.
package Vehicle_Controller_Operating_Mode_Coordinator {
  private import HAMR::*;

  enum def IndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  // same-enum record-feature collision; they add no policy or semantic credit.
  enum def StartIndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  enum def OnIndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  enum def OffIndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  enum def ConflictClass { enum InputInvalid; enum MultipleActionable; enum SingleOrNone; }
  enum def SelectedIndication {
    enum InvalidSelected; enum DegradedSelected; enum OffSelected;
    enum MaintenanceSelected; enum ReturnSelected; enum OnSelected;
    enum StartSelected; enum NoneSelected;
  }
  enum def OperatingDemand { enum Dormant; enum Staged; enum RunRequested; }
  enum def PriorOperatingDemand { enum Dormant; enum Staged; enum RunRequested; }
  enum def MaintenanceSession { enum Inactive; enum Active; }
  enum def PriorMaintenanceSession { enum Inactive; enum Active; }
  enum def DegradedEpisode { enum ClearEpisode; enum Latched; enum ReturnArmed; }
  enum def PriorDegradedEpisode { enum ClearEpisode; enum Latched; enum ReturnArmed; }
  enum def RecoveryDecision { enum NotApplicable; enum Arm; enum Confirm; enum Cancel; enum Wait; }
  enum def ControllerMode { enum Off; enum Standby; enum Operating; enum Maintenance; enum Degraded; }
  // cross-port enum-feature collision; it adds no decision or semantic credit.
  enum def PublishedControllerMode { enum Off; enum Standby; enum Operating; enum Maintenance; enum Degraded; }
  enum def BrakeDemand { enum RequireApply; enum AllowRelease; }
  enum def ParkingBrakeCommand { enum Apply; enum Release; }
  enum def TransitionReason {
    enum FaultDominant; enum MaintenanceDominant; enum StartStaged;
    enum RecoveryConfirmed; enum RunRequested; enum DormantDemand;
  }

  // All record fields inspected below are attributes, never nested parts.
  part def LifecycleIndications :> Data {
    attribute startLevel : StartIndicationLevel;
    attribute onLevel : OnIndicationLevel;
    attribute offLevel : OffIndicationLevel;
  }
  part def MaintenanceIndication :> Data { attribute level : IndicationLevel; }
  part def DegradedIndication :> Data { attribute level : IndicationLevel; }
  part def ReturnIndication :> Data { attribute level : IndicationLevel; }
  part def LifecycleEpochFacts :> Data {
    attribute freshStart : Base_Types::Boolean;
    attribute freshOn : Base_Types::Boolean;
    attribute offActive : Base_Types::Boolean;
    attribute heldStart : Base_Types::Boolean;
    attribute heldOn : Base_Types::Boolean;
    attribute heldOff : Base_Types::Boolean;
    attribute anyInvalid : Base_Types::Boolean;
  }
  part def MaintenanceEpochFacts :> Data {
    attribute active : Base_Types::Boolean;
    attribute fresh : Base_Types::Boolean;
    attribute cleared : Base_Types::Boolean;
    attribute held : Base_Types::Boolean;
    attribute invalid : Base_Types::Boolean;
  }
  part def DegradationEpochFacts :> Data {
    attribute active : Base_Types::Boolean;
    attribute fresh : Base_Types::Boolean;
    attribute cleared : Base_Types::Boolean;
    attribute held : Base_Types::Boolean;
    attribute invalid : Base_Types::Boolean;
  }
  part def ReturnEpochFacts :> Data {
    attribute fresh : Base_Types::Boolean;
    attribute held : Base_Types::Boolean;
    attribute clear : Base_Types::Boolean;
    attribute invalid : Base_Types::Boolean;
  }
  part def DemandSnapshot :> Data {
    attribute currentDemand : PriorOperatingDemand;
    attribute nextDemand : OperatingDemand;
  }
  part def MaintenanceSnapshot :> Data {
    attribute currentSession : PriorMaintenanceSession;
    attribute nextSession : MaintenanceSession;
  }
  part def EpisodeSnapshot :> Data {
    attribute currentEpisode : PriorDegradedEpisode;
    attribute nextEpisode : DegradedEpisode;
  }
  part def ModeDecision :> Data {
    attribute nextMode : ControllerMode;
    attribute reason : TransitionReason;
  }
  part def CoordinationFrame :> Data {
    attribute mode : PublishedControllerMode;
    attribute parkingBrake : ParkingBrakeCommand;
  }

  part def LifecycleEpochOwner :> Thread {
    port lifecycleIndications : DataPort { in :>> type : LifecycleIndications; }
    port factsToConflict : DataPort { out :>> type : LifecycleEpochFacts; }
    port factsToPriority : DataPort { out :>> type : LifecycleEpochFacts; }
                        
           
                          
                                            
                          
                                      
                          
                                        
                
                                                        
                          
                                                    
                                                         
                                                   
                                                     
                                                                          
                                                                           
                                                                      
                                                                               
             
                                                        
                         
                                             
                                        
                                                              
                                                                                 
                                     
                                                        
                                                                           
                                       
                                                                             
                                       
                                                                 
                                                                                 
                                    
                                                           
                                                                           
                                     
                                                             
                                                                             
                                        
                                                                              
                                                                        
                                                                            
                                              
                                                            
                                                      
                                                       
       
  }

  part def MaintenanceEpochOwner :> Thread {
    port maintenanceIndication : DataPort { in :>> type : MaintenanceIndication; }
    port factsToConflict : DataPort { out :>> type : MaintenanceEpochFacts; }
    port factsToPriority : DataPort { out :>> type : MaintenanceEpochFacts; }
    port factsToSession : DataPort { out :>> type : MaintenanceEpochFacts; }
                        
           
                          
                                             
                
                                     
                          
                                                      
                                                          
                                                                    
                                                                    
                                        
                                                                                 
             
                                     
                         
                                               
                                    
                                                                        
                                   
                                                               
                                                                        
                                     
                                                                  
                                                                     
                                  
                                                                  
                                                                        
                                     
                                                                       
                                                                                  
                                                             
       
  }

  part def DegradationEpochOwner :> Thread {
    port degradedIndication : DataPort { in :>> type : DegradedIndication; }
    port factsToConflict : DataPort { out :>> type : DegradationEpochFacts; }
    port factsToPriority : DataPort { out :>> type : DegradationEpochFacts; }
    port factsToEpisode : DataPort { out :>> type : DegradationEpochFacts; }
    port factsToRecovery : DataPort { out :>> type : DegradationEpochFacts; }
                        
           
                          
                                          
                
                                  
                          
                                                      
                                                       
                                                                    
                                                                    
                                                                             
                                                                                 
             
                                  
                         
                                               
                                    
                                                                     
                                   
                                                            
                                                                     
                                     
                                                               
                                                                  
                                  
                                                               
                                                                     
                                     
                                                                    
                                                                                  
                                              
                                                       
       
  }

  part def ReturnEpochOwner :> Thread {
    port returnIndication : DataPort { in :>> type : ReturnIndication; }
    port factsToConflict : DataPort { out :>> type : ReturnEpochFacts; }
    port factsToPriority : DataPort { out :>> type : ReturnEpochFacts; }
    port factsToRecovery : DataPort { out :>> type : ReturnEpochFacts; }
                        
           
                          
                                        
                
                                
                          
                                                 
                                                     
                                                                  
                                                                     
                                                                                  
             
                                
                         
                                          
                                   
                                                          
                                                                   
                                  
                                                             
                                                                   
                                   
                                                                
                                     
                                                                  
                                                                                   
                                                   
       
  }

  part def ConflictClassificationOwner :> Thread {
    port lifecycleFacts : DataPort { in :>> type : LifecycleEpochFacts; }
    port maintenanceFacts : DataPort { in :>> type : MaintenanceEpochFacts; }
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    port returnFacts : DataPort { in :>> type : ReturnEpochFacts; }
    port conflictToPriority : DataPort { out :>> type : ConflictClass; }
    port conflictToRecovery : DataPort { out :>> type : ConflictClass; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_CONFLICT_FAIL_CLOSED:
          (conflictToPriority == ConflictClass.InputInvalid) & (conflictToRecovery == conflictToPriority);

      compute
        guarantee CONFLICT_CARDINALITY_CLASSIFICATION:
          (conflictToRecovery == conflictToPriority) &
          (
            (lifecycleFacts.anyInvalid | maintenanceFacts.invalid | degradationFacts.invalid | returnFacts.invalid) &
            (conflictToPriority == ConflictClass.InputInvalid)
          ) |
          (
            (lifecycleFacts.anyInvalid | maintenanceFacts.invalid | degradationFacts.invalid | returnFacts.invalid) == F &
            (
              (degradationFacts.active & lifecycleFacts.offActive) |
              (degradationFacts.active & maintenanceFacts.active) |
              (degradationFacts.active & returnFacts.fresh) |
              (degradationFacts.active & lifecycleFacts.freshOn) |
              (degradationFacts.active & lifecycleFacts.freshStart) |
              (lifecycleFacts.offActive & maintenanceFacts.active) |
              (lifecycleFacts.offActive & returnFacts.fresh) |
              (lifecycleFacts.offActive & lifecycleFacts.freshOn) |
              (lifecycleFacts.offActive & lifecycleFacts.freshStart) |
              (maintenanceFacts.active & returnFacts.fresh) |
              (maintenanceFacts.active & lifecycleFacts.freshOn) |
              (maintenanceFacts.active & lifecycleFacts.freshStart) |
              (returnFacts.fresh & lifecycleFacts.freshOn) |
              (returnFacts.fresh & lifecycleFacts.freshStart) |
              (lifecycleFacts.freshOn & lifecycleFacts.freshStart)
            ) &
            (conflictToPriority == ConflictClass.MultipleActionable)
          ) |
          (
            (lifecycleFacts.anyInvalid | maintenanceFacts.invalid | degradationFacts.invalid | returnFacts.invalid) == F &
            (
              (degradationFacts.active & lifecycleFacts.offActive) |
              (degradationFacts.active & maintenanceFacts.active) |
              (degradationFacts.active & returnFacts.fresh) |
              (degradationFacts.active & lifecycleFacts.freshOn) |
              (degradationFacts.active & lifecycleFacts.freshStart) |
              (lifecycleFacts.offActive & maintenanceFacts.active) |
              (lifecycleFacts.offActive & returnFacts.fresh) |
              (lifecycleFacts.offActive & lifecycleFacts.freshOn) |
              (lifecycleFacts.offActive & lifecycleFacts.freshStart) |
              (maintenanceFacts.active & returnFacts.fresh) |
              (maintenanceFacts.active & lifecycleFacts.freshOn) |
              (maintenanceFacts.active & lifecycleFacts.freshStart) |
              (returnFacts.fresh & lifecycleFacts.freshOn) |
              (returnFacts.fresh & lifecycleFacts.freshStart) |
              (lifecycleFacts.freshOn & lifecycleFacts.freshStart)
            ) == F &
            (conflictToPriority == ConflictClass.SingleOrNone)
          );
    }*/
                        
                
                          
                                               
                                                            
                                                   
             
                        
                                                      
                                                                   
                                                              
                                                               
                                                                   
                                                                   
                                                                   
                                                                  
                                                            
                                                                 
                                                                    
                                                                   
                                                             
                                                                  
                                                                     
                                                            
                                                                 
                                                                    
                                                           
                                                              
                                                                    
                                                                     
                                                                   
                                                                   
                                                                   
                                                                  
                                                            
                                                                 
                                                                    
                                                                   
                                                             
                                                                  
                                                                     
                                                            
                                                                 
                                                                    
                                                           
                                                              
                                                                         
                                                                
                                                   
       
  }

  part def IndicationPriorityOwner :> Thread {
    port conflictClass : DataPort { in :>> type : ConflictClass; }
    port lifecycleFacts : DataPort { in :>> type : LifecycleEpochFacts; }
    port maintenanceFacts : DataPort { in :>> type : MaintenanceEpochFacts; }
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    port returnFacts : DataPort { in :>> type : ReturnEpochFacts; }
    port selectionToDemand : DataPort { out :>> type : SelectedIndication; }
    port selectionToSession : DataPort { out :>> type : SelectedIndication; }
    port selectionToRecovery : DataPort { out :>> type : SelectedIndication; }
    port selectionToEpisode : DataPort { out :>> type : SelectedIndication; }
    port selectionToBrake : DataPort { out :>> type : SelectedIndication; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_SELECTION_FAIL_CLOSED:
          (selectionToDemand == SelectedIndication.InvalidSelected) &
          (selectionToSession == selectionToDemand) &
          (selectionToRecovery == selectionToDemand) &
          (selectionToEpisode == selectionToDemand) &
          (selectionToBrake == selectionToDemand);

      compute
        guarantee SELECTION_FANOUT_COHERENCE:
          (selectionToSession == selectionToDemand) &
          (selectionToRecovery == selectionToDemand) &
          (selectionToEpisode == selectionToDemand) &
          (selectionToBrake == selectionToDemand);

        compute_cases
          case CASE_01_INPUT_INVALID "conflictClass is InputInvalid":
            assume conflictClass == ConflictClass.InputInvalid;
            guarantee selectionToDemand == SelectedIndication.InvalidSelected;
          case CASE_02_DEGRADED "conflictClass not InputInvalid and degradationFacts active is true":
            assume (conflictClass != ConflictClass.InputInvalid) & degradationFacts.active;
            guarantee selectionToDemand == SelectedIndication.DegradedSelected;
          case CASE_03_OFF "conflictClass not InputInvalid, degradationFacts active is false, lifecycleFacts offActive is true":
            assume (conflictClass != ConflictClass.InputInvalid) & (degradationFacts.active == F) & lifecycleFacts.offActive;
            guarantee selectionToDemand == SelectedIndication.OffSelected;
          case CASE_04_MAINTENANCE "priority chain advancing to maintenance":
            assume (conflictClass != ConflictClass.InputInvalid) &
              (degradationFacts.active == F) &
              (lifecycleFacts.offActive == F) &
              maintenanceFacts.active;
            guarantee selectionToDemand == SelectedIndication.MaintenanceSelected;
          case CASE_05_RETURN "priority chain advancing to return":
            assume (conflictClass != ConflictClass.InputInvalid) &
              (degradationFacts.active == F) &
              (lifecycleFacts.offActive == F) &
              (maintenanceFacts.active == F) &
              returnFacts.fresh;
            guarantee selectionToDemand == SelectedIndication.ReturnSelected;
          case CASE_06_ON "priority chain advancing to on":
            assume (conflictClass != ConflictClass.InputInvalid) &
              (degradationFacts.active == F) &
              (lifecycleFacts.offActive == F) &
              (maintenanceFacts.active == F) &
              (returnFacts.fresh == F) &
              lifecycleFacts.freshOn;
            guarantee selectionToDemand == SelectedIndication.OnSelected;
          case CASE_07_START "priority chain advancing to start":
            assume (conflictClass != ConflictClass.InputInvalid) &
              (degradationFacts.active == F) &
              (lifecycleFacts.offActive == F) &
              (maintenanceFacts.active == F) &
              (returnFacts.fresh == F) &
              (lifecycleFacts.freshOn == F) &
              lifecycleFacts.freshStart;
            guarantee selectionToDemand == SelectedIndication.StartSelected;
          case CASE_08_NONE "priority chain default":
            assume (conflictClass != ConflictClass.InputInvalid) &
              (degradationFacts.active == F) &
              (lifecycleFacts.offActive == F) &
              (maintenanceFacts.active == F) &
              (returnFacts.fresh == F) &
              (lifecycleFacts.freshOn == F) &
              (lifecycleFacts.freshStart == F);
            guarantee selectionToDemand == SelectedIndication.NoneSelected;
    }*/
                        
                
                          
                                                
                                                                   
                                                   
                                                    
                                                   
                                                
             
                        
                                             
                                                   
                                                    
                                                   
                                                
                     
                           
                                     
                                                               
                                                                              
                           
                                
                                                                                         
                                                                               
                           
                           
                                                                                               
                                       
                                                                          
                           
                                   
                                                                                               
                                                                      
                                                                                  
                           
                              
                                                                                               
                                                                                               
                                                                             
                           
                          
                                                                                               
                                                                                                     
                                     
                                                                         
                           
                             
                                                                                               
                                                                                                     
                                                                      
                                                                            
                           
                            
                                                                                               
                                                                                                     
                                                                           
                                                                           
       
  }

  part def OperatingDemandOwner :> Thread {
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port demandSnapshot : DataPort { out :>> type : DemandSnapshot; }
                        
           
                          
                                      
                
                              
                          
                                         
                                                   
                                                                        
                                                               
             
                              
                         
                                            
                                                           
                                                                           
                                                          
                                                                          
                                                                
                                                                                 
                                                    
                     
                           
                                    
                                                                             
                                                                         
                                                                   
                                                              
                           
                                    
                                                                             
                                                                         
                                                                    
                                                             
                                                                        
                                                              
                                                             
                           
                                  
                                                                        
                                                            
                                                         
                                                                   
                           
                                     
                                                                             
                                                                         
                                                                    
                                                            
                                                                       
                                                             
                                                                    
                                                           
                                                       
       
  }

  part def MaintenanceSessionOwner :> Thread {
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    port maintenanceFacts : DataPort { in :>> type : MaintenanceEpochFacts; }
    port maintenanceSnapshot : DataPort { out :>> type : MaintenanceSnapshot; }
    port snapshotToBrake : DataPort { out :>> type : MaintenanceSnapshot; }
                        
           
                          
                                          
                
                               
                          
                                           
                                                        
                                                                                  
                                                                          
                                                 
             
                               
                         
                                                 
                                                                
                                                                                     
                                                              
                                                                                    
                                                            
                                                 
                     
                           
                                         
                                                                                
                                                                 
                           
                                        
                                                                                 
                                                                          
                                                                           
                                                                       
                                                                
                                                                              
                                                                      
                                                                   
                           
                                          
                                                                                 
                                                                        
                                                                         
                                                                    
                                                               
                                        
                                         
                                                                    
                                                         
       
  }

  part def DegradedEpisodeOwner :> Thread {
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    port snapshotToRecovery : DataPort { out :>> type : EpisodeSnapshot; }
    port snapshotToMode : DataPort { out :>> type : EpisodeSnapshot; }
    port snapshotToBrake : DataPort { out :>> type : EpisodeSnapshot; }
                        
           
                          
                                       
                
                               
                          
                                        
                                                         
                                                                                  
                                                                          
                                                                                       
             
                               
                          
                                                  
                                                                 
                                                                                     
                                                            
                                                                                
                                                                
                                                                                     
                                                           
                                                                                       
                     
                           
                                     
                                                                       
                                                                        
                                                                        
                                                               
                           
                                   
                                                                                 
                                                                        
                                                                         
                                                            
                                                       
                                                                   
                           
                                     
                                                                                 
                                                                        
                                                                         
                                                                
                                                           
                                                                    
                           
                                      
                                                                                 
                                                                        
                                                                         
                                                                
                                                          
                                                               
                           
                                      
                                                                                 
                                                                        
                                                                         
                                                             
                                                          
                                                                 
                                                              
                                                                 
                                                            
                                                         
       
  }

  part def RecoveryEligibilityOwner :> Thread {
    port conflictClass : DataPort { in :>> type : ConflictClass; }
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    port returnFacts : DataPort { in :>> type : ReturnEpochFacts; }
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    port decisionToEpisode : DataPort { out :>> type : RecoveryDecision; }
    port decisionToDemand : DataPort { out :>> type : RecoveryDecision; }
    port decisionToMode : DataPort { out :>> type : RecoveryDecision; }
                        
                
                          
                                                  
                                                               
                                                                                      
             
                        
                                           
                                                                                      
                     
                           
                                               
                                                                                       
                                                                          
                           
                                    
                                                                                   
                                                                            
                                                            
                                                                       
                                                          
                                                                
                           
                                        
                                                                                       
                                                                            
                                                            
                                                                     
                                                          
                                                                    
                           
                                       
                                                                                       
                                                                                         
                                                                  
                                                                         
                                                                          
                                                                     
                                                                             
                                                                    
                                                                       
                                                                   
                           
                                     
                                                                                        
                                                                               
                                                                                         
                                       
                                                                        
                                                             
                                                                                   
                                                                                         
                                       
                                                                      
                                                             
                                                                                   
                                                                                          
                                                                   
                                                                          
                                                                           
                                                                      
                                                                              
                                                                     
                                                                              
                                                                 
       
  }

  part def ControllerModeTransitionOwner :> Thread {
    port demandSnapshot : DataPort { in :>> type : DemandSnapshot; }
    port maintenanceSnapshot : DataPort { in :>> type : MaintenanceSnapshot; }
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port modeDecision : DataPort { out :>> type : ModeDecision; }

    language "GUMBO" /*{
      state
        modeMemory: ControllerMode;

      initialize
        modifies modeMemory;
        guarantee INITIAL_MODE_OFF:
          (modeMemory == ControllerMode.Off) &
          (modeDecision.nextMode == ControllerMode.Off) &
          (modeDecision.reason == TransitionReason.DormantDemand);

      compute
        modifies modeMemory;
        guarantee MODE_OUTPUT_COHERENCE:
          modeDecision.nextMode == modeMemory;
        compute_cases
          case CASE_26_MODE_DEGRADED "episodeSnapshot nextEpisode is not ClearEpisode":
            assume episodeSnapshot.nextEpisode != DegradedEpisode.ClearEpisode;
            guarantee (modeMemory == ControllerMode.Degraded) & (modeDecision.reason == TransitionReason.FaultDominant);
          case CASE_27_MODE_MAINTENANCE "nextEpisode is ClearEpisode and nextSession is Active":
            assume (episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode) & (maintenanceSnapshot.nextSession == MaintenanceSession.Active);
            guarantee (modeMemory == ControllerMode.Maintenance) & (modeDecision.reason == TransitionReason.MaintenanceDominant);
          case CASE_28_MODE_STANDBY "nextEpisode is ClearEpisode, nextSession is Inactive, nextDemand is Staged":
            assume (episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode) & (maintenanceSnapshot.nextSession == MaintenanceSession.Inactive) & (demandSnapshot.nextDemand == OperatingDemand.Staged);
            guarantee (modeMemory == ControllerMode.Standby) &
              ((recoveryDecision == RecoveryDecision.Confirm & modeDecision.reason == TransitionReason.RecoveryConfirmed) |
               (recoveryDecision != RecoveryDecision.Confirm & modeDecision.reason == TransitionReason.StartStaged));
          case CASE_29_MODE_OPERATING "nextEpisode is ClearEpisode, nextSession is Inactive, nextDemand is RunRequested":
            assume (episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode) & (maintenanceSnapshot.nextSession == MaintenanceSession.Inactive) & (demandSnapshot.nextDemand == OperatingDemand.RunRequested);
            guarantee (modeMemory == ControllerMode.Operating) & (modeDecision.reason == TransitionReason.RunRequested);
          case CASE_30_MODE_OFF "nextEpisode is ClearEpisode, nextSession is Inactive, nextDemand is Dormant":
            assume (episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode) & (maintenanceSnapshot.nextSession == MaintenanceSession.Inactive) & (demandSnapshot.nextDemand == OperatingDemand.Dormant);
            guarantee (modeMemory == ControllerMode.Off) & (modeDecision.reason == TransitionReason.DormantDemand);
    }*/
                        
           
                          
                                   
                
                            
                          
                                   
                                                                                          
                                                                
             
                            
                         
                                        
                                              
                     
                           
                                     
                                                                               
                                                             
                                                                    
                           
                                        
                                                                                
                                                                           
                                                                
                                                                          
                           
                                    
                                                                                
                                                                              
                                                                  
                                                            
                                                              
                                                                            
                                                              
                                                                      
                           
                                      
                                                                                
                                                                              
                                                                        
                                                              
                                                                   
                           
                                
                                                                                
                                                                              
                                                                   
                                                        
                                                                    
       
  }

  part def ParkingBrakeDemandOwner :> Thread {
    port maintenanceSnapshot : DataPort { in :>> type : MaintenanceSnapshot; }
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    port brakeDemand : DataPort { out :>> type : BrakeDemand; }
                        
                
                        
                                            
                                                  
             
                        
                                           
                                                                           
                                                                          
                                                                       
                                                                        
                                                                   
                                                                            
                                                      
                                                                           
                                                                          
                                                                       
                                                                        
                                                                   
                                                                            
                                                      
       
  }

  part def OutcomeCoherenceOwner :> Thread {
    port modeDecision : DataPort { in :>> type : ModeDecision; }
    port brakeDemand : DataPort { in :>> type : BrakeDemand; }
    port coordinationFrame : DataPort { out :>> type : CoordinationFrame; }
                        
                
                        
                                     
                                                                 
                                                                      
             
                        
                                                     
                                                          
                                                                     
                                                              
                                                                         
                                                                
                                                                           
                                                                  
                                                                             
                                                               
                                                                            
                                                                
                                                       
                                                                            
                                                                
                                                       
                                                                          
                          
                                                
                                                                            
                                                                          
                                                      
       
  }

  part def ModeCoordinationProcess :> Process {
    port lifecycleIndications : DataPort { in :>> type : LifecycleIndications; }
    port maintenanceIndication : DataPort { in :>> type : MaintenanceIndication; }
    port degradedIndication : DataPort { in :>> type : DegradedIndication; }
    port returnIndication : DataPort { in :>> type : ReturnIndication; }
    port coordinationFrame : DataPort { out :>> type : CoordinationFrame; }

    part lifecycleEpochOwner : LifecycleEpochOwner;
    part maintenanceEpochOwner : MaintenanceEpochOwner;
    part degradationEpochOwner : DegradationEpochOwner;
    part returnEpochOwner : ReturnEpochOwner;
    part conflictClassificationOwner : ConflictClassificationOwner;
    part indicationPriorityOwner : IndicationPriorityOwner;
    part operatingDemandOwner : OperatingDemandOwner;
    part maintenanceSessionOwner : MaintenanceSessionOwner;
    part degradedEpisodeOwner : DegradedEpisodeOwner;
    part recoveryEligibilityOwner : RecoveryEligibilityOwner;
    part controllerModeTransitionOwner : ControllerModeTransitionOwner;
    part parkingBrakeDemandOwner : ParkingBrakeDemandOwner;
    part outcomeCoherenceOwner : OutcomeCoherenceOwner;

    connection int01 : PortConnection connect lifecycleIndications to lifecycleEpochOwner.lifecycleIndications;
    connection int02 : PortConnection connect maintenanceIndication to maintenanceEpochOwner.maintenanceIndication;
    connection int03 : PortConnection connect degradedIndication to degradationEpochOwner.degradedIndication;
    connection int04 : PortConnection connect returnIndication to returnEpochOwner.returnIndication;
    connection int05 : PortConnection connect lifecycleEpochOwner.factsToConflict to conflictClassificationOwner.lifecycleFacts;
    connection int06 : PortConnection connect maintenanceEpochOwner.factsToConflict to conflictClassificationOwner.maintenanceFacts;
    connection int07 : PortConnection connect degradationEpochOwner.factsToConflict to conflictClassificationOwner.degradationFacts;
    connection int08 : PortConnection connect returnEpochOwner.factsToConflict to conflictClassificationOwner.returnFacts;
    connection int09 : PortConnection connect conflictClassificationOwner.conflictToPriority to indicationPriorityOwner.conflictClass;
    connection int10 : PortConnection connect lifecycleEpochOwner.factsToPriority to indicationPriorityOwner.lifecycleFacts;
    connection int11 : PortConnection connect maintenanceEpochOwner.factsToPriority to indicationPriorityOwner.maintenanceFacts;
    connection int12 : PortConnection connect degradationEpochOwner.factsToPriority to indicationPriorityOwner.degradationFacts;
    connection int13 : PortConnection connect returnEpochOwner.factsToPriority to indicationPriorityOwner.returnFacts;
    connection int14 : PortConnection connect indicationPriorityOwner.selectionToDemand to operatingDemandOwner.selectedIndication;
    connection int15 : PortConnection connect indicationPriorityOwner.selectionToSession to maintenanceSessionOwner.selectedIndication;
    connection int16 : PortConnection connect maintenanceEpochOwner.factsToSession to maintenanceSessionOwner.maintenanceFacts;
    connection int17 : PortConnection connect degradationEpochOwner.factsToEpisode to degradedEpisodeOwner.degradationFacts;
    connection int18 : PortConnection connect conflictClassificationOwner.conflictToRecovery to recoveryEligibilityOwner.conflictClass;
    connection int19 : PortConnection connect indicationPriorityOwner.selectionToRecovery to recoveryEligibilityOwner.selectedIndication;
    connection int20 : PortConnection connect degradationEpochOwner.factsToRecovery to recoveryEligibilityOwner.degradationFacts;
    connection int21 : PortConnection connect returnEpochOwner.factsToRecovery to recoveryEligibilityOwner.returnFacts;
    connection int22 : PortConnection connect degradedEpisodeOwner.snapshotToRecovery to recoveryEligibilityOwner.episodeSnapshot;
    connection int23 : PortConnection connect recoveryEligibilityOwner.decisionToEpisode to degradedEpisodeOwner.recoveryDecision;
    connection int24 : PortConnection connect recoveryEligibilityOwner.decisionToDemand to operatingDemandOwner.recoveryDecision;
    connection int25 : PortConnection connect operatingDemandOwner.demandSnapshot to controllerModeTransitionOwner.demandSnapshot;
    connection int26 : PortConnection connect maintenanceSessionOwner.maintenanceSnapshot to controllerModeTransitionOwner.maintenanceSnapshot;
    connection int27 : PortConnection connect degradedEpisodeOwner.snapshotToMode to controllerModeTransitionOwner.episodeSnapshot;
    connection int28 : PortConnection connect indicationPriorityOwner.selectionToEpisode to degradedEpisodeOwner.selectedIndication;
    connection int29 : PortConnection connect recoveryEligibilityOwner.decisionToMode to controllerModeTransitionOwner.recoveryDecision;
    connection int30 : PortConnection connect maintenanceSessionOwner.snapshotToBrake to parkingBrakeDemandOwner.maintenanceSnapshot;
    connection int31 : PortConnection connect degradedEpisodeOwner.snapshotToBrake to parkingBrakeDemandOwner.episodeSnapshot;
    connection int32 : PortConnection connect indicationPriorityOwner.selectionToBrake to parkingBrakeDemandOwner.selectedIndication;
    connection int33 : PortConnection connect controllerModeTransitionOwner.modeDecision to outcomeCoherenceOwner.modeDecision;
    connection int34 : PortConnection connect parkingBrakeDemandOwner.brakeDemand to outcomeCoherenceOwner.brakeDemand;
    connection int35 : PortConnection connect outcomeCoherenceOwner.coordinationFrame to coordinationFrame;
  }

  part def VehicleControllerOperatingModeCoordinatorSystem :> System {
    port lifecycleIndications : DataPort { in :>> type : LifecycleIndications; }
    port maintenanceIndication : DataPort { in :>> type : MaintenanceIndication; }
    port degradedIndication : DataPort { in :>> type : DegradedIndication; }
    port returnIndication : DataPort { in :>> type : ReturnIndication; }
    port coordinationFrame : DataPort { out :>> type : CoordinationFrame; }
    part modeCoordinationProcess : ModeCoordinationProcess;
    connection support01 : PortConnection connect lifecycleIndications to modeCoordinationProcess.lifecycleIndications;
    connection support02 : PortConnection connect maintenanceIndication to modeCoordinationProcess.maintenanceIndication;
    connection support03 : PortConnection connect degradedIndication to modeCoordinationProcess.degradedIndication;
    connection support04 : PortConnection connect returnIndication to modeCoordinationProcess.returnIndication;
    connection support05 : PortConnection connect modeCoordinationProcess.coordinationFrame to coordinationFrame;
  }

  part vehicleControllerOperatingModeCoordinator : VehicleControllerOperatingModeCoordinatorSystem;
}
