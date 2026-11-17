// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter {
  def unavailableCause(
    filter: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport,
    humidity: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport,
    routine: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport):
  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type = {
    if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid ||
        humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid ||
        routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid) {
      return Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid
    } else if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved ||
               humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved ||
               routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved) {
      return Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved
    } else if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable ||
               humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable ||
               routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable) {
      return Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable
    } else if (filter.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable ||
               humidity.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable ||
               routine.cause == Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable) {
      return Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable
    } else {
      return Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None
    }
  }

  def publish(api: CabinAirPriorityArbiter_Operational_Api,
              result: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport): Unit = {
    api.put_selection_to_composer(result)
    api.put_selection_to_status(result)
  }

  def initialise(api: CabinAirPriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val result: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport =
      Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
      Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
      Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
      Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled)
    api.put_selection_to_composer(result)
    api.put_selection_to_status(result)
  }

  def timeTriggered(api: CabinAirPriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_accepted() match {
      case Some(accepted) => api.get_filter_proposal() match {
        case Some(filter) => api.get_humidity_proposal() match {
          case Some(humidity) => api.get_routine_proposal() match {
            case Some(routine) =>
              val filterDemand = filter.proposal == Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Environmental ||
                filter.proposal == Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Continuous
              val noFilter = filter.proposal == Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.None ||
                filter.proposal == Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Unavailable
              val noHumidity = humidity.proposal == Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.None ||
                humidity.proposal == Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Unavailable
              val result: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport =
                if (accepted.enable == Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off)
                  Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
                    Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
                    Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.PreferenceDisabled)
                else if (filterDemand)
                  Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
                    Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Filter,
                    Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment,
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirTreatmentPriority)
                else if (noFilter && humidity.proposal == Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Reduce)
                  Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
                    Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Reduce,
                    Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment,
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.HumidityTreatmentPriority)
                else if (noFilter && humidity.proposal == Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Increase)
                  Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
                    Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Increase,
                    Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Treatment,
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.HumidityTreatmentPriority)
                else if (noFilter && noHumidity &&
                         (routine.proposal == Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Low ||
                          routine.proposal == Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.High))
                  Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
                    Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.ExchangeAir,
                    Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Routine,
                    Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
                else Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
                  Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
                  Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
                  unavailableCause(filter, humidity, routine))
              publish(api, result)
            case _ => publish(api, Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
              Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
              Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
              Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
          }
          case _ => publish(api, Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
            Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
            Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
            Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
        }
        case _ => publish(api, Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
          Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
          Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
          Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
      }
      case _ => publish(api, Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(
        Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.None,
        Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Off,
        Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
    }
  }

  def finalise(api: CabinAirPriorityArbiter_Operational_Api): Unit = { }
}
