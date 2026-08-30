// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_4fc82d8b37d9_Candidate_Pointwise_Realizable {
  @pure def check(
      defrostloadallowance: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type,
      electricalinterfacestatus: equiv_shared_0.Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Candidate_GumboX.compute_CEP_Post(defrostloadallowance, electricalinterfacestatus, equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible)) |
        (equiv_shared_0.Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Candidate_GumboX.compute_CEP_Post(defrostloadallowance, electricalinterfacestatus, equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedUnavailable)) |
        (equiv_shared_0.Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Candidate_GumboX.compute_CEP_Post(defrostloadallowance, electricalinterfacestatus, equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedRestricted)))))
  }
}
