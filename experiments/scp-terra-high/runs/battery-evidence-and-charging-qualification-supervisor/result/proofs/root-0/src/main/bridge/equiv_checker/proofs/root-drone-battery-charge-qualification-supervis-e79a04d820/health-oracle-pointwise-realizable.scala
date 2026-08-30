// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_e79a04d82037_Oracle_Pointwise_Realizable {
  @pure def check(
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = F, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Suppressed))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = F, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Full))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = F, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Nominal))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = F, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Low))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = F, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Critical))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = T, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Suppressed))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = T, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Full))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = T, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Nominal))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = T, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Low))) |
        (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence = T, band = equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Critical))))))
  }
}
