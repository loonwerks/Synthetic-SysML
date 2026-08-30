// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1c1bdc05d514_2_Complement {
  @pure def check(
      factstocharge: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerReport.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_GumboX.compute_CEP_Post(reportin, factstocharge, faulttoaggregation))) & T)))
  }
}
