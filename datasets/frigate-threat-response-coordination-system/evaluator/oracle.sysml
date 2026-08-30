// @trace SCOPE-01
package Frigate_Threat_Response_Coordinator {
  private import HAMR::*;

  // @trace MON-01
  enum def ContactSignature {
    enum NONE;
    enum CONTACT;
  }

  // @trace MON-02
  enum def ContactIdentity {
    enum NO_HOSTILE;
    enum HOSTILE;
  }

  // @trace MON-01
  enum def ContactSignatureStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-02
  enum def IdentityStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-03
  enum def DefenseAvailabilityStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-03
  enum def DroneReadinessStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-04
  enum def DestinationEvidenceStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-04
  enum def WarpProgressStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-05
  enum def RequestStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-06
  enum def AcknowledgmentStatus {
    enum VALID;
    enum INVALID;
  }

  // @trace MON-03
  enum def DefenseAvailability {
    enum AVAILABLE;
    enum UNAVAILABLE;
  }

  // @trace MON-03
  enum def DroneReadiness {
    enum READY;
    enum NOT_READY;
  }

  // @trace MON-04
  enum def DestinationStatus {
    enum IDENTIFIED;
    enum ABSENT;
  }

  // @trace MON-04
  enum def WarpProgress {
    enum READY;
    enum IN_PROGRESS;
    enum COMPLETE;
    enum UNAVAILABLE;
  }

  // @trace MON-05
  enum def ResponseRequestValue {
    enum OBSERVE;
    enum DEFEND_IF_HOSTILE;
    enum RETREAT;
  }

  // @trace MON-06
  enum def AcknowledgmentValue {
    enum NOT_ACKNOWLEDGED;
    enum ACKNOWLEDGED;
  }

  // @trace CONS-02
  enum def QualifiedThreat {
    enum CLEAR;
    enum SUSPECT;
    enum HOSTILE;
    enum UNKNOWN;
  }

  // @trace CONS-03
  enum def DefenseCondition {
    enum READY;
    enum UNAVAILABLE;
    enum UNKNOWN;
  }

  // @trace CONS-04
  enum def RetreatCondition {
    enum AVAILABLE;
    enum UNAVAILABLE;
    enum COMPLETE;
    enum UNKNOWN;
  }

  // @trace CONS-06
  enum def ResponseCommitment {
    enum OPEN;
    enum DEFENSE_COMMITTED;
    enum RETREAT_COMMITTED;
  }

  // @trace CTRL-01
  enum def DefenseActivation {
    enum STAND_DOWN;
    enum ACTIVATE;
  }

  // @trace CTRL-02
  enum def RetreatNavigationCommand {
    enum HOLD;
    enum RETREAT;
  }

  // @trace CTRL-03
  enum def ResponseDisposition {
    enum OBSERVED;
    enum DEFENSE_ACTIVE;
    enum RETREAT_ACTIVE;
    enum RETREAT_BLOCKED;
    enum RETREAT_COMPLETE;
    enum INPUT_FAULT;
  }

  // @trace CTRL-03
  enum def ReportPriority {
    enum COMMUNICATION_FAULT;
    enum CLOSED;
    enum URGENT;
    enum ROUTINE;
  }

  // @trace MON-01
  part def ContactEvidence :> Data {
    // @trace MON-01
    attribute signature : ContactSignature;
    // @trace MON-01
    attribute signatureStatus : ContactSignatureStatus;
  }

  // @trace MON-02
  part def IdentificationEvidence :> Data {
    // @trace MON-02
    attribute identity : ContactIdentity;
    // @trace MON-02
    attribute identityStatus : IdentityStatus;
  }

  // @trace MON-03
  part def DefenseEvidence :> Data {
    // @trace MON-03
    attribute defenseAvailable : DefenseAvailability;
    // @trace MON-03
    attribute defenseStatus : DefenseAvailabilityStatus;
    // @trace MON-03
    attribute droneReadiness : DroneReadiness;
    // @trace MON-03
    attribute droneStatus : DroneReadinessStatus;
  }

  // @trace MON-04
  part def RetreatNavigationEvidence :> Data {
    // @trace MON-04
    attribute destination : DestinationStatus;
    // @trace MON-04
    attribute destinationStatus : DestinationEvidenceStatus;
    // @trace MON-04
    attribute warpProgress : WarpProgress;
    // @trace MON-04
    attribute warpStatus : WarpProgressStatus;
  }

  // @trace MON-05
  part def ResponseRequest :> Data {
    // @trace MON-05
    attribute request : ResponseRequestValue;
    // @trace MON-05
    attribute requestStatus : RequestStatus;
  }

  // @trace MON-06
  part def ReportAcknowledgment :> Data {
    // @trace MON-06
    attribute acknowledgment : AcknowledgmentValue;
    // @trace MON-06
    attribute acknowledgmentStatus : AcknowledgmentStatus;
  }

  // @trace INT-11
  part def ResponseRecord :> Data {
    // @trace INT-11
    attribute qualifiedThreat : QualifiedThreat;
    // @trace INT-11
    attribute disposition : ResponseDisposition;
  }

  // @trace CTRL-03
  part def ThreatReport :> Data {
    // @trace CTRL-03
    attribute qualifiedThreat : QualifiedThreat;
    // @trace CTRL-03
    attribute disposition : ResponseDisposition;
    // @trace CTRL-03
    attribute priority : ReportPriority;
  }

  // @trace PART-01
  part def ThreatEvidenceInterpreter :> Thread {
    // @trace INT-01
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    // @trace INT-02
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    // @trace INT-06
    port qualifiedThreat : DataPort { out :>> type : QualifiedThreat; }

    language "GUMBO" /*{
      compute
        guarantee
          // @trace CONTRACT-LOCAL-01
          DERIVE_QUALIFIED_THREAT "Both independently status-bearing observations determine the local threat class":
            (((contactEvidence.signatureStatus == ContactSignatureStatus.INVALID) |
              (identificationEvidence.identityStatus == IdentityStatus.INVALID) |
              (contactEvidence.signature == ContactSignature.NONE &
               identificationEvidence.identity == ContactIdentity.HOSTILE)) implies
              (qualifiedThreat == QualifiedThreat.UNKNOWN)) &
            ((contactEvidence.signatureStatus == ContactSignatureStatus.VALID &
              identificationEvidence.identityStatus == IdentityStatus.VALID &
              contactEvidence.signature == ContactSignature.CONTACT &
              identificationEvidence.identity == ContactIdentity.HOSTILE) implies
              (qualifiedThreat == QualifiedThreat.HOSTILE)) &
            ((contactEvidence.signatureStatus == ContactSignatureStatus.VALID &
              identificationEvidence.identityStatus == IdentityStatus.VALID &
              contactEvidence.signature == ContactSignature.CONTACT &
              identificationEvidence.identity == ContactIdentity.NO_HOSTILE) implies
              (qualifiedThreat == QualifiedThreat.SUSPECT)) &
            ((contactEvidence.signatureStatus == ContactSignatureStatus.VALID &
              identificationEvidence.identityStatus == IdentityStatus.VALID &
              contactEvidence.signature == ContactSignature.NONE &
              identificationEvidence.identity == ContactIdentity.NO_HOSTILE) implies
              (qualifiedThreat == QualifiedThreat.CLEAR));
    }*/
  }

  // @trace PART-02
  part def DefenseReadinessAssessor :> Thread {
    // @trace INT-03
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    // @trace INT-07
    port defenseCondition : DataPort { out :>> type : DefenseCondition; }

    language "GUMBO" /*{
      compute
        guarantee
          // @trace CONTRACT-LOCAL-02
          DERIVE_DEFENSE_CONDITION "Independent defense and drone status fields determine the local readiness class":
            (((defenseEvidence.defenseStatus == DefenseAvailabilityStatus.INVALID) |
              (defenseEvidence.droneStatus == DroneReadinessStatus.INVALID)) implies
              (defenseCondition == DefenseCondition.UNKNOWN)) &
            ((defenseEvidence.defenseStatus == DefenseAvailabilityStatus.VALID &
              defenseEvidence.droneStatus == DroneReadinessStatus.VALID &
              defenseEvidence.defenseAvailable == DefenseAvailability.AVAILABLE &
              defenseEvidence.droneReadiness == DroneReadiness.READY) implies
              (defenseCondition == DefenseCondition.READY)) &
            ((defenseEvidence.defenseStatus == DefenseAvailabilityStatus.VALID &
              defenseEvidence.droneStatus == DroneReadinessStatus.VALID &
              (defenseEvidence.defenseAvailable == DefenseAvailability.UNAVAILABLE |
               defenseEvidence.droneReadiness == DroneReadiness.NOT_READY)) implies
              (defenseCondition == DefenseCondition.UNAVAILABLE));
    }*/
  }

  // @trace PART-03
  part def RetreatReadinessAssessor :> Thread {
    // @trace INT-04
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    // @trace INT-08
    port retreatCondition : DataPort { out :>> type : RetreatCondition; }

    language "GUMBO" /*{
      compute
        guarantee
          // @trace CONTRACT-LOCAL-03
          DERIVE_RETREAT_CONDITION "Destination and warp evidence determine completion, route availability, or blockage":
            (((retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.INVALID) |
              (retreatNavigationEvidence.warpStatus == WarpProgressStatus.INVALID)) implies
              (retreatCondition == RetreatCondition.UNKNOWN)) &
            ((retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.VALID &
              retreatNavigationEvidence.warpStatus == WarpProgressStatus.VALID &
              retreatNavigationEvidence.warpProgress == WarpProgress.COMPLETE) implies
              (retreatCondition == RetreatCondition.COMPLETE)) &
            ((retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.VALID &
              retreatNavigationEvidence.warpStatus == WarpProgressStatus.VALID &
              retreatNavigationEvidence.destination == DestinationStatus.IDENTIFIED &
              (retreatNavigationEvidence.warpProgress == WarpProgress.READY |
               retreatNavigationEvidence.warpProgress == WarpProgress.IN_PROGRESS)) implies
              (retreatCondition == RetreatCondition.AVAILABLE)) &
            ((retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.VALID &
              retreatNavigationEvidence.warpStatus == WarpProgressStatus.VALID &
              retreatNavigationEvidence.warpProgress != WarpProgress.COMPLETE &
              (retreatNavigationEvidence.destination == DestinationStatus.ABSENT |
               retreatNavigationEvidence.warpProgress == WarpProgress.UNAVAILABLE)) implies
              (retreatCondition == RetreatCondition.UNAVAILABLE));
    }*/
  }

  // @trace PART-04
  part def PrincipalResponseCoordinator :> Thread {
    // @trace INT-05
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    // @trace INT-06
    port qualifiedThreat : DataPort { in :>> type : QualifiedThreat; }
    // @trace INT-07
    port defenseCondition : DataPort { in :>> type : DefenseCondition; }
    // @trace INT-08
    port retreatCondition : DataPort { in :>> type : RetreatCondition; }
    // @trace INT-09
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    // @trace INT-10
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    // @trace INT-11
    port responseRecord : DataPort { out :>> type : ResponseRecord; }

    language "GUMBO" /*{
      state
        // @trace CONS-06
        responseCommitment : ResponseCommitment;
        // @trace CONS-06
        retreatRequestArmed : Base_Types::Boolean;

      initialize
        guarantee
          // @trace CONS-01
          INITIAL_RESPONSE_STATE "The sole response owner initializes open, armed, and command-inhibiting outputs":
            responseCommitment == ResponseCommitment.OPEN &
            retreatRequestArmed == T &
            defenseActivation == DefenseActivation.STAND_DOWN &
            retreatNavigationCommand == RetreatNavigationCommand.HOLD &
            responseRecord.qualifiedThreat == QualifiedThreat.UNKNOWN &
            responseRecord.disposition == ResponseDisposition.INPUT_FAULT;

      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_INPUT_FAULT "Invalid or contradictory response-support evidence inhibits both commands":
            assume qualifiedThreat == QualifiedThreat.UNKNOWN |
              defenseCondition == DefenseCondition.UNKNOWN |
              retreatCondition == RetreatCondition.UNKNOWN |
              responseRequest.requestStatus == RequestStatus.INVALID;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.INPUT_FAULT &
              ((In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED) implies
                (responseCommitment == ResponseCommitment.RETREAT_COMMITTED)) &
              ((In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED) implies
                (responseCommitment == ResponseCommitment.OPEN)) &
              ((responseRequest.requestStatus == RequestStatus.VALID &
                responseRequest.request != ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == T)) &
              ((responseRequest.requestStatus == RequestStatus.INVALID |
                responseRequest.request == ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == In(retreatRequestArmed)));

          // @trace CASE-02
          case CASE_02_COMMITTED_RETREAT_ACTIVE "An established commitment commands retreat while the route is available":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.AVAILABLE;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.RETREAT &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request != ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == T)) &
              ((responseRequest.request == ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == In(retreatRequestArmed)));

          // @trace CASE-03
          case CASE_03_COMMITTED_RETREAT_BLOCKED "An unavailable route blocks the command but preserves the established commitment":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.UNAVAILABLE;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request != ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == T)) &
              ((responseRequest.request == ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == In(retreatRequestArmed)));

          // @trace CASE-04
          case CASE_04_RETREAT_COMPLETE "Only valid completion evidence closes an established retreat commitment":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.COMPLETE;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_COMPLETE &
              responseCommitment == ResponseCommitment.OPEN &
              ((responseRequest.request != ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == T)) &
              ((responseRequest.request == ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == In(retreatRequestArmed)));

          // @trace CASE-05
          case CASE_05_FRESH_RETREAT_ACTIVE "A fresh request or unavailable-defense fallback starts retreat on an available route":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.AVAILABLE &
              ((responseRequest.request == ResponseRequestValue.RETREAT &
                In(retreatRequestArmed) == T) |
               (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                qualifiedThreat == QualifiedThreat.HOSTILE &
                defenseCondition == DefenseCondition.UNAVAILABLE));
            guarantee defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.RETREAT &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request == ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == F)) &
              ((responseRequest.request != ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == T));

          // @trace CASE-06
          case CASE_06_FRESH_RETREAT_BLOCKED "A fresh retreat trigger commits for recovery while an unavailable route inhibits movement":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.UNAVAILABLE &
              ((responseRequest.request == ResponseRequestValue.RETREAT &
                In(retreatRequestArmed) == T) |
               (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                qualifiedThreat == QualifiedThreat.HOSTILE &
                defenseCondition == DefenseCondition.UNAVAILABLE));
            guarantee defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request == ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == F)) &
              ((responseRequest.request != ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == T));

          // @trace CASE-07
          case CASE_07_CONFIRMED_DEFENSE "Confirmed hostility with a ready defense activates defense after retreat exclusions":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              not ((retreatCondition != RetreatCondition.COMPLETE) &
                ((responseRequest.request == ResponseRequestValue.RETREAT &
                  In(retreatRequestArmed) == T) |
                 (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                  qualifiedThreat == QualifiedThreat.HOSTILE &
                  defenseCondition == DefenseCondition.UNAVAILABLE))) &
              qualifiedThreat == QualifiedThreat.HOSTILE &
              responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
              defenseCondition == DefenseCondition.READY;
            guarantee defenseActivation == DefenseActivation.ACTIVATE &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.DEFENSE_ACTIVE &
              responseCommitment == ResponseCommitment.DEFENSE_COMMITTED &
              retreatRequestArmed == T;

          // @trace CASE-08
          case CASE_08_OBSERVATION "The exact valid residual partition observes and clears any defense commitment":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              not ((retreatCondition != RetreatCondition.COMPLETE) &
                ((responseRequest.request == ResponseRequestValue.RETREAT &
                  In(retreatRequestArmed) == T) |
                 (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                  qualifiedThreat == QualifiedThreat.HOSTILE &
                  defenseCondition == DefenseCondition.UNAVAILABLE))) &
              not (qualifiedThreat == QualifiedThreat.HOSTILE &
                responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                defenseCondition == DefenseCondition.READY);
            guarantee defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.OBSERVED &
              responseCommitment == ResponseCommitment.OPEN &
              ((responseRequest.request != ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == T)) &
              ((responseRequest.request == ResponseRequestValue.RETREAT) implies
                (retreatRequestArmed == In(retreatRequestArmed)));
    }*/
  }

  // @trace PART-05
  part def ThreatReportComposer :> Thread {
    // @trace INT-11
    port responseRecord : DataPort { in :>> type : ResponseRecord; }
    // @trace INT-12
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    // @trace INT-13
    port threatReport : DataPort { out :>> type : ThreatReport; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CASE-09
          case CASE_09_COMMUNICATION_FAULT "Invalid acknowledgment affects report priority without changing response authority":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.INVALID;
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat &
              threatReport.disposition == responseRecord.disposition &
              threatReport.priority == ReportPriority.COMMUNICATION_FAULT;

          // @trace CASE-10
          case CASE_10_ACKNOWLEDGED "A valid acknowledgment closes reporting priority for every response":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.VALID &
              reportAcknowledgment.acknowledgment == AcknowledgmentValue.ACKNOWLEDGED;
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat &
              threatReport.disposition == responseRecord.disposition &
              threatReport.priority == ReportPriority.CLOSED;

          // @trace CASE-11
          case CASE_11_UNACKNOWLEDGED_URGENT "An unacknowledged input fault or blocked retreat is urgent":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.VALID &
              reportAcknowledgment.acknowledgment == AcknowledgmentValue.NOT_ACKNOWLEDGED &
              (responseRecord.disposition == ResponseDisposition.INPUT_FAULT |
               responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED);
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat &
              threatReport.disposition == responseRecord.disposition &
              threatReport.priority == ReportPriority.URGENT;

          // @trace CASE-12
          case CASE_12_UNACKNOWLEDGED_ROUTINE "The remaining valid unacknowledged response classes are routine":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.VALID &
              reportAcknowledgment.acknowledgment == AcknowledgmentValue.NOT_ACKNOWLEDGED &
              (responseRecord.disposition == ResponseDisposition.OBSERVED |
               responseRecord.disposition == ResponseDisposition.DEFENSE_ACTIVE |
               responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE |
               responseRecord.disposition == ResponseDisposition.RETREAT_COMPLETE);
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat &
              threatReport.disposition == responseRecord.disposition &
              threatReport.priority == ReportPriority.ROUTINE;
    }*/
  }

  // @trace GEN-SUPPORT-02
  part def ThreatResponseProcess :> Process {
    // @trace INT-01
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    // @trace INT-02
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    // @trace INT-03
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    // @trace INT-04
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    // @trace INT-05
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    // @trace INT-12
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    // @trace INT-09
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    // @trace INT-10
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    // @trace INT-13
    port threatReport : DataPort { out :>> type : ThreatReport; }

    // @trace PART-01
    part threatEvidenceInterpreter : ThreatEvidenceInterpreter;
    // @trace PART-02
    part defenseReadinessAssessor : DefenseReadinessAssessor;
    // @trace PART-03
    part retreatReadinessAssessor : RetreatReadinessAssessor;
    // @trace PART-04
    part principalResponseCoordinator : PrincipalResponseCoordinator;
    // @trace PART-05
    part threatReportComposer : ThreatReportComposer;

    // @trace INT-01
    connection int01 : PortConnection connect contactEvidence to threatEvidenceInterpreter.contactEvidence;
    // @trace INT-02
    connection int02 : PortConnection connect identificationEvidence to threatEvidenceInterpreter.identificationEvidence;
    // @trace INT-03
    connection int03 : PortConnection connect defenseEvidence to defenseReadinessAssessor.defenseEvidence;
    // @trace INT-04
    connection int04 : PortConnection connect retreatNavigationEvidence to retreatReadinessAssessor.retreatNavigationEvidence;
    // @trace INT-05
    connection int05 : PortConnection connect responseRequest to principalResponseCoordinator.responseRequest;
    // @trace INT-06
    connection int06 : PortConnection connect threatEvidenceInterpreter.qualifiedThreat to principalResponseCoordinator.qualifiedThreat;
    // @trace INT-07
    connection int07 : PortConnection connect defenseReadinessAssessor.defenseCondition to principalResponseCoordinator.defenseCondition;
    // @trace INT-08
    connection int08 : PortConnection connect retreatReadinessAssessor.retreatCondition to principalResponseCoordinator.retreatCondition;
    // @trace INT-09
    connection int09 : PortConnection connect principalResponseCoordinator.defenseActivation to defenseActivation;
    // @trace INT-10
    connection int10 : PortConnection connect principalResponseCoordinator.retreatNavigationCommand to retreatNavigationCommand;
    // @trace INT-11
    connection int11 : PortConnection connect principalResponseCoordinator.responseRecord to threatReportComposer.responseRecord;
    // @trace INT-12
    connection int12 : PortConnection connect reportAcknowledgment to threatReportComposer.reportAcknowledgment;
    // @trace INT-13
    connection int13 : PortConnection connect threatReportComposer.threatReport to threatReport;
  }

  // @trace BOUND-01
  part def FrigateThreatResponseCoordinator :> System {
    // @trace MON-01
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    // @trace MON-02
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    // @trace MON-03
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    // @trace MON-04
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    // @trace MON-05
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    // @trace MON-06
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    // @trace CTRL-01
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    // @trace CTRL-02
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    // @trace CTRL-03
    port threatReport : DataPort { out :>> type : ThreatReport; }

    // @trace GEN-SUPPORT-02
    part threatResponseProcess : ThreatResponseProcess;

    // @trace INT-01
    connection supportInt01 : PortConnection connect contactEvidence to threatResponseProcess.contactEvidence;
    // @trace INT-02
    connection supportInt02 : PortConnection connect identificationEvidence to threatResponseProcess.identificationEvidence;
    // @trace INT-03
    connection supportInt03 : PortConnection connect defenseEvidence to threatResponseProcess.defenseEvidence;
    // @trace INT-04
    connection supportInt04 : PortConnection connect retreatNavigationEvidence to threatResponseProcess.retreatNavigationEvidence;
    // @trace INT-05
    connection supportInt05 : PortConnection connect responseRequest to threatResponseProcess.responseRequest;
    // @trace INT-12
    connection supportInt12 : PortConnection connect reportAcknowledgment to threatResponseProcess.reportAcknowledgment;
    // @trace INT-09
    connection supportInt09 : PortConnection connect threatResponseProcess.defenseActivation to defenseActivation;
    // @trace INT-10
    connection supportInt10 : PortConnection connect threatResponseProcess.retreatNavigationCommand to retreatNavigationCommand;
    // @trace INT-13
    connection supportInt13 : PortConnection connect threatResponseProcess.threatReport to threatReport;
  }

  // @trace STRUCT-01
  part frigateThreatResponseCoordinator : FrigateThreatResponseCoordinator;
}
