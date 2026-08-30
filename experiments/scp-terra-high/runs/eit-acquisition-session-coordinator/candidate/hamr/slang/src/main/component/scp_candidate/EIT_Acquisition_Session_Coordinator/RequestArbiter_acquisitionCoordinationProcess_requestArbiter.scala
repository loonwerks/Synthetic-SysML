// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestArbiter_acquisitionCoordinationProcess_requestArbiter {

  def initialise(api: RequestArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api),
      Ensures(T /*
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_ARBITRATION
        (api.doctorRequest == DoctorRequest.STOP_MONITORING ___>:
           api.arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) &&
          (api.doctorRequest != DoctorRequest.STOP_MONITORING &&
            api.eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY ___>:
            api.arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) &&
          (api.doctorRequest != DoctorRequest.STOP_MONITORING &&
            api.eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY ___>:
            api.arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)
        // END INITIALIZES ENSURES
      */)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_arbitrationDecision(EIT_Acquisition_Session_Coordinator.ArbitrationDecision.example())
  }

  def timeTriggered(api: RequestArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_doctorRequest(), api.get_technicianRequest(), api.get_eligibilityEnvelope()) match {
      case (Some(doctor), Some(technician), Some(envelope)) =>
        val result: ArbitrationDecision =
          if (doctor == DoctorRequest.STOP_MONITORING)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.STOP_INTENT,
              if (envelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY ||
                technician != TechnicianRequest.NO_TECHNICIAN_REQUEST) ArbitrationDecisionDisposition.PREEMPTED
              else ArbitrationDecisionDisposition.ACCEPTED)
          else if (envelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT,
              if (doctor == DoctorRequest.START_MONITORING || technician != TechnicianRequest.NO_TECHNICIAN_REQUEST) ArbitrationDecisionDisposition.PREEMPTED
              else ArbitrationDecisionDisposition.RECOVERY_APPLIED)
          else if (envelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT,
              if (doctor == DoctorRequest.START_MONITORING || technician != TechnicianRequest.NO_TECHNICIAN_REQUEST) ArbitrationDecisionDisposition.PREEMPTED
              else ArbitrationDecisionDisposition.RECOVERY_APPLIED)
          else if (technician == TechnicianRequest.RESET_PREPARATION)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT,
              if (doctor == DoctorRequest.START_MONITORING) ArbitrationDecisionDisposition.PREEMPTED else ArbitrationDecisionDisposition.ACCEPTED)
          else if (technician == TechnicianRequest.CONFIRM_BELT && envelope.beltQualified &&
            envelope.preparationState != EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT,
              if (doctor == DoctorRequest.START_MONITORING) ArbitrationDecisionDisposition.PREEMPTED else ArbitrationDecisionDisposition.ACCEPTED)
          else if (technician == TechnicianRequest.RECORD_CALIBRATION && envelope.beltQualified && envelope.calibrationQualified &&
            envelope.preparationState != EligibilityEnvelopePreparationState.UNPREPARED)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT,
              if (doctor == DoctorRequest.START_MONITORING) ArbitrationDecisionDisposition.PREEMPTED else ArbitrationDecisionDisposition.ACCEPTED)
          else if (technician != TechnicianRequest.NO_TECHNICIAN_REQUEST)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.NO_INTENT, ArbitrationDecisionDisposition.REJECTED)
          else if (doctor == DoctorRequest.START_MONITORING && envelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT, ArbitrationDecisionDisposition.ACCEPTED)
          else if (doctor == DoctorRequest.START_MONITORING)
            ArbitrationDecision(ArbitrationDecisionEffectiveIntent.NO_INTENT, ArbitrationDecisionDisposition.REJECTED)
          else ArbitrationDecision(ArbitrationDecisionEffectiveIntent.NO_INTENT, ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION)
        api.put_arbitrationDecision(result)
    }
  }

  def finalise(api: RequestArbiter_Operational_Api): Unit = { }
}
