#![cfg_attr(not(test), no_std)]

#![allow(non_camel_case_types)]
#![allow(non_snake_case)]
#![allow(non_upper_case_globals)]

#![allow(dead_code)]
#![allow(static_mut_refs)]
#![allow(unused_imports)]
#![allow(unused_macros)]
#![allow(unused_parens)]
#![allow(unused_unsafe)]
#![allow(unused_variables)]

#![feature(proc_macro_hygiene)]
#![cfg_attr(not(verus_keep_ghost), feature(stmt_expr_attributes))]

// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use vstd::prelude::*;

macro_rules! implies {
  ($lhs: expr, $rhs: expr) => {
    !$lhs || $rhs
  };
}

macro_rules! impliesL {
  ($lhs: expr, $rhs: expr) => {
    !$lhs | $rhs
  };
}

// BEGIN MARKER GUMBO RUST MARKER
pub fn allCrewStatusesValid(
  displayStatus: bool,
  syncStatus: bool,
  engageStatus: bool,
  cwsStatus: bool) -> bool
{
  displayStatus & syncStatus &
    engageStatus &
    cwsStatus
}

pub fn safeRawAttitude(
  roll: i32,
  pitch: i32,
  rollStatus: bool,
  pitchStatus: bool) -> bool
{
  rollStatus & pitchStatus &
    (-450i32 <= roll) &
    (roll <= 450i32) &
    (-450i32 <= pitch) &
    (pitch <= 450i32)
}

pub fn validRawAttitude(
  rollStatus: bool,
  pitchStatus: bool) -> bool
{
  rollStatus & pitchStatus
}

pub fn apObservables(
  nextMode: FlightStack::ApModeValue,
  cwsHeld: bool,
  leftStatus: i32,
  rightStatus: i32,
  request: FlightStack::ApGuidanceRequestValue,
  inhibit: bool,
  authority: bool) -> bool
{
  (leftStatus == rightStatus) &
    (implies!(
      (nextMode == FlightStack::ApModeValue::On) |
        (nextMode == FlightStack::ApModeValue::CWS),
      (leftStatus == 2i32))) &
    (implies!(
      (nextMode == FlightStack::ApModeValue::Off) |
        (nextMode == FlightStack::ApModeValue::SyncPending) |
        (nextMode == FlightStack::ApModeValue::CwsSuspended),
      (leftStatus == 1i32))) &
    (implies!(
      (nextMode == FlightStack::ApModeValue::Failed),
      (leftStatus == 0i32))) &
    (authority == (nextMode == FlightStack::ApModeValue::On)) &
    (inhibit == (nextMode == FlightStack::ApModeValue::SyncPending) |
      (nextMode == FlightStack::ApModeValue::On) |
      (nextMode == FlightStack::ApModeValue::CWS)) &
    ((request == FlightStack::ApGuidanceRequestValue::Requested) == (nextMode == FlightStack::ApModeValue::SyncPending) |
      (nextMode == FlightStack::ApModeValue::CWS) |
      (nextMode == FlightStack::ApModeValue::CwsSuspended) &
        cwsHeld) &
    (implies!(
      (request != FlightStack::ApGuidanceRequestValue::Requested),
      (request == FlightStack::ApGuidanceRequestValue::NotRequested)))
}

pub fn apDisengageSelected(ap: FlightStack::QualifiedApDisposition) -> bool
{
  ap.commandConflict |
    (ap.apAction == FlightStack::ApAction::Disengage)
}

pub fn CASE_CMD_01(
  c: FlightStack::CrewRequests,
  fd: FlightStack::QualifiedFdAndSyncDisposition,
  ap: FlightStack::QualifiedApDisposition) -> bool
{
  implies!(
    allCrewStatusesValid(c.displayFdStatus, c.syncFdStatus, c.engageApStatus, c.cwsStatus),
    (fd.fdAction ==
      (if (c.displayFdWanted) {
        FlightStack::FdAction::Display
      } else {
        FlightStack::FdAction::Clear
      })) &
      (fd.syncRequested == c.syncFd) &
      (ap.apAction ==
        (if (c.engageApWanted) {
          FlightStack::ApAction::Engage
        } else {
          FlightStack::ApAction::Disengage
        })) &
      (ap.cwsAction ==
        (if (c.cwsHeld) {
          FlightStack::CwsAction::Hold
        } else {
          FlightStack::CwsAction::Release
        })) &
      (fd.commandConflict == !(c.engageApWanted) &
        (c.cwsHeld | c.syncFd |
          c.displayFdWanted)) &
      (ap.commandConflict == fd.commandConflict))
}

pub fn CASE_CMD_02(
  c: FlightStack::CrewRequests,
  fd: FlightStack::QualifiedFdAndSyncDisposition,
  ap: FlightStack::QualifiedApDisposition) -> bool
{
  implies!(
    !(allCrewStatusesValid(c.displayFdStatus, c.syncFdStatus, c.engageApStatus, c.cwsStatus)),
    (fd.fdAction ==
      (if (!(c.displayFdStatus)) {
        FlightStack::FdAction::None
      } else {
        if (c.displayFdWanted) {
          FlightStack::FdAction::Display
        } else {
          FlightStack::FdAction::Clear
        }
      })) &
      (fd.syncRequested == c.syncFdStatus & c.syncFd) &
      (fd.commandConflict == c.engageApStatus & !(c.engageApWanted) &
        (c.cwsStatus & c.cwsHeld |
          c.syncFdStatus & c.syncFd |
          c.displayFdStatus & c.displayFdWanted)) &
      (ap.apAction ==
        (if (!(c.engageApStatus) | !(c.cwsStatus)) {
          FlightStack::ApAction::ForceDisengage
        } else {
          if (c.engageApWanted) {
            FlightStack::ApAction::Engage
          } else {
            FlightStack::ApAction::Disengage
          }
        })) &
      (ap.cwsAction ==
        (if (!(c.engageApStatus) | !(c.cwsStatus)) {
          FlightStack::CwsAction::ForceDisengage
        } else {
          if (c.cwsHeld) {
            FlightStack::CwsAction::Hold
          } else {
            FlightStack::CwsAction::Release
          }
        })) &
      (ap.commandConflict == fd.commandConflict))
}

pub fn CASE_ATT_01(
  raw: FlightStack::AircraftAttitude,
  qualified: FlightStack::QualifiedAttitude) -> bool
{
  implies!(
    safeRawAttitude(raw.rollTenthDeg, raw.pitchTenthDeg, raw.rollStatus, raw.pitchStatus),
    (qualified.classification == FlightStack::AttitudeClass::Safe) &
      (qualified.rollTenthDeg == raw.rollTenthDeg) &
      (qualified.pitchTenthDeg == raw.pitchTenthDeg))
}

pub fn CASE_ATT_02(
  raw: FlightStack::AircraftAttitude,
  qualified: FlightStack::QualifiedAttitude) -> bool
{
  (implies!(
    !(validRawAttitude(raw.rollStatus, raw.pitchStatus)),
    (qualified.classification == FlightStack::AttitudeClass::Invalid))) &
    (implies!(
      validRawAttitude(raw.rollStatus, raw.pitchStatus) & !(safeRawAttitude(raw.rollTenthDeg, raw.pitchTenthDeg, raw.rollStatus, raw.pitchStatus)),
      (qualified.classification == FlightStack::AttitudeClass::Unsafe) &
        (qualified.rollTenthDeg == raw.rollTenthDeg) &
        (qualified.pitchTenthDeg == raw.pitchTenthDeg)))
}

