package SNL_Nested_Boolean_Assignment_Coverage {
  private import AADL::*;

  enum def Mode {
    enum First;
    enum Second;
  }

  part def BooleanFacts :> AADL::Data {
    attribute enabled : Base_Types::Boolean;
    attribute healthy : Base_Types::Boolean;
    attribute mode : Mode;
  }

  part def coverage_system :> AADL::System;

  part def coverage_system_i :> coverage_system {
    part process : process_i;
  }

  part def process :> AADL::Process;

  part def process_i :> process {
    part worker : worker_i;
  }

  part def worker_i :> AADL::Thread {
    in port facts : AADL::DataPort {
      in :>> type : BooleanFacts;
    }
    out port result : AADL::DataPort {
      out :>> type : Base_Types::Boolean;
    }

    language "GUMBO" /*{
      compute
        // @trace SNL-NESTED-BOOLEAN-DISJUNCTION
        guarantee BOOLEAN_DISJUNCTION_VALUE:
          result == (facts.mode == Mode.First | facts.mode == Mode.Second);

        // @trace SNL-NESTED-BOOLEAN-CONJUNCTION
        guarantee BOOLEAN_CONJUNCTION_VALUE:
          result == (facts.enabled & facts.healthy & facts.mode == Mode.First);

        // @trace SNL-NESTED-BOOLEAN-EQUALITY
        guarantee BOOLEAN_EQUALITY_VALUE:
          result == (facts.mode == Mode.Second);
    }*/
  }
}
