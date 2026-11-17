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
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port airCareIntent : DataPort { out :>> type : AirCareIntent; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_01_INVALID_PREFERENCE:
            assume preferenceValidity == PreferenceValidity.Invalid;
            guarantee airCareIntent == AirCareIntent.Invalid;

          case CC_02_VALID_PREFERENCE:
            assume preferenceValidity == PreferenceValidity.Valid;
            guarantee
              (airCarePreference == AirCarePreference.Off implies
                airCareIntent == AirCareIntent.Disabled) &
              (airCarePreference == AirCarePreference.Auto implies
                airCareIntent == AirCareIntent.Enabled);
    }*/
  }

  part def AirQualityAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_03_AIR_ASSESSMENT:
            assume T;
            guarantee
              (airQualityValidity == AirQualityValidity.Invalid implies
                airAssessment == AirAssessment.Unknown) &
              ((airQualityValidity == AirQualityValidity.Valid &
                cabinAirQuality == CabinAirQuality.Acceptable) implies
                airAssessment == AirAssessment.Acceptable) &
              ((airQualityValidity == AirQualityValidity.Valid &
                cabinAirQuality == CabinAirQuality.Polluted) implies
                airAssessment == AirAssessment.FilterNeeded);
    }*/
  }

  part def HumidityAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CC_04_HUMIDITY_ASSESSMENT:
            assume T;
            guarantee
              (humidityValidity == HumidityValidity.Invalid implies
                humidityAssessment == HumidityAssessment.Unknown) &
              ((humidityValidity == HumidityValidity.Valid &
                cabinHumidityBand == CabinHumidityBand.Low) implies
                humidityAssessment == HumidityAssessment.AddMoisture) &
              ((humidityValidity == HumidityValidity.Valid &
                cabinHumidityBand == CabinHumidityBand.Target) implies
                humidityAssessment == HumidityAssessment.AtTarget) &
              ((humidityValidity == HumidityValidity.Valid &
                cabinHumidityBand == CabinHumidityBand.High) implies
                humidityAssessment == HumidityAssessment.RemoveMoisture);
    }*/
  }

  part def ObservationConfidenceGuardian :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { out :>> type : MeasurementConfidence; }

    language "GUMBO" /*{
      state
        confidenceMode: ConfidenceMode;

                
                                     
                                                               
                                                                    

      compute
        compute_cases
          case CC_05_INVALID_OBSERVATION:
            assume airAssessment == AirAssessment.Unknown |
              humidityAssessment == HumidityAssessment.Unknown;
            guarantee
              measurementConfidence == MeasurementConfidence.BlockedInvalid &
              confidenceMode == ConfidenceMode.ConfirmationNeeded;

          case CC_06_CLEAN_CONFIRMATION:
            assume airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown &
              confidenceMode == ConfidenceMode.ConfirmationNeeded;
            guarantee
              measurementConfidence == MeasurementConfidence.Confirming &
              confidenceMode == ConfidenceMode.Trusted;

          case CC_07_TRUSTED_RETENTION:
            assume airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown &
              confidenceMode == ConfidenceMode.Trusted;
            guarantee
              measurementConfidence == MeasurementConfidence.Trusted &
              confidenceMode == ConfidenceMode.Trusted;
    }*/
  }

  part def AirCarePolicySupervisor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port airCareIntent : DataPort { in :>> type : AirCareIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { in :>> type : MeasurementConfidence; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    language "GUMBO" /*{
                
                                         
                                                                  
                                                    

      compute
        compute_cases
          case CC_08_DISABLED:
            assume airCareIntent == AirCareIntent.Disabled;
            guarantee
              airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.Off;

          case CC_09_INVALID_PREFERENCE:
            assume airCareIntent == AirCareIntent.Invalid;
            guarantee
              airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.PreferenceFault;

          case CC_10_CONFIDENCE_MASK:
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence != MeasurementConfidence.Trusted;
            guarantee
              (measurementConfidence == MeasurementConfidence.BlockedInvalid implies
                airTreatmentDirective == AirTreatmentDirective.Standby &
                airCareStatus == AirCareStatus.InputFault) &
              (measurementConfidence == MeasurementConfidence.Confirming implies
                airTreatmentDirective == AirTreatmentDirective.Standby &
                airCareStatus == AirCareStatus.Recovering);

          case CC_11_DEFENSIVE_INCONSISTENCY:
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              (airAssessment == AirAssessment.Unknown |
                humidityAssessment == HumidityAssessment.Unknown);
            guarantee
              airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.InputFault;

          case CC_12_TRUSTED_TREATMENT:
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown;
            guarantee
              (humidityAssessment == HumidityAssessment.AddMoisture implies
                airTreatmentDirective == AirTreatmentDirective.HumidifyWithFilter &
                airCareStatus == AirCareStatus.Humidifying) &
              (humidityAssessment == HumidityAssessment.RemoveMoisture implies
                airTreatmentDirective == AirTreatmentDirective.DehumidifyWithFilter &
                airCareStatus == AirCareStatus.Dehumidifying) &
              ((humidityAssessment == HumidityAssessment.AtTarget &
                airAssessment == AirAssessment.FilterNeeded) implies
                airTreatmentDirective == AirTreatmentDirective.Filter &
                airCareStatus == AirCareStatus.Filtering) &
              ((humidityAssessment == HumidityAssessment.AtTarget &
                airAssessment == AirAssessment.Acceptable) implies
                airTreatmentDirective == AirTreatmentDirective.Standby &
                airCareStatus == AirCareStatus.Standby);
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
