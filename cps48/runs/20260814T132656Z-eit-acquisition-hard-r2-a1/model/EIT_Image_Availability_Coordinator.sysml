// Retained architecture checkpoint: approved allocation and typed flows, without GUMBO behavior.
// @trace CTX-01
package EIT_Image_Availability_Coordinator {
  private import HAMR::*;

  // Finite boundary vocabulary.
  // @trace MON-IMG-01
  enum def ImageSignal {
    enum NONE; enum GENERATED; enum REVOKED; enum UPSTREAM_FAILURE; enum INVALID_A; enum INVALID_B;
  }
  // @trace MON-DOC-01
  enum def DoctorSignal {
    enum NONE; enum REQUEST_VIEW; enum ACK_VIEW; enum DISMISS_VIEW; enum INVALID_A; enum INVALID_B;
  }
  // @trace MON-CTX-01
  enum def PreparationContext {
    enum NO_REPORT; enum BELT_REPORTED; enum CALIBRATION_REPORTED;
    enum BELT_AND_CALIBRATION_REPORTED; enum REPORTED_FAILURE; enum INVALID_A; enum INVALID_B;
  }
  // @trace MON-SVC-01
  enum def ServiceObservation { enum READY; enum DEGRADED; enum FAILED; enum INVALID_A; enum INVALID_B; }
  // @trace MON-REC-01
  enum def RecoveryEvent { enum NONE; enum RESET; enum VERIFY_OK; enum RESUME; enum INVALID_A; enum INVALID_B; }

  // Qualified facts.
  // @trace TYPE-FACT-01
  enum def ImageFacts { enum NO_IMAGE; enum NEW_IMAGE; enum WITHDRAWAL; enum REPORTED_FAILURE; enum INVALID; }
  // @trace TYPE-FACT-01
  enum def ReviewFacts { enum NO_REVIEW_EVENT; enum VIEW_REQUEST; enum VIEW_ACK; enum VIEW_DISMISS; enum INVALID; }
  // @trace TYPE-FACT-01
  enum def ContextFacts { enum NO_CONTEXT; enum PARTIAL_CONTEXT; enum COMPLETE_CONTEXT; enum REPORTED_FAILURE; enum INVALID; }
  // @trace TYPE-FACT-01
  enum def ServiceFacts { enum READY; enum DEGRADED; enum REPORTED_FAILURE; enum INVALID; }

  // Fault, state, decision, and publication vocabulary.
  // @trace TYPE-FAULT-01
  enum def DominantFault {
    enum RECOVERY_INPUT; enum IMAGE_INPUT; enum DOCTOR_INPUT; enum CONTEXT_INPUT; enum SERVICE_INPUT;
    enum UPSTREAM_REPORTED; enum CONTEXT_REPORTED; enum SERVICE_REPORTED; enum NONE;
  }
  // @trace TYPE-STATE-01
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum VERIFYING; enum ARMED; }
  // @trace TYPE-STATE-01
  enum def EvidenceState { enum EMPTY; enum ACCEPTED; enum REJECTED; enum RECOVERY; }
  // @trace TYPE-STATE-01
  enum def ArtifactState { enum EMPTY; enum STAGED; enum QUARANTINED; enum WITHDRAWN; enum RECOVERY; }
  // @trace TYPE-STATE-01
  enum def ReviewState { enum IDLE; enum OFFERED; enum VIEWING; enum ACKNOWLEDGED; enum RECOVERY; }
  // @trace TYPE-DEC-01
  enum def AdmissionOutcome { enum NONE; enum ADMIT; enum QUARANTINE; enum REJECT; }
  // @trace TYPE-DEC-01
  enum def AdmissionReason {
    enum NO_CANDIDATE; enum ELIGIBLE; enum EVIDENCE_INCOMPLETE; enum SERVICE_DEGRADED; enum RECOVERY_CLOSED;
  }
  // @trace TYPE-DEC-01
  enum def AvailabilityDecision { enum BLOCKED; enum ALLOWED; }
  // @trace TYPE-DEC-01
  enum def BlockReason {
    enum RECOVERY_BLOCK; enum ARTIFACT_NOT_STAGED; enum EVIDENCE_NOT_ACCEPTED; enum SERVICE_NOT_READY; enum NONE;
  }
  // @trace TYPE-DEC-01
  enum def PresentationProposal { enum NONE; enum CLOSE; enum OPEN; enum OFFER; }
  // @trace TYPE-ACT-01
  enum def SelectedAction { enum SAFE_WITHHOLD; enum WITHDRAW; enum REJECT; enum CLOSE; enum ACCEPT; enum OPEN; enum OFFER; enum HOLD; }
  // @trace TYPE-ACT-01
  enum def SelectedReason {
    enum FAULT_OR_RECOVERY; enum UPSTREAM_WITHDRAWAL; enum EVIDENCE_REJECTION; enum SERVICE_QUARANTINE;
    enum DOCTOR_CLOSURE; enum NEW_IMAGE_ACCEPTANCE; enum DOCTOR_OPENING; enum IMAGE_OFFER; enum NO_ELIGIBLE_WORK;
  }
  // @trace CTRL-UP-01
  enum def UpstreamDisposition { enum NO_ACTION; enum ACCEPT_IMAGE; enum REJECT_IMAGE; enum ACK_WITHDRAWN; enum PAUSE_DELIVERY; }
  // @trace CTRL-DOC-01
  enum def Visibility { enum HIDDEN; enum OFFERED; enum VISIBLE; enum CLOSED; }
  // @trace TYPE-PUB-01
  enum def PublicMode { enum RECOVERY; enum FAULT; enum QUARANTINED; enum STAGED; enum OFFERED; enum VIEWING; enum CLOSED; enum IDLE; }

  // Flat interaction and boundary records. Every GUMBO-inspected field is an attribute.
  // @trace TYPE-FAULT-01
  part def FaultSummary :> Data {
    attribute faultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute multipleFaults : Base_Types::Boolean;
  }
  // @trace PART-06
  part def RecoveryFrame :> Data {
    attribute recoveryState : RecoveryState;
    attribute recoveryOpen : Base_Types::Boolean;
    attribute recoveryReleased : Base_Types::Boolean;
    attribute effectiveFaultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute effectiveMultipleFaults : Base_Types::Boolean;
  }
  // @trace INT-20
  part def EvidenceFrame :> Data {
    attribute evidenceState : EvidenceState;
    attribute contextAccepted : Base_Types::Boolean;
  }
  // @trace INT-22
  part def AdmissionFrame :> Data {
    attribute outcome : AdmissionOutcome;
    attribute admissionReason : AdmissionReason;
  }
  // @trace INT-24
  part def ArtifactFrame :> Data {
    attribute artifactState : ArtifactState;
    attribute withdrawProposal : Base_Types::Boolean;
    attribute rejectProposal : Base_Types::Boolean;
    attribute acceptProposal : Base_Types::Boolean;
    attribute closureWindow : Base_Types::Boolean;
  }
  // @trace INT-26
  part def AvailabilityDecisionFrame :> Data {
    attribute decision : AvailabilityDecision;
    attribute blockReason : BlockReason;
  }
  // @trace INT-28
  part def ReviewFrame :> Data { attribute reviewState : ReviewState; }
  // @trace INT-29
  part def PresentationFrame :> Data { attribute proposal : PresentationProposal; }
  // @trace INT-30
  part def DecisionFrame :> Data {
    attribute availabilityAllowed : Base_Types::Boolean;
    attribute selectedAction : SelectedAction;
    attribute selectedReason : SelectedReason;
    attribute recoveryState : RecoveryState;
    attribute recoveryOpen : Base_Types::Boolean;
    attribute recoveryReleased : Base_Types::Boolean;
    attribute effectiveFaultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute effectiveMultipleFaults : Base_Types::Boolean;
    attribute evidenceState : EvidenceState;
    attribute artifactState : ArtifactState;
    attribute reviewState : ReviewState;
  }
  // @trace CTRL-DOC-01
  part def AvailabilityFrame :> Data {
    attribute publicMode : PublicMode;
    attribute visibility : Visibility;
    attribute selectedReason : SelectedReason;
    attribute recoveryState : RecoveryState;
    attribute evidenceState : EvidenceState;
    attribute artifactState : ArtifactState;
    attribute reviewState : ReviewState;
    attribute faultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute multipleFaults : Base_Types::Boolean;
  }

  // Responsibility-bearing semantic Threads.
  // @trace PART-01
  part def ImageEventQualification :> Thread {
    // @trace MON-IMG-01
    port imageSignal : DataPort { in :>> type : ImageSignal; }
    // @trace INT-01
    port imageFacts : DataPort { out :>> type : ImageFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_IMAGE_FACTS "Image qualification initializes with no image event":
            imageFacts == ImageFacts.NO_IMAGE;
      compute
        guarantee
          // @trace PART-01
          IMAGE_QUALIFICATION "The image owner collapses invalid values and distinguishes all other image events":
            ((imageSignal == ImageSignal.NONE) implies (imageFacts == ImageFacts.NO_IMAGE)) &
            ((imageSignal == ImageSignal.GENERATED) implies (imageFacts == ImageFacts.NEW_IMAGE)) &
            ((imageSignal == ImageSignal.REVOKED) implies (imageFacts == ImageFacts.WITHDRAWAL)) &
            ((imageSignal == ImageSignal.UPSTREAM_FAILURE) implies (imageFacts == ImageFacts.REPORTED_FAILURE)) &
            (((imageSignal == ImageSignal.INVALID_A) | (imageSignal == ImageSignal.INVALID_B)) implies
              (imageFacts == ImageFacts.INVALID));
    }*/
  }
  // @trace PART-02
  part def DoctorEventQualification :> Thread {
    // @trace MON-DOC-01
    port doctorSignal : DataPort { in :>> type : DoctorSignal; }
    // @trace INT-05
    port reviewFacts : DataPort { out :>> type : ReviewFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_REVIEW_FACTS "Doctor qualification initializes with no review event":
            reviewFacts == ReviewFacts.NO_REVIEW_EVENT;
      compute
        guarantee
          // @trace PART-02
          DOCTOR_QUALIFICATION "The Doctor-event owner collapses invalid values and distinguishes review events":
            ((doctorSignal == DoctorSignal.NONE) implies (reviewFacts == ReviewFacts.NO_REVIEW_EVENT)) &
            ((doctorSignal == DoctorSignal.REQUEST_VIEW) implies (reviewFacts == ReviewFacts.VIEW_REQUEST)) &
            ((doctorSignal == DoctorSignal.ACK_VIEW) implies (reviewFacts == ReviewFacts.VIEW_ACK)) &
            ((doctorSignal == DoctorSignal.DISMISS_VIEW) implies (reviewFacts == ReviewFacts.VIEW_DISMISS)) &
            (((doctorSignal == DoctorSignal.INVALID_A) | (doctorSignal == DoctorSignal.INVALID_B)) implies
              (reviewFacts == ReviewFacts.INVALID));
    }*/
  }
  // @trace PART-03
  part def PreparationContextAssessment :> Thread {
    // @trace MON-CTX-01
    port preparationContext : DataPort { in :>> type : PreparationContext; }
    // @trace INT-07
    port contextFacts : DataPort { out :>> type : ContextFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_CONTEXT_FACTS "Preparation context initializes with no report":
            contextFacts == ContextFacts.NO_CONTEXT;
      compute
        guarantee
          // @trace PART-03
          CONTEXT_ASSESSMENT "The context owner combines the two administrative reports and collapses invalid values":
            ((preparationContext == PreparationContext.NO_REPORT) implies
              (contextFacts == ContextFacts.NO_CONTEXT)) &
            (((preparationContext == PreparationContext.BELT_REPORTED) |
              (preparationContext == PreparationContext.CALIBRATION_REPORTED)) implies
              (contextFacts == ContextFacts.PARTIAL_CONTEXT)) &
            ((preparationContext == PreparationContext.BELT_AND_CALIBRATION_REPORTED) implies
              (contextFacts == ContextFacts.COMPLETE_CONTEXT)) &
            ((preparationContext == PreparationContext.REPORTED_FAILURE) implies
              (contextFacts == ContextFacts.REPORTED_FAILURE)) &
            (((preparationContext == PreparationContext.INVALID_A) |
              (preparationContext == PreparationContext.INVALID_B)) implies
              (contextFacts == ContextFacts.INVALID));
    }*/
  }
  // @trace PART-04
  part def AvailabilityServiceAssessment :> Thread {
    // @trace MON-SVC-01
    port availabilityService : DataPort { in :>> type : ServiceObservation; }
    // @trace INT-10
    port serviceFacts : DataPort { out :>> type : ServiceFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_SERVICE_FACTS "Service qualification initializes ready":
            serviceFacts == ServiceFacts.READY;
      compute
        guarantee
          // @trace PART-04
          SERVICE_ASSESSMENT "The service owner preserves ready and degraded service while collapsing invalid values":
            ((availabilityService == ServiceObservation.READY) implies (serviceFacts == ServiceFacts.READY)) &
            ((availabilityService == ServiceObservation.DEGRADED) implies (serviceFacts == ServiceFacts.DEGRADED)) &
            ((availabilityService == ServiceObservation.FAILED) implies (serviceFacts == ServiceFacts.REPORTED_FAILURE)) &
            (((availabilityService == ServiceObservation.INVALID_A) |
              (availabilityService == ServiceObservation.INVALID_B)) implies (serviceFacts == ServiceFacts.INVALID));
    }*/
  }
  // @trace PART-05
  part def FaultComposition :> Thread {
    // @trace INT-01
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    // @trace INT-05
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    // @trace INT-07
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    // @trace INT-10
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    // @trace INT-13
    port faultSummary : DataPort { out :>> type : FaultSummary; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_FAULT_SUMMARY "Fault composition initializes with no fault":
            faultSummary.faultPresent == false &
            faultSummary.dominantFault == DominantFault.NONE &
            faultSummary.multipleFaults == false;
      compute
        guarantee
          // @trace PART-05
          FAULT_PRESENCE_AND_MULTIPLICITY "The fault owner detects seven local sources and simultaneous sources":
            (faultSummary.faultPresent ==
              ((imageFacts == ImageFacts.INVALID) |
               (reviewFacts == ReviewFacts.INVALID) |
               (contextFacts == ContextFacts.INVALID) |
               (serviceFacts == ServiceFacts.INVALID) |
               (imageFacts == ImageFacts.REPORTED_FAILURE) |
               (contextFacts == ContextFacts.REPORTED_FAILURE) |
               (serviceFacts == ServiceFacts.REPORTED_FAILURE))) &
            (faultSummary.multipleFaults ==
              (((imageFacts == ImageFacts.INVALID) &
                ((reviewFacts == ReviewFacts.INVALID) | (contextFacts == ContextFacts.INVALID) |
                 (serviceFacts == ServiceFacts.INVALID) | (imageFacts == ImageFacts.REPORTED_FAILURE) |
                 (contextFacts == ContextFacts.REPORTED_FAILURE) | (serviceFacts == ServiceFacts.REPORTED_FAILURE))) |
               ((reviewFacts == ReviewFacts.INVALID) &
                ((contextFacts == ContextFacts.INVALID) | (serviceFacts == ServiceFacts.INVALID) |
                 (imageFacts == ImageFacts.REPORTED_FAILURE) | (contextFacts == ContextFacts.REPORTED_FAILURE) |
                 (serviceFacts == ServiceFacts.REPORTED_FAILURE))) |
               ((contextFacts == ContextFacts.INVALID) &
                ((serviceFacts == ServiceFacts.INVALID) | (imageFacts == ImageFacts.REPORTED_FAILURE) |
                 (contextFacts == ContextFacts.REPORTED_FAILURE) | (serviceFacts == ServiceFacts.REPORTED_FAILURE))) |
               ((serviceFacts == ServiceFacts.INVALID) &
                ((imageFacts == ImageFacts.REPORTED_FAILURE) | (contextFacts == ContextFacts.REPORTED_FAILURE) |
                 (serviceFacts == ServiceFacts.REPORTED_FAILURE))) |
               ((imageFacts == ImageFacts.REPORTED_FAILURE) &
                ((contextFacts == ContextFacts.REPORTED_FAILURE) | (serviceFacts == ServiceFacts.REPORTED_FAILURE))) |
               ((contextFacts == ContextFacts.REPORTED_FAILURE) & (serviceFacts == ServiceFacts.REPORTED_FAILURE))));
        guarantee
          // @trace TYPE-FAULT-01
          FAULT_DOMINANCE "The local dominant source follows the approved ordering":
            ((imageFacts == ImageFacts.INVALID) implies
              (faultSummary.dominantFault == DominantFault.IMAGE_INPUT)) &
            (((imageFacts != ImageFacts.INVALID) & (reviewFacts == ReviewFacts.INVALID)) implies
              (faultSummary.dominantFault == DominantFault.DOCTOR_INPUT)) &
            (((imageFacts != ImageFacts.INVALID) & (reviewFacts != ReviewFacts.INVALID) &
              (contextFacts == ContextFacts.INVALID)) implies
              (faultSummary.dominantFault == DominantFault.CONTEXT_INPUT)) &
            (((imageFacts != ImageFacts.INVALID) & (reviewFacts != ReviewFacts.INVALID) &
              (contextFacts != ContextFacts.INVALID) & (serviceFacts == ServiceFacts.INVALID)) implies
              (faultSummary.dominantFault == DominantFault.SERVICE_INPUT)) &
            (((imageFacts != ImageFacts.INVALID) & (reviewFacts != ReviewFacts.INVALID) &
              (contextFacts != ContextFacts.INVALID) & (serviceFacts != ServiceFacts.INVALID) &
              (imageFacts == ImageFacts.REPORTED_FAILURE)) implies
              (faultSummary.dominantFault == DominantFault.UPSTREAM_REPORTED)) &
            (((imageFacts != ImageFacts.INVALID) & (reviewFacts != ReviewFacts.INVALID) &
              (contextFacts != ContextFacts.INVALID) & (serviceFacts != ServiceFacts.INVALID) &
              (imageFacts != ImageFacts.REPORTED_FAILURE) & (contextFacts == ContextFacts.REPORTED_FAILURE)) implies
              (faultSummary.dominantFault == DominantFault.CONTEXT_REPORTED)) &
            (((imageFacts != ImageFacts.INVALID) & (reviewFacts != ReviewFacts.INVALID) &
              (contextFacts != ContextFacts.INVALID) & (serviceFacts != ServiceFacts.INVALID) &
              (imageFacts != ImageFacts.REPORTED_FAILURE) & (contextFacts != ContextFacts.REPORTED_FAILURE) &
              (serviceFacts == ServiceFacts.REPORTED_FAILURE)) implies
              (faultSummary.dominantFault == DominantFault.SERVICE_REPORTED)) &
            ((faultSummary.faultPresent == false) implies
              (faultSummary.dominantFault == DominantFault.NONE));
    }*/
  }
  // @trace PART-06
  part def RecoveryControl :> Thread {
    // @trace MON-REC-01
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    // @trace INT-13
    port faultSummary : DataPort { in :>> type : FaultSummary; }
    // @trace INT-14
    port recoveryFrame : DataPort { out :>> type : RecoveryFrame; }

    language "GUMBO" /*{
      state
        // @trace PART-06
        recovery : RecoveryState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_RECOVERY "Recovery initializes healthy, open, released false, and fault-free":
            recovery == RecoveryState.HEALTHY &
            recoveryFrame.recoveryState == RecoveryState.HEALTHY &
            recoveryFrame.recoveryOpen == true &
            recoveryFrame.recoveryReleased == false &
            recoveryFrame.effectiveFaultPresent == false &
            recoveryFrame.dominantFault == DominantFault.NONE &
            recoveryFrame.effectiveMultipleFaults == false;
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_FAULT_LATCH "A local fault or invalid recovery input latches recovery with recovery-input dominance":
            assume faultSummary.faultPresent == true |
              recoveryEvent == RecoveryEvent.INVALID_A | recoveryEvent == RecoveryEvent.INVALID_B;
            guarantee recovery == RecoveryState.LATCHED &
              recoveryFrame.recoveryState == RecoveryState.LATCHED &
              recoveryFrame.recoveryOpen == false &
              recoveryFrame.recoveryReleased == false &
              recoveryFrame.effectiveFaultPresent == true &
              (((recoveryEvent == RecoveryEvent.INVALID_A) | (recoveryEvent == RecoveryEvent.INVALID_B)) implies
                (recoveryFrame.dominantFault == DominantFault.RECOVERY_INPUT &
                 recoveryFrame.effectiveMultipleFaults ==
                   (faultSummary.faultPresent | faultSummary.multipleFaults))) &
              (((recoveryEvent != RecoveryEvent.INVALID_A) & (recoveryEvent != RecoveryEvent.INVALID_B)) implies
                (recoveryFrame.dominantFault == faultSummary.dominantFault &
                 recoveryFrame.effectiveMultipleFaults == faultSummary.multipleFaults));
          // @trace CASE-02
          case CASE_02_HEALTHY_STUTTER "Healthy recovery remains open when no fault exists":
            assume faultSummary.faultPresent == false &
              recoveryEvent != RecoveryEvent.INVALID_A & recoveryEvent != RecoveryEvent.INVALID_B &
              In(recovery) == RecoveryState.HEALTHY;
            guarantee recovery == RecoveryState.HEALTHY &
              recoveryFrame.recoveryState == RecoveryState.HEALTHY & recoveryFrame.recoveryOpen == true &
              recoveryFrame.recoveryReleased == false & recoveryFrame.effectiveFaultPresent == false &
              recoveryFrame.dominantFault == DominantFault.NONE &
              recoveryFrame.effectiveMultipleFaults == false;
          // @trace CASE-03
          case CASE_03_RESET "Fresh RESET moves latched recovery to verifying":
            assume faultSummary.faultPresent == false & In(recovery) == RecoveryState.LATCHED &
              recoveryEvent == RecoveryEvent.RESET;
            guarantee recovery == RecoveryState.VERIFYING &
              recoveryFrame.recoveryState == RecoveryState.VERIFYING & recoveryFrame.recoveryOpen == false &
              recoveryFrame.recoveryReleased == false & recoveryFrame.effectiveFaultPresent == false &
              recoveryFrame.dominantFault == DominantFault.NONE &
              recoveryFrame.effectiveMultipleFaults == false;
          // @trace CASE-04
          case CASE_04_VERIFY "Fresh VERIFY_OK moves verifying recovery to armed":
            assume faultSummary.faultPresent == false & In(recovery) == RecoveryState.VERIFYING &
              recoveryEvent == RecoveryEvent.VERIFY_OK;
            guarantee recovery == RecoveryState.ARMED &
              recoveryFrame.recoveryState == RecoveryState.ARMED & recoveryFrame.recoveryOpen == false &
              recoveryFrame.recoveryReleased == false & recoveryFrame.effectiveFaultPresent == false &
              recoveryFrame.dominantFault == DominantFault.NONE &
              recoveryFrame.effectiveMultipleFaults == false;
          // @trace CASE-05
          case CASE_05_RESUME "Fresh RESUME reopens armed recovery for one release evaluation":
            assume faultSummary.faultPresent == false & In(recovery) == RecoveryState.ARMED &
              recoveryEvent == RecoveryEvent.RESUME;
            guarantee recovery == RecoveryState.HEALTHY &
              recoveryFrame.recoveryState == RecoveryState.HEALTHY & recoveryFrame.recoveryOpen == true &
              recoveryFrame.recoveryReleased == true & recoveryFrame.effectiveFaultPresent == false &
              recoveryFrame.dominantFault == DominantFault.NONE &
              recoveryFrame.effectiveMultipleFaults == false;
          // @trace CASE-06
          case CASE_06_CLOSED_STUTTER "Every unmatched closed-phase event preserves its recovery phase":
            assume faultSummary.faultPresent == false &
              recoveryEvent != RecoveryEvent.INVALID_A & recoveryEvent != RecoveryEvent.INVALID_B &
              In(recovery) != RecoveryState.HEALTHY &
              not ((In(recovery) == RecoveryState.LATCHED & recoveryEvent == RecoveryEvent.RESET) |
                (In(recovery) == RecoveryState.VERIFYING & recoveryEvent == RecoveryEvent.VERIFY_OK) |
                (In(recovery) == RecoveryState.ARMED & recoveryEvent == RecoveryEvent.RESUME));
            guarantee recovery == In(recovery) & recoveryFrame.recoveryState == In(recovery) &
              recoveryFrame.recoveryOpen == false & recoveryFrame.recoveryReleased == false &
              recoveryFrame.effectiveFaultPresent == false &
              recoveryFrame.dominantFault == DominantFault.NONE &
              recoveryFrame.effectiveMultipleFaults == false;
    }*/
  }
  // @trace PART-07
  part def EvidenceLifecycle :> Thread {
    // @trace INT-02
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    // @trace INT-08
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    // @trace INT-14
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-20
    port evidenceFrame : DataPort { out :>> type : EvidenceFrame; }

    language "GUMBO" /*{
      state
        // @trace PART-07
        evidence : EvidenceState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_EVIDENCE "Evidence initializes empty and unaccepted":
            evidence == EvidenceState.EMPTY & evidenceFrame.evidenceState == EvidenceState.EMPTY &
            evidenceFrame.contextAccepted == false;
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07_RECOVERY_CLOSED "Closed recovery moves evidence to recovery state":
            assume recoveryFrame.recoveryOpen == false;
            guarantee evidence == EvidenceState.RECOVERY &
              evidenceFrame.evidenceState == EvidenceState.RECOVERY & evidenceFrame.contextAccepted == false;
          // @trace CASE-08
          case CASE_08_RECOVERY_RELEASE "Open recovery neutralizes prior recovery evidence and ignores concurrent work":
            assume recoveryFrame.recoveryOpen == true & In(evidence) == EvidenceState.RECOVERY;
            guarantee evidence == EvidenceState.EMPTY & evidenceFrame.evidenceState == EvidenceState.EMPTY &
              evidenceFrame.contextAccepted == false;
          // @trace CASE-09
          case CASE_09_WITHDRAWAL "Withdrawal empties nonrecovery evidence":
            assume recoveryFrame.recoveryOpen == true & In(evidence) != EvidenceState.RECOVERY &
              imageFacts == ImageFacts.WITHDRAWAL;
            guarantee evidence == EvidenceState.EMPTY & evidenceFrame.evidenceState == EvidenceState.EMPTY &
              evidenceFrame.contextAccepted == false;
          // @trace CASE-10
          case CASE_10_NEW_IMAGE_CONTEXT "A new image accepts complete current context and rejects every other context":
            assume recoveryFrame.recoveryOpen == true & In(evidence) != EvidenceState.RECOVERY &
              imageFacts == ImageFacts.NEW_IMAGE;
            guarantee ((contextFacts == ContextFacts.COMPLETE_CONTEXT) implies
                (evidence == EvidenceState.ACCEPTED & evidenceFrame.evidenceState == EvidenceState.ACCEPTED &
                 evidenceFrame.contextAccepted == true)) &
              ((contextFacts != ContextFacts.COMPLETE_CONTEXT) implies
                (evidence == EvidenceState.REJECTED & evidenceFrame.evidenceState == EvidenceState.REJECTED &
                 evidenceFrame.contextAccepted == false));
          // @trace CASE-11
          case CASE_11_EVIDENCE_STUTTER "Without new image or withdrawal, nonrecovery evidence persists":
            assume recoveryFrame.recoveryOpen == true & In(evidence) != EvidenceState.RECOVERY &
              imageFacts != ImageFacts.WITHDRAWAL & imageFacts != ImageFacts.NEW_IMAGE;
            guarantee evidence == In(evidence) & evidenceFrame.evidenceState == In(evidence) &
              (evidenceFrame.contextAccepted == (In(evidence) == EvidenceState.ACCEPTED));
    }*/
  }
  // @trace PART-08
  part def AdmissionDecisionOwner :> Thread {
    // @trace INT-03
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    // @trace INT-09
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    // @trace INT-11
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    // @trace INT-15
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-20
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    // @trace INT-22
    port admissionFrame : DataPort { out :>> type : AdmissionFrame; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_ADMISSION "Admission initializes with no candidate":
            admissionFrame.outcome == AdmissionOutcome.NONE &
            admissionFrame.admissionReason == AdmissionReason.NO_CANDIDATE;
      compute
        guarantee
          // @trace PART-08
          ADMISSION_POLICY "Admission combines current image, context, evidence, service, and recovery facts":
            ((recoveryFrame.recoveryOpen == false) implies
              (admissionFrame.outcome == AdmissionOutcome.NONE &
               admissionFrame.admissionReason == AdmissionReason.RECOVERY_CLOSED)) &
            ((recoveryFrame.recoveryOpen == true & imageFacts != ImageFacts.NEW_IMAGE) implies
              (admissionFrame.outcome == AdmissionOutcome.NONE &
               admissionFrame.admissionReason == AdmissionReason.NO_CANDIDATE)) &
            ((recoveryFrame.recoveryOpen == true & imageFacts == ImageFacts.NEW_IMAGE &
              evidenceFrame.evidenceState == EvidenceState.REJECTED) implies
              (admissionFrame.outcome == AdmissionOutcome.REJECT &
               admissionFrame.admissionReason == AdmissionReason.EVIDENCE_INCOMPLETE)) &
            ((recoveryFrame.recoveryOpen == true & imageFacts == ImageFacts.NEW_IMAGE &
              evidenceFrame.evidenceState == EvidenceState.ACCEPTED &
              contextFacts == ContextFacts.COMPLETE_CONTEXT & serviceFacts == ServiceFacts.READY) implies
              (admissionFrame.outcome == AdmissionOutcome.ADMIT &
               admissionFrame.admissionReason == AdmissionReason.ELIGIBLE)) &
            ((recoveryFrame.recoveryOpen == true & imageFacts == ImageFacts.NEW_IMAGE &
              evidenceFrame.evidenceState != EvidenceState.REJECTED &
              not ((evidenceFrame.evidenceState == EvidenceState.ACCEPTED) &
                (contextFacts == ContextFacts.COMPLETE_CONTEXT) & (serviceFacts == ServiceFacts.READY)) &
              serviceFacts == ServiceFacts.DEGRADED) implies
              (admissionFrame.outcome == AdmissionOutcome.QUARANTINE &
               admissionFrame.admissionReason == AdmissionReason.SERVICE_DEGRADED)) &
            ((recoveryFrame.recoveryOpen == true & imageFacts == ImageFacts.NEW_IMAGE &
              evidenceFrame.evidenceState != EvidenceState.REJECTED &
              not ((evidenceFrame.evidenceState == EvidenceState.ACCEPTED) &
                (contextFacts == ContextFacts.COMPLETE_CONTEXT) & (serviceFacts == ServiceFacts.READY)) &
              serviceFacts != ServiceFacts.DEGRADED) implies
              (admissionFrame.outcome == AdmissionOutcome.NONE &
               admissionFrame.admissionReason == AdmissionReason.NO_CANDIDATE));
    }*/
  }
  // @trace PART-09
  part def ArtifactLifecycle :> Thread {
    // @trace INT-04
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    // @trace INT-16
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-22
    port admissionFrame : DataPort { in :>> type : AdmissionFrame; }
    // @trace INT-34
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    // @trace INT-24
    port artifactFrame : DataPort { out :>> type : ArtifactFrame; }

    language "GUMBO" /*{
      state
        // @trace PART-09
        artifact : ArtifactState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_ARTIFACT "Artifact initializes empty with no proposal":
            artifact == ArtifactState.EMPTY & artifactFrame.artifactState == ArtifactState.EMPTY &
            artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
            artifactFrame.acceptProposal == false & artifactFrame.closureWindow == false;
      compute
        compute_cases
          // @trace CASE-12
          case CASE_12_RECOVERY_CLOSED "Closed recovery moves artifact state to recovery and suppresses proposals":
            assume recoveryFrame.recoveryOpen == false;
            guarantee artifact == ArtifactState.RECOVERY & artifactFrame.artifactState == ArtifactState.RECOVERY &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              artifactFrame.acceptProposal == false & artifactFrame.closureWindow == false;
          // @trace CASE-13
          case CASE_13_RECOVERY_RELEASE "Open recovery neutralizes prior recovery artifact and ignores concurrent work":
            assume recoveryFrame.recoveryOpen == true & In(artifact) == ArtifactState.RECOVERY;
            guarantee artifact == ArtifactState.EMPTY & artifactFrame.artifactState == ArtifactState.EMPTY &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              artifactFrame.acceptProposal == false & artifactFrame.closureWindow == false;
          // @trace CASE-14
          case CASE_14_WITHDRAWAL "Withdrawal moves a nonrecovery artifact to withdrawn and proposes withdrawal only":
            assume recoveryFrame.recoveryOpen == true & In(artifact) != ArtifactState.RECOVERY &
              imageFacts == ImageFacts.WITHDRAWAL;
            guarantee artifact == ArtifactState.WITHDRAWN & artifactFrame.artifactState == ArtifactState.WITHDRAWN &
              artifactFrame.withdrawProposal == true & artifactFrame.rejectProposal == false &
              artifactFrame.acceptProposal == false & artifactFrame.closureWindow == false;
          // @trace CASE-15
          case CASE_15_REJECT_OR_QUARANTINE "Rejection or quarantine moves the artifact to quarantine and proposes rejection only":
            assume recoveryFrame.recoveryOpen == true & In(artifact) != ArtifactState.RECOVERY &
              imageFacts != ImageFacts.WITHDRAWAL &
              ((admissionFrame.outcome == AdmissionOutcome.REJECT) |
               (admissionFrame.outcome == AdmissionOutcome.QUARANTINE));
            guarantee artifact == ArtifactState.QUARANTINED &
              artifactFrame.artifactState == ArtifactState.QUARANTINED &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == true &
              artifactFrame.acceptProposal == false & artifactFrame.closureWindow == false;
          // @trace CASE-16
          case CASE_16_ADMISSION "Admission stages ordinary work but leaves a closure-conflicting replacement unretained":
            assume recoveryFrame.recoveryOpen == true & In(artifact) != ArtifactState.RECOVERY &
              imageFacts != ImageFacts.WITHDRAWAL & admissionFrame.outcome == AdmissionOutcome.ADMIT;
            guarantee artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              artifactFrame.acceptProposal == true &
              (((In(artifact) == ArtifactState.STAGED) &
                ((reviewFacts == ReviewFacts.VIEW_ACK) | (reviewFacts == ReviewFacts.VIEW_DISMISS))) implies
                (artifact == ArtifactState.EMPTY & artifactFrame.artifactState == ArtifactState.EMPTY &
                 artifactFrame.closureWindow == true)) &
              (not ((In(artifact) == ArtifactState.STAGED) &
                ((reviewFacts == ReviewFacts.VIEW_ACK) | (reviewFacts == ReviewFacts.VIEW_DISMISS))) implies
                (artifact == ArtifactState.STAGED & artifactFrame.artifactState == ArtifactState.STAGED &
                 artifactFrame.closureWindow == false));
          // @trace CASE-17
          case CASE_17_ARTIFACT_STUTTER "Without withdrawal or admission outcome, nonrecovery artifact state persists":
            assume recoveryFrame.recoveryOpen == true & In(artifact) != ArtifactState.RECOVERY &
              imageFacts != ImageFacts.WITHDRAWAL & admissionFrame.outcome == AdmissionOutcome.NONE;
            guarantee artifact == In(artifact) & artifactFrame.artifactState == In(artifact) &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              artifactFrame.acceptProposal == false & artifactFrame.closureWindow == false;
    }*/
  }
  // @trace PART-10
  part def AvailabilityDecisionOwner :> Thread {
    // @trace INT-12
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    // @trace INT-17
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-21
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    // @trace INT-24
    port artifactFrame : DataPort { in :>> type : ArtifactFrame; }
    // @trace INT-26
    port availabilityFrame : DataPort { out :>> type : AvailabilityDecisionFrame; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_AVAILABILITY_DECISION "Availability initializes blocked by recovery":
            availabilityFrame.decision == AvailabilityDecision.BLOCKED &
            availabilityFrame.blockReason == BlockReason.RECOVERY_BLOCK;
      compute
        guarantee
          // @trace PART-10
          AVAILABILITY_POLICY "Availability combines recovery, artifact or closure window, evidence, and service in order":
            ((recoveryFrame.recoveryOpen == false) implies
              (availabilityFrame.decision == AvailabilityDecision.BLOCKED &
               availabilityFrame.blockReason == BlockReason.RECOVERY_BLOCK)) &
            ((recoveryFrame.recoveryOpen == true & artifactFrame.artifactState != ArtifactState.STAGED &
              artifactFrame.closureWindow == false) implies
              (availabilityFrame.decision == AvailabilityDecision.BLOCKED &
               availabilityFrame.blockReason == BlockReason.ARTIFACT_NOT_STAGED)) &
            ((recoveryFrame.recoveryOpen == true &
              ((artifactFrame.artifactState == ArtifactState.STAGED) | (artifactFrame.closureWindow == true)) &
              evidenceFrame.evidenceState != EvidenceState.ACCEPTED) implies
              (availabilityFrame.decision == AvailabilityDecision.BLOCKED &
               availabilityFrame.blockReason == BlockReason.EVIDENCE_NOT_ACCEPTED)) &
            ((recoveryFrame.recoveryOpen == true &
              ((artifactFrame.artifactState == ArtifactState.STAGED) | (artifactFrame.closureWindow == true)) &
              evidenceFrame.evidenceState == EvidenceState.ACCEPTED & serviceFacts != ServiceFacts.READY) implies
              (availabilityFrame.decision == AvailabilityDecision.BLOCKED &
               availabilityFrame.blockReason == BlockReason.SERVICE_NOT_READY)) &
            ((recoveryFrame.recoveryOpen == true &
              ((artifactFrame.artifactState == ArtifactState.STAGED) | (artifactFrame.closureWindow == true)) &
              evidenceFrame.evidenceState == EvidenceState.ACCEPTED & serviceFacts == ServiceFacts.READY) implies
              (availabilityFrame.decision == AvailabilityDecision.ALLOWED &
               availabilityFrame.blockReason == BlockReason.NONE));
    }*/
  }
  // @trace PART-11
  part def ReviewLifecycle :> Thread {
    // @trace INT-06
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    // @trace INT-18
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-26
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    // @trace INT-28
    port reviewFrame : DataPort { out :>> type : ReviewFrame; }

    language "GUMBO" /*{
      state
        // @trace PART-11
        review : ReviewState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_REVIEW "Review initializes idle":
            review == ReviewState.IDLE & reviewFrame.reviewState == ReviewState.IDLE;
      compute
        compute_cases
          // @trace CASE-18
          case CASE_18_RECOVERY_CLOSED "Closed recovery moves review state to recovery":
            assume recoveryFrame.recoveryOpen == false;
            guarantee review == ReviewState.RECOVERY & reviewFrame.reviewState == ReviewState.RECOVERY;
          // @trace CASE-19
          case CASE_19_RECOVERY_RELEASE "Open recovery neutralizes prior recovery review and ignores concurrent work":
            assume recoveryFrame.recoveryOpen == true & In(review) == ReviewState.RECOVERY;
            guarantee review == ReviewState.IDLE & reviewFrame.reviewState == ReviewState.IDLE;
          // @trace CASE-20
          case CASE_20_AVAILABILITY_BLOCKED "Blocked availability returns nonrecovery review state to idle":
            assume recoveryFrame.recoveryOpen == true & In(review) != ReviewState.RECOVERY &
              availabilityFrame.decision == AvailabilityDecision.BLOCKED;
            guarantee review == ReviewState.IDLE & reviewFrame.reviewState == ReviewState.IDLE;
          // @trace CASE-21
          case CASE_21_VIEW_REQUEST "Allowed availability and a fresh request move review to viewing":
            assume recoveryFrame.recoveryOpen == true & In(review) != ReviewState.RECOVERY &
              availabilityFrame.decision == AvailabilityDecision.ALLOWED &
              reviewFacts == ReviewFacts.VIEW_REQUEST;
            guarantee review == ReviewState.VIEWING & reviewFrame.reviewState == ReviewState.VIEWING;
          // @trace CASE-22
          case CASE_22_ACK_OR_DISMISS "Allowed availability and acknowledgement or dismissal move review to acknowledged":
            assume recoveryFrame.recoveryOpen == true & In(review) != ReviewState.RECOVERY &
              availabilityFrame.decision == AvailabilityDecision.ALLOWED &
              ((reviewFacts == ReviewFacts.VIEW_ACK) | (reviewFacts == ReviewFacts.VIEW_DISMISS));
            guarantee review == ReviewState.ACKNOWLEDGED &
              reviewFrame.reviewState == ReviewState.ACKNOWLEDGED;
          // @trace CASE-23
          case CASE_23_AVAILABLE_DEFAULT "Allowed availability without a Doctor event preserves viewing or offers the image":
            assume recoveryFrame.recoveryOpen == true & In(review) != ReviewState.RECOVERY &
              availabilityFrame.decision == AvailabilityDecision.ALLOWED &
              reviewFacts == ReviewFacts.NO_REVIEW_EVENT;
            guarantee ((In(review) == ReviewState.VIEWING) implies
                (review == ReviewState.VIEWING & reviewFrame.reviewState == ReviewState.VIEWING)) &
              ((In(review) != ReviewState.VIEWING) implies
                (review == ReviewState.OFFERED & reviewFrame.reviewState == ReviewState.OFFERED));
    }*/
  }
  // @trace PART-12
  part def PresentationDecisionOwner :> Thread {
    // @trace INT-27
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    // @trace INT-28
    port reviewFrame : DataPort { in :>> type : ReviewFrame; }
    // @trace INT-29
    port presentationFrame : DataPort { out :>> type : PresentationFrame; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_PRESENTATION "Presentation initializes with no proposal":
            presentationFrame.proposal == PresentationProposal.NONE;
      compute
        guarantee
          // @trace PART-12
          PRESENTATION_POLICY "Presentation combines received availability and owner-supplied review state":
            ((availabilityFrame.decision == AvailabilityDecision.BLOCKED) implies
              (presentationFrame.proposal == PresentationProposal.NONE)) &
            ((availabilityFrame.decision == AvailabilityDecision.ALLOWED &
              reviewFrame.reviewState == ReviewState.ACKNOWLEDGED) implies
              (presentationFrame.proposal == PresentationProposal.CLOSE)) &
            ((availabilityFrame.decision == AvailabilityDecision.ALLOWED &
              reviewFrame.reviewState == ReviewState.VIEWING) implies
              (presentationFrame.proposal == PresentationProposal.OPEN)) &
            ((availabilityFrame.decision == AvailabilityDecision.ALLOWED &
              reviewFrame.reviewState == ReviewState.OFFERED) implies
              (presentationFrame.proposal == PresentationProposal.OFFER)) &
            ((availabilityFrame.decision == AvailabilityDecision.ALLOWED &
              ((reviewFrame.reviewState == ReviewState.IDLE) |
               (reviewFrame.reviewState == ReviewState.RECOVERY))) implies
              (presentationFrame.proposal == PresentationProposal.NONE));
    }*/
  }
  // @trace PART-13
  part def AvailabilityArbitration :> Thread {
    // @trace INT-19
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-23
    port admissionFrame : DataPort { in :>> type : AdmissionFrame; }
    // @trace INT-25
    port artifactFrame : DataPort { in :>> type : ArtifactFrame; }
    // @trace INT-29
    port presentationFrame : DataPort { in :>> type : PresentationFrame; }
    // @trace INT-31
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    // @trace INT-32
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    // @trace INT-33
    port reviewFrame : DataPort { in :>> type : ReviewFrame; }
    // @trace INT-30
    port decisionFrame : DataPort { out :>> type : DecisionFrame; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_DECISION "Arbitration initializes a complete neutral decision frame":
            decisionFrame.selectedAction == SelectedAction.HOLD &
            decisionFrame.selectedReason == SelectedReason.NO_ELIGIBLE_WORK &
            decisionFrame.recoveryState == RecoveryState.HEALTHY & decisionFrame.recoveryOpen == true &
            decisionFrame.recoveryReleased == false &
            decisionFrame.effectiveFaultPresent == false &
            decisionFrame.dominantFault == DominantFault.NONE &
            decisionFrame.effectiveMultipleFaults == false & decisionFrame.evidenceState == EvidenceState.EMPTY &
            decisionFrame.artifactState == ArtifactState.EMPTY & decisionFrame.reviewState == ReviewState.IDLE &
            decisionFrame.availabilityAllowed == false;
      compute
        guarantee
          // @trace INT-30
          OWNER_SOURCED_FRAME "Arbitration carries owner-supplied state, availability, and fault fields without recomputation":
            decisionFrame.recoveryState == recoveryFrame.recoveryState &
            decisionFrame.recoveryOpen == recoveryFrame.recoveryOpen &
            decisionFrame.recoveryReleased == recoveryFrame.recoveryReleased &
            decisionFrame.effectiveFaultPresent == recoveryFrame.effectiveFaultPresent &
            decisionFrame.dominantFault == recoveryFrame.dominantFault &
            decisionFrame.effectiveMultipleFaults == recoveryFrame.effectiveMultipleFaults &
            decisionFrame.evidenceState == evidenceFrame.evidenceState &
            decisionFrame.artifactState == artifactFrame.artifactState &
            decisionFrame.reviewState == reviewFrame.reviewState &
            (decisionFrame.availabilityAllowed ==
              (availabilityFrame.decision == AvailabilityDecision.ALLOWED));
        compute_cases
          // @trace CASE-24
          case CASE_24_SAFE_WITHHOLD "Effective fault or closed recovery dominates every ordinary proposal":
            assume recoveryFrame.effectiveFaultPresent == true | recoveryFrame.recoveryOpen == false;
            guarantee decisionFrame.selectedAction == SelectedAction.SAFE_WITHHOLD &
              decisionFrame.selectedReason == SelectedReason.FAULT_OR_RECOVERY;
          // @trace CASE-25
          case CASE_25_WITHDRAW "Withdrawal dominates every remaining ordinary proposal":
            assume recoveryFrame.effectiveFaultPresent == false & recoveryFrame.recoveryOpen == true &
              artifactFrame.withdrawProposal == true;
            guarantee decisionFrame.selectedAction == SelectedAction.WITHDRAW &
              decisionFrame.selectedReason == SelectedReason.UPSTREAM_WITHDRAWAL;
          // @trace CASE-26
          case CASE_26_REJECT "Rejection or quarantine dominates closure, acceptance, and presentation":
            assume recoveryFrame.effectiveFaultPresent == false & recoveryFrame.recoveryOpen == true &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == true;
            guarantee decisionFrame.selectedAction == SelectedAction.REJECT &
              ((admissionFrame.outcome == AdmissionOutcome.QUARANTINE) implies
                (decisionFrame.selectedReason == SelectedReason.SERVICE_QUARANTINE)) &
              ((admissionFrame.outcome == AdmissionOutcome.REJECT) implies
                (decisionFrame.selectedReason == SelectedReason.EVIDENCE_REJECTION));
          // @trace CASE-27
          case CASE_27_CLOSE "Doctor closure dominates simultaneous replacement acceptance":
            assume recoveryFrame.effectiveFaultPresent == false & recoveryFrame.recoveryOpen == true &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              presentationFrame.proposal == PresentationProposal.CLOSE;
            guarantee decisionFrame.selectedAction == SelectedAction.CLOSE &
              decisionFrame.selectedReason == SelectedReason.DOCTOR_CLOSURE;
          // @trace CASE-28
          case CASE_28_ACCEPT "A new-image acceptance dominates opening or offering":
            assume recoveryFrame.effectiveFaultPresent == false & recoveryFrame.recoveryOpen == true &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              presentationFrame.proposal != PresentationProposal.CLOSE & artifactFrame.acceptProposal == true;
            guarantee decisionFrame.selectedAction == SelectedAction.ACCEPT &
              decisionFrame.selectedReason == SelectedReason.NEW_IMAGE_ACCEPTANCE;
          // @trace CASE-29
          case CASE_29_PRESENT "Opening or offering is selected when no higher-priority work exists":
            assume recoveryFrame.effectiveFaultPresent == false & recoveryFrame.recoveryOpen == true &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              artifactFrame.acceptProposal == false &
              ((presentationFrame.proposal == PresentationProposal.OPEN) |
               (presentationFrame.proposal == PresentationProposal.OFFER));
            guarantee ((presentationFrame.proposal == PresentationProposal.OPEN) implies
                (decisionFrame.selectedAction == SelectedAction.OPEN &
                 decisionFrame.selectedReason == SelectedReason.DOCTOR_OPENING)) &
              ((presentationFrame.proposal == PresentationProposal.OFFER) implies
                (decisionFrame.selectedAction == SelectedAction.OFFER &
                 decisionFrame.selectedReason == SelectedReason.IMAGE_OFFER));
          // @trace CASE-30
          case CASE_30_HOLD "No eligible work produces a neutral hold":
            assume recoveryFrame.effectiveFaultPresent == false & recoveryFrame.recoveryOpen == true &
              artifactFrame.withdrawProposal == false & artifactFrame.rejectProposal == false &
              artifactFrame.acceptProposal == false &
              presentationFrame.proposal != PresentationProposal.CLOSE &
              presentationFrame.proposal != PresentationProposal.OPEN &
              presentationFrame.proposal != PresentationProposal.OFFER;
            guarantee decisionFrame.selectedAction == SelectedAction.HOLD &
              decisionFrame.selectedReason == SelectedReason.NO_ELIGIBLE_WORK;
    }*/
  }
  // @trace PART-14
  part def PublicationComposition :> Thread {
    // @trace INT-30
    port decisionFrame : DataPort { in :>> type : DecisionFrame; }
    // @trace CTRL-UP-01
    port upstreamDisposition : DataPort { out :>> type : UpstreamDisposition; }
    // @trace CTRL-DOC-01
    port analysisAvailability : DataPort { out :>> type : AvailabilityFrame; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_PUBLIC_OUTPUTS "Publication initializes every public field to the approved neutral tuple":
            upstreamDisposition == UpstreamDisposition.NO_ACTION &
            analysisAvailability.publicMode == PublicMode.IDLE &
            analysisAvailability.visibility == Visibility.HIDDEN &
            analysisAvailability.selectedReason == SelectedReason.NO_ELIGIBLE_WORK &
            analysisAvailability.recoveryState == RecoveryState.HEALTHY &
            analysisAvailability.evidenceState == EvidenceState.EMPTY &
            analysisAvailability.artifactState == ArtifactState.EMPTY &
            analysisAvailability.reviewState == ReviewState.IDLE &
            analysisAvailability.faultPresent == false &
            analysisAvailability.dominantFault == DominantFault.NONE &
            analysisAvailability.multipleFaults == false;
      compute
        guarantee
          // @trace COMP-01
          ACTION_OUTPUT_COMPOSITION "One selected action coordinates upstream disposition and Doctor visibility":
            ((decisionFrame.selectedAction == SelectedAction.SAFE_WITHHOLD) implies
              (upstreamDisposition == UpstreamDisposition.PAUSE_DELIVERY &
               analysisAvailability.visibility == Visibility.HIDDEN)) &
            ((decisionFrame.selectedAction == SelectedAction.WITHDRAW) implies
              (upstreamDisposition == UpstreamDisposition.ACK_WITHDRAWN &
               analysisAvailability.visibility == Visibility.HIDDEN)) &
            ((decisionFrame.selectedAction == SelectedAction.REJECT) implies
              (upstreamDisposition == UpstreamDisposition.REJECT_IMAGE &
               analysisAvailability.visibility == Visibility.HIDDEN)) &
            ((decisionFrame.selectedAction == SelectedAction.ACCEPT) implies
              (upstreamDisposition == UpstreamDisposition.ACCEPT_IMAGE &
               analysisAvailability.visibility == Visibility.OFFERED)) &
            ((decisionFrame.selectedAction == SelectedAction.CLOSE) implies
              (upstreamDisposition == UpstreamDisposition.NO_ACTION &
               analysisAvailability.visibility == Visibility.CLOSED)) &
            ((decisionFrame.selectedAction == SelectedAction.OPEN) implies
              (upstreamDisposition == UpstreamDisposition.NO_ACTION &
               analysisAvailability.visibility == Visibility.VISIBLE)) &
            ((decisionFrame.selectedAction == SelectedAction.OFFER) implies
              (upstreamDisposition == UpstreamDisposition.NO_ACTION &
               analysisAvailability.visibility == Visibility.OFFERED)) &
            ((decisionFrame.selectedAction == SelectedAction.HOLD) implies
              (upstreamDisposition == UpstreamDisposition.NO_ACTION &
               analysisAvailability.visibility == Visibility.HIDDEN));
        guarantee
          // @trace COMP-01
          PUBLIC_FIELD_COHERENCE "Publication copies every owner-sourced reason, state, and effective-fault field":
            analysisAvailability.selectedReason == decisionFrame.selectedReason &
            analysisAvailability.recoveryState == decisionFrame.recoveryState &
            analysisAvailability.evidenceState == decisionFrame.evidenceState &
            analysisAvailability.artifactState == decisionFrame.artifactState &
            analysisAvailability.reviewState == decisionFrame.reviewState &
            analysisAvailability.faultPresent == decisionFrame.effectiveFaultPresent &
            analysisAvailability.dominantFault == decisionFrame.dominantFault &
            analysisAvailability.multipleFaults == decisionFrame.effectiveMultipleFaults;
        guarantee
          // @trace COMP-01
          TOTAL_PUBLIC_MODE "Public mode follows the approved total fault, recovery, artifact, closure, view, offer, stage, idle order":
            ((decisionFrame.effectiveFaultPresent == true) implies
              (analysisAvailability.publicMode == PublicMode.FAULT)) &
            ((decisionFrame.effectiveFaultPresent == false & decisionFrame.recoveryOpen == false) implies
              (analysisAvailability.publicMode == PublicMode.RECOVERY)) &
            ((decisionFrame.effectiveFaultPresent == false & decisionFrame.recoveryOpen == true &
              decisionFrame.artifactState == ArtifactState.QUARANTINED) implies
              (analysisAvailability.publicMode == PublicMode.QUARANTINED)) &
            ((decisionFrame.effectiveFaultPresent == false & decisionFrame.recoveryOpen == true &
              decisionFrame.artifactState != ArtifactState.QUARANTINED &
              decisionFrame.selectedAction == SelectedAction.CLOSE) implies
              (analysisAvailability.publicMode == PublicMode.CLOSED)) &
            ((decisionFrame.effectiveFaultPresent == false & decisionFrame.recoveryOpen == true &
              decisionFrame.artifactState != ArtifactState.QUARANTINED &
              decisionFrame.selectedAction != SelectedAction.CLOSE &
              ((decisionFrame.reviewState == ReviewState.VIEWING) |
               (decisionFrame.selectedAction == SelectedAction.OPEN))) implies
              (analysisAvailability.publicMode == PublicMode.VIEWING)) &
            ((decisionFrame.effectiveFaultPresent == false & decisionFrame.recoveryOpen == true &
              decisionFrame.artifactState != ArtifactState.QUARANTINED &
              decisionFrame.selectedAction != SelectedAction.CLOSE &
              decisionFrame.reviewState != ReviewState.VIEWING &
              decisionFrame.selectedAction != SelectedAction.OPEN &
              ((decisionFrame.reviewState == ReviewState.OFFERED) |
               (decisionFrame.selectedAction == SelectedAction.OFFER) |
               (decisionFrame.selectedAction == SelectedAction.ACCEPT))) implies
              (analysisAvailability.publicMode == PublicMode.OFFERED)) &
            ((decisionFrame.effectiveFaultPresent == false & decisionFrame.recoveryOpen == true &
              decisionFrame.artifactState == ArtifactState.STAGED &
              decisionFrame.selectedAction != SelectedAction.CLOSE &
              decisionFrame.reviewState != ReviewState.VIEWING &
              decisionFrame.selectedAction != SelectedAction.OPEN &
              decisionFrame.reviewState != ReviewState.OFFERED &
              decisionFrame.selectedAction != SelectedAction.OFFER &
              decisionFrame.selectedAction != SelectedAction.ACCEPT) implies
              (analysisAvailability.publicMode == PublicMode.STAGED)) &
            ((decisionFrame.effectiveFaultPresent == false & decisionFrame.recoveryOpen == true &
              decisionFrame.artifactState != ArtifactState.QUARANTINED &
              decisionFrame.artifactState != ArtifactState.STAGED &
              decisionFrame.selectedAction != SelectedAction.CLOSE &
              decisionFrame.reviewState != ReviewState.VIEWING &
              decisionFrame.selectedAction != SelectedAction.OPEN &
              decisionFrame.reviewState != ReviewState.OFFERED &
              decisionFrame.selectedAction != SelectedAction.OFFER &
              decisionFrame.selectedAction != SelectedAction.ACCEPT) implies
              (analysisAvailability.publicMode == PublicMode.IDLE));
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation.
  part def EITAvailabilityProcess :> Process {
    // @generated-support SUPPORT-01
    port imageSignal : DataPort { in :>> type : ImageSignal; }
    // @generated-support SUPPORT-01
    port doctorSignal : DataPort { in :>> type : DoctorSignal; }
    // @generated-support SUPPORT-01
    port preparationContext : DataPort { in :>> type : PreparationContext; }
    // @generated-support SUPPORT-01
    port availabilityService : DataPort { in :>> type : ServiceObservation; }
    // @generated-support SUPPORT-01
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    // @generated-support SUPPORT-01
    port upstreamDisposition : DataPort { out :>> type : UpstreamDisposition; }
    // @generated-support SUPPORT-01
    port analysisAvailability : DataPort { out :>> type : AvailabilityFrame; }

    // @trace PART-01
    part image_event_qualification : ImageEventQualification;
    // @trace PART-02
    part doctor_event_qualification : DoctorEventQualification;
    // @trace PART-03
    part preparation_context_assessment : PreparationContextAssessment;
    // @trace PART-04
    part availability_service_assessment : AvailabilityServiceAssessment;
    // @trace PART-05
    part fault_composition : FaultComposition;
    // @trace PART-06
    part recovery_control : RecoveryControl;
    // @trace PART-07
    part evidence_lifecycle : EvidenceLifecycle;
    // @trace PART-08
    part admission_decision : AdmissionDecisionOwner;
    // @trace PART-09
    part artifact_lifecycle : ArtifactLifecycle;
    // @trace PART-10
    part availability_decision : AvailabilityDecisionOwner;
    // @trace PART-11
    part review_lifecycle : ReviewLifecycle;
    // @trace PART-12
    part presentation_decision : PresentationDecisionOwner;
    // @trace PART-13
    part availability_arbitration : AvailabilityArbitration;
    // @trace PART-14
    part publication_composition : PublicationComposition;

    // Boundary support routes (uncredited).
    // @generated-support SUPPORT-01
    connection support01 : PortConnection connect imageSignal to image_event_qualification.imageSignal;
    // @generated-support SUPPORT-01
    connection support02 : PortConnection connect doctorSignal to doctor_event_qualification.doctorSignal;
    // @generated-support SUPPORT-01
    connection support03 : PortConnection connect preparationContext to preparation_context_assessment.preparationContext;
    // @generated-support SUPPORT-01
    connection support04 : PortConnection connect availabilityService to availability_service_assessment.availabilityService;
    // @generated-support SUPPORT-01
    connection support05 : PortConnection connect recoveryEvent to recovery_control.recoveryEvent;
    // @generated-support SUPPORT-01
    connection support06 : PortConnection connect publication_composition.upstreamDisposition to upstreamDisposition;
    // @generated-support SUPPORT-01
    connection support07 : PortConnection connect publication_composition.analysisAvailability to analysisAvailability;

    // Exactly 34 credited cross-usage semantic interactions.
    // @trace INT-01
    connection int01 : PortConnection connect image_event_qualification.imageFacts to fault_composition.imageFacts;
    // @trace INT-02
    connection int02 : PortConnection connect image_event_qualification.imageFacts to evidence_lifecycle.imageFacts;
    // @trace INT-03
    connection int03 : PortConnection connect image_event_qualification.imageFacts to admission_decision.imageFacts;
    // @trace INT-04
    connection int04 : PortConnection connect image_event_qualification.imageFacts to artifact_lifecycle.imageFacts;
    // @trace INT-05
    connection int05 : PortConnection connect doctor_event_qualification.reviewFacts to fault_composition.reviewFacts;
    // @trace INT-06
    connection int06 : PortConnection connect doctor_event_qualification.reviewFacts to review_lifecycle.reviewFacts;
    // @trace INT-07
    connection int07 : PortConnection connect preparation_context_assessment.contextFacts to fault_composition.contextFacts;
    // @trace INT-08
    connection int08 : PortConnection connect preparation_context_assessment.contextFacts to evidence_lifecycle.contextFacts;
    // @trace INT-09
    connection int09 : PortConnection connect preparation_context_assessment.contextFacts to admission_decision.contextFacts;
    // @trace INT-10
    connection int10 : PortConnection connect availability_service_assessment.serviceFacts to fault_composition.serviceFacts;
    // @trace INT-11
    connection int11 : PortConnection connect availability_service_assessment.serviceFacts to admission_decision.serviceFacts;
    // @trace INT-12
    connection int12 : PortConnection connect availability_service_assessment.serviceFacts to availability_decision.serviceFacts;
    // @trace INT-13
    connection int13 : PortConnection connect fault_composition.faultSummary to recovery_control.faultSummary;
    // @trace INT-14
    connection int14 : PortConnection connect recovery_control.recoveryFrame to evidence_lifecycle.recoveryFrame;
    // @trace INT-15
    connection int15 : PortConnection connect recovery_control.recoveryFrame to admission_decision.recoveryFrame;
    // @trace INT-16
    connection int16 : PortConnection connect recovery_control.recoveryFrame to artifact_lifecycle.recoveryFrame;
    // @trace INT-17
    connection int17 : PortConnection connect recovery_control.recoveryFrame to availability_decision.recoveryFrame;
    // @trace INT-18
    connection int18 : PortConnection connect recovery_control.recoveryFrame to review_lifecycle.recoveryFrame;
    // @trace INT-19
    connection int19 : PortConnection connect recovery_control.recoveryFrame to availability_arbitration.recoveryFrame;
    // @trace INT-20
    connection int20 : PortConnection connect evidence_lifecycle.evidenceFrame to admission_decision.evidenceFrame;
    // @trace INT-21
    connection int21 : PortConnection connect evidence_lifecycle.evidenceFrame to availability_decision.evidenceFrame;
    // @trace INT-22
    connection int22 : PortConnection connect admission_decision.admissionFrame to artifact_lifecycle.admissionFrame;
    // @trace INT-23
    connection int23 : PortConnection connect admission_decision.admissionFrame to availability_arbitration.admissionFrame;
    // @trace INT-24
    connection int24 : PortConnection connect artifact_lifecycle.artifactFrame to availability_decision.artifactFrame;
    // @trace INT-25
    connection int25 : PortConnection connect artifact_lifecycle.artifactFrame to availability_arbitration.artifactFrame;
    // @trace INT-26
    connection int26 : PortConnection connect availability_decision.availabilityFrame to review_lifecycle.availabilityFrame;
    // @trace INT-27
    connection int27 : PortConnection connect availability_decision.availabilityFrame to presentation_decision.availabilityFrame;
    // @trace INT-28
    connection int28 : PortConnection connect review_lifecycle.reviewFrame to presentation_decision.reviewFrame;
    // @trace INT-29
    connection int29 : PortConnection connect presentation_decision.presentationFrame to availability_arbitration.presentationFrame;
    // @trace INT-30
    connection int30 : PortConnection connect availability_arbitration.decisionFrame to publication_composition.decisionFrame;
    // @trace INT-31
    connection int31 : PortConnection connect evidence_lifecycle.evidenceFrame to availability_arbitration.evidenceFrame;
    // @trace INT-32
    connection int32 : PortConnection connect availability_decision.availabilityFrame to availability_arbitration.availabilityFrame;
    // @trace INT-33
    connection int33 : PortConnection connect review_lifecycle.reviewFrame to availability_arbitration.reviewFrame;
    // @trace INT-34
    connection int34 : PortConnection connect doctor_event_qualification.reviewFacts to artifact_lifecycle.reviewFacts;
  }

  // @trace BOUND-AUD-01
  part def EITImageAvailabilitySystem :> System {
    // @trace MON-IMG-01
    port imageSignal : DataPort { in :>> type : ImageSignal; }
    // @trace MON-DOC-01
    port doctorSignal : DataPort { in :>> type : DoctorSignal; }
    // @trace MON-CTX-01
    port preparationContext : DataPort { in :>> type : PreparationContext; }
    // @trace MON-SVC-01
    port availabilityService : DataPort { in :>> type : ServiceObservation; }
    // @trace MON-REC-01
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    // @trace CTRL-UP-01
    port upstreamDisposition : DataPort { out :>> type : UpstreamDisposition; }
    // @trace CTRL-DOC-01
    port analysisAvailability : DataPort { out :>> type : AvailabilityFrame; }

    // @generated-support SUPPORT-01 sole behavior-free Process usage.
    part coordination : EITAvailabilityProcess;
    // @generated-support SUPPORT-01 outer boundary delegation.
    connection boundary01 : PortConnection connect imageSignal to coordination.imageSignal;
    // @generated-support SUPPORT-01
    connection boundary02 : PortConnection connect doctorSignal to coordination.doctorSignal;
    // @generated-support SUPPORT-01
    connection boundary03 : PortConnection connect preparationContext to coordination.preparationContext;
    // @generated-support SUPPORT-01
    connection boundary04 : PortConnection connect availabilityService to coordination.availabilityService;
    // @generated-support SUPPORT-01
    connection boundary05 : PortConnection connect recoveryEvent to coordination.recoveryEvent;
    // @generated-support SUPPORT-01
    connection boundary06 : PortConnection connect coordination.upstreamDisposition to upstreamDisposition;
    // @generated-support SUPPORT-01
    connection boundary07 : PortConnection connect coordination.analysisAvailability to analysisAvailability;
  }

  // @trace BOUND-AUD-01
  part eit_image_availability_system : EITImageAvailabilitySystem;
}
