// Architecture-stage source: approved types, ports, usages, and connections only.
// GUMBO behavior is added only after this retained architecture passes HAMR tipe.

// @trace PURPOSE-01
package Docked_Service_Access_Lifecycle_Supervisor {
  private import HAMR::*;

  // Exact boundary domains.
  // @trace MON-01
  enum def PilotIntent {
    enum NONE; enum FRESH_DOCK; enum REPEATED_DOCK; enum FRESH_UNDOCK;
    enum REPEATED_UNDOCK; enum FRESH_RESET; enum REPEATED_RESET; enum INVALID;
  }
  // @trace MON-02
  enum def BerthObservation {
    enum APPROACH_CLEAR; enum DOCKED_SECURE; enum DEPARTURE_CLEAR;
    enum RELEASED; enum BLOCKED; enum INVALID;
  }
  // @trace MON-03
  enum def ShipCondition {
    enum APPROACH_READY; enum SERVICE_READY; enum DEPARTURE_READY;
    enum TRANSIT; enum NOT_READY; enum INVALID;
  }
  // @trace MON-04
  enum def ServiceSignal {
    enum QUIESCENT; enum REQUEST; enum ACTIVE; enum COMPLETE; enum FAULT; enum INVALID;
  }
  // @trace CTRL-01
  enum def MovementDirective { enum HOLD; enum PERMIT_DOCK; enum PERMIT_UNDOCK; }
  // @trace CTRL-02
  enum def ServiceAccess { enum LOCKED; enum ENABLED; }
  // @trace CTRL-03
  enum def PilotLifecycleReport {
    enum OUTSIDE_IDLE; enum DOCK_PERMITTED; enum DOCKED_READY; enum SERVICE_GRANTED;
    enum SERVICE_ACTIVE; enum SERVICE_FINISHED; enum UNDOCK_DEFERRED;
    enum UNDOCK_PERMITTED; enum RELEASE_CONFIRMED; enum INHIBITED;
    enum RECOVERY_REQUIRED; enum RESET_COMPLETE;
  }
  // @trace CTRL-04
  enum def StationAccessReport {
    enum NO_ACCESS; enum DOCK_EXPECTED; enum ACCESS_AVAILABLE; enum ACCESS_RESERVED;
    enum ACCESS_OCCUPIED; enum DEPARTURE_EXPECTED; enum ACCESS_INHIBITED;
    enum RECOVERY_REQUIRED;
  }

  // Owner-local finite facts.
  // @trace TYPE-01
  enum def QualifiedIntent {
    enum NO_ACTION; enum DOCK_REQUEST; enum UNDOCK_REQUEST;
    enum RESET_REQUEST; enum INTENT_FAULT;
  }
  // @trace TYPE-02
  enum def DockReadiness {
    enum DOCK_READY; enum SERVICE_READY; enum UNDOCK_READY; enum RELEASE_CONFIRMED;
    enum TEMPORARILY_BLOCKED; enum READINESS_CONFLICT; enum READINESS_FAULT;
  }
  // @trace TYPE-03
  enum def ServiceInterlock {
    enum QUIESCENT; enum SINGLE_DEMAND; enum SINGLE_ACTIVE; enum SINGLE_COMPLETION;
    enum SERVICE_CONFLICT; enum SERVICE_FAULT;
  }
  // @trace TYPE-04
  enum def LifecycleState {
    enum IDLE_OUTSIDE; enum DOCK_CLEARANCE_LATCHED; enum DOCKED_ACCESS_LOCKED;
    enum SERVICE_ACCESS_GRANTED; enum SERVICE_IN_PROGRESS;
    enum UNDOCK_CLEARANCE_LATCHED; enum RECOVERY_REQUIRED;
  }
  // @trace TYPE-05
  enum def OperationalAssessment {
    enum OUTSIDE_STABLE; enum DOCK_ELIGIBLE; enum DOCK_WAITING; enum DOCK_CONFIRMED;
    enum DOCKED_QUIESCENT; enum SERVICE_DEMAND_READY; enum SERVICE_GRANT_PENDING;
    enum SERVICE_OCCUPIED; enum SERVICE_RELEASED; enum SERVICE_WITHDRAWN;
    enum UNDOCK_ELIGIBLE; enum UNDOCK_WAITING; enum RELEASE_CONFIRMED;
    enum RECOVERY_CLEARABLE; enum TEMPORARILY_BLOCKED;
    enum ASSESSMENT_CONFLICT; enum ASSESSMENT_FAULT;
  }
  // @trace TYPE-06
  enum def AdmittedDirective {
    enum ENTER_RECOVERY_FAULT; enum ENTER_RECOVERY_CONFLICT; enum RESET_RECOVERY;
    enum HOLD_RECOVERY; enum FINISH_SERVICE_DEFER_UNDOCK; enum FINISH_SERVICE;
    enum DEFER_UNDOCK; enum HOLD_ACTIVE_SERVICE; enum START_SERVICE;
    enum HOLD_SERVICE_GRANT; enum WITHDRAW_SERVICE_GRANT; enum CONFIRM_RELEASE;
    enum HOLD_UNDOCK_CLEARANCE; enum CONFIRM_DOCK; enum HOLD_DOCK_CLEARANCE;
    enum AUTHORIZE_UNDOCK; enum GRANT_SERVICE_ACCESS; enum AUTHORIZE_DOCK;
    enum INHIBIT_ACTION; enum HOLD_STABLE;
  }
  // @trace TYPE-07
  enum def MovementProposal { enum HOLD_MOVEMENT; enum AUTHORIZE_DOCK; enum AUTHORIZE_UNDOCK; }
  // @trace TYPE-07
  enum def AccessProposal { enum LOCK_ACCESS; enum ENABLE_ACCESS; }
  // @trace TYPE-08
  enum def LifecycleResult {
    enum NONE; enum DOCK_ACCEPTED; enum DOCK_CONFIRMED; enum SERVICE_GRANTED;
    enum SERVICE_RUNNING; enum SERVICE_FINISHED; enum UNDOCK_DEFERRED;
    enum UNDOCK_ACCEPTED; enum RELEASED; enum INHIBITED;
    enum RECOVERY_LATCHED; enum RESET_COMPLETE;
  }
  // @generated-support Tool-required bijective wire encoding of TYPE-08 next state; no credit.
  enum def SnapshotLifecycleState {
    enum IDLE_OUTSIDE; enum DOCK_CLEARANCE_LATCHED; enum DOCKED_ACCESS_LOCKED;
    enum SERVICE_ACCESS_GRANTED; enum SERVICE_IN_PROGRESS;
    enum UNDOCK_CLEARANCE_LATCHED; enum RECOVERY_REQUIRED;
  }

  // Every record field inspected by GUMBO is represented as an attribute.
  // @trace TYPE-07
  part def ControlProposal :> Data {
    attribute movement : MovementProposal;
    attribute access : AccessProposal;
  }
  // @trace TYPE-08
  part def LifecycleSnapshot :> Data {
    attribute next_state : SnapshotLifecycleState;
    attribute result : LifecycleResult;
  }
  // @trace TYPE-09
  part def GatedControl :> Data {
    attribute movement : MovementDirective;
    attribute access : ServiceAccess;
  }

  // @trace PART-01
  part def IntentQualifier :> Thread {
    // @trace INT-01
    port pilotIntent : DataPort { in :>> type : PilotIntent; }
    // @trace INT-06
    port qualifiedIntent : DataPort { out :>> type : QualifiedIntent; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee INTENT_INITIAL_SAFE:
          qualifiedIntent == QualifiedIntent.NO_ACTION;
      compute
        compute_cases
          // @trace LOCAL-01
          case INTENT_INVALID:
            assume pilotIntent == PilotIntent.INVALID;
            guarantee qualifiedIntent == QualifiedIntent.INTENT_FAULT;
          // @trace LOCAL-01
          case INTENT_FRESH_DOCK:
            assume pilotIntent == PilotIntent.FRESH_DOCK;
            guarantee qualifiedIntent == QualifiedIntent.DOCK_REQUEST;
          // @trace LOCAL-01
          case INTENT_FRESH_UNDOCK:
            assume pilotIntent == PilotIntent.FRESH_UNDOCK;
            guarantee qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST;
          // @trace LOCAL-01
          case INTENT_FRESH_RESET:
            assume pilotIntent == PilotIntent.FRESH_RESET;
            guarantee qualifiedIntent == QualifiedIntent.RESET_REQUEST;
          // @trace LOCAL-01
          case INTENT_NO_ACTION:
            assume pilotIntent == PilotIntent.NONE |
                   pilotIntent == PilotIntent.REPEATED_DOCK |
                   pilotIntent == PilotIntent.REPEATED_UNDOCK |
                   pilotIntent == PilotIntent.REPEATED_RESET;
            guarantee qualifiedIntent == QualifiedIntent.NO_ACTION;
    }*/
  }

  // @trace PART-02
  part def DockReadinessQualifier :> Thread {
    // @trace INT-02
    port berthObservation : DataPort { in :>> type : BerthObservation; }
    // @trace INT-03
    port shipCondition : DataPort { in :>> type : ShipCondition; }
    // @trace INT-07
    port monitorReadiness : DataPort { out :>> type : DockReadiness; }
    // @trace INT-14
    port gateReadiness : DataPort { out :>> type : DockReadiness; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee READINESS_INITIAL_SAFE:
          monitorReadiness == DockReadiness.READINESS_FAULT &
          gateReadiness == DockReadiness.READINESS_FAULT;
      compute
        // @trace LOCAL-02
        guarantee READINESS_CONSUMER_AGREEMENT:
          gateReadiness == monitorReadiness;
        compute_cases
          // @trace LOCAL-02
          case READINESS_INVALID:
            assume berthObservation == BerthObservation.INVALID |
                   shipCondition == ShipCondition.INVALID;
            guarantee monitorReadiness == DockReadiness.READINESS_FAULT;
          // @trace LOCAL-02
          case READINESS_DOCK:
            assume berthObservation != BerthObservation.INVALID &
                   shipCondition != ShipCondition.INVALID &
                   berthObservation == BerthObservation.APPROACH_CLEAR &
                   shipCondition == ShipCondition.APPROACH_READY;
            guarantee monitorReadiness == DockReadiness.DOCK_READY;
          // @trace LOCAL-02
          case READINESS_SERVICE:
            assume berthObservation != BerthObservation.INVALID &
                   shipCondition != ShipCondition.INVALID &
                   berthObservation == BerthObservation.DOCKED_SECURE &
                   shipCondition == ShipCondition.SERVICE_READY;
            guarantee monitorReadiness == DockReadiness.SERVICE_READY;
          // @trace LOCAL-02
          case READINESS_UNDOCK:
            assume berthObservation != BerthObservation.INVALID &
                   shipCondition != ShipCondition.INVALID &
                   berthObservation == BerthObservation.DEPARTURE_CLEAR &
                   shipCondition == ShipCondition.DEPARTURE_READY;
            guarantee monitorReadiness == DockReadiness.UNDOCK_READY;
          // @trace LOCAL-02
          case READINESS_RELEASED:
            assume berthObservation != BerthObservation.INVALID &
                   shipCondition != ShipCondition.INVALID &
                   berthObservation == BerthObservation.RELEASED &
                   shipCondition == ShipCondition.TRANSIT;
            guarantee monitorReadiness == DockReadiness.RELEASE_CONFIRMED;
          // @trace LOCAL-02
          case READINESS_BLOCKED:
            assume berthObservation != BerthObservation.INVALID &
                   shipCondition != ShipCondition.INVALID &
                   not (berthObservation == BerthObservation.APPROACH_CLEAR &
                        shipCondition == ShipCondition.APPROACH_READY) &
                   not (berthObservation == BerthObservation.DOCKED_SECURE &
                        shipCondition == ShipCondition.SERVICE_READY) &
                   not (berthObservation == BerthObservation.DEPARTURE_CLEAR &
                        shipCondition == ShipCondition.DEPARTURE_READY) &
                   not (berthObservation == BerthObservation.RELEASED &
                        shipCondition == ShipCondition.TRANSIT) &
                   (berthObservation == BerthObservation.BLOCKED |
                    shipCondition == ShipCondition.NOT_READY);
            guarantee monitorReadiness == DockReadiness.TEMPORARILY_BLOCKED;
          // @trace LOCAL-02
          case READINESS_CONTRADICTION:
            assume berthObservation != BerthObservation.INVALID &
                   shipCondition != ShipCondition.INVALID &
                   not (berthObservation == BerthObservation.APPROACH_CLEAR &
                        shipCondition == ShipCondition.APPROACH_READY) &
                   not (berthObservation == BerthObservation.DOCKED_SECURE &
                        shipCondition == ShipCondition.SERVICE_READY) &
                   not (berthObservation == BerthObservation.DEPARTURE_CLEAR &
                        shipCondition == ShipCondition.DEPARTURE_READY) &
                   not (berthObservation == BerthObservation.RELEASED &
                        shipCondition == ShipCondition.TRANSIT) &
                   berthObservation != BerthObservation.BLOCKED &
                   shipCondition != ShipCondition.NOT_READY;
            guarantee monitorReadiness == DockReadiness.READINESS_CONFLICT;
    }*/
  }

  // @trace PART-03
  part def ServiceInterlockQualifier :> Thread {
    // @trace INT-04
    port repairSignal : DataPort { in :>> type : ServiceSignal; }
    // @trace INT-05
    port resupplySignal : DataPort { in :>> type : ServiceSignal; }
    // @trace INT-08
    port monitorInterlock : DataPort { out :>> type : ServiceInterlock; }
    // @trace INT-15
    port gateInterlock : DataPort { out :>> type : ServiceInterlock; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee INTERLOCK_INITIAL_SAFE:
          monitorInterlock == ServiceInterlock.SERVICE_FAULT &
          gateInterlock == ServiceInterlock.SERVICE_FAULT;
      compute
        // @trace LOCAL-03
        guarantee INTERLOCK_CONSUMER_AGREEMENT:
          gateInterlock == monitorInterlock;
        compute_cases
          // @trace LOCAL-03
          case INTERLOCK_FAULT:
            assume repairSignal == ServiceSignal.FAULT |
                   repairSignal == ServiceSignal.INVALID |
                   resupplySignal == ServiceSignal.FAULT |
                   resupplySignal == ServiceSignal.INVALID;
            guarantee monitorInterlock == ServiceInterlock.SERVICE_FAULT;
          // @trace LOCAL-03
          case INTERLOCK_QUIESCENT:
            assume repairSignal == ServiceSignal.QUIESCENT &
                   resupplySignal == ServiceSignal.QUIESCENT;
            guarantee monitorInterlock == ServiceInterlock.QUIESCENT;
          // @trace LOCAL-03
          case INTERLOCK_SINGLE_DEMAND:
            assume (repairSignal == ServiceSignal.REQUEST &
                    resupplySignal == ServiceSignal.QUIESCENT) |
                   (repairSignal == ServiceSignal.QUIESCENT &
                    resupplySignal == ServiceSignal.REQUEST);
            guarantee monitorInterlock == ServiceInterlock.SINGLE_DEMAND;
          // @trace LOCAL-03
          case INTERLOCK_SINGLE_ACTIVE:
            assume (repairSignal == ServiceSignal.ACTIVE &
                    resupplySignal == ServiceSignal.QUIESCENT) |
                   (repairSignal == ServiceSignal.QUIESCENT &
                    resupplySignal == ServiceSignal.ACTIVE);
            guarantee monitorInterlock == ServiceInterlock.SINGLE_ACTIVE;
          // @trace LOCAL-03
          case INTERLOCK_SINGLE_COMPLETION:
            assume (repairSignal == ServiceSignal.COMPLETE &
                    resupplySignal == ServiceSignal.QUIESCENT) |
                   (repairSignal == ServiceSignal.QUIESCENT &
                    resupplySignal == ServiceSignal.COMPLETE);
            guarantee monitorInterlock == ServiceInterlock.SINGLE_COMPLETION;
          // @trace LOCAL-03
          case INTERLOCK_CONFLICT:
            assume repairSignal != ServiceSignal.FAULT &
                   repairSignal != ServiceSignal.INVALID &
                   resupplySignal != ServiceSignal.FAULT &
                   resupplySignal != ServiceSignal.INVALID &
                   not (repairSignal == ServiceSignal.QUIESCENT &
                        resupplySignal == ServiceSignal.QUIESCENT) &
                   not (repairSignal == ServiceSignal.REQUEST &
                        resupplySignal == ServiceSignal.QUIESCENT) &
                   not (repairSignal == ServiceSignal.QUIESCENT &
                        resupplySignal == ServiceSignal.REQUEST) &
                   not (repairSignal == ServiceSignal.ACTIVE &
                        resupplySignal == ServiceSignal.QUIESCENT) &
                   not (repairSignal == ServiceSignal.QUIESCENT &
                        resupplySignal == ServiceSignal.ACTIVE) &
                   not (repairSignal == ServiceSignal.COMPLETE &
                        resupplySignal == ServiceSignal.QUIESCENT) &
                   not (repairSignal == ServiceSignal.QUIESCENT &
                        resupplySignal == ServiceSignal.COMPLETE);
            guarantee monitorInterlock == ServiceInterlock.SERVICE_CONFLICT;
    }*/
  }

  // @trace PART-04
  part def LifecycleConsistencyMonitor :> Thread {
    // @trace INT-07
    port dockReadiness : DataPort { in :>> type : DockReadiness; }
    // @trace INT-08
    port serviceInterlock : DataPort { in :>> type : ServiceInterlock; }
    // @trace INT-09
    port lifecyclePrestate : DataPort { in :>> type : LifecycleState; }
    // @trace INT-10
    port operationalAssessment : DataPort { out :>> type : OperationalAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee ASSESSMENT_INITIAL_SAFE:
          operationalAssessment == OperationalAssessment.ASSESSMENT_FAULT;
      compute
        // @trace LOCAL-04
        guarantee ASSESSMENT_TOTAL_RELATION:
          ((dockReadiness == DockReadiness.READINESS_FAULT |
            serviceInterlock == ServiceInterlock.SERVICE_FAULT) &
            operationalAssessment == OperationalAssessment.ASSESSMENT_FAULT) |
          ((dockReadiness != DockReadiness.READINESS_FAULT &
            serviceInterlock != ServiceInterlock.SERVICE_FAULT) &
           (dockReadiness == DockReadiness.READINESS_CONFLICT |
            serviceInterlock == ServiceInterlock.SERVICE_CONFLICT) &
            operationalAssessment == OperationalAssessment.ASSESSMENT_CONFLICT) |
          ((dockReadiness != DockReadiness.READINESS_FAULT &
            serviceInterlock != ServiceInterlock.SERVICE_FAULT &
            dockReadiness != DockReadiness.READINESS_CONFLICT &
            serviceInterlock != ServiceInterlock.SERVICE_CONFLICT) &
            dockReadiness == DockReadiness.TEMPORARILY_BLOCKED &
            operationalAssessment == OperationalAssessment.TEMPORARILY_BLOCKED) |
          (lifecyclePrestate == LifecycleState.IDLE_OUTSIDE &
            dockReadiness == DockReadiness.RELEASE_CONFIRMED &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.OUTSIDE_STABLE) |
          (lifecyclePrestate == LifecycleState.IDLE_OUTSIDE &
            dockReadiness == DockReadiness.DOCK_READY &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.DOCK_ELIGIBLE) |
          (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
            dockReadiness == DockReadiness.DOCK_READY &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.DOCK_WAITING) |
          (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
            dockReadiness == DockReadiness.SERVICE_READY &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.DOCK_CONFIRMED) |
          (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
            dockReadiness == DockReadiness.SERVICE_READY &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.DOCKED_QUIESCENT) |
          (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
            dockReadiness == DockReadiness.SERVICE_READY &
            serviceInterlock == ServiceInterlock.SINGLE_DEMAND &
            operationalAssessment == OperationalAssessment.SERVICE_DEMAND_READY) |
          (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
            dockReadiness == DockReadiness.UNDOCK_READY &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.UNDOCK_ELIGIBLE) |
          (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
            dockReadiness == DockReadiness.SERVICE_READY &
            serviceInterlock == ServiceInterlock.SINGLE_DEMAND &
            operationalAssessment == OperationalAssessment.SERVICE_GRANT_PENDING) |
          (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
            dockReadiness == DockReadiness.SERVICE_READY &
            serviceInterlock == ServiceInterlock.SINGLE_ACTIVE &
            operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED) |
          (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
            dockReadiness == DockReadiness.SERVICE_READY &
            (serviceInterlock == ServiceInterlock.QUIESCENT |
             serviceInterlock == ServiceInterlock.SINGLE_COMPLETION) &
            operationalAssessment == OperationalAssessment.SERVICE_WITHDRAWN) |
          (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
            dockReadiness == DockReadiness.SERVICE_READY &
            serviceInterlock == ServiceInterlock.SINGLE_ACTIVE &
            operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED) |
          (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
            dockReadiness == DockReadiness.SERVICE_READY &
            serviceInterlock == ServiceInterlock.SINGLE_COMPLETION &
            operationalAssessment == OperationalAssessment.SERVICE_RELEASED) |
          (lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
            dockReadiness == DockReadiness.UNDOCK_READY &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.UNDOCK_WAITING) |
          (lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
            dockReadiness == DockReadiness.RELEASE_CONFIRMED &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.RELEASE_CONFIRMED) |
          (lifecyclePrestate == LifecycleState.RECOVERY_REQUIRED &
            dockReadiness == DockReadiness.RELEASE_CONFIRMED &
            serviceInterlock == ServiceInterlock.QUIESCENT &
            operationalAssessment == OperationalAssessment.RECOVERY_CLEARABLE) |
          (((dockReadiness != DockReadiness.READINESS_FAULT &
             serviceInterlock != ServiceInterlock.SERVICE_FAULT &
             dockReadiness != DockReadiness.READINESS_CONFLICT &
             serviceInterlock != ServiceInterlock.SERVICE_CONFLICT &
             dockReadiness != DockReadiness.TEMPORARILY_BLOCKED) &
            not (lifecyclePrestate == LifecycleState.IDLE_OUTSIDE &
                 dockReadiness == DockReadiness.RELEASE_CONFIRMED &
                 serviceInterlock == ServiceInterlock.QUIESCENT) &
            not (lifecyclePrestate == LifecycleState.IDLE_OUTSIDE &
                 dockReadiness == DockReadiness.DOCK_READY &
                 serviceInterlock == ServiceInterlock.QUIESCENT) &
            not (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
                 dockReadiness == DockReadiness.DOCK_READY &
                 serviceInterlock == ServiceInterlock.QUIESCENT) &
            not (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
                 dockReadiness == DockReadiness.SERVICE_READY &
                 serviceInterlock == ServiceInterlock.QUIESCENT) &
            not (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                 dockReadiness == DockReadiness.SERVICE_READY &
                 serviceInterlock == ServiceInterlock.QUIESCENT) &
            not (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                 dockReadiness == DockReadiness.SERVICE_READY &
                 serviceInterlock == ServiceInterlock.SINGLE_DEMAND) &
            not (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                 dockReadiness == DockReadiness.UNDOCK_READY &
                 serviceInterlock == ServiceInterlock.QUIESCENT) &
            not (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                 dockReadiness == DockReadiness.SERVICE_READY &
                 (serviceInterlock == ServiceInterlock.SINGLE_DEMAND |
                  serviceInterlock == ServiceInterlock.SINGLE_ACTIVE |
                  serviceInterlock == ServiceInterlock.QUIESCENT |
                  serviceInterlock == ServiceInterlock.SINGLE_COMPLETION)) &
            not (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
                 dockReadiness == DockReadiness.SERVICE_READY &
                 (serviceInterlock == ServiceInterlock.SINGLE_ACTIVE |
                  serviceInterlock == ServiceInterlock.SINGLE_COMPLETION)) &
            not (lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
                 (dockReadiness == DockReadiness.UNDOCK_READY |
                  dockReadiness == DockReadiness.RELEASE_CONFIRMED) &
                 serviceInterlock == ServiceInterlock.QUIESCENT) &
            not (lifecyclePrestate == LifecycleState.RECOVERY_REQUIRED &
                 dockReadiness == DockReadiness.RELEASE_CONFIRMED &
                 serviceInterlock == ServiceInterlock.QUIESCENT)) &
            operationalAssessment == OperationalAssessment.ASSESSMENT_CONFLICT);
    }*/
  }

  // @trace PART-05
  part def PriorityArbiter :> Thread {
    // @trace INT-06
    port qualifiedIntent : DataPort { in :>> type : QualifiedIntent; }
    // @trace INT-10
    port operationalAssessment : DataPort { in :>> type : OperationalAssessment; }
    // @trace INT-11
    port lifecyclePrestate : DataPort { in :>> type : LifecycleState; }
    // @trace INT-12
    port admittedDirective : DataPort { out :>> type : AdmittedDirective; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee ARBITER_INITIAL_SAFE:
          admittedDirective == AdmittedDirective.HOLD_STABLE;
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_ENTER_RECOVERY_FAULT:
            assume qualifiedIntent == QualifiedIntent.INTENT_FAULT |
                   operationalAssessment == OperationalAssessment.ASSESSMENT_FAULT;
            guarantee admittedDirective == AdmittedDirective.ENTER_RECOVERY_FAULT;
          // @trace CASE-02
          case CASE_02_ENTER_RECOVERY_CONFLICT:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment == OperationalAssessment.ASSESSMENT_CONFLICT;
            guarantee admittedDirective == AdmittedDirective.ENTER_RECOVERY_CONFLICT;
          // @trace CASE-03
          case CASE_03_RESET_RECOVERY:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate == LifecycleState.RECOVERY_REQUIRED &
                   qualifiedIntent == QualifiedIntent.RESET_REQUEST &
                   operationalAssessment == OperationalAssessment.RECOVERY_CLEARABLE;
            guarantee admittedDirective == AdmittedDirective.RESET_RECOVERY;
          // @trace CASE-04
          case CASE_04_HOLD_RECOVERY:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate == LifecycleState.RECOVERY_REQUIRED &
                   not (qualifiedIntent == QualifiedIntent.RESET_REQUEST &
                        operationalAssessment == OperationalAssessment.RECOVERY_CLEARABLE);
            guarantee admittedDirective == AdmittedDirective.HOLD_RECOVERY;
          // @trace CASE-05
          case CASE_05_FINISH_SERVICE_DEFER_UNDOCK:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
                   operationalAssessment == OperationalAssessment.SERVICE_RELEASED &
                   qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST;
            guarantee admittedDirective == AdmittedDirective.FINISH_SERVICE_DEFER_UNDOCK;
          // @trace CASE-06
          case CASE_06_FINISH_SERVICE:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
                   operationalAssessment == OperationalAssessment.SERVICE_RELEASED &
                   qualifiedIntent != QualifiedIntent.UNDOCK_REQUEST;
            guarantee admittedDirective == AdmittedDirective.FINISH_SERVICE;
          // @trace CASE-07
          case CASE_07_DEFER_UNDOCK:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
                   operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED &
                   qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST;
            guarantee admittedDirective == AdmittedDirective.DEFER_UNDOCK;
          // @trace CASE-08
          case CASE_08_HOLD_ACTIVE_SERVICE:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
                   operationalAssessment != OperationalAssessment.SERVICE_RELEASED &
                   qualifiedIntent == QualifiedIntent.NO_ACTION;
            guarantee admittedDirective == AdmittedDirective.HOLD_ACTIVE_SERVICE;
          // @trace CASE-09
          case CASE_09_START_SERVICE:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                   operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED;
            guarantee admittedDirective == AdmittedDirective.START_SERVICE;
          // @trace CASE-10
          case CASE_10_HOLD_SERVICE_GRANT:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                   operationalAssessment == OperationalAssessment.SERVICE_GRANT_PENDING &
                   qualifiedIntent == QualifiedIntent.NO_ACTION;
            guarantee admittedDirective == AdmittedDirective.HOLD_SERVICE_GRANT;
          // @trace CASE-11
          case CASE_11_WITHDRAW_SERVICE_GRANT:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                   operationalAssessment == OperationalAssessment.SERVICE_WITHDRAWN;
            guarantee admittedDirective == AdmittedDirective.WITHDRAW_SERVICE_GRANT;
          // @trace CASE-12
          case CASE_12_CONFIRM_RELEASE:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
                   operationalAssessment == OperationalAssessment.RELEASE_CONFIRMED;
            guarantee admittedDirective == AdmittedDirective.CONFIRM_RELEASE;
          // @trace CASE-13
          case CASE_13_HOLD_UNDOCK_CLEARANCE:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
                   operationalAssessment != OperationalAssessment.RELEASE_CONFIRMED &
                   qualifiedIntent == QualifiedIntent.NO_ACTION;
            guarantee admittedDirective == AdmittedDirective.HOLD_UNDOCK_CLEARANCE;
          // @trace CASE-14
          case CASE_14_CONFIRM_DOCK:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
                   operationalAssessment == OperationalAssessment.DOCK_CONFIRMED;
            guarantee admittedDirective == AdmittedDirective.CONFIRM_DOCK;
          // @trace CASE-15
          case CASE_15_HOLD_DOCK_CLEARANCE:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
                   operationalAssessment != OperationalAssessment.DOCK_CONFIRMED &
                   qualifiedIntent == QualifiedIntent.NO_ACTION;
            guarantee admittedDirective == AdmittedDirective.HOLD_DOCK_CLEARANCE;
          // @trace CASE-16
          case CASE_16_AUTHORIZE_UNDOCK:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                   qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST &
                   operationalAssessment == OperationalAssessment.UNDOCK_ELIGIBLE;
            guarantee admittedDirective == AdmittedDirective.AUTHORIZE_UNDOCK;
          // @trace CASE-17
          case CASE_17_GRANT_SERVICE_ACCESS:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                   operationalAssessment == OperationalAssessment.SERVICE_DEMAND_READY;
            guarantee admittedDirective == AdmittedDirective.GRANT_SERVICE_ACCESS;
          // @trace CASE-18
          case CASE_18_AUTHORIZE_DOCK:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate == LifecycleState.IDLE_OUTSIDE &
                   qualifiedIntent == QualifiedIntent.DOCK_REQUEST &
                   operationalAssessment == OperationalAssessment.DOCK_ELIGIBLE;
            guarantee admittedDirective == AdmittedDirective.AUTHORIZE_DOCK;
          // @trace CASE-19
          case CASE_19_INHIBIT_ACTION:
            assume qualifiedIntent != QualifiedIntent.INTENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   (qualifiedIntent == QualifiedIntent.DOCK_REQUEST |
                    qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST |
                    qualifiedIntent == QualifiedIntent.RESET_REQUEST) &
                   not (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
                        operationalAssessment == OperationalAssessment.SERVICE_RELEASED) &
                   not (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS &
                        operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED &
                        qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST) &
                   not (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                        operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED) &
                   not (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                        operationalAssessment == OperationalAssessment.SERVICE_WITHDRAWN) &
                   not (lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
                        operationalAssessment == OperationalAssessment.RELEASE_CONFIRMED) &
                   not (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
                        operationalAssessment == OperationalAssessment.DOCK_CONFIRMED) &
                   not (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                        qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST &
                        operationalAssessment == OperationalAssessment.UNDOCK_ELIGIBLE) &
                   not (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                        operationalAssessment == OperationalAssessment.SERVICE_DEMAND_READY) &
                   not (lifecyclePrestate == LifecycleState.IDLE_OUTSIDE &
                        qualifiedIntent == QualifiedIntent.DOCK_REQUEST &
                        operationalAssessment == OperationalAssessment.DOCK_ELIGIBLE);
            guarantee admittedDirective == AdmittedDirective.INHIBIT_ACTION;
          // @trace CASE-20
          case CASE_20_HOLD_STABLE:
            assume qualifiedIntent == QualifiedIntent.NO_ACTION &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT &
                   operationalAssessment != OperationalAssessment.ASSESSMENT_CONFLICT &
                   lifecyclePrestate != LifecycleState.RECOVERY_REQUIRED &
                   lifecyclePrestate != LifecycleState.SERVICE_IN_PROGRESS &
                   not (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                        operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED) &
                   not (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                        operationalAssessment == OperationalAssessment.SERVICE_GRANT_PENDING) &
                   not (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED &
                        operationalAssessment == OperationalAssessment.SERVICE_WITHDRAWN) &
                   not (lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
                        operationalAssessment == OperationalAssessment.RELEASE_CONFIRMED) &
                   not (lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED) &
                   not (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED &
                        operationalAssessment == OperationalAssessment.DOCK_CONFIRMED) &
                   not (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED) &
                   not (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED &
                        operationalAssessment == OperationalAssessment.SERVICE_DEMAND_READY);
            guarantee admittedDirective == AdmittedDirective.HOLD_STABLE;
    }*/
  }

  // @trace PART-06
  part def LifecycleController :> Thread {
    // @trace INT-12
    port admittedDirective : DataPort { in :>> type : AdmittedDirective; }
    // @trace INT-09
    port monitorPrestate : DataPort { out :>> type : LifecycleState; }
    // @trace INT-11
    port arbiterPrestate : DataPort { out :>> type : LifecycleState; }
    // @trace INT-13
    port controlProposal : DataPort { out :>> type : ControlProposal; }
    // @trace INT-16
    port lifecycleSnapshot : DataPort { out :>> type : LifecycleSnapshot; }

    language "GUMBO" /*{
      state
        // @trace POL-STATE-01
        lifecycleMemory: LifecycleState;
      initialize
        modifies lifecycleMemory;
        // @trace CONSTR-02
        guarantee LIFECYCLE_INITIAL_SAFE:
          lifecycleMemory == LifecycleState.IDLE_OUTSIDE &
          monitorPrestate == LifecycleState.IDLE_OUTSIDE &
          arbiterPrestate == LifecycleState.IDLE_OUTSIDE &
          controlProposal.movement == MovementProposal.HOLD_MOVEMENT &
          controlProposal.access == AccessProposal.LOCK_ACCESS &
          lifecycleSnapshot.next_state == SnapshotLifecycleState.IDLE_OUTSIDE &
          lifecycleSnapshot.result == LifecycleResult.NONE;
      compute
        modifies lifecycleMemory;
        // @trace LOCAL-07
        guarantee PRESTATE_PUBLICATION:
          monitorPrestate == In(lifecycleMemory) &
          arbiterPrestate == In(lifecycleMemory);
        // @trace LOCAL-07
        guarantee SNAPSHOT_AND_PROPOSAL_COHERENCE:
          (((lifecycleMemory == LifecycleState.IDLE_OUTSIDE) &
             lifecycleSnapshot.next_state == SnapshotLifecycleState.IDLE_OUTSIDE) |
           ((lifecycleMemory == LifecycleState.DOCK_CLEARANCE_LATCHED) &
             lifecycleSnapshot.next_state == SnapshotLifecycleState.DOCK_CLEARANCE_LATCHED) |
           ((lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED) &
             lifecycleSnapshot.next_state == SnapshotLifecycleState.DOCKED_ACCESS_LOCKED) |
           ((lifecycleMemory == LifecycleState.SERVICE_ACCESS_GRANTED) &
             lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_ACCESS_GRANTED) |
           ((lifecycleMemory == LifecycleState.SERVICE_IN_PROGRESS) &
             lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_IN_PROGRESS) |
           ((lifecycleMemory == LifecycleState.UNDOCK_CLEARANCE_LATCHED) &
             lifecycleSnapshot.next_state == SnapshotLifecycleState.UNDOCK_CLEARANCE_LATCHED) |
           ((lifecycleMemory == LifecycleState.RECOVERY_REQUIRED) &
             lifecycleSnapshot.next_state == SnapshotLifecycleState.RECOVERY_REQUIRED)) &
          (((lifecycleMemory == LifecycleState.DOCK_CLEARANCE_LATCHED) &
             controlProposal.movement == MovementProposal.AUTHORIZE_DOCK &
             controlProposal.access == AccessProposal.LOCK_ACCESS) |
           ((lifecycleMemory == LifecycleState.UNDOCK_CLEARANCE_LATCHED) &
             controlProposal.movement == MovementProposal.AUTHORIZE_UNDOCK &
             controlProposal.access == AccessProposal.LOCK_ACCESS) |
           ((lifecycleMemory == LifecycleState.SERVICE_ACCESS_GRANTED |
             lifecycleMemory == LifecycleState.SERVICE_IN_PROGRESS) &
             controlProposal.movement == MovementProposal.HOLD_MOVEMENT &
             controlProposal.access == AccessProposal.ENABLE_ACCESS) |
           ((lifecycleMemory == LifecycleState.IDLE_OUTSIDE |
             lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED |
             lifecycleMemory == LifecycleState.RECOVERY_REQUIRED) &
             controlProposal.movement == MovementProposal.HOLD_MOVEMENT &
             controlProposal.access == AccessProposal.LOCK_ACCESS));
        compute_cases
          // @trace CASE-01
          case APPLY_CASE_01:
            assume admittedDirective == AdmittedDirective.ENTER_RECOVERY_FAULT;
            guarantee lifecycleMemory == LifecycleState.RECOVERY_REQUIRED &
                      lifecycleSnapshot.result == LifecycleResult.RECOVERY_LATCHED;
          // @trace CASE-02
          case APPLY_CASE_02:
            assume admittedDirective == AdmittedDirective.ENTER_RECOVERY_CONFLICT;
            guarantee lifecycleMemory == LifecycleState.RECOVERY_REQUIRED &
                      lifecycleSnapshot.result == LifecycleResult.RECOVERY_LATCHED;
          // @trace CASE-03
          case APPLY_CASE_03:
            assume admittedDirective == AdmittedDirective.RESET_RECOVERY;
            guarantee lifecycleMemory == LifecycleState.IDLE_OUTSIDE &
                      lifecycleSnapshot.result == LifecycleResult.RESET_COMPLETE;
          // @trace CASE-04
          case APPLY_CASE_04:
            assume admittedDirective == AdmittedDirective.HOLD_RECOVERY;
            guarantee lifecycleMemory == LifecycleState.RECOVERY_REQUIRED &
                      lifecycleSnapshot.result == LifecycleResult.RECOVERY_LATCHED;
          // @trace CASE-05
          case APPLY_CASE_05:
            assume admittedDirective == AdmittedDirective.FINISH_SERVICE_DEFER_UNDOCK;
            guarantee lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED &
                      lifecycleSnapshot.result == LifecycleResult.UNDOCK_DEFERRED;
          // @trace CASE-06
          case APPLY_CASE_06:
            assume admittedDirective == AdmittedDirective.FINISH_SERVICE;
            guarantee lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED &
                      lifecycleSnapshot.result == LifecycleResult.SERVICE_FINISHED;
          // @trace CASE-07
          case APPLY_CASE_07:
            assume admittedDirective == AdmittedDirective.DEFER_UNDOCK;
            guarantee lifecycleMemory == LifecycleState.SERVICE_IN_PROGRESS &
                      lifecycleSnapshot.result == LifecycleResult.UNDOCK_DEFERRED;
          // @trace CASE-08
          case APPLY_CASE_08:
            assume admittedDirective == AdmittedDirective.HOLD_ACTIVE_SERVICE;
            guarantee lifecycleMemory == LifecycleState.SERVICE_IN_PROGRESS &
                      lifecycleSnapshot.result == LifecycleResult.NONE;
          // @trace CASE-09
          case APPLY_CASE_09:
            assume admittedDirective == AdmittedDirective.START_SERVICE;
            guarantee lifecycleMemory == LifecycleState.SERVICE_IN_PROGRESS &
                      lifecycleSnapshot.result == LifecycleResult.SERVICE_RUNNING;
          // @trace CASE-10
          case APPLY_CASE_10:
            assume admittedDirective == AdmittedDirective.HOLD_SERVICE_GRANT;
            guarantee lifecycleMemory == LifecycleState.SERVICE_ACCESS_GRANTED &
                      lifecycleSnapshot.result == LifecycleResult.SERVICE_GRANTED;
          // @trace CASE-11
          case APPLY_CASE_11:
            assume admittedDirective == AdmittedDirective.WITHDRAW_SERVICE_GRANT;
            guarantee lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED &
                      lifecycleSnapshot.result == LifecycleResult.INHIBITED;
          // @trace CASE-12
          case APPLY_CASE_12:
            assume admittedDirective == AdmittedDirective.CONFIRM_RELEASE;
            guarantee lifecycleMemory == LifecycleState.IDLE_OUTSIDE &
                      lifecycleSnapshot.result == LifecycleResult.RELEASED;
          // @trace CASE-13
          case APPLY_CASE_13:
            assume admittedDirective == AdmittedDirective.HOLD_UNDOCK_CLEARANCE;
            guarantee lifecycleMemory == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
                      lifecycleSnapshot.result == LifecycleResult.NONE;
          // @trace CASE-14
          case APPLY_CASE_14:
            assume admittedDirective == AdmittedDirective.CONFIRM_DOCK;
            guarantee lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED &
                      lifecycleSnapshot.result == LifecycleResult.DOCK_CONFIRMED;
          // @trace CASE-15
          case APPLY_CASE_15:
            assume admittedDirective == AdmittedDirective.HOLD_DOCK_CLEARANCE;
            guarantee lifecycleMemory == LifecycleState.DOCK_CLEARANCE_LATCHED &
                      lifecycleSnapshot.result == LifecycleResult.NONE;
          // @trace CASE-16
          case APPLY_CASE_16:
            assume admittedDirective == AdmittedDirective.AUTHORIZE_UNDOCK;
            guarantee lifecycleMemory == LifecycleState.UNDOCK_CLEARANCE_LATCHED &
                      lifecycleSnapshot.result == LifecycleResult.UNDOCK_ACCEPTED;
          // @trace CASE-17
          case APPLY_CASE_17:
            assume admittedDirective == AdmittedDirective.GRANT_SERVICE_ACCESS;
            guarantee lifecycleMemory == LifecycleState.SERVICE_ACCESS_GRANTED &
                      lifecycleSnapshot.result == LifecycleResult.SERVICE_GRANTED;
          // @trace CASE-18
          case APPLY_CASE_18:
            assume admittedDirective == AdmittedDirective.AUTHORIZE_DOCK;
            guarantee lifecycleMemory == LifecycleState.DOCK_CLEARANCE_LATCHED &
                      lifecycleSnapshot.result == LifecycleResult.DOCK_ACCEPTED;
          // @trace CASE-19
          case APPLY_CASE_19:
            assume admittedDirective == AdmittedDirective.INHIBIT_ACTION;
            guarantee lifecycleMemory == In(lifecycleMemory) &
                      lifecycleSnapshot.result == LifecycleResult.INHIBITED;
          // @trace CASE-20
          case APPLY_CASE_20:
            assume admittedDirective == AdmittedDirective.HOLD_STABLE;
            guarantee lifecycleMemory == In(lifecycleMemory) &
                      lifecycleSnapshot.result == LifecycleResult.NONE;
    }*/
  }

  // @trace PART-07
  part def MovementAndAccessSafetyGate :> Thread {
    // @trace INT-13
    port controlProposal : DataPort { in :>> type : ControlProposal; }
    // @trace INT-14
    port dockReadiness : DataPort { in :>> type : DockReadiness; }
    // @trace INT-15
    port serviceInterlock : DataPort { in :>> type : ServiceInterlock; }
    // @trace INT-17
    port gatedControl : DataPort { out :>> type : GatedControl; }
    // @trace INT-18
    port movementDirective : DataPort { out :>> type : MovementDirective; }
    // @trace INT-19
    port serviceAccess : DataPort { out :>> type : ServiceAccess; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee GATE_INITIAL_SAFE:
          movementDirective == MovementDirective.HOLD &
          serviceAccess == ServiceAccess.LOCKED &
          gatedControl.movement == MovementDirective.HOLD &
          gatedControl.access == ServiceAccess.LOCKED;
      compute
        // @trace LOCAL-08
        guarantee MOVEMENT_GATE:
          (((controlProposal.movement == MovementProposal.AUTHORIZE_DOCK &
             dockReadiness == DockReadiness.DOCK_READY &
             serviceInterlock == ServiceInterlock.QUIESCENT) &
             movementDirective == MovementDirective.PERMIT_DOCK) |
           ((controlProposal.movement == MovementProposal.AUTHORIZE_UNDOCK &
             dockReadiness == DockReadiness.UNDOCK_READY &
             serviceInterlock == ServiceInterlock.QUIESCENT) &
             movementDirective == MovementDirective.PERMIT_UNDOCK) |
           ((not (controlProposal.movement == MovementProposal.AUTHORIZE_DOCK &
                  dockReadiness == DockReadiness.DOCK_READY &
                  serviceInterlock == ServiceInterlock.QUIESCENT) &
             not (controlProposal.movement == MovementProposal.AUTHORIZE_UNDOCK &
                  dockReadiness == DockReadiness.UNDOCK_READY &
                  serviceInterlock == ServiceInterlock.QUIESCENT)) &
             movementDirective == MovementDirective.HOLD));
        // @trace LOCAL-08
        guarantee ACCESS_GATE:
          (((controlProposal.access == AccessProposal.ENABLE_ACCESS &
             dockReadiness == DockReadiness.SERVICE_READY &
             (serviceInterlock == ServiceInterlock.SINGLE_DEMAND |
              serviceInterlock == ServiceInterlock.SINGLE_ACTIVE)) &
             serviceAccess == ServiceAccess.ENABLED) |
           ((not (controlProposal.access == AccessProposal.ENABLE_ACCESS &
                  dockReadiness == DockReadiness.SERVICE_READY &
                  (serviceInterlock == ServiceInterlock.SINGLE_DEMAND |
                   serviceInterlock == ServiceInterlock.SINGLE_ACTIVE))) &
             serviceAccess == ServiceAccess.LOCKED));
        // @trace CONSTR-01
        guarantee GATED_CONTROL_COHERENCE:
          gatedControl.movement == movementDirective &
          gatedControl.access == serviceAccess &
          not (movementDirective != MovementDirective.HOLD &
               serviceAccess == ServiceAccess.ENABLED);
    }*/
  }

  // @trace PART-08
  part def LifecycleReporter :> Thread {
    // @trace INT-16
    port lifecycleSnapshot : DataPort { in :>> type : LifecycleSnapshot; }
    // @trace INT-17
    port gatedControl : DataPort { in :>> type : GatedControl; }
    // @trace INT-20
    port pilotReport : DataPort { out :>> type : PilotLifecycleReport; }
    // @trace INT-21
    port stationReport : DataPort { out :>> type : StationAccessReport; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee REPORT_INITIAL_SAFE:
          pilotReport == PilotLifecycleReport.OUTSIDE_IDLE &
          stationReport == StationAccessReport.NO_ACCESS;
      compute
        compute_cases
          // @trace LOCAL-10
          case REPORT_RECOVERY:
            assume lifecycleSnapshot.result == LifecycleResult.RECOVERY_LATCHED;
            guarantee pilotReport == PilotLifecycleReport.RECOVERY_REQUIRED &
                      stationReport == StationAccessReport.RECOVERY_REQUIRED;
          // @trace LOCAL-10
          case REPORT_RESET:
            assume lifecycleSnapshot.result == LifecycleResult.RESET_COMPLETE;
            guarantee pilotReport == PilotLifecycleReport.RESET_COMPLETE &
                      stationReport == StationAccessReport.NO_ACCESS;
          // @trace LOCAL-10
          case REPORT_RELEASE:
            assume lifecycleSnapshot.result == LifecycleResult.RELEASED;
            guarantee pilotReport == PilotLifecycleReport.RELEASE_CONFIRMED &
                      stationReport == StationAccessReport.NO_ACCESS;
          // @trace LOCAL-10
          case REPORT_DOCK_ACCEPTED:
            assume lifecycleSnapshot.result == LifecycleResult.DOCK_ACCEPTED &
                   gatedControl.movement == MovementDirective.PERMIT_DOCK;
            guarantee pilotReport == PilotLifecycleReport.DOCK_PERMITTED &
                      stationReport == StationAccessReport.DOCK_EXPECTED;
          // @trace LOCAL-10
          case REPORT_DOCK_ACCEPTANCE_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.DOCK_ACCEPTED &
                   gatedControl.movement != MovementDirective.PERMIT_DOCK;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-10
          case REPORT_DOCK_CONFIRMED:
            assume lifecycleSnapshot.result == LifecycleResult.DOCK_CONFIRMED;
            guarantee pilotReport == PilotLifecycleReport.DOCKED_READY &
                      stationReport == StationAccessReport.ACCESS_AVAILABLE;
          // @trace LOCAL-10
          case REPORT_SERVICE_GRANTED:
            assume lifecycleSnapshot.result == LifecycleResult.SERVICE_GRANTED &
                   gatedControl.access == ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.SERVICE_GRANTED &
                      stationReport == StationAccessReport.ACCESS_RESERVED;
          // @trace LOCAL-10
          case REPORT_SERVICE_GRANT_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.SERVICE_GRANTED &
                   gatedControl.access != ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-10
          case REPORT_SERVICE_RUNNING:
            assume lifecycleSnapshot.result == LifecycleResult.SERVICE_RUNNING &
                   gatedControl.access == ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.SERVICE_ACTIVE &
                      stationReport == StationAccessReport.ACCESS_OCCUPIED;
          // @trace LOCAL-10
          case REPORT_SERVICE_RUNNING_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.SERVICE_RUNNING &
                   gatedControl.access != ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-10
          case REPORT_SERVICE_FINISHED:
            assume lifecycleSnapshot.result == LifecycleResult.SERVICE_FINISHED;
            guarantee pilotReport == PilotLifecycleReport.SERVICE_FINISHED &
                      stationReport == StationAccessReport.ACCESS_AVAILABLE;
          // @trace POL-CONFLICT-01
          case REPORT_UNDOCK_DEFERRED_OCCUPIED:
            assume lifecycleSnapshot.result == LifecycleResult.UNDOCK_DEFERRED &
                   gatedControl.access == ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.UNDOCK_DEFERRED &
                      stationReport == StationAccessReport.ACCESS_OCCUPIED;
          // @trace POL-CONFLICT-01
          case REPORT_UNDOCK_DEFERRED_RELEASED:
            assume lifecycleSnapshot.result == LifecycleResult.UNDOCK_DEFERRED &
                   gatedControl.access != ServiceAccess.ENABLED &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.DOCKED_ACCESS_LOCKED;
            guarantee pilotReport == PilotLifecycleReport.UNDOCK_DEFERRED &
                      stationReport == StationAccessReport.ACCESS_AVAILABLE;
          // @trace POL-CONFLICT-01
          case REPORT_UNDOCK_DEFERRED_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.UNDOCK_DEFERRED &
                   gatedControl.access != ServiceAccess.ENABLED &
                   lifecycleSnapshot.next_state != SnapshotLifecycleState.DOCKED_ACCESS_LOCKED;
            guarantee pilotReport == PilotLifecycleReport.UNDOCK_DEFERRED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-10
          case REPORT_UNDOCK_ACCEPTED:
            assume lifecycleSnapshot.result == LifecycleResult.UNDOCK_ACCEPTED &
                   gatedControl.movement == MovementDirective.PERMIT_UNDOCK;
            guarantee pilotReport == PilotLifecycleReport.UNDOCK_PERMITTED &
                      stationReport == StationAccessReport.DEPARTURE_EXPECTED;
          // @trace LOCAL-10
          case REPORT_UNDOCK_ACCEPTANCE_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.UNDOCK_ACCEPTED &
                   gatedControl.movement != MovementDirective.PERMIT_UNDOCK;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-10
          case REPORT_INHIBITED_RESERVED:
            assume lifecycleSnapshot.result == LifecycleResult.INHIBITED &
                   gatedControl.access == ServiceAccess.ENABLED &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_ACCESS_GRANTED;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_RESERVED;
          // @trace LOCAL-10
          case REPORT_INHIBITED_OCCUPIED:
            assume lifecycleSnapshot.result == LifecycleResult.INHIBITED &
                   gatedControl.access == ServiceAccess.ENABLED &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_IN_PROGRESS;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_OCCUPIED;
          // @trace LOCAL-10
          case REPORT_INHIBITED_DOCK_EXPECTED:
            assume lifecycleSnapshot.result == LifecycleResult.INHIBITED &
                   gatedControl.movement == MovementDirective.PERMIT_DOCK;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.DOCK_EXPECTED;
          // @trace LOCAL-10
          case REPORT_INHIBITED_DEPARTURE_EXPECTED:
            assume lifecycleSnapshot.result == LifecycleResult.INHIBITED &
                   gatedControl.movement == MovementDirective.PERMIT_UNDOCK;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.DEPARTURE_EXPECTED;
          // @trace LOCAL-10
          case REPORT_INHIBITED_DOCKED:
            assume lifecycleSnapshot.result == LifecycleResult.INHIBITED &
                   gatedControl.access != ServiceAccess.ENABLED &
                   gatedControl.movement == MovementDirective.HOLD &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.DOCKED_ACCESS_LOCKED;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_AVAILABLE;
          // @trace LOCAL-10
          case REPORT_INHIBITED_OTHER:
            assume lifecycleSnapshot.result == LifecycleResult.INHIBITED &
                   gatedControl.access != ServiceAccess.ENABLED &
                   gatedControl.movement == MovementDirective.HOLD &
                   lifecycleSnapshot.next_state != SnapshotLifecycleState.DOCKED_ACCESS_LOCKED;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-09
          case REPORT_NONE_OUTSIDE:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.IDLE_OUTSIDE;
            guarantee pilotReport == PilotLifecycleReport.OUTSIDE_IDLE &
                      stationReport == StationAccessReport.NO_ACCESS;
          // @trace LOCAL-09
          case REPORT_NONE_DOCK_CLEARANCE:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.DOCK_CLEARANCE_LATCHED &
                   gatedControl.movement == MovementDirective.PERMIT_DOCK;
            guarantee pilotReport == PilotLifecycleReport.DOCK_PERMITTED &
                      stationReport == StationAccessReport.DOCK_EXPECTED;
          // @trace LOCAL-09
          case REPORT_NONE_DOCK_CLEARANCE_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.DOCK_CLEARANCE_LATCHED &
                   gatedControl.movement != MovementDirective.PERMIT_DOCK;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-09
          case REPORT_NONE_DOCKED:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.DOCKED_ACCESS_LOCKED;
            guarantee pilotReport == PilotLifecycleReport.DOCKED_READY &
                      stationReport == StationAccessReport.ACCESS_AVAILABLE;
          // @trace LOCAL-09
          case REPORT_NONE_GRANTED:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_ACCESS_GRANTED &
                   gatedControl.access == ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.SERVICE_GRANTED &
                      stationReport == StationAccessReport.ACCESS_RESERVED;
          // @trace LOCAL-09
          case REPORT_NONE_GRANTED_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_ACCESS_GRANTED &
                   gatedControl.access != ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-09
          case REPORT_NONE_ACTIVE:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_IN_PROGRESS &
                   gatedControl.access == ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.SERVICE_ACTIVE &
                      stationReport == StationAccessReport.ACCESS_OCCUPIED;
          // @trace LOCAL-09
          case REPORT_NONE_ACTIVE_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.SERVICE_IN_PROGRESS &
                   gatedControl.access != ServiceAccess.ENABLED;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-09
          case REPORT_NONE_UNDOCK_CLEARANCE:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.UNDOCK_CLEARANCE_LATCHED &
                   gatedControl.movement == MovementDirective.PERMIT_UNDOCK;
            guarantee pilotReport == PilotLifecycleReport.UNDOCK_PERMITTED &
                      stationReport == StationAccessReport.DEPARTURE_EXPECTED;
          // @trace LOCAL-09
          case REPORT_NONE_UNDOCK_CLEARANCE_SUPPRESSED:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.UNDOCK_CLEARANCE_LATCHED &
                   gatedControl.movement != MovementDirective.PERMIT_UNDOCK;
            guarantee pilotReport == PilotLifecycleReport.INHIBITED &
                      stationReport == StationAccessReport.ACCESS_INHIBITED;
          // @trace LOCAL-09
          case REPORT_NONE_RECOVERY:
            assume lifecycleSnapshot.result == LifecycleResult.NONE &
                   lifecycleSnapshot.next_state == SnapshotLifecycleState.RECOVERY_REQUIRED;
            guarantee pilotReport == PilotLifecycleReport.RECOVERY_REQUIRED &
                      stationReport == StationAccessReport.RECOVERY_REQUIRED;
    }*/
  }

  // @generated-support behavior-free containment and delegation owner; no semantic credit.
  part def DockedServiceSupervisorProcess :> Process {
    // @trace INT-01
    port pilotIntent : DataPort { in :>> type : PilotIntent; }
    // @trace INT-02
    port berthObservation : DataPort { in :>> type : BerthObservation; }
    // @trace INT-03
    port shipCondition : DataPort { in :>> type : ShipCondition; }
    // @trace INT-04
    port repairSignal : DataPort { in :>> type : ServiceSignal; }
    // @trace INT-05
    port resupplySignal : DataPort { in :>> type : ServiceSignal; }
    // @trace INT-18
    port movementDirective : DataPort { out :>> type : MovementDirective; }
    // @trace INT-19
    port serviceAccess : DataPort { out :>> type : ServiceAccess; }
    // @trace INT-20
    port pilotReport : DataPort { out :>> type : PilotLifecycleReport; }
    // @trace INT-21
    port stationReport : DataPort { out :>> type : StationAccessReport; }

    // Eight ordered, responsibility-bearing usages.
    // @trace PART-01
    part intentQualifier : IntentQualifier;
    // @trace PART-02
    part dockReadinessQualifier : DockReadinessQualifier;
    // @trace PART-03
    part serviceInterlockQualifier : ServiceInterlockQualifier;
    // @trace PART-04
    part lifecycleConsistencyMonitor : LifecycleConsistencyMonitor;
    // @trace PART-05
    part priorityArbiter : PriorityArbiter;
    // @trace PART-06
    part lifecycleController : LifecycleController;
    // @trace PART-07
    part movementAndAccessSafetyGate : MovementAndAccessSafetyGate;
    // @trace PART-08
    part lifecycleReporter : LifecycleReporter;

    // Five boundary-input deliveries.
    // @trace INT-01
    connection int01 : PortConnection connect pilotIntent to intentQualifier.pilotIntent;
    // @trace INT-02
    connection int02 : PortConnection connect berthObservation to dockReadinessQualifier.berthObservation;
    // @trace INT-03
    connection int03 : PortConnection connect shipCondition to dockReadinessQualifier.shipCondition;
    // @trace INT-04
    connection int04 : PortConnection connect repairSignal to serviceInterlockQualifier.repairSignal;
    // @trace INT-05
    connection int05 : PortConnection connect resupplySignal to serviceInterlockQualifier.resupplySignal;

    // Twelve owner-to-owner fact deliveries.
    // @trace INT-06
    connection int06 : PortConnection connect intentQualifier.qualifiedIntent to priorityArbiter.qualifiedIntent;
    // @trace INT-07
    connection int07 : PortConnection connect dockReadinessQualifier.monitorReadiness to lifecycleConsistencyMonitor.dockReadiness;
    // @trace INT-08
    connection int08 : PortConnection connect serviceInterlockQualifier.monitorInterlock to lifecycleConsistencyMonitor.serviceInterlock;
    // @trace INT-09
    connection int09 : PortConnection connect lifecycleController.monitorPrestate to lifecycleConsistencyMonitor.lifecyclePrestate;
    // @trace INT-10
    connection int10 : PortConnection connect lifecycleConsistencyMonitor.operationalAssessment to priorityArbiter.operationalAssessment;
    // @trace INT-11
    connection int11 : PortConnection connect lifecycleController.arbiterPrestate to priorityArbiter.lifecyclePrestate;
    // @trace INT-12
    connection int12 : PortConnection connect priorityArbiter.admittedDirective to lifecycleController.admittedDirective;
    // @trace INT-13
    connection int13 : PortConnection connect lifecycleController.controlProposal to movementAndAccessSafetyGate.controlProposal;
    // @trace INT-14
    connection int14 : PortConnection connect dockReadinessQualifier.gateReadiness to movementAndAccessSafetyGate.dockReadiness;
    // @trace INT-15
    connection int15 : PortConnection connect serviceInterlockQualifier.gateInterlock to movementAndAccessSafetyGate.serviceInterlock;
    // @trace INT-16
    connection int16 : PortConnection connect lifecycleController.lifecycleSnapshot to lifecycleReporter.lifecycleSnapshot;
    // @trace INT-17
    connection int17 : PortConnection connect movementAndAccessSafetyGate.gatedControl to lifecycleReporter.gatedControl;

    // Four boundary-output deliveries.
    // @trace INT-18
    connection int18 : PortConnection connect movementAndAccessSafetyGate.movementDirective to movementDirective;
    // @trace INT-19
    connection int19 : PortConnection connect movementAndAccessSafetyGate.serviceAccess to serviceAccess;
    // @trace INT-20
    connection int20 : PortConnection connect lifecycleReporter.pilotReport to pilotReport;
    // @trace INT-21
    connection int21 : PortConnection connect lifecycleReporter.stationReport to stationReport;
  }

  // @trace BOUND-01
  part def DockedServiceAccessLifecycleSupervisorSystem :> System {
    // @trace MON-01
    port pilotIntent : DataPort { in :>> type : PilotIntent; }
    // @trace MON-02
    port berthObservation : DataPort { in :>> type : BerthObservation; }
    // @trace MON-03
    port shipCondition : DataPort { in :>> type : ShipCondition; }
    // @trace MON-04
    port repairSignal : DataPort { in :>> type : ServiceSignal; }
    // @trace MON-05
    port resupplySignal : DataPort { in :>> type : ServiceSignal; }
    // @trace CTRL-01
    port movementDirective : DataPort { out :>> type : MovementDirective; }
    // @trace CTRL-02
    port serviceAccess : DataPort { out :>> type : ServiceAccess; }
    // @trace CTRL-03
    port pilotReport : DataPort { out :>> type : PilotLifecycleReport; }
    // @trace CTRL-04
    port stationReport : DataPort { out :>> type : StationAccessReport; }

    // @generated-support sole behavior-free routing container; no semantic credit.
    part supervisorProcess : DockedServiceSupervisorProcess;

    // @generated-support Each route refines exactly one semantic boundary interaction.
    connection support01 : PortConnection connect pilotIntent to supervisorProcess.pilotIntent;
    connection support02 : PortConnection connect berthObservation to supervisorProcess.berthObservation;
    connection support03 : PortConnection connect shipCondition to supervisorProcess.shipCondition;
    connection support04 : PortConnection connect repairSignal to supervisorProcess.repairSignal;
    connection support05 : PortConnection connect resupplySignal to supervisorProcess.resupplySignal;
    connection support18 : PortConnection connect supervisorProcess.movementDirective to movementDirective;
    connection support19 : PortConnection connect supervisorProcess.serviceAccess to serviceAccess;
    connection support20 : PortConnection connect supervisorProcess.pilotReport to pilotReport;
    connection support21 : PortConnection connect supervisorProcess.stationReport to stationReport;
  }

  // @trace STRUCT-01
  part dockedServiceAccessLifecycleSupervisor : DockedServiceAccessLifecycleSupervisorSystem;
}
