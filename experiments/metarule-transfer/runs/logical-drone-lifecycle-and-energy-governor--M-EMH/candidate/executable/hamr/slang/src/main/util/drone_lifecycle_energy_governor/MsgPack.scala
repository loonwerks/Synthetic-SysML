// #Sireum
// @formatter:off

// This file is auto-generated from LifecycleRequest.scala, ExactRequestCode.scala, RequestFamily.scala, BatteryBand.scala, EvidenceValidity.scala, ChargerReport.scala, BatteryConfidence.scala, NavigationReport.scala, FlightControlReport.scala, HomeValue.scala, TouchdownValue.scala, AirborneRequestProposal.scala, LifecycleCase.scala, SourceLifecyclePhase.scala, LifecyclePhase.scala, PublishedPhase.scala, RequestResult.scala, BatteryNotice.scala, ChargePermission.scala, FlightIntent.scala, LaunchPermission.scala, PropulsionPermission.scala, AirborneClassifiedRequest.scala, LifecycleClassifiedRequest.scala, BatteryReportValue.scala, BatteryEvidence.scala, ChargerFacts.scala, ChargeEligibility.scala, HomeFacts.scala, TouchdownFacts.scala, HazardProposal.scala, FaultVector.scala, BatteryStateFacts.scala, HomeReportValue.scala, TouchdownReportValue.scala, LifecycleResolution.scala, PilotStatus.scala, FlightControlOutputs.scala, Base_Types.scala, RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_Containers.scala, BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_Containers.scala, ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_Containers.scala, ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_Containers.scala, FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala, HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_Containers.scala, TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_Containers.scala, BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_Containers.scala, AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_Containers.scala, AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_Containers.scala, FaultAggregationOwner_governorProcess_faultAggregationOwner_Containers.scala, LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_Containers.scala, OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_lifecycle_energy_governor

import org.sireum._

object MsgPack {

  object Constants {

    val Drone_Lifecycle_Energy_GovernorLifecycleRequest_Payload: Z = -32

    val Drone_Lifecycle_Energy_GovernorExactRequestCode_Payload: Z = -31

    val Drone_Lifecycle_Energy_GovernorRequestFamily_Payload: Z = -30

    val Drone_Lifecycle_Energy_GovernorBatteryBand_Payload: Z = -29

    val Drone_Lifecycle_Energy_GovernorEvidenceValidity_Payload: Z = -28

    val Drone_Lifecycle_Energy_GovernorChargerReport_Payload: Z = -27

    val Drone_Lifecycle_Energy_GovernorBatteryConfidence_Payload: Z = -26

    val Drone_Lifecycle_Energy_GovernorNavigationReport_Payload: Z = -25

    val Drone_Lifecycle_Energy_GovernorFlightControlReport_Payload: Z = -24

    val Drone_Lifecycle_Energy_GovernorHomeValue_Payload: Z = -23

    val Drone_Lifecycle_Energy_GovernorTouchdownValue_Payload: Z = -22

    val Drone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload: Z = -21

    val Drone_Lifecycle_Energy_GovernorLifecycleCase_Payload: Z = -20

    val Drone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload: Z = -19

    val Drone_Lifecycle_Energy_GovernorLifecyclePhase_Payload: Z = -18

    val Drone_Lifecycle_Energy_GovernorPublishedPhase_Payload: Z = -17

    val Drone_Lifecycle_Energy_GovernorRequestResult_Payload: Z = -16

    val Drone_Lifecycle_Energy_GovernorBatteryNotice_Payload: Z = -15

    val Drone_Lifecycle_Energy_GovernorChargePermission_Payload: Z = -14

    val Drone_Lifecycle_Energy_GovernorFlightIntent_Payload: Z = -13

    val Drone_Lifecycle_Energy_GovernorLaunchPermission_Payload: Z = -12

    val Drone_Lifecycle_Energy_GovernorPropulsionPermission_Payload: Z = -11

    val Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest: Z = -10

    val Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload: Z = -9

    val Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest: Z = -8

    val Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload: Z = -7

    val Drone_Lifecycle_Energy_GovernorBatteryReportValue: Z = -6

    val Drone_Lifecycle_Energy_GovernorBatteryReportValue_Payload: Z = -5

    val Drone_Lifecycle_Energy_GovernorBatteryEvidence: Z = -4

    val Drone_Lifecycle_Energy_GovernorBatteryEvidence_Payload: Z = -3

    val Drone_Lifecycle_Energy_GovernorChargerFacts: Z = -2

    val Drone_Lifecycle_Energy_GovernorChargerFacts_Payload: Z = -1

    val Drone_Lifecycle_Energy_GovernorChargeEligibility: Z = 0

    val Drone_Lifecycle_Energy_GovernorChargeEligibility_Payload: Z = 1

    val Drone_Lifecycle_Energy_GovernorHomeFacts: Z = 2

    val Drone_Lifecycle_Energy_GovernorHomeFacts_Payload: Z = 3

    val Drone_Lifecycle_Energy_GovernorTouchdownFacts: Z = 4

    val Drone_Lifecycle_Energy_GovernorTouchdownFacts_Payload: Z = 5

    val Drone_Lifecycle_Energy_GovernorHazardProposal: Z = 6

    val Drone_Lifecycle_Energy_GovernorHazardProposal_Payload: Z = 7

    val Drone_Lifecycle_Energy_GovernorFaultVector: Z = 8

    val Drone_Lifecycle_Energy_GovernorFaultVector_Payload: Z = 9

    val Drone_Lifecycle_Energy_GovernorBatteryStateFacts: Z = 10

    val Drone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload: Z = 11

    val Drone_Lifecycle_Energy_GovernorHomeReportValue: Z = 12

    val Drone_Lifecycle_Energy_GovernorHomeReportValue_Payload: Z = 13

    val Drone_Lifecycle_Energy_GovernorTouchdownReportValue: Z = 14

    val Drone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload: Z = 15

    val Drone_Lifecycle_Energy_GovernorLifecycleResolution: Z = 16

    val Drone_Lifecycle_Energy_GovernorLifecycleResolution_Payload: Z = 17

    val Drone_Lifecycle_Energy_GovernorPilotStatus: Z = 18

    val Drone_Lifecycle_Energy_GovernorPilotStatus_Payload: Z = 19

    val Drone_Lifecycle_Energy_GovernorFlightControlOutputs: Z = 20

    val Drone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload: Z = 21

