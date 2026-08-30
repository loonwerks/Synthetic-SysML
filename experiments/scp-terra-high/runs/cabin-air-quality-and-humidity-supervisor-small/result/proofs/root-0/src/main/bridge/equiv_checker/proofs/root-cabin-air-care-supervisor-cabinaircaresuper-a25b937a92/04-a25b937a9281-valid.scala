// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a25b937a9281_4_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Type,
      measurementconfidence: equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Type,
      in_confidencemode: equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Type,
      confidencemode: equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(in_confidencemode, confidencemode, airassessment, humidityassessment, measurementconfidence))) ___>: (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_Candidate_GumboX.compute_CEP_Post(in_confidencemode, confidencemode, airassessment, humidityassessment, measurementconfidence))) & T))
  }
}
