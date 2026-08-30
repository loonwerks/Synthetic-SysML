// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_42acf1a9250c_4_Valid {
  @pure def check(
      accepted_to_arbiter: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_filter: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_humidity: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_routine: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      candidate: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate,
      acceptedenablememory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type,
      acceptedfilterpolicymemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type,
      acceptedhumiditypolicymemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type,
      acceptedroutineairflowmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_GumboX.inititialize_IEP_Post(acceptedenablememory, acceptedfilterpolicymemory, acceptedhumiditypolicymemory, acceptedroutineairflowmemory, accepted_to_arbiter, accepted_to_filter, accepted_to_humidity, accepted_to_routine, accepted_to_status))) ___>: (T)) & T))
  }
}
