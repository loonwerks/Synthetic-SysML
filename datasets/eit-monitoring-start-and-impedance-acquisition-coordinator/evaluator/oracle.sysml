package EIT_Acquisition_Coordinator {
  private import HAMR::*;

  // @trace MON-01
  enum def MonitoringRequest { enum NoRequest; enum StartMonitoring; enum StopMonitoring; }
  // @trace MON-01
  enum def InputStatus { enum Valid; enum Invalid; }
  // @trace MON-02
  enum def CalibrationState { enum NotCurrent; enum Current; }
  // @trace MON-03
  enum def ImpedanceToken { enum NoToken; enum TokenOne; enum TokenTwo; }
  // @trace PART-01
  enum def QualifiedRequest {
    enum InvalidRequest; enum NoQualifiedRequest; enum QualifiedStart; enum QualifiedStop;
  }
  // @trace PART-02
  enum def AcquisitionEvidence {
    enum InvalidAcquisitionEvidence; enum CalibrationAbsent; enum ReadyNoToken;
    enum ReadyTokenOne; enum ReadyTokenTwo;
  }
  // @trace STATE-01
  enum def SessionMode { enum SessionStopped; enum SessionMonitoring; }
  // @trace STATE-01
  enum def RecoveryPhase { enum Normal; enum AwaitNeutral; enum AwaitFreshRequest; }
  // @trace CTRL-01
  enum def AcquisitionCommand { enum HoldAcquisition; enum CollectImpedance; }
  // @trace PART-03
  enum def MonitoringDisposition {
    enum InputFaultDisposition; enum RecoveryDisposition; enum StopAccepted;
    enum StartAccepted; enum StartDenied; enum MonitoringContinued; enum StoppedDisposition;
  }
  // @trace CTRL-02
  enum def ImpedanceDelivery {
    enum Withheld; enum NoTokenAvailable; enum DeliverTokenOne; enum DeliverTokenTwo;
  }
  // @trace CTRL-03
  enum def MonitoringStatus {
    enum Stopped; enum Monitoring; enum CalibrationRequired; enum InputFault; enum RecoveryPending;
  }

  // Every GUMBO-inspected record field is an attribute, not a nested part.
  // @trace MON-01
  part def MonitoringRequestSample :> Data {
    // @trace MON-01
    attribute request : MonitoringRequest;
    // @trace MON-01
    attribute status : InputStatus;
  }
  // @trace MON-02
  part def CalibrationSample :> Data {
    // @trace MON-02
    attribute calibration : CalibrationState;
    // @trace MON-02
    attribute status : InputStatus;
  }
  // @trace MON-03
  part def ImpedanceSample :> Data {
    // @trace MON-03
    attribute token : ImpedanceToken;
    // @trace MON-03
    attribute status : InputStatus;
  }
  // @trace PART-03
  part def MonitoringResolution :> Data {
    // @trace STATE-01
    attribute nextSessionMode : SessionMode;
    // @trace STATE-01
    attribute nextRecoveryPhase : RecoveryPhase;
    // @trace COMMAND-01
    attribute acquisitionCommand : AcquisitionCommand;
    // @trace PART-03
    attribute disposition : MonitoringDisposition;
  }

  // @trace PART-01
  part def RequestQualification :> Thread {
    // @trace INT-01
    port requestSample : DataPort { in :>> type : MonitoringRequestSample; }
    // @trace INT-04
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace QUAL-REQ-01
          case QUAL_REQ_Invalid "QUAL-REQ-01 invalid status collapses every request value" :
            assume requestSample.status == InputStatus.Invalid;
            guarantee qualifiedRequest == QualifiedRequest.InvalidRequest;
          // @trace QUAL-REQ-01
          case QUAL_REQ_None "QUAL-REQ-01 valid neutral request" :
            assume requestSample.status == InputStatus.Valid &
              requestSample.request == MonitoringRequest.NoRequest;
            guarantee qualifiedRequest == QualifiedRequest.NoQualifiedRequest;
          // @trace QUAL-REQ-01
          case QUAL_REQ_Start "QUAL-REQ-01 valid start request" :
            assume requestSample.status == InputStatus.Valid &
              requestSample.request == MonitoringRequest.StartMonitoring;
            guarantee qualifiedRequest == QualifiedRequest.QualifiedStart;
          // @trace QUAL-REQ-01
          case QUAL_REQ_Stop "QUAL-REQ-01 valid stop request" :
            assume requestSample.status == InputStatus.Valid &
              requestSample.request == MonitoringRequest.StopMonitoring;
            guarantee qualifiedRequest == QualifiedRequest.QualifiedStop;
    }*/
  }

  // @trace PART-02
  part def AcquisitionEvidenceQualification :> Thread {
    // @trace INT-02
    port calibrationSample : DataPort { in :>> type : CalibrationSample; }
    // @trace INT-03
    port impedanceSample : DataPort { in :>> type : ImpedanceSample; }
    // @trace INT-05
    port acquisitionEvidence : DataPort { out :>> type : AcquisitionEvidence; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace QUAL-EVID-01
          case QUAL_EVID_Invalid "QUAL-EVID-01 either invalid status dominates" :
            assume calibrationSample.status == InputStatus.Invalid |
              impedanceSample.status == InputStatus.Invalid;
            guarantee acquisitionEvidence == AcquisitionEvidence.InvalidAcquisitionEvidence;
          // @trace QUAL-EVID-01
          case QUAL_EVID_NotCurrent "QUAL-EVID-01 valid noncurrent calibration collapses token values" :
            assume calibrationSample.status == InputStatus.Valid &
              impedanceSample.status == InputStatus.Valid &
              calibrationSample.calibration == CalibrationState.NotCurrent;
            guarantee acquisitionEvidence == AcquisitionEvidence.CalibrationAbsent;
          // @trace QUAL-EVID-01
          case QUAL_EVID_NoToken "QUAL-EVID-01 current calibration with no token" :
            assume calibrationSample.status == InputStatus.Valid &
              impedanceSample.status == InputStatus.Valid &
              calibrationSample.calibration == CalibrationState.Current &
              impedanceSample.token == ImpedanceToken.NoToken;
            guarantee acquisitionEvidence == AcquisitionEvidence.ReadyNoToken;
          // @trace QUAL-EVID-01
          case QUAL_EVID_TokenOne "QUAL-EVID-01 current calibration with token one" :
            assume calibrationSample.status == InputStatus.Valid &
              impedanceSample.status == InputStatus.Valid &
              calibrationSample.calibration == CalibrationState.Current &
              impedanceSample.token == ImpedanceToken.TokenOne;
            guarantee acquisitionEvidence == AcquisitionEvidence.ReadyTokenOne;
          // @trace QUAL-EVID-01
          case QUAL_EVID_TokenTwo "QUAL-EVID-01 current calibration with token two" :
            assume calibrationSample.status == InputStatus.Valid &
              impedanceSample.status == InputStatus.Valid &
              calibrationSample.calibration == CalibrationState.Current &
              impedanceSample.token == ImpedanceToken.TokenTwo;
            guarantee acquisitionEvidence == AcquisitionEvidence.ReadyTokenTwo;
    }*/
  }

  // @trace PART-03
  part def MonitoringDecisionOwner :> Thread {
    // @trace INT-04
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    // @trace INT-05
    port acquisitionEvidence : DataPort { in :>> type : AcquisitionEvidence; }
    // @trace INT-06
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    // @trace INT-07
    port monitoringResolution : DataPort { out :>> type : MonitoringResolution; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        sessionMode: SessionMode;
        // @trace STATE-01
        recoveryPhase: RecoveryPhase;

      initialize
        // @trace INIT-01
        guarantee initSessionMode "INIT-01 owner session starts stopped" :
          sessionMode == SessionMode.SessionStopped;
        // @trace INIT-01
        guarantee initRecoveryPhase "INIT-01 owner recovery starts normal" :
          recoveryPhase == RecoveryPhase.Normal;
        // @trace INIT-01
        guarantee initCommand "INIT-01 controlled command starts held" :
          acquisitionCommand == AcquisitionCommand.HoldAcquisition;
        // @trace INIT-01
        guarantee initResolution "INIT-01 safe initial committed resolution" :
          monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
          monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
          monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
          monitoringResolution.disposition == MonitoringDisposition.StoppedDisposition;

      compute
        // @trace OUTPUT-01
        guarantee commitSessionMode "OUTPUT-01 state commits the resolution session field" :
          sessionMode == monitoringResolution.nextSessionMode;
        // @trace OUTPUT-01
        guarantee commitRecoveryPhase "OUTPUT-01 state commits the resolution recovery field" :
          recoveryPhase == monitoringResolution.nextRecoveryPhase;
        // @trace COMMAND-01
        guarantee publishCommittedCommand "COMMAND-01 root command is the committed command field" :
          acquisitionCommand == monitoringResolution.acquisitionCommand;
        // @trace INVAR-01
        guarantee safeRecoveryInvariant "INVAR-01 every nonnormal recovery state is stopped" :
          recoveryPhase != RecoveryPhase.Normal implies sessionMode == SessionMode.SessionStopped;

        compute_cases
          // @trace CASE-01
          case CASE_01 "CASE-01 any invalid qualified input enters safe recovery" :
            assume qualifiedRequest == QualifiedRequest.InvalidRequest |
              acquisitionEvidence == AcquisitionEvidence.InvalidAcquisitionEvidence;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.AwaitNeutral &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.InputFaultDisposition;

          // @trace CASE-02
          case CASE_02 "CASE-02 valid retained nonneutral request remains blocked" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.AwaitNeutral &
              qualifiedRequest != QualifiedRequest.NoQualifiedRequest;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.AwaitNeutral &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.RecoveryDisposition;

          // @trace CASE-03
          case CASE_03 "CASE-03 valid neutral request advances recovery" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.AwaitNeutral &
              qualifiedRequest == QualifiedRequest.NoQualifiedRequest;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.AwaitFreshRequest &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.RecoveryDisposition;

          // @trace CASE-04
          case CASE_04 "CASE-04 repeated neutral request waits for a fresh request" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.AwaitFreshRequest &
              qualifiedRequest == QualifiedRequest.NoQualifiedRequest;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.AwaitFreshRequest &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.RecoveryDisposition;

          // @trace CASE-05
          case CASE_05 "CASE-05 fresh stop completes recovery without acquisition" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.AwaitFreshRequest &
              qualifiedRequest == QualifiedRequest.QualifiedStop;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.StopAccepted;

          // @trace CASE-06
          case CASE_06 "CASE-06 calibrated fresh start completes recovery and starts monitoring" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.AwaitFreshRequest &
              qualifiedRequest == QualifiedRequest.QualifiedStart &
              acquisitionEvidence != AcquisitionEvidence.CalibrationAbsent;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionMonitoring &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance &
              monitoringResolution.disposition == MonitoringDisposition.StartAccepted;

          // @trace CASE-07
          case CASE_07 "CASE-07 uncalibrated fresh start completes recovery but is denied" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.AwaitFreshRequest &
              qualifiedRequest == QualifiedRequest.QualifiedStart &
              acquisitionEvidence == AcquisitionEvidence.CalibrationAbsent;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.StartDenied;

          // @trace CASE-08
          case CASE_08 "CASE-08 normal valid stop is accepted" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.Normal &
              qualifiedRequest == QualifiedRequest.QualifiedStop;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.StopAccepted;

          // @trace CASE-09
          case CASE_09 "CASE-09 calibrated normal start is accepted" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.Normal &
              qualifiedRequest == QualifiedRequest.QualifiedStart &
              acquisitionEvidence != AcquisitionEvidence.CalibrationAbsent;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionMonitoring &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance &
              monitoringResolution.disposition == MonitoringDisposition.StartAccepted;

          // @trace CASE-10
          case CASE_10 "CASE-10 uncalibrated normal start is denied" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.Normal &
              qualifiedRequest == QualifiedRequest.QualifiedStart &
              acquisitionEvidence == AcquisitionEvidence.CalibrationAbsent;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.StartDenied;

          // @trace CASE-11
          case CASE_11 "CASE-11 active neutral monitoring continues with ready evidence" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.Normal &
              qualifiedRequest == QualifiedRequest.NoQualifiedRequest &
              In(sessionMode) == SessionMode.SessionMonitoring &
              acquisitionEvidence != AcquisitionEvidence.CalibrationAbsent;
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionMonitoring &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance &
              monitoringResolution.disposition == MonitoringDisposition.MonitoringContinued;

          // @trace CASE-12
          case CASE_12 "CASE-12 remaining valid neutral combinations are stopped" :
            assume qualifiedRequest != QualifiedRequest.InvalidRequest &
              acquisitionEvidence != AcquisitionEvidence.InvalidAcquisitionEvidence &
              In(recoveryPhase) == RecoveryPhase.Normal &
              qualifiedRequest == QualifiedRequest.NoQualifiedRequest &
              (In(sessionMode) == SessionMode.SessionStopped |
                acquisitionEvidence == AcquisitionEvidence.CalibrationAbsent);
            guarantee monitoringResolution.nextSessionMode == SessionMode.SessionStopped &
              monitoringResolution.nextRecoveryPhase == RecoveryPhase.Normal &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition &
              monitoringResolution.disposition == MonitoringDisposition.StoppedDisposition;
    }*/
  }

  // @trace PART-04
  part def ImpedanceDeliveryDerivation :> Thread {
    // @trace INT-07
    port monitoringResolution : DataPort { in :>> type : MonitoringResolution; }
    // @trace INT-08
    port acquisitionEvidence : DataPort { in :>> type : AcquisitionEvidence; }
    // @trace INT-09
    port impedanceDelivery : DataPort { out :>> type : ImpedanceDelivery; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee initDelivery "INIT-01 token delivery starts withheld" :
          impedanceDelivery == ImpedanceDelivery.Withheld;
      compute
        compute_cases
          // @trace DELIVERY-01
          case DELIVERY_Hold "DELIVERY-01 held command withholds every evidence value" :
            assume monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition;
            guarantee impedanceDelivery == ImpedanceDelivery.Withheld;
          // @trace DELIVERY-01
          case DELIVERY_Anomalous "DELIVERY-01 anomalous collect pairing fails closed" :
            assume monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance &
              (acquisitionEvidence == AcquisitionEvidence.InvalidAcquisitionEvidence |
                acquisitionEvidence == AcquisitionEvidence.CalibrationAbsent);
            guarantee impedanceDelivery == ImpedanceDelivery.Withheld;
          // @trace DELIVERY-01
          case DELIVERY_None "DELIVERY-01 admitted collection with no token reports availability boundary" :
            assume monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance &
              acquisitionEvidence == AcquisitionEvidence.ReadyNoToken;
            guarantee impedanceDelivery == ImpedanceDelivery.NoTokenAvailable;
          // @trace DELIVERY-01
          case DELIVERY_One "DELIVERY-01 admitted token one remains distinct" :
            assume monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance &
              acquisitionEvidence == AcquisitionEvidence.ReadyTokenOne;
            guarantee impedanceDelivery == ImpedanceDelivery.DeliverTokenOne;
          // @trace DELIVERY-01
          case DELIVERY_Two "DELIVERY-01 admitted token two remains distinct" :
            assume monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance &
              acquisitionEvidence == AcquisitionEvidence.ReadyTokenTwo;
            guarantee impedanceDelivery == ImpedanceDelivery.DeliverTokenTwo;
    }*/
  }

  // @trace PART-05
  part def DoctorStatusDerivation :> Thread {
    // @trace INT-10
    port monitoringResolution : DataPort { in :>> type : MonitoringResolution; }
    // @trace INT-11
    port acquisitionEvidence : DataPort { in :>> type : AcquisitionEvidence; }
    // @trace INT-12
    port monitoringStatus : DataPort { out :>> type : MonitoringStatus; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee initStatus "INIT-01 Doctor status starts stopped" :
          monitoringStatus == MonitoringStatus.Stopped;
      compute
        compute_cases
          // @trace STATUS-01
          case STATUS_Fault "STATUS-01 input-fault disposition has highest priority" :
            assume monitoringResolution.disposition == MonitoringDisposition.InputFaultDisposition;
            guarantee monitoringStatus == MonitoringStatus.InputFault;
          // @trace STATUS-01
          case STATUS_Recovery "STATUS-01 recovery disposition follows fault priority" :
            assume monitoringResolution.disposition != MonitoringDisposition.InputFaultDisposition &
              monitoringResolution.disposition == MonitoringDisposition.RecoveryDisposition;
            guarantee monitoringStatus == MonitoringStatus.RecoveryPending;
          // @trace STATUS-01
          case STATUS_Calibration "STATUS-01 denied start or stopped absent calibration requests calibration" :
            assume monitoringResolution.disposition != MonitoringDisposition.InputFaultDisposition &
              monitoringResolution.disposition != MonitoringDisposition.RecoveryDisposition &
              (monitoringResolution.disposition == MonitoringDisposition.StartDenied |
                (monitoringResolution.disposition == MonitoringDisposition.StoppedDisposition &
                  acquisitionEvidence == AcquisitionEvidence.CalibrationAbsent));
            guarantee monitoringStatus == MonitoringStatus.CalibrationRequired;
          // @trace STATUS-01
          case STATUS_Monitoring "STATUS-01 lower-priority collect command reports monitoring" :
            assume monitoringResolution.disposition != MonitoringDisposition.InputFaultDisposition &
              monitoringResolution.disposition != MonitoringDisposition.RecoveryDisposition &
              monitoringResolution.disposition != MonitoringDisposition.StartDenied &
              (monitoringResolution.disposition != MonitoringDisposition.StoppedDisposition |
                acquisitionEvidence != AcquisitionEvidence.CalibrationAbsent) &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.CollectImpedance;
            guarantee monitoringStatus == MonitoringStatus.Monitoring;
          // @trace STATUS-01
          case STATUS_Stopped "STATUS-01 every remaining producer value reports stopped" :
            assume monitoringResolution.disposition != MonitoringDisposition.InputFaultDisposition &
              monitoringResolution.disposition != MonitoringDisposition.RecoveryDisposition &
              monitoringResolution.disposition != MonitoringDisposition.StartDenied &
              (monitoringResolution.disposition != MonitoringDisposition.StoppedDisposition |
                acquisitionEvidence != AcquisitionEvidence.CalibrationAbsent) &
              monitoringResolution.acquisitionCommand == AcquisitionCommand.HoldAcquisition;
            guarantee monitoringStatus == MonitoringStatus.Stopped;
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation only
  part def EITAcquisitionCoordinationProcess :> Process {
    // @trace PART-01
    part requestQualification : RequestQualification;
    // @trace PART-02
    part acquisitionEvidenceQualification : AcquisitionEvidenceQualification;
    // @trace PART-03
    part monitoringDecisionOwner : MonitoringDecisionOwner;
    // @trace PART-04
    part impedanceDeliveryDerivation : ImpedanceDeliveryDerivation;
    // @trace PART-05
    part doctorStatusDerivation : DoctorStatusDerivation;

    // @generated-support INT-01 inbound Process boundary port
    port monitoringRequest : DataPort { in :>> type : MonitoringRequestSample; }
    // @generated-support INT-02 inbound Process boundary port
    port calibrationEvidence : DataPort { in :>> type : CalibrationSample; }
    // @generated-support INT-03 inbound Process boundary port
    port impedanceObservation : DataPort { in :>> type : ImpedanceSample; }
    // @generated-support INT-06 outbound Process boundary port
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    // @generated-support INT-09 outbound Process boundary port
    port impedanceDelivery : DataPort { out :>> type : ImpedanceDelivery; }
    // @generated-support INT-12 outbound Process boundary port
    port monitoringStatus : DataPort { out :>> type : MonitoringStatus; }

    // @generated-support INT-01 Process-to-Thread delegation
    connection supportRequestToQualifier : PortConnection connect monitoringRequest to requestQualification.requestSample;
    // @generated-support INT-02 Process-to-Thread delegation
    connection supportCalibrationToQualifier : PortConnection connect calibrationEvidence to acquisitionEvidenceQualification.calibrationSample;
    // @generated-support INT-03 Process-to-Thread delegation
    connection supportImpedanceToQualifier : PortConnection connect impedanceObservation to acquisitionEvidenceQualification.impedanceSample;
    // @trace INT-04
    connection qualifiedRequestToDecision : PortConnection connect requestQualification.qualifiedRequest to monitoringDecisionOwner.qualifiedRequest;
    // @trace INT-05
    connection acquisitionEvidenceToDecision : PortConnection connect acquisitionEvidenceQualification.acquisitionEvidence to monitoringDecisionOwner.acquisitionEvidence;
    // @generated-support INT-06 Thread-to-Process delegation
    connection supportCommandToProcess : PortConnection connect monitoringDecisionOwner.acquisitionCommand to acquisitionCommand;
    // @trace INT-07
    connection resolutionToDelivery : PortConnection connect monitoringDecisionOwner.monitoringResolution to impedanceDeliveryDerivation.monitoringResolution;
    // @trace INT-08
    connection evidenceToDelivery : PortConnection connect acquisitionEvidenceQualification.acquisitionEvidence to impedanceDeliveryDerivation.acquisitionEvidence;
    // @generated-support INT-09 Thread-to-Process delegation
    connection supportDeliveryToProcess : PortConnection connect impedanceDeliveryDerivation.impedanceDelivery to impedanceDelivery;
    // @trace INT-10
    connection resolutionToStatus : PortConnection connect monitoringDecisionOwner.monitoringResolution to doctorStatusDerivation.monitoringResolution;
    // @trace INT-11
    connection evidenceToStatus : PortConnection connect acquisitionEvidenceQualification.acquisitionEvidence to doctorStatusDerivation.acquisitionEvidence;
    // @generated-support INT-12 Thread-to-Process delegation
    connection supportStatusToProcess : PortConnection connect doctorStatusDerivation.monitoringStatus to monitoringStatus;
  }

  // @trace BOUND-01
  part def EITMonitoringAcquisitionCoordinatorSystem :> System {
    // @generated-support SUPPORT-01 sole behavior-free Process usage
    part coordinationProcess : EITAcquisitionCoordinationProcess;
    // @trace MON-01
    port monitoringRequest : DataPort { in :>> type : MonitoringRequestSample; }
    // @trace MON-02
    port calibrationEvidence : DataPort { in :>> type : CalibrationSample; }
    // @trace MON-03
    port impedanceObservation : DataPort { in :>> type : ImpedanceSample; }
    // @trace CTRL-01
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    // @trace CTRL-02
    port impedanceDelivery : DataPort { out :>> type : ImpedanceDelivery; }
    // @trace CTRL-03
    port monitoringStatus : DataPort { out :>> type : MonitoringStatus; }

    // @generated-support INT-01 System-to-Process delegation
    connection supportBoundaryRequest : PortConnection connect monitoringRequest to coordinationProcess.monitoringRequest;
    // @generated-support INT-02 System-to-Process delegation
    connection supportBoundaryCalibration : PortConnection connect calibrationEvidence to coordinationProcess.calibrationEvidence;
    // @generated-support INT-03 System-to-Process delegation
    connection supportBoundaryImpedance : PortConnection connect impedanceObservation to coordinationProcess.impedanceObservation;
    // @generated-support INT-06 Process-to-System delegation
    connection supportBoundaryCommand : PortConnection connect coordinationProcess.acquisitionCommand to acquisitionCommand;
    // @generated-support INT-09 Process-to-System delegation
    connection supportBoundaryDelivery : PortConnection connect coordinationProcess.impedanceDelivery to impedanceDelivery;
    // @generated-support INT-12 Process-to-System delegation
    connection supportBoundaryStatus : PortConnection connect coordinationProcess.monitoringStatus to monitoringStatus;
  }

  // @trace BOUND-01
  part eitMonitoringAcquisitionCoordinator : EITMonitoringAcquisitionCoordinatorSystem;
}
