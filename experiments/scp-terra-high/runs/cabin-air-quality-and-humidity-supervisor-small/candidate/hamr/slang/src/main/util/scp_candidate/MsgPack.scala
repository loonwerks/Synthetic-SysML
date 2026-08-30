// #Sireum
// @formatter:off

// This file is auto-generated from AirCarePreference.scala, PreferenceValidity.scala, AirCareIntent.scala, CabinAirQuality.scala, AirQualityValidity.scala, AirAssessment.scala, CabinHumidityBand.scala, HumidityValidity.scala, HumidityAssessment.scala, MeasurementConfidence.scala, AirTreatmentDirective.scala, AirCareStatus.scala, ConfidenceMode.scala, Base_Types.scala, PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_Containers.scala, AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Containers.scala, HumidityAssessor_airCareSupervisionProcess_humidityAssessor_Containers.scala, ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_Containers.scala, AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Cabin_Air_Care_SupervisorAirCarePreference_Payload: Z = -32

    val Cabin_Air_Care_SupervisorPreferenceValidity_Payload: Z = -31

    val Cabin_Air_Care_SupervisorAirCareIntent_Payload: Z = -30

    val Cabin_Air_Care_SupervisorCabinAirQuality_Payload: Z = -29

    val Cabin_Air_Care_SupervisorAirQualityValidity_Payload: Z = -28

    val Cabin_Air_Care_SupervisorAirAssessment_Payload: Z = -27

    val Cabin_Air_Care_SupervisorCabinHumidityBand_Payload: Z = -26

    val Cabin_Air_Care_SupervisorHumidityValidity_Payload: Z = -25

    val Cabin_Air_Care_SupervisorHumidityAssessment_Payload: Z = -24

    val Cabin_Air_Care_SupervisorMeasurementConfidence_Payload: Z = -23

    val Cabin_Air_Care_SupervisorAirTreatmentDirective_Payload: Z = -22

    val Cabin_Air_Care_SupervisorAirCareStatus_Payload: Z = -21

    val Cabin_Air_Care_SupervisorConfidenceMode_Payload: Z = -20

    val Base_TypesBoolean_Payload: Z = -19

    val Base_TypesInteger_Payload: Z = -18

    val Base_TypesInteger_8_Payload: Z = -17

    val Base_TypesInteger_16_Payload: Z = -16

    val Base_TypesInteger_32_Payload: Z = -15

    val Base_TypesInteger_64_Payload: Z = -14

    val Base_TypesUnsigned_8_Payload: Z = -13

    val Base_TypesUnsigned_16_Payload: Z = -12

    val Base_TypesUnsigned_32_Payload: Z = -11

    val Base_TypesUnsigned_64_Payload: Z = -10

    val Base_TypesFloat_Payload: Z = -9

    val Base_TypesFloat_32_Payload: Z = -8

    val Base_TypesFloat_64_Payload: Z = -7

    val Base_TypesCharacter_Payload: Z = -6

    val Base_TypesString_Payload: Z = -5

    val Base_TypesBits_Payload: Z = -4

    val Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P: Z = -3

    val Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS: Z = -2

    val Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P: Z = -1

    val Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS: Z = 0

    val Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P: Z = 1

    val Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS: Z = 2

    val Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P: Z = 3

    val Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS: Z = 4

    val Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P: Z = 5

    val Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS: Z = 6

    val Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P: Z = 7

    val Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS: Z = 8

    val Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P: Z = 9

    val Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS: Z = 10

    val Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P: Z = 11

    val Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS: Z = 12

    val Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P: Z = 13

    val Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS: Z = 14

    val Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P: Z = 15

    val Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS: Z = 16

    val utilEmptyContainer: Z = 17

    val _artEmpty: Z = 18

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeCabin_Air_Care_SupervisorAirCarePreferenceType(o: Cabin_Air_Care_Supervisor.AirCarePreference.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorAirCarePreference_Payload(o: Cabin_Air_Care_Supervisor.AirCarePreference_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirCarePreference_Payload)
      writeCabin_Air_Care_SupervisorAirCarePreferenceType(o.value)
    }

    def writeCabin_Air_Care_SupervisorPreferenceValidityType(o: Cabin_Air_Care_Supervisor.PreferenceValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorPreferenceValidity_Payload(o: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorPreferenceValidity_Payload)
      writeCabin_Air_Care_SupervisorPreferenceValidityType(o.value)
    }

    def writeCabin_Air_Care_SupervisorAirCareIntentType(o: Cabin_Air_Care_Supervisor.AirCareIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorAirCareIntent_Payload(o: Cabin_Air_Care_Supervisor.AirCareIntent_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirCareIntent_Payload)
      writeCabin_Air_Care_SupervisorAirCareIntentType(o.value)
    }

    def writeCabin_Air_Care_SupervisorCabinAirQualityType(o: Cabin_Air_Care_Supervisor.CabinAirQuality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorCabinAirQuality_Payload(o: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorCabinAirQuality_Payload)
      writeCabin_Air_Care_SupervisorCabinAirQualityType(o.value)
    }

    def writeCabin_Air_Care_SupervisorAirQualityValidityType(o: Cabin_Air_Care_Supervisor.AirQualityValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorAirQualityValidity_Payload(o: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirQualityValidity_Payload)
      writeCabin_Air_Care_SupervisorAirQualityValidityType(o.value)
    }

    def writeCabin_Air_Care_SupervisorAirAssessmentType(o: Cabin_Air_Care_Supervisor.AirAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorAirAssessment_Payload(o: Cabin_Air_Care_Supervisor.AirAssessment_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirAssessment_Payload)
      writeCabin_Air_Care_SupervisorAirAssessmentType(o.value)
    }

    def writeCabin_Air_Care_SupervisorCabinHumidityBandType(o: Cabin_Air_Care_Supervisor.CabinHumidityBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorCabinHumidityBand_Payload)
      writeCabin_Air_Care_SupervisorCabinHumidityBandType(o.value)
    }

    def writeCabin_Air_Care_SupervisorHumidityValidityType(o: Cabin_Air_Care_Supervisor.HumidityValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorHumidityValidity_Payload(o: Cabin_Air_Care_Supervisor.HumidityValidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorHumidityValidity_Payload)
      writeCabin_Air_Care_SupervisorHumidityValidityType(o.value)
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessmentType(o: Cabin_Air_Care_Supervisor.HumidityAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessment_Payload(o: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessment_Payload)
      writeCabin_Air_Care_SupervisorHumidityAssessmentType(o.value)
    }

    def writeCabin_Air_Care_SupervisorMeasurementConfidenceType(o: Cabin_Air_Care_Supervisor.MeasurementConfidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorMeasurementConfidence_Payload)
      writeCabin_Air_Care_SupervisorMeasurementConfidenceType(o.value)
    }

    def writeCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o: Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirTreatmentDirective_Payload)
      writeCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o.value)
    }

    def writeCabin_Air_Care_SupervisorAirCareStatusType(o: Cabin_Air_Care_Supervisor.AirCareStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorAirCareStatus_Payload(o: Cabin_Air_Care_Supervisor.AirCareStatus_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirCareStatus_Payload)
      writeCabin_Air_Care_SupervisorAirCareStatusType(o.value)
    }

    def writeCabin_Air_Care_SupervisorConfidenceModeType(o: Cabin_Air_Care_Supervisor.ConfidenceMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Care_SupervisorConfidenceMode_Payload(o: Cabin_Air_Care_Supervisor.ConfidenceMode_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorConfidenceMode_Payload)
      writeCabin_Air_Care_SupervisorConfidenceModeType(o.value)
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

    def writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P)
      writeCabin_Air_Care_SupervisorAirCarePreferenceType(o.api_airCarePreference)
      writeCabin_Air_Care_SupervisorPreferenceValidityType(o.api_preferenceValidity)
    }

    def writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS)
      writeCabin_Air_Care_SupervisorAirCarePreferenceType(o.api_airCarePreference)
      writeCabin_Air_Care_SupervisorPreferenceValidityType(o.api_preferenceValidity)
    }

    def writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P)
      writeCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent)
    }

    def writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS)
      writeCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent)
    }

    def writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P)
      writeCabin_Air_Care_SupervisorAirQualityValidityType(o.api_airQualityValidity)
      writeCabin_Air_Care_SupervisorCabinAirQualityType(o.api_cabinAirQuality)
    }

    def writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS)
      writeCabin_Air_Care_SupervisorAirQualityValidityType(o.api_airQualityValidity)
      writeCabin_Air_Care_SupervisorCabinAirQualityType(o.api_cabinAirQuality)
    }

    def writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P)
      writeCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)
    }

    def writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS)
      writeCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P)
      writeCabin_Air_Care_SupervisorCabinHumidityBandType(o.api_cabinHumidityBand)
      writeCabin_Air_Care_SupervisorHumidityValidityType(o.api_humidityValidity)
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS)
      writeCabin_Air_Care_SupervisorCabinHumidityBandType(o.api_cabinHumidityBand)
      writeCabin_Air_Care_SupervisorHumidityValidityType(o.api_humidityValidity)
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P)
      writeCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
    }

    def writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS)
      writeCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
    }

    def writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P)
      writeCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)
      writeCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
    }

    def writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS)
      writeCabin_Air_Care_SupervisorConfidenceModeType(o.In_confidenceMode)
      writeCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)
      writeCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
    }

    def writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P)
      writeCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence)
    }

    def writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS)
      writeCabin_Air_Care_SupervisorConfidenceModeType(o.confidenceMode)
      writeCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence)
    }

    def writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P)
      writeCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)
      writeCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent)
      writeCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
      writeCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence)
    }

    def writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS)
      writeCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)
      writeCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent)
      writeCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
      writeCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence)
    }

    def writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P)
      writeCabin_Air_Care_SupervisorAirCareStatusType(o.api_airCareStatus)
      writeCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o.api_airTreatmentDirective)
    }

    def writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS)
      writeCabin_Air_Care_SupervisorAirCareStatusType(o.api_airCareStatus)
      writeCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o.api_airTreatmentDirective)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
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
        case o: Cabin_Air_Care_Supervisor.AirCareIntent_Payload => writeCabin_Air_Care_SupervisorAirCareIntent_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirAssessment_Payload => writeCabin_Air_Care_SupervisorAirAssessment_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirCareStatus_Payload => writeCabin_Air_Care_SupervisorAirCareStatus_Payload(o)
        case o: Cabin_Air_Care_Supervisor.ConfidenceMode_Payload => writeCabin_Air_Care_SupervisorConfidenceMode_Payload(o)
        case o: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload => writeCabin_Air_Care_SupervisorCabinAirQuality_Payload(o)
        case o: Cabin_Air_Care_Supervisor.HumidityValidity_Payload => writeCabin_Air_Care_SupervisorHumidityValidity_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePreference_Payload => writeCabin_Air_Care_SupervisorAirCarePreference_Payload(o)
        case o: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload => writeCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload => writeCabin_Air_Care_SupervisorPreferenceValidity_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload => writeCabin_Air_Care_SupervisorAirQualityValidity_Payload(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload => writeCabin_Air_Care_SupervisorHumidityAssessment_Payload(o)
        case o: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload => writeCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload => writeCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
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

    def readCabin_Air_Care_SupervisorAirCarePreferenceType(): Cabin_Air_Care_Supervisor.AirCarePreference.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.AirCarePreference.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorAirCarePreference_Payload(): Cabin_Air_Care_Supervisor.AirCarePreference_Payload = {
      val r = readCabin_Air_Care_SupervisorAirCarePreference_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirCarePreference_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePreference_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirCarePreference_Payload)
      }
      val value = readCabin_Air_Care_SupervisorAirCarePreferenceType()
      return Cabin_Air_Care_Supervisor.AirCarePreference_Payload(value)
    }

    def readCabin_Air_Care_SupervisorPreferenceValidityType(): Cabin_Air_Care_Supervisor.PreferenceValidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.PreferenceValidity.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorPreferenceValidity_Payload(): Cabin_Air_Care_Supervisor.PreferenceValidity_Payload = {
      val r = readCabin_Air_Care_SupervisorPreferenceValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorPreferenceValidity_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorPreferenceValidity_Payload)
      }
      val value = readCabin_Air_Care_SupervisorPreferenceValidityType()
      return Cabin_Air_Care_Supervisor.PreferenceValidity_Payload(value)
    }

    def readCabin_Air_Care_SupervisorAirCareIntentType(): Cabin_Air_Care_Supervisor.AirCareIntent.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.AirCareIntent.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorAirCareIntent_Payload(): Cabin_Air_Care_Supervisor.AirCareIntent_Payload = {
      val r = readCabin_Air_Care_SupervisorAirCareIntent_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirCareIntent_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCareIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirCareIntent_Payload)
      }
      val value = readCabin_Air_Care_SupervisorAirCareIntentType()
      return Cabin_Air_Care_Supervisor.AirCareIntent_Payload(value)
    }

    def readCabin_Air_Care_SupervisorCabinAirQualityType(): Cabin_Air_Care_Supervisor.CabinAirQuality.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.CabinAirQuality.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorCabinAirQuality_Payload(): Cabin_Air_Care_Supervisor.CabinAirQuality_Payload = {
      val r = readCabin_Air_Care_SupervisorCabinAirQuality_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorCabinAirQuality_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.CabinAirQuality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorCabinAirQuality_Payload)
      }
      val value = readCabin_Air_Care_SupervisorCabinAirQualityType()
      return Cabin_Air_Care_Supervisor.CabinAirQuality_Payload(value)
    }

    def readCabin_Air_Care_SupervisorAirQualityValidityType(): Cabin_Air_Care_Supervisor.AirQualityValidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.AirQualityValidity.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorAirQualityValidity_Payload(): Cabin_Air_Care_Supervisor.AirQualityValidity_Payload = {
      val r = readCabin_Air_Care_SupervisorAirQualityValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirQualityValidity_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirQualityValidity_Payload)
      }
      val value = readCabin_Air_Care_SupervisorAirQualityValidityType()
      return Cabin_Air_Care_Supervisor.AirQualityValidity_Payload(value)
    }

    def readCabin_Air_Care_SupervisorAirAssessmentType(): Cabin_Air_Care_Supervisor.AirAssessment.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.AirAssessment.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorAirAssessment_Payload(): Cabin_Air_Care_Supervisor.AirAssessment_Payload = {
      val r = readCabin_Air_Care_SupervisorAirAssessment_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirAssessment_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirAssessment_Payload)
      }
      val value = readCabin_Air_Care_SupervisorAirAssessmentType()
      return Cabin_Air_Care_Supervisor.AirAssessment_Payload(value)
    }

    def readCabin_Air_Care_SupervisorCabinHumidityBandType(): Cabin_Air_Care_Supervisor.CabinHumidityBand.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.CabinHumidityBand.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorCabinHumidityBand_Payload(): Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload = {
      val r = readCabin_Air_Care_SupervisorCabinHumidityBand_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorCabinHumidityBand_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorCabinHumidityBand_Payload)
      }
      val value = readCabin_Air_Care_SupervisorCabinHumidityBandType()
      return Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload(value)
    }

    def readCabin_Air_Care_SupervisorHumidityValidityType(): Cabin_Air_Care_Supervisor.HumidityValidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.HumidityValidity.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorHumidityValidity_Payload(): Cabin_Air_Care_Supervisor.HumidityValidity_Payload = {
      val r = readCabin_Air_Care_SupervisorHumidityValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorHumidityValidity_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorHumidityValidity_Payload)
      }
      val value = readCabin_Air_Care_SupervisorHumidityValidityType()
      return Cabin_Air_Care_Supervisor.HumidityValidity_Payload(value)
    }

    def readCabin_Air_Care_SupervisorHumidityAssessmentType(): Cabin_Air_Care_Supervisor.HumidityAssessment.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.HumidityAssessment.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorHumidityAssessment_Payload(): Cabin_Air_Care_Supervisor.HumidityAssessment_Payload = {
      val r = readCabin_Air_Care_SupervisorHumidityAssessment_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorHumidityAssessment_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessment_Payload)
      }
      val value = readCabin_Air_Care_SupervisorHumidityAssessmentType()
      return Cabin_Air_Care_Supervisor.HumidityAssessment_Payload(value)
    }

    def readCabin_Air_Care_SupervisorMeasurementConfidenceType(): Cabin_Air_Care_Supervisor.MeasurementConfidence.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.MeasurementConfidence.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorMeasurementConfidence_Payload(): Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload = {
      val r = readCabin_Air_Care_SupervisorMeasurementConfidence_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorMeasurementConfidence_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorMeasurementConfidence_Payload)
      }
      val value = readCabin_Air_Care_SupervisorMeasurementConfidenceType()
      return Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload(value)
    }

    def readCabin_Air_Care_SupervisorAirTreatmentDirectiveType(): Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.AirTreatmentDirective.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(): Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload = {
      val r = readCabin_Air_Care_SupervisorAirTreatmentDirective_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirTreatmentDirective_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirTreatmentDirective_Payload)
      }
      val value = readCabin_Air_Care_SupervisorAirTreatmentDirectiveType()
      return Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload(value)
    }

    def readCabin_Air_Care_SupervisorAirCareStatusType(): Cabin_Air_Care_Supervisor.AirCareStatus.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.AirCareStatus.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorAirCareStatus_Payload(): Cabin_Air_Care_Supervisor.AirCareStatus_Payload = {
      val r = readCabin_Air_Care_SupervisorAirCareStatus_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirCareStatus_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCareStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirCareStatus_Payload)
      }
      val value = readCabin_Air_Care_SupervisorAirCareStatusType()
      return Cabin_Air_Care_Supervisor.AirCareStatus_Payload(value)
    }

    def readCabin_Air_Care_SupervisorConfidenceModeType(): Cabin_Air_Care_Supervisor.ConfidenceMode.Type = {
      val r = reader.readZ()
      return Cabin_Air_Care_Supervisor.ConfidenceMode.byOrdinal(r).get
    }

    def readCabin_Air_Care_SupervisorConfidenceMode_Payload(): Cabin_Air_Care_Supervisor.ConfidenceMode_Payload = {
      val r = readCabin_Air_Care_SupervisorConfidenceMode_PayloadT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorConfidenceMode_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.ConfidenceMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorConfidenceMode_Payload)
      }
      val value = readCabin_Air_Care_SupervisorConfidenceModeType()
      return Cabin_Air_Care_Supervisor.ConfidenceMode_Payload(value)
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

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container.")
          val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P = {
      val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P)
      }
      val api_airCarePreference = readCabin_Air_Care_SupervisorAirCarePreferenceType()
      val api_preferenceValidity = readCabin_Air_Care_SupervisorPreferenceValidityType()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(api_airCarePreference, api_preferenceValidity)
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS)
      }
      val api_airCarePreference = readCabin_Air_Care_SupervisorAirCarePreferenceType()
      val api_preferenceValidity = readCabin_Air_Care_SupervisorPreferenceValidityType()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(api_airCarePreference, api_preferenceValidity)
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container.")
          val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P = {
      val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P)
      }
      val api_airCareIntent = readCabin_Air_Care_SupervisorAirCareIntentType()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(api_airCareIntent)
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS)
      }
      val api_airCareIntent = readCabin_Air_Care_SupervisorAirCareIntentType()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(api_airCareIntent)
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container.")
          val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P = {
      val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P)
      }
      val api_airQualityValidity = readCabin_Air_Care_SupervisorAirQualityValidityType()
      val api_cabinAirQuality = readCabin_Air_Care_SupervisorCabinAirQualityType()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(api_airQualityValidity, api_cabinAirQuality)
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS)
      }
      val api_airQualityValidity = readCabin_Air_Care_SupervisorAirQualityValidityType()
      val api_cabinAirQuality = readCabin_Air_Care_SupervisorCabinAirQualityType()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(api_airQualityValidity, api_cabinAirQuality)
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container.")
          val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P = {
      val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P)
      }
      val api_airAssessment = readCabin_Air_Care_SupervisorAirAssessmentType()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(api_airAssessment)
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS)
      }
      val api_airAssessment = readCabin_Air_Care_SupervisorAirAssessmentType()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(api_airAssessment)
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container.")
          val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P = {
      val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P)
      }
      val api_cabinHumidityBand = readCabin_Air_Care_SupervisorCabinHumidityBandType()
      val api_humidityValidity = readCabin_Air_Care_SupervisorHumidityValidityType()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(api_cabinHumidityBand, api_humidityValidity)
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS)
      }
      val api_cabinHumidityBand = readCabin_Air_Care_SupervisorCabinHumidityBandType()
      val api_humidityValidity = readCabin_Air_Care_SupervisorHumidityValidityType()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(api_cabinHumidityBand, api_humidityValidity)
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container.")
          val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P = {
      val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P)
      }
      val api_humidityAssessment = readCabin_Air_Care_SupervisorHumidityAssessmentType()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(api_humidityAssessment)
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS)
      }
      val api_humidityAssessment = readCabin_Air_Care_SupervisorHumidityAssessmentType()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(api_humidityAssessment)
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container.")
          val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P = {
      val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P)
      }
      val api_airAssessment = readCabin_Air_Care_SupervisorAirAssessmentType()
      val api_humidityAssessment = readCabin_Air_Care_SupervisorHumidityAssessmentType()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(api_airAssessment, api_humidityAssessment)
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS)
      }
      val In_confidenceMode = readCabin_Air_Care_SupervisorConfidenceModeType()
      val api_airAssessment = readCabin_Air_Care_SupervisorAirAssessmentType()
      val api_humidityAssessment = readCabin_Air_Care_SupervisorHumidityAssessmentType()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(In_confidenceMode, api_airAssessment, api_humidityAssessment)
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container.")
          val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P = {
      val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P)
      }
      val api_measurementConfidence = readCabin_Air_Care_SupervisorMeasurementConfidenceType()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(api_measurementConfidence)
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS)
      }
      val confidenceMode = readCabin_Air_Care_SupervisorConfidenceModeType()
      val api_measurementConfidence = readCabin_Air_Care_SupervisorMeasurementConfidenceType()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(confidenceMode, api_measurementConfidence)
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container.")
          val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P = {
      val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P)
      }
      val api_airAssessment = readCabin_Air_Care_SupervisorAirAssessmentType()
      val api_airCareIntent = readCabin_Air_Care_SupervisorAirCareIntentType()
      val api_humidityAssessment = readCabin_Air_Care_SupervisorHumidityAssessmentType()
      val api_measurementConfidence = readCabin_Air_Care_SupervisorMeasurementConfidenceType()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(api_airAssessment, api_airCareIntent, api_humidityAssessment, api_measurementConfidence)
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS)
      }
      val api_airAssessment = readCabin_Air_Care_SupervisorAirAssessmentType()
      val api_airCareIntent = readCabin_Air_Care_SupervisorAirCareIntentType()
      val api_humidityAssessment = readCabin_Air_Care_SupervisorHumidityAssessmentType()
      val api_measurementConfidence = readCabin_Air_Care_SupervisorMeasurementConfidenceType()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(api_airAssessment, api_airCareIntent, api_humidityAssessment, api_measurementConfidence)
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container.")
          val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P = {
      val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P)
      }
      val api_airCareStatus = readCabin_Air_Care_SupervisorAirCareStatusType()
      val api_airTreatmentDirective = readCabin_Air_Care_SupervisorAirTreatmentDirectiveType()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(api_airCareStatus, api_airTreatmentDirective)
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS = {
      val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS)
      }
      val api_airCareStatus = readCabin_Air_Care_SupervisorAirCareStatusType()
      val api_airTreatmentDirective = readCabin_Air_Care_SupervisorAirTreatmentDirectiveType()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(api_airCareStatus, api_airTreatmentDirective)
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
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T)
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
        case Constants.Cabin_Air_Care_SupervisorAirCareIntent_Payload => val r = readCabin_Air_Care_SupervisorAirCareIntent_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirAssessment_Payload => val r = readCabin_Air_Care_SupervisorAirAssessment_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCareStatus_Payload => val r = readCabin_Air_Care_SupervisorAirCareStatus_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorConfidenceMode_Payload => val r = readCabin_Air_Care_SupervisorConfidenceMode_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorCabinAirQuality_Payload => val r = readCabin_Air_Care_SupervisorCabinAirQuality_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityValidity_Payload => val r = readCabin_Air_Care_SupervisorHumidityValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePreference_Payload => val r = readCabin_Air_Care_SupervisorAirCarePreference_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorCabinHumidityBand_Payload => val r = readCabin_Air_Care_SupervisorCabinHumidityBand_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceValidity_Payload => val r = readCabin_Air_Care_SupervisorPreferenceValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityValidity_Payload => val r = readCabin_Air_Care_SupervisorAirQualityValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessment_Payload => val r = readCabin_Air_Care_SupervisorHumidityAssessment_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorMeasurementConfidence_Payload => val r = readCabin_Air_Care_SupervisorMeasurementConfidence_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirTreatmentDirective_Payload => val r = readCabin_Air_Care_SupervisorAirTreatmentDirective_PayloadT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T)
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

  def fromCabin_Air_Care_SupervisorAirCarePreference_Payload(o: Cabin_Air_Care_Supervisor.AirCarePreference_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCarePreference_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCarePreference_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCarePreference_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePreference_Payload(reader: Reader): Cabin_Air_Care_Supervisor.AirCarePreference_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorAirCarePreference_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCarePreference_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceValidity_Payload(o: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorPreferenceValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorPreferenceValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.PreferenceValidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceValidity_Payload(reader: Reader): Cabin_Air_Care_Supervisor.PreferenceValidity_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorPreferenceValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorPreferenceValidity_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCareIntent_Payload(o: Cabin_Air_Care_Supervisor.AirCareIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCareIntent_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCareIntent_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCareIntent_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCareIntent_Payload(reader: Reader): Cabin_Air_Care_Supervisor.AirCareIntent_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorAirCareIntent_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCareIntent_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorCabinAirQuality_Payload(o: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorCabinAirQuality_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorCabinAirQuality_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.CabinAirQuality_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorCabinAirQuality_Payload(reader: Reader): Cabin_Air_Care_Supervisor.CabinAirQuality_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorCabinAirQuality_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorCabinAirQuality_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityValidity_Payload(o: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirQualityValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirQualityValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirQualityValidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityValidity_Payload(reader: Reader): Cabin_Air_Care_Supervisor.AirQualityValidity_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorAirQualityValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirQualityValidity_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirAssessment_Payload(o: Cabin_Air_Care_Supervisor.AirAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirAssessment_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirAssessment_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirAssessment_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirAssessment_Payload(reader: Reader): Cabin_Air_Care_Supervisor.AirAssessment_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorAirAssessment_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirAssessment_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorCabinHumidityBand_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorCabinHumidityBand_Payload(reader: Reader): Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorCabinHumidityBand_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorCabinHumidityBand_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityValidity_Payload(o: Cabin_Air_Care_Supervisor.HumidityValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityValidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityValidity_Payload(reader: Reader): Cabin_Air_Care_Supervisor.HumidityValidity_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityValidity_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessment_Payload(o: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityAssessment_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityAssessment_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityAssessment_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessment_Payload(reader: Reader): Cabin_Air_Care_Supervisor.HumidityAssessment_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityAssessment_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityAssessment_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorMeasurementConfidence_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorMeasurementConfidence_Payload(reader: Reader): Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorMeasurementConfidence_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorMeasurementConfidence_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(reader: Reader): Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorAirTreatmentDirective_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirTreatmentDirective_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCareStatus_Payload(o: Cabin_Air_Care_Supervisor.AirCareStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCareStatus_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCareStatus_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCareStatus_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCareStatus_Payload(reader: Reader): Cabin_Air_Care_Supervisor.AirCareStatus_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorAirCareStatus_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCareStatus_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorConfidenceMode_Payload(o: Cabin_Air_Care_Supervisor.ConfidenceMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorConfidenceMode_Payload(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorConfidenceMode_Payload(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.ConfidenceMode_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorConfidenceMode_Payload(reader: Reader): Cabin_Air_Care_Supervisor.ConfidenceMode_Payload = {
      val r = reader.readCabin_Air_Care_SupervisorConfidenceMode_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorConfidenceMode_Payload _)
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

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(reader: Reader): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(reader: Reader): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(reader: Reader): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(reader: Reader): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(reader: Reader): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(reader: Reader): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(reader: Reader): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(reader: Reader): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(reader: Reader): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(reader: Reader): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container = {
      val r = reader.readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(reader: Reader): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P = {
      val r = reader.readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(reader: Reader): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS = {
      val r = reader.readCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS _)
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