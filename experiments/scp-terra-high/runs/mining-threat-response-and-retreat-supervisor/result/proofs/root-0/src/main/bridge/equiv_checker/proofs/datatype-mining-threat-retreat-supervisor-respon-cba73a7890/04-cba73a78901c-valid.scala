// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cba73a78901c_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Response_Proposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Response_Proposal.D_Inv_Response_Proposal(value))) ___>: (T)) & T))
  }
}
