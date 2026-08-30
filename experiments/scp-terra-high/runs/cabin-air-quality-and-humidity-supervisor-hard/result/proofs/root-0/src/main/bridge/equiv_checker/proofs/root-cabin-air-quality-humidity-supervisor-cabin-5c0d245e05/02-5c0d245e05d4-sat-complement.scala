// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c0d245e05d4_2_Complement {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      air_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      capabilities: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts,
      proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_GumboX.compute_CEP_Post(accepted, air_report, capabilities, proposal))) & T)))
  }
}
