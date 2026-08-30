// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_161485fe9427_1_Valid {
  @pure def check(
      readinesscontext: equiv_shared_0.Cabin_Air_Treatment_Supervisor.ReadinessContext.Type,
      treatmentequipmentstatus: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
