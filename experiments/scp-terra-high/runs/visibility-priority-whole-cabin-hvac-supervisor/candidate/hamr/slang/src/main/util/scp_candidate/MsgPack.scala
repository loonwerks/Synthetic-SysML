// #Sireum
// @formatter:off

// This file is auto-generated from Validity.scala, Arrival.scala, EnableIntent.scala, DefrostIntent.scala, ThermalBand.scala, FanIntent.scala, RequestClass.scala, CabinBand.scala, ThermalNeed.scala, ThermalObservationValidity.scala, GlazingCondition.scala, VisibilityNeed.scala, VisibilityCriticality.scala, HumidityCondition.scala, HumidityNeed.scala, AirCondition.scala, AirNeed.scala, InterfaceState.scala, Budget.scala, ElectricalTier.scala, ElectricalCause.scala, ElectricalCriticality.scala, Availability.scala, WasteHeatEligibility.scala, BlowerReadiness.scala, ThermalReadiness.scala, ClearingReadiness.scala, AirTreatmentReadiness.scala, EquipmentCriticality.scala, ThermalBlowerAvailability.scala, ThermalEquipmentAvailability.scala, VisibilityBlowerAvailability.scala, ClearingAvailability.scala, AirTreatmentAvailability.scala, RecoveryState.scala, RecoveryEvent.scala, RecoveryCause.scala, Service.scala, HeatSource.scala, ThermalProposalAvailability.scala, ThermalDegradation.scala, VisibilityProposalAvailability.scala, ProposalUrgency.scala, CabinAirProposalAvailability.scala, HumidityDegradation.scala, AirDegradation.scala, SelectionCause.scala, SelectionMode.scala, Authorization.scala, ArbitrationMode.scala, ArbitrationCause.scala, NoncriticalCause.scala, Intensity.scala, EnergyTier.scala, CandidateCause.scala, RecoveryAcknowledgment.scala, SupervisorMode.scala, StatusCause.scala, UserClimateRequest.scala, QualifiedTarget.scala, QualifiedRequest.scala, CabinThermalObservation.scala, ThermalAssessment.scala, GlazingObservation.scala, HumidityObservation.scala, AirQualityObservation.scala, ElectricalAvailability.scala, ElectricalEligibility.scala, WasteHeatAvailability.scala, EquipmentReadiness.scala, ThermalPathReadiness.scala, VisibilityPathReadiness.scala, AirPathReadiness.scala, RecoveryReport.scala, ThermalProposal.scala, VisibilityProposal.scala, CabinAirProposal.scala, SelectedIntent.scala, ArbitrationStatus.scala, CabinActuationPlan.scala, SupervisorStatus.scala, CandidatePlan.scala, Base_Types.scala, RequestQualifier_supervision_requestQualifier_Containers.scala, ThermalNeedAssessor_supervision_thermalNeedAssessor_Containers.scala, VisibilityNeedAssessor_supervision_visibilityNeedAssessor_Containers.scala, HumidityNeedAssessor_supervision_humidityNeedAssessor_Containers.scala, AirQualityNeedAssessor_supervision_airQualityNeedAssessor_Containers.scala, ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_Containers.scala, WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_Containers.scala, EquipmentFaultAssessor_supervision_equipmentFaultAssessor_Containers.scala, PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_Containers.scala, ThermalServiceProposer_supervision_thermalServiceProposer_Containers.scala, VisibilityServiceProposer_supervision_visibilityServiceProposer_Containers.scala, CabinAirServiceProposer_supervision_cabinAirServiceProposer_Containers.scala, EnergySafePlanComposer_supervision_energySafePlanComposer_Containers.scala, CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_Containers.scala, AtomicResultPublisher_supervision_atomicResultPublisher_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val HVAC_Visibility_Priority_SupervisorValidity_Payload: Z = -32

    val HVAC_Visibility_Priority_SupervisorArrival_Payload: Z = -31

    val HVAC_Visibility_Priority_SupervisorEnableIntent_Payload: Z = -30

    val HVAC_Visibility_Priority_SupervisorDefrostIntent_Payload: Z = -29

    val HVAC_Visibility_Priority_SupervisorThermalBand_Payload: Z = -28

    val HVAC_Visibility_Priority_SupervisorFanIntent_Payload: Z = -27

    val HVAC_Visibility_Priority_SupervisorRequestClass_Payload: Z = -26

    val HVAC_Visibility_Priority_SupervisorCabinBand_Payload: Z = -25

    val HVAC_Visibility_Priority_SupervisorThermalNeed_Payload: Z = -24

    val HVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload: Z = -23

    val HVAC_Visibility_Priority_SupervisorGlazingCondition_Payload: Z = -22

    val HVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload: Z = -21

    val HVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload: Z = -20

    val HVAC_Visibility_Priority_SupervisorHumidityCondition_Payload: Z = -19

    val HVAC_Visibility_Priority_SupervisorHumidityNeed_Payload: Z = -18

    val HVAC_Visibility_Priority_SupervisorAirCondition_Payload: Z = -17

    val HVAC_Visibility_Priority_SupervisorAirNeed_Payload: Z = -16

    val HVAC_Visibility_Priority_SupervisorInterfaceState_Payload: Z = -15

    val HVAC_Visibility_Priority_SupervisorBudget_Payload: Z = -14

    val HVAC_Visibility_Priority_SupervisorElectricalTier_Payload: Z = -13

    val HVAC_Visibility_Priority_SupervisorElectricalCause_Payload: Z = -12

    val HVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload: Z = -11

    val HVAC_Visibility_Priority_SupervisorAvailability_Payload: Z = -10

    val HVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload: Z = -9

    val HVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload: Z = -8

    val HVAC_Visibility_Priority_SupervisorThermalReadiness_Payload: Z = -7

    val HVAC_Visibility_Priority_SupervisorClearingReadiness_Payload: Z = -6

    val HVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload: Z = -5

    val HVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload: Z = -4

    val HVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload: Z = -3

    val HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload: Z = -2

    val HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload: Z = -1

    val HVAC_Visibility_Priority_SupervisorClearingAvailability_Payload: Z = 0

    val HVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload: Z = 1

    val HVAC_Visibility_Priority_SupervisorRecoveryState_Payload: Z = 2

    val HVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload: Z = 3

    val HVAC_Visibility_Priority_SupervisorRecoveryCause_Payload: Z = 4

    val HVAC_Visibility_Priority_SupervisorService_Payload: Z = 5

    val HVAC_Visibility_Priority_SupervisorHeatSource_Payload: Z = 6

    val HVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload: Z = 7

    val HVAC_Visibility_Priority_SupervisorThermalDegradation_Payload: Z = 8

    val HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload: Z = 9

    val HVAC_Visibility_Priority_SupervisorProposalUrgency_Payload: Z = 10

    val HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload: Z = 11

    val HVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload: Z = 12

    val HVAC_Visibility_Priority_SupervisorAirDegradation_Payload: Z = 13

    val HVAC_Visibility_Priority_SupervisorSelectionCause_Payload: Z = 14

    val HVAC_Visibility_Priority_SupervisorSelectionMode_Payload: Z = 15

    val HVAC_Visibility_Priority_SupervisorAuthorization_Payload: Z = 16

    val HVAC_Visibility_Priority_SupervisorArbitrationMode_Payload: Z = 17

    val HVAC_Visibility_Priority_SupervisorArbitrationCause_Payload: Z = 18

    val HVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload: Z = 19

    val HVAC_Visibility_Priority_SupervisorIntensity_Payload: Z = 20

    val HVAC_Visibility_Priority_SupervisorEnergyTier_Payload: Z = 21

    val HVAC_Visibility_Priority_SupervisorCandidateCause_Payload: Z = 22

    val HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload: Z = 23

    val HVAC_Visibility_Priority_SupervisorSupervisorMode_Payload: Z = 24

    val HVAC_Visibility_Priority_SupervisorStatusCause_Payload: Z = 25

    val HVAC_Visibility_Priority_SupervisorUserClimateRequest: Z = 26

    val HVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload: Z = 27

    val HVAC_Visibility_Priority_SupervisorQualifiedTarget: Z = 28

    val HVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload: Z = 29

    val HVAC_Visibility_Priority_SupervisorQualifiedRequest: Z = 30

    val HVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload: Z = 31

    val HVAC_Visibility_Priority_SupervisorCabinThermalObservation: Z = 32

    val HVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload: Z = 33

    val HVAC_Visibility_Priority_SupervisorThermalAssessment: Z = 34

    val HVAC_Visibility_Priority_SupervisorThermalAssessment_Payload: Z = 35

    val HVAC_Visibility_Priority_SupervisorGlazingObservation: Z = 36

    val HVAC_Visibility_Priority_SupervisorGlazingObservation_Payload: Z = 37

    val HVAC_Visibility_Priority_SupervisorHumidityObservation: Z = 38

    val HVAC_Visibility_Priority_SupervisorHumidityObservation_Payload: Z = 39

    val HVAC_Visibility_Priority_SupervisorAirQualityObservation: Z = 40

    val HVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload: Z = 41

    val HVAC_Visibility_Priority_SupervisorElectricalAvailability: Z = 42

    val HVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload: Z = 43

    val HVAC_Visibility_Priority_SupervisorElectricalEligibility: Z = 44

    val HVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload: Z = 45

    val HVAC_Visibility_Priority_SupervisorWasteHeatAvailability: Z = 46

    val HVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload: Z = 47

    val HVAC_Visibility_Priority_SupervisorEquipmentReadiness: Z = 48

    val HVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload: Z = 49

    val HVAC_Visibility_Priority_SupervisorThermalPathReadiness: Z = 50

    val HVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload: Z = 51

    val HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness: Z = 52

    val HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload: Z = 53

    val HVAC_Visibility_Priority_SupervisorAirPathReadiness: Z = 54

    val HVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload: Z = 55

    val HVAC_Visibility_Priority_SupervisorRecoveryReport: Z = 56

    val HVAC_Visibility_Priority_SupervisorRecoveryReport_Payload: Z = 57

    val HVAC_Visibility_Priority_SupervisorThermalProposal: Z = 58

    val HVAC_Visibility_Priority_SupervisorThermalProposal_Payload: Z = 59

    val HVAC_Visibility_Priority_SupervisorVisibilityProposal: Z = 60

    val HVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload: Z = 61

    val HVAC_Visibility_Priority_SupervisorCabinAirProposal: Z = 62

    val HVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload: Z = 63

    val HVAC_Visibility_Priority_SupervisorSelectedIntent: Z = 64

    val HVAC_Visibility_Priority_SupervisorSelectedIntent_Payload: Z = 65

    val HVAC_Visibility_Priority_SupervisorArbitrationStatus: Z = 66

    val HVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload: Z = 67

    val HVAC_Visibility_Priority_SupervisorCabinActuationPlan: Z = 68

    val HVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload: Z = 69

    val HVAC_Visibility_Priority_SupervisorSupervisorStatus: Z = 70

    val HVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload: Z = 71

    val HVAC_Visibility_Priority_SupervisorCandidatePlan: Z = 72

    val HVAC_Visibility_Priority_SupervisorCandidatePlan_Payload: Z = 73

    val Base_TypesBoolean_Payload: Z = 74

    val Base_TypesInteger_Payload: Z = 75

    val Base_TypesInteger_8_Payload: Z = 76

    val Base_TypesInteger_16_Payload: Z = 77

    val Base_TypesInteger_32_Payload: Z = 78

    val Base_TypesInteger_64_Payload: Z = 79

    val Base_TypesUnsigned_8_Payload: Z = 80

    val Base_TypesUnsigned_16_Payload: Z = 81

    val Base_TypesUnsigned_32_Payload: Z = 82

    val Base_TypesUnsigned_64_Payload: Z = 83

    val Base_TypesFloat_Payload: Z = 84

    val Base_TypesFloat_32_Payload: Z = 85

    val Base_TypesFloat_64_Payload: Z = 86

    val Base_TypesCharacter_Payload: Z = 87

    val Base_TypesString_Payload: Z = 88

    val Base_TypesBits_Payload: Z = 89

    val HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P: Z = 90

    val HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS: Z = 91

    val HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P: Z = 92

    val HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS: Z = 93

    val HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P: Z = 94

    val HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS: Z = 95

    val HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P: Z = 96

    val HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS: Z = 97

    val HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P: Z = 98

    val HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS: Z = 99

    val HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P: Z = 100

    val HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS: Z = 101

    val HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P: Z = 102

    val HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS: Z = 103

    val HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P: Z = 104

    val HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS: Z = 105

    val HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P: Z = 106

    val HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS: Z = 107

    val HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P: Z = 108

    val HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS: Z = 109

    val HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P: Z = 110

    val HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS: Z = 111

    val HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P: Z = 112

    val HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS: Z = 113

    val HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P: Z = 114

    val HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS: Z = 115

    val HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P: Z = 116

    val HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS: Z = 117

    val HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P: Z = 118

    val HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS: Z = 119

    val HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P: Z = 120

    val HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS: Z = 121

    val HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P: Z = 122

    val HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS: Z = 123

    val HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P: Z = 124

    val HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS: Z = 125

    val HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P: Z = 126

    val HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS: Z = 127

    val HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P: Z = 128

    val HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS: Z = 129

    val HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P: Z = 130

    val HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS: Z = 131

    val HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P: Z = 132

    val HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS: Z = 133

    val HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P: Z = 134

    val HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS: Z = 135

    val HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P: Z = 136

    val HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS: Z = 137

    val HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P: Z = 138

    val HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS: Z = 139

    val HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P: Z = 140

    val HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS: Z = 141

    val HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P: Z = 142

    val HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS: Z = 143

    val HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P: Z = 144

    val HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS: Z = 145

    val HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P: Z = 146

    val HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS: Z = 147

    val HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P: Z = 148

    val HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS: Z = 149

    val utilEmptyContainer: Z = 150

    val _artEmpty: Z = 151

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeHVAC_Visibility_Priority_SupervisorValidityType(o: HVAC_Visibility_Priority_Supervisor.Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.Validity_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorValidity_Payload)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorArrivalType(o: HVAC_Visibility_Priority_Supervisor.Arrival.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorArrival_Payload(o: HVAC_Visibility_Priority_Supervisor.Arrival_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorArrival_Payload)
      writeHVAC_Visibility_Priority_SupervisorArrivalType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnableIntentType(o: HVAC_Visibility_Priority_Supervisor.EnableIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEnableIntent_Payload)
      writeHVAC_Visibility_Priority_SupervisorEnableIntentType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorDefrostIntentType(o: HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorDefrostIntent_Payload)
      writeHVAC_Visibility_Priority_SupervisorDefrostIntentType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalBandType(o: HVAC_Visibility_Priority_Supervisor.ThermalBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalBand_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalBandType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorFanIntentType(o: HVAC_Visibility_Priority_Supervisor.FanIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorFanIntent_Payload)
      writeHVAC_Visibility_Priority_SupervisorFanIntentType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorRequestClassType(o: HVAC_Visibility_Priority_Supervisor.RequestClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRequestClass_Payload)
      writeHVAC_Visibility_Priority_SupervisorRequestClassType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinBandType(o: HVAC_Visibility_Priority_Supervisor.CabinBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinBand_Payload)
      writeHVAC_Visibility_Priority_SupervisorCabinBandType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeedType(o: HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeed_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalNeedType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorGlazingConditionType(o: HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorGlazingCondition_Payload)
      writeHVAC_Visibility_Priority_SupervisorGlazingConditionType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload)
      writeHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload)
      writeHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityConditionType(o: HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityCondition_Payload)
      writeHVAC_Visibility_Priority_SupervisorHumidityConditionType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeedType(o: HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeed_Payload)
      writeHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirConditionType(o: HVAC_Visibility_Priority_Supervisor.AirCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirCondition_Payload)
      writeHVAC_Visibility_Priority_SupervisorAirConditionType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirNeedType(o: HVAC_Visibility_Priority_Supervisor.AirNeed.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirNeed_Payload)
      writeHVAC_Visibility_Priority_SupervisorAirNeedType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorInterfaceStateType(o: HVAC_Visibility_Priority_Supervisor.InterfaceState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorInterfaceState_Payload)
      writeHVAC_Visibility_Priority_SupervisorInterfaceStateType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorBudgetType(o: HVAC_Visibility_Priority_Supervisor.Budget.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorBudget_Payload(o: HVAC_Visibility_Priority_Supervisor.Budget_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorBudget_Payload)
      writeHVAC_Visibility_Priority_SupervisorBudgetType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalTierType(o: HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalTier_Payload)
      writeHVAC_Visibility_Priority_SupervisorElectricalTierType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalCauseType(o: HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalCause_Payload)
      writeHVAC_Visibility_Priority_SupervisorElectricalCauseType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload)
      writeHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.Availability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorBlowerReadinessType(o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorBlowerReadinessType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalReadinessType(o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalReadinessType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorClearingReadinessType(o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorClearingReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorClearingReadinessType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload)
      writeHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorClearingAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryStateType(o: HVAC_Visibility_Priority_Supervisor.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryState_Payload)
      writeHVAC_Visibility_Priority_SupervisorRecoveryStateType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryEventType(o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload)
      writeHVAC_Visibility_Priority_SupervisorRecoveryEventType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryCauseType(o: HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryCause_Payload)
      writeHVAC_Visibility_Priority_SupervisorRecoveryCauseType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorServiceType(o: HVAC_Visibility_Priority_Supervisor.Service.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorService_Payload(o: HVAC_Visibility_Priority_Supervisor.Service_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorService_Payload)
      writeHVAC_Visibility_Priority_SupervisorServiceType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorHeatSourceType(o: HVAC_Visibility_Priority_Supervisor.HeatSource.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHeatSource_Payload)
      writeHVAC_Visibility_Priority_SupervisorHeatSourceType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalDegradationType(o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalDegradation_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalDegradationType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorProposalUrgencyType(o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorProposalUrgency_Payload)
      writeHVAC_Visibility_Priority_SupervisorProposalUrgencyType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityDegradationType(o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload)
      writeHVAC_Visibility_Priority_SupervisorHumidityDegradationType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirDegradationType(o: HVAC_Visibility_Priority_Supervisor.AirDegradation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirDegradation_Payload)
      writeHVAC_Visibility_Priority_SupervisorAirDegradationType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorSelectionCauseType(o: HVAC_Visibility_Priority_Supervisor.SelectionCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorSelectionCause_Payload)
      writeHVAC_Visibility_Priority_SupervisorSelectionCauseType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorSelectionModeType(o: HVAC_Visibility_Priority_Supervisor.SelectionMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorSelectionMode_Payload)
      writeHVAC_Visibility_Priority_SupervisorSelectionModeType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAuthorizationType(o: HVAC_Visibility_Priority_Supervisor.Authorization.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o: HVAC_Visibility_Priority_Supervisor.Authorization_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAuthorization_Payload)
      writeHVAC_Visibility_Priority_SupervisorAuthorizationType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorArbitrationModeType(o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationMode_Payload)
      writeHVAC_Visibility_Priority_SupervisorArbitrationModeType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorArbitrationCauseType(o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationCause_Payload)
      writeHVAC_Visibility_Priority_SupervisorArbitrationCauseType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload)
      writeHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorIntensityType(o: HVAC_Visibility_Priority_Supervisor.Intensity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorIntensity_Payload(o: HVAC_Visibility_Priority_Supervisor.Intensity_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorIntensity_Payload)
      writeHVAC_Visibility_Priority_SupervisorIntensityType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergyTierType(o: HVAC_Visibility_Priority_Supervisor.EnergyTier.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEnergyTier_Payload)
      writeHVAC_Visibility_Priority_SupervisorEnergyTierType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorCandidateCauseType(o: HVAC_Visibility_Priority_Supervisor.CandidateCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCandidateCause_Payload)
      writeHVAC_Visibility_Priority_SupervisorCandidateCauseType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload)
      writeHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorSupervisorModeType(o: HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorSupervisorMode_Payload)
      writeHVAC_Visibility_Priority_SupervisorSupervisorModeType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorStatusCauseType(o: HVAC_Visibility_Priority_Supervisor.StatusCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorStatusCause_Payload)
      writeHVAC_Visibility_Priority_SupervisorStatusCauseType(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorUserClimateRequest(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorUserClimateRequest)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorArrivalType(o.arrival)
      writeHVAC_Visibility_Priority_SupervisorEnableIntentType(o.enabled)
      writeHVAC_Visibility_Priority_SupervisorDefrostIntentType(o.defrost)
      writeHVAC_Visibility_Priority_SupervisorThermalBandType(o.target)
      writeHVAC_Visibility_Priority_SupervisorFanIntentType(o.fan)
    }

    def writeHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload)
      writeHVAC_Visibility_Priority_SupervisorUserClimateRequest(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorQualifiedTarget(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedTarget)
      writeHVAC_Visibility_Priority_SupervisorRequestClassType(o.requestClass)
      writeHVAC_Visibility_Priority_SupervisorThermalBandType(o.target)
    }

    def writeHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload)
      writeHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorQualifiedRequest(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedRequest)
      writeHVAC_Visibility_Priority_SupervisorRequestClassType(o.requestClass)
      writeHVAC_Visibility_Priority_SupervisorArrivalType(o.arrival)
      writeHVAC_Visibility_Priority_SupervisorEnableIntentType(o.enabled)
      writeHVAC_Visibility_Priority_SupervisorFanIntentType(o.fan)
    }

    def writeHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload)
      writeHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinThermalObservation)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorCabinBandType(o.band)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload)
      writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalAssessment(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalAssessment)
      writeHVAC_Visibility_Priority_SupervisorThermalNeedType(o.need)
      writeHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(o.observationInvalid)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalAssessment_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalAssessment(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorGlazingObservation(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorGlazingObservation)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorGlazingConditionType(o.condition)
    }

    def writeHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorGlazingObservation_Payload)
      writeHVAC_Visibility_Priority_SupervisorGlazingObservation(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityObservation(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityObservation)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorHumidityConditionType(o.condition)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityObservation_Payload)
      writeHVAC_Visibility_Priority_SupervisorHumidityObservation(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityObservation(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityObservation)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorAirConditionType(o.condition)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload)
      writeHVAC_Visibility_Priority_SupervisorAirQualityObservation(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalAvailability(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalAvailability)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorInterfaceStateType(o.interfaceState)
      writeHVAC_Visibility_Priority_SupervisorBudgetType(o.budget)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorElectricalAvailability(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibility(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibility)
      writeHVAC_Visibility_Priority_SupervisorElectricalTierType(o.tier)
      writeHVAC_Visibility_Priority_SupervisorElectricalCauseType(o.eligibilityCause)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload)
      writeHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatAvailability)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorAvailabilityType(o.availability)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentReadiness)
      writeHVAC_Visibility_Priority_SupervisorValidityType(o.validity)
      writeHVAC_Visibility_Priority_SupervisorBlowerReadinessType(o.circulationState)
      writeHVAC_Visibility_Priority_SupervisorThermalReadinessType(o.thermal)
      writeHVAC_Visibility_Priority_SupervisorClearingReadinessType(o.clearing)
      writeHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(o.airTreatment)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalPathReadiness)
      writeHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(o.thermalBlowerReady)
      writeHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(o.thermalReady)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness)
      writeHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(o.visibilityBlowerReady)
      writeHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(o.clearingReady)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirPathReadiness(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirPathReadiness)
      writeHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(o.airReady)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload)
      writeHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryReport)
      writeHVAC_Visibility_Priority_SupervisorRecoveryStateType(o.recoveryState)
      writeHVAC_Visibility_Priority_SupervisorRecoveryEventType(o.recoveryEvent)
      writeHVAC_Visibility_Priority_SupervisorRecoveryCauseType(o.faultAttribution)
    }

    def writeHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryReport_Payload)
      writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalProposal(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalProposal)
      writeHVAC_Visibility_Priority_SupervisorServiceType(o.service)
      writeHVAC_Visibility_Priority_SupervisorHeatSourceType(o.heatSource)
      writeHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(o.thermalApplicability)
      writeHVAC_Visibility_Priority_SupervisorThermalDegradationType(o.degradation)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalProposal_Payload)
      writeHVAC_Visibility_Priority_SupervisorThermalProposal(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityProposal(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposal)
      writeHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(o.visibilityApplicability)
      writeHVAC_Visibility_Priority_SupervisorProposalUrgencyType(o.urgency)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload)
      writeHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirProposal(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposal)
      writeHVAC_Visibility_Priority_SupervisorServiceType(o.service)
      writeHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(o.cabinAirApplicability)
      writeHVAC_Visibility_Priority_SupervisorHumidityDegradationType(o.humidityDegradation)
      writeHVAC_Visibility_Priority_SupervisorAirDegradationType(o.airDegradation)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload)
      writeHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorSelectedIntent(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorSelectedIntent)
      writeHVAC_Visibility_Priority_SupervisorServiceType(o.service)
      writeHVAC_Visibility_Priority_SupervisorHeatSourceType(o.heatSource)
      writeHVAC_Visibility_Priority_SupervisorFanIntentType(o.fan)
      writeHVAC_Visibility_Priority_SupervisorSelectionCauseType(o.selectedCause)
      writeHVAC_Visibility_Priority_SupervisorSelectionModeType(o.controlMode)
    }

    def writeHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorSelectedIntent_Payload)
      writeHVAC_Visibility_Priority_SupervisorSelectedIntent(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorArbitrationStatus(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationStatus)
      writeHVAC_Visibility_Priority_SupervisorAuthorizationType(o.authorization)
      writeHVAC_Visibility_Priority_SupervisorArbitrationModeType(o.controlMode)
      writeHVAC_Visibility_Priority_SupervisorArbitrationCauseType(o.arbitrationCause)
      writeHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(o.noncriticalCause)
    }

    def writeHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload)
      writeHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinActuationPlan)
      writeHVAC_Visibility_Priority_SupervisorServiceType(o.service)
      writeHVAC_Visibility_Priority_SupervisorIntensityType(o.intensity)
      writeHVAC_Visibility_Priority_SupervisorHeatSourceType(o.heatSource)
      writeHVAC_Visibility_Priority_SupervisorEnergyTierType(o.energyTier)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload)
      writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorSupervisorStatus(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorSupervisorStatus)
      writeHVAC_Visibility_Priority_SupervisorSupervisorModeType(o.mode)
      writeHVAC_Visibility_Priority_SupervisorStatusCauseType(o.statusCause)
    }

    def writeHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload)
      writeHVAC_Visibility_Priority_SupervisorSupervisorStatus(o.value)
    }

    def writeHVAC_Visibility_Priority_SupervisorCandidatePlan(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCandidatePlan)
      writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.plan)
      writeHVAC_Visibility_Priority_SupervisorCandidateCauseType(o.candidateCause)
    }

    def writeHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCandidatePlan_Payload)
      writeHVAC_Visibility_Priority_SupervisorCandidatePlan(o.value)
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

    def writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorUserClimateRequest(o.api_userRequest)
    }

    def writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorUserClimateRequest(o.api_userRequest)
    }

    def writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)
      writeHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget)
    }

    def writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)
      writeHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o.api_cabinObservation)
      writeHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o.api_cabinObservation)
      writeHVAC_Visibility_Priority_SupervisorQualifiedTarget(o.api_qualifiedTarget)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorGlazingObservation(o.api_glazingObservation)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorGlazingObservation(o.api_glazingObservation)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault)
      writeHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault)
      writeHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorHumidityObservation(o.api_humidityObservation)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorHumidityObservation(o.api_humidityObservation)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorAirQualityObservation(o.api_airObservation)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorAirQualityObservation(o.api_airObservation)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorElectricalAvailability(o.api_electricalAvailability)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorElectricalAvailability(o.api_electricalAvailability)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)
      writeHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility)
    }

    def writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)
      writeHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o.api_wasteHeatAvailability)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o.api_wasteHeatAvailability)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility)
    }

    def writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o.api_equipmentReadiness)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o.api_equipmentReadiness)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)
      writeHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)
      writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)
      writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath)
    }

    def writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)
      writeHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)
      writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)
      writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath)
    }

    def writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal)
      writeHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)
      writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)
      writeHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal)
      writeHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal)
      writeHVAC_Visibility_Priority_SupervisorQualifiedRequest(o.api_qualifiedRequest)
      writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)
      writeHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal)
      writeHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)
      writeHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent)
    }

    def writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)
      writeHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment)
      writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorThermalAssessment(o.api_thermalAssessment)
      writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o.api_thermalPath)
      writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(o.api_wasteHeatEligibility)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorThermalProposal(o.api_thermalProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed)
      writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorVisibilityNeedType(o.api_visibilityNeed)
      writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o.api_visibilityPath)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorVisibilityProposal(o.api_visibilityProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed)
      writeHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)
      writeHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorAirNeedType(o.api_airNeed)
      writeHVAC_Visibility_Priority_SupervisorAirPathReadiness(o.api_airPath)
      writeHVAC_Visibility_Priority_SupervisorHumidityNeedType(o.api_humidityNeed)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorCabinAirProposal(o.api_cabinAirProposal)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility)
      writeHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorElectricalEligibility(o.api_electricalEligibility)
      writeHVAC_Visibility_Priority_SupervisorSelectedIntent(o.api_selectedIntent)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan)
    }

    def writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan)
    }

    def writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)
      writeHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)
      writeHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o.api_recoveryAcknowledgment)
      writeHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault)
    }

    def writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(o.api_criticalElectrical)
      writeHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(o.api_criticalEquipment)
      writeHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(o.api_recoveryAcknowledgment)
      writeHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(o.api_visibilityFault)
    }

    def writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)
    }

    def writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)
    }

    def writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)
      writeHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan)
      writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)
    }

    def writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorArbitrationStatus(o.api_arbitrationStatus)
      writeHVAC_Visibility_Priority_SupervisorCandidatePlan(o.api_candidatePlan)
      writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o.api_recoveryReport)
    }

    def writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container): Unit = {
      o match {
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P)
      writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.api_actuationPlan)
      writeHVAC_Visibility_Priority_SupervisorSupervisorStatus(o.api_supervisorStatus)
    }

    def writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS)
      writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o.api_actuationPlan)
      writeHVAC_Visibility_Priority_SupervisorSupervisorStatus(o.api_supervisorStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
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
        case o: HVAC_Visibility_Priority_Supervisor.Budget_Payload => writeHVAC_Visibility_Priority_SupervisorBudget_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Arrival_Payload => writeHVAC_Visibility_Priority_SupervisorArrival_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload => writeHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Service_Payload => writeHVAC_Visibility_Priority_SupervisorService_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Validity_Payload => writeHVAC_Visibility_Priority_SupervisorValidity_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload => writeHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload => writeHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Intensity_Payload => writeHVAC_Visibility_Priority_SupervisorIntensity_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload => writeHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload => writeHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload => writeHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload => writeHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload => writeHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload => writeHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload => writeHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Availability_Payload => writeHVAC_Visibility_Priority_SupervisorAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload => writeHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload => writeHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.Authorization_Payload => writeHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload => writeHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload => writeHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload => writeHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload => writeHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload => writeHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload => writeHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload => writeHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload => writeHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload => writeHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload => writeHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload => writeHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload => writeHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload => writeHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload => writeHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload => writeHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload => writeHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload => writeHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload => writeHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload => writeHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload => writeHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload => writeHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload => writeHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload => writeHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload => writeHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload => writeHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload => writeHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload => writeHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload => writeHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload => writeHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload => writeHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload => writeHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload => writeHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload => writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload => writeHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload => writeHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload => writeHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload => writeHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload => writeHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload => writeHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload => writeHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload => writeHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload => writeHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload => writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload => writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload => writeHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload => writeHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
        case o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
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

    def readHVAC_Visibility_Priority_SupervisorValidityType(): HVAC_Visibility_Priority_Supervisor.Validity.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.Validity.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorValidity_Payload(): HVAC_Visibility_Priority_Supervisor.Validity_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorValidity_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorValidity_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorValidity_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorValidityType()
      return HVAC_Visibility_Priority_Supervisor.Validity_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorArrivalType(): HVAC_Visibility_Priority_Supervisor.Arrival.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.Arrival.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorArrival_Payload(): HVAC_Visibility_Priority_Supervisor.Arrival_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorArrival_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorArrival_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Arrival_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorArrival_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorArrivalType()
      return HVAC_Visibility_Priority_Supervisor.Arrival_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorEnableIntentType(): HVAC_Visibility_Priority_Supervisor.EnableIntent.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.EnableIntent.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(): HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorEnableIntent_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEnableIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEnableIntent_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorEnableIntentType()
      return HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorDefrostIntentType(): HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.DefrostIntent.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(): HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorDefrostIntent_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorDefrostIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorDefrostIntent_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorDefrostIntentType()
      return HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalBandType(): HVAC_Visibility_Priority_Supervisor.ThermalBand.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalBand.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalBand_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalBand_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalBand_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalBand_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalBandType()
      return HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorFanIntentType(): HVAC_Visibility_Priority_Supervisor.FanIntent.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.FanIntent.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorFanIntent_Payload(): HVAC_Visibility_Priority_Supervisor.FanIntent_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorFanIntent_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorFanIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.FanIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorFanIntent_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorFanIntentType()
      return HVAC_Visibility_Priority_Supervisor.FanIntent_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorRequestClassType(): HVAC_Visibility_Priority_Supervisor.RequestClass.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.RequestClass.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorRequestClass_Payload(): HVAC_Visibility_Priority_Supervisor.RequestClass_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorRequestClass_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRequestClass_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRequestClass_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorRequestClassType()
      return HVAC_Visibility_Priority_Supervisor.RequestClass_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinBandType(): HVAC_Visibility_Priority_Supervisor.CabinBand.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.CabinBand.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorCabinBand_Payload(): HVAC_Visibility_Priority_Supervisor.CabinBand_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinBand_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinBand_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinBand_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorCabinBandType()
      return HVAC_Visibility_Priority_Supervisor.CabinBand_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedType(): HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeed.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalNeed_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeed_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalNeedType()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalObservationValidityType(): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalObservationValidity_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalObservationValidity_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalObservationValidityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorGlazingConditionType(): HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.GlazingCondition.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(): HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorGlazingCondition_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorGlazingCondition_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorGlazingCondition_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorGlazingConditionType()
      return HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedType(): HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeed.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeed_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityCriticality_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityCriticality_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityConditionType(): HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.HumidityCondition.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityCondition_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityCondition_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityCondition_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorHumidityConditionType()
      return HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedType(): HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeed.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityNeed_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeed_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAirConditionType(): HVAC_Visibility_Priority_Supervisor.AirCondition.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.AirCondition.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorAirCondition_Payload(): HVAC_Visibility_Priority_Supervisor.AirCondition_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAirCondition_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirCondition_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirCondition_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAirConditionType()
      return HVAC_Visibility_Priority_Supervisor.AirCondition_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAirNeedType(): HVAC_Visibility_Priority_Supervisor.AirNeed.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.AirNeed.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorAirNeed_Payload(): HVAC_Visibility_Priority_Supervisor.AirNeed_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAirNeed_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirNeed_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirNeed_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirNeed_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAirNeedType()
      return HVAC_Visibility_Priority_Supervisor.AirNeed_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorInterfaceStateType(): HVAC_Visibility_Priority_Supervisor.InterfaceState.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.InterfaceState.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(): HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorInterfaceState_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorInterfaceState_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorInterfaceState_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorInterfaceStateType()
      return HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorBudgetType(): HVAC_Visibility_Priority_Supervisor.Budget.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.Budget.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorBudget_Payload(): HVAC_Visibility_Priority_Supervisor.Budget_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorBudget_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorBudget_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Budget_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorBudget_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorBudgetType()
      return HVAC_Visibility_Priority_Supervisor.Budget_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalTierType(): HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ElectricalTier.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalTier_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalTier_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalTier_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorElectricalTierType()
      return HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalCauseType(): HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ElectricalCause.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalCause_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalCause_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorElectricalCauseType()
      return HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalCriticalityType(): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalCriticality_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalCriticality_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      return HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAvailabilityType(): HVAC_Visibility_Priority_Supervisor.Availability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.Availability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.Availability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.Availability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorBlowerReadinessType(): HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.BlowerReadiness.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorBlowerReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorBlowerReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorBlowerReadinessType()
      return HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalReadinessType(): HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalReadiness.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalReadinessType()
      return HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorClearingReadinessType(): HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ClearingReadiness.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorClearingReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorClearingReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorClearingReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorClearingReadinessType()
      return HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType()
      return HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorEquipmentCriticality_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentCriticality_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      return HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorClearingAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ClearingAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorClearingAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorClearingAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorClearingAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorClearingAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryStateType(): HVAC_Visibility_Priority_Supervisor.RecoveryState.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.RecoveryState.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorRecoveryState_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryState_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryState_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorRecoveryStateType()
      return HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryEventType(): HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.RecoveryEvent.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorRecoveryEvent_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryEvent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorRecoveryEventType()
      return HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryCauseType(): HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.RecoveryCause.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorRecoveryCause_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryCause_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorRecoveryCauseType()
      return HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorServiceType(): HVAC_Visibility_Priority_Supervisor.Service.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.Service.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorService_Payload(): HVAC_Visibility_Priority_Supervisor.Service_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorService_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorService_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Service_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorService_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorServiceType()
      return HVAC_Visibility_Priority_Supervisor.Service_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorHeatSourceType(): HVAC_Visibility_Priority_Supervisor.HeatSource.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.HeatSource.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorHeatSource_Payload(): HVAC_Visibility_Priority_Supervisor.HeatSource_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorHeatSource_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHeatSource_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HeatSource_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHeatSource_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorHeatSourceType()
      return HVAC_Visibility_Priority_Supervisor.HeatSource_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalDegradationType(): HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ThermalDegradation.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalDegradation_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalDegradation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalDegradation_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalDegradationType()
      return HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorProposalUrgencyType(): HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ProposalUrgency.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(): HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorProposalUrgency_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorProposalUrgency_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorProposalUrgency_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorProposalUrgencyType()
      return HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityDegradationType(): HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.HumidityDegradation.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityDegradation_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityDegradation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorHumidityDegradationType()
      return HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAirDegradationType(): HVAC_Visibility_Priority_Supervisor.AirDegradation.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.AirDegradation.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(): HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAirDegradation_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirDegradation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirDegradation_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAirDegradationType()
      return HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorSelectionCauseType(): HVAC_Visibility_Priority_Supervisor.SelectionCause.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.SelectionCause.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(): HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorSelectionCause_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorSelectionCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorSelectionCause_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorSelectionCauseType()
      return HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorSelectionModeType(): HVAC_Visibility_Priority_Supervisor.SelectionMode.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.SelectionMode.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(): HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorSelectionMode_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorSelectionMode_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorSelectionMode_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorSelectionModeType()
      return HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAuthorizationType(): HVAC_Visibility_Priority_Supervisor.Authorization.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.Authorization.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorAuthorization_Payload(): HVAC_Visibility_Priority_Supervisor.Authorization_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAuthorization_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAuthorization_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Authorization_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAuthorization_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAuthorizationType()
      return HVAC_Visibility_Priority_Supervisor.Authorization_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationModeType(): HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationMode.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(): HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorArbitrationMode_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationMode_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationMode_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorArbitrationModeType()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationCauseType(): HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationCause.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(): HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorArbitrationCause_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationCause_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorArbitrationCauseType()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorNoncriticalCauseType(): HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.NoncriticalCause.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(): HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorNoncriticalCause_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorNoncriticalCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorNoncriticalCauseType()
      return HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorIntensityType(): HVAC_Visibility_Priority_Supervisor.Intensity.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.Intensity.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorIntensity_Payload(): HVAC_Visibility_Priority_Supervisor.Intensity_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorIntensity_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorIntensity_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.Intensity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorIntensity_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorIntensityType()
      return HVAC_Visibility_Priority_Supervisor.Intensity_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorEnergyTierType(): HVAC_Visibility_Priority_Supervisor.EnergyTier.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.EnergyTier.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(): HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorEnergyTier_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEnergyTier_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEnergyTier_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorEnergyTierType()
      return HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorCandidateCauseType(): HVAC_Visibility_Priority_Supervisor.CandidateCause.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.CandidateCause.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(): HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorCandidateCause_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCandidateCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCandidateCause_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorCandidateCauseType()
      return HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType()
      return HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorSupervisorModeType(): HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.SupervisorMode.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(): HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorSupervisorMode_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorSupervisorMode_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorSupervisorMode_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorSupervisorModeType()
      return HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorStatusCauseType(): HVAC_Visibility_Priority_Supervisor.StatusCause.Type = {
      val r = reader.readZ()
      return HVAC_Visibility_Priority_Supervisor.StatusCause.byOrdinal(r).get
    }

    def readHVAC_Visibility_Priority_SupervisorStatusCause_Payload(): HVAC_Visibility_Priority_Supervisor.StatusCause_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorStatusCause_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorStatusCause_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.StatusCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorStatusCause_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorStatusCauseType()
      return HVAC_Visibility_Priority_Supervisor.StatusCause_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorUserClimateRequest(): HVAC_Visibility_Priority_Supervisor.UserClimateRequest = {
      val r = readHVAC_Visibility_Priority_SupervisorUserClimateRequestT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorUserClimateRequestT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.UserClimateRequest = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorUserClimateRequest)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val arrival = readHVAC_Visibility_Priority_SupervisorArrivalType()
      val enabled = readHVAC_Visibility_Priority_SupervisorEnableIntentType()
      val defrost = readHVAC_Visibility_Priority_SupervisorDefrostIntentType()
      val target = readHVAC_Visibility_Priority_SupervisorThermalBandType()
      val fan = readHVAC_Visibility_Priority_SupervisorFanIntentType()
      return HVAC_Visibility_Priority_Supervisor.UserClimateRequest(validity, arrival, enabled, defrost, target, fan)
    }

    def readHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(): HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorUserClimateRequest_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorUserClimateRequest_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      return HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedTarget(): HVAC_Visibility_Priority_Supervisor.QualifiedTarget = {
      val r = readHVAC_Visibility_Priority_SupervisorQualifiedTargetT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedTargetT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedTarget = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedTarget)
      }
      val requestClass = readHVAC_Visibility_Priority_SupervisorRequestClassType()
      val target = readHVAC_Visibility_Priority_SupervisorThermalBandType()
      return HVAC_Visibility_Priority_Supervisor.QualifiedTarget(requestClass, target)
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(): HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorQualifiedTarget_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedTarget_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      return HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedRequest(): HVAC_Visibility_Priority_Supervisor.QualifiedRequest = {
      val r = readHVAC_Visibility_Priority_SupervisorQualifiedRequestT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedRequestT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedRequest = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedRequest)
      }
      val requestClass = readHVAC_Visibility_Priority_SupervisorRequestClassType()
      val arrival = readHVAC_Visibility_Priority_SupervisorArrivalType()
      val enabled = readHVAC_Visibility_Priority_SupervisorEnableIntentType()
      val fan = readHVAC_Visibility_Priority_SupervisorFanIntentType()
      return HVAC_Visibility_Priority_Supervisor.QualifiedRequest(requestClass, arrival, enabled, fan)
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(): HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorQualifiedRequest_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorQualifiedRequest_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      return HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinThermalObservation(): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinThermalObservationT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinThermalObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinThermalObservation)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val band = readHVAC_Visibility_Priority_SupervisorCabinBandType()
      return HVAC_Visibility_Priority_Supervisor.CabinThermalObservation(validity, band)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinThermalObservation_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinThermalObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      return HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalAssessment(): HVAC_Visibility_Priority_Supervisor.ThermalAssessment = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalAssessmentT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalAssessmentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalAssessment)
      }
      val need = readHVAC_Visibility_Priority_SupervisorThermalNeedType()
      val observationInvalid = readHVAC_Visibility_Priority_SupervisorThermalObservationValidityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need, observationInvalid)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalAssessment_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalAssessment_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalAssessment_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalAssessment()
      return HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorGlazingObservation(): HVAC_Visibility_Priority_Supervisor.GlazingObservation = {
      val r = readHVAC_Visibility_Priority_SupervisorGlazingObservationT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorGlazingObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.GlazingObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorGlazingObservation)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val condition = readHVAC_Visibility_Priority_SupervisorGlazingConditionType()
      return HVAC_Visibility_Priority_Supervisor.GlazingObservation(validity, condition)
    }

    def readHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(): HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorGlazingObservation_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorGlazingObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorGlazingObservation_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorGlazingObservation()
      return HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityObservation(): HVAC_Visibility_Priority_Supervisor.HumidityObservation = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityObservationT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityObservation)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val condition = readHVAC_Visibility_Priority_SupervisorHumidityConditionType()
      return HVAC_Visibility_Priority_Supervisor.HumidityObservation(validity, condition)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(): HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityObservation_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityObservation_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorHumidityObservation()
      return HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityObservation(): HVAC_Visibility_Priority_Supervisor.AirQualityObservation = {
      val r = readHVAC_Visibility_Priority_SupervisorAirQualityObservationT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityObservationT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityObservation)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val condition = readHVAC_Visibility_Priority_SupervisorAirConditionType()
      return HVAC_Visibility_Priority_Supervisor.AirQualityObservation(validity, condition)
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(): HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAirQualityObservation_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityObservation_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      return HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalAvailability(): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalAvailabilityT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalAvailability)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val interfaceState = readHVAC_Visibility_Priority_SupervisorInterfaceStateType()
      val budget = readHVAC_Visibility_Priority_SupervisorBudgetType()
      return HVAC_Visibility_Priority_Supervisor.ElectricalAvailability(validity, interfaceState, budget)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      return HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibility(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibility)
      }
      val tier = readHVAC_Visibility_Priority_SupervisorElectricalTierType()
      val eligibilityCause = readHVAC_Visibility_Priority_SupervisorElectricalCauseType()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibility(tier, eligibilityCause)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibility_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibility_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability = {
      val r = readHVAC_Visibility_Priority_SupervisorWasteHeatAvailabilityT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatAvailabilityT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatAvailability)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val availability = readHVAC_Visibility_Priority_SupervisorAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability(validity, availability)
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentReadiness(): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness = {
      val r = readHVAC_Visibility_Priority_SupervisorEquipmentReadinessT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentReadiness)
      }
      val validity = readHVAC_Visibility_Priority_SupervisorValidityType()
      val circulationState = readHVAC_Visibility_Priority_SupervisorBlowerReadinessType()
      val thermal = readHVAC_Visibility_Priority_SupervisorThermalReadinessType()
      val clearing = readHVAC_Visibility_Priority_SupervisorClearingReadinessType()
      val airTreatment = readHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType()
      return HVAC_Visibility_Priority_Supervisor.EquipmentReadiness(validity, circulationState, thermal, clearing, airTreatment)
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorEquipmentReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      return HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalPathReadiness(): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalPathReadinessT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalPathReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalPathReadiness)
      }
      val thermalBlowerReady = readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType()
      val thermalReady = readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness(thermalBlowerReady, thermalReady)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalPathReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalPathReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      return HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadinessT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityPathReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness)
      }
      val visibilityBlowerReady = readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType()
      val clearingReady = readHVAC_Visibility_Priority_SupervisorClearingAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness(visibilityBlowerReady, clearingReady)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      return HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorAirPathReadiness(): HVAC_Visibility_Priority_Supervisor.AirPathReadiness = {
      val r = readHVAC_Visibility_Priority_SupervisorAirPathReadinessT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirPathReadinessT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirPathReadiness = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirPathReadiness)
      }
      val airReady = readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType()
      return HVAC_Visibility_Priority_Supervisor.AirPathReadiness(airReady)
    }

    def readHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(): HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorAirPathReadiness_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirPathReadiness_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      return HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryReport(): HVAC_Visibility_Priority_Supervisor.RecoveryReport = {
      val r = readHVAC_Visibility_Priority_SupervisorRecoveryReportT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryReportT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryReport)
      }
      val recoveryState = readHVAC_Visibility_Priority_SupervisorRecoveryStateType()
      val recoveryEvent = readHVAC_Visibility_Priority_SupervisorRecoveryEventType()
      val faultAttribution = readHVAC_Visibility_Priority_SupervisorRecoveryCauseType()
      return HVAC_Visibility_Priority_Supervisor.RecoveryReport(recoveryState, recoveryEvent, faultAttribution)
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(): HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorRecoveryReport_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRecoveryReport_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRecoveryReport_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      return HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalProposal(): HVAC_Visibility_Priority_Supervisor.ThermalProposal = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalProposalT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalProposalT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalProposal)
      }
      val service = readHVAC_Visibility_Priority_SupervisorServiceType()
      val heatSource = readHVAC_Visibility_Priority_SupervisorHeatSourceType()
      val thermalApplicability = readHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType()
      val degradation = readHVAC_Visibility_Priority_SupervisorThermalDegradationType()
      return HVAC_Visibility_Priority_Supervisor.ThermalProposal(service, heatSource, thermalApplicability, degradation)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(): HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalProposal_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalProposal_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalProposal_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorThermalProposal()
      return HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityProposal(): HVAC_Visibility_Priority_Supervisor.VisibilityProposal = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityProposalT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityProposalT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposal)
      }
      val visibilityApplicability = readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType()
      val urgency = readHVAC_Visibility_Priority_SupervisorProposalUrgencyType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityProposal(visibilityApplicability, urgency)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(): HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityProposal_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityProposal_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      return HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirProposal(): HVAC_Visibility_Priority_Supervisor.CabinAirProposal = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinAirProposalT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirProposalT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposal)
      }
      val service = readHVAC_Visibility_Priority_SupervisorServiceType()
      val cabinAirApplicability = readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType()
      val humidityDegradation = readHVAC_Visibility_Priority_SupervisorHumidityDegradationType()
      val airDegradation = readHVAC_Visibility_Priority_SupervisorAirDegradationType()
      return HVAC_Visibility_Priority_Supervisor.CabinAirProposal(service, cabinAirApplicability, humidityDegradation, airDegradation)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(): HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinAirProposal_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirProposal_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      return HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorSelectedIntent(): HVAC_Visibility_Priority_Supervisor.SelectedIntent = {
      val r = readHVAC_Visibility_Priority_SupervisorSelectedIntentT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorSelectedIntentT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectedIntent = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorSelectedIntent)
      }
      val service = readHVAC_Visibility_Priority_SupervisorServiceType()
      val heatSource = readHVAC_Visibility_Priority_SupervisorHeatSourceType()
      val fan = readHVAC_Visibility_Priority_SupervisorFanIntentType()
      val selectedCause = readHVAC_Visibility_Priority_SupervisorSelectionCauseType()
      val controlMode = readHVAC_Visibility_Priority_SupervisorSelectionModeType()
      return HVAC_Visibility_Priority_Supervisor.SelectedIntent(service, heatSource, fan, selectedCause, controlMode)
    }

    def readHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(): HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorSelectedIntent_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorSelectedIntent_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorSelectedIntent_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorSelectedIntent()
      return HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationStatus(): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus = {
      val r = readHVAC_Visibility_Priority_SupervisorArbitrationStatusT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationStatusT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationStatus)
      }
      val authorization = readHVAC_Visibility_Priority_SupervisorAuthorizationType()
      val controlMode = readHVAC_Visibility_Priority_SupervisorArbitrationModeType()
      val arbitrationCause = readHVAC_Visibility_Priority_SupervisorArbitrationCauseType()
      val noncriticalCause = readHVAC_Visibility_Priority_SupervisorNoncriticalCauseType()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationStatus(authorization, controlMode, arbitrationCause, noncriticalCause)
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorArbitrationStatus_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorArbitrationStatus_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      return HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinActuationPlan(): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinActuationPlanT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinActuationPlanT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinActuationPlan)
      }
      val service = readHVAC_Visibility_Priority_SupervisorServiceType()
      val intensity = readHVAC_Visibility_Priority_SupervisorIntensityType()
      val heatSource = readHVAC_Visibility_Priority_SupervisorHeatSourceType()
      val energyTier = readHVAC_Visibility_Priority_SupervisorEnergyTierType()
      return HVAC_Visibility_Priority_Supervisor.CabinActuationPlan(service, intensity, heatSource, energyTier)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinActuationPlan_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinActuationPlan_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      return HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorSupervisorStatus(): HVAC_Visibility_Priority_Supervisor.SupervisorStatus = {
      val r = readHVAC_Visibility_Priority_SupervisorSupervisorStatusT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorSupervisorStatusT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SupervisorStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorSupervisorStatus)
      }
      val mode = readHVAC_Visibility_Priority_SupervisorSupervisorModeType()
      val statusCause = readHVAC_Visibility_Priority_SupervisorStatusCauseType()
      return HVAC_Visibility_Priority_Supervisor.SupervisorStatus(mode, statusCause)
    }

    def readHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(): HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorSupervisorStatus_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorSupervisorStatus_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      return HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload(value)
    }

    def readHVAC_Visibility_Priority_SupervisorCandidatePlan(): HVAC_Visibility_Priority_Supervisor.CandidatePlan = {
      val r = readHVAC_Visibility_Priority_SupervisorCandidatePlanT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCandidatePlanT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CandidatePlan = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCandidatePlan)
      }
      val plan = readHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      val candidateCause = readHVAC_Visibility_Priority_SupervisorCandidateCauseType()
      return HVAC_Visibility_Priority_Supervisor.CandidatePlan(plan, candidateCause)
    }

    def readHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(): HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload = {
      val r = readHVAC_Visibility_Priority_SupervisorCandidatePlan_PayloadT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCandidatePlan_PayloadT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCandidatePlan_Payload)
      }
      val value = readHVAC_Visibility_Priority_SupervisorCandidatePlan()
      return HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload(value)
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

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P)
      }
      val api_userRequest = readHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P(api_userRequest)
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS)
      }
      val api_userRequest = readHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS(api_userRequest)
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P)
      }
      val api_qualifiedRequest = readHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      val api_qualifiedTarget = readHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P(api_qualifiedRequest, api_qualifiedTarget)
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS)
      }
      val api_qualifiedRequest = readHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      val api_qualifiedTarget = readHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      return HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS(api_qualifiedRequest, api_qualifiedTarget)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P)
      }
      val api_cabinObservation = readHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      val api_qualifiedTarget = readHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(api_cabinObservation, api_qualifiedTarget)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS)
      }
      val api_cabinObservation = readHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      val api_qualifiedTarget = readHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(api_cabinObservation, api_qualifiedTarget)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P)
      }
      val api_thermalAssessment = readHVAC_Visibility_Priority_SupervisorThermalAssessment()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(api_thermalAssessment)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS)
      }
      val api_thermalAssessment = readHVAC_Visibility_Priority_SupervisorThermalAssessment()
      return HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(api_thermalAssessment)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P)
      }
      val api_glazingObservation = readHVAC_Visibility_Priority_SupervisorGlazingObservation()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(api_glazingObservation)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS)
      }
      val api_glazingObservation = readHVAC_Visibility_Priority_SupervisorGlazingObservation()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(api_glazingObservation)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P)
      }
      val api_visibilityFault = readHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      val api_visibilityNeed = readHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(api_visibilityFault, api_visibilityNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS)
      }
      val api_visibilityFault = readHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      val api_visibilityNeed = readHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      return HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(api_visibilityFault, api_visibilityNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P)
      }
      val api_humidityObservation = readHVAC_Visibility_Priority_SupervisorHumidityObservation()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(api_humidityObservation)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS)
      }
      val api_humidityObservation = readHVAC_Visibility_Priority_SupervisorHumidityObservation()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(api_humidityObservation)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P)
      }
      val api_humidityNeed = readHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(api_humidityNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS)
      }
      val api_humidityNeed = readHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      return HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(api_humidityNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P)
      }
      val api_airObservation = readHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(api_airObservation)
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS)
      }
      val api_airObservation = readHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(api_airObservation)
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P)
      }
      val api_airNeed = readHVAC_Visibility_Priority_SupervisorAirNeedType()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(api_airNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS)
      }
      val api_airNeed = readHVAC_Visibility_Priority_SupervisorAirNeedType()
      return HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(api_airNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P)
      }
      val api_electricalAvailability = readHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(api_electricalAvailability)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS)
      }
      val api_electricalAvailability = readHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(api_electricalAvailability)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P)
      }
      val api_criticalElectrical = readHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      val api_electricalEligibility = readHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(api_criticalElectrical, api_electricalEligibility)
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS)
      }
      val api_criticalElectrical = readHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      val api_electricalEligibility = readHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      return HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(api_criticalElectrical, api_electricalEligibility)
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P)
      }
      val api_wasteHeatAvailability = readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(api_wasteHeatAvailability)
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS)
      }
      val api_wasteHeatAvailability = readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(api_wasteHeatAvailability)
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P)
      }
      val api_wasteHeatEligibility = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(api_wasteHeatEligibility)
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS)
      }
      val api_wasteHeatEligibility = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      return HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(api_wasteHeatEligibility)
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P)
      }
      val api_equipmentReadiness = readHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(api_equipmentReadiness)
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS)
      }
      val api_equipmentReadiness = readHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(api_equipmentReadiness)
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P)
      }
      val api_airPath = readHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      val api_criticalEquipment = readHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      val api_thermalPath = readHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      val api_visibilityPath = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(api_airPath, api_criticalEquipment, api_thermalPath, api_visibilityPath)
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS)
      }
      val api_airPath = readHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      val api_criticalEquipment = readHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      val api_thermalPath = readHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      val api_visibilityPath = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      return HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(api_airPath, api_criticalEquipment, api_thermalPath, api_visibilityPath)
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P)
      }
      val api_cabinAirProposal = readHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      val api_qualifiedRequest = readHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      val api_recoveryReport = readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      val api_thermalProposal = readHVAC_Visibility_Priority_SupervisorThermalProposal()
      val api_visibilityProposal = readHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(api_cabinAirProposal, api_qualifiedRequest, api_recoveryReport, api_thermalProposal, api_visibilityProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS)
      }
      val api_cabinAirProposal = readHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      val api_qualifiedRequest = readHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      val api_recoveryReport = readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      val api_thermalProposal = readHVAC_Visibility_Priority_SupervisorThermalProposal()
      val api_visibilityProposal = readHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(api_cabinAirProposal, api_qualifiedRequest, api_recoveryReport, api_thermalProposal, api_visibilityProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P)
      }
      val api_arbitrationStatus = readHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      val api_selectedIntent = readHVAC_Visibility_Priority_SupervisorSelectedIntent()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(api_arbitrationStatus, api_selectedIntent)
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS)
      }
      val api_arbitrationStatus = readHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      val api_selectedIntent = readHVAC_Visibility_Priority_SupervisorSelectedIntent()
      return HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(api_arbitrationStatus, api_selectedIntent)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P)
      }
      val api_thermalAssessment = readHVAC_Visibility_Priority_SupervisorThermalAssessment()
      val api_thermalPath = readHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      val api_wasteHeatEligibility = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(api_thermalAssessment, api_thermalPath, api_wasteHeatEligibility)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS)
      }
      val api_thermalAssessment = readHVAC_Visibility_Priority_SupervisorThermalAssessment()
      val api_thermalPath = readHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      val api_wasteHeatEligibility = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(api_thermalAssessment, api_thermalPath, api_wasteHeatEligibility)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P)
      }
      val api_thermalProposal = readHVAC_Visibility_Priority_SupervisorThermalProposal()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(api_thermalProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS)
      }
      val api_thermalProposal = readHVAC_Visibility_Priority_SupervisorThermalProposal()
      return HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(api_thermalProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P)
      }
      val api_visibilityNeed = readHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      val api_visibilityPath = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(api_visibilityNeed, api_visibilityPath)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS)
      }
      val api_visibilityNeed = readHVAC_Visibility_Priority_SupervisorVisibilityNeedType()
      val api_visibilityPath = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(api_visibilityNeed, api_visibilityPath)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P)
      }
      val api_visibilityProposal = readHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(api_visibilityProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS)
      }
      val api_visibilityProposal = readHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      return HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(api_visibilityProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P)
      }
      val api_airNeed = readHVAC_Visibility_Priority_SupervisorAirNeedType()
      val api_airPath = readHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      val api_humidityNeed = readHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(api_airNeed, api_airPath, api_humidityNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS)
      }
      val api_airNeed = readHVAC_Visibility_Priority_SupervisorAirNeedType()
      val api_airPath = readHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      val api_humidityNeed = readHVAC_Visibility_Priority_SupervisorHumidityNeedType()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(api_airNeed, api_airPath, api_humidityNeed)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P)
      }
      val api_cabinAirProposal = readHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(api_cabinAirProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS)
      }
      val api_cabinAirProposal = readHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      return HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(api_cabinAirProposal)
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P)
      }
      val api_electricalEligibility = readHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      val api_selectedIntent = readHVAC_Visibility_Priority_SupervisorSelectedIntent()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(api_electricalEligibility, api_selectedIntent)
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS)
      }
      val api_electricalEligibility = readHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      val api_selectedIntent = readHVAC_Visibility_Priority_SupervisorSelectedIntent()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(api_electricalEligibility, api_selectedIntent)
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P)
      }
      val api_candidatePlan = readHVAC_Visibility_Priority_SupervisorCandidatePlan()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(api_candidatePlan)
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS)
      }
      val api_candidatePlan = readHVAC_Visibility_Priority_SupervisorCandidatePlan()
      return HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(api_candidatePlan)
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P)
      }
      val api_criticalElectrical = readHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      val api_criticalEquipment = readHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      val api_recoveryAcknowledgment = readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType()
      val api_visibilityFault = readHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(api_criticalElectrical, api_criticalEquipment, api_recoveryAcknowledgment, api_visibilityFault)
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS)
      }
      val api_criticalElectrical = readHVAC_Visibility_Priority_SupervisorElectricalCriticalityType()
      val api_criticalEquipment = readHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType()
      val api_recoveryAcknowledgment = readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType()
      val api_visibilityFault = readHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(api_criticalElectrical, api_criticalEquipment, api_recoveryAcknowledgment, api_visibilityFault)
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P)
      }
      val api_recoveryReport = readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(api_recoveryReport)
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS)
      }
      val api_recoveryReport = readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      return HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(api_recoveryReport)
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P)
      }
      val api_arbitrationStatus = readHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      val api_candidatePlan = readHVAC_Visibility_Priority_SupervisorCandidatePlan()
      val api_recoveryReport = readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(api_arbitrationStatus, api_candidatePlan, api_recoveryReport)
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS)
      }
      val api_arbitrationStatus = readHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      val api_candidatePlan = readHVAC_Visibility_Priority_SupervisorCandidatePlan()
      val api_recoveryReport = readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(api_arbitrationStatus, api_candidatePlan, api_recoveryReport)
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container.")
          val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P = {
      val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P)
      }
      val api_actuationPlan = readHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      val api_supervisorStatus = readHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(api_actuationPlan, api_supervisorStatus)
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS = {
      val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(typeParsed: B): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS)
      }
      val api_actuationPlan = readHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      val api_supervisorStatus = readHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      return HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(api_actuationPlan, api_supervisorStatus)
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
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T)
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
        case Constants.HVAC_Visibility_Priority_SupervisorBudget_Payload => val r = readHVAC_Visibility_Priority_SupervisorBudget_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorArrival_Payload => val r = readHVAC_Visibility_Priority_SupervisorArrival_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirNeed_Payload => val r = readHVAC_Visibility_Priority_SupervisorAirNeed_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorService_Payload => val r = readHVAC_Visibility_Priority_SupervisorService_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorValidity_Payload => val r = readHVAC_Visibility_Priority_SupervisorValidity_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorFanIntent_Payload => val r = readHVAC_Visibility_Priority_SupervisorFanIntent_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinBand_Payload => val r = readHVAC_Visibility_Priority_SupervisorCabinBand_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorIntensity_Payload => val r = readHVAC_Visibility_Priority_SupervisorIntensity_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergyTier_Payload => val r = readHVAC_Visibility_Priority_SupervisorEnergyTier_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHeatSource_Payload => val r = readHVAC_Visibility_Priority_SupervisorHeatSource_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalBand_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalBand_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeed_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalNeed_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorStatusCause_Payload => val r = readHVAC_Visibility_Priority_SupervisorStatusCause_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnableIntent_Payload => val r = readHVAC_Visibility_Priority_SupervisorEnableIntent_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirCondition_Payload => val r = readHVAC_Visibility_Priority_SupervisorAirCondition_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeed_Payload => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeed_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestClass_Payload => val r = readHVAC_Visibility_Priority_SupervisorRequestClass_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAuthorization_Payload => val r = readHVAC_Visibility_Priority_SupervisorAuthorization_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRecoveryState_Payload => val r = readHVAC_Visibility_Priority_SupervisorRecoveryState_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorDefrostIntent_Payload => val r = readHVAC_Visibility_Priority_SupervisorDefrostIntent_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorSelectionMode_Payload => val r = readHVAC_Visibility_Priority_SupervisorSelectionMode_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRecoveryCause_Payload => val r = readHVAC_Visibility_Priority_SupervisorRecoveryCause_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload => val r = readHVAC_Visibility_Priority_SupervisorRecoveryEvent_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCandidatePlan_Payload => val r = readHVAC_Visibility_Priority_SupervisorCandidatePlan_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirDegradation_Payload => val r = readHVAC_Visibility_Priority_SupervisorAirDegradation_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorInterfaceState_Payload => val r = readHVAC_Visibility_Priority_SupervisorInterfaceState_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalTier_Payload => val r = readHVAC_Visibility_Priority_SupervisorElectricalTier_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeed_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorSupervisorMode_Payload => val r = readHVAC_Visibility_Priority_SupervisorSupervisorMode_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorSelectionCause_Payload => val r = readHVAC_Visibility_Priority_SupervisorSelectionCause_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCandidateCause_Payload => val r = readHVAC_Visibility_Priority_SupervisorCandidateCause_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRecoveryReport_Payload => val r = readHVAC_Visibility_Priority_SupervisorRecoveryReport_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorSelectedIntent_Payload => val r = readHVAC_Visibility_Priority_SupervisorSelectedIntent_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorBlowerReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorProposalUrgency_Payload => val r = readHVAC_Visibility_Priority_SupervisorProposalUrgency_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorArbitrationMode_Payload => val r = readHVAC_Visibility_Priority_SupervisorArbitrationMode_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalCause_Payload => val r = readHVAC_Visibility_Priority_SupervisorElectricalCause_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload => val r = readHVAC_Visibility_Priority_SupervisorQualifiedTarget_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalProposal_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalProposal_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorGlazingCondition_Payload => val r = readHVAC_Visibility_Priority_SupervisorGlazingCondition_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload => val r = readHVAC_Visibility_Priority_SupervisorNoncriticalCause_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorArbitrationCause_Payload => val r = readHVAC_Visibility_Priority_SupervisorArbitrationCause_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorAirPathReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload => val r = readHVAC_Visibility_Priority_SupervisorSupervisorStatus_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload => val r = readHVAC_Visibility_Priority_SupervisorQualifiedRequest_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload => val r = readHVAC_Visibility_Priority_SupervisorCabinAirProposal_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityCondition_Payload => val r = readHVAC_Visibility_Priority_SupervisorHumidityCondition_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorClearingReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorClearingReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalAssessment_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalAssessment_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload => val r = readHVAC_Visibility_Priority_SupervisorArbitrationStatus_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalDegradation_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalDegradation_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorGlazingObservation_Payload => val r = readHVAC_Visibility_Priority_SupervisorGlazingObservation_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload => val r = readHVAC_Visibility_Priority_SupervisorVisibilityProposal_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload => val r = readHVAC_Visibility_Priority_SupervisorCabinActuationPlan_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorEquipmentReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload => val r = readHVAC_Visibility_Priority_SupervisorUserClimateRequest_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload => val r = readHVAC_Visibility_Priority_SupervisorHumidityDegradation_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityObservation_Payload => val r = readHVAC_Visibility_Priority_SupervisorHumidityObservation_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload => val r = readHVAC_Visibility_Priority_SupervisorEquipmentCriticality_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorClearingAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorClearingAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalPathReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload => val r = readHVAC_Visibility_Priority_SupervisorVisibilityCriticality_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload => val r = readHVAC_Visibility_Priority_SupervisorElectricalCriticality_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload => val r = readHVAC_Visibility_Priority_SupervisorAirQualityObservation_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibility_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload => val r = readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorElectricalAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload => val r = readHVAC_Visibility_Priority_SupervisorCabinThermalObservation_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload => val r = readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalObservationValidity_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload => val r = readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_PayloadT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PST(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PT(T); return r
        case Constants.HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PST(T)
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

  def fromHVAC_Visibility_Priority_SupervisorValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorValidity_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorValidity_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.Validity_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorValidity_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.Validity_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorValidity_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorValidity_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArrival_Payload(o: HVAC_Visibility_Priority_Supervisor.Arrival_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorArrival_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorArrival_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.Arrival_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArrival_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.Arrival_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorArrival_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorArrival_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnableIntent_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnableIntent_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnableIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalBand_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalBand_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalBand_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalBand_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalBand_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorFanIntent_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorFanIntent_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.FanIntent_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorFanIntent_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.FanIntent_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorFanIntent_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorFanIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRequestClass_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRequestClass_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RequestClass_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestClass_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.RequestClass_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRequestClass_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRequestClass_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinBand_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinBand_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinBand_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinBand_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinBand_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinBand_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinBand_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeed_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalNeed_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirCondition_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirCondition_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirCondition_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirCondition_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirCondition_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirCondition_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirCondition_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirNeed_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirNeed_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirNeed_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirNeed_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirNeed_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirNeed_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirNeed_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorInterfaceState_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorInterfaceState_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorInterfaceState_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorBudget_Payload(o: HVAC_Visibility_Priority_Supervisor.Budget_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorBudget_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorBudget_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.Budget_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorBudget_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.Budget_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorBudget_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorBudget_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalTier_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalTier_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalTier_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalCause_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalCause_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.Availability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.Availability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryState_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRecoveryState_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRecoveryState_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorService_Payload(o: HVAC_Visibility_Priority_Supervisor.Service_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorService_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorService_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.Service_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorService_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.Service_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorService_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorService_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHeatSource_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHeatSource_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HeatSource_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHeatSource_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.HeatSource_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHeatSource_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHeatSource_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirDegradation_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirDegradation_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirDegradation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectionCause_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorSelectionCause_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorSelectionCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectionMode_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorSelectionMode_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorSelectionMode_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o: HVAC_Visibility_Priority_Supervisor.Authorization_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAuthorization_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAuthorization_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.Authorization_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAuthorization_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.Authorization_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAuthorization_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAuthorization_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorIntensity_Payload(o: HVAC_Visibility_Priority_Supervisor.Intensity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorIntensity_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorIntensity_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.Intensity_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorIntensity_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.Intensity_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorIntensity_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorIntensity_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergyTier_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnergyTier_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnergyTier_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCandidateCause_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCandidateCause_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCandidateCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorStatusCause_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorStatusCause_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.StatusCause_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorStatusCause_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.StatusCause_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorStatusCause_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorStatusCause_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorUserClimateRequest(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorUserClimateRequest(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorUserClimateRequest(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.UserClimateRequest, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorUserClimateRequest(reader: Reader): HVAC_Visibility_Priority_Supervisor.UserClimateRequest = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorUserClimateRequest()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorUserClimateRequest _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedTarget(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorQualifiedTarget(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedTarget(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.QualifiedTarget, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedTarget(reader: Reader): HVAC_Visibility_Priority_Supervisor.QualifiedTarget = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorQualifiedTarget()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorQualifiedTarget _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedRequest(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorQualifiedRequest(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedRequest(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.QualifiedRequest, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedRequest(reader: Reader): HVAC_Visibility_Priority_Supervisor.QualifiedRequest = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorQualifiedRequest()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorQualifiedRequest _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinThermalObservation(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinThermalObservation, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinThermalObservation(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinThermalObservation()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinThermalObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalAssessment(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalAssessment(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalAssessment(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalAssessment, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalAssessment(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalAssessment = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalAssessment()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalAssessment _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorGlazingObservation(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorGlazingObservation(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorGlazingObservation(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.GlazingObservation, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorGlazingObservation(reader: Reader): HVAC_Visibility_Priority_Supervisor.GlazingObservation = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorGlazingObservation()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorGlazingObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityObservation(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityObservation(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityObservation(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityObservation, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityObservation(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityObservation = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityObservation()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityObservation(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityObservation(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityObservation(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityObservation, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityObservation(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityObservation = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityObservation()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityObservation _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalAvailability(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalAvailability(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalAvailability(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalAvailability, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalAvailability(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalAvailability()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalAvailability _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibility(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibility(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibility(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibility, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibility(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibility()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibility _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentReadiness(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentReadiness, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentReadiness(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentReadiness()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalPathReadiness(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalPathReadiness(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalPathReadiness()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalPathReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirPathReadiness(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirPathReadiness(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirPathReadiness(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirPathReadiness, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirPathReadiness(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirPathReadiness = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirPathReadiness()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirPathReadiness _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryReport(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRecoveryReport(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryReport(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RecoveryReport, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryReport(reader: Reader): HVAC_Visibility_Priority_Supervisor.RecoveryReport = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRecoveryReport()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRecoveryReport _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalProposal(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalProposal(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalProposal(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalProposal, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalProposal(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalProposal = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalProposal()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalProposal _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalProposal_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalProposal_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalProposal_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityProposal(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityProposal(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityProposal(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityProposal, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityProposal(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityProposal = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityProposal()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityProposal _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirProposal(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirProposal(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirProposal(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirProposal, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirProposal(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirProposal = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirProposal()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirProposal _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectedIntent(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorSelectedIntent(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorSelectedIntent(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.SelectedIntent, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectedIntent(reader: Reader): HVAC_Visibility_Priority_Supervisor.SelectedIntent = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorSelectedIntent()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorSelectedIntent _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationStatus(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorArbitrationStatus(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationStatus(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationStatus, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationStatus(reader: Reader): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorArbitrationStatus()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorArbitrationStatus _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinActuationPlan(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinActuationPlan, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinActuationPlan(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinActuationPlan()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinActuationPlan _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSupervisorStatus(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorSupervisorStatus(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorSupervisorStatus(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.SupervisorStatus, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSupervisorStatus(reader: Reader): HVAC_Visibility_Priority_Supervisor.SupervisorStatus = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorSupervisorStatus()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorSupervisorStatus _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCandidatePlan(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCandidatePlan(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCandidatePlan(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CandidatePlan, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCandidatePlan(reader: Reader): HVAC_Visibility_Priority_Supervisor.CandidatePlan = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCandidatePlan()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCandidatePlan _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(reader: Reader): HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload _)
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

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(reader: Reader): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(reader: Reader): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P _)
    return r
  }

  def fromHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(reader: Reader): HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS = {
      val r = reader.readHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS _)
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