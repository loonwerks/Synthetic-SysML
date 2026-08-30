// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_66002fea1568_3_Valid {
  @pure def check(
      configuration_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type,
      even_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      odd_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      propulsion_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