pub fn CASE_REF_01(
  initializing: bool,
  attitude: FlightStack::QualifiedAttitude,
  prior: FlightStack::ReferenceAndFdState,
  next: FlightStack::ReferenceAndFdState) -> bool
{
  (implies!(
    initializing,
    (next.referenceRoll == 0i32) &
      (next.referencePitch == 0i32) &
      !(next.referenceValid) &
      (next.fdState == FlightStack::FdStateValue::Cleared))) &
    (implies!(
      !initializing &
        (attitude.classification == FlightStack::AttitudeClass::Invalid),
      (next.referenceRoll == prior.referenceRoll) &
        (next.referencePitch == prior.referencePitch) &
        !(next.referenceValid) &
        (next.fdState == FlightStack::FdStateValue::Cleared)))
}

pub fn CASE_REF_02(
  initializing: bool,
  fd: FlightStack::QualifiedFdAndSyncDisposition,
  attitude: FlightStack::QualifiedAttitude,
  request: FlightStack::ApGuidanceRequestValue,
  activeClearInhibit: bool,
  prior: FlightStack::ReferenceAndFdState,
  next: FlightStack::ReferenceAndFdState) -> bool
{
  implies!(
    !initializing & !(fd.commandConflict) &
      (attitude.classification == FlightStack::AttitudeClass::Safe) &
      (fd.syncRequested |
        (fd.fdAction == FlightStack::FdAction::Display) |
        (request == FlightStack::ApGuidanceRequestValue::Requested)),
    (next.referenceRoll == attitude.rollTenthDeg) &
      (next.referencePitch == attitude.pitchTenthDeg) &
      next.referenceValid &
      (implies!(
        (fd.fdAction == FlightStack::FdAction::Display),
        (next.fdState == FlightStack::FdStateValue::Displayed))) &
      (implies!(
        (fd.fdAction != FlightStack::FdAction::Display) &
          (fd.fdAction == FlightStack::FdAction::Clear) &
          !activeClearInhibit,
        (next.fdState == FlightStack::FdStateValue::Cleared))) &
      (implies!(
        (fd.fdAction != FlightStack::FdAction::Display) &
          ((fd.fdAction != FlightStack::FdAction::Clear) |
            activeClearInhibit),
        (next.fdState == prior.fdState))))
}

pub fn CASE_REF_03(
  initializing: bool,
  fd: FlightStack::QualifiedFdAndSyncDisposition,
  attitude: FlightStack::QualifiedAttitude,
  request: FlightStack::ApGuidanceRequestValue,
  activeClearInhibit: bool,
  prior: FlightStack::ReferenceAndFdState,
  next: FlightStack::ReferenceAndFdState) -> bool
{
  implies!(
    !initializing & !(!(fd.commandConflict) &
      (attitude.classification == FlightStack::AttitudeClass::Safe) &
      (fd.syncRequested |
        (fd.fdAction == FlightStack::FdAction::Display) |
        (request == FlightStack::ApGuidanceRequestValue::Requested))) &
      (attitude.classification != FlightStack::AttitudeClass::Invalid),
    (next.referenceRoll == prior.referenceRoll) &
      (next.referencePitch == prior.referencePitch) &
      (next.referenceValid == prior.referenceValid) &
      (implies!(
        fd.commandConflict |
          (fd.fdAction == FlightStack::FdAction::Clear) &
            !activeClearInhibit,
        (next.fdState == FlightStack::FdStateValue::Cleared))) &
      (implies!(
        !(fd.commandConflict) &
          ((fd.fdAction != FlightStack::FdAction::Clear) |
            activeClearInhibit),
        (next.fdState == prior.fdState))))
}

pub fn CASE_FD_01(
  attitude: FlightStack::QualifiedAttitude,
  refState: FlightStack::ReferenceAndFdState,
  fd: FlightStack::PairedFdGuidance,
  health: FlightStack::PairedFcsIndications) -> bool
{
  implies!(
    refState.referenceValid &
      (attitude.classification == FlightStack::AttitudeClass::Safe),
    (fd.leftRollGuidance == fd.rightRollGuidance) &
      (fd.leftPitchGuidance == fd.rightPitchGuidance) &
      (fd.leftFdOn == fd.rightFdOn) &
      (fd.leftFdOn == (refState.fdState == FlightStack::FdStateValue::Displayed)) &
      (implies!(
        (refState.referenceRoll - attitude.rollTenthDeg < -450i32),
        (fd.leftRollGuidance == -450i32))) &
      (implies!(
        (-450i32 <= refState.referenceRoll - attitude.rollTenthDeg) &
          (refState.referenceRoll - attitude.rollTenthDeg <= 450i32),
        (fd.leftRollGuidance == refState.referenceRoll - attitude.rollTenthDeg))) &
      (implies!(
        (450i32 < refState.referenceRoll - attitude.rollTenthDeg),
        (fd.leftRollGuidance == 450i32))) &
      (implies!(
        (refState.referencePitch - attitude.pitchTenthDeg < -450i32),
        (fd.leftPitchGuidance == -450i32))) &
      (implies!(
        (-450i32 <= refState.referencePitch - attitude.pitchTenthDeg) &
          (refState.referencePitch - attitude.pitchTenthDeg <= 450i32),
        (fd.leftPitchGuidance == refState.referencePitch - attitude.pitchTenthDeg))) &
      (implies!(
        (450i32 < refState.referencePitch - attitude.pitchTenthDeg),
        (fd.leftPitchGuidance == 450i32))) &
      !(health.leftFcsFailed) &
      !(health.rightFcsFailed) &
      !(health.leftUnsafeAttitude) &
      !(health.rightUnsafeAttitude))
}

pub fn CASE_FD_02(
  attitude: FlightStack::QualifiedAttitude,
  refState: FlightStack::ReferenceAndFdState,
  fd: FlightStack::PairedFdGuidance,
  health: FlightStack::PairedFcsIndications) -> bool
{
  implies!(
    !(refState.referenceValid &
      (attitude.classification == FlightStack::AttitudeClass::Safe)),
    (fd.leftRollGuidance == 0i32) &
      (fd.rightRollGuidance == 0i32) &
      (fd.leftPitchGuidance == 0i32) &
      (fd.rightPitchGuidance == 0i32) &
      !(fd.leftFdOn) &
      !(fd.rightFdOn) &
      (health.leftFcsFailed == health.rightFcsFailed) &
      (health.leftUnsafeAttitude == health.rightUnsafeAttitude) &
      (health.leftFcsFailed == !(refState.referenceValid) |
        (attitude.classification == FlightStack::AttitudeClass::Invalid)) &
      (health.leftUnsafeAttitude == (attitude.classification == FlightStack::AttitudeClass::Unsafe)))
}

pub fn CASE_APG_01(
  attitude: FlightStack::QualifiedAttitude,
  refState: FlightStack::ReferenceAndFdState,
  guidance: FlightStack::ApGuidanceAndValidity) -> bool
{
  implies!(
    refState.referenceValid &
      (attitude.classification == FlightStack::AttitudeClass::Safe) &
      (refState.fdState == FlightStack::FdStateValue::Displayed),
    (guidance.rollGuidance == refState.referenceRoll) &
      (guidance.pitchGuidance == refState.referencePitch) &
      guidance.guidanceValid)
}

