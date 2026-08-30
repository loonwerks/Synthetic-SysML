// #Sireum

package scp_candidate.EIT_Acquisition_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner {

  var sessionMode: EIT_Acquisition_Coordinator.SessionMode.Type =
    EIT_Acquisition_Coordinator.SessionMode.SessionStopped
  var recoveryPhase: EIT_Acquisition_Coordinator.RecoveryPhase.Type =
    EIT_Acquisition_Coordinator.RecoveryPhase.Normal

  def initialise(api: MonitoringDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, sessionMode, recoveryPhase))
    sessionMode = EIT_Acquisition_Coordinator.SessionMode.SessionStopped
    recoveryPhase = EIT_Acquisition_Coordinator.RecoveryPhase.Normal
    api.put_acquisitionCommand(EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition)
    api.put_monitoringResolution(EIT_Acquisition_Coordinator.MonitoringResolution(
      EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
      EIT_Acquisition_Coordinator.RecoveryPhase.Normal,
      EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
      EIT_Acquisition_Coordinator.MonitoringDisposition.StoppedDisposition))
  }

  def timeTriggered(api: MonitoringDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api, sessionMode, recoveryPhase))
    (api.get_qualifiedRequest(), api.get_acquisitionEvidence()) match {
      case (Some(request), Some(evidence)) =>
        if (request == EIT_Acquisition_Coordinator.QualifiedRequest.InvalidRequest ||
            evidence == EIT_Acquisition_Coordinator.AcquisitionEvidence.InvalidAcquisitionEvidence) {
          publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
            EIT_Acquisition_Coordinator.RecoveryPhase.AwaitNeutral,
            EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
            EIT_Acquisition_Coordinator.MonitoringDisposition.InputFaultDisposition)
        } else if (recoveryPhase == EIT_Acquisition_Coordinator.RecoveryPhase.AwaitNeutral) {
          if (request == EIT_Acquisition_Coordinator.QualifiedRequest.NoQualifiedRequest) {
            publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
              EIT_Acquisition_Coordinator.RecoveryPhase.AwaitFreshRequest,
              EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
              EIT_Acquisition_Coordinator.MonitoringDisposition.RecoveryDisposition)
          } else {
            publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
              EIT_Acquisition_Coordinator.RecoveryPhase.AwaitNeutral,
              EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
              EIT_Acquisition_Coordinator.MonitoringDisposition.RecoveryDisposition)
          }
        } else if (recoveryPhase == EIT_Acquisition_Coordinator.RecoveryPhase.AwaitFreshRequest &&
                   request == EIT_Acquisition_Coordinator.QualifiedRequest.NoQualifiedRequest) {
          publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
            EIT_Acquisition_Coordinator.RecoveryPhase.AwaitFreshRequest,
            EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
            EIT_Acquisition_Coordinator.MonitoringDisposition.RecoveryDisposition)
        } else if (request == EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStop) {
          publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
            EIT_Acquisition_Coordinator.RecoveryPhase.Normal,
            EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
            EIT_Acquisition_Coordinator.MonitoringDisposition.StopAccepted)
        } else if (request == EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStart &&
                   evidence != EIT_Acquisition_Coordinator.AcquisitionEvidence.CalibrationAbsent) {
          publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionMonitoring,
            EIT_Acquisition_Coordinator.RecoveryPhase.Normal,
            EIT_Acquisition_Coordinator.AcquisitionCommand.CollectImpedance,
            EIT_Acquisition_Coordinator.MonitoringDisposition.StartAccepted)
        } else if (request == EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStart) {
          publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
            EIT_Acquisition_Coordinator.RecoveryPhase.Normal,
            EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
            EIT_Acquisition_Coordinator.MonitoringDisposition.StartDenied)
        } else if (sessionMode == EIT_Acquisition_Coordinator.SessionMode.SessionMonitoring &&
                   evidence != EIT_Acquisition_Coordinator.AcquisitionEvidence.CalibrationAbsent) {
          publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionMonitoring,
            EIT_Acquisition_Coordinator.RecoveryPhase.Normal,
            EIT_Acquisition_Coordinator.AcquisitionCommand.CollectImpedance,
            EIT_Acquisition_Coordinator.MonitoringDisposition.MonitoringContinued)
        } else {
          publish(api, EIT_Acquisition_Coordinator.SessionMode.SessionStopped,
            EIT_Acquisition_Coordinator.RecoveryPhase.Normal,
            EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition,
            EIT_Acquisition_Coordinator.MonitoringDisposition.StoppedDisposition)
        }
    }
  }

  def publish(api: MonitoringDecisionOwner_Operational_Api,
              nextSessionMode: EIT_Acquisition_Coordinator.SessionMode.Type,
              nextRecoveryPhase: EIT_Acquisition_Coordinator.RecoveryPhase.Type,
              command: EIT_Acquisition_Coordinator.AcquisitionCommand.Type,
              disposition: EIT_Acquisition_Coordinator.MonitoringDisposition.Type): Unit = {
    Contract(Modifies(api, sessionMode, recoveryPhase))
    sessionMode = nextSessionMode
    recoveryPhase = nextRecoveryPhase
    api.put_acquisitionCommand(command)
    api.put_monitoringResolution(EIT_Acquisition_Coordinator.MonitoringResolution(
      nextSessionMode, nextRecoveryPhase, command, disposition))
  }

  def finalise(api: MonitoringDecisionOwner_Operational_Api): Unit = { }
}
