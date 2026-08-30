// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DoctorRequestQualification_acquisition_process_doctor_request_qualification {

  def initialise(api: DoctorRequestQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_request_facts(EIT_Acquisition_Supervisor.RequestFactsRecord(EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST, F))
  }

  def timeTriggered(api: DoctorRequestQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val signal: EIT_Acquisition_Supervisor.DoctorSignal.Type = api.get_doctor_signal().get
    var facts: EIT_Acquisition_Supervisor.RequestFactsRecord =
      EIT_Acquisition_Supervisor.RequestFactsRecord(EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST, F)
    if (signal == EIT_Acquisition_Supervisor.DoctorSignal.START) {
      facts = EIT_Acquisition_Supervisor.RequestFactsRecord(EIT_Acquisition_Supervisor.RequestClass.START_REQUEST, F)
    } else if (signal == EIT_Acquisition_Supervisor.DoctorSignal.STOP) {
      facts = EIT_Acquisition_Supervisor.RequestFactsRecord(EIT_Acquisition_Supervisor.RequestClass.STOP_REQUEST, F)
    } else if (signal == EIT_Acquisition_Supervisor.DoctorSignal.ACK_IMAGE) {
      facts = EIT_Acquisition_Supervisor.RequestFactsRecord(EIT_Acquisition_Supervisor.RequestClass.IMAGE_ACK, F)
    } else if (signal == EIT_Acquisition_Supervisor.DoctorSignal.INVALID_INTENT ||
      signal == EIT_Acquisition_Supervisor.DoctorSignal.INVALID_STATUS) {
      facts = EIT_Acquisition_Supervisor.RequestFactsRecord(EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST, T)
    }
    api.put_request_facts(facts)
  }

  def finalise(api: DoctorRequestQualification_Operational_Api): Unit = { }
}