pub fn CASE_APG_02(
  attitude: FlightStack::QualifiedAttitude,
  refState: FlightStack::ReferenceAndFdState,
  guidance: FlightStack::ApGuidanceAndValidity) -> bool
{
  implies!(
    !(refState.referenceValid &
      (attitude.classification == FlightStack::AttitudeClass::Safe) &
      (refState.fdState == FlightStack::FdStateValue::Displayed)),
    (guidance.rollGuidance == 0i32) &
      (guidance.pitchGuidance == 0i32) &
      !(guidance.guidanceValid))
}

pub fn CASE_AP_01(
  initializing: bool,
  priorMode: FlightStack::ApModeValue,
  ap: FlightStack::QualifiedApDisposition,
  attitude: FlightStack::QualifiedAttitude,
  guidance: FlightStack::ApGuidanceAndValidity,
  nextMode: FlightStack::ApModeValue,
  status: FlightStack::PairedApStatus,
  request: FlightStack::ApGuidanceRequestValue,
  inhibit: bool,
  authority: bool) -> bool
{
  (implies!(
    initializing,
    (nextMode == FlightStack::ApModeValue::Off) &
      (status.leftStatus == 1i32) &
      (status.rightStatus == 1i32) &
      (request == FlightStack::ApGuidanceRequestValue::Invalid) &
      !inhibit &
      !authority)) &
    (implies!(
      !initializing &
        (priorMode == FlightStack::ApModeValue::Off),
      (implies!(
        (ap.apAction == FlightStack::ApAction::ForceDisengage) |
          (ap.cwsAction == FlightStack::CwsAction::ForceDisengage) |
          (attitude.classification == FlightStack::AttitudeClass::Invalid),
        (nextMode == FlightStack::ApModeValue::Failed))) &
        (implies!(
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
            (attitude.classification != FlightStack::AttitudeClass::Invalid) &
            apDisengageSelected(ap),
          (nextMode == FlightStack::ApModeValue::Off))) &
        (implies!(
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
            (attitude.classification != FlightStack::AttitudeClass::Invalid) &
            !(apDisengageSelected(ap)) &
            (attitude.classification == FlightStack::AttitudeClass::Unsafe),
          (nextMode == FlightStack::ApModeValue::Off))) &
        (implies!(
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
            !(apDisengageSelected(ap)) &
            (attitude.classification == FlightStack::AttitudeClass::Safe) &
            (ap.apAction == FlightStack::ApAction::Engage) &
            guidance.guidanceValid,
          (nextMode == FlightStack::ApModeValue::SyncPending))) &
        (implies!(
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
            !(apDisengageSelected(ap)) &
            (attitude.classification == FlightStack::AttitudeClass::Safe) &
            !((ap.apAction == FlightStack::ApAction::Engage) &
              guidance.guidanceValid),
          (nextMode == FlightStack::ApModeValue::Off))) &
        apObservables(nextMode, ap.cwsAction == FlightStack::CwsAction::Hold, status.leftStatus, status.rightStatus, request, inhibit, authority)))
}

pub fn CASE_AP_02(
  initializing: bool,
  priorMode: FlightStack::ApModeValue,
  ap: FlightStack::QualifiedApDisposition,
  attitude: FlightStack::QualifiedAttitude,
  guidance: FlightStack::ApGuidanceAndValidity,
  nextMode: FlightStack::ApModeValue,
  status: FlightStack::PairedApStatus,
  request: FlightStack::ApGuidanceRequestValue,
  inhibit: bool,
  authority: bool) -> bool
{
  implies!(
    !initializing &
      (priorMode == FlightStack::ApModeValue::SyncPending),
    (implies!(
      (ap.apAction == FlightStack::ApAction::ForceDisengage) |
        (ap.cwsAction == FlightStack::CwsAction::ForceDisengage) |
        (attitude.classification == FlightStack::AttitudeClass::Invalid) |
        (attitude.classification == FlightStack::AttitudeClass::Safe) &
          !(guidance.guidanceValid),
      (nextMode == FlightStack::ApModeValue::Failed))) &
      (implies!(
        (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification != FlightStack::AttitudeClass::Invalid) &
          !((attitude.classification == FlightStack::AttitudeClass::Safe) &
            !(guidance.guidanceValid)) &
          apDisengageSelected(ap),
        (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        !(apDisengageSelected(ap)) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Unsafe),
        (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        !(apDisengageSelected(ap)) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Safe) &
          guidance.guidanceValid,
        (nextMode == FlightStack::ApModeValue::On))) &
      apObservables(nextMode, ap.cwsAction == FlightStack::CwsAction::Hold, status.leftStatus, status.rightStatus, request, inhibit, authority))
}

pub fn CASE_AP_03(
  initializing: bool,
  priorMode: FlightStack::ApModeValue,
  ap: FlightStack::QualifiedApDisposition,
  attitude: FlightStack::QualifiedAttitude,
  guidance: FlightStack::ApGuidanceAndValidity,
  nextMode: FlightStack::ApModeValue,
  status: FlightStack::PairedApStatus,
  request: FlightStack::ApGuidanceRequestValue,
  inhibit: bool,
  authority: bool) -> bool
{
  implies!(
    !initializing &
      (priorMode == FlightStack::ApModeValue::On) &
      (ap.apAction != FlightStack::ApAction::ForceDisengage) &
      !(apDisengageSelected(ap)) &
      (ap.cwsAction == FlightStack::CwsAction::Hold) &
      (attitude.classification == FlightStack::AttitudeClass::Safe) &
      guidance.guidanceValid,
    (nextMode == FlightStack::ApModeValue::CWS) &
      apObservables(nextMode, true, status.leftStatus, status.rightStatus, request, inhibit, authority))
}

pub fn CASE_AP_04(
  initializing: bool,
  priorMode: FlightStack::ApModeValue,
  ap: FlightStack::QualifiedApDisposition,
  attitude: FlightStack::QualifiedAttitude,
  guidance: FlightStack::ApGuidanceAndValidity,
  nextMode: FlightStack::ApModeValue,
  status: FlightStack::PairedApStatus,
  request: FlightStack::ApGuidanceRequestValue,
  inhibit: bool,
  authority: bool) -> bool
{
  implies!(
    !initializing &
      ((priorMode == FlightStack::ApModeValue::CWS) |
        (priorMode == FlightStack::ApModeValue::CwsSuspended)),
    (implies!(
      (ap.apAction == FlightStack::ApAction::ForceDisengage) |
        (ap.cwsAction == FlightStack::CwsAction::ForceDisengage) |
        (attitude.classification == FlightStack::AttitudeClass::Invalid) |
        (attitude.classification == FlightStack::AttitudeClass::Safe) &
          !(guidance.guidanceValid),
      (nextMode == FlightStack::ApModeValue::Failed))) &
      (implies!(
        (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification != FlightStack::AttitudeClass::Invalid) &
          !((attitude.classification == FlightStack::AttitudeClass::Safe) &
            !(guidance.guidanceValid)) &
          apDisengageSelected(ap),
        (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          !(apDisengageSelected(ap)) &
          (attitude.classification == FlightStack::AttitudeClass::Unsafe) &
          (ap.cwsAction == FlightStack::CwsAction::Hold),
        (nextMode == FlightStack::ApModeValue::CwsSuspended))) &
      (implies!(
        (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          !(apDisengageSelected(ap)) &
          (attitude.classification == FlightStack::AttitudeClass::Unsafe) &
          (ap.cwsAction != FlightStack::CwsAction::Hold),
        (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        (priorMode == FlightStack::ApModeValue::CWS) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          !(apDisengageSelected(ap)) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Safe) &
          guidance.guidanceValid &
          (ap.cwsAction == FlightStack::CwsAction::Release),
        (nextMode == FlightStack::ApModeValue::On))) &
      (implies!(
        (priorMode == FlightStack::ApModeValue::CWS) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          !(apDisengageSelected(ap)) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Safe) &
          guidance.guidanceValid &
          (ap.cwsAction != FlightStack::CwsAction::Release),
        (nextMode == FlightStack::ApModeValue::CWS))) &
      (implies!(
        (priorMode == FlightStack::ApModeValue::CwsSuspended) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          !(apDisengageSelected(ap)) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Safe) &
          guidance.guidanceValid &
          (ap.cwsAction == FlightStack::CwsAction::Release),
        (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        (priorMode == FlightStack::ApModeValue::CwsSuspended) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          !(apDisengageSelected(ap)) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Safe) &
          guidance.guidanceValid &
          (ap.cwsAction != FlightStack::CwsAction::Release),
        (nextMode == FlightStack::ApModeValue::CwsSuspended))) &
      apObservables(nextMode, ap.cwsAction == FlightStack::CwsAction::Hold, status.leftStatus, status.rightStatus, request, inhibit, authority))
}

