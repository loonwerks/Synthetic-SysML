// #Sireum

package scp_candidate.EIT_Acquisition_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation {

  def initialise(api: DoctorStatusDerivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_monitoringStatus(EIT_Acquisition_Coordinator.MonitoringStatus.Stopped)
  }

  def timeTriggered(api: DoctorStatusDerivation_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_monitoringResolution(), api.get_acquisitionEvidence()) match {
      case (Some(resolution), Some(evidence)) =>
        if (resolution.disposition == EIT_Acquisition_Coordinator.MonitoringDisposition.InputFaultDisposition) {
          api.put_monitoringStatus(EIT_Acquisition_Coordinator.MonitoringStatus.InputFault)
        } else if (resolution.disposition == EIT_Acquisition_Coordinator.MonitoringDisposition.RecoveryDisposition) {
          api.put_monitoringStatus(EIT_Acquisition_Coordinator.MonitoringStatus.RecoveryPending)
        } else if (resolution.disposition == EIT_Acquisition_Coordinator.MonitoringDisposition.StartDenied ||
                   (resolution.disposition == EIT_Acquisition_Coordinator.MonitoringDisposition.StoppedDisposition &&
                    evidence == EIT_Acquisition_Coordinator.AcquisitionEvidence.CalibrationAbsent)) {
          api.put_monitoringStatus(EIT_Acquisition_Coordinator.MonitoringStatus.CalibrationRequired)
        } else if (resolution.acquisitionCommand == EIT_Acquisition_Coordinator.AcquisitionCommand.CollectImpedance) {
          api.put_monitoringStatus(EIT_Acquisition_Coordinator.MonitoringStatus.Monitoring)
        } else {
          api.put_monitoringStatus(EIT_Acquisition_Coordinator.MonitoringStatus.Stopped)
        }
    }
  }

  def finalise(api: DoctorStatusDerivation_Operational_Api): Unit = { }
}
