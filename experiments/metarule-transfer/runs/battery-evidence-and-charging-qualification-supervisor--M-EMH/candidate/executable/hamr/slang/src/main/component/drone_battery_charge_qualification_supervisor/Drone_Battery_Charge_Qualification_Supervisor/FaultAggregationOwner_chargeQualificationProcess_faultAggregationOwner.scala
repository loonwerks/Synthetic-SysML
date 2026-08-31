// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner {

  def makeFacts(
    battery: B, charger: B, interface: B, context: B, session: B): FaultFacts = {
    val vector: FaultVector = FaultVector(battery, charger, interface, context, session)
    return FaultFacts(vector, battery || charger || interface || context || session)
  }

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val initial: FaultFacts = makeFacts(T, T, T, T, F)
    api.put_faultsToNotification(initial)
    api.put_faultsToComposition(initial)
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryFaultIn(), api.get_chargerFaultIn(), api.get_interfaceFaultIn(),
      api.get_contextFaultIn(), api.get_sessionConflictIn()) match {
      case (Some(battery), Some(charger), Some(interface), Some(context), Some(session)) =>
        val facts: FaultFacts = makeFacts(battery, charger, interface, context, session)
        api.put_faultsToNotification(facts)
        api.put_faultsToComposition(facts)
      case _ =>
    }
  }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
