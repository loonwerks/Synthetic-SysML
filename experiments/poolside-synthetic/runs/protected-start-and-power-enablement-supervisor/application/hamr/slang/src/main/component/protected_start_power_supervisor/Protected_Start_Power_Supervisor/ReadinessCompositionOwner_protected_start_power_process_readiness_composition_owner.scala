// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner {

  def initialise(api: ReadinessCompositionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_readiness_facts(Protected_Start_Power_Supervisor.ReadinessFacts.example())
  }

  def timeTriggered(api: ReadinessCompositionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee READINESS_COMPOSITION
        //   startReady and sustainReady from supply, thermal, self-test, and start restraint evidence
        api.readiness_facts.startReady == (api.qualified_supply_facts.supplyUsable & api.thermal_state_facts.thermalClear &
          api.self_test_state_facts.selfTestPassed &
          api.start_restraint_fact.startRestraintSatisfied) &
          api.readiness_facts.sustainReady == (api.qualified_supply_facts.supplyUsable & api.thermal_state_facts.thermalClear &
            api.self_test_state_facts.selfTestPassed)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_qualified_supply_facts: Option[Protected_Start_Power_Supervisor.QualifiedSupplyFacts] = api.get_qualified_supply_facts()
    api.logInfo(s"Received on data port qualified_supply_facts: ${apiUsage_qualified_supply_facts}")
    val apiUsage_thermal_state_facts: Option[Protected_Start_Power_Supervisor.ThermalStateFacts] = api.get_thermal_state_facts()
    api.logInfo(s"Received on data port thermal_state_facts: ${apiUsage_thermal_state_facts}")
    val apiUsage_self_test_state_facts: Option[Protected_Start_Power_Supervisor.SelfTestStateFacts] = api.get_self_test_state_facts()
    api.logInfo(s"Received on data port self_test_state_facts: ${apiUsage_self_test_state_facts}")
    val apiUsage_start_restraint_fact: Option[Protected_Start_Power_Supervisor.StartRestraintFact] = api.get_start_restraint_fact()
    api.logInfo(s"Received on data port start_restraint_fact: ${apiUsage_start_restraint_fact}")
  }

  def finalise(api: ReadinessCompositionOwner_Operational_Api): Unit = { }
}
