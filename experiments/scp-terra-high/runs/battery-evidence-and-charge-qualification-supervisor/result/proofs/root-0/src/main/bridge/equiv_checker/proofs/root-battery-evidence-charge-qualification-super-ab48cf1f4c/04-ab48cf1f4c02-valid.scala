// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ab48cf1f4c02_4_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      batteryreadinessadvice: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type,
      chargecontextqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type,
      lifecyclecontext: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_GumboX.inititialize_IEP_Post(batteryassessment, lifecyclecontext, batteryreadinessadvice, chargecontextqualification))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_Candidate_GumboX.inititialize_IEP_Post(batteryreadinessadvice, chargecontextqualification))) & T))
  }
}
