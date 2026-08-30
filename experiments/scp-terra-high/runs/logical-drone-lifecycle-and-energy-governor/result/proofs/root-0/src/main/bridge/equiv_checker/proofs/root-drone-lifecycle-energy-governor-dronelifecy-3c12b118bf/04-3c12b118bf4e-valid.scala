// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3c12b118bf4e_4_Valid {
  @pure def check(
      airbornerequestin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type,
      chargeeligibilityin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility,
      hazardproposalin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HazardProposal,
      homefactsin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HomeFacts,
      readinessin: B,
      resolutionout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.LifecycleResolution,
      semanticsin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest,
      touchdownfactsin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.TouchdownFacts,
      phasestate: equiv_shared_0.Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_GumboX.inititialize_IEP_Post(phasestate, resolutionout))) ___>: (T)) & T))
  }
}
