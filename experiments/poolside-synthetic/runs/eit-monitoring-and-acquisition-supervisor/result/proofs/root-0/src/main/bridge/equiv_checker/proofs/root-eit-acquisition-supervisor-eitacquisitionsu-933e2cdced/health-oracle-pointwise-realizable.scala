// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_933e2cdced80_Oracle_Pointwise_Realizable {
  @pure def check(
      equipment_observation: equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_GumboX.compute_CEP_Post(equipment_observation, equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.READY)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_GumboX.compute_CEP_Post(equipment_observation, equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.NOT_READY)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_GumboX.compute_CEP_Post(equipment_observation, equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.BUSY)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_GumboX.compute_CEP_Post(equipment_observation, equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.FAILED)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_GumboX.compute_CEP_Post(equipment_observation, equiv_shared_0.EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT)))))
  }
}
