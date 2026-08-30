// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_745d16699232_2_Valid {
  @pure def check(
      assessmentforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      assessmentforrecovery: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      rawtemperature: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_Candidate_GumboX.inititialize_IEP_Post(assessmentforarbitration, assessmentforrecovery))) ___>: (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_GumboX.inititialize_IEP_Post(assessmentforarbitration, assessmentforrecovery))) & T))
  }
}
