// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatchAssessment_acquisition_process_batch_assessment {

  def initialise(api: BatchAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_batch_facts(EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH)
  }

  def timeTriggered(api: BatchAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val signal: EIT_Acquisition_Supervisor.BatchSignal.Type = api.get_batch_signal().get
    var facts: EIT_Acquisition_Supervisor.BatchFacts.Type = EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT
    if (signal == EIT_Acquisition_Supervisor.BatchSignal.COMPLETE) {
      facts = EIT_Acquisition_Supervisor.BatchFacts.USABLE
    } else if (signal == EIT_Acquisition_Supervisor.BatchSignal.INCOMPLETE) {
      facts = EIT_Acquisition_Supervisor.BatchFacts.INCOMPLETE
    } else if (signal == EIT_Acquisition_Supervisor.BatchSignal.CORRUPT) {
      facts = EIT_Acquisition_Supervisor.BatchFacts.FAILED
    } else if (signal == EIT_Acquisition_Supervisor.BatchSignal.NONE) {
      facts = EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH
    }
    api.put_batch_facts(facts)
  }

  def finalise(api: BatchAssessment_Operational_Api): Unit = { }
}
