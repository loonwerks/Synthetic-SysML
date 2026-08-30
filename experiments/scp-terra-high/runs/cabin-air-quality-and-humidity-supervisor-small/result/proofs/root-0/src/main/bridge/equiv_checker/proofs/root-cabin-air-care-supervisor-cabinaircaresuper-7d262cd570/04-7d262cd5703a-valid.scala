// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7d262cd5703a_4_Valid {
  @pure def check(
      aircareintent: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareIntent.Type,
      aircarepreference: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCarePreference.Type,
      preferencevalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_GumboX.compute_CEP_Post(aircarepreference, preferencevalidity, aircareintent))) ___>: (equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_Candidate_GumboX.compute_CEP_Post(aircarepreference, preferencevalidity, aircareintent))) & T))
  }
}
