// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f3e5de56bb3e_2_Complement {
  @pure def check(
      admissiontomaterial: equiv_shared_0.Factory_Flow.AdmissionFact,
      admissiontopriority: equiv_shared_0.Factory_Flow.AdmissionFact,
      presentedwork: equiv_shared_0.Factory_Flow.PresentedWorkRequest): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_GumboX.inititialize_IEP_Post(admissiontomaterial, admissiontopriority))) & T)))
  }
}
