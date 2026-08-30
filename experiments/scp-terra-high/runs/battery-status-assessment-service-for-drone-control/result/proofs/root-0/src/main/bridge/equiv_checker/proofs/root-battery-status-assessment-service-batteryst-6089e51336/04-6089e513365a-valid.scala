// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6089e513365a_4_Valid {
  @pure def check(
      captured_report: equiv_shared_0.Battery_Status_Assessment_Service.CapturedReport,
      qualified_evidence: equiv_shared_0.Battery_Status_Assessment_Service.TaggedQualifiedEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_GumboX.compute_CEP_Post(captured_report, qualified_evidence))) ___>: (equiv_shared_0.Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_Candidate_GumboX.compute_CEP_Post(captured_report, qualified_evidence))) & T))
  }
}
