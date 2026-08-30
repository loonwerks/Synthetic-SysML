// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ea71e86fb942_4_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      aircareintent: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareIntent.Type,
      aircarestatus: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareStatus.Type,
      airtreatmentdirective: equiv_shared_0.Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Type,
      measurementconfidence: equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_GumboX.compute_CEP_Post(airassessment, aircareintent, humidityassessment, measurementconfidence, aircarestatus, airtreatmentdirective))) ___>: (equiv_shared_0.Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_Candidate_GumboX.compute_CEP_Post(airassessment, aircareintent, humidityassessment, measurementconfidence, aircarestatus, airtreatmentdirective))) & T))
  }
}