pub fn CASE_AP_05(
  initializing: bool,
  priorMode: FlightStack::ApModeValue,
  ap: FlightStack::QualifiedApDisposition,
  attitude: FlightStack::QualifiedAttitude,
  guidance: FlightStack::ApGuidanceAndValidity,
  nextMode: FlightStack::ApModeValue,
  status: FlightStack::PairedApStatus,
  request: FlightStack::ApGuidanceRequestValue,
  inhibit: bool,
  authority: bool) -> bool
{
  implies!(
    !initializing &
      (priorMode == FlightStack::ApModeValue::On) &
      !((ap.apAction != FlightStack::ApAction::ForceDisengage) &
        !(apDisengageSelected(ap)) &
        (ap.cwsAction == FlightStack::CwsAction::Hold) &
        (attitude.classification == FlightStack::AttitudeClass::Safe) &
        guidance.guidanceValid),
    (implies!(
      (ap.apAction == FlightStack::ApAction::ForceDisengage) |
        (ap.cwsAction == FlightStack::CwsAction::ForceDisengage) |
        (attitude.classification == FlightStack::AttitudeClass::Invalid) |
        (attitude.classification == FlightStack::AttitudeClass::Safe) &
          !(guidance.guidanceValid),
      (nextMode == FlightStack::ApModeValue::Failed))) &
      (implies!(
        (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification != FlightStack::AttitudeClass::Invalid) &
          !((attitude.classification == FlightStack::AttitudeClass::Safe) &
            !(guidance.guidanceValid)) &
          apDisengageSelected(ap),
        (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        !(apDisengageSelected(ap)) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Unsafe),
        (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        !(apDisengageSelected(ap)) &
          (ap.apAction != FlightStack::ApAction::ForceDisengage) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Safe) &
          guidance.guidanceValid,
        (nextMode == FlightStack::ApModeValue::On))) &
      apObservables(nextMode, false, status.leftStatus, status.rightStatus, request, inhibit, authority))
}

pub fn CASE_AP_06(
  initializing: bool,
  priorMode: FlightStack::ApModeValue,
  ap: FlightStack::QualifiedApDisposition,
  attitude: FlightStack::QualifiedAttitude,
  guidance: FlightStack::ApGuidanceAndValidity,
  nextMode: FlightStack::ApModeValue,
  status: FlightStack::PairedApStatus,
  request: FlightStack::ApGuidanceRequestValue,
  inhibit: bool,
  authority: bool) -> bool
{
  implies!(
    !initializing &
      (priorMode == FlightStack::ApModeValue::Failed),
    (implies!(
      apDisengageSelected(ap) &
        (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
        (attitude.classification == FlightStack::AttitudeClass::Safe) &
        guidance.guidanceValid,
      (nextMode == FlightStack::ApModeValue::Off))) &
      (implies!(
        !(apDisengageSelected(ap) &
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage) &
          (attitude.classification == FlightStack::AttitudeClass::Safe) &
          guidance.guidanceValid),
        (nextMode == FlightStack::ApModeValue::Failed))) &
      apObservables(nextMode, false, status.leftStatus, status.rightStatus, request, inhibit, authority))
}

pub fn CASE_PROP_01(
  guidance: FlightStack::ApGuidanceAndValidity,
  attitude: FlightStack::QualifiedAttitude,
  proposal: FlightStack::ProposedActuatorRates) -> bool
{
  (implies!(
    guidance.guidanceValid &
      (attitude.classification == FlightStack::AttitudeClass::Safe),
    proposal.proposalValid &
      (implies!(
        (guidance.rollGuidance - attitude.rollTenthDeg < -1i32),
        (proposal.rollRate == -50i32))) &
      (implies!(
        (-1i32 <= guidance.rollGuidance - attitude.rollTenthDeg) &
          (guidance.rollGuidance - attitude.rollTenthDeg <= 1i32),
        (proposal.rollRate == 0i32))) &
      (implies!(
        (1i32 < guidance.rollGuidance - attitude.rollTenthDeg),
        (proposal.rollRate == 50i32))) &
      (implies!(
        (guidance.pitchGuidance - attitude.pitchTenthDeg < -1i32),
        (proposal.pitchRate == -50i32))) &
      (implies!(
        (-1i32 <= guidance.pitchGuidance - attitude.pitchTenthDeg) &
          (guidance.pitchGuidance - attitude.pitchTenthDeg <= 1i32),
        (proposal.pitchRate == 0i32))) &
      (implies!(
        (1i32 < guidance.pitchGuidance - attitude.pitchTenthDeg),
        (proposal.pitchRate == 50i32))))) &
    (implies!(
      !(guidance.guidanceValid &
        (attitude.classification == FlightStack::AttitudeClass::Safe)),
      !(proposal.proposalValid) &
        (proposal.rollRate == 0i32) &
        (proposal.pitchRate == 0i32)))
}

pub fn CASE_GATE_01(
  authority: bool,
  proposal: FlightStack::ProposedActuatorRates,
  command: FlightStack::ActuatorCommand) -> bool
{
  implies!(
    authority & proposal.proposalValid,
    (command.rollRateTenthDegPerSec == proposal.rollRate) &
      (command.pitchRateTenthDegPerSec == proposal.pitchRate) &
      command.apOn)
}

pub fn CASE_GATE_02(
  authority: bool,
  proposal: FlightStack::ProposedActuatorRates,
  command: FlightStack::ActuatorCommand) -> bool
{
  implies!(
    !(authority & proposal.proposalValid),
    (command.rollRateTenthDegPerSec == 0i32) &
      (command.pitchRateTenthDegPerSec == 0i32) &
      !(command.apOn))
}
// END MARKER GUMBO RUST MARKER

