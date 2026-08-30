// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1aaffa60d876_1_Valid {
  @pure def check(
      captured_report: equiv_shared_0.Battery_Status_Assessment_Service.CapturedReport,
      qualified_evidence: equiv_shared_0.Battery_Status_Assessment_Service.TaggedQualifiedEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
