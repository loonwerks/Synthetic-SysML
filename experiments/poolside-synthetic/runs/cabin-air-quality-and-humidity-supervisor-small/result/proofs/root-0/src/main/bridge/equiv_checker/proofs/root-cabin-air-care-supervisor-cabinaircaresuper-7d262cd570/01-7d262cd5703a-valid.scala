// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7d262cd5703a_1_Valid {
  @pure def check(
      aircareintent: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareIntent.Type,
      aircarepreference: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCarePreference.Type,
      preferencevalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
