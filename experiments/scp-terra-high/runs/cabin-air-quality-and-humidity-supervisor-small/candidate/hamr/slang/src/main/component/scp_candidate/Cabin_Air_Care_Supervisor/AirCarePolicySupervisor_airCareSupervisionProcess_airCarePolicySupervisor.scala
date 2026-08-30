// #Sireum

package scp_candidate.Cabin_Air_Care_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor {

  def initialise(api: AirCarePolicySupervisor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee InitialDirective
        //   initial directive
        api.airTreatmentDirective == AirTreatmentDirective.Standby,
        // guarantee InitialStatus
        //   initial status
        api.airCareStatus == AirCareStatus.Recovering
        // END INITIALIZES ENSURES
      )
    )
    api.put_airTreatmentDirective(AirTreatmentDirective.Standby)
    api.put_airCareStatus(AirCareStatus.Recovering)
  }

  def timeTriggered(api: AirCarePolicySupervisor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_GumboX.compute_CEP_Post(
          api.airAssessment, api.airCareIntent, api.humidityAssessment, api.measurementConfidence,
          api.airCareStatus, api.airTreatmentDirective)
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
