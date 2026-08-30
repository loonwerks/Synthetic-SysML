// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dec81ded96dd_1_Valid {
  @pure def check(
      acquisition_directive: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionDirective.Type,
      acquisition_outcome: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionOutcome.Type,
      battery_report: equiv_shared_0.Battery_Status_Assessment_Service.BatteryReport,
      captured_report: equiv_shared_0.Battery_Status_Assessment_Service.CapturedReport,
      status_read_request: equiv_shared_0.Battery_Status_Assessment_Service.StatusReadRequest.Type,
      in_acquisitionstate: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionState.Type,
      acquisitionstate: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionState.Type,
      in_committedacquisitionoutcome: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionOutcome.Type,
      committedacquisitionoutcome: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionOutcome.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
