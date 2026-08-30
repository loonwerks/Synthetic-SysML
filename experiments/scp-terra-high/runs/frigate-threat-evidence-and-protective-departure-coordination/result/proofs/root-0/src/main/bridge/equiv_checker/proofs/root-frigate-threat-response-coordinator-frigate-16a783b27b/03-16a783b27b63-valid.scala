// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_16a783b27b63_3_Valid {
  @pure def check(
      clearacknowledgmentin: B,
      compositionalertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      defensealertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      escapealertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      qualifiedthreatin: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat,
      threatreportout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatReport.Type,
      retainedalert: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
