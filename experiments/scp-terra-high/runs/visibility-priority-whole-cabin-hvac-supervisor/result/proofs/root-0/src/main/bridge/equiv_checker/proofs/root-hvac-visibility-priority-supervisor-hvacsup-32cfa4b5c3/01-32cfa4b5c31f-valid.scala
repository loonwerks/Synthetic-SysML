// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_32cfa4b5c31f_1_Valid {
  @pure def check(
      arbitrationstatus: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ArbitrationStatus,
      cabinairproposal: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CabinAirProposal,
      qualifiedrequest: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedRequest,
      recoveryreport: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryReport,
      selectedintent: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.SelectedIntent,
      thermalproposal: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalProposal,
      visibilityproposal: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityProposal,
      authorization: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.Authorization.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
