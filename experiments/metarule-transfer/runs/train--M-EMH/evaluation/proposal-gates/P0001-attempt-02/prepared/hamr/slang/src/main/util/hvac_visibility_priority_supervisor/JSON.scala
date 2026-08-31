// #Sireum
// @formatter:off

// This file is auto-generated from Validity.scala, Arrival.scala, EnableIntent.scala, DefrostIntent.scala, ThermalBand.scala, FanIntent.scala, RequestClass.scala, CabinBand.scala, ThermalNeed.scala, ThermalObservationValidity.scala, GlazingCondition.scala, VisibilityNeed.scala, VisibilityCriticality.scala, HumidityCondition.scala, HumidityNeed.scala, AirCondition.scala, AirNeed.scala, InterfaceState.scala, Budget.scala, ElectricalTier.scala, ElectricalCause.scala, ElectricalCriticality.scala, Availability.scala, WasteHeatEligibility.scala, BlowerReadiness.scala, ThermalReadiness.scala, ClearingReadiness.scala, AirTreatmentReadiness.scala, EquipmentCriticality.scala, ThermalBlowerAvailability.scala, ThermalEquipmentAvailability.scala, VisibilityBlowerAvailability.scala, ClearingAvailability.scala, AirTreatmentAvailability.scala, RecoveryState.scala, RecoveryEvent.scala, RecoveryCause.scala, Service.scala, HeatSource.scala, ThermalProposalAvailability.scala, ThermalDegradation.scala, VisibilityProposalAvailability.scala, ProposalUrgency.scala, CabinAirProposalAvailability.scala, HumidityDegradation.scala, AirDegradation.scala, SelectionCause.scala, SelectionMode.scala, Authorization.scala, ArbitrationMode.scala, ArbitrationCause.scala, NoncriticalCause.scala, Intensity.scala, EnergyTier.scala, CandidateCause.scala, RecoveryAcknowledgment.scala, SupervisorMode.scala, StatusCause.scala, UserClimateRequest.scala, QualifiedTarget.scala, QualifiedRequest.scala, CabinThermalObservation.scala, ThermalAssessment.scala, GlazingObservation.scala, HumidityObservation.scala, AirQualityObservation.scala, ElectricalAvailability.scala, ElectricalEligibility.scala, WasteHeatAvailability.scala, EquipmentReadiness.scala, ThermalPathReadiness.scala, VisibilityPathReadiness.scala, AirPathReadiness.scala, RecoveryReport.scala, ThermalProposal.scala, VisibilityProposal.scala, CabinAirProposal.scala, SelectedIntent.scala, ArbitrationStatus.scala, CabinActuationPlan.scala, SupervisorStatus.scala, CandidatePlan.scala, Base_Types.scala, RequestQualifier_supervision_requestQualifier_Containers.scala, ThermalNeedAssessor_supervision_thermalNeedAssessor_Containers.scala, VisibilityNeedAssessor_supervision_visibilityNeedAssessor_Containers.scala, HumidityNeedAssessor_supervision_humidityNeedAssessor_Containers.scala, AirQualityNeedAssessor_supervision_airQualityNeedAssessor_Containers.scala, ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_Containers.scala, WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_Containers.scala, EquipmentFaultAssessor_supervision_equipmentFaultAssessor_Containers.scala, PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_Containers.scala, ThermalServiceProposer_supervision_thermalServiceProposer_Containers.scala, VisibilityServiceProposer_supervision_visibilityServiceProposer_Containers.scala, CabinAirServiceProposer_supervision_cabinAirServiceProposer_Containers.scala, EnergySafePlanComposer_supervision_energySafePlanComposer_Containers.scala, CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_Containers.scala, AtomicResultPublisher_supervision_atomicResultPublisher_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package hvac_visibility_priority_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printHVAC_Visibility_Priority_SupervisorValidityType(o: HVAC_Visibility_Priority_Supervisor.Validity.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.Validity.Valid => "Valid"
        case HVAC_Visibility_Priority_Supervisor.Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.Validity_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorValidityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArrivalType(o: HVAC_Visibility_Priority_Supervisor.Arrival.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.Arrival.New => "New"
        case HVAC_Visibility_Priority_Supervisor.Arrival.Held => "Held"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.Arrival")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArrival_Payload(o: HVAC_Visibility_Priority_Supervisor.Arrival_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.Arrival_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorArrivalType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnableIntentType(o: HVAC_Visibility_Priority_Supervisor.EnableIntent.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.EnableIntent.On => "On"
        case HVAC_Visibility_Priority_Supervisor.EnableIntent.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.EnableIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorEnableIntentType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorDefrostIntentType(o: HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.DefrostIntent.Requested => "Requested"
        case HVAC_Visibility_Priority_Supervisor.DefrostIntent.NotRequested => "NotRequested"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.DefrostIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorDefrostIntentType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalBandType(o: HVAC_Visibility_Priority_Supervisor.ThermalBand.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalBand.Cool => "Cool"
        case HVAC_Visibility_Priority_Supervisor.ThermalBand.Neutral => "Neutral"
        case HVAC_Visibility_Priority_Supervisor.ThermalBand.Warm => "Warm"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalBand")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalBandType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorFanIntentType(o: HVAC_Visibility_Priority_Supervisor.FanIntent.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.FanIntent.Low => "Low"
        case HVAC_Visibility_Priority_Supervisor.FanIntent.High => "High"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.FanIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.FanIntent_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorFanIntentType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestClassType(o: HVAC_Visibility_Priority_Supervisor.RequestClass.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid => "Invalid"
        case HVAC_Visibility_Priority_Supervisor.RequestClass.Off => "Off"
        case HVAC_Visibility_Priority_Supervisor.RequestClass.Defrost => "Defrost"
        case HVAC_Visibility_Priority_Supervisor.RequestClass.Comfort => "Comfort"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.RequestClass")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RequestClass_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorRequestClassType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinBandType(o: HVAC_Visibility_Priority_Supervisor.CabinBand.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.CabinBand.Cool => "Cool"
        case HVAC_Visibility_Priority_Supervisor.CabinBand.Neutral => "Neutral"
        case HVAC_Visibility_Priority_Supervisor.CabinBand.Warm => "Warm"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.CabinBand")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinBand_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorCabinBandType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeedType(o: HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalNeed.Unavailable => "Unavailable"
        case HVAC_Visibility_Priority_Supervisor.ThermalNeed.Heat => "Heat"
        case HVAC_Visibility_Priority_Supervisor.ThermalNeed.None => "None"
        case HVAC_Visibility_Priority_Supervisor.ThermalNeed.Cool => "Cool"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalNeed")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalNeedType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid => "Valid"
        case HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorGlazingConditionType(o: HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.GlazingCondition.Clear => "Clear"
        case HVAC_Visibility_Priority_Supervisor.GlazingCondition.Misting => "Misting"
        case HVAC_Visibility_Priority_Supervisor.GlazingCondition.Obscured => "Obscured"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.GlazingCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorGlazingConditionType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Unavailable => "Unavailable"
        case HVAC_Visibility_Priority_Supervisor.VisibilityNeed.None => "None"
        case HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Preventive => "Preventive"
        case HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Urgent => "Urgent"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.VisibilityNeed")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present => "Present"
        case HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Absent => "Absent"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.VisibilityCriticality")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityConditionType(o: HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.HumidityCondition.Dry => "Dry"
        case HVAC_Visibility_Priority_Supervisor.HumidityCondition.Acceptable => "Acceptable"
        case HVAC_Visibility_Priority_Supervisor.HumidityCondition.Damp => "Damp"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.HumidityCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorHumidityConditionType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeedType(o: HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.HumidityNeed.Unavailable => "Unavailable"
        case HVAC_Visibility_Priority_Supervisor.HumidityNeed.None => "None"
        case HVAC_Visibility_Priority_Supervisor.HumidityNeed.Dry => "Dry"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.HumidityNeed")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirConditionType(o: HVAC_Visibility_Priority_Supervisor.AirCondition.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.AirCondition.Clean => "Clean"
        case HVAC_Visibility_Priority_Supervisor.AirCondition.Loaded => "Loaded"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.AirCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirCondition_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAirConditionType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirNeedType(o: HVAC_Visibility_Priority_Supervisor.AirNeed.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.AirNeed.Unavailable => "Unavailable"
        case HVAC_Visibility_Priority_Supervisor.AirNeed.None => "None"
        case HVAC_Visibility_Priority_Supervisor.AirNeed.Filter => "Filter"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.AirNeed")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirNeed_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAirNeedType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorInterfaceStateType(o: HVAC_Visibility_Priority_Supervisor.InterfaceState.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.InterfaceState.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.InterfaceState.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.InterfaceState")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorInterfaceStateType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorBudgetType(o: HVAC_Visibility_Priority_Supervisor.Budget.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.Budget.Denied => "Denied"
        case HVAC_Visibility_Priority_Supervisor.Budget.Limited => "Limited"
        case HVAC_Visibility_Priority_Supervisor.Budget.Full => "Full"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.Budget")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorBudget_Payload(o: HVAC_Visibility_Priority_Supervisor.Budget_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.Budget_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorBudgetType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalTierType(o: HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ElectricalTier.Ineligible => "Ineligible"
        case HVAC_Visibility_Priority_Supervisor.ElectricalTier.Denied => "Denied"
        case HVAC_Visibility_Priority_Supervisor.ElectricalTier.Limited => "Limited"
        case HVAC_Visibility_Priority_Supervisor.ElectricalTier.Full => "Full"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ElectricalTier")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorElectricalTierType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalCauseType(o: HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ElectricalCause.None => "None"
        case HVAC_Visibility_Priority_Supervisor.ElectricalCause.InvalidInterface => "InvalidInterface"
        case HVAC_Visibility_Priority_Supervisor.ElectricalCause.ElectricalUnavailable => "ElectricalUnavailable"
        case HVAC_Visibility_Priority_Supervisor.ElectricalCause.ElectricalDenied => "ElectricalDenied"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ElectricalCause")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorElectricalCauseType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present => "Present"
        case HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Absent => "Absent"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ElectricalCriticality")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.Availability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.Availability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.Availability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.Availability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Eligible => "Eligible"
        case HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Ineligible => "Ineligible"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorBlowerReadinessType(o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Ready => "Ready"
        case HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Failed => "Failed"
        case HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.BlowerReadiness")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorBlowerReadinessType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalReadinessType(o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Ready => "Ready"
        case HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Failed => "Failed"
        case HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalReadiness")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalReadinessType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorClearingReadinessType(o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Ready => "Ready"
        case HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Failed => "Failed"
        case HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ClearingReadiness")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorClearingReadinessType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Ready => "Ready"
        case HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Failed => "Failed"
        case HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present => "Present"
        case HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Absent => "Absent"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.EquipmentCriticality")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ClearingAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryStateType(o: HVAC_Visibility_Priority_Supervisor.RecoveryState.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.RecoveryState.Clear => "Clear"
        case HVAC_Visibility_Priority_Supervisor.RecoveryState.Latched => "Latched"
        case HVAC_Visibility_Priority_Supervisor.RecoveryState.Pending => "Pending"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.RecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorRecoveryStateType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryEventType(o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.RecoveryEvent.NoRecoveryEvent => "NoRecoveryEvent"
        case HVAC_Visibility_Priority_Supervisor.RecoveryEvent.FaultEntered => "FaultEntered"
        case HVAC_Visibility_Priority_Supervisor.RecoveryEvent.AwaitingRecovery => "AwaitingRecovery"
        case HVAC_Visibility_Priority_Supervisor.RecoveryEvent.RecoveryStarted => "RecoveryStarted"
        case HVAC_Visibility_Priority_Supervisor.RecoveryEvent.FaultRecurred => "FaultRecurred"
        case HVAC_Visibility_Priority_Supervisor.RecoveryEvent.JustCleared => "JustCleared"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.RecoveryEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorRecoveryEventType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryCauseType(o: HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.RecoveryCause.None => "None"
        case HVAC_Visibility_Priority_Supervisor.RecoveryCause.InvalidVisibility => "InvalidVisibility"
        case HVAC_Visibility_Priority_Supervisor.RecoveryCause.EquipmentFault => "EquipmentFault"
        case HVAC_Visibility_Priority_Supervisor.RecoveryCause.ElectricalUnavailable => "ElectricalUnavailable"
        case HVAC_Visibility_Priority_Supervisor.RecoveryCause.AwaitingRecovery => "AwaitingRecovery"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.RecoveryCause")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorRecoveryCauseType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorServiceType(o: HVAC_Visibility_Priority_Supervisor.Service.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.Service.None => "None"
        case HVAC_Visibility_Priority_Supervisor.Service.Ventilate => "Ventilate"
        case HVAC_Visibility_Priority_Supervisor.Service.Heat => "Heat"
        case HVAC_Visibility_Priority_Supervisor.Service.Cool => "Cool"
        case HVAC_Visibility_Priority_Supervisor.Service.Defrost => "Defrost"
        case HVAC_Visibility_Priority_Supervisor.Service.Filter => "Filter"
        case HVAC_Visibility_Priority_Supervisor.Service.Dry => "Dry"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.Service")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorService_Payload(o: HVAC_Visibility_Priority_Supervisor.Service_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.Service_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorServiceType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHeatSourceType(o: HVAC_Visibility_Priority_Supervisor.HeatSource.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.HeatSource.None => "None"
        case HVAC_Visibility_Priority_Supervisor.HeatSource.Electrical => "Electrical"
        case HVAC_Visibility_Priority_Supervisor.HeatSource.WasteHeat => "WasteHeat"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.HeatSource")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HeatSource_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorHeatSourceType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalDegradationType(o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ThermalDegradation.None => "None"
        case HVAC_Visibility_Priority_Supervisor.ThermalDegradation.InvalidThermal => "InvalidThermal"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ThermalDegradation")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalDegradationType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorProposalUrgencyType(o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Unavailable => "Unavailable"
        case HVAC_Visibility_Priority_Supervisor.ProposalUrgency.None => "None"
        case HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Preventive => "Preventive"
        case HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Urgent => "Urgent"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ProposalUrgency")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorProposalUrgencyType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Available => "Available"
        case HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityDegradationType(o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.HumidityDegradation.None => "None"
        case HVAC_Visibility_Priority_Supervisor.HumidityDegradation.InvalidHumidity => "InvalidHumidity"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.HumidityDegradation")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorHumidityDegradationType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirDegradationType(o: HVAC_Visibility_Priority_Supervisor.AirDegradation.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.AirDegradation.None => "None"
        case HVAC_Visibility_Priority_Supervisor.AirDegradation.InvalidAirQuality => "InvalidAirQuality"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.AirDegradation")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAirDegradationType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSelectionCauseType(o: HVAC_Visibility_Priority_Supervisor.SelectionCause.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.SelectionCause.None => "None"
        case HVAC_Visibility_Priority_Supervisor.SelectionCause.VisibilityPriority => "VisibilityPriority"
        case HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingRecovery => "AwaitingRecovery"
        case HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingFreshRequest => "AwaitingFreshRequest"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.SelectionCause")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorSelectionCauseType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSelectionModeType(o: HVAC_Visibility_Priority_Supervisor.SelectionMode.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.SelectionMode.Idle => "Idle"
        case HVAC_Visibility_Priority_Supervisor.SelectionMode.Active => "Active"
        case HVAC_Visibility_Priority_Supervisor.SelectionMode.Degraded => "Degraded"
        case HVAC_Visibility_Priority_Supervisor.SelectionMode.FaultHold => "FaultHold"
        case HVAC_Visibility_Priority_Supervisor.SelectionMode.AwaitFresh => "AwaitFresh"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.SelectionMode")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorSelectionModeType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAuthorizationType(o: HVAC_Visibility_Priority_Supervisor.Authorization.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.Authorization.Normal => "Normal"
        case HVAC_Visibility_Priority_Supervisor.Authorization.AwaitFresh => "AwaitFresh"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.Authorization")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o: HVAC_Visibility_Priority_Supervisor.Authorization_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.Authorization_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAuthorizationType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArbitrationModeType(o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Idle => "Idle"
        case HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active => "Active"
        case HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Degraded => "Degraded"
        case HVAC_Visibility_Priority_Supervisor.ArbitrationMode.FaultHold => "FaultHold"
        case HVAC_Visibility_Priority_Supervisor.ArbitrationMode.AwaitFresh => "AwaitFresh"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ArbitrationMode")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorArbitrationModeType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArbitrationCauseType(o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None => "None"
        case HVAC_Visibility_Priority_Supervisor.ArbitrationCause.VisibilityPriority => "VisibilityPriority"
        case HVAC_Visibility_Priority_Supervisor.ArbitrationCause.AwaitingRecovery => "AwaitingRecovery"
        case HVAC_Visibility_Priority_Supervisor.ArbitrationCause.AwaitingFreshRequest => "AwaitingFreshRequest"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.ArbitrationCause")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorArbitrationCauseType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.NoncriticalCause.None => "None"
        case HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidThermal => "InvalidThermal"
        case HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidHumidity => "InvalidHumidity"
        case HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidAirQuality => "InvalidAirQuality"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.NoncriticalCause")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorIntensityType(o: HVAC_Visibility_Priority_Supervisor.Intensity.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.Intensity.Off => "Off"
        case HVAC_Visibility_Priority_Supervisor.Intensity.Reduced => "Reduced"
        case HVAC_Visibility_Priority_Supervisor.Intensity.Normal => "Normal"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.Intensity")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorIntensity_Payload(o: HVAC_Visibility_Priority_Supervisor.Intensity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.Intensity_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorIntensityType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergyTierType(o: HVAC_Visibility_Priority_Supervisor.EnergyTier.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.EnergyTier.None => "None"
        case HVAC_Visibility_Priority_Supervisor.EnergyTier.Limited => "Limited"
        case HVAC_Visibility_Priority_Supervisor.EnergyTier.Full => "Full"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.EnergyTier")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorEnergyTierType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCandidateCauseType(o: HVAC_Visibility_Priority_Supervisor.CandidateCause.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.CandidateCause.None => "None"
        case HVAC_Visibility_Priority_Supervisor.CandidateCause.VisibilityPriority => "VisibilityPriority"
        case HVAC_Visibility_Priority_Supervisor.CandidateCause.ElectricalUnavailable => "ElectricalUnavailable"
        case HVAC_Visibility_Priority_Supervisor.CandidateCause.ElectricalDenied => "ElectricalDenied"
        case HVAC_Visibility_Priority_Supervisor.CandidateCause.AwaitingRecovery => "AwaitingRecovery"
        case HVAC_Visibility_Priority_Supervisor.CandidateCause.AwaitingFreshRequest => "AwaitingFreshRequest"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.CandidateCause")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorCandidateCauseType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Absent => "Absent"
        case HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Fresh => "Fresh"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSupervisorModeType(o: HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.SupervisorMode.Idle => "Idle"
        case HVAC_Visibility_Priority_Supervisor.SupervisorMode.Active => "Active"
        case HVAC_Visibility_Priority_Supervisor.SupervisorMode.Degraded => "Degraded"
        case HVAC_Visibility_Priority_Supervisor.SupervisorMode.FaultHold => "FaultHold"
        case HVAC_Visibility_Priority_Supervisor.SupervisorMode.AwaitFresh => "AwaitFresh"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.SupervisorMode")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorSupervisorModeType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorStatusCauseType(o: HVAC_Visibility_Priority_Supervisor.StatusCause.Type): ST = {
      val value: String = o match {
        case HVAC_Visibility_Priority_Supervisor.StatusCause.None => "None"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.VisibilityPriority => "VisibilityPriority"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.ElectricalUnavailable => "ElectricalUnavailable"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.ElectricalDenied => "ElectricalDenied"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.EquipmentFault => "EquipmentFault"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidVisibility => "InvalidVisibility"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidThermal => "InvalidThermal"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidHumidity => "InvalidHumidity"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.InvalidAirQuality => "InvalidAirQuality"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.AwaitingRecovery => "AwaitingRecovery"
        case HVAC_Visibility_Priority_Supervisor.StatusCause.AwaitingFreshRequest => "AwaitingFreshRequest"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Visibility_Priority_Supervisor.StatusCause")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.StatusCause_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorStatusCauseType(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorUserClimateRequest(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.UserClimateRequest""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("arrival", printHVAC_Visibility_Priority_SupervisorArrivalType(o.arrival)),
        ("enabled", printHVAC_Visibility_Priority_SupervisorEnableIntentType(o.enabled)),
        ("defrost", printHVAC_Visibility_Priority_SupervisorDefrostIntentType(o.defrost)),
        ("target", printHVAC_Visibility_Priority_SupervisorThermalBandType(o.target)),
        ("fan", printHVAC_Visibility_Priority_SupervisorFanIntentType(o.fan))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorUserClimateRequest(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorQualifiedTarget(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.QualifiedTarget""""),
        ("requestClass", printHVAC_Visibility_Priority_SupervisorRequestClassType(o.requestClass)),
        ("target", printHVAC_Visibility_Priority_SupervisorThermalBandType(o.target))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorQualifiedRequest(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.QualifiedRequest""""),
        ("requestClass", printHVAC_Visibility_Priority_SupervisorRequestClassType(o.requestClass)),
        ("arrival", printHVAC_Visibility_Priority_SupervisorArrivalType(o.arrival)),
        ("enabled", printHVAC_Visibility_Priority_SupervisorEnableIntentType(o.enabled)),
        ("fan", printHVAC_Visibility_Priority_SupervisorFanIntentType(o.fan))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinThermalObservation""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("band", printHVAC_Visibility_Priority_SupervisorCabinBandType(o.band))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalAssessment(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalAssessment""""),
        ("need", printHVAC_Visibility_Priority_SupervisorThermalNeedType(o.need)),
        ("observationInvalid", printHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(o.observationInvalid))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalAssessment(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorGlazingObservation(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.GlazingObservation""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("condition", printHVAC_Visibility_Priority_SupervisorGlazingConditionType(o.condition))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorGlazingObservation(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityObservation(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityObservation""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("condition", printHVAC_Visibility_Priority_SupervisorHumidityConditionType(o.condition))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorHumidityObservation(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityObservation(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirQualityObservation""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("condition", printHVAC_Visibility_Priority_SupervisorAirConditionType(o.condition))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAirQualityObservation(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalAvailability(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalAvailability""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("interfaceState", printHVAC_Visibility_Priority_SupervisorInterfaceStateType(o.interfaceState)),
        ("budget", printHVAC_Visibility_Priority_SupervisorBudgetType(o.budget))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorElectricalAvailability(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibility(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalEligibility""""),
        ("tier", printHVAC_Visibility_Priority_SupervisorElectricalTierType(o.tier)),
        ("eligibilityCause", printHVAC_Visibility_Priority_SupervisorElectricalCauseType(o.eligibilityCause))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("availability", printHVAC_Visibility_Priority_SupervisorAvailabilityType(o.availability))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EquipmentReadiness""""),
        ("validity", printHVAC_Visibility_Priority_SupervisorValidityType(o.validity)),
        ("circulationState", printHVAC_Visibility_Priority_SupervisorBlowerReadinessType(o.circulationState)),
        ("thermal", printHVAC_Visibility_Priority_SupervisorThermalReadinessType(o.thermal)),
        ("clearing", printHVAC_Visibility_Priority_SupervisorClearingReadinessType(o.clearing)),
        ("airTreatment", printHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(o.airTreatment))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness""""),
        ("thermalBlowerReady", printHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(o.thermalBlowerReady)),
        ("thermalReady", printHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(o.thermalReady))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness""""),
        ("visibilityBlowerReady", printHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(o.visibilityBlowerReady)),
        ("clearingReady", printHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(o.clearingReady))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirPathReadiness(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirPathReadiness""""),
        ("airReady", printHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(o.airReady))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryReport(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RecoveryReport""""),
        ("recoveryState", printHVAC_Visibility_Priority_SupervisorRecoveryStateType(o.recoveryState)),
        ("recoveryEvent", printHVAC_Visibility_Priority_SupervisorRecoveryEventType(o.recoveryEvent)),
        ("faultAttribution", printHVAC_Visibility_Priority_SupervisorRecoveryCauseType(o.faultAttribution))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorRecoveryReport(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalProposal(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalProposal""""),
        ("service", printHVAC_Visibility_Priority_SupervisorServiceType(o.service)),
        ("heatSource", printHVAC_Visibility_Priority_SupervisorHeatSourceType(o.heatSource)),
        ("thermalApplicability", printHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(o.thermalApplicability)),
        ("degradation", printHVAC_Visibility_Priority_SupervisorThermalDegradationType(o.degradation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorThermalProposal(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityProposal(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityProposal""""),
        ("visibilityApplicability", printHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(o.visibilityApplicability)),
        ("urgency", printHVAC_Visibility_Priority_SupervisorProposalUrgencyType(o.urgency))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirProposal(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinAirProposal""""),
        ("service", printHVAC_Visibility_Priority_SupervisorServiceType(o.service)),
        ("cabinAirApplicability", printHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(o.cabinAirApplicability)),
        ("humidityDegradation", printHVAC_Visibility_Priority_SupervisorHumidityDegradationType(o.humidityDegradation)),
        ("airDegradation", printHVAC_Visibility_Priority_SupervisorAirDegradationType(o.airDegradation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSelectedIntent(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.SelectedIntent""""),
        ("service", printHVAC_Visibility_Priority_SupervisorServiceType(o.service)),
        ("heatSource", printHVAC_Visibility_Priority_SupervisorHeatSourceType(o.heatSource)),
        ("fan", printHVAC_Visibility_Priority_SupervisorFanIntentType(o.fan)),
        ("selectedCause", printHVAC_Visibility_Priority_SupervisorSelectionCauseType(o.selectedCause)),
        ("controlMode", printHVAC_Visibility_Priority_SupervisorSelectionModeType(o.controlMode))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorSelectedIntent(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArbitrationStatus(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ArbitrationStatus""""),
        ("authorization", printHVAC_Visibility_Priority_SupervisorAuthorizationType(o.authorization)),
        ("controlMode", printHVAC_Visibility_Priority_SupervisorArbitrationModeType(o.controlMode)),
        ("arbitrationCause", printHVAC_Visibility_Priority_SupervisorArbitrationCauseType(o.arbitrationCause)),
        ("noncriticalCause", printHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(o.noncriticalCause))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinActuationPlan""""),
        ("service", printHVAC_Visibility_Priority_SupervisorServiceType(o.service)),
        ("intensity", printHVAC_Visibility_Priority_SupervisorIntensityType(o.intensity)),
        ("heatSource", printHVAC_Visibility_Priority_SupervisorHeatSourceType(o.heatSource)),
        ("energyTier", printHVAC_Visibility_Priority_SupervisorEnergyTierType(o.energyTier))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSupervisorStatus(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.SupervisorStatus""""),
        ("mode", printHVAC_Visibility_Priority_SupervisorSupervisorModeType(o.mode)),
        ("statusCause", printHVAC_Visibility_Priority_SupervisorStatusCauseType(o.statusCause))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorSupervisorStatus(o.value))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCandidatePlan(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CandidatePlan""""),
        ("plan", printHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.plan)),
        ("candidateCause", printHVAC_Visibility_Priority_SupervisorCandidateCauseType(o.candidateCause))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload""""),
        ("value", printHVAC_Visibility_Priority_SupervisorCandidatePlan(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P""""),
        ("api_userRequest", printHVAC_Visibility_Priority_SupervisorUserClimateRequest(o.api_userRequest))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS""""),
        ("api_userRequest", printHVAC_Visibility_Priority_SupervisorUserClimateRequest(o.api_userRequest))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P""""),
        ("api_qualifiedRequest", printHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)),
        ("api_qualifiedTarget", printHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS""""),
        ("api_qualifiedRequest", printHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)),
        ("api_qualifiedTarget", printHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P""""),
        ("api_cabinObservation", printHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o.api_cabinObservation)),
        ("api_qualifiedTarget", printHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS""""),
        ("api_cabinObservation", printHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o.api_cabinObservation)),
        ("api_qualifiedTarget", printHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P""""),
        ("api_thermalAssessment", printHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS""""),
        ("api_thermalAssessment", printHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P""""),
        ("api_glazingObservation", printHVAC_Visibility_Priority_SupervisorGlazingObservation(o.api_glazingObservation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS""""),
        ("api_glazingObservation", printHVAC_Visibility_Priority_SupervisorGlazingObservation(o.api_glazingObservation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P""""),
        ("api_visibilityFault", printHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault)),
        ("api_visibilityNeed", printHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS""""),
        ("api_visibilityFault", printHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault)),
        ("api_visibilityNeed", printHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P""""),
        ("api_humidityObservation", printHVAC_Visibility_Priority_SupervisorHumidityObservation(o.api_humidityObservation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS""""),
        ("api_humidityObservation", printHVAC_Visibility_Priority_SupervisorHumidityObservation(o.api_humidityObservation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P""""),
        ("api_humidityNeed", printHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS""""),
        ("api_humidityNeed", printHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P""""),
        ("api_airObservation", printHVAC_Visibility_Priority_SupervisorAirQualityObservation(o.api_airObservation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS""""),
        ("api_airObservation", printHVAC_Visibility_Priority_SupervisorAirQualityObservation(o.api_airObservation))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P""""),
        ("api_airNeed", printHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS""""),
        ("api_airNeed", printHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P""""),
        ("api_electricalAvailability", printHVAC_Visibility_Priority_SupervisorElectricalAvailability(o.api_electricalAvailability))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS""""),
        ("api_electricalAvailability", printHVAC_Visibility_Priority_SupervisorElectricalAvailability(o.api_electricalAvailability))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P""""),
        ("api_criticalElectrical", printHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)),
        ("api_electricalEligibility", printHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS""""),
        ("api_criticalElectrical", printHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)),
        ("api_electricalEligibility", printHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P""""),
        ("api_wasteHeatAvailability", printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o.api_wasteHeatAvailability))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS""""),
        ("api_wasteHeatAvailability", printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o.api_wasteHeatAvailability))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P""""),
        ("api_wasteHeatEligibility", printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS""""),
        ("api_wasteHeatEligibility", printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P""""),
        ("api_equipmentReadiness", printHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o.api_equipmentReadiness))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS""""),
        ("api_equipmentReadiness", printHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o.api_equipmentReadiness))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P""""),
        ("api_airPath", printHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)),
        ("api_criticalEquipment", printHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)),
        ("api_thermalPath", printHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)),
        ("api_visibilityPath", printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS""""),
        ("api_airPath", printHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)),
        ("api_criticalEquipment", printHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)),
        ("api_thermalPath", printHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)),
        ("api_visibilityPath", printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P""""),
        ("api_cabinAirProposal", printHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal)),
        ("api_qualifiedRequest", printHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)),
        ("api_recoveryReport", printHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)),
        ("api_thermalProposal", printHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal)),
        ("api_visibilityProposal", printHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS""""),
        ("In_authorization", printHVAC_Visibility_Priority_SupervisorAuthorizationType(o.In_authorization)),
        ("api_cabinAirProposal", printHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal)),
        ("api_qualifiedRequest", printHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)),
        ("api_recoveryReport", printHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)),
        ("api_thermalProposal", printHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal)),
        ("api_visibilityProposal", printHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P""""),
        ("api_arbitrationStatus", printHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)),
        ("api_selectedIntent", printHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS""""),
        ("authorization", printHVAC_Visibility_Priority_SupervisorAuthorizationType(o.authorization)),
        ("api_arbitrationStatus", printHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)),
        ("api_selectedIntent", printHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P""""),
        ("api_thermalAssessment", printHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment)),
        ("api_thermalPath", printHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)),
        ("api_wasteHeatEligibility", printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS""""),
        ("api_thermalAssessment", printHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment)),
        ("api_thermalPath", printHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)),
        ("api_wasteHeatEligibility", printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P""""),
        ("api_thermalProposal", printHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS""""),
        ("api_thermalProposal", printHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P""""),
        ("api_visibilityNeed", printHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed)),
        ("api_visibilityPath", printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS""""),
        ("api_visibilityNeed", printHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed)),
        ("api_visibilityPath", printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P""""),
        ("api_visibilityProposal", printHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS""""),
        ("api_visibilityProposal", printHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P""""),
        ("api_airNeed", printHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed)),
        ("api_airPath", printHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)),
        ("api_humidityNeed", printHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS""""),
        ("api_airNeed", printHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed)),
        ("api_airPath", printHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)),
        ("api_humidityNeed", printHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P""""),
        ("api_cabinAirProposal", printHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS""""),
        ("api_cabinAirProposal", printHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P""""),
        ("api_electricalEligibility", printHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility)),
        ("api_selectedIntent", printHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS""""),
        ("api_electricalEligibility", printHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility)),
        ("api_selectedIntent", printHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P""""),
        ("api_candidatePlan", printHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS""""),
        ("api_candidatePlan", printHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P""""),
        ("api_criticalElectrical", printHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)),
        ("api_criticalEquipment", printHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)),
        ("api_recoveryAcknowledgment", printHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o.api_recoveryAcknowledgment)),
        ("api_visibilityFault", printHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS""""),
        ("In_recovery", printHVAC_Visibility_Priority_SupervisorRecoveryStateType(o.In_recovery)),
        ("api_criticalElectrical", printHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)),
        ("api_criticalEquipment", printHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)),
        ("api_recoveryAcknowledgment", printHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o.api_recoveryAcknowledgment)),
        ("api_visibilityFault", printHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P""""),
        ("api_recoveryReport", printHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS""""),
        ("recovery", printHVAC_Visibility_Priority_SupervisorRecoveryStateType(o.recovery)),
        ("api_recoveryReport", printHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P""""),
        ("api_arbitrationStatus", printHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)),
        ("api_candidatePlan", printHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan)),
        ("api_recoveryReport", printHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS""""),
        ("api_arbitrationStatus", printHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)),
        ("api_candidatePlan", printHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan)),
        ("api_recoveryReport", printHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container): ST = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P""""),
        ("api_actuationPlan", printHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.api_actuationPlan)),
        ("api_supervisorStatus", printHVAC_Visibility_Priority_SupervisorSupervisorStatus(o.api_supervisorStatus))
      ))
    }

    @pure def printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS""""),
        ("api_actuationPlan", printHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.api_actuationPlan)),
        ("api_supervisorStatus", printHVAC_Visibility_Priority_SupervisorSupervisorStatus(o.api_supervisorStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_requestQualifier_postInit => "HVACSupervisor_Instance_supervision_requestQualifier_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_requestQualifier_preCompute => "HVACSupervisor_Instance_supervision_requestQualifier_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_requestQualifier_postCompute => "HVACSupervisor_Instance_supervision_requestQualifier_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_thermalNeedAssessor_postInit => "HVACSupervisor_Instance_supervision_thermalNeedAssessor_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_thermalNeedAssessor_preCompute => "HVACSupervisor_Instance_supervision_thermalNeedAssessor_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_thermalNeedAssessor_postCompute => "HVACSupervisor_Instance_supervision_thermalNeedAssessor_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_visibilityNeedAssessor_postInit => "HVACSupervisor_Instance_supervision_visibilityNeedAssessor_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_visibilityNeedAssessor_preCompute => "HVACSupervisor_Instance_supervision_visibilityNeedAssessor_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_visibilityNeedAssessor_postCompute => "HVACSupervisor_Instance_supervision_visibilityNeedAssessor_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_humidityNeedAssessor_postInit => "HVACSupervisor_Instance_supervision_humidityNeedAssessor_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_humidityNeedAssessor_preCompute => "HVACSupervisor_Instance_supervision_humidityNeedAssessor_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_humidityNeedAssessor_postCompute => "HVACSupervisor_Instance_supervision_humidityNeedAssessor_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_airQualityNeedAssessor_postInit => "HVACSupervisor_Instance_supervision_airQualityNeedAssessor_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_airQualityNeedAssessor_preCompute => "HVACSupervisor_Instance_supervision_airQualityNeedAssessor_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_airQualityNeedAssessor_postCompute => "HVACSupervisor_Instance_supervision_airQualityNeedAssessor_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_electricalEligibilityOwner_postInit => "HVACSupervisor_Instance_supervision_electricalEligibilityOwner_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_electricalEligibilityOwner_preCompute => "HVACSupervisor_Instance_supervision_electricalEligibilityOwner_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_electricalEligibilityOwner_postCompute => "HVACSupervisor_Instance_supervision_electricalEligibilityOwner_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_wasteHeatEligibilityOwner_postInit => "HVACSupervisor_Instance_supervision_wasteHeatEligibilityOwner_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_wasteHeatEligibilityOwner_preCompute => "HVACSupervisor_Instance_supervision_wasteHeatEligibilityOwner_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_wasteHeatEligibilityOwner_postCompute => "HVACSupervisor_Instance_supervision_wasteHeatEligibilityOwner_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_equipmentFaultAssessor_postInit => "HVACSupervisor_Instance_supervision_equipmentFaultAssessor_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_equipmentFaultAssessor_preCompute => "HVACSupervisor_Instance_supervision_equipmentFaultAssessor_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_equipmentFaultAssessor_postCompute => "HVACSupervisor_Instance_supervision_equipmentFaultAssessor_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_priorityAuthorizationArbiter_postInit => "HVACSupervisor_Instance_supervision_priorityAuthorizationArbiter_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_priorityAuthorizationArbiter_preCompute => "HVACSupervisor_Instance_supervision_priorityAuthorizationArbiter_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_priorityAuthorizationArbiter_postCompute => "HVACSupervisor_Instance_supervision_priorityAuthorizationArbiter_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_thermalServiceProposer_postInit => "HVACSupervisor_Instance_supervision_thermalServiceProposer_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_thermalServiceProposer_preCompute => "HVACSupervisor_Instance_supervision_thermalServiceProposer_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_thermalServiceProposer_postCompute => "HVACSupervisor_Instance_supervision_thermalServiceProposer_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_visibilityServiceProposer_postInit => "HVACSupervisor_Instance_supervision_visibilityServiceProposer_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_visibilityServiceProposer_preCompute => "HVACSupervisor_Instance_supervision_visibilityServiceProposer_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_visibilityServiceProposer_postCompute => "HVACSupervisor_Instance_supervision_visibilityServiceProposer_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_cabinAirServiceProposer_postInit => "HVACSupervisor_Instance_supervision_cabinAirServiceProposer_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_cabinAirServiceProposer_preCompute => "HVACSupervisor_Instance_supervision_cabinAirServiceProposer_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_cabinAirServiceProposer_postCompute => "HVACSupervisor_Instance_supervision_cabinAirServiceProposer_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_energySafePlanComposer_postInit => "HVACSupervisor_Instance_supervision_energySafePlanComposer_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_energySafePlanComposer_preCompute => "HVACSupervisor_Instance_supervision_energySafePlanComposer_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_energySafePlanComposer_postCompute => "HVACSupervisor_Instance_supervision_energySafePlanComposer_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_criticalFaultRecoveryOwner_postInit => "HVACSupervisor_Instance_supervision_criticalFaultRecoveryOwner_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_criticalFaultRecoveryOwner_preCompute => "HVACSupervisor_Instance_supervision_criticalFaultRecoveryOwner_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_criticalFaultRecoveryOwner_postCompute => "HVACSupervisor_Instance_supervision_criticalFaultRecoveryOwner_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_atomicResultPublisher_postInit => "HVACSupervisor_Instance_supervision_atomicResultPublisher_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_atomicResultPublisher_preCompute => "HVACSupervisor_Instance_supervision_atomicResultPublisher_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_supervision_atomicResultPublisher_postCompute => "HVACSupervisor_Instance_supervision_atomicResultPublisher_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: HVAC_Visibility_Priority_Supervisor.Budget_Payload => return printHVAC_Visibility_Priority_SupervisorBudget_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Arrival_Payload => return printHVAC_Visibility_Priority_SupervisorArrival_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload => return printHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Service_Payload => return printHVAC_Visibility_Priority_SupervisorService_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Validity_Payload => return printHVAC_Visibility_Priority_SupervisorValidity_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload => return printHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload => return printHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Intensity_Payload => return printHVAC_Visibility_Priority_SupervisorIntensity_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload => return printHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload => return printHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload => return printHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload => return printHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload => return printHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload => return printHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload => return printHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Availability_Payload => return printHVAC_Visibility_Priority_SupervisorAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload => return printHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload => return printHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Authorization_Payload => return printHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload => return printHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload => return printHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload => return printHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload => return printHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload => return printHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload => return printHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload => return printHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload => return printHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload => return printHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload => return printHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload => return printHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload => return printHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload => return printHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload => return printHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload => return printHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload => return printHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload => return printHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload => return printHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload => return printHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload => return printHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload => return printHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload => return printHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload => return printHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload => return printHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload => return printHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload => return printHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload => return printHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload => return printHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload => return printHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload => return printHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload => return printHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload => return printHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload => return printHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload => return printHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload => return printHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload => return printHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload => return printHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload => return printHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload => return printHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload => return printHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload => return printHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload => return printHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload => return printHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload => return printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload => return printHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload => return printHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => return printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseHVAC_Visibility_Priority_SupervisorValidityType(): HVAC_Visibility_Priority_Supervisor.Validity.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorValidityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorValidityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.Validity.")
          return HVAC_Visibility_Priority_Supervisor.Validity.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorValidity_Payload(): HVAC_Visibility_Priority_Supervisor.Validity_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorValidity_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorValidity_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.Validity_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorArrivalType(): HVAC_Visibility_Priority_Supervisor.Arrival.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorArrivalT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArrivalT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Arrival.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Arrival")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.Arrival.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.Arrival.")
          return HVAC_Visibility_Priority_Supervisor.Arrival.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorArrival_Payload(): HVAC_Visibility_Priority_Supervisor.Arrival_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorArrival_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArrival_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Arrival_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Arrival_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorArrivalType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.Arrival_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorEnableIntentType(): HVAC_Visibility_Priority_Supervisor.EnableIntent.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnableIntentT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnableIntentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnableIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnableIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.EnableIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.EnableIntent.")
          return HVAC_Visibility_Priority_Supervisor.EnableIntent.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(): HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnableIntent_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnableIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorEnableIntentType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorDefrostIntentType(): HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorDefrostIntentT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorDefrostIntentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.DefrostIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.DefrostIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.DefrostIntent.")
          return HVAC_Visibility_Priority_Supervisor.DefrostIntent.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(): HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorDefrostIntent_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorDefrostIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorDefrostIntentType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBandType(): HVAC_Visibility_Priority_Supervisor.ThermalBand.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalBandT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBandT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalBand.")
          return HVAC_Visibility_Priority_Supervisor.ThermalBand.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBand_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalBand_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBand_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalBandType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorFanIntentType(): HVAC_Visibility_Priority_Supervisor.FanIntent.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorFanIntentT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorFanIntentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.FanIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.FanIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.FanIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.FanIntent.")
          return HVAC_Visibility_Priority_Supervisor.FanIntent.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorFanIntent_Payload(): HVAC_Visibility_Priority_Supervisor.FanIntent_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorFanIntent_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorFanIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.FanIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.FanIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorFanIntentType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.FanIntent_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestClassType(): HVAC_Visibility_Priority_Supervisor.RequestClass.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorRequestClassT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestClassT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RequestClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.RequestClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.RequestClass.")
          return HVAC_Visibility_Priority_Supervisor.RequestClass.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestClass_Payload(): HVAC_Visibility_Priority_Supervisor.RequestClass_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorRequestClass_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestClass_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RequestClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorRequestClassType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RequestClass_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinBandType(): HVAC_Visibility_Priority_Supervisor.CabinBand.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinBandT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinBandT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.CabinBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.CabinBand.")
          return HVAC_Visibility_Priority_Supervisor.CabinBand.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinBand_Payload(): HVAC_Visibility_Priority_Supervisor.CabinBand_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinBand_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinBand_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorCabinBandType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinBand_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedType(): HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalNeed")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalNeed.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalNeed.")
          return HVAC_Visibility_Priority_Supervisor.ThermalNeed.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalNeed_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalObservationValidityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalObservationValidityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.")
          return HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalObservationValidity_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalObservationValidity_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalObservationValidityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingConditionType(): HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorGlazingConditionT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingConditionT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.GlazingCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.GlazingCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.GlazingCondition.")
          return HVAC_Visibility_Priority_Supervisor.GlazingCondition.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(): HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorGlazingCondition_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingCondition_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedType(): HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityNeed")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.VisibilityNeed.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.VisibilityNeed.")
          return HVAC_Visibility_Priority_Supervisor.VisibilityNeed.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeed_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityCriticality")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.")
          return HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticality_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityCriticality_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityConditionType(): HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityConditionT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityConditionT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.HumidityCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.HumidityCondition.")
          return HVAC_Visibility_Priority_Supervisor.HumidityCondition.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityCondition_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityCondition_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorHumidityConditionType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedType(): HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityNeed")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.HumidityNeed.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.HumidityNeed.")
          return HVAC_Visibility_Priority_Supervisor.HumidityNeed.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeed_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirConditionType(): HVAC_Visibility_Priority_Supervisor.AirCondition.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirConditionT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirConditionT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.AirCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.AirCondition.")
          return HVAC_Visibility_Priority_Supervisor.AirCondition.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAirCondition_Payload(): HVAC_Visibility_Priority_Supervisor.AirCondition_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirCondition_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirCondition_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAirConditionType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirCondition_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirNeedType(): HVAC_Visibility_Priority_Supervisor.AirNeed.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirNeedT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirNeedT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirNeed.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirNeed")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.AirNeed.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.AirNeed.")
          return HVAC_Visibility_Priority_Supervisor.AirNeed.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAirNeed_Payload(): HVAC_Visibility_Priority_Supervisor.AirNeed_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirNeed_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirNeed_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirNeed_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAirNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirNeed_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorInterfaceStateType(): HVAC_Visibility_Priority_Supervisor.InterfaceState.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorInterfaceStateT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorInterfaceStateT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.InterfaceState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.InterfaceState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.InterfaceState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.InterfaceState.")
          return HVAC_Visibility_Priority_Supervisor.InterfaceState.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(): HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorInterfaceState_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorInterfaceState_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorInterfaceStateType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorBudgetType(): HVAC_Visibility_Priority_Supervisor.Budget.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorBudgetT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorBudgetT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Budget.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Budget")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.Budget.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.Budget.")
          return HVAC_Visibility_Priority_Supervisor.Budget.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorBudget_Payload(): HVAC_Visibility_Priority_Supervisor.Budget_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorBudget_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorBudget_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Budget_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Budget_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorBudgetType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.Budget_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalTierType(): HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalTierT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalTierT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalTier")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ElectricalTier.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ElectricalTier.")
          return HVAC_Visibility_Priority_Supervisor.ElectricalTier.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalTier_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalTier_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorElectricalTierType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCauseType(): HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalCauseT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCauseT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ElectricalCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ElectricalCause.")
          return HVAC_Visibility_Priority_Supervisor.ElectricalCause.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalCause_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorElectricalCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalCriticality")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.")
          return HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalCriticality_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalCriticality_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAvailabilityType(): HVAC_Visibility_Priority_Supervisor.Availability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.Availability.")
          return HVAC_Visibility_Priority_Supervisor.Availability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.Availability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.Availability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.")
          return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorBlowerReadinessType(): HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorBlowerReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorBlowerReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.BlowerReadiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.BlowerReadiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.BlowerReadiness.")
          return HVAC_Visibility_Priority_Supervisor.BlowerReadiness.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorBlowerReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorBlowerReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorBlowerReadinessType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalReadinessType(): HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalReadiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalReadiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalReadiness.")
          return HVAC_Visibility_Priority_Supervisor.ThermalReadiness.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalReadinessType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingReadinessType(): HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorClearingReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ClearingReadiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ClearingReadiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ClearingReadiness.")
          return HVAC_Visibility_Priority_Supervisor.ClearingReadiness.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorClearingReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorClearingReadinessType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.")
          return HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentCriticality")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.")
          return HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticality_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentCriticality_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.")
          return HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.")
          return HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.")
          return HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorClearingAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ClearingAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ClearingAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ClearingAvailability.")
          return HVAC_Visibility_Priority_Supervisor.ClearingAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorClearingAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorClearingAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorClearingAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.")
          return HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryStateType(): HVAC_Visibility_Priority_Supervisor.RecoveryState.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryStateT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryStateT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.RecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.RecoveryState.")
          return HVAC_Visibility_Priority_Supervisor.RecoveryState.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryState_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryState_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryEventType(): HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryEventT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryEventT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.RecoveryEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.RecoveryEvent.")
          return HVAC_Visibility_Priority_Supervisor.RecoveryEvent.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryEvent_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryEvent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorRecoveryEventType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryCauseType(): HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryCauseT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryCauseT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.RecoveryCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.RecoveryCause.")
          return HVAC_Visibility_Priority_Supervisor.RecoveryCause.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryCause_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorRecoveryCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorServiceType(): HVAC_Visibility_Priority_Supervisor.Service.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorServiceT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorServiceT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Service.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Service")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.Service.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.Service.")
          return HVAC_Visibility_Priority_Supervisor.Service.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorService_Payload(): HVAC_Visibility_Priority_Supervisor.Service_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorService_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorService_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Service_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Service_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorServiceType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.Service_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorHeatSourceType(): HVAC_Visibility_Priority_Supervisor.HeatSource.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorHeatSourceT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHeatSourceT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HeatSource.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HeatSource")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.HeatSource.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.HeatSource.")
          return HVAC_Visibility_Priority_Supervisor.HeatSource.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorHeatSource_Payload(): HVAC_Visibility_Priority_Supervisor.HeatSource_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorHeatSource_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHeatSource_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HeatSource_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HeatSource_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorHeatSourceType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HeatSource_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.")
          return HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalDegradationType(): HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalDegradationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalDegradationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalDegradation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ThermalDegradation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ThermalDegradation.")
          return HVAC_Visibility_Priority_Supervisor.ThermalDegradation.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalDegradation_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalDegradation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalDegradationType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.")
          return HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorProposalUrgencyType(): HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorProposalUrgencyT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorProposalUrgencyT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ProposalUrgency")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ProposalUrgency.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ProposalUrgency.")
          return HVAC_Visibility_Priority_Supervisor.ProposalUrgency.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(): HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorProposalUrgency_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorProposalUrgency_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorProposalUrgencyType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.")
          return HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityDegradationType(): HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityDegradationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityDegradationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityDegradation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.HumidityDegradation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.HumidityDegradation.")
          return HVAC_Visibility_Priority_Supervisor.HumidityDegradation.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityDegradation_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityDegradation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorHumidityDegradationType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirDegradationType(): HVAC_Visibility_Priority_Supervisor.AirDegradation.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirDegradationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirDegradationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirDegradation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirDegradation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.AirDegradation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.AirDegradation.")
          return HVAC_Visibility_Priority_Supervisor.AirDegradation.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(): HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirDegradation_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirDegradation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAirDegradationType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionCauseType(): HVAC_Visibility_Priority_Supervisor.SelectionCause.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorSelectionCauseT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionCauseT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectionCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SelectionCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.SelectionCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.SelectionCause.")
          return HVAC_Visibility_Priority_Supervisor.SelectionCause.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(): HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorSelectionCause_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorSelectionCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionModeType(): HVAC_Visibility_Priority_Supervisor.SelectionMode.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorSelectionModeT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionModeT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectionMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SelectionMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.SelectionMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.SelectionMode.")
          return HVAC_Visibility_Priority_Supervisor.SelectionMode.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(): HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorSelectionMode_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectionMode_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorSelectionModeType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAuthorizationType(): HVAC_Visibility_Priority_Supervisor.Authorization.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorAuthorizationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAuthorizationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Authorization.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Authorization")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.Authorization.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.Authorization.")
          return HVAC_Visibility_Priority_Supervisor.Authorization.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAuthorization_Payload(): HVAC_Visibility_Priority_Supervisor.Authorization_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAuthorization_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAuthorization_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Authorization_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Authorization_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAuthorizationType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.Authorization_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationModeType(): HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorArbitrationModeT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationModeT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ArbitrationMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ArbitrationMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ArbitrationMode.")
          return HVAC_Visibility_Priority_Supervisor.ArbitrationMode.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(): HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorArbitrationMode_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationMode_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorArbitrationModeType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationCauseType(): HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorArbitrationCauseT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationCauseT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ArbitrationCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.ArbitrationCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.ArbitrationCause.")
          return HVAC_Visibility_Priority_Supervisor.ArbitrationCause.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(): HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorArbitrationCause_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorArbitrationCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(): HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorNoncriticalCauseT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorNoncriticalCauseT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.NoncriticalCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.NoncriticalCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.NoncriticalCause.")
          return HVAC_Visibility_Priority_Supervisor.NoncriticalCause.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(): HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorNoncriticalCause_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorNoncriticalCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorNoncriticalCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorIntensityType(): HVAC_Visibility_Priority_Supervisor.Intensity.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorIntensityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorIntensityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Intensity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Intensity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.Intensity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.Intensity.")
          return HVAC_Visibility_Priority_Supervisor.Intensity.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorIntensity_Payload(): HVAC_Visibility_Priority_Supervisor.Intensity_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorIntensity_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorIntensity_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Intensity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.Intensity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorIntensityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.Intensity_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergyTierType(): HVAC_Visibility_Priority_Supervisor.EnergyTier.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnergyTierT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergyTierT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergyTier.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnergyTier")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.EnergyTier.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.EnergyTier.")
          return HVAC_Visibility_Priority_Supervisor.EnergyTier.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(): HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnergyTier_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergyTier_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorEnergyTierType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidateCauseType(): HVAC_Visibility_Priority_Supervisor.CandidateCause.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorCandidateCauseT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidateCauseT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CandidateCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CandidateCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.CandidateCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.CandidateCause.")
          return HVAC_Visibility_Priority_Supervisor.CandidateCause.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(): HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorCandidateCause_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidateCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorCandidateCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.")
          return HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorModeType(): HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorSupervisorModeT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorModeT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SupervisorMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.SupervisorMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.SupervisorMode.")
          return HVAC_Visibility_Priority_Supervisor.SupervisorMode.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(): HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorSupervisorMode_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorMode_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorSupervisorModeType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorStatusCauseType(): HVAC_Visibility_Priority_Supervisor.StatusCause.Type = {
      val r = parseHVAC_Visibility_Priority_SupervisorStatusCauseT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorStatusCauseT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.StatusCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.StatusCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Visibility_Priority_Supervisor.StatusCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Visibility_Priority_Supervisor.StatusCause.")
          return HVAC_Visibility_Priority_Supervisor.StatusCause.byOrdinal(0).get
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorStatusCause_Payload(): HVAC_Visibility_Priority_Supervisor.StatusCause_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorStatusCause_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorStatusCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.StatusCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.StatusCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorStatusCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.StatusCause_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorUserClimateRequest(): HVAC_Visibility_Priority_Supervisor.UserClimateRequest = {
      val r = parseHVAC_Visibility_Priority_SupervisorUserClimateRequestT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorUserClimateRequestT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.UserClimateRequest = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.UserClimateRequest")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("arrival")
      val arrival = parseHVAC_Visibility_Priority_SupervisorArrivalType()
      parser.parseObjectNext()
      parser.parseObjectKey("enabled")
      val enabled = parseHVAC_Visibility_Priority_SupervisorEnableIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("defrost")
      val defrost = parseHVAC_Visibility_Priority_SupervisorDefrostIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("target")
      val target = parseHVAC_Visibility_Priority_SupervisorThermalBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("fan")
      val fan = parseHVAC_Visibility_Priority_SupervisorFanIntentType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.UserClimateRequest(validity, arrival, enabled, defrost, target, fan)
    }

    def parseHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(): HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorUserClimateRequest_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorUserClimateRequest_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedTarget(): HVAC_Visibility_Priority_Supervisor.QualifiedTarget = {
      val r = parseHVAC_Visibility_Priority_SupervisorQualifiedTargetT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedTargetT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedTarget = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.QualifiedTarget")
      }
      parser.parseObjectKey("requestClass")
      val requestClass = parseHVAC_Visibility_Priority_SupervisorRequestClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("target")
      val target = parseHVAC_Visibility_Priority_SupervisorThermalBandType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.QualifiedTarget(requestClass, target)
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(): HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorQualifiedTarget_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedTarget_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedRequest(): HVAC_Visibility_Priority_Supervisor.QualifiedRequest = {
      val r = parseHVAC_Visibility_Priority_SupervisorQualifiedRequestT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedRequestT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedRequest = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.QualifiedRequest")
      }
      parser.parseObjectKey("requestClass")
      val requestClass = parseHVAC_Visibility_Priority_SupervisorRequestClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("arrival")
      val arrival = parseHVAC_Visibility_Priority_SupervisorArrivalType()
      parser.parseObjectNext()
      parser.parseObjectKey("enabled")
      val enabled = parseHVAC_Visibility_Priority_SupervisorEnableIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("fan")
      val fan = parseHVAC_Visibility_Priority_SupervisorFanIntentType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.QualifiedRequest(requestClass, arrival, enabled, fan)
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(): HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorQualifiedRequest_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorQualifiedRequest_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation(): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinThermalObservationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinThermalObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinThermalObservation")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("band")
      val band = parseHVAC_Visibility_Priority_SupervisorCabinBandType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinThermalObservation(validity, band)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalAssessment(): HVAC_Visibility_Priority_Supervisor.ThermalAssessment = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalAssessmentT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalAssessmentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalAssessment")
      }
      parser.parseObjectKey("need")
      val need = parseHVAC_Visibility_Priority_SupervisorThermalNeedType()
      parser.parseObjectNext()
      parser.parseObjectKey("observationInvalid")
      val observationInvalid = parseHVAC_Visibility_Priority_SupervisorThermalObservationValidityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need, observationInvalid)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalAssessment_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalAssessment_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalAssessment()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingObservation(): HVAC_Visibility_Priority_Supervisor.GlazingObservation = {
      val r = parseHVAC_Visibility_Priority_SupervisorGlazingObservationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.GlazingObservation = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.GlazingObservation")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parseHVAC_Visibility_Priority_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.GlazingObservation(validity, condition)
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(): HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorGlazingObservation_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorGlazingObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorGlazingObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityObservation(): HVAC_Visibility_Priority_Supervisor.HumidityObservation = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityObservationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityObservation = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityObservation")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parseHVAC_Visibility_Priority_SupervisorHumidityConditionType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityObservation(validity, condition)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityObservation_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorHumidityObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityObservation(): HVAC_Visibility_Priority_Supervisor.AirQualityObservation = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirQualityObservationT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityObservation = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirQualityObservation")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parseHVAC_Visibility_Priority_SupervisorAirConditionType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirQualityObservation(validity, condition)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(): HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirQualityObservation_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalAvailability(): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalAvailability")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("interfaceState")
      val interfaceState = parseHVAC_Visibility_Priority_SupervisorInterfaceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("budget")
      val budget = parseHVAC_Visibility_Priority_SupervisorBudgetType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalAvailability(validity, interfaceState, budget)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibility(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalEligibility")
      }
      parser.parseObjectKey("tier")
      val tier = parseHVAC_Visibility_Priority_SupervisorElectricalTierType()
      parser.parseObjectNext()
      parser.parseObjectKey("eligibilityCause")
      val eligibilityCause = parseHVAC_Visibility_Priority_SupervisorElectricalCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibility(tier, eligibilityCause)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibility_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibility_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailabilityT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("availability")
      val availability = parseHVAC_Visibility_Priority_SupervisorAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability(validity, availability)
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness(): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentReadiness")
      }
      parser.parseObjectKey("validity")
      val validity = parseHVAC_Visibility_Priority_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("circulationState")
      val circulationState = parseHVAC_Visibility_Priority_SupervisorBlowerReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("thermal")
      val thermal = parseHVAC_Visibility_Priority_SupervisorThermalReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("clearing")
      val clearing = parseHVAC_Visibility_Priority_SupervisorClearingReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("airTreatment")
      val airTreatment = parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EquipmentReadiness(validity, circulationState, thermal, clearing, airTreatment)
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness(): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalPathReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalPathReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness")
      }
      parser.parseObjectKey("thermalBlowerReady")
      val thermalBlowerReady = parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("thermalReady")
      val thermalReady = parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness(thermalBlowerReady, thermalReady)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness")
      }
      parser.parseObjectKey("visibilityBlowerReady")
      val visibilityBlowerReady = parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("clearingReady")
      val clearingReady = parseHVAC_Visibility_Priority_SupervisorClearingAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness(visibilityBlowerReady, clearingReady)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirPathReadiness(): HVAC_Visibility_Priority_Supervisor.AirPathReadiness = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirPathReadinessT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirPathReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirPathReadiness = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirPathReadiness")
      }
      parser.parseObjectKey("airReady")
      val airReady = parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirPathReadiness(airReady)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirPathReadiness_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirPathReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryReport(): HVAC_Visibility_Priority_Supervisor.RecoveryReport = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryReportT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryReportT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryReport = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryReport")
      }
      parser.parseObjectKey("recoveryState")
      val recoveryState = parseHVAC_Visibility_Priority_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryEvent")
      val recoveryEvent = parseHVAC_Visibility_Priority_SupervisorRecoveryEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("faultAttribution")
      val faultAttribution = parseHVAC_Visibility_Priority_SupervisorRecoveryCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RecoveryReport(recoveryState, recoveryEvent, faultAttribution)
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorRecoveryReport_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRecoveryReport_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposal(): HVAC_Visibility_Priority_Supervisor.ThermalProposal = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalProposalT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposalT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalProposal = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalProposal")
      }
      parser.parseObjectKey("service")
      val service = parseHVAC_Visibility_Priority_SupervisorServiceType()
      parser.parseObjectNext()
      parser.parseObjectKey("heatSource")
      val heatSource = parseHVAC_Visibility_Priority_SupervisorHeatSourceType()
      parser.parseObjectNext()
      parser.parseObjectKey("thermalApplicability")
      val thermalApplicability = parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("degradation")
      val degradation = parseHVAC_Visibility_Priority_SupervisorThermalDegradationType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalProposal(service, heatSource, thermalApplicability, degradation)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalProposal_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalProposal_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorThermalProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposal(): HVAC_Visibility_Priority_Supervisor.VisibilityProposal = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityProposalT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposalT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityProposal = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityProposal")
      }
      parser.parseObjectKey("visibilityApplicability")
      val visibilityApplicability = parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("urgency")
      val urgency = parseHVAC_Visibility_Priority_SupervisorProposalUrgencyType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityProposal(visibilityApplicability, urgency)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityProposal_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityProposal_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposal(): HVAC_Visibility_Priority_Supervisor.CabinAirProposal = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirProposalT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposalT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirProposal = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirProposal")
      }
      parser.parseObjectKey("service")
      val service = parseHVAC_Visibility_Priority_SupervisorServiceType()
      parser.parseObjectNext()
      parser.parseObjectKey("cabinAirApplicability")
      val cabinAirApplicability = parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("humidityDegradation")
      val humidityDegradation = parseHVAC_Visibility_Priority_SupervisorHumidityDegradationType()
      parser.parseObjectNext()
      parser.parseObjectKey("airDegradation")
      val airDegradation = parseHVAC_Visibility_Priority_SupervisorAirDegradationType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinAirProposal(service, cabinAirApplicability, humidityDegradation, airDegradation)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(): HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirProposal_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirProposal_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectedIntent(): HVAC_Visibility_Priority_Supervisor.SelectedIntent = {
      val r = parseHVAC_Visibility_Priority_SupervisorSelectedIntentT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectedIntentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectedIntent = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SelectedIntent")
      }
      parser.parseObjectKey("service")
      val service = parseHVAC_Visibility_Priority_SupervisorServiceType()
      parser.parseObjectNext()
      parser.parseObjectKey("heatSource")
      val heatSource = parseHVAC_Visibility_Priority_SupervisorHeatSourceType()
      parser.parseObjectNext()
      parser.parseObjectKey("fan")
      val fan = parseHVAC_Visibility_Priority_SupervisorFanIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("selectedCause")
      val selectedCause = parseHVAC_Visibility_Priority_SupervisorSelectionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("controlMode")
      val controlMode = parseHVAC_Visibility_Priority_SupervisorSelectionModeType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.SelectedIntent(service, heatSource, fan, selectedCause, controlMode)
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(): HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorSelectedIntent_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSelectedIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorSelectedIntent()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationStatus(): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus = {
      val r = parseHVAC_Visibility_Priority_SupervisorArbitrationStatusT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationStatusT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ArbitrationStatus")
      }
      parser.parseObjectKey("authorization")
      val authorization = parseHVAC_Visibility_Priority_SupervisorAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("controlMode")
      val controlMode = parseHVAC_Visibility_Priority_SupervisorArbitrationModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("arbitrationCause")
      val arbitrationCause = parseHVAC_Visibility_Priority_SupervisorArbitrationCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("noncriticalCause")
      val noncriticalCause = parseHVAC_Visibility_Priority_SupervisorNoncriticalCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationStatus(authorization, controlMode, arbitrationCause, noncriticalCause)
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorArbitrationStatus_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorArbitrationStatus_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan(): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinActuationPlanT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinActuationPlanT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinActuationPlan")
      }
      parser.parseObjectKey("service")
      val service = parseHVAC_Visibility_Priority_SupervisorServiceType()
      parser.parseObjectNext()
      parser.parseObjectKey("intensity")
      val intensity = parseHVAC_Visibility_Priority_SupervisorIntensityType()
      parser.parseObjectNext()
      parser.parseObjectKey("heatSource")
      val heatSource = parseHVAC_Visibility_Priority_SupervisorHeatSourceType()
      parser.parseObjectNext()
      parser.parseObjectKey("energyTier")
      val energyTier = parseHVAC_Visibility_Priority_SupervisorEnergyTierType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinActuationPlan(service, intensity, heatSource, energyTier)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorStatus(): HVAC_Visibility_Priority_Supervisor.SupervisorStatus = {
      val r = parseHVAC_Visibility_Priority_SupervisorSupervisorStatusT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorStatusT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SupervisorStatus = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SupervisorStatus")
      }
      parser.parseObjectKey("mode")
      val mode = parseHVAC_Visibility_Priority_SupervisorSupervisorModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("statusCause")
      val statusCause = parseHVAC_Visibility_Priority_SupervisorStatusCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.SupervisorStatus(mode, statusCause)
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(): HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorSupervisorStatus_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorSupervisorStatus_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidatePlan(): HVAC_Visibility_Priority_Supervisor.CandidatePlan = {
      val r = parseHVAC_Visibility_Priority_SupervisorCandidatePlanT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidatePlanT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CandidatePlan = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CandidatePlan")
      }
      parser.parseObjectKey("plan")
      val plan = parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      parser.parseObjectNext()
      parser.parseObjectKey("candidateCause")
      val candidateCause = parseHVAC_Visibility_Priority_SupervisorCandidateCauseType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CandidatePlan(plan, candidateCause)
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(): HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload = {
      val r = parseHVAC_Visibility_Priority_SupervisorCandidatePlan_PayloadT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCandidatePlan_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Visibility_Priority_SupervisorCandidatePlan()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_userRequest")
      val api_userRequest = parseHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P(api_userRequest)
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_userRequest")
      val api_userRequest = parseHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS(api_userRequest)
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedTarget")
      val api_qualifiedTarget = parseHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P(api_qualifiedRequest, api_qualifiedTarget)
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedTarget")
      val api_qualifiedTarget = parseHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS(api_qualifiedRequest, api_qualifiedTarget)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_cabinObservation")
      val api_cabinObservation = parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedTarget")
      val api_qualifiedTarget = parseHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(api_cabinObservation, api_qualifiedTarget)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_cabinObservation")
      val api_cabinObservation = parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedTarget")
      val api_qualifiedTarget = parseHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(api_cabinObservation, api_qualifiedTarget)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_thermalAssessment")
      val api_thermalAssessment = parseHVAC_Visibility_Priority_SupervisorThermalAssessment()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(api_thermalAssessment)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_thermalAssessment")
      val api_thermalAssessment = parseHVAC_Visibility_Priority_SupervisorThermalAssessment()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(api_thermalAssessment)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_glazingObservation")
      val api_glazingObservation = parseHVAC_Visibility_Priority_SupervisorGlazingObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(api_glazingObservation)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_glazingObservation")
      val api_glazingObservation = parseHVAC_Visibility_Priority_SupervisorGlazingObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(api_glazingObservation)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_visibilityFault")
      val api_visibilityFault = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityNeed")
      val api_visibilityNeed = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(api_visibilityFault, api_visibilityNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_visibilityFault")
      val api_visibilityFault = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityNeed")
      val api_visibilityNeed = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(api_visibilityFault, api_visibilityNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_humidityObservation")
      val api_humidityObservation = parseHVAC_Visibility_Priority_SupervisorHumidityObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(api_humidityObservation)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_humidityObservation")
      val api_humidityObservation = parseHVAC_Visibility_Priority_SupervisorHumidityObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(api_humidityObservation)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_humidityNeed")
      val api_humidityNeed = parseHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(api_humidityNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_humidityNeed")
      val api_humidityNeed = parseHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(api_humidityNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_airObservation")
      val api_airObservation = parseHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(api_airObservation)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_airObservation")
      val api_airObservation = parseHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(api_airObservation)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_airNeed")
      val api_airNeed = parseHVAC_Visibility_Priority_SupervisorAirNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(api_airNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_airNeed")
      val api_airNeed = parseHVAC_Visibility_Priority_SupervisorAirNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(api_airNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_electricalAvailability")
      val api_electricalAvailability = parseHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(api_electricalAvailability)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_electricalAvailability")
      val api_electricalAvailability = parseHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(api_electricalAvailability)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_criticalElectrical")
      val api_criticalElectrical = parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_electricalEligibility")
      val api_electricalEligibility = parseHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(api_criticalElectrical, api_electricalEligibility)
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_criticalElectrical")
      val api_criticalElectrical = parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_electricalEligibility")
      val api_electricalEligibility = parseHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(api_criticalElectrical, api_electricalEligibility)
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_wasteHeatAvailability")
      val api_wasteHeatAvailability = parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(api_wasteHeatAvailability)
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_wasteHeatAvailability")
      val api_wasteHeatAvailability = parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(api_wasteHeatAvailability)
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_wasteHeatEligibility")
      val api_wasteHeatEligibility = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(api_wasteHeatEligibility)
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_wasteHeatEligibility")
      val api_wasteHeatEligibility = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(api_wasteHeatEligibility)
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_equipmentReadiness")
      val api_equipmentReadiness = parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(api_equipmentReadiness)
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_equipmentReadiness")
      val api_equipmentReadiness = parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(api_equipmentReadiness)
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_airPath")
      val api_airPath = parseHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_criticalEquipment")
      val api_criticalEquipment = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalPath")
      val api_thermalPath = parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityPath")
      val api_visibilityPath = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(api_airPath, api_criticalEquipment, api_thermalPath, api_visibilityPath)
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_airPath")
      val api_airPath = parseHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_criticalEquipment")
      val api_criticalEquipment = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalPath")
      val api_thermalPath = parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityPath")
      val api_visibilityPath = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(api_airPath, api_criticalEquipment, api_thermalPath, api_visibilityPath)
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_cabinAirProposal")
      val api_cabinAirProposal = parseHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryReport")
      val api_recoveryReport = parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalProposal")
      val api_thermalProposal = parseHVAC_Visibility_Priority_SupervisorThermalProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityProposal")
      val api_visibilityProposal = parseHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(api_cabinAirProposal, api_qualifiedRequest, api_recoveryReport, api_thermalProposal, api_visibilityProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("In_authorization")
      val In_authorization = parseHVAC_Visibility_Priority_SupervisorAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cabinAirProposal")
      val api_cabinAirProposal = parseHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryReport")
      val api_recoveryReport = parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalProposal")
      val api_thermalProposal = parseHVAC_Visibility_Priority_SupervisorThermalProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityProposal")
      val api_visibilityProposal = parseHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(In_authorization, api_cabinAirProposal, api_qualifiedRequest, api_recoveryReport, api_thermalProposal, api_visibilityProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_arbitrationStatus")
      val api_arbitrationStatus = parseHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIntent")
      val api_selectedIntent = parseHVAC_Visibility_Priority_SupervisorSelectedIntent()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(api_arbitrationStatus, api_selectedIntent)
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("authorization")
      val authorization = parseHVAC_Visibility_Priority_SupervisorAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbitrationStatus")
      val api_arbitrationStatus = parseHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIntent")
      val api_selectedIntent = parseHVAC_Visibility_Priority_SupervisorSelectedIntent()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(authorization, api_arbitrationStatus, api_selectedIntent)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P")
      }
      parser.parseObjectKey("api_thermalAssessment")
      val api_thermalAssessment = parseHVAC_Visibility_Priority_SupervisorThermalAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalPath")
      val api_thermalPath = parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_wasteHeatEligibility")
      val api_wasteHeatEligibility = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(api_thermalAssessment, api_thermalPath, api_wasteHeatEligibility)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_thermalAssessment")
      val api_thermalAssessment = parseHVAC_Visibility_Priority_SupervisorThermalAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalPath")
      val api_thermalPath = parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_wasteHeatEligibility")
      val api_wasteHeatEligibility = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(api_thermalAssessment, api_thermalPath, api_wasteHeatEligibility)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P")
      }
      parser.parseObjectKey("api_thermalProposal")
      val api_thermalProposal = parseHVAC_Visibility_Priority_SupervisorThermalProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(api_thermalProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_thermalProposal")
      val api_thermalProposal = parseHVAC_Visibility_Priority_SupervisorThermalProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(api_thermalProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P")
      }
      parser.parseObjectKey("api_visibilityNeed")
      val api_visibilityNeed = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityPath")
      val api_visibilityPath = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(api_visibilityNeed, api_visibilityPath)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_visibilityNeed")
      val api_visibilityNeed = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityPath")
      val api_visibilityPath = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(api_visibilityNeed, api_visibilityPath)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P")
      }
      parser.parseObjectKey("api_visibilityProposal")
      val api_visibilityProposal = parseHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(api_visibilityProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_visibilityProposal")
      val api_visibilityProposal = parseHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(api_visibilityProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P")
      }
      parser.parseObjectKey("api_airNeed")
      val api_airNeed = parseHVAC_Visibility_Priority_SupervisorAirNeedType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_airPath")
      val api_airPath = parseHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityNeed")
      val api_humidityNeed = parseHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(api_airNeed, api_airPath, api_humidityNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_airNeed")
      val api_airNeed = parseHVAC_Visibility_Priority_SupervisorAirNeedType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_airPath")
      val api_airPath = parseHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityNeed")
      val api_humidityNeed = parseHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(api_airNeed, api_airPath, api_humidityNeed)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P")
      }
      parser.parseObjectKey("api_cabinAirProposal")
      val api_cabinAirProposal = parseHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(api_cabinAirProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_cabinAirProposal")
      val api_cabinAirProposal = parseHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(api_cabinAirProposal)
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P")
      }
      parser.parseObjectKey("api_electricalEligibility")
      val api_electricalEligibility = parseHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIntent")
      val api_selectedIntent = parseHVAC_Visibility_Priority_SupervisorSelectedIntent()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(api_electricalEligibility, api_selectedIntent)
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_electricalEligibility")
      val api_electricalEligibility = parseHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIntent")
      val api_selectedIntent = parseHVAC_Visibility_Priority_SupervisorSelectedIntent()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(api_electricalEligibility, api_selectedIntent)
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P")
      }
      parser.parseObjectKey("api_candidatePlan")
      val api_candidatePlan = parseHVAC_Visibility_Priority_SupervisorCandidatePlan()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(api_candidatePlan)
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_candidatePlan")
      val api_candidatePlan = parseHVAC_Visibility_Priority_SupervisorCandidatePlan()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(api_candidatePlan)
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_criticalElectrical")
      val api_criticalElectrical = parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_criticalEquipment")
      val api_criticalEquipment = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryAcknowledgment")
      val api_recoveryAcknowledgment = parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityFault")
      val api_visibilityFault = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(api_criticalElectrical, api_criticalEquipment, api_recoveryAcknowledgment, api_visibilityFault)
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_recovery")
      val In_recovery = parseHVAC_Visibility_Priority_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_criticalElectrical")
      val api_criticalElectrical = parseHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_criticalEquipment")
      val api_criticalEquipment = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryAcknowledgment")
      val api_recoveryAcknowledgment = parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityFault")
      val api_visibilityFault = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(In_recovery, api_criticalElectrical, api_criticalEquipment, api_recoveryAcknowledgment, api_visibilityFault)
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_recoveryReport")
      val api_recoveryReport = parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(api_recoveryReport)
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("recovery")
      val recovery = parseHVAC_Visibility_Priority_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryReport")
      val api_recoveryReport = parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(recovery, api_recoveryReport)
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P")
      }
      parser.parseObjectKey("api_arbitrationStatus")
      val api_arbitrationStatus = parseHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      parser.parseObjectNext()
      parser.parseObjectKey("api_candidatePlan")
      val api_candidatePlan = parseHVAC_Visibility_Priority_SupervisorCandidatePlan()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryReport")
      val api_recoveryReport = parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(api_arbitrationStatus, api_candidatePlan, api_recoveryReport)
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS")
      }
      parser.parseObjectKey("api_arbitrationStatus")
      val api_arbitrationStatus = parseHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      parser.parseObjectNext()
      parser.parseObjectKey("api_candidatePlan")
      val api_candidatePlan = parseHVAC_Visibility_Priority_SupervisorCandidatePlan()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryReport")
      val api_recoveryReport = parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(api_arbitrationStatus, api_candidatePlan, api_recoveryReport)
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS"))
      t.native match {
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P = {
      val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P")
      }
      parser.parseObjectKey("api_actuationPlan")
      val api_actuationPlan = parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supervisorStatus")
      val api_supervisorStatus = parseHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(api_actuationPlan, api_supervisorStatus)
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS = {
      val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS")
      }
      parser.parseObjectKey("api_actuationPlan")
      val api_actuationPlan = parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supervisorStatus")
      val api_supervisorStatus = parseHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      parser.parseObjectNext()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(api_actuationPlan, api_supervisorStatus)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "HVAC_Visibility_Priority_Supervisor.Budget_Payload", "HVAC_Visibility_Priority_Supervisor.Arrival_Payload", "HVAC_Visibility_Priority_Supervisor.AirNeed_Payload", "HVAC_Visibility_Priority_Supervisor.Service_Payload", "HVAC_Visibility_Priority_Supervisor.Validity_Payload", "HVAC_Visibility_Priority_Supervisor.FanIntent_Payload", "HVAC_Visibility_Priority_Supervisor.CabinBand_Payload", "HVAC_Visibility_Priority_Supervisor.Intensity_Payload", "HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload", "HVAC_Visibility_Priority_Supervisor.HeatSource_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload", "HVAC_Visibility_Priority_Supervisor.StatusCause_Payload", "HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload", "HVAC_Visibility_Priority_Supervisor.AirCondition_Payload", "HVAC_Visibility_Priority_Supervisor.Availability_Payload", "HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload", "HVAC_Visibility_Priority_Supervisor.RequestClass_Payload", "HVAC_Visibility_Priority_Supervisor.Authorization_Payload", "HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload", "HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload", "HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload", "HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload", "HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload", "HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload", "HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload", "HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload", "HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload", "HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload", "HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload", "HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload", "HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload", "HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload", "HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload", "HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload", "HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload", "HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload", "HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload", "HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload", "HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload", "HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload", "HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload", "HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload", "HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload", "HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload", "HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload", "HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload", "HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload", "HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload", "HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload", "HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload", "HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload", "HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload", "HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload", "HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload", "HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload", "HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload", "HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload", "HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload", "HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload", "HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P", "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.Budget_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorBudget_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.Arrival_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorArrival_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirNeed_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAirNeed_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.Service_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorService_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.Validity_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorValidity_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.FanIntent_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorFanIntent_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinBand_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorCabinBand_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.Intensity_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorIntensity_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorEnergyTier_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HeatSource_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorHeatSource_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalBand_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeed_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.StatusCause_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorStatusCause_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorEnableIntent_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirCondition_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAirCondition_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.Availability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeed_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestClass_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorRequestClass_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.Authorization_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAuthorization_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorRecoveryState_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorDefrostIntent_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorSelectionMode_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorRecoveryCause_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorRecoveryEvent_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorCandidatePlan_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAirDegradation_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorInterfaceState_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalTier_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeed_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorSupervisorMode_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorSelectionCause_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorCandidateCause_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorRecoveryReport_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorSelectedIntent_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorBlowerReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorProposalUrgency_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorArbitrationMode_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalCause_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorQualifiedTarget_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalProposal_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorGlazingCondition_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorNoncriticalCause_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorArbitrationCause_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAirPathReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorSupervisorStatus_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorQualifiedRequest_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirProposal_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityCondition_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorClearingReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalAssessment_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorArbitrationStatus_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalDegradation_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorGlazingObservation_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityProposal_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorUserClimateRequest_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityDegradation_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityObservation_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentCriticality_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorClearingAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityCriticality_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalCriticality_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityObservation_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibility_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalObservationValidity_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_PayloadT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(T); return r
        case "HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS" => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromHVAC_Visibility_Priority_SupervisorValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.Validity_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorValidity_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.Validity_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorValidity_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.Validity_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorValidity_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorValidity_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArrival_Payload(o: HVAC_Visibility_Priority_Supervisor.Arrival_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorArrival_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorArrival_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.Arrival_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArrival_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.Arrival_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorArrival_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorArrival_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnableIntent_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnableIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalBand_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalBand_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalBand_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalBand_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorFanIntent_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.FanIntent_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorFanIntent_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.FanIntent_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorFanIntent_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorFanIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRequestClass_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.RequestClass_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestClass_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.RequestClass_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRequestClass_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRequestClass_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinBand_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinBand_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinBand_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinBand_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinBand_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinBand_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalNeed_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirCondition_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirCondition_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirCondition_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirCondition_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirCondition_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirCondition_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirNeed_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirNeed_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirNeed_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirNeed_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirNeed_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorInterfaceState_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorInterfaceState_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorBudget_Payload(o: HVAC_Visibility_Priority_Supervisor.Budget_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorBudget_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorBudget_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.Budget_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorBudget_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.Budget_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorBudget_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorBudget_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalTier_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalTier_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalCause_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.Availability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.Availability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.Availability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRecoveryState_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRecoveryState_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorService_Payload(o: HVAC_Visibility_Priority_Supervisor.Service_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorService_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorService_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.Service_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorService_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.Service_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorService_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorService_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHeatSource_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.HeatSource_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHeatSource_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.HeatSource_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHeatSource_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHeatSource_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirDegradation_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirDegradation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorSelectionCause_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorSelectionCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorSelectionMode_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorSelectionMode_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o: HVAC_Visibility_Priority_Supervisor.Authorization_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAuthorization_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.Authorization_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAuthorization_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.Authorization_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAuthorization_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAuthorization_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorIntensity_Payload(o: HVAC_Visibility_Priority_Supervisor.Intensity_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorIntensity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorIntensity_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.Intensity_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorIntensity_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.Intensity_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorIntensity_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorIntensity_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnergyTier_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnergyTier_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCandidateCause_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCandidateCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorStatusCause_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.StatusCause_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorStatusCause_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.StatusCause_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorStatusCause_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorStatusCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorUserClimateRequest(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorUserClimateRequest(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorUserClimateRequest(s: String): Either[HVAC_Visibility_Priority_Supervisor.UserClimateRequest, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorUserClimateRequest(parser: Parser): HVAC_Visibility_Priority_Supervisor.UserClimateRequest = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorUserClimateRequest _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedTarget(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorQualifiedTarget(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedTarget(s: String): Either[HVAC_Visibility_Priority_Supervisor.QualifiedTarget, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedTarget(parser: Parser): HVAC_Visibility_Priority_Supervisor.QualifiedTarget = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorQualifiedTarget _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedRequest(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorQualifiedRequest(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedRequest(s: String): Either[HVAC_Visibility_Priority_Supervisor.QualifiedRequest, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedRequest(parser: Parser): HVAC_Visibility_Priority_Supervisor.QualifiedRequest = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorQualifiedRequest _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinThermalObservation(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinThermalObservation, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinThermalObservation(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinThermalObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalAssessment(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalAssessment(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalAssessment, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalAssessment(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalAssessment = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalAssessment()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalAssessment _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorGlazingObservation(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorGlazingObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorGlazingObservation(s: String): Either[HVAC_Visibility_Priority_Supervisor.GlazingObservation, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorGlazingObservation(parser: Parser): HVAC_Visibility_Priority_Supervisor.GlazingObservation = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorGlazingObservation()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorGlazingObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityObservation(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityObservation(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityObservation, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityObservation(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityObservation = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityObservation()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityObservation(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityObservation(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityObservation, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityObservation(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityObservation = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalAvailability(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalAvailability(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalAvailability(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalAvailability, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalAvailability(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalAvailability _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibility(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibility(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibility(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibility, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibility(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibility _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentReadiness(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentReadiness, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentReadiness(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalPathReadiness(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalPathReadiness(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalPathReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirPathReadiness(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirPathReadiness(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirPathReadiness(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirPathReadiness, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirPathReadiness(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirPathReadiness = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirPathReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryReport(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRecoveryReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryReport(s: String): Either[HVAC_Visibility_Priority_Supervisor.RecoveryReport, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryReport(parser: Parser): HVAC_Visibility_Priority_Supervisor.RecoveryReport = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRecoveryReport()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRecoveryReport _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalProposal(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalProposal(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalProposal, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalProposal(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalProposal = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalProposal()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalProposal _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalProposal_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalProposal_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityProposal(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityProposal(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityProposal, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityProposal(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityProposal = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityProposal _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirProposal(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirProposal(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirProposal, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirProposal(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirProposal = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirProposal _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectedIntent(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorSelectedIntent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorSelectedIntent(s: String): Either[HVAC_Visibility_Priority_Supervisor.SelectedIntent, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectedIntent(parser: Parser): HVAC_Visibility_Priority_Supervisor.SelectedIntent = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorSelectedIntent()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorSelectedIntent _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationStatus(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorArbitrationStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationStatus(s: String): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationStatus, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationStatus(parser: Parser): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorArbitrationStatus _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinActuationPlan(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinActuationPlan, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinActuationPlan(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinActuationPlan _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSupervisorStatus(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorSupervisorStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorSupervisorStatus(s: String): Either[HVAC_Visibility_Priority_Supervisor.SupervisorStatus, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSupervisorStatus(parser: Parser): HVAC_Visibility_Priority_Supervisor.SupervisorStatus = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorSupervisorStatus _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCandidatePlan(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCandidatePlan(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCandidatePlan(s: String): Either[HVAC_Visibility_Priority_Supervisor.CandidatePlan, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCandidatePlan(parser: Parser): HVAC_Visibility_Priority_Supervisor.CandidatePlan = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCandidatePlan()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCandidatePlan _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(s: String): Either[HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(parser: Parser): HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(s: String): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(parser: Parser): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(s: String): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(parser: Parser): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(s: String): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(parser: Parser): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS = {
      val r = parser.parseHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}