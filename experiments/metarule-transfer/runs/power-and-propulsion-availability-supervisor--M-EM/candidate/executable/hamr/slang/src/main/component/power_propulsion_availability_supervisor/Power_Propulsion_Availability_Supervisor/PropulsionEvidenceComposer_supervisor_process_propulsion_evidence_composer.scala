// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer {

  def initialise(api: PropulsionEvidenceComposer_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_propulsion_assessment(Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP)
  }

  def timeTriggered(api: PropulsionEvidenceComposer_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_13_PROPULSION_READY
        (api.odd_engine_assessment == EnginePairAssessment.READY_NONE &
          api.even_engine_assessment == EnginePairAssessment.READY_NONE &
          api.configuration_assessment == ConfigurationAssessment.READY_NONE) ___>: (api.propulsion_assessment == PropulsionAssessment.READY_NONE),
        // case CASE_14_PROPULSION_NOT_READY
        (api.odd_engine_assessment != EnginePairAssessment.READY_NONE |
          api.even_engine_assessment != EnginePairAssessment.READY_NONE |
          api.configuration_assessment != ConfigurationAssessment.READY_NONE) ___>: (api.odd_engine_assessment != EnginePairAssessment.READY_NONE &
          api.propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP |
          api.odd_engine_assessment == EnginePairAssessment.READY_NONE &
            api.even_engine_assessment != EnginePairAssessment.READY_NONE &
            api.propulsion_assessment == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP |
          api.odd_engine_assessment == EnginePairAssessment.READY_NONE &
            api.even_engine_assessment == EnginePairAssessment.READY_NONE &
            api.configuration_assessment != ConfigurationAssessment.READY_NONE &
            api.propulsion_assessment == PropulsionAssessment.NOT_READY_CONFIGURATION)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val odd: EnginePairAssessment.Type = api.get_odd_engine_assessment().get
    val even: EnginePairAssessment.Type = api.get_even_engine_assessment().get
    val config: ConfigurationAssessment.Type = api.get_configuration_assessment().get
    api.put_propulsion_assessment(
      if (odd != EnginePairAssessment.READY_NONE) PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP
      else if (even != EnginePairAssessment.READY_NONE) PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP
      else if (config != ConfigurationAssessment.READY_NONE) PropulsionAssessment.NOT_READY_CONFIGURATION
      else PropulsionAssessment.READY_NONE)
  }

  def finalise(api: PropulsionEvidenceComposer_Operational_Api): Unit = { }
}
