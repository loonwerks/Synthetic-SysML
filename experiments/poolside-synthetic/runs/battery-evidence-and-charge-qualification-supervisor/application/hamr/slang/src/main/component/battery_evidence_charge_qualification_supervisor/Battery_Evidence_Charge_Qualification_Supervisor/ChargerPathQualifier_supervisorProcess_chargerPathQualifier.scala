// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerPathQualifier_supervisorProcess_chargerPathQualifier {

  def initialise(api: ChargerPathQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_chargerPathQualification(ChargerPathQualification.UNAVAILABLE)
    // END WORK
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
    // BEGIN WORK
    val chargerConnection = api.get_chargerConnection().get
    val chargeActivity = api.get_chargeActivity().get
    var pathQual: ChargerPathQualification.Type = ChargerPathQualification.UNAVAILABLE
    if (chargerConnection == ChargerConnection.CONNECTED) {
      if (chargeActivity == ChargeActivity.INACTIVE) {
        pathQual = ChargerPathQualification.READY
      } else {
        pathQual = ChargerPathQualification.ACTIVE
      }
    }
    api.put_chargerPathQualification(pathQual)
    // END WORK
  }

  def finalise(api: ChargerPathQualifier_Operational_Api): Unit = { }
}
