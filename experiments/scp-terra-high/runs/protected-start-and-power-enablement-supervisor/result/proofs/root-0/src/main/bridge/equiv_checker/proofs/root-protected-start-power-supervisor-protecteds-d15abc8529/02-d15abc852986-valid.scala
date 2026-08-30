// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d15abc852986_2_Valid {
  @pure def check(
      parking_brake_fault: B,
      parking_brake_report: equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeReport,
      qualified_parking_brake_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_GumboX.inititialize_IEP_Post(parking_brake_fault, qualified_parking_brake_facts))) & T))
  }
}
