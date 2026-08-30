// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4fc82d8b37d9_4_Valid {
  @pure def check(
      defrosteligibility: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type,
      defrostloadallowance: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type,
      electricalinterfacestatus: equiv_shared_0.Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_GumboX.compute_CEP_Post(defrostloadallowance, electricalinterfacestatus, defrosteligibility))) ___>: (equiv_shared_0.Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Candidate_GumboX.compute_CEP_Post(defrostloadallowance, electricalinterfacestatus, defrosteligibility))) & T))
  }
}
