// Rust/Microkit projection of canonical source:
// runs/20260817T021406Z-faa-flight-stack-appendices-b-c-d/model/flight_stack.sysml
// Canonical SHA-256: 21424fafbfd58b33998929b314423608434264eee9b94f2327f51b06074ba657
// Deployment-only delta: the eight behavior-owner definitions specialize
// HAMR_AADL::Thread and select HAMR::Rust; the FCS root specializes
// HAMR_AADL::System and selects Microkit domain scheduling. All ports,
// connections, payloads, GUMBO invariants/functions, and trace IDs are retained.
package FlightStack {
  private import AADL::*;
  private import Base_Types::*;
  private import HAMR::*;

  // @generated-support GEN-SUP-01 supporting INT-FCS-01
  enum def FdAction {
    enum None;
    enum Display;
    enum Clear;
  }

  // @generated-support GEN-SUP-01 supporting INT-FCS-02
  enum def ApAction {
    enum None;
    enum Engage;
    enum Disengage;
    enum ForceDisengage;
  }

  // @generated-support GEN-SUP-01 supporting INT-FCS-02
  enum def CwsAction {
    enum None;
    enum Hold;
    enum Release;
    enum ForceDisengage;
  }

  // @generated-support GEN-SUP-01 supporting INT-FCS-03
  enum def AttitudeClass {
    enum Invalid;
    enum Unsafe;
    enum Safe;
  }

  // @generated-support GEN-SUP-01 supporting STATE-FGS-01
  enum def FdStateValue {
    enum Cleared;
    enum Displayed;
  }

  // @generated-support GEN-SUP-01 supporting FORM-REQ-01
  enum def ApGuidanceRequestValue {
    enum Invalid;
    enum NotRequested;
    enum Requested;
  }

  // @generated-support GEN-SUP-01 supporting STATE-APS-01
  enum def ApModeValue {
    enum Off;
    enum SyncPending;
    enum On;
    enum CWS;
    enum CwsSuspended;
    enum Failed;
  }

  // @trace MON-CREW-01
  part def CrewRequests :> Data {
    attribute displayFdWanted : Base_Types::Boolean;
    attribute displayFdStatus : Base_Types::Boolean;
    attribute syncFd : Base_Types::Boolean;
    attribute syncFdStatus : Base_Types::Boolean;
    attribute engageApWanted : Base_Types::Boolean;
    attribute engageApStatus : Base_Types::Boolean;
    attribute cwsHeld : Base_Types::Boolean;
    attribute cwsStatus : Base_Types::Boolean;
  }

  // @trace MON-ATT-01
  part def AircraftAttitude :> Data {
    attribute rollTenthDeg : Base_Types::Integer_32;
    attribute rollStatus : Base_Types::Boolean;
    attribute pitchTenthDeg : Base_Types::Integer_32;
    attribute pitchStatus : Base_Types::Boolean;
    language "GUMBO" /*{
      invariants
        inv ATTITUDE_RANGE "FORM-NUM-01 and FORM-RNG-01 raw axis bounds":
          -1800 [s32] <= rollTenthDeg & rollTenthDeg <= 1799 [s32] &
          -1800 [s32] <= pitchTenthDeg & pitchTenthDeg <= 1799 [s32];
    }*/
  }

  // @trace CTRL-FD-01
  part def PairedFdGuidance :> Data {
    attribute leftRollGuidance : Base_Types::Integer_32;
    attribute leftPitchGuidance : Base_Types::Integer_32;
    attribute leftFdOn : Base_Types::Boolean;
    attribute rightRollGuidance : Base_Types::Integer_32;
    attribute rightPitchGuidance : Base_Types::Integer_32;
    attribute rightFdOn : Base_Types::Boolean;
    language "GUMBO" /*{
      invariants
        inv GUIDANCE_RANGE "CTRL-FD-01 bounded guidance payload":
          -450 [s32] <= leftRollGuidance & leftRollGuidance <= 450 [s32] &
          -450 [s32] <= leftPitchGuidance & leftPitchGuidance <= 450 [s32] &
          -450 [s32] <= rightRollGuidance & rightRollGuidance <= 450 [s32] &
          -450 [s32] <= rightPitchGuidance & rightPitchGuidance <= 450 [s32];
    }*/
  }

  // @trace CTRL-FCS-01
  part def PairedFcsIndications :> Data {
    attribute leftFcsFailed : Base_Types::Boolean;
    attribute rightFcsFailed : Base_Types::Boolean;
    attribute leftUnsafeAttitude : Base_Types::Boolean;
    attribute rightUnsafeAttitude : Base_Types::Boolean;
  }

  // @trace CTRL-AP-01
  part def PairedApStatus :> Data {
    attribute leftStatus : Base_Types::Integer_32;
    attribute rightStatus : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        inv AP_STATUS_RANGE "CTRL-AP-01 codes: 0 Failed, 1 Off, 2 On":
          0 [s32] <= leftStatus & leftStatus <= 2 [s32] &
          0 [s32] <= rightStatus & rightStatus <= 2 [s32];
    }*/
  }

  // @trace CTRL-CSA-01
  part def ActuatorCommand :> Data {
    attribute rollRateTenthDegPerSec : Base_Types::Integer_32;
    attribute pitchRateTenthDegPerSec : Base_Types::Integer_32;
    attribute apOn : Base_Types::Boolean;
    language "GUMBO" /*{
      invariants
        inv ACTUATOR_RANGE "CTRL-CSA-01 source actuator-rate bounds":
          -200 [s32] <= rollRateTenthDegPerSec & rollRateTenthDegPerSec <= 200 [s32] &
          -200 [s32] <= pitchRateTenthDegPerSec & pitchRateTenthDegPerSec <= 200 [s32];
    }*/
  }

  // @trace INT-FCS-01
  part def QualifiedFdAndSyncDisposition :> Data {
    attribute fdAction : FdAction;
    attribute syncRequested : Base_Types::Boolean;
    attribute commandConflict : Base_Types::Boolean;
  }

  // @trace INT-FCS-02
  part def QualifiedApDisposition :> Data {
    attribute apAction : ApAction;
    attribute cwsAction : CwsAction;
    attribute commandConflict : Base_Types::Boolean;
  }

  // @trace INT-FCS-03
  part def QualifiedAttitude :> Data {
    attribute classification : AttitudeClass;
    attribute rollTenthDeg : Base_Types::Integer_32;
    attribute pitchTenthDeg : Base_Types::Integer_32;
  }

  // @trace INT-FGS-03
  part def ReferenceAndFdState :> Data {
    attribute referenceRoll : Base_Types::Integer_32;
    attribute referencePitch : Base_Types::Integer_32;
    attribute referenceValid : Base_Types::Boolean;
    attribute fdState : FdStateValue;
  }

  // @trace INT-CROSS-01
  part def ApGuidanceAndValidity :> Data {
    attribute rollGuidance : Base_Types::Integer_32;
    attribute pitchGuidance : Base_Types::Integer_32;
    attribute guidanceValid : Base_Types::Boolean;
  }

  // @trace INT-APS-03
  part def ProposedActuatorRates :> Data {
    attribute rollRate : Base_Types::Integer_32;
    attribute pitchRate : Base_Types::Integer_32;
    attribute proposalValid : Base_Types::Boolean;
    language "GUMBO" /*{
      invariants
        inv PROPOSAL_RANGE "FORM-ACT-01 three-level proposal bounds":
          -50 [s32] <= rollRate & rollRate <= 50 [s32] &
          -50 [s32] <= pitchRate & pitchRate <= 50 [s32];
    }*/
  }

  // @generated-support GEN-SUP-01 supporting CASE-AUD-01
  language "GUMBO" /*{
    library
      functions
        def allCrewStatusesValid(displayStatus: Base_Types::Boolean,
                                 syncStatus: Base_Types::Boolean,
                                 engageStatus: Base_Types::Boolean,
                                 cwsStatus: Base_Types::Boolean): Base_Types::Boolean :=
          displayStatus & syncStatus & engageStatus & cwsStatus;

        def safeRawAttitude(roll: Base_Types::Integer_32,
                            pitch: Base_Types::Integer_32,
                            rollStatus: Base_Types::Boolean,
                            pitchStatus: Base_Types::Boolean): Base_Types::Boolean :=
          rollStatus & pitchStatus &
          -450 [s32] <= roll & roll <= 450 [s32] &
          -450 [s32] <= pitch & pitch <= 450 [s32];

        def validRawAttitude(rollStatus: Base_Types::Boolean,
                             pitchStatus: Base_Types::Boolean): Base_Types::Boolean :=
          rollStatus & pitchStatus;

        def apObservables(nextMode: FlightStack::ApModeValue,
                          cwsHeld: Base_Types::Boolean,
                          leftStatus: Base_Types::Integer_32,
                          rightStatus: Base_Types::Integer_32,
                          request: FlightStack::ApGuidanceRequestValue,
                          inhibit: Base_Types::Boolean,
                          authority: Base_Types::Boolean): Base_Types::Boolean :=
          leftStatus == rightStatus &
          ((nextMode == FlightStack::ApModeValue.On | nextMode == FlightStack::ApModeValue.CWS)
            implies leftStatus == 2 [s32]) &
          ((nextMode == FlightStack::ApModeValue.Off |
            nextMode == FlightStack::ApModeValue.SyncPending |
            nextMode == FlightStack::ApModeValue.CwsSuspended)
            implies leftStatus == 1 [s32]) &
          ((nextMode == FlightStack::ApModeValue.Failed)
            implies leftStatus == 0 [s32]) &
          (authority == (nextMode == FlightStack::ApModeValue.On)) &
          (inhibit == (nextMode == FlightStack::ApModeValue.SyncPending |
                       nextMode == FlightStack::ApModeValue.On |
                       nextMode == FlightStack::ApModeValue.CWS)) &
          (request == FlightStack::ApGuidanceRequestValue.Requested) ==
            (nextMode == FlightStack::ApModeValue.SyncPending |
             nextMode == FlightStack::ApModeValue.CWS |
             (nextMode == FlightStack::ApModeValue.CwsSuspended & cwsHeld)) &
          ((request != FlightStack::ApGuidanceRequestValue.Requested) implies
            request == FlightStack::ApGuidanceRequestValue.NotRequested);

        // @generated-support GEN-SUP-01 supporting POL-PRI-01 and POL-PRI-02
        def apDisengageSelected(ap: FlightStack::QualifiedApDisposition): Base_Types::Boolean :=
          ap.commandConflict | ap.apAction == FlightStack::ApAction.Disengage;

        // @trace CASE-CMD-01
        def CASE_CMD_01(c: FlightStack::CrewRequests,
                        fd: FlightStack::QualifiedFdAndSyncDisposition,
                        ap: FlightStack::QualifiedApDisposition): Base_Types::Boolean :=
          allCrewStatusesValid(c.displayFdStatus, c.syncFdStatus,
                               c.engageApStatus, c.cwsStatus) implies
            fd.fdAction == (if c.displayFdWanted ? FlightStack::FdAction.Display else FlightStack::FdAction.Clear) &
            fd.syncRequested == c.syncFd &
            ap.apAction == (if c.engageApWanted ? FlightStack::ApAction.Engage else FlightStack::ApAction.Disengage) &
            ap.cwsAction == (if c.cwsHeld ? FlightStack::CwsAction.Hold else FlightStack::CwsAction.Release) &
            fd.commandConflict == ((not c.engageApWanted) & (c.cwsHeld | c.syncFd | c.displayFdWanted)) &
            ap.commandConflict == fd.commandConflict;

        // @trace CASE-CMD-02
        def CASE_CMD_02(c: FlightStack::CrewRequests,
                        fd: FlightStack::QualifiedFdAndSyncDisposition,
                        ap: FlightStack::QualifiedApDisposition): Base_Types::Boolean :=
          (not allCrewStatusesValid(c.displayFdStatus, c.syncFdStatus,
                                    c.engageApStatus, c.cwsStatus)) implies
            fd.fdAction == (if not c.displayFdStatus ? FlightStack::FdAction.None
              else if c.displayFdWanted ? FlightStack::FdAction.Display
              else FlightStack::FdAction.Clear) &
            fd.syncRequested == (c.syncFdStatus & c.syncFd) &
            fd.commandConflict ==
              (c.engageApStatus & (not c.engageApWanted) &
               ((c.cwsStatus & c.cwsHeld) |
                (c.syncFdStatus & c.syncFd) |
                (c.displayFdStatus & c.displayFdWanted))) &
            ap.apAction == (if (not c.engageApStatus | not c.cwsStatus) ?
              FlightStack::ApAction.ForceDisengage
              else if c.engageApWanted ? FlightStack::ApAction.Engage
              else FlightStack::ApAction.Disengage) &
            ap.cwsAction == (if (not c.engageApStatus | not c.cwsStatus) ?
              FlightStack::CwsAction.ForceDisengage
              else if c.cwsHeld ? FlightStack::CwsAction.Hold
              else FlightStack::CwsAction.Release) &
            ap.commandConflict == fd.commandConflict;

        // @trace CASE-ATT-01
        def CASE_ATT_01(raw: FlightStack::AircraftAttitude,
                        qualified: FlightStack::QualifiedAttitude): Base_Types::Boolean :=
          safeRawAttitude(raw.rollTenthDeg, raw.pitchTenthDeg,
                          raw.rollStatus, raw.pitchStatus) implies
            qualified.classification == FlightStack::AttitudeClass.Safe &
            qualified.rollTenthDeg == raw.rollTenthDeg &
            qualified.pitchTenthDeg == raw.pitchTenthDeg;

        // @trace CASE-ATT-02
        def CASE_ATT_02(raw: FlightStack::AircraftAttitude,
                        qualified: FlightStack::QualifiedAttitude): Base_Types::Boolean :=
          ((not validRawAttitude(raw.rollStatus, raw.pitchStatus)) implies
            qualified.classification == FlightStack::AttitudeClass.Invalid) &
          ((validRawAttitude(raw.rollStatus, raw.pitchStatus) &
            not safeRawAttitude(raw.rollTenthDeg, raw.pitchTenthDeg,
                                raw.rollStatus, raw.pitchStatus)) implies
            qualified.classification == FlightStack::AttitudeClass.Unsafe &
            qualified.rollTenthDeg == raw.rollTenthDeg &
            qualified.pitchTenthDeg == raw.pitchTenthDeg);

        // @trace CASE-REF-01
        def CASE_REF_01(initializing: Base_Types::Boolean,
                        attitude: FlightStack::QualifiedAttitude,
                        prior: FlightStack::ReferenceAndFdState,
                        next: FlightStack::ReferenceAndFdState): Base_Types::Boolean :=
          (initializing implies
            next.referenceRoll == 0 [s32] & next.referencePitch == 0 [s32] &
            not next.referenceValid & next.fdState == FlightStack::FdStateValue.Cleared) &
          ((not initializing & attitude.classification == FlightStack::AttitudeClass.Invalid) implies
            next.referenceRoll == prior.referenceRoll & next.referencePitch == prior.referencePitch &
            not next.referenceValid & next.fdState == FlightStack::FdStateValue.Cleared);

        // @trace CASE-REF-02
        def CASE_REF_02(initializing: Base_Types::Boolean,
                        fd: FlightStack::QualifiedFdAndSyncDisposition,
                        attitude: FlightStack::QualifiedAttitude,
                        request: FlightStack::ApGuidanceRequestValue,
                        activeClearInhibit: Base_Types::Boolean,
                        prior: FlightStack::ReferenceAndFdState,
                        next: FlightStack::ReferenceAndFdState): Base_Types::Boolean :=
          ((not initializing) & (not fd.commandConflict) &
           attitude.classification == FlightStack::AttitudeClass.Safe &
           (fd.syncRequested | fd.fdAction == FlightStack::FdAction.Display |
            request == FlightStack::ApGuidanceRequestValue.Requested)) implies
            next.referenceRoll == attitude.rollTenthDeg &
            next.referencePitch == attitude.pitchTenthDeg & next.referenceValid &
            ((fd.fdAction == FlightStack::FdAction.Display) implies
              next.fdState == FlightStack::FdStateValue.Displayed) &
            ((fd.fdAction != FlightStack::FdAction.Display &
              fd.fdAction == FlightStack::FdAction.Clear & not activeClearInhibit) implies
              next.fdState == FlightStack::FdStateValue.Cleared) &
            ((fd.fdAction != FlightStack::FdAction.Display &
              (fd.fdAction != FlightStack::FdAction.Clear | activeClearInhibit)) implies
              next.fdState == prior.fdState);

        // @trace CASE-REF-03
        def CASE_REF_03(initializing: Base_Types::Boolean,
                        fd: FlightStack::QualifiedFdAndSyncDisposition,
                        attitude: FlightStack::QualifiedAttitude,
                        request: FlightStack::ApGuidanceRequestValue,
                        activeClearInhibit: Base_Types::Boolean,
                        prior: FlightStack::ReferenceAndFdState,
                        next: FlightStack::ReferenceAndFdState): Base_Types::Boolean :=
          ((not initializing) &
           not ((not fd.commandConflict) &
             attitude.classification == FlightStack::AttitudeClass.Safe &
             (fd.syncRequested | fd.fdAction == FlightStack::FdAction.Display |
              request == FlightStack::ApGuidanceRequestValue.Requested)) &
            attitude.classification != FlightStack::AttitudeClass.Invalid) implies
              next.referenceRoll == prior.referenceRoll & next.referencePitch == prior.referencePitch &
              next.referenceValid == prior.referenceValid &
              ((fd.commandConflict |
                (fd.fdAction == FlightStack::FdAction.Clear & not activeClearInhibit)) implies
                next.fdState == FlightStack::FdStateValue.Cleared) &
              (((not fd.commandConflict) &
                (fd.fdAction != FlightStack::FdAction.Clear | activeClearInhibit)) implies
                next.fdState == prior.fdState);

        // @trace CASE-FD-01
        def CASE_FD_01(attitude: FlightStack::QualifiedAttitude,
                       refState: FlightStack::ReferenceAndFdState,
                       fd: FlightStack::PairedFdGuidance,
                       health: FlightStack::PairedFcsIndications): Base_Types::Boolean :=
          (refState.referenceValid & attitude.classification == FlightStack::AttitudeClass.Safe) implies
            fd.leftRollGuidance == fd.rightRollGuidance &
            fd.leftPitchGuidance == fd.rightPitchGuidance & fd.leftFdOn == fd.rightFdOn &
            (fd.leftFdOn == (refState.fdState == FlightStack::FdStateValue.Displayed)) &
            ((refState.referenceRoll - attitude.rollTenthDeg < -450 [s32]) implies fd.leftRollGuidance == -450 [s32]) &
            ((-450 [s32] <= refState.referenceRoll - attitude.rollTenthDeg &
              refState.referenceRoll - attitude.rollTenthDeg <= 450 [s32]) implies
                fd.leftRollGuidance == refState.referenceRoll - attitude.rollTenthDeg) &
            ((450 [s32] < refState.referenceRoll - attitude.rollTenthDeg) implies fd.leftRollGuidance == 450 [s32]) &
            ((refState.referencePitch - attitude.pitchTenthDeg < -450 [s32]) implies fd.leftPitchGuidance == -450 [s32]) &
            ((-450 [s32] <= refState.referencePitch - attitude.pitchTenthDeg &
              refState.referencePitch - attitude.pitchTenthDeg <= 450 [s32]) implies
                fd.leftPitchGuidance == refState.referencePitch - attitude.pitchTenthDeg) &
            ((450 [s32] < refState.referencePitch - attitude.pitchTenthDeg) implies fd.leftPitchGuidance == 450 [s32]) &
            not health.leftFcsFailed & not health.rightFcsFailed &
            not health.leftUnsafeAttitude & not health.rightUnsafeAttitude;

        // @trace CASE-FD-02
        def CASE_FD_02(attitude: FlightStack::QualifiedAttitude,
                       refState: FlightStack::ReferenceAndFdState,
                       fd: FlightStack::PairedFdGuidance,
                       health: FlightStack::PairedFcsIndications): Base_Types::Boolean :=
          (not (refState.referenceValid & attitude.classification == FlightStack::AttitudeClass.Safe)) implies
            fd.leftRollGuidance == 0 [s32] & fd.rightRollGuidance == 0 [s32] &
            fd.leftPitchGuidance == 0 [s32] & fd.rightPitchGuidance == 0 [s32] &
            not fd.leftFdOn & not fd.rightFdOn &
            health.leftFcsFailed == health.rightFcsFailed &
            health.leftUnsafeAttitude == health.rightUnsafeAttitude &
            (health.leftFcsFailed == (not refState.referenceValid |
              attitude.classification == FlightStack::AttitudeClass.Invalid)) &
            (health.leftUnsafeAttitude ==
              (attitude.classification == FlightStack::AttitudeClass.Unsafe));

        // @trace CASE-APG-01
        def CASE_APG_01(attitude: FlightStack::QualifiedAttitude,
                        refState: FlightStack::ReferenceAndFdState,
                        guidance: FlightStack::ApGuidanceAndValidity): Base_Types::Boolean :=
          (refState.referenceValid & attitude.classification == FlightStack::AttitudeClass.Safe &
           refState.fdState == FlightStack::FdStateValue.Displayed) implies
            guidance.rollGuidance == refState.referenceRoll &
            guidance.pitchGuidance == refState.referencePitch & guidance.guidanceValid;

        // @trace CASE-APG-02
        def CASE_APG_02(attitude: FlightStack::QualifiedAttitude,
                        refState: FlightStack::ReferenceAndFdState,
                        guidance: FlightStack::ApGuidanceAndValidity): Base_Types::Boolean :=
          (not (refState.referenceValid & attitude.classification == FlightStack::AttitudeClass.Safe &
             refState.fdState == FlightStack::FdStateValue.Displayed)) implies
            guidance.rollGuidance == 0 [s32] & guidance.pitchGuidance == 0 [s32] &
            not guidance.guidanceValid;

        // @trace CASE-AP-01
        def CASE_AP_01(initializing: Base_Types::Boolean,
                       priorMode: FlightStack::ApModeValue,
                       ap: FlightStack::QualifiedApDisposition,
                       attitude: FlightStack::QualifiedAttitude,
                       guidance: FlightStack::ApGuidanceAndValidity,
                       nextMode: FlightStack::ApModeValue,
                       status: FlightStack::PairedApStatus,
                       request: FlightStack::ApGuidanceRequestValue,
                       inhibit: Base_Types::Boolean,
                       authority: Base_Types::Boolean): Base_Types::Boolean :=
          (initializing implies
            nextMode == FlightStack::ApModeValue.Off &
            status.leftStatus == 1 [s32] & status.rightStatus == 1 [s32] &
            request == FlightStack::ApGuidanceRequestValue.Invalid & not inhibit & not authority) &
          ((not initializing & priorMode == FlightStack::ApModeValue.Off) implies
            (((ap.apAction == FlightStack::ApAction.ForceDisengage |
               ap.cwsAction == FlightStack::CwsAction.ForceDisengage |
               attitude.classification == FlightStack::AttitudeClass.Invalid) implies
                nextMode == FlightStack::ApModeValue.Failed) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification != FlightStack::AttitudeClass.Invalid &
               apDisengageSelected(ap)) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification != FlightStack::AttitudeClass.Invalid &
               not apDisengageSelected(ap) &
               attitude.classification == FlightStack::AttitudeClass.Unsafe) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               not apDisengageSelected(ap) &
               attitude.classification == FlightStack::AttitudeClass.Safe &
               ap.apAction == FlightStack::ApAction.Engage & guidance.guidanceValid) implies
                nextMode == FlightStack::ApModeValue.SyncPending) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               not apDisengageSelected(ap) &
               attitude.classification == FlightStack::AttitudeClass.Safe &
               not (ap.apAction == FlightStack::ApAction.Engage & guidance.guidanceValid)) implies
                nextMode == FlightStack::ApModeValue.Off) &
             apObservables(nextMode, ap.cwsAction == FlightStack::CwsAction.Hold,
                           status.leftStatus, status.rightStatus,
                           request, inhibit, authority)));

        // @trace CASE-AP-02
        def CASE_AP_02(initializing: Base_Types::Boolean,
                       priorMode: FlightStack::ApModeValue,
                       ap: FlightStack::QualifiedApDisposition,
                       attitude: FlightStack::QualifiedAttitude,
                       guidance: FlightStack::ApGuidanceAndValidity,
                       nextMode: FlightStack::ApModeValue,
                       status: FlightStack::PairedApStatus,
                       request: FlightStack::ApGuidanceRequestValue,
                       inhibit: Base_Types::Boolean,
                       authority: Base_Types::Boolean): Base_Types::Boolean :=
          ((not initializing) & priorMode == FlightStack::ApModeValue.SyncPending) implies
            (((ap.apAction == FlightStack::ApAction.ForceDisengage |
               ap.cwsAction == FlightStack::CwsAction.ForceDisengage |
               attitude.classification == FlightStack::AttitudeClass.Invalid |
               (attitude.classification == FlightStack::AttitudeClass.Safe & not guidance.guidanceValid)) implies
                nextMode == FlightStack::ApModeValue.Failed) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification != FlightStack::AttitudeClass.Invalid &
               not (attitude.classification == FlightStack::AttitudeClass.Safe & not guidance.guidanceValid) &
               apDisengageSelected(ap)) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((not apDisengageSelected(ap) &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Unsafe) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((not apDisengageSelected(ap) &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid) implies
                nextMode == FlightStack::ApModeValue.On) &
             apObservables(nextMode, ap.cwsAction == FlightStack::CwsAction.Hold,
                           status.leftStatus, status.rightStatus,
                           request, inhibit, authority));

        // @trace CASE-AP-03
        def CASE_AP_03(initializing: Base_Types::Boolean,
                       priorMode: FlightStack::ApModeValue,
                       ap: FlightStack::QualifiedApDisposition,
                       attitude: FlightStack::QualifiedAttitude,
                       guidance: FlightStack::ApGuidanceAndValidity,
                       nextMode: FlightStack::ApModeValue,
                       status: FlightStack::PairedApStatus,
                       request: FlightStack::ApGuidanceRequestValue,
                       inhibit: Base_Types::Boolean,
                       authority: Base_Types::Boolean): Base_Types::Boolean :=
          ((not initializing) & priorMode == FlightStack::ApModeValue.On &
           ap.apAction != FlightStack::ApAction.ForceDisengage &
           not apDisengageSelected(ap) &
           ap.cwsAction == FlightStack::CwsAction.Hold &
           attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid) implies
            nextMode == FlightStack::ApModeValue.CWS &
            apObservables(nextMode, true, status.leftStatus, status.rightStatus,
                          request, inhibit, authority);

        // @trace CASE-AP-04
        def CASE_AP_04(initializing: Base_Types::Boolean,
                       priorMode: FlightStack::ApModeValue,
                       ap: FlightStack::QualifiedApDisposition,
                       attitude: FlightStack::QualifiedAttitude,
                       guidance: FlightStack::ApGuidanceAndValidity,
                       nextMode: FlightStack::ApModeValue,
                       status: FlightStack::PairedApStatus,
                       request: FlightStack::ApGuidanceRequestValue,
                       inhibit: Base_Types::Boolean,
                       authority: Base_Types::Boolean): Base_Types::Boolean :=
          ((not initializing) &
           (priorMode == FlightStack::ApModeValue.CWS | priorMode == FlightStack::ApModeValue.CwsSuspended)) implies
            (((ap.apAction == FlightStack::ApAction.ForceDisengage |
               ap.cwsAction == FlightStack::CwsAction.ForceDisengage |
               attitude.classification == FlightStack::AttitudeClass.Invalid |
               (attitude.classification == FlightStack::AttitudeClass.Safe & not guidance.guidanceValid)) implies
                nextMode == FlightStack::ApModeValue.Failed) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification != FlightStack::AttitudeClass.Invalid &
               not (attitude.classification == FlightStack::AttitudeClass.Safe & not guidance.guidanceValid) &
               apDisengageSelected(ap)) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               not apDisengageSelected(ap) &
               attitude.classification == FlightStack::AttitudeClass.Unsafe &
               ap.cwsAction == FlightStack::CwsAction.Hold) implies
                nextMode == FlightStack::ApModeValue.CwsSuspended) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               not apDisengageSelected(ap) &
               attitude.classification == FlightStack::AttitudeClass.Unsafe &
               ap.cwsAction != FlightStack::CwsAction.Hold) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((priorMode == FlightStack::ApModeValue.CWS &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               not apDisengageSelected(ap) &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid &
               ap.cwsAction == FlightStack::CwsAction.Release) implies
                nextMode == FlightStack::ApModeValue.On) &
             ((priorMode == FlightStack::ApModeValue.CWS &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               not apDisengageSelected(ap) &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid &
               ap.cwsAction != FlightStack::CwsAction.Release) implies
                nextMode == FlightStack::ApModeValue.CWS) &
             ((priorMode == FlightStack::ApModeValue.CwsSuspended &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               not apDisengageSelected(ap) &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid &
               ap.cwsAction == FlightStack::CwsAction.Release) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((priorMode == FlightStack::ApModeValue.CwsSuspended &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               not apDisengageSelected(ap) &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid &
               ap.cwsAction != FlightStack::CwsAction.Release) implies
                nextMode == FlightStack::ApModeValue.CwsSuspended) &
             apObservables(nextMode, ap.cwsAction == FlightStack::CwsAction.Hold,
                           status.leftStatus, status.rightStatus,
                           request, inhibit, authority));

        // @trace CASE-AP-05
        def CASE_AP_05(initializing: Base_Types::Boolean,
                       priorMode: FlightStack::ApModeValue,
                       ap: FlightStack::QualifiedApDisposition,
                       attitude: FlightStack::QualifiedAttitude,
                       guidance: FlightStack::ApGuidanceAndValidity,
                       nextMode: FlightStack::ApModeValue,
                       status: FlightStack::PairedApStatus,
                       request: FlightStack::ApGuidanceRequestValue,
                       inhibit: Base_Types::Boolean,
                       authority: Base_Types::Boolean): Base_Types::Boolean :=
          ((not initializing) & priorMode == FlightStack::ApModeValue.On &
           not (ap.apAction != FlightStack::ApAction.ForceDisengage &
             not apDisengageSelected(ap) &
             ap.cwsAction == FlightStack::CwsAction.Hold &
             attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid)) implies
            (((ap.apAction == FlightStack::ApAction.ForceDisengage |
               ap.cwsAction == FlightStack::CwsAction.ForceDisengage |
               attitude.classification == FlightStack::AttitudeClass.Invalid |
               (attitude.classification == FlightStack::AttitudeClass.Safe & not guidance.guidanceValid)) implies
                nextMode == FlightStack::ApModeValue.Failed) &
             ((ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification != FlightStack::AttitudeClass.Invalid &
               not (attitude.classification == FlightStack::AttitudeClass.Safe & not guidance.guidanceValid) &
               apDisengageSelected(ap)) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((not apDisengageSelected(ap) &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Unsafe) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((not apDisengageSelected(ap) &
               ap.apAction != FlightStack::ApAction.ForceDisengage &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid) implies
                nextMode == FlightStack::ApModeValue.On) &
             apObservables(nextMode, false, status.leftStatus, status.rightStatus,
                           request, inhibit, authority));

        // @trace CASE-AP-06
        def CASE_AP_06(initializing: Base_Types::Boolean,
                       priorMode: FlightStack::ApModeValue,
                       ap: FlightStack::QualifiedApDisposition,
                       attitude: FlightStack::QualifiedAttitude,
                       guidance: FlightStack::ApGuidanceAndValidity,
                       nextMode: FlightStack::ApModeValue,
                       status: FlightStack::PairedApStatus,
                       request: FlightStack::ApGuidanceRequestValue,
                       inhibit: Base_Types::Boolean,
                       authority: Base_Types::Boolean): Base_Types::Boolean :=
          ((not initializing) & priorMode == FlightStack::ApModeValue.Failed) implies
            (((apDisengageSelected(ap) &
               ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
               attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid) implies
                nextMode == FlightStack::ApModeValue.Off) &
             ((not (apDisengageSelected(ap) &
                ap.cwsAction != FlightStack::CwsAction.ForceDisengage &
                attitude.classification == FlightStack::AttitudeClass.Safe & guidance.guidanceValid)) implies
                nextMode == FlightStack::ApModeValue.Failed) &
             apObservables(nextMode, false, status.leftStatus, status.rightStatus,
                           request, inhibit, authority));

        // @trace CASE-PROP-01
        def CASE_PROP_01(guidance: FlightStack::ApGuidanceAndValidity,
                         attitude: FlightStack::QualifiedAttitude,
                         proposal: FlightStack::ProposedActuatorRates): Base_Types::Boolean :=
          ((guidance.guidanceValid & attitude.classification == FlightStack::AttitudeClass.Safe) implies
            proposal.proposalValid &
            ((guidance.rollGuidance - attitude.rollTenthDeg < -1 [s32]) implies proposal.rollRate == -50 [s32]) &
            ((-1 [s32] <= guidance.rollGuidance - attitude.rollTenthDeg &
              guidance.rollGuidance - attitude.rollTenthDeg <= 1 [s32]) implies proposal.rollRate == 0 [s32]) &
            ((1 [s32] < guidance.rollGuidance - attitude.rollTenthDeg) implies proposal.rollRate == 50 [s32]) &
            ((guidance.pitchGuidance - attitude.pitchTenthDeg < -1 [s32]) implies proposal.pitchRate == -50 [s32]) &
            ((-1 [s32] <= guidance.pitchGuidance - attitude.pitchTenthDeg &
              guidance.pitchGuidance - attitude.pitchTenthDeg <= 1 [s32]) implies proposal.pitchRate == 0 [s32]) &
            ((1 [s32] < guidance.pitchGuidance - attitude.pitchTenthDeg) implies proposal.pitchRate == 50 [s32])) &
          (((not (guidance.guidanceValid & attitude.classification == FlightStack::AttitudeClass.Safe))) implies
            not proposal.proposalValid & proposal.rollRate == 0 [s32] & proposal.pitchRate == 0 [s32]);

        // @trace CASE-GATE-01
        def CASE_GATE_01(authority: Base_Types::Boolean,
                         proposal: FlightStack::ProposedActuatorRates,
                         command: FlightStack::ActuatorCommand): Base_Types::Boolean :=
          (authority & proposal.proposalValid) implies
            command.rollRateTenthDegPerSec == proposal.rollRate &
            command.pitchRateTenthDegPerSec == proposal.pitchRate & command.apOn;

        // @trace CASE-GATE-02
        def CASE_GATE_02(authority: Base_Types::Boolean,
                         proposal: FlightStack::ProposedActuatorRates,
                         command: FlightStack::ActuatorCommand): Base_Types::Boolean :=
          ((not (authority & proposal.proposalValid))) implies
            command.rollRateTenthDegPerSec == 0 [s32] &
            command.pitchRateTenthDegPerSec == 0 [s32] & not command.apOn;
  }*/

  // @trace PART-FCS-01
  part def CrewCommandQualifier :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-BND-01
    port crewRequests : DataPort { in :>> type : CrewRequests; }
    // @trace INT-FCS-01
    port fdDisposition : DataPort { out :>> type : QualifiedFdAndSyncDisposition; }
    // @trace INT-FCS-02
    port apDisposition : DataPort { out :>> type : QualifiedApDisposition; }
  }

  // @trace PART-FCS-02
  part def AttitudeSafetyQualifier :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-BND-02
    port aircraftAttitude : DataPort { in :>> type : AircraftAttitude; }
    // @trace INT-FCS-03
    port qualifiedAttitude : DataPort { out :>> type : QualifiedAttitude; }
  }

  // @trace PART-FGS-01
  part def ReferenceManager :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-FCS-01
    port fdDisposition : DataPort { in :>> type : QualifiedFdAndSyncDisposition; }
    // @trace INT-FGS-01
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    // @trace INT-CROSS-02A
    port apGuidanceRequest : DataPort { in :>> type : ApGuidanceRequestValue; }
    // @trace INT-CROSS-02B
    port apActiveClearInhibit : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-FGS-03
    port referenceAndFdState : DataPort { out :>> type : ReferenceAndFdState; }
  }

  // @trace PART-FGS-02
  part def FdGuidanceHealthGenerator :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-FGS-02
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    // @trace INT-FGS-03
    port referenceAndFdState : DataPort { in :>> type : ReferenceAndFdState; }
    // @trace INT-BND-03
    port pairedFdGuidance : DataPort { out :>> type : PairedFdGuidance; }
    // @trace INT-BND-04
    port pairedFcsIndications : DataPort { out :>> type : PairedFcsIndications; }
  }

  // @trace PART-FGS-03
  part def ApGuidanceGenerator :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-FGS-04
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    // @trace INT-FGS-05
    port referenceAndFdState : DataPort { in :>> type : ReferenceAndFdState; }
    // @trace INT-CROSS-01
    port apGuidance : DataPort { out :>> type : ApGuidanceAndValidity; }
  }

  // @trace PART-APS-01
  part def ApEngagementManager :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-FCS-02
    port apDisposition : DataPort { in :>> type : QualifiedApDisposition; }
    // @trace INT-FCS-03
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    // @trace INT-CROSS-01
    port apGuidance : DataPort { in :>> type : ApGuidanceAndValidity; }
    // @trace INT-BND-05
    port pairedApStatus : DataPort { out :>> type : PairedApStatus; }
    // @trace INT-CROSS-02A
    port apGuidanceRequest : DataPort { out :>> type : ApGuidanceRequestValue; }
    // @trace INT-CROSS-02B
    port apActiveClearInhibit : DataPort { out :>> type : Base_Types::Boolean; }
    // @trace INT-APS-02
    port actuationAuthority : DataPort { out :>> type : Base_Types::Boolean; }
  }

  // @trace PART-APS-02
  part def ActuatorRateProposer :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-CROSS-03
    port apGuidance : DataPort { in :>> type : ApGuidanceAndValidity; }
    // @trace INT-APS-01
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    // @trace INT-APS-03
    port proposedRates : DataPort { out :>> type : ProposedActuatorRates; }
  }

  // @trace PART-APS-03
  part def ActuatorSafetyGate :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-APS-02
    port actuationAuthority : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-APS-03
    port proposedRates : DataPort { in :>> type : ProposedActuatorRates; }
    // @trace INT-BND-06
    port actuatorCommand : DataPort { out :>> type : ActuatorCommand; }
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-FCS-01
  part def FcsCrewCommandQualifierProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 2;
    port crewRequests : DataPort { in :>> type : CrewRequests; }
    port fdDisposition : DataPort { out :>> type : QualifiedFdAndSyncDisposition; }
    port apDisposition : DataPort { out :>> type : QualifiedApDisposition; }
    part behavior : CrewCommandQualifier;
    connection deploy_crew_in : PortConnection connect crewRequests to behavior.crewRequests;
    connection deploy_fd_out : PortConnection connect behavior.fdDisposition to fdDisposition;
    connection deploy_ap_out : PortConnection connect behavior.apDisposition to apDisposition;
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-FCS-02
  part def FcsAttitudeSafetyQualifierProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 3;
    port aircraftAttitude : DataPort { in :>> type : AircraftAttitude; }
    port qualifiedAttitude : DataPort { out :>> type : QualifiedAttitude; }
    part behavior : AttitudeSafetyQualifier;
    connection deploy_attitude_in : PortConnection connect aircraftAttitude to behavior.aircraftAttitude;
    connection deploy_qualified_out : PortConnection connect behavior.qualifiedAttitude to qualifiedAttitude;
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-FGS-01
  part def FgsReferenceManagerProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 4;
    port fdDisposition : DataPort { in :>> type : QualifiedFdAndSyncDisposition; }
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    port apGuidanceRequest : DataPort { in :>> type : ApGuidanceRequestValue; }
    port apActiveClearInhibit : DataPort { in :>> type : Base_Types::Boolean; }
    port referenceAndFdState : DataPort { out :>> type : ReferenceAndFdState; }
    part behavior : ReferenceManager;
    connection deploy_fd_in : PortConnection connect fdDisposition to behavior.fdDisposition;
    connection deploy_attitude_in : PortConnection connect qualifiedAttitude to behavior.qualifiedAttitude;
    connection deploy_request_in : PortConnection connect apGuidanceRequest to behavior.apGuidanceRequest;
    connection deploy_inhibit_in : PortConnection connect apActiveClearInhibit to behavior.apActiveClearInhibit;
    connection deploy_state_out : PortConnection connect behavior.referenceAndFdState to referenceAndFdState;
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-FGS-02
  part def FgsFdGuidanceHealthGeneratorProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 5;
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    port referenceAndFdState : DataPort { in :>> type : ReferenceAndFdState; }
    port pairedFdGuidance : DataPort { out :>> type : PairedFdGuidance; }
    port pairedFcsIndications : DataPort { out :>> type : PairedFcsIndications; }
    part behavior : FdGuidanceHealthGenerator;
    connection deploy_attitude_in : PortConnection connect qualifiedAttitude to behavior.qualifiedAttitude;
    connection deploy_state_in : PortConnection connect referenceAndFdState to behavior.referenceAndFdState;
    connection deploy_fd_out : PortConnection connect behavior.pairedFdGuidance to pairedFdGuidance;
    connection deploy_health_out : PortConnection connect behavior.pairedFcsIndications to pairedFcsIndications;
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-FGS-03
  part def FgsApGuidanceGeneratorProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 6;
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    port referenceAndFdState : DataPort { in :>> type : ReferenceAndFdState; }
    port apGuidance : DataPort { out :>> type : ApGuidanceAndValidity; }
    part behavior : ApGuidanceGenerator;
    connection deploy_attitude_in : PortConnection connect qualifiedAttitude to behavior.qualifiedAttitude;
    connection deploy_state_in : PortConnection connect referenceAndFdState to behavior.referenceAndFdState;
    connection deploy_guidance_out : PortConnection connect behavior.apGuidance to apGuidance;
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-APS-01
  part def ApEngagementManagerProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 7;
    port apDisposition : DataPort { in :>> type : QualifiedApDisposition; }
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    port apGuidance : DataPort { in :>> type : ApGuidanceAndValidity; }
    port pairedApStatus : DataPort { out :>> type : PairedApStatus; }
    port apGuidanceRequest : DataPort { out :>> type : ApGuidanceRequestValue; }
    port apActiveClearInhibit : DataPort { out :>> type : Base_Types::Boolean; }
    port actuationAuthority : DataPort { out :>> type : Base_Types::Boolean; }
    part behavior : ApEngagementManager;
    connection deploy_disposition_in : PortConnection connect apDisposition to behavior.apDisposition;
    connection deploy_attitude_in : PortConnection connect qualifiedAttitude to behavior.qualifiedAttitude;
    connection deploy_guidance_in : PortConnection connect apGuidance to behavior.apGuidance;
    connection deploy_status_out : PortConnection connect behavior.pairedApStatus to pairedApStatus;
    connection deploy_request_out : PortConnection connect behavior.apGuidanceRequest to apGuidanceRequest;
    connection deploy_inhibit_out : PortConnection connect behavior.apActiveClearInhibit to apActiveClearInhibit;
    connection deploy_authority_out : PortConnection connect behavior.actuationAuthority to actuationAuthority;
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-APS-02
  part def ApActuatorRateProposerProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 8;
    port apGuidance : DataPort { in :>> type : ApGuidanceAndValidity; }
    port qualifiedAttitude : DataPort { in :>> type : QualifiedAttitude; }
    port proposedRates : DataPort { out :>> type : ProposedActuatorRates; }
    part behavior : ActuatorRateProposer;
    connection deploy_guidance_in : PortConnection connect apGuidance to behavior.apGuidance;
    connection deploy_attitude_in : PortConnection connect qualifiedAttitude to behavior.qualifiedAttitude;
    connection deploy_rates_out : PortConnection connect behavior.proposedRates to proposedRates;
  }

  // @generated-support GEN-SUP-01 supporting Microkit deployment of PART-APS-03
  part def ApActuatorSafetyGateProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 9;
    port actuationAuthority : DataPort { in :>> type : Base_Types::Boolean; }
    port proposedRates : DataPort { in :>> type : ProposedActuatorRates; }
    port actuatorCommand : DataPort { out :>> type : ActuatorCommand; }

    part behavior : ActuatorSafetyGate;
    connection deploy_authority_in : PortConnection connect actuationAuthority to behavior.actuationAuthority;
    connection deploy_rates_in : PortConnection connect proposedRates to behavior.proposedRates;
    connection deploy_command_out : PortConnection connect behavior.actuatorCommand to actuatorCommand;
  }

  // @generated-support GEN-SUP-01 supporting the single Microkit processor
  part def FlightStackProcessor :> HAMR_AADL::Processor {
    attribute :>> Max_Domain = 9;
    // Required Microkit scheduling metadata only; no FORM-STEP-01 timing claim.
    attribute :>> Clock_Period = 1 [ms];
    attribute :>> Frame_Period = 1000 [ms];
  }

  // @trace BND-01
  part def FlightControlSystem :> System {
    attribute Scheduling : HAMR_Microkit::Scheduling = HAMR_Microkit::Domain_Scheduling;
    // @trace INT-BND-01
    port crewRequests : DataPort { in :>> type : CrewRequests; }
    // @trace INT-BND-02
    port aircraftAttitude : DataPort { in :>> type : AircraftAttitude; }
    // @trace INT-BND-03
    port pairedFdGuidance : DataPort { out :>> type : PairedFdGuidance; }
    // @trace INT-BND-04
    port pairedFcsIndications : DataPort { out :>> type : PairedFcsIndications; }
    // @trace INT-BND-05
    port pairedApStatus : DataPort { out :>> type : PairedApStatus; }
    // @trace INT-BND-06
    port actuatorCommand : DataPort { out :>> type : ActuatorCommand; }

    // @generated-support GEN-SUP-01 supporting Microkit processor binding
    part flightStackProcessor : FlightStackProcessor;

    // @trace PART-FCS-01
    part crewCommandQualifier : FcsCrewCommandQualifierProcess;
    // @trace PART-FCS-02
    part attitudeSafetyQualifier : FcsAttitudeSafetyQualifierProcess;
    // @trace PART-FGS-01
    part referenceManager : FgsReferenceManagerProcess;
    // @trace PART-FGS-02
    part fdGuidanceHealthGenerator : FgsFdGuidanceHealthGeneratorProcess;
    // @trace PART-FGS-03
    part apGuidanceGenerator : FgsApGuidanceGeneratorProcess;
    // @trace PART-APS-01
    part apEngagementManager : ApEngagementManagerProcess;
    // @trace PART-APS-02
    part actuatorRateProposer : ApActuatorRateProposerProcess;
    // @trace PART-APS-03
    part actuatorSafetyGate : ApActuatorSafetyGateProcess;

    // @generated-support GEN-SUP-01 supporting Microkit processor bindings
    allocation bind_crew_command : Deployment_Properties::Actual_Processor_Binding allocate crewCommandQualifier to flightStackProcessor;
    allocation bind_attitude_safety : Deployment_Properties::Actual_Processor_Binding allocate attitudeSafetyQualifier to flightStackProcessor;
    allocation bind_reference : Deployment_Properties::Actual_Processor_Binding allocate referenceManager to flightStackProcessor;
    allocation bind_fd_health : Deployment_Properties::Actual_Processor_Binding allocate fdGuidanceHealthGenerator to flightStackProcessor;
    allocation bind_ap_guidance : Deployment_Properties::Actual_Processor_Binding allocate apGuidanceGenerator to flightStackProcessor;
    allocation bind_ap_engagement : Deployment_Properties::Actual_Processor_Binding allocate apEngagementManager to flightStackProcessor;
    allocation bind_rate_proposer : Deployment_Properties::Actual_Processor_Binding allocate actuatorRateProposer to flightStackProcessor;
    allocation bind_safety_gate : Deployment_Properties::Actual_Processor_Binding allocate actuatorSafetyGate to flightStackProcessor;

    // @trace INT-BND-01
    connection int_bnd_01 : PortConnection connect crewRequests to crewCommandQualifier.crewRequests;
    // @trace INT-BND-02
    connection int_bnd_02 : PortConnection connect aircraftAttitude to attitudeSafetyQualifier.aircraftAttitude;
    // @trace INT-BND-03
    connection int_bnd_03 : PortConnection connect fdGuidanceHealthGenerator.pairedFdGuidance to pairedFdGuidance;
    // @trace INT-BND-04
    connection int_bnd_04 : PortConnection connect fdGuidanceHealthGenerator.pairedFcsIndications to pairedFcsIndications;
    // @trace INT-BND-05
    connection int_bnd_05 : PortConnection connect apEngagementManager.pairedApStatus to pairedApStatus;
    // @trace INT-BND-06
    connection int_bnd_06 : PortConnection connect actuatorSafetyGate.actuatorCommand to actuatorCommand;

    // @trace INT-FCS-01
    connection int_fcs_01 : PortConnection connect crewCommandQualifier.fdDisposition to referenceManager.fdDisposition;
    // @trace INT-FCS-02
    connection int_fcs_02 : PortConnection connect crewCommandQualifier.apDisposition to apEngagementManager.apDisposition;
    // @trace INT-FCS-03
    connection int_fcs_03 : PortConnection connect attitudeSafetyQualifier.qualifiedAttitude to apEngagementManager.qualifiedAttitude;
    // @trace INT-FGS-01
    connection int_fgs_01 : PortConnection connect attitudeSafetyQualifier.qualifiedAttitude to referenceManager.qualifiedAttitude;
    // @trace INT-FGS-02
    connection int_fgs_02 : PortConnection connect attitudeSafetyQualifier.qualifiedAttitude to fdGuidanceHealthGenerator.qualifiedAttitude;
    // @trace INT-FGS-03
    connection int_fgs_03 : PortConnection connect referenceManager.referenceAndFdState to fdGuidanceHealthGenerator.referenceAndFdState;
    // @trace INT-FGS-04
    connection int_fgs_04 : PortConnection connect attitudeSafetyQualifier.qualifiedAttitude to apGuidanceGenerator.qualifiedAttitude;
    // @trace INT-FGS-05
    connection int_fgs_05 : PortConnection connect referenceManager.referenceAndFdState to apGuidanceGenerator.referenceAndFdState;
    // @trace INT-CROSS-01
    connection int_cross_01 : PortConnection connect apGuidanceGenerator.apGuidance to apEngagementManager.apGuidance;
    // @trace INT-CROSS-02A
    connection int_cross_02a : PortConnection connect apEngagementManager.apGuidanceRequest to referenceManager.apGuidanceRequest;
    // @trace INT-CROSS-02B
    connection int_cross_02b : PortConnection connect apEngagementManager.apActiveClearInhibit to referenceManager.apActiveClearInhibit;
    // @trace INT-CROSS-03
    connection int_cross_03 : PortConnection connect apGuidanceGenerator.apGuidance to actuatorRateProposer.apGuidance;
    // @trace INT-APS-01
    connection int_aps_01 : PortConnection connect attitudeSafetyQualifier.qualifiedAttitude to actuatorRateProposer.qualifiedAttitude;
    // @trace INT-APS-02
    connection int_aps_02 : PortConnection connect apEngagementManager.actuationAuthority to actuatorSafetyGate.actuationAuthority;
    // @trace INT-APS-03
    connection int_aps_03 : PortConnection connect actuatorRateProposer.proposedRates to actuatorSafetyGate.proposedRates;
  }

}
