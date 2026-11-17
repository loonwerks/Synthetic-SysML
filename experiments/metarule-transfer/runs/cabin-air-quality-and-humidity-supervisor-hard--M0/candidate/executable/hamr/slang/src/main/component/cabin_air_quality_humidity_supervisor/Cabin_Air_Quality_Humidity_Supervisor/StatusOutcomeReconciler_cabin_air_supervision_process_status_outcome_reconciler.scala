// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler {
  def airFault(event: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type): B = {
    return event == Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultEntered ||
      event == Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultPersists ||
      event == Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultRecurred
  }

  def humidityFault(event: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type): B = {
    return event == Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultEntered ||
      event == Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultPersists ||
      event == Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultRecurred
  }

  def initialise(api: StatusOutcomeReconciler_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(
      Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Idle,
      Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled))
  }

  def timeTriggered(api: StatusOutcomeReconciler_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_composed_result() match {
      case Some(composed) => api.get_selection() match {
        case Some(selection) => api.get_air_report() match {
          case Some(air) => api.get_humidity_report() match {
            case Some(humidity) => api.get_accepted() match {
              case Some(accepted) =>
                val recovery = air.trust != Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted ||
                  humidity.trust != Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
                val inhibited = composed.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid ||
                  composed.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved ||
                  composed.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable ||
                  composed.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable
                val cause: Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type =
                  if (airFault(air.transitionEvent))
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirObservationInvalid
                  else if (humidityFault(humidity.transitionEvent))
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.HumidityObservationInvalid
                  else if (air.trust != Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted)
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirRecovering
                  else if (humidity.trust != Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted)
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.HumidityRecovering
                  else if (inhibited) composed.cause
                  else if (accepted.preferenceEvent ==
                           Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.RejectedInvalid)
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceRejected
                  else if (selection.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirTreatmentPriority ||
                           selection.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.HumidityTreatmentPriority)
                    selection.cause
                  else if (accepted.enable == Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off)
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled
                  else Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None
                val mode: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Type =
                  if (selection.intent != Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None &&
                      composed.treatmentAction == Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None)
                    Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Inhibited
                  else if (selection.intent == Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None &&
                           composed.treatmentAction == Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None &&
                           recovery)
                    Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.ObservationHold
                  else if (composed.treatmentAction != Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None &&
                           (recovery || accepted.preferenceEvent ==
                            Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.RejectedInvalid))
                    Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Degraded
                  else if (composed.treatmentAction != Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None)
                    Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Active
                  else Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Idle
                api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(mode, cause))
              case _ => api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(
                Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Idle,
                Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled))
            }
            case _ => api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(
              Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Idle,
              Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled))
          }
          case _ => api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(
            Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Idle,
            Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled))
        }
        case _ => api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(
          Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Idle,
          Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled))
      }
      case _ => api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(
        Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Idle,
        Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled))
    }
  }

  def finalise(api: StatusOutcomeReconciler_Operational_Api): Unit = { }
}
