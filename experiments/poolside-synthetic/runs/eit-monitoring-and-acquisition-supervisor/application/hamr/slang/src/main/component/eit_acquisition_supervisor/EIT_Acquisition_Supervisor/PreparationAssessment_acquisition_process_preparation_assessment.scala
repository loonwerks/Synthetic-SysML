// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreparationAssessment_acquisition_process_preparation_assessment {

  def initialise(api: PreparationAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_preparation_facts(EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT)
  }

  def timeTriggered(api: PreparationAssessment_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val preparation_observation: EIT_Acquisition_Supervisor.PreparationObservation.Type =
      api.get_preparation_observation() match {
        case Some(v: EIT_Acquisition_Supervisor.PreparationObservation.Type) => v
        case _ => EIT_Acquisition_Supervisor.PreparationObservation.READY
      }

    val preparation_facts: EIT_Acquisition_Supervisor.PreparationFacts.Type = preparation_observation match {
      case EIT_Acquisition_Supervisor.PreparationObservation.READY => EIT_Acquisition_Supervisor.PreparationFacts.READY
      case EIT_Acquisition_Supervisor.PreparationObservation.NOT_APPLIED => EIT_Acquisition_Supervisor.PreparationFacts.NOT_READY
      case EIT_Acquisition_Supervisor.PreparationObservation.CALIBRATION_NOT_PERFORMED => EIT_Acquisition_Supervisor.PreparationFacts.NOT_READY
      case EIT_Acquisition_Supervisor.PreparationObservation.CALIBRATION_FAILED => EIT_Acquisition_Supervisor.PreparationFacts.FAILED
      case EIT_Acquisition_Supervisor.PreparationObservation.INVALID_BELT_STATUS => EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT
      case EIT_Acquisition_Supervisor.PreparationObservation.INVALID_CALIBRATION_STATUS => EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT
    }

    api.put_preparation_facts(preparation_facts)
  }

  def finalise(api: PreparationAssessment_Operational_Api): Unit = { }
}
