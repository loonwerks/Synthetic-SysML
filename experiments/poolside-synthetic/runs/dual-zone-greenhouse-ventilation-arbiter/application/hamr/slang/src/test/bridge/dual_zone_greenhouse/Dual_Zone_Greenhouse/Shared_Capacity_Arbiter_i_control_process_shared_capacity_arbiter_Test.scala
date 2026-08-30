package dual_zone_greenhouse.Dual_Zone_Greenhouse

import org.sireum._
import dual_zone_greenhouse.Dual_Zone_Greenhouse._

// This file will not be overwritten if HAMR codegen is rerun
class Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Test extends Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_ScalaTest {

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
