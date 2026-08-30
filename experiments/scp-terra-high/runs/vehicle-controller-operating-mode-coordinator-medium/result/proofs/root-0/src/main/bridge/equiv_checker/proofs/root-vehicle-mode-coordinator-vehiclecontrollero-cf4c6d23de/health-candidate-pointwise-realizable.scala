// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_cf4c6d23de99_Candidate_Pointwise_Realizable {
  @pure def check(
      arbitrationresult: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      currentmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedStay)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoOff)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoStarting)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoOn)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoMaintenance)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoDegraded)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedResumeStored)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Candidate_GumboX.compute_CEP_Post(arbitrationresult, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedReject)))))
  }
}
