// #Sireum

package scp_candidate.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TemperatureEvidenceQualification_supervisionProcess_temperatureQualification {

  // BEGIN FUNCTIONS
  @strictpure def qualifyTemperature(sample: Vehicle_Temperature_Health_Supervisor.TemperatureSample): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type = if (sample.status == InputStatus.Invalid) TemperatureAssessment.InvalidTemperature else if (sample.relation == TemperatureRelation.AtOrBelowMaximum) TemperatureAssessment.NominalTemperature else TemperatureAssessment.OverTemperature
  // END FUNCTIONS

  def initialise(api: TemperatureEvidenceQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_TEMPERATURE_UNTRUSTED
        api.assessmentForRecovery == TemperatureAssessment.InvalidTemperature &&
          api.assessmentForArbitration == TemperatureAssessment.InvalidTemperature
        // END INITIALIZES ENSURES
      )
    )
    api.put_assessmentForRecovery(TemperatureAssessment.InvalidTemperature)
    api.put_assessmentForArbitration(TemperatureAssessment.InvalidTemperature)
  }

  def timeTriggered(api: TemperatureEvidenceQualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.assessmentForRecovery == qualifyTemperature(api.rawTemperature) &&
          api.assessmentForArbitration == qualifyTemperature(api.rawTemperature)
      )
    )
    val assessment = qualifyTemperature(api.get_rawTemperature().get)
    api.put_assessmentForRecovery(assessment)
    api.put_assessmentForArbitration(assessment)
  }

  def finalise(api: TemperatureEvidenceQualification_Operational_Api): Unit = { }
}
