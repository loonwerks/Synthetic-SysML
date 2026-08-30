// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_aaee23ff339b_4_Valid {
  @pure def check(
      cabinhumidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.CabinHumidity.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type,
      humidityvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_GumboX.compute_CEP_Post(cabinhumidity, humidityvalidity, humidityassessment))) ___>: (T)) & T))
  }
}
