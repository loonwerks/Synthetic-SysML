// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5de1d247c8ad_2_Valid {
  @pure def check(
      candidate: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate,
      preference: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_GumboX.compute_CEP_Post(preference, candidate))) & T))
  }
}
