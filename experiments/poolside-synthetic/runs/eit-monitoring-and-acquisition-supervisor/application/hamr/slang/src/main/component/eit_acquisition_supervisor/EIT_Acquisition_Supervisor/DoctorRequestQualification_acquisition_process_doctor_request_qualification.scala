// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DoctorRequestQualification_acquisition_process_doctor_request_qualification {

  def initialise(api: DoctorRequestQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_request_facts(
      EIT_Acquisition_Supervisor.RequestFactsRecord(
        requestClass = EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST,
        requestFault = F))
  }

  def timeTriggered(api: DoctorRequestQualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val doctor_signal: EIT_Acquisition_Supervisor.DoctorSignal.Type =
      api.get_doctor_signal() match {
        case Some(v: EIT_Acquisition_Supervisor.DoctorSignal.Type) => v
        case _ => EIT_Acquisition_Supervisor.DoctorSignal.NONE
      }

    val requestFacts: EIT_Acquisition_Supervisor.RequestFactsRecord = doctor_signal match {
      case EIT_Acquisition_Supervisor.DoctorSignal.NONE =>
        EIT_Acquisition_Supervisor.RequestFactsRecord(
          requestClass = EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST,
          requestFault = F)
      case EIT_Acquisition_Supervisor.DoctorSignal.START =>
        EIT_Acquisition_Supervisor.RequestFactsRecord(
          requestClass = EIT_Acquisition_Supervisor.RequestClass.START_REQUEST,
          requestFault = F)
      case EIT_Acquisition_Supervisor.DoctorSignal.STOP =>
        EIT_Acquisition_Supervisor.RequestFactsRecord(
          requestClass = EIT_Acquisition_Supervisor.RequestClass.STOP_REQUEST,
          requestFault = F)
      case EIT_Acquisition_Supervisor.DoctorSignal.ACK_IMAGE =>
        EIT_Acquisition_Supervisor.RequestFactsRecord(
          requestClass = EIT_Acquisition_Supervisor.RequestClass.IMAGE_ACK,
          requestFault = F)
      case EIT_Acquisition_Supervisor.DoctorSignal.INVALID_INTENT =>
        EIT_Acquisition_Supervisor.RequestFactsRecord(
          requestClass = EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST,
          requestFault = T)
      case EIT_Acquisition_Supervisor.DoctorSignal.INVALID_STATUS =>
        EIT_Acquisition_Supervisor.RequestFactsRecord(
          requestClass = EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST,
          requestFault = T)
    }

    api.put_request_facts(requestFacts)
  }

  def finalise(api: DoctorRequestQualification_Operational_Api): Unit = { }
}
