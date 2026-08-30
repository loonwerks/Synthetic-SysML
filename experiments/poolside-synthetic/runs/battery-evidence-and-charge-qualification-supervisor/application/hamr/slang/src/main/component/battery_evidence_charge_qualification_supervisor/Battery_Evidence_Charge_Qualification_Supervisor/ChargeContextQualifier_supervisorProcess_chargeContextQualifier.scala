// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeContextQualifier_supervisorProcess_chargeContextQualifier {

  def initialise(api: ChargeContextQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_chargeContextQualification(ChargeContextQualification.BLOCKED_EVIDENCE)
    api.put_batteryReadinessAdvice(BatteryReadinessAdvice.UNAVAILABLE)
    // END WORK
  }

  def timeTriggered(api: ChargeContextQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07_UNAVAILABLE
        (api.batteryAssessment == BatteryAssessment.UNAVAILABLE) ___>: (api.chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE &
          api.batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE),
        // case CASE_08_ELIGIBLE_CONTEXT
        (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
          (api.lifecycleContext == LifecycleContext.STANDBY |
            api.lifecycleContext == LifecycleContext.CHARGING)) ___>: (api.chargeContextQualification == ChargeContextQualification.ELIGIBLE &
          (api.batteryAssessment == BatteryAssessment.LOW ___>:
            api.batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE ___>:
            api.batteryReadinessAdvice == BatteryReadinessAdvice.READY)),
        // case CASE_09_BLOCKED_CONTEXT
        (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
          (api.lifecycleContext == LifecycleContext.OFF |
            api.lifecycleContext == LifecycleContext.READY |
            api.lifecycleContext == LifecycleContext.FLYING)) ___>: (api.chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT &
          (api.batteryAssessment == BatteryAssessment.LOW ___>:
            api.batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE ___>:
            api.batteryReadinessAdvice == BatteryReadinessAdvice.READY))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // BEGIN WORK
    val batteryAssessment = api.get_batteryAssessment().get
    val lifecycleContext = api.get_lifecycleContext().get
    var contextQual: ChargeContextQualification.Type = ChargeContextQualification.BLOCKED_EVIDENCE
    var readinessAdv: BatteryReadinessAdvice.Type = BatteryReadinessAdvice.UNAVAILABLE
    if (batteryAssessment != BatteryAssessment.UNAVAILABLE) {
      if (lifecycleContext == LifecycleContext.STANDBY || lifecycleContext == LifecycleContext.CHARGING) {
        contextQual = ChargeContextQualification.ELIGIBLE
        if (batteryAssessment == BatteryAssessment.LOW) {
          readinessAdv = BatteryReadinessAdvice.NOT_READY
        } else {
          readinessAdv = BatteryReadinessAdvice.READY
        }
      } else {
        contextQual = ChargeContextQualification.BLOCKED_CONTEXT
        if (batteryAssessment == BatteryAssessment.LOW) {
          readinessAdv = BatteryReadinessAdvice.NOT_READY
        } else {
          readinessAdv = BatteryReadinessAdvice.READY
        }
      }
    }
    api.put_chargeContextQualification(contextQual)
    api.put_batteryReadinessAdvice(readinessAdv)
    // END WORK
  }

  def finalise(api: ChargeContextQualifier_Operational_Api): Unit = { }
}
