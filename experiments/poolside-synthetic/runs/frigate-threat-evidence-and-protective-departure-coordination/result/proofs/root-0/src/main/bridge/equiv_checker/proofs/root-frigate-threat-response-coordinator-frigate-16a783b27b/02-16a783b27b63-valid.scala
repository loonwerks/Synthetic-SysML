// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_16a783b27b63_2_Valid {
  @pure def check(
      clearacknowledgmentin: B,
      compositionalertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      defensealertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      escapealertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      qualifiedthreatin: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat,
      threatreportout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatReport.Type,
      retainedalert: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_GumboX.inititialize_IEP_Post(retainedalert, compositionalertout, defensealertout, escapealertout, threatreportout))) & T))
  }
}
