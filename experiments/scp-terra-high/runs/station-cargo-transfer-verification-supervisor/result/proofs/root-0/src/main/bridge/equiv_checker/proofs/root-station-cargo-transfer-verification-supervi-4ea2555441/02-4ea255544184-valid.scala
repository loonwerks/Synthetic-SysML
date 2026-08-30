// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ea255544184_2_Valid {
  @pure def check(
      gateeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      servicecondition: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_Candidate_GumboX.compute_CEP_Post(servicecondition, gateeligibility, serviceeligibility))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_GumboX.compute_CEP_Post(servicecondition, gateeligibility, serviceeligibility))) & T))
  }
}
