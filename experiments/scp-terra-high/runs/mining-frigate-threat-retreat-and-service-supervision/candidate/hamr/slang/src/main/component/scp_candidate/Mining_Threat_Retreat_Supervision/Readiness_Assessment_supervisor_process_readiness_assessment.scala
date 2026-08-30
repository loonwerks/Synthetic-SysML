// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Readiness_Assessment_supervisor_process_readiness_assessment {

  def initialise(api: Readiness_Assessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val assessment = Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue(F, F, F, F, F)
    api.put_assessment_mining(assessment)
    api.put_assessment_defense(assessment)
    api.put_assessment_mobility(assessment)
  }

  def timeTriggered(api: Readiness_Assessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_cargo_band(), api.get_capacitor_band(), api.get_location(),
      api.get_mining_available(), api.get_defense_available(),
      api.get_retreat_available(), api.get_destination_available(),
      api.get_service_available()) match {
      case (Some(cargo), Some(capacitor), Some(location), Some(miningAvailable),
            Some(defenseAvailable), Some(retreatAvailable), Some(destinationAvailable),
            Some(serviceAvailable)) =>
        val assessment = Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue(
          location.location_code == s32"0" & cargo.cargo_code != s32"2" &
            capacitor.capacitor_code == s32"1" & miningAvailable.available,
          location.location_code == s32"0" & capacitor.capacitor_code == s32"1" &
            defenseAvailable.available,
          location.location_code == s32"0" & retreatAvailable.available &
            destinationAvailable.available,
          cargo.cargo_code == s32"2",
          location.location_code == s32"1" & serviceAvailable.available &
            (cargo.cargo_code != s32"0" | capacitor.capacitor_code == s32"0"))
        api.put_assessment_mining(assessment)
        api.put_assessment_defense(assessment)
        api.put_assessment_mobility(assessment)
      case _ =>
        val assessment = Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue(F, F, F, F, F)
        api.put_assessment_mining(assessment)
        api.put_assessment_defense(assessment)
        api.put_assessment_mobility(assessment)
    }
  }

  def finalise(api: Readiness_Assessment_Operational_Api): Unit = { }
}
