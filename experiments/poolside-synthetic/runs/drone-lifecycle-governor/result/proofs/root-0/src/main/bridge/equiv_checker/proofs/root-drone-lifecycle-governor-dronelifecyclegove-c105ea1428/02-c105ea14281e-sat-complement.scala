// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c105ea14281e_2_Complement {
  @pure def check(
      arbitratedintent: equiv_shared_0.Drone_Lifecycle_Governor.ArbitratedIntent,
      currentlifecyclestate: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleState.Type,
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      eligibilityenvelope: equiv_shared_0.Drone_Lifecycle_Governor.EligibilityEnvelope,
      committedlifecyclestate: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_GumboX.inititialize_IEP_Post(committedlifecyclestate, currentlifecyclestate, decisionsnapshot))) & T)))
  }
}
