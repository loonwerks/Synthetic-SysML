// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PreparationAssessment_acquisition_process_preparation_assessment {

  def initialise(api: PreparationAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_preparation_facts(EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT)
  }

  def timeTriggered(api: PreparationAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val observation: EIT_Acquisition_Supervisor.PreparationObservation.Type = api.get_preparation_observation().get
    var facts: EIT_Acquisition_Supervisor.PreparationFacts.Type = EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT
    if (observation == EIT_Acquisition_Supervisor.PreparationObservation.READY) {
      facts = EIT_Acquisition_Supervisor.PreparationFacts.READY
    } else if (observation == EIT_Acquisition_Supervisor.PreparationObservation.NOT_APPLIED ||
      observation == EIT_Acquisition_Supervisor.PreparationObservation.CALIBRATION_NOT_PERFORMED) {
      facts = EIT_Acquisition_Supervisor.PreparationFacts.NOT_READY
    } else if (observation == EIT_Acquisition_Supervisor.PreparationObservation.CALIBRATION_FAILED) {
      facts = EIT_Acquisition_Supervisor.PreparationFacts.FAILED
    }
    api.put_preparation_facts(facts)
  }

  def finalise(api: PreparationAssessment_Operational_Api): Unit = { }
}
