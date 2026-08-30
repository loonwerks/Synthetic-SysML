// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object EventCoherence_material_continuity_process_event_coherence {

  @strictpure def isCase01(ecl: EventClass.Type, me: MaterialEventCode.Type): B =
    ecl == EventClass.NoEvent && me == MaterialEventCode.NONE

  @strictpure def isCase02(ecl: EventClass.Type, me: MaterialEventCode.Type): B =
    ecl == EventClass.FAILURE && me == MaterialEventCode.FAILED

  @strictpure def isCase03(ecl: EventClass.Type, me: MaterialEventCode.Type, pss: SupplyState.Type): B =
    ecl == EventClass.SUCCESS && me == MaterialEventCode.OrderAccepted && pss == SupplyState.CLEAR

  @strictpure def isCase04(ecl: EventClass.Type, me: MaterialEventCode.Type, pss: SupplyState.Type): B =
    ecl == EventClass.SUCCESS && me == MaterialEventCode.ReceiptOk && pss == SupplyState.ORDERED

  @strictpure def isCase05(ecl: EventClass.Type, me: MaterialEventCode.Type, pds: DemandState.Type): B =
    ecl == EventClass.SUCCESS && me == MaterialEventCode.HandoffOk && pds != DemandState.IDLE

  @strictpure def isCoherent(ecl: EventClass.Type, me: MaterialEventCode.Type, pds: DemandState.Type, pss: SupplyState.Type): B =
    isCase01(ecl, me) || isCase02(ecl, me) || isCase03(ecl, me, pss) || isCase04(ecl, me, pss) || isCase05(ecl, me, pds)

  def initialise(api: EventCoherence_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_EVENT_COHERENCE_SAFE
        api.qualified_event_to_demand == QualifiedEvent.NoProgress,
        api.qualified_event_to_supply == QualifiedEvent.NoProgress,
        api.fault_trigger == FaultTrigger.INACTIVE
      )
    )
    // example api usage

    api.put_qualified_event_to_demand(Factory_Material_Continuity_Coordinator.QualifiedEvent.NoProgress)
    api.put_qualified_event_to_supply(Factory_Material_Continuity_Coordinator.QualifiedEvent.NoProgress)
    api.put_fault_trigger(Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE)
  }

  def timeTriggered(api: EventCoherence_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // IDENTICAL_QUALIFIED_EVENT_DELIVERY
        api.qualified_event_to_demand == api.qualified_event_to_supply,
        // CASE_01_NO_EVENT
        isCase01(api.event_boundary_facts.eventClass, api.event_boundary_facts.materialEvent) ___>: (
          api.qualified_event_to_demand == QualifiedEvent.NoProgress &&
          api.fault_trigger == FaultTrigger.INACTIVE),
        // CASE_02_REPORTED_FAILURE
        isCase02(api.event_boundary_facts.eventClass, api.event_boundary_facts.materialEvent) ___>: (
          api.qualified_event_to_demand == QualifiedEvent.FAULT &&
          api.fault_trigger == FaultTrigger.ACTIVE),
        // CASE_03_ORDER_REGISTERED
        isCase03(api.event_boundary_facts.eventClass, api.event_boundary_facts.materialEvent, api.prior_supply_state) ___>: (
          api.qualified_event_to_demand == QualifiedEvent.OrderRegistered &&
          api.fault_trigger == FaultTrigger.INACTIVE),
        // CASE_04_RECEIPT_CONFIRMED
        isCase04(api.event_boundary_facts.eventClass, api.event_boundary_facts.materialEvent, api.prior_supply_state) ___>: (
          api.qualified_event_to_demand == QualifiedEvent.ReceiptConfirmed &&
          api.fault_trigger == FaultTrigger.INACTIVE),
        // CASE_05_HANDOFF_CONFIRMED
        isCase05(api.event_boundary_facts.eventClass, api.event_boundary_facts.materialEvent, api.prior_demand_state) ___>: (
          api.qualified_event_to_demand == QualifiedEvent.HandoffConfirmed &&
          api.fault_trigger == FaultTrigger.INACTIVE),
        // CASE_06_INCOHERENT_EVENT
        (!isCoherent(api.event_boundary_facts.eventClass, api.event_boundary_facts.materialEvent, api.prior_demand_state, api.prior_supply_state)) ___>: (
          api.qualified_event_to_demand == QualifiedEvent.FAULT &&
          api.fault_trigger == FaultTrigger.ACTIVE)
      )
    )
    // example api usage

    val ebf: Factory_Material_Continuity_Coordinator.EventBoundaryFacts = api.get_event_boundary_facts().get
    val pds: Factory_Material_Continuity_Coordinator.DemandState.Type = api.get_prior_demand_state().get
    val pss: Factory_Material_Continuity_Coordinator.SupplyState.Type = api.get_prior_supply_state().get

    var qed: Factory_Material_Continuity_Coordinator.QualifiedEvent.Type = Factory_Material_Continuity_Coordinator.QualifiedEvent.NoProgress
    var ft: Factory_Material_Continuity_Coordinator.FaultTrigger.Type = Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE

    if (isCase01(ebf.eventClass, ebf.materialEvent)) {
      qed = Factory_Material_Continuity_Coordinator.QualifiedEvent.NoProgress
      ft = Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE
    } else if (isCase02(ebf.eventClass, ebf.materialEvent)) {
      qed = Factory_Material_Continuity_Coordinator.QualifiedEvent.FAULT
      ft = Factory_Material_Continuity_Coordinator.FaultTrigger.ACTIVE
    } else if (isCase03(ebf.eventClass, ebf.materialEvent, pss)) {
      qed = Factory_Material_Continuity_Coordinator.QualifiedEvent.OrderRegistered
      ft = Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE
    } else if (isCase04(ebf.eventClass, ebf.materialEvent, pss)) {
      qed = Factory_Material_Continuity_Coordinator.QualifiedEvent.ReceiptConfirmed
      ft = Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE
    } else if (isCase05(ebf.eventClass, ebf.materialEvent, pds)) {
      qed = Factory_Material_Continuity_Coordinator.QualifiedEvent.HandoffConfirmed
      ft = Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE
    } else {
      qed = Factory_Material_Continuity_Coordinator.QualifiedEvent.FAULT
      ft = Factory_Material_Continuity_Coordinator.FaultTrigger.ACTIVE
    }

    api.put_qualified_event_to_demand(qed)
    api.put_qualified_event_to_supply(qed)
    api.put_fault_trigger(ft)
  }

  def finalise(api: EventCoherence_Operational_Api): Unit = { }
}
