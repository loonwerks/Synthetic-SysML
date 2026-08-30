// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d03ae7bb8f78_1_Valid {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type,
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
