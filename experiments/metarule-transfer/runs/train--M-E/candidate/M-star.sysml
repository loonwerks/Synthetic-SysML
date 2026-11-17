package Windshield_Defrost_Request_Supervisor {

  private import HAMR::*;

  enum def DefrostSelection {
    enum Released;
    enum Active;
  }

  enum def RequestValidity {
    enum Valid;
    enum Invalid;
  }

  enum def GlazingCondition {
    enum Clear;
    enum Obscured;
  }

  enum def GlazingValidity {
    enum Valid;
    enum Invalid;
  }

  enum def ElectricalInterfaceStatus {
    enum Available;
    enum Unavailable;
  }

  enum def DefrostLoadAllowance {
    enum Permitted;
    enum Restricted;
  }

  enum def DefrostEnableCommand {
    enum Off;
    enum On;
  }

  enum def DriverDefrostStatus {
    enum Idle;
    enum Defrosting;
    enum Complete;
    enum AttentionRequired;
  }

  enum def RequestIntent {
    enum Fresh;
    enum Held;
    enum None;
    enum BlockedInvalid;
    enum BlockedRearm;
  }

  enum def VisibilityAssessment {
    enum Clear;
    enum NeedsDefrost;
    enum Unknown;
  }

  enum def DefrostEligibility {
    enum Eligible;
    enum BlockedUnavailable;
    enum BlockedRestricted;
  }

  enum def PolicyDisposition {
    enum Inactive;
    enum Defrosting;
    enum Complete;
    enum ObservationFault;
    enum ElectricalBlocked;
  }

  enum def RequestMemory {
    enum Released;
    enum AcceptedActive;
    enum RearmRequired;
  }

  part def RequestIntentTracker :> Thread {
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port requestIntent : DataPort { out :>> type : RequestIntent; }

    language "GUMBO" /*{
      state
        requestMemory : RequestMemory;

      initialize
        guarantee
          INITIAL_REQUEST_STATE "Request qualification initializes released and non-actionable":
            requestMemory == RequestMemory.Released &
            requestIntent == RequestIntent.None;

      compute
        compute_cases
          case CC_01_FRESH_REQUEST "A valid active selection from Released is fresh and becomes accepted":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Active &
              In(requestMemory) == RequestMemory.Released;
            guarantee requestIntent == RequestIntent.Fresh &
              requestMemory == RequestMemory.AcceptedActive;

          case CC_02_HELD_REQUEST "A valid continuously active selection remains held and accepted":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Active &
              In(requestMemory) == RequestMemory.AcceptedActive;
            guarantee requestIntent == RequestIntent.Held &
              requestMemory == RequestMemory.AcceptedActive;

          case CC_03_RELEASE_REARM "Every valid release becomes non-actionable and arms a later fresh request":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Released;
            guarantee requestIntent == RequestIntent.None &
              requestMemory == RequestMemory.Released;

          case CC_04_INVALID_REQUEST "Every invalid request is blocked and enters the release-required state":
            assume requestValidity == RequestValidity.Invalid;
            guarantee requestIntent == RequestIntent.BlockedInvalid &
              requestMemory == RequestMemory.RearmRequired;

          case CC_05_ACTIVE_BEFORE_REARM "A valid active selection cannot bypass required release":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Active &
              In(requestMemory) == RequestMemory.RearmRequired;
            guarantee requestIntent == RequestIntent.BlockedRearm &
              requestMemory == RequestMemory.RearmRequired;
    }*/

                        
           
                          
                                      

                
                 
                           
                                                                                                
                                                     
                                                

             
                     
                         
                                                                                                          
                                                             
                                                           
                                                          
                                                            
                                                            

                         
                                                                                                    
                                                             
                                                           
                                                                
                                                           
                                                            

                         
                                                                                                               
                                                             
                                                            
                                                           
                                                      

                         
                                                                                                              
                                                              
                                                                     
                                                           

                         
                                                                                                   
                                                             
                                                           
                                                               
                                                                   
                                                           
       
  }

  part def GlazingConditionAssessor :> Thread {
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    port visibilityAssessment : DataPort { out :>> type : VisibilityAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_06_VISIBILITY_CLASSIFICATION "Validity and condition jointly derive the total three-way visibility fact":
            guarantee
              ((glazingValidity == GlazingValidity.Invalid) implies
                (visibilityAssessment == VisibilityAssessment.Unknown)) &
              ((glazingValidity == GlazingValidity.Valid &
                glazingCondition == GlazingCondition.Clear) implies
                (visibilityAssessment == VisibilityAssessment.Clear)) &
              ((glazingValidity == GlazingValidity.Valid &
                glazingCondition == GlazingCondition.Obscured) implies
                (visibilityAssessment == VisibilityAssessment.NeedsDefrost));
    }*/

                        
             
                     
                         
                                                                                                                           
                     
                                                                   
                                                                         
                                                          
                                                                   
                                                                       
                                                          
                                                                      
                                                                             
       
  }

  part def ElectricalEligibilityAssessor :> Thread {
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    port defrostEligibility : DataPort { out :>> type : DefrostEligibility; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_07_ELIGIBILITY_CLASSIFICATION "Availability has reason precedence and the remaining pair determines eligibility":
            guarantee
              ((electricalInterfaceStatus == ElectricalInterfaceStatus.Unavailable) implies
                (defrostEligibility == DefrostEligibility.BlockedUnavailable)) &
              ((electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
                defrostLoadAllowance == DefrostLoadAllowance.Restricted) implies
                (defrostEligibility == DefrostEligibility.BlockedRestricted)) &
              ((electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
                defrostLoadAllowance == DefrostLoadAllowance.Permitted) implies
                (defrostEligibility == DefrostEligibility.Eligible));
    }*/

                        
             
                     
                         
                                                                                                                                   
                     
                                                                                           
                                                                                
                                                                                  
                                                                                
                                                                               
                                                                                  
                                                                               
                                                                     
       
  }

  part def DefrostPolicySupervisor :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port visibilityAssessment : DataPort { in :>> type : VisibilityAssessment; }
    port defrostEligibility : DataPort { in :>> type : DefrostEligibility; }
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    port policyDisposition : DataPort { out :>> type : PolicyDisposition; }

    language "GUMBO" /*{
      initialize
        guarantee
          INITIAL_POLICY_OUTPUTS "The principal decision owner initializes to fail-off and inactive":
            defrostEnableCommand == DefrostEnableCommand.Off &
            policyDisposition == PolicyDisposition.Inactive;

      compute
        compute_cases
          case CC_08_NON_ACTIONABLE "Absent, invalid, or not-rearmed requests have first priority and force inactive off":
            assume requestIntent == RequestIntent.None |
              requestIntent == RequestIntent.BlockedInvalid |
              requestIntent == RequestIntent.BlockedRearm;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
              policyDisposition == PolicyDisposition.Inactive;

          case CC_09_OBSERVATION_FAULT "An actionable request with unknown glazing forces observation-fault off":
            assume (requestIntent == RequestIntent.Fresh |
              requestIntent == RequestIntent.Held) &
              visibilityAssessment == VisibilityAssessment.Unknown;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
              policyDisposition == PolicyDisposition.ObservationFault;

          case CC_10_ELECTRICAL_BLOCK "Known glazing with an actionable request is blocked by either ineligible resource reason":
            assume (requestIntent == RequestIntent.Fresh |
              requestIntent == RequestIntent.Held) &
              visibilityAssessment != VisibilityAssessment.Unknown &
              defrostEligibility != DefrostEligibility.Eligible;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
              policyDisposition == PolicyDisposition.ElectricalBlocked;

          case CC_11_ELIGIBLE_VISIBILITY "Eligible actionable requests command by the selected clear-or-obscured boundary":
            assume (requestIntent == RequestIntent.Fresh |
              requestIntent == RequestIntent.Held) &
              defrostEligibility == DefrostEligibility.Eligible &
              visibilityAssessment != VisibilityAssessment.Unknown;
            guarantee
              ((visibilityAssessment == VisibilityAssessment.NeedsDefrost) implies
                (defrostEnableCommand == DefrostEnableCommand.On &
                 policyDisposition == PolicyDisposition.Defrosting)) &
              ((visibilityAssessment == VisibilityAssessment.Clear) implies
                (defrostEnableCommand == DefrostEnableCommand.Off &
                 policyDisposition == PolicyDisposition.Complete));
    }*/

                        
                
                 
                           
                                                                                                     
                                                              
                                                            

             
                     
                         
                                                                                                                          
                                                        
                                                             
                                                          
                                                                        
                                                              

                         
                                                                                                                 
                                                          
                                                    
                                                                   
                                                                        
                                                                      

                         
                                                                                                                                 
                                                          
                                                    
                                                                    
                                                                
                                                                        
                                                                       

                         
                                                                                                                           
                                                          
                                                    
                                                                 
                                                                   
                     
                                                                                  
                                                                  
                                                                      
                                                                           
                                                                   
                                                                   
       
  }

  part def DriverFeedbackReporter :> Thread {
    port policyDisposition : DataPort { in :>> type : PolicyDisposition; }
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          INITIAL_DRIVER_STATUS "The driver-facing status initializes idle":
            driverDefrostStatus == DriverDefrostStatus.Idle;

      compute
        compute_cases
          case CC_12_DRIVER_REPORTING "Request blockers and policy disposition jointly determine the total audience status":
            guarantee
              (((requestIntent == RequestIntent.BlockedInvalid |
                 requestIntent == RequestIntent.BlockedRearm) |
                ((requestIntent == RequestIntent.Fresh |
                  requestIntent == RequestIntent.Held) &
                 (policyDisposition == PolicyDisposition.ObservationFault |
                  policyDisposition == PolicyDisposition.ElectricalBlocked))) implies
                (driverDefrostStatus == DriverDefrostStatus.AttentionRequired)) &
              (((requestIntent == RequestIntent.Fresh |
                 requestIntent == RequestIntent.Held) &
                policyDisposition == PolicyDisposition.Defrosting) implies
                (driverDefrostStatus == DriverDefrostStatus.Defrosting)) &
              (((requestIntent == RequestIntent.Fresh |
                 requestIntent == RequestIntent.Held) &
                policyDisposition == PolicyDisposition.Complete) implies
                (driverDefrostStatus == DriverDefrostStatus.Complete)) &
              ((requestIntent == RequestIntent.None |
                ((requestIntent == RequestIntent.Fresh |
                  requestIntent == RequestIntent.Held) &
                 policyDisposition == PolicyDisposition.Inactive)) implies
                (driverDefrostStatus == DriverDefrostStatus.Idle));
    }*/

                        
                
                 
                           
                                                                            
                                                            

             
                     
                         
                                                                                                                            
                     
                                                                
                                                               
                                                        
                                                        
                                                                           
                                                                                     
                                                                                 
                                                       
                                                       
                                                                          
                                                                          
                                                       
                                                       
                                                                        
                                                                        
                                                     
                                                        
                                                        
                                                                          
                                                                   
       
  }

  part def DefrostSupervisionProcess :> Process {
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    part requestIntentTracker : RequestIntentTracker;
    part glazingConditionAssessor : GlazingConditionAssessor;
    part electricalEligibilityAssessor : ElectricalEligibilityAssessor;
    part defrostPolicySupervisor : DefrostPolicySupervisor;
    part driverFeedbackReporter : DriverFeedbackReporter;

    connection int01 : PortConnection connect defrostSelection to requestIntentTracker.defrostSelection;
    connection int02 : PortConnection connect requestValidity to requestIntentTracker.requestValidity;
    connection int03 : PortConnection connect glazingCondition to glazingConditionAssessor.glazingCondition;
    connection int04 : PortConnection connect glazingValidity to glazingConditionAssessor.glazingValidity;
    connection int05 : PortConnection connect electricalInterfaceStatus to electricalEligibilityAssessor.electricalInterfaceStatus;
    connection int06 : PortConnection connect defrostLoadAllowance to electricalEligibilityAssessor.defrostLoadAllowance;
    connection int07 : PortConnection connect requestIntentTracker.requestIntent to defrostPolicySupervisor.requestIntent;
    connection int08 : PortConnection connect glazingConditionAssessor.visibilityAssessment to defrostPolicySupervisor.visibilityAssessment;
    connection int09 : PortConnection connect electricalEligibilityAssessor.defrostEligibility to defrostPolicySupervisor.defrostEligibility;
    connection int10 : PortConnection connect defrostPolicySupervisor.defrostEnableCommand to defrostEnableCommand;
    connection int11 : PortConnection connect defrostPolicySupervisor.policyDisposition to driverFeedbackReporter.policyDisposition;
    connection int12 : PortConnection connect requestIntentTracker.requestIntent to driverFeedbackReporter.requestIntent;
    connection int13 : PortConnection connect driverFeedbackReporter.driverDefrostStatus to driverDefrostStatus;
  }

  part def WindshieldDefrostRequestSupervisor :> System {
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    part defrostSupervisionProcess : DefrostSupervisionProcess;

    connection supportInt01 : PortConnection connect defrostSelection to defrostSupervisionProcess.defrostSelection;
    connection supportInt02 : PortConnection connect requestValidity to defrostSupervisionProcess.requestValidity;
    connection supportInt03 : PortConnection connect glazingCondition to defrostSupervisionProcess.glazingCondition;
    connection supportInt04 : PortConnection connect glazingValidity to defrostSupervisionProcess.glazingValidity;
    connection supportInt05 : PortConnection connect electricalInterfaceStatus to defrostSupervisionProcess.electricalInterfaceStatus;
    connection supportInt06 : PortConnection connect defrostLoadAllowance to defrostSupervisionProcess.defrostLoadAllowance;
    connection supportInt10 : PortConnection connect defrostSupervisionProcess.defrostEnableCommand to defrostEnableCommand;
    connection supportInt13 : PortConnection connect defrostSupervisionProcess.driverDefrostStatus to driverDefrostStatus;
  }

  part windshieldDefrostRequestSupervisor : WindshieldDefrostRequestSupervisor;
}
