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
    crate::Flight_Guidance_System_Function_behavior_initialize();
}

  #[test]
  #[serial]
  fn test_compute() {
    crate::Flight_Guidance_System_Function_behavior_initialize();

    // populate incoming data ports
    test_apis::put_Display_FD(FAA_Flight_Guidance_System::Display_FD_Command::default());
    test_apis::put_Sync_FD(FAA_Flight_Guidance_System::Sync_FD_Command::default());
    test_apis::put_Aircraft_Attitude(FAA_Flight_Guidance_System::Aircraft_Attitude_Data::default());
    test_apis::put_AP_Guidance_Request(FAA_Flight_Guidance_System::AP_Guidance_Request_Data::default());

    crate::Flight_Guidance_System_Function_behavior_timeTriggered();
  }
}
