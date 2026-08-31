// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter {

  def initialise(api: CabinAirPriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val selection = SelectionReport(SelectedIntent.None, FlowClass.Off, StatusCause.PreferenceDisabled)
    api.put_selection_to_composer(selection)
    api.put_selection_to_status(selection)
  }

  def timeTriggered(api: CabinAirPriorityArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee SELECTION_FANOUT
        api.selection_to_status == api.selection_to_composer,
        // case CASE_17_DISABLED_PRIORITY
        (api.accepted.enable == EnableChoice.Off) ___>: (api.selection_to_composer.intent == SelectedIntent.None &
          api.selection_to_composer.flowClass == FlowClass.Off &
          api.selection_to_composer.cause == StatusCause.PreferenceDisabled),
        // case CASE_18_FILTER_PRIORITY
        (api.accepted.enable == EnableChoice.On &
          (api.filter_proposal.proposal == FilterProposal.Environmental |
            api.filter_proposal.proposal == FilterProposal.Continuous)) ___>: (api.selection_to_composer.intent == SelectedIntent.Filter &
          api.selection_to_composer.flowClass == FlowClass.Treatment &
          api.selection_to_composer.cause == StatusCause.AirTreatmentPriority),
        // case CASE_19_REDUCE_PRIORITY
        (api.accepted.enable == EnableChoice.On &
          (api.filter_proposal.proposal == FilterProposal.None |
            api.filter_proposal.proposal == FilterProposal.Unavailable) &
          api.humidity_proposal.proposal == HumidityProposal.Reduce) ___>: (api.selection_to_composer.intent == SelectedIntent.Reduce &
          api.selection_to_composer.flowClass == FlowClass.Treatment &
          api.selection_to_composer.cause == StatusCause.HumidityTreatmentPriority),
        // case CASE_20_INCREASE_PRIORITY
        (api.accepted.enable == EnableChoice.On &
          (api.filter_proposal.proposal == FilterProposal.None |
            api.filter_proposal.proposal == FilterProposal.Unavailable) &
          api.humidity_proposal.proposal == HumidityProposal.Increase) ___>: (api.selection_to_composer.intent == SelectedIntent.Increase &
          api.selection_to_composer.flowClass == FlowClass.Treatment &
          api.selection_to_composer.cause == StatusCause.HumidityTreatmentPriority),
        // case CASE_21_ROUTINE_PRIORITY
        (api.accepted.enable == EnableChoice.On &
          (api.filter_proposal.proposal == FilterProposal.None |
            api.filter_proposal.proposal == FilterProposal.Unavailable) &
          (api.humidity_proposal.proposal == HumidityProposal.None |
            api.humidity_proposal.proposal == HumidityProposal.Unavailable) &
          (api.routine_proposal.proposal == RoutineProposal.Low |
            api.routine_proposal.proposal == RoutineProposal.High)) ___>: (api.selection_to_composer.intent == SelectedIntent.ExchangeAir &
          api.selection_to_composer.flowClass == FlowClass.Routine &
          api.selection_to_composer.cause == StatusCause.None),
        // case CASE_22_NO_SELECTION_CAUSE
        (api.accepted.enable == EnableChoice.On &
          (api.filter_proposal.proposal == FilterProposal.None |
            api.filter_proposal.proposal == FilterProposal.Unavailable) &
          (api.humidity_proposal.proposal == HumidityProposal.None |
            api.humidity_proposal.proposal == HumidityProposal.Unavailable) &
          (api.routine_proposal.proposal == RoutineProposal.None |
            api.routine_proposal.proposal == RoutineProposal.Unavailable)) ___>: (api.selection_to_composer.intent == SelectedIntent.None &
          api.selection_to_composer.flowClass == FlowClass.Off &
          ((api.filter_proposal.cause == StatusCause.AuthorityInvalid |
            api.humidity_proposal.cause == StatusCause.AuthorityInvalid |
            api.routine_proposal.cause == StatusCause.AuthorityInvalid) &
            api.selection_to_composer.cause == StatusCause.AuthorityInvalid |
            api.filter_proposal.cause != StatusCause.AuthorityInvalid &
              api.humidity_proposal.cause != StatusCause.AuthorityInvalid &
              api.routine_proposal.cause != StatusCause.AuthorityInvalid &
              (api.filter_proposal.cause == StatusCause.AirPathReserved |
                api.humidity_proposal.cause == StatusCause.AirPathReserved |
                api.routine_proposal.cause == StatusCause.AirPathReserved) &
              api.selection_to_composer.cause == StatusCause.AirPathReserved |
            api.filter_proposal.cause != StatusCause.AuthorityInvalid &
              api.humidity_proposal.cause != StatusCause.AuthorityInvalid &
              api.routine_proposal.cause != StatusCause.AuthorityInvalid &
              api.filter_proposal.cause != StatusCause.AirPathReserved &
              api.humidity_proposal.cause != StatusCause.AirPathReserved &
              api.routine_proposal.cause != StatusCause.AirPathReserved &
              (api.filter_proposal.cause == StatusCause.EquipmentUnavailable |
                api.humidity_proposal.cause == StatusCause.EquipmentUnavailable |
                api.routine_proposal.cause == StatusCause.EquipmentUnavailable) &
              api.selection_to_composer.cause == StatusCause.EquipmentUnavailable |
            api.filter_proposal.cause != StatusCause.AuthorityInvalid &
              api.humidity_proposal.cause != StatusCause.AuthorityInvalid &
              api.routine_proposal.cause != StatusCause.AuthorityInvalid &
              api.filter_proposal.cause != StatusCause.AirPathReserved &
              api.humidity_proposal.cause != StatusCause.AirPathReserved &
              api.routine_proposal.cause != StatusCause.AirPathReserved &
              api.filter_proposal.cause != StatusCause.EquipmentUnavailable &
              api.humidity_proposal.cause != StatusCause.EquipmentUnavailable &
              api.routine_proposal.cause != StatusCause.EquipmentUnavailable &
              (api.filter_proposal.cause == StatusCause.SelectedPathUnavailable |
                api.humidity_proposal.cause == StatusCause.SelectedPathUnavailable |
                api.routine_proposal.cause == StatusCause.SelectedPathUnavailable) &
              api.selection_to_composer.cause == StatusCause.SelectedPathUnavailable |
            api.filter_proposal.cause == StatusCause.None &
              api.humidity_proposal.cause == StatusCause.None &
              api.routine_proposal.cause == StatusCause.None &
              api.selection_to_composer.cause == StatusCause.None))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_accepted() match {
      case Some(accepted) => api.get_filter_proposal() match {
        case Some(filter) => api.get_humidity_proposal() match {
          case Some(humidity) => api.get_routine_proposal() match {
            case Some(routine) =>
              val selection: SelectionReport =
                if (accepted.enable == EnableChoice.Off)
                  SelectionReport(SelectedIntent.None, FlowClass.Off, StatusCause.PreferenceDisabled)
                else if (filter.proposal == FilterProposal.Environmental || filter.proposal == FilterProposal.Continuous)
                  SelectionReport(SelectedIntent.Filter, FlowClass.Treatment, StatusCause.AirTreatmentPriority)
                else if (humidity.proposal == HumidityProposal.Reduce)
                  SelectionReport(SelectedIntent.Reduce, FlowClass.Treatment, StatusCause.HumidityTreatmentPriority)
                else if (humidity.proposal == HumidityProposal.Increase)
                  SelectionReport(SelectedIntent.Increase, FlowClass.Treatment, StatusCause.HumidityTreatmentPriority)
                else if (routine.proposal == RoutineProposal.Low || routine.proposal == RoutineProposal.High)
                  SelectionReport(SelectedIntent.ExchangeAir, FlowClass.Routine, StatusCause.None)
                else if (filter.cause == StatusCause.AuthorityInvalid || humidity.cause == StatusCause.AuthorityInvalid || routine.cause == StatusCause.AuthorityInvalid)
                  SelectionReport(SelectedIntent.None, FlowClass.Off, StatusCause.AuthorityInvalid)
                else if (filter.cause == StatusCause.AirPathReserved || humidity.cause == StatusCause.AirPathReserved || routine.cause == StatusCause.AirPathReserved)
                  SelectionReport(SelectedIntent.None, FlowClass.Off, StatusCause.AirPathReserved)
                else if (filter.cause == StatusCause.EquipmentUnavailable || humidity.cause == StatusCause.EquipmentUnavailable || routine.cause == StatusCause.EquipmentUnavailable)
                  SelectionReport(SelectedIntent.None, FlowClass.Off, StatusCause.EquipmentUnavailable)
                else if (filter.cause == StatusCause.SelectedPathUnavailable || humidity.cause == StatusCause.SelectedPathUnavailable || routine.cause == StatusCause.SelectedPathUnavailable)
                  SelectionReport(SelectedIntent.None, FlowClass.Off, StatusCause.SelectedPathUnavailable)
                else SelectionReport(SelectedIntent.None, FlowClass.Off, StatusCause.None)
              api.put_selection_to_composer(selection)
              api.put_selection_to_status(selection)
          }
        }
      }
    }
  }

  def finalise(api: CabinAirPriorityArbiter_Operational_Api): Unit = { }
}
