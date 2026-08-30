// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9e17b2005712_4_Valid {
  @pure def check(
      admissiontomaterial: equiv_shared_0.Factory_Flow.AdmissionFact,
      admissiontopriority: equiv_shared_0.Factory_Flow.AdmissionFact,
      presentedwork: equiv_shared_0.Factory_Flow.PresentedWorkRequest): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_GumboX.compute_CEP_Post(presentedwork, admissiontomaterial, admissiontopriority))) ___>: (equiv_shared_0.Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_Candidate_GumboX.compute_CEP_Post(presentedwork, admissiontomaterial, admissiontopriority))) & T))
  }
}
