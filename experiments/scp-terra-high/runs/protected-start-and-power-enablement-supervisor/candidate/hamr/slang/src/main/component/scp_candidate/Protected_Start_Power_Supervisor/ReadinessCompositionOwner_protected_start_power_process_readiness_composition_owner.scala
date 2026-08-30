// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner {

  def initialise(api: ReadinessCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_readiness_facts(Protected_Start_Power_Supervisor.ReadinessFacts(F, F))
  }

  def timeTriggered(api: ReadinessCompositionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_qualified_supply_facts(), api.get_thermal_state_facts(), api.get_self_test_state_facts(),
      api.get_start_restraint_fact()) match {
      case (Some(supply), Some(thermal), Some(selfTest), Some(restraint)) =>
        val sustain = supply.supplyUsable && thermal.thermalClear && selfTest.selfTestPassed
        api.put_readiness_facts(Protected_Start_Power_Supervisor.ReadinessFacts(
          sustain && restraint.startRestraintSatisfied, sustain))
    }
  }

  def finalise(api: ReadinessCompositionOwner_Operational_Api): Unit = { }
}
