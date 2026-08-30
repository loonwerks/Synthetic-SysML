// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bfd0b2fe3dd2_4_Valid {
  @pure def check(
      factstolifecycle: equiv_shared_0.Drone_Lifecycle_Energy_Governor.TouchdownFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.TouchdownReportValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_GumboX.inititialize_IEP_Post(factstolifecycle, faulttoaggregation))) ___>: (T)) & T))
  }
}
