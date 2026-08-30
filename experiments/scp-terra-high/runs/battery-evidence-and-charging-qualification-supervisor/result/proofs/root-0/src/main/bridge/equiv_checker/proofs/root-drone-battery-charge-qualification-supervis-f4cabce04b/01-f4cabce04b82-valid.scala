// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f4cabce04b82_1_Valid {
  @pure def check(
      advisoryin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts,
      attentionclearedin: B,
      publicfactsout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts,
      requestin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type,
      sessionin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SessionResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
