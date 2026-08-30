// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_421b093424a9_2_Valid {
  @pure def check(
      factstocharge: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_GumboX.inititialize_IEP_Post(factstocharge, faulttoaggregation))) & T))
  }
}
