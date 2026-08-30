package Battery_Evidence_Charge_Qualification_Supervisor {
  private import HAMR::*;

  enum def BatteryCapacityBand {
    enum LOW;
    enum USABLE;
  }

  enum def BatteryCheck {
    enum INVALID;
    enum VALID;
  }

  enum def ChargerConnection {
    enum DISCONNECTED;
    enum CONNECTED;
  }

  enum def ChargeActivity {
    enum INACTIVE;
    enum ACTIVE;
  }

  enum def LifecycleContext {
    enum OFF;
    enum STANDBY;
    enum CHARGING;
    enum READY;
    enum FLYING;
  }

  enum def ChargeRequest {
    enum NO_REQUEST;
    enum REQUEST_CHARGE;
    enum CANCEL_CHARGE;
  }

  enum def ChargePermission {
    enum DISABLED;
    enum ENABLED;
  }

  enum def BatteryReadinessAdvice {
    enum UNAVAILABLE;
    enum NOT_READY;
    enum READY;
  }

  enum def FlightControlBatteryNotice {
    enum CLEAR;
    enum LOW_BATTERY;
    enum LOW_IN_FLIGHT_CONTEXT;
    enum EVIDENCE_UNAVAILABLE;
  }

  enum def BatteryAssessment {
    enum UNAVAILABLE;
    enum LOW;
    enum ADEQUATE;
  }

  enum def ChargerPathQualification {
    enum UNAVAILABLE;
    enum READY;
    enum ACTIVE;
  }

  enum def ChargeContextQualification {
    enum BLOCKED_EVIDENCE;
    enum BLOCKED_CONTEXT;
    enum ELIGIBLE;
  }

  enum def ChargeEligibilityEnvelope {
    enum ELIGIBLE;
    enum BLOCKED_EVIDENCE;
    enum RECOVER_EVIDENCE;
    enum BLOCKED_CHARGER;
    enum RECOVER_CHARGER;
    enum BLOCKED_CONTEXT;
    enum RECOVER_CONTEXT;
  }

  enum def ChargeDecision {
    enum NO_CHANGE;
    enum AUTHORIZE;
    enum TERMINATE;
    enum RECOVER_EVIDENCE;
    enum RECOVER_CHARGER;
    enum RECOVER_CONTEXT;
    enum REJECT_EVIDENCE;
    enum REJECT_CHARGER;
    enum REJECT_CONTEXT;
  }

  enum def ChargeSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def ChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  enum def ChargeReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum CHARGER_UNAVAILABLE;
    enum CONTEXT_INELIGIBLE;
  }

  enum def PilotAdvisory {
    enum NONE;
    enum EVIDENCE_UNAVAILABLE;
    enum CHARGER_UNAVAILABLE;
    enum CONTEXT_INELIGIBLE;
    enum ACTIVITY_WITHOUT_PERMISSION;
    enum CHARGE_RECOMMENDED;
    enum REQUEST_REJECTED;
  }

  enum def SnapshotPreSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def SnapshotNextSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def PilotSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def SnapshotChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  enum def PilotChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  part def ChargeSessionSnapshot :> Data {
    attribute preSession : SnapshotPreSessionState;
    attribute nextSession : SnapshotNextSessionState;
    attribute disposition : SnapshotChargeDisposition;
    attribute reason : ChargeReason;
  }

  part def PilotBatteryStatus :> Data {
    attribute batteryAssessment : BatteryAssessment;
    attribute chargerPathQualification : ChargerPathQualification;
    attribute session : PilotSessionState;
    attribute disposition : PilotChargeDisposition;
    attribute advisory : PilotAdvisory;
  }

  part def BatteryEvidenceQualifier :> Thread {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port batteryAssessment : DataPort { out :>> type : BatteryAssessment; }

                        
                
                 
                           
                                                                                          
                                                           
                                                                     
                                                                                                      
                                                             
                                                                                                         
                                                                 
             
                     
                           
                                                                                                
                                                        
                                                                         
                           
                                                                        
                                                                                                   
                                                                 
                           
                                                                                   
                                                                                                      
                                                                      
       
  }

  part def ChargeContextQualifier :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port chargeContextQualification : DataPort { out :>> type : ChargeContextQualification; }
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }

                        
                
                 
                           
                                                                                                               
                                                                         
                                                                                          
                                                                               
                                                                  
                                                                                                                     
                                                                                    
                                                                  
                                                                                                      
                                                                    
                                                                                           
                                                                 
                                                                             
                                                                      
                                                                        
             
                     
                           
                                                                                       
                                                                      
                                                                                                 
                                                                           
                           
                                                                                                      
                                                                       
                                                                                                             
                                                                                         
                                                                   
                                                                               
                                                                        
                                                                          
                           
                                                                                                         
                                                                       
                                                                                                      
                                                            
                                                                                                
                                                                   
                                                                               
                                                                        
                                                                          
       
  }

  part def ChargerPathQualifier :> Thread {
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    port chargerPathQualification : DataPort { out :>> type : ChargerPathQualification; }

                        
                
                 
                           
                                                                                              
                                                                          
                                                                                   
                                                                                                                   
                                                                             
                                                                                                                 
                                                                             
             
                     
                           
                                                                                                  
                                                                       
                                                                                       
                           
                                                                               
                                                                                                                
                                                                                 
                           
                                                                                                 
                                                                                                              
                                                                                  
       
  }

  part def ChargeEligibilityRecoveryOwner :> Thread {
    port chargeContextQualification : DataPort { in :>> type : ChargeContextQualification; }
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    port currentChargeSession : DataPort { in :>> type : ChargeSessionState; }
    port chargeEligibilityEnvelope : DataPort { out :>> type : ChargeEligibilityEnvelope; }

                        
                
                 
                           
                                                                                                 
                                                                                         
                                                                         
                                                                                          
                                                                                         
                                                                         
                                                                                          
                                                                                         
                                                                                
                                                                         
                                                                                         
                                                                                         
                                                                                
                                                                         
                                                                                         
                                                                                        
                                                                                
                                                                         
                                                                                         
                                                                                        
                                                                                
                                                                         
                                                                                         
                                                                                 
                                                                                       
                                                                                 
             
                     
                           
                                                                                                      
                                                                                             
                     
                                                                           
                                                                                            
                                                                           
                                                                                           
                           
                                                                                            
                                                                                              
                                                                               
                     
                                                                           
                                                                                           
                                                                           
                                                                                          
                           
                                                                                                       
                                                                                             
                                                                               
                     
                                                                           
                                                                                           
                                                                           
                                                                                          
                           
                                                                                                             
                                                                                      
                                                                               
                                                                                      
       
  }

  part def ChargeIntentArbiter :> Thread {
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    port chargeEligibilityEnvelope : DataPort { in :>> type : ChargeEligibilityEnvelope; }
    port chargeDecision : DataPort { out :>> type : ChargeDecision; }

                        
                
                 
                           
                                                                                                                         
                                                                   
                                                             
                                                            
                                                                                              
                                                                    
                                                            
                                                                                             
                                                                   
                                                            
                                                                                             
                                                                   
                                                             
                                                                                      
                                                             
                                                             
                                                                                              
                                                                   
                                                             
                                                                                             
                                                                  
                                                             
                                                                                             
                                                                  
                                                         
                                                                                       
                                                                                      
                                                                                             
                                                            
             
                     
                           
                                                                                    
                                                                
                                                                 
                           
                                                                                             
                                                                 
                                                                                        
                                                                                       
                                                                                       
                     
                                                                                                
                                                                      
                                                                                               
                                                                     
                                                                                               
                                                                    
                           
                                                                                                     
                                                                 
                                                                                       
                                                                                      
                                                                                     
                     
                                                               
                                                                                        
                                                               
                                                               
                                                                                                
                                                                     
                                                               
                                                                                               
                                                                    
                                                               
                                                                                               
                                                                    
                                                                  
                                                              
       
  }

  part def ChargeSessionController :> Thread {
    port chargeDecision : DataPort { in :>> type : ChargeDecision; }
    port currentChargeSession : DataPort { out :>> type : ChargeSessionState; }
    port chargeSessionSnapshot : DataPort { out :>> type : ChargeSessionSnapshot; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }

                        
           
                         
                                                    
                
                 
                           
                                                                                                                                      
                                                               
                                                             
                                                           
                                                                              
                                                                                
                                                                                      
                                                              
             
                 
                          
                                                                                                              
                                                               
                 
                           
                                                                                                          
                                                                            
                                                                                   
                                                                               
                                                                                      
                                                                                 
                                                                                       
                 
                           
                                                                                                                            
                                                                        
                                                                                   
                                                                
                                                                           
                                                                                      
                                                               
                                                                             
                                                                                        
                                                               
                 
                                
                                                                                                            
                                                                                                     
                                                                                  
                                                                                 
                                                                                
                     
                           
                                                                                                                                      
                                                               
                                                          
                                                                 
                                                                
                                                               
                     
                                                                   
                                                                       
                                                                                          
                                                                      
                                                                   
                                                                    
                                                                                          
                                                                           
                                                                          
                                                                         
                                                                                                  
                                                                                      
                                                                         
                                                                         
                                                                                                  
                                                                                     
                                                                         
                                                                         
                                                                                                  
                                                                                   
                           
                                                                                                                                   
                                                               
                                                                
                                                               
                                                              
                                                                            
                                                                   
                                                                                           
                                                                      
                                                                         
                                                                                          
                                                                                      
                                                                        
                                                                                          
                                                                                     
                                                                        
                                                                                          
                                                                                   
       
  }

  part def FlightControlBatteryNoticePolicy :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }

                        
                
                 
                           
                                                                                                
                                                                         
                                                                                                
                                                                                                               
                                                                                                 
                                                                                                               
                                                                                       
                                                                      
                                                                                
             
                     
                           
                                                                                                                                          
                     
                                                                           
                                                                                                  
                                                                                                                 
                                                                                                   
                                                                                                                 
                                                                                         
                                                                        
                                                                                  
       
  }

  part def PilotBatteryStatusPolicy :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    port chargeSessionSnapshot : DataPort { in :>> type : ChargeSessionSnapshot; }
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

                        
                
                 
                           
                                                                                                                     
                                                                       
                                                                                     
                                                                                         
                                                                       
                                                                                            
                                                                          
                                                                                              
                                                                            
                                                                                               
                                                                                     
                                                                                              
                                                                                    
                                                                                              
                                                                                    
                                                                                                      
                                                                                            
                                                                         
                                                                                    
                                                                  
                                                                                               
                                                                                        
                                                                                    
                                                                  
                                                                                               
                                                                                       
                                                                                   
                                                                  
                                                                                               
                                                                                      
                                                                                  
                                                                  
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                           
                                                                                            
                                                                                           
                                                          
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                            
                                                                                              
                                                                                  
                                                               
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                            
                                                                                       
                                                                                              
                                                                                
                                                               
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                            
                                                                                       
                                                                                              
                                                                   
             
                     
                           
                                                                                                                                              
                     
                                                                         
                                                                                       
                                                                                           
                                                                         
                                                                                              
                                                                            
                                                                                                
                                                                              
                                                                                                 
                                                                                       
                                                                                                
                                                                                      
                                                                                                
                                                                                      
                                                                                                        
                                                                                              
                                                                           
                                                                                      
                                                                    
                                                                                                 
                                                                                          
                                                                                      
                                                                    
                                                                                                 
                                                                                         
                                                                                     
                                                                    
                                                                                                 
                                                                                        
                                                                                    
                                                                    
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                             
                                                                                              
                                                                                             
                                                            
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                              
                                                                                                
                                                                                    
                                                                 
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                              
                                                                                         
                                                                                                
                                                                                  
                                                                 
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                              
                                                                                         
                                                                                                
                                                                     
       
  }

  part def SupervisorProcess :> Process {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    part chargeContextQualifier : ChargeContextQualifier;
    part chargerPathQualifier : ChargerPathQualifier;
    part chargeEligibilityRecoveryOwner : ChargeEligibilityRecoveryOwner;
    part chargeIntentArbiter : ChargeIntentArbiter;
    part chargeSessionController : ChargeSessionController;
    part flightControlBatteryNoticePolicy : FlightControlBatteryNoticePolicy;
    part pilotBatteryStatusPolicy : PilotBatteryStatusPolicy;

    connection int01 : PortConnection connect batteryCapacity to batteryEvidenceQualifier.batteryCapacity;
    connection int02 : PortConnection connect batteryCheck to batteryEvidenceQualifier.batteryCheck;
    connection int03 : PortConnection connect chargerConnection to chargerPathQualifier.chargerConnection;
    connection int04 : PortConnection connect chargeActivity to chargerPathQualifier.chargeActivity;
    connection int05 : PortConnection connect lifecycleContext to chargeContextQualifier.lifecycleContext;
    connection int06 : PortConnection connect lifecycleContext to flightControlBatteryNoticePolicy.lifecycleContext;
    connection int07 : PortConnection connect chargeRequest to chargeIntentArbiter.chargeRequest;
    connection int08 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to chargeContextQualifier.batteryAssessment;
    connection int09 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to flightControlBatteryNoticePolicy.batteryAssessment;
    connection int10 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to pilotBatteryStatusPolicy.batteryAssessment;
    connection int11 : PortConnection connect chargerPathQualifier.chargerPathQualification to chargeEligibilityRecoveryOwner.chargerPathQualification;
    connection int12 : PortConnection connect chargerPathQualifier.chargerPathQualification to pilotBatteryStatusPolicy.chargerPathQualification;
    connection int13 : PortConnection connect chargeContextQualifier.chargeContextQualification to chargeEligibilityRecoveryOwner.chargeContextQualification;
    connection int14 : PortConnection connect chargeSessionController.currentChargeSession to chargeEligibilityRecoveryOwner.currentChargeSession;
    connection int15 : PortConnection connect chargeEligibilityRecoveryOwner.chargeEligibilityEnvelope to chargeIntentArbiter.chargeEligibilityEnvelope;
    connection int16 : PortConnection connect chargeIntentArbiter.chargeDecision to chargeSessionController.chargeDecision;
    connection int17 : PortConnection connect chargeSessionController.chargeSessionSnapshot to pilotBatteryStatusPolicy.chargeSessionSnapshot;
    connection int18 : PortConnection connect chargeSessionController.chargePermission to chargePermission;
    connection int19 : PortConnection connect chargeContextQualifier.batteryReadinessAdvice to batteryReadinessAdvice;
    connection int20 : PortConnection connect flightControlBatteryNoticePolicy.flightControlBatteryNotice to flightControlBatteryNotice;
    connection int21 : PortConnection connect pilotBatteryStatusPolicy.pilotBatteryStatus to pilotBatteryStatus;
  }

  part def BatteryEvidenceChargeQualificationSupervisor :> System {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    part supervisorProcess : SupervisorProcess;

    connection supportBatteryCapacity : PortConnection connect batteryCapacity to supervisorProcess.batteryCapacity;
    connection supportBatteryCheck : PortConnection connect batteryCheck to supervisorProcess.batteryCheck;
    connection supportChargerConnection : PortConnection connect chargerConnection to supervisorProcess.chargerConnection;
    connection supportChargeActivity : PortConnection connect chargeActivity to supervisorProcess.chargeActivity;
    connection supportLifecycleContext : PortConnection connect lifecycleContext to supervisorProcess.lifecycleContext;
    connection supportChargeRequest : PortConnection connect chargeRequest to supervisorProcess.chargeRequest;
    connection supportChargePermission : PortConnection connect supervisorProcess.chargePermission to chargePermission;
    connection supportReadiness : PortConnection connect supervisorProcess.batteryReadinessAdvice to batteryReadinessAdvice;
    connection supportNotice : PortConnection connect supervisorProcess.flightControlBatteryNotice to flightControlBatteryNotice;
    connection supportPilotStatus : PortConnection connect supervisorProcess.pilotBatteryStatus to pilotBatteryStatus;
  }

  part batteryEvidenceChargeQualificationSupervisor : BatteryEvidenceChargeQualificationSupervisor;
}
