// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner {

  def initialise(api: LifecycleContextApplicabilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val facts: LifecycleFacts = LifecycleFacts(F, F, F, T)
    api.put_factsToEligibility(facts)
    api.put_factsToAdvisory(facts)
    api.put_faultToAggregation(facts.contextFault)
  }

  def timeTriggered(api: LifecycleContextApplicabilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val valid: B = report.validity == Validity.Valid
        val chargingContext: B = valid &&
          (report.phase == LifecyclePhase.Off ||
            report.phase == LifecyclePhase.Standby ||
            report.phase == LifecyclePhase.Charging)
        val facts: LifecycleFacts = LifecycleFacts(
          chargeContextAllowed = chargingContext,
          airborneContext = valid && report.phase == LifecyclePhase.Flying,
          contextValid = valid,
          contextFault = !valid)
        api.put_factsToEligibility(facts)
        api.put_factsToAdvisory(facts)
        api.put_faultToAggregation(facts.contextFault)
      case _ =>
    }
  }

  def finalise(api: LifecycleContextApplicabilityOwner_Operational_Api): Unit = { }
}
