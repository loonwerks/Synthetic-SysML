// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_7d262cd5703a_Oracle_Pointwise_Realizable {
  @pure def check(
      aircarepreference: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCarePreference.Type,
      preferencevalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_GumboX.compute_CEP_Post(aircarepreference, preferencevalidity, equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareIntent.Disabled)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_GumboX.compute_CEP_Post(aircarepreference, preferencevalidity, equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareIntent.Enabled)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_GumboX.compute_CEP_Post(aircarepreference, preferencevalidity, equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareIntent.Invalid)))))
  }
}
