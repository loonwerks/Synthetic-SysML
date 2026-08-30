// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d15abc852986_Oracle_Pointwise_Realizable {
  @pure def check(
      parking_brake_report: equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeReport): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_GumboX.inititialize_IEP_Post(F, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(brakeAppliedEvidence = F))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_GumboX.inititialize_IEP_Post(F, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(brakeAppliedEvidence = T))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_GumboX.inititialize_IEP_Post(T, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(brakeAppliedEvidence = F))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_GumboX.inititialize_IEP_Post(T, equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(brakeAppliedEvidence = T))))))
  }
}
