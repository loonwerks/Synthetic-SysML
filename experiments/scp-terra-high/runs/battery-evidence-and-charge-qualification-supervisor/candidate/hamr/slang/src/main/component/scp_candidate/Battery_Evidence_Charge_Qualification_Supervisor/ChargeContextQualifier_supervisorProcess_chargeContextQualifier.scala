// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeContextQualifier_supervisorProcess_chargeContextQualifier {

  def initialise(api: ChargeContextQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_context
        api.chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE,
        // guarantee initial_readiness
        api.batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargeContextQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE)
    api.put_batteryReadinessAdvice(Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE)
  }

  def timeTriggered(api: ChargeContextQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryAssessment(), api.get_lifecycleContext()) match {
      case (Some(assessment), Some(context)) =>
        val qualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type =
          if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE
          else if (context == Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.STANDBY ||
            context == Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.CHARGING)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.ELIGIBLE
          else Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_CONTEXT
        val readiness: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type =
          if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
            Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE
          else if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW)
            Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.NOT_READY
          else Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.READY
        api.put_chargeContextQualification(qualification)
        api.put_batteryReadinessAdvice(readiness)
    }
  }

  def finalise(api: ChargeContextQualifier_Operational_Api): Unit = { }
}
