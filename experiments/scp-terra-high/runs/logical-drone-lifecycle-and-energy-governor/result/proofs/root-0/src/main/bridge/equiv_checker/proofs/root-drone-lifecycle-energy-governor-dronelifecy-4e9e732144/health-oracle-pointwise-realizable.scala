// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_4e9e73214413_Oracle_Pointwise_Realizable {
  @pure def check(
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryReportValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.FULL, validBand = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.FULL, validBand = T))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.MEDIUM, validBand = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.MEDIUM, validBand = T))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.LOW, validBand = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.LOW, validBand = T))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL, validBand = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence(band = equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL, validBand = T))))))
  }
}