    val Base_TypesBoolean_Payload: Z = 22

    val Base_TypesInteger_Payload: Z = 23

    val Base_TypesInteger_8_Payload: Z = 24

    val Base_TypesInteger_16_Payload: Z = 25

    val Base_TypesInteger_32_Payload: Z = 26

    val Base_TypesInteger_64_Payload: Z = 27

    val Base_TypesUnsigned_8_Payload: Z = 28

    val Base_TypesUnsigned_16_Payload: Z = 29

    val Base_TypesUnsigned_32_Payload: Z = 30

    val Base_TypesUnsigned_64_Payload: Z = 31

    val Base_TypesFloat_Payload: Z = 32

    val Base_TypesFloat_32_Payload: Z = 33

    val Base_TypesFloat_64_Payload: Z = 34

    val Base_TypesCharacter_Payload: Z = 35

    val Base_TypesString_Payload: Z = 36

    val Base_TypesBits_Payload: Z = 37

    val Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P: Z = 38

    val Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS: Z = 39

    val Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P: Z = 40

    val Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS: Z = 41

    val Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P: Z = 42

    val Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS: Z = 43

    val Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P: Z = 44

    val Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS: Z = 45

    val Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P: Z = 46

    val Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS: Z = 47

    val Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P: Z = 48

    val Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS: Z = 49

    val Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P: Z = 50

    val Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS: Z = 51

    val Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P: Z = 52

    val Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS: Z = 53

    val Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P: Z = 54

    val Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS: Z = 55

    val Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P: Z = 56

    val Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS: Z = 57

    val Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P: Z = 58

    val Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS: Z = 59

    val Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P: Z = 60

    val Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS: Z = 61

    val Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P: Z = 62

    val Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS: Z = 63

    val Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P: Z = 64

    val Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS: Z = 65

    val Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P: Z = 66

    val Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS: Z = 67

    val Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P: Z = 68

    val Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS: Z = 69

    val Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P: Z = 70

    val Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS: Z = 71

    val Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P: Z = 72

    val Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS: Z = 73

    val Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P: Z = 74

    val Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS: Z = 75

    val Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P: Z = 76

    val Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS: Z = 77

    val Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P: Z = 78

    val Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS: Z = 79

    val Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P: Z = 80

    val Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS: Z = 81

    val Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P: Z = 82

    val Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS: Z = 83

    val Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P: Z = 84

    val Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS: Z = 85

    val Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P: Z = 86

    val Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS: Z = 87

    val Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P: Z = 88

    val Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS: Z = 89

    val utilEmptyContainer: Z = 90

