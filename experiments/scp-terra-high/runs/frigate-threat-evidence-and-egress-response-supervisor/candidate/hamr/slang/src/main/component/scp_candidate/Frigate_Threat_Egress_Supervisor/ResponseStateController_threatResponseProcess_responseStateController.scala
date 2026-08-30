// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResponseStateController_threatResponseProcess_responseStateController {

  def initialise(api: ResponseStateController_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_responseSnapshot(Frigate_Threat_Egress_Supervisor.ResponseSnapshot.example())
    api.put_defenseCommand(Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY)
    api.put_egressCommand(Frigate_Threat_Egress_Supervisor.EgressCommand.NONE)
  }

  def timeTriggered(api: ResponseStateController_Operational_Api): Unit = {
    api.put_responseSnapshot(Frigate_Threat_Egress_Supervisor.ResponseSnapshot.example())
    api.put_defenseCommand(Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY)
    api.put_egressCommand(Frigate_Threat_Egress_Supervisor.EgressCommand.NONE)
  }

  def finalise(api: ResponseStateController_Operational_Api): Unit = { }
}
