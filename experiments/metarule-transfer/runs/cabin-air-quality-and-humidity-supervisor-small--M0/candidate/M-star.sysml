package Cabin_Air_Care_Supervisor {

  private import HAMR::*;

  enum def AirCarePreference {
    enum Off;
    enum Auto;
  }

  enum def PreferenceValidity {
    enum Valid;
    enum Invalid;
  }

  enum def CabinAirQuality {
    enum Acceptable;
    enum Polluted;
  }

  enum def AirQualityValidity {
    enum Valid;
    enum Invalid;
  }

  enum def CabinHumidityBand {
    enum Low;
    enum Target;
    enum High;
  }

  enum def HumidityValidity {
    enum Valid;
    enum Invalid;
  }

  enum def AirTreatmentDirective {
    enum Standby;
    enum Filter;
    enum HumidifyWithFilter;
    enum DehumidifyWithFilter;
  }

  enum def AirCareStatus {
    enum Off;
    enum Standby;
    enum Filtering;
    enum Humidifying;
    enum Dehumidifying;
    enum PreferenceFault;
    enum InputFault;
    enum Recovering;
  }

  enum def AirCareIntent {
    enum Disabled;
    enum Enabled;
    enum Invalid;
  }

  enum def AirAssessment {
    enum Acceptable;
    enum FilterNeeded;
    enum Unknown;
  }

  enum def HumidityAssessment {
    enum AddMoisture;
    enum AtTarget;
    enum RemoveMoisture;
    enum Unknown;
  }

  enum def MeasurementConfidence {
    enum Trusted;
    enum BlockedInvalid;
    enum Confirming;
  }

  enum def ConfidenceMode {
    enum Trusted;
    enum ConfirmationNeeded;
  }

  part def PreferenceInterpreter :> Thread {
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port airCareIntent : DataPort { out :>> type : AirCareIntent; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_01_INVALID_PREFERENCE "Invalid preference produces Invalid intent | <N.md#CC_01_INVALID_PREFERENCE>":
            assume preferenceValidity == Cabin_Air_Care_Supervisor::PreferenceValidity.Invalid;
            guarantee airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Invalid;

          case CC_02_VALID_PREFERENCE "A valid Off disables and a valid Auto enables air care | <N.md#CC_02_VALID_PREFERENCE>":
            assume preferenceValidity == Cabin_Air_Care_Supervisor::PreferenceValidity.Valid;
            guarantee
              (airCarePreference == Cabin_Air_Care_Supervisor::AirCarePreference.Off implies
                 airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Disabled) &
              (airCarePreference == Cabin_Air_Care_Supervisor::AirCarePreference.Auto implies
                 airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Enabled);
    }*/
  }

  part def AirQualityAssessor :> Thread {
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_03_AIR_ASSESSMENT "Validity-qualified air observation is classified exhaustively | <N.md#CC_03_AIR_ASSESSMENT>":
            assume T;
            guarantee
              (airQualityValidity == Cabin_Air_Care_Supervisor::AirQualityValidity.Invalid implies
                 airAssessment == Cabin_Air_Care_Supervisor::AirAssessment.Unknown) &
              (airQualityValidity == Cabin_Air_Care_Supervisor::AirQualityValidity.Valid &
               cabinAirQuality == Cabin_Air_Care_Supervisor::CabinAirQuality.Acceptable implies
                 airAssessment == Cabin_Air_Care_Supervisor::AirAssessment.Acceptable) &
              (airQualityValidity == Cabin_Air_Care_Supervisor::AirQualityValidity.Valid &
               cabinAirQuality == Cabin_Air_Care_Supervisor::CabinAirQuality.Polluted implies
                 airAssessment == Cabin_Air_Care_Supervisor::AirAssessment.FilterNeeded);
    }*/
  }

  part def HumidityAssessor :> Thread {
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_04_HUMIDITY_ASSESSMENT "Validity-qualified humidity observation is classified exhaustively | <N.md#CC_04_HUMIDITY_ASSESSMENT>":
            assume T;
            guarantee
              (humidityValidity == Cabin_Air_Care_Supervisor::HumidityValidity.Invalid implies
                 humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.Unknown) &
              (humidityValidity == Cabin_Air_Care_Supervisor::HumidityValidity.Valid &
               cabinHumidityBand == Cabin_Air_Care_Supervisor::CabinHumidityBand.Low implies
                 humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.AddMoisture) &
              (humidityValidity == Cabin_Air_Care_Supervisor::HumidityValidity.Valid &
               cabinHumidityBand == Cabin_Air_Care_Supervisor::CabinHumidityBand.Target implies
                 humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.AtTarget) &
              (humidityValidity == Cabin_Air_Care_Supervisor::HumidityValidity.Valid &
               cabinHumidityBand == Cabin_Air_Care_Supervisor::CabinHumidityBand.High implies
                 humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.RemoveMoisture);
    }*/
  }

  part def ObservationConfidenceGuardian :> Thread {
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { out :>> type : MeasurementConfidence; }

    language "GUMBO" /*{
      state
        confidenceMode: Cabin_Air_Care_Supervisor::ConfidenceMode;

      initialize
        guarantee INITIAL_CONFIDENCE "Start in confirmation before treatment can be trusted | <N.md#INITIAL_CONFIDENCE>":
          confidenceMode == Cabin_Air_Care_Supervisor::ConfidenceMode.ConfirmationNeeded &
          measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.Confirming;

      compute
        compute_cases
          case CC_05_INVALID_OBSERVATION "Any unknown assessment blocks treatment and resets confirmation | <N.md#CC_05_INVALID_OBSERVATION>":
            assume airAssessment == Cabin_Air_Care_Supervisor::AirAssessment.Unknown |
                   humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.Unknown;
            guarantee
              measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.BlockedInvalid &
              confidenceMode == Cabin_Air_Care_Supervisor::ConfidenceMode.ConfirmationNeeded;

          case CC_06_CLEAN_CONFIRMATION "First complete known observation confirms recovery | <N.md#CC_06_CLEAN_CONFIRMATION>":
            assume airAssessment != Cabin_Air_Care_Supervisor::AirAssessment.Unknown &
                   humidityAssessment != Cabin_Air_Care_Supervisor::HumidityAssessment.Unknown &
                   confidenceMode == Cabin_Air_Care_Supervisor::ConfidenceMode.ConfirmationNeeded;
            guarantee
              measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.Confirming &
              confidenceMode == Cabin_Air_Care_Supervisor::ConfidenceMode.Trusted;

          case CC_07_TRUSTED_RETENTION "Complete known observations retain trusted confidence | <N.md#CC_07_TRUSTED_RETENTION>":
            assume airAssessment != Cabin_Air_Care_Supervisor::AirAssessment.Unknown &
                   humidityAssessment != Cabin_Air_Care_Supervisor::HumidityAssessment.Unknown &
                   confidenceMode == Cabin_Air_Care_Supervisor::ConfidenceMode.Trusted;
            guarantee
              measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.Trusted &
              confidenceMode == Cabin_Air_Care_Supervisor::ConfidenceMode.Trusted;
    }*/
  }

  part def AirCarePolicySupervisor :> Thread {
    port airCareIntent : DataPort { in :>> type : AirCareIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { in :>> type : MeasurementConfidence; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_POLICY_OUTPUTS "Initialize with a safe standby recovery indication | <N.md#INITIAL_POLICY_OUTPUTS>":
          airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Standby &
          airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.Recovering;

      compute
        compute_cases
          case CC_08_DISABLED "Disabled air care requests standby and reports Off | <N.md#CC_08_DISABLED>":
            assume airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Disabled;
            guarantee
              airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Standby &
              airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.Off;

          case CC_09_INVALID_PREFERENCE "Invalid preference requests standby and reports preference fault | <N.md#CC_09_INVALID_PREFERENCE>":
            assume airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Invalid;
            guarantee
              airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Standby &
              airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.PreferenceFault;

          case CC_10_CONFIDENCE_MASK "Enabled care remains standby until confidence is trusted | <N.md#CC_10_CONFIDENCE_MASK>":
            assume airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Enabled &
                   measurementConfidence != Cabin_Air_Care_Supervisor::MeasurementConfidence.Trusted;
            guarantee
              (measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.BlockedInvalid implies
                (airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Standby &
                 airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.InputFault)) &
              (measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.Confirming implies
                (airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Standby &
                 airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.Recovering));

          case CC_11_DEFENSIVE_INCONSISTENCY "Trusted but internally unknown assessments fail safely | <N.md#CC_11_DEFENSIVE_INCONSISTENCY>":
            assume airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Enabled &
                   measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.Trusted &
                   (airAssessment == Cabin_Air_Care_Supervisor::AirAssessment.Unknown |
                    humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.Unknown);
            guarantee
              airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Standby &
              airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.InputFault;

          case CC_12_TRUSTED_TREATMENT "Trusted known assessments select the coordinated treatment | <N.md#CC_12_TRUSTED_TREATMENT>":
            assume airCareIntent == Cabin_Air_Care_Supervisor::AirCareIntent.Enabled &
                   measurementConfidence == Cabin_Air_Care_Supervisor::MeasurementConfidence.Trusted &
                   airAssessment != Cabin_Air_Care_Supervisor::AirAssessment.Unknown &
                   humidityAssessment != Cabin_Air_Care_Supervisor::HumidityAssessment.Unknown;
            guarantee
              (humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.AddMoisture implies
                (airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.HumidifyWithFilter &
                 airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.Humidifying)) &
              (humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.RemoveMoisture implies
                (airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.DehumidifyWithFilter &
                 airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.Dehumidifying)) &
              (humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.AtTarget &
               airAssessment == Cabin_Air_Care_Supervisor::AirAssessment.FilterNeeded implies
                (airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Filter &
                 airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.Filtering)) &
              (humidityAssessment == Cabin_Air_Care_Supervisor::HumidityAssessment.AtTarget &
               airAssessment == Cabin_Air_Care_Supervisor::AirAssessment.Acceptable implies
                (airTreatmentDirective == Cabin_Air_Care_Supervisor::AirTreatmentDirective.Standby &
                 airCareStatus == Cabin_Air_Care_Supervisor::AirCareStatus.Standby));
    }*/
  }

  part def AirCareSupervisionProcess :> Process {
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    part preferenceInterpreter : PreferenceInterpreter;
    part airQualityAssessor : AirQualityAssessor;
    part humidityAssessor : HumidityAssessor;
    part observationConfidenceGuardian : ObservationConfidenceGuardian;
    part airCarePolicySupervisor : AirCarePolicySupervisor;

    connection int01 : PortConnection connect airCarePreference to preferenceInterpreter.airCarePreference;
    connection int02 : PortConnection connect preferenceValidity to preferenceInterpreter.preferenceValidity;
    connection int03 : PortConnection connect cabinAirQuality to airQualityAssessor.cabinAirQuality;
    connection int04 : PortConnection connect airQualityValidity to airQualityAssessor.airQualityValidity;
    connection int05 : PortConnection connect cabinHumidityBand to humidityAssessor.cabinHumidityBand;
    connection int06 : PortConnection connect humidityValidity to humidityAssessor.humidityValidity;
    connection int07 : PortConnection connect preferenceInterpreter.airCareIntent to airCarePolicySupervisor.airCareIntent;
    connection int08 : PortConnection connect airQualityAssessor.airAssessment to observationConfidenceGuardian.airAssessment;
    connection int09 : PortConnection connect airQualityAssessor.airAssessment to airCarePolicySupervisor.airAssessment;
    connection int10 : PortConnection connect humidityAssessor.humidityAssessment to observationConfidenceGuardian.humidityAssessment;
    connection int11 : PortConnection connect humidityAssessor.humidityAssessment to airCarePolicySupervisor.humidityAssessment;
    connection int12 : PortConnection connect observationConfidenceGuardian.measurementConfidence to airCarePolicySupervisor.measurementConfidence;
    connection int13 : PortConnection connect airCarePolicySupervisor.airTreatmentDirective to airTreatmentDirective;
    connection int14 : PortConnection connect airCarePolicySupervisor.airCareStatus to airCareStatus;
  }

  part def CabinAirCareSupervisor :> System {
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    part airCareSupervisionProcess : AirCareSupervisionProcess;

    connection supportInt01 : PortConnection connect airCarePreference to airCareSupervisionProcess.airCarePreference;
    connection supportInt02 : PortConnection connect preferenceValidity to airCareSupervisionProcess.preferenceValidity;
    connection supportInt03 : PortConnection connect cabinAirQuality to airCareSupervisionProcess.cabinAirQuality;
    connection supportInt04 : PortConnection connect airQualityValidity to airCareSupervisionProcess.airQualityValidity;
    connection supportInt05 : PortConnection connect cabinHumidityBand to airCareSupervisionProcess.cabinHumidityBand;
    connection supportInt06 : PortConnection connect humidityValidity to airCareSupervisionProcess.humidityValidity;
    connection supportInt13 : PortConnection connect airCareSupervisionProcess.airTreatmentDirective to airTreatmentDirective;
    connection supportInt14 : PortConnection connect airCareSupervisionProcess.airCareStatus to airCareStatus;
  }

  part cabinAirCareSupervisor : CabinAirCareSupervisor;
}
