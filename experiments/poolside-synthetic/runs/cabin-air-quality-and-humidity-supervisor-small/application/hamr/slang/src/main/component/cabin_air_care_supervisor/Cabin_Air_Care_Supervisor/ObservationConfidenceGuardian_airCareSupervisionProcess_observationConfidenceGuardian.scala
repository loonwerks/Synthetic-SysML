// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian {

  // BEGIN STATE VARS
  var confidenceMode: Cabin_Air_Care_Supervisor.ConfidenceMode.Type = Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted
  // END STATE VARS

  def initialise(api: ObservationConfidenceGuardian_Initialization_Api): Unit = {
    Contract(
      Modifies(api, confidenceMode),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_CONFIDENCE
        //   set confidenceMode to ConfirmationNeeded and measurementConfidence to Confirming
        confidenceMode == ConfidenceMode.ConfirmationNeeded &
        api.measurementConfidence == MeasurementConfidence.Confirming
        // END INITIALIZES ENSURES
      )
    )
    confidenceMode = ConfidenceMode.ConfirmationNeeded
    api.put_measurementConfidence(Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming)
  }

  def timeTriggered(api: ObservationConfidenceGuardian_Operational_Api): Unit = {
    Contract(
      Modifies(api, confidenceMode),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_05_INVALID_OBSERVATION
        //   Invalid observation resets to BlockedInvalid and ConfirmationNeeded
        (api.airAssessment == AirAssessment.Unknown |
          api.humidityAssessment == HumidityAssessment.Unknown) ___>: (api.measurementConfidence == MeasurementConfidence.BlockedInvalid &
          confidenceMode == ConfidenceMode.ConfirmationNeeded),
        // case CC_06_CLEAN_CONFIRMATION
        //   Clean observation in ConfirmationNeeded confirms trust
        (api.airAssessment != AirAssessment.Unknown &
          api.humidityAssessment != HumidityAssessment.Unknown &
          In(confidenceMode) == ConfidenceMode.ConfirmationNeeded) ___>: (api.measurementConfidence == MeasurementConfidence.Confirming &
          confidenceMode == ConfidenceMode.Trusted),
        // case CC_07_TRUSTED_RETENTION
        //   Clean observation while Trusted retains trust
        (api.airAssessment != AirAssessment.Unknown &
          api.humidityAssessment != HumidityAssessment.Unknown &
          In(confidenceMode) == ConfidenceMode.Trusted) ___>: (api.measurementConfidence == MeasurementConfidence.Trusted &
          confidenceMode == ConfidenceMode.Trusted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val airAssessment: Cabin_Air_Care_Supervisor.AirAssessment.Type = api.get_airAssessment().get
    val humidityAssessment: Cabin_Air_Care_Supervisor.HumidityAssessment.Type = api.get_humidityAssessment().get
    val inConfidenceMode: Cabin_Air_Care_Supervisor.ConfidenceMode.Type = confidenceMode

    if (airAssessment == AirAssessment.Unknown | humidityAssessment == HumidityAssessment.Unknown) {
      api.put_measurementConfidence(MeasurementConfidence.BlockedInvalid)
      confidenceMode = ConfidenceMode.ConfirmationNeeded
    } else if (inConfidenceMode == ConfidenceMode.ConfirmationNeeded) {
      api.put_measurementConfidence(MeasurementConfidence.Confirming)
      confidenceMode = ConfidenceMode.Trusted
    } else {
      api.put_measurementConfidence(MeasurementConfidence.Trusted)
      confidenceMode = ConfidenceMode.Trusted
    }
  }

  def finalise(api: ObservationConfidenceGuardian_Operational_Api): Unit = { }
}
