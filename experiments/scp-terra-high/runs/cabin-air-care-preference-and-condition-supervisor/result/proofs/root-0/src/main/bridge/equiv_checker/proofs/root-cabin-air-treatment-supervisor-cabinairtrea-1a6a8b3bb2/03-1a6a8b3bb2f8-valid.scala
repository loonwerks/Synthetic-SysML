// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1a6a8b3bb2f8_3_Valid {
  @pure def check(
      aircareselection: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCareSelection.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      requestvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestValidity.Type,
      requestmemory: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestMemory.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
