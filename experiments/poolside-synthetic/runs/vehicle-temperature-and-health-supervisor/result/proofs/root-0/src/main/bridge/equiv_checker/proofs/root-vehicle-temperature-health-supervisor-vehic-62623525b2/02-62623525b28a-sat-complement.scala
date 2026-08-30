// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_62623525b28a_2_Complement {
  @pure def check(
      assessmentforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      assessmentforrecovery: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      rawtemperature: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureSample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_GumboX.compute_CEP_Post(rawtemperature, assessmentforarbitration, assessmentforrecovery))) & T)))
  }
}
