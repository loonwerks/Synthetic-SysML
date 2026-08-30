// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_49ee2dc6f5c5_2_Valid {
  @pure def check(
      actuationplan: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CabinActuationPlan,
      arbitrationstatus: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ArbitrationStatus,
      candidateplan: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CandidatePlan,
      recoveryreport: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryReport,
      supervisorstatus: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.SupervisorStatus): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_GumboX.inititialize_IEP_Post(actuationplan, supervisorstatus))) & T))
  }
}
