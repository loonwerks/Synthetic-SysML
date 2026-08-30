package SNL_Numeric_Literal_Coverage {
  private import AADL::*;

  part def literal_data :> AADL::Data;

  part def literal_data_i :> literal_data {
    part marker : Base_Types::Boolean;

    language "GUMBO" /*{
      invariants
        inv NUMERIC_LITERAL_FAMILIES:
          marker == marker and
          9[s8] > 8[s8] and
          64[z64] > 63[z64] and
          64[n64] > 63[n64] and
          1[u1] > 0[u1] and
          1[u64] > 0[u64] and
          1.0[f32] > 0.0[f32] and
          1.0[f64] > 0.0[f64] and
          1.0[r] > 0.0[r] and
          "astring"[string] == "astring"[string] and
          "c"[c] == "c"[c];
    }*/
  }

  part def coverage_system :> AADL::System;

  part def coverage_system_i :> coverage_system {
    part process : coverage_process_i;
  }

  part def coverage_process :> AADL::Process;

  part def coverage_process_i :> coverage_process {
    part worker : coverage_thread;
  }

  part def coverage_thread :> AADL::Thread {
    in port value : AADL::DataPort {
      in :>> type : literal_data_i;
    }
  }
}
