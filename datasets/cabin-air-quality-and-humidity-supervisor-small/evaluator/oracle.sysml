package Cabin_Air_Care_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def AirCarePreference {
    enum Off;
    enum Auto;
  }

  // @trace MON-02
  enum def PreferenceValidity {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-03
  enum def CabinAirQuality {
    enum Acceptable;
    enum Polluted;
  }

  // @trace MON-04
  enum def AirQualityValidity {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-05
  enum def CabinHumidityBand {
    enum Low;
    enum Target;
    enum High;
  }

  // @trace MON-06
  enum def HumidityValidity {
    enum Valid;
    enum Invalid;
  }

  // @trace CTRL-01
  enum def AirTreatmentDirective {
    enum Standby;
    enum Filter;
    enum HumidifyWithFilter;
    enum DehumidifyWithFilter;
  }

  // @trace CTRL-02
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

  // @trace INT-07
  enum def AirCareIntent {
    enum Disabled;
    enum Enabled;
    enum Invalid;
  }

  // @trace INT-08
  enum def AirAssessment {
    enum Acceptable;
    enum FilterNeeded;
    enum Unknown;
  }

  // @trace INT-10
  enum def HumidityAssessment {
    enum AddMoisture;
    enum AtTarget;
    enum RemoveMoisture;
    enum Unknown;
  }

  // @trace INT-12
  enum def MeasurementConfidence {
    enum Trusted;
    enum BlockedInvalid;
    enum Confirming;
  }

  // @trace STATE-01
  enum def ConfidenceMode {
    enum Trusted;
    enum ConfirmationNeeded;
  }

  // @trace PART-01
  part def PreferenceInterpreter :> Thread {
    // @trace INT-01
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    // @trace INT-02
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    // @trace INT-07
    port airCareIntent : DataPort { out :>> type : AirCareIntent; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CC-01
          case CC_01_INVALID_PREFERENCE "Invalid validity derives invalid intent for either encoded preference":
            assume preferenceValidity == PreferenceValidity.Invalid;
            guarantee airCareIntent == AirCareIntent.Invalid;

          // @trace CC-02
          case CC_02_VALID_PREFERENCE "A valid preference derives disabled or enabled intent from its level":
            assume preferenceValidity == PreferenceValidity.Valid;
            guarantee
              ((airCarePreference == AirCarePreference.Off) implies
                (airCareIntent == AirCareIntent.Disabled)) &
              ((airCarePreference == AirCarePreference.Auto) implies
                (airCareIntent == AirCareIntent.Enabled));
    }*/
  }

  // @trace PART-02
  part def AirQualityAssessor :> Thread {
    // @trace INT-03
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    // @trace INT-04
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    // @trace INT-08
    port airAssessment : DataPort { out :>> type : AirAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CC-03
          case CC_03_AIR_ASSESSMENT "Validity and air class jointly derive the exhaustive air assessment":
            guarantee
              ((airQualityValidity == AirQualityValidity.Invalid) implies
                (airAssessment == AirAssessment.Unknown)) &
              ((airQualityValidity == AirQualityValidity.Valid &
                cabinAirQuality == CabinAirQuality.Acceptable) implies
                (airAssessment == AirAssessment.Acceptable)) &
              ((airQualityValidity == AirQualityValidity.Valid &
                cabinAirQuality == CabinAirQuality.Polluted) implies
                (airAssessment == AirAssessment.FilterNeeded));
    }*/
  }

  // @trace PART-03
  part def HumidityAssessor :> Thread {
    // @trace INT-05
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    // @trace INT-06
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    // @trace INT-10
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CC-04
          case CC_04_HUMIDITY_ASSESSMENT "Validity and humidity band jointly derive the exhaustive humidity assessment":
            guarantee
              ((humidityValidity == HumidityValidity.Invalid) implies
                (humidityAssessment == HumidityAssessment.Unknown)) &
              ((humidityValidity == HumidityValidity.Valid &
                cabinHumidityBand == CabinHumidityBand.Low) implies
                (humidityAssessment == HumidityAssessment.AddMoisture)) &
              ((humidityValidity == HumidityValidity.Valid &
                cabinHumidityBand == CabinHumidityBand.Target) implies
                (humidityAssessment == HumidityAssessment.AtTarget)) &
              ((humidityValidity == HumidityValidity.Valid &
                cabinHumidityBand == CabinHumidityBand.High) implies
                (humidityAssessment == HumidityAssessment.RemoveMoisture));
    }*/
  }

  // @trace PART-04
  part def ObservationConfidenceGuardian :> Thread {
    // @trace INT-08
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    // @trace INT-10
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    // @trace INT-12
    port measurementConfidence : DataPort { out :>> type : MeasurementConfidence; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        confidenceMode : ConfidenceMode;

      initialize
        guarantee
          // @trace INIT-01
          INITIAL_CONFIDENCE "Confidence starts confirmation-needed and publishes a non-trusted baseline":
            confidenceMode == ConfidenceMode.ConfirmationNeeded &
            measurementConfidence == MeasurementConfidence.Confirming;

      compute
        compute_cases
          // @trace CC-05
          case CC_05_INVALID_OBSERVATION "Either unknown assessment blocks confidence and requires a later confirmation":
            assume airAssessment == AirAssessment.Unknown |
              humidityAssessment == HumidityAssessment.Unknown;
            guarantee measurementConfidence == MeasurementConfidence.BlockedInvalid &
              confidenceMode == ConfidenceMode.ConfirmationNeeded;

          // @trace CC-06
          case CC_06_CLEAN_CONFIRMATION "Known assessments in confirmation-needed state are held for one observation":
            assume airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown &
              In(confidenceMode) == ConfidenceMode.ConfirmationNeeded;
            guarantee measurementConfidence == MeasurementConfidence.Confirming &
              confidenceMode == ConfidenceMode.Trusted;

          // @trace CC-07
          case CC_07_TRUSTED_RETENTION "Known assessments retain trusted confidence after confirmation":
            assume airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown &
              In(confidenceMode) == ConfidenceMode.Trusted;
            guarantee measurementConfidence == MeasurementConfidence.Trusted &
              confidenceMode == ConfidenceMode.Trusted;
    }*/
  }

  // @trace PART-05
  part def AirCarePolicySupervisor :> Thread {
    // @trace INT-07
    port airCareIntent : DataPort { in :>> type : AirCareIntent; }
    // @trace INT-09
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    // @trace INT-11
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    // @trace INT-12
    port measurementConfidence : DataPort { in :>> type : MeasurementConfidence; }
    // @trace INT-13
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    // @trace INT-14
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INITIAL_POLICY_OUTPUTS "The principal owner initializes to standby and recovering":
            airTreatmentDirective == AirTreatmentDirective.Standby &
            airCareStatus == AirCareStatus.Recovering;

      compute
        compute_cases
          // @trace CC-08
          case CC_08_DISABLED "Disabled intent has first priority and produces the user-off pair":
            assume airCareIntent == AirCareIntent.Disabled;
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.Off;

          // @trace CC-09
          case CC_09_INVALID_PREFERENCE "Invalid intent has second priority and produces preference fault":
            assume airCareIntent == AirCareIntent.Invalid;
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.PreferenceFault;

          // @trace CC-10
          case CC_10_CONFIDENCE_MASK "Enabled service is masked by blocked or confirming confidence":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence != MeasurementConfidence.Trusted;
            guarantee
              ((measurementConfidence == MeasurementConfidence.BlockedInvalid) implies
                (airTreatmentDirective == AirTreatmentDirective.Standby &
                 airCareStatus == AirCareStatus.InputFault)) &
              ((measurementConfidence == MeasurementConfidence.Confirming) implies
                (airTreatmentDirective == AirTreatmentDirective.Standby &
                 airCareStatus == AirCareStatus.Recovering));

          // @trace CC-11
          case CC_11_DEFENSIVE_INCONSISTENCY "Trusted confidence paired with an unknown assessment fails closed":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              (airAssessment == AirAssessment.Unknown |
               humidityAssessment == HumidityAssessment.Unknown);
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.InputFault;

          // @trace CC-12
          case CC_12_TRUSTED_TREATMENT "Known trusted assessments select the complete humidity-priority treatment partition":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown;
            guarantee
              ((humidityAssessment == HumidityAssessment.AddMoisture) implies
                (airTreatmentDirective == AirTreatmentDirective.HumidifyWithFilter &
                 airCareStatus == AirCareStatus.Humidifying)) &
              ((humidityAssessment == HumidityAssessment.RemoveMoisture) implies
                (airTreatmentDirective == AirTreatmentDirective.DehumidifyWithFilter &
                 airCareStatus == AirCareStatus.Dehumidifying)) &
              ((humidityAssessment == HumidityAssessment.AtTarget &
                airAssessment == AirAssessment.FilterNeeded) implies
                (airTreatmentDirective == AirTreatmentDirective.Filter &
                 airCareStatus == AirCareStatus.Filtering)) &
              ((humidityAssessment == HumidityAssessment.AtTarget &
                airAssessment == AirAssessment.Acceptable) implies
                (airTreatmentDirective == AirTreatmentDirective.Standby &
                 airCareStatus == AirCareStatus.Standby));
    }*/
  }

  // @generated-support SUPPORT-01: behavior-free containment required by the approved AADL realization.
  part def AirCareSupervisionProcess :> Process {
    // @trace INT-01
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    // @trace INT-02
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    // @trace INT-03
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    // @trace INT-04
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    // @trace INT-05
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    // @trace INT-06
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    // @trace INT-13
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    // @trace INT-14
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    // @trace PART-01
    part preferenceInterpreter : PreferenceInterpreter;
    // @trace PART-02
    part airQualityAssessor : AirQualityAssessor;
    // @trace PART-03
    part humidityAssessor : HumidityAssessor;
    // @trace PART-04
    part observationConfidenceGuardian : ObservationConfidenceGuardian;
    // @trace PART-05
    part airCarePolicySupervisor : AirCarePolicySupervisor;

    // @generated-support SUPPORT-02: Process-to-Thread delegation for INT-01.
    // @trace INT-01
    connection int01 : PortConnection connect airCarePreference to preferenceInterpreter.airCarePreference;
    // @generated-support SUPPORT-02: Process-to-Thread delegation for INT-02.
    // @trace INT-02
    connection int02 : PortConnection connect preferenceValidity to preferenceInterpreter.preferenceValidity;
    // @generated-support SUPPORT-02: Process-to-Thread delegation for INT-03.
    // @trace INT-03
    connection int03 : PortConnection connect cabinAirQuality to airQualityAssessor.cabinAirQuality;
    // @generated-support SUPPORT-02: Process-to-Thread delegation for INT-04.
    // @trace INT-04
    connection int04 : PortConnection connect airQualityValidity to airQualityAssessor.airQualityValidity;
    // @generated-support SUPPORT-02: Process-to-Thread delegation for INT-05.
    // @trace INT-05
    connection int05 : PortConnection connect cabinHumidityBand to humidityAssessor.cabinHumidityBand;
    // @generated-support SUPPORT-02: Process-to-Thread delegation for INT-06.
    // @trace INT-06
    connection int06 : PortConnection connect humidityValidity to humidityAssessor.humidityValidity;
    // @trace INT-07
    connection int07 : PortConnection connect preferenceInterpreter.airCareIntent to airCarePolicySupervisor.airCareIntent;
    // @trace INT-08
    connection int08 : PortConnection connect airQualityAssessor.airAssessment to observationConfidenceGuardian.airAssessment;
    // @trace INT-09
    connection int09 : PortConnection connect airQualityAssessor.airAssessment to airCarePolicySupervisor.airAssessment;
    // @trace INT-10
    connection int10 : PortConnection connect humidityAssessor.humidityAssessment to observationConfidenceGuardian.humidityAssessment;
    // @trace INT-11
    connection int11 : PortConnection connect humidityAssessor.humidityAssessment to airCarePolicySupervisor.humidityAssessment;
    // @trace INT-12
    connection int12 : PortConnection connect observationConfidenceGuardian.measurementConfidence to airCarePolicySupervisor.measurementConfidence;
    // @generated-support SUPPORT-02: Thread-to-Process delegation for INT-13.
    // @trace INT-13
    connection int13 : PortConnection connect airCarePolicySupervisor.airTreatmentDirective to airTreatmentDirective;
    // @generated-support SUPPORT-02: Thread-to-Process delegation for INT-14.
    // @trace INT-14
    connection int14 : PortConnection connect airCarePolicySupervisor.airCareStatus to airCareStatus;
  }

  // @trace BOUND-01
  part def CabinAirCareSupervisor :> System {
    // @trace MON-01
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    // @trace MON-02
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    // @trace MON-03
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    // @trace MON-04
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    // @trace MON-05
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    // @trace MON-06
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    // @trace CTRL-01
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    // @trace CTRL-02
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    // @generated-support SUPPORT-01: sole behavior-free Process usage.
    part airCareSupervisionProcess : AirCareSupervisionProcess;

    // @generated-support SUPPORT-02: System-to-Process delegation for INT-01.
    // @trace INT-01
    connection supportInt01 : PortConnection connect airCarePreference to airCareSupervisionProcess.airCarePreference;
    // @generated-support SUPPORT-02: System-to-Process delegation for INT-02.
    // @trace INT-02
    connection supportInt02 : PortConnection connect preferenceValidity to airCareSupervisionProcess.preferenceValidity;
    // @generated-support SUPPORT-02: System-to-Process delegation for INT-03.
    // @trace INT-03
    connection supportInt03 : PortConnection connect cabinAirQuality to airCareSupervisionProcess.cabinAirQuality;
    // @generated-support SUPPORT-02: System-to-Process delegation for INT-04.
    // @trace INT-04
    connection supportInt04 : PortConnection connect airQualityValidity to airCareSupervisionProcess.airQualityValidity;
    // @generated-support SUPPORT-02: System-to-Process delegation for INT-05.
    // @trace INT-05
    connection supportInt05 : PortConnection connect cabinHumidityBand to airCareSupervisionProcess.cabinHumidityBand;
    // @generated-support SUPPORT-02: System-to-Process delegation for INT-06.
    // @trace INT-06
    connection supportInt06 : PortConnection connect humidityValidity to airCareSupervisionProcess.humidityValidity;
    // @generated-support SUPPORT-02: Process-to-System delegation for INT-13.
    // @trace INT-13
    connection supportInt13 : PortConnection connect airCareSupervisionProcess.airTreatmentDirective to airTreatmentDirective;
    // @generated-support SUPPORT-02: Process-to-System delegation for INT-14.
    // @trace INT-14
    connection supportInt14 : PortConnection connect airCareSupervisionProcess.airCareStatus to airCareStatus;
  }

  // @trace CONSTR-01
  part cabinAirCareSupervisor : CabinAirCareSupervisor;
}
