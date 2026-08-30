package scp_candidate.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import scp_candidate.Vehicle_Controller_Mode_Coordinator._

// This file will not be overwritten if HAMR codegen is rerun
class CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_Test extends CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_ScalaTest {

  test("Example Unit Test for Initialise Entry Point"){
    // Initialise Entry Point doesn't read input port values, so just proceed with
    // launching the entry point code
    testInitialise()
    // use get_XXX methods and check_concrete_output() from test/util/../YYY_TestApi
    // retrieve values from output ports and check against expected results
  }

  test("Example Unit Test for Compute Entry Point"){
    // use put_XXX methods from test/util/../YYY_TestApi to seed input ports with values
    testCompute()
    // use get_XXX methods and check_concrete_output() from test/util/../YYY_TestApi
    // retrieve values from output ports and check against expected results
  }
}
