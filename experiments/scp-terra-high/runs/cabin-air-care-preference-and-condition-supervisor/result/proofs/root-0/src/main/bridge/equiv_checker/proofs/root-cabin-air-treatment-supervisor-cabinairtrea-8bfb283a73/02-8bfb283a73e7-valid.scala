// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8bfb283a73e7_2_Valid {
  @pure def check(
      aircaresupervisorstatus: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus,
      airproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.Type,
      airtreatmentcommand: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Type,
      humidityproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.Type,
      recoverygate: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_Candidate_GumboX.compute_CEP_Post(airproposal, humidityproposal, recoverygate, requestintent, aircaresupervisorstatus, airtreatmentcommand))) ___>: (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_GumboX.compute_CEP_Post(airproposal, humidityproposal, recoverygate, requestintent, aircaresupervisorstatus, airtreatmentcommand))) & T))
  }
}
