// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer {

  def initialise(api: AuthoritySafePlanComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val composition: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport = Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(
      Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None,
      Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
      Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.None,
      Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled)
    api.put_composition_to_status(composition)
    api.put_treatment_plan(Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan(
      composition.treatmentAction, composition.flowClass, composition.authorityUse))
  }

  def timeTriggered(api: AuthoritySafePlanComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_selection(), api.get_path(), api.get_capabilities()) match {
      case (Some(selection), Some(path), Some(capabilities)) =>
        val result: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport =
          if (selection.intent == Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.None, selection.cause)
          else if (path == Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Untrusted)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.None, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid)
          else if (path == Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Reserved)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.None, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved)
          else if (capabilities.sharedBlowerDisposition != Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.None, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable)
          else if (selection.intent == Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Filter &&
                   capabilities.sharedFilterDisposition == Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.FilterAir, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.SharedAirPath, selection.cause)
          else if (selection.intent == Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Increase &&
                   capabilities.sharedHumidifierDisposition == Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.IncreaseHumidity, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.SharedAirPath, selection.cause)
          else if (selection.intent == Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Reduce &&
                   capabilities.sharedDehumidifierDisposition == Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.ReduceHumidity, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.SharedAirPath, selection.cause)
          else if (selection.intent == Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.ExchangeAir)
            Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.ExchangeAir, selection.flowClass, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.SharedAirPath, selection.cause)
          else Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.None, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable)
        api.put_composition_to_status(result)
        api.put_treatment_plan(Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan(result.treatmentAction, result.flowClass, result.authorityUse))
      case _ =>
        val result: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport = Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.None, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid)
        api.put_composition_to_status(result)
        api.put_treatment_plan(Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan(result.treatmentAction, result.flowClass, result.authorityUse))
    }
  }

  def finalise(api: AuthoritySafePlanComposer_Operational_Api): Unit = { }
}
