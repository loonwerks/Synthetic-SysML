// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian {

  // BEGIN STATE VARS
  var confidenceMode: Cabin_Air_Care_Supervisor.ConfidenceMode.Type = Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded
  // END STATE VARS

  def initialise(api: ObservationConfidenceGuardian_Initialization_Api): Unit = {
    Contract(
      Modifies(api, confidenceMode)
    )
    confidenceMode = Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded
    api.put_measurementConfidence(Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming)
  }

  def timeTriggered(api: ObservationConfidenceGuardian_Operational_Api): Unit = {
    Contract(
      Modifies(api, confidenceMode),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_05_INVALID_OBSERVATION
        //   Any unknown assessment blocks treatment and resets confirmation | <N.md#CC_05_INVALID_OBSERVATION>
        (api.airAssessment == Cabin_Air_Care_Supervisor.AirAssessment.Unknown |
          api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown) ___>: (api.measurementConfidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid &
          confidenceMode == Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded),
        // case CC_06_CLEAN_CONFIRMATION
        //   First complete known observation confirms recovery | <N.md#CC_06_CLEAN_CONFIRMATION>
        (api.airAssessment != Cabin_Air_Care_Supervisor.AirAssessment.Unknown &
          api.humidityAssessment != Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown &
          In(confidenceMode) == Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded) ___>: (api.measurementConfidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming &
          confidenceMode == Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted),
        // case CC_07_TRUSTED_RETENTION
        //   Complete known observations retain trusted confidence | <N.md#CC_07_TRUSTED_RETENTION>
        (api.airAssessment != Cabin_Air_Care_Supervisor.AirAssessment.Unknown &
          api.humidityAssessment != Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown &
          In(confidenceMode) == Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted) ___>: (api.measurementConfidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted &
          confidenceMode == Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val air = api.get_airAssessment().get
    val humidity = api.get_humidityAssessment().get

    if (air == Cabin_Air_Care_Supervisor.AirAssessment.Unknown |
        humidity == Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown) {
      confidenceMode = Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded
      api.put_measurementConfidence(Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid)
    } else if (confidenceMode == Cabin_Air_Care_Supervisor.ConfidenceMode.ConfirmationNeeded) {
      confidenceMode = Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted
      api.put_measurementConfidence(Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming)
    } else {
      confidenceMode = Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted
      api.put_measurementConfidence(Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted)
    }
  }

  def finalise(api: ObservationConfidenceGuardian_Operational_Api): Unit = { }
}
