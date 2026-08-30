// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Resource_Qualification_supervisor_rq {
  @pure def code(n: Z): S32 = { return S32(n.string).get }

  def initialise(api: Resource_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_mining_recovery_facts(Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts(F, F, F, F))
    api.put_defense_facts(Mining_Threat_Retreat_Supervisor.Defense_Facts(F))
    api.put_resource_publication(Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts(code(3), code(3), code(2)))
    api.put_resource_invalidity(Mining_Threat_Retreat_Supervisor.Resource_Invalidity(F))
  }

  def timeTriggered(api: Resource_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val raw = api.get_raw_resources().get
    val capacitorReady = raw.capacitor_validity == code(0) &&
          (raw.capacitor == code(0) || raw.capacitor == code(1))
        val availabilityValid = raw.availability_validity == code(0)
        api.put_mining_recovery_facts(Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts(
          raw.cargo_validity == code(0) && raw.cargo != code(3) && capacitorReady &&
            raw.target_validity == code(0) && raw.target == code(0) && availabilityValid &&
            raw.mining_availability == code(0),
          raw.cargo_validity == code(0) && raw.cargo == code(0) && capacitorReady,
          raw.cargo_validity == code(1) || raw.cargo == code(3) || raw.capacitor_validity == code(1) ||
            raw.capacitor == code(2) || raw.capacitor == code(3),
          raw.target_validity == code(1) || raw.target == code(1) || raw.availability_validity == code(1) ||
            raw.mining_availability == code(1)))
        api.put_defense_facts(Mining_Threat_Retreat_Supervisor.Defense_Facts(
          capacitorReady && availabilityValid && raw.defense_availability == code(0)))
        var cargoAdvisory: S32 = code(0)
        if (raw.cargo_validity == code(1)) {
          cargoAdvisory = code(3)
        } else if (raw.cargo == code(3)) {
          cargoAdvisory = code(2)
        } else if (raw.cargo == code(2)) {
          cargoAdvisory = code(1)
        }
        var capacitorAdvisory: S32 = code(0)
        if (raw.capacitor_validity == code(1)) {
          capacitorAdvisory = code(3)
        } else if (raw.capacitor == code(3)) {
          capacitorAdvisory = code(2)
        } else if (raw.capacitor == code(2)) {
          capacitorAdvisory = code(1)
        }
        var retreatAdvisory: S32 = code(0)
        if (raw.availability_validity == code(1)) {
          retreatAdvisory = code(2)
        } else if (raw.retreat_availability == code(1)) {
          retreatAdvisory = code(1)
        }
        api.put_resource_publication(Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts(
          cargoAdvisory, capacitorAdvisory, retreatAdvisory))
    api.put_resource_invalidity(Mining_Threat_Retreat_Supervisor.Resource_Invalidity(
      raw.cargo_validity == code(1) || raw.capacitor_validity == code(1) ||
        raw.target_validity == code(1) || raw.availability_validity == code(1)))
  }

  def finalise(api: Resource_Qualification_Operational_Api): Unit = { }
}
