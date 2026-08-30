// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator {

  // BEGIN STATE VARS
  var responseCommitment: Frigate_Threat_Response_Coordinator.ResponseCommitment.Type = Frigate_Threat_Response_Coordinator.ResponseCommitment.OPEN

  var retreatRequestArmed: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: PrincipalResponseCoordinator_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // BEGIN INITIALIZES ENSURES
        // guarantee initial
        responseCommitment == ResponseCommitment.OPEN &
          retreatRequestArmed &
          api.defenseActivation == DefenseActivation.STAND_DOWN &
          api.retreatNavigationCommand == RetreatNavigationCommand.HOLD &
          api.responseRecord.qualifiedThreat == QualifiedThreat.UNKNOWN &
          api.responseRecord.disposition == ResponseDisposition.INPUT_FAULT
        // END INITIALIZES ENSURES
    api.put_defenseActivation(Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN)
    api.put_retreatNavigationCommand(Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD)
    api.put_responseRecord(Frigate_Threat_Response_Coordinator.ResponseRecord(
      qualifiedThreat = Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN,
      disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT))
  }

  def timeTriggered(api: PrincipalResponseCoordinator_Operational_Api): Unit = {
    Contract(Modifies(api, responseCommitment, retreatRequestArmed))
    val request: Frigate_Threat_Response_Coordinator.ResponseRequest = api.get_responseRequest().get
    val threat: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = api.get_qualifiedThreat().get
    val defense: Frigate_Threat_Response_Coordinator.DefenseCondition.Type = api.get_defenseCondition().get
    val retreat: Frigate_Threat_Response_Coordinator.RetreatCondition.Type = api.get_retreatCondition().get
    val invalid: B =
          threat == Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN ||
          defense == Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN ||
          retreat == Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN ||
          request.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.INVALID

    var activation: Frigate_Threat_Response_Coordinator.DefenseActivation.Type = Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN
    var navigation: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD
    var disposition: Frigate_Threat_Response_Coordinator.ResponseDisposition.Type = Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT

    if (invalid) {
          if (responseCommitment != Frigate_Threat_Response_Coordinator.ResponseCommitment.RETREAT_COMMITTED) {
            responseCommitment = Frigate_Threat_Response_Coordinator.ResponseCommitment.OPEN
          }
          if (request.requestStatus == Frigate_Threat_Response_Coordinator.RequestStatus.VALID &&
              request.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
            retreatRequestArmed = T
          }
    } else if (responseCommitment == Frigate_Threat_Response_Coordinator.ResponseCommitment.RETREAT_COMMITTED) {
          if (retreat == Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE) {
            navigation = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.RETREAT
            disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_ACTIVE
          } else if (retreat == Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE) {
            disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_BLOCKED
          } else {
            disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_COMPLETE
            responseCommitment = Frigate_Threat_Response_Coordinator.ResponseCommitment.OPEN
          }
          if (request.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
            retreatRequestArmed = T
          }
    } else {
          val retreatRequested: B =
            request.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT &&
            retreatRequestArmed
          val defenseFallback: B =
            request.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &&
            threat == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &&
            defense == Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE
          val startRetreat: B = retreat != Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE &&
            (retreatRequested || defenseFallback)

          if (startRetreat && retreat == Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE) {
            navigation = Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.RETREAT
            disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_ACTIVE
            responseCommitment = Frigate_Threat_Response_Coordinator.ResponseCommitment.RETREAT_COMMITTED
            retreatRequestArmed = request.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT
          } else if (startRetreat && retreat == Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE) {
            disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_BLOCKED
            responseCommitment = Frigate_Threat_Response_Coordinator.ResponseCommitment.RETREAT_COMMITTED
            retreatRequestArmed = request.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT
          } else if (threat == Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE &&
                     request.request == Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE &&
                     defense == Frigate_Threat_Response_Coordinator.DefenseCondition.READY) {
            activation = Frigate_Threat_Response_Coordinator.DefenseActivation.ACTIVATE
            disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.DEFENSE_ACTIVE
            responseCommitment = Frigate_Threat_Response_Coordinator.ResponseCommitment.DEFENSE_COMMITTED
            retreatRequestArmed = T
          } else {
            disposition = Frigate_Threat_Response_Coordinator.ResponseDisposition.OBSERVED
            responseCommitment = Frigate_Threat_Response_Coordinator.ResponseCommitment.OPEN
            if (request.request != Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT) {
              retreatRequestArmed = T
            }
          }
    }

    api.put_defenseActivation(activation)
    api.put_retreatNavigationCommand(navigation)
    api.put_responseRecord(Frigate_Threat_Response_Coordinator.ResponseRecord(threat, disposition))
  }

  def finalise(api: PrincipalResponseCoordinator_Operational_Api): Unit = { }
}
