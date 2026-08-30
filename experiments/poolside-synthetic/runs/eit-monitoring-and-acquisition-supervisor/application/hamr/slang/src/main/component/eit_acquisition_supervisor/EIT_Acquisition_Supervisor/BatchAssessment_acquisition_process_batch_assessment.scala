// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatchAssessment_acquisition_process_batch_assessment {

  def initialise(api: BatchAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_batch_facts(EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH)
  }

  def timeTriggered(api: BatchAssessment_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val batch_signal: EIT_Acquisition_Supervisor.BatchSignal.Type =
      api.get_batch_signal() match {
        case Some(v: EIT_Acquisition_Supervisor.BatchSignal.Type) => v
        case _ => EIT_Acquisition_Supervisor.BatchSignal.NONE
      }

    val batch_facts: EIT_Acquisition_Supervisor.BatchFacts.Type = batch_signal match {
      case EIT_Acquisition_Supervisor.BatchSignal.NONE => EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH
      case EIT_Acquisition_Supervisor.BatchSignal.COMPLETE => EIT_Acquisition_Supervisor.BatchFacts.USABLE
      case EIT_Acquisition_Supervisor.BatchSignal.INCOMPLETE => EIT_Acquisition_Supervisor.BatchFacts.INCOMPLETE
      case EIT_Acquisition_Supervisor.BatchSignal.CORRUPT => EIT_Acquisition_Supervisor.BatchFacts.FAILED
      case EIT_Acquisition_Supervisor.BatchSignal.INVALID_BATCH_KIND => EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT
      case EIT_Acquisition_Supervisor.BatchSignal.INVALID_BATCH_STATUS => EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT
    }

    api.put_batch_facts(batch_facts)
  }

  def finalise(api: BatchAssessment_Operational_Api): Unit = { }
}
