// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier {

  def initialise(api: ChargingInterfaceEvidenceQualifier_Initialization_Api): Unit = {
  }

  def timeTriggered(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee INTERFACE_PUBLICATIONS_AGREE
        api.factsToEligibility.interfaceHealthy == api.factsToSession.interfaceHealthy &
          api.factsToEligibility.activityObserved == api.factsToSession.activityObserved &
          api.factsToEligibility.interfaceFault == api.factsToSession.interfaceFault &
          api.faultToAggregation == api.factsToEligibility.interfaceFault,
        // case INTERFACE_IDLE
        (api.reportIn == ChargeInterfaceReport.Idle) ___>: (api.factsToEligibility.interfaceHealthy & !(api.factsToEligibility.activityObserved) &
          !(api.factsToEligibility.interfaceFault)),
        // case INTERFACE_ACTIVE
        (api.reportIn == ChargeInterfaceReport.Active) ___>: (api.factsToEligibility.interfaceHealthy & api.factsToEligibility.activityObserved &
          !(api.factsToEligibility.interfaceFault)),
        // case INTERFACE_FAULTED
        (api.reportIn == ChargeInterfaceReport.Faulted) ___>: (!(api.factsToEligibility.interfaceHealthy) & !(api.factsToEligibility.activityObserved) &
          api.factsToEligibility.interfaceFault),
        // case INTERFACE_UNKNOWN
        (api.reportIn == ChargeInterfaceReport.Unknown) ___>: (!(api.factsToEligibility.interfaceHealthy) & !(api.factsToEligibility.activityObserved) &
          api.factsToEligibility.interfaceFault)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val report = api.get_reportIn().get
    val facts: InterfaceFacts =
      if (report == ChargeInterfaceReport.Idle) InterfaceFacts(T, F, F)
      else if (report == ChargeInterfaceReport.Active) InterfaceFacts(T, T, F)
      else InterfaceFacts(F, F, T)
    api.put_factsToEligibility(facts)
    api.put_factsToSession(facts)
    api.put_faultToAggregation(facts.interfaceFault)
  }

  def finalise(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = { }
}
