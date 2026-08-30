// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_864bb2f94ef3_2_Valid {
  @pure def check(
      requestin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type,
      semanticstoairborne: equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest,
      semanticstolifecycle: equiv_shared_0.Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_GumboX.compute_CEP_Post(requestin, semanticstoairborne, semanticstolifecycle))) & T))
  }
}
