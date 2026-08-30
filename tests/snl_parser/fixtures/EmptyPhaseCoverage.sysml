package SNL_Empty_Phase_Coverage {
  private import AADL::*;

  part def coverage_system :> AADL::System;

  part def coverage_system_i :> coverage_system {
    part process : process_i;
  }

  part def process :> AADL::Process;

  part def process_i :> process {
    part worker : worker;
  }

  part def worker :> AADL::Thread {
    language "GUMBO" /*{
      initialize
      compute
    }*/
  }
}
