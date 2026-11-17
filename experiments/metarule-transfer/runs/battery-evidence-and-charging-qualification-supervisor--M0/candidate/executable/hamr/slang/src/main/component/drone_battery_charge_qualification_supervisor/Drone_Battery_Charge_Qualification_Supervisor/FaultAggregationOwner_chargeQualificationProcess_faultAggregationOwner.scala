// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner {

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee EXACT_FAULT_VECTOR
        api.faultsToNotification.vector.batteryFault == api.batteryFaultIn &
          api.faultsToNotification.vector.chargerFault == api.chargerFaultIn &
          api.faultsToNotification.vector.interfaceFault == api.interfaceFaultIn &
          api.faultsToNotification.vector.contextFault == api.contextFaultIn &
          api.faultsToNotification.vector.sessionConflict == api.sessionConflictIn,
        // guarantee EXACT_FAULT_DISJUNCTION
        api.faultsToNotification.aggregateFault == (api.batteryFaultIn | api.chargerFaultIn |
          api.interfaceFaultIn |
          api.contextFaultIn |
          api.sessionConflictIn),
        // guarantee FAULT_PUBLICATIONS_AGREE
        api.faultsToComposition.vector.batteryFault == api.faultsToNotification.vector.batteryFault &
          api.faultsToComposition.vector.chargerFault == api.faultsToNotification.vector.chargerFault &
          api.faultsToComposition.vector.interfaceFault == api.faultsToNotification.vector.interfaceFault &
          api.faultsToComposition.vector.contextFault == api.faultsToNotification.vector.contextFault &
          api.faultsToComposition.vector.sessionConflict == api.faultsToNotification.vector.sessionConflict &
          api.faultsToComposition.aggregateFault == api.faultsToNotification.aggregateFault
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val vector = FaultVector(api.get_batteryFaultIn().get, api.get_chargerFaultIn().get,
      api.get_interfaceFaultIn().get, api.get_contextFaultIn().get, api.get_sessionConflictIn().get)
    val facts = FaultFacts(vector, vector.batteryFault | vector.chargerFault | vector.interfaceFault |
      vector.contextFault | vector.sessionConflict)
    api.put_faultsToNotification(facts)
    api.put_faultsToComposition(facts)
  }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
