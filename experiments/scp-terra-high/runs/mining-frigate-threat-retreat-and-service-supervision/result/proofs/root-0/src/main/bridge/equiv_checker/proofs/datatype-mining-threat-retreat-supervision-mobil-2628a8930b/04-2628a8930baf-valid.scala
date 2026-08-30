// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2628a8930baf_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.MobilityProposalValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.MobilityProposalValue.D_Inv_MobilityProposalValue(value))) ___>: (T)) & T))
  }
}
