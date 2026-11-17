// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler {

  def initialise(api: StatusOutcomeReconciler_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_supervisor_status(CabinAirSupervisorStatus(SupervisorMode.Idle, StatusCause.PreferenceDisabled))
  }

  def timeTriggered(api: StatusOutcomeReconciler_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee STATUS_CAUSE_PRECEDENCE
        (api.air_report.transitionEvent == AirRecoveryEvent.AirFaultEntered |
          api.air_report.transitionEvent == AirRecoveryEvent.AirFaultPersists |
          api.air_report.transitionEvent == AirRecoveryEvent.AirFaultRecurred) &
          api.supervisor_status.cause == StatusCause.AirObservationInvalid |
          api.air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered &
            api.air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists &
            api.air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred &
            (api.humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultEntered |
              api.humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultPersists |
              api.humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultRecurred) &
            api.supervisor_status.cause == StatusCause.HumidityObservationInvalid |
          api.air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered &
            api.air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists &
            api.air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred &
            api.humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultEntered &
            api.humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultPersists &
            api.humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultRecurred &
            api.air_report.trust != TrustState.Trusted &
            api.supervisor_status.cause == StatusCause.AirRecovering |
          api.air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered &
            api.air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists &
            api.air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred &
            api.humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultEntered &
            api.humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultPersists &
            api.humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultRecurred &
            api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust != TrustState.Trusted &
            api.supervisor_status.cause == StatusCause.HumidityRecovering |
          api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust == TrustState.Trusted &
            (api.composed_result.cause == StatusCause.AuthorityInvalid |
              api.composed_result.cause == StatusCause.AirPathReserved |
              api.composed_result.cause == StatusCause.EquipmentUnavailable |
              api.composed_result.cause == StatusCause.SelectedPathUnavailable) &
            api.supervisor_status.cause == api.composed_result.cause |
          api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust == TrustState.Trusted &
            api.composed_result.cause != StatusCause.AuthorityInvalid &
            api.composed_result.cause != StatusCause.AirPathReserved &
            api.composed_result.cause != StatusCause.EquipmentUnavailable &
            api.composed_result.cause != StatusCause.SelectedPathUnavailable &
            api.accepted.preferenceEvent == PreferenceEvent.RejectedInvalid &
            api.supervisor_status.cause == StatusCause.PreferenceRejected |
          api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust == TrustState.Trusted &
            api.composed_result.cause != StatusCause.AuthorityInvalid &
            api.composed_result.cause != StatusCause.AirPathReserved &
            api.composed_result.cause != StatusCause.EquipmentUnavailable &
            api.composed_result.cause != StatusCause.SelectedPathUnavailable &
            api.accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            (api.selection.cause == StatusCause.AirTreatmentPriority |
              api.selection.cause == StatusCause.HumidityTreatmentPriority) &
            api.supervisor_status.cause == api.selection.cause |
          api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust == TrustState.Trusted &
            api.composed_result.cause != StatusCause.AuthorityInvalid &
            api.composed_result.cause != StatusCause.AirPathReserved &
            api.composed_result.cause != StatusCause.EquipmentUnavailable &
            api.composed_result.cause != StatusCause.SelectedPathUnavailable &
            api.accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            api.selection.cause != StatusCause.AirTreatmentPriority &
            api.selection.cause != StatusCause.HumidityTreatmentPriority &
            api.accepted.enable == EnableChoice.Off &
            api.supervisor_status.cause == StatusCause.PreferenceDisabled |
          api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust == TrustState.Trusted &
            api.composed_result.cause != StatusCause.AuthorityInvalid &
            api.composed_result.cause != StatusCause.AirPathReserved &
            api.composed_result.cause != StatusCause.EquipmentUnavailable &
            api.composed_result.cause != StatusCause.SelectedPathUnavailable &
            api.accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            api.selection.cause != StatusCause.AirTreatmentPriority &
            api.selection.cause != StatusCause.HumidityTreatmentPriority &
            api.accepted.enable == EnableChoice.On &
            api.supervisor_status.cause == StatusCause.None,
        // guarantee STATUS_MODE_TOTAL_PARTITION
        api.selection.intent != SelectedIntent.None &
          api.composed_result.treatmentAction == TreatmentAction.None &
          api.supervisor_status.mode == SupervisorMode.Inhibited |
          api.selection.intent == SelectedIntent.None &
            api.composed_result.treatmentAction == TreatmentAction.None &
            (api.air_report.trust != TrustState.Trusted |
              api.humidity_report.trust != TrustState.Trusted) &
            api.supervisor_status.mode == SupervisorMode.ObservationHold |
          api.composed_result.treatmentAction != TreatmentAction.None &
            (api.air_report.trust != TrustState.Trusted |
              api.humidity_report.trust != TrustState.Trusted |
              api.accepted.preferenceEvent == PreferenceEvent.RejectedInvalid) &
            api.supervisor_status.mode == SupervisorMode.Degraded |
          api.composed_result.treatmentAction != TreatmentAction.None &
            api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust == TrustState.Trusted &
            api.accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            api.supervisor_status.mode == SupervisorMode.Active |
          api.selection.intent == SelectedIntent.None &
            api.composed_result.treatmentAction == TreatmentAction.None &
            api.air_report.trust == TrustState.Trusted &
            api.humidity_report.trust == TrustState.Trusted &
            api.supervisor_status.mode == SupervisorMode.Idle
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_composed_result() match {
      case Some(composed) => api.get_selection() match {
        case Some(selection) => api.get_air_report() match {
          case Some(air) => api.get_humidity_report() match {
            case Some(humidity) => api.get_accepted() match {
              case Some(accepted) =>
                val airFault = air.transitionEvent == AirRecoveryEvent.AirFaultEntered ||
                  air.transitionEvent == AirRecoveryEvent.AirFaultPersists ||
                  air.transitionEvent == AirRecoveryEvent.AirFaultRecurred
                val humidityFault = humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultEntered ||
                  humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultPersists ||
                  humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultRecurred
                val unavailable = composed.cause == StatusCause.AuthorityInvalid ||
                  composed.cause == StatusCause.AirPathReserved ||
                  composed.cause == StatusCause.EquipmentUnavailable ||
                  composed.cause == StatusCause.SelectedPathUnavailable
                val cause: StatusCause.Type =
                  if (airFault) StatusCause.AirObservationInvalid
                  else if (humidityFault) StatusCause.HumidityObservationInvalid
                  else if (air.trust != TrustState.Trusted) StatusCause.AirRecovering
                  else if (humidity.trust != TrustState.Trusted) StatusCause.HumidityRecovering
                  else if (unavailable) composed.cause
                  else if (accepted.preferenceEvent == PreferenceEvent.RejectedInvalid) StatusCause.PreferenceRejected
                  else if (selection.cause == StatusCause.AirTreatmentPriority ||
                    selection.cause == StatusCause.HumidityTreatmentPriority) selection.cause
                  else if (accepted.enable == EnableChoice.Off) StatusCause.PreferenceDisabled
                  else StatusCause.None
                val mode: SupervisorMode.Type =
                  if (selection.intent != SelectedIntent.None && composed.treatmentAction == TreatmentAction.None) SupervisorMode.Inhibited
                  else if (selection.intent == SelectedIntent.None && composed.treatmentAction == TreatmentAction.None &&
                    (air.trust != TrustState.Trusted || humidity.trust != TrustState.Trusted)) SupervisorMode.ObservationHold
                  else if (composed.treatmentAction != TreatmentAction.None &&
                    (air.trust != TrustState.Trusted || humidity.trust != TrustState.Trusted ||
                      accepted.preferenceEvent == PreferenceEvent.RejectedInvalid)) SupervisorMode.Degraded
                  else if (composed.treatmentAction != TreatmentAction.None) SupervisorMode.Active
                  else SupervisorMode.Idle
                api.put_supervisor_status(CabinAirSupervisorStatus(mode, cause))
            }
          }
        }
      }
    }
  }

  def finalise(api: StatusOutcomeReconciler_Operational_Api): Unit = { }
}
