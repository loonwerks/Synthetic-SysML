// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ef377a8f6091_Candidate_Pointwise_Realizable {
  @pure def check(
      qualified_battery: equiv_shared_0.Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Candidate_GumboX.compute_CEP_Post(qualified_battery, equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.READY_NONE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Candidate_GumboX.compute_CEP_Post(qualified_battery, equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_INVALID)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Candidate_GumboX.compute_CEP_Post(qualified_battery, equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_STALE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Candidate_GumboX.compute_CEP_Post(qualified_battery, equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_LIMITED)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Candidate_GumboX.compute_CEP_Post(qualified_battery, equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_DEPLETED_OR_UNKNOWN)))))
  }
}
