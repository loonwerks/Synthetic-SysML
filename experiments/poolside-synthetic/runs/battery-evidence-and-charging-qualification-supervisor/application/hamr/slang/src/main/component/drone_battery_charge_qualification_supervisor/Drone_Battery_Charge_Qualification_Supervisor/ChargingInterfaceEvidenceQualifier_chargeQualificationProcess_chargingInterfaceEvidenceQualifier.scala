// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier {

  def initialise(api: ChargingInterfaceEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_factsToEligibility(Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts.example())
    api.put_factsToSession(Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee INTERFACE_PUBLICATIONS_AGREE
        api.factsToEligibility.interfaceHealthy == T ___>:
          api.factsToSession.interfaceHealthy == T &
            api.factsToEligibility.activityObserved == T ___>:
            api.factsToSession.activityObserved == T &
              api.factsToEligibility.interfaceFault == T ___>:
              api.factsToSession.interfaceFault == T &
                api.faultToAggregation == api.factsToEligibility.interfaceFault,
        // case INTERFACE_IDLE
        (api.reportIn == ChargeInterfaceReport.Idle) ___>: (api.factsToEligibility.interfaceHealthy == T &
          api.factsToEligibility.activityObserved == F &
          api.factsToEligibility.interfaceFault == F),
        // case INTERFACE_ACTIVE
        (api.reportIn == ChargeInterfaceReport.Active) ___>: (api.factsToEligibility.interfaceHealthy == T &
          api.factsToEligibility.activityObserved == T &
          api.factsToEligibility.interfaceFault == F),
        // case INTERFACE_FAULTED
        (api.reportIn == ChargeInterfaceReport.Faulted) ___>: (api.factsToEligibility.interfaceHealthy == F &
          api.factsToEligibility.activityObserved == F &
          api.factsToEligibility.interfaceFault == T),
        // case INTERFACE_UNKNOWN
        (api.reportIn == ChargeInterfaceReport.Unknown) ___>: (api.factsToEligibility.interfaceHealthy == F &
          api.factsToEligibility.activityObserved == F &
          api.factsToEligibility.interfaceFault == T)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_reportIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type] = api.get_reportIn()
    api.logInfo(s"Received on data port reportIn: ${apiUsage_reportIn}")
  }

  def finalise(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = { }
}
