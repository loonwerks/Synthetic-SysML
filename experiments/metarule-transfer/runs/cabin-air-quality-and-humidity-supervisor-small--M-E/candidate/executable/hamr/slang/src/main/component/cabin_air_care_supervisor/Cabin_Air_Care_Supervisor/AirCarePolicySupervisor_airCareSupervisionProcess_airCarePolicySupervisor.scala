// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor {

  def initialise(api: AirCarePolicySupervisor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
    api.put_airCareStatus(AirCareStatus.Recovering)
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
        // case CC_10_CONFIDENCE_MASK
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence != MeasurementConfidence.Trusted) ___>: ((api.measurementConfidence == MeasurementConfidence.BlockedInvalid ___>:
          api.airTreatmentDirective == AirTreatmentDirective.Standby &
            api.airCareStatus == AirCareStatus.InputFault) &
          (api.measurementConfidence == MeasurementConfidence.Confirming ___>:
            api.airTreatmentDirective == AirTreatmentDirective.Standby &
              api.airCareStatus == AirCareStatus.Recovering)),
        // case CC_11_DEFENSIVE_INCONSISTENCY
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          (api.airAssessment == AirAssessment.Unknown |
            api.humidityAssessment == HumidityAssessment.Unknown)) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.InputFault),
        // case CC_12_TRUSTED_TREATMENT
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          api.airAssessment != AirAssessment.Unknown &
          api.humidityAssessment != HumidityAssessment.Unknown) ___>: ((api.humidityAssessment == HumidityAssessment.AddMoisture ___>:
          api.airTreatmentDirective == AirTreatmentDirective.HumidifyWithFilter &
            api.airCareStatus == AirCareStatus.Humidifying) &
          (api.humidityAssessment == HumidityAssessment.RemoveMoisture ___>:
            api.airTreatmentDirective == AirTreatmentDirective.DehumidifyWithFilter &
              api.airCareStatus == AirCareStatus.Dehumidifying) &
          (api.humidityAssessment == HumidityAssessment.AtTarget &
            api.airAssessment == AirAssessment.FilterNeeded ___>:
            api.airTreatmentDirective == AirTreatmentDirective.Filter &
              api.airCareStatus == AirCareStatus.Filtering) &
          (api.humidityAssessment == HumidityAssessment.AtTarget &
            api.airAssessment == AirAssessment.Acceptable ___>:
            api.airTreatmentDirective == AirTreatmentDirective.Standby &
              api.airCareStatus == AirCareStatus.Standby))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_airCareIntent()
    val air = api.get_airAssessment()
    val humidity = api.get_humidityAssessment()
    val confidence = api.get_measurementConfidence()

    (intent, air, humidity, confidence) match {
      case (Some(intentValue), Some(airValue), Some(humidityValue), Some(confidenceValue)) =>
        if (intentValue == AirCareIntent.Disabled) {
          api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
          api.put_airCareStatus(AirCareStatus.Off)
        } else if (intentValue == AirCareIntent.Invalid) {
          api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
          api.put_airCareStatus(AirCareStatus.PreferenceFault)
        } else if (confidenceValue == MeasurementConfidence.BlockedInvalid) {
          api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
          api.put_airCareStatus(AirCareStatus.InputFault)
        } else if (confidenceValue == MeasurementConfidence.Confirming) {
          api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
          api.put_airCareStatus(AirCareStatus.Recovering)
        } else if (airValue == AirAssessment.Unknown | humidityValue == HumidityAssessment.Unknown) {
          api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
          api.put_airCareStatus(AirCareStatus.InputFault)
        } else if (humidityValue == HumidityAssessment.AddMoisture) {
          api.put_airTreatmentDirective(AirTreatmentDirective.HumidifyWithFilter)
          api.put_airCareStatus(AirCareStatus.Humidifying)
        } else if (humidityValue == HumidityAssessment.RemoveMoisture) {
          api.put_airTreatmentDirective(AirTreatmentDirective.DehumidifyWithFilter)
          api.put_airCareStatus(AirCareStatus.Dehumidifying)
        } else if (airValue == AirAssessment.FilterNeeded) {
          api.put_airTreatmentDirective(AirTreatmentDirective.Filter)
          api.put_airCareStatus(AirCareStatus.Filtering)
        } else {
          api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
          api.put_airCareStatus(AirCareStatus.Standby)
        }
      case _ =>
        api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
        api.put_airCareStatus(AirCareStatus.InputFault)
    }
  }

  def finalise(api: AirCarePolicySupervisor_Operational_Api): Unit = { }
}
