// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_62623525b28a_1_Valid {
  @pure def check(
      assessmentforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      assessmentforrecovery: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      rawtemperature: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
