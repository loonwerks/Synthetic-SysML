// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy {

  def initialise(api: SessionPublicationPolicy_Initialization_Api): Unit = {
    Contract(Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_PUBLICATION
        api.frameDelivery == FrameDelivery.NO_DELIVERY &&
          api.sessionStatus.preparationState == SessionStatusPreparationState.UNPREPARED &&
          api.sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_INACTIVE &&
          api.sessionStatus.disposition == SessionStatusDisposition.NO_REQUEST_DISPOSITION &&
          api.sessionStatus.notice == SessionStatusNotice.NONE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_frameDelivery(EIT_Acquisition_Session_Coordinator.FrameDelivery.NO_DELIVERY)
    api.put_sessionStatus(SessionStatus(SessionStatusPreparationState.UNPREPARED, SessionStatusMonitoringState.MONITORING_INACTIVE, SessionStatusDisposition.NO_REQUEST_DISPOSITION, SessionStatusNotice.NONE))
  }

  def timeTriggered(api: SessionPublicationPolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_impedanceFrame(), api.get_monitoringDecision()) match {
      case (Some(frame), Some(decision)) =>
        val delivery: FrameDelivery.Type =
          if (decision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE &&
            frame == ImpedanceFrameObservation.FRAME_A) FrameDelivery.DELIVER_FRAME_A
          else if (decision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE &&
            frame == ImpedanceFrameObservation.FRAME_B) FrameDelivery.DELIVER_FRAME_B
          else FrameDelivery.NO_DELIVERY
        api.put_frameDelivery(delivery)
        api.put_sessionStatus(SessionStatus(SessionStatusPreparationState.UNPREPARED,
          if (decision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) SessionStatusMonitoringState.MONITORING_ACTIVE
          else if (decision.nextState == MonitoringDecisionNextState.MONITORING_HELD) SessionStatusMonitoringState.MONITORING_HELD
          else SessionStatusMonitoringState.MONITORING_INACTIVE,
          SessionStatusDisposition.NO_REQUEST_DISPOSITION, SessionStatusNotice.NONE))
    }
  }

  def finalise(api: SessionPublicationPolicy_Operational_Api): Unit = { }
}
