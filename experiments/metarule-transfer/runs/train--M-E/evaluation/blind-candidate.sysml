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

                        
           
                          
                                      

                
                 
                           
                                                                                                
                                                     
                                                

             
                     
                         
                                                                                                          
                                                             
                                                           
                                                          
                                                            
                                                            

                         
                                                                                                    
                                                             
                                                           
                                                                
                                                           
                                                            

                         
                                                                                                               
                                                             
                                                            
                                                           
                                                      

                         
                                                                                                              
                                                              
                                                                     
                                                           

                         
                                                                                                   
                                                             
                                                           
                                                               
                                                                   
                                                           
       
  }

  part def GlazingConditionAssessor :> Thread {
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    port visibilityAssessment : DataPort { out :>> type : VisibilityAssessment; }

                        
             
                     
                         
                                                                                                                           
                     
                                                                   
                                                                         
                                                          
                                                                   
                                                                       
                                                          
                                                                      
                                                                             
       
  }

  part def ElectricalEligibilityAssessor :> Thread {
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    port defrostEligibility : DataPort { out :>> type : DefrostEligibility; }

                        
             
                     
                         
                                                                                                                                   
                     
                                                                                           
                                                                                
                                                                                  
                                                                                
                                                                               
                                                                                  
                                                                               
                                                                     
       
  }

  part def DefrostPolicySupervisor :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port visibilityAssessment : DataPort { in :>> type : VisibilityAssessment; }
    port defrostEligibility : DataPort { in :>> type : DefrostEligibility; }
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    port policyDisposition : DataPort { out :>> type : PolicyDisposition; }

                        
                
                 
                           
                                                                                                     
                                                              
                                                            

             
                     
                         
                                                                                                                          
                                                        
                                                             
                                                          
                                                                        
                                                              

                         
                                                                                                                 
                                                          
                                                    
                                                                   
                                                                        
                                                                      

                         
                                                                                                                                 
                                                          
                                                    
                                                                    
                                                                
                                                                        
                                                                       

                         
                                                                                                                           
                                                          
                                                    
                                                                 
                                                                   
                     
                                                                                  
                                                                  
                                                                      
                                                                           
                                                                   
                                                                   
       
  }

  part def DriverFeedbackReporter :> Thread {
    port policyDisposition : DataPort { in :>> type : PolicyDisposition; }
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

                        
                
                 
                           
                                                                            
                                                            

             
                     
                         
                                                                                                                            
                     
                                                                
                                                               
                                                        
                                                        
                                                                           
                                                                                     
                                                                                 
                                                       
                                                       
                                                                          
                                                                          
                                                       
                                                       
                                                                        
                                                                        
                                                     
                                                        
                                                        
                                                                          
                                                                   
       
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
