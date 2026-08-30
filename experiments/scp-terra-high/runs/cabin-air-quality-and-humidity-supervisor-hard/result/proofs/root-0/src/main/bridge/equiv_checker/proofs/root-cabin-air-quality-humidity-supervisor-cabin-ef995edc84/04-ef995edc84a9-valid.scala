// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ef995edc84a9_4_Valid {
  @pure def check(
      candidate: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate,
      preference: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_GumboX.inititialize_IEP_Post(candidate))) ___>: (T)) & T))
  }
}
