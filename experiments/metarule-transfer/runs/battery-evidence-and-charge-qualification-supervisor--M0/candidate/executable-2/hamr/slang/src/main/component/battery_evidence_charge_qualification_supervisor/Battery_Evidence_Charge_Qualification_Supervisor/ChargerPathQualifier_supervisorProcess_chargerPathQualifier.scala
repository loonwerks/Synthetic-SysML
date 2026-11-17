// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerPathQualifier_supervisorProcess_chargerPathQualifier {

  def initialise(api: ChargerPathQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargerPathQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)
  }

  def timeTriggered(api: ChargerPathQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04_DISCONNECTED
        (api.chargerConnection == ChargerConnection.DISCONNECTED) ___>: (api.chargerPathQualification == ChargerPathQualification.UNAVAILABLE),
        // case CASE_05_CONNECTED_INACTIVE
        (api.chargerConnection == ChargerConnection.CONNECTED &
          api.chargeActivity == ChargeActivity.INACTIVE) ___>: (api.chargerPathQualification == ChargerPathQualification.READY),
        // case CASE_06_CONNECTED_ACTIVE
        (api.chargerConnection == ChargerConnection.CONNECTED &
          api.chargeActivity == ChargeActivity.ACTIVE) ___>: (api.chargerPathQualification == ChargerPathQualification.ACTIVE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val connection = api.get_chargerConnection().get
    val activity = api.get_chargeActivity().get
    if (connection == ChargerConnection.DISCONNECTED) {
      api.put_chargerPathQualification(ChargerPathQualification.UNAVAILABLE)
    } else if (activity == ChargeActivity.INACTIVE) {
      api.put_chargerPathQualification(ChargerPathQualification.READY)
    } else {
      api.put_chargerPathQualification(ChargerPathQualification.ACTIVE)
    }
  }

  def finalise(api: ChargerPathQualifier_Operational_Api): Unit = { }
}
