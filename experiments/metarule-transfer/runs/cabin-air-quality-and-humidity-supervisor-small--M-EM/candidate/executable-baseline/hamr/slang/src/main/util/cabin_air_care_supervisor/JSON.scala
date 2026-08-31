// #Sireum
// @formatter:off

// This file is auto-generated from AirCarePreference.scala, PreferenceValidity.scala, AirCareIntent.scala, CabinAirQuality.scala, AirQualityValidity.scala, AirAssessment.scala, CabinHumidityBand.scala, HumidityValidity.scala, HumidityAssessment.scala, MeasurementConfidence.scala, AirTreatmentDirective.scala, AirCareStatus.scala, Base_Types.scala, PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_Containers.scala, AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Containers.scala, HumidityAssessor_airCareSupervisionProcess_humidityAssessor_Containers.scala, ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_Containers.scala, AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package cabin_air_care_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printCabin_Air_Care_SupervisorAirCarePreferenceType(o: Cabin_Air_Care_Supervisor.AirCarePreference.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.AirCarePreference.Off => "Off"
        case Cabin_Air_Care_Supervisor.AirCarePreference.Auto => "Auto"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.AirCarePreference")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCarePreference_Payload(o: Cabin_Air_Care_Supervisor.AirCarePreference_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirCarePreference_Payload""""),
        ("value", printCabin_Air_Care_SupervisorAirCarePreferenceType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorPreferenceValidityType(o: Cabin_Air_Care_Supervisor.PreferenceValidity.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.PreferenceValidity.Valid => "Valid"
        case Cabin_Air_Care_Supervisor.PreferenceValidity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.PreferenceValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorPreferenceValidity_Payload(o: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.PreferenceValidity_Payload""""),
        ("value", printCabin_Air_Care_SupervisorPreferenceValidityType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCareIntentType(o: Cabin_Air_Care_Supervisor.AirCareIntent.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.AirCareIntent.Disabled => "Disabled"
        case Cabin_Air_Care_Supervisor.AirCareIntent.Enabled => "Enabled"
        case Cabin_Air_Care_Supervisor.AirCareIntent.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.AirCareIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCareIntent_Payload(o: Cabin_Air_Care_Supervisor.AirCareIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirCareIntent_Payload""""),
        ("value", printCabin_Air_Care_SupervisorAirCareIntentType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorCabinAirQualityType(o: Cabin_Air_Care_Supervisor.CabinAirQuality.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.CabinAirQuality.Acceptable => "Acceptable"
        case Cabin_Air_Care_Supervisor.CabinAirQuality.Polluted => "Polluted"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.CabinAirQuality")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorCabinAirQuality_Payload(o: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.CabinAirQuality_Payload""""),
        ("value", printCabin_Air_Care_SupervisorCabinAirQualityType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityValidityType(o: Cabin_Air_Care_Supervisor.AirQualityValidity.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.AirQualityValidity.Valid => "Valid"
        case Cabin_Air_Care_Supervisor.AirQualityValidity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.AirQualityValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityValidity_Payload(o: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirQualityValidity_Payload""""),
        ("value", printCabin_Air_Care_SupervisorAirQualityValidityType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirAssessmentType(o: Cabin_Air_Care_Supervisor.AirAssessment.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.AirAssessment.Acceptable => "Acceptable"
        case Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded => "FilterNeeded"
        case Cabin_Air_Care_Supervisor.AirAssessment.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.AirAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirAssessment_Payload(o: Cabin_Air_Care_Supervisor.AirAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirAssessment_Payload""""),
        ("value", printCabin_Air_Care_SupervisorAirAssessmentType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorCabinHumidityBandType(o: Cabin_Air_Care_Supervisor.CabinHumidityBand.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.CabinHumidityBand.Low => "Low"
        case Cabin_Air_Care_Supervisor.CabinHumidityBand.Target => "Target"
        case Cabin_Air_Care_Supervisor.CabinHumidityBand.High => "High"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.CabinHumidityBand")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload""""),
        ("value", printCabin_Air_Care_SupervisorCabinHumidityBandType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityValidityType(o: Cabin_Air_Care_Supervisor.HumidityValidity.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.HumidityValidity.Valid => "Valid"
        case Cabin_Air_Care_Supervisor.HumidityValidity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.HumidityValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityValidity_Payload(o: Cabin_Air_Care_Supervisor.HumidityValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.HumidityValidity_Payload""""),
        ("value", printCabin_Air_Care_SupervisorHumidityValidityType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessmentType(o: Cabin_Air_Care_Supervisor.HumidityAssessment.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture => "AddMoisture"
        case Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget => "AtTarget"
        case Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture => "RemoveMoisture"
        case Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.HumidityAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessment_Payload(o: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.HumidityAssessment_Payload""""),
        ("value", printCabin_Air_Care_SupervisorHumidityAssessmentType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorMeasurementConfidenceType(o: Cabin_Air_Care_Supervisor.MeasurementConfidence.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted => "Trusted"
        case Cabin_Air_Care_Supervisor.MeasurementConfidence.BlockedInvalid => "BlockedInvalid"
        case Cabin_Air_Care_Supervisor.MeasurementConfidence.Confirming => "Confirming"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.MeasurementConfidence")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload""""),
        ("value", printCabin_Air_Care_SupervisorMeasurementConfidenceType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o: Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby => "Standby"
        case Cabin_Air_Care_Supervisor.AirTreatmentDirective.Filter => "Filter"
        case Cabin_Air_Care_Supervisor.AirTreatmentDirective.HumidifyWithFilter => "HumidifyWithFilter"
        case Cabin_Air_Care_Supervisor.AirTreatmentDirective.DehumidifyWithFilter => "DehumidifyWithFilter"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.AirTreatmentDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload""""),
        ("value", printCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o.value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCareStatusType(o: Cabin_Air_Care_Supervisor.AirCareStatus.Type): ST = {
      val value: String = o match {
        case Cabin_Air_Care_Supervisor.AirCareStatus.Off => "Off"
        case Cabin_Air_Care_Supervisor.AirCareStatus.Standby => "Standby"
        case Cabin_Air_Care_Supervisor.AirCareStatus.Filtering => "Filtering"
        case Cabin_Air_Care_Supervisor.AirCareStatus.Humidifying => "Humidifying"
        case Cabin_Air_Care_Supervisor.AirCareStatus.Dehumidifying => "Dehumidifying"
        case Cabin_Air_Care_Supervisor.AirCareStatus.PreferenceFault => "PreferenceFault"
        case Cabin_Air_Care_Supervisor.AirCareStatus.InputFault => "InputFault"
        case Cabin_Air_Care_Supervisor.AirCareStatus.Recovering => "Recovering"
      }
      return printObject(ISZ(
        ("type", printString("Cabin_Air_Care_Supervisor.AirCareStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCareStatus_Payload(o: Cabin_Air_Care_Supervisor.AirCareStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirCareStatus_Payload""""),
        ("value", printCabin_Air_Care_SupervisorAirCareStatusType(o.value))
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

    @pure def printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P""""),
        ("api_airCarePreference", printCabin_Air_Care_SupervisorAirCarePreferenceType(o.api_airCarePreference)),
        ("api_preferenceValidity", printCabin_Air_Care_SupervisorPreferenceValidityType(o.api_preferenceValidity))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS""""),
        ("api_airCarePreference", printCabin_Air_Care_SupervisorAirCarePreferenceType(o.api_airCarePreference)),
        ("api_preferenceValidity", printCabin_Air_Care_SupervisorPreferenceValidityType(o.api_preferenceValidity))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P""""),
        ("api_airCareIntent", printCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS""""),
        ("api_airCareIntent", printCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P""""),
        ("api_airQualityValidity", printCabin_Air_Care_SupervisorAirQualityValidityType(o.api_airQualityValidity)),
        ("api_cabinAirQuality", printCabin_Air_Care_SupervisorCabinAirQualityType(o.api_cabinAirQuality))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS""""),
        ("api_airQualityValidity", printCabin_Air_Care_SupervisorAirQualityValidityType(o.api_airQualityValidity)),
        ("api_cabinAirQuality", printCabin_Air_Care_SupervisorCabinAirQualityType(o.api_cabinAirQuality))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P""""),
        ("api_airAssessment", printCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS""""),
        ("api_airAssessment", printCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P""""),
        ("api_cabinHumidityBand", printCabin_Air_Care_SupervisorCabinHumidityBandType(o.api_cabinHumidityBand)),
        ("api_humidityValidity", printCabin_Air_Care_SupervisorHumidityValidityType(o.api_humidityValidity))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS""""),
        ("api_cabinHumidityBand", printCabin_Air_Care_SupervisorCabinHumidityBandType(o.api_cabinHumidityBand)),
        ("api_humidityValidity", printCabin_Air_Care_SupervisorHumidityValidityType(o.api_humidityValidity))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P""""),
        ("api_humidityAssessment", printCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS""""),
        ("api_humidityAssessment", printCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P""""),
        ("api_airAssessment", printCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)),
        ("api_humidityAssessment", printCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS""""),
        ("api_airAssessment", printCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)),
        ("api_humidityAssessment", printCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P""""),
        ("api_measurementConfidence", printCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS""""),
        ("api_measurementConfidence", printCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P""""),
        ("api_airAssessment", printCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)),
        ("api_airCareIntent", printCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent)),
        ("api_humidityAssessment", printCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)),
        ("api_measurementConfidence", printCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS""""),
        ("api_airAssessment", printCabin_Air_Care_SupervisorAirAssessmentType(o.api_airAssessment)),
        ("api_airCareIntent", printCabin_Air_Care_SupervisorAirCareIntentType(o.api_airCareIntent)),
        ("api_humidityAssessment", printCabin_Air_Care_SupervisorHumidityAssessmentType(o.api_humidityAssessment)),
        ("api_measurementConfidence", printCabin_Air_Care_SupervisorMeasurementConfidenceType(o.api_measurementConfidence))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container): ST = {
      o match {
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
      }
    }

    @pure def printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P""""),
        ("api_airCareStatus", printCabin_Air_Care_SupervisorAirCareStatusType(o.api_airCareStatus)),
        ("api_airTreatmentDirective", printCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o.api_airTreatmentDirective))
      ))
    }

    @pure def printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS""""),
        ("api_airCareStatus", printCabin_Air_Care_SupervisorAirCareStatusType(o.api_airCareStatus)),
        ("api_airTreatmentDirective", printCabin_Air_Care_SupervisorAirTreatmentDirectiveType(o.api_airTreatmentDirective))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_preferenceInterpreter_postInit => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_preferenceInterpreter_postInit"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_preferenceInterpreter_preCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_preferenceInterpreter_preCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_preferenceInterpreter_postCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_preferenceInterpreter_postCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airQualityAssessor_postInit => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airQualityAssessor_postInit"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airQualityAssessor_preCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airQualityAssessor_preCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airQualityAssessor_postCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airQualityAssessor_postCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_humidityAssessor_postInit => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_humidityAssessor_postInit"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_humidityAssessor_preCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_humidityAssessor_preCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_humidityAssessor_postCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_humidityAssessor_postCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_observationConfidenceGuardian_postInit => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_observationConfidenceGuardian_postInit"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_observationConfidenceGuardian_preCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_observationConfidenceGuardian_preCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_observationConfidenceGuardian_postCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_observationConfidenceGuardian_postCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airCarePolicySupervisor_postInit => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airCarePolicySupervisor_postInit"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airCarePolicySupervisor_preCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airCarePolicySupervisor_preCompute"
        case runtimemonitor.ObservationKind.CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airCarePolicySupervisor_postCompute => "CabinAirCareSupervisor_Instance_airCareSupervisionProcess_airCarePolicySupervisor_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
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
        case o: Cabin_Air_Care_Supervisor.AirCareIntent_Payload => return printCabin_Air_Care_SupervisorAirCareIntent_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirAssessment_Payload => return printCabin_Air_Care_SupervisorAirAssessment_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirCareStatus_Payload => return printCabin_Air_Care_SupervisorAirCareStatus_Payload(o)
        case o: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload => return printCabin_Air_Care_SupervisorCabinAirQuality_Payload(o)
        case o: Cabin_Air_Care_Supervisor.HumidityValidity_Payload => return printCabin_Air_Care_SupervisorHumidityValidity_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePreference_Payload => return printCabin_Air_Care_SupervisorAirCarePreference_Payload(o)
        case o: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload => return printCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload => return printCabin_Air_Care_SupervisorPreferenceValidity_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload => return printCabin_Air_Care_SupervisorAirQualityValidity_Payload(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload => return printCabin_Air_Care_SupervisorHumidityAssessment_Payload(o)
        case o: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload => return printCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o)
        case o: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload => return printCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => return printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => return printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => return printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => return printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
        case o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => return printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
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

    def parseCabin_Air_Care_SupervisorAirCarePreferenceType(): Cabin_Air_Care_Supervisor.AirCarePreference.Type = {
      val r = parseCabin_Air_Care_SupervisorAirCarePreferenceT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCarePreferenceT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePreference.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCarePreference")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.AirCarePreference.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.AirCarePreference.")
          return Cabin_Air_Care_Supervisor.AirCarePreference.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorAirCarePreference_Payload(): Cabin_Air_Care_Supervisor.AirCarePreference_Payload = {
      val r = parseCabin_Air_Care_SupervisorAirCarePreference_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCarePreference_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePreference_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCarePreference_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorAirCarePreferenceType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirCarePreference_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorPreferenceValidityType(): Cabin_Air_Care_Supervisor.PreferenceValidity.Type = {
      val r = parseCabin_Air_Care_SupervisorPreferenceValidityT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorPreferenceValidityT(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.PreferenceValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.PreferenceValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.PreferenceValidity.")
          return Cabin_Air_Care_Supervisor.PreferenceValidity.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorPreferenceValidity_Payload(): Cabin_Air_Care_Supervisor.PreferenceValidity_Payload = {
      val r = parseCabin_Air_Care_SupervisorPreferenceValidity_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorPreferenceValidity_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.PreferenceValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorPreferenceValidityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.PreferenceValidity_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorAirCareIntentType(): Cabin_Air_Care_Supervisor.AirCareIntent.Type = {
      val r = parseCabin_Air_Care_SupervisorAirCareIntentT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCareIntentT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCareIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCareIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.AirCareIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.AirCareIntent.")
          return Cabin_Air_Care_Supervisor.AirCareIntent.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorAirCareIntent_Payload(): Cabin_Air_Care_Supervisor.AirCareIntent_Payload = {
      val r = parseCabin_Air_Care_SupervisorAirCareIntent_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCareIntent_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCareIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCareIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorAirCareIntentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirCareIntent_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorCabinAirQualityType(): Cabin_Air_Care_Supervisor.CabinAirQuality.Type = {
      val r = parseCabin_Air_Care_SupervisorCabinAirQualityT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorCabinAirQualityT(typeParsed: B): Cabin_Air_Care_Supervisor.CabinAirQuality.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.CabinAirQuality")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.CabinAirQuality.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.CabinAirQuality.")
          return Cabin_Air_Care_Supervisor.CabinAirQuality.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorCabinAirQuality_Payload(): Cabin_Air_Care_Supervisor.CabinAirQuality_Payload = {
      val r = parseCabin_Air_Care_SupervisorCabinAirQuality_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorCabinAirQuality_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.CabinAirQuality_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.CabinAirQuality_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorCabinAirQualityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.CabinAirQuality_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorAirQualityValidityType(): Cabin_Air_Care_Supervisor.AirQualityValidity.Type = {
      val r = parseCabin_Air_Care_SupervisorAirQualityValidityT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirQualityValidityT(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirQualityValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.AirQualityValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.AirQualityValidity.")
          return Cabin_Air_Care_Supervisor.AirQualityValidity.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorAirQualityValidity_Payload(): Cabin_Air_Care_Supervisor.AirQualityValidity_Payload = {
      val r = parseCabin_Air_Care_SupervisorAirQualityValidity_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirQualityValidity_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirQualityValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorAirQualityValidityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirQualityValidity_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorAirAssessmentType(): Cabin_Air_Care_Supervisor.AirAssessment.Type = {
      val r = parseCabin_Air_Care_SupervisorAirAssessmentT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirAssessmentT(typeParsed: B): Cabin_Air_Care_Supervisor.AirAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.AirAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.AirAssessment.")
          return Cabin_Air_Care_Supervisor.AirAssessment.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorAirAssessment_Payload(): Cabin_Air_Care_Supervisor.AirAssessment_Payload = {
      val r = parseCabin_Air_Care_SupervisorAirAssessment_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirAssessment_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorAirAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirAssessment_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorCabinHumidityBandType(): Cabin_Air_Care_Supervisor.CabinHumidityBand.Type = {
      val r = parseCabin_Air_Care_SupervisorCabinHumidityBandT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorCabinHumidityBandT(typeParsed: B): Cabin_Air_Care_Supervisor.CabinHumidityBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.CabinHumidityBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.CabinHumidityBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.CabinHumidityBand.")
          return Cabin_Air_Care_Supervisor.CabinHumidityBand.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorCabinHumidityBand_Payload(): Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload = {
      val r = parseCabin_Air_Care_SupervisorCabinHumidityBand_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorCabinHumidityBand_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorCabinHumidityBandType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorHumidityValidityType(): Cabin_Air_Care_Supervisor.HumidityValidity.Type = {
      val r = parseCabin_Air_Care_SupervisorHumidityValidityT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityValidityT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.HumidityValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.HumidityValidity.")
          return Cabin_Air_Care_Supervisor.HumidityValidity.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorHumidityValidity_Payload(): Cabin_Air_Care_Supervisor.HumidityValidity_Payload = {
      val r = parseCabin_Air_Care_SupervisorHumidityValidity_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityValidity_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorHumidityValidityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.HumidityValidity_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessmentType(): Cabin_Air_Care_Supervisor.HumidityAssessment.Type = {
      val r = parseCabin_Air_Care_SupervisorHumidityAssessmentT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessmentT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.HumidityAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.HumidityAssessment.")
          return Cabin_Air_Care_Supervisor.HumidityAssessment.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessment_Payload(): Cabin_Air_Care_Supervisor.HumidityAssessment_Payload = {
      val r = parseCabin_Air_Care_SupervisorHumidityAssessment_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessment_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorHumidityAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.HumidityAssessment_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorMeasurementConfidenceType(): Cabin_Air_Care_Supervisor.MeasurementConfidence.Type = {
      val r = parseCabin_Air_Care_SupervisorMeasurementConfidenceT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorMeasurementConfidenceT(typeParsed: B): Cabin_Air_Care_Supervisor.MeasurementConfidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.MeasurementConfidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.MeasurementConfidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.MeasurementConfidence.")
          return Cabin_Air_Care_Supervisor.MeasurementConfidence.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorMeasurementConfidence_Payload(): Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload = {
      val r = parseCabin_Air_Care_SupervisorMeasurementConfidence_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorMeasurementConfidence_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorMeasurementConfidenceType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorAirTreatmentDirectiveType(): Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type = {
      val r = parseCabin_Air_Care_SupervisorAirTreatmentDirectiveT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirTreatmentDirectiveT(typeParsed: B): Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirTreatmentDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.AirTreatmentDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.AirTreatmentDirective.")
          return Cabin_Air_Care_Supervisor.AirTreatmentDirective.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(): Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload = {
      val r = parseCabin_Air_Care_SupervisorAirTreatmentDirective_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirTreatmentDirective_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorAirTreatmentDirectiveType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload(value)
    }

    def parseCabin_Air_Care_SupervisorAirCareStatusType(): Cabin_Air_Care_Supervisor.AirCareStatus.Type = {
      val r = parseCabin_Air_Care_SupervisorAirCareStatusT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCareStatusT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCareStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCareStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Cabin_Air_Care_Supervisor.AirCareStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Cabin_Air_Care_Supervisor.AirCareStatus.")
          return Cabin_Air_Care_Supervisor.AirCareStatus.byOrdinal(0).get
      }
    }

    def parseCabin_Air_Care_SupervisorAirCareStatus_Payload(): Cabin_Air_Care_Supervisor.AirCareStatus_Payload = {
      val r = parseCabin_Air_Care_SupervisorAirCareStatus_PayloadT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCareStatus_PayloadT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCareStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCareStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseCabin_Air_Care_SupervisorAirCareStatusType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirCareStatus_Payload(value)
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

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P")
      }
      parser.parseObjectKey("api_airCarePreference")
      val api_airCarePreference = parseCabin_Air_Care_SupervisorAirCarePreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preferenceValidity")
      val api_preferenceValidity = parseCabin_Air_Care_SupervisorPreferenceValidityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(api_airCarePreference, api_preferenceValidity)
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_airCarePreference")
      val api_airCarePreference = parseCabin_Air_Care_SupervisorAirCarePreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preferenceValidity")
      val api_preferenceValidity = parseCabin_Air_Care_SupervisorPreferenceValidityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(api_airCarePreference, api_preferenceValidity)
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P")
      }
      parser.parseObjectKey("api_airCareIntent")
      val api_airCareIntent = parseCabin_Air_Care_SupervisorAirCareIntentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(api_airCareIntent)
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_airCareIntent")
      val api_airCareIntent = parseCabin_Air_Care_SupervisorAirCareIntentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(api_airCareIntent)
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_airQualityValidity")
      val api_airQualityValidity = parseCabin_Air_Care_SupervisorAirQualityValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cabinAirQuality")
      val api_cabinAirQuality = parseCabin_Air_Care_SupervisorCabinAirQualityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(api_airQualityValidity, api_cabinAirQuality)
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_airQualityValidity")
      val api_airQualityValidity = parseCabin_Air_Care_SupervisorAirQualityValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cabinAirQuality")
      val api_cabinAirQuality = parseCabin_Air_Care_SupervisorCabinAirQualityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(api_airQualityValidity, api_cabinAirQuality)
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_airAssessment")
      val api_airAssessment = parseCabin_Air_Care_SupervisorAirAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(api_airAssessment)
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_airAssessment")
      val api_airAssessment = parseCabin_Air_Care_SupervisorAirAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(api_airAssessment)
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_cabinHumidityBand")
      val api_cabinHumidityBand = parseCabin_Air_Care_SupervisorCabinHumidityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityValidity")
      val api_humidityValidity = parseCabin_Air_Care_SupervisorHumidityValidityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(api_cabinHumidityBand, api_humidityValidity)
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_cabinHumidityBand")
      val api_cabinHumidityBand = parseCabin_Air_Care_SupervisorCabinHumidityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityValidity")
      val api_humidityValidity = parseCabin_Air_Care_SupervisorHumidityValidityType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(api_cabinHumidityBand, api_humidityValidity)
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_humidityAssessment")
      val api_humidityAssessment = parseCabin_Air_Care_SupervisorHumidityAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(api_humidityAssessment)
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_humidityAssessment")
      val api_humidityAssessment = parseCabin_Air_Care_SupervisorHumidityAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(api_humidityAssessment)
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P")
      }
      parser.parseObjectKey("api_airAssessment")
      val api_airAssessment = parseCabin_Air_Care_SupervisorAirAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityAssessment")
      val api_humidityAssessment = parseCabin_Air_Care_SupervisorHumidityAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(api_airAssessment, api_humidityAssessment)
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS")
      }
      parser.parseObjectKey("api_airAssessment")
      val api_airAssessment = parseCabin_Air_Care_SupervisorAirAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityAssessment")
      val api_humidityAssessment = parseCabin_Air_Care_SupervisorHumidityAssessmentType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(api_airAssessment, api_humidityAssessment)
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P")
      }
      parser.parseObjectKey("api_measurementConfidence")
      val api_measurementConfidence = parseCabin_Air_Care_SupervisorMeasurementConfidenceType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(api_measurementConfidence)
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS")
      }
      parser.parseObjectKey("api_measurementConfidence")
      val api_measurementConfidence = parseCabin_Air_Care_SupervisorMeasurementConfidenceType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(api_measurementConfidence)
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P")
      }
      parser.parseObjectKey("api_airAssessment")
      val api_airAssessment = parseCabin_Air_Care_SupervisorAirAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_airCareIntent")
      val api_airCareIntent = parseCabin_Air_Care_SupervisorAirCareIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityAssessment")
      val api_humidityAssessment = parseCabin_Air_Care_SupervisorHumidityAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_measurementConfidence")
      val api_measurementConfidence = parseCabin_Air_Care_SupervisorMeasurementConfidenceType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(api_airAssessment, api_airCareIntent, api_humidityAssessment, api_measurementConfidence)
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_airAssessment")
      val api_airAssessment = parseCabin_Air_Care_SupervisorAirAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_airCareIntent")
      val api_airCareIntent = parseCabin_Air_Care_SupervisorAirCareIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_humidityAssessment")
      val api_humidityAssessment = parseCabin_Air_Care_SupervisorHumidityAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_measurementConfidence")
      val api_measurementConfidence = parseCabin_Air_Care_SupervisorMeasurementConfidenceType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(api_airAssessment, api_airCareIntent, api_humidityAssessment, api_measurementConfidence)
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS"))
      t.native match {
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T); return r
      }
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P = {
      val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P")
      }
      parser.parseObjectKey("api_airCareStatus")
      val api_airCareStatus = parseCabin_Air_Care_SupervisorAirCareStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_airTreatmentDirective")
      val api_airTreatmentDirective = parseCabin_Air_Care_SupervisorAirTreatmentDirectiveType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(api_airCareStatus, api_airTreatmentDirective)
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS = {
      val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(F)
      return r
    }

    def parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(typeParsed: B): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_airCareStatus")
      val api_airCareStatus = parseCabin_Air_Care_SupervisorAirCareStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_airTreatmentDirective")
      val api_airTreatmentDirective = parseCabin_Air_Care_SupervisorAirTreatmentDirectiveType()
      parser.parseObjectNext()
      return Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(api_airCareStatus, api_airTreatmentDirective)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Cabin_Air_Care_Supervisor.AirCareIntent_Payload", "Cabin_Air_Care_Supervisor.AirAssessment_Payload", "Cabin_Air_Care_Supervisor.AirCareStatus_Payload", "Cabin_Air_Care_Supervisor.CabinAirQuality_Payload", "Cabin_Air_Care_Supervisor.HumidityValidity_Payload", "Cabin_Air_Care_Supervisor.AirCarePreference_Payload", "Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload", "Cabin_Air_Care_Supervisor.PreferenceValidity_Payload", "Cabin_Air_Care_Supervisor.AirQualityValidity_Payload", "Cabin_Air_Care_Supervisor.HumidityAssessment_Payload", "Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload", "Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P", "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P", "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P", "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P", "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P", "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS"))
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
        case "Cabin_Air_Care_Supervisor.AirCareIntent_Payload" => val r = parseCabin_Air_Care_SupervisorAirCareIntent_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.AirAssessment_Payload" => val r = parseCabin_Air_Care_SupervisorAirAssessment_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCareStatus_Payload" => val r = parseCabin_Air_Care_SupervisorAirCareStatus_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.CabinAirQuality_Payload" => val r = parseCabin_Air_Care_SupervisorCabinAirQuality_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityValidity_Payload" => val r = parseCabin_Air_Care_SupervisorHumidityValidity_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePreference_Payload" => val r = parseCabin_Air_Care_SupervisorAirCarePreference_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload" => val r = parseCabin_Air_Care_SupervisorCabinHumidityBand_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceValidity_Payload" => val r = parseCabin_Air_Care_SupervisorPreferenceValidity_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityValidity_Payload" => val r = parseCabin_Air_Care_SupervisorAirQualityValidity_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessment_Payload" => val r = parseCabin_Air_Care_SupervisorHumidityAssessment_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload" => val r = parseCabin_Air_Care_SupervisorMeasurementConfidence_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload" => val r = parseCabin_Air_Care_SupervisorAirTreatmentDirective_PayloadT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PST(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PT(T); return r
        case "Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS" => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
        case _ => val r = parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PST(T); return r
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

  def fromCabin_Air_Care_SupervisorAirCarePreference_Payload(o: Cabin_Air_Care_Supervisor.AirCarePreference_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCarePreference_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCarePreference_Payload(s: String): Either[Cabin_Air_Care_Supervisor.AirCarePreference_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePreference_Payload(parser: Parser): Cabin_Air_Care_Supervisor.AirCarePreference_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCarePreference_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCarePreference_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceValidity_Payload(o: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorPreferenceValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorPreferenceValidity_Payload(s: String): Either[Cabin_Air_Care_Supervisor.PreferenceValidity_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceValidity_Payload(parser: Parser): Cabin_Air_Care_Supervisor.PreferenceValidity_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorPreferenceValidity_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorPreferenceValidity_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCareIntent_Payload(o: Cabin_Air_Care_Supervisor.AirCareIntent_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCareIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCareIntent_Payload(s: String): Either[Cabin_Air_Care_Supervisor.AirCareIntent_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCareIntent_Payload(parser: Parser): Cabin_Air_Care_Supervisor.AirCareIntent_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCareIntent_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCareIntent_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorCabinAirQuality_Payload(o: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorCabinAirQuality_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorCabinAirQuality_Payload(s: String): Either[Cabin_Air_Care_Supervisor.CabinAirQuality_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorCabinAirQuality_Payload(parser: Parser): Cabin_Air_Care_Supervisor.CabinAirQuality_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorCabinAirQuality_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorCabinAirQuality_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityValidity_Payload(o: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirQualityValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirQualityValidity_Payload(s: String): Either[Cabin_Air_Care_Supervisor.AirQualityValidity_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityValidity_Payload(parser: Parser): Cabin_Air_Care_Supervisor.AirQualityValidity_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorAirQualityValidity_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirQualityValidity_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirAssessment_Payload(o: Cabin_Air_Care_Supervisor.AirAssessment_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirAssessment_Payload(s: String): Either[Cabin_Air_Care_Supervisor.AirAssessment_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirAssessment_Payload(parser: Parser): Cabin_Air_Care_Supervisor.AirAssessment_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorAirAssessment_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirAssessment_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorCabinHumidityBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorCabinHumidityBand_Payload(s: String): Either[Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorCabinHumidityBand_Payload(parser: Parser): Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorCabinHumidityBand_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorCabinHumidityBand_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityValidity_Payload(o: Cabin_Air_Care_Supervisor.HumidityValidity_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityValidity_Payload(s: String): Either[Cabin_Air_Care_Supervisor.HumidityValidity_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityValidity_Payload(parser: Parser): Cabin_Air_Care_Supervisor.HumidityValidity_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityValidity_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityValidity_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessment_Payload(o: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityAssessment_Payload(s: String): Either[Cabin_Air_Care_Supervisor.HumidityAssessment_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessment_Payload(parser: Parser): Cabin_Air_Care_Supervisor.HumidityAssessment_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityAssessment_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityAssessment_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorMeasurementConfidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorMeasurementConfidence_Payload(s: String): Either[Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorMeasurementConfidence_Payload(parser: Parser): Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorMeasurementConfidence_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorMeasurementConfidence_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(s: String): Either[Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirTreatmentDirective_Payload(parser: Parser): Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorAirTreatmentDirective_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirTreatmentDirective_Payload _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCareStatus_Payload(o: Cabin_Air_Care_Supervisor.AirCareStatus_Payload, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCareStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCareStatus_Payload(s: String): Either[Cabin_Air_Care_Supervisor.AirCareStatus_Payload, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCareStatus_Payload(parser: Parser): Cabin_Air_Care_Supervisor.AirCareStatus_Payload = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCareStatus_Payload()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCareStatus_Payload _)
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

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(s: String): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(parser: Parser): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(s: String): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(parser: Parser): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(s: String): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(parser: Parser): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(s: String): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(parser: Parser): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(s: String): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(parser: Parser): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(s: String): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(parser: Parser): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(s: String): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(parser: Parser): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(s: String): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(parser: Parser): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(s: String): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(parser: Parser): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(s: String): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(parser: Parser): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(s: String): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(parser: Parser): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(s: String): Either[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS, Json.ErrorMsg] = {
    def fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(parser: Parser): Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS = {
      val r = parser.parseCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS()
      return r
    }
    val r = to(s, fCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS _)
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