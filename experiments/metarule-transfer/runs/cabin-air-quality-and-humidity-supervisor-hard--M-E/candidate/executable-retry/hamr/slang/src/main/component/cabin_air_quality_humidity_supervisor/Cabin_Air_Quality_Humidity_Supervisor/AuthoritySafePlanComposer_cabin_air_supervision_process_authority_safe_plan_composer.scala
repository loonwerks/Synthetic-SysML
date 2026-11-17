// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer {

  def initialise(api: AuthoritySafePlanComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_composition_to_status(CompositionReport(TreatmentAction.None, FlowClass.Off, AuthorityUse.None, StatusCause.PreferenceDisabled))
    api.put_treatment_plan(CabinAirTreatmentPlan(TreatmentAction.None, FlowClass.Off, AuthorityUse.None))
  }

  def timeTriggered(api: AuthoritySafePlanComposer_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PLAN_DELIVERY_COHERENCE
        api.treatment_plan.treatmentAction == api.composition_to_status.treatmentAction &
          api.treatment_plan.flowClass == api.composition_to_status.flowClass &
          api.treatment_plan.authorityUse == api.composition_to_status.authorityUse,
        // guarantee PLAN_SHAPE_COHERENCE
        api.composition_to_status.treatmentAction == TreatmentAction.None &
          api.composition_to_status.flowClass == FlowClass.Off &
          api.composition_to_status.authorityUse == AuthorityUse.None |
          api.composition_to_status.treatmentAction != TreatmentAction.None &
            api.composition_to_status.flowClass != FlowClass.Off &
            api.composition_to_status.authorityUse == AuthorityUse.SharedAirPath,
        // case CASE_23_NONE_ALL_OFF
        (api.selection.intent == SelectedIntent.None) ___>: (api.composition_to_status.treatmentAction == TreatmentAction.None &
          api.composition_to_status.flowClass == FlowClass.Off &
          api.composition_to_status.authorityUse == AuthorityUse.None &
          api.composition_to_status.cause == api.selection.cause),
        // case CASE_24_UNTRUSTED_AUTHORITY
        (api.selection.intent != SelectedIntent.None &
          api.path == PathDisposition.Untrusted) ___>: (api.composition_to_status.treatmentAction == TreatmentAction.None &
          api.composition_to_status.flowClass == FlowClass.Off &
          api.composition_to_status.authorityUse == AuthorityUse.None &
          api.composition_to_status.cause == StatusCause.AuthorityInvalid),
        // case CASE_25_RESERVED_AUTHORITY
        (api.selection.intent != SelectedIntent.None &
          api.path == PathDisposition.Reserved) ___>: (api.composition_to_status.treatmentAction == TreatmentAction.None &
          api.composition_to_status.flowClass == FlowClass.Off &
          api.composition_to_status.authorityUse == AuthorityUse.None &
          api.composition_to_status.cause == StatusCause.AirPathReserved),
        // case CASE_26_BLOWER_UNAVAILABLE
        (api.selection.intent != SelectedIntent.None &
          api.path == PathDisposition.Usable &
          api.capabilities.sharedBlowerDisposition != ComposerBlowerDisposition.Ready) ___>: (api.composition_to_status.treatmentAction == TreatmentAction.None &
          api.composition_to_status.flowClass == FlowClass.Off &
          api.composition_to_status.authorityUse == AuthorityUse.None &
          api.composition_to_status.cause == StatusCause.EquipmentUnavailable),
        // case CASE_27_FILTER_COMPOSITION
        (api.selection.intent == SelectedIntent.Filter &
          api.path == PathDisposition.Usable &
          api.capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready) ___>: (api.capabilities.sharedFilterDisposition == ComposerFilterDisposition.Ready &
          api.composition_to_status.treatmentAction == TreatmentAction.FilterAir &
          api.composition_to_status.flowClass == FlowClass.Treatment &
          api.composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
          api.composition_to_status.cause == api.selection.cause |
          api.capabilities.sharedFilterDisposition != ComposerFilterDisposition.Ready &
            api.composition_to_status.treatmentAction == TreatmentAction.None &
            api.composition_to_status.flowClass == FlowClass.Off &
            api.composition_to_status.authorityUse == AuthorityUse.None &
            api.composition_to_status.cause == StatusCause.SelectedPathUnavailable),
        // case CASE_28_HUMIDITY_COMPOSITION
        ((api.selection.intent == SelectedIntent.Increase |
          api.selection.intent == SelectedIntent.Reduce) &
          api.path == PathDisposition.Usable &
          api.capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready) ___>: (api.selection.intent == SelectedIntent.Increase &
          api.capabilities.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready &
          api.composition_to_status.treatmentAction == TreatmentAction.IncreaseHumidity &
          api.composition_to_status.flowClass == FlowClass.Treatment &
          api.composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
          api.composition_to_status.cause == api.selection.cause |
          api.selection.intent == SelectedIntent.Reduce &
            api.capabilities.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready &
            api.composition_to_status.treatmentAction == TreatmentAction.ReduceHumidity &
            api.composition_to_status.flowClass == FlowClass.Treatment &
            api.composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
            api.composition_to_status.cause == api.selection.cause |
          api.selection.intent == SelectedIntent.Increase &
            api.capabilities.sharedHumidifierDisposition != ComposerHumidifierDisposition.Ready &
            api.composition_to_status.treatmentAction == TreatmentAction.None &
            api.composition_to_status.flowClass == FlowClass.Off &
            api.composition_to_status.authorityUse == AuthorityUse.None &
            api.composition_to_status.cause == StatusCause.SelectedPathUnavailable |
          api.selection.intent == SelectedIntent.Reduce &
            api.capabilities.sharedDehumidifierDisposition != ComposerDehumidifierDisposition.Ready &
            api.composition_to_status.treatmentAction == TreatmentAction.None &
            api.composition_to_status.flowClass == FlowClass.Off &
            api.composition_to_status.authorityUse == AuthorityUse.None &
            api.composition_to_status.cause == StatusCause.SelectedPathUnavailable),
        // case CASE_29_ROUTINE_COMPOSITION
        (api.selection.intent == SelectedIntent.ExchangeAir &
          api.path == PathDisposition.Usable &
          api.capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready) ___>: (api.composition_to_status.treatmentAction == TreatmentAction.ExchangeAir &
          api.composition_to_status.flowClass == api.selection.flowClass &
          api.composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
          api.composition_to_status.cause == api.selection.cause)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_selection() match {
      case Some(selection) => api.get_path() match {
        case Some(path) => api.get_capabilities() match {
          case Some(capabilities) =>
            val result: CompositionReport =
              if (selection.intent == SelectedIntent.None)
                CompositionReport(TreatmentAction.None, FlowClass.Off, AuthorityUse.None, selection.cause)
              else if (path == PathDisposition.Untrusted)
                CompositionReport(TreatmentAction.None, FlowClass.Off, AuthorityUse.None, StatusCause.AuthorityInvalid)
              else if (path == PathDisposition.Reserved)
                CompositionReport(TreatmentAction.None, FlowClass.Off, AuthorityUse.None, StatusCause.AirPathReserved)
              else if (capabilities.sharedBlowerDisposition != ComposerBlowerDisposition.Ready)
                CompositionReport(TreatmentAction.None, FlowClass.Off, AuthorityUse.None, StatusCause.EquipmentUnavailable)
              else if (selection.intent == SelectedIntent.Filter &&
                capabilities.sharedFilterDisposition == ComposerFilterDisposition.Ready)
                CompositionReport(TreatmentAction.FilterAir, FlowClass.Treatment, AuthorityUse.SharedAirPath, selection.cause)
              else if (selection.intent == SelectedIntent.Increase &&
                capabilities.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready)
                CompositionReport(TreatmentAction.IncreaseHumidity, FlowClass.Treatment, AuthorityUse.SharedAirPath, selection.cause)
              else if (selection.intent == SelectedIntent.Reduce &&
                capabilities.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready)
                CompositionReport(TreatmentAction.ReduceHumidity, FlowClass.Treatment, AuthorityUse.SharedAirPath, selection.cause)
              else if (selection.intent == SelectedIntent.ExchangeAir)
                CompositionReport(TreatmentAction.ExchangeAir, selection.flowClass, AuthorityUse.SharedAirPath, selection.cause)
              else CompositionReport(TreatmentAction.None, FlowClass.Off, AuthorityUse.None, StatusCause.SelectedPathUnavailable)
            api.put_composition_to_status(result)
            api.put_treatment_plan(CabinAirTreatmentPlan(result.treatmentAction, result.flowClass, result.authorityUse))
        }
      }
    }
  }

  def finalise(api: AuthoritySafePlanComposer_Operational_Api): Unit = { }
}
