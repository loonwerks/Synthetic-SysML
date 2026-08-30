// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bf18109fd2b0_1_Valid {
  @pure def check(
      parking_brake_fault: B,
      parking_brake_report: equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeReport,
      qualified_parking_brake_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
