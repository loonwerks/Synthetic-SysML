// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner {

  def initialise(api: PreferenceSessionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_accepted_to_filter(Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference.example())
    api.put_accepted_to_humidity(Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference.example())
    api.put_accepted_to_routine(Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference.example())
    api.put_accepted_to_arbiter(Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference.example())
    api.put_accepted_to_status(Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference.example())
  }

  def timeTriggered(api: PreferenceSessionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: PreferenceSessionOwner_Operational_Api): Unit = { }
}
