// This file will not be overwritten if HAMR codegen is rerun

mod tests {
  // NOTE: need to run tests sequentially to prevent race conditions
  //       on the app and the testing apis which are static
  use serial_test::serial;

  use crate::test::util::*;
  use data::*;

  #[test]
  #[serial]
  fn test_initialization() {
    crate::manage_regulator_interface_process_manage_regulator_interface_initialize();
}

  #[test]
  #[serial]
  fn test_compute() {
    crate::manage_regulator_interface_process_manage_regulator_interface_initialize();

    // populate incoming data ports
    test_apis::put_current_temperature(Isolette_Thermostat_Rust::CurrentTemperature::default());
    test_apis::put_desired_settings(Isolette_Thermostat_Rust::DesiredTemperatureSettings::default());
    test_apis::put_regulator_mode(Isolette_Thermostat_Rust::ThermostatMode::default());

    crate::manage_regulator_interface_process_manage_regulator_interface_timeTriggered();
  }
}

mod GUMBOX_tests {
  use serial_test::serial;
  use proptest::prelude::*;

  use crate::test::util::*;
  use crate::testInitializeCB_macro;
  use crate::testComputeCB_macro;

  // number of valid (i.e., non-rejected) test cases that must be executed for the compute method.
  const numValidComputeTestCases: u32 = 100;

  // how many total test cases (valid + rejected) that may be attempted.
  //   0 means all inputs must satisfy the precondition (if present),
  //   5 means at most 5 rejected inputs are allowed per valid test case
  const computeRejectRatio: u32 = 5;

  const verbosity: u32 = 2;

  testInitializeCB_macro! {
    prop_testInitializeCB_macro, // test name
    config: ProptestConfig { // proptest configuration, built by overriding fields from default config
      cases: numValidComputeTestCases,
      max_global_rejects: numValidComputeTestCases * computeRejectRatio,
      verbose: verbosity,
      ..ProptestConfig::default()
    }
  }

  testComputeCB_macro! {
    prop_testComputeCB_macro, // test name
    config: ProptestConfig { // proptest configuration, built by overriding fields from default config
      cases: numValidComputeTestCases,
      max_global_rejects: numValidComputeTestCases * computeRejectRatio,
      verbose: verbosity,
      ..ProptestConfig::default()
    },
    // strategies for generating each component input
    api_current_temperature: generators::Isolette_Thermostat_Rust_CurrentTemperature_strategy_default(),
    api_desired_settings: generators::Isolette_Thermostat_Rust_DesiredTemperatureSettings_strategy_default(),
    api_regulator_mode: generators::Isolette_Thermostat_Rust_ThermostatMode_strategy_default()
  }
}
