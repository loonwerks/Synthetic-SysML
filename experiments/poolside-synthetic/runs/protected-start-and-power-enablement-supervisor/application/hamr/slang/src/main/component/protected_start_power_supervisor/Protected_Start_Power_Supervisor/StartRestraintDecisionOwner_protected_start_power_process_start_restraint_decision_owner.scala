// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner {

  def initialise(api: StartRestraintDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_start_restraint_fact(Protected_Start_Power_Supervisor.StartRestraintFact.example())
  }

  def timeTriggered(api: StartRestraintDecisionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee START_RESTRAINT_DECISION
        //   start restraint satisfied iff qualified pedal and parking brake evidence both hold
        api.start_restraint_fact.startRestraintSatisfied == (api.qualified_pedal_facts.pedalStartCondition & api.qualified_parking_brake_facts.brakeAppliedEvidence)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_qualified_pedal_facts: Option[Protected_Start_Power_Supervisor.QualifiedPedalFacts] = api.get_qualified_pedal_facts()
    api.logInfo(s"Received on data port qualified_pedal_facts: ${apiUsage_qualified_pedal_facts}")
    val apiUsage_qualified_parking_brake_facts: Option[Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts] = api.get_qualified_parking_brake_facts()
    api.logInfo(s"Received on data port qualified_parking_brake_facts: ${apiUsage_qualified_parking_brake_facts}")
  }

  def finalise(api: StartRestraintDecisionOwner_Operational_Api): Unit = { }
}
