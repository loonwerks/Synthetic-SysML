// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a8da942da549_4_Valid {
  @pure def check(
      chargeauthorizationout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type,
      faultsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      pilotstatusout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PilotStatus,
      publicfactsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_GumboX.compute_CEP_Post(faultsin, publicfactsin, chargeauthorizationout, pilotstatusout))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_Candidate_GumboX.compute_CEP_Post(faultsin, publicfactsin, chargeauthorizationout, pilotstatusout))) & T))
  }
}
