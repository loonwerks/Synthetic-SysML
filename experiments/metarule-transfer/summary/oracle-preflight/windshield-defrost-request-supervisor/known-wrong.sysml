package Windshield_Defrost_Request_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def DefrostSelection {
    enum Active;
    enum Released;
  }

  // @trace MON-02
  enum def RequestValidity {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-03
  enum def GlazingCondition {
    enum Clear;
    enum Obscured;
  }

  // @trace MON-04
  enum def GlazingValidity {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-05
  enum def ElectricalInterfaceStatus {
    enum Available;
    enum Unavailable;
  }

  // @trace MON-06
  enum def DefrostLoadAllowance {
    enum Permitted;
    enum Restricted;
  }

  // @trace CTRL-01
  enum def DefrostEnableCommand {
    enum Off;
    enum On;
  }

  // @trace CTRL-02
  enum def DriverDefrostStatus {
    enum Idle;
    enum Defrosting;
    enum Complete;
    enum AttentionRequired;
  }

  // @trace INT-07
  enum def RequestIntent {
    enum Fresh;
    enum Held;
    enum None;
    enum BlockedInvalid;
    enum BlockedRearm;
  }

  // @trace INT-08
  enum def VisibilityAssessment {
    enum Clear;
    enum NeedsDefrost;
    enum Unknown;
  }

  // @trace INT-09
  enum def DefrostEligibility {
    enum Eligible;
    enum BlockedUnavailable;
    enum BlockedRestricted;
  }

  // @trace INT-11
  enum def PolicyDisposition {
    enum Inactive;
    enum Defrosting;
    enum Complete;
    enum ObservationFault;
    enum ElectricalBlocked;
  }

  // @trace STATE-01
  enum def RequestMemory {
    enum Released;
    enum AcceptedActive;
    enum RearmRequired;
  }

  // @trace PART-01
  part def RequestIntentTracker :> Thread {
    // @trace INT-01
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    // @trace INT-02
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    // @trace INT-07
    port requestIntent : DataPort { out :>> type : RequestIntent; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        requestMemory : RequestMemory;

      initialize
        guarantee
          // @trace INIT-01
          INITIAL_REQUEST_STATE "Request qualification initializes released and non-actionable":
            requestMemory == RequestMemory.Released &
            requestIntent == RequestIntent.None;

      compute
        compute_cases
          // @trace CC-01
          case CC_01_FRESH_REQUEST "A valid active selection from Released is fresh and becomes accepted":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Active &
              In(requestMemory) == RequestMemory.Released;
            guarantee requestIntent == RequestIntent.Fresh &
              requestMemory == RequestMemory.AcceptedActive;

          // @trace CC-02
          case CC_02_HELD_REQUEST "A valid continuously active selection remains held and accepted":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Active &
              In(requestMemory) == RequestMemory.AcceptedActive;
            guarantee requestIntent == RequestIntent.Held &
              requestMemory == RequestMemory.AcceptedActive;

          // @trace CC-03
          case CC_03_RELEASE_REARM "Every valid release becomes non-actionable and arms a later fresh request":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Released;
            guarantee requestIntent == RequestIntent.None &
              requestMemory == RequestMemory.Released;

          // @trace CC-04
          case CC_04_INVALID_REQUEST "Every invalid request is blocked and enters the release-required state":
            assume requestValidity == RequestValidity.Invalid;
            guarantee requestIntent == RequestIntent.BlockedInvalid &
              requestMemory == RequestMemory.RearmRequired;

          // @trace CC-05
          case CC_05_ACTIVE_BEFORE_REARM "A valid active selection cannot bypass required release":
            assume requestValidity == RequestValidity.Valid &
              defrostSelection == DefrostSelection.Active &
              In(requestMemory) == RequestMemory.RearmRequired;
            guarantee requestIntent == RequestIntent.BlockedRearm &
              requestMemory == RequestMemory.RearmRequired;
    }*/
  }

  // @trace PART-02
  part def GlazingConditionAssessor :> Thread {
    // @trace INT-03
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    // @trace INT-04
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    // @trace INT-08
    port visibilityAssessment : DataPort { out :>> type : VisibilityAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CC-06
          case CC_06_VISIBILITY_CLASSIFICATION "Validity and condition jointly derive the total three-way visibility fact":
            guarantee
              ((glazingValidity == GlazingValidity.Invalid) implies
                (visibilityAssessment == VisibilityAssessment.Unknown)) &
              ((glazingValidity == GlazingValidity.Valid &
                glazingCondition == GlazingCondition.Clear) implies
                (visibilityAssessment == VisibilityAssessment.Clear)) &
              ((glazingValidity == GlazingValidity.Valid &
                glazingCondition == GlazingCondition.Obscured) implies
                (visibilityAssessment == VisibilityAssessment.NeedsDefrost));
    }*/
  }

  // @trace PART-03
  part def ElectricalEligibilityAssessor :> Thread {
    // @trace INT-05
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    // @trace INT-06
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    // @trace INT-09
    port defrostEligibility : DataPort { out :>> type : DefrostEligibility; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CC-07
          case CC_07_ELIGIBILITY_CLASSIFICATION "Availability has reason precedence and the remaining pair determines eligibility":
            guarantee
              ((electricalInterfaceStatus == ElectricalInterfaceStatus.Unavailable) implies
                (defrostEligibility == DefrostEligibility.BlockedUnavailable)) &
              ((electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
                defrostLoadAllowance == DefrostLoadAllowance.Restricted) implies
                (defrostEligibility == DefrostEligibility.BlockedRestricted)) &
              ((electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
                defrostLoadAllowance == DefrostLoadAllowance.Permitted) implies
                (defrostEligibility == DefrostEligibility.Eligible));
    }*/
  }

  // @trace PART-04
  part def DefrostPolicySupervisor :> Thread {
    // @trace INT-07
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    // @trace INT-08
    port visibilityAssessment : DataPort { in :>> type : VisibilityAssessment; }
    // @trace INT-09
    port defrostEligibility : DataPort { in :>> type : DefrostEligibility; }
    // @trace INT-10
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    // @trace INT-11
    port policyDisposition : DataPort { out :>> type : PolicyDisposition; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INITIAL_POLICY_OUTPUTS "The principal decision owner initializes to fail-off and inactive":
            defrostEnableCommand == DefrostEnableCommand.Off &
            policyDisposition == PolicyDisposition.Inactive;

      compute
        compute_cases
          // @trace CC-08
          case CC_08_NON_ACTIONABLE "Absent, invalid, or not-rearmed requests have first priority and force inactive off":
            assume requestIntent == RequestIntent.None |
              requestIntent == RequestIntent.BlockedInvalid |
              requestIntent == RequestIntent.BlockedRearm;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
              policyDisposition == PolicyDisposition.Inactive;

          // @trace CC-09
          case CC_09_OBSERVATION_FAULT "An actionable request with unknown glazing forces observation-fault off":
            assume (requestIntent == RequestIntent.Fresh |
              requestIntent == RequestIntent.Held) &
              visibilityAssessment == VisibilityAssessment.Unknown;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
              policyDisposition == PolicyDisposition.ObservationFault;

          // @trace CC-10
          case CC_10_ELECTRICAL_BLOCK "Known glazing with an actionable request is blocked by either ineligible resource reason":
            assume (requestIntent == RequestIntent.Fresh |
              requestIntent == RequestIntent.Held) &
              visibilityAssessment != VisibilityAssessment.Unknown &
              defrostEligibility != DefrostEligibility.Eligible;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
              policyDisposition == PolicyDisposition.ElectricalBlocked;

          // @trace CC-11
          case CC_11_ELIGIBLE_VISIBILITY "Eligible actionable requests command by the selected clear-or-obscured boundary":
            assume (requestIntent == RequestIntent.Fresh |
              requestIntent == RequestIntent.Held) &
              defrostEligibility == DefrostEligibility.Eligible &
              visibilityAssessment != VisibilityAssessment.Unknown;
            guarantee
              ((visibilityAssessment == VisibilityAssessment.NeedsDefrost) implies
                (defrostEnableCommand == DefrostEnableCommand.On &
                 policyDisposition == PolicyDisposition.Defrosting)) &
              ((visibilityAssessment == VisibilityAssessment.Clear) implies
                (defrostEnableCommand == DefrostEnableCommand.Off &
                 policyDisposition == PolicyDisposition.Complete));
    }*/
  }

  // @trace PART-05
  part def DriverFeedbackReporter :> Thread {
    // @trace INT-11
    port policyDisposition : DataPort { in :>> type : PolicyDisposition; }
    // @trace INT-12
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    // @trace INT-13
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INITIAL_DRIVER_STATUS "The driver-facing status initializes idle":
            driverDefrostStatus == DriverDefrostStatus.Idle;

      compute
        compute_cases
          // @trace CC-12
          case CC_12_DRIVER_REPORTING "Request blockers and policy disposition jointly determine the total audience status":
            guarantee
              (((requestIntent == RequestIntent.BlockedInvalid |
                 requestIntent == RequestIntent.BlockedRearm) |
                ((requestIntent == RequestIntent.Fresh |
                  requestIntent == RequestIntent.Held) &
                 (policyDisposition == PolicyDisposition.ObservationFault |
                  policyDisposition == PolicyDisposition.ElectricalBlocked))) implies
                (driverDefrostStatus == DriverDefrostStatus.AttentionRequired)) &
              (((requestIntent == RequestIntent.Fresh |
                 requestIntent == RequestIntent.Held) &
                policyDisposition == PolicyDisposition.Defrosting) implies
                (driverDefrostStatus == DriverDefrostStatus.Defrosting)) &
              (((requestIntent == RequestIntent.Fresh |
                 requestIntent == RequestIntent.Held) &
                policyDisposition == PolicyDisposition.Complete) implies
                (driverDefrostStatus == DriverDefrostStatus.Complete)) &
              ((requestIntent == RequestIntent.None |
                ((requestIntent == RequestIntent.Fresh |
                  requestIntent == RequestIntent.Held) &
                 policyDisposition == PolicyDisposition.Inactive)) implies
                (driverDefrostStatus == DriverDefrostStatus.Idle));
    }*/
  }

  // @generated-support SUPPORT-01
  part def DefrostSupervisionProcess :> Process {
    // @trace INT-01
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    // @trace INT-02
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    // @trace INT-03
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    // @trace INT-04
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    // @trace INT-05
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    // @trace INT-06
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    // @trace INT-10
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    // @trace INT-13
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    // @trace PART-01
    part requestIntentTracker : RequestIntentTracker;
    // @trace PART-02
    part glazingConditionAssessor : GlazingConditionAssessor;
    // @trace PART-03
    part electricalEligibilityAssessor : ElectricalEligibilityAssessor;
    // @trace PART-04
    part defrostPolicySupervisor : DefrostPolicySupervisor;
    // @trace PART-05
    part driverFeedbackReporter : DriverFeedbackReporter;

    // @generated-support SUPPORT-02
    // @trace INT-01
    connection int01 : PortConnection connect defrostSelection to requestIntentTracker.defrostSelection;
    // @generated-support SUPPORT-02
    // @trace INT-02
    connection int02 : PortConnection connect requestValidity to requestIntentTracker.requestValidity;
    // @generated-support SUPPORT-02
    // @trace INT-03
    connection int03 : PortConnection connect glazingCondition to glazingConditionAssessor.glazingCondition;
    // @generated-support SUPPORT-02
    // @trace INT-04
    connection int04 : PortConnection connect glazingValidity to glazingConditionAssessor.glazingValidity;
    // @generated-support SUPPORT-02
    // @trace INT-05
    connection int05 : PortConnection connect electricalInterfaceStatus to electricalEligibilityAssessor.electricalInterfaceStatus;
    // @generated-support SUPPORT-02
    // @trace INT-06
    connection int06 : PortConnection connect defrostLoadAllowance to electricalEligibilityAssessor.defrostLoadAllowance;
    // @trace INT-07
    connection int07 : PortConnection connect requestIntentTracker.requestIntent to defrostPolicySupervisor.requestIntent;
    // @trace INT-08
    connection int08 : PortConnection connect glazingConditionAssessor.visibilityAssessment to defrostPolicySupervisor.visibilityAssessment;
    // @trace INT-09
    connection int09 : PortConnection connect electricalEligibilityAssessor.defrostEligibility to defrostPolicySupervisor.defrostEligibility;
    // @generated-support SUPPORT-02
    // @trace INT-10
    connection int10 : PortConnection connect defrostPolicySupervisor.defrostEnableCommand to defrostEnableCommand;
    // @trace INT-11
    connection int11 : PortConnection connect defrostPolicySupervisor.policyDisposition to driverFeedbackReporter.policyDisposition;
    // @trace INT-12
    connection int12 : PortConnection connect requestIntentTracker.requestIntent to driverFeedbackReporter.requestIntent;
    // @generated-support SUPPORT-02
    // @trace INT-13
    connection int13 : PortConnection connect driverFeedbackReporter.driverDefrostStatus to driverDefrostStatus;
  }

  // @trace BOUND-01
  part def WindshieldDefrostRequestSupervisor :> System {
    // @trace MON-01
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    // @trace MON-02
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    // @trace MON-03
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    // @trace MON-04
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    // @trace MON-05
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    // @trace MON-06
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    // @trace CTRL-01
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    // @trace CTRL-02
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    // @generated-support SUPPORT-01
    part defrostSupervisionProcess : DefrostSupervisionProcess;

    // @generated-support SUPPORT-02
    // @trace INT-01
    connection supportInt01 : PortConnection connect defrostSelection to defrostSupervisionProcess.defrostSelection;
    // @generated-support SUPPORT-02
    // @trace INT-02
    connection supportInt02 : PortConnection connect requestValidity to defrostSupervisionProcess.requestValidity;
    // @generated-support SUPPORT-02
    // @trace INT-03
    connection supportInt03 : PortConnection connect glazingCondition to defrostSupervisionProcess.glazingCondition;
    // @generated-support SUPPORT-02
    // @trace INT-04
    connection supportInt04 : PortConnection connect glazingValidity to defrostSupervisionProcess.glazingValidity;
    // @generated-support SUPPORT-02
    // @trace INT-05
    connection supportInt05 : PortConnection connect electricalInterfaceStatus to defrostSupervisionProcess.electricalInterfaceStatus;
    // @generated-support SUPPORT-02
    // @trace INT-06
    connection supportInt06 : PortConnection connect defrostLoadAllowance to defrostSupervisionProcess.defrostLoadAllowance;
    // @generated-support SUPPORT-02
    // @trace INT-10
    connection supportInt10 : PortConnection connect defrostSupervisionProcess.defrostEnableCommand to defrostEnableCommand;
    // @generated-support SUPPORT-02
    // @trace INT-13
    connection supportInt13 : PortConnection connect defrostSupervisionProcess.driverDefrostStatus to driverDefrostStatus;
  }

  // @trace CONSTR-01
  part windshieldDefrostRequestSupervisor : WindshieldDefrostRequestSupervisor;
}
