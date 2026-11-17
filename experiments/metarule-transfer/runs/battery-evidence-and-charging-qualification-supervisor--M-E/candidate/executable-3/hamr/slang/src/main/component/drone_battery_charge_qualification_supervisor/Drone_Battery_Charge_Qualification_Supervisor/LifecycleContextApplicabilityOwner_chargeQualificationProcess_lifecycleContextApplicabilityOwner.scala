// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner {

  def initialise(api: LifecycleContextApplicabilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

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
        val apiUsage_reportIn: Option[Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue] = api.get_reportIn()
    api.logInfo(s"Received on data port reportIn: ${apiUsage_reportIn}")
    val valid = apiUsage_reportIn.get.validity == Validity.Valid
    val charging = valid &
      (apiUsage_reportIn.get.phase == LifecyclePhase.Off |
        apiUsage_reportIn.get.phase == LifecyclePhase.Standby |
        apiUsage_reportIn.get.phase == LifecyclePhase.Charging)
    val airborne = valid & apiUsage_reportIn.get.phase == LifecyclePhase.Flying
    val facts: LifecycleFacts = LifecycleFacts(charging, airborne, valid, !valid)
    api.put_factsToEligibility(facts)
    api.put_factsToAdvisory(facts)
    api.put_faultToAggregation(facts.contextFault)
  }

  def finalise(api: LifecycleContextApplicabilityOwner_Operational_Api): Unit = { }
}
