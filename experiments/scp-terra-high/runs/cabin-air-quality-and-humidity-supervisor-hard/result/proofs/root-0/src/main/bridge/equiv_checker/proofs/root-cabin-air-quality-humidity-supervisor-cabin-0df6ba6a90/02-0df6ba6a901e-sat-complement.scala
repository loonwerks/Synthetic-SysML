// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0df6ba6a901e_2_Complement {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type,
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.compute_CEP_Post(observation, evidence))) & T)))
  }
}
