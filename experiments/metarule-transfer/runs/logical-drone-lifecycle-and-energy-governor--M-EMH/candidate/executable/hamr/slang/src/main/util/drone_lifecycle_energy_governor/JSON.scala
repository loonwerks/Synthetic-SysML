// #Sireum
// @formatter:off

// This file is auto-generated from LifecycleRequest.scala, ExactRequestCode.scala, RequestFamily.scala, BatteryBand.scala, EvidenceValidity.scala, ChargerReport.scala, BatteryConfidence.scala, NavigationReport.scala, FlightControlReport.scala, HomeValue.scala, TouchdownValue.scala, AirborneRequestProposal.scala, LifecycleCase.scala, SourceLifecyclePhase.scala, LifecyclePhase.scala, PublishedPhase.scala, RequestResult.scala, BatteryNotice.scala, ChargePermission.scala, FlightIntent.scala, LaunchPermission.scala, PropulsionPermission.scala, AirborneClassifiedRequest.scala, LifecycleClassifiedRequest.scala, BatteryReportValue.scala, BatteryEvidence.scala, ChargerFacts.scala, ChargeEligibility.scala, HomeFacts.scala, TouchdownFacts.scala, HazardProposal.scala, FaultVector.scala, BatteryStateFacts.scala, HomeReportValue.scala, TouchdownReportValue.scala, LifecycleResolution.scala, PilotStatus.scala, FlightControlOutputs.scala, Base_Types.scala, RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_Containers.scala, BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_Containers.scala, ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_Containers.scala, ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_Containers.scala, FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala, HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_Containers.scala, TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_Containers.scala, BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_Containers.scala, AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_Containers.scala, AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_Containers.scala, FaultAggregationOwner_governorProcess_faultAggregationOwner_Containers.scala, LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_Containers.scala, OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_lifecycle_energy_governor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o: Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.NONE => "NONE"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.SWITCH_ON => "SWITCH_ON"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.SWITCH_OFF => "SWITCH_OFF"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.START_CHARGE => "START_CHARGE"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.STOP_CHARGE => "STOP_CHARGE"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.ACTIVATE => "ACTIVATE"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.DEACTIVATE => "DEACTIVATE"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.LAUNCH => "LAUNCH"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.RETURN => "RETURN"
        case Drone_Lifecycle_Energy_Governor.LifecycleRequest.LAND => "LAND"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.LifecycleRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o: Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.NONE => "NONE"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON => "SWITCH_ON"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF => "SWITCH_OFF"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE => "START_CHARGE"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE => "STOP_CHARGE"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE => "ACTIVATE"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE => "DEACTIVATE"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH => "LAUNCH"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.RETURN => "RETURN"
        case Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAND => "LAND"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.ExactRequestCode")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestFamilyType(o: Drone_Lifecycle_Energy_Governor.RequestFamily.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT => "ABSENT"
        case Drone_Lifecycle_Energy_Governor.RequestFamily.POWER => "POWER"
        case Drone_Lifecycle_Energy_Governor.RequestFamily.CHARGE => "CHARGE"
        case Drone_Lifecycle_Energy_Governor.RequestFamily.READINESS => "READINESS"
        case Drone_Lifecycle_Energy_Governor.RequestFamily.AIRBORNE => "AIRBORNE"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.RequestFamily")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.RequestFamily_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorRequestFamilyType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryBandType(o: Drone_Lifecycle_Energy_Governor.BatteryBand.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.BatteryBand.FULL => "FULL"
        case Drone_Lifecycle_Energy_Governor.BatteryBand.MEDIUM => "MEDIUM"
        case Drone_Lifecycle_Energy_Governor.BatteryBand.LOW => "LOW"
        case Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL => "CRITICAL"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.BatteryBand")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryBand_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorBatteryBandType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o: Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.EvidenceValidity.VALID => "VALID"
        case Drone_Lifecycle_Energy_Governor.EvidenceValidity.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.EvidenceValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerReportType(o: Drone_Lifecycle_Energy_Governor.ChargerReport.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.ChargerReport.DISCONNECTED => "DISCONNECTED"
        case Drone_Lifecycle_Energy_Governor.ChargerReport.CONNECTED_HEALTHY => "CONNECTED_HEALTHY"
        case Drone_Lifecycle_Energy_Governor.ChargerReport.CONNECTED_FAULTED => "CONNECTED_FAULTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.ChargerReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargerReport_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorChargerReportType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED => "UNTRUSTED"
        case Drone_Lifecycle_Energy_Governor.BatteryConfidence.CONFIRMING => "CONFIRMING"
        case Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED => "TRUSTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.BatteryConfidence")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorNavigationReportType(o: Drone_Lifecycle_Energy_Governor.NavigationReport.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.NavigationReport.USABLE => "USABLE"
        case Drone_Lifecycle_Energy_Governor.NavigationReport.UNUSABLE => "UNUSABLE"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.NavigationReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.NavigationReport_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorNavigationReportType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o: Drone_Lifecycle_Energy_Governor.FlightControlReport.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.FlightControlReport.AVAILABLE => "AVAILABLE"
        case Drone_Lifecycle_Energy_Governor.FlightControlReport.FAULTED => "FAULTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.FlightControlReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeValueType(o: Drone_Lifecycle_Energy_Governor.HomeValue.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.HomeValue.AWAY => "AWAY"
        case Drone_Lifecycle_Energy_Governor.HomeValue.REACHED => "REACHED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.HomeValue")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeValue_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorHomeValueType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownValueType(o: Drone_Lifecycle_Energy_Governor.TouchdownValue.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.TouchdownValue.NOT_CONFIRMED => "NOT_CONFIRMED"
        case Drone_Lifecycle_Energy_Governor.TouchdownValue.CONFIRMED => "CONFIRMED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.TouchdownValue")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorTouchdownValueType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.NO_AIRBORNE_REQUEST => "NO_AIRBORNE_REQUEST"
        case Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.RETURN_REQUESTED => "RETURN_REQUESTED"
        case Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED => "LAND_REQUESTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.AirborneRequestProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleCaseType(o: Drone_Lifecycle_Energy_Governor.LifecycleCase.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L01 => "L01"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L02 => "L02"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L03 => "L03"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L04 => "L04"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L05 => "L05"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L06 => "L06"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L07 => "L07"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L08 => "L08"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L09 => "L09"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L10 => "L10"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L11 => "L11"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L12 => "L12"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L13 => "L13"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L14 => "L14"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L15 => "L15"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L16 => "L16"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L17 => "L17"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L18 => "L18"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L19 => "L19"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L20 => "L20"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L21 => "L21"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L22 => "L22"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L23 => "L23"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L24 => "L24"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L25 => "L25"
        case Drone_Lifecycle_Energy_Governor.LifecycleCase.L26 => "L26"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.LifecycleCase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorLifecycleCaseType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.OFF => "OFF"
        case Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.STANDBY => "STANDBY"
        case Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.CHARGING => "CHARGING"
        case Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.READY => "READY"
        case Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.FLYING => "FLYING"
        case Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.RETURNING => "RETURNING"
        case Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.LANDING => "LANDING"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF => "OFF"
        case Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY => "STANDBY"
        case Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING => "CHARGING"
        case Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY => "READY"
        case Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING => "FLYING"
        case Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING => "RETURNING"
        case Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING => "LANDING"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.LifecyclePhase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorPublishedPhaseType(o: Drone_Lifecycle_Energy_Governor.PublishedPhase.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.PublishedPhase.OFF => "OFF"
        case Drone_Lifecycle_Energy_Governor.PublishedPhase.STANDBY => "STANDBY"
        case Drone_Lifecycle_Energy_Governor.PublishedPhase.CHARGING => "CHARGING"
        case Drone_Lifecycle_Energy_Governor.PublishedPhase.READY => "READY"
        case Drone_Lifecycle_Energy_Governor.PublishedPhase.FLYING => "FLYING"
        case Drone_Lifecycle_Energy_Governor.PublishedPhase.RETURNING => "RETURNING"
        case Drone_Lifecycle_Energy_Governor.PublishedPhase.LANDING => "LANDING"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.PublishedPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorPublishedPhaseType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestResultType(o: Drone_Lifecycle_Energy_Governor.RequestResult.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.RequestResult.NONE => "NONE"
        case Drone_Lifecycle_Energy_Governor.RequestResult.ACCEPTED => "ACCEPTED"
        case Drone_Lifecycle_Energy_Governor.RequestResult.REJECTED => "REJECTED"
        case Drone_Lifecycle_Energy_Governor.RequestResult.PREEMPTED => "PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.RequestResult")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o: Drone_Lifecycle_Energy_Governor.RequestResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.RequestResult_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorRequestResultType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryNoticeType(o: Drone_Lifecycle_Energy_Governor.BatteryNotice.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.BatteryNotice.UNTRUSTED => "UNTRUSTED"
        case Drone_Lifecycle_Energy_Governor.BatteryNotice.CLEAR => "CLEAR"
        case Drone_Lifecycle_Energy_Governor.BatteryNotice.LOW => "LOW"
        case Drone_Lifecycle_Energy_Governor.BatteryNotice.CRITICAL => "CRITICAL"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.BatteryNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorBatteryNoticeType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargePermissionType(o: Drone_Lifecycle_Energy_Governor.ChargePermission.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.ChargePermission.DENIED => "DENIED"
        case Drone_Lifecycle_Energy_Governor.ChargePermission.PERMITTED => "PERMITTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.ChargePermission")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargePermission_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorChargePermissionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightIntentType(o: Drone_Lifecycle_Energy_Governor.FlightIntent.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.FlightIntent.HOLD => "HOLD"
        case Drone_Lifecycle_Energy_Governor.FlightIntent.LAUNCH => "LAUNCH"
        case Drone_Lifecycle_Energy_Governor.FlightIntent.CONTINUE => "CONTINUE"
        case Drone_Lifecycle_Energy_Governor.FlightIntent.RETURN => "RETURN"
        case Drone_Lifecycle_Energy_Governor.FlightIntent.LAND => "LAND"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.FlightIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightIntent_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorFlightIntentType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLaunchPermissionType(o: Drone_Lifecycle_Energy_Governor.LaunchPermission.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.LaunchPermission.DENIED => "DENIED"
        case Drone_Lifecycle_Energy_Governor.LaunchPermission.PERMITTED => "PERMITTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.LaunchPermission")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorLaunchPermissionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o: Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Energy_Governor.PropulsionPermission.DISABLED => "DISABLED"
        case Drone_Lifecycle_Energy_Governor.PropulsionPermission.ENABLED => "ENABLED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Energy_Governor.PropulsionPermission")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest""""),
        ("intentCode", printDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o.intentCode)),
        ("requestFamily", printDrone_Lifecycle_Energy_GovernorRequestFamilyType(o.requestFamily))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest""""),
        ("intentCode", printDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o.intentCode)),
        ("requestFamily", printDrone_Lifecycle_Energy_GovernorRequestFamilyType(o.requestFamily))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryReportValue(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryReportValue""""),
        ("band", printDrone_Lifecycle_Energy_GovernorBatteryBandType(o.band)),
        ("validity", printDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.validity))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorBatteryReportValue(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidence(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryEvidence""""),
        ("band", printDrone_Lifecycle_Energy_GovernorBatteryBandType(o.band)),
        ("validBand", printB(o.validBand))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerFacts(o: Drone_Lifecycle_Energy_Governor.ChargerFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargerFacts""""),
        ("connected", printB(o.connected)),
        ("healthyConnected", printB(o.healthyConnected)),
        ("chargerFault", printB(o.chargerFault))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorChargerFacts(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibility(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargeEligibility""""),
        ("entryEligible", printB(o.entryEligible)),
        ("retentionEligible", printB(o.retentionEligible)),
        ("exitRequired", printB(o.exitRequired))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorChargeEligibility(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeFacts(o: Drone_Lifecycle_Energy_Governor.HomeFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeFacts""""),
        ("arrivalEstablished", printB(o.arrivalEstablished)),
        ("evidenceValid", printB(o.evidenceValid)),
        ("homeFault", printB(o.homeFault))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeFacts_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorHomeFacts(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownFacts(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownFacts""""),
        ("touchdownEstablished", printB(o.touchdownEstablished)),
        ("evidenceValid", printB(o.evidenceValid)),
        ("touchdownFault", printB(o.touchdownFault))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHazardProposal(o: Drone_Lifecycle_Energy_Governor.HazardProposal): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HazardProposal""""),
        ("emergencyLand", printB(o.emergencyLand)),
        ("forcedReturn", printB(o.forcedReturn)),
        ("batteryUnusable", printB(o.batteryUnusable)),
        ("lowOrCritical", printB(o.lowOrCritical)),
        ("navigationUnusable", printB(o.navigationUnusable))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HazardProposal_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorHazardProposal(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultVector(o: Drone_Lifecycle_Energy_Governor.FaultVector): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FaultVector""""),
        ("batteryFault", printB(o.batteryFault)),
        ("chargerFault", printB(o.chargerFault)),
        ("navigationFault", printB(o.navigationFault)),
        ("flightControlFault", printB(o.flightControlFault)),
        ("homeFault", printB(o.homeFault)),
        ("touchdownFault", printB(o.touchdownFault)),
        ("aggregateFault", printB(o.aggregateFault))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o: Drone_Lifecycle_Energy_Governor.FaultVector_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FaultVector_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorFaultVector(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryStateFacts""""),
        ("band", printDrone_Lifecycle_Energy_GovernorBatteryBandType(o.band)),
        ("confidence", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.confidence)),
        ("usable", printB(o.usable))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeReportValue(o: Drone_Lifecycle_Energy_Governor.HomeReportValue): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeReportValue""""),
        ("homeValue", printDrone_Lifecycle_Energy_GovernorHomeValueType(o.homeValue)),
        ("validity", printDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.validity))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorHomeReportValue(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownReportValue""""),
        ("touchdownValue", printDrone_Lifecycle_Energy_GovernorTouchdownValueType(o.touchdownValue)),
        ("validity", printDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.validity))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleResolution(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecycleResolution""""),
        ("winningCase", printDrone_Lifecycle_Energy_GovernorLifecycleCaseType(o.winningCase)),
        ("sourceLifecycleState", printDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(o.sourceLifecycleState)),
        ("nextPhase", printDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.nextPhase)),
        ("requestPresent", printB(o.requestPresent)),
        ("requestApplicable", printB(o.requestApplicable)),
        ("requestCausedTransition", printB(o.requestCausedTransition)),
        ("requestDefeatedByPriority", printB(o.requestDefeatedByPriority)),
        ("chargeRetentionEligible", printB(o.chargeRetentionEligible)),
        ("launchReady", printB(o.launchReady))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorPilotStatus(o: Drone_Lifecycle_Energy_Governor.PilotStatus): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.PilotStatus""""),
        ("phase", printDrone_Lifecycle_Energy_GovernorPublishedPhaseType(o.phase)),
        ("requestResult", printDrone_Lifecycle_Energy_GovernorRequestResultType(o.requestResult)),
        ("batteryNotice", printDrone_Lifecycle_Energy_GovernorBatteryNoticeType(o.batteryNotice)),
        ("batteryFault", printB(o.batteryFault)),
        ("chargerFault", printB(o.chargerFault)),
        ("navigationFault", printB(o.navigationFault)),
        ("flightControlFault", printB(o.flightControlFault)),
        ("homeFault", printB(o.homeFault)),
        ("touchdownFault", printB(o.touchdownFault)),
        ("aggregateFault", printB(o.aggregateFault))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.PilotStatus_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorPilotStatus(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightControlOutputs""""),
        ("intent", printDrone_Lifecycle_Energy_GovernorFlightIntentType(o.intent)),
        ("launchPermission", printDrone_Lifecycle_Energy_GovernorLaunchPermissionType(o.launchPermission))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload""""),
        ("value", printDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o.value))
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

    @pure def printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P""""),
        ("api_requestIn", printDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o.api_requestIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS""""),
        ("api_requestIn", printDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o.api_requestIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P""""),
        ("api_semanticsToAirborne", printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsToAirborne)),
        ("api_semanticsToLifecycle", printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsToLifecycle))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS""""),
        ("api_semanticsToAirborne", printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsToAirborne)),
        ("api_semanticsToLifecycle", printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsToLifecycle))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorBatteryReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorBatteryReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P""""),
        ("api_evidenceOut", printDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS""""),
        ("api_evidenceOut", printDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorChargerReportType(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorChargerReportType(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P""""),
        ("api_factsToCharge", printDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_factsToCharge)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS""""),
        ("api_factsToCharge", printDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_factsToCharge)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_chargerIn", printDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_chargerIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_chargerIn", printDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_chargerIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P""""),
        ("api_eligibilityOut", printDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_eligibilityOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS""""),
        ("api_eligibilityOut", printDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_eligibilityOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_flightControlIn", printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)),
        ("api_navigationIn", printDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_flightControlIn", printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)),
        ("api_navigationIn", printDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P""""),
        ("api_readinessOut", printB(o.api_readinessOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS""""),
        ("api_readinessOut", printB(o.api_readinessOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorHomeReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorHomeReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P""""),
        ("api_factsToLifecycle", printDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_factsToLifecycle)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS""""),
        ("api_factsToLifecycle", printDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_factsToLifecycle)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P""""),
        ("api_factsToLifecycle", printDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_factsToLifecycle)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS""""),
        ("api_factsToLifecycle", printDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_factsToLifecycle)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P""""),
        ("api_evidenceIn", printDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS""""),
        ("In_confidenceState", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.In_confidenceState)),
        ("api_evidenceIn", printDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P""""),
        ("api_confidenceToFault", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceToFault)),
        ("api_stateToCharge", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToCharge)),
        ("api_stateToComposition", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToComposition)),
        ("api_stateToHazard", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToHazard)),
        ("api_stateToReadiness", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToReadiness))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS""""),
        ("confidenceState", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.confidenceState)),
        ("api_confidenceToFault", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceToFault)),
        ("api_stateToCharge", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToCharge)),
        ("api_stateToComposition", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToComposition)),
        ("api_stateToHazard", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToHazard)),
        ("api_stateToReadiness", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToReadiness))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_flightControlIn", printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)),
        ("api_navigationIn", printDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_flightControlIn", printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)),
        ("api_navigationIn", printDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P""""),
        ("api_proposalOut", printDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_proposalOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS""""),
        ("api_proposalOut", printDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_proposalOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P""""),
        ("api_semanticsIn", printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS""""),
        ("api_semanticsIn", printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P""""),
        ("api_proposalOut", printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_proposalOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS""""),
        ("api_proposalOut", printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_proposalOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P""""),
        ("api_chargerFaultIn", printB(o.api_chargerFaultIn)),
        ("api_confidenceIn", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceIn)),
        ("api_flightControlIn", printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)),
        ("api_homeFaultIn", printB(o.api_homeFaultIn)),
        ("api_navigationIn", printDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)),
        ("api_touchdownFaultIn", printB(o.api_touchdownFaultIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS""""),
        ("api_chargerFaultIn", printB(o.api_chargerFaultIn)),
        ("api_confidenceIn", printDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceIn)),
        ("api_flightControlIn", printDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)),
        ("api_homeFaultIn", printB(o.api_homeFaultIn)),
        ("api_navigationIn", printDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)),
        ("api_touchdownFaultIn", printB(o.api_touchdownFaultIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P""""),
        ("api_faultsOut", printDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS""""),
        ("api_faultsOut", printDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P""""),
        ("api_airborneRequestIn", printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_airborneRequestIn)),
        ("api_chargeEligibilityIn", printDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_chargeEligibilityIn)),
        ("api_hazardProposalIn", printDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_hazardProposalIn)),
        ("api_homeFactsIn", printDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_homeFactsIn)),
        ("api_readinessIn", printB(o.api_readinessIn)),
        ("api_semanticsIn", printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsIn)),
        ("api_touchdownFactsIn", printDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_touchdownFactsIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS""""),
        ("In_phaseState", printDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.In_phaseState)),
        ("api_airborneRequestIn", printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_airborneRequestIn)),
        ("api_chargeEligibilityIn", printDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_chargeEligibilityIn)),
        ("api_hazardProposalIn", printDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_hazardProposalIn)),
        ("api_homeFactsIn", printDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_homeFactsIn)),
        ("api_readinessIn", printB(o.api_readinessIn)),
        ("api_semanticsIn", printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsIn)),
        ("api_touchdownFactsIn", printDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_touchdownFactsIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P""""),
        ("api_resolutionOut", printDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS""""),
        ("phaseState", printDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.phaseState)),
        ("api_resolutionOut", printDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_faultsIn", printDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsIn)),
        ("api_resolutionIn", printDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS""""),
        ("api_batteryIn", printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)),
        ("api_faultsIn", printDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsIn)),
        ("api_resolutionIn", printDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionIn))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P""""),
        ("api_chargePermissionOut", printDrone_Lifecycle_Energy_GovernorChargePermissionType(o.api_chargePermissionOut)),
        ("api_flightControlOut", printDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o.api_flightControlOut)),
        ("api_pilotStatusOut", printDrone_Lifecycle_Energy_GovernorPilotStatus(o.api_pilotStatusOut)),
        ("api_propulsionPermissionOut", printDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o.api_propulsionPermissionOut))
      ))
    }

    @pure def printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS""""),
        ("api_chargePermissionOut", printDrone_Lifecycle_Energy_GovernorChargePermissionType(o.api_chargePermissionOut)),
        ("api_flightControlOut", printDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o.api_flightControlOut)),
        ("api_pilotStatusOut", printDrone_Lifecycle_Energy_GovernorPilotStatus(o.api_pilotStatusOut)),
        ("api_propulsionPermissionOut", printDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o.api_propulsionPermissionOut))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_requestApplicabilityOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_requestApplicabilityOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_requestApplicabilityOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_requestApplicabilityOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_requestApplicabilityOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_requestApplicabilityOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryEvidenceQualifier_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryEvidenceQualifier_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryEvidenceQualifier_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargerEvidenceQualifier_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargerEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargerEvidenceQualifier_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargerEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargerEvidenceQualifier_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargerEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargeEligibilityOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargeEligibilityOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargeEligibilityOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargeEligibilityOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargeEligibilityOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_chargeEligibilityOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_flightReadinessOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_flightReadinessOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_flightReadinessOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_flightReadinessOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_flightReadinessOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_flightReadinessOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_homeEvidenceQualifier_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_homeEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_homeEvidenceQualifier_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_homeEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_homeEvidenceQualifier_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_homeEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_touchdownEvidenceQualifier_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_touchdownEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_touchdownEvidenceQualifier_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_touchdownEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_touchdownEvidenceQualifier_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_touchdownEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryConfidenceOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryConfidenceOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryConfidenceOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryConfidenceOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryConfidenceOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_batteryConfidenceOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneHazardProposalOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneHazardProposalOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneHazardProposalOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneHazardProposalOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneHazardProposalOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneHazardProposalOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneRequestProposalOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneRequestProposalOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneRequestProposalOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneRequestProposalOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneRequestProposalOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_airborneRequestProposalOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_faultAggregationOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_faultAggregationOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_faultAggregationOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_faultAggregationOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_faultAggregationOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_faultAggregationOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_lifecyclePriorityOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_lifecyclePriorityOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_lifecyclePriorityOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_lifecyclePriorityOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_lifecyclePriorityOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_lifecyclePriorityOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_outcomeCompositionOwner_postInit => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_outcomeCompositionOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_outcomeCompositionOwner_preCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_outcomeCompositionOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_outcomeCompositionOwner_postCompute => "DroneLifecycleEnergyGovernorSystem_Instance_governorProcess_outcomeCompositionOwner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
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
        case o: Drone_Lifecycle_Energy_Governor.HomeValue_Payload => return printDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload => return printDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload => return printDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultVector_Payload => return printDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload => return printDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload => return printDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload => return printDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestResult_Payload => return printDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload => return printDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload => return printDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload => return printDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload => return printDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload => return printDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload => return printDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload => return printDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload => return printDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload => return printDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload => return printDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload => return printDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload => return printDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload => return printDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload => return printDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload => return printDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload => return printDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload => return printDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload => return printDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload => return printDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload => return printDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload => return printDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload => return printDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload => return printDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload => return printDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload => return printDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload => return printDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload => return printDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload => return printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload => return printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => return printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
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

    def parseDrone_Lifecycle_Energy_GovernorLifecycleRequestType(): Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleRequestT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleRequestT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.LifecycleRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.LifecycleRequest.")
          return Drone_Lifecycle_Energy_Governor.LifecycleRequest.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleRequest_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorLifecycleRequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorExactRequestCodeType(): Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorExactRequestCodeT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorExactRequestCodeT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ExactRequestCode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.ExactRequestCode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.ExactRequestCode.")
          return Drone_Lifecycle_Energy_Governor.ExactRequestCode.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(): Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorExactRequestCode_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorExactRequestCode_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorExactRequestCodeType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestFamilyType(): Drone_Lifecycle_Energy_Governor.RequestFamily.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestFamilyT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestFamilyT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestFamily.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestFamily")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.RequestFamily.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.RequestFamily.")
          return Drone_Lifecycle_Energy_Governor.RequestFamily.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(): Drone_Lifecycle_Energy_Governor.RequestFamily_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestFamily_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestFamily_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestFamily_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestFamily_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorRequestFamilyType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.RequestFamily_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryBandType(): Drone_Lifecycle_Energy_Governor.BatteryBand.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryBandT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryBandT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.BatteryBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.BatteryBand.")
          return Drone_Lifecycle_Energy_Governor.BatteryBand.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(): Drone_Lifecycle_Energy_Governor.BatteryBand_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryBand_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryBand_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorBatteryBandType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryBand_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorEvidenceValidityType(): Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorEvidenceValidityT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorEvidenceValidityT(typeParsed: B): Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.EvidenceValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.EvidenceValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.EvidenceValidity.")
          return Drone_Lifecycle_Energy_Governor.EvidenceValidity.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(): Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorEvidenceValidity_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorEvidenceValidity_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerReportType(): Drone_Lifecycle_Energy_Governor.ChargerReport.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerReportT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerReportT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.ChargerReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.ChargerReport.")
          return Drone_Lifecycle_Energy_Governor.ChargerReport.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerReport_Payload(): Drone_Lifecycle_Energy_Governor.ChargerReport_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerReport_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerReport_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorChargerReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargerReport_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(): Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryConfidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.BatteryConfidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.BatteryConfidence.")
          return Drone_Lifecycle_Energy_Governor.BatteryConfidence.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(): Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidence_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidence_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorNavigationReportType(): Drone_Lifecycle_Energy_Governor.NavigationReport.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorNavigationReportT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorNavigationReportT(typeParsed: B): Drone_Lifecycle_Energy_Governor.NavigationReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.NavigationReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.NavigationReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.NavigationReport.")
          return Drone_Lifecycle_Energy_Governor.NavigationReport.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(): Drone_Lifecycle_Energy_Governor.NavigationReport_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorNavigationReport_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorNavigationReport_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.NavigationReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.NavigationReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorNavigationReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.NavigationReport_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlReportType(): Drone_Lifecycle_Energy_Governor.FlightControlReport.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightControlReportT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlReportT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightControlReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightControlReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.FlightControlReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.FlightControlReport.")
          return Drone_Lifecycle_Energy_Governor.FlightControlReport.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(): Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightControlReport_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlReport_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeValueType(): Drone_Lifecycle_Energy_Governor.HomeValue.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeValueT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.HomeValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.HomeValue.")
          return Drone_Lifecycle_Energy_Governor.HomeValue.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeValue_Payload(): Drone_Lifecycle_Energy_Governor.HomeValue_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeValue_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorHomeValueType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeValue_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownValueType(): Drone_Lifecycle_Energy_Governor.TouchdownValue.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownValueT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.TouchdownValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.TouchdownValue.")
          return Drone_Lifecycle_Energy_Governor.TouchdownValue.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(): Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownValue_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorTouchdownValueType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneRequestProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.")
          return Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleCaseType(): Drone_Lifecycle_Energy_Governor.LifecycleCase.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleCaseT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleCaseT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleCase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleCase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.LifecycleCase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.LifecycleCase.")
          return Drone_Lifecycle_Energy_Governor.LifecycleCase.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleCase_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleCase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorLifecycleCaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseT(typeParsed: B): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.")
          return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(): Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePhaseT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePhaseT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecyclePhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.LifecyclePhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.LifecyclePhase.")
          return Drone_Lifecycle_Energy_Governor.LifecyclePhase.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(): Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePhase_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePhase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorPublishedPhaseType(): Drone_Lifecycle_Energy_Governor.PublishedPhase.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorPublishedPhaseT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorPublishedPhaseT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PublishedPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.PublishedPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.PublishedPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.PublishedPhase.")
          return Drone_Lifecycle_Energy_Governor.PublishedPhase.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(): Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorPublishedPhase_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorPublishedPhase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorPublishedPhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestResultType(): Drone_Lifecycle_Energy_Governor.RequestResult.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestResultT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestResultT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.RequestResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.RequestResult.")
          return Drone_Lifecycle_Energy_Governor.RequestResult.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestResult_Payload(): Drone_Lifecycle_Energy_Governor.RequestResult_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestResult_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestResult_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorRequestResultType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.RequestResult_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryNoticeType(): Drone_Lifecycle_Energy_Governor.BatteryNotice.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryNoticeT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryNoticeT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.BatteryNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.BatteryNotice.")
          return Drone_Lifecycle_Energy_Governor.BatteryNotice.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(): Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryNotice_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryNotice_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorBatteryNoticeType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargePermissionType(): Drone_Lifecycle_Energy_Governor.ChargePermission.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargePermissionT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargePermissionT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargePermission.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargePermission")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.ChargePermission.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.ChargePermission.")
          return Drone_Lifecycle_Energy_Governor.ChargePermission.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorChargePermission_Payload(): Drone_Lifecycle_Energy_Governor.ChargePermission_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargePermission_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargePermission_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargePermission_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargePermission_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorChargePermissionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargePermission_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightIntentType(): Drone_Lifecycle_Energy_Governor.FlightIntent.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightIntentT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightIntentT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.FlightIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.FlightIntent.")
          return Drone_Lifecycle_Energy_Governor.FlightIntent.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(): Drone_Lifecycle_Energy_Governor.FlightIntent_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightIntent_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightIntent_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorFlightIntentType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightIntent_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorLaunchPermissionType(): Drone_Lifecycle_Energy_Governor.LaunchPermission.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorLaunchPermissionT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLaunchPermissionT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LaunchPermission.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LaunchPermission")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.LaunchPermission.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.LaunchPermission.")
          return Drone_Lifecycle_Energy_Governor.LaunchPermission.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(): Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorLaunchPermission_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLaunchPermission_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorLaunchPermissionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(): Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type = {
      val r = parseDrone_Lifecycle_Energy_GovernorPropulsionPermissionT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorPropulsionPermissionT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.PropulsionPermission")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Energy_Governor.PropulsionPermission.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Energy_Governor.PropulsionPermission.")
          return Drone_Lifecycle_Energy_Governor.PropulsionPermission.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(): Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorPropulsionPermission_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorPropulsionPermission_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorPropulsionPermissionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequestT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequestT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest")
      }
      parser.parseObjectKey("intentCode")
      val intentCode = parseDrone_Lifecycle_Energy_GovernorExactRequestCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestFamily")
      val requestFamily = parseDrone_Lifecycle_Energy_GovernorRequestFamilyType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest(intentCode, requestFamily)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequestT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequestT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest")
      }
      parser.parseObjectKey("intentCode")
      val intentCode = parseDrone_Lifecycle_Energy_GovernorExactRequestCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestFamily")
      val requestFamily = parseDrone_Lifecycle_Energy_GovernorRequestFamilyType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest(intentCode, requestFamily)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryReportValue(): Drone_Lifecycle_Energy_Governor.BatteryReportValue = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryReportValueT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryReportValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryReportValue = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryReportValue")
      }
      parser.parseObjectKey("band")
      val band = parseDrone_Lifecycle_Energy_GovernorBatteryBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryReportValue(band, validity)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(): Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryReportValue_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryReportValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidence(): Drone_Lifecycle_Energy_Governor.BatteryEvidence = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryEvidence")
      }
      parser.parseObjectKey("band")
      val band = parseDrone_Lifecycle_Energy_GovernorBatteryBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("validBand")
      val validBand = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidence(band, validBand)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(): Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidence_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidence_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerFacts(): Drone_Lifecycle_Energy_Governor.ChargerFacts = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerFactsT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerFacts")
      }
      parser.parseObjectKey("connected")
      val connected = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("healthyConnected")
      val healthyConnected = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargerFault")
      val chargerFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargerFacts(connected, healthyConnected, chargerFault)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(): Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerFacts_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorChargerFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibility(): Drone_Lifecycle_Energy_Governor.ChargeEligibility = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibility = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargeEligibility")
      }
      parser.parseObjectKey("entryEligible")
      val entryEligible = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("retentionEligible")
      val retentionEligible = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("exitRequired")
      val exitRequired = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible, retentionEligible, exitRequired)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(): Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibility_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibility_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorChargeEligibility()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeFacts(): Drone_Lifecycle_Energy_Governor.HomeFacts = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeFactsT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeFacts")
      }
      parser.parseObjectKey("arrivalEstablished")
      val arrivalEstablished = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("evidenceValid")
      val evidenceValid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("homeFault")
      val homeFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeFacts(arrivalEstablished, evidenceValid, homeFault)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(): Drone_Lifecycle_Energy_Governor.HomeFacts_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeFacts_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorHomeFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeFacts_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownFacts(): Drone_Lifecycle_Energy_Governor.TouchdownFacts = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownFactsT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownFacts")
      }
      parser.parseObjectKey("touchdownEstablished")
      val touchdownEstablished = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("evidenceValid")
      val evidenceValid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("touchdownFault")
      val touchdownFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownFacts(touchdownEstablished, evidenceValid, touchdownFault)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(): Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownFacts_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorHazardProposal(): Drone_Lifecycle_Energy_Governor.HazardProposal = {
      val r = parseDrone_Lifecycle_Energy_GovernorHazardProposalT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHazardProposalT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HazardProposal = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HazardProposal")
      }
      parser.parseObjectKey("emergencyLand")
      val emergencyLand = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("forcedReturn")
      val forcedReturn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("batteryUnusable")
      val batteryUnusable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("lowOrCritical")
      val lowOrCritical = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("navigationUnusable")
      val navigationUnusable = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HazardProposal(emergencyLand, forcedReturn, batteryUnusable, lowOrCritical, navigationUnusable)
    }

    def parseDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(): Drone_Lifecycle_Energy_Governor.HazardProposal_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorHazardProposal_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHazardProposal_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HazardProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HazardProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorHazardProposal()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HazardProposal_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultVector(): Drone_Lifecycle_Energy_Governor.FaultVector = {
      val r = parseDrone_Lifecycle_Energy_GovernorFaultVectorT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultVectorT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultVector = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FaultVector")
      }
      parser.parseObjectKey("batteryFault")
      val batteryFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargerFault")
      val chargerFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("navigationFault")
      val navigationFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("flightControlFault")
      val flightControlFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("homeFault")
      val homeFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("touchdownFault")
      val touchdownFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("aggregateFault")
      val aggregateFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FaultVector(batteryFault, chargerFault, navigationFault, flightControlFault, homeFault, touchdownFault, aggregateFault)
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultVector_Payload(): Drone_Lifecycle_Energy_Governor.FaultVector_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorFaultVector_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultVector_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultVector_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FaultVector_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorFaultVector()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FaultVector_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts(): Drone_Lifecycle_Energy_Governor.BatteryStateFacts = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryStateFactsT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryStateFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryStateFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryStateFacts")
      }
      parser.parseObjectKey("band")
      val band = parseDrone_Lifecycle_Energy_GovernorBatteryBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("confidence")
      val confidence = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryStateFacts(band, confidence, usable)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(): Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeReportValue(): Drone_Lifecycle_Energy_Governor.HomeReportValue = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeReportValueT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeReportValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeReportValue = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeReportValue")
      }
      parser.parseObjectKey("homeValue")
      val homeValue = parseDrone_Lifecycle_Energy_GovernorHomeValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeReportValue(homeValue, validity)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(): Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeReportValue_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeReportValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorHomeReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue(): Drone_Lifecycle_Energy_Governor.TouchdownReportValue = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownReportValueT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownReportValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownReportValue = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownReportValue")
      }
      parser.parseObjectKey("touchdownValue")
      val touchdownValue = parseDrone_Lifecycle_Energy_GovernorTouchdownValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownReportValue(touchdownValue, validity)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(): Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleResolution(): Drone_Lifecycle_Energy_Governor.LifecycleResolution = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleResolutionT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleResolutionT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleResolution = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleResolution")
      }
      parser.parseObjectKey("winningCase")
      val winningCase = parseDrone_Lifecycle_Energy_GovernorLifecycleCaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("sourceLifecycleState")
      val sourceLifecycleState = parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextPhase")
      val nextPhase = parseDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestPresent")
      val requestPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("requestApplicable")
      val requestApplicable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("requestCausedTransition")
      val requestCausedTransition = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("requestDefeatedByPriority")
      val requestDefeatedByPriority = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargeRetentionEligible")
      val chargeRetentionEligible = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("launchReady")
      val launchReady = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecycleResolution(winningCase, sourceLifecycleState, nextPhase, requestPresent, requestApplicable, requestCausedTransition, requestDefeatedByPriority, chargeRetentionEligible, launchReady)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecycleResolution_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecycleResolution_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorPilotStatus(): Drone_Lifecycle_Energy_Governor.PilotStatus = {
      val r = parseDrone_Lifecycle_Energy_GovernorPilotStatusT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorPilotStatusT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PilotStatus = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.PilotStatus")
      }
      parser.parseObjectKey("phase")
      val phase = parseDrone_Lifecycle_Energy_GovernorPublishedPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestResult")
      val requestResult = parseDrone_Lifecycle_Energy_GovernorRequestResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("batteryNotice")
      val batteryNotice = parseDrone_Lifecycle_Energy_GovernorBatteryNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("batteryFault")
      val batteryFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargerFault")
      val chargerFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("navigationFault")
      val navigationFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("flightControlFault")
      val flightControlFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("homeFault")
      val homeFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("touchdownFault")
      val touchdownFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("aggregateFault")
      val aggregateFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.PilotStatus(phase, requestResult, batteryNotice, batteryFault, chargerFault, navigationFault, flightControlFault, homeFault, touchdownFault, aggregateFault)
    }

    def parseDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(): Drone_Lifecycle_Energy_Governor.PilotStatus_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorPilotStatus_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorPilotStatus_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PilotStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.PilotStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorPilotStatus()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.PilotStatus_Payload(value)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs(): Drone_Lifecycle_Energy_Governor.FlightControlOutputs = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightControlOutputsT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlOutputsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightControlOutputs = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightControlOutputs")
      }
      parser.parseObjectKey("intent")
      val intent = parseDrone_Lifecycle_Energy_GovernorFlightIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("launchPermission")
      val launchPermission = parseDrone_Lifecycle_Energy_GovernorLaunchPermissionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightControlOutputs(intent, launchPermission)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(): Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload(value)
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

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Lifecycle_Energy_GovernorLifecycleRequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(api_requestIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Lifecycle_Energy_GovernorLifecycleRequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(api_requestIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_semanticsToAirborne")
      val api_semanticsToAirborne = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_semanticsToLifecycle")
      val api_semanticsToLifecycle = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(api_semanticsToAirborne, api_semanticsToLifecycle)
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_semanticsToAirborne")
      val api_semanticsToAirborne = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_semanticsToLifecycle")
      val api_semanticsToLifecycle = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(api_semanticsToAirborne, api_semanticsToLifecycle)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_evidenceOut")
      val api_evidenceOut = parseDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(api_evidenceOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_evidenceOut")
      val api_evidenceOut = parseDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_evidenceOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorChargerReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorChargerReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToCharge")
      val api_factsToCharge = parseDrone_Lifecycle_Energy_GovernorChargerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(api_factsToCharge, api_faultToAggregation)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToCharge")
      val api_factsToCharge = parseDrone_Lifecycle_Energy_GovernorChargerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(api_factsToCharge, api_faultToAggregation)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerIn")
      val api_chargerIn = parseDrone_Lifecycle_Energy_GovernorChargerFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(api_batteryIn, api_chargerIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerIn")
      val api_chargerIn = parseDrone_Lifecycle_Energy_GovernorChargerFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(api_batteryIn, api_chargerIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityOut")
      val api_eligibilityOut = parseDrone_Lifecycle_Energy_GovernorChargeEligibility()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(api_eligibilityOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibilityOut")
      val api_eligibilityOut = parseDrone_Lifecycle_Energy_GovernorChargeEligibility()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(api_eligibilityOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlIn")
      val api_flightControlIn = parseDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationIn")
      val api_navigationIn = parseDrone_Lifecycle_Energy_GovernorNavigationReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlIn")
      val api_flightControlIn = parseDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationIn")
      val api_navigationIn = parseDrone_Lifecycle_Energy_GovernorNavigationReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_readinessOut")
      val api_readinessOut = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(api_readinessOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_readinessOut")
      val api_readinessOut = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(api_readinessOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorHomeReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorHomeReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToLifecycle")
      val api_factsToLifecycle = parseDrone_Lifecycle_Energy_GovernorHomeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(api_factsToLifecycle, api_faultToAggregation)
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToLifecycle")
      val api_factsToLifecycle = parseDrone_Lifecycle_Energy_GovernorHomeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(api_factsToLifecycle, api_faultToAggregation)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToLifecycle")
      val api_factsToLifecycle = parseDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(api_factsToLifecycle, api_faultToAggregation)
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToLifecycle")
      val api_factsToLifecycle = parseDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(api_factsToLifecycle, api_faultToAggregation)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_evidenceIn")
      val api_evidenceIn = parseDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(api_evidenceIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_confidenceState")
      val In_confidenceState = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceIn")
      val api_evidenceIn = parseDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(In_confidenceState, api_evidenceIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_confidenceToFault")
      val api_confidenceToFault = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToCharge")
      val api_stateToCharge = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToComposition")
      val api_stateToComposition = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToHazard")
      val api_stateToHazard = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToReadiness")
      val api_stateToReadiness = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(api_confidenceToFault, api_stateToCharge, api_stateToComposition, api_stateToHazard, api_stateToReadiness)
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("confidenceState")
      val confidenceState = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_confidenceToFault")
      val api_confidenceToFault = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToCharge")
      val api_stateToCharge = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToComposition")
      val api_stateToComposition = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToHazard")
      val api_stateToHazard = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToReadiness")
      val api_stateToReadiness = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(confidenceState, api_confidenceToFault, api_stateToCharge, api_stateToComposition, api_stateToHazard, api_stateToReadiness)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlIn")
      val api_flightControlIn = parseDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationIn")
      val api_navigationIn = parseDrone_Lifecycle_Energy_GovernorNavigationReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlIn")
      val api_flightControlIn = parseDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationIn")
      val api_navigationIn = parseDrone_Lifecycle_Energy_GovernorNavigationReportType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposalOut")
      val api_proposalOut = parseDrone_Lifecycle_Energy_GovernorHazardProposal()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(api_proposalOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposalOut")
      val api_proposalOut = parseDrone_Lifecycle_Energy_GovernorHazardProposal()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(api_proposalOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_semanticsIn")
      val api_semanticsIn = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(api_semanticsIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_semanticsIn")
      val api_semanticsIn = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(api_semanticsIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposalOut")
      val api_proposalOut = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(api_proposalOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposalOut")
      val api_proposalOut = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(api_proposalOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_chargerFaultIn")
      val api_chargerFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_confidenceIn")
      val api_confidenceIn = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlIn")
      val api_flightControlIn = parseDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_homeFaultIn")
      val api_homeFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationIn")
      val api_navigationIn = parseDrone_Lifecycle_Energy_GovernorNavigationReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_touchdownFaultIn")
      val api_touchdownFaultIn = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(api_chargerFaultIn, api_confidenceIn, api_flightControlIn, api_homeFaultIn, api_navigationIn, api_touchdownFaultIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_chargerFaultIn")
      val api_chargerFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_confidenceIn")
      val api_confidenceIn = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlIn")
      val api_flightControlIn = parseDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_homeFaultIn")
      val api_homeFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationIn")
      val api_navigationIn = parseDrone_Lifecycle_Energy_GovernorNavigationReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_touchdownFaultIn")
      val api_touchdownFaultIn = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(api_chargerFaultIn, api_confidenceIn, api_flightControlIn, api_homeFaultIn, api_navigationIn, api_touchdownFaultIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_faultsOut")
      val api_faultsOut = parseDrone_Lifecycle_Energy_GovernorFaultVector()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(api_faultsOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_faultsOut")
      val api_faultsOut = parseDrone_Lifecycle_Energy_GovernorFaultVector()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(api_faultsOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_airborneRequestIn")
      val api_airborneRequestIn = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeEligibilityIn")
      val api_chargeEligibilityIn = parseDrone_Lifecycle_Energy_GovernorChargeEligibility()
      parser.parseObjectNext()
      parser.parseObjectKey("api_hazardProposalIn")
      val api_hazardProposalIn = parseDrone_Lifecycle_Energy_GovernorHazardProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_homeFactsIn")
      val api_homeFactsIn = parseDrone_Lifecycle_Energy_GovernorHomeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readinessIn")
      val api_readinessIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_semanticsIn")
      val api_semanticsIn = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_touchdownFactsIn")
      val api_touchdownFactsIn = parseDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(api_airborneRequestIn, api_chargeEligibilityIn, api_hazardProposalIn, api_homeFactsIn, api_readinessIn, api_semanticsIn, api_touchdownFactsIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_phaseState")
      val In_phaseState = parseDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_airborneRequestIn")
      val api_airborneRequestIn = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeEligibilityIn")
      val api_chargeEligibilityIn = parseDrone_Lifecycle_Energy_GovernorChargeEligibility()
      parser.parseObjectNext()
      parser.parseObjectKey("api_hazardProposalIn")
      val api_hazardProposalIn = parseDrone_Lifecycle_Energy_GovernorHazardProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_homeFactsIn")
      val api_homeFactsIn = parseDrone_Lifecycle_Energy_GovernorHomeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readinessIn")
      val api_readinessIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_semanticsIn")
      val api_semanticsIn = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_touchdownFactsIn")
      val api_touchdownFactsIn = parseDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(In_phaseState, api_airborneRequestIn, api_chargeEligibilityIn, api_hazardProposalIn, api_homeFactsIn, api_readinessIn, api_semanticsIn, api_touchdownFactsIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_resolutionOut")
      val api_resolutionOut = parseDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(api_resolutionOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("phaseState")
      val phaseState = parseDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionOut")
      val api_resolutionOut = parseDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(phaseState, api_resolutionOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultsIn")
      val api_faultsIn = parseDrone_Lifecycle_Energy_GovernorFaultVector()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionIn")
      val api_resolutionIn = parseDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(api_batteryIn, api_faultsIn, api_resolutionIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultsIn")
      val api_faultsIn = parseDrone_Lifecycle_Energy_GovernorFaultVector()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionIn")
      val api_resolutionIn = parseDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(api_batteryIn, api_faultsIn, api_resolutionIn)
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_chargePermissionOut")
      val api_chargePermissionOut = parseDrone_Lifecycle_Energy_GovernorChargePermissionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlOut")
      val api_flightControlOut = parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotStatusOut")
      val api_pilotStatusOut = parseDrone_Lifecycle_Energy_GovernorPilotStatus()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsionPermissionOut")
      val api_propulsionPermissionOut = parseDrone_Lifecycle_Energy_GovernorPropulsionPermissionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(api_chargePermissionOut, api_flightControlOut, api_pilotStatusOut, api_propulsionPermissionOut)
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_chargePermissionOut")
      val api_chargePermissionOut = parseDrone_Lifecycle_Energy_GovernorChargePermissionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightControlOut")
      val api_flightControlOut = parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotStatusOut")
      val api_pilotStatusOut = parseDrone_Lifecycle_Energy_GovernorPilotStatus()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsionPermissionOut")
      val api_propulsionPermissionOut = parseDrone_Lifecycle_Energy_GovernorPropulsionPermissionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(api_chargePermissionOut, api_flightControlOut, api_pilotStatusOut, api_propulsionPermissionOut)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Drone_Lifecycle_Energy_Governor.HomeValue_Payload", "Drone_Lifecycle_Energy_Governor.HomeFacts_Payload", "Drone_Lifecycle_Energy_Governor.BatteryBand_Payload", "Drone_Lifecycle_Energy_Governor.FaultVector_Payload", "Drone_Lifecycle_Energy_Governor.PilotStatus_Payload", "Drone_Lifecycle_Energy_Governor.FlightIntent_Payload", "Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload", "Drone_Lifecycle_Energy_Governor.RequestResult_Payload", "Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload", "Drone_Lifecycle_Energy_Governor.RequestFamily_Payload", "Drone_Lifecycle_Energy_Governor.ChargerReport_Payload", "Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload", "Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload", "Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload", "Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload", "Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload", "Drone_Lifecycle_Energy_Governor.HazardProposal_Payload", "Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload", "Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload", "Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload", "Drone_Lifecycle_Energy_Governor.NavigationReport_Payload", "Drone_Lifecycle_Energy_Governor.ChargePermission_Payload", "Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload", "Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload", "Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload", "Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload", "Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload", "Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload", "Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload", "Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload", "Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload", "Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload", "Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload", "Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload", "Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload", "Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload", "Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P", "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS"))
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
        case "Drone_Lifecycle_Energy_Governor.HomeValue_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorHomeValue_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeFacts_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorHomeFacts_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryBand_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryBand_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultVector_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorFaultVector_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.PilotStatus_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorPilotStatus_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightIntent_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorFlightIntent_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorChargerFacts_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestResult_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorRequestResult_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryNotice_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestFamily_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorRequestFamily_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerReport_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorChargerReport_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorLifecycleCase_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownValue_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePhase_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorPublishedPhase_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownFacts_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.HazardProposal_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorHazardProposal_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidence_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorHomeReportValue_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorEvidenceValidity_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.NavigationReport_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorNavigationReport_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargePermission_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorChargePermission_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorLaunchPermission_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorLifecycleRequest_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorExactRequestCode_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidence_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibility_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryReportValue_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorFlightControlReport_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorLifecycleResolution_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorPropulsionPermission_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload" => val r = parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_PayloadT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
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

  def fromDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestFamily_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestFamily_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestFamily_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestFamily_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryBand_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryBand_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryBand_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryBand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerReport_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerReport_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerReport_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerReport_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerReport_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerReport_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.NavigationReport_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.NavigationReport_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorNavigationReport_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorNavigationReport_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeValue_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeValue_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeValue_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeValue_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeValue_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeValue_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o: Drone_Lifecycle_Energy_Governor.RequestResult_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestResult_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestResult_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestResult_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestResult_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestResult_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestResult_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargePermission_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargePermission_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargePermission_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargePermission_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargePermission_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargePermission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightIntent_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightIntent_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightIntent_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightIntent_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryReportValue(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryReportValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryReportValue(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryReportValue, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryReportValue(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryReportValue = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryReportValue _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidence(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidence(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidence, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidence(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidence = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidence _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerFacts(o: Drone_Lifecycle_Energy_Governor.ChargerFacts, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerFacts(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerFacts, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerFacts(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerFacts = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerFacts()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibility(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibility(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibility(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibility, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibility(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibility = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibility()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibility _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeFacts(o: Drone_Lifecycle_Energy_Governor.HomeFacts, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeFacts(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeFacts, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeFacts(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeFacts = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeFacts()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeFacts_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownFacts(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownFacts(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownFacts, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownFacts(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownFacts = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHazardProposal(o: Drone_Lifecycle_Energy_Governor.HazardProposal, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHazardProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHazardProposal(s: String): Either[Drone_Lifecycle_Energy_Governor.HazardProposal, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHazardProposal(parser: Parser): Drone_Lifecycle_Energy_Governor.HazardProposal = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHazardProposal()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHazardProposal _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.HazardProposal_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.HazardProposal_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHazardProposal_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHazardProposal_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultVector(o: Drone_Lifecycle_Energy_Governor.FaultVector, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultVector(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultVector, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultVector(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultVector = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultVector()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultVector _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o: Drone_Lifecycle_Energy_Governor.FaultVector_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultVector_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultVector_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultVector_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultVector_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultVector_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultVector_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryStateFacts(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryStateFacts, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryStateFacts(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryStateFacts = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryStateFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeReportValue(o: Drone_Lifecycle_Energy_Governor.HomeReportValue, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeReportValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeReportValue(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeReportValue, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeReportValue(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeReportValue = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeReportValue()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeReportValue _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownReportValue(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownReportValue, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownReportValue(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownReportValue = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownReportValue _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleResolution(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecycleResolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleResolution(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecycleResolution, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleResolution(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecycleResolution = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecycleResolution _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPilotStatus(o: Drone_Lifecycle_Energy_Governor.PilotStatus, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorPilotStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorPilotStatus(s: String): Either[Drone_Lifecycle_Energy_Governor.PilotStatus, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPilotStatus(parser: Parser): Drone_Lifecycle_Energy_Governor.PilotStatus = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorPilotStatus()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorPilotStatus _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.PilotStatus_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.PilotStatus_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorPilotStatus_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorPilotStatus_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightControlOutputs(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightControlOutputs, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightControlOutputs(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightControlOutputs = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightControlOutputs _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload _)
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

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS _)
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