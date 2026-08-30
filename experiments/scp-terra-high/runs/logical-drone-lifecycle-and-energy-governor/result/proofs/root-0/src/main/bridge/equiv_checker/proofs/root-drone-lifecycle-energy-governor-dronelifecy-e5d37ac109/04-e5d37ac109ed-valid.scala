// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e5d37ac109ed_4_Valid {
  @pure def check(
      factstolifecycle: equiv_shared_0.Drone_Lifecycle_Energy_Governor.TouchdownFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.TouchdownReportValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_GumboX.compute_CEP_Post(reportin, factstolifecycle, faulttoaggregation))) ___>: (T)) & T))
  }
}
