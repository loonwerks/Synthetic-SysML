// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner {

  def initialise(api: NotificationCompositionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_NOTICES
        api.pilotNoticeOut == PilotNotice.EvidenceUntrusted &&
          api.flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted
        // END INITIALIZES ENSURES
      )
    )
    api.put_pilotNoticeOut(Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.EvidenceUntrusted)
    api.put_flightControlNoticeOut(Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.EvidenceUntrusted)
  }

  def timeTriggered(api: NotificationCompositionOwner_Operational_Api): Unit = { }

  def finalise(api: NotificationCompositionOwner_Operational_Api): Unit = { }
}
