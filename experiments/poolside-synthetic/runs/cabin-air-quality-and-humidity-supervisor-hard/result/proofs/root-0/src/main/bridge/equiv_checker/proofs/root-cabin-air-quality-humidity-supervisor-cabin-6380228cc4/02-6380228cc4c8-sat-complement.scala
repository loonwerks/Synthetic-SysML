// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6380228cc4c8_2_Complement {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      capabilities: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts,
      humidity_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_GumboX.inititialize_IEP_Post(proposal))) & T)))
  }
}
