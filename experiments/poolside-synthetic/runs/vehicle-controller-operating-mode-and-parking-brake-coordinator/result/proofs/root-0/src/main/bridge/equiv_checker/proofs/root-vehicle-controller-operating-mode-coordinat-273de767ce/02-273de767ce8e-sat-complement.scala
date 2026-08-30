// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_273de767ce8e_2_Complement {
  @pure def check(
      demandsnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      in_demandmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type,
      demandmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_GumboX.compute_CEP_Post(in_demandmemory, demandmemory, recoverydecision, selectedindication, demandsnapshot))) & T)))
  }
}
