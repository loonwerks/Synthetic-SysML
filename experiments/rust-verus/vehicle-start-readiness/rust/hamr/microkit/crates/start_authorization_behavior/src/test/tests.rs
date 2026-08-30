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
    crate::start_authorization_behavior_initialize();
}

  #[test]
  #[serial]
  fn test_compute() {
    crate::start_authorization_behavior_initialize();

    // populate incoming data ports
    test_apis::put_request_facts(Vehicle_Start_Readiness_Recovery_Supervisor::RequestFacts::default());
    test_apis::put_brake_facts(Vehicle_Start_Readiness_Recovery_Supervisor::BrakeFacts::default());
    test_apis::put_health_qualification(Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::default());
    test_apis::put_power_facts(Vehicle_Start_Readiness_Recovery_Supervisor::PowerFacts::default());

    crate::start_authorization_behavior_timeTriggered();
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
    api_brake_facts: generators::Vehicle_Start_Readiness_Recovery_Supervisor_BrakeFacts_strategy_default(),
    api_health_qualification: generators::Vehicle_Start_Readiness_Recovery_Supervisor_HealthQualification_strategy_default(),
    api_power_facts: generators::Vehicle_Start_Readiness_Recovery_Supervisor_PowerFacts_strategy_default(),
    api_request_facts: generators::Vehicle_Start_Readiness_Recovery_Supervisor_RequestFacts_strategy_default()
  }
}
