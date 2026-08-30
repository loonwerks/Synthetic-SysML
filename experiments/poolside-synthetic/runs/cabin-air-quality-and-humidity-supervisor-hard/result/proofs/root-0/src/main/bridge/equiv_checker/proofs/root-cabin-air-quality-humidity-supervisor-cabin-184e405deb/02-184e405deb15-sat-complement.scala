// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_184e405deb15_2_Complement {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_GumboX.inititialize_IEP_Post(evidence))) & T)))
  }
}
