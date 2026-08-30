// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_6cbb5fb3e2cf_Oracle_Pointwise_Realizable {
  @pure def check(
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommand.DO_NOT_COLLECT)) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommand.COLLECT)))))
  }
}
