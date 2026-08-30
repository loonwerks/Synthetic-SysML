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
    crate::lifecycle_governor_process_lifecycle_governor_initialize();
}

  #[test]
  #[serial]
  fn test_compute() {
    crate::lifecycle_governor_process_lifecycle_governor_initialize();

    // populate incoming data ports
    test_apis::put_qualified_request(Drone_Lifecycle_Governor::Qualified_Request::default());
    test_apis::put_battery_evidence(Drone_Lifecycle_Governor::Battery_Evidence::default());
    test_apis::put_charge_sample(Drone_Lifecycle_Governor::Charge_Connection_Sample::default());

    crate::lifecycle_governor_process_lifecycle_governor_timeTriggered();
  }
}

mod GUMBOX_tests {
  use serial_test::serial;
  use proptest::prelude::*;

  use crate::test::util::*;
  use crate::testInitializeCB_macro;
  use crate::testComputeCB_macro;
    use crate::testComputeCBwGSV_macro;

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
    api_battery_evidence: generators::Drone_Lifecycle_Governor_Battery_Evidence_strategy_default(),
    api_charge_sample: generators::Drone_Lifecycle_Governor_Charge_Connection_Sample_strategy_default(),
    api_qualified_request: generators::Drone_Lifecycle_Governor_Qualified_Request_strategy_default()
  }

  testComputeCBwGSV_macro! {
    prop_testComputeCBwGSV_macro, // test name
    config: ProptestConfig { // proptest configuration, built by overriding fields from default config
      cases: numValidComputeTestCases,
      max_global_rejects: numValidComputeTestCases * computeRejectRatio,
      verbose: verbosity,
      ..ProptestConfig::default()
    },
    // strategies for generating each component input
    In_current_phase: generators::Drone_Lifecycle_Governor_Lifecycle_Phase_strategy_default(),
    In_recovery_required: generators::bool_strategy_default(),
    api_battery_evidence: generators::Drone_Lifecycle_Governor_Battery_Evidence_strategy_default(),
    api_charge_sample: generators::Drone_Lifecycle_Governor_Charge_Connection_Sample_strategy_default(),
    api_qualified_request: generators::Drone_Lifecycle_Governor_Qualified_Request_strategy_default()
  }
}
