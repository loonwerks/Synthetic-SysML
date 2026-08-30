// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a25b937a9281_1_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Type,
      measurementconfidence: equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Type,
      in_confidencemode: equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Type,
      confidencemode: equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
