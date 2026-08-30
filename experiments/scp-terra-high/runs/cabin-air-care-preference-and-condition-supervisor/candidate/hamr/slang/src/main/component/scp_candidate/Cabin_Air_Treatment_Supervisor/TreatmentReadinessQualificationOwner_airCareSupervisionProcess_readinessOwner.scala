// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner {

  def initialise(api: TreatmentReadinessQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_READINESS_SAFE
        api.treatmentReadiness == TreatmentReadiness.Unknown &&
          api.readinessContext == ReadinessContext.CriticalUnknown
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Unknown)
    api.put_readinessContext(Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown)
  }

  def timeTriggered(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val status = api.get_treatmentEquipmentStatus().get
    if (status.statusValidity == StatusValidity.Invalid) {
      api.put_treatmentReadiness(TreatmentReadiness.Unknown)
      api.put_readinessContext(ReadinessContext.CriticalUnknown)
    } else {
      api.put_readinessContext(ReadinessContext.Clear)
      if (status.filtrationChannel == FilterPathStatus.Ready &&
          status.dryingChannel == DryingPathStatus.Ready) {
        api.put_treatmentReadiness(TreatmentReadiness.BothReady)
      } else if (status.filtrationChannel == FilterPathStatus.Ready) {
        api.put_treatmentReadiness(TreatmentReadiness.FilterOnly)
      } else if (status.dryingChannel == DryingPathStatus.Ready) {
        api.put_treatmentReadiness(TreatmentReadiness.DryerOnly)
      } else {
        api.put_treatmentReadiness(TreatmentReadiness.NeitherReady)
      }
    }
  }

  def finalise(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = { }
}
