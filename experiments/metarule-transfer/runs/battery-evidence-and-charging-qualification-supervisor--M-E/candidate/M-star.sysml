package Drone_Battery_Charge_Qualification_Supervisor {

  private import HAMR::*;

  // Closed finite boundary and owner-local domains.
  enum def ServiceRequest { enum None; enum Assess; enum BeginCharge; enum EndCharge; enum AcknowledgeNotice; }
  enum def BatteryBand { enum Full; enum Nominal; enum Low; enum Critical; }
  enum def Validity { enum Valid; enum Invalid; }
  enum def ChargerReport { enum Disconnected; enum Ready; enum Faulted; enum Unknown; }
  enum def ChargeInterfaceReport { enum Idle; enum Active; enum Faulted; enum Unknown; }
  enum def LifecyclePhase { enum Off; enum Standby; enum Charging; enum Ready; enum Flying; }
  enum def ChargeAuthorization { enum Denied; enum Permitted; }
  enum def PilotNotice { enum EvidenceUntrusted; enum Critical; enum Low; enum ChargeAttention; enum RecoveryPending; enum Clear; }
  enum def FlightControlNotice { enum EvidenceUntrusted; enum Critical; enum Low; enum RecoveryPending; enum Clear; }
  enum def PilotAdvisory {
    enum ADVISORY_UNKNOWN;
    enum BATTERY_READY;
    enum CHARGE_QUALIFIED;
    enum CHARGE_BLOCKED;
    enum AIRBORNE_ATTENTION;
  }
  enum def RequestResult { enum None; enum Accepted; enum Rejected; enum Deferred; enum NoEffect; }
  enum def BatteryConfidence { enum Untrusted; enum Confirming; enum Trusted; }
  enum def AttentionState { enum Clear; enum Attention; }
  enum def ChargeSession { enum Idle; enum Eligible; enum Authorized; enum Suspended; }
  enum def SourceChargeSession { enum Idle; enum Eligible; enum Authorized; enum Suspended; }
  enum def QualifiedBand { enum Suppressed; enum Full; enum Nominal; enum Low; enum Critical; }
  enum def ChargeEligibility { enum Blocked; enum NotNeeded; enum Permitted; }
  enum def AttentionCause { enum Untrusted; enum Critical; enum Low; enum RecoveryPending; enum Clear; }
  enum def ConfidenceCase { enum CONF_01; enum CONF_02; enum CONF_03; enum CONF_04; }
  enum def AttentionCase { enum ATTN_01; enum ATTN_02; enum ATTN_03; enum ATTN_04; enum ATTN_05; enum ATTN_06; }
  enum def SessionCase {
    enum SESS_01; enum SESS_02; enum SESS_03; enum SESS_04; enum SESS_05;
    enum SESS_06; enum SESS_07; enum SESS_08; enum SESS_09; enum SESS_10;
    enum SESS_11; enum SESS_12; enum SESS_13;
  }

  // Every member below is an attribute because final GUMBO expressions inspect it.
  part def BatteryReportValue :> Data {
    attribute band : BatteryBand;
    attribute validity : Validity;
  }
  part def LifecycleReportValue :> Data {
    attribute phase : LifecyclePhase;
    attribute validity : Validity;
  }
  part def BatteryQualification :> Data {
    attribute validEvidence : Boolean;
    attribute band : QualifiedBand;
  }
  part def ChargerFacts :> Data {
    attribute chargerUsable : Boolean;
    attribute chargerConnected : Boolean;
    attribute chargerFault : Boolean;
  }
  part def InterfaceFacts :> Data {
    attribute interfaceHealthy : Boolean;
    attribute activityObserved : Boolean;
    attribute interfaceFault : Boolean;
  }
  part def LifecycleFacts :> Data {
    attribute chargeContextAllowed : Boolean;
    attribute airborneContext : Boolean;
    attribute contextValid : Boolean;
    attribute contextFault : Boolean;
  }
  part def BatteryStateFacts :> Data {
    attribute confidence : BatteryConfidence;
    attribute band : QualifiedBand;
    attribute chargeNeeded : Boolean;
    attribute batteryUsable : Boolean;
    attribute batteryFault : Boolean;
    attribute winningCase : ConfidenceCase;
  }
  part def AttentionResolution :> Data {
    attribute newAttention : AttentionState;
    attribute cause : AttentionCause;
    attribute attentionClearedNow : Boolean;
    attribute winningCase : AttentionCase;
  }
  part def FaultVector :> Data {
    attribute batteryFault : Boolean;
    attribute chargerFault : Boolean;
    attribute interfaceFault : Boolean;
    attribute contextFault : Boolean;
    attribute sessionConflict : Boolean;
  }
  part def FaultFacts :> Data {
    attribute vector : FaultVector;
    attribute aggregateFault : Boolean;
  }
  part def PublishedSession :> Data {
    attribute sessionValue : ChargeSession;
  }
  part def SessionResolution :> Data {
    attribute sourceSession : SourceChargeSession;
    attribute newSession : PublishedSession;
    attribute sessionConflict : Boolean;
    attribute winningCase : SessionCase;
  }
  part def AdvisoryFacts :> Data {
    attribute advisoryValue : PilotAdvisory;
  }
  part def PublishedRequestResult :> Data {
    attribute requestResultValue : RequestResult;
  }
  part def PublicDecisionFacts :> Data {
    attribute advisory : AdvisoryFacts;
    attribute requestResult : PublishedRequestResult;
    attribute newSession : PublishedSession;
  }
  part def NotificationFacts :> Data {
    attribute pilotNotice : PilotNotice;
    attribute flightControlNotice : FlightControlNotice;
  }
  part def PilotStatus :> Data {
    attribute statusAdvisory : AdvisoryFacts;
    attribute statusSession : PublishedSession;
    attribute statusRequestResult : PublishedRequestResult;
    attribute faults : FaultVector;
    attribute aggregateFault : Boolean;
  }

  part def CurrentRequestResultDecisionOwner :> Thread {
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port attentionClearedIn : DataPort { in :>> type : Boolean; }
    port advisoryIn : DataPort { in :>> type : AdvisoryFacts; }
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    port publicFactsOut : DataPort { out :>> type : PublicDecisionFacts; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PUBLIC_REQUEST_RESULT:
          publicFactsOut.requestResult.requestResultValue == RequestResult.None;
        guarantee INITIAL_PUBLIC_ADVISORY:
          publicFactsOut.advisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
        guarantee INITIAL_PUBLIC_SESSION:
          publicFactsOut.newSession.sessionValue == ChargeSession.Idle;
      compute
        guarantee PUBLIC_DECISION_COPIES:
          publicFactsOut.advisory.advisoryValue == advisoryIn.advisoryValue &
          publicFactsOut.newSession.sessionValue == sessionIn.newSession.sessionValue;
        compute_cases
          case REQUEST_NONE:
            assume requestIn == ServiceRequest.None;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.None;
          case ASSESS_DEFERRED:
            assume requestIn == ServiceRequest.Assess &
              advisoryIn.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred;
          case ASSESS_ACCEPTED:
            assume requestIn == ServiceRequest.Assess &
              advisoryIn.advisoryValue != PilotAdvisory.ADVISORY_UNKNOWN;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case BEGIN_ACCEPTED:
            assume requestIn == ServiceRequest.BeginCharge &
              (sessionIn.winningCase == SessionCase.SESS_07 | sessionIn.winningCase == SessionCase.SESS_09);
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case BEGIN_DEFERRED:
            assume requestIn == ServiceRequest.BeginCharge &
              (sessionIn.winningCase == SessionCase.SESS_01 | sessionIn.winningCase == SessionCase.SESS_02 |
               sessionIn.winningCase == SessionCase.SESS_08);
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred;
          case BEGIN_NO_EFFECT:
            assume requestIn == ServiceRequest.BeginCharge & sessionIn.winningCase == SessionCase.SESS_06;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
          case BEGIN_REJECTED:
            assume requestIn == ServiceRequest.BeginCharge &
              sessionIn.winningCase != SessionCase.SESS_01 & sessionIn.winningCase != SessionCase.SESS_02 &
              sessionIn.winningCase != SessionCase.SESS_06 & sessionIn.winningCase != SessionCase.SESS_07 &
              sessionIn.winningCase != SessionCase.SESS_08 & sessionIn.winningCase != SessionCase.SESS_09;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Rejected;
          case END_ACCEPTED:
            assume requestIn == ServiceRequest.EndCharge &
              (sessionIn.winningCase == SessionCase.SESS_03 | sessionIn.winningCase == SessionCase.SESS_04);
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case END_NO_EFFECT:
            assume requestIn == ServiceRequest.EndCharge &
              sessionIn.winningCase != SessionCase.SESS_03 & sessionIn.winningCase != SessionCase.SESS_04;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
          case ACKNOWLEDGEMENT_ACCEPTED:
            assume requestIn == ServiceRequest.AcknowledgeNotice & attentionClearedIn;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case ACKNOWLEDGEMENT_NO_EFFECT:
            assume requestIn == ServiceRequest.AcknowledgeNotice & not attentionClearedIn;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
    }*/
  }
  part def BatteryEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : BatteryReportValue; }
    port qualificationOut : DataPort { out :>> type : BatteryQualification; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_BATTERY_QUALIFICATION:
          not qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Suppressed;
      compute
        compute_cases
          case INVALID_BATTERY_REPORT:
            assume reportIn.validity == Validity.Invalid;
            guarantee not qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Suppressed;
          case VALID_FULL_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Full;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Full;
          case VALID_NOMINAL_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Nominal;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Nominal;
          case VALID_LOW_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Low;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Low;
          case VALID_CRITICAL_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Critical;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Critical;
    }*/
  }
  part def ChargerEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : ChargerReport; }
    port factsToEligibility : DataPort { out :>> type : ChargerFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_CHARGER_FACTS:
          not factsToEligibility.chargerUsable & not factsToEligibility.chargerConnected &
          factsToEligibility.chargerFault & faultToAggregation;
      compute
        guarantee CHARGER_FAULT_PUBLICATION:
          faultToAggregation == factsToEligibility.chargerFault;
        compute_cases
          case CHARGER_DISCONNECTED:
            assume reportIn == ChargerReport.Disconnected;
            guarantee not factsToEligibility.chargerUsable & not factsToEligibility.chargerConnected &
              not factsToEligibility.chargerFault;
          case CHARGER_READY:
            assume reportIn == ChargerReport.Ready;
            guarantee factsToEligibility.chargerUsable & factsToEligibility.chargerConnected &
              not factsToEligibility.chargerFault;
          case CHARGER_FAULTED:
            assume reportIn == ChargerReport.Faulted;
            guarantee not factsToEligibility.chargerUsable & factsToEligibility.chargerConnected &
              factsToEligibility.chargerFault;
          case CHARGER_UNKNOWN:
            assume reportIn == ChargerReport.Unknown;
            guarantee not factsToEligibility.chargerUsable & not factsToEligibility.chargerConnected &
              factsToEligibility.chargerFault;
    }*/
  }
  part def ChargingInterfaceEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : ChargeInterfaceReport; }
    port factsToEligibility : DataPort { out :>> type : InterfaceFacts; }
    port factsToSession : DataPort { out :>> type : InterfaceFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_INTERFACE_FACTS:
          not factsToEligibility.interfaceHealthy & not factsToEligibility.activityObserved &
          factsToEligibility.interfaceFault & not factsToSession.interfaceHealthy &
          not factsToSession.activityObserved & factsToSession.interfaceFault & faultToAggregation;
      compute
        guarantee INTERFACE_PUBLICATIONS_AGREE:
          factsToEligibility.interfaceHealthy == factsToSession.interfaceHealthy &
          factsToEligibility.activityObserved == factsToSession.activityObserved &
          factsToEligibility.interfaceFault == factsToSession.interfaceFault &
          faultToAggregation == factsToEligibility.interfaceFault;
        compute_cases
          case INTERFACE_IDLE:
            assume reportIn == ChargeInterfaceReport.Idle;
            guarantee factsToEligibility.interfaceHealthy & not factsToEligibility.activityObserved &
              not factsToEligibility.interfaceFault;
          case INTERFACE_ACTIVE:
            assume reportIn == ChargeInterfaceReport.Active;
            guarantee factsToEligibility.interfaceHealthy & factsToEligibility.activityObserved &
              not factsToEligibility.interfaceFault;
          case INTERFACE_FAULTED:
            assume reportIn == ChargeInterfaceReport.Faulted;
            guarantee not factsToEligibility.interfaceHealthy & not factsToEligibility.activityObserved &
              factsToEligibility.interfaceFault;
          case INTERFACE_UNKNOWN:
            assume reportIn == ChargeInterfaceReport.Unknown;
            guarantee not factsToEligibility.interfaceHealthy & not factsToEligibility.activityObserved &
              factsToEligibility.interfaceFault;
    }*/
  }
  part def LifecycleContextApplicabilityOwner :> Thread {
    port reportIn : DataPort { in :>> type : LifecycleReportValue; }
    port factsToEligibility : DataPort { out :>> type : LifecycleFacts; }
    port factsToAdvisory : DataPort { out :>> type : LifecycleFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_LIFECYCLE_FACTS:
          not factsToEligibility.chargeContextAllowed & not factsToEligibility.airborneContext &
          not factsToEligibility.contextValid & factsToEligibility.contextFault &
          not factsToAdvisory.chargeContextAllowed & not factsToAdvisory.airborneContext &
          not factsToAdvisory.contextValid & factsToAdvisory.contextFault & faultToAggregation;
      compute
        guarantee LIFECYCLE_PUBLICATIONS_AGREE:
          factsToEligibility.chargeContextAllowed == factsToAdvisory.chargeContextAllowed &
          factsToEligibility.airborneContext == factsToAdvisory.airborneContext &
          factsToEligibility.contextValid == factsToAdvisory.contextValid &
          factsToEligibility.contextFault == factsToAdvisory.contextFault &
          faultToAggregation == factsToEligibility.contextFault;
        guarantee LIFECYCLE_VALIDITY:
          factsToEligibility.contextValid == (reportIn.validity == Validity.Valid) &
          factsToEligibility.contextFault == (reportIn.validity == Validity.Invalid);
        guarantee CHARGING_CONTEXT_APPLICABILITY:
          factsToEligibility.chargeContextAllowed ==
            (reportIn.validity == Validity.Valid &
             (reportIn.phase == LifecyclePhase.Off | reportIn.phase == LifecyclePhase.Standby |
              reportIn.phase == LifecyclePhase.Charging));
        guarantee AIRBORNE_CONTEXT_APPLICABILITY:
          factsToEligibility.airborneContext ==
            (reportIn.validity == Validity.Valid & reportIn.phase == LifecyclePhase.Flying);
    }*/
  }
  part def BatteryConfidenceStateOwner :> Thread {
    port qualificationIn : DataPort { in :>> type : BatteryQualification; }
    port stateToEligibility : DataPort { out :>> type : BatteryStateFacts; }
    port stateToAttention : DataPort { out :>> type : BatteryStateFacts; }
    port stateToAdvisory : DataPort { out :>> type : BatteryStateFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }
    language "GUMBO" /*{
      state
        confidenceState: BatteryConfidence;
      initialize
        guarantee INITIAL_CONFIDENCE:
          confidenceState == BatteryConfidence.Untrusted &
          stateToEligibility.confidence == BatteryConfidence.Untrusted &
          stateToEligibility.band == QualifiedBand.Suppressed &
          not stateToEligibility.chargeNeeded & not stateToEligibility.batteryUsable &
          stateToEligibility.batteryFault & stateToEligibility.winningCase == ConfidenceCase.CONF_01 &
          stateToAttention.confidence == BatteryConfidence.Untrusted &
          stateToAttention.band == QualifiedBand.Suppressed & not stateToAttention.chargeNeeded &
          not stateToAttention.batteryUsable & stateToAttention.batteryFault &
          stateToAttention.winningCase == ConfidenceCase.CONF_01 &
          stateToAdvisory.confidence == BatteryConfidence.Untrusted &
          stateToAdvisory.band == QualifiedBand.Suppressed & not stateToAdvisory.chargeNeeded &
          not stateToAdvisory.batteryUsable & stateToAdvisory.batteryFault &
          stateToAdvisory.winningCase == ConfidenceCase.CONF_01 & faultToAggregation;
      compute
        guarantee CONFIDENCE_PUBLICATIONS_AGREE:
          stateToEligibility.confidence == confidenceState &
          stateToAttention.confidence == stateToEligibility.confidence &
          stateToAttention.band == stateToEligibility.band &
          stateToAttention.chargeNeeded == stateToEligibility.chargeNeeded &
          stateToAttention.batteryUsable == stateToEligibility.batteryUsable &
          stateToAttention.batteryFault == stateToEligibility.batteryFault &
          stateToAttention.winningCase == stateToEligibility.winningCase &
          stateToAdvisory.confidence == stateToEligibility.confidence &
          stateToAdvisory.band == stateToEligibility.band &
          stateToAdvisory.chargeNeeded == stateToEligibility.chargeNeeded &
          stateToAdvisory.batteryUsable == stateToEligibility.batteryUsable &
          stateToAdvisory.batteryFault == stateToEligibility.batteryFault &
          stateToAdvisory.winningCase == stateToEligibility.winningCase &
          faultToAggregation == stateToEligibility.batteryFault;
        guarantee CONFIDENCE_DERIVED_FACTS:
          stateToEligibility.band == qualificationIn.band &
          stateToEligibility.batteryUsable == (confidenceState == BatteryConfidence.Trusted) &
          stateToEligibility.batteryFault == not qualificationIn.validEvidence &
          stateToEligibility.chargeNeeded ==
            (confidenceState == BatteryConfidence.Trusted & qualificationIn.band != QualifiedBand.Full);
        compute_cases
          case CONF_01_INVALID:
            assume not qualificationIn.validEvidence;
            guarantee confidenceState == BatteryConfidence.Untrusted &
              stateToEligibility.winningCase == ConfidenceCase.CONF_01;
          case CONF_02_FIRST_VALID:
            assume qualificationIn.validEvidence & confidenceState == BatteryConfidence.Untrusted;
            guarantee confidenceState == BatteryConfidence.Confirming &
              stateToEligibility.winningCase == ConfidenceCase.CONF_02;
          case CONF_03_SECOND_VALID:
            assume qualificationIn.validEvidence & confidenceState == BatteryConfidence.Confirming;
            guarantee confidenceState == BatteryConfidence.Trusted &
              stateToEligibility.winningCase == ConfidenceCase.CONF_03;
          case CONF_04_RETAIN_TRUST:
            assume qualificationIn.validEvidence & confidenceState == BatteryConfidence.Trusted;
            guarantee confidenceState == BatteryConfidence.Trusted &
              stateToEligibility.winningCase == ConfidenceCase.CONF_04;
    }*/
                                                                           
                                                                         
                                                                
                        
                                                                                                                               
                                                           
                                                                                              
                                                                                  
                                            
                                                                                                        
                     
                                
                                                                                
                                                     
                                                                      
                                                                               
                                
                                                                                           
                                                                                                      
                                                                       
                                                                               
                                
                                                                                                       
                                                                                                       
                                                                    
                                                                               
                                
                                                                     
                                                                                                    
                                                                    
                                                                               
       
  }
  part def ChargeEligibilityDecisionOwner :> Thread {
    port chargerIn : DataPort { in :>> type : ChargerFacts; }
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port eligibilityToAdvisory : DataPort { out :>> type : ChargeEligibility; }
    port eligibilityToSession : DataPort { out :>> type : ChargeEligibility; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ELIGIBILITY:
          eligibilityToAdvisory == ChargeEligibility.Blocked &
          eligibilityToSession == ChargeEligibility.Blocked;
      compute
        guarantee ELIGIBILITY_PUBLICATIONS_AGREE:
          eligibilityToAdvisory == eligibilityToSession;
        compute_cases
          case ELIGIBILITY_BLOCKED:
            assume batteryIn.confidence != BatteryConfidence.Trusted | not chargerIn.chargerUsable |
              not interfaceIn.interfaceHealthy | not lifecycleIn.chargeContextAllowed;
            guarantee eligibilityToAdvisory == ChargeEligibility.Blocked;
          case ELIGIBILITY_NOT_NEEDED:
            assume batteryIn.confidence == BatteryConfidence.Trusted & chargerIn.chargerUsable &
              interfaceIn.interfaceHealthy & lifecycleIn.chargeContextAllowed &
              batteryIn.band == QualifiedBand.Full;
            guarantee eligibilityToAdvisory == ChargeEligibility.NotNeeded;
          case ELIGIBILITY_PERMITTED:
            assume batteryIn.confidence == BatteryConfidence.Trusted & chargerIn.chargerUsable &
              interfaceIn.interfaceHealthy & lifecycleIn.chargeContextAllowed &
              batteryIn.band != QualifiedBand.Full;
            guarantee eligibilityToAdvisory == ChargeEligibility.Permitted;
    }*/
  }
  part def AttentionLatchStateOwner :> Thread {
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port resolutionToNotification : DataPort { out :>> type : AttentionResolution; }
    port clearedToRequestResult : DataPort { out :>> type : Boolean; }
    language "GUMBO" /*{
      state
        attentionState: AttentionState;
      initialize
        guarantee INITIAL_ATTENTION:
          attentionState == AttentionState.Attention &
          resolutionToNotification.newAttention == AttentionState.Attention &
          resolutionToNotification.cause == AttentionCause.Untrusted &
          not resolutionToNotification.attentionClearedNow &
          resolutionToNotification.winningCase == AttentionCase.ATTN_01 &
          not clearedToRequestResult;
      compute
        guarantee ATTENTION_PUBLICATION:
          resolutionToNotification.newAttention == attentionState &
          clearedToRequestResult == resolutionToNotification.attentionClearedNow;
        compute_cases
          case ATTN_01_UNTRUSTED:
            assume batteryIn.confidence != BatteryConfidence.Trusted;
            guarantee attentionState == AttentionState.Attention &
              resolutionToNotification.cause == AttentionCause.Untrusted &
              not resolutionToNotification.attentionClearedNow &
              resolutionToNotification.winningCase == AttentionCase.ATTN_01;
          case ATTN_02_CRITICAL:
            assume batteryIn.confidence == BatteryConfidence.Trusted &
              batteryIn.band == QualifiedBand.Critical;
            guarantee attentionState == AttentionState.Attention &
              resolutionToNotification.cause == AttentionCause.Critical &
              not resolutionToNotification.attentionClearedNow &
              resolutionToNotification.winningCase == AttentionCase.ATTN_02;
          case ATTN_03_LOW:
            assume batteryIn.confidence == BatteryConfidence.Trusted & batteryIn.band == QualifiedBand.Low;
            guarantee attentionState == AttentionState.Attention &
              resolutionToNotification.cause == AttentionCause.Low &
              not resolutionToNotification.attentionClearedNow &
              resolutionToNotification.winningCase == AttentionCase.ATTN_03;
          case ATTN_04_FRESH_ACKNOWLEDGEMENT:
            assume batteryIn.confidence == BatteryConfidence.Trusted &
              batteryIn.band != QualifiedBand.Critical & batteryIn.band != QualifiedBand.Low &
              attentionState == AttentionState.Attention &
              requestIn == ServiceRequest.AcknowledgeNotice;
            guarantee attentionState == AttentionState.Clear &
              resolutionToNotification.cause == AttentionCause.Clear &
              resolutionToNotification.attentionClearedNow &
              resolutionToNotification.winningCase == AttentionCase.ATTN_04;
          case ATTN_05_RECOVERY_PENDING:
            assume batteryIn.confidence == BatteryConfidence.Trusted &
              batteryIn.band != QualifiedBand.Critical & batteryIn.band != QualifiedBand.Low &
              attentionState == AttentionState.Attention &
              requestIn != ServiceRequest.AcknowledgeNotice;
            guarantee attentionState == AttentionState.Attention &
              resolutionToNotification.cause == AttentionCause.RecoveryPending &
              not resolutionToNotification.attentionClearedNow &
              resolutionToNotification.winningCase == AttentionCase.ATTN_05;
          case ATTN_06_RETAIN_CLEAR:
            assume batteryIn.confidence == BatteryConfidence.Trusted &
              batteryIn.band != QualifiedBand.Critical & batteryIn.band != QualifiedBand.Low &
              attentionState == AttentionState.Clear;
            guarantee attentionState == AttentionState.Clear &
              resolutionToNotification.cause == AttentionCause.Clear &
              not resolutionToNotification.attentionClearedNow &
              resolutionToNotification.winningCase == AttentionCase.ATTN_06;
    }*/
                                                                 
                                                                  
                                                                                        
                                                                        
                                                                                    
                                
                                                                             
                                                                      
                                                             
                                                        
                                                              
                                                              
                                                                              
                                                                        
                                                                                    
       
  }
  part def BatteryAdvisoryDecisionOwner :> Thread {
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port advisoryToRequestResult : DataPort { out :>> type : AdvisoryFacts; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ADVISORY:
          advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
      compute
        compute_cases
          case ADVISORY_UNKNOWN:
            assume batteryIn.confidence != BatteryConfidence.Trusted | not lifecycleIn.contextValid;
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
          case ADVISORY_AIRBORNE_ATTENTION:
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
              lifecycleIn.airborneContext &
              (batteryIn.band == QualifiedBand.Low | batteryIn.band == QualifiedBand.Critical);
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.AIRBORNE_ATTENTION;
          case ADVISORY_BATTERY_READY:
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
              (batteryIn.band == QualifiedBand.Full | batteryIn.band == QualifiedBand.Nominal);
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.BATTERY_READY;
          case ADVISORY_CHARGE_QUALIFIED:
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
              not lifecycleIn.airborneContext &
              (batteryIn.band == QualifiedBand.Low | batteryIn.band == QualifiedBand.Critical) &
              eligibilityIn == ChargeEligibility.Permitted;
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_QUALIFIED;
          case ADVISORY_CHARGE_BLOCKED:
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
              not lifecycleIn.airborneContext &
              (batteryIn.band == QualifiedBand.Low | batteryIn.band == QualifiedBand.Critical) &
              eligibilityIn != ChargeEligibility.Permitted;
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_BLOCKED;
    }*/

                        
                
                        
                                                                              
                                                                                  
             
                     
                              
                                                                                                  
                                                                                                    
                                                                                              
                              
                                                                                                                      
                                                                                                 
                                                
                                                                                                    
                                                                                                
                              
                                                                                               
                                                                                                 
                                                                                                    
                                                                                           
                              
                                                                                                                    
                                                                                                 
                                                    
                                                                                                     
                                                                
                                                                                              
                              
                                                                                                                       
                                                                                                 
                                                    
                                                                                                     
                                                                
                                                                                            
       
  }
  part def FaultAggregationOwner :> Thread {
    port chargerFaultIn : DataPort { in :>> type : Boolean; }
    port interfaceFaultIn : DataPort { in :>> type : Boolean; }
    port contextFaultIn : DataPort { in :>> type : Boolean; }
    port batteryFaultIn : DataPort { in :>> type : Boolean; }
    port sessionConflictIn : DataPort { in :>> type : Boolean; }
    port faultsToNotification : DataPort { out :>> type : FaultFacts; }
    port faultsToComposition : DataPort { out :>> type : FaultFacts; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_FAULT_FACTS:
          faultsToNotification.vector.batteryFault & faultsToNotification.vector.chargerFault &
          faultsToNotification.vector.interfaceFault & faultsToNotification.vector.contextFault &
          not faultsToNotification.vector.sessionConflict & faultsToNotification.aggregateFault &
          faultsToComposition.vector.batteryFault & faultsToComposition.vector.chargerFault &
          faultsToComposition.vector.interfaceFault & faultsToComposition.vector.contextFault &
          not faultsToComposition.vector.sessionConflict & faultsToComposition.aggregateFault;
      compute
        guarantee EXACT_FAULT_VECTOR:
          faultsToNotification.vector.batteryFault == batteryFaultIn &
          faultsToNotification.vector.chargerFault == chargerFaultIn &
          faultsToNotification.vector.interfaceFault == interfaceFaultIn &
          faultsToNotification.vector.contextFault == contextFaultIn &
          faultsToNotification.vector.sessionConflict == sessionConflictIn;
        guarantee EXACT_FAULT_DISJUNCTION:
          faultsToNotification.aggregateFault ==
            (batteryFaultIn | chargerFaultIn | interfaceFaultIn | contextFaultIn | sessionConflictIn);
        guarantee FAULT_PUBLICATIONS_AGREE:
          faultsToComposition.vector.batteryFault == faultsToNotification.vector.batteryFault &
          faultsToComposition.vector.chargerFault == faultsToNotification.vector.chargerFault &
          faultsToComposition.vector.interfaceFault == faultsToNotification.vector.interfaceFault &
          faultsToComposition.vector.contextFault == faultsToNotification.vector.contextFault &
          faultsToComposition.vector.sessionConflict == faultsToNotification.vector.sessionConflict &
          faultsToComposition.aggregateFault == faultsToNotification.aggregateFault;
    }*/

                        
                
                        
                                                                                                                                   
                                                    
                                                    
                                                      
                                                    
                                                           
                                               
                                                   
                                                   
                                                     
                                                   
                                                          
                                             
             
                          
                                                                                             
                                                                      
                                                                      
                                                                          
                                                                      
                                                                           
                          
                                                                                                      
                                                
                                                                                                      
                         
                                                                                                                    
                                                                                               
                                                                                               
                                                                                                   
                                                                                               
                                                                                                     
                                                                                    
       
  }
  part def ChargeSessionPriorityStateOwner :> Thread {
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port conflictToAggregation : DataPort { out :>> type : Boolean; }
    port resolutionToNotification : DataPort { out :>> type : SessionResolution; }
    language "GUMBO" /*{
      state
        sessionState: SourceChargeSession;
      initialize
        guarantee INITIAL_SESSION:
          sessionState == SourceChargeSession.Idle & not conflictToAggregation &
          resolutionToNotification.sourceSession == SourceChargeSession.Idle &
          resolutionToNotification.newSession.sessionValue == ChargeSession.Idle &
          not resolutionToNotification.sessionConflict &
          resolutionToNotification.winningCase == SessionCase.SESS_13;
      compute
        guarantee SESSION_PUBLICATION:
          ((sessionState == SourceChargeSession.Idle & resolutionToNotification.newSession.sessionValue == ChargeSession.Idle) |
           (sessionState == SourceChargeSession.Eligible & resolutionToNotification.newSession.sessionValue == ChargeSession.Eligible) |
           (sessionState == SourceChargeSession.Authorized & resolutionToNotification.newSession.sessionValue == ChargeSession.Authorized) |
           (sessionState == SourceChargeSession.Suspended & resolutionToNotification.newSession.sessionValue == ChargeSession.Suspended)) &
          (resolutionToNotification.sessionConflict ==
            (interfaceIn.activityObserved & sessionState != SourceChargeSession.Authorized)) &
          conflictToAggregation == resolutionToNotification.sessionConflict;
        guarantee SOURCE_SESSION_MAPPING:
          ((sessionState == SourceChargeSession.Idle & resolutionToNotification.sourceSession == SourceChargeSession.Idle) |
           (sessionState == SourceChargeSession.Eligible & resolutionToNotification.sourceSession == SourceChargeSession.Eligible) |
           (sessionState == SourceChargeSession.Authorized & resolutionToNotification.sourceSession == SourceChargeSession.Authorized) |
           (sessionState == SourceChargeSession.Suspended & resolutionToNotification.sourceSession == SourceChargeSession.Suspended));
        compute_cases
          case SESS_01_UNEXPECTED_ACTIVITY:
            assume interfaceIn.activityObserved & sessionState != SourceChargeSession.Authorized;
            guarantee sessionState == SourceChargeSession.Suspended & resolutionToNotification.winningCase == SessionCase.SESS_01;
          case SESS_02_BLOCKED:
            assume not (interfaceIn.activityObserved & sessionState != SourceChargeSession.Authorized) & eligibilityIn == ChargeEligibility.Blocked;
            guarantee sessionState == SourceChargeSession.Suspended & resolutionToNotification.winningCase == SessionCase.SESS_02;
          case SESS_03_END_TO_ELIGIBLE:
            assume not (interfaceIn.activityObserved & sessionState != SourceChargeSession.Authorized) & eligibilityIn == ChargeEligibility.Permitted &
              (sessionState == SourceChargeSession.Authorized | sessionState == SourceChargeSession.Suspended) & requestIn == ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Eligible & resolutionToNotification.winningCase == SessionCase.SESS_03;
          case SESS_04_END_TO_IDLE:
            assume not (interfaceIn.activityObserved & sessionState != SourceChargeSession.Authorized) & eligibilityIn == ChargeEligibility.NotNeeded &
              (sessionState == SourceChargeSession.Authorized | sessionState == SourceChargeSession.Suspended) & requestIn == ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Idle & resolutionToNotification.winningCase == SessionCase.SESS_04;
          case SESS_05_AUTOMATIC_WITHDRAWAL:
            assume sessionState == SourceChargeSession.Authorized & eligibilityIn == ChargeEligibility.NotNeeded & requestIn != ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Idle & resolutionToNotification.winningCase == SessionCase.SESS_05;
          case SESS_06_RETAIN_AUTHORIZED:
            assume sessionState == SourceChargeSession.Authorized & eligibilityIn == ChargeEligibility.Permitted & requestIn != ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Authorized & resolutionToNotification.winningCase == SessionCase.SESS_06;
          case SESS_07_FRESH_SUSPENDED_RECOVERY:
            assume not interfaceIn.activityObserved & sessionState == SourceChargeSession.Suspended & eligibilityIn == ChargeEligibility.Permitted & requestIn == ServiceRequest.BeginCharge;
            guarantee sessionState == SourceChargeSession.Authorized & resolutionToNotification.winningCase == SessionCase.SESS_07;
          case SESS_08_RETAIN_SUSPENDED:
            assume not interfaceIn.activityObserved & sessionState == SourceChargeSession.Suspended & eligibilityIn != ChargeEligibility.Blocked &
              not ((requestIn == ServiceRequest.EndCharge & eligibilityIn == ChargeEligibility.Permitted) |
                (requestIn == ServiceRequest.EndCharge & eligibilityIn == ChargeEligibility.NotNeeded) |
                (requestIn == ServiceRequest.BeginCharge & eligibilityIn == ChargeEligibility.Permitted));
            guarantee sessionState == SourceChargeSession.Suspended & resolutionToNotification.winningCase == SessionCase.SESS_08;
          case SESS_09_FRESH_ELIGIBLE_BEGIN:
            assume not interfaceIn.activityObserved & sessionState == SourceChargeSession.Eligible & eligibilityIn == ChargeEligibility.Permitted & requestIn == ServiceRequest.BeginCharge;
            guarantee sessionState == SourceChargeSession.Authorized & resolutionToNotification.winningCase == SessionCase.SESS_09;
          case SESS_10_ELIGIBLE_NOT_NEEDED:
            assume not interfaceIn.activityObserved & sessionState == SourceChargeSession.Eligible & eligibilityIn == ChargeEligibility.NotNeeded;
            guarantee sessionState == SourceChargeSession.Idle & resolutionToNotification.winningCase == SessionCase.SESS_10;
          case SESS_11_RETAIN_ELIGIBLE:
            assume not interfaceIn.activityObserved & sessionState == SourceChargeSession.Eligible & eligibilityIn == ChargeEligibility.Permitted & requestIn != ServiceRequest.BeginCharge;
            guarantee sessionState == SourceChargeSession.Eligible & resolutionToNotification.winningCase == SessionCase.SESS_11;
          case SESS_12_IDLE_TO_ELIGIBLE:
            assume not interfaceIn.activityObserved & sessionState == SourceChargeSession.Idle & eligibilityIn == ChargeEligibility.Permitted;
            guarantee sessionState == SourceChargeSession.Eligible & resolutionToNotification.winningCase == SessionCase.SESS_12;
          case SESS_13_RETAIN_IDLE:
            assume not interfaceIn.activityObserved & sessionState == SourceChargeSession.Idle & eligibilityIn == ChargeEligibility.NotNeeded;
            guarantee sessionState == SourceChargeSession.Idle & resolutionToNotification.winningCase == SessionCase.SESS_13;
    }*/

                        
           
                          
                                          
                
                              
                        
                                                                                                     
                                                    
                                     
                                                                              
                                                                                  
                                                        
                                                                      
             
                              
                         
                                                                                                  
                                                      
                                                                                     
                                                          
                                                                                         
                                                            
                                                                                           
                                                           
                                                                                           
                                                     
                                                                                                 
                                                                            
                         
                                                                                                                 
                                                          
                                                                                 
                                                              
                                                                                     
                                                                
                                                                                       
                                                               
                                                                                      
                     
                                
                                                                                      
                                                                                                     
                                                                     
                                                                                  
                                
                                                                                               
                                                                                                            
                                                              
                                                                     
                                                                                  
                                
                                                                                         
                                                                                                            
                                                                 
                                                                                                                             
                                                         
                                                                    
                                                                                  
                                
                                                                                 
                                                                                                            
                                                                 
                                                                                                                             
                                                         
                                                                
                                                                                  
                                
                                                                                                        
                                                                       
                                                                 
                                                         
                                                                
                                                                                  
                                
                                                                                         
                                                                       
                                                                 
                                                         
                                                                      
                                                                                  
                                
                                                                                                     
                                                     
                                                                      
                                                                 
                                                           
                                                                      
                                                                                  
                                
                                                                                                          
                                                     
                                                                      
                                                               
                                                                                                                
                                                                                                                
                                                                                                                  
                                                                     
                                                                                  
                                
                                                                                               
                                                     
                                                                     
                                                                 
                                                           
                                                                      
                                                                                  
                                
                                                                                                    
                                                     
                                                                     
                                                                
                                                                
                                                                                  
                                
                                                                                                
                                                     
                                                                     
                                                                 
                                                           
                                                                    
                                                                                  
                                
                                                                                 
                                                     
                                                                 
                                                                
                                                                    
                                                                                  
                                
                                                                  
                                                     
                                                                 
                                                                
                                                                
                                                                                  
       
  }
  part def NotificationCompositionOwner :> Thread {
    port attentionIn : DataPort { in :>> type : AttentionResolution; }
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    port pilotNoticeOut : DataPort { out :>> type : PilotNotice; }
    port flightControlNoticeOut : DataPort { out :>> type : FlightControlNotice; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_NOTICES:
          pilotNoticeOut == PilotNotice.EvidenceUntrusted &
          flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted;
      compute
        compute_cases
          case PILOT_EVIDENCE_UNTRUSTED:
            assume faultsIn.vector.batteryFault;
            guarantee pilotNoticeOut == PilotNotice.EvidenceUntrusted;
          case PILOT_CRITICAL:
            assume not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Critical;
            guarantee pilotNoticeOut == PilotNotice.Critical;
          case PILOT_LOW:
            assume not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Low;
            guarantee pilotNoticeOut == PilotNotice.Low;
          case PILOT_CHARGE_ATTENTION:
            assume not faultsIn.vector.batteryFault & attentionIn.cause != AttentionCause.Critical &
              attentionIn.cause != AttentionCause.Low &
              (faultsIn.aggregateFault | sessionIn.newSession.sessionValue == ChargeSession.Suspended);
            guarantee pilotNoticeOut == PilotNotice.ChargeAttention;
          case PILOT_RECOVERY_PENDING:
            assume not faultsIn.vector.batteryFault & attentionIn.cause != AttentionCause.Critical &
              attentionIn.cause != AttentionCause.Low & not faultsIn.aggregateFault &
              sessionIn.newSession.sessionValue != ChargeSession.Suspended &
              attentionIn.newAttention == AttentionState.Attention;
            guarantee pilotNoticeOut == PilotNotice.RecoveryPending;
          case PILOT_CLEAR:
            assume not faultsIn.vector.batteryFault & attentionIn.cause != AttentionCause.Critical &
              attentionIn.cause != AttentionCause.Low & not faultsIn.aggregateFault &
              sessionIn.newSession.sessionValue != ChargeSession.Suspended &
              attentionIn.newAttention == AttentionState.Clear;
            guarantee pilotNoticeOut == PilotNotice.Clear;
          case FLIGHT_EVIDENCE_UNTRUSTED:
            assume faultsIn.vector.batteryFault;
            guarantee flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted;
          case FLIGHT_CRITICAL:
            assume not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Critical;
            guarantee flightControlNoticeOut == FlightControlNotice.Critical;
          case FLIGHT_LOW:
            assume not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Low;
            guarantee flightControlNoticeOut == FlightControlNotice.Low;
          case FLIGHT_RECOVERY_PENDING:
            assume not faultsIn.vector.batteryFault & attentionIn.cause != AttentionCause.Critical &
              attentionIn.cause != AttentionCause.Low & attentionIn.newAttention == AttentionState.Attention;
            guarantee flightControlNoticeOut == FlightControlNotice.RecoveryPending;
          case FLIGHT_CLEAR:
            assume not faultsIn.vector.batteryFault & attentionIn.cause != AttentionCause.Critical &
              attentionIn.cause != AttentionCause.Low & attentionIn.newAttention == AttentionState.Clear;
            guarantee flightControlNoticeOut == FlightControlNotice.Clear;
    }*/

                        
                
                        
                                                                                          
                                                           
                                                                          
             
                               
                                                                                      
                                             
                                                                 
                               
                                                                                            
                                                                                                
                                                        
                               
                                                                                               
                                                                                           
                                                   
                               
                                                                                                              
                                                  
                                                              
                                                         
                                                                                                         
                                                               
                               
                                                                                                         
                                                  
                                                              
                                                         
                                             
                                                                              
                                                                     
                                                               
                               
                                                                         
                                                  
                                                              
                                                         
                                             
                                                                              
                                                                 
                                                     
                               
                                                                                                
                                             
                                                                                 
                               
                                                                                         
                                                                                                
                                                                        
                               
                                                                               
                                                                                           
                                                                   
                               
                                                                                                               
                                                  
                                                              
                                                         
                                                                     
                                                                               
                               
                                                                                   
                                                  
                                                              
                                                         
                                                                 
                                                                     
       
  }
  part def AuthorizationStatusCompositionOwner :> Thread {
    port publicFactsIn : DataPort { in :>> type : PublicDecisionFacts; }
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    port pilotStatusOut : DataPort { out :>> type : PilotStatus; }
    port chargeAuthorizationOut : DataPort { out :>> type : ChargeAuthorization; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PUBLIC_OUTCOMES:
          chargeAuthorizationOut == ChargeAuthorization.Denied &
          pilotStatusOut.statusAdvisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN &
          pilotStatusOut.statusSession.sessionValue == ChargeSession.Idle &
          pilotStatusOut.statusRequestResult.requestResultValue == RequestResult.None &
          pilotStatusOut.faults.batteryFault & pilotStatusOut.faults.chargerFault &
          pilotStatusOut.faults.interfaceFault & pilotStatusOut.faults.contextFault &
          not pilotStatusOut.faults.sessionConflict & pilotStatusOut.aggregateFault;
      compute
        guarantee STATUS_PRESERVES_OWNER_FACTS:
          pilotStatusOut.statusAdvisory.advisoryValue == publicFactsIn.advisory.advisoryValue &
          pilotStatusOut.statusSession.sessionValue == publicFactsIn.newSession.sessionValue &
          pilotStatusOut.statusRequestResult.requestResultValue == publicFactsIn.requestResult.requestResultValue &
          pilotStatusOut.faults.batteryFault == faultsIn.vector.batteryFault &
          pilotStatusOut.faults.chargerFault == faultsIn.vector.chargerFault &
          pilotStatusOut.faults.interfaceFault == faultsIn.vector.interfaceFault &
          pilotStatusOut.faults.contextFault == faultsIn.vector.contextFault &
          pilotStatusOut.faults.sessionConflict == faultsIn.vector.sessionConflict &
          pilotStatusOut.aggregateFault == faultsIn.aggregateFault;
        compute_cases
          case AUTHORIZATION_PERMITTED:
            assume publicFactsIn.newSession.sessionValue == ChargeSession.Authorized & not faultsIn.aggregateFault;
            guarantee chargeAuthorizationOut == ChargeAuthorization.Permitted;
          case AUTHORIZATION_DENIED:
            assume publicFactsIn.newSession.sessionValue != ChargeSession.Authorized | faultsIn.aggregateFault;
            guarantee chargeAuthorizationOut == ChargeAuthorization.Denied;
    }*/

                        
                
                        
                                                                                                                         
                                                                
                                                                                         
                                                                           
                                                                                       
                                              
                                              
                                                
                                              
                                                     
                                        
             
                         
                                                                                                                   
                                                                                               
                                                                                              
                                                                                                                   
                                                                              
                                                                              
                                                                                  
                                                                              
                                                                                    
                                                                   
                     
                               
                                                                                                              
                                                                                                                   
                                                                              
                               
                                                                                          
                                                                                                               
                                                                           
       
  }

  part def ChargeQualificationProcess :> Process {
    port serviceRequest : DataPort { in :>> type : ServiceRequest; }
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    port chargeInterfaceReport : DataPort { in :>> type : ChargeInterfaceReport; }
    port lifecycleReport : DataPort { in :>> type : LifecycleReportValue; }
    port chargeAuthorization : DataPort { out :>> type : ChargeAuthorization; }
    port pilotNotice : DataPort { out :>> type : PilotNotice; }
    port flightControlNotice : DataPort { out :>> type : FlightControlNotice; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    part currentRequestResultDecisionOwner : CurrentRequestResultDecisionOwner;
    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    part chargerEvidenceQualifier : ChargerEvidenceQualifier;
    part chargingInterfaceEvidenceQualifier : ChargingInterfaceEvidenceQualifier;
    part lifecycleContextApplicabilityOwner : LifecycleContextApplicabilityOwner;
    part batteryConfidenceStateOwner : BatteryConfidenceStateOwner;
    part chargeEligibilityDecisionOwner : ChargeEligibilityDecisionOwner;
    part attentionLatchStateOwner : AttentionLatchStateOwner;
    part batteryAdvisoryDecisionOwner : BatteryAdvisoryDecisionOwner;
    part faultAggregationOwner : FaultAggregationOwner;
    part chargeSessionPriorityStateOwner : ChargeSessionPriorityStateOwner;
    part notificationCompositionOwner : NotificationCompositionOwner;
    part authorizationStatusCompositionOwner : AuthorizationStatusCompositionOwner;

    // Exactly 35 approved semantic interactions.
    connection int01 : PortConnection connect serviceRequest to currentRequestResultDecisionOwner.requestIn;
    connection int02 : PortConnection connect batteryReport to batteryEvidenceQualifier.reportIn;
    connection int03 : PortConnection connect chargerReport to chargerEvidenceQualifier.reportIn;
    connection int04 : PortConnection connect chargeInterfaceReport to chargingInterfaceEvidenceQualifier.reportIn;
    connection int05 : PortConnection connect lifecycleReport to lifecycleContextApplicabilityOwner.reportIn;
    connection int06 : PortConnection connect serviceRequest to attentionLatchStateOwner.requestIn;
    connection int07 : PortConnection connect serviceRequest to chargeSessionPriorityStateOwner.requestIn;
    connection int08 : PortConnection connect currentRequestResultDecisionOwner.publicFactsOut to authorizationStatusCompositionOwner.publicFactsIn;
    connection int09 : PortConnection connect batteryEvidenceQualifier.qualificationOut to batteryConfidenceStateOwner.qualificationIn;
    connection int10 : PortConnection connect chargerEvidenceQualifier.factsToEligibility to chargeEligibilityDecisionOwner.chargerIn;
    connection int11 : PortConnection connect chargerEvidenceQualifier.faultToAggregation to faultAggregationOwner.chargerFaultIn;
    connection int12 : PortConnection connect chargingInterfaceEvidenceQualifier.factsToEligibility to chargeEligibilityDecisionOwner.interfaceIn;
    connection int13 : PortConnection connect chargingInterfaceEvidenceQualifier.factsToSession to chargeSessionPriorityStateOwner.interfaceIn;
    connection int14 : PortConnection connect chargingInterfaceEvidenceQualifier.faultToAggregation to faultAggregationOwner.interfaceFaultIn;
    connection int15 : PortConnection connect lifecycleContextApplicabilityOwner.factsToEligibility to chargeEligibilityDecisionOwner.lifecycleIn;
    connection int16 : PortConnection connect lifecycleContextApplicabilityOwner.factsToAdvisory to batteryAdvisoryDecisionOwner.lifecycleIn;
    connection int17 : PortConnection connect lifecycleContextApplicabilityOwner.faultToAggregation to faultAggregationOwner.contextFaultIn;
    connection int18 : PortConnection connect batteryConfidenceStateOwner.stateToEligibility to chargeEligibilityDecisionOwner.batteryIn;
    connection int19 : PortConnection connect batteryConfidenceStateOwner.stateToAttention to attentionLatchStateOwner.batteryIn;
    connection int20 : PortConnection connect batteryConfidenceStateOwner.stateToAdvisory to batteryAdvisoryDecisionOwner.batteryIn;
    connection int21 : PortConnection connect batteryConfidenceStateOwner.faultToAggregation to faultAggregationOwner.batteryFaultIn;
    connection int22 : PortConnection connect chargeEligibilityDecisionOwner.eligibilityToAdvisory to batteryAdvisoryDecisionOwner.eligibilityIn;
    connection int23 : PortConnection connect chargeEligibilityDecisionOwner.eligibilityToSession to chargeSessionPriorityStateOwner.eligibilityIn;
    connection int24 : PortConnection connect attentionLatchStateOwner.resolutionToNotification to notificationCompositionOwner.attentionIn;
    connection int25 : PortConnection connect batteryAdvisoryDecisionOwner.advisoryToRequestResult to currentRequestResultDecisionOwner.advisoryIn;
    connection int26 : PortConnection connect faultAggregationOwner.faultsToNotification to notificationCompositionOwner.faultsIn;
    connection int27 : PortConnection connect faultAggregationOwner.faultsToComposition to authorizationStatusCompositionOwner.faultsIn;
    connection int28 : PortConnection connect chargeSessionPriorityStateOwner.conflictToAggregation to faultAggregationOwner.sessionConflictIn;
    connection int29 : PortConnection connect chargeSessionPriorityStateOwner.resolutionToNotification to notificationCompositionOwner.sessionIn;
    connection int30 : PortConnection connect chargeSessionPriorityStateOwner.resolutionToNotification to currentRequestResultDecisionOwner.sessionIn;
    connection int31 : PortConnection connect attentionLatchStateOwner.clearedToRequestResult to currentRequestResultDecisionOwner.attentionClearedIn;
    connection int32 : PortConnection connect notificationCompositionOwner.pilotNoticeOut to pilotNotice;
    connection int33 : PortConnection connect notificationCompositionOwner.flightControlNoticeOut to flightControlNotice;
    connection int34 : PortConnection connect authorizationStatusCompositionOwner.pilotStatusOut to pilotStatus;
    connection int35 : PortConnection connect authorizationStatusCompositionOwner.chargeAuthorizationOut to chargeAuthorization;
  }

  part def DroneBatteryChargeQualificationSystem :> System {
    port serviceRequest : DataPort { in :>> type : ServiceRequest; }
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    port chargeInterfaceReport : DataPort { in :>> type : ChargeInterfaceReport; }
    port lifecycleReport : DataPort { in :>> type : LifecycleReportValue; }
    port chargeAuthorization : DataPort { out :>> type : ChargeAuthorization; }
    port pilotNotice : DataPort { out :>> type : PilotNotice; }
    port flightControlNotice : DataPort { out :>> type : FlightControlNotice; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    part chargeQualificationProcess : ChargeQualificationProcess;
    // Exactly nine transparent boundary delegations.
    connection support01 : PortConnection connect serviceRequest to chargeQualificationProcess.serviceRequest;
    connection support02 : PortConnection connect batteryReport to chargeQualificationProcess.batteryReport;
    connection support03 : PortConnection connect chargerReport to chargeQualificationProcess.chargerReport;
    connection support04 : PortConnection connect chargeInterfaceReport to chargeQualificationProcess.chargeInterfaceReport;
    connection support05 : PortConnection connect lifecycleReport to chargeQualificationProcess.lifecycleReport;
    connection support06 : PortConnection connect chargeQualificationProcess.chargeAuthorization to chargeAuthorization;
    connection support07 : PortConnection connect chargeQualificationProcess.pilotNotice to pilotNotice;
    connection support08 : PortConnection connect chargeQualificationProcess.flightControlNotice to flightControlNotice;
    connection support09 : PortConnection connect chargeQualificationProcess.pilotStatus to pilotStatus;
  }

  part droneBatteryChargeQualificationSupervisor : DroneBatteryChargeQualificationSystem;
}
