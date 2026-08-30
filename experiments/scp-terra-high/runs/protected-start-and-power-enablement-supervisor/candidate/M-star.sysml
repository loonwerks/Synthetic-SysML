// Canonical final source: retained architecture plus approved GUMBO behavior.
package Protected_Start_Power_Supervisor {
  private import HAMR::*;

  // Closed finite boundary and policy domains.
  enum def Validity { enum Valid; enum Invalid; }
  enum def Command { enum None; enum Start; enum Off; enum EnterMaintenance; enum ReturnToNormal; }
  enum def PedalCondition { enum Pressed; enum Released; }
  enum def TemperatureBand { enum Nominal; enum Elevated; enum OverLimit; }
  enum def SupplyAvailability { enum Available; enum Unavailable; }
  enum def ParkingBrakeCondition { enum Applied; enum Released; }
  enum def SelfTestProgress { enum Idle; enum Running; enum Passed; enum Failed; }
  enum def QualifiedTemperature { enum InvalidEvidence; enum Nominal; enum Elevated; enum OverLimit; }
  enum def ThermalState { enum Blocked; enum Confirming; enum Clear; }
  enum def SelfTestState { enum Untested; enum Testing; enum Passed; enum Failed; }
  enum def Session { enum Off; enum Arming; enum On; enum Degraded; enum Maintenance; }
  enum def RearmState { enum Blocked; enum Confirming; enum Ready; }
  enum def Notice { enum FaultAttention; enum RecoveryRequired; enum RecoveryConfirming; enum Maintenance; enum Starting; enum Enabled; enum Off; }
  enum def SessionCause {
    enum CurrentFault; enum FreshRecoveryAccepted; enum RecoveryPending;
    enum OffAccepted; enum MaintenanceAccepted; enum StartAccepted;
    enum StartRejected; enum EnableCompleted; enum EnableAborted;
    enum OnSustained; enum ReadinessWithdrawn; enum NoApplicableRequest;
  }
  enum def FuelDisposition { enum Inhibit; enum Enable; }
  enum def ElectricalDisposition { enum Isolate; enum Provide; }
  enum def ParkingBrakeDisposition { enum Apply; enum Release; }

  // Every field below is an attribute because final GUMBO inspects it.
  part def CommandReport :> Data {
    attribute command : Command;
    attribute status : Validity;
  }
  part def BrakePedalReport :> Data {
    attribute condition : PedalCondition;
    attribute status : Validity;
  }
  part def TemperatureReport :> Data {
    attribute band : TemperatureBand;
    attribute status : Validity;
  }
  part def ElectricalPowerReport :> Data {
    attribute availability : SupplyAvailability;
    attribute status : Validity;
  }
  part def ParkingBrakeReport :> Data {
    attribute condition : ParkingBrakeCondition;
    attribute status : Validity;
  }
  part def SelfTestReport :> Data {
    attribute progress : SelfTestProgress;
    attribute status : Validity;
  }
  part def QualifiedCommandFacts :> Data {
    attribute command : Command;
    attribute selfTestResetRequested : Base_Types::Boolean;
  }
  part def QualifiedPedalFacts :> Data {
    attribute pedalStartCondition : Base_Types::Boolean;
  }
  part def QualifiedSupplyFacts :> Data {
    attribute supplyUsable : Base_Types::Boolean;
  }
  part def QualifiedParkingBrakeFacts :> Data {
    attribute brakeAppliedEvidence : Base_Types::Boolean;
  }
  part def ThermalStateFacts :> Data {
    attribute thermalState : ThermalState;
    attribute thermalClear : Base_Types::Boolean;
  }
  part def SelfTestStateFacts :> Data {
    attribute selfTestState : SelfTestState;
    attribute selfTestPassed : Base_Types::Boolean;
  }
  part def StartRestraintFact :> Data {
    attribute startRestraintSatisfied : Base_Types::Boolean;
  }
  part def ReadinessFacts :> Data {
    attribute startReady : Base_Types::Boolean;
    attribute sustainReady : Base_Types::Boolean;
  }
  part def ExactFaultSummary :> Data {
    attribute commandFault : Base_Types::Boolean;
    attribute pedalFault : Base_Types::Boolean;
    attribute thermalFault : Base_Types::Boolean;
    attribute supplyFault : Base_Types::Boolean;
    attribute parkingBrakeFault : Base_Types::Boolean;
    attribute selfTestFault : Base_Types::Boolean;
    attribute anyFault : Base_Types::Boolean;
  }
  part def RearmStateFacts :> Data {
    attribute rearmState : RearmState;
  }
  part def RecoveryPermitFact :> Data {
    attribute recoveryPermit : Base_Types::Boolean;
  }
  part def SessionDecisionFacts :> Data {
    attribute session : Session;
    attribute cause : SessionCause;
  }
  part def ActuationDisposition :> Data {
    attribute fuel : FuelDisposition;
    attribute electricalPower : ElectricalDisposition;
    attribute parkingBrake : ParkingBrakeDisposition;
  }
  part def SupervisoryStatus :> Data {
    attribute session : Session;
    attribute startReady : Base_Types::Boolean;
    attribute sustainReady : Base_Types::Boolean;
    attribute rearmState : RearmState;
    attribute notice : Notice;
    attribute commandFault : Base_Types::Boolean;
    attribute pedalFault : Base_Types::Boolean;
    attribute thermalFault : Base_Types::Boolean;
    attribute supplyFault : Base_Types::Boolean;
    attribute parkingBrakeFault : Base_Types::Boolean;
    attribute selfTestFault : Base_Types::Boolean;
    attribute anyFault : Base_Types::Boolean;
  }

  part def CommandQualificationOwner :> Thread {
    port command_report : DataPort { in :>> type : CommandReport; }
    port qualified_command_facts : DataPort { out :>> type : QualifiedCommandFacts; }
    port command_fault : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                        
                                                
                                                           
                                                                                   
             
                         
                                              
                                                       
                                                              
                                                     
                                                                         
                                                            
                                                      
                                                     
                                                                     
                                                                         
       
  }
  part def BrakePedalQualificationOwner :> Thread {
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    port qualified_pedal_facts : DataPort { out :>> type : QualifiedPedalFacts; }
    port pedal_fault : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                        
                                              
                                                                            
             
                         
                                            
                                                       
                                                          
                                                                       
                                                                           
       
  }
  part def TemperatureQualificationOwner :> Thread {
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    port qualified_temperature : DataPort { out :>> type : QualifiedTemperature; }

                        
                
                        
                                                    
                                                                        
             
                         
                                                  
                                                           
                                                                            
                                                         
                                                                
                                                                    
                                                         
                                                                 
                                                                     
                                                         
                                                                  
                                                                      
       
  }
  part def ElectricalSupplyQualificationOwner :> Thread {
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    port qualified_supply_facts : DataPort { out :>> type : QualifiedSupplyFacts; }
    port supply_fault : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                        
                                               
                                                                       
             
                         
                                             
                                                 
                                                               
                                                                                     
                                                                                 
       
  }
  part def ParkingBrakeQualificationOwner :> Thread {
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    port qualified_parking_brake_facts : DataPort { out :>> type : QualifiedParkingBrakeFacts; }
    port parking_brake_fault : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                        
                                                      
                                                                   
                                   
             
                         
                                                    
                                                                
                                                            
                                                                                
                                                                                     
       
  }
  part def ThermalClearanceStateOwner :> Thread {
    port qualified_temperature : DataPort { in :>> type : QualifiedTemperature; }
    port thermal_state_facts : DataPort { out :>> type : ThermalStateFacts; }
    port thermal_fault : DataPort { out :>> type : Base_Types::Boolean; }

                        
           
                         
                                    
                
                               
                        
                                          
                                                 
                                                                    
                                                                     
             
                               
                         
                                           
                                                             
                                                                                      
                     
                                 
                                           
                                                                                  
                                                                      
                                                             
                                                                         
                                 
                                              
                                                                          
                                                             
                                                                         
                                 
                                     
                                                                          
                                                        
                                                                
                                                                         
                                 
                                      
                                                                          
                                                           
                                                           
                                                                         
                                 
                                       
                                                                          
                                                      
                                                           
                                                                         
       
  }
  part def SelfTestCampaignStateOwner :> Thread {
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    port self_test_state_facts : DataPort { out :>> type : SelfTestStateFacts; }
    port self_test_fault : DataPort { out :>> type : Base_Types::Boolean; }

                        
           
                         
                                      
                
                                
                        
                                             
                                                    
                                                                         
                                                                           
             
                                
                         
                                             
                                                                 
                                                                                             
                     
                                
                                           
                                                                
                                                          
                                                                     
                                                              
                                                                               
                                
                                     
                                                              
                                                                    
                                                             
                                                                
                                                                               
                                
                                       
                                                              
                                                                    
                                                                   
                                                            
                                                                
                                                                    
                                                               
                                                                               
                                
                                          
                                                              
                                                                    
                                                                   
                                                            
                                                                
                                                                   
                                                              
                                                                               
                                
                                         
                                                              
                                                                    
                                                                   
                                                           
                                                                   
                                                              
                                                                               
                                
                                        
                                                              
                                                                    
                                                                   
                                                         
                                                              
                                                                               
                                
                                         
                                                              
                                                                    
                                                                   
                                                              
                                                                   
                                                                         
                                                                           
                                                             
                                                                       
                                                           
                                                            
                                                         
                                                                            
       
  }
  part def StartRestraintDecisionOwner :> Thread {
    port qualified_pedal_facts : DataPort { in :>> type : QualifiedPedalFacts; }
    port qualified_parking_brake_facts : DataPort { in :>> type : QualifiedParkingBrakeFacts; }
    port start_restraint_fact : DataPort { out :>> type : StartRestraintFact; }

                        
                
                        
                                                
                                                            
             
                         
                                           
                                                          
                                                        
                                                                  
       
  }
  part def ReadinessCompositionOwner :> Thread {
    port qualified_supply_facts : DataPort { in :>> type : QualifiedSupplyFacts; }
    port thermal_state_facts : DataPort { in :>> type : ThermalStateFacts; }
    port self_test_state_facts : DataPort { in :>> type : SelfTestStateFacts; }
    port start_restraint_fact : DataPort { in :>> type : StartRestraintFact; }
    port readiness_facts : DataPort { out :>> type : ReadinessFacts; }

                        
                
                        
                                    
                                                                              
             
                         
                                        
                                        
                                                  
                                               
                                                   
                                                             
                                          
                                                  
                                               
                                                    
       
  }
  part def OperatingSessionStatePriorityOwner :> Thread {
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port recovery_permit_fact : DataPort { in :>> type : RecoveryPermitFact; }
    port session_decision_facts : DataPort { out :>> type : SessionDecisionFacts; }

                        
           
                         
                               
                
                               
                        
                                      
                                        
                                                         
                                                                           
             
                               
                                
                                           
                                                          
                     
                                   
                                     
                                                
                                                         
                                                                        
                                   
                                               
                                                      
                                                     
                                                  
                                                    
                                                                                 
                                   
                                          
                                                      
                                                     
                                                       
                                                         
                                                                           
                                   
                                    
                                                      
                                                     
                                                             
                                                    
                                                                       
                                   
                                            
                                                      
                                                     
                                                                          
                                                            
                                                                               
                                   
                                      
                                                      
                                                 
                                                          
                                                                
                                         
                                                       
                                                                         
                                   
                                      
                                                      
                                                 
                                                          
                                                                
                                              
                                                          
                                                                         
                                   
                                        
                                                      
                                                   
                                                              
                                                                           
                                           
                                                   
                                                                           
                                   
                                      
                                                      
                                                   
                                                              
                                                                           
                                                
                                                    
                                                                         
                                   
                                    
                                                      
                                               
                                                              
                                                                           
                                           
                                                   
                                                                       
                                   
                                           
                                                      
                                               
                                                              
                                                                           
                                                
                                                         
                                                                              
                                   
                                             
                                                      
                                                 
                                                          
                                                                
                                                                          
                                                          
                                                                               
       
  }
  part def FaultVectorCompositionOwner :> Thread {
    port command_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port pedal_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port thermal_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port supply_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port parking_brake_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port self_test_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port exact_fault_summary : DataPort { out :>> type : ExactFaultSummary; }

                        
                
                        
                                             
                                                 
                                               
                                                 
                                                
                                                      
                                                  
                                            
             
                              
                                            
                                                             
                                                         
                                                             
                                                           
                                                                        
                                                                
                                          
                                                                         
                                                     
       
  }
  part def RearmQualificationStateOwner :> Thread {
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port rearm_state_facts : DataPort { out :>> type : RearmStateFacts; }
    port recovery_permit_fact : DataPort { out :>> type : RecoveryPermitFact; }

                        
           
                         
                                
                
                             
                        
                                        
                                             
                                                              
                                                   
             
                             
                         
                                         
                                                      
                     
                                 
                                   
                                                
                                                         
                                                       
                                 
                                       
                                                                                         
                                                         
                                                       
                                 
                                          
                                                                                     
                                                    
                                                            
                                                       
                                 
                                           
                                                                                     
                                                       
                                                       
                                                       
                                 
                                         
                                                                                     
                                                  
                                                       
                                                     
                                                                             
       
  }
  part def ActuationCompositionOwner :> Thread {
    port session_decision_facts : DataPort { in :>> type : SessionDecisionFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }

                        
                
                        
                                         
                                                                 
                                                                                  
                                                                              
             
                            
                                              
                                          
                                                                   
                                                                                    
                                                                                  
                                               
                                                          
                                                                  
                                                                                    
                                                                                    
                                               
                                                               
                                                                     
                                                                   
                                                                                    
                                                                                  
                                               
                                                            
                                                                  
                                                                   
                                                                                    
                                                                                  
       
  }
  part def SupervisoryStatusNoticeOwner :> Thread {
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port rearm_state_facts : DataPort { in :>> type : RearmStateFacts; }
    port session_decision_facts : DataPort { in :>> type : SessionDecisionFacts; }
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

                        
                
                        
                                              
                                                     
                                                                                     
                                                               
                                                   
                                                                                     
                                                                                      
                                                                                             
                                           
             
                             
                                               
                                                                        
                                                                       
                                                                           
                                                                         
                                                                               
                                                                           
                                                                               
                                                                             
                                                                                         
                                                                                 
                                                                      
                               
                                                    
                                          
                                                                 
                                               
                                                                
                                                                   
                                                                     
                                               
                                                                
                                                                   
                                                                   
                                               
                                                                   
                                                              
                                               
                                                              
                                                           
                                               
                                                          
                                                          
                                               
                                                           
                                                      
       
  }

  part def ProtectedStartPowerProcess :> Process {
    port command_report : DataPort { in :>> type : CommandReport; }
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

    // Fourteen sibling semantic usages in approved order.
    part command_qualification_owner : CommandQualificationOwner;
    part brake_pedal_qualification_owner : BrakePedalQualificationOwner;
    part temperature_qualification_owner : TemperatureQualificationOwner;
    part electrical_supply_qualification_owner : ElectricalSupplyQualificationOwner;
    part parking_brake_qualification_owner : ParkingBrakeQualificationOwner;
    part thermal_clearance_state_owner : ThermalClearanceStateOwner;
    part self_test_campaign_state_owner : SelfTestCampaignStateOwner;
    part start_restraint_decision_owner : StartRestraintDecisionOwner;
    part readiness_composition_owner : ReadinessCompositionOwner;
    part operating_session_state_priority_owner : OperatingSessionStatePriorityOwner;
    part fault_vector_composition_owner : FaultVectorCompositionOwner;
    part rearm_qualification_state_owner : RearmQualificationStateOwner;
    part actuation_composition_owner : ActuationCompositionOwner;
    part supervisory_status_notice_owner : SupervisoryStatusNoticeOwner;

    // Exact thirty-five semantic interactions.
    connection int01 : PortConnection connect command_report to command_qualification_owner.command_report;
    connection int02 : PortConnection connect brake_pedal_report to brake_pedal_qualification_owner.brake_pedal_report;
    connection int03 : PortConnection connect temperature_report to temperature_qualification_owner.temperature_report;
    connection int04 : PortConnection connect electrical_power_report to electrical_supply_qualification_owner.electrical_power_report;
    connection int05 : PortConnection connect parking_brake_report to parking_brake_qualification_owner.parking_brake_report;
    connection int06 : PortConnection connect self_test_report to self_test_campaign_state_owner.self_test_report;
    connection int07 : PortConnection connect command_qualification_owner.qualified_command_facts to self_test_campaign_state_owner.qualified_command_facts;
    connection int08 : PortConnection connect command_qualification_owner.qualified_command_facts to operating_session_state_priority_owner.qualified_command_facts;
    connection int09 : PortConnection connect command_qualification_owner.qualified_command_facts to rearm_qualification_state_owner.qualified_command_facts;
    connection int10 : PortConnection connect command_qualification_owner.command_fault to fault_vector_composition_owner.command_fault;
    connection int11 : PortConnection connect brake_pedal_qualification_owner.qualified_pedal_facts to start_restraint_decision_owner.qualified_pedal_facts;
    connection int12 : PortConnection connect brake_pedal_qualification_owner.pedal_fault to fault_vector_composition_owner.pedal_fault;
    connection int13 : PortConnection connect temperature_qualification_owner.qualified_temperature to thermal_clearance_state_owner.qualified_temperature;
    connection int14 : PortConnection connect electrical_supply_qualification_owner.qualified_supply_facts to readiness_composition_owner.qualified_supply_facts;
    connection int15 : PortConnection connect electrical_supply_qualification_owner.supply_fault to fault_vector_composition_owner.supply_fault;
    connection int16 : PortConnection connect parking_brake_qualification_owner.qualified_parking_brake_facts to start_restraint_decision_owner.qualified_parking_brake_facts;
    connection int17 : PortConnection connect parking_brake_qualification_owner.parking_brake_fault to fault_vector_composition_owner.parking_brake_fault;
    connection int18 : PortConnection connect thermal_clearance_state_owner.thermal_state_facts to readiness_composition_owner.thermal_state_facts;
    connection int19 : PortConnection connect thermal_clearance_state_owner.thermal_fault to fault_vector_composition_owner.thermal_fault;
    connection int20 : PortConnection connect self_test_campaign_state_owner.self_test_state_facts to readiness_composition_owner.self_test_state_facts;
    connection int21 : PortConnection connect self_test_campaign_state_owner.self_test_fault to fault_vector_composition_owner.self_test_fault;
    connection int22 : PortConnection connect start_restraint_decision_owner.start_restraint_fact to readiness_composition_owner.start_restraint_fact;
    connection int23 : PortConnection connect readiness_composition_owner.readiness_facts to operating_session_state_priority_owner.readiness_facts;
    connection int24 : PortConnection connect readiness_composition_owner.readiness_facts to rearm_qualification_state_owner.readiness_facts;
    connection int25 : PortConnection connect readiness_composition_owner.readiness_facts to supervisory_status_notice_owner.readiness_facts;
    connection int26 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to operating_session_state_priority_owner.exact_fault_summary;
    connection int27 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to rearm_qualification_state_owner.exact_fault_summary;
    connection int28 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to actuation_composition_owner.exact_fault_summary;
    connection int29 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to supervisory_status_notice_owner.exact_fault_summary;
    connection int30 : PortConnection connect rearm_qualification_state_owner.recovery_permit_fact to operating_session_state_priority_owner.recovery_permit_fact;
    connection int31 : PortConnection connect rearm_qualification_state_owner.rearm_state_facts to supervisory_status_notice_owner.rearm_state_facts;
    connection int32 : PortConnection connect operating_session_state_priority_owner.session_decision_facts to actuation_composition_owner.session_decision_facts;
    connection int33 : PortConnection connect operating_session_state_priority_owner.session_decision_facts to supervisory_status_notice_owner.session_decision_facts;
    connection int34 : PortConnection connect actuation_composition_owner.actuation_disposition to actuation_disposition;
    connection int35 : PortConnection connect supervisory_status_notice_owner.supervisory_status to supervisory_status;
  }

  part def ProtectedStartPowerSupervisorSystem :> System {
    port command_report : DataPort { in :>> type : CommandReport; }
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

    part protected_start_power_process : ProtectedStartPowerProcess;

    connection support01 : PortConnection connect command_report to protected_start_power_process.command_report;
    connection support02 : PortConnection connect brake_pedal_report to protected_start_power_process.brake_pedal_report;
    connection support03 : PortConnection connect temperature_report to protected_start_power_process.temperature_report;
    connection support04 : PortConnection connect electrical_power_report to protected_start_power_process.electrical_power_report;
    connection support05 : PortConnection connect parking_brake_report to protected_start_power_process.parking_brake_report;
    connection support06 : PortConnection connect self_test_report to protected_start_power_process.self_test_report;
    connection support07 : PortConnection connect protected_start_power_process.actuation_disposition to actuation_disposition;
    connection support08 : PortConnection connect protected_start_power_process.supervisory_status to supervisory_status;
  }

  // Exactly one explicit root System usage.
  part protected_start_power_supervisor : ProtectedStartPowerSupervisorSystem;
}
