// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6c3f7b8c42ff_1_Valid {
  @pure def check(
      contactevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.ContactEvidence,
      identificationevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.IdentificationEvidence,
      qualifiedthreat: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
