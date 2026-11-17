// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeContextQualifier_supervisorProcess_chargeContextQualifier {

  def initialise(api: ChargeContextQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargeContextQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE)
    api.put_batteryReadinessAdvice(Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE)
  }

  def timeTriggered(api: ChargeContextQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_batteryAssessment: Option[Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type] = api.get_batteryAssessment()
    api.logInfo(s"Received on data port batteryAssessment: ${apiUsage_batteryAssessment}")
    val apiUsage_lifecycleContext: Option[Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type] = api.get_lifecycleContext()
    api.logInfo(s"Received on data port lifecycleContext: ${apiUsage_lifecycleContext}")
  }

  def finalise(api: ChargeContextQualifier_Operational_Api): Unit = { }
}
