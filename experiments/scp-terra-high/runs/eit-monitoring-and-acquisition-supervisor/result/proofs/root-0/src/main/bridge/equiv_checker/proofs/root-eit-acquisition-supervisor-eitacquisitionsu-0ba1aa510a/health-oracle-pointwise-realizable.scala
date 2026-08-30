// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0ba1aa510a5e_Oracle_Pointwise_Realizable {
  @pure def check(
      doctor_signal: equiv_shared_0.EIT_Acquisition_Supervisor.DoctorSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST, requestFault = F))) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST, requestFault = T))) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.START_REQUEST, requestFault = F))) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.START_REQUEST, requestFault = T))) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.STOP_REQUEST, requestFault = F))) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.STOP_REQUEST, requestFault = T))) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.IMAGE_ACK, requestFault = F))) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_GumboX.compute_CEP_Post(doctor_signal, equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass = equiv_shared_0.EIT_Acquisition_Supervisor.RequestClass.IMAGE_ACK, requestFault = T))))))
  }
}
