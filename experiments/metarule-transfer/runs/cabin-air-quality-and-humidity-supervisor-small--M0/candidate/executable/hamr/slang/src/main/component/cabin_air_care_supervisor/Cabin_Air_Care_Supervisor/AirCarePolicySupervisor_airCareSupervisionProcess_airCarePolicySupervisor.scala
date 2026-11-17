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
        //   Disabled air care requests standby and reports Off | <N.md#CC_08_DISABLED>
        (api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Disabled) ___>: (api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby &
          api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.Off),
        // case CC_09_INVALID_PREFERENCE
        //   Invalid preference requests standby and reports preference fault | <N.md#CC_09_INVALID_PREFERENCE>
        (api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Invalid) ___>: (api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby &
          api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.PreferenceFault),
        // case CC_10_CONFIDENCE_MASK
        //   Enabled care remains standby until confidence is trusted | <N.md#CC_10_CONFIDENCE_MASK>
        (api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Enabled &
          api.measurementConfidence != Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted) ___>: ((api.measurementConfidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid ___>:
          api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby &
            api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.InputFault) &
          (api.measurementConfidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming ___>:
            api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby &
              api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.Recovering)),
        // case CC_11_DEFENSIVE_INCONSISTENCY
        //   Trusted but internally unknown assessments fail safely | <N.md#CC_11_DEFENSIVE_INCONSISTENCY>
        (api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Enabled &
          api.measurementConfidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted &
          (api.airAssessment == Cabin_Air_Care_Supervisor.AirAssessment.Unknown |
            api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown)) ___>: (api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby &
          api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.InputFault),
        // case CC_12_TRUSTED_TREATMENT
        //   Trusted known assessments select the coordinated treatment | <N.md#CC_12_TRUSTED_TREATMENT>
        (api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Enabled &
          api.measurementConfidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted &
          api.airAssessment != Cabin_Air_Care_Supervisor.AirAssessment.Unknown &
          api.humidityAssessment != Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown) ___>: ((api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture ___>:
          api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.HumidifyWithFilter &
            api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.Humidifying) &
          (api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture ___>:
            api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.DehumidifyWithFilter &
              api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.Dehumidifying) &
          (api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget &
            api.airAssessment == Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded ___>:
            api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.Filter &
              api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.Filtering) &
          (api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget &
            api.airAssessment == Cabin_Air_Care_Supervisor.AirAssessment.Acceptable ___>:
            api.airTreatmentDirective == Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby &
              api.airCareStatus == Cabin_Air_Care_Supervisor.AirCareStatus.Standby))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_airCareIntent().get
    val air = api.get_airAssessment().get
    val humidity = api.get_humidityAssessment().get
    val confidence = api.get_measurementConfidence().get

    if (intent == Cabin_Air_Care_Supervisor.AirCareIntent.Disabled) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Off)
    } else if (intent == Cabin_Air_Care_Supervisor.AirCareIntent.Invalid) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.PreferenceFault)
    } else if (confidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.InputFault)
    } else if (confidence == Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Recovering)
    } else if (air == Cabin_Air_Care_Supervisor.AirAssessment.Unknown |
               humidity == Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.InputFault)
    } else if (humidity == Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.HumidifyWithFilter)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Humidifying)
    } else if (humidity == Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.DehumidifyWithFilter)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Dehumidifying)
    } else if (air == Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded) {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Filter)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Filtering)
    } else {
      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Standby)
    }
  }

  def finalise(api: AirCarePolicySupervisor_Operational_Api): Unit = { }
}
