// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner {

  // BEGIN FUNCTIONS
  @strictpure def atLeastTwoCandidates(a: Base_Types.Boolean, b: Base_Types.Boolean, c: Base_Types.Boolean, d: Base_Types.Boolean, e: Base_Types.Boolean, f: Base_Types.Boolean, g: Base_Types.Boolean): Base_Types.Boolean = a &
    (b | c |
      d |
      e |
      f |
      g) |
    b &
      (c | d |
        e |
        f |
        g) |
    c &
      (d | e |
        f |
        g) |
    d &
      (e | f |
        g) |
    e &
      (f | g) |
    f & g
  // END FUNCTIONS

  def initialise(api: IntentArbitrationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val initial: Vehicle_Mode_Coordinator.ArbitrationResult =
      Vehicle_Mode_Coordinator.ArbitrationResult(SelectedIntent.SelectHold, F)
    api.put_arbitrationForQualification(initial)
    api.put_arbitrationForPublication(initial)
  }

  def timeTriggered(api: IntentArbitrationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val lifecycle: Vehicle_Mode_Coordinator.LifecycleFacts = api.get_lifecycleFacts().get
    val service: Vehicle_Mode_Coordinator.ServiceFacts = api.get_serviceFacts().get
    val condition: Vehicle_Mode_Coordinator.ConditionAssessment.Type = api.get_conditionAssessment().get
    val selected: Vehicle_Mode_Coordinator.SelectedIntent.Type =
      if (lifecycle.offActive) SelectedIntent.SelectOff
      else if (condition == ConditionAssessment.Unusable) SelectedIntent.SelectInvalidDegraded
      else if (condition == ConditionAssessment.CurrentDegraded) SelectedIntent.SelectConditionDegraded
      else if (service.freshMaintenance) SelectedIntent.SelectMaintenance
      else if (service.freshReturn) SelectedIntent.SelectReturn
      else if (lifecycle.freshOn) SelectedIntent.SelectOn
      else if (lifecycle.freshStart) SelectedIntent.SelectStart
      else SelectedIntent.SelectHold
    val conflict: B = lifecycle.lifecycleConflict | service.serviceConflict |
      atLeastTwoCandidates(
        lifecycle.offActive,
        condition == ConditionAssessment.Unusable,
        condition == ConditionAssessment.CurrentDegraded,
        service.freshMaintenance,
        service.freshReturn,
        lifecycle.freshOn,
        lifecycle.freshStart)
    val result: Vehicle_Mode_Coordinator.ArbitrationResult =
      Vehicle_Mode_Coordinator.ArbitrationResult(selected, conflict)
    api.put_arbitrationForQualification(result)
    api.put_arbitrationForPublication(result)
  }

  def finalise(api: IntentArbitrationOwner_Operational_Api): Unit = { }
}