verus! {

  // BEGIN MARKER GUMBO VERUS MARKER
  pub open spec fn allCrewStatusesValid_spec(
    displayStatus: bool,
    syncStatus: bool,
    engageStatus: bool,
    cwsStatus: bool) -> bool
  {
    ((displayStatus && syncStatus) &&
      engageStatus) &&
      cwsStatus
  }

  pub open spec fn safeRawAttitude_spec(
    roll: i32,
    pitch: i32,
    rollStatus: bool,
    pitchStatus: bool) -> bool
  {
    ((((rollStatus && pitchStatus) &&
      (-450i32 <= roll)) &&
      (roll <= 450i32)) &&
      (-450i32 <= pitch)) &&
      (pitch <= 450i32)
  }

  pub open spec fn validRawAttitude_spec(
    rollStatus: bool,
    pitchStatus: bool) -> bool
  {
    rollStatus && pitchStatus
  }

  pub open spec fn apObservables_spec(
    nextMode: FlightStack::ApModeValue,
    cwsHeld: bool,
    leftStatus: i32,
    rightStatus: i32,
    request: FlightStack::ApGuidanceRequestValue,
    inhibit: bool,
    authority: bool) -> bool
  {
    (((((((leftStatus == rightStatus) &&
      (((nextMode == FlightStack::ApModeValue::On) ||
        (nextMode == FlightStack::ApModeValue::CWS)) ==>
        (leftStatus == 2i32))) &&
      ((((nextMode == FlightStack::ApModeValue::Off) ||
        (nextMode == FlightStack::ApModeValue::SyncPending)) ||
        (nextMode == FlightStack::ApModeValue::CwsSuspended)) ==>
        (leftStatus == 1i32))) &&
      ((nextMode == FlightStack::ApModeValue::Failed) ==>
        (leftStatus == 0i32))) &&
      (authority == (nextMode == FlightStack::ApModeValue::On))) &&
      (inhibit == (((nextMode == FlightStack::ApModeValue::SyncPending) ||
        (nextMode == FlightStack::ApModeValue::On)) ||
        (nextMode == FlightStack::ApModeValue::CWS)))) &&
      ((request == FlightStack::ApGuidanceRequestValue::Requested) == (((nextMode == FlightStack::ApModeValue::SyncPending) ||
        (nextMode == FlightStack::ApModeValue::CWS)) ||
        ((nextMode == FlightStack::ApModeValue::CwsSuspended) &&
          cwsHeld)))) &&
      ((request != FlightStack::ApGuidanceRequestValue::Requested) ==>
        (request == FlightStack::ApGuidanceRequestValue::NotRequested))
  }

  pub open spec fn apDisengageSelected_spec(ap: FlightStack::QualifiedApDisposition) -> bool
  {
    ap.commandConflict ||
      (ap.apAction == FlightStack::ApAction::Disengage)
  }

  pub open spec fn CASE_CMD_01_spec(
    c: FlightStack::CrewRequests,
    fd: FlightStack::QualifiedFdAndSyncDisposition,
    ap: FlightStack::QualifiedApDisposition) -> bool
  {
    allCrewStatusesValid_spec(c.displayFdStatus, c.syncFdStatus, c.engageApStatus, c.cwsStatus) ==>
      ((((((fd.fdAction ==
        (if (c.displayFdWanted) {
          FlightStack::FdAction::Display
        } else {
          FlightStack::FdAction::Clear
        })) &&
        (fd.syncRequested == c.syncFd)) &&
        (ap.apAction ==
          (if (c.engageApWanted) {
            FlightStack::ApAction::Engage
          } else {
            FlightStack::ApAction::Disengage
          }))) &&
        (ap.cwsAction ==
          (if (c.cwsHeld) {
            FlightStack::CwsAction::Hold
          } else {
            FlightStack::CwsAction::Release
          }))) &&
        (fd.commandConflict == (!(c.engageApWanted) &&
          ((c.cwsHeld || c.syncFd) ||
            c.displayFdWanted)))) &&
        (ap.commandConflict == fd.commandConflict))
  }

  pub open spec fn CASE_CMD_02_spec(
    c: FlightStack::CrewRequests,
    fd: FlightStack::QualifiedFdAndSyncDisposition,
    ap: FlightStack::QualifiedApDisposition) -> bool
  {
    !(allCrewStatusesValid_spec(c.displayFdStatus, c.syncFdStatus, c.engageApStatus, c.cwsStatus)) ==>
      ((((((fd.fdAction ==
        (if (!(c.displayFdStatus)) {
          FlightStack::FdAction::None
        } else {
          if (c.displayFdWanted) {
            FlightStack::FdAction::Display
          } else {
            FlightStack::FdAction::Clear
          }
        })) &&
        (fd.syncRequested == (c.syncFdStatus && c.syncFd))) &&
        (fd.commandConflict == ((c.engageApStatus && !(c.engageApWanted)) &&
          (((c.cwsStatus && c.cwsHeld) ||
            (c.syncFdStatus && c.syncFd)) ||
            (c.displayFdStatus && c.displayFdWanted))))) &&
        (ap.apAction ==
          (if (!(c.engageApStatus) || !(c.cwsStatus)) {
            FlightStack::ApAction::ForceDisengage
          } else {
            if (c.engageApWanted) {
              FlightStack::ApAction::Engage
            } else {
              FlightStack::ApAction::Disengage
            }
          }))) &&
        (ap.cwsAction ==
          (if (!(c.engageApStatus) || !(c.cwsStatus)) {
            FlightStack::CwsAction::ForceDisengage
          } else {
            if (c.cwsHeld) {
              FlightStack::CwsAction::Hold
            } else {
              FlightStack::CwsAction::Release
            }
          }))) &&
        (ap.commandConflict == fd.commandConflict))
  }

  pub open spec fn CASE_ATT_01_spec(
    raw: FlightStack::AircraftAttitude,
    qualified: FlightStack::QualifiedAttitude) -> bool
  {
    safeRawAttitude_spec(raw.rollTenthDeg, raw.pitchTenthDeg, raw.rollStatus, raw.pitchStatus) ==>
      (((qualified.classification == FlightStack::AttitudeClass::Safe) &&
        (qualified.rollTenthDeg == raw.rollTenthDeg)) &&
        (qualified.pitchTenthDeg == raw.pitchTenthDeg))
  }

  pub open spec fn CASE_ATT_02_spec(
    raw: FlightStack::AircraftAttitude,
    qualified: FlightStack::QualifiedAttitude) -> bool
  {
    (!(validRawAttitude_spec(raw.rollStatus, raw.pitchStatus)) ==>
      (qualified.classification == FlightStack::AttitudeClass::Invalid)) &&
      ((validRawAttitude_spec(raw.rollStatus, raw.pitchStatus) && !(safeRawAttitude_spec(raw.rollTenthDeg, raw.pitchTenthDeg, raw.rollStatus, raw.pitchStatus))) ==>
        (((qualified.classification == FlightStack::AttitudeClass::Unsafe) &&
          (qualified.rollTenthDeg == raw.rollTenthDeg)) &&
          (qualified.pitchTenthDeg == raw.pitchTenthDeg)))
  }

  pub open spec fn CASE_REF_01_spec(
    initializing: bool,
    attitude: FlightStack::QualifiedAttitude,
    prior: FlightStack::ReferenceAndFdState,
    next: FlightStack::ReferenceAndFdState) -> bool
  {
    (initializing ==>
      ((((next.referenceRoll == 0i32) &&
        (next.referencePitch == 0i32)) &&
        !(next.referenceValid)) &&
        (next.fdState == FlightStack::FdStateValue::Cleared))) &&
      ((!initializing &&
        (attitude.classification == FlightStack::AttitudeClass::Invalid)) ==>
        ((((next.referenceRoll == prior.referenceRoll) &&
          (next.referencePitch == prior.referencePitch)) &&
          !(next.referenceValid)) &&
          (next.fdState == FlightStack::FdStateValue::Cleared)))
  }

  pub open spec fn CASE_REF_02_spec(
    initializing: bool,
    fd: FlightStack::QualifiedFdAndSyncDisposition,
    attitude: FlightStack::QualifiedAttitude,
    request: FlightStack::ApGuidanceRequestValue,
    activeClearInhibit: bool,
    prior: FlightStack::ReferenceAndFdState,
    next: FlightStack::ReferenceAndFdState) -> bool
  {
    (((!initializing && !(fd.commandConflict)) &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
      ((fd.syncRequested ||
        (fd.fdAction == FlightStack::FdAction::Display)) ||
        (request == FlightStack::ApGuidanceRequestValue::Requested))) ==>
      ((((((next.referenceRoll == attitude.rollTenthDeg) &&
        (next.referencePitch == attitude.pitchTenthDeg)) &&
        next.referenceValid) &&
        ((fd.fdAction == FlightStack::FdAction::Display) ==>
          (next.fdState == FlightStack::FdStateValue::Displayed))) &&
        ((((fd.fdAction != FlightStack::FdAction::Display) &&
          (fd.fdAction == FlightStack::FdAction::Clear)) &&
          !activeClearInhibit) ==>
          (next.fdState == FlightStack::FdStateValue::Cleared))) &&
        (((fd.fdAction != FlightStack::FdAction::Display) &&
          ((fd.fdAction != FlightStack::FdAction::Clear) ||
            activeClearInhibit)) ==>
          (next.fdState == prior.fdState)))
  }

  pub open spec fn CASE_REF_03_spec(
    initializing: bool,
    fd: FlightStack::QualifiedFdAndSyncDisposition,
    attitude: FlightStack::QualifiedAttitude,
    request: FlightStack::ApGuidanceRequestValue,
    activeClearInhibit: bool,
    prior: FlightStack::ReferenceAndFdState,
    next: FlightStack::ReferenceAndFdState) -> bool
  {
    ((!initializing && !((!(fd.commandConflict) &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
      ((fd.syncRequested ||
        (fd.fdAction == FlightStack::FdAction::Display)) ||
        (request == FlightStack::ApGuidanceRequestValue::Requested)))) &&
      (attitude.classification != FlightStack::AttitudeClass::Invalid)) ==>
      (((((next.referenceRoll == prior.referenceRoll) &&
        (next.referencePitch == prior.referencePitch)) &&
        (next.referenceValid == prior.referenceValid)) &&
        ((fd.commandConflict ||
          ((fd.fdAction == FlightStack::FdAction::Clear) &&
            !activeClearInhibit)) ==>
          (next.fdState == FlightStack::FdStateValue::Cleared))) &&
        ((!(fd.commandConflict) &&
          ((fd.fdAction != FlightStack::FdAction::Clear) ||
            activeClearInhibit)) ==>
          (next.fdState == prior.fdState)))
  }

  pub open spec fn CASE_FD_01_spec(
    attitude: FlightStack::QualifiedAttitude,
    refState: FlightStack::ReferenceAndFdState,
    fd: FlightStack::PairedFdGuidance,
    health: FlightStack::PairedFcsIndications) -> bool
  {
    (refState.referenceValid &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) ==>
      ((((((((((((((fd.leftRollGuidance == fd.rightRollGuidance) &&
        (fd.leftPitchGuidance == fd.rightPitchGuidance)) &&
        (fd.leftFdOn == fd.rightFdOn)) &&
        (fd.leftFdOn == (refState.fdState == FlightStack::FdStateValue::Displayed))) &&
        ((refState.referenceRoll - attitude.rollTenthDeg < -450i32) ==>
          (fd.leftRollGuidance == -450i32))) &&
        (((-450i32 <= refState.referenceRoll - attitude.rollTenthDeg) &&
          (refState.referenceRoll - attitude.rollTenthDeg <= 450i32)) ==>
          (fd.leftRollGuidance == refState.referenceRoll - attitude.rollTenthDeg))) &&
        ((450i32 < refState.referenceRoll - attitude.rollTenthDeg) ==>
          (fd.leftRollGuidance == 450i32))) &&
        ((refState.referencePitch - attitude.pitchTenthDeg < -450i32) ==>
          (fd.leftPitchGuidance == -450i32))) &&
        (((-450i32 <= refState.referencePitch - attitude.pitchTenthDeg) &&
          (refState.referencePitch - attitude.pitchTenthDeg <= 450i32)) ==>
          (fd.leftPitchGuidance == refState.referencePitch - attitude.pitchTenthDeg))) &&
        ((450i32 < refState.referencePitch - attitude.pitchTenthDeg) ==>
          (fd.leftPitchGuidance == 450i32))) &&
        !(health.leftFcsFailed)) &&
        !(health.rightFcsFailed)) &&
        !(health.leftUnsafeAttitude)) &&
        !(health.rightUnsafeAttitude))
  }

  pub open spec fn CASE_FD_02_spec(
    attitude: FlightStack::QualifiedAttitude,
    refState: FlightStack::ReferenceAndFdState,
    fd: FlightStack::PairedFdGuidance,
    health: FlightStack::PairedFcsIndications) -> bool
  {
    !(refState.referenceValid &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) ==>
      ((((((((((fd.leftRollGuidance == 0i32) &&
        (fd.rightRollGuidance == 0i32)) &&
        (fd.leftPitchGuidance == 0i32)) &&
        (fd.rightPitchGuidance == 0i32)) &&
        !(fd.leftFdOn)) &&
        !(fd.rightFdOn)) &&
        (health.leftFcsFailed == health.rightFcsFailed)) &&
        (health.leftUnsafeAttitude == health.rightUnsafeAttitude)) &&
        (health.leftFcsFailed == (!(refState.referenceValid) ||
          (attitude.classification == FlightStack::AttitudeClass::Invalid)))) &&
        (health.leftUnsafeAttitude == (attitude.classification == FlightStack::AttitudeClass::Unsafe)))
  }

  pub open spec fn CASE_APG_01_spec(
    attitude: FlightStack::QualifiedAttitude,
    refState: FlightStack::ReferenceAndFdState,
    guidance: FlightStack::ApGuidanceAndValidity) -> bool
  {
    ((refState.referenceValid &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
      (refState.fdState == FlightStack::FdStateValue::Displayed)) ==>
      (((guidance.rollGuidance == refState.referenceRoll) &&
        (guidance.pitchGuidance == refState.referencePitch)) &&
        guidance.guidanceValid)
  }

  pub open spec fn CASE_APG_02_spec(
    attitude: FlightStack::QualifiedAttitude,
    refState: FlightStack::ReferenceAndFdState,
    guidance: FlightStack::ApGuidanceAndValidity) -> bool
  {
    !((refState.referenceValid &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
      (refState.fdState == FlightStack::FdStateValue::Displayed)) ==>
      (((guidance.rollGuidance == 0i32) &&
        (guidance.pitchGuidance == 0i32)) &&
        !(guidance.guidanceValid))
  }

  pub open spec fn CASE_AP_01_spec(
    initializing: bool,
    priorMode: FlightStack::ApModeValue,
    ap: FlightStack::QualifiedApDisposition,
    attitude: FlightStack::QualifiedAttitude,
    guidance: FlightStack::ApGuidanceAndValidity,
    nextMode: FlightStack::ApModeValue,
    status: FlightStack::PairedApStatus,
    request: FlightStack::ApGuidanceRequestValue,
    inhibit: bool,
    authority: bool) -> bool
  {
    (initializing ==>
      ((((((nextMode == FlightStack::ApModeValue::Off) &&
        (status.leftStatus == 1i32)) &&
        (status.rightStatus == 1i32)) &&
        (request == FlightStack::ApGuidanceRequestValue::Invalid)) &&
        !inhibit) &&
        !authority)) &&
      ((!initializing &&
        (priorMode == FlightStack::ApModeValue::Off)) ==>
        (((((((((ap.apAction == FlightStack::ApAction::ForceDisengage) ||
          (ap.cwsAction == FlightStack::CwsAction::ForceDisengage)) ||
          (attitude.classification == FlightStack::AttitudeClass::Invalid)) ==>
          (nextMode == FlightStack::ApModeValue::Failed)) &&
          (((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
            (attitude.classification != FlightStack::AttitudeClass::Invalid)) &&
            apDisengageSelected_spec(ap)) ==>
            (nextMode == FlightStack::ApModeValue::Off))) &&
          ((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
            (attitude.classification != FlightStack::AttitudeClass::Invalid)) &&
            !(apDisengageSelected_spec(ap))) &&
            (attitude.classification == FlightStack::AttitudeClass::Unsafe)) ==>
            (nextMode == FlightStack::ApModeValue::Off))) &&
          (((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
            !(apDisengageSelected_spec(ap))) &&
            (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
            (ap.apAction == FlightStack::ApAction::Engage)) &&
            guidance.guidanceValid) ==>
            (nextMode == FlightStack::ApModeValue::SyncPending))) &&
          ((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
            (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
            !(apDisengageSelected_spec(ap))) &&
            (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
            !((ap.apAction == FlightStack::ApAction::Engage) &&
              guidance.guidanceValid)) ==>
            (nextMode == FlightStack::ApModeValue::Off))) &&
          apObservables_spec(nextMode, ap.cwsAction == FlightStack::CwsAction::Hold, status.leftStatus, status.rightStatus, request, inhibit, authority)))
  }

  pub open spec fn CASE_AP_02_spec(
    initializing: bool,
    priorMode: FlightStack::ApModeValue,
    ap: FlightStack::QualifiedApDisposition,
    attitude: FlightStack::QualifiedAttitude,
    guidance: FlightStack::ApGuidanceAndValidity,
    nextMode: FlightStack::ApModeValue,
    status: FlightStack::PairedApStatus,
    request: FlightStack::ApGuidanceRequestValue,
    inhibit: bool,
    authority: bool) -> bool
  {
    (!initializing &&
      (priorMode == FlightStack::ApModeValue::SyncPending)) ==>
      (((((((((ap.apAction == FlightStack::ApAction::ForceDisengage) ||
        (ap.cwsAction == FlightStack::CwsAction::ForceDisengage)) ||
        (attitude.classification == FlightStack::AttitudeClass::Invalid)) ||
        ((attitude.classification == FlightStack::AttitudeClass::Safe) &&
          !(guidance.guidanceValid))) ==>
        (nextMode == FlightStack::ApModeValue::Failed)) &&
        ((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification != FlightStack::AttitudeClass::Invalid)) &&
          !((attitude.classification == FlightStack::AttitudeClass::Safe) &&
            !(guidance.guidanceValid))) &&
          apDisengageSelected_spec(ap)) ==>
          (nextMode == FlightStack::ApModeValue::Off))) &&
        ((((!(apDisengageSelected_spec(ap)) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Unsafe)) ==>
          (nextMode == FlightStack::ApModeValue::Off))) &&
        (((((!(apDisengageSelected_spec(ap)) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
          guidance.guidanceValid) ==>
          (nextMode == FlightStack::ApModeValue::On))) &&
        apObservables_spec(nextMode, ap.cwsAction == FlightStack::CwsAction::Hold, status.leftStatus, status.rightStatus, request, inhibit, authority))
  }

  pub open spec fn CASE_AP_03_spec(
    initializing: bool,
    priorMode: FlightStack::ApModeValue,
    ap: FlightStack::QualifiedApDisposition,
    attitude: FlightStack::QualifiedAttitude,
    guidance: FlightStack::ApGuidanceAndValidity,
    nextMode: FlightStack::ApModeValue,
    status: FlightStack::PairedApStatus,
    request: FlightStack::ApGuidanceRequestValue,
    inhibit: bool,
    authority: bool) -> bool
  {
    ((((((!initializing &&
      (priorMode == FlightStack::ApModeValue::On)) &&
      (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
      !(apDisengageSelected_spec(ap))) &&
      (ap.cwsAction == FlightStack::CwsAction::Hold)) &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
      guidance.guidanceValid) ==>
      ((nextMode == FlightStack::ApModeValue::CWS) &&
        apObservables_spec(nextMode, true, status.leftStatus, status.rightStatus, request, inhibit, authority))
  }

  pub open spec fn CASE_AP_04_spec(
    initializing: bool,
    priorMode: FlightStack::ApModeValue,
    ap: FlightStack::QualifiedApDisposition,
    attitude: FlightStack::QualifiedAttitude,
    guidance: FlightStack::ApGuidanceAndValidity,
    nextMode: FlightStack::ApModeValue,
    status: FlightStack::PairedApStatus,
    request: FlightStack::ApGuidanceRequestValue,
    inhibit: bool,
    authority: bool) -> bool
  {
    (!initializing &&
      ((priorMode == FlightStack::ApModeValue::CWS) ||
        (priorMode == FlightStack::ApModeValue::CwsSuspended))) ==>
      (((((((((((((ap.apAction == FlightStack::ApAction::ForceDisengage) ||
        (ap.cwsAction == FlightStack::CwsAction::ForceDisengage)) ||
        (attitude.classification == FlightStack::AttitudeClass::Invalid)) ||
        ((attitude.classification == FlightStack::AttitudeClass::Safe) &&
          !(guidance.guidanceValid))) ==>
        (nextMode == FlightStack::ApModeValue::Failed)) &&
        ((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification != FlightStack::AttitudeClass::Invalid)) &&
          !((attitude.classification == FlightStack::AttitudeClass::Safe) &&
            !(guidance.guidanceValid))) &&
          apDisengageSelected_spec(ap)) ==>
          (nextMode == FlightStack::ApModeValue::Off))) &&
        ((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          !(apDisengageSelected_spec(ap))) &&
          (attitude.classification == FlightStack::AttitudeClass::Unsafe)) &&
          (ap.cwsAction == FlightStack::CwsAction::Hold)) ==>
          (nextMode == FlightStack::ApModeValue::CwsSuspended))) &&
        ((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          !(apDisengageSelected_spec(ap))) &&
          (attitude.classification == FlightStack::AttitudeClass::Unsafe)) &&
          (ap.cwsAction != FlightStack::CwsAction::Hold)) ==>
          (nextMode == FlightStack::ApModeValue::Off))) &&
        ((((((((priorMode == FlightStack::ApModeValue::CWS) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          !(apDisengageSelected_spec(ap))) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
          guidance.guidanceValid) &&
          (ap.cwsAction == FlightStack::CwsAction::Release)) ==>
          (nextMode == FlightStack::ApModeValue::On))) &&
        ((((((((priorMode == FlightStack::ApModeValue::CWS) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          !(apDisengageSelected_spec(ap))) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
          guidance.guidanceValid) &&
          (ap.cwsAction != FlightStack::CwsAction::Release)) ==>
          (nextMode == FlightStack::ApModeValue::CWS))) &&
        ((((((((priorMode == FlightStack::ApModeValue::CwsSuspended) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          !(apDisengageSelected_spec(ap))) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
          guidance.guidanceValid) &&
          (ap.cwsAction == FlightStack::CwsAction::Release)) ==>
          (nextMode == FlightStack::ApModeValue::Off))) &&
        ((((((((priorMode == FlightStack::ApModeValue::CwsSuspended) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          !(apDisengageSelected_spec(ap))) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
          guidance.guidanceValid) &&
          (ap.cwsAction != FlightStack::CwsAction::Release)) ==>
          (nextMode == FlightStack::ApModeValue::CwsSuspended))) &&
        apObservables_spec(nextMode, ap.cwsAction == FlightStack::CwsAction::Hold, status.leftStatus, status.rightStatus, request, inhibit, authority))
  }

  pub open spec fn CASE_AP_05_spec(
    initializing: bool,
    priorMode: FlightStack::ApModeValue,
    ap: FlightStack::QualifiedApDisposition,
    attitude: FlightStack::QualifiedAttitude,
    guidance: FlightStack::ApGuidanceAndValidity,
    nextMode: FlightStack::ApModeValue,
    status: FlightStack::PairedApStatus,
    request: FlightStack::ApGuidanceRequestValue,
    inhibit: bool,
    authority: bool) -> bool
  {
    ((!initializing &&
      (priorMode == FlightStack::ApModeValue::On)) &&
      !(((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
        !(apDisengageSelected_spec(ap))) &&
        (ap.cwsAction == FlightStack::CwsAction::Hold)) &&
        (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
        guidance.guidanceValid)) ==>
      (((((((((ap.apAction == FlightStack::ApAction::ForceDisengage) ||
        (ap.cwsAction == FlightStack::CwsAction::ForceDisengage)) ||
        (attitude.classification == FlightStack::AttitudeClass::Invalid)) ||
        ((attitude.classification == FlightStack::AttitudeClass::Safe) &&
          !(guidance.guidanceValid))) ==>
        (nextMode == FlightStack::ApModeValue::Failed)) &&
        ((((((ap.apAction != FlightStack::ApAction::ForceDisengage) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification != FlightStack::AttitudeClass::Invalid)) &&
          !((attitude.classification == FlightStack::AttitudeClass::Safe) &&
            !(guidance.guidanceValid))) &&
          apDisengageSelected_spec(ap)) ==>
          (nextMode == FlightStack::ApModeValue::Off))) &&
        ((((!(apDisengageSelected_spec(ap)) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Unsafe)) ==>
          (nextMode == FlightStack::ApModeValue::Off))) &&
        (((((!(apDisengageSelected_spec(ap)) &&
          (ap.apAction != FlightStack::ApAction::ForceDisengage)) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
          guidance.guidanceValid) ==>
          (nextMode == FlightStack::ApModeValue::On))) &&
        apObservables_spec(nextMode, false, status.leftStatus, status.rightStatus, request, inhibit, authority))
  }

  pub open spec fn CASE_AP_06_spec(
    initializing: bool,
    priorMode: FlightStack::ApModeValue,
    ap: FlightStack::QualifiedApDisposition,
    attitude: FlightStack::QualifiedAttitude,
    guidance: FlightStack::ApGuidanceAndValidity,
    nextMode: FlightStack::ApModeValue,
    status: FlightStack::PairedApStatus,
    request: FlightStack::ApGuidanceRequestValue,
    inhibit: bool,
    authority: bool) -> bool
  {
    (!initializing &&
      (priorMode == FlightStack::ApModeValue::Failed)) ==>
      ((((((apDisengageSelected_spec(ap) &&
        (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
        (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
        guidance.guidanceValid) ==>
        (nextMode == FlightStack::ApModeValue::Off)) &&
        (!(((apDisengageSelected_spec(ap) &&
          (ap.cwsAction != FlightStack::CwsAction::ForceDisengage)) &&
          (attitude.classification == FlightStack::AttitudeClass::Safe)) &&
          guidance.guidanceValid) ==>
          (nextMode == FlightStack::ApModeValue::Failed))) &&
        apObservables_spec(nextMode, false, status.leftStatus, status.rightStatus, request, inhibit, authority))
  }

  pub open spec fn CASE_PROP_01_spec(
    guidance: FlightStack::ApGuidanceAndValidity,
    attitude: FlightStack::QualifiedAttitude,
    proposal: FlightStack::ProposedActuatorRates) -> bool
  {
    ((guidance.guidanceValid &&
      (attitude.classification == FlightStack::AttitudeClass::Safe)) ==>
      ((((((proposal.proposalValid &&
        ((guidance.rollGuidance - attitude.rollTenthDeg < -1i32) ==>
          (proposal.rollRate == -50i32))) &&
        (((-1i32 <= guidance.rollGuidance - attitude.rollTenthDeg) &&
          (guidance.rollGuidance - attitude.rollTenthDeg <= 1i32)) ==>
          (proposal.rollRate == 0i32))) &&
        ((1i32 < guidance.rollGuidance - attitude.rollTenthDeg) ==>
          (proposal.rollRate == 50i32))) &&
        ((guidance.pitchGuidance - attitude.pitchTenthDeg < -1i32) ==>
          (proposal.pitchRate == -50i32))) &&
        (((-1i32 <= guidance.pitchGuidance - attitude.pitchTenthDeg) &&
          (guidance.pitchGuidance - attitude.pitchTenthDeg <= 1i32)) ==>
          (proposal.pitchRate == 0i32))) &&
        ((1i32 < guidance.pitchGuidance - attitude.pitchTenthDeg) ==>
          (proposal.pitchRate == 50i32)))) &&
      (!(guidance.guidanceValid &&
        (attitude.classification == FlightStack::AttitudeClass::Safe)) ==>
        ((!(proposal.proposalValid) &&
          (proposal.rollRate == 0i32)) &&
          (proposal.pitchRate == 0i32)))
  }

  pub open spec fn CASE_GATE_01_spec(
    authority: bool,
    proposal: FlightStack::ProposedActuatorRates,
    command: FlightStack::ActuatorCommand) -> bool
  {
    (authority && proposal.proposalValid) ==>
      (((command.rollRateTenthDegPerSec == proposal.rollRate) &&
        (command.pitchRateTenthDegPerSec == proposal.pitchRate)) &&
        command.apOn)
  }

  pub open spec fn CASE_GATE_02_spec(
    authority: bool,
    proposal: FlightStack::ProposedActuatorRates,
    command: FlightStack::ActuatorCommand) -> bool
  {
    !(authority && proposal.proposalValid) ==>
      (((command.rollRateTenthDegPerSec == 0i32) &&
        (command.pitchRateTenthDegPerSec == 0i32)) &&
        !(command.apOn))
  }
  // END MARKER GUMBO VERUS MARKER

}
