package Windshield_Defrost_Request_Supervisor {

  private import HAMR::*;

  enum def DefrostSelection {
    enum Released;
    enum Active;
  }

  enum def RequestValidity {
    enum Valid;
    enum Invalid;
  }

  enum def GlazingCondition {
    enum Clear;
    enum Obscured;
  }

  enum def GlazingValidity {
    enum Valid;
    enum Invalid;
  }

  enum def ElectricalInterfaceStatus {
    enum Available;
    enum Unavailable;
  }

  enum def DefrostLoadAllowance {
    enum Permitted;
    enum Restricted;
  }

  enum def DefrostEnableCommand {
    enum Off;
    enum On;
  }

  enum def DriverDefrostStatus {
    enum Idle;
    enum Defrosting;
    enum Complete;
    enum AttentionRequired;
  }

  enum def RequestIntent {
    enum Fresh;
    enum Held;
    enum None;
    enum BlockedInvalid;
    enum BlockedRearm;
  }

  enum def VisibilityAssessment {
    enum Clear;
    enum NeedsDefrost;
    enum Unknown;
  }

  enum def DefrostEligibility {
    enum Eligible;
    enum BlockedUnavailable;
    enum BlockedRestricted;
  }

  enum def PolicyDisposition {
    enum Inactive;
    enum Defrosting;
    enum Complete;
    enum ObservationFault;
    enum ElectricalBlocked;
  }

  enum def RequestMemory {
    enum Released;
    enum AcceptedActive;
    enum RearmRequired;
  }

  part def RequestIntentTracker :> Thread {
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port requestIntent : DataPort { out :>> type : RequestIntent; }

    language "GUMBO" /*{
      state
        requestMemory: RequestMemory;

      initialize
        guarantee INITIAL_REQUEST_STATE:
          requestMemory == RequestMemory.Released &
          requestIntent == RequestIntent.None;

      compute
        compute_cases
          case CC_01_FRESH_REQUEST:
            assume requestValidity == RequestValidity.Valid &
                   defrostSelection == DefrostSelection.Active &
                   In(requestMemory) == RequestMemory.Released;
            guarantee requestIntent == RequestIntent.Fresh &
                      requestMemory == RequestMemory.AcceptedActive;

          case CC_02_HELD_REQUEST:
            assume requestValidity == RequestValidity.Valid &
                   defrostSelection == DefrostSelection.Active &
                   In(requestMemory) == RequestMemory.AcceptedActive;
            guarantee requestIntent == RequestIntent.Held &
                      requestMemory == RequestMemory.AcceptedActive;

          case CC_03_RELEASE_REARM:
            assume requestValidity == RequestValidity.Valid &
                   defrostSelection == DefrostSelection.Released;
            guarantee requestIntent == RequestIntent.None &
                      requestMemory == RequestMemory.Released;

          case CC_04_INVALID_REQUEST:
            assume requestValidity == RequestValidity.Invalid;
            guarantee requestIntent == RequestIntent.BlockedInvalid &
                      requestMemory == RequestMemory.RearmRequired;

          case CC_05_ACTIVE_BEFORE_REARM:
            assume requestValidity == RequestValidity.Valid &
                   defrostSelection == DefrostSelection.Active &
                   In(requestMemory) == RequestMemory.RearmRequired;
            guarantee requestIntent == RequestIntent.BlockedRearm &
                      requestMemory == RequestMemory.RearmRequired;
    }*/
  }

  part def GlazingConditionAssessor :> Thread {
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    port visibilityAssessment : DataPort { out :>> type : VisibilityAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_06_INVALID_GLAZING:
            assume glazingValidity == GlazingValidity.Invalid;
            guarantee visibilityAssessment == VisibilityAssessment.Unknown;

          case CC_06_CLEAR_GLAZING:
            assume glazingValidity == GlazingValidity.Valid &
                   glazingCondition == GlazingCondition.Clear;
            guarantee visibilityAssessment == VisibilityAssessment.Clear;

          case CC_06_OBSCURED_GLAZING:
            assume glazingValidity == GlazingValidity.Valid &
                   glazingCondition == GlazingCondition.Obscured;
            guarantee visibilityAssessment == VisibilityAssessment.NeedsDefrost;
    }*/
  }

  part def ElectricalEligibilityAssessor :> Thread {
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    port defrostEligibility : DataPort { out :>> type : DefrostEligibility; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_07_INTERFACE_UNAVAILABLE:
            assume electricalInterfaceStatus == ElectricalInterfaceStatus.Unavailable;
            guarantee defrostEligibility == DefrostEligibility.BlockedUnavailable;

          case CC_07_LOAD_RESTRICTED:
            assume electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
                   defrostLoadAllowance == DefrostLoadAllowance.Restricted;
            guarantee defrostEligibility == DefrostEligibility.BlockedRestricted;

          case CC_07_ELIGIBLE:
            assume electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
                   defrostLoadAllowance == DefrostLoadAllowance.Permitted;
            guarantee defrostEligibility == DefrostEligibility.Eligible;
    }*/
  }

  part def DefrostPolicySupervisor :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port visibilityAssessment : DataPort { in :>> type : VisibilityAssessment; }
    port defrostEligibility : DataPort { in :>> type : DefrostEligibility; }
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    port policyDisposition : DataPort { out :>> type : PolicyDisposition; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_POLICY_OUTPUTS:
          defrostEnableCommand == DefrostEnableCommand.Off &
          policyDisposition == PolicyDisposition.Inactive;

      compute
        compute_cases
          case CC_08_NON_ACTIONABLE:
            assume requestIntent == RequestIntent.None |
                   requestIntent == RequestIntent.BlockedInvalid |
                   requestIntent == RequestIntent.BlockedRearm;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
                      policyDisposition == PolicyDisposition.Inactive;

          case CC_09_OBSERVATION_FAULT:
            assume (requestIntent == RequestIntent.Fresh |
                    requestIntent == RequestIntent.Held) &
                   visibilityAssessment == VisibilityAssessment.Unknown;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
                      policyDisposition == PolicyDisposition.ObservationFault;

          case CC_10_ELECTRICAL_BLOCK:
            assume (requestIntent == RequestIntent.Fresh |
                    requestIntent == RequestIntent.Held) &
                   visibilityAssessment != VisibilityAssessment.Unknown &
                   defrostEligibility != DefrostEligibility.Eligible;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
                      policyDisposition == PolicyDisposition.ElectricalBlocked;

          case CC_11_ELIGIBLE_NEEDS_DEFROST:
            assume (requestIntent == RequestIntent.Fresh |
                    requestIntent == RequestIntent.Held) &
                   defrostEligibility == DefrostEligibility.Eligible &
                   visibilityAssessment == VisibilityAssessment.NeedsDefrost;
            guarantee defrostEnableCommand == DefrostEnableCommand.On &
                      policyDisposition == PolicyDisposition.Defrosting;

          case CC_11_ELIGIBLE_CLEAR:
            assume (requestIntent == RequestIntent.Fresh |
                    requestIntent == RequestIntent.Held) &
                   defrostEligibility == DefrostEligibility.Eligible &
                   visibilityAssessment == VisibilityAssessment.Clear;
            guarantee defrostEnableCommand == DefrostEnableCommand.Off &
                      policyDisposition == PolicyDisposition.Complete;
    }*/
  }

  part def DriverFeedbackReporter :> Thread {
    port policyDisposition : DataPort { in :>> type : PolicyDisposition; }
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_DRIVER_STATUS:
          driverDefrostStatus == DriverDefrostStatus.Idle;

      compute
        compute_cases
          case CC_12_ATTENTION_REQUIRED:
            assume requestIntent == RequestIntent.BlockedInvalid |
                   requestIntent == RequestIntent.BlockedRearm |
                   ((requestIntent == RequestIntent.Fresh |
                     requestIntent == RequestIntent.Held) &
                    (policyDisposition == PolicyDisposition.ObservationFault |
                     policyDisposition == PolicyDisposition.ElectricalBlocked));
            guarantee driverDefrostStatus == DriverDefrostStatus.AttentionRequired;

          case CC_12_DEFROSTING:
            assume (requestIntent == RequestIntent.Fresh |
                    requestIntent == RequestIntent.Held) &
                   policyDisposition == PolicyDisposition.Defrosting;
            guarantee driverDefrostStatus == DriverDefrostStatus.Defrosting;

          case CC_12_COMPLETE:
            assume (requestIntent == RequestIntent.Fresh |
                    requestIntent == RequestIntent.Held) &
                   policyDisposition == PolicyDisposition.Complete;
            guarantee driverDefrostStatus == DriverDefrostStatus.Complete;

          case CC_12_IDLE:
            assume requestIntent == RequestIntent.None |
                   ((requestIntent == RequestIntent.Fresh |
                     requestIntent == RequestIntent.Held) &
                    policyDisposition == PolicyDisposition.Inactive);
            guarantee driverDefrostStatus == DriverDefrostStatus.Idle;
    }*/
  }

  part def DefrostSupervisionProcess :> Process {
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    part requestIntentTracker : RequestIntentTracker;
    part glazingConditionAssessor : GlazingConditionAssessor;
    part electricalEligibilityAssessor : ElectricalEligibilityAssessor;
    part defrostPolicySupervisor : DefrostPolicySupervisor;
    part driverFeedbackReporter : DriverFeedbackReporter;

    connection int01 : PortConnection connect defrostSelection to requestIntentTracker.defrostSelection;
    connection int02 : PortConnection connect requestValidity to requestIntentTracker.requestValidity;
    connection int03 : PortConnection connect glazingCondition to glazingConditionAssessor.glazingCondition;
    connection int04 : PortConnection connect glazingValidity to glazingConditionAssessor.glazingValidity;
    connection int05 : PortConnection connect electricalInterfaceStatus to electricalEligibilityAssessor.electricalInterfaceStatus;
    connection int06 : PortConnection connect defrostLoadAllowance to electricalEligibilityAssessor.defrostLoadAllowance;
    connection int07 : PortConnection connect requestIntentTracker.requestIntent to defrostPolicySupervisor.requestIntent;
    connection int08 : PortConnection connect glazingConditionAssessor.visibilityAssessment to defrostPolicySupervisor.visibilityAssessment;
    connection int09 : PortConnection connect electricalEligibilityAssessor.defrostEligibility to defrostPolicySupervisor.defrostEligibility;
    connection int10 : PortConnection connect defrostPolicySupervisor.defrostEnableCommand to defrostEnableCommand;
    connection int11 : PortConnection connect defrostPolicySupervisor.policyDisposition to driverFeedbackReporter.policyDisposition;
    connection int12 : PortConnection connect requestIntentTracker.requestIntent to driverFeedbackReporter.requestIntent;
    connection int13 : PortConnection connect driverFeedbackReporter.driverDefrostStatus to driverDefrostStatus;
  }

  part def WindshieldDefrostRequestSupervisor :> System {
    port defrostSelection : DataPort { in :>> type : DefrostSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port glazingValidity : DataPort { in :>> type : GlazingValidity; }
    port electricalInterfaceStatus : DataPort { in :>> type : ElectricalInterfaceStatus; }
    port defrostLoadAllowance : DataPort { in :>> type : DefrostLoadAllowance; }
    port defrostEnableCommand : DataPort { out :>> type : DefrostEnableCommand; }
    port driverDefrostStatus : DataPort { out :>> type : DriverDefrostStatus; }

    part defrostSupervisionProcess : DefrostSupervisionProcess;

    connection supportInt01 : PortConnection connect defrostSelection to defrostSupervisionProcess.defrostSelection;
    connection supportInt02 : PortConnection connect requestValidity to defrostSupervisionProcess.requestValidity;
    connection supportInt03 : PortConnection connect glazingCondition to defrostSupervisionProcess.glazingCondition;
    connection supportInt04 : PortConnection connect glazingValidity to defrostSupervisionProcess.glazingValidity;
    connection supportInt05 : PortConnection connect electricalInterfaceStatus to defrostSupervisionProcess.electricalInterfaceStatus;
    connection supportInt06 : PortConnection connect defrostLoadAllowance to defrostSupervisionProcess.defrostLoadAllowance;
    connection supportInt10 : PortConnection connect defrostSupervisionProcess.defrostEnableCommand to defrostEnableCommand;
    connection supportInt13 : PortConnection connect defrostSupervisionProcess.driverDefrostStatus to driverDefrostStatus;
  }

  part windshieldDefrostRequestSupervisor : WindshieldDefrostRequestSupervisor;
}
