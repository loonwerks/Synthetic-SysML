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
    api.get_treatmentEquipmentStatus() match {
      case Some(equipment) if equipment.statusValidity == StatusValidity.Valid =>
        val readiness: TreatmentReadiness.Type =
          if (equipment.filtrationChannel == FilterPathStatus.Ready &&
              equipment.dryingChannel == DryingPathStatus.Ready) {
            TreatmentReadiness.BothReady
          } else if (equipment.filtrationChannel == FilterPathStatus.Ready) {
            TreatmentReadiness.FilterOnly
          } else if (equipment.dryingChannel == DryingPathStatus.Ready) {
            TreatmentReadiness.DryerOnly
          } else {
            TreatmentReadiness.NeitherReady
          }
        api.put_treatmentReadiness(readiness)
        api.put_readinessContext(ReadinessContext.Clear)
      case _ =>
        api.put_treatmentReadiness(TreatmentReadiness.Unknown)
        api.put_readinessContext(ReadinessContext.CriticalUnknown)
    }
  }

  def finalise(api: TreatmentReadinessQualificationOwner_Operational_Api): Unit = { }
}
