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
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._
import org.sireum.S32._

object TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier {
  // BEGIN FUNCTIONS
  @strictpure def successorCode(step: Base_Types.Integer_32): Base_Types.Integer_32 = if (step == s32"0") s32"1" else if (step == s32"1") s32"2" else if (step == s32"2") s32"3" else if (step == s32"3") s32"4" else s32"5"

  @strictpure def relevantTarget(phaseValue: Factory_Flow.LedgerPhase.Type, stepValue: Base_Types.Integer_32): Base_Types.Integer_32 = if (phaseValue == Factory_Flow.LedgerPhase.Idle) s32"0" else if (phaseValue == Factory_Flow.LedgerPhase.Active) successorCode(stepValue) else stepValue

  @strictpure def readyTarget(stepValue: Base_Types.Integer_32): Factory_Flow.TargetQualification.Type = if (stepValue == s32"0") Factory_Flow.TargetQualification.HeatingReady else if (stepValue == s32"1") Factory_Flow.TargetQualification.BendingReady else if (stepValue == s32"2") Factory_Flow.TargetQualification.CuttingReady else if (stepValue == s32"3") Factory_Flow.TargetQualification.DrillingReady else if (stepValue == s32"4") Factory_Flow.TargetQualification.GrindingReady else Factory_Flow.TargetQualification.PolishingReady

  @strictpure def blockedTarget(stepValue: Base_Types.Integer_32): Factory_Flow.TargetQualification.Type = if (stepValue == s32"0") Factory_Flow.TargetQualification.HeatingBlocked else if (stepValue == s32"1") Factory_Flow.TargetQualification.BendingBlocked else if (stepValue == s32"2") Factory_Flow.TargetQualification.CuttingBlocked else if (stepValue == s32"3") Factory_Flow.TargetQualification.DrillingBlocked else if (stepValue == s32"4") Factory_Flow.TargetQualification.GrindingBlocked else Factory_Flow.TargetQualification.PolishingBlocked

  @strictpure def unknownTarget(stepValue: Base_Types.Integer_32): Factory_Flow.TargetQualification.Type = if (stepValue == s32"0") Factory_Flow.TargetQualification.HeatingUnknown else if (stepValue == s32"1") Factory_Flow.TargetQualification.BendingUnknown else if (stepValue == s32"2") Factory_Flow.TargetQualification.CuttingUnknown else if (stepValue == s32"3") Factory_Flow.TargetQualification.DrillingUnknown else if (stepValue == s32"4") Factory_Flow.TargetQualification.GrindingUnknown else Factory_Flow.TargetQualification.PolishingUnknown
  // END FUNCTIONS
}
