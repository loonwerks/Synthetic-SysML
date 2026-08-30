// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_40cac2861758_2_Valid {
  @pure def check(
      arbitratedintent: equiv_shared_0.Drone_Lifecycle_Governor.ArbitratedIntent,
      currentlifecyclestate: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleState.Type,
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      eligibilityenvelope: equiv_shared_0.Drone_Lifecycle_Governor.EligibilityEnvelope,
      in_committedlifecyclestate: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleState.Type,
      committedlifecyclestate: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_Candidate_GumboX.compute_CEP_Post(in_committedlifecyclestate, committedlifecyclestate, arbitratedintent, eligibilityenvelope, currentlifecyclestate, decisionsnapshot))) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_GumboX.compute_CEP_Post(in_committedlifecyclestate, committedlifecyclestate, arbitratedintent, eligibilityenvelope, currentlifecyclestate, decisionsnapshot))) & T))
  }
}
