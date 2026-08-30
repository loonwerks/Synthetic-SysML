// #Sireum

package equiv_shared_0.Factory_Flow

import org.sireum._
import equiv_shared_0._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._

object FlowLedger_supervisorProcess_flowLedger {
  // BEGIN FUNCTIONS
  @strictpure def successor(step: Factory_Flow.FlowStep.Type): Factory_Flow.FlowStep.Type = if (step == Factory_Flow.FlowStep.Heating) Factory_Flow.FlowStep.Bending else if (step == Factory_Flow.FlowStep.Bending) Factory_Flow.FlowStep.Cutting else if (step == Factory_Flow.FlowStep.Cutting) Factory_Flow.FlowStep.Drilling else if (step == Factory_Flow.FlowStep.Drilling) Factory_Flow.FlowStep.Grinding else Factory_Flow.FlowStep.Polishing

  @strictpure def stepCode(step: Factory_Flow.FlowStep.Type): Base_Types.Integer_32 = if (step == Factory_Flow.FlowStep.Heating) s32"0" else if (step == Factory_Flow.FlowStep.Bending) s32"1" else if (step == Factory_Flow.FlowStep.Cutting) s32"2" else if (step == Factory_Flow.FlowStep.Drilling) s32"3" else if (step == Factory_Flow.FlowStep.Grinding) s32"4" else s32"5"
  // END FUNCTIONS
}
