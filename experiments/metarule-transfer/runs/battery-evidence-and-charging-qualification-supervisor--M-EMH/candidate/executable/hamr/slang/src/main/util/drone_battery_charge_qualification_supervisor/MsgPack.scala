// #Sireum
// @formatter:off

// This file is auto-generated from ServiceRequest.scala, PilotAdvisory.scala, SourceChargeSession.scala, ChargeSession.scala, SessionCase.scala, RequestResult.scala, BatteryBand.scala, Validity.scala, QualifiedBand.scala, ChargerReport.scala, ChargeInterfaceReport.scala, LifecyclePhase.scala, BatteryConfidence.scala, ConfidenceCase.scala, ChargeEligibility.scala, AttentionState.scala, AttentionCause.scala, AttentionCase.scala, PilotNotice.scala, FlightControlNotice.scala, ChargeAuthorization.scala, ChargerFacts.scala, InterfaceFacts.scala, LifecycleFacts.scala, FaultVector.scala, AdvisoryFacts.scala, PublishedSession.scala, PublishedRequestResult.scala, BatteryReportValue.scala, BatteryQualification.scala, LifecycleReportValue.scala, BatteryStateFacts.scala, AttentionResolution.scala, FaultFacts.scala, SessionResolution.scala, PublicDecisionFacts.scala, PilotStatus.scala, Base_Types.scala, CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_Containers.scala, BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_Containers.scala, ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_Containers.scala, ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_Containers.scala, LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_Containers.scala, BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_Containers.scala, ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_Containers.scala, AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_Containers.scala, BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_Containers.scala, FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_Containers.scala, ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_Containers.scala, NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_Containers.scala, AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_battery_charge_qualification_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Drone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload: Z = -32

    val Drone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload: Z = -31

    val Drone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload: Z = -30

    val Drone_Battery_Charge_Qualification_SupervisorChargeSession_Payload: Z = -29

    val Drone_Battery_Charge_Qualification_SupervisorSessionCase_Payload: Z = -28

    val Drone_Battery_Charge_Qualification_SupervisorRequestResult_Payload: Z = -27

    val Drone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload: Z = -26

    val Drone_Battery_Charge_Qualification_SupervisorValidity_Payload: Z = -25

    val Drone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload: Z = -24

    val Drone_Battery_Charge_Qualification_SupervisorChargerReport_Payload: Z = -23

    val Drone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload: Z = -22

    val Drone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload: Z = -21

    val Drone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload: Z = -20

    val Drone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload: Z = -19

    val Drone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload: Z = -18

    val Drone_Battery_Charge_Qualification_SupervisorAttentionState_Payload: Z = -17

    val Drone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload: Z = -16

    val Drone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload: Z = -15

    val Drone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload: Z = -14

    val Drone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload: Z = -13

    val Drone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload: Z = -12

    val Drone_Battery_Charge_Qualification_SupervisorChargerFacts: Z = -11

    val Drone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload: Z = -10

    val Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts: Z = -9

    val Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload: Z = -8

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts: Z = -7

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload: Z = -6

    val Drone_Battery_Charge_Qualification_SupervisorFaultVector: Z = -5

    val Drone_Battery_Charge_Qualification_SupervisorFaultVector_Payload: Z = -4

    val Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts: Z = -3

    val Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload: Z = -2

    val Drone_Battery_Charge_Qualification_SupervisorPublishedSession: Z = -1

    val Drone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload: Z = 0

    val Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult: Z = 1

    val Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload: Z = 2

    val Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue: Z = 3

    val Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload: Z = 4

    val Drone_Battery_Charge_Qualification_SupervisorBatteryQualification: Z = 5

    val Drone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload: Z = 6

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue: Z = 7

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload: Z = 8

    val Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts: Z = 9

    val Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload: Z = 10

    val Drone_Battery_Charge_Qualification_SupervisorAttentionResolution: Z = 11

    val Drone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload: Z = 12

    val Drone_Battery_Charge_Qualification_SupervisorFaultFacts: Z = 13

    val Drone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload: Z = 14

    val Drone_Battery_Charge_Qualification_SupervisorSessionResolution: Z = 15

    val Drone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload: Z = 16

    val Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts: Z = 17

    val Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload: Z = 18

    val Drone_Battery_Charge_Qualification_SupervisorPilotStatus: Z = 19

    val Drone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload: Z = 20

    val Base_TypesBoolean_Payload: Z = 21

    val Base_TypesInteger_Payload: Z = 22

    val Base_TypesInteger_8_Payload: Z = 23

    val Base_TypesInteger_16_Payload: Z = 24

    val Base_TypesInteger_32_Payload: Z = 25

    val Base_TypesInteger_64_Payload: Z = 26

    val Base_TypesUnsigned_8_Payload: Z = 27

    val Base_TypesUnsigned_16_Payload: Z = 28

    val Base_TypesUnsigned_32_Payload: Z = 29

    val Base_TypesUnsigned_64_Payload: Z = 30

    val Base_TypesFloat_Payload: Z = 31

    val Base_TypesFloat_32_Payload: Z = 32

    val Base_TypesFloat_64_Payload: Z = 33

    val Base_TypesCharacter_Payload: Z = 34

    val Base_TypesString_Payload: Z = 35

    val Base_TypesBits_Payload: Z = 36

    val Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P: Z = 37

    val Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS: Z = 38

    val Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P: Z = 39

    val Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS: Z = 40

    val Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P: Z = 41

    val Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS: Z = 42

    val Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P: Z = 43

    val Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS: Z = 44

    val Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P: Z = 45

    val Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS: Z = 46

    val Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P: Z = 47

    val Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS: Z = 48

    val Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P: Z = 49

    val Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS: Z = 50

    val Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P: Z = 51

    val Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS: Z = 52

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P: Z = 53

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS: Z = 54

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P: Z = 55

    val Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS: Z = 56

    val Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P: Z = 57

    val Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS: Z = 58

    val Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P: Z = 59

    val Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS: Z = 60

    val Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P: Z = 61

    val Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS: Z = 62

    val Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P: Z = 63

    val Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS: Z = 64

    val Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P: Z = 65

    val Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS: Z = 66

    val Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P: Z = 67

    val Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS: Z = 68

    val Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P: Z = 69

    val Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS: Z = 70

    val Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P: Z = 71

    val Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS: Z = 72

    val Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P: Z = 73

    val Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS: Z = 74

    val Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P: Z = 75

    val Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS: Z = 76

    val Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P: Z = 77

    val Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS: Z = 78

    val Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P: Z = 79

    val Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS: Z = 80

    val Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P: Z = 81

    val Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS: Z = 82

    val Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P: Z = 83

    val Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS: Z = 84

    val Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P: Z = 85

    val Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS: Z = 86

    val Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P: Z = 87

    val Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS: Z = 88

    val utilEmptyContainer: Z = 89

    val _artEmpty: Z = 90

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSession_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSessionCase_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorRequestResultType(o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorRequestResult_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorRequestResultType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorValidityType(o: Drone_Battery_Charge_Qualification_Supervisor.Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorValidity_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorValidityType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerReport_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionState_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerFacts)
      writer.writeB(o.chargerUsable)
      writer.writeB(o.chargerConnected)
      writer.writeB(o.chargerFault)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts)
      writer.writeB(o.interfaceHealthy)
      writer.writeB(o.activityObserved)
      writer.writeB(o.interfaceFault)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts)
      writer.writeB(o.chargeContextAllowed)
      writer.writeB(o.airborneContext)
      writer.writeB(o.contextValid)
      writer.writeB(o.contextFault)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultVector(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultVector)
      writer.writeB(o.batteryFault)
      writer.writeB(o.chargerFault)
      writer.writeB(o.interfaceFault)
      writer.writeB(o.contextFault)
      writer.writeB(o.sessionConflict)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultVector_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultVector(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(o.advisoryValue)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedSession)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(o.sessionValue)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult)
      writeDrone_Battery_Charge_Qualification_SupervisorRequestResultType(o.requestResultValue)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(o.band)
      writeDrone_Battery_Charge_Qualification_SupervisorValidityType(o.validity)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryQualification)
      writer.writeB(o.validEvidence)
      writeDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o.band)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(o.phase)
      writeDrone_Battery_Charge_Qualification_SupervisorValidityType(o.validity)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(o.confidence)
      writeDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o.band)
      writer.writeB(o.chargeNeeded)
      writer.writeB(o.batteryUsable)
      writer.writeB(o.batteryFault)
      writeDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(o.winningCase)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionResolution)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(o.newAttention)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(o.cause)
      writer.writeB(o.attentionClearedNow)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(o.winningCase)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultFacts)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultVector(o.vector)
      writer.writeB(o.aggregateFault)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSessionResolution)
      writeDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(o.sourceSession)
      writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.newSession)
      writer.writeB(o.sessionConflict)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(o.winningCase)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts)
      writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.advisory)
      writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o.requestResult)
      writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.newSession)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.value)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotStatus)
      writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.statusAdvisory)
      writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.statusSession)
      writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o.statusRequestResult)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultVector(o.faults)
      writer.writeB(o.aggregateFault)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o.value)
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

    def writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryIn)
      writer.writeB(o.api_attentionClearedIn)
      writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryIn)
      writer.writeB(o.api_attentionClearedIn)
      writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsOut)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsOut)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationOut)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationOut)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_factsToEligibility)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_factsToEligibility)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToEligibility)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToSession)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToEligibility)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToSession)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o.api_reportIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToAdvisory)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToEligibility)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToAdvisory)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToEligibility)
      writer.writeB(o.api_faultToAggregation)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P)
      writer.writeB(o.api_faultToAggregation)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAdvisory)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAttention)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToEligibility)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS)
      writer.writeB(o.api_faultToAggregation)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAdvisory)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAttention)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToEligibility)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_chargerIn)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_chargerIn)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToAdvisory)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToSession)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToAdvisory)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToSession)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P)
      writer.writeB(o.api_clearedToRequestResult)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_resolutionToNotification)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS)
      writer.writeB(o.api_clearedToRequestResult)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_resolutionToNotification)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)
      writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryToRequestResult)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryToRequestResult)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P)
      writer.writeB(o.api_batteryFaultIn)
      writer.writeB(o.api_chargerFaultIn)
      writer.writeB(o.api_contextFaultIn)
      writer.writeB(o.api_interfaceFaultIn)
      writer.writeB(o.api_sessionConflictIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS)
      writer.writeB(o.api_batteryFaultIn)
      writer.writeB(o.api_chargerFaultIn)
      writer.writeB(o.api_contextFaultIn)
      writer.writeB(o.api_interfaceFaultIn)
      writer.writeB(o.api_sessionConflictIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToComposition)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToNotification)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToComposition)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToNotification)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)
      writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)
      writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)
      writeDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P)
      writer.writeB(o.api_conflictToAggregation)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_resolutionToNotification)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS)
      writer.writeB(o.api_conflictToAggregation)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_resolutionToNotification)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_attentionIn)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_attentionIn)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)
      writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o.api_flightControlNoticeOut)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o.api_pilotNoticeOut)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o.api_flightControlNoticeOut)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o.api_pilotNoticeOut)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)
      writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)
      writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsIn)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o.api_chargeAuthorizationOut)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o.api_pilotStatusOut)
    }

    def writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS)
      writeDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o.api_chargeAuthorizationOut)
      writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o.api_pilotStatusOut)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
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
        case o: Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload => writeDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload => writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload => writeDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload => writeDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload => writeDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload => writeDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload => writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload => writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload => writeDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload => writeDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload => writeDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload => writeDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload => writeDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload => writeDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload => writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload => writeDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload => writeDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload => writeDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload => writeDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload => writeDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload => writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload => writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload => writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload => writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload => writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload => writeDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload => writeDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload => writeDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload => writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload => writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload => writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload => writeDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload => writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
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

    def readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorServiceRequest_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorServiceRequest_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      return Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType()
      return Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSession_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSession_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSession_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(): Drone_Battery_Charge_Qualification_Supervisor.SessionCase.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.SessionCase.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorSessionCase_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSessionCase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSessionCase_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorSessionCaseType()
      return Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorRequestResultType(): Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.RequestResult.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(): Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorRequestResult_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorRequestResult_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorRequestResult_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorRequestResultType()
      return Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryBand_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryBand_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorBatteryBandType()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorValidityType(): Drone_Battery_Charge_Qualification_Supervisor.Validity.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.Validity.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(): Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorValidity_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorValidity_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorValidity_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorValidityType()
      return Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType()
      return Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerReportType(): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargerReport_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerReport_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerReport_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorChargerReportType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType()
      return Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(): Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionState.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionState_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionState_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionState_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorAttentionStateType()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionCause_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionCause_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionCase_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionCase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPilotNotice_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotNotice_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType()
      return Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerFacts(): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargerFactsT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerFacts)
      }
      val chargerUsable = reader.readB()
      val chargerConnected = reader.readB()
      val chargerFault = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts(chargerUsable, chargerConnected, chargerFault)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargerFacts_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFactsT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorInterfaceFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts)
      }
      val interfaceHealthy = reader.readB()
      val activityObserved = reader.readB()
      val interfaceFault = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts(interfaceHealthy, activityObserved, interfaceFault)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFactsT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts)
      }
      val chargeContextAllowed = reader.readB()
      val airborneContext = reader.readB()
      val contextValid = reader.readB()
      val contextFault = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts(chargeContextAllowed, airborneContext, contextValid, contextFault)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultVector(): Drone_Battery_Charge_Qualification_Supervisor.FaultVector = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultVectorT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultVectorT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultVector = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultVector)
      }
      val batteryFault = reader.readB()
      val chargerFault = reader.readB()
      val interfaceFault = reader.readB()
      val contextFault = reader.readB()
      val sessionConflict = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultVector(batteryFault, chargerFault, interfaceFault, contextFault, sessionConflict)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(): Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultVector_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultVector_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultVector_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFactsT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts)
      }
      val advisoryValue = readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType()
      return Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts(advisoryValue)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedSession(): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPublishedSessionT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedSessionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedSession)
      }
      val sessionValue = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionType()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedSession(sessionValue)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPublishedSession_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedSession_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResultT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResultT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult)
      }
      val requestResultValue = readDrone_Battery_Charge_Qualification_SupervisorRequestResultType()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult(requestResultValue)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValueT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValueT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue)
      }
      val band = readDrone_Battery_Charge_Qualification_SupervisorBatteryBandType()
      val validity = readDrone_Battery_Charge_Qualification_SupervisorValidityType()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue(band, validity)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualificationT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryQualificationT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryQualification)
      }
      val validEvidence = reader.readB()
      val band = readDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence, band)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValueT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValueT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue)
      }
      val phase = readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType()
      val validity = readDrone_Battery_Charge_Qualification_SupervisorValidityType()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue(phase, validity)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFactsT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts)
      }
      val confidence = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType()
      val band = readDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType()
      val chargeNeeded = reader.readB()
      val batteryUsable = reader.readB()
      val batteryFault = reader.readB()
      val winningCase = readDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts(confidence, band, chargeNeeded, batteryUsable, batteryFault, winningCase)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolutionT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionResolutionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionResolution)
      }
      val newAttention = readDrone_Battery_Charge_Qualification_SupervisorAttentionStateType()
      val cause = readDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType()
      val attentionClearedNow = reader.readB()
      val winningCase = readDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution(newAttention, cause, attentionClearedNow, winningCase)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultFacts(): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultFactsT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultFacts)
      }
      val vector = readDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      val aggregateFault = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultFacts(vector, aggregateFault)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSessionResolution(): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorSessionResolutionT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSessionResolutionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSessionResolution)
      }
      val sourceSession = readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType()
      val newSession = readDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      val sessionConflict = reader.readB()
      val winningCase = readDrone_Battery_Charge_Qualification_SupervisorSessionCaseType()
      return Drone_Battery_Charge_Qualification_Supervisor.SessionResolution(sourceSession, newSession, sessionConflict, winningCase)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorSessionResolution_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFactsT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts)
      }
      val advisory = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      val requestResult = readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      val newSession = readDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      return Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts(advisory, requestResult, newSession)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload(value)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotStatus(): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPilotStatusT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotStatusT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotStatus)
      }
      val statusAdvisory = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      val statusSession = readDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      val statusRequestResult = readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      val faults = readDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      val aggregateFault = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotStatus(statusAdvisory, statusSession, statusRequestResult, faults, aggregateFault)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorPilotStatus_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorPilotStatus_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload)
      }
      val value = readDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload(value)
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

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P)
      }
      val api_advisoryIn = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      val api_attentionClearedIn = reader.readB()
      val api_requestIn = readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      val api_sessionIn = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(api_advisoryIn, api_attentionClearedIn, api_requestIn, api_sessionIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS)
      }
      val api_advisoryIn = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      val api_attentionClearedIn = reader.readB()
      val api_requestIn = readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      val api_sessionIn = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(api_advisoryIn, api_attentionClearedIn, api_requestIn, api_sessionIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P)
      }
      val api_publicFactsOut = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(api_publicFactsOut)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS)
      }
      val api_publicFactsOut = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(api_publicFactsOut)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P)
      }
      val api_qualificationOut = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(api_qualificationOut)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS)
      }
      val api_qualificationOut = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(api_qualificationOut)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorChargerReportType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorChargerReportType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P)
      }
      val api_factsToEligibility = readDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(api_factsToEligibility, api_faultToAggregation)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS)
      }
      val api_factsToEligibility = readDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(api_factsToEligibility, api_faultToAggregation)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P)
      }
      val api_factsToEligibility = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_factsToSession = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(api_factsToEligibility, api_factsToSession, api_faultToAggregation)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS)
      }
      val api_factsToEligibility = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_factsToSession = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(api_factsToEligibility, api_factsToSession, api_faultToAggregation)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS)
      }
      val api_reportIn = readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(api_reportIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P)
      }
      val api_factsToAdvisory = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      val api_factsToEligibility = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(api_factsToAdvisory, api_factsToEligibility, api_faultToAggregation)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS)
      }
      val api_factsToAdvisory = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      val api_factsToEligibility = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      val api_faultToAggregation = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(api_factsToAdvisory, api_factsToEligibility, api_faultToAggregation)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P)
      }
      val api_qualificationIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(api_qualificationIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS)
      }
      val api_qualificationIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(api_qualificationIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P)
      }
      val api_faultToAggregation = reader.readB()
      val api_stateToAdvisory = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_stateToAttention = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_stateToEligibility = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(api_faultToAggregation, api_stateToAdvisory, api_stateToAttention, api_stateToEligibility)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS)
      }
      val api_faultToAggregation = reader.readB()
      val api_stateToAdvisory = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_stateToAttention = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_stateToEligibility = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(api_faultToAggregation, api_stateToAdvisory, api_stateToAttention, api_stateToEligibility)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P)
      }
      val api_batteryIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_chargerIn = readDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      val api_interfaceIn = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_lifecycleIn = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(api_batteryIn, api_chargerIn, api_interfaceIn, api_lifecycleIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS)
      }
      val api_batteryIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_chargerIn = readDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      val api_interfaceIn = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_lifecycleIn = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(api_batteryIn, api_chargerIn, api_interfaceIn, api_lifecycleIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P)
      }
      val api_eligibilityToAdvisory = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      val api_eligibilityToSession = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(api_eligibilityToAdvisory, api_eligibilityToSession)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS)
      }
      val api_eligibilityToAdvisory = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      val api_eligibilityToSession = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(api_eligibilityToAdvisory, api_eligibilityToSession)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P)
      }
      val api_batteryIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_requestIn = readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(api_batteryIn, api_requestIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS)
      }
      val api_batteryIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_requestIn = readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(api_batteryIn, api_requestIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P)
      }
      val api_clearedToRequestResult = reader.readB()
      val api_resolutionToNotification = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(api_clearedToRequestResult, api_resolutionToNotification)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS)
      }
      val api_clearedToRequestResult = reader.readB()
      val api_resolutionToNotification = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(api_clearedToRequestResult, api_resolutionToNotification)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P)
      }
      val api_batteryIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_eligibilityIn = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      val api_lifecycleIn = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(api_batteryIn, api_eligibilityIn, api_lifecycleIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS)
      }
      val api_batteryIn = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      val api_eligibilityIn = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      val api_lifecycleIn = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(api_batteryIn, api_eligibilityIn, api_lifecycleIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P)
      }
      val api_advisoryToRequestResult = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(api_advisoryToRequestResult)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS)
      }
      val api_advisoryToRequestResult = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(api_advisoryToRequestResult)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P)
      }
      val api_batteryFaultIn = reader.readB()
      val api_chargerFaultIn = reader.readB()
      val api_contextFaultIn = reader.readB()
      val api_interfaceFaultIn = reader.readB()
      val api_sessionConflictIn = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(api_batteryFaultIn, api_chargerFaultIn, api_contextFaultIn, api_interfaceFaultIn, api_sessionConflictIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS)
      }
      val api_batteryFaultIn = reader.readB()
      val api_chargerFaultIn = reader.readB()
      val api_contextFaultIn = reader.readB()
      val api_interfaceFaultIn = reader.readB()
      val api_sessionConflictIn = reader.readB()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(api_batteryFaultIn, api_chargerFaultIn, api_contextFaultIn, api_interfaceFaultIn, api_sessionConflictIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P)
      }
      val api_faultsToComposition = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      val api_faultsToNotification = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(api_faultsToComposition, api_faultsToNotification)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS)
      }
      val api_faultsToComposition = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      val api_faultsToNotification = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(api_faultsToComposition, api_faultsToNotification)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P)
      }
      val api_eligibilityIn = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      val api_interfaceIn = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_requestIn = readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(api_eligibilityIn, api_interfaceIn, api_requestIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS)
      }
      val api_eligibilityIn = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      val api_interfaceIn = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      val api_requestIn = readDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(api_eligibilityIn, api_interfaceIn, api_requestIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P)
      }
      val api_conflictToAggregation = reader.readB()
      val api_resolutionToNotification = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(api_conflictToAggregation, api_resolutionToNotification)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS)
      }
      val api_conflictToAggregation = reader.readB()
      val api_resolutionToNotification = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(api_conflictToAggregation, api_resolutionToNotification)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P)
      }
      val api_attentionIn = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      val api_faultsIn = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      val api_sessionIn = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(api_attentionIn, api_faultsIn, api_sessionIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS)
      }
      val api_attentionIn = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      val api_faultsIn = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      val api_sessionIn = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(api_attentionIn, api_faultsIn, api_sessionIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P)
      }
      val api_flightControlNoticeOut = readDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType()
      val api_pilotNoticeOut = readDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(api_flightControlNoticeOut, api_pilotNoticeOut)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS)
      }
      val api_flightControlNoticeOut = readDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType()
      val api_pilotNoticeOut = readDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(api_flightControlNoticeOut, api_pilotNoticeOut)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P)
      }
      val api_faultsIn = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      val api_publicFactsIn = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(api_faultsIn, api_publicFactsIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS)
      }
      val api_faultsIn = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      val api_publicFactsIn = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(api_faultsIn, api_publicFactsIn)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P)
      }
      val api_chargeAuthorizationOut = readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType()
      val api_pilotStatusOut = readDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(api_chargeAuthorizationOut, api_pilotStatusOut)
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS)
      }
      val api_chargeAuthorizationOut = readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType()
      val api_pilotStatusOut = readDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(api_chargeAuthorizationOut, api_pilotStatusOut)
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
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T)
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
        case Constants.Drone_Battery_Charge_Qualification_SupervisorValidity_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorValidity_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultFacts_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryBand_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorPilotNotice_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorSessionCase_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorSessionCase_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultVector_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultVector_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorPilotStatus_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerFacts_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSession_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSession_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerReport_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerReport_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorRequestResult_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorRequestResult_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionCase_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionState_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionState_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionCause_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorServiceRequest_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorPublishedSession_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorSessionResolution_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload => val r = readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T)
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

  def fromDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorValidity_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorValidity_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerFacts(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerFacts(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultVector(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultVector(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultVector(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultVector, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultVector(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultVector = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultVector _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedSession(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedSession, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedSession(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPublishedSession _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultFacts(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultFacts(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSessionResolution(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSessionResolution(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorSessionResolution _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotStatus(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotStatus, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotStatus(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPilotStatus _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload _)
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

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS _)
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