// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_157ff533765b_4_Valid {
  @pure def check(
      demandsnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      demandmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_GumboX.inititialize_IEP_Post(demandmemory, demandsnapshot))) ___>: (T)) & T))
  }
}
