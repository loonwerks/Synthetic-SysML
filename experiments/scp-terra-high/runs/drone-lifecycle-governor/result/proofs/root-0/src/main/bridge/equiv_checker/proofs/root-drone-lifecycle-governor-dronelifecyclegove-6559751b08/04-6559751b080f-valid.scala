// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6559751b080f_4_Valid {
  @pure def check(
      batteryqualification: equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.Type,
      chargerstate: equiv_shared_0.Drone_Lifecycle_Governor.ChargerState.Type,
      currentlifecyclestate: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleState.Type,
      eligibilityenvelope: equiv_shared_0.Drone_Lifecycle_Governor.EligibilityEnvelope,
      flightqualification: equiv_shared_0.Drone_Lifecycle_Governor.FlightQualification.Type,
      recoveryproposal: equiv_shared_0.Drone_Lifecycle_Governor.RecoveryProposal.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_GumboX.compute_CEP_Post(batteryqualification, chargerstate, currentlifecyclestate, flightqualification, eligibilityenvelope, recoveryproposal))) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_Candidate_GumboX.compute_CEP_Post(batteryqualification, chargerstate, currentlifecyclestate, flightqualification, eligibilityenvelope, recoveryproposal))) & T))
  }
}
