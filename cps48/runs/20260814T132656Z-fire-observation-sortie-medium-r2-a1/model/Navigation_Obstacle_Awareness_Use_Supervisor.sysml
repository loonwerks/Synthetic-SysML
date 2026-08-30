// @trace PURPOSE-01
package Navigation_Obstacle_Awareness_Use_Supervisor {
  private import HAMR::*;

  // @trace MON-01
  enum def NavigationEvidence {
    enum NOMINAL_CURRENT;
    enum DEGRADED_CURRENT;
    enum UNAVAILABLE_CURRENT;
    enum STALE;
    enum INVALID;
  }

  // @trace MON-04
  enum def ObstacleEvidence {
    enum NO_INDICATION_CURRENT;
    enum INDICATION_CURRENT;
    enum UNAVAILABLE_CURRENT;
    enum STALE;
    enum INVALID;
  }

  // @trace MON-05
  enum def MotionContext {
    enum STATIONARY;
    enum TRANSLATING;
    enum LANDING_CONTEXT;
    enum UNKNOWN;
  }

  // @trace MON-06
  enum def SupervisionEvent {
    enum NONE;
    enum RESET_ONLY;
    enum FORCE_HOLD_ONLY;
    enum FORCE_HOLD_WITH_RESET;
  }

  // @trace CTRL-01
  enum def NavigationUseDirective {
    enum MOTION_INHIBITED;
    enum RESTRICTED_NAV_USE;
    enum FULL_NAV_USE;
  }

  // @trace CTRL-02
  enum def ObstacleAwarenessNotice {
    enum NO_CURRENT_INDICATION;
    enum CURRENT_INDICATION;
    enum AWARENESS_UNAVAILABLE;
  }

  // @trace CTRL-03
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

  // @trace PART-01
  enum def EvidenceAssessment {
    enum READY;
    enum LIMITED;
    enum REJECTED;
  }

  // @trace PART-04
  enum def ObstacleAssessment {
    enum NO_INDICATION;
    enum INDICATED;
    enum UNAVAILABLE;
  }

  // @trace PART-05
  enum def NavigationBasis {
    enum FULL_BASIS;
    enum RELATIVE_BASIS;
    enum LIMITED_BASIS;
    enum UNUSABLE_BASIS;
  }

  // @trace PART-06
  enum def AwarenessCondition {
    enum AWARENESS_CLEAR;
    enum ACTIVE_OBSTACLE_CONFLICT;
    enum STATIONARY_OBSTACLE_PRESENT;
    enum ACTIVE_AWARENESS_LOSS;
    enum STATIONARY_AWARENESS_UNAVAILABLE;
  }

  // @trace PART-07
  enum def ConstraintProposal {
    enum HOLD_OBSTACLE;
    enum HOLD_AWARENESS;
    enum HOLD_NAVIGATION;
    enum RESTRICT_NAVIGATION;
    enum ALLOW_FULL;
  }

  // @trace PART-08
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

  // @trace STATE-01
  enum def RecoveryPhase {
    enum WAIT_RELEASE;
    enum ARMED;
    enum OPEN;
    enum LATCHED;
  }

  // @trace PART-01
  part def GpsEvidenceQualifier :> Thread {
    // @trace INT-01
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @trace INT-07
    port gpsAssessment : DataPort { out :>> type : EvidenceAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace POL-01
          INITIAL_GPS_ASSESSMENT "Initialize from the supplied GPS evidence classification":
            ((gpsEvidence == NavigationEvidence.NOMINAL_CURRENT) implies
              (gpsAssessment == EvidenceAssessment.READY)) &
            ((gpsEvidence == NavigationEvidence.DEGRADED_CURRENT) implies
              (gpsAssessment == EvidenceAssessment.LIMITED)) &
            (((gpsEvidence == NavigationEvidence.UNAVAILABLE_CURRENT) |
              (gpsEvidence == NavigationEvidence.STALE) |
              (gpsEvidence == NavigationEvidence.INVALID)) implies
              (gpsAssessment == EvidenceAssessment.REJECTED));
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_GPS_CLASSIFICATION "GPS evidence is totally classified by the GPS owner":
            guarantee
              ((gpsEvidence == NavigationEvidence.NOMINAL_CURRENT) implies
                (gpsAssessment == EvidenceAssessment.READY)) &
              ((gpsEvidence == NavigationEvidence.DEGRADED_CURRENT) implies
                (gpsAssessment == EvidenceAssessment.LIMITED)) &
              (((gpsEvidence == NavigationEvidence.UNAVAILABLE_CURRENT) |
                (gpsEvidence == NavigationEvidence.STALE) |
                (gpsEvidence == NavigationEvidence.INVALID)) implies
                (gpsAssessment == EvidenceAssessment.REJECTED));
    }*/
  }

  // @trace PART-02
  part def InertialEvidenceQualifier :> Thread {
    // @trace INT-02
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @trace INT-08
    port inertialAssessment : DataPort { out :>> type : EvidenceAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace POL-01
          INITIAL_INERTIAL_ASSESSMENT "Initialize from the supplied inertial evidence classification":
            ((inertialEvidence == NavigationEvidence.NOMINAL_CURRENT) implies
              (inertialAssessment == EvidenceAssessment.READY)) &
            ((inertialEvidence == NavigationEvidence.DEGRADED_CURRENT) implies
              (inertialAssessment == EvidenceAssessment.LIMITED)) &
            (((inertialEvidence == NavigationEvidence.UNAVAILABLE_CURRENT) |
              (inertialEvidence == NavigationEvidence.STALE) |
              (inertialEvidence == NavigationEvidence.INVALID)) implies
              (inertialAssessment == EvidenceAssessment.REJECTED));
      compute
        compute_cases
          // @trace CASE-02
          case CASE_02_INERTIAL_CLASSIFICATION "Inertial evidence is independently and totally classified":
            guarantee
              ((inertialEvidence == NavigationEvidence.NOMINAL_CURRENT) implies
                (inertialAssessment == EvidenceAssessment.READY)) &
              ((inertialEvidence == NavigationEvidence.DEGRADED_CURRENT) implies
                (inertialAssessment == EvidenceAssessment.LIMITED)) &
              (((inertialEvidence == NavigationEvidence.UNAVAILABLE_CURRENT) |
                (inertialEvidence == NavigationEvidence.STALE) |
                (inertialEvidence == NavigationEvidence.INVALID)) implies
                (inertialAssessment == EvidenceAssessment.REJECTED));
    }*/
  }

  // @trace PART-03
  part def BarometricEvidenceQualifier :> Thread {
    // @trace INT-03
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @trace INT-09
    port barometricAssessment : DataPort { out :>> type : EvidenceAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace POL-01
          INITIAL_BAROMETRIC_ASSESSMENT "Initialize from the supplied barometric evidence classification":
            ((barometricEvidence == NavigationEvidence.NOMINAL_CURRENT) implies
              (barometricAssessment == EvidenceAssessment.READY)) &
            ((barometricEvidence == NavigationEvidence.DEGRADED_CURRENT) implies
              (barometricAssessment == EvidenceAssessment.LIMITED)) &
            (((barometricEvidence == NavigationEvidence.UNAVAILABLE_CURRENT) |
              (barometricEvidence == NavigationEvidence.STALE) |
              (barometricEvidence == NavigationEvidence.INVALID)) implies
              (barometricAssessment == EvidenceAssessment.REJECTED));
      compute
        compute_cases
          // @trace CASE-03
          case CASE_03_BAROMETRIC_CLASSIFICATION "Barometric evidence is independently and totally classified":
            guarantee
              ((barometricEvidence == NavigationEvidence.NOMINAL_CURRENT) implies
                (barometricAssessment == EvidenceAssessment.READY)) &
              ((barometricEvidence == NavigationEvidence.DEGRADED_CURRENT) implies
                (barometricAssessment == EvidenceAssessment.LIMITED)) &
              (((barometricEvidence == NavigationEvidence.UNAVAILABLE_CURRENT) |
                (barometricEvidence == NavigationEvidence.STALE) |
                (barometricEvidence == NavigationEvidence.INVALID)) implies
                (barometricAssessment == EvidenceAssessment.REJECTED));
    }*/
  }

  // @trace PART-04
  part def ObstacleEvidenceQualifier :> Thread {
    // @trace INT-04
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    // @trace INT-10
    port obstacleAssessment : DataPort { out :>> type : ObstacleAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace BEH-OBS-01
          INITIAL_OBSTACLE_ASSESSMENT "Initialize from the supplied obstacle evidence classification":
            ((obstacleEvidence == ObstacleEvidence.NO_INDICATION_CURRENT) implies
              (obstacleAssessment == ObstacleAssessment.NO_INDICATION)) &
            ((obstacleEvidence == ObstacleEvidence.INDICATION_CURRENT) implies
              (obstacleAssessment == ObstacleAssessment.INDICATED)) &
            (((obstacleEvidence == ObstacleEvidence.UNAVAILABLE_CURRENT) |
              (obstacleEvidence == ObstacleEvidence.STALE) |
              (obstacleEvidence == ObstacleEvidence.INVALID)) implies
              (obstacleAssessment == ObstacleAssessment.UNAVAILABLE));
      compute
        compute_cases
          // @trace CASE-04
          case CASE_04_OBSTACLE_CLASSIFICATION "Obstacle evidence is totally and conservatively classified":
            guarantee
              ((obstacleEvidence == ObstacleEvidence.NO_INDICATION_CURRENT) implies
                (obstacleAssessment == ObstacleAssessment.NO_INDICATION)) &
              ((obstacleEvidence == ObstacleEvidence.INDICATION_CURRENT) implies
                (obstacleAssessment == ObstacleAssessment.INDICATED)) &
              (((obstacleEvidence == ObstacleEvidence.UNAVAILABLE_CURRENT) |
                (obstacleEvidence == ObstacleEvidence.STALE) |
                (obstacleEvidence == ObstacleEvidence.INVALID)) implies
                (obstacleAssessment == ObstacleAssessment.UNAVAILABLE));
    }*/
  }

  // @trace PART-05
  part def NavigationBasisOwner :> Thread {
    // @trace INT-07
    port gpsAssessment : DataPort { in :>> type : EvidenceAssessment; }
    // @trace INT-08
    port inertialAssessment : DataPort { in :>> type : EvidenceAssessment; }
    // @trace INT-09
    port barometricAssessment : DataPort { in :>> type : EvidenceAssessment; }
    // @trace INT-11
    port proposalBasis : DataPort { out :>> type : NavigationBasis; }
    // @trace INT-18
    port outcomeBasis : DataPort { out :>> type : NavigationBasis; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace POL-02
          INITIAL_NAVIGATION_BASIS "Both publications initialize to the owner-local navigation basis":
            proposalBasis == outcomeBasis &
            (((gpsAssessment == EvidenceAssessment.READY) &
              (inertialAssessment == EvidenceAssessment.READY) &
              (barometricAssessment == EvidenceAssessment.READY)) implies
              (proposalBasis == NavigationBasis.FULL_BASIS)) &
            (((gpsAssessment == EvidenceAssessment.REJECTED) &
              (inertialAssessment != EvidenceAssessment.REJECTED) &
              (barometricAssessment != EvidenceAssessment.REJECTED)) implies
              (proposalBasis == NavigationBasis.RELATIVE_BASIS)) &
            (((gpsAssessment != EvidenceAssessment.REJECTED) &
              ((inertialAssessment != EvidenceAssessment.REJECTED) |
               (barometricAssessment != EvidenceAssessment.REJECTED)) &
              ((gpsAssessment != EvidenceAssessment.READY) |
               (inertialAssessment != EvidenceAssessment.READY) |
               (barometricAssessment != EvidenceAssessment.READY))) implies
              (proposalBasis == NavigationBasis.LIMITED_BASIS)) &
            ((((gpsAssessment == EvidenceAssessment.REJECTED) &
               ((inertialAssessment == EvidenceAssessment.REJECTED) |
                (barometricAssessment == EvidenceAssessment.REJECTED))) |
              ((gpsAssessment != EvidenceAssessment.REJECTED) &
               (inertialAssessment == EvidenceAssessment.REJECTED) &
               (barometricAssessment == EvidenceAssessment.REJECTED))) implies
              (proposalBasis == NavigationBasis.UNUSABLE_BASIS));
      compute
        // @trace INT-18
        guarantee PRESERVE_BASIS_PUBLICATIONS:
          outcomeBasis == proposalBasis;
        compute_cases
          // @trace CASE-05
          case CASE_05_FULL_BASIS "All three ready assessments provide the full basis":
            assume gpsAssessment == EvidenceAssessment.READY &
              inertialAssessment == EvidenceAssessment.READY &
              barometricAssessment == EvidenceAssessment.READY;
            guarantee proposalBasis == NavigationBasis.FULL_BASIS;
          // @trace CASE-06
          case CASE_06_RELATIVE_BASIS "Rejected GPS with both other channels usable provides a relative basis":
            assume gpsAssessment == EvidenceAssessment.REJECTED &
              inertialAssessment != EvidenceAssessment.REJECTED &
              barometricAssessment != EvidenceAssessment.REJECTED;
            guarantee proposalBasis == NavigationBasis.RELATIVE_BASIS;
          // @trace CASE-07
          case CASE_07_LIMITED_BASIS "Usable GPS and at least one other usable non-full combination is limited":
            assume gpsAssessment != EvidenceAssessment.REJECTED &
              (inertialAssessment != EvidenceAssessment.REJECTED |
               barometricAssessment != EvidenceAssessment.REJECTED) &
              (gpsAssessment != EvidenceAssessment.READY |
               inertialAssessment != EvidenceAssessment.READY |
               barometricAssessment != EvidenceAssessment.READY);
            guarantee proposalBasis == NavigationBasis.LIMITED_BASIS;
          // @trace CASE-08
          case CASE_08_UNUSABLE_BASIS "Every remaining assessment tuple is unusable":
            assume (gpsAssessment == EvidenceAssessment.REJECTED &
                (inertialAssessment == EvidenceAssessment.REJECTED |
                 barometricAssessment == EvidenceAssessment.REJECTED)) |
              (gpsAssessment != EvidenceAssessment.REJECTED &
                inertialAssessment == EvidenceAssessment.REJECTED &
                barometricAssessment == EvidenceAssessment.REJECTED);
            guarantee proposalBasis == NavigationBasis.UNUSABLE_BASIS;
    }*/
  }

  // @trace PART-06
  part def AwarenessConditionOwner :> Thread {
    // @trace INT-05
    port motionContext : DataPort { in :>> type : MotionContext; }
    // @trace INT-10
    port obstacleAssessment : DataPort { in :>> type : ObstacleAssessment; }
    // @trace INT-12
    port awarenessCondition : DataPort { out :>> type : AwarenessCondition; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace PRI-01
          INITIAL_AWARENESS_CONDITION "Initialize to the total owner-local awareness classification":
            (((motionContext != MotionContext.UNKNOWN) &
              (obstacleAssessment == ObstacleAssessment.NO_INDICATION)) implies
              (awarenessCondition == AwarenessCondition.AWARENESS_CLEAR)) &
            ((((motionContext == MotionContext.TRANSLATING) |
               (motionContext == MotionContext.LANDING_CONTEXT)) &
              (obstacleAssessment == ObstacleAssessment.INDICATED)) implies
              (awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT)) &
            (((motionContext == MotionContext.STATIONARY) &
              (obstacleAssessment == ObstacleAssessment.INDICATED)) implies
              (awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)) &
            (((motionContext == MotionContext.UNKNOWN) |
              (((motionContext == MotionContext.TRANSLATING) |
                (motionContext == MotionContext.LANDING_CONTEXT)) &
               (obstacleAssessment == ObstacleAssessment.UNAVAILABLE))) implies
              (awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS)) &
            (((motionContext == MotionContext.STATIONARY) &
              (obstacleAssessment == ObstacleAssessment.UNAVAILABLE)) implies
              (awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE));
      compute
        compute_cases
          // @trace CASE-09
          case CASE_09_AWARENESS_CLEAR "Known context with no current indication is awareness clear":
            assume motionContext != MotionContext.UNKNOWN &
              obstacleAssessment == ObstacleAssessment.NO_INDICATION;
            guarantee awarenessCondition == AwarenessCondition.AWARENESS_CLEAR;
          // @trace CASE-10
          case CASE_10_ACTIVE_OBSTACLE "A current indication in an active context is an active obstacle conflict":
            assume (motionContext == MotionContext.TRANSLATING |
              motionContext == MotionContext.LANDING_CONTEXT) &
              obstacleAssessment == ObstacleAssessment.INDICATED;
            guarantee awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT;
          // @trace CASE-11
          case CASE_11_STATIONARY_OBSTACLE "A stationary current indication remains a withholding condition":
            assume motionContext == MotionContext.STATIONARY &
              obstacleAssessment == ObstacleAssessment.INDICATED;
            guarantee awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT;
          // @trace CASE-12
          case CASE_12_ACTIVE_AWARENESS_LOSS "Unknown context or unavailable awareness in active context is active loss":
            assume motionContext == MotionContext.UNKNOWN |
              ((motionContext == MotionContext.TRANSLATING |
                motionContext == MotionContext.LANDING_CONTEXT) &
               obstacleAssessment == ObstacleAssessment.UNAVAILABLE);
            guarantee awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS;
          // @trace CASE-13
          case CASE_13_STATIONARY_AWARENESS_UNAVAILABLE "Unavailable awareness while stationary remains explicitly unavailable":
            assume motionContext == MotionContext.STATIONARY &
              obstacleAssessment == ObstacleAssessment.UNAVAILABLE;
            guarantee awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE;
    }*/
  }

  // @trace PART-07
  part def ConstraintProposalOwner :> Thread {
    // @trace INT-11
    port navigationBasis : DataPort { in :>> type : NavigationBasis; }
    // @trace INT-12
    port awarenessCondition : DataPort { in :>> type : AwarenessCondition; }
    // @trace INT-13
    port constraintProposal : DataPort { out :>> type : ConstraintProposal; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace PRI-01
          INITIAL_CONSTRAINT_PROPOSAL "Initialize with the selected evidence-cause precedence":
            (((awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT) |
              (awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)) implies
              (constraintProposal == ConstraintProposal.HOLD_OBSTACLE)) &
            (((awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS) |
              (awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)) implies
              (constraintProposal == ConstraintProposal.HOLD_AWARENESS)) &
            (((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR) &
              (navigationBasis == NavigationBasis.UNUSABLE_BASIS)) implies
              (constraintProposal == ConstraintProposal.HOLD_NAVIGATION)) &
            (((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR) &
              ((navigationBasis == NavigationBasis.RELATIVE_BASIS) |
               (navigationBasis == NavigationBasis.LIMITED_BASIS))) implies
              (constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION)) &
            (((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR) &
              (navigationBasis == NavigationBasis.FULL_BASIS)) implies
              (constraintProposal == ConstraintProposal.ALLOW_FULL));
      compute
        compute_cases
          // @trace CASE-14
          case CASE_14_PROPOSAL_PRIORITY "The proposal owner selects one evidence cause by PRI-01":
            guarantee
              (((awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT) |
                (awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)) implies
                (constraintProposal == ConstraintProposal.HOLD_OBSTACLE)) &
              (((awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS) |
                (awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)) implies
                (constraintProposal == ConstraintProposal.HOLD_AWARENESS)) &
              (((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR) &
                (navigationBasis == NavigationBasis.UNUSABLE_BASIS)) implies
                (constraintProposal == ConstraintProposal.HOLD_NAVIGATION)) &
              (((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR) &
                ((navigationBasis == NavigationBasis.RELATIVE_BASIS) |
                 (navigationBasis == NavigationBasis.LIMITED_BASIS))) implies
                (constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION)) &
              (((awarenessCondition == AwarenessCondition.AWARENESS_CLEAR) &
                (navigationBasis == NavigationBasis.FULL_BASIS)) implies
                (constraintProposal == ConstraintProposal.ALLOW_FULL));
    }*/
  }

  // @trace PART-08
  part def EventPriorityArbiter :> Thread {
    // @trace INT-06
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    // @trace INT-13
    port constraintProposal : DataPort { in :>> type : ConstraintProposal; }
    // @trace INT-14
    port preRecoveryPhase : DataPort { in :>> type : RecoveryPhase; }
    // @trace INT-15
    port recoveryAction : DataPort { out :>> type : AcceptedAction; }
    // @trace INT-16
    port outcomeAction : DataPort { out :>> type : AcceptedAction; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace PRI-02
          INITIAL_ACCEPTED_ACTION "Both action publications initialize from the complete priority relation":
            recoveryAction == outcomeAction &
            (((constraintProposal == ConstraintProposal.HOLD_OBSTACLE) implies
              (recoveryAction == AcceptedAction.APPLY_OBSTACLE_HOLD)) &
             ((constraintProposal == ConstraintProposal.HOLD_AWARENESS) implies
              (recoveryAction == AcceptedAction.APPLY_AWARENESS_HOLD)) &
             ((constraintProposal == ConstraintProposal.HOLD_NAVIGATION) implies
              (recoveryAction == AcceptedAction.APPLY_NAV_HOLD)) &
             (((constraintProposal == ConstraintProposal.ALLOW_FULL) |
               (constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION)) implies
              (((supervisionEvent == SupervisionEvent.FORCE_HOLD_ONLY) |
                (supervisionEvent == SupervisionEvent.FORCE_HOLD_WITH_RESET)) implies
                (recoveryAction == AcceptedAction.APPLY_EXTERNAL_HOLD)) &
               (((supervisionEvent == SupervisionEvent.RESET_ONLY) &
                 (preRecoveryPhase == RecoveryPhase.ARMED)) implies
                (recoveryAction == AcceptedAction.ACCEPT_RESET)) &
               (((supervisionEvent == SupervisionEvent.RESET_ONLY) &
                 ((preRecoveryPhase == RecoveryPhase.WAIT_RELEASE) |
                  (preRecoveryPhase == RecoveryPhase.LATCHED))) implies
                (recoveryAction == AcceptedAction.IGNORE_RESET)) &
               (((supervisionEvent == SupervisionEvent.NONE) |
                 ((supervisionEvent == SupervisionEvent.RESET_ONLY) &
                  (preRecoveryPhase == RecoveryPhase.OPEN))) implies
                (((constraintProposal == ConstraintProposal.ALLOW_FULL) implies
                  (recoveryAction == AcceptedAction.APPLY_FULL)) &
                 ((constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) implies
                  (recoveryAction == AcceptedAction.APPLY_RESTRICTED))))));
      compute
        // @trace INT-16
        guarantee PRESERVE_ACTION_PUBLICATIONS:
          outcomeAction == recoveryAction;
        compute_cases
          // @trace CASE-15
          case CASE_15_EVIDENCE_HOLD_PRIORITY "An evidence hold defeats every simultaneous event":
            assume constraintProposal == ConstraintProposal.HOLD_OBSTACLE |
              constraintProposal == ConstraintProposal.HOLD_AWARENESS |
              constraintProposal == ConstraintProposal.HOLD_NAVIGATION;
            guarantee
              ((constraintProposal == ConstraintProposal.HOLD_OBSTACLE) implies
                (recoveryAction == AcceptedAction.APPLY_OBSTACLE_HOLD)) &
              ((constraintProposal == ConstraintProposal.HOLD_AWARENESS) implies
                (recoveryAction == AcceptedAction.APPLY_AWARENESS_HOLD)) &
              ((constraintProposal == ConstraintProposal.HOLD_NAVIGATION) implies
                (recoveryAction == AcceptedAction.APPLY_NAV_HOLD));
          // @trace CASE-16
          case CASE_16_EVENT_AND_RESET_PRIORITY "Safe proposals admit external hold or state-qualified reset only":
            assume (constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
              supervisionEvent != SupervisionEvent.NONE;
            guarantee
              (((supervisionEvent == SupervisionEvent.FORCE_HOLD_ONLY) |
                (supervisionEvent == SupervisionEvent.FORCE_HOLD_WITH_RESET)) implies
                (recoveryAction == AcceptedAction.APPLY_EXTERNAL_HOLD)) &
              (((supervisionEvent == SupervisionEvent.RESET_ONLY) &
                (preRecoveryPhase == RecoveryPhase.ARMED)) implies
                (recoveryAction == AcceptedAction.ACCEPT_RESET)) &
              (((supervisionEvent == SupervisionEvent.RESET_ONLY) &
                ((preRecoveryPhase == RecoveryPhase.WAIT_RELEASE) |
                 (preRecoveryPhase == RecoveryPhase.LATCHED))) implies
                (recoveryAction == AcceptedAction.IGNORE_RESET)) &
              (((supervisionEvent == SupervisionEvent.RESET_ONLY) &
                (preRecoveryPhase == RecoveryPhase.OPEN)) implies
                (((constraintProposal == ConstraintProposal.ALLOW_FULL) implies
                  (recoveryAction == AcceptedAction.APPLY_FULL)) &
                 ((constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) implies
                  (recoveryAction == AcceptedAction.APPLY_RESTRICTED))));
          // @trace CASE-17
          case CASE_17_SAFE_USE "No external event preserves the selected safe full or restricted proposal":
            assume (constraintProposal == ConstraintProposal.ALLOW_FULL |
              constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
              supervisionEvent == SupervisionEvent.NONE;
            guarantee
              ((constraintProposal == ConstraintProposal.ALLOW_FULL) implies
                (recoveryAction == AcceptedAction.APPLY_FULL)) &
              ((constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) implies
                (recoveryAction == AcceptedAction.APPLY_RESTRICTED));
    }*/
  }

  // @trace PART-09
  part def RecoveryLatchOwner :> Thread {
    // @trace INT-15
    port acceptedAction : DataPort { in :>> type : AcceptedAction; }
    // @trace INT-14
    port preRecoveryPhase : DataPort { out :>> type : RecoveryPhase; }
    // @trace INT-17
    port postRecoveryPhase : DataPort { out :>> type : RecoveryPhase; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        committedRecoveryPhase: RecoveryPhase;
      initialize
        modifies committedRecoveryPhase;
        guarantee
          // @trace STATE-01
          INITIAL_RECOVERY_CLOSED "Recovery and both publications explicitly initialize closed":
            committedRecoveryPhase == RecoveryPhase.WAIT_RELEASE &
            preRecoveryPhase == RecoveryPhase.WAIT_RELEASE &
            postRecoveryPhase == RecoveryPhase.WAIT_RELEASE;
      compute
        modifies committedRecoveryPhase;
        // @trace INT-14
        guarantee PUBLISH_PRE_EVALUATION_PHASE:
          preRecoveryPhase == In(committedRecoveryPhase);
        // @trace INT-17
        guarantee PUBLISH_POST_EVALUATION_PHASE:
          postRecoveryPhase == committedRecoveryPhase;
        compute_cases
          // @trace CASE-18
          case CASE_18_CLOSED_RECOVERY_TRANSITIONS "Holds latch and reset release arms without opening":
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
              (((acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD) |
                (acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD) |
                (acceptedAction == AcceptedAction.APPLY_NAV_HOLD) |
                (acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD)) implies
                (committedRecoveryPhase == RecoveryPhase.LATCHED)) &
              ((acceptedAction == AcceptedAction.IGNORE_RESET) implies
                (committedRecoveryPhase == RecoveryPhase.WAIT_RELEASE)) &
              (((acceptedAction == AcceptedAction.APPLY_FULL |
                 acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                (In(committedRecoveryPhase) == RecoveryPhase.LATCHED |
                 In(committedRecoveryPhase) == RecoveryPhase.WAIT_RELEASE)) implies
                (committedRecoveryPhase == RecoveryPhase.ARMED));
          // @trace CASE-19
          case CASE_19_OPEN_OR_RETAIN_RECOVERY "Accepted fresh reset opens and safe use preserves an armed or open phase":
            assume acceptedAction == AcceptedAction.ACCEPT_RESET |
              ((acceptedAction == AcceptedAction.APPLY_FULL |
                acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
               (In(committedRecoveryPhase) == RecoveryPhase.ARMED |
                In(committedRecoveryPhase) == RecoveryPhase.OPEN));
            guarantee
              ((acceptedAction == AcceptedAction.ACCEPT_RESET) implies
                (committedRecoveryPhase == RecoveryPhase.OPEN)) &
              (((acceptedAction == AcceptedAction.APPLY_FULL |
                 acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                (In(committedRecoveryPhase) == RecoveryPhase.ARMED)) implies
                (committedRecoveryPhase == RecoveryPhase.ARMED)) &
              (((acceptedAction == AcceptedAction.APPLY_FULL |
                 acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
                (In(committedRecoveryPhase) == RecoveryPhase.OPEN)) implies
                (committedRecoveryPhase == RecoveryPhase.OPEN));
    }*/
  }

  // @trace PART-10
  part def SupervisionOutcomeOwner :> Thread {
    // @trace INT-16
    port acceptedAction : DataPort { in :>> type : AcceptedAction; }
    // @trace INT-17
    port postRecoveryPhase : DataPort { in :>> type : RecoveryPhase; }
    // @trace INT-18
    port navigationBasis : DataPort { in :>> type : NavigationBasis; }
    // @trace INT-19
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    // @trace INT-20
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    // @trace INT-21
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace STATE-01
          INITIAL_SAFE_OUTPUTS "The controlled boundary explicitly initializes inhibited and unavailable":
            navigationUseDirective == NavigationUseDirective.MOTION_INHIBITED &
            obstacleAwarenessNotice == ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE &
            supervisionStatus == SupervisionStatus.STARTUP_HOLD;
      compute
        compute_cases
          // @trace CASE-20
          case CASE_20_JOINT_OUTCOME "Reachable action phase and basis triples derive one consistent output triple":
            guarantee
              ((postRecoveryPhase != RecoveryPhase.OPEN) implies
                (navigationUseDirective == NavigationUseDirective.MOTION_INHIBITED)) &
              (((postRecoveryPhase == RecoveryPhase.OPEN) &
                (navigationBasis == NavigationBasis.FULL_BASIS) &
                ((acceptedAction == AcceptedAction.APPLY_FULL) |
                 (acceptedAction == AcceptedAction.ACCEPT_RESET))) implies
                ((navigationUseDirective == NavigationUseDirective.FULL_NAV_USE) &
                 (supervisionStatus == SupervisionStatus.FULL_USE))) &
              (((postRecoveryPhase == RecoveryPhase.OPEN) &
                ((navigationBasis == NavigationBasis.RELATIVE_BASIS) |
                 (navigationBasis == NavigationBasis.LIMITED_BASIS)) &
                ((acceptedAction == AcceptedAction.APPLY_RESTRICTED) |
                 (acceptedAction == AcceptedAction.ACCEPT_RESET))) implies
                ((navigationUseDirective == NavigationUseDirective.RESTRICTED_NAV_USE) &
                 (supervisionStatus == SupervisionStatus.RESTRICTED_USE))) &
              (((postRecoveryPhase != RecoveryPhase.OPEN) &
                (acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD)) implies
                (supervisionStatus == SupervisionStatus.HELD_OBSTACLE_INDICATION)) &
              (((postRecoveryPhase != RecoveryPhase.OPEN) &
                (acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD)) implies
                (supervisionStatus == SupervisionStatus.HELD_AWARENESS_LOSS)) &
              (((postRecoveryPhase != RecoveryPhase.OPEN) &
                (acceptedAction == AcceptedAction.APPLY_NAV_HOLD)) implies
                (supervisionStatus == SupervisionStatus.HELD_NAV_EVIDENCE)) &
              (((postRecoveryPhase != RecoveryPhase.OPEN) &
                (acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD)) implies
                (supervisionStatus == SupervisionStatus.HELD_EXTERNAL)) &
              (((postRecoveryPhase == RecoveryPhase.WAIT_RELEASE) &
                ((acceptedAction == AcceptedAction.IGNORE_RESET) |
                 (acceptedAction == AcceptedAction.APPLY_FULL) |
                 (acceptedAction == AcceptedAction.APPLY_RESTRICTED))) implies
                (supervisionStatus == SupervisionStatus.RESET_RELEASE_REQUIRED)) &
              (((postRecoveryPhase == RecoveryPhase.ARMED) &
                ((acceptedAction == AcceptedAction.APPLY_FULL) |
                 (acceptedAction == AcceptedAction.APPLY_RESTRICTED))) implies
                (supervisionStatus == SupervisionStatus.RESET_REQUIRED)) &
              ((acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD) implies
                (obstacleAwarenessNotice == ObstacleAwarenessNotice.CURRENT_INDICATION)) &
              ((acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD) implies
                (obstacleAwarenessNotice == ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE)) &
              (((acceptedAction != AcceptedAction.APPLY_OBSTACLE_HOLD) &
                (acceptedAction != AcceptedAction.APPLY_AWARENESS_HOLD)) implies
                (obstacleAwarenessNotice == ObstacleAwarenessNotice.NO_CURRENT_INDICATION));
    }*/
  }

  // @generated-support behavior-free physical container authorized by MODEL-RES-03
  part def SupervisorProcess :> Process {
    // @generated-support root-to-Process routing port for MON-01
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @generated-support root-to-Process routing port for MON-02
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @generated-support root-to-Process routing port for MON-03
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @generated-support root-to-Process routing port for MON-04
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    // @generated-support root-to-Process routing port for MON-05
    port motionContext : DataPort { in :>> type : MotionContext; }
    // @generated-support root-to-Process routing port for MON-06
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    // @generated-support Process-to-root routing port for CTRL-01
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    // @generated-support Process-to-root routing port for CTRL-02
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    // @generated-support Process-to-root routing port for CTRL-03
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    // @trace PART-01
    part gpsEvidenceQualifier : GpsEvidenceQualifier;
    // @trace PART-02
    part inertialEvidenceQualifier : InertialEvidenceQualifier;
    // @trace PART-03
    part barometricEvidenceQualifier : BarometricEvidenceQualifier;
    // @trace PART-04
    part obstacleEvidenceQualifier : ObstacleEvidenceQualifier;
    // @trace PART-05
    part navigationBasisOwner : NavigationBasisOwner;
    // @trace PART-06
    part awarenessConditionOwner : AwarenessConditionOwner;
    // @trace PART-07
    part constraintProposalOwner : ConstraintProposalOwner;
    // @trace PART-08
    part eventPriorityArbiter : EventPriorityArbiter;
    // @trace PART-09
    part recoveryLatchOwner : RecoveryLatchOwner;
    // @trace PART-10
    part supervisionOutcomeOwner : SupervisionOutcomeOwner;

    // @trace INT-01
    connection int01 : PortConnection connect gpsEvidence to gpsEvidenceQualifier.gpsEvidence;
    // @trace INT-02
    connection int02 : PortConnection connect inertialEvidence to inertialEvidenceQualifier.inertialEvidence;
    // @trace INT-03
    connection int03 : PortConnection connect barometricEvidence to barometricEvidenceQualifier.barometricEvidence;
    // @trace INT-04
    connection int04 : PortConnection connect obstacleEvidence to obstacleEvidenceQualifier.obstacleEvidence;
    // @trace INT-05
    connection int05 : PortConnection connect motionContext to awarenessConditionOwner.motionContext;
    // @trace INT-06
    connection int06 : PortConnection connect supervisionEvent to eventPriorityArbiter.supervisionEvent;
    // @trace INT-07
    connection int07 : PortConnection connect gpsEvidenceQualifier.gpsAssessment to navigationBasisOwner.gpsAssessment;
    // @trace INT-08
    connection int08 : PortConnection connect inertialEvidenceQualifier.inertialAssessment to navigationBasisOwner.inertialAssessment;
    // @trace INT-09
    connection int09 : PortConnection connect barometricEvidenceQualifier.barometricAssessment to navigationBasisOwner.barometricAssessment;
    // @trace INT-10
    connection int10 : PortConnection connect obstacleEvidenceQualifier.obstacleAssessment to awarenessConditionOwner.obstacleAssessment;
    // @trace INT-11
    connection int11 : PortConnection connect navigationBasisOwner.proposalBasis to constraintProposalOwner.navigationBasis;
    // @trace INT-12
    connection int12 : PortConnection connect awarenessConditionOwner.awarenessCondition to constraintProposalOwner.awarenessCondition;
    // @trace INT-13
    connection int13 : PortConnection connect constraintProposalOwner.constraintProposal to eventPriorityArbiter.constraintProposal;
    // @trace INT-14
    connection int14 : PortConnection connect recoveryLatchOwner.preRecoveryPhase to eventPriorityArbiter.preRecoveryPhase;
    // @trace INT-15
    connection int15 : PortConnection connect eventPriorityArbiter.recoveryAction to recoveryLatchOwner.acceptedAction;
    // @trace INT-16
    connection int16 : PortConnection connect eventPriorityArbiter.outcomeAction to supervisionOutcomeOwner.acceptedAction;
    // @trace INT-17
    connection int17 : PortConnection connect recoveryLatchOwner.postRecoveryPhase to supervisionOutcomeOwner.postRecoveryPhase;
    // @trace INT-18
    connection int18 : PortConnection connect navigationBasisOwner.outcomeBasis to supervisionOutcomeOwner.navigationBasis;
    // @trace INT-19
    connection int19 : PortConnection connect supervisionOutcomeOwner.navigationUseDirective to navigationUseDirective;
    // @trace INT-20
    connection int20 : PortConnection connect supervisionOutcomeOwner.obstacleAwarenessNotice to obstacleAwarenessNotice;
    // @trace INT-21
    connection int21 : PortConnection connect supervisionOutcomeOwner.supervisionStatus to supervisionStatus;
  }

  // @trace BOUND-01
  part def NavigationObstacleAwarenessUseSupervisorSystem :> System {
    // @trace MON-01
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @trace MON-02
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @trace MON-03
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    // @trace MON-04
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    // @trace MON-05
    port motionContext : DataPort { in :>> type : MotionContext; }
    // @trace MON-06
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    // @trace CTRL-01
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    // @trace CTRL-02
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    // @trace CTRL-03
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    // @generated-support behavior-free containment usage authorized by MODEL-RES-03
    part supervisorProcess : SupervisorProcess;

    // @generated-support transparent route for MON-01
    connection supportGpsEvidence : PortConnection connect gpsEvidence to supervisorProcess.gpsEvidence;
    // @generated-support transparent route for MON-02
    connection supportInertialEvidence : PortConnection connect inertialEvidence to supervisorProcess.inertialEvidence;
    // @generated-support transparent route for MON-03
    connection supportBarometricEvidence : PortConnection connect barometricEvidence to supervisorProcess.barometricEvidence;
    // @generated-support transparent route for MON-04
    connection supportObstacleEvidence : PortConnection connect obstacleEvidence to supervisorProcess.obstacleEvidence;
    // @generated-support transparent route for MON-05
    connection supportMotionContext : PortConnection connect motionContext to supervisorProcess.motionContext;
    // @generated-support transparent route for MON-06
    connection supportSupervisionEvent : PortConnection connect supervisionEvent to supervisorProcess.supervisionEvent;
    // @generated-support transparent route for CTRL-01
    connection supportDirective : PortConnection connect supervisorProcess.navigationUseDirective to navigationUseDirective;
    // @generated-support transparent route for CTRL-02
    connection supportNotice : PortConnection connect supervisorProcess.obstacleAwarenessNotice to obstacleAwarenessNotice;
    // @generated-support transparent route for CTRL-03
    connection supportStatus : PortConnection connect supervisorProcess.supervisionStatus to supervisionStatus;
  }

  // @trace BOUND-01
  part navigationObstacleAwarenessUseSupervisor : NavigationObstacleAwarenessUseSupervisorSystem;
}
