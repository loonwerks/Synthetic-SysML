// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_34c82d08ae22_2_Valid {
  @pure def check(
      maintenanceassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      proposalforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type,
      proposalforoutcomes: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type,
      rawreturn: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.ReturnSample,
      temperatureassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_Candidate_GumboX.inititialize_IEP_Post(proposalforarbitration, proposalforoutcomes))) ___>: (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_GumboX.inititialize_IEP_Post(proposalforarbitration, proposalforoutcomes))) & T))
  }
}
