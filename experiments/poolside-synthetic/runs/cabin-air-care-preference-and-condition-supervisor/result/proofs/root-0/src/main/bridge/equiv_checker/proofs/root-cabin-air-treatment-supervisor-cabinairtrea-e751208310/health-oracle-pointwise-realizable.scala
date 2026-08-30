// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_e75120831066_Oracle_Pointwise_Realizable {
  @pure def check(
      cabinhumidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.CabinHumidity.Type,
      humidityvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.NoExcessHumidity)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.DryingNeeded)))))
  }
}
