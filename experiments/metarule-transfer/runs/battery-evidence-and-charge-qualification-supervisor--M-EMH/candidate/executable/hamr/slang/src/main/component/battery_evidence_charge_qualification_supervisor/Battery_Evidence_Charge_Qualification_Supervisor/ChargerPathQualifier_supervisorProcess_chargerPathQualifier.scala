// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerPathQualifier_supervisorProcess_chargerPathQualifier {

  def initialise(api: ChargerPathQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_chargerPathQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)
  }

  def timeTriggered(api: ChargerPathQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04_DISCONNECTED
        //   Disconnected path is unavailable | N.md
        (api.chargerConnection == ChargerConnection.DISCONNECTED) ___>: (api.chargerPathQualification == ChargerPathQualification.UNAVAILABLE),
        // case CASE_05_CONNECTED_INACTIVE
        //   Connected inactive path is ready | N.md
        (api.chargerConnection == ChargerConnection.CONNECTED &
          api.chargeActivity == ChargeActivity.INACTIVE) ___>: (api.chargerPathQualification == ChargerPathQualification.READY),
        // case CASE_06_CONNECTED_ACTIVE
        //   Connected active path is active | N.md
        (api.chargerConnection == ChargerConnection.CONNECTED &
          api.chargeActivity == ChargeActivity.ACTIVE) ___>: (api.chargerPathQualification == ChargerPathQualification.ACTIVE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val connection = api.get_chargerConnection().get
    val activity = api.get_chargeActivity().get
    if (connection == ChargerConnection.DISCONNECTED) {
      api.put_chargerPathQualification(ChargerPathQualification.UNAVAILABLE)
    } else if (activity == ChargeActivity.ACTIVE) {
      api.put_chargerPathQualification(ChargerPathQualification.ACTIVE)
    } else {
      api.put_chargerPathQualification(ChargerPathQualification.READY)
    }
  }

  def finalise(api: ChargerPathQualifier_Operational_Api): Unit = { }
}
