// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4a5a927bdb1d_2_Valid {
  @pure def check(
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      equipment_observation: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_GumboX.inititialize_IEP_Post(equipment_facts))) & T))
  }
}
