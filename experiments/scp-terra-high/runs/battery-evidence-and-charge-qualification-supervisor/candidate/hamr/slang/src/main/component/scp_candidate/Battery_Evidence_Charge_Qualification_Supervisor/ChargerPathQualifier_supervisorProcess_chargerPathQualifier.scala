// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerPathQualifier_supervisorProcess_chargerPathQualifier {

  def initialise(api: ChargerPathQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_path
        api.chargerPathQualification == ChargerPathQualification.UNAVAILABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargerPathQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)
  }

  def timeTriggered(api: ChargerPathQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_chargerConnection(), api.get_chargeActivity()) match {
      case (Some(connection), Some(activity)) =>
        val path: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type =
          if (connection == Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.DISCONNECTED)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE
          else if (activity == Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.INACTIVE)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.READY
          else Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.ACTIVE
        api.put_chargerPathQualification(path)
    }
  }

  def finalise(api: ChargerPathQualifier_Operational_Api): Unit = { }
}
