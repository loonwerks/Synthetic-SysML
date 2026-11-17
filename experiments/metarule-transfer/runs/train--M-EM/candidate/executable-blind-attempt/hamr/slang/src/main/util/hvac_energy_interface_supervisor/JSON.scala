// #Sireum
// @formatter:off

// This file is auto-generated from ClimateRequest.scala, ThermalRelation.scala, ComfortDemand.scala, DefrostRequest.scala, GlazingCondition.scala, VisibilityDemand.scala, ElectricalState.scala, PowerEnvelope.scala, EngineHeat.scala, EnergyCapability.scala, FreshRequest.scala, RecoveryDecision.scala, Service.scala, SelectionReason.scala, ResourceGrant.scala, FanPreference.scala, ThermalService.scala, AirPath.scala, Blower.scala, ActuationDisposition.scala, SupervisorStatus.scala, EnergyContext.scala, ServiceSelection.scala, PlantCommand.scala, Base_Types.scala, ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Containers.scala, VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Containers.scala, EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Containers.scala, RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Containers.scala, ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_Containers.scala, ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Containers.scala, ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_Containers.scala, SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package hvac_energy_interface_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printHVAC_Energy_Interface_SupervisorClimateRequestType(o: HVAC_Energy_Interface_Supervisor.ClimateRequest.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.ClimateRequest.Off => "Off"
        case HVAC_Energy_Interface_Supervisor.ClimateRequest.Regulate => "Regulate"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.ClimateRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorClimateRequestType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorThermalRelationType(o: HVAC_Energy_Interface_Supervisor.ThermalRelation.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.ThermalRelation.Below => "Below"
        case HVAC_Energy_Interface_Supervisor.ThermalRelation.Within => "Within"
        case HVAC_Energy_Interface_Supervisor.ThermalRelation.Above => "Above"
        case HVAC_Energy_Interface_Supervisor.ThermalRelation.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.ThermalRelation")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorThermalRelationType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemandType(o: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.ComfortDemand.None => "None"
        case HVAC_Energy_Interface_Supervisor.ComfortDemand.Hold => "Hold"
        case HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat => "Heat"
        case HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool => "Cool"
        case HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.ComfortDemand")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorComfortDemandType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorDefrostRequestType(o: HVAC_Energy_Interface_Supervisor.DefrostRequest.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.DefrostRequest.Off => "Off"
        case HVAC_Energy_Interface_Supervisor.DefrostRequest.On => "On"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.DefrostRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorDefrostRequestType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorGlazingConditionType(o: HVAC_Energy_Interface_Supervisor.GlazingCondition.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.GlazingCondition.Clear => "Clear"
        case HVAC_Energy_Interface_Supervisor.GlazingCondition.Obscured => "Obscured"
        case HVAC_Energy_Interface_Supervisor.GlazingCondition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.GlazingCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorGlazingConditionType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemandType(o: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.VisibilityDemand.None => "None"
        case HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required => "Required"
        case HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.VisibilityDemand")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorElectricalStateType(o: HVAC_Energy_Interface_Supervisor.ElectricalState.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.ElectricalState.Ready => "Ready"
        case HVAC_Energy_Interface_Supervisor.ElectricalState.Constrained => "Constrained"
        case HVAC_Energy_Interface_Supervisor.ElectricalState.Unavailable => "Unavailable"
        case HVAC_Energy_Interface_Supervisor.ElectricalState.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.ElectricalState")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorElectricalState_Payload(o: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ElectricalState_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorElectricalStateType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorPowerEnvelopeType(o: HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.PowerEnvelope.Normal => "Normal"
        case HVAC_Energy_Interface_Supervisor.PowerEnvelope.Reduced => "Reduced"
        case HVAC_Energy_Interface_Supervisor.PowerEnvelope.None => "None"
        case HVAC_Energy_Interface_Supervisor.PowerEnvelope.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.PowerEnvelope")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorPowerEnvelopeType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEngineHeatType(o: HVAC_Energy_Interface_Supervisor.EngineHeat.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.EngineHeat.Available => "Available"
        case HVAC_Energy_Interface_Supervisor.EngineHeat.Unavailable => "Unavailable"
        case HVAC_Energy_Interface_Supervisor.EngineHeat.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.EngineHeat")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EngineHeat_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorEngineHeatType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.EnergyCapability.Full => "Full"
        case HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat => "ReducedHeat"
        case HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric => "ReducedElectric"
        case HVAC_Energy_Interface_Supervisor.EnergyCapability.None => "None"
        case HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.EnergyCapability")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorFreshRequestType(o: HVAC_Energy_Interface_Supervisor.FreshRequest.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.FreshRequest.Absent => "Absent"
        case HVAC_Energy_Interface_Supervisor.FreshRequest.Present => "Present"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.FreshRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.FreshRequest_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorFreshRequestType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.RecoveryDecision.Permit => "Permit"
        case HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid => "BlockEnergyInvalid"
        case HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable => "BlockEnergyUnavailable"
        case HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh => "BlockAwaitFresh"
        case HVAC_Energy_Interface_Supervisor.RecoveryDecision.PermitRecovered => "PermitRecovered"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.RecoveryDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorServiceType(o: HVAC_Energy_Interface_Supervisor.Service.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.Service.Off => "Off"
        case HVAC_Energy_Interface_Supervisor.Service.Heat => "Heat"
        case HVAC_Energy_Interface_Supervisor.Service.Cool => "Cool"
        case HVAC_Energy_Interface_Supervisor.Service.Defrost => "Defrost"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.Service")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorService_Payload(o: HVAC_Energy_Interface_Supervisor.Service_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.Service_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorServiceType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSelectionReasonType(o: HVAC_Energy_Interface_Supervisor.SelectionReason.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.SelectionReason.BlockEnergyInvalid => "BlockEnergyInvalid"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.BlockEnergyUnavailable => "BlockEnergyUnavailable"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.BlockAwaitFresh => "BlockAwaitFresh"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.InvalidDemand => "InvalidDemand"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedDefrost => "SelectedDefrost"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedHeat => "SelectedHeat"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedCool => "SelectedCool"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.TemperatureHold => "TemperatureHold"
        case HVAC_Energy_Interface_Supervisor.SelectionReason.UserOff => "UserOff"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.SelectionReason")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.SelectionReason_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorSelectionReasonType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceGrantType(o: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.ResourceGrant.Off => "Off"
        case HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal => "FullThermal"
        case HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat => "EconomyHeat"
        case HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly => "VentOnly"
        case HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied => "Denied"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.ResourceGrant")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorResourceGrantType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorFanPreferenceType(o: HVAC_Energy_Interface_Supervisor.FanPreference.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.FanPreference.Auto => "Auto"
        case HVAC_Energy_Interface_Supervisor.FanPreference.Low => "Low"
        case HVAC_Energy_Interface_Supervisor.FanPreference.High => "High"
        case HVAC_Energy_Interface_Supervisor.FanPreference.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.FanPreference")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorFanPreference_Payload(o: HVAC_Energy_Interface_Supervisor.FanPreference_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.FanPreference_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorFanPreferenceType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorThermalServiceType(o: HVAC_Energy_Interface_Supervisor.ThermalService.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.ThermalService.Off => "Off"
        case HVAC_Energy_Interface_Supervisor.ThermalService.Heat => "Heat"
        case HVAC_Energy_Interface_Supervisor.ThermalService.Cool => "Cool"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.ThermalService")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorThermalService_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalService_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ThermalService_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorThermalServiceType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorAirPathType(o: HVAC_Energy_Interface_Supervisor.AirPath.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.AirPath.Off => "Off"
        case HVAC_Energy_Interface_Supervisor.AirPath.Cabin => "Cabin"
        case HVAC_Energy_Interface_Supervisor.AirPath.Glazing => "Glazing"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.AirPath")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorAirPath_Payload(o: HVAC_Energy_Interface_Supervisor.AirPath_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.AirPath_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorAirPathType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorBlowerType(o: HVAC_Energy_Interface_Supervisor.Blower.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.Blower.Off => "Off"
        case HVAC_Energy_Interface_Supervisor.Blower.Low => "Low"
        case HVAC_Energy_Interface_Supervisor.Blower.High => "High"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.Blower")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorBlower_Payload(o: HVAC_Energy_Interface_Supervisor.Blower_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.Blower_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorBlowerType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationDispositionType(o: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent => "Quiescent"
        case HVAC_Energy_Interface_Supervisor.ActuationDisposition.Active => "Active"
        case HVAC_Energy_Interface_Supervisor.ActuationDisposition.LimitedActive => "LimitedActive"
        case HVAC_Energy_Interface_Supervisor.ActuationDisposition.Denied => "Denied"
        case HVAC_Energy_Interface_Supervisor.ActuationDisposition.InputFault => "InputFault"
        case HVAC_Energy_Interface_Supervisor.ActuationDisposition.Inconsistent => "Inconsistent"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.ActuationDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorActuationDispositionType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisorStatusType(o: HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type): ST = {
      val value: String = o match {
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inactive => "Inactive"
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.Holding => "Holding"
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.HeatingRequested => "HeatingRequested"
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.CoolingRequested => "CoolingRequested"
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.DefrostRequested => "DefrostRequested"
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.Limited => "Limited"
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited => "Inhibited"
        case HVAC_Energy_Interface_Supervisor.SupervisorStatus.InputFault => "InputFault"
      }
      return printObject(ISZ(
        ("type", printString("HVAC_Energy_Interface_Supervisor.SupervisorStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorSupervisorStatusType(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyContext(o: HVAC_Energy_Interface_Supervisor.EnergyContext): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EnergyContext""""),
        ("electricalState", printHVAC_Energy_Interface_SupervisorElectricalStateType(o.electricalState)),
        ("powerEnvelope", printHVAC_Energy_Interface_SupervisorPowerEnvelopeType(o.powerEnvelope)),
        ("engineHeat", printHVAC_Energy_Interface_SupervisorEngineHeatType(o.engineHeat))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EnergyContext_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorEnergyContext(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorServiceSelection(o: HVAC_Energy_Interface_Supervisor.ServiceSelection): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ServiceSelection""""),
        ("service", printHVAC_Energy_Interface_SupervisorServiceType(o.service)),
        ("reason", printHVAC_Energy_Interface_SupervisorSelectionReasonType(o.reason))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorServiceSelection(o.value))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorPlantCommand(o: HVAC_Energy_Interface_Supervisor.PlantCommand): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.PlantCommand""""),
        ("thermalService", printHVAC_Energy_Interface_SupervisorThermalServiceType(o.thermalService)),
        ("airPath", printHVAC_Energy_Interface_SupervisorAirPathType(o.airPath)),
        ("blower", printHVAC_Energy_Interface_SupervisorBlowerType(o.blower))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.PlantCommand_Payload""""),
        ("value", printHVAC_Energy_Interface_SupervisorPlantCommand(o.value))
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

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P""""),
        ("api_climateRequest", printHVAC_Energy_Interface_SupervisorClimateRequestType(o.api_climateRequest)),
        ("api_thermalRelation", printHVAC_Energy_Interface_SupervisorThermalRelationType(o.api_thermalRelation))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS""""),
        ("api_climateRequest", printHVAC_Energy_Interface_SupervisorClimateRequestType(o.api_climateRequest)),
        ("api_thermalRelation", printHVAC_Energy_Interface_SupervisorThermalRelationType(o.api_thermalRelation))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P""""),
        ("api_comfortDemand", printHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS""""),
        ("api_comfortDemand", printHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P""""),
        ("api_defrostRequest", printHVAC_Energy_Interface_SupervisorDefrostRequestType(o.api_defrostRequest)),
        ("api_glazingCondition", printHVAC_Energy_Interface_SupervisorGlazingConditionType(o.api_glazingCondition))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS""""),
        ("api_defrostRequest", printHVAC_Energy_Interface_SupervisorDefrostRequestType(o.api_defrostRequest)),
        ("api_glazingCondition", printHVAC_Energy_Interface_SupervisorGlazingConditionType(o.api_glazingCondition))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P""""),
        ("api_visibilityDemand", printHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS""""),
        ("api_visibilityDemand", printHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P""""),
        ("api_energyContext", printHVAC_Energy_Interface_SupervisorEnergyContext(o.api_energyContext))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS""""),
        ("api_energyContext", printHVAC_Energy_Interface_SupervisorEnergyContext(o.api_energyContext))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P""""),
        ("api_energyCapability", printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS""""),
        ("api_energyCapability", printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P""""),
        ("api_energyCapability", printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)),
        ("api_freshRequest", printHVAC_Energy_Interface_SupervisorFreshRequestType(o.api_freshRequest))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS""""),
        ("api_energyCapability", printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)),
        ("api_freshRequest", printHVAC_Energy_Interface_SupervisorFreshRequestType(o.api_freshRequest))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P""""),
        ("api_recoveryDecision", printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS""""),
        ("api_recoveryDecision", printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P""""),
        ("api_comfortDemand", printHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand)),
        ("api_recoveryDecision", printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_visibilityDemand", printHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS""""),
        ("api_comfortDemand", printHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand)),
        ("api_recoveryDecision", printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_visibilityDemand", printHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P""""),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS""""),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P""""),
        ("api_energyCapability", printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS""""),
        ("api_energyCapability", printHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P""""),
        ("api_resourceGrant", printHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS""""),
        ("api_resourceGrant", printHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P""""),
        ("api_fanPreference", printHVAC_Energy_Interface_SupervisorFanPreferenceType(o.api_fanPreference)),
        ("api_resourceGrant", printHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS""""),
        ("api_fanPreference", printHVAC_Energy_Interface_SupervisorFanPreferenceType(o.api_fanPreference)),
        ("api_resourceGrant", printHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P""""),
        ("api_actuationDisposition", printHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)),
        ("api_plantCommand", printHVAC_Energy_Interface_SupervisorPlantCommand(o.api_plantCommand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS""""),
        ("api_actuationDisposition", printHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)),
        ("api_plantCommand", printHVAC_Energy_Interface_SupervisorPlantCommand(o.api_plantCommand))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P""""),
        ("api_actuationDisposition", printHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)),
        ("api_recoveryDecision", printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_resourceGrant", printHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS""""),
        ("api_actuationDisposition", printHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)),
        ("api_recoveryDecision", printHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_resourceGrant", printHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)),
        ("api_serviceSelection", printHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container): ST = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
      }
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P""""),
        ("api_supervisorStatus", printHVAC_Energy_Interface_SupervisorSupervisorStatusType(o.api_supervisorStatus))
      ))
    }

    @pure def printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS""""),
        ("api_supervisorStatus", printHVAC_Energy_Interface_SupervisorSupervisorStatusType(o.api_supervisorStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_comfortDemandQualifier_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_comfortDemandQualifier_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_comfortDemandQualifier_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_comfortDemandQualifier_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_comfortDemandQualifier_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_comfortDemandQualifier_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_visibilityDemandQualifier_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_visibilityDemandQualifier_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_visibilityDemandQualifier_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_visibilityDemandQualifier_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_visibilityDemandQualifier_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_visibilityDemandQualifier_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_energyCapabilityQualifier_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_energyCapabilityQualifier_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_energyCapabilityQualifier_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_energyCapabilityQualifier_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_energyCapabilityQualifier_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_energyCapabilityQualifier_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_recoveryAuthority_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_recoveryAuthority_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_recoveryAuthority_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_recoveryAuthority_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_recoveryAuthority_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_recoveryAuthority_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_servicePriorityArbiter_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_servicePriorityArbiter_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_servicePriorityArbiter_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_servicePriorityArbiter_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_servicePriorityArbiter_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_servicePriorityArbiter_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_resourceAllocationDecision_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_resourceAllocationDecision_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_resourceAllocationDecision_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_resourceAllocationDecision_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_resourceAllocationDecision_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_resourceAllocationDecision_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_actuationCommandCoordinator_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_actuationCommandCoordinator_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_actuationCommandCoordinator_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_actuationCommandCoordinator_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_actuationCommandCoordinator_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_actuationCommandCoordinator_postCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_supervisoryStatusComposer_postInit => "HVACSupervisor_Instance_climateSupervisionProcess_supervisoryStatusComposer_postInit"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_supervisoryStatusComposer_preCompute => "HVACSupervisor_Instance_climateSupervisionProcess_supervisoryStatusComposer_preCompute"
        case runtimemonitor.ObservationKind.HVACSupervisor_Instance_climateSupervisionProcess_supervisoryStatusComposer_postCompute => "HVACSupervisor_Instance_climateSupervisionProcess_supervisoryStatusComposer_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
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
        case o: HVAC_Energy_Interface_Supervisor.Blower_Payload => return printHVAC_Energy_Interface_SupervisorBlower_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.AirPath_Payload => return printHVAC_Energy_Interface_SupervisorAirPath_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.Service_Payload => return printHVAC_Energy_Interface_SupervisorService_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload => return printHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload => return printHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload => return printHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.FanPreference_Payload => return printHVAC_Energy_Interface_SupervisorFanPreference_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload => return printHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload => return printHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload => return printHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload => return printHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload => return printHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload => return printHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ThermalService_Payload => return printHVAC_Energy_Interface_SupervisorThermalService_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload => return printHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload => return printHVAC_Energy_Interface_SupervisorElectricalState_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload => return printHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload => return printHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload => return printHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload => return printHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload => return printHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload => return printHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload => return printHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload => return printHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => return printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
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

    def parseHVAC_Energy_Interface_SupervisorClimateRequestType(): HVAC_Energy_Interface_Supervisor.ClimateRequest.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorClimateRequestT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorClimateRequestT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ClimateRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ClimateRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.ClimateRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.ClimateRequest.")
          return HVAC_Energy_Interface_Supervisor.ClimateRequest.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorClimateRequest_Payload(): HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorClimateRequest_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorClimateRequest_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorClimateRequestType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorThermalRelationType(): HVAC_Energy_Interface_Supervisor.ThermalRelation.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorThermalRelationT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorThermalRelationT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ThermalRelation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ThermalRelation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.ThermalRelation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.ThermalRelation.")
          return HVAC_Energy_Interface_Supervisor.ThermalRelation.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorThermalRelation_Payload(): HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorThermalRelation_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorThermalRelation_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorThermalRelationType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandType(): HVAC_Energy_Interface_Supervisor.ComfortDemand.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorComfortDemandT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ComfortDemand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.ComfortDemand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.ComfortDemand.")
          return HVAC_Energy_Interface_Supervisor.ComfortDemand.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemand_Payload(): HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorComfortDemand_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemand_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorComfortDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorDefrostRequestType(): HVAC_Energy_Interface_Supervisor.DefrostRequest.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorDefrostRequestT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorDefrostRequestT(typeParsed: B): HVAC_Energy_Interface_Supervisor.DefrostRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.DefrostRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.DefrostRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.DefrostRequest.")
          return HVAC_Energy_Interface_Supervisor.DefrostRequest.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(): HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorDefrostRequest_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorDefrostRequest_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorDefrostRequestType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorGlazingConditionType(): HVAC_Energy_Interface_Supervisor.GlazingCondition.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorGlazingConditionT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorGlazingConditionT(typeParsed: B): HVAC_Energy_Interface_Supervisor.GlazingCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.GlazingCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.GlazingCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.GlazingCondition.")
          return HVAC_Energy_Interface_Supervisor.GlazingCondition.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(): HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorGlazingCondition_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorGlazingCondition_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandType(): HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandT(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.VisibilityDemand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.VisibilityDemand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.VisibilityDemand.")
          return HVAC_Energy_Interface_Supervisor.VisibilityDemand.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(): HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemand_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemand_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorElectricalStateType(): HVAC_Energy_Interface_Supervisor.ElectricalState.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorElectricalStateT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorElectricalStateT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ElectricalState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ElectricalState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.ElectricalState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.ElectricalState.")
          return HVAC_Energy_Interface_Supervisor.ElectricalState.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorElectricalState_Payload(): HVAC_Energy_Interface_Supervisor.ElectricalState_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorElectricalState_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorElectricalState_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ElectricalState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ElectricalState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorElectricalStateType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ElectricalState_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorPowerEnvelopeType(): HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorPowerEnvelopeT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorPowerEnvelopeT(typeParsed: B): HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.PowerEnvelope")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.PowerEnvelope.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.PowerEnvelope.")
          return HVAC_Energy_Interface_Supervisor.PowerEnvelope.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(): HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorPowerEnvelope_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorPowerEnvelope_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorPowerEnvelopeType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorEngineHeatType(): HVAC_Energy_Interface_Supervisor.EngineHeat.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorEngineHeatT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEngineHeatT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EngineHeat.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EngineHeat")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.EngineHeat.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.EngineHeat.")
          return HVAC_Energy_Interface_Supervisor.EngineHeat.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorEngineHeat_Payload(): HVAC_Energy_Interface_Supervisor.EngineHeat_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorEngineHeat_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEngineHeat_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EngineHeat_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EngineHeat_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorEngineHeatType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EngineHeat_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType(): HVAC_Energy_Interface_Supervisor.EnergyCapability.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyCapability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.EnergyCapability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.EnergyCapability.")
          return HVAC_Energy_Interface_Supervisor.EnergyCapability.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(): HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyCapability_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapability_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorFreshRequestType(): HVAC_Energy_Interface_Supervisor.FreshRequest.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorFreshRequestT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorFreshRequestT(typeParsed: B): HVAC_Energy_Interface_Supervisor.FreshRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.FreshRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.FreshRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.FreshRequest.")
          return HVAC_Energy_Interface_Supervisor.FreshRequest.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorFreshRequest_Payload(): HVAC_Energy_Interface_Supervisor.FreshRequest_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorFreshRequest_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorFreshRequest_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.FreshRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.FreshRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorFreshRequestType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.FreshRequest_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType(): HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryDecisionT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.RecoveryDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.RecoveryDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.RecoveryDecision.")
          return HVAC_Energy_Interface_Supervisor.RecoveryDecision.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(): HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorRecoveryDecision_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryDecision_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorServiceType(): HVAC_Energy_Interface_Supervisor.Service.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorServiceT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorServiceT(typeParsed: B): HVAC_Energy_Interface_Supervisor.Service.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.Service")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.Service.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.Service.")
          return HVAC_Energy_Interface_Supervisor.Service.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorService_Payload(): HVAC_Energy_Interface_Supervisor.Service_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorService_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorService_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.Service_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.Service_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorServiceType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.Service_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorSelectionReasonType(): HVAC_Energy_Interface_Supervisor.SelectionReason.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorSelectionReasonT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSelectionReasonT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SelectionReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SelectionReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.SelectionReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.SelectionReason.")
          return HVAC_Energy_Interface_Supervisor.SelectionReason.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorSelectionReason_Payload(): HVAC_Energy_Interface_Supervisor.SelectionReason_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorSelectionReason_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSelectionReason_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SelectionReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SelectionReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorSelectionReasonType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.SelectionReason_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorResourceGrantType(): HVAC_Energy_Interface_Supervisor.ResourceGrant.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorResourceGrantT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorResourceGrantT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceGrant.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ResourceGrant")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.ResourceGrant.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.ResourceGrant.")
          return HVAC_Energy_Interface_Supervisor.ResourceGrant.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorResourceGrant_Payload(): HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorResourceGrant_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorResourceGrant_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorResourceGrantType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorFanPreferenceType(): HVAC_Energy_Interface_Supervisor.FanPreference.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorFanPreferenceT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorFanPreferenceT(typeParsed: B): HVAC_Energy_Interface_Supervisor.FanPreference.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.FanPreference")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.FanPreference.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.FanPreference.")
          return HVAC_Energy_Interface_Supervisor.FanPreference.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorFanPreference_Payload(): HVAC_Energy_Interface_Supervisor.FanPreference_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorFanPreference_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorFanPreference_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.FanPreference_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.FanPreference_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorFanPreferenceType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.FanPreference_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorThermalServiceType(): HVAC_Energy_Interface_Supervisor.ThermalService.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorThermalServiceT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorThermalServiceT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ThermalService.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ThermalService")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.ThermalService.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.ThermalService.")
          return HVAC_Energy_Interface_Supervisor.ThermalService.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorThermalService_Payload(): HVAC_Energy_Interface_Supervisor.ThermalService_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorThermalService_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorThermalService_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ThermalService_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ThermalService_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorThermalServiceType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ThermalService_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorAirPathType(): HVAC_Energy_Interface_Supervisor.AirPath.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorAirPathT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorAirPathT(typeParsed: B): HVAC_Energy_Interface_Supervisor.AirPath.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.AirPath")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.AirPath.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.AirPath.")
          return HVAC_Energy_Interface_Supervisor.AirPath.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorAirPath_Payload(): HVAC_Energy_Interface_Supervisor.AirPath_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorAirPath_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorAirPath_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.AirPath_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.AirPath_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorAirPathType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.AirPath_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorBlowerType(): HVAC_Energy_Interface_Supervisor.Blower.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorBlowerT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorBlowerT(typeParsed: B): HVAC_Energy_Interface_Supervisor.Blower.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.Blower")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.Blower.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.Blower.")
          return HVAC_Energy_Interface_Supervisor.Blower.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorBlower_Payload(): HVAC_Energy_Interface_Supervisor.Blower_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorBlower_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorBlower_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.Blower_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.Blower_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorBlowerType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.Blower_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorActuationDispositionType(): HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorActuationDispositionT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorActuationDispositionT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ActuationDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.ActuationDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.ActuationDisposition.")
          return HVAC_Energy_Interface_Supervisor.ActuationDisposition.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(): HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorActuationDisposition_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorActuationDisposition_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorActuationDispositionType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisorStatusType(): HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type = {
      val r = parseHVAC_Energy_Interface_SupervisorSupervisorStatusT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisorStatusT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SupervisorStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      HVAC_Energy_Interface_Supervisor.SupervisorStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for HVAC_Energy_Interface_Supervisor.SupervisorStatus.")
          return HVAC_Energy_Interface_Supervisor.SupervisorStatus.byOrdinal(0).get
      }
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(): HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorSupervisorStatus_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisorStatus_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorSupervisorStatusType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyContext(): HVAC_Energy_Interface_Supervisor.EnergyContext = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyContextT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyContextT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyContext = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyContext")
      }
      parser.parseObjectKey("electricalState")
      val electricalState = parseHVAC_Energy_Interface_SupervisorElectricalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("powerEnvelope")
      val powerEnvelope = parseHVAC_Energy_Interface_SupervisorPowerEnvelopeType()
      parser.parseObjectNext()
      parser.parseObjectKey("engineHeat")
      val engineHeat = parseHVAC_Energy_Interface_SupervisorEngineHeatType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EnergyContext(electricalState, powerEnvelope, engineHeat)
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyContext_Payload(): HVAC_Energy_Interface_Supervisor.EnergyContext_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyContext_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyContext_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorEnergyContext()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EnergyContext_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorServiceSelection(): HVAC_Energy_Interface_Supervisor.ServiceSelection = {
      val r = parseHVAC_Energy_Interface_SupervisorServiceSelectionT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorServiceSelectionT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServiceSelection = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ServiceSelection")
      }
      parser.parseObjectKey("service")
      val service = parseHVAC_Energy_Interface_SupervisorServiceType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseHVAC_Energy_Interface_SupervisorSelectionReasonType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ServiceSelection(service, reason)
    }

    def parseHVAC_Energy_Interface_SupervisorServiceSelection_Payload(): HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorServiceSelection_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorServiceSelection_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload(value)
    }

    def parseHVAC_Energy_Interface_SupervisorPlantCommand(): HVAC_Energy_Interface_Supervisor.PlantCommand = {
      val r = parseHVAC_Energy_Interface_SupervisorPlantCommandT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorPlantCommandT(typeParsed: B): HVAC_Energy_Interface_Supervisor.PlantCommand = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.PlantCommand")
      }
      parser.parseObjectKey("thermalService")
      val thermalService = parseHVAC_Energy_Interface_SupervisorThermalServiceType()
      parser.parseObjectNext()
      parser.parseObjectKey("airPath")
      val airPath = parseHVAC_Energy_Interface_SupervisorAirPathType()
      parser.parseObjectNext()
      parser.parseObjectKey("blower")
      val blower = parseHVAC_Energy_Interface_SupervisorBlowerType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.PlantCommand(thermalService, airPath, blower)
    }

    def parseHVAC_Energy_Interface_SupervisorPlantCommand_Payload(): HVAC_Energy_Interface_Supervisor.PlantCommand_Payload = {
      val r = parseHVAC_Energy_Interface_SupervisorPlantCommand_PayloadT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorPlantCommand_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.PlantCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.PlantCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseHVAC_Energy_Interface_SupervisorPlantCommand()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.PlantCommand_Payload(value)
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

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_climateRequest")
      val api_climateRequest = parseHVAC_Energy_Interface_SupervisorClimateRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalRelation")
      val api_thermalRelation = parseHVAC_Energy_Interface_SupervisorThermalRelationType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(api_climateRequest, api_thermalRelation)
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_climateRequest")
      val api_climateRequest = parseHVAC_Energy_Interface_SupervisorClimateRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermalRelation")
      val api_thermalRelation = parseHVAC_Energy_Interface_SupervisorThermalRelationType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(api_climateRequest, api_thermalRelation)
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_comfortDemand")
      val api_comfortDemand = parseHVAC_Energy_Interface_SupervisorComfortDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(api_comfortDemand)
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_comfortDemand")
      val api_comfortDemand = parseHVAC_Energy_Interface_SupervisorComfortDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(api_comfortDemand)
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_defrostRequest")
      val api_defrostRequest = parseHVAC_Energy_Interface_SupervisorDefrostRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_glazingCondition")
      val api_glazingCondition = parseHVAC_Energy_Interface_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(api_defrostRequest, api_glazingCondition)
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defrostRequest")
      val api_defrostRequest = parseHVAC_Energy_Interface_SupervisorDefrostRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_glazingCondition")
      val api_glazingCondition = parseHVAC_Energy_Interface_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(api_defrostRequest, api_glazingCondition)
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_visibilityDemand")
      val api_visibilityDemand = parseHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(api_visibilityDemand)
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_visibilityDemand")
      val api_visibilityDemand = parseHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(api_visibilityDemand)
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_energyContext")
      val api_energyContext = parseHVAC_Energy_Interface_SupervisorEnergyContext()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(api_energyContext)
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_energyContext")
      val api_energyContext = parseHVAC_Energy_Interface_SupervisorEnergyContext()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(api_energyContext)
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_energyCapability")
      val api_energyCapability = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(api_energyCapability)
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_energyCapability")
      val api_energyCapability = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(api_energyCapability)
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P")
      }
      parser.parseObjectKey("api_energyCapability")
      val api_energyCapability = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_freshRequest")
      val api_freshRequest = parseHVAC_Energy_Interface_SupervisorFreshRequestType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(api_energyCapability, api_freshRequest)
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS")
      }
      parser.parseObjectKey("api_energyCapability")
      val api_energyCapability = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_freshRequest")
      val api_freshRequest = parseHVAC_Energy_Interface_SupervisorFreshRequestType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(api_energyCapability, api_freshRequest)
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P")
      }
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(api_recoveryDecision)
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS")
      }
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(api_recoveryDecision)
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_comfortDemand")
      val api_comfortDemand = parseHVAC_Energy_Interface_SupervisorComfortDemandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityDemand")
      val api_visibilityDemand = parseHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(api_comfortDemand, api_recoveryDecision, api_visibilityDemand)
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_comfortDemand")
      val api_comfortDemand = parseHVAC_Energy_Interface_SupervisorComfortDemandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityDemand")
      val api_visibilityDemand = parseHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(api_comfortDemand, api_recoveryDecision, api_visibilityDemand)
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P")
      }
      parser.parseObjectKey("api_energyCapability")
      val api_energyCapability = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(api_energyCapability, api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_energyCapability")
      val api_energyCapability = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(api_energyCapability, api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P")
      }
      parser.parseObjectKey("api_resourceGrant")
      val api_resourceGrant = parseHVAC_Energy_Interface_SupervisorResourceGrantType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(api_resourceGrant)
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_resourceGrant")
      val api_resourceGrant = parseHVAC_Energy_Interface_SupervisorResourceGrantType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(api_resourceGrant)
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P")
      }
      parser.parseObjectKey("api_fanPreference")
      val api_fanPreference = parseHVAC_Energy_Interface_SupervisorFanPreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resourceGrant")
      val api_resourceGrant = parseHVAC_Energy_Interface_SupervisorResourceGrantType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(api_fanPreference, api_resourceGrant, api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fanPreference")
      val api_fanPreference = parseHVAC_Energy_Interface_SupervisorFanPreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resourceGrant")
      val api_resourceGrant = parseHVAC_Energy_Interface_SupervisorResourceGrantType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(api_fanPreference, api_resourceGrant, api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P")
      }
      parser.parseObjectKey("api_actuationDisposition")
      val api_actuationDisposition = parseHVAC_Energy_Interface_SupervisorActuationDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_plantCommand")
      val api_plantCommand = parseHVAC_Energy_Interface_SupervisorPlantCommand()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(api_actuationDisposition, api_plantCommand)
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS")
      }
      parser.parseObjectKey("api_actuationDisposition")
      val api_actuationDisposition = parseHVAC_Energy_Interface_SupervisorActuationDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_plantCommand")
      val api_plantCommand = parseHVAC_Energy_Interface_SupervisorPlantCommand()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(api_actuationDisposition, api_plantCommand)
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P")
      }
      parser.parseObjectKey("api_actuationDisposition")
      val api_actuationDisposition = parseHVAC_Energy_Interface_SupervisorActuationDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resourceGrant")
      val api_resourceGrant = parseHVAC_Energy_Interface_SupervisorResourceGrantType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(api_actuationDisposition, api_recoveryDecision, api_resourceGrant, api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_actuationDisposition")
      val api_actuationDisposition = parseHVAC_Energy_Interface_SupervisorActuationDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resourceGrant")
      val api_resourceGrant = parseHVAC_Energy_Interface_SupervisorResourceGrantType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceSelection")
      val api_serviceSelection = parseHVAC_Energy_Interface_SupervisorServiceSelection()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(api_actuationDisposition, api_recoveryDecision, api_resourceGrant, api_serviceSelection)
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS"))
      t.native match {
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T); return r
      }
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P = {
      val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P")
      }
      parser.parseObjectKey("api_supervisorStatus")
      val api_supervisorStatus = parseHVAC_Energy_Interface_SupervisorSupervisorStatusType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(api_supervisorStatus)
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS = {
      val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(F)
      return r
    }

    def parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_supervisorStatus")
      val api_supervisorStatus = parseHVAC_Energy_Interface_SupervisorSupervisorStatusType()
      parser.parseObjectNext()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(api_supervisorStatus)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "HVAC_Energy_Interface_Supervisor.Blower_Payload", "HVAC_Energy_Interface_Supervisor.AirPath_Payload", "HVAC_Energy_Interface_Supervisor.Service_Payload", "HVAC_Energy_Interface_Supervisor.EngineHeat_Payload", "HVAC_Energy_Interface_Supervisor.FreshRequest_Payload", "HVAC_Energy_Interface_Supervisor.PlantCommand_Payload", "HVAC_Energy_Interface_Supervisor.FanPreference_Payload", "HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload", "HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload", "HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload", "HVAC_Energy_Interface_Supervisor.EnergyContext_Payload", "HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload", "HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload", "HVAC_Energy_Interface_Supervisor.ThermalService_Payload", "HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload", "HVAC_Energy_Interface_Supervisor.ElectricalState_Payload", "HVAC_Energy_Interface_Supervisor.SelectionReason_Payload", "HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload", "HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload", "HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload", "HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload", "HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload", "HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload", "HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P", "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS"))
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
        case "HVAC_Energy_Interface_Supervisor.Blower_Payload" => val r = parseHVAC_Energy_Interface_SupervisorBlower_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.AirPath_Payload" => val r = parseHVAC_Energy_Interface_SupervisorAirPath_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.Service_Payload" => val r = parseHVAC_Energy_Interface_SupervisorService_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EngineHeat_Payload" => val r = parseHVAC_Energy_Interface_SupervisorEngineHeat_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.FreshRequest_Payload" => val r = parseHVAC_Energy_Interface_SupervisorFreshRequest_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.PlantCommand_Payload" => val r = parseHVAC_Energy_Interface_SupervisorPlantCommand_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.FanPreference_Payload" => val r = parseHVAC_Energy_Interface_SupervisorFanPreference_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload" => val r = parseHVAC_Energy_Interface_SupervisorPowerEnvelope_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemand_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload" => val r = parseHVAC_Energy_Interface_SupervisorResourceGrant_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyContext_Payload" => val r = parseHVAC_Energy_Interface_SupervisorEnergyContext_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload" => val r = parseHVAC_Energy_Interface_SupervisorDefrostRequest_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload" => val r = parseHVAC_Energy_Interface_SupervisorClimateRequest_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ThermalService_Payload" => val r = parseHVAC_Energy_Interface_SupervisorThermalService_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload" => val r = parseHVAC_Energy_Interface_SupervisorThermalRelation_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ElectricalState_Payload" => val r = parseHVAC_Energy_Interface_SupervisorElectricalState_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SelectionReason_Payload" => val r = parseHVAC_Energy_Interface_SupervisorSelectionReason_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemand_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload" => val r = parseHVAC_Energy_Interface_SupervisorGlazingCondition_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapability_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryDecision_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload" => val r = parseHVAC_Energy_Interface_SupervisorSupervisorStatus_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload" => val r = parseHVAC_Energy_Interface_SupervisorServiceSelection_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload" => val r = parseHVAC_Energy_Interface_SupervisorActuationDisposition_PayloadT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(T); return r
        case "HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS" => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
        case _ => val r = parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
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

  def fromHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorClimateRequest_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorClimateRequest_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorClimateRequest_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorClimateRequest_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorThermalRelation_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorThermalRelation_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorThermalRelation_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorThermalRelation_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemand_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemand_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorComfortDemand_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorComfortDemand_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorDefrostRequest_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorDefrostRequest_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorGlazingCondition_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorGlazingCondition_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorElectricalState_Payload(o: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorElectricalState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorElectricalState_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ElectricalState_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorElectricalState_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ElectricalState_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorElectricalState_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorElectricalState_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEngineHeat_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.EngineHeat_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEngineHeat_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.EngineHeat_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEngineHeat_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEngineHeat_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyCapability_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyCapability_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorFreshRequest_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.FreshRequest_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorFreshRequest_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.FreshRequest_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorFreshRequest_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorFreshRequest_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorService_Payload(o: HVAC_Energy_Interface_Supervisor.Service_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorService_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorService_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.Service_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorService_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.Service_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorService_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorService_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSelectionReason_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.SelectionReason_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSelectionReason_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.SelectionReason_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSelectionReason_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSelectionReason_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorResourceGrant_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceGrant_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorResourceGrant_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorResourceGrant_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorFanPreference_Payload(o: HVAC_Energy_Interface_Supervisor.FanPreference_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorFanPreference_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorFanPreference_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.FanPreference_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorFanPreference_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.FanPreference_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorFanPreference_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorFanPreference_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorThermalService_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalService_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorThermalService_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorThermalService_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ThermalService_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorThermalService_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ThermalService_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorThermalService_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorThermalService_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorAirPath_Payload(o: HVAC_Energy_Interface_Supervisor.AirPath_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorAirPath_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorAirPath_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.AirPath_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorAirPath_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.AirPath_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorAirPath_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorAirPath_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorBlower_Payload(o: HVAC_Energy_Interface_Supervisor.Blower_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorBlower_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorBlower_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.Blower_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorBlower_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.Blower_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorBlower_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorBlower_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorActuationDisposition_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorActuationDisposition_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyContext(o: HVAC_Energy_Interface_Supervisor.EnergyContext, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyContext(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyContext(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyContext, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyContext(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyContext = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyContext()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyContext _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyContext_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyContext_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyContext_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyContext_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyContext_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyContext_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServiceSelection(o: HVAC_Energy_Interface_Supervisor.ServiceSelection, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServiceSelection(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServiceSelection(s: String): Either[HVAC_Energy_Interface_Supervisor.ServiceSelection, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServiceSelection(parser: Parser): HVAC_Energy_Interface_Supervisor.ServiceSelection = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServiceSelection()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServiceSelection _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServiceSelection_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServiceSelection_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServiceSelection_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServiceSelection_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorPlantCommand(o: HVAC_Energy_Interface_Supervisor.PlantCommand, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorPlantCommand(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorPlantCommand(s: String): Either[HVAC_Energy_Interface_Supervisor.PlantCommand, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorPlantCommand(parser: Parser): HVAC_Energy_Interface_Supervisor.PlantCommand = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorPlantCommand()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorPlantCommand _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorPlantCommand_Payload(s: String): Either[HVAC_Energy_Interface_Supervisor.PlantCommand_Payload, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorPlantCommand_Payload(parser: Parser): HVAC_Energy_Interface_Supervisor.PlantCommand_Payload = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorPlantCommand_Payload()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorPlantCommand_Payload _)
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

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(s: String): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(parser: Parser): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(s: String): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(parser: Parser): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(s: String): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS, Json.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(parser: Parser): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS = {
      val r = parser.parseHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS()
      return r
    }
    val r = to(s, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS _)
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