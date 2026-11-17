// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier {

  def initialise(api: PreferenceRequestQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_candidate(Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate.example())
  }

  def timeTriggered(api: PreferenceRequestQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_preference() match {
      case Some(preference) =>
        val kind: CandidateClass.Type =
          if (preference.validity == Validity.Invalid) CandidateClass.Invalid
          else if (preference.arrival == Arrival.Held) CandidateClass.Held
          else if (preference.enable == EnableChoice.Off) CandidateClass.FreshDisabled
          else CandidateClass.FreshEnabled
        api.put_candidate(QualifiedPreferenceCandidate(kind, preference.enable,
          preference.filterPolicy, preference.humidityPolicy, preference.routineAirflow))
      case _ =>
        api.put_candidate(QualifiedPreferenceCandidate(CandidateClass.Invalid, EnableChoice.Off,
          FilterPolicy.Automatic, HumidityPolicy.Disabled, RoutineAirflow.Off))
    }
  }

  def finalise(api: PreferenceRequestQualifier_Operational_Api): Unit = { }
}
