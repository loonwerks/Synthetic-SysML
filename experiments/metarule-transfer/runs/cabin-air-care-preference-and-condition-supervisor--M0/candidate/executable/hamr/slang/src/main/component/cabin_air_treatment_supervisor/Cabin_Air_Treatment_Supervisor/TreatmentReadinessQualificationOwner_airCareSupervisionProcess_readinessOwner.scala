// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner {

  def initialise(api: TreatmentReadinessQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
    )
    api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Unknown)
    api.put_readinessContext(Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown)
  }

  def timeTriggered(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_EQP_01_INVALID
        //   Invalid readiness is critical unknown
        (api.treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor.StatusValidity.Invalid) ___>: (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Unknown &
          api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown),
        // case CASE_EQP_02_NEITHER
        //   Valid unavailable paths are neither ready
        (api.treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor.StatusValidity.Valid &
          api.treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor.FilterPathStatus.Unavailable &
          api.treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor.DryingPathStatus.Unavailable) ___>: (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.NeitherReady &
          api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear),
        // case CASE_EQP_02_FILTER
        //   Valid ready filter only
        (api.treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor.StatusValidity.Valid &
          api.treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor.FilterPathStatus.Ready &
          api.treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor.DryingPathStatus.Unavailable) ___>: (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly &
          api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear),
        // case CASE_EQP_02_DRYER
        //   Valid ready dryer only
        (api.treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor.StatusValidity.Valid &
          api.treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor.FilterPathStatus.Unavailable &
          api.treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor.DryingPathStatus.Ready) ___>: (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.DryerOnly &
          api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear),
        // case CASE_EQP_02_BOTH
        //   Valid ready paths are both ready
        (api.treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor.StatusValidity.Valid &
          api.treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor.FilterPathStatus.Ready &
          api.treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor.DryingPathStatus.Ready) ___>: (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady &
          api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_treatmentEquipmentStatus() match {
      case Some(status) if status.statusValidity == Cabin_Air_Treatment_Supervisor.StatusValidity.Valid =>
        if (status.filtrationChannel == Cabin_Air_Treatment_Supervisor.FilterPathStatus.Ready &
            status.dryingChannel == Cabin_Air_Treatment_Supervisor.DryingPathStatus.Ready) {
          api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)
        } else if (status.filtrationChannel == Cabin_Air_Treatment_Supervisor.FilterPathStatus.Ready) {
          api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly)
        } else if (status.dryingChannel == Cabin_Air_Treatment_Supervisor.DryingPathStatus.Ready) {
          api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.DryerOnly)
        } else {
          api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.NeitherReady)
        }
        api.put_readinessContext(Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear)
      case _ =>
        api.put_treatmentReadiness(Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Unknown)
        api.put_readinessContext(Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown)
    }
  }

  def finalise(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = { }
}
