// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer {

  def initialise(api: AuthoritySafePlanComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_composition_to_status(Cabin_Air_Quality_Humidity_Supervisor.CompositionReport.example())
    api.put_treatment_plan(Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan.example())
  }

  def timeTriggered(api: AuthoritySafePlanComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: AuthoritySafePlanComposer_Operational_Api): Unit = { }
}
