// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e15d189f8dec_2_Valid {
  @pure def check(
      evidenceout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryReportValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.inititialize_IEP_Post(evidenceout))) & T))
  }
}
