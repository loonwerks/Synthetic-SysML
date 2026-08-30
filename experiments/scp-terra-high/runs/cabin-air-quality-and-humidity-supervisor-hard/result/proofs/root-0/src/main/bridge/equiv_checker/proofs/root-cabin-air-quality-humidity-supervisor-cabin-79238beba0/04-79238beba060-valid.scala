// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_79238beba060_4_Valid {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
      report_to_filter: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      report_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      airtrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_GumboX.inititialize_IEP_Post(airtrustmemory, report_to_filter, report_to_status))) ___>: (T)) & T))
  }
}
