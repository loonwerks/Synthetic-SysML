// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_a25b937a9281_Oracle_Pointwise_Realizable {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Type,
      in_confidencemode: equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(in_confidencemode, equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted, airassessment, humidityassessment, equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(in_confidencemode, equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded, airassessment, humidityassessment, equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(in_confidencemode, equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted, airassessment, humidityassessment, equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(in_confidencemode, equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded, airassessment, humidityassessment, equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(in_confidencemode, equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted, airassessment, humidityassessment, equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(in_confidencemode, equiv_shared_0.Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded, airassessment, humidityassessment, equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming)))))
  }
}
