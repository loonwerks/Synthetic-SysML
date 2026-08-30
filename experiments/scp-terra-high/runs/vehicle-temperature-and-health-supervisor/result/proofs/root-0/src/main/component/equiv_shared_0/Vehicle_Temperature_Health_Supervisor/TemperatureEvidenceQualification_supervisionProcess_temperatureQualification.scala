// #Sireum

package equiv_shared_0.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import equiv_shared_0._

object TemperatureEvidenceQualification_supervisionProcess_temperatureQualification {
  // BEGIN FUNCTIONS
  @strictpure def qualifyTemperature(sample: Vehicle_Temperature_Health_Supervisor.TemperatureSample): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type = if (sample.status == InputStatus.Invalid) TemperatureAssessment.InvalidTemperature else if (sample.relation == TemperatureRelation.AtOrBelowMaximum) TemperatureAssessment.NominalTemperature else TemperatureAssessment.OverTemperature
  // END FUNCTIONS
}
