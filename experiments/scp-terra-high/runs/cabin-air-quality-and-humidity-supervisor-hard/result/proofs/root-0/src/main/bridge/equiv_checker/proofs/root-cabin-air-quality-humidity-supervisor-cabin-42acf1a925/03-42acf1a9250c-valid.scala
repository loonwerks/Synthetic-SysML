// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_42acf1a9250c_3_Valid {
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
      Ensures((T) ___>: (T)))
  }
}
