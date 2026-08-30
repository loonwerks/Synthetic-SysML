// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5fa3475c76b4_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Proposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Proposal.D_Inv_Mission_Proposal(value))) ___>: (T)) & T))
  }
}
