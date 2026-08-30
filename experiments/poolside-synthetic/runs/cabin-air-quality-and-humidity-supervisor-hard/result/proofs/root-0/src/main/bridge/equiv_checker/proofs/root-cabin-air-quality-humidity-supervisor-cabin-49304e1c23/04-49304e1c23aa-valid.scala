// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_49304e1c23aa_4_Valid {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_GumboX.compute_CEP_Post(observation, evidence))) ___>: (T)) & T))
  }
}
