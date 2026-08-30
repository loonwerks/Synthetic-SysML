// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_8312690513ff_Oracle_Pointwise_Realizable {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringStatus.Stopped)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringStatus.Monitoring)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringStatus.CalibrationRequired)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringStatus.InputFault)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringStatus.RecoveryPending)))))
  }
}
