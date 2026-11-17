// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor {

  def initialise(api: AirCarePolicySupervisor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
    api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Recovering)
  }

  def timeTriggered(api: AirCarePolicySupervisor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_08_DISABLED
        (api.airCareIntent == AirCareIntent.Disabled) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.Off),
        // case CC_09_INVALID_PREFERENCE
        (api.airCareIntent == AirCareIntent.Invalid) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.PreferenceFault),
        // case CC_10_BLOCKED_INVALID
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.BlockedInvalid) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.InputFault),
        // case CC_10_CONFIRMING
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Confirming) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.Recovering),
        // case CC_11_DEFENSIVE_INCONSISTENCY
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          (api.airAssessment == AirAssessment.Unknown |
            api.humidityAssessment == HumidityAssessment.Unknown)) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.InputFault),
        // case CC_12_HUMIDIFY
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          api.airAssessment != AirAssessment.Unknown &
          api.humidityAssessment == HumidityAssessment.AddMoisture) ___>: (api.airTreatmentDirective == AirTreatmentDirective.HumidifyWithFilter &
          api.airCareStatus == AirCareStatus.Humidifying),
        // case CC_12_DEHUMIDIFY
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          api.airAssessment != AirAssessment.Unknown &
          api.humidityAssessment == HumidityAssessment.RemoveMoisture) ___>: (api.airTreatmentDirective == AirTreatmentDirective.DehumidifyWithFilter &
          api.airCareStatus == AirCareStatus.Dehumidifying),
        // case CC_12_FILTER
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          api.airAssessment == AirAssessment.FilterNeeded &
          api.humidityAssessment == HumidityAssessment.AtTarget) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Filter &
          api.airCareStatus == AirCareStatus.Filtering),
        // case CC_12_STANDBY
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          api.airAssessment == AirAssessment.Acceptable &
          api.humidityAssessment == HumidityAssessment.AtTarget) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.Standby)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_airCareIntent().get
    val air = api.get_airAssessment().get
    val humidity = api.get_humidityAssessment().get
    val confidence = api.get_measurementConfidence().get

    if (intent == AirCareIntent.Disabled) {
      api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
      api.put_airCareStatus(AirCareStatus.Off)
    } else if (intent == AirCareIntent.Invalid) {
      api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
      api.put_airCareStatus(AirCareStatus.PreferenceFault)
    } else if (confidence == MeasurementConfidence.BlockedInvalid) {
      api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
      api.put_airCareStatus(AirCareStatus.InputFault)
    } else if (confidence == MeasurementConfidence.Confirming) {
      api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
      api.put_airCareStatus(AirCareStatus.Recovering)
    } else if (air == AirAssessment.Unknown || humidity == HumidityAssessment.Unknown) {
      api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
      api.put_airCareStatus(AirCareStatus.InputFault)
    } else if (humidity == HumidityAssessment.AddMoisture) {
      api.put_airTreatmentDirective(AirTreatmentDirective.HumidifyWithFilter)
      api.put_airCareStatus(AirCareStatus.Humidifying)
    } else if (humidity == HumidityAssessment.RemoveMoisture) {
      api.put_airTreatmentDirective(AirTreatmentDirective.DehumidifyWithFilter)
      api.put_airCareStatus(AirCareStatus.Dehumidifying)
    } else if (air == AirAssessment.FilterNeeded) {
      api.put_airTreatmentDirective(AirTreatmentDirective.Filter)
      api.put_airCareStatus(AirCareStatus.Filtering)
    } else {
      api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
      api.put_airCareStatus(AirCareStatus.Standby)
    }
  }

  def finalise(api: AirCarePolicySupervisor_Operational_Api): Unit = { }
}
