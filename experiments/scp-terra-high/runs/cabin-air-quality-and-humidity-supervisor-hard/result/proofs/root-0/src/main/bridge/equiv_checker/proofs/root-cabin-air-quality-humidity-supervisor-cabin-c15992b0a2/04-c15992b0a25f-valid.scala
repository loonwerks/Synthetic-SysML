// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c15992b0a25f_4_Valid {
  @pure def check(
      accepted_to_arbiter: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_filter: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_humidity: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_routine: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      accepted_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      candidate: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate,
      in_acceptedenablememory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type,
      acceptedenablememory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type,
      in_acceptedfilterpolicymemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type,
      acceptedfilterpolicymemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type,
      in_acceptedhumiditypolicymemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type,
      acceptedhumiditypolicymemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type,
      in_acceptedroutineairflowmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type,
      acceptedroutineairflowmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_GumboX.compute_CEP_Post(in_acceptedenablememory, in_acceptedfilterpolicymemory, in_acceptedhumiditypolicymemory, in_acceptedroutineairflowmemory, acceptedenablememory, acceptedfilterpolicymemory, acceptedhumiditypolicymemory, acceptedroutineairflowmemory, candidate, accepted_to_arbiter, accepted_to_filter, accepted_to_humidity, accepted_to_routine, accepted_to_status))) ___>: (T)) & T))
  }
}
