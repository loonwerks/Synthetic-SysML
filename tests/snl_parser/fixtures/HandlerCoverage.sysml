package SNL_Handler_Coverage {
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
    attribute :>> Dispatch_Protocol = Supported_Dispatch_Protocols::Sporadic;

    in port trigger : AADL::EventPort;
    in port empty_trigger : AADL::EventPort;
    out port signal : AADL::EventPort;
    in port 'odd port' : AADL::DataPort {
      in :>> type : Base_Types::Boolean;
    }

    language "GUMBO" /*{
      compute
        // @trace SNL-HAS-EVENT
        guarantee trigger_present: HasEvent(trigger);

        guarantee trigger_present_matches_true: HasEvent(trigger) == true;

        // @trace SNL-MUST-SEND
        guarantee signal_present: MustSend(signal);

        // @trace SNL-UNRESTRICTED-NAME
        guarantee unrestricted_name: 'odd port' == 'odd port';

        handle trigger:
          // @trace SNL-HANDLER-ASSUME
          assume dispatched: true;

          compute_cases
            // @trace SNL-HANDLER-CASE
            case handler_case "A dispatched trigger is accepted,
                               |and no additional result is constrained":
              assume true;
              guarantee true;

            case unguarded_handler_case:
              guarantee true;

            case unguarded_conditional_obligation:
              guarantee true implies true;

            // @trace SNL-UNREACHABLE-CASE
            case unreachable_handler_case:
              assume false;
              guarantee true;

            // @trace SNL-COMPLEX-APPLICABILITY
            case complex_applicability:
              assume ('odd port' or HasEvent(empty_trigger)) and HasEvent(trigger);
              guarantee MustSend(signal);

        handle empty_trigger:
    }*/
  }
}
