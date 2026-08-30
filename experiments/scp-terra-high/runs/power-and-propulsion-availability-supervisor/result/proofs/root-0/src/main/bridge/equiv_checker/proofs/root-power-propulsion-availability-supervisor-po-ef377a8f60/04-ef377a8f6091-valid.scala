// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ef377a8f6091_4_Valid {
  @pure def check(
      battery_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type,
      qualified_battery: equiv_shared_0.Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_GumboX.compute_CEP_Post(qualified_battery, battery_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Candidate_GumboX.compute_CEP_Post(qualified_battery, battery_assessment))) & T))
  }
}
