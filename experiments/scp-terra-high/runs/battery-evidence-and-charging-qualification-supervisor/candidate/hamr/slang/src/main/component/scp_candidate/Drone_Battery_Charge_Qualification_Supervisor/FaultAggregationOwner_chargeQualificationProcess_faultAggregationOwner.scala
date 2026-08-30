// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner {

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_FAULT_FACTS
        api.faultsToNotification.vector.batteryFault == T &&
          api.faultsToNotification.vector.chargerFault == T &&
          api.faultsToNotification.vector.interfaceFault == T &&
          api.faultsToNotification.vector.contextFault == T &&
          api.faultsToNotification.vector.sessionConflict == F &&
          api.faultsToNotification.aggregateFault == T &&
          api.faultsToComposition == api.faultsToNotification
        // END INITIALIZES ENSURES
      )
    )
    val f: FaultFacts = FaultFacts(FaultVector(T, T, T, T, F), T)
    api.put_faultsToNotification(f)
    api.put_faultsToComposition(f)
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = { }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
