// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ff0af95bcd65_1_Valid {
  @pure def check(
      defrostselection: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostSelection.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type,
      requestvalidity: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestValidity.Type,
      requestmemory: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestMemory.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
