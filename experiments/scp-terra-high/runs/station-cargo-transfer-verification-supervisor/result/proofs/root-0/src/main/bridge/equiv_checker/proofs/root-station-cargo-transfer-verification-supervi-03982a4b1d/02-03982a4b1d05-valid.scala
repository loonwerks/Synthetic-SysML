// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_03982a4b1d05_2_Valid {
  @pure def check(
      gateeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      servicecondition: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_Candidate_GumboX.inititialize_IEP_Post(gateeligibility, serviceeligibility))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_GumboX.inititialize_IEP_Post(gateeligibility, serviceeligibility))) & T))
  }
}
