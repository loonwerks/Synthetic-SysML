// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_65d8ec936d74_Oracle_Pointwise_Realizable {
  @pure def check(
      batch_signal: equiv_shared_0.EIT_Acquisition_Supervisor.BatchSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.USABLE)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.INCOMPLETE)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.FAILED)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT)))))
  }
}
