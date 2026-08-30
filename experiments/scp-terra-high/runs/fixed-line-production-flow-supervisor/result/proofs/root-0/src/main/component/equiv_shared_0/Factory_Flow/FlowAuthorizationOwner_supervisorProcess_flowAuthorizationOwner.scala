// #Sireum

package equiv_shared_0.Factory_Flow

import org.sireum._
import equiv_shared_0._

object FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner {
  // BEGIN FUNCTIONS
  @strictpure def targetReady(value: Factory_Flow.TargetQualification.Type): Base_Types.Boolean = value == Factory_Flow.TargetQualification.HeatingReady |
    value == Factory_Flow.TargetQualification.BendingReady |
    value == Factory_Flow.TargetQualification.CuttingReady |
    value == Factory_Flow.TargetQualification.DrillingReady |
    value == Factory_Flow.TargetQualification.GrindingReady |
    value == Factory_Flow.TargetQualification.PolishingReady

  @strictpure def targetBlocked(value: Factory_Flow.TargetQualification.Type): Base_Types.Boolean = value == Factory_Flow.TargetQualification.HeatingBlocked |
    value == Factory_Flow.TargetQualification.BendingBlocked |
    value == Factory_Flow.TargetQualification.CuttingBlocked |
    value == Factory_Flow.TargetQualification.DrillingBlocked |
    value == Factory_Flow.TargetQualification.GrindingBlocked |
    value == Factory_Flow.TargetQualification.PolishingBlocked

  @strictpure def targetUnknown(value: Factory_Flow.TargetQualification.Type): Base_Types.Boolean = value == Factory_Flow.TargetQualification.HeatingUnknown |
    value == Factory_Flow.TargetQualification.BendingUnknown |
    value == Factory_Flow.TargetQualification.CuttingUnknown |
    value == Factory_Flow.TargetQualification.DrillingUnknown |
    value == Factory_Flow.TargetQualification.GrindingUnknown |
    value == Factory_Flow.TargetQualification.PolishingUnknown
  // END FUNCTIONS
}
