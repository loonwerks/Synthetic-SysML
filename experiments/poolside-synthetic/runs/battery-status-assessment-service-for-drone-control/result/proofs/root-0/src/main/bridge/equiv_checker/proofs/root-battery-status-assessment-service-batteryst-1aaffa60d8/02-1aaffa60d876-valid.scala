// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1aaffa60d876_2_Valid {
  @pure def check(
      captured_report: equiv_shared_0.Battery_Status_Assessment_Service.CapturedReport,
      qualified_evidence: equiv_shared_0.Battery_Status_Assessment_Service.TaggedQualifiedEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_Candidate_GumboX.inititialize_IEP_Post(qualified_evidence))) ___>: (equiv_shared_0.Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_GumboX.inititialize_IEP_Post(qualified_evidence))) & T))
  }
}
