package FAA_Flight_Guidance_System {
  private import HAMR::*;

  // @trace SRC-C-TABLE-C-1
  part def Display_FD_Command :> Data {
    attribute displayFd : Base_Types::Boolean;
    // False encodes source status Invalid; true encodes Valid.
    attribute displayFdStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-1
  part def Sync_FD_Command :> Data {
    attribute syncFd : Base_Types::Boolean;
    // False encodes source status Invalid; true encodes Valid.
    attribute syncFdStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-3
  part def AP_Guidance_Request_Data :> Data {
    attribute apGuidanceRequest : Base_Types::Boolean;
    // False encodes source status Invalid; true encodes Valid.
    attribute apGuidanceRequestStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-2 EA-AHS-1 EA-AHS-2 EA-AHS-3 EA-AHS-4
  part def Aircraft_Attitude_Data :> Data {
    // Source unit: degrees; executable encoding: tenths of a degree.
    attribute rollTenthDegree : Base_Types::Integer_32;
    // False encodes source status Invalid; true encodes Valid.
    attribute rollStatus : Base_Types::Boolean;
    attribute pitchTenthDegree : Base_Types::Integer_32;
    // False encodes source status Invalid; true encodes Valid.
    attribute pitchStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-4 REQ-FGS-3
  part def AP_Guidance_Data :> Data {
    // Source unit: degrees; executable encoding: tenths of a degree.
    attribute rollGuidanceTenthDegree : Base_Types::Integer_32;
    attribute pitchGuidanceTenthDegree : Base_Types::Integer_32;
    attribute guidanceValid : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-5 REQ-FGS-1
  part def FD_Guidance_Data :> Data {
    // Source unit: degrees; executable encoding: tenths of a degree.
    attribute rollGuidanceTenthDegree : Base_Types::Integer_32;
    attribute pitchGuidanceTenthDegree : Base_Types::Integer_32;
    attribute fdOn : Base_Types::Boolean;
  }

  // Appendix C names one FGS Function and supplies no lower-level part names.
  // @trace SRC-C-4 SRC-C-FUNCTION REQ-FGS-1 REQ-FGS-2 REQ-FGS-3 REQ-FGS-4
  part def FGS_Function :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    // @formalization logical execution period; Appendix C specifies no period.
    attribute :>> Period = 100 [ms];

    // @trace SRC-C-TABLE-C-1
    port Display_FD : DataPort { in :>> type : Display_FD_Command; }
    // @trace SRC-C-TABLE-C-1 REQ-FGS-2
    port Sync_FD : DataPort { in :>> type : Sync_FD_Command; }
    // @trace SRC-C-TABLE-C-2
    port Aircraft_Attitude : DataPort { in :>> type : Aircraft_Attitude_Data; }
    // @trace SRC-C-TABLE-C-3 REQ-FGS-2
    port AP_Guidance_Request : DataPort { in :>> type : AP_Guidance_Request_Data; }
    // @trace SRC-C-TABLE-C-4 REQ-FGS-3
    port AP_Guidance : DataPort { out :>> type : AP_Guidance_Data; }
    // @trace SRC-C-TABLE-C-5 REQ-FGS-1
    port FD_Guidance : DataPort { out :>> type : FD_Guidance_Data; }
    // Appendix C's table/figure say FGS Failed; REQ-FGS-4 says FCS Failed.
    // @trace SRC-C-TABLE-C-5 REQ-FGS-4
    port FCS_Failed : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      state
        // @trace REQ-FGS-2
        // @formalization executable Reference Attitude state
        referenceRollTenthDegree: Base_Types::Integer_32;
        // @trace REQ-FGS-2
        // @formalization executable Reference Attitude state
        referencePitchTenthDegree: Base_Types::Integer_32;
        // @formalization Appendix C provides no Reference Attitude validity representation
        referenceValid: Base_Types::Boolean;
        // @trace SRC-C-TABLE-C-5
        // @formalization retained FD display state
        fdDisplayed: Base_Types::Boolean;

      integration
        // @trace EA-AP-1 EA-AP-2 EA-PFD-3 EA-AP-4
        guarantee AP_GUIDANCE_INTEGRATION_RANGE:
          -450 [s32] <= AP_Guidance.rollGuidanceTenthDegree &
          AP_Guidance.rollGuidanceTenthDegree <= 450 [s32] &
          -450 [s32] <= AP_Guidance.pitchGuidanceTenthDegree &
          AP_Guidance.pitchGuidanceTenthDegree <= 450 [s32];
        // @trace EA-PFD-1 EA-PFD-2 EA-PFD-3 EA-PFD-4
        guarantee FD_GUIDANCE_INTEGRATION_RANGE:
          -450 [s32] <= FD_Guidance.rollGuidanceTenthDegree &
          FD_Guidance.rollGuidanceTenthDegree <= 450 [s32] &
          -450 [s32] <= FD_Guidance.pitchGuidanceTenthDegree &
          FD_Guidance.pitchGuidanceTenthDegree <= 450 [s32];
        // @trace SRC-C-TABLE-C-5 REQ-FGS-4
        // @formalization failure-output consistency
        guarantee FAILURE_INTEGRATION_CONSISTENCY:
          FCS_Failed implies not FD_Guidance.fdOn;

      initialize
        modifies referenceRollTenthDegree, referencePitchTenthDegree,
                 referenceValid, fdDisplayed;
        // @formalization Appendix C supplies no FGS initialization behavior
        guarantee INITIAL_FGS_FUNCTION:
          referenceRollTenthDegree == 0 [s32] &
          referencePitchTenthDegree == 0 [s32] &
          not referenceValid & not fdDisplayed &
          FD_Guidance.rollGuidanceTenthDegree == 0 [s32] &
          FD_Guidance.pitchGuidanceTenthDegree == 0 [s32] &
          not FD_Guidance.fdOn &
          AP_Guidance.rollGuidanceTenthDegree == 0 [s32] &
          AP_Guidance.pitchGuidanceTenthDegree == 0 [s32] &
          not AP_Guidance.guidanceValid & FCS_Failed;

      compute
        modifies referenceRollTenthDegree, referencePitchTenthDegree,
                 referenceValid, fdDisplayed;

        // @trace REQ-FGS-2 SRC-C-TABLE-C-1 SRC-C-TABLE-C-3
        // @formalization deterministic synchronization and invalid-attitude policy
        guarantee REFERENCE_ATTITUDE_UPDATE:
          ((not (Aircraft_Attitude.rollStatus & Aircraft_Attitude.pitchStatus)) implies
            (not referenceValid & not fdDisplayed)) &
          ((Aircraft_Attitude.rollStatus & Aircraft_Attitude.pitchStatus &
            ((Display_FD.displayFdStatus & Display_FD.displayFd) |
             (Sync_FD.syncFdStatus & Sync_FD.syncFd) |
             (AP_Guidance_Request.apGuidanceRequestStatus &
              AP_Guidance_Request.apGuidanceRequest))) implies
            (referenceRollTenthDegree == Aircraft_Attitude.rollTenthDegree &
             referencePitchTenthDegree == Aircraft_Attitude.pitchTenthDegree &
             referenceValid)) &
          ((Aircraft_Attitude.rollStatus & Aircraft_Attitude.pitchStatus &
            not (Display_FD.displayFdStatus & Display_FD.displayFd) &
            not (Sync_FD.syncFdStatus & Sync_FD.syncFd) &
            not (AP_Guidance_Request.apGuidanceRequestStatus &
                 AP_Guidance_Request.apGuidanceRequest)) implies
            (referenceRollTenthDegree == In(referenceRollTenthDegree) &
             referencePitchTenthDegree == In(referencePitchTenthDegree) &
             referenceValid == In(referenceValid))) &
          ((Aircraft_Attitude.rollStatus & Aircraft_Attitude.pitchStatus &
            Display_FD.displayFdStatus) implies
            fdDisplayed == Display_FD.displayFd) &
          ((Aircraft_Attitude.rollStatus & Aircraft_Attitude.pitchStatus &
            not Display_FD.displayFdStatus) implies
            fdDisplayed == In(fdDisplayed));

        // @trace REQ-FGS-1 SRC-C-TABLE-C-5
        // @formalization saturated reference-minus-attitude FD relation
        guarantee FD_GUIDANCE_GENERATION:
          ((referenceValid &
            Aircraft_Attitude.rollStatus & Aircraft_Attitude.pitchStatus &
            fdDisplayed) implies
            (((referenceRollTenthDegree - Aircraft_Attitude.rollTenthDegree < -450 [s32]) implies
                FD_Guidance.rollGuidanceTenthDegree == -450 [s32]) &
             ((-450 [s32] <= referenceRollTenthDegree - Aircraft_Attitude.rollTenthDegree &
                referenceRollTenthDegree - Aircraft_Attitude.rollTenthDegree <= 450 [s32]) implies
                FD_Guidance.rollGuidanceTenthDegree ==
                  referenceRollTenthDegree - Aircraft_Attitude.rollTenthDegree) &
             ((450 [s32] < referenceRollTenthDegree - Aircraft_Attitude.rollTenthDegree) implies
                FD_Guidance.rollGuidanceTenthDegree == 450 [s32]) &
             ((referencePitchTenthDegree - Aircraft_Attitude.pitchTenthDegree < -450 [s32]) implies
                FD_Guidance.pitchGuidanceTenthDegree == -450 [s32]) &
             ((-450 [s32] <= referencePitchTenthDegree - Aircraft_Attitude.pitchTenthDegree &
                referencePitchTenthDegree - Aircraft_Attitude.pitchTenthDegree <= 450 [s32]) implies
                FD_Guidance.pitchGuidanceTenthDegree ==
                  referencePitchTenthDegree - Aircraft_Attitude.pitchTenthDegree) &
             ((450 [s32] < referencePitchTenthDegree - Aircraft_Attitude.pitchTenthDegree) implies
                FD_Guidance.pitchGuidanceTenthDegree == 450 [s32]) &
             FD_Guidance.fdOn)) &
          ((not referenceValid |
            not Aircraft_Attitude.rollStatus | not Aircraft_Attitude.pitchStatus |
            not fdDisplayed) implies
            (FD_Guidance.rollGuidanceTenthDegree == 0 [s32] &
             FD_Guidance.pitchGuidanceTenthDegree == 0 [s32] &
             not FD_Guidance.fdOn));

        // @trace REQ-FGS-3 SRC-C-TABLE-C-3 SRC-C-TABLE-C-4
        // @formalization AP request qualifies bounded Reference Attitude guidance
        guarantee AP_GUIDANCE_GENERATION:
          ((AP_Guidance_Request.apGuidanceRequestStatus &
            AP_Guidance_Request.apGuidanceRequest &
            referenceValid &
            Aircraft_Attitude.rollStatus & Aircraft_Attitude.pitchStatus) implies
            (((referenceRollTenthDegree < -450 [s32]) implies
                AP_Guidance.rollGuidanceTenthDegree == -450 [s32]) &
             ((-450 [s32] <= referenceRollTenthDegree & referenceRollTenthDegree <= 450 [s32]) implies
                AP_Guidance.rollGuidanceTenthDegree == referenceRollTenthDegree) &
             ((450 [s32] < referenceRollTenthDegree) implies
                AP_Guidance.rollGuidanceTenthDegree == 450 [s32]) &
             ((referencePitchTenthDegree < -450 [s32]) implies
                AP_Guidance.pitchGuidanceTenthDegree == -450 [s32]) &
             ((-450 [s32] <= referencePitchTenthDegree & referencePitchTenthDegree <= 450 [s32]) implies
                AP_Guidance.pitchGuidanceTenthDegree == referencePitchTenthDegree) &
             ((450 [s32] < referencePitchTenthDegree) implies
                AP_Guidance.pitchGuidanceTenthDegree == 450 [s32]) &
             AP_Guidance.guidanceValid)) &
          ((not AP_Guidance_Request.apGuidanceRequestStatus |
            not AP_Guidance_Request.apGuidanceRequest |
            not referenceValid |
            not Aircraft_Attitude.rollStatus | not Aircraft_Attitude.pitchStatus) implies
            (AP_Guidance.rollGuidanceTenthDegree == 0 [s32] &
             AP_Guidance.pitchGuidanceTenthDegree == 0 [s32] &
             not AP_Guidance.guidanceValid));

        // @trace REQ-FGS-4 SRC-C-TABLE-C-5
        // @formalization failure means unusable attitude or Reference Attitude
        guarantee FCS_FAILED_STATUS:
          FCS_Failed ==
            (not Aircraft_Attitude.rollStatus | not Aircraft_Attitude.pitchStatus |
             not referenceValid);
    }*/
  }

}
