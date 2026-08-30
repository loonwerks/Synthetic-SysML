package SNL_Composition_Coverage {
  private import AADL::*;

  part def coverage_system :> AADL::System;

  part def coverage_system_i :> coverage_system {
    part left_process : process_i;
    part right_process : process_i;

    language "GUMBO" /*{
      composition schedule_contract {
        components
          left = left_process.worker;
          right = right_process.worker;

        ports
          left_output = left.output_value;
          right_output = right.output_value;

        state
          left_memory = left.memory;

        schema {
          split {
            sequence { left @ left_first },
            sequence { right }
          };
          label branches_joined;
          left @ left_second
        }

        // @trace SNL-COMPOSITION-BASE
        abstract property base_obligations "Every schema-point spelling is retained" {
          at START: left_output == left_output;
          before left_first: left_memory == left_memory;
          after left_first: left_output == left_output;
          at branches_joined: right_output == right_output;
          before left_second: left_memory == left_memory;
          after left_second: left_output == left_output;
          at END: right_output == right_output;
        }

        abstract property extra_obligations "A second inherited parent" {
          after right: right_output == right_output;
        }

        // @trace SNL-COMPOSITION-CHILD
        property concrete_obligations specializes base_obligations, extra_obligations {
          after right: right_output == right_output;
        }

        property colon_specialization :> extra_obligations {
          after right: right_output == right_output;
        }

        property empty_property {
        }
      }
    }*/
  }

  part def process :> AADL::Process;

  part def process_i :> process {
    part worker : worker;
  }

  part def worker :> AADL::Thread {
    in port input_value : AADL::DataPort {
      in :>> type : Base_Types::Boolean;
    }

    out port output_value : AADL::DataPort {
      out :>> type : Base_Types::Boolean;
    }

    language "GUMBO" /*{
      state
        memory: Base_Types::Boolean;

      initialize
        modifies memory;
        guarantee memory_starts_true: memory;

      compute
        // @trace SNL-DIRECT-INPUT
        guarantee prior_memory: In(memory);

        // @trace SNL-PRESERVE-ENTRY
        guarantee memory_is_preserved: memory == In(memory);

        // @trace SNL-MIXED-ACTIONS
        guarantee preserve_and_set:
          memory == In(memory) and output_value == true;
    }*/
  }
}
