// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner {

  // BEGIN STATE VARS
  var acceptedEnableMemory: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type = Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.On

  var acceptedFilterPolicyMemory: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type = Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Automatic

  var acceptedHumidityPolicyMemory: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type = Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Automatic

  var acceptedRoutineAirflowMemory: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type = Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Off
  // END STATE VARS

  def initialise(api: PreferenceSessionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, acceptedEnableMemory, acceptedFilterPolicyMemory, acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory))
    acceptedEnableMemory = EnableChoice.Off
    acceptedFilterPolicyMemory = FilterPolicy.Automatic
    acceptedHumidityPolicyMemory = HumidityPolicy.Disabled
    acceptedRoutineAirflowMemory = RoutineAirflow.Off
    val accepted = AcceptedPreference(acceptedEnableMemory, acceptedFilterPolicyMemory,
      acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory, PreferenceEvent.AcceptedDisabled)
    api.put_accepted_to_filter(accepted)
    api.put_accepted_to_humidity(accepted)
    api.put_accepted_to_routine(accepted)
    api.put_accepted_to_arbiter(accepted)
    api.put_accepted_to_status(accepted)
  }

  def timeTriggered(api: PreferenceSessionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, acceptedEnableMemory, acceptedFilterPolicyMemory, acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee ACCEPTED_PREFERENCE_FANOUT
        api.accepted_to_filter.enable == acceptedEnableMemory &
          api.accepted_to_filter.filterPolicy == acceptedFilterPolicyMemory &
          api.accepted_to_filter.humidityPolicy == acceptedHumidityPolicyMemory &
          api.accepted_to_filter.routineAirflow == acceptedRoutineAirflowMemory &
          api.accepted_to_humidity == api.accepted_to_filter &
          api.accepted_to_routine == api.accepted_to_filter &
          api.accepted_to_arbiter == api.accepted_to_filter &
          api.accepted_to_status == api.accepted_to_filter,
        // case CASE_01_REJECT_INVALID
        (api.candidate.candidateClass == CandidateClass.Invalid) ___>: (api.accepted_to_filter.preferenceEvent == PreferenceEvent.RejectedInvalid),
        // case CASE_02_RETAIN_HELD
        (api.candidate.candidateClass == CandidateClass.Held) ___>: (api.accepted_to_filter.preferenceEvent == PreferenceEvent.NoNewPreference),
        // case CASE_03_ACCEPT_DISABLED
        (api.candidate.candidateClass == CandidateClass.FreshDisabled) ___>: (acceptedEnableMemory == api.candidate.enable &
          acceptedFilterPolicyMemory == api.candidate.filterPolicy &
          acceptedHumidityPolicyMemory == api.candidate.humidityPolicy &
          acceptedRoutineAirflowMemory == api.candidate.routineAirflow &
          api.accepted_to_filter.preferenceEvent == PreferenceEvent.AcceptedDisabled),
        // case CASE_04_ACCEPT_ENABLED
        (api.candidate.candidateClass == CandidateClass.FreshEnabled) ___>: (acceptedEnableMemory == api.candidate.enable &
          acceptedFilterPolicyMemory == api.candidate.filterPolicy &
          acceptedHumidityPolicyMemory == api.candidate.humidityPolicy &
          acceptedRoutineAirflowMemory == api.candidate.routineAirflow &
          api.accepted_to_filter.preferenceEvent == PreferenceEvent.AcceptedEnabled)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_candidate() match {
      case Some(candidate) =>
        val event: PreferenceEvent.Type =
          if (candidate.candidateClass == CandidateClass.Invalid) PreferenceEvent.RejectedInvalid
          else if (candidate.candidateClass == CandidateClass.Held) PreferenceEvent.NoNewPreference
          else if (candidate.candidateClass == CandidateClass.FreshDisabled) PreferenceEvent.AcceptedDisabled
          else PreferenceEvent.AcceptedEnabled
        if (candidate.candidateClass == CandidateClass.FreshDisabled ||
            candidate.candidateClass == CandidateClass.FreshEnabled) {
          acceptedEnableMemory = candidate.enable
          acceptedFilterPolicyMemory = candidate.filterPolicy
          acceptedHumidityPolicyMemory = candidate.humidityPolicy
          acceptedRoutineAirflowMemory = candidate.routineAirflow
        }
        val accepted = AcceptedPreference(acceptedEnableMemory, acceptedFilterPolicyMemory,
          acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory, event)
        api.put_accepted_to_filter(accepted)
        api.put_accepted_to_humidity(accepted)
        api.put_accepted_to_routine(accepted)
        api.put_accepted_to_arbiter(accepted)
        api.put_accepted_to_status(accepted)
    }
  }

  def finalise(api: PreferenceSessionOwner_Operational_Api): Unit = { }
}
