// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8bfb283a73e7_1_Valid {
  @pure def check(
      aircaresupervisorstatus: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus,
      airproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.Type,
      airtreatmentcommand: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Type,
      humidityproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.Type,
      recoverygate: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