    val _artEmpty: Z = 91

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o: Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleRequest_Payload)
      writeDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o: Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorExactRequestCode_Payload)
      writeDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestFamilyType(o: Drone_Lifecycle_Energy_Governor.RequestFamily.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorRequestFamily_Payload)
      writeDrone_Lifecycle_Energy_GovernorRequestFamilyType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryBandType(o: Drone_Lifecycle_Energy_Governor.BatteryBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryBand_Payload)
      writeDrone_Lifecycle_Energy_GovernorBatteryBandType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o: Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorEvidenceValidity_Payload)
      writeDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerReportType(o: Drone_Lifecycle_Energy_Governor.ChargerReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargerReport_Payload)
      writeDrone_Lifecycle_Energy_GovernorChargerReportType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidence_Payload)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o: Drone_Lifecycle_Energy_Governor.NavigationReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorNavigationReport_Payload)
      writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o: Drone_Lifecycle_Energy_Governor.FlightControlReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightControlReport_Payload)
      writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeValueType(o: Drone_Lifecycle_Energy_Governor.HomeValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeValue_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeValue_Payload)
      writeDrone_Lifecycle_Energy_GovernorHomeValueType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownValueType(o: Drone_Lifecycle_Energy_Governor.TouchdownValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownValue_Payload)
      writeDrone_Lifecycle_Energy_GovernorTouchdownValueType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload)
      writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecycleCaseType(o: Drone_Lifecycle_Energy_Governor.LifecycleCase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleCase_Payload)
      writeDrone_Lifecycle_Energy_GovernorLifecycleCaseType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload)
      writeDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePhase_Payload)
      writeDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorPublishedPhaseType(o: Drone_Lifecycle_Energy_Governor.PublishedPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorPublishedPhase_Payload)
      writeDrone_Lifecycle_Energy_GovernorPublishedPhaseType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestResultType(o: Drone_Lifecycle_Energy_Governor.RequestResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o: Drone_Lifecycle_Energy_Governor.RequestResult_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorRequestResult_Payload)
      writeDrone_Lifecycle_Energy_GovernorRequestResultType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryNoticeType(o: Drone_Lifecycle_Energy_Governor.BatteryNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryNotice_Payload)
      writeDrone_Lifecycle_Energy_GovernorBatteryNoticeType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargePermissionType(o: Drone_Lifecycle_Energy_Governor.ChargePermission.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargePermission_Payload)
      writeDrone_Lifecycle_Energy_GovernorChargePermissionType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightIntentType(o: Drone_Lifecycle_Energy_Governor.FlightIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightIntent_Payload)
      writeDrone_Lifecycle_Energy_GovernorFlightIntentType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorLaunchPermissionType(o: Drone_Lifecycle_Energy_Governor.LaunchPermission.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLaunchPermission_Payload)
      writeDrone_Lifecycle_Energy_GovernorLaunchPermissionType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o: Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorPropulsionPermission_Payload)
      writeDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest)
      writeDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o.intentCode)
      writeDrone_Lifecycle_Energy_GovernorRequestFamilyType(o.requestFamily)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload)
      writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest)
      writeDrone_Lifecycle_Energy_GovernorExactRequestCodeType(o.intentCode)
      writeDrone_Lifecycle_Energy_GovernorRequestFamilyType(o.requestFamily)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload)
      writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryReportValue(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryReportValue)
      writeDrone_Lifecycle_Energy_GovernorBatteryBandType(o.band)
      writeDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.validity)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryReportValue_Payload)
      writeDrone_Lifecycle_Energy_GovernorBatteryReportValue(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidence(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidence)
      writeDrone_Lifecycle_Energy_GovernorBatteryBandType(o.band)
      writer.writeB(o.validBand)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidence_Payload)
      writeDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerFacts(o: Drone_Lifecycle_Energy_Governor.ChargerFacts): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargerFacts)
      writer.writeB(o.connected)
      writer.writeB(o.healthyConnected)
      writer.writeB(o.chargerFault)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargerFacts_Payload)
      writeDrone_Lifecycle_Energy_GovernorChargerFacts(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibility(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibility)
      writer.writeB(o.entryEligible)
      writer.writeB(o.retentionEligible)
      writer.writeB(o.exitRequired)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibility_Payload)
      writeDrone_Lifecycle_Energy_GovernorChargeEligibility(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeFacts(o: Drone_Lifecycle_Energy_Governor.HomeFacts): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeFacts)
      writer.writeB(o.arrivalEstablished)
      writer.writeB(o.evidenceValid)
      writer.writeB(o.homeFault)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeFacts_Payload)
      writeDrone_Lifecycle_Energy_GovernorHomeFacts(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownFacts(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownFacts)
      writer.writeB(o.touchdownEstablished)
      writer.writeB(o.evidenceValid)
      writer.writeB(o.touchdownFault)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownFacts_Payload)
      writeDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorHazardProposal(o: Drone_Lifecycle_Energy_Governor.HazardProposal): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHazardProposal)
      writer.writeB(o.emergencyLand)
      writer.writeB(o.forcedReturn)
      writer.writeB(o.batteryUnusable)
      writer.writeB(o.lowOrCritical)
      writer.writeB(o.navigationUnusable)
    }

    def writeDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHazardProposal_Payload)
      writeDrone_Lifecycle_Energy_GovernorHazardProposal(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultVector(o: Drone_Lifecycle_Energy_Governor.FaultVector): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFaultVector)
      writer.writeB(o.batteryFault)
      writer.writeB(o.chargerFault)
      writer.writeB(o.navigationFault)
      writer.writeB(o.flightControlFault)
      writer.writeB(o.homeFault)
      writer.writeB(o.touchdownFault)
      writer.writeB(o.aggregateFault)
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o: Drone_Lifecycle_Energy_Governor.FaultVector_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFaultVector_Payload)
      writeDrone_Lifecycle_Energy_GovernorFaultVector(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryStateFacts)
      writeDrone_Lifecycle_Energy_GovernorBatteryBandType(o.band)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.confidence)
      writer.writeB(o.usable)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeReportValue(o: Drone_Lifecycle_Energy_Governor.HomeReportValue): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeReportValue)
      writeDrone_Lifecycle_Energy_GovernorHomeValueType(o.homeValue)
      writeDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.validity)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeReportValue_Payload)
      writeDrone_Lifecycle_Energy_GovernorHomeReportValue(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownReportValue)
      writeDrone_Lifecycle_Energy_GovernorTouchdownValueType(o.touchdownValue)
      writeDrone_Lifecycle_Energy_GovernorEvidenceValidityType(o.validity)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload)
      writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecycleResolution(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleResolution)
      writeDrone_Lifecycle_Energy_GovernorLifecycleCaseType(o.winningCase)
      writeDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(o.sourceLifecycleState)
      writeDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.nextPhase)
      writer.writeB(o.requestPresent)
      writer.writeB(o.requestApplicable)
      writer.writeB(o.requestCausedTransition)
      writer.writeB(o.requestDefeatedByPriority)
      writer.writeB(o.chargeRetentionEligible)
      writer.writeB(o.launchReady)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleResolution_Payload)
      writeDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorPilotStatus(o: Drone_Lifecycle_Energy_Governor.PilotStatus): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorPilotStatus)
      writeDrone_Lifecycle_Energy_GovernorPublishedPhaseType(o.phase)
      writeDrone_Lifecycle_Energy_GovernorRequestResultType(o.requestResult)
      writeDrone_Lifecycle_Energy_GovernorBatteryNoticeType(o.batteryNotice)
      writer.writeB(o.batteryFault)
      writer.writeB(o.chargerFault)
      writer.writeB(o.navigationFault)
      writer.writeB(o.flightControlFault)
      writer.writeB(o.homeFault)
      writer.writeB(o.touchdownFault)
      writer.writeB(o.aggregateFault)
    }

    def writeDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorPilotStatus_Payload)
      writeDrone_Lifecycle_Energy_GovernorPilotStatus(o.value)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightControlOutputs)
      writeDrone_Lifecycle_Energy_GovernorFlightIntentType(o.intent)
      writeDrone_Lifecycle_Energy_GovernorLaunchPermissionType(o.launchPermission)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload)
      writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o.api_requestIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorLifecycleRequestType(o.api_requestIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsToAirborne)
      writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsToLifecycle)
    }

    def writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsToAirborne)
      writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsToLifecycle)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryReportValue(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryReportValue(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorChargerReportType(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorChargerReportType(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_factsToCharge)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_factsToCharge)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_chargerIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorChargerFacts(o.api_chargerIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_eligibilityOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_eligibilityOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)
      writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)
      writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P)
      writer.writeB(o.api_readinessOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS)
      writer.writeB(o.api_readinessOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorHomeReportValue(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorHomeReportValue(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_factsToLifecycle)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_factsToLifecycle)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o.api_reportIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_factsToLifecycle)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_factsToLifecycle)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.In_confidenceState)
      writeDrone_Lifecycle_Energy_GovernorBatteryEvidence(o.api_evidenceIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceToFault)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToCharge)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToComposition)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToHazard)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToReadiness)
    }

    def writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.confidenceState)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceToFault)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToCharge)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToComposition)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToHazard)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_stateToReadiness)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)
      writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)
      writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_proposalOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_proposalOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o.api_semanticsIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_proposalOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_proposalOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P)
      writer.writeB(o.api_chargerFaultIn)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceIn)
      writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)
      writer.writeB(o.api_homeFaultIn)
      writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)
      writer.writeB(o.api_touchdownFaultIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS)
      writer.writeB(o.api_chargerFaultIn)
      writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(o.api_confidenceIn)
      writeDrone_Lifecycle_Energy_GovernorFlightControlReportType(o.api_flightControlIn)
      writer.writeB(o.api_homeFaultIn)
      writeDrone_Lifecycle_Energy_GovernorNavigationReportType(o.api_navigationIn)
      writer.writeB(o.api_touchdownFaultIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_airborneRequestIn)
      writeDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_chargeEligibilityIn)
      writeDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_hazardProposalIn)
      writeDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_homeFactsIn)
      writer.writeB(o.api_readinessIn)
      writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsIn)
      writeDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_touchdownFactsIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.In_phaseState)
      writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(o.api_airborneRequestIn)
      writeDrone_Lifecycle_Energy_GovernorChargeEligibility(o.api_chargeEligibilityIn)
      writeDrone_Lifecycle_Energy_GovernorHazardProposal(o.api_hazardProposalIn)
      writeDrone_Lifecycle_Energy_GovernorHomeFacts(o.api_homeFactsIn)
      writer.writeB(o.api_readinessIn)
      writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o.api_semanticsIn)
      writeDrone_Lifecycle_Energy_GovernorTouchdownFacts(o.api_touchdownFactsIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(o.phaseState)
      writeDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsIn)
      writeDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Lifecycle_Energy_GovernorFaultVector(o.api_faultsIn)
      writeDrone_Lifecycle_Energy_GovernorLifecycleResolution(o.api_resolutionIn)
    }

    def writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P)
      writeDrone_Lifecycle_Energy_GovernorChargePermissionType(o.api_chargePermissionOut)
      writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o.api_flightControlOut)
      writeDrone_Lifecycle_Energy_GovernorPilotStatus(o.api_pilotStatusOut)
      writeDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o.api_propulsionPermissionOut)
    }

    def writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS)
      writeDrone_Lifecycle_Energy_GovernorChargePermissionType(o.api_chargePermissionOut)
      writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o.api_flightControlOut)
      writeDrone_Lifecycle_Energy_GovernorPilotStatus(o.api_pilotStatusOut)
      writeDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(o.api_propulsionPermissionOut)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeValue_Payload => writeDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload => writeDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload => writeDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultVector_Payload => writeDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload => writeDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload => writeDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload => writeDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestResult_Payload => writeDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload => writeDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload => writeDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload => writeDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload => writeDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload => writeDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload => writeDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload => writeDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload => writeDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload => writeDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload => writeDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload => writeDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload => writeDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload => writeDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload => writeDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload => writeDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload => writeDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload => writeDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload => writeDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload => writeDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload => writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload => writeDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload => writeDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload => writeDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload => writeDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload => writeDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload => writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload => writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload => writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload => writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readDrone_Lifecycle_Energy_GovernorLifecycleRequestType(): Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.LifecycleRequest.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecycleRequest_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleRequest_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorLifecycleRequestType()
      return Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorExactRequestCodeType(): Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.ExactRequestCode.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(): Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorExactRequestCode_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorExactRequestCode_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorExactRequestCode_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorExactRequestCodeType()
      return Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorRequestFamilyType(): Drone_Lifecycle_Energy_Governor.RequestFamily.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.RequestFamily.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(): Drone_Lifecycle_Energy_Governor.RequestFamily_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorRequestFamily_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorRequestFamily_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestFamily_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorRequestFamily_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorRequestFamilyType()
      return Drone_Lifecycle_Energy_Governor.RequestFamily_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryBandType(): Drone_Lifecycle_Energy_Governor.BatteryBand.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.BatteryBand.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(): Drone_Lifecycle_Energy_Governor.BatteryBand_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryBand_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryBand_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryBand_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorBatteryBandType()
      return Drone_Lifecycle_Energy_Governor.BatteryBand_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorEvidenceValidityType(): Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.EvidenceValidity.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(): Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorEvidenceValidity_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorEvidenceValidity_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorEvidenceValidity_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      return Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorChargerReportType(): Drone_Lifecycle_Energy_Governor.ChargerReport.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.ChargerReport.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorChargerReport_Payload(): Drone_Lifecycle_Energy_Governor.ChargerReport_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorChargerReport_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargerReport_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargerReport_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorChargerReportType()
      return Drone_Lifecycle_Energy_Governor.ChargerReport_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType(): Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidence.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(): Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidence_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidence_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidence_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorNavigationReportType(): Drone_Lifecycle_Energy_Governor.NavigationReport.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.NavigationReport.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(): Drone_Lifecycle_Energy_Governor.NavigationReport_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorNavigationReport_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorNavigationReport_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.NavigationReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorNavigationReport_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorNavigationReportType()
      return Drone_Lifecycle_Energy_Governor.NavigationReport_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightControlReportType(): Drone_Lifecycle_Energy_Governor.FlightControlReport.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.FlightControlReport.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(): Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightControlReport_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightControlReport_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightControlReport_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      return Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeValueType(): Drone_Lifecycle_Energy_Governor.HomeValue.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.HomeValue.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorHomeValue_Payload(): Drone_Lifecycle_Energy_Governor.HomeValue_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeValue_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeValue_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorHomeValueType()
      return Drone_Lifecycle_Energy_Governor.HomeValue_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownValueType(): Drone_Lifecycle_Energy_Governor.TouchdownValue.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.TouchdownValue.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(): Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownValue_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownValue_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorTouchdownValueType()
      return Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleCaseType(): Drone_Lifecycle_Energy_Governor.LifecycleCase.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.LifecycleCase.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecycleCase_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleCase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleCase_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorLifecycleCaseType()
      return Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType()
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePhaseType(): Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.LifecyclePhase.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(): Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecyclePhase_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePhase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePhase_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      return Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorPublishedPhaseType(): Drone_Lifecycle_Energy_Governor.PublishedPhase.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.PublishedPhase.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(): Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorPublishedPhase_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorPublishedPhase_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorPublishedPhase_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorPublishedPhaseType()
      return Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorRequestResultType(): Drone_Lifecycle_Energy_Governor.RequestResult.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.RequestResult.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorRequestResult_Payload(): Drone_Lifecycle_Energy_Governor.RequestResult_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorRequestResult_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorRequestResult_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorRequestResult_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorRequestResultType()
      return Drone_Lifecycle_Energy_Governor.RequestResult_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryNoticeType(): Drone_Lifecycle_Energy_Governor.BatteryNotice.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.BatteryNotice.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(): Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryNotice_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryNotice_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryNotice_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorBatteryNoticeType()
      return Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorChargePermissionType(): Drone_Lifecycle_Energy_Governor.ChargePermission.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.ChargePermission.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorChargePermission_Payload(): Drone_Lifecycle_Energy_Governor.ChargePermission_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorChargePermission_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargePermission_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargePermission_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargePermission_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorChargePermissionType()
      return Drone_Lifecycle_Energy_Governor.ChargePermission_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightIntentType(): Drone_Lifecycle_Energy_Governor.FlightIntent.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.FlightIntent.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(): Drone_Lifecycle_Energy_Governor.FlightIntent_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightIntent_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightIntent_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightIntent_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorFlightIntentType()
      return Drone_Lifecycle_Energy_Governor.FlightIntent_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorLaunchPermissionType(): Drone_Lifecycle_Energy_Governor.LaunchPermission.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.LaunchPermission.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(): Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorLaunchPermission_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLaunchPermission_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLaunchPermission_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorLaunchPermissionType()
      return Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorPropulsionPermissionType(): Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Energy_Governor.PropulsionPermission.byOrdinal(r).get
    }

    def readDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(): Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorPropulsionPermission_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorPropulsionPermission_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorPropulsionPermission_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorPropulsionPermissionType()
      return Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequestT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequestT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest)
      }
      val intentCode = readDrone_Lifecycle_Energy_GovernorExactRequestCodeType()
      val requestFamily = readDrone_Lifecycle_Energy_GovernorRequestFamilyType()
      return Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest(intentCode, requestFamily)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      return Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequestT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequestT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest)
      }
      val intentCode = readDrone_Lifecycle_Energy_GovernorExactRequestCodeType()
      val requestFamily = readDrone_Lifecycle_Energy_GovernorRequestFamilyType()
      return Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest(intentCode, requestFamily)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      return Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryReportValue(): Drone_Lifecycle_Energy_Governor.BatteryReportValue = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryReportValueT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryReportValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryReportValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryReportValue)
      }
      val band = readDrone_Lifecycle_Energy_GovernorBatteryBandType()
      val validity = readDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      return Drone_Lifecycle_Energy_Governor.BatteryReportValue(band, validity)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(): Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryReportValue_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryReportValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryReportValue_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      return Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidence(): Drone_Lifecycle_Energy_Governor.BatteryEvidence = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidence)
      }
      val band = readDrone_Lifecycle_Energy_GovernorBatteryBandType()
      val validBand = reader.readB()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidence(band, validBand)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(): Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidence_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidence_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidence_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorChargerFacts(): Drone_Lifecycle_Energy_Governor.ChargerFacts = {
      val r = readDrone_Lifecycle_Energy_GovernorChargerFactsT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargerFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargerFacts)
      }
      val connected = reader.readB()
      val healthyConnected = reader.readB()
      val chargerFault = reader.readB()
      return Drone_Lifecycle_Energy_Governor.ChargerFacts(connected, healthyConnected, chargerFault)
    }

    def readDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(): Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorChargerFacts_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargerFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargerFacts_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorChargerFacts()
      return Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibility(): Drone_Lifecycle_Energy_Governor.ChargeEligibility = {
      val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibility = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibility)
      }
      val entryEligible = reader.readB()
      val retentionEligible = reader.readB()
      val exitRequired = reader.readB()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible, retentionEligible, exitRequired)
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(): Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorChargeEligibility_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibility_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibility_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorChargeEligibility()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeFacts(): Drone_Lifecycle_Energy_Governor.HomeFacts = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeFactsT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeFacts)
      }
      val arrivalEstablished = reader.readB()
      val evidenceValid = reader.readB()
      val homeFault = reader.readB()
      return Drone_Lifecycle_Energy_Governor.HomeFacts(arrivalEstablished, evidenceValid, homeFault)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(): Drone_Lifecycle_Energy_Governor.HomeFacts_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeFacts_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeFacts_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorHomeFacts()
      return Drone_Lifecycle_Energy_Governor.HomeFacts_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownFacts(): Drone_Lifecycle_Energy_Governor.TouchdownFacts = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownFactsT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownFacts)
      }
      val touchdownEstablished = reader.readB()
      val evidenceValid = reader.readB()
      val touchdownFault = reader.readB()
      return Drone_Lifecycle_Energy_Governor.TouchdownFacts(touchdownEstablished, evidenceValid, touchdownFault)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(): Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownFacts_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownFacts_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      return Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorHazardProposal(): Drone_Lifecycle_Energy_Governor.HazardProposal = {
      val r = readDrone_Lifecycle_Energy_GovernorHazardProposalT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHazardProposalT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HazardProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHazardProposal)
      }
      val emergencyLand = reader.readB()
      val forcedReturn = reader.readB()
      val batteryUnusable = reader.readB()
      val lowOrCritical = reader.readB()
      val navigationUnusable = reader.readB()
      return Drone_Lifecycle_Energy_Governor.HazardProposal(emergencyLand, forcedReturn, batteryUnusable, lowOrCritical, navigationUnusable)
    }

    def readDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(): Drone_Lifecycle_Energy_Governor.HazardProposal_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorHazardProposal_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHazardProposal_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HazardProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHazardProposal_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorHazardProposal()
      return Drone_Lifecycle_Energy_Governor.HazardProposal_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorFaultVector(): Drone_Lifecycle_Energy_Governor.FaultVector = {
      val r = readDrone_Lifecycle_Energy_GovernorFaultVectorT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFaultVectorT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFaultVector)
      }
      val batteryFault = reader.readB()
      val chargerFault = reader.readB()
      val navigationFault = reader.readB()
      val flightControlFault = reader.readB()
      val homeFault = reader.readB()
      val touchdownFault = reader.readB()
      val aggregateFault = reader.readB()
      return Drone_Lifecycle_Energy_Governor.FaultVector(batteryFault, chargerFault, navigationFault, flightControlFault, homeFault, touchdownFault, aggregateFault)
    }

    def readDrone_Lifecycle_Energy_GovernorFaultVector_Payload(): Drone_Lifecycle_Energy_Governor.FaultVector_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorFaultVector_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFaultVector_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultVector_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFaultVector_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorFaultVector()
      return Drone_Lifecycle_Energy_Governor.FaultVector_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryStateFacts(): Drone_Lifecycle_Energy_Governor.BatteryStateFacts = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryStateFactsT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryStateFactsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryStateFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryStateFacts)
      }
      val band = readDrone_Lifecycle_Energy_GovernorBatteryBandType()
      val confidence = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      val usable = reader.readB()
      return Drone_Lifecycle_Energy_Governor.BatteryStateFacts(band, confidence, usable)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(): Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryStateFacts_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      return Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeReportValue(): Drone_Lifecycle_Energy_Governor.HomeReportValue = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeReportValueT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeReportValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeReportValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeReportValue)
      }
      val homeValue = readDrone_Lifecycle_Energy_GovernorHomeValueType()
      val validity = readDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      return Drone_Lifecycle_Energy_Governor.HomeReportValue(homeValue, validity)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(): Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeReportValue_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeReportValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeReportValue_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorHomeReportValue()
      return Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownReportValue(): Drone_Lifecycle_Energy_Governor.TouchdownReportValue = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownReportValueT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownReportValueT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownReportValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownReportValue)
      }
      val touchdownValue = readDrone_Lifecycle_Energy_GovernorTouchdownValueType()
      val validity = readDrone_Lifecycle_Energy_GovernorEvidenceValidityType()
      return Drone_Lifecycle_Energy_Governor.TouchdownReportValue(touchdownValue, validity)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(): Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownReportValue_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownReportValue_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      return Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleResolution(): Drone_Lifecycle_Energy_Governor.LifecycleResolution = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecycleResolutionT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleResolutionT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleResolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleResolution)
      }
      val winningCase = readDrone_Lifecycle_Energy_GovernorLifecycleCaseType()
      val sourceLifecycleState = readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType()
      val nextPhase = readDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      val requestPresent = reader.readB()
      val requestApplicable = reader.readB()
      val requestCausedTransition = reader.readB()
      val requestDefeatedByPriority = reader.readB()
      val chargeRetentionEligible = reader.readB()
      val launchReady = reader.readB()
      return Drone_Lifecycle_Energy_Governor.LifecycleResolution(winningCase, sourceLifecycleState, nextPhase, requestPresent, requestApplicable, requestCausedTransition, requestDefeatedByPriority, chargeRetentionEligible, launchReady)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(): Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecycleResolution_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecycleResolution_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecycleResolution_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      return Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorPilotStatus(): Drone_Lifecycle_Energy_Governor.PilotStatus = {
      val r = readDrone_Lifecycle_Energy_GovernorPilotStatusT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorPilotStatusT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PilotStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorPilotStatus)
      }
      val phase = readDrone_Lifecycle_Energy_GovernorPublishedPhaseType()
      val requestResult = readDrone_Lifecycle_Energy_GovernorRequestResultType()
      val batteryNotice = readDrone_Lifecycle_Energy_GovernorBatteryNoticeType()
      val batteryFault = reader.readB()
      val chargerFault = reader.readB()
      val navigationFault = reader.readB()
      val flightControlFault = reader.readB()
      val homeFault = reader.readB()
      val touchdownFault = reader.readB()
      val aggregateFault = reader.readB()
      return Drone_Lifecycle_Energy_Governor.PilotStatus(phase, requestResult, batteryNotice, batteryFault, chargerFault, navigationFault, flightControlFault, homeFault, touchdownFault, aggregateFault)
    }

    def readDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(): Drone_Lifecycle_Energy_Governor.PilotStatus_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorPilotStatus_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorPilotStatus_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.PilotStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorPilotStatus_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorPilotStatus()
      return Drone_Lifecycle_Energy_Governor.PilotStatus_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightControlOutputs(): Drone_Lifecycle_Energy_Governor.FlightControlOutputs = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightControlOutputsT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightControlOutputsT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightControlOutputs = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightControlOutputs)
      }
      val intent = readDrone_Lifecycle_Energy_GovernorFlightIntentType()
      val launchPermission = readDrone_Lifecycle_Energy_GovernorLaunchPermissionType()
      return Drone_Lifecycle_Energy_Governor.FlightControlOutputs(intent, launchPermission)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(): Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightControlOutputs_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightControlOutputs_PayloadT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload)
      }
      val value = readDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      return Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P)
      }
      val api_requestIn = readDrone_Lifecycle_Energy_GovernorLifecycleRequestType()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(api_requestIn)
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS)
      }
      val api_requestIn = readDrone_Lifecycle_Energy_GovernorLifecycleRequestType()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(api_requestIn)
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P)
      }
      val api_semanticsToAirborne = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      val api_semanticsToLifecycle = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(api_semanticsToAirborne, api_semanticsToLifecycle)
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS)
      }
      val api_semanticsToAirborne = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      val api_semanticsToLifecycle = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      return Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(api_semanticsToAirborne, api_semanticsToLifecycle)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P)
      }
      val api_evidenceOut = readDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(api_evidenceOut)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS)
      }
      val api_evidenceOut = readDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      return Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_evidenceOut)
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorChargerReportType()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorChargerReportType()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P)
      }
      val api_factsToCharge = readDrone_Lifecycle_Energy_GovernorChargerFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(api_factsToCharge, api_faultToAggregation)
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS)
      }
      val api_factsToCharge = readDrone_Lifecycle_Energy_GovernorChargerFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(api_factsToCharge, api_faultToAggregation)
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_chargerIn = readDrone_Lifecycle_Energy_GovernorChargerFacts()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(api_batteryIn, api_chargerIn)
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_chargerIn = readDrone_Lifecycle_Energy_GovernorChargerFacts()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(api_batteryIn, api_chargerIn)
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P)
      }
      val api_eligibilityOut = readDrone_Lifecycle_Energy_GovernorChargeEligibility()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(api_eligibilityOut)
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS)
      }
      val api_eligibilityOut = readDrone_Lifecycle_Energy_GovernorChargeEligibility()
      return Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(api_eligibilityOut)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_flightControlIn = readDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      val api_navigationIn = readDrone_Lifecycle_Energy_GovernorNavigationReportType()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_flightControlIn = readDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      val api_navigationIn = readDrone_Lifecycle_Energy_GovernorNavigationReportType()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P)
      }
      val api_readinessOut = reader.readB()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(api_readinessOut)
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS)
      }
      val api_readinessOut = reader.readB()
      return Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(api_readinessOut)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorHomeReportValue()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorHomeReportValue()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P)
      }
      val api_factsToLifecycle = readDrone_Lifecycle_Energy_GovernorHomeFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(api_factsToLifecycle, api_faultToAggregation)
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS)
      }
      val api_factsToLifecycle = readDrone_Lifecycle_Energy_GovernorHomeFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(api_factsToLifecycle, api_faultToAggregation)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P)
      }
      val api_factsToLifecycle = readDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(api_factsToLifecycle, api_faultToAggregation)
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS)
      }
      val api_factsToLifecycle = readDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(api_factsToLifecycle, api_faultToAggregation)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P)
      }
      val api_evidenceIn = readDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(api_evidenceIn)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS)
      }
      val In_confidenceState = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      val api_evidenceIn = readDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(In_confidenceState, api_evidenceIn)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P)
      }
      val api_confidenceToFault = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      val api_stateToCharge = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_stateToComposition = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_stateToHazard = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_stateToReadiness = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(api_confidenceToFault, api_stateToCharge, api_stateToComposition, api_stateToHazard, api_stateToReadiness)
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS)
      }
      val confidenceState = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      val api_confidenceToFault = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      val api_stateToCharge = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_stateToComposition = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_stateToHazard = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_stateToReadiness = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      return Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(confidenceState, api_confidenceToFault, api_stateToCharge, api_stateToComposition, api_stateToHazard, api_stateToReadiness)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_flightControlIn = readDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      val api_navigationIn = readDrone_Lifecycle_Energy_GovernorNavigationReportType()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_flightControlIn = readDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      val api_navigationIn = readDrone_Lifecycle_Energy_GovernorNavigationReportType()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(api_batteryIn, api_flightControlIn, api_navigationIn)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P)
      }
      val api_proposalOut = readDrone_Lifecycle_Energy_GovernorHazardProposal()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(api_proposalOut)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS)
      }
      val api_proposalOut = readDrone_Lifecycle_Energy_GovernorHazardProposal()
      return Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(api_proposalOut)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P)
      }
      val api_semanticsIn = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(api_semanticsIn)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS)
      }
      val api_semanticsIn = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(api_semanticsIn)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P)
      }
      val api_proposalOut = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(api_proposalOut)
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS)
      }
      val api_proposalOut = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      return Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(api_proposalOut)
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P)
      }
      val api_chargerFaultIn = reader.readB()
      val api_confidenceIn = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      val api_flightControlIn = readDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      val api_homeFaultIn = reader.readB()
      val api_navigationIn = readDrone_Lifecycle_Energy_GovernorNavigationReportType()
      val api_touchdownFaultIn = reader.readB()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(api_chargerFaultIn, api_confidenceIn, api_flightControlIn, api_homeFaultIn, api_navigationIn, api_touchdownFaultIn)
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS)
      }
      val api_chargerFaultIn = reader.readB()
      val api_confidenceIn = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceType()
      val api_flightControlIn = readDrone_Lifecycle_Energy_GovernorFlightControlReportType()
      val api_homeFaultIn = reader.readB()
      val api_navigationIn = readDrone_Lifecycle_Energy_GovernorNavigationReportType()
      val api_touchdownFaultIn = reader.readB()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(api_chargerFaultIn, api_confidenceIn, api_flightControlIn, api_homeFaultIn, api_navigationIn, api_touchdownFaultIn)
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P)
      }
      val api_faultsOut = readDrone_Lifecycle_Energy_GovernorFaultVector()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(api_faultsOut)
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS)
      }
      val api_faultsOut = readDrone_Lifecycle_Energy_GovernorFaultVector()
      return Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(api_faultsOut)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P)
      }
      val api_airborneRequestIn = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      val api_chargeEligibilityIn = readDrone_Lifecycle_Energy_GovernorChargeEligibility()
      val api_hazardProposalIn = readDrone_Lifecycle_Energy_GovernorHazardProposal()
      val api_homeFactsIn = readDrone_Lifecycle_Energy_GovernorHomeFacts()
      val api_readinessIn = reader.readB()
      val api_semanticsIn = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      val api_touchdownFactsIn = readDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(api_airborneRequestIn, api_chargeEligibilityIn, api_hazardProposalIn, api_homeFactsIn, api_readinessIn, api_semanticsIn, api_touchdownFactsIn)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS)
      }
      val In_phaseState = readDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      val api_airborneRequestIn = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType()
      val api_chargeEligibilityIn = readDrone_Lifecycle_Energy_GovernorChargeEligibility()
      val api_hazardProposalIn = readDrone_Lifecycle_Energy_GovernorHazardProposal()
      val api_homeFactsIn = readDrone_Lifecycle_Energy_GovernorHomeFacts()
      val api_readinessIn = reader.readB()
      val api_semanticsIn = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      val api_touchdownFactsIn = readDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(In_phaseState, api_airborneRequestIn, api_chargeEligibilityIn, api_hazardProposalIn, api_homeFactsIn, api_readinessIn, api_semanticsIn, api_touchdownFactsIn)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P)
      }
      val api_resolutionOut = readDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(api_resolutionOut)
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS)
      }
      val phaseState = readDrone_Lifecycle_Energy_GovernorLifecyclePhaseType()
      val api_resolutionOut = readDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      return Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(phaseState, api_resolutionOut)
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_faultsIn = readDrone_Lifecycle_Energy_GovernorFaultVector()
      val api_resolutionIn = readDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(api_batteryIn, api_faultsIn, api_resolutionIn)
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS)
      }
      val api_batteryIn = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      val api_faultsIn = readDrone_Lifecycle_Energy_GovernorFaultVector()
      val api_resolutionIn = readDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(api_batteryIn, api_faultsIn, api_resolutionIn)
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container.")
          val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P)
      }
      val api_chargePermissionOut = readDrone_Lifecycle_Energy_GovernorChargePermissionType()
      val api_flightControlOut = readDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      val api_pilotStatusOut = readDrone_Lifecycle_Energy_GovernorPilotStatus()
      val api_propulsionPermissionOut = readDrone_Lifecycle_Energy_GovernorPropulsionPermissionType()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(api_chargePermissionOut, api_flightControlOut, api_pilotStatusOut, api_propulsionPermissionOut)
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS)
      }
      val api_chargePermissionOut = readDrone_Lifecycle_Energy_GovernorChargePermissionType()
      val api_flightControlOut = readDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      val api_pilotStatusOut = readDrone_Lifecycle_Energy_GovernorPilotStatus()
      val api_propulsionPermissionOut = readDrone_Lifecycle_Energy_GovernorPropulsionPermissionType()
      return Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(api_chargePermissionOut, api_flightControlOut, api_pilotStatusOut, api_propulsionPermissionOut)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeValue_Payload => val r = readDrone_Lifecycle_Energy_GovernorHomeValue_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeFacts_Payload => val r = readDrone_Lifecycle_Energy_GovernorHomeFacts_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryBand_Payload => val r = readDrone_Lifecycle_Energy_GovernorBatteryBand_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultVector_Payload => val r = readDrone_Lifecycle_Energy_GovernorFaultVector_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorPilotStatus_Payload => val r = readDrone_Lifecycle_Energy_GovernorPilotStatus_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightIntent_Payload => val r = readDrone_Lifecycle_Energy_GovernorFlightIntent_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerFacts_Payload => val r = readDrone_Lifecycle_Energy_GovernorChargerFacts_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestResult_Payload => val r = readDrone_Lifecycle_Energy_GovernorRequestResult_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryNotice_Payload => val r = readDrone_Lifecycle_Energy_GovernorBatteryNotice_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestFamily_Payload => val r = readDrone_Lifecycle_Energy_GovernorRequestFamily_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerReport_Payload => val r = readDrone_Lifecycle_Energy_GovernorChargerReport_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecycleCase_Payload => val r = readDrone_Lifecycle_Energy_GovernorLifecycleCase_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownValue_Payload => val r = readDrone_Lifecycle_Energy_GovernorTouchdownValue_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePhase_Payload => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePhase_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorPublishedPhase_Payload => val r = readDrone_Lifecycle_Energy_GovernorPublishedPhase_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownFacts_Payload => val r = readDrone_Lifecycle_Energy_GovernorTouchdownFacts_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHazardProposal_Payload => val r = readDrone_Lifecycle_Energy_GovernorHazardProposal_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidence_Payload => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidence_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeReportValue_Payload => val r = readDrone_Lifecycle_Energy_GovernorHomeReportValue_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorEvidenceValidity_Payload => val r = readDrone_Lifecycle_Energy_GovernorEvidenceValidity_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorNavigationReport_Payload => val r = readDrone_Lifecycle_Energy_GovernorNavigationReport_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargePermission_Payload => val r = readDrone_Lifecycle_Energy_GovernorChargePermission_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLaunchPermission_Payload => val r = readDrone_Lifecycle_Energy_GovernorLaunchPermission_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecycleRequest_Payload => val r = readDrone_Lifecycle_Energy_GovernorLifecycleRequest_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorExactRequestCode_Payload => val r = readDrone_Lifecycle_Energy_GovernorExactRequestCode_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidence_Payload => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidence_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibility_Payload => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibility_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload => val r = readDrone_Lifecycle_Energy_GovernorBatteryStateFacts_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryReportValue_Payload => val r = readDrone_Lifecycle_Energy_GovernorBatteryReportValue_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightControlReport_Payload => val r = readDrone_Lifecycle_Energy_GovernorFlightControlReport_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecycleResolution_Payload => val r = readDrone_Lifecycle_Energy_GovernorLifecycleResolution_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorPropulsionPermission_Payload => val r = readDrone_Lifecycle_Energy_GovernorPropulsionPermission_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload => val r = readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload => val r = readDrone_Lifecycle_Energy_GovernorFlightControlOutputs_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload => val r = readDrone_Lifecycle_Energy_GovernorTouchdownReportValue_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload => val r = readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload => val r = readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_PayloadT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestFamily_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestFamily_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestFamily_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestFamily_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestFamily_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryBand_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryBand_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryBand_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryBand_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryBand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerReport_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerReport_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerReport_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerReport_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerReport_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerReport_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerReport_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.NavigationReport_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorNavigationReport_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.NavigationReport_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorNavigationReport_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorNavigationReport_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeValue_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeValue_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeValue_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeValue_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeValue_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeValue_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o: Drone_Lifecycle_Energy_Governor.RequestResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestResult_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestResult_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestResult_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestResult_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestResult_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestResult_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestResult_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargePermission_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargePermission_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargePermission_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargePermission_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargePermission_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargePermission_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargePermission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightIntent_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightIntent_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightIntent_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightIntent_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightIntent_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryReportValue(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryReportValue(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryReportValue(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryReportValue, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryReportValue(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryReportValue = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryReportValue()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryReportValue _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidence(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidence(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidence(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidence, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidence(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidence = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidence()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidence _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerFacts(o: Drone_Lifecycle_Energy_Governor.ChargerFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerFacts(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerFacts(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerFacts, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerFacts(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerFacts = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerFacts()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerFacts_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibility(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibility(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibility(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibility, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibility(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibility = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibility()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibility _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeFacts(o: Drone_Lifecycle_Energy_Governor.HomeFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeFacts(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeFacts(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeFacts, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeFacts(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeFacts = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeFacts()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeFacts_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeFacts_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownFacts(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownFacts(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownFacts(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownFacts, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownFacts(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownFacts = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownFacts()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHazardProposal(o: Drone_Lifecycle_Energy_Governor.HazardProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHazardProposal(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHazardProposal(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HazardProposal, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHazardProposal(reader: Reader): Drone_Lifecycle_Energy_Governor.HazardProposal = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHazardProposal()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHazardProposal _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HazardProposal_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHazardProposal_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.HazardProposal_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHazardProposal_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHazardProposal_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultVector(o: Drone_Lifecycle_Energy_Governor.FaultVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultVector(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultVector(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultVector, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultVector(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultVector = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultVector()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultVector _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o: Drone_Lifecycle_Energy_Governor.FaultVector_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultVector_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultVector_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultVector_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultVector_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultVector_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultVector_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultVector_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryStateFacts(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryStateFacts, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryStateFacts(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryStateFacts = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryStateFacts()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryStateFacts _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeReportValue(o: Drone_Lifecycle_Energy_Governor.HomeReportValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeReportValue(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeReportValue(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeReportValue, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeReportValue(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeReportValue = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeReportValue()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeReportValue _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownReportValue(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownReportValue, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownReportValue(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownReportValue = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownReportValue()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownReportValue _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleResolution(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecycleResolution(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleResolution(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecycleResolution, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleResolution(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecycleResolution = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecycleResolution()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecycleResolution _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPilotStatus(o: Drone_Lifecycle_Energy_Governor.PilotStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorPilotStatus(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorPilotStatus(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.PilotStatus, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPilotStatus(reader: Reader): Drone_Lifecycle_Energy_Governor.PilotStatus = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorPilotStatus()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorPilotStatus _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.PilotStatus_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorPilotStatus_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.PilotStatus_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorPilotStatus_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorPilotStatus_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightControlOutputs(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightControlOutputs, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightControlOutputs(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightControlOutputs = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightControlOutputs()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightControlOutputs _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}