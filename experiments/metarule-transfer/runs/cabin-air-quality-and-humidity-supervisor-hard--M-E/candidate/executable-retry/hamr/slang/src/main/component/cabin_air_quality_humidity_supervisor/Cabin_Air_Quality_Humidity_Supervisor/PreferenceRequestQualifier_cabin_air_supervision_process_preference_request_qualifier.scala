// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier {

  def initialise(api: PreferenceRequestQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_candidate(QualifiedPreferenceCandidate(
      CandidateClass.Invalid, EnableChoice.Off, FilterPolicy.Automatic,
      HumidityPolicy.Disabled, RoutineAirflow.Off))
  }

  def timeTriggered(api: PreferenceRequestQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee QUALIFIED_PREFERENCE_CLASSIFICATION
        api.candidate.enable == api.preference.enable &
          api.candidate.filterPolicy == api.preference.filterPolicy &
          api.candidate.humidityPolicy == api.preference.humidityPolicy &
          api.candidate.routineAirflow == api.preference.routineAirflow &
          (api.preference.validity == Validity.Invalid &
            api.candidate.candidateClass == CandidateClass.Invalid |
            api.preference.validity == Validity.Valid &
              api.preference.arrival == Arrival.Held &
              api.candidate.candidateClass == CandidateClass.Held |
            api.preference.validity == Validity.Valid &
              api.preference.arrival == Arrival.New &
              api.preference.enable == EnableChoice.Off &
              api.candidate.candidateClass == CandidateClass.FreshDisabled |
            api.preference.validity == Validity.Valid &
              api.preference.arrival == Arrival.New &
              api.preference.enable == EnableChoice.On &
              api.candidate.candidateClass == CandidateClass.FreshEnabled)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_preference() match {
      case Some(preference) =>
        val candidateClass: CandidateClass.Type =
          if (preference.validity == Validity.Invalid) CandidateClass.Invalid
          else if (preference.arrival == Arrival.Held) CandidateClass.Held
          else if (preference.enable == EnableChoice.Off) CandidateClass.FreshDisabled
          else CandidateClass.FreshEnabled
        api.put_candidate(QualifiedPreferenceCandidate(candidateClass, preference.enable,
          preference.filterPolicy, preference.humidityPolicy, preference.routineAirflow))
    }
  }

  def finalise(api: PreferenceRequestQualifier_Operational_Api): Unit = { }
}
