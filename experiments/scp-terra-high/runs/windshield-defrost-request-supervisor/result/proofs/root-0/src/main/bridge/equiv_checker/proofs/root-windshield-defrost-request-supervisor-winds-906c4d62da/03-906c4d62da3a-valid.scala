// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_906c4d62da3a_3_Valid {
  @pure def check(
      driverdefroststatus: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type,
      policydisposition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
