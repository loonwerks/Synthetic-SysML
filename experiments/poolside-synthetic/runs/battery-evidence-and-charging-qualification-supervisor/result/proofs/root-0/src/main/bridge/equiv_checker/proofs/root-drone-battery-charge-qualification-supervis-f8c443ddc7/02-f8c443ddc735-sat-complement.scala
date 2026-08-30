// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f8c443ddc735_2_Complement {
  @pure def check(
      chargeauthorizationout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type,
      faultsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      pilotstatusout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PilotStatus,
      publicfactsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_GumboX.inititialize_IEP_Post(chargeauthorizationout, pilotstatusout))) & T)))
  }
}
