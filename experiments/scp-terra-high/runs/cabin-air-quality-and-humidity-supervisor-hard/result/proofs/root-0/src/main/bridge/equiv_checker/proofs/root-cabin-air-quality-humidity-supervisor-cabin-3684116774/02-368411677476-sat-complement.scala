// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_368411677476_2_Complement {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
      report_to_filter: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      report_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      in_airtrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type,
      airtrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_GumboX.compute_CEP_Post(in_airtrustmemory, airtrustmemory, evidence, report_to_filter, report_to_status))) & T)))
  }
}
