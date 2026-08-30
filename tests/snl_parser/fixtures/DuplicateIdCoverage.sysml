package SNL_Duplicate_Id_Coverage {
  private import AADL::*;

  part def coverage_system :> AADL::System;

  part def coverage_system_i :> coverage_system {
    part process : coverage_process_i;
  }

  part def coverage_process :> AADL::Process;

  part def coverage_process_i :> coverage_process {
    part worker_one : worker_a;
    part worker_two : worker_b;
  }

  part def worker_a :> AADL::Thread {
    out port output_value : AADL::DataPort {
      out :>> type : Base_Types::Boolean;
    }

    language "GUMBO" /*{
      compute
        guarantee DUPLICATE_PUBLICATION_ID: output_value;
    }*/
  }

  part def worker_b :> AADL::Thread {
    out port output_value : AADL::DataPort {
      out :>> type : Base_Types::Boolean;
    }

    language "GUMBO" /*{
      compute
        guarantee DUPLICATE_PUBLICATION_ID: output_value;
    }*/
  }
}
