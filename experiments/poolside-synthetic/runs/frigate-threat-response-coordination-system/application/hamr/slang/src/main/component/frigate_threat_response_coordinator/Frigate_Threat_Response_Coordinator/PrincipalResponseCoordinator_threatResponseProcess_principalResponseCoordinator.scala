// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator {

  @enum object ResponseCommitment {
    "OPEN"
    "DEFENSE_COMMITTED"
    "RETREAT_COMMITTED"
  }

  var responseCommitment: ResponseCommitment.Type = ResponseCommitment.OPEN
  var retreatRequestArmed: B = T

  def initialise(api: PrincipalResponseCoordinator_Initialization_Api): Unit = {
    Contract(
      Modifies(api, responseCommitment, retreatRequestArmed),
      Ensures(
        // INITIAL_RESPONSE_STATE
        responseCommitment == ResponseCommitment.OPEN &
          retreatRequestArmed &
          api.defenseActivation == Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN &
          api.retreatNavigationCommand == Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD &
          api.responseRecord.qualifiedThreat == Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
          api.responseRecord.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT
      )
    )
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    responseCommitment = ResponseCommitment.OPEN
    retreatRequestArmed = T

    api.put_defenseActivation(Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN)
    api.put_retreatNavigationCommand(Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD)
    api.put_responseRecord(Frigate_Threat_Response_Coordinator.ResponseRecord(
      qualifiedThreat = Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN,
      disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT))
  }

  def timeTriggered(api: PrincipalResponseCoordinator_Operational_Api): Unit = {
    Contract(Modifies(api, responseCommitment, retreatRequestArmed))
    val apiUsage_responseRequest: Option[Frigate_Threat_Response_Coordinator.ResponseRequest] = api.get_responseRequest()
    val apiUsage_qualifiedThreat: Option[Frigate_Threat_Response_Coordinator.QualifiedThreat.Type] = api.get_qualifiedThreat()
    val apiUsage_defenseCondition: Option[Frigate_Threat_Response_Coordinator.DefenseCondition.Type] = api.get_defenseCondition()
    val apiUsage_retreatCondition: Option[Frigate_Threat_Response_Coordinator.RetreatCondition.Type] = api.get_retreatCondition()

    val rr: Frigate_Threat_Response_Coordinator.ResponseRequest = apiUsage_responseRequest.get
    val qt: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = apiUsage_qualifiedThreat.get
    val dc: Frigate_Threat_Response_Coordinator.DefenseCondition.Type = apiUsage_defenseCondition.get
    val rc: Frigate_Threat_Response_Coordinator.RetreatCondition.Type = apiUsage_retreatCondition.get

    val entryCommitment: ResponseCommitment.Type = responseCommitment
    val entryArmed: B = retreatRequestArmed

    var outDefenseActivation: Frigate_Threat_Response_Coordinator.DefenseActivation.Type = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
    var outRetreatNavigationCommand: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
    var outQualifiedThreat: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = qt
    var outDisposition: Frigate_Threat_Response_Coordinator.ResponseDisposition.Type = Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT

    // CASE_01_INPUT_FAULT
    if (qt == Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN |
      dc == Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN |
      rc == Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN |
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.INVALID) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT
      if (entryCommitment == ResponseCommitment.RETREAT_COMMITTED) {
        responseCommitment = ResponseCommitment.RETREAT_COMMITTED
      } else {
        responseCommitment = ResponseCommitment.OPEN
      }
      if (rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
        rr.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = T
      }
      if (rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.INVALID |
        rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = entryArmed
      }
    }
    // CASE_02_COMMITTED_RETREAT_ACTIVE
    else if (qt != Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
      dc != Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN &
      rc != Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN &
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
      entryCommitment == ResponseCommitment.RETREAT_COMMITTED &
      rc == Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.RETREAT
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_ACTIVE
      responseCommitment = ResponseCommitment.RETREAT_COMMITTED
      if (rr.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = T
      }
      if (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = entryArmed
      }
    }
    // CASE_03_COMMITTED_RETREAT_BLOCKED
    else if (qt != Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
      dc != Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN &
      rc != Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN &
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
      entryCommitment == ResponseCommitment.RETREAT_COMMITTED &
      rc == Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_BLOCKED
      responseCommitment = ResponseCommitment.RETREAT_COMMITTED
      if (rr.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = T
      }
      if (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = entryArmed
      }
    }
    // CASE_04_RETREAT_COMPLETE
    else if (qt != Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
      dc != Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN &
      rc != Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN &
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
      entryCommitment == ResponseCommitment.RETREAT_COMMITTED &
      rc == Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_COMPLETE
      responseCommitment = ResponseCommitment.OPEN
      if (rr.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = T
      }
      if (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = entryArmed
      }
    }
    // CASE_05_FRESH_RETREAT_ACTIVE
    else if (qt != Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
      dc != Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN &
      rc != Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN &
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
      entryCommitment != ResponseCommitment.RETREAT_COMMITTED &
      rc == Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE &
      ((rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT & entryArmed == T) |
        (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &
          qt == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &
          dc == Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE))) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.RETREAT
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_ACTIVE
      responseCommitment = ResponseCommitment.RETREAT_COMMITTED
      if (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = F
      } else {
        retreatRequestArmed = T
      }
    }
    // CASE_06_FRESH_RETREAT_BLOCKED
    else if (qt != Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
      dc != Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN &
      rc != Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN &
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
      entryCommitment != ResponseCommitment.RETREAT_COMMITTED &
      rc == Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE &
      ((rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT & entryArmed == T) |
        (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &
          qt == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &
          dc == Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE))) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_BLOCKED
      responseCommitment = ResponseCommitment.RETREAT_COMMITTED
      if (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = F
      } else {
        retreatRequestArmed = T
      }
    }
    // CASE_07_CONFIRMED_DEFENSE
    else if (qt != Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
      dc != Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN &
      rc != Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN &
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
      entryCommitment != ResponseCommitment.RETREAT_COMMITTED &
      !(rc != Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE &
        ((rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT & entryArmed == T) |
          (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &
            qt == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &
            dc == Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE))) &
      qt == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &
      rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &
      dc == Frigate_Threat_Response_Coordinator.DefenseCondition.READY) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.ACTIVATE
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.DEFENSE_ACTIVE
      responseCommitment = ResponseCommitment.DEFENSE_COMMITTED
      retreatRequestArmed = T
    }
    // CASE_08_OBSERVATION
    else if (qt != Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN &
      dc != Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN &
      rc != Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN &
      rr.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &
      entryCommitment != ResponseCommitment.RETREAT_COMMITTED &
      !(rc != Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE &
        ((rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT & entryArmed == T) |
          (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &
            qt == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &
            dc == Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE))) &
      !(qt == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &
        rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &
        dc == Frigate_Threat_Response_Coordinator.DefenseCondition.READY)) {
      outDefenseActivation = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
      outRetreatNavigationCommand = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
      outQualifiedThreat = qt
      outDisposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.OBSERVED
      responseCommitment = ResponseCommitment.OPEN
      if (rr.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = T
      }
      if (rr.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
        retreatRequestArmed = entryArmed
      }
    }

    api.put_defenseActivation(outDefenseActivation)
    api.put_retreatNavigationCommand(outRetreatNavigationCommand)
    api.put_responseRecord(Frigate_Threat_Response_Coordinator.ResponseRecord(
      qualifiedThreat = outQualifiedThreat,
      disposition = outDisposition))
  }

  def finalise(api: PrincipalResponseCoordinator_Operational_Api): Unit = { }
}
