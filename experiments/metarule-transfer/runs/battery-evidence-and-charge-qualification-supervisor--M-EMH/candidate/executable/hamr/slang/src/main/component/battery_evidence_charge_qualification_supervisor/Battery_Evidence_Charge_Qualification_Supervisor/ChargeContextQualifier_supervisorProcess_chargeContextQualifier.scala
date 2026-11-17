// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeContextQualifier_supervisorProcess_chargeContextQualifier {

  def initialise(api: ChargeContextQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_chargeContextQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE)
    api.put_batteryReadinessAdvice(Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE)
  }

  def timeTriggered(api: ChargeContextQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07_UNAVAILABLE
        //   Unavailable evidence blocks charging | N.md
        (api.batteryAssessment == BatteryAssessment.UNAVAILABLE) ___>: (api.chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE &
          api.batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE),
        // case CASE_08_ELIGIBLE_CONTEXT
        //   Standby or charging context is eligible | N.md
        (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
          (api.lifecycleContext == LifecycleContext.STANDBY |
            api.lifecycleContext == LifecycleContext.CHARGING)) ___>: (api.chargeContextQualification == ChargeContextQualification.ELIGIBLE &
          (api.batteryAssessment == BatteryAssessment.LOW ___>:
            api.batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE ___>:
            api.batteryReadinessAdvice == BatteryReadinessAdvice.READY)),
        // case CASE_09_BLOCKED_CONTEXT
        //   Other lifecycle context blocks charging | N.md
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
    val assessment = api.get_batteryAssessment().get
    val context = api.get_lifecycleContext().get
    if (assessment == BatteryAssessment.UNAVAILABLE) {
      api.put_chargeContextQualification(ChargeContextQualification.BLOCKED_EVIDENCE)
      api.put_batteryReadinessAdvice(BatteryReadinessAdvice.UNAVAILABLE)
    } else if (context == LifecycleContext.STANDBY | context == LifecycleContext.CHARGING) {
      api.put_chargeContextQualification(ChargeContextQualification.ELIGIBLE)
      if (assessment == BatteryAssessment.LOW) {
        api.put_batteryReadinessAdvice(BatteryReadinessAdvice.NOT_READY)
      } else {
        api.put_batteryReadinessAdvice(BatteryReadinessAdvice.READY)
      }
    } else {
      api.put_chargeContextQualification(ChargeContextQualification.BLOCKED_CONTEXT)
      if (assessment == BatteryAssessment.LOW) {
        api.put_batteryReadinessAdvice(BatteryReadinessAdvice.NOT_READY)
      } else {
        api.put_batteryReadinessAdvice(BatteryReadinessAdvice.READY)
      }
    }
  }

  def finalise(api: ChargeContextQualifier_Operational_Api): Unit = { }
}
