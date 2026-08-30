// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_933e2cdced80_2_Valid {
  @pure def check(
      equipment_facts: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.Type,
      equipment_observation: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_GumboX.compute_CEP_Post(equipment_observation, equipment_facts))) & T))
  }
}
