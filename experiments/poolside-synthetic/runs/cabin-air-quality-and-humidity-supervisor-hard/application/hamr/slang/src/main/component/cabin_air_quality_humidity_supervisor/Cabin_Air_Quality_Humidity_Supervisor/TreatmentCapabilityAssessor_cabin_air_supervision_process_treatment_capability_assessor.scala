// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor {

  def initialise(api: TreatmentCapabilityAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_filter_facts(Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts.example())
    api.put_humidity_facts(Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts.example())
    api.put_blower_fact(Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact.example())
    api.put_capability_set(Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet.example())
  }

  def timeTriggered(api: TreatmentCapabilityAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_readiness: Option[Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness] = api.get_readiness()
    api.logInfo(s"Received on data port readiness: ${apiUsage_readiness}")
  }

  def finalise(api: TreatmentCapabilityAssessor_Operational_Api): Unit = { }
}
