// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_184e405deb15_3_Valid {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
