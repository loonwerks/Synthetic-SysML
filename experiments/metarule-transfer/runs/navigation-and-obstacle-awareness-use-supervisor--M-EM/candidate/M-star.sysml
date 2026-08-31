package Navigation_Obstacle_Awareness_Use_Supervisor {
  private import HAMR::*;

  enum def NavigationEvidence {
    enum NOMINAL_CURRENT;
    enum DEGRADED_CURRENT;
    enum UNAVAILABLE_CURRENT;
    enum STALE;
    enum INVALID;
  }

  enum def ObstacleEvidence {
    enum NO_INDICATION_CURRENT;
    enum INDICATION_CURRENT;
    enum UNAVAILABLE_CURRENT;
    enum STALE;
    enum INVALID;
  }

  enum def MotionContext {
    enum STATIONARY;
    enum TRANSLATING;
    enum LANDING_CONTEXT;
    enum UNKNOWN;
  }

  enum def SupervisionEvent {
    enum NONE;
    enum RESET_ONLY;
    enum FORCE_HOLD_ONLY;
    enum FORCE_HOLD_WITH_RESET;
  }

  enum def NavigationUseDirective {
    enum MOTION_INHIBITED;
    enum RESTRICTED_NAV_USE;
    enum FULL_NAV_USE;
  }

  enum def ObstacleAwarenessNotice {
    enum NO_CURRENT_INDICATION;
    enum CURRENT_INDICATION;
    enum AWARENESS_UNAVAILABLE;
  }

  enum def SupervisionStatus {
    enum STARTUP_HOLD;
    enum FULL_USE;
    enum RESTRICTED_USE;
    enum HELD_NAV_EVIDENCE;
    enum HELD_OBSTACLE_INDICATION;
    enum HELD_AWARENESS_LOSS;
    enum HELD_EXTERNAL;
    enum RESET_RELEASE_REQUIRED;
    enum RESET_REQUIRED;
  }

  enum def EvidenceAssessment {
    enum READY;
    enum LIMITED;
    enum REJECTED;
  }

  enum def ObstacleAssessment {
    enum NO_INDICATION;
    enum INDICATED;
    enum UNAVAILABLE;
  }

  enum def NavigationBasis {
    enum FULL_BASIS;
    enum RELATIVE_BASIS;
    enum LIMITED_BASIS;
    enum UNUSABLE_BASIS;
  }

  enum def AwarenessCondition {
    enum AWARENESS_CLEAR;
    enum ACTIVE_OBSTACLE_CONFLICT;
    enum STATIONARY_OBSTACLE_PRESENT;
    enum ACTIVE_AWARENESS_LOSS;
    enum STATIONARY_AWARENESS_UNAVAILABLE;
  }

  enum def ConstraintProposal {
    enum HOLD_OBSTACLE;
    enum HOLD_AWARENESS;
    enum HOLD_NAVIGATION;
    enum RESTRICT_NAVIGATION;
    enum ALLOW_FULL;
  }

  enum def AcceptedAction {
    enum APPLY_OBSTACLE_HOLD;
    enum APPLY_AWARENESS_HOLD;
    enum APPLY_NAV_HOLD;
    enum APPLY_EXTERNAL_HOLD;
    enum APPLY_RESTRICTED;
    enum APPLY_FULL;
    enum ACCEPT_RESET;
    enum IGNORE_RESET;
  }

  enum def RecoveryPhase {
    enum WAIT_RELEASE;
    enum ARMED;
    enum OPEN;
    enum LATCHED;
  }

  part def GpsEvidenceQualifier :> Thread {
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    port gpsAssessment : DataPort { out :>> type : EvidenceAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_GPS_ASSESSMENT:
          (gpsEvidence == NavigationEvidence.NOMINAL_CURRENT implies
            gpsAssessment == EvidenceAssessment.READY) &
          (gpsEvidence == NavigationEvidence.DEGRADED_CURRENT implies
            gpsAssessment == EvidenceAssessment.LIMITED) &
          ((gpsEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
            gpsEvidence == NavigationEvidence.STALE |
            gpsEvidence == NavigationEvidence.INVALID) implies
            gpsAssessment == EvidenceAssessment.REJECTED);
      compute
        compute_cases
          case CASE_01_GPS_CLASSIFICATION:
            assume T;
            guarantee
              (gpsEvidence == NavigationEvidence.NOMINAL_CURRENT implies
                gpsAssessment == EvidenceAssessment.READY) &
              (gpsEvidence == NavigationEvidence.DEGRADED_CURRENT implies
                gpsAssessment == EvidenceAssessment.LIMITED) &
              ((gpsEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
                gpsEvidence == NavigationEvidence.STALE |
                gpsEvidence == NavigationEvidence.INVALID) implies
                gpsAssessment == EvidenceAssessment.REJECTED);
    }*/
  }

  part def InertialEvidenceQualifier :> Thread {
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    port inertialAssessment : DataPort { out :>> type : EvidenceAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_INERTIAL_ASSESSMENT:
          (inertialEvidence == NavigationEvidence.NOMINAL_CURRENT implies
            inertialAssessment == EvidenceAssessment.READY) &
          (inertialEvidence == NavigationEvidence.DEGRADED_CURRENT implies
            inertialAssessment == EvidenceAssessment.LIMITED) &
          ((inertialEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
            inertialEvidence == NavigationEvidence.STALE |
            inertialEvidence == NavigationEvidence.INVALID) implies
            inertialAssessment == EvidenceAssessment.REJECTED);
      compute
        compute_cases
          case CASE_02_INERTIAL_CLASSIFICATION:
            assume T;
            guarantee
              (inertialEvidence == NavigationEvidence.NOMINAL_CURRENT implies
                inertialAssessment == EvidenceAssessment.READY) &
              (inertialEvidence == NavigationEvidence.DEGRADED_CURRENT implies
                inertialAssessment == EvidenceAssessment.LIMITED) &
              ((inertialEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
                inertialEvidence == NavigationEvidence.STALE |
                inertialEvidence == NavigationEvidence.INVALID) implies
                inertialAssessment == EvidenceAssessment.REJECTED);
    }*/
  }

  part def BarometricEvidenceQualifier :> Thread {
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    port barometricAssessment : DataPort { out :>> type : EvidenceAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_BAROMETRIC_ASSESSMENT:
          (barometricEvidence == NavigationEvidence.NOMINAL_CURRENT implies
            barometricAssessment == EvidenceAssessment.READY) &
          (barometricEvidence == NavigationEvidence.DEGRADED_CURRENT implies
            barometricAssessment == EvidenceAssessment.LIMITED) &
          ((barometricEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
            barometricEvidence == NavigationEvidence.STALE |
            barometricEvidence == NavigationEvidence.INVALID) implies
            barometricAssessment == EvidenceAssessment.REJECTED);
      compute
        compute_cases
          case CASE_03_BAROMETRIC_CLASSIFICATION:
            assume T;
            guarantee
              (barometricEvidence == NavigationEvidence.NOMINAL_CURRENT implies
                barometricAssessment == EvidenceAssessment.READY) &
              (barometricEvidence == NavigationEvidence.DEGRADED_CURRENT implies
                barometricAssessment == EvidenceAssessment.LIMITED) &
              ((barometricEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
                barometricEvidence == NavigationEvidence.STALE |
                barometricEvidence == NavigationEvidence.INVALID) implies
                barometricAssessment == EvidenceAssessment.REJECTED);
    }*/
  }

  part def ObstacleEvidenceQualifier :> Thread {
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    port obstacleAssessment : DataPort { out :>> type : ObstacleAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_OBSTACLE_ASSESSMENT:
          (obstacleEvidence == ObstacleEvidence.NO_INDICATION_CURRENT implies
            obstacleAssessment == ObstacleAssessment.NO_INDICATION) &
          (obstacleEvidence == ObstacleEvidence.INDICATION_CURRENT implies
            obstacleAssessment == ObstacleAssessment.INDICATED) &
          ((obstacleEvidence == ObstacleEvidence.UNAVAILABLE_CURRENT |
            obstacleEvidence == ObstacleEvidence.STALE |
            obstacleEvidence == ObstacleEvidence.INVALID) implies
            obstacleAssessment == ObstacleAssessment.UNAVAILABLE);
      compute
        compute_cases
          case CASE_04_OBSTACLE_CLASSIFICATION:
            assume T;
            guarantee
              (obstacleEvidence == ObstacleEvidence.NO_INDICATION_CURRENT implies
                obstacleAssessment == ObstacleAssessment.NO_INDICATION) &
              (obstacleEvidence == ObstacleEvidence.INDICATION_CURRENT implies
                obstacleAssessment == ObstacleAssessment.INDICATED) &
              ((obstacleEvidence == ObstacleEvidence.UNAVAILABLE_CURRENT |
                obstacleEvidence == ObstacleEvidence.STALE |
                obstacleEvidence == ObstacleEvidence.INVALID) implies
                obstacleAssessment == ObstacleAssessment.UNAVAILABLE);
    }*/
  }

  part def NavigationBasisOwner :> Thread {
    port gpsAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port inertialAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port barometricAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port proposalBasis : DataPort { out :>> type : NavigationBasis; }
    port outcomeBasis : DataPort { out :>> type : NavigationBasis; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_NAVIGATION_BASIS:
          proposalBasis == outcomeBasis &
          ((gpsAssessment == EvidenceAssessment.READY &
            inertialAssessment == EvidenceAssessment.READY &
            barometricAssessment == EvidenceAssessment.READY) implies
            proposalBasis == NavigationBasis.FULL_BASIS) &
          ((gpsAssessment == EvidenceAssessment.REJECTED &
            inertialAssessment != EvidenceAssessment.REJECTED &
            barometricAssessment != EvidenceAssessment.REJECTED) implies
            proposalBasis == NavigationBasis.RELATIVE_BASIS) &
          ((gpsAssessment != EvidenceAssessment.REJECTED &
            (inertialAssessment != EvidenceAssessment.REJECTED |
              barometricAssessment != EvidenceAssessment.REJECTED) &
            (gpsAssessment != EvidenceAssessment.READY |
              inertialAssessment != EvidenceAssessment.READY |
              barometricAssessment != EvidenceAssessment.READY)) implies
            proposalBasis == NavigationBasis.LIMITED_BASIS) &
          (((gpsAssessment == EvidenceAssessment.REJECTED &
              (inertialAssessment == EvidenceAssessment.REJECTED |
                barometricAssessment == EvidenceAssessment.REJECTED)) |
            (gpsAssessment != EvidenceAssessment.REJECTED &
              inertialAssessment == EvidenceAssessment.REJECTED &
              barometricAssessment == EvidenceAssessment.REJECTED)) implies
            proposalBasis == NavigationBasis.UNUSABLE_BASIS);
      compute
        guarantee PRESERVE_BASIS_PUBLICATIONS: outcomeBasis == proposalBasis;
        compute_cases
          case CASE_05_FULL_BASIS:
            assume gpsAssessment == EvidenceAssessment.READY &
              inertialAssessment == EvidenceAssessment.READY &
              barometricAssessment == EvidenceAssessment.READY;
            guarantee proposalBasis == NavigationBasis.FULL_BASIS;
          case CASE_06_RELATIVE_BASIS:
            assume gpsAssessment == EvidenceAssessment.REJECTED &
              inertialAssessment != EvidenceAssessment.REJECTED &
              barometricAssessment != EvidenceAssessment.REJECTED;
            guarantee proposalBasis == NavigationBasis.RELATIVE_BASIS;
          case CASE_07_LIMITED_BASIS:
            assume gpsAssessment != EvidenceAssessment.REJECTED &
              (inertialAssessment != EvidenceAssessment.REJECTED |
                barometricAssessment != EvidenceAssessment.REJECTED) &
              (gpsAssessment != EvidenceAssessment.READY |
                inertialAssessment != EvidenceAssessment.READY |
                barometricAssessment != EvidenceAssessment.READY);
            guarantee proposalBasis == NavigationBasis.LIMITED_BASIS;
          case CASE_08_UNUSABLE_BASIS:
            assume (gpsAssessment == EvidenceAssessment.REJECTED &
              (inertialAssessment == EvidenceAssessment.REJECTED |
                barometricAssessment == EvidenceAssessment.REJECTED)) |
              (gpsAssessment != EvidenceAssessment.REJECTED &
                inertialAssessment == EvidenceAssessment.REJECTED &
                barometricAssessment == EvidenceAssessment.REJECTED);
            guarantee proposalBasis == NavigationBasis.UNUSABLE_BASIS;
    }*/
  }

  part def AwarenessConditionOwner :> Thread {
    port motionContext : DataPort { in :>> type : MotionContext; }
    port obstacleAssessment : DataPort { in :>> type : ObstacleAssessment; }
    port awarenessCondition : DataPort { out :>> type : AwarenessCondition; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_AWARENESS_CONDITION:
          ((motionContext != MotionContext.UNKNOWN &
            obstacleAssessment == ObstacleAssessment.NO_INDICATION) implies
            awarenessCondition == AwarenessCondition.AWARENESS_CLEAR) &
          (((motionContext == MotionContext.TRANSLATING |
              motionContext == MotionContext.LANDING_CONTEXT) &
            obstacleAssessment == ObstacleAssessment.INDICATED) implies
            awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT) &
          ((motionContext == MotionContext.STATIONARY &
            obstacleAssessment == ObstacleAssessment.INDICATED) implies
            awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT) &
          ((motionContext == MotionContext.UNKNOWN |
            ((motionContext == MotionContext.TRANSLATING |
              motionContext == MotionContext.LANDING_CONTEXT) &
              obstacleAssessment == ObstacleAssessment.UNAVAILABLE)) implies
            awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS) &
          ((motionContext == MotionContext.STATIONARY &
            obstacleAssessment == ObstacleAssessment.UNAVAILABLE) implies
            awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE);
      compute
        compute_cases
          case CASE_09_AWARENESS_CLEAR:
            assume motionContext != MotionContext.UNKNOWN &
              obstacleAssessment == ObstacleAssessment.NO_INDICATION;
            guarantee awarenessCondition == AwarenessCondition.AWARENESS_CLEAR;
          case CASE_10_ACTIVE_OBSTACLE:
            assume (motionContext == MotionContext.TRANSLATING |
              motionContext == MotionContext.LANDING_CONTEXT) &
              obstacleAssessment == ObstacleAssessment.INDICATED;
            guarantee awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT;
          case CASE_11_STATIONARY_OBSTACLE:
            assume motionContext == MotionContext.STATIONARY &
              obstacleAssessment == ObstacleAssessment.INDICATED;
            guarantee awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT;
          case CASE_12_ACTIVE_AWARENESS_LOSS:
            assume motionContext == MotionContext.UNKNOWN |
              ((motionContext == MotionContext.TRANSLATING |
                motionContext == MotionContext.LANDING_CONTEXT) &
                obstacleAssessment == ObstacleAssessment.UNAVAILABLE);
            guarantee awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS;
          case CASE_13_STATIONARY_AWARENESS_UNAVAILABLE:
            assume motionContext == MotionContext.STATIONARY &
              obstacleAssessment == ObstacleAssessment.UNAVAILABLE;
            guarantee awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE;
    }*/
  }

  part def ConstraintProposalOwner :> Thread {
    port navigationBasis : DataPort { in :>> type : NavigationBasis; }
    port awarenessCondition : DataPort { in :>> type : AwarenessCondition; }
    port constraintProposal : DataPort { out :>> type : ConstraintProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_CONSTRAINT_PROPOSAL:
          ((awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT |
            awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT) implies
            constraintProposal == ConstraintProposal.HOLD_OBSTACLE) &
          ((awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS |
            awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE) implies
            constraintProposal == ConstraintProposal.HOLD_AWARENESS) &
          ((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
            navigationBasis == NavigationBasis.UNUSABLE_BASIS) implies
            constraintProposal == ConstraintProposal.HOLD_NAVIGATION) &
          ((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
            (navigationBasis == NavigationBasis.RELATIVE_BASIS |
              navigationBasis == NavigationBasis.LIMITED_BASIS)) implies
            constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          ((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
            navigationBasis == NavigationBasis.FULL_BASIS) implies
            constraintProposal == ConstraintProposal.ALLOW_FULL);
      compute
        compute_cases
          case CASE_14_PROPOSAL_PRIORITY:
            assume T;
            guarantee
              ((awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT |
                awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT) implies
                constraintProposal == ConstraintProposal.HOLD_OBSTACLE) &
              ((awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS |
                awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE) implies
                constraintProposal == ConstraintProposal.HOLD_AWARENESS) &
              ((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
                navigationBasis == NavigationBasis.UNUSABLE_BASIS) implies
                constraintProposal == ConstraintProposal.HOLD_NAVIGATION) &
              ((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
                (navigationBasis == NavigationBasis.RELATIVE_BASIS |
                  navigationBasis == NavigationBasis.LIMITED_BASIS)) implies
                constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
              ((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
                navigationBasis == NavigationBasis.FULL_BASIS) implies
                constraintProposal == ConstraintProposal.ALLOW_FULL);
    }*/
  }

  part def EventPriorityArbiter :> Thread {
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    port constraintProposal : DataPort { in :>> type : ConstraintProposal; }
    port preRecoveryPhase : DataPort { in :>> type : RecoveryPhase; }
    port recoveryAction : DataPort { out :>> type : AcceptedAction; }
    port outcomeAction : DataPort { out :>> type : AcceptedAction; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ACCEPTED_ACTION:
          recoveryAction == outcomeAction &
          (constraintProposal == ConstraintProposal.HOLD_OBSTACLE implies
            recoveryAction == AcceptedAction.APPLY_OBSTACLE_HOLD) &
          (constraintProposal == ConstraintProposal.HOLD_AWARENESS implies
            recoveryAction == AcceptedAction.APPLY_AWARENESS_HOLD) &
          (constraintProposal == ConstraintProposal.HOLD_NAVIGATION implies
            recoveryAction == AcceptedAction.APPLY_NAV_HOLD) &
          (((constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
            (supervisionEvent == SupervisionEvent.FORCE_HOLD_ONLY |
              supervisionEvent == SupervisionEvent.FORCE_HOLD_WITH_RESET)) implies
            recoveryAction == AcceptedAction.APPLY_EXTERNAL_HOLD) &
          (((constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
            supervisionEvent == SupervisionEvent.RESET_ONLY &
            preRecoveryPhase == RecoveryPhase.ARMED) implies
            recoveryAction == AcceptedAction.ACCEPT_RESET) &
          (((constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
            supervisionEvent == SupervisionEvent.RESET_ONLY &
            (preRecoveryPhase == RecoveryPhase.WAIT_RELEASE |
              preRecoveryPhase == RecoveryPhase.LATCHED)) implies
            recoveryAction == AcceptedAction.IGNORE_RESET) &
          (((constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
            (supervisionEvent == SupervisionEvent.NONE |
              (supervisionEvent == SupervisionEvent.RESET_ONLY &
                preRecoveryPhase == RecoveryPhase.OPEN)) &
            constraintProposal == ConstraintProposal.ALLOW_FULL) implies
            recoveryAction == AcceptedAction.APPLY_FULL) &
          (((constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
            (supervisionEvent == SupervisionEvent.NONE |
              (supervisionEvent == SupervisionEvent.RESET_ONLY &
                preRecoveryPhase == RecoveryPhase.OPEN)) &
            constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) implies
            recoveryAction == AcceptedAction.APPLY_RESTRICTED);
      compute
        guarantee PRESERVE_ACTION_PUBLICATIONS: outcomeAction == recoveryAction;
        compute_cases
          case CASE_15_EVIDENCE_HOLD_PRIORITY:
            assume constraintProposal == ConstraintProposal.HOLD_OBSTACLE |
              constraintProposal == ConstraintProposal.HOLD_AWARENESS |
              constraintProposal == ConstraintProposal.HOLD_NAVIGATION;
            guarantee
              (constraintProposal == ConstraintProposal.HOLD_OBSTACLE implies
                recoveryAction == AcceptedAction.APPLY_OBSTACLE_HOLD) &
              (constraintProposal == ConstraintProposal.HOLD_AWARENESS implies
                recoveryAction == AcceptedAction.APPLY_AWARENESS_HOLD) &
              (constraintProposal == ConstraintProposal.HOLD_NAVIGATION implies
                recoveryAction == AcceptedAction.APPLY_NAV_HOLD);
          case CASE_16_EVENT_AND_RESET_PRIORITY:
            assume (constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
              supervisionEvent != SupervisionEvent.NONE;
            guarantee
              ((supervisionEvent == SupervisionEvent.FORCE_HOLD_ONLY |
                supervisionEvent == SupervisionEvent.FORCE_HOLD_WITH_RESET) implies
                recoveryAction == AcceptedAction.APPLY_EXTERNAL_HOLD) &
              ((supervisionEvent == SupervisionEvent.RESET_ONLY &
                preRecoveryPhase == RecoveryPhase.ARMED) implies
                recoveryAction == AcceptedAction.ACCEPT_RESET) &
              ((supervisionEvent == SupervisionEvent.RESET_ONLY &
                (preRecoveryPhase == RecoveryPhase.WAIT_RELEASE |
                  preRecoveryPhase == RecoveryPhase.LATCHED)) implies
                recoveryAction == AcceptedAction.IGNORE_RESET) &
              ((supervisionEvent == SupervisionEvent.RESET_ONLY &
                preRecoveryPhase == RecoveryPhase.OPEN &
                constraintProposal == ConstraintProposal.ALLOW_FULL) implies
                recoveryAction == AcceptedAction.APPLY_FULL) &
              ((supervisionEvent == SupervisionEvent.RESET_ONLY &
                preRecoveryPhase == RecoveryPhase.OPEN &
                constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) implies
                recoveryAction == AcceptedAction.APPLY_RESTRICTED);
          case CASE_17_SAFE_USE:
            assume (constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
              supervisionEvent == SupervisionEvent.NONE;
            guarantee
              (constraintProposal == ConstraintProposal.ALLOW_FULL implies
                recoveryAction == AcceptedAction.APPLY_FULL) &
              (constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION implies
                recoveryAction == AcceptedAction.APPLY_RESTRICTED);
    }*/
  }

  part def RecoveryLatchOwner :> Thread {
    port acceptedAction : DataPort { in :>> type : AcceptedAction; }
    port preRecoveryPhase : DataPort { out :>> type : RecoveryPhase; }
    port postRecoveryPhase : DataPort { out :>> type : RecoveryPhase; }

                        
    language "GUMBO" /*{
      state
        committedRecoveryPhase: RecoveryPhase;
      initialize
        guarantee INITIAL_RECOVERY_CLOSED:
          committedRecoveryPhase == RecoveryPhase.WAIT_RELEASE &
          preRecoveryPhase == RecoveryPhase.WAIT_RELEASE &
          postRecoveryPhase == RecoveryPhase.WAIT_RELEASE;
      compute
        guarantee PUBLISH_PRE_EVALUATION_PHASE:
          preRecoveryPhase == In(committedRecoveryPhase);
        guarantee PUBLISH_POST_EVALUATION_PHASE:
          postRecoveryPhase == committedRecoveryPhase;
        compute_cases
          case CASE_18_CLOSED_RECOVERY_TRANSITIONS:
            assume acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD |
              acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD |
              acceptedAction == AcceptedAction.APPLY_NAV_HOLD |
              acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD |
              acceptedAction == AcceptedAction.IGNORE_RESET |
              ((acceptedAction == AcceptedAction.APPLY_FULL |
                acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                (In(committedRecoveryPhase) == RecoveryPhase.LATCHED |
                  In(committedRecoveryPhase) == RecoveryPhase.WAIT_RELEASE));
            guarantee
              ((acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD |
                acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD |
                acceptedAction == AcceptedAction.APPLY_NAV_HOLD |
                acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD) implies
                committedRecoveryPhase == RecoveryPhase.LATCHED) &
              (acceptedAction == AcceptedAction.IGNORE_RESET implies
                committedRecoveryPhase == RecoveryPhase.WAIT_RELEASE) &
              (((acceptedAction == AcceptedAction.APPLY_FULL |
                acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                (In(committedRecoveryPhase) == RecoveryPhase.LATCHED |
                  In(committedRecoveryPhase) == RecoveryPhase.WAIT_RELEASE)) implies
                committedRecoveryPhase == RecoveryPhase.ARMED);
          case CASE_19_OPEN_OR_RETAIN_RECOVERY:
            assume acceptedAction == AcceptedAction.ACCEPT_RESET |
              ((acceptedAction == AcceptedAction.APPLY_FULL |
                acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                (In(committedRecoveryPhase) == RecoveryPhase.ARMED |
                  In(committedRecoveryPhase) == RecoveryPhase.OPEN));
            guarantee
              (acceptedAction == AcceptedAction.ACCEPT_RESET implies
                committedRecoveryPhase == RecoveryPhase.OPEN) &
              (((acceptedAction == AcceptedAction.APPLY_FULL |
                acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                In(committedRecoveryPhase) == RecoveryPhase.ARMED) implies
                committedRecoveryPhase == RecoveryPhase.ARMED) &
              (((acceptedAction == AcceptedAction.APPLY_FULL |
                acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                In(committedRecoveryPhase) == RecoveryPhase.OPEN) implies
                committedRecoveryPhase == RecoveryPhase.OPEN);
    }*/
  }

  part def SupervisionOutcomeOwner :> Thread {
    port acceptedAction : DataPort { in :>> type : AcceptedAction; }
    port postRecoveryPhase : DataPort { in :>> type : RecoveryPhase; }
    port navigationBasis : DataPort { in :>> type : NavigationBasis; }
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_SAFE_OUTPUTS:
          navigationUseDirective == NavigationUseDirective.MOTION_INHIBITED &
          obstacleAwarenessNotice == ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE &
          supervisionStatus == SupervisionStatus.STARTUP_HOLD;
      compute
        compute_cases
          case CASE_20_JOINT_OUTCOME:
            assume T;
            guarantee
              (postRecoveryPhase != RecoveryPhase.OPEN implies
                navigationUseDirective == NavigationUseDirective.MOTION_INHIBITED) &
              ((postRecoveryPhase == RecoveryPhase.OPEN &
                navigationBasis == NavigationBasis.FULL_BASIS &
                (acceptedAction == AcceptedAction.APPLY_FULL |
                  acceptedAction == AcceptedAction.ACCEPT_RESET)) implies
                (navigationUseDirective == NavigationUseDirective.FULL_NAV_USE &
                  supervisionStatus == SupervisionStatus.FULL_USE)) &
              ((postRecoveryPhase == RecoveryPhase.OPEN &
                (navigationBasis == NavigationBasis.RELATIVE_BASIS |
                  navigationBasis == NavigationBasis.LIMITED_BASIS) &
                (acceptedAction == AcceptedAction.APPLY_RESTRICTED |
                  acceptedAction == AcceptedAction.ACCEPT_RESET)) implies
                (navigationUseDirective == NavigationUseDirective.RESTRICTED_NAV_USE &
                  supervisionStatus == SupervisionStatus.RESTRICTED_USE)) &
              ((postRecoveryPhase != RecoveryPhase.OPEN &
                acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD) implies
                supervisionStatus == SupervisionStatus.HELD_OBSTACLE_INDICATION) &
              ((postRecoveryPhase != RecoveryPhase.OPEN &
                acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD) implies
                supervisionStatus == SupervisionStatus.HELD_AWARENESS_LOSS) &
              ((postRecoveryPhase != RecoveryPhase.OPEN &
                acceptedAction == AcceptedAction.APPLY_NAV_HOLD) implies
                supervisionStatus == SupervisionStatus.HELD_NAV_EVIDENCE) &
              ((postRecoveryPhase != RecoveryPhase.OPEN &
                acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD) implies
                supervisionStatus == SupervisionStatus.HELD_EXTERNAL) &
              ((postRecoveryPhase == RecoveryPhase.WAIT_RELEASE &
                (acceptedAction == AcceptedAction.IGNORE_RESET |
                  acceptedAction == AcceptedAction.APPLY_FULL |
                  acceptedAction == AcceptedAction.APPLY_RESTRICTED)) implies
                supervisionStatus == SupervisionStatus.RESET_RELEASE_REQUIRED) &
              ((postRecoveryPhase == RecoveryPhase.ARMED &
                (acceptedAction == AcceptedAction.APPLY_FULL |
                  acceptedAction == AcceptedAction.APPLY_RESTRICTED)) implies
                supervisionStatus == SupervisionStatus.RESET_REQUIRED) &
              (acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD implies
                obstacleAwarenessNotice == ObstacleAwarenessNotice.CURRENT_INDICATION) &
              (acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD implies
                obstacleAwarenessNotice == ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE) &
              ((acceptedAction != AcceptedAction.APPLY_OBSTACLE_HOLD &
                acceptedAction != AcceptedAction.APPLY_AWARENESS_HOLD) implies
                obstacleAwarenessNotice == ObstacleAwarenessNotice.NO_CURRENT_INDICATION);
    }*/
  }

  part def SupervisorProcess :> Process {
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    port motionContext : DataPort { in :>> type : MotionContext; }
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    part gpsEvidenceQualifier : GpsEvidenceQualifier;
    part inertialEvidenceQualifier : InertialEvidenceQualifier;
    part barometricEvidenceQualifier : BarometricEvidenceQualifier;
    part obstacleEvidenceQualifier : ObstacleEvidenceQualifier;
    part navigationBasisOwner : NavigationBasisOwner;
    part awarenessConditionOwner : AwarenessConditionOwner;
    part constraintProposalOwner : ConstraintProposalOwner;
    part eventPriorityArbiter : EventPriorityArbiter;
    part recoveryLatchOwner : RecoveryLatchOwner;
    part supervisionOutcomeOwner : SupervisionOutcomeOwner;

    connection int01 : PortConnection connect gpsEvidence to gpsEvidenceQualifier.gpsEvidence;
    connection int02 : PortConnection connect inertialEvidence to inertialEvidenceQualifier.inertialEvidence;
    connection int03 : PortConnection connect barometricEvidence to barometricEvidenceQualifier.barometricEvidence;
    connection int04 : PortConnection connect obstacleEvidence to obstacleEvidenceQualifier.obstacleEvidence;
    connection int05 : PortConnection connect motionContext to awarenessConditionOwner.motionContext;
    connection int06 : PortConnection connect supervisionEvent to eventPriorityArbiter.supervisionEvent;
    connection int07 : PortConnection connect gpsEvidenceQualifier.gpsAssessment to navigationBasisOwner.gpsAssessment;
    connection int08 : PortConnection connect inertialEvidenceQualifier.inertialAssessment to navigationBasisOwner.inertialAssessment;
    connection int09 : PortConnection connect barometricEvidenceQualifier.barometricAssessment to navigationBasisOwner.barometricAssessment;
    connection int10 : PortConnection connect obstacleEvidenceQualifier.obstacleAssessment to awarenessConditionOwner.obstacleAssessment;
    connection int11 : PortConnection connect navigationBasisOwner.proposalBasis to constraintProposalOwner.navigationBasis;
    connection int12 : PortConnection connect awarenessConditionOwner.awarenessCondition to constraintProposalOwner.awarenessCondition;
    connection int13 : PortConnection connect constraintProposalOwner.constraintProposal to eventPriorityArbiter.constraintProposal;
    connection int14 : PortConnection connect recoveryLatchOwner.preRecoveryPhase to eventPriorityArbiter.preRecoveryPhase;
    connection int15 : PortConnection connect eventPriorityArbiter.recoveryAction to recoveryLatchOwner.acceptedAction;
    connection int16 : PortConnection connect eventPriorityArbiter.outcomeAction to supervisionOutcomeOwner.acceptedAction;
    connection int17 : PortConnection connect recoveryLatchOwner.postRecoveryPhase to supervisionOutcomeOwner.postRecoveryPhase;
    connection int18 : PortConnection connect navigationBasisOwner.outcomeBasis to supervisionOutcomeOwner.navigationBasis;
    connection int19 : PortConnection connect supervisionOutcomeOwner.navigationUseDirective to navigationUseDirective;
    connection int20 : PortConnection connect supervisionOutcomeOwner.obstacleAwarenessNotice to obstacleAwarenessNotice;
    connection int21 : PortConnection connect supervisionOutcomeOwner.supervisionStatus to supervisionStatus;
  }

  part def NavigationObstacleAwarenessUseSupervisorSystem :> System {
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    port motionContext : DataPort { in :>> type : MotionContext; }
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    part supervisorProcess : SupervisorProcess;

    connection supportGpsEvidence : PortConnection connect gpsEvidence to supervisorProcess.gpsEvidence;
    connection supportInertialEvidence : PortConnection connect inertialEvidence to supervisorProcess.inertialEvidence;
    connection supportBarometricEvidence : PortConnection connect barometricEvidence to supervisorProcess.barometricEvidence;
    connection supportObstacleEvidence : PortConnection connect obstacleEvidence to supervisorProcess.obstacleEvidence;
    connection supportMotionContext : PortConnection connect motionContext to supervisorProcess.motionContext;
    connection supportSupervisionEvent : PortConnection connect supervisionEvent to supervisorProcess.supervisionEvent;
    connection supportDirective : PortConnection connect supervisorProcess.navigationUseDirective to navigationUseDirective;
    connection supportNotice : PortConnection connect supervisorProcess.obstacleAwarenessNotice to obstacleAwarenessNotice;
    connection supportStatus : PortConnection connect supervisorProcess.supervisionStatus to supervisionStatus;
  }

  part navigationObstacleAwarenessUseSupervisor : NavigationObstacleAwarenessUseSupervisorSystem;
}
