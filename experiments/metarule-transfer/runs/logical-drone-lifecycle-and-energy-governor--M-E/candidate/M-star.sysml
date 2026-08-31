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
    port requestIn : DataPort { in :>> type : LifecycleRequest; }
    port semanticsToAirborne : DataPort { out :>> type : AirborneClassifiedRequest; }
    port semanticsToLifecycle : DataPort { out :>> type : LifecycleClassifiedRequest; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_REQUEST_ABSENT:
          semanticsToAirborne.intentCode == ExactRequestCode.NONE &
          semanticsToAirborne.requestFamily == RequestFamily.ABSENT &
          semanticsToLifecycle.intentCode == ExactRequestCode.NONE &
          semanticsToLifecycle.requestFamily == RequestFamily.ABSENT;

      compute
        guarantee REQUEST_FAMILY_CLASSIFICATION:
          semanticsToAirborne.intentCode == semanticsToLifecycle.intentCode &
          semanticsToAirborne.requestFamily == semanticsToLifecycle.requestFamily &
          ((requestIn == LifecycleRequest.NONE &
            semanticsToLifecycle.intentCode == ExactRequestCode.NONE &
            semanticsToLifecycle.requestFamily == RequestFamily.ABSENT) |
           (requestIn == LifecycleRequest.SWITCH_ON &
            semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_ON &
            semanticsToLifecycle.requestFamily == RequestFamily.POWER) |
           (requestIn == LifecycleRequest.SWITCH_OFF &
            semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_OFF &
            semanticsToLifecycle.requestFamily == RequestFamily.POWER) |
           (requestIn == LifecycleRequest.START_CHARGE &
            semanticsToLifecycle.intentCode == ExactRequestCode.START_CHARGE &
            semanticsToLifecycle.requestFamily == RequestFamily.CHARGE) |
           (requestIn == LifecycleRequest.STOP_CHARGE &
            semanticsToLifecycle.intentCode == ExactRequestCode.STOP_CHARGE &
            semanticsToLifecycle.requestFamily == RequestFamily.CHARGE) |
           (requestIn == LifecycleRequest.ACTIVATE &
            semanticsToLifecycle.intentCode == ExactRequestCode.ACTIVATE &
            semanticsToLifecycle.requestFamily == RequestFamily.READINESS) |
           (requestIn == LifecycleRequest.DEACTIVATE &
            semanticsToLifecycle.intentCode == ExactRequestCode.DEACTIVATE &
            semanticsToLifecycle.requestFamily == RequestFamily.READINESS) |
           (requestIn == LifecycleRequest.LAUNCH &
            semanticsToLifecycle.intentCode == ExactRequestCode.LAUNCH &
            semanticsToLifecycle.requestFamily == RequestFamily.READINESS) |
           (requestIn == LifecycleRequest.RETURN &
            semanticsToLifecycle.intentCode == ExactRequestCode.RETURN &
            semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE) |
           (requestIn == LifecycleRequest.LAND &
            semanticsToLifecycle.intentCode == ExactRequestCode.LAND &
            semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE));
    }*/
                                                    
                                                                          
                                                                            
                                                      
                                                                            
                                                                            
                                                  
                                                                        
                                                                            
                                                  
                                                                        
                                                                           
                                                
                                                                      
                                                                           
       
  }
  part def BatteryEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : BatteryReportValue; }
    port evidenceOut : DataPort { out :>> type : BatteryEvidence; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_BATTERY_EVIDENCE_UNTRUSTED:
          evidenceOut.band == BatteryBand.CRITICAL & not evidenceOut.validBand;
      compute
        guarantee VALID_BAND_SUPPRESSION:
          evidenceOut.band == reportIn.band &
          (evidenceOut.validBand == (reportIn.validity == EvidenceValidity.VALID));
    }*/
                        
                
                        
                                                     
                                                                                
             
                         
                                         
                                             
                                                                                   
       
  }
  part def ChargerEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : ChargerReport; }
    port factsToCharge : DataPort { out :>> type : ChargerFacts; }
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_CHARGER_FACTS_SAFE:
          not factsToCharge.connected & not factsToCharge.healthyConnected &
          not factsToCharge.chargerFault & not faultToAggregation;
      compute
        guarantee CHARGER_POLICY_CLASSIFICATION:
          (factsToCharge.connected == (reportIn != ChargerReport.DISCONNECTED)) &
          (factsToCharge.healthyConnected ==
            (reportIn == ChargerReport.CONNECTED_HEALTHY)) &
          (factsToCharge.chargerFault ==
            (reportIn == ChargerReport.CONNECTED_FAULTED)) &
          (faultToAggregation == factsToCharge.chargerFault);
    }*/
                        
                
                          
                                             
                                        
                                               
                                                                    
             
                         
                                                
                                                                                 
                                                                                             
                                                                                         
                                                           
       
  }
  part def ChargeEligibilityOwner :> Thread {
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port chargerIn : DataPort { in :>> type : ChargerFacts; }
    port eligibilityOut : DataPort { out :>> type : ChargeEligibility; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_CHARGE_DENIED:
          not eligibilityOut.entryEligible & not eligibilityOut.retentionEligible &
          eligibilityOut.exitRequired;
      compute
        guarantee CHARGE_ELIGIBILITY_COMBINATION:
          (eligibilityOut.entryEligible ==
            (batteryIn.usable & batteryIn.band != BatteryBand.FULL &
              chargerIn.healthyConnected)) &
          (eligibilityOut.retentionEligible == eligibilityOut.entryEligible) &
          (eligibilityOut.exitRequired == not eligibilityOut.entryEligible);
    }*/
                        
                
                          
                                        
                                             
                                                 
                                           
             
                         
                                                 
                                          
                                                                                                   
                                              
                                                                                                   
                                         
                                                                                                      
       
  }
  part def FlightReadinessOwner :> Thread {
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port readinessOut : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_FLIGHT_NOT_READY: not readinessOut;
      compute
        guarantee COMBINED_FLIGHT_READINESS:
          readinessOut == (batteryIn.usable &
            (batteryIn.band == BatteryBand.MEDIUM | batteryIn.band == BatteryBand.FULL) &
            navigationIn == NavigationReport.USABLE &
            flightControlIn == FlightControlReport.AVAILABLE);
    }*/
                        
                
                        
                                                              
             
                         
                                            
                          
                               
                                                                                          
                                                      
                                                                
       
  }
  part def HomeEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : HomeReportValue; }
    port factsToLifecycle : DataPort { out :>> type : HomeFacts; }
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HOME_NOT_ESTABLISHED:
          not factsToLifecycle.arrivalEstablished & not factsToLifecycle.evidenceValid &
          factsToLifecycle.homeFault & faultToAggregation;
      compute
        guarantee QUALIFIED_HOME_COMPLETION:
          (factsToLifecycle.arrivalEstablished ==
            (reportIn.validity == EvidenceValidity.VALID &
              reportIn.homeValue == HomeValue.REACHED)) &
          (factsToLifecycle.evidenceValid ==
            (reportIn.validity == EvidenceValidity.VALID)) &
          (factsToLifecycle.homeFault ==
            (reportIn.validity == EvidenceValidity.INVALID)) &
          (faultToAggregation == factsToLifecycle.homeFault);
    }*/
                        
                
                          
                                               
                                                    
                                               
                                                                    
             
                         
                                            
                                                 
                                                                                                      
                                                                                             
                                                                                           
                                                           
       
  }
  part def TouchdownEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : TouchdownReportValue; }
    port factsToLifecycle : DataPort { out :>> type : TouchdownFacts; }
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_TOUCHDOWN_NOT_ESTABLISHED:
          not factsToLifecycle.touchdownEstablished & not factsToLifecycle.evidenceValid &
          factsToLifecycle.touchdownFault & faultToAggregation;
      compute
        guarantee QUALIFIED_TOUCHDOWN_COMPLETION:
          (factsToLifecycle.touchdownEstablished ==
            (reportIn.validity == EvidenceValidity.VALID &
              reportIn.touchdownValue == TouchdownValue.CONFIRMED)) &
          (factsToLifecycle.evidenceValid ==
            (reportIn.validity == EvidenceValidity.VALID)) &
          (factsToLifecycle.touchdownFault ==
            (reportIn.validity == EvidenceValidity.INVALID)) &
          (faultToAggregation == factsToLifecycle.touchdownFault);
    }*/
                        
                
                          
                                                    
                                                      
                                               
                                                                         
             
                         
                                                 
                                                   
                                                          
                                                                    
                                                                                             
                                                                                                
                                                                
       
  }
  part def BatteryConfidenceOwner :> Thread {
    port evidenceIn : DataPort { in :>> type : BatteryEvidence; }
    port stateToCharge : DataPort { out :>> type : BatteryStateFacts; }
    port stateToReadiness : DataPort { out :>> type : BatteryStateFacts; }
    port confidenceToFault : DataPort { out :>> type : BatteryConfidence; }
    port stateToComposition : DataPort { out :>> type : BatteryStateFacts; }
    port stateToHazard : DataPort { out :>> type : BatteryStateFacts; }

    language "GUMBO" /*{
      state
        confidenceState: BatteryConfidence;
      initialize
        guarantee INITIAL_CONFIDENCE_AND_OUTPUTS:
          confidenceState == BatteryConfidence.UNTRUSTED &
          stateToCharge.band == BatteryBand.CRITICAL &
          stateToCharge.confidence == BatteryConfidence.UNTRUSTED &
          not stateToCharge.usable &
          stateToReadiness == stateToCharge &
          confidenceToFault == BatteryConfidence.UNTRUSTED &
          stateToComposition == stateToCharge & stateToHazard == stateToCharge;
      compute
        guarantee SAME_STEP_CONFIDENCE_PRESERVATION:
          stateToCharge.band == evidenceIn.band &
          stateToReadiness.band == evidenceIn.band &
          stateToComposition.band == evidenceIn.band &
          stateToHazard.band == evidenceIn.band &
          stateToCharge.confidence == confidenceState &
          stateToReadiness.confidence == confidenceState &
          confidenceToFault == confidenceState &
          stateToComposition.confidence == confidenceState &
          stateToHazard.confidence == confidenceState &
          (stateToCharge.usable == (confidenceState == BatteryConfidence.TRUSTED)) &
          stateToReadiness.usable == stateToCharge.usable &
          stateToComposition.usable == stateToCharge.usable &
          stateToHazard.usable == stateToCharge.usable;
        compute_cases
          case CASE_A_01_INVALID:
            assume not evidenceIn.validBand;
            guarantee confidenceState == BatteryConfidence.UNTRUSTED;
          case CASE_A_02_FIRST_VALID:
            assume evidenceIn.validBand & confidenceState == BatteryConfidence.UNTRUSTED;
            guarantee confidenceState == BatteryConfidence.CONFIRMING;
          case CASE_A_03_SECOND_VALID:
            assume evidenceIn.validBand & confidenceState == BatteryConfidence.CONFIRMING;
            guarantee confidenceState == BatteryConfidence.TRUSTED;
          case CASE_A_04_TRUSTED_RETENTION:
            assume evidenceIn.validBand & confidenceState == BatteryConfidence.TRUSTED;
            guarantee confidenceState == BatteryConfidence.TRUSTED;
    }*/
                        
           
                         
                                           
                
                                 
                        
                                                 
                                                          
                                                      
                                                                                               
                                                         
                                                                                                     
                                                            
                                                           
                                                                                                         
                                                      
                                                                                              
             
                                 
                        
                                                    
                                                 
                                                    
                                                      
                                                 
                                                       
                                                          
                                                
                                                            
                                                       
                                                                                    
                                                           
                                                             
                                                       
                     
                             
                                 
                                             
                                                                     
                             
                                     
                                                                                                  
                                                                      
                             
                                      
                                                                                                   
                                                                   
                             
                                           
                                                                                                
                                                                   
       
  }
  part def AirborneHazardProposalOwner :> Thread {
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port proposalOut : DataPort { out :>> type : HazardProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HAZARD_PROPOSAL_SAFE:
          proposalOut.emergencyLand & not proposalOut.forcedReturn &
          proposalOut.batteryUnusable & not proposalOut.lowOrCritical &
          not proposalOut.navigationUnusable;
      compute
        guarantee AIRBORNE_HAZARD_PROPOSALS:
          (proposalOut.batteryUnusable == not batteryIn.usable) &
          (proposalOut.lowOrCritical == (batteryIn.usable &
            (batteryIn.band == BatteryBand.LOW | batteryIn.band == BatteryBand.CRITICAL))) &
          (proposalOut.navigationUnusable == (navigationIn == NavigationReport.UNUSABLE)) &
          (proposalOut.emergencyLand == (not batteryIn.usable |
            (batteryIn.confidence == BatteryConfidence.TRUSTED &
              batteryIn.band == BatteryBand.CRITICAL) |
            flightControlIn == FlightControlReport.FAULTED)) &
          (proposalOut.forcedReturn == (navigationIn == NavigationReport.UNUSABLE |
            (batteryIn.confidence == BatteryConfidence.TRUSTED &
              batteryIn.band == BatteryBand.LOW)));
    }*/
                        
                
                          
                                               
                                                                          
                                                                             
                                              
             
                         
                                            
                                                                    
                                       
                               
                                                                                             
                                                                                           
                                       
                                    
                                                                 
                                                       
                                                               
                                      
                                                        
                                                                 
                                                   
       
  }
  part def AirborneRequestProposalOwner :> Thread {
    port semanticsIn : DataPort { in :>> type : AirborneClassifiedRequest; }
    port proposalOut : DataPort { out :>> type : AirborneRequestProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_NO_AIRBORNE_REQUEST:
          proposalOut == AirborneRequestProposal.NO_AIRBORNE_REQUEST;
      compute
        guarantee AIRBORNE_REQUEST_CLASSIFICATION:
          ((semanticsIn.intentCode == ExactRequestCode.RETURN &
            proposalOut == AirborneRequestProposal.RETURN_REQUESTED) |
           (semanticsIn.intentCode == ExactRequestCode.LAND &
            proposalOut == AirborneRequestProposal.LAND_REQUESTED) |
           (semanticsIn.intentCode != ExactRequestCode.RETURN &
            semanticsIn.intentCode != ExactRequestCode.LAND &
            proposalOut == AirborneRequestProposal.NO_AIRBORNE_REQUEST));
    }*/
                        
                
                        
                                              
                                                                     
             
                         
                                                  
                                                               
                                                                      
                                                             
                                                                    
                                                                
                                                               
                                                                         
       
  }
  part def FaultAggregationOwner :> Thread {
    port confidenceIn : DataPort { in :>> type : BatteryConfidence; }
    port chargerFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    port homeFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    port touchdownFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    port faultsOut : DataPort { out :>> type : FaultVector; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_BATTERY_FAULT_ONLY:
          faultsOut.batteryFault & not faultsOut.chargerFault &
          not faultsOut.navigationFault & not faultsOut.flightControlFault &
          not faultsOut.homeFault & not faultsOut.touchdownFault &
          faultsOut.aggregateFault;
      compute
        guarantee CURRENT_FAULT_VECTOR_AND_DISJUNCTION:
          (faultsOut.batteryFault == (confidenceIn != BatteryConfidence.TRUSTED)) &
          (faultsOut.chargerFault == chargerFaultIn) &
          (faultsOut.navigationFault == (navigationIn == NavigationReport.UNUSABLE)) &
          (faultsOut.flightControlFault ==
            (flightControlIn == FlightControlReport.FAULTED)) &
          (faultsOut.homeFault == homeFaultIn) &
          (faultsOut.touchdownFault == touchdownFaultIn) &
          (faultsOut.aggregateFault == (faultsOut.batteryFault | faultsOut.chargerFault |
            faultsOut.navigationFault | faultsOut.flightControlFault |
            faultsOut.homeFault | faultsOut.touchdownFault));
    }*/
                        
                
                        
                                             
                                                                     
                                                                              
                                                                    
                                        
             
                         
                                                       
                                                                                   
                                                    
                                                                                      
                                                                                              
                                              
                                                        
                                      
                                                              
                                                                       
                                                              
       
  }
  part def LifecyclePriorityOwner :> Thread {
    port semanticsIn : DataPort { in :>> type : LifecycleClassifiedRequest; }
    port chargeEligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port readinessIn : DataPort { in :>> type : Base_Types::Boolean; }
    port homeFactsIn : DataPort { in :>> type : HomeFacts; }
    port touchdownFactsIn : DataPort { in :>> type : TouchdownFacts; }
    port hazardProposalIn : DataPort { in :>> type : HazardProposal; }
    port airborneRequestIn : DataPort { in :>> type : AirborneRequestProposal; }
    port resolutionOut : DataPort { out :>> type : LifecycleResolution; }

    language "GUMBO" /*{
      state
        phaseState: LifecyclePhase;
      initialize
        guarantee INITIAL_PHASE_AND_RESOLUTION:
          phaseState == LifecyclePhase.OFF &
          resolutionOut.winningCase == LifecycleCase.L12 &
          resolutionOut.sourceLifecycleState == SourceLifecyclePhase.OFF &
          resolutionOut.nextPhase == LifecyclePhase.OFF &
          not resolutionOut.requestPresent & not resolutionOut.requestApplicable &
          not resolutionOut.requestCausedTransition &
          not resolutionOut.requestDefeatedByPriority &
          not resolutionOut.chargeRetentionEligible & not resolutionOut.launchReady;
      compute
        guarantee RESOLUTION_PRESERVATION:
          ((phaseState == LifecyclePhase.OFF &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.OFF) |
           (phaseState == LifecyclePhase.STANDBY &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.STANDBY) |
           (phaseState == LifecyclePhase.CHARGING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.CHARGING) |
           (phaseState == LifecyclePhase.READY &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.READY) |
           (phaseState == LifecyclePhase.FLYING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.FLYING) |
           (phaseState == LifecyclePhase.RETURNING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.RETURNING) |
           (phaseState == LifecyclePhase.LANDING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.LANDING)) &
          resolutionOut.nextPhase == phaseState &
          (resolutionOut.chargeRetentionEligible ==
            chargeEligibilityIn.retentionEligible) &
          (resolutionOut.launchReady == readinessIn);
        guarantee REQUEST_EFFECT_EVIDENCE:
          (resolutionOut.requestPresent ==
            (semanticsIn.requestFamily != RequestFamily.ABSENT)) &
          (resolutionOut.requestDefeatedByPriority ==
            (resolutionOut.requestApplicable & not resolutionOut.requestCausedTransition));
        compute_cases
          case CASE_L_01_AIRBORNE_EMERGENCY:
            assume (phaseState == LifecyclePhase.FLYING |
              phaseState == LifecyclePhase.RETURNING | phaseState == LifecyclePhase.LANDING) &
              hazardProposalIn.emergencyLand;
            guarantee phaseState == LifecyclePhase.LANDING &
              resolutionOut.winningCase == LifecycleCase.L01;
          case CASE_L_02_RETURNING_NAVIGATION_LOSS:
            assume phaseState == LifecyclePhase.RETURNING &
              not hazardProposalIn.emergencyLand & hazardProposalIn.navigationUnusable;
            guarantee phaseState == LifecyclePhase.LANDING &
              resolutionOut.winningCase == LifecycleCase.L02;
          case CASE_L_03_FLYING_FORCED_RETURN:
            assume phaseState == LifecyclePhase.FLYING &
              not hazardProposalIn.emergencyLand & hazardProposalIn.forcedReturn;
            guarantee phaseState == LifecyclePhase.RETURNING &
              resolutionOut.winningCase == LifecycleCase.L03;
          case CASE_L_04_AIRBORNE_LAND_REQUEST:
            assume ((phaseState == LifecyclePhase.FLYING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.forcedReturn) |
              (phaseState == LifecyclePhase.RETURNING &
                not hazardProposalIn.emergencyLand & not hazardProposalIn.navigationUnusable)) &
              airborneRequestIn == AirborneRequestProposal.LAND_REQUESTED;
            guarantee phaseState == LifecyclePhase.LANDING &
              resolutionOut.winningCase == LifecycleCase.L04;
          case CASE_L_05_FLYING_RETURN_REQUEST:
            assume phaseState == LifecyclePhase.FLYING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.forcedReturn &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              airborneRequestIn == AirborneRequestProposal.RETURN_REQUESTED;
            guarantee phaseState == LifecyclePhase.RETURNING &
              resolutionOut.winningCase == LifecycleCase.L05;
          case CASE_L_06_QUALIFIED_ARRIVAL:
            assume phaseState == LifecyclePhase.RETURNING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.navigationUnusable &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              homeFactsIn.arrivalEstablished;
            guarantee phaseState == LifecyclePhase.LANDING &
              resolutionOut.winningCase == LifecycleCase.L06;
          case CASE_L_07_TOUCHDOWN_READY:
            assume phaseState == LifecyclePhase.LANDING & not hazardProposalIn.emergencyLand &
              touchdownFactsIn.touchdownEstablished & readinessIn;
            guarantee phaseState == LifecyclePhase.READY &
              resolutionOut.winningCase == LifecycleCase.L07;
          case CASE_L_08_TOUCHDOWN_STANDBY:
            assume phaseState == LifecyclePhase.LANDING & not hazardProposalIn.emergencyLand &
              touchdownFactsIn.touchdownEstablished & not readinessIn;
            guarantee phaseState == LifecyclePhase.STANDBY &
              resolutionOut.winningCase == LifecycleCase.L08;
          case CASE_L_09_GROUND_BATTERY_FALLBACK:
            assume (phaseState == LifecyclePhase.STANDBY |
              phaseState == LifecyclePhase.CHARGING | phaseState == LifecyclePhase.READY) &
              hazardProposalIn.batteryUnusable;
            guarantee phaseState == LifecyclePhase.STANDBY &
              resolutionOut.winningCase == LifecycleCase.L09;
          case CASE_L_10_READY_LOW_FALLBACK:
            assume phaseState == LifecyclePhase.READY & not hazardProposalIn.batteryUnusable &
              hazardProposalIn.lowOrCritical;
            guarantee phaseState == LifecyclePhase.STANDBY &
              resolutionOut.winningCase == LifecycleCase.L10;
          case CASE_L_11_SWITCH_ON:
            assume phaseState == LifecyclePhase.OFF &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_ON;
            guarantee phaseState == LifecyclePhase.STANDBY &
              resolutionOut.winningCase == LifecycleCase.L11;
          case CASE_L_12_OFF_HOLD:
            assume phaseState == LifecyclePhase.OFF &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_ON;
            guarantee phaseState == LifecyclePhase.OFF &
              resolutionOut.winningCase == LifecycleCase.L12;
          case CASE_L_13_STANDBY_SWITCH_OFF:
            assume phaseState == LifecyclePhase.STANDBY & not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF;
            guarantee phaseState == LifecyclePhase.OFF &
              resolutionOut.winningCase == LifecycleCase.L13;
          case CASE_L_14_START_CHARGE:
            assume phaseState == LifecyclePhase.STANDBY & not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
              chargeEligibilityIn.entryEligible;
            guarantee phaseState == LifecyclePhase.CHARGING &
              resolutionOut.winningCase == LifecycleCase.L14;
          case CASE_L_15_ACTIVATE:
            assume phaseState == LifecyclePhase.STANDBY & not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              not (semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
                chargeEligibilityIn.entryEligible) &
              semanticsIn.intentCode == ExactRequestCode.ACTIVATE & readinessIn;
            guarantee phaseState == LifecyclePhase.READY &
              resolutionOut.winningCase == LifecycleCase.L15;
          case CASE_L_16_STANDBY_HOLD:
            assume phaseState == LifecyclePhase.STANDBY & not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              not (semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
                chargeEligibilityIn.entryEligible) &
              not (semanticsIn.intentCode == ExactRequestCode.ACTIVATE & readinessIn);
            guarantee phaseState == LifecyclePhase.STANDBY &
              resolutionOut.winningCase == LifecycleCase.L16;
          case CASE_L_17_CHARGING_SWITCH_OFF:
            assume phaseState == LifecyclePhase.CHARGING & not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF;
            guarantee phaseState == LifecyclePhase.OFF &
              resolutionOut.winningCase == LifecycleCase.L17;
          case CASE_L_18_CHARGE_EXIT:
            assume phaseState == LifecyclePhase.CHARGING & not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              (semanticsIn.intentCode == ExactRequestCode.STOP_CHARGE |
                chargeEligibilityIn.exitRequired);
            guarantee phaseState == LifecyclePhase.STANDBY &
              resolutionOut.winningCase == LifecycleCase.L18;
          case CASE_L_19_CHARGING_HOLD:
            assume phaseState == LifecyclePhase.CHARGING & not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode != ExactRequestCode.STOP_CHARGE &
              not chargeEligibilityIn.exitRequired;
            guarantee phaseState == LifecyclePhase.CHARGING &
              resolutionOut.winningCase == LifecycleCase.L19;
          case CASE_L_20_READY_SWITCH_OFF:
            assume phaseState == LifecyclePhase.READY & not hazardProposalIn.batteryUnusable &
              not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF;
            guarantee phaseState == LifecyclePhase.OFF &
              resolutionOut.winningCase == LifecycleCase.L20;
          case CASE_L_21_DEACTIVATE:
            assume phaseState == LifecyclePhase.READY & not hazardProposalIn.batteryUnusable &
              not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode == ExactRequestCode.DEACTIVATE;
            guarantee phaseState == LifecyclePhase.STANDBY &
              resolutionOut.winningCase == LifecycleCase.L21;
          case CASE_L_22_LAUNCH:
            assume phaseState == LifecyclePhase.READY & not hazardProposalIn.batteryUnusable &
              not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode != ExactRequestCode.DEACTIVATE &
              semanticsIn.intentCode == ExactRequestCode.LAUNCH & readinessIn;
            guarantee phaseState == LifecyclePhase.FLYING &
              resolutionOut.winningCase == LifecycleCase.L22;
          case CASE_L_23_READY_HOLD:
            assume phaseState == LifecyclePhase.READY & not hazardProposalIn.batteryUnusable &
              not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode != ExactRequestCode.DEACTIVATE &
              not (semanticsIn.intentCode == ExactRequestCode.LAUNCH & readinessIn);
            guarantee phaseState == LifecyclePhase.READY &
              resolutionOut.winningCase == LifecycleCase.L23;
          case CASE_L_24_FLYING_HOLD:
            assume phaseState == LifecyclePhase.FLYING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.forcedReturn &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              airborneRequestIn != AirborneRequestProposal.RETURN_REQUESTED;
            guarantee phaseState == LifecyclePhase.FLYING &
              resolutionOut.winningCase == LifecycleCase.L24;
          case CASE_L_25_RETURNING_HOLD:
            assume phaseState == LifecyclePhase.RETURNING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.navigationUnusable &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              not homeFactsIn.arrivalEstablished;
            guarantee phaseState == LifecyclePhase.RETURNING &
              resolutionOut.winningCase == LifecycleCase.L25;
          case CASE_L_26_LANDING_HOLD:
            assume phaseState == LifecyclePhase.LANDING &
              not hazardProposalIn.emergencyLand & not touchdownFactsIn.touchdownEstablished;
            guarantee phaseState == LifecyclePhase.LANDING &
              resolutionOut.winningCase == LifecycleCase.L26;
    }*/
                        
           
                         
                                   
                
                            
                        
                                               
                                            
                                                          
                                                                          
                                                         
                                             
                                                
                                                      
                                                        
                                                      
                                         
             
                            
                        
                                          
                                                                                                 
                                             
                                                                                                       
                                                                     
                                                                                                           
                                                                      
                                                                                                            
                                                                       
                                                  
                                                                                                               
                                                                                  
                                                         
                                                                  
                                                                        
                                                                   
                                                                           
                                                      
                                                                  
                                                                        
                                                                      
                                                                          
                                                                                                             
                                                                                
                                                                                                             
                                                                              
                                                                              
                                                                                                                
                                                                              
                                                   
                                                                                                                 
                                                                                                                   
                                                                                                                      
                                                                                                                       
                                                                                                                         
                                                                                                                     
                                                                                                                       
                                                                                                                        
                                                                                                                       
                                                                                                                       
                                                                                                                     
                                                     
                                                                                           
                        
                                          
                                                  
                                                                             
                                                      
                                                                                 
                                                       
                                                                                  
                                                    
                                                                               
                                                     
                                                                                
                                                        
                                                                                   
                                                      
                                                                                  
                                                 
                                                                                          
                                                   
                     
                             
                                            
                  
                                                        
                                                           
                                                          
                                             
                                                                                                            

                             
                                                   
                                                               
                                                                                       
                                                                                                            

                             
                                              
                                                            
                                                                                 
                                                                                                              

                             
                                               
                  
                                                         
                                                                                         
                                                            
                                                                                                
                                                                          
                                                                                                            

                             
                                               
                                                            
                                                                                      
                                                                           
                                                                            
                                                                                                              

                             
                                           
                                                               
                                                                                            
                                                                           
                                             
                                                                                                            

                             
                                         
                                                             
                                                  
                                                                  
                                                                                                          

                             
                                           
                                                             
                                                  
                                                                      
                                                                                                            

                             
                                                 
                  
                                                         
                                                          
                                                        
                                               
                                                                                                            

                             
                                            
                                                           
                                                                                    
                                                                                                            

                             
                                   
                                                         
                                                                   
                                                                                                            

                             
                                  
                                                         
                                                                   
                                                                                                        

                             
                                            
                                                             
                                                    
                                                                    
                                                                                                        

                             
                                      
                                                             
                                                    
                                                                     
                                                                       
                                                
                                                                                                             

                             
                                  
                                                             
                                                    
                                                                     
                                                                            
                                                       
                                                                                
                                                                                                          

                             
                                      
                                                             
                                                    
                                                                     
                                                                            
                                                       
                                                                                      
                                                                                                            

                             
                                             
                                                              
                                                    
                                                                    
                                                                                                        

                             
                                     
                                                              
                                                    
                                                                     
                                                                       
                                                 
                                                                                                            

                             
                                       
                                                              
                                                    
                                                                     
                                                                      
                                                   
                                                                                                             

                             
                                          
                                                           
                                                                                         
                                                                    
                                                                                                        

                             
                                    
                                                           
                                                                                         
                                                                     
                                                                    
                                                                                                            

                             
                                
                                                           
                                                                                         
                                                                     
                                                                     
                                                                              
                                                                                                           

                             
                                    
                                                           
                                                                                         
                                                                     
                                                                     
                                                                                    
                                                                                                          

                             
                                     
                                                            
                                                                                      
                                                                           
                                                                            
                                                                                                           

                             
                                        
                                                               
                                                                                            
                                                                           
                                                 
                                                                                                              

                             
                                      
                                                             
                                                  
                                                        
                                                                                                            
       
  }
  part def OutcomeCompositionOwner :> Thread {
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port faultsIn : DataPort { in :>> type : FaultVector; }
    port resolutionIn : DataPort { in :>> type : LifecycleResolution; }
    port pilotStatusOut : DataPort { out :>> type : PilotStatus; }
    port chargePermissionOut : DataPort { out :>> type : ChargePermission; }
    port flightControlOut : DataPort { out :>> type : FlightControlOutputs; }
    port propulsionPermissionOut : DataPort { out :>> type : PropulsionPermission; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PUBLIC_TUPLE_SAFE:
          pilotStatusOut.phase == PublishedPhase.OFF &
          pilotStatusOut.requestResult == RequestResult.NONE &
          pilotStatusOut.batteryNotice == BatteryNotice.UNTRUSTED &
          pilotStatusOut.batteryFault & not pilotStatusOut.chargerFault &
          not pilotStatusOut.navigationFault & not pilotStatusOut.flightControlFault &
          not pilotStatusOut.homeFault & not pilotStatusOut.touchdownFault &
          pilotStatusOut.aggregateFault &
          chargePermissionOut == ChargePermission.DENIED &
          flightControlOut.intent == FlightIntent.HOLD &
          flightControlOut.launchPermission == LaunchPermission.DENIED &
          propulsionPermissionOut == PropulsionPermission.DISABLED;
      compute
        guarantee REQUEST_RESULT_DERIVATION:
          ((not resolutionIn.requestPresent &
            pilotStatusOut.requestResult == RequestResult.NONE) |
           (resolutionIn.requestPresent & resolutionIn.requestCausedTransition &
            pilotStatusOut.requestResult == RequestResult.ACCEPTED) |
           (resolutionIn.requestPresent & not resolutionIn.requestCausedTransition &
            resolutionIn.requestDefeatedByPriority &
            pilotStatusOut.requestResult == RequestResult.PREEMPTED) |
           (resolutionIn.requestPresent & not resolutionIn.requestCausedTransition &
            not resolutionIn.requestDefeatedByPriority &
            pilotStatusOut.requestResult == RequestResult.REJECTED));
        guarantee BATTERY_NOTICE_DERIVATION:
          ((batteryIn.confidence != BatteryConfidence.TRUSTED &
            pilotStatusOut.batteryNotice == BatteryNotice.UNTRUSTED) |
           (batteryIn.confidence == BatteryConfidence.TRUSTED &
            (batteryIn.band == BatteryBand.MEDIUM | batteryIn.band == BatteryBand.FULL) &
            pilotStatusOut.batteryNotice == BatteryNotice.CLEAR) |
           (batteryIn.confidence == BatteryConfidence.TRUSTED &
            batteryIn.band == BatteryBand.LOW &
            pilotStatusOut.batteryNotice == BatteryNotice.LOW) |
           (batteryIn.confidence == BatteryConfidence.TRUSTED &
            batteryIn.band == BatteryBand.CRITICAL &
            pilotStatusOut.batteryNotice == BatteryNotice.CRITICAL));
        guarantee FLIGHT_INTENT_DERIVATION:
          ((resolutionIn.nextPhase == LifecyclePhase.FLYING &
            resolutionIn.sourceLifecycleState != SourceLifecyclePhase.FLYING &
            flightControlOut.intent == FlightIntent.LAUNCH) |
           (resolutionIn.nextPhase == LifecyclePhase.FLYING &
            resolutionIn.sourceLifecycleState == SourceLifecyclePhase.FLYING &
            flightControlOut.intent == FlightIntent.CONTINUE) |
           (resolutionIn.nextPhase == LifecyclePhase.RETURNING &
            flightControlOut.intent == FlightIntent.RETURN) |
           (resolutionIn.nextPhase == LifecyclePhase.LANDING &
            flightControlOut.intent == FlightIntent.LAND) |
           ((resolutionIn.nextPhase == LifecyclePhase.OFF |
             resolutionIn.nextPhase == LifecyclePhase.STANDBY |
             resolutionIn.nextPhase == LifecyclePhase.CHARGING |
             resolutionIn.nextPhase == LifecyclePhase.READY) &
            flightControlOut.intent == FlightIntent.HOLD));
        guarantee PERMISSION_DERIVATION:
          ((chargePermissionOut == ChargePermission.PERMITTED) ==
            (resolutionIn.nextPhase == LifecyclePhase.CHARGING &
              resolutionIn.chargeRetentionEligible)) &
          ((flightControlOut.launchPermission == LaunchPermission.PERMITTED) ==
            (resolutionIn.nextPhase == LifecyclePhase.READY & resolutionIn.launchReady)) &
          ((propulsionPermissionOut == PropulsionPermission.ENABLED) ==
            (flightControlOut.intent != FlightIntent.HOLD));
        guarantee ATOMIC_PHASE_AND_FAULT_COPY:
          ((resolutionIn.nextPhase == LifecyclePhase.OFF &
            pilotStatusOut.phase == PublishedPhase.OFF) |
           (resolutionIn.nextPhase == LifecyclePhase.STANDBY &
            pilotStatusOut.phase == PublishedPhase.STANDBY) |
           (resolutionIn.nextPhase == LifecyclePhase.CHARGING &
            pilotStatusOut.phase == PublishedPhase.CHARGING) |
           (resolutionIn.nextPhase == LifecyclePhase.READY &
            pilotStatusOut.phase == PublishedPhase.READY) |
           (resolutionIn.nextPhase == LifecyclePhase.FLYING &
            pilotStatusOut.phase == PublishedPhase.FLYING) |
           (resolutionIn.nextPhase == LifecyclePhase.RETURNING &
            pilotStatusOut.phase == PublishedPhase.RETURNING) |
           (resolutionIn.nextPhase == LifecyclePhase.LANDING &
            pilotStatusOut.phase == PublishedPhase.LANDING)) &
          (pilotStatusOut.batteryFault == faultsIn.batteryFault) &
          (pilotStatusOut.chargerFault == faultsIn.chargerFault) &
          (pilotStatusOut.navigationFault == faultsIn.navigationFault) &
          (pilotStatusOut.flightControlFault == faultsIn.flightControlFault) &
          (pilotStatusOut.homeFault == faultsIn.homeFault) &
          (pilotStatusOut.touchdownFault == faultsIn.touchdownFault) &
          (pilotStatusOut.aggregateFault == faultsIn.aggregateFault);
    }*/
                        
                
                        
                                            
                                                      
                                                              
                                                                   
                                                                               
                                                                                        
                                                                              
                                              
                                                          
                                                        
                                                                        
                                                                   
             
                        
                                            
                                              
                                                                 
                                                                                
                                                                     
                                                                                    
                                                    
                                                                      
                                                                                    
                                                        
                                                                     
                        
                                            
                                                               
                                                                      
                                                               
                                                                                         
                                                                  
                                                               
                                               
                                                                
                                                               
                                                    
                                                                     
                        
                                           
                                                             
                                                                              
                                                             
                                                             
                                                                              
                                                               
                                                                
                                                             
                                                              
                                                           
                                                           
                                                               
                                                                
                                                              
                                                           
                        
                                        
                                                                 
                                                                
                                                     
                                                                               
                                                                                          
                                                                       
                                                            
                          
                                              
                                                                                                        
                                                                                                                
                                                                                                                  
                                                                                                            
                                                                                                              
                                                                                                                    
                                                                                                                 
                                                                
                                                                
                                                                      
                                                                            
                                                          
                                                                    
                                                                   
       
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
