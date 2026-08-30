// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2d952425ef45_4_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      aircareintent: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareIntent.Type,
      aircarestatus: equiv_shared_0.Cabin_Air_Care_Supervisor.AirCareStatus.Type,
      airtreatmentdirective: equiv_shared_0.Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Type,
      measurementconfidence: equiv_shared_0.Cabin_Air_Care_Supervisor.MeasurementConfidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_GumboX.inititialize_IEP_Post(aircarestatus, airtreatmentdirective))) ___>: (equiv_shared_0.Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_Candidate_GumboX.inititialize_IEP_Post(aircarestatus, airtreatmentdirective))) & T))
  }
}
