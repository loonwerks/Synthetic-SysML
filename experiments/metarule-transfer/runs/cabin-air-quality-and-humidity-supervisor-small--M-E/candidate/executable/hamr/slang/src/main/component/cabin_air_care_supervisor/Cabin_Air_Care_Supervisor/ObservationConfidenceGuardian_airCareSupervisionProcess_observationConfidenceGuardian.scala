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
    Contract(Modifies(api, confidenceMode))
    confidenceMode = ConfidenceMode.ConfirmationNeeded
    api.put_measurementConfidence(MeasurementConfidence.Confirming)
  }

  def timeTriggered(api: ObservationConfidenceGuardian_Operational_Api): Unit = {
    Contract(
      Modifies(api, confidenceMode),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_05_INVALID_OBSERVATION
        (api.airAssessment == AirAssessment.Unknown |
          api.humidityAssessment == HumidityAssessment.Unknown) ___>: (api.measurementConfidence == MeasurementConfidence.BlockedInvalid &
          confidenceMode == ConfidenceMode.ConfirmationNeeded),
        // case CC_06_CLEAN_CONFIRMATION
        (api.airAssessment != AirAssessment.Unknown &
          api.humidityAssessment != HumidityAssessment.Unknown &
          In(confidenceMode) == ConfidenceMode.ConfirmationNeeded) ___>: (api.measurementConfidence == MeasurementConfidence.Confirming &
          confidenceMode == ConfidenceMode.Trusted),
        // case CC_07_TRUSTED_RETENTION
        (api.airAssessment != AirAssessment.Unknown &
          api.humidityAssessment != HumidityAssessment.Unknown &
          In(confidenceMode) == ConfidenceMode.Trusted) ___>: (api.measurementConfidence == MeasurementConfidence.Trusted &
          confidenceMode == ConfidenceMode.Trusted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val air = api.get_airAssessment()
    val humidity = api.get_humidityAssessment()

    (air, humidity) match {
      case (Some(airValue), Some(humidityValue)) =>
        if (airValue == AirAssessment.Unknown | humidityValue == HumidityAssessment.Unknown) {
          confidenceMode = ConfidenceMode.ConfirmationNeeded
          api.put_measurementConfidence(MeasurementConfidence.BlockedInvalid)
        } else if (confidenceMode == ConfidenceMode.ConfirmationNeeded) {
          confidenceMode = ConfidenceMode.Trusted
          api.put_measurementConfidence(MeasurementConfidence.Confirming)
        } else {
          confidenceMode = ConfidenceMode.Trusted
          api.put_measurementConfidence(MeasurementConfidence.Trusted)
        }
      case _ =>
        confidenceMode = ConfidenceMode.ConfirmationNeeded
        api.put_measurementConfidence(MeasurementConfidence.BlockedInvalid)
    }
  }

  def finalise(api: ObservationConfidenceGuardian_Operational_Api): Unit = { }
}
