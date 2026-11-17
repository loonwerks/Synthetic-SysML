// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier {

  def initialise(api: PreferenceRequestQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_candidate(Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate(
      Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Invalid,
      Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off,
      Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Automatic,
      Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Disabled,
      Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Off))
  }

  def timeTriggered(api: PreferenceRequestQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_preference() match {
      case Some(preference) =>
        val candidateClass: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Type =
          if (preference.validity == Cabin_Air_Quality_Humidity_Supervisor.Validity.Invalid)
            Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Invalid
          else if (preference.arrival == Cabin_Air_Quality_Humidity_Supervisor.Arrival.Held)
            Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Held
          else if (preference.enable == Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off)
            Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.FreshDisabled
          else Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.FreshEnabled
        api.put_candidate(Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate(
          candidateClass, preference.enable, preference.filterPolicy,
          preference.humidityPolicy, preference.routineAirflow))
      case _ => api.put_candidate(Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate(
        Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Invalid,
        Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off,
        Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Automatic,
        Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Disabled,
        Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Off))
    }
  }

  def finalise(api: PreferenceRequestQualifier_Operational_Api): Unit = { }
}
