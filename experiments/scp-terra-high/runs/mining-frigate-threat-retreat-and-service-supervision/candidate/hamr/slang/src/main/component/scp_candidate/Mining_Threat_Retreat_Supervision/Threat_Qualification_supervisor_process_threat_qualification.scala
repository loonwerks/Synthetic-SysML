// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Qualification_supervisor_process_threat_qualification {

  def initialise(api: Threat_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_threat_validity(Mining_Threat_Retreat_Supervision.ThreatValidityValue(s32"0"))
    api.put_disposition_mining(Mining_Threat_Retreat_Supervision.ThreatDispositionValue(s32"0"))
    api.put_disposition_defense(Mining_Threat_Retreat_Supervision.ThreatDispositionValue(s32"0"))
    api.put_disposition_mobility(Mining_Threat_Retreat_Supervision.ThreatDispositionValue(s32"0"))
  }

  def timeTriggered(api: Threat_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val sample = api.get_threat_sample().get
    val code: S32 =
      if (sample.sample_code == s32"0") s32"0"
      else if (sample.sample_code == s32"1") s32"1"
      else if (sample.sample_code == s32"2") s32"2"
      else if (sample.sample_code == s32"3") s32"3"
      else s32"0"
    val validity: S32 = if (code == s32"0") s32"0" else s32"1"
    api.put_threat_validity(Mining_Threat_Retreat_Supervision.ThreatValidityValue(validity))
    api.put_disposition_mining(Mining_Threat_Retreat_Supervision.ThreatDispositionValue(code))
    api.put_disposition_defense(Mining_Threat_Retreat_Supervision.ThreatDispositionValue(code))
    api.put_disposition_mobility(Mining_Threat_Retreat_Supervision.ThreatDispositionValue(code))
  }

  def finalise(api: Threat_Qualification_Operational_Api): Unit = { }
}
