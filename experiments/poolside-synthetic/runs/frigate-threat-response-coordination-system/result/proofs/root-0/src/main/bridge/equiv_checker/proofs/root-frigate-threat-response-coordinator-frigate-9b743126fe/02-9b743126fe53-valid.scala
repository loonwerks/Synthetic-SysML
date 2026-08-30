// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9b743126fe53_2_Valid {
  @pure def check(
      reportacknowledgment: equiv_shared_0.Frigate_Threat_Response_Coordinator.ReportAcknowledgment,
      responserecord: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseRecord,
      threatreport: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatReport): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_GumboX.compute_CEP_Post(reportacknowledgment, responserecord, threatreport))) & T))
  }
}
