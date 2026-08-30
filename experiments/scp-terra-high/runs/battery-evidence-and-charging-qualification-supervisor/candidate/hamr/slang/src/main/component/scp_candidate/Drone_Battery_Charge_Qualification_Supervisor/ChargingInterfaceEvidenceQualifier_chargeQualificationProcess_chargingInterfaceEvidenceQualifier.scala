// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier {

  def initialise(api: ChargingInterfaceEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_INTERFACE_FACTS
        api.factsToEligibility.interfaceHealthy == F &&
          api.factsToEligibility.activityObserved == F &&
          api.factsToEligibility.interfaceFault == T &&
          api.factsToSession.interfaceHealthy == F &&
          api.factsToSession.activityObserved == F &&
          api.factsToSession.interfaceFault == T &&
          api.faultToAggregation == T
        // END INITIALIZES ENSURES
      )
    )
    val f: InterfaceFacts = InterfaceFacts(F, F, T)
    api.put_factsToEligibility(f)
    api.put_factsToSession(f)
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = { }

  def finalise(api: ChargingInterfaceEvidenceQualifier_Operational_Api): Unit = { }
}
