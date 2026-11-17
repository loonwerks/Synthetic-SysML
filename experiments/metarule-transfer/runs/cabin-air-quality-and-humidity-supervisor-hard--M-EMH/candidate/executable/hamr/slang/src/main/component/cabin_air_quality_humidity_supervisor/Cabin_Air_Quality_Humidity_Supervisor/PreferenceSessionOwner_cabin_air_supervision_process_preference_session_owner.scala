// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner {
  var acceptedEnableMemory: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type =
    Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off
  var acceptedFilterPolicyMemory: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type =
    Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Automatic
  var acceptedHumidityPolicyMemory: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type =
    Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Disabled
  var acceptedRoutineAirflowMemory: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type =
    Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Off

  def publish(api: PreferenceSessionOwner_Api,
              event: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.Type): Unit = {
    val accepted = Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference(
      acceptedEnableMemory, acceptedFilterPolicyMemory, acceptedHumidityPolicyMemory,
      acceptedRoutineAirflowMemory, event)
    api.put_accepted_to_filter(accepted)
    api.put_accepted_to_humidity(accepted)
    api.put_accepted_to_routine(accepted)
    api.put_accepted_to_arbiter(accepted)
    api.put_accepted_to_status(accepted)
  }

  def initialise(api: PreferenceSessionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, acceptedEnableMemory, acceptedFilterPolicyMemory,
      acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory))
    acceptedEnableMemory = Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off
    acceptedFilterPolicyMemory = Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Automatic
    acceptedHumidityPolicyMemory = Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Disabled
    acceptedRoutineAirflowMemory = Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Off
    publish(api, Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.AcceptedDisabled)
  }

  def timeTriggered(api: PreferenceSessionOwner_Operational_Api): Unit = {
    Contract(Modifies(api, acceptedEnableMemory, acceptedFilterPolicyMemory,
      acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory))
    api.get_candidate() match {
      case Some(candidate) =>
        var event: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.Type =
          Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.NoNewPreference
        if (candidate.candidateClass == Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Invalid) {
          event = Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.RejectedInvalid
        } else if (candidate.candidateClass != Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Held) {
          acceptedEnableMemory = candidate.enable
          acceptedFilterPolicyMemory = candidate.filterPolicy
          acceptedHumidityPolicyMemory = candidate.humidityPolicy
          acceptedRoutineAirflowMemory = candidate.routineAirflow
          if (candidate.candidateClass == Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.FreshDisabled) {
            event = Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.AcceptedDisabled
          } else {
            event = Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.AcceptedEnabled
          }
        }
        publish(api, event)
      case _ => publish(api, Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.NoNewPreference)
    }
  }

  def finalise(api: PreferenceSessionOwner_Operational_Api): Unit = { }
}
