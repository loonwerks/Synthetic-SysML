// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f020d1d3be77_4_Valid {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type,
      report_to_humidity: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      report_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      in_humiditytrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type,
      humiditytrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_GumboX.compute_CEP_Post(in_humiditytrustmemory, humiditytrustmemory, evidence, report_to_humidity, report_to_status))) ___>: (T)) & T))
  }
}
