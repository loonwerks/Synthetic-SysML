// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor {

  def initialise(api: AirCarePolicySupervisor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_POLICY_OUTPUTS
        //   set airTreatmentDirective to Standby and airCareStatus to Recovering
        api.airTreatmentDirective == AirTreatmentDirective.Standby &
        api.airCareStatus == AirCareStatus.Recovering
        // END INITIALIZES ENSURES
      )
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
        //   Disabled intent yields Standby directive and Off status
        (api.airCareIntent == AirCareIntent.Disabled) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.Off),
        // case CC_09_INVALID_PREFERENCE
        //   Invalid intent yields Standby directive and PreferenceFault status
        (api.airCareIntent == AirCareIntent.Invalid) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.PreferenceFault),
        // case CC_10_CONFIDENCE_MASK
        //   Enabled intent with untrusted confidence masks per sub-state
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence != MeasurementConfidence.Trusted) ___>: ((api.measurementConfidence == MeasurementConfidence.BlockedInvalid ___>:
          api.airTreatmentDirective == AirTreatmentDirective.Standby &
            api.airCareStatus == AirCareStatus.InputFault) &
          (api.measurementConfidence == MeasurementConfidence.Confirming ___>:
            api.airTreatmentDirective == AirTreatmentDirective.Standby &
              api.airCareStatus == AirCareStatus.Recovering)),
        // case CC_11_DEFENSIVE_INCONSISTENCY
        //   Enabled, trusted confidence, but an unknown assessment yields InputFault
        (api.airCareIntent == AirCareIntent.Enabled &
          api.measurementConfidence == MeasurementConfidence.Trusted &
          (api.airAssessment == AirAssessment.Unknown |
            api.humidityAssessment == HumidityAssessment.Unknown)) ___>: (api.airTreatmentDirective == AirTreatmentDirective.Standby &
          api.airCareStatus == AirCareStatus.InputFault),
        // case CC_12_TRUSTED_TREATMENT
        //   Enabled, trusted confidence, fully known assessments produce coordinated treatment
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
    val airCareIntent: Cabin_Air_Care_Supervisor.AirCareIntent.Type = api.get_airCareIntent().get
    val airAssessment: Cabin_Air_Care_Supervisor.AirAssessment.Type = api.get_airAssessment().get
    val humidityAssessment: Cabin_Air_Care_Supervisor.HumidityAssessment.Type = api.get_humidityAssessment().get
    val measurementConfidence: Cabin_Air_Care_Supervisor.MeasurementConfidence.Type = api.get_measurementConfidence().get

    airCareIntent match {
      case Cabin_Air_Care_Supervisor.AirCareIntent.Disabled =>
        api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
        api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Off)
      case Cabin_Air_Care_Supervisor.AirCareIntent.Invalid =>
        api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
        api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.PreferenceFault)
      case Cabin_Air_Care_Supervisor.AirCareIntent.Enabled =>
        measurementConfidence match {
          case Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted =>
            if (airAssessment == AirAssessment.Unknown | humidityAssessment == HumidityAssessment.Unknown) {
              api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
              api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.InputFault)
            } else {
              humidityAssessment match {
                case Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture =>
                  api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.HumidifyWithFilter)
                  api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Humidifying)
                case Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture =>
                  api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.DehumidifyWithFilter)
                  api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Dehumidifying)
                case Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget =>
                  airAssessment match {
                    case Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded =>
                      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Filter)
                      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Filtering)
                    case Cabin_Air_Care_Supervisor.AirAssessment.Acceptable =>
                      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
                      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Standby)
                    case Cabin_Air_Care_Supervisor.AirAssessment.Unknown =>
                      api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
                      api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.InputFault)
                  }
                case Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown =>
                  api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
                  api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.InputFault)
              }
            }
          case Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid =>
            api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
            api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.InputFault)
          case Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming =>
            api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
            api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Recovering)
        }
    }
  }

  def finalise(api: AirCarePolicySupervisor_Operational_Api): Unit = { }
}
