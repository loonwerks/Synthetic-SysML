package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor._

// This file will not be overwritten if HAMR codegen is rerun
class MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_Test extends MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_ScalaTest {

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
