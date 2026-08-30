// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_96773a3a6be3_4_Valid {
  @pure def check(
      factstolifecycle: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HomeFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HomeReportValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_GumboX.compute_CEP_Post(reportin, factstolifecycle, faulttoaggregation))) ___>: (T)) & T))
  }
}
