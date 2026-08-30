// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_161485fe9427_2_Valid {
  @pure def check(
      readinesscontext: equiv_shared_0.Cabin_Air_Treatment_Supervisor.ReadinessContext.Type,
      treatmentequipmentstatus: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_GumboX.inititialize_IEP_Post(readinesscontext, treatmentreadiness))) & T))
  }
}
