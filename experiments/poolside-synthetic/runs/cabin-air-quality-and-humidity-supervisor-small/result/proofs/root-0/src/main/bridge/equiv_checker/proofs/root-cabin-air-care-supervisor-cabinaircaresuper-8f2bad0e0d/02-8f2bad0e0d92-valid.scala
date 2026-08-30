// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8f2bad0e0d92_2_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Type,
      measurementconfidence: equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Type,
      confidencemode: equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_Candidate_GumboX.inititialize_IEP_Post(confidencemode, measurementconfidence))) ___>: (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.inititialize_IEP_Post(confidencemode, measurementconfidence))) & T))
  }
}
