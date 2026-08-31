// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner {

  def initialise(api: TreatmentReadinessQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_treatmentReadiness(TreatmentReadiness.Unknown)
    api.put_readinessContext(ReadinessContext.CriticalUnknown)
  }

  def timeTriggered(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_EQP_01_INVALID
        (api.treatmentEquipmentStatus.statusValidity == StatusValidity.Invalid) ___>: (api.treatmentReadiness == TreatmentReadiness.Unknown &
          api.readinessContext == ReadinessContext.CriticalUnknown),
        // case CASE_EQP_02_VALID_CROSS_PRODUCT
        (api.treatmentEquipmentStatus.statusValidity == StatusValidity.Valid) ___>: (api.readinessContext == ReadinessContext.Clear &
          (api.treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable &
            api.treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable &
            api.treatmentReadiness == TreatmentReadiness.NeitherReady |
            api.treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready &
              api.treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable &
              api.treatmentReadiness == TreatmentReadiness.FilterOnly |
            api.treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable &
              api.treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready &
              api.treatmentReadiness == TreatmentReadiness.DryerOnly |
            api.treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready &
              api.treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready &
              api.treatmentReadiness == TreatmentReadiness.BothReady))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val equipment = api.get_treatmentEquipmentStatus().get
    if (equipment.statusValidity == StatusValidity.Invalid) {
      api.put_treatmentReadiness(TreatmentReadiness.Unknown)
      api.put_readinessContext(ReadinessContext.CriticalUnknown)
    } else {
      api.put_readinessContext(ReadinessContext.Clear)
      if (equipment.filtrationChannel == FilterPathStatus.Unavailable &
        equipment.dryingChannel == DryingPathStatus.Unavailable) {
        api.put_treatmentReadiness(TreatmentReadiness.NeitherReady)
      } else if (equipment.filtrationChannel == FilterPathStatus.Ready &
        equipment.dryingChannel == DryingPathStatus.Unavailable) {
        api.put_treatmentReadiness(TreatmentReadiness.FilterOnly)
      } else if (equipment.filtrationChannel == FilterPathStatus.Unavailable) {
        api.put_treatmentReadiness(TreatmentReadiness.DryerOnly)
      } else {
        api.put_treatmentReadiness(TreatmentReadiness.BothReady)
      }
    }
  }

  def finalise(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = { }
}
