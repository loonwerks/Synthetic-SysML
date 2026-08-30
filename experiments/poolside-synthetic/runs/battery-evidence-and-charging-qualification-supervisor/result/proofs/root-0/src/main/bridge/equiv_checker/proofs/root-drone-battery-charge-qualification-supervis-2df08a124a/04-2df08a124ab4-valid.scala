// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2df08a124ab4_4_Valid {
  @pure def check(
      attentionin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution,
      faultsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      flightcontrolnoticeout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type,
      pilotnoticeout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type,
      sessionin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SessionResolution): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_GumboX.inititialize_IEP_Post(flightcontrolnoticeout, pilotnoticeout))) ___>: (T)) & T))
  }
}
