// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_650be21ce03a_Oracle_Pointwise_Realizable {
  @pure def check(
      brake_pedal_report: equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalReport): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_GumboX.compute_CEP_Post(brake_pedal_report, F, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts(pedalStartCondition = F))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_GumboX.compute_CEP_Post(brake_pedal_report, F, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts(pedalStartCondition = T))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_GumboX.compute_CEP_Post(brake_pedal_report, T, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts(pedalStartCondition = F))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_GumboX.compute_CEP_Post(brake_pedal_report, T, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts(pedalStartCondition = T))))))
  }
}
