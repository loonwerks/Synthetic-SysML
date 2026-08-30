// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object EventAcquisition_material_continuity_process_event_acquisition {

  @strictpure def eventCodeOf(e: MaterialEvent.Type): MaterialEventCode.Type = e match {
    case MaterialEvent.NONE => MaterialEventCode.NONE
    case MaterialEvent.OrderAccepted => MaterialEventCode.OrderAccepted
    case MaterialEvent.ReceiptOk => MaterialEventCode.ReceiptOk
    case MaterialEvent.HandoffOk => MaterialEventCode.HandoffOk
    case MaterialEvent.FAILED => MaterialEventCode.FAILED
  }

  @strictpure def eventClassOf(e: MaterialEvent.Type): EventClass.Type = e match {
    case MaterialEvent.NONE => EventClass.NoEvent
    case MaterialEvent.FAILED => EventClass.FAILURE
    case MaterialEvent.OrderAccepted => EventClass.SUCCESS
    case MaterialEvent.ReceiptOk => EventClass.SUCCESS
    case MaterialEvent.HandoffOk => EventClass.SUCCESS
  }

  def initialise(api: EventAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_NO_EVENT
        api.event_boundary_facts.materialEvent == MaterialEventCode.NONE,
        api.event_boundary_facts.eventClass == EventClass.NoEvent
      )
    )
    // example api usage

    api.put_event_boundary_facts(
      Factory_Material_Continuity_Coordinator.EventBoundaryFacts(
        materialEvent = Factory_Material_Continuity_Coordinator.MaterialEventCode.NONE,
        eventClass = Factory_Material_Continuity_Coordinator.EventClass.NoEvent))
  }

  def timeTriggered(api: EventAcquisition_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // EVENT_CLASSIFICATION
        api.event_boundary_facts.materialEvent == eventCodeOf(api.material_event),
        api.event_boundary_facts.eventClass == eventClassOf(api.material_event)
      )
    )
    // example api usage

    val apiUsage_material_event: Option[Factory_Material_Continuity_Coordinator.MaterialEvent.Type] = api.get_material_event()
    val event = apiUsage_material_event.get

    api.put_event_boundary_facts(
      Factory_Material_Continuity_Coordinator.EventBoundaryFacts(
        materialEvent = eventCodeOf(event),
        eventClass = eventClassOf(event)))
  }

  def finalise(api: EventAcquisition_Operational_Api): Unit = { }
}
