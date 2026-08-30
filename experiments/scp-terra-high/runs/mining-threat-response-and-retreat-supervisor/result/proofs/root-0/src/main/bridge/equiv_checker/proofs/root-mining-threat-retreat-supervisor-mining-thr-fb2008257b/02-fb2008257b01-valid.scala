// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fb2008257b01_2_Valid {
  @pure def check(
      fault: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Fault_Fact,
      mission_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts,
      phase_context: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context,
      resource_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Invalidity,
      threat_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Invalidity): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_GumboX.inititialize_IEP_Post(fault))) & T))
  }
}
