// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeContextQualifier_supervisorProcess_chargeContextQualifier {

  def initialise(api: ChargeContextQualifier_Initialization_Api): Unit = {
    api.put_chargeContextQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE)
    api.put_batteryReadinessAdvice(Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE)
  }

  def timeTriggered(api: ChargeContextQualifier_Operational_Api): Unit = {
    (api.get_batteryAssessment(), api.get_lifecycleContext()) match {
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE), _) =>
        api.put_chargeContextQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE)
        api.put_batteryReadinessAdvice(Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE)
      case (Some(assessment), Some(context)) =>
        val qualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type =
          if (context == Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.STANDBY ||
              context == Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.CHARGING)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.ELIGIBLE
          else Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_CONTEXT
        val advice: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type =
          if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW)
            Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.NOT_READY
          else Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.READY
        api.put_chargeContextQualification(qualification)
        api.put_batteryReadinessAdvice(advice)
      case _ =>
        api.put_chargeContextQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE)
        api.put_batteryReadinessAdvice(Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE)
    }
  }

  def finalise(api: ChargeContextQualifier_Operational_Api): Unit = { }
}
