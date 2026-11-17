// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier {

  def initialise(api: ChargingInterfaceEvidenceQualifier_Initialization_Api): Unit = {
    val f: InterfaceFacts = InterfaceFacts(F,F,T)
    api.put_factsToEligibility(f); api.put_factsToSession(f); api.put_faultToAggregation(T)
  }

  def timeTriggered(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee INTERFACE_PUBLICATIONS_AGREE
        api.factsToEligibility.interfaceHealthy == api.factsToSession.interfaceHealthy &
          api.factsToEligibility.activityObserved == api.factsToSession.activityObserved &
          api.factsToEligibility.interfaceFault == api.factsToSession.interfaceFault &
          api.faultToAggregation == api.factsToEligibility.interfaceFault,
        // case INTERFACE_IDLE
        (api.reportIn == ChargeInterfaceReport.Idle) ___>: (api.factsToEligibility.interfaceHealthy &
          api.factsToEligibility.activityObserved == F &
          api.factsToEligibility.interfaceFault == F),
        // case INTERFACE_ACTIVE
        (api.reportIn == ChargeInterfaceReport.Active) ___>: (api.factsToEligibility.interfaceHealthy & api.factsToEligibility.activityObserved &
          api.factsToEligibility.interfaceFault == F),
        // case INTERFACE_FAULTED
        (api.reportIn == ChargeInterfaceReport.Faulted) ___>: (api.factsToEligibility.interfaceHealthy == F &
          api.factsToEligibility.activityObserved == F &
          api.factsToEligibility.interfaceFault),
        // case INTERFACE_UNKNOWN
        (api.reportIn == ChargeInterfaceReport.Unknown) ___>: (api.factsToEligibility.interfaceHealthy == F &
          api.factsToEligibility.activityObserved == F &
          api.factsToEligibility.interfaceFault)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_reportIn() match {
      case Some(r) =>
        val f: InterfaceFacts = r match {
          case ChargeInterfaceReport.Idle => InterfaceFacts(T,F,F)
          case ChargeInterfaceReport.Active => InterfaceFacts(T,T,F)
          case ChargeInterfaceReport.Faulted => InterfaceFacts(F,F,T)
          case ChargeInterfaceReport.Unknown => InterfaceFacts(F,F,T)
        }
        api.put_factsToEligibility(f); api.put_factsToSession(f); api.put_faultToAggregation(f.interfaceFault)
      case _ => val f: InterfaceFacts = InterfaceFacts(F,F,T); api.put_factsToEligibility(f); api.put_factsToSession(f); api.put_faultToAggregation(T)
    }
  }

  def finalise(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = { }
}
