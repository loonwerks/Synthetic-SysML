// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter {

  def initialise(api: CabinAirPriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val selection: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport = Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
      Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
      Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
      Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled)
    api.put_selection_to_composer(selection)
    api.put_selection_to_status(selection)
  }

  def timeTriggered(api: CabinAirPriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_accepted(), api.get_filter_proposal(), api.get_humidity_proposal(), api.get_routine_proposal()) match {
      case (Some(accepted), Some(filter), Some(humidity), Some(routine)) =>
        val cause: Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type =
          if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid ||
              humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid ||
              routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid) Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid
          else if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved ||
                   humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved ||
                   routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved) Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved
          else if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable ||
                   humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable ||
                   routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable) Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable
          else if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable ||
                   humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable ||
                   routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable) Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable
          else Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None
        val selection: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport =
          if (accepted.enable == Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off)
            Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled)
          else if (filter.proposal == Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Environmental ||
                   filter.proposal == Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Continuous)
            Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Filter, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirTreatmentPriority)
          else if (humidity.proposal == Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Reduce)
            Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Reduce, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.HumidityTreatmentPriority)
          else if (humidity.proposal == Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Increase)
            Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Increase, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.HumidityTreatmentPriority)
          else if (routine.proposal == Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Low ||
                   routine.proposal == Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.High)
            Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.ExchangeAir, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Routine, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
          else Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, cause)
        api.put_selection_to_composer(selection)
        api.put_selection_to_status(selection)
      case _ =>
        val selection: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport = Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None, Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled)
        api.put_selection_to_composer(selection)
        api.put_selection_to_status(selection)
    }
  }

  def finalise(api: CabinAirPriorityArbiter_Operational_Api): Unit = { }
}
