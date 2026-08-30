// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a496e3fc46da_2_Complement {
  @pure def check(
      appliedresolution: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      arbitrationresult: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      coordinationoutcome: equiv_shared_0.Vehicle_Mode_Coordinator.CoordinationOutcome): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_GumboX.compute_CEP_Post(appliedresolution, arbitrationresult, coordinationoutcome))) & T)))
  }
}
