// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6175a23e1da0_3_Valid {
  @pure def check(
      readinesscontext: equiv_shared_0.Cabin_Air_Treatment_Supervisor.ReadinessContext.Type,
      treatmentequipmentstatus: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
