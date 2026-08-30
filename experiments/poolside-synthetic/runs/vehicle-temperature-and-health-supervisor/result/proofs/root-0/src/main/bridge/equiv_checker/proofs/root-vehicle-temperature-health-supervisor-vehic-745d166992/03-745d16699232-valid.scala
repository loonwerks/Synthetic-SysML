// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_745d16699232_3_Valid {
  @pure def check(
      assessmentforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      assessmentforrecovery: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      rawtemperature: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
