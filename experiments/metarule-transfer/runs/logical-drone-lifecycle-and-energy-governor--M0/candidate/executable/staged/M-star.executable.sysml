// Canonical final checkpoint: approved architecture plus owner-local GUMBO.
// Bounded analysis mirrors these relations without extending the claim boundary.

package Drone_Lifecycle_Energy_Governor {
  private import HAMR::*;

  enum def LifecycleRequest {
    enum NONE; enum SWITCH_ON; enum SWITCH_OFF; enum START_CHARGE;
    enum STOP_CHARGE; enum ACTIVATE; enum DEACTIVATE; enum LAUNCH;
    enum RETURN; enum LAND;
  }
  enum def RequestFamily {
    enum ABSENT; enum POWER; enum CHARGE; enum READINESS; enum AIRBORNE;
  }
  enum def ExactRequestCode {
    enum NONE; enum SWITCH_ON; enum SWITCH_OFF; enum START_CHARGE;
    enum STOP_CHARGE; enum ACTIVATE; enum DEACTIVATE; enum LAUNCH;
    enum RETURN; enum LAND;
  }
  enum def BatteryBand { enum FULL; enum MEDIUM; enum LOW; enum CRITICAL; }
  enum def EvidenceValidity { enum VALID; enum INVALID; }
  enum def ChargerReport {
    enum DISCONNECTED; enum CONNECTED_HEALTHY; enum CONNECTED_FAULTED;
  }
  enum def NavigationReport { enum USABLE; enum UNUSABLE; }
  enum def FlightControlReport { enum AVAILABLE; enum FAULTED; }
  enum def HomeValue { enum AWAY; enum REACHED; }
  enum def TouchdownValue { enum NOT_CONFIRMED; enum CONFIRMED; }
  enum def BatteryConfidence { enum UNTRUSTED; enum CONFIRMING; enum TRUSTED; }
  enum def LifecyclePhase {
    enum OFF; enum STANDBY; enum CHARGING; enum READY;
    enum FLYING; enum RETURNING; enum LANDING;
  }
  enum def SourceLifecyclePhase {
    enum OFF; enum STANDBY; enum CHARGING; enum READY;
    enum FLYING; enum RETURNING; enum LANDING;
  }
  enum def PublishedPhase {
    enum OFF; enum STANDBY; enum CHARGING; enum READY;
    enum FLYING; enum RETURNING; enum LANDING;
  }
  enum def AirborneRequestProposal {
    enum NO_AIRBORNE_REQUEST; enum RETURN_REQUESTED; enum LAND_REQUESTED;
  }
  enum def LifecycleCase {
    enum L01; enum L02; enum L03; enum L04; enum L05; enum L06; enum L07;
    enum L08; enum L09; enum L10; enum L11; enum L12; enum L13; enum L14;
    enum L15; enum L16; enum L17; enum L18; enum L19; enum L20; enum L21;
    enum L22; enum L23; enum L24; enum L25; enum L26;
  }
  enum def RequestResult { enum NONE; enum ACCEPTED; enum REJECTED; enum PREEMPTED; }
  enum def BatteryNotice { enum UNTRUSTED; enum CLEAR; enum LOW; enum CRITICAL; }
  enum def ChargePermission { enum DENIED; enum PERMITTED; }
  enum def FlightIntent { enum HOLD; enum LAUNCH; enum CONTINUE; enum RETURN; enum LAND; }
  enum def LaunchPermission { enum DENIED; enum PERMITTED; }
  enum def PropulsionPermission { enum DISABLED; enum ENABLED; }

  // Every record member inspected by GUMBO is an attribute, never a nested part.
  part def BatteryReportValue :> Data {
    attribute band : BatteryBand;
    attribute validity : EvidenceValidity;
  }
  part def HomeReportValue :> Data {
    attribute homeValue : HomeValue;
    attribute validity : EvidenceValidity;
  }
  part def TouchdownReportValue :> Data {
    attribute touchdownValue : TouchdownValue;
    attribute validity : EvidenceValidity;
  }
  part def AirborneClassifiedRequest :> Data {
    attribute intentCode : ExactRequestCode;
    attribute requestFamily : RequestFamily;
  }
  part def LifecycleClassifiedRequest :> Data {
    attribute intentCode : ExactRequestCode;
    attribute requestFamily : RequestFamily;
  }
  part def BatteryEvidence :> Data {
    attribute band : BatteryBand;
    attribute validBand : Base_Types::Boolean;
  }
  part def ChargerFacts :> Data {
    attribute connected : Base_Types::Boolean;
    attribute healthyConnected : Base_Types::Boolean;
    attribute chargerFault : Base_Types::Boolean;
  }
  part def ChargeEligibility :> Data {
    attribute entryEligible : Base_Types::Boolean;
    attribute retentionEligible : Base_Types::Boolean;
    attribute exitRequired : Base_Types::Boolean;
  }
  part def HomeFacts :> Data {
    attribute arrivalEstablished : Base_Types::Boolean;
    attribute evidenceValid : Base_Types::Boolean;
    attribute homeFault : Base_Types::Boolean;
  }
  part def TouchdownFacts :> Data {
    attribute touchdownEstablished : Base_Types::Boolean;
    attribute evidenceValid : Base_Types::Boolean;
    attribute touchdownFault : Base_Types::Boolean;
  }
  part def BatteryStateFacts :> Data {
    attribute band : BatteryBand;
    attribute confidence : BatteryConfidence;
    attribute usable : Base_Types::Boolean;
  }
  part def HazardProposal :> Data {
    attribute emergencyLand : Base_Types::Boolean;
    attribute forcedReturn : Base_Types::Boolean;
    attribute batteryUnusable : Base_Types::Boolean;
    attribute lowOrCritical : Base_Types::Boolean;
    attribute navigationUnusable : Base_Types::Boolean;
  }
  part def FaultVector :> Data {
    attribute batteryFault : Base_Types::Boolean;
    attribute chargerFault : Base_Types::Boolean;
    attribute navigationFault : Base_Types::Boolean;
    attribute flightControlFault : Base_Types::Boolean;
    attribute homeFault : Base_Types::Boolean;
    attribute touchdownFault : Base_Types::Boolean;
    attribute aggregateFault : Base_Types::Boolean;
  }
  part def LifecycleResolution :> Data {
    attribute winningCase : LifecycleCase;
    attribute sourceLifecycleState : SourceLifecyclePhase;
    attribute nextPhase : LifecyclePhase;
    attribute requestPresent : Base_Types::Boolean;
    attribute requestApplicable : Base_Types::Boolean;
    attribute requestCausedTransition : Base_Types::Boolean;
    attribute requestDefeatedByPriority : Base_Types::Boolean;
    attribute chargeRetentionEligible : Base_Types::Boolean;
    attribute launchReady : Base_Types::Boolean;
  }
  part def PilotStatus :> Data {
    attribute phase : PublishedPhase;
    attribute requestResult : RequestResult;
    attribute batteryNotice : BatteryNotice;
    attribute batteryFault : Base_Types::Boolean;
    attribute chargerFault : Base_Types::Boolean;
    attribute navigationFault : Base_Types::Boolean;
    attribute flightControlFault : Base_Types::Boolean;
    attribute homeFault : Base_Types::Boolean;
    attribute touchdownFault : Base_Types::Boolean;
    attribute aggregateFault : Base_Types::Boolean;
  }
  part def FlightControlOutputs :> Data {
    attribute intent : FlightIntent;
    attribute launchPermission : LaunchPermission;
  }

  part def RequestApplicabilityOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIn : DataPort { in :>> type : LifecycleRequest; }
    port semanticsToAirborne : DataPort { out :>> type : AirborneClassifiedRequest; }
    port semanticsToLifecycle : DataPort { out :>> type : LifecycleClassifiedRequest; }

                        
                
                        
                                         
                                                                   
                                                                     
                                                                    
                                                                     
             
                         
                                                
                                                                             
                                                                                   
                                                
                                                                      
                                                                         
                                                     
                                                                           
                                                                        
                                                      
                                                                            
                                                                        
                                                        
                                                                              
                                                                         
                                                       
                                                                             
                                                                         
                                                    
                                                                          
                                                                            
                                                      
                                                                            
                                                                            
                                                  
                                                                        
                                                                            
                                                  
                                                                        
                                                                           
                                                
                                                                      
                                                                           
       
  }
  part def BatteryEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : BatteryReportValue; }
    port evidenceOut : DataPort { out :>> type : BatteryEvidence; }

                        
                
                        
                                                     
                                                                                
             
                         
                                         
                                             
                                                                                   
       
  }
  part def ChargerEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : ChargerReport; }
    port factsToCharge : DataPort { out :>> type : ChargerFacts; }
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                          
                                             
                                        
                                               
                                                                    
             
                         
                                                
                                                                                 
                                                                                             
                                                                                         
                                                           
       
  }
  part def ChargeEligibilityOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port chargerIn : DataPort { in :>> type : ChargerFacts; }
    port eligibilityOut : DataPort { out :>> type : ChargeEligibility; }

                        
                
                          
                                        
                                             
                                                 
                                           
             
                         
                                                 
                                          
                                                                                                   
                                              
                                                                                                   
                                         
                                                                                                      
       
  }
  part def FlightReadinessOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port readinessOut : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                        
                                                              
             
                         
                                            
                          
                               
                                                                                          
                                                      
                                                                
       
  }
  part def HomeEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : HomeReportValue; }
    port factsToLifecycle : DataPort { out :>> type : HomeFacts; }
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                          
                                               
                                                    
                                               
                                                                    
             
                         
                                            
                                                 
                                                                                                      
                                                                                             
                                                                                           
                                                           
       
  }
  part def TouchdownEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : TouchdownReportValue; }
    port factsToLifecycle : DataPort { out :>> type : TouchdownFacts; }
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

                        
                
                          
                                                    
                                                      
                                               
                                                                         
             
                         
                                                 
                                                   
                                                          
                                                                    
                                                                                             
                                                                                                
                                                                
       
  }
  part def BatteryConfidenceOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port evidenceIn : DataPort { in :>> type : BatteryEvidence; }
    port stateToCharge : DataPort { out :>> type : BatteryStateFacts; }
    port stateToReadiness : DataPort { out :>> type : BatteryStateFacts; }
    port confidenceToFault : DataPort { out :>> type : BatteryConfidence; }
    port stateToComposition : DataPort { out :>> type : BatteryStateFacts; }
    port stateToHazard : DataPort { out :>> type : BatteryStateFacts; }

                        
           
                         
                                           
                
                                 
                        
                                                 
                                                          
                                                      
                                                                                               
                                                         
                                                                                                     
                                                            
                                                           
                                                                                                         
                                                      
                                                                                              
             
                                 
                        
                                                    
                                                 
                                                    
                                                      
                                                 
                                                       
                                                          
                                                
                                                            
                                                       
                                                                                    
                                                           
                                                             
                                                       
                     
                             
                                 
                                             
                                                                     
                             
                                     
                                                                                                  
                                                                      
                             
                                      
                                                                                                   
                                                                   
                             
                                           
                                                                                                
                                                                   
       
  }
  part def AirborneHazardProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port proposalOut : DataPort { out :>> type : HazardProposal; }

                        
                
                          
                                               
                                                                          
                                                                             
                                              
             
                         
                                            
                                                                    
                                       
                               
                                                                                             
                                                                                           
                                       
                                    
                                                                 
                                                       
                                                               
                                      
                                                        
                                                                 
                                                   
       
  }
  part def AirborneRequestProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port semanticsIn : DataPort { in :>> type : AirborneClassifiedRequest; }
    port proposalOut : DataPort { out :>> type : AirborneRequestProposal; }

                        
                
                        
                                              
                                                                     
             
                         
                                                  
                                                               
                                                                      
                                                             
                                                                    
                                                                
                                                               
                                                                         
       
  }
  part def FaultAggregationOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port confidenceIn : DataPort { in :>> type : BatteryConfidence; }
    port chargerFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    port homeFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    port touchdownFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    port faultsOut : DataPort { out :>> type : FaultVector; }

                        
                
                        
                                             
                                                                     
                                                                              
                                                                    
                                        
             
                         
                                                       
                                                                                   
                                                    
                                                                                      
                                                                                              
                                              
                                                        
                                      
                                                              
                                                                       
                                                              
       
  }
  part def LifecyclePriorityOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port semanticsIn : DataPort { in :>> type : LifecycleClassifiedRequest; }
    port chargeEligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port readinessIn : DataPort { in :>> type : Base_Types::Boolean; }
    port homeFactsIn : DataPort { in :>> type : HomeFacts; }
    port touchdownFactsIn : DataPort { in :>> type : TouchdownFacts; }
    port hazardProposalIn : DataPort { in :>> type : HazardProposal; }
    port airborneRequestIn : DataPort { in :>> type : AirborneRequestProposal; }
    port resolutionOut : DataPort { out :>> type : LifecycleResolution; }

                        
           
                         
                                   
                
                            
                        
                                               
                                            
                                                          
                                                                          
                                                         
                                             
                                                
                                                      
                                                        
                                                      
                                         
             
                            
                        
                                          
                                                                                                 
                                             
                                                                                                       
                                                                     
                                                                                                           
                                                                      
                                                                                                            
                                                                       
                                                  
                                                                                                               
                                                                                  
                                                         
                                                                  
                                                                        
                                                                   
                                                                           
                                                      
                                                                  
                                                                        
                                                                      
                                                                          
                                                                                                             
                                                                                
                                                                                                             
                                                                              
                                                                              
                                                                                                                
                                                                              
                                                   
                                                                                                                 
                                                                                                                   
                                                                                                                      
                                                                                                                       
                                                                                                                         
                                                                                                                     
                                                                                                                       
                                                                                                                        
                                                                                                                       
                                                                                                                       
                                                                                                                     
                                                     
                                                                                           
                        
                                          
                                                  
                                                                             
                                                      
                                                                                 
                                                       
                                                                                  
                                                    
                                                                               
                                                     
                                                                                
                                                        
                                                                                   
                                                      
                                                                                  
                                                 
                                                                                          
                                                   
                     
                             
                                            
                  
                                                        
                                                           
                                                          
                                             
                                                                                                            

                             
                                                   
                                                               
                                                                                       
                                                                                                            

                             
                                              
                                                            
                                                                                 
                                                                                                              

                             
                                               
                  
                                                         
                                                                                         
                                                            
                                                                                                
                                                                          
                                                                                                            

                             
                                               
                                                            
                                                                                      
                                                                           
                                                                            
                                                                                                              

                             
                                           
                                                               
                                                                                            
                                                                           
                                             
                                                                                                            

                             
                                         
                                                             
                                                  
                                                                  
                                                                                                          

                             
                                           
                                                             
                                                  
                                                                      
                                                                                                            

                             
                                                 
                  
                                                         
                                                          
                                                        
                                               
                                                                                                            

                             
                                            
                                                           
                                                                                    
                                                                                                            

                             
                                   
                                                         
                                                                   
                                                                                                            

                             
                                  
                                                         
                                                                   
                                                                                                        

                             
                                            
                                                             
                                                    
                                                                    
                                                                                                        

                             
                                      
                                                             
                                                    
                                                                     
                                                                       
                                                
                                                                                                             

                             
                                  
                                                             
                                                    
                                                                     
                                                                            
                                                       
                                                                                
                                                                                                          

                             
                                      
                                                             
                                                    
                                                                     
                                                                            
                                                       
                                                                                      
                                                                                                            

                             
                                             
                                                              
                                                    
                                                                    
                                                                                                        

                             
                                     
                                                              
                                                    
                                                                     
                                                                       
                                                 
                                                                                                            

                             
                                       
                                                              
                                                    
                                                                     
                                                                      
                                                   
                                                                                                             

                             
                                          
                                                           
                                                                                         
                                                                    
                                                                                                        

                             
                                    
                                                           
                                                                                         
                                                                     
                                                                    
                                                                                                            

                             
                                
                                                           
                                                                                         
                                                                     
                                                                     
                                                                              
                                                                                                           

                             
                                    
                                                           
                                                                                         
                                                                     
                                                                     
                                                                                    
                                                                                                          

                             
                                     
                                                            
                                                                                      
                                                                           
                                                                            
                                                                                                           

                             
                                        
                                                               
                                                                                            
                                                                           
                                                 
                                                                                                              

                             
                                      
                                                             
                                                  
                                                        
                                                                                                            
       
  }
  part def OutcomeCompositionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port faultsIn : DataPort { in :>> type : FaultVector; }
    port resolutionIn : DataPort { in :>> type : LifecycleResolution; }
    port pilotStatusOut : DataPort { out :>> type : PilotStatus; }
    port chargePermissionOut : DataPort { out :>> type : ChargePermission; }
    port flightControlOut : DataPort { out :>> type : FlightControlOutputs; }
    port propulsionPermissionOut : DataPort { out :>> type : PropulsionPermission; }

                        
                
                        
                                            
                                                      
                                                              
                                                                   
                                                                               
                                                                                        
                                                                              
                                              
                                                          
                                                        
                                                                        
                                                                   
             
                        
                                            
                                              
                                                                 
                                                                                
                                                                     
                                                                                    
                                                    
                                                                      
                                                                                    
                                                        
                                                                     
                        
                                            
                                                               
                                                                      
                                                               
                                                                                         
                                                                  
                                                               
                                               
                                                                
                                                               
                                                    
                                                                     
                        
                                           
                                                             
                                                                              
                                                             
                                                             
                                                                              
                                                               
                                                                
                                                             
                                                              
                                                           
                                                           
                                                               
                                                                
                                                              
                                                           
                        
                                        
                                                                 
                                                                
                                                     
                                                                               
                                                                                          
                                                                       
                                                            
                          
                                              
                                                                                                        
                                                                                                                
                                                                                                                  
                                                                                                            
                                                                                                              
                                                                                                                    
                                                                                                                 
                                                                
                                                                
                                                                      
                                                                            
                                                          
                                                                    
                                                                   
       
  }

  part def GovernorProcess :> Process {
    port request : DataPort { in :>> type : LifecycleRequest; }
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    port navigationReport : DataPort { in :>> type : NavigationReport; }
    port flightControlReport : DataPort { in :>> type : FlightControlReport; }
    port homeReport : DataPort { in :>> type : HomeReportValue; }
    port touchdownReport : DataPort { in :>> type : TouchdownReportValue; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    port flightControlOutputs : DataPort { out :>> type : FlightControlOutputs; }
    port propulsionPermission : DataPort { out :>> type : PropulsionPermission; }

    part requestApplicabilityOwner : RequestApplicabilityOwner;
    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    part chargerEvidenceQualifier : ChargerEvidenceQualifier;
    part chargeEligibilityOwner : ChargeEligibilityOwner;
    part flightReadinessOwner : FlightReadinessOwner;
    part homeEvidenceQualifier : HomeEvidenceQualifier;
    part touchdownEvidenceQualifier : TouchdownEvidenceQualifier;
    part batteryConfidenceOwner : BatteryConfidenceOwner;
    part airborneHazardProposalOwner : AirborneHazardProposalOwner;
    part airborneRequestProposalOwner : AirborneRequestProposalOwner;
    part faultAggregationOwner : FaultAggregationOwner;
    part lifecyclePriorityOwner : LifecyclePriorityOwner;
    part outcomeCompositionOwner : OutcomeCompositionOwner;

    // Thirty-five approved semantic interactions.
    connection int01 : PortConnection connect request to requestApplicabilityOwner.requestIn;
    connection int02 : PortConnection connect batteryReport to batteryEvidenceQualifier.reportIn;
    connection int03 : PortConnection connect chargerReport to chargerEvidenceQualifier.reportIn;
    connection int04 : PortConnection connect navigationReport to flightReadinessOwner.navigationIn;
    connection int05 : PortConnection connect flightControlReport to flightReadinessOwner.flightControlIn;
    connection int06 : PortConnection connect homeReport to homeEvidenceQualifier.reportIn;
    connection int07 : PortConnection connect touchdownReport to touchdownEvidenceQualifier.reportIn;
    connection int08 : PortConnection connect navigationReport to airborneHazardProposalOwner.navigationIn;
    connection int09 : PortConnection connect requestApplicabilityOwner.semanticsToAirborne to airborneRequestProposalOwner.semanticsIn;
    connection int10 : PortConnection connect requestApplicabilityOwner.semanticsToLifecycle to lifecyclePriorityOwner.semanticsIn;
    connection int11 : PortConnection connect batteryEvidenceQualifier.evidenceOut to batteryConfidenceOwner.evidenceIn;
    connection int12 : PortConnection connect batteryConfidenceOwner.stateToCharge to chargeEligibilityOwner.batteryIn;
    connection int13 : PortConnection connect batteryConfidenceOwner.stateToReadiness to flightReadinessOwner.batteryIn;
    connection int14 : PortConnection connect batteryConfidenceOwner.confidenceToFault to faultAggregationOwner.confidenceIn;
    connection int15 : PortConnection connect batteryConfidenceOwner.stateToComposition to outcomeCompositionOwner.batteryIn;
    connection int16 : PortConnection connect chargerEvidenceQualifier.factsToCharge to chargeEligibilityOwner.chargerIn;
    connection int17 : PortConnection connect chargerEvidenceQualifier.faultToAggregation to faultAggregationOwner.chargerFaultIn;
    connection int18 : PortConnection connect navigationReport to faultAggregationOwner.navigationIn;
    connection int19 : PortConnection connect flightControlReport to airborneHazardProposalOwner.flightControlIn;
    connection int20 : PortConnection connect flightControlReport to faultAggregationOwner.flightControlIn;
    connection int21 : PortConnection connect batteryConfidenceOwner.stateToHazard to airborneHazardProposalOwner.batteryIn;
    connection int22 : PortConnection connect chargeEligibilityOwner.eligibilityOut to lifecyclePriorityOwner.chargeEligibilityIn;
    connection int23 : PortConnection connect flightReadinessOwner.readinessOut to lifecyclePriorityOwner.readinessIn;
    connection int24 : PortConnection connect homeEvidenceQualifier.factsToLifecycle to lifecyclePriorityOwner.homeFactsIn;
    connection int25 : PortConnection connect homeEvidenceQualifier.faultToAggregation to faultAggregationOwner.homeFaultIn;
    connection int26 : PortConnection connect touchdownEvidenceQualifier.factsToLifecycle to lifecyclePriorityOwner.touchdownFactsIn;
    connection int27 : PortConnection connect touchdownEvidenceQualifier.faultToAggregation to faultAggregationOwner.touchdownFaultIn;
    connection int28 : PortConnection connect airborneHazardProposalOwner.proposalOut to lifecyclePriorityOwner.hazardProposalIn;
    connection int29 : PortConnection connect airborneRequestProposalOwner.proposalOut to lifecyclePriorityOwner.airborneRequestIn;
    connection int30 : PortConnection connect faultAggregationOwner.faultsOut to outcomeCompositionOwner.faultsIn;
    connection int31 : PortConnection connect lifecyclePriorityOwner.resolutionOut to outcomeCompositionOwner.resolutionIn;
    connection int32 : PortConnection connect outcomeCompositionOwner.pilotStatusOut to pilotStatus;
    connection int33 : PortConnection connect outcomeCompositionOwner.chargePermissionOut to chargePermission;
    connection int34 : PortConnection connect outcomeCompositionOwner.flightControlOut to flightControlOutputs;
    connection int35 : PortConnection connect outcomeCompositionOwner.propulsionPermissionOut to propulsionPermission;
  }

  part def DroneLifecycleEnergyGovernorSystem :> System {
    port request : DataPort { in :>> type : LifecycleRequest; }
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    port navigationReport : DataPort { in :>> type : NavigationReport; }
    port flightControlReport : DataPort { in :>> type : FlightControlReport; }
    port homeReport : DataPort { in :>> type : HomeReportValue; }
    port touchdownReport : DataPort { in :>> type : TouchdownReportValue; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    port flightControlOutputs : DataPort { out :>> type : FlightControlOutputs; }
    port propulsionPermission : DataPort { out :>> type : PropulsionPermission; }

    part governorProcess : GovernorProcess;

    // Exactly eleven transparent root/Process delegations.
    connection support01 : PortConnection connect request to governorProcess.request;
    connection support02 : PortConnection connect batteryReport to governorProcess.batteryReport;
    connection support03 : PortConnection connect chargerReport to governorProcess.chargerReport;
    connection support04 : PortConnection connect navigationReport to governorProcess.navigationReport;
    connection support05 : PortConnection connect flightControlReport to governorProcess.flightControlReport;
    connection support06 : PortConnection connect homeReport to governorProcess.homeReport;
    connection support07 : PortConnection connect touchdownReport to governorProcess.touchdownReport;
    connection support08 : PortConnection connect governorProcess.pilotStatus to pilotStatus;
    connection support09 : PortConnection connect governorProcess.chargePermission to chargePermission;
    connection support10 : PortConnection connect governorProcess.flightControlOutputs to flightControlOutputs;
    connection support11 : PortConnection connect governorProcess.propulsionPermission to propulsionPermission;
  }

  part droneLifecycleEnergyGovernor : DroneLifecycleEnergyGovernorSystem;
}
