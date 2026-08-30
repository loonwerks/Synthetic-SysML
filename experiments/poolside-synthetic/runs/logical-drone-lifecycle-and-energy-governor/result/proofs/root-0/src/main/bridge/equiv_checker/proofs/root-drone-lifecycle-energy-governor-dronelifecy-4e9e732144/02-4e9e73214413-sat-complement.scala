// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4e9e73214413_2_Complement {
  @pure def check(
      evidenceout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryReportValue): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, evidenceout))) & T)))
  }
}
