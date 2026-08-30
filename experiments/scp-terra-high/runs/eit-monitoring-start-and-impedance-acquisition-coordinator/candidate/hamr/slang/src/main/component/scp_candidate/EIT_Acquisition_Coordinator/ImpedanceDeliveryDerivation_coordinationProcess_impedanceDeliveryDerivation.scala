// #Sireum

package scp_candidate.EIT_Acquisition_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation {

  def initialise(api: ImpedanceDeliveryDerivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_impedanceDelivery(EIT_Acquisition_Coordinator.ImpedanceDelivery.Withheld)
  }

  def timeTriggered(api: ImpedanceDeliveryDerivation_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_monitoringResolution(), api.get_acquisitionEvidence()) match {
      case (Some(resolution), Some(evidence)) =>
        if (resolution.acquisitionCommand == EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition ||
            evidence == EIT_Acquisition_Coordinator.AcquisitionEvidence.InvalidAcquisitionEvidence ||
            evidence == EIT_Acquisition_Coordinator.AcquisitionEvidence.CalibrationAbsent) {
          api.put_impedanceDelivery(EIT_Acquisition_Coordinator.ImpedanceDelivery.Withheld)
        } else if (evidence == EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyNoToken) {
          api.put_impedanceDelivery(EIT_Acquisition_Coordinator.ImpedanceDelivery.NoTokenAvailable)
        } else if (evidence == EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyTokenOne) {
          api.put_impedanceDelivery(EIT_Acquisition_Coordinator.ImpedanceDelivery.DeliverTokenOne)
        } else {
          api.put_impedanceDelivery(EIT_Acquisition_Coordinator.ImpedanceDelivery.DeliverTokenTwo)
        }
    }
  }

  def finalise(api: ImpedanceDeliveryDerivation_Operational_Api): Unit = { }
}
