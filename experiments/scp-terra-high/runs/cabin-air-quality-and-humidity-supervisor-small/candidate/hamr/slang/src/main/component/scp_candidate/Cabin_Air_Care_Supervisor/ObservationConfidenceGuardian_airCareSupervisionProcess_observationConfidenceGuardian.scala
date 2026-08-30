// #Sireum

package scp_candidate.Cabin_Air_Care_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian {

  // BEGIN STATE VARS
  var confidenceMode: Cabin_Air_Care_Supervisor.ConfidenceMode.Type = Cabin_Air_Care_Supervisor.ConfidenceMode.Trusted
  // END STATE VARS

  def initialise(api: ObservationConfidenceGuardian_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        confidenceMode
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee InitialMode
        //   initial mode
        confidenceMode == ConfidenceMode.ConfirmationNeeded,
        // guarantee InitialConfidence
        //   initial confidence
        api.measurementConfidence == MeasurementConfidence.Confirming
        // END INITIALIZES ENSURES
      )
    )
    confidenceMode = ConfidenceMode.ConfirmationNeeded
    api.put_measurementConfidence(MeasurementConfidence.Confirming)
  }

  def timeTriggered(api: ObservationConfidenceGuardian_Operational_Api): Unit = {
    Contract(
      Modifies(confidenceMode, api),
      Ensures(
        ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_GumboX.compute_CEP_Post(
          In(confidenceMode), confidenceMode, api.airAssessment, api.humidityAssessment,
          api.measurementConfidence)
      )
    )

    val air = api.get_airAssessment().get
    val humidity = api.get_humidityAssessment().get
    if (air == AirAssessment.Unknown || humidity == HumidityAssessment.Unknown) {
      confidenceMode = ConfidenceMode.ConfirmationNeeded
      api.put_measurementConfidence(MeasurementConfidence.BlockedInvalid)
    } else if (confidenceMode == ConfidenceMode.ConfirmationNeeded) {
      confidenceMode = ConfidenceMode.Trusted
      api.put_measurementConfidence(MeasurementConfidence.Confirming)
    } else {
      confidenceMode = ConfidenceMode.Trusted
      api.put_measurementConfidence(MeasurementConfidence.Trusted)
    }
  }

  def finalise(api: ObservationConfidenceGuardian_Operational_Api): Unit = { }
}
