// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner {

  def initialise(api: LifecycleContextApplicabilityOwner_Initialization_Api): Unit = {
  }

  def timeTriggered(api: LifecycleContextApplicabilityOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee LIFECYCLE_PUBLICATIONS_AGREE
        api.factsToEligibility.chargeContextAllowed == api.factsToAdvisory.chargeContextAllowed &
          api.factsToEligibility.airborneContext == api.factsToAdvisory.airborneContext &
          api.factsToEligibility.contextValid == api.factsToAdvisory.contextValid &
          api.factsToEligibility.contextFault == api.factsToAdvisory.contextFault &
          api.faultToAggregation == api.factsToEligibility.contextFault,
        // guarantee LIFECYCLE_VALIDITY
        api.factsToEligibility.contextValid == (api.reportIn.validity == Validity.Valid) &
          api.factsToEligibility.contextFault == (api.reportIn.validity == Validity.Invalid),
        // guarantee CHARGING_CONTEXT_APPLICABILITY
        api.factsToEligibility.chargeContextAllowed == (api.reportIn.validity == Validity.Valid &
          (api.reportIn.phase == LifecyclePhase.Off |
            api.reportIn.phase == LifecyclePhase.Standby |
            api.reportIn.phase == LifecyclePhase.Charging)),
        // guarantee AIRBORNE_CONTEXT_APPLICABILITY
        api.factsToEligibility.airborneContext == (api.reportIn.validity == Validity.Valid &
          api.reportIn.phase == LifecyclePhase.Flying)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val report = api.get_reportIn().get
    val valid = report.validity == Validity.Valid
    val allowed = valid & (report.phase == LifecyclePhase.Off |
      report.phase == LifecyclePhase.Standby | report.phase == LifecyclePhase.Charging)
    val facts = LifecycleFacts(allowed, valid & report.phase == LifecyclePhase.Flying, valid, !valid)
    api.put_factsToEligibility(facts)
    api.put_factsToAdvisory(facts)
    api.put_faultToAggregation(facts.contextFault)
  }

  def finalise(api: LifecycleContextApplicabilityOwner_Operational_Api): Unit = { }
}
