// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e75120831066_4_Valid {
  @pure def check(
      cabinhumidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.CabinHumidity.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type,
      humidityvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_GumboX.inititialize_IEP_Post(humidityassessment))) ___>: (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_Candidate_GumboX.inititialize_IEP_Post(humidityassessment))) & T))
  }
}
