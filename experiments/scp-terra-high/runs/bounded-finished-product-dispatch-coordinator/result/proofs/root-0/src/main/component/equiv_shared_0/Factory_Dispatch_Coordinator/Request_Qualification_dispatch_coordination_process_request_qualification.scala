// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Request_Qualification_dispatch_coordination_process_request_qualification {
  // BEGIN FUNCTIONS
  @strictpure def qualify(value: Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type): Factory_Dispatch_Coordinator.Arrival_Fact.Type = if (value == Request_Arrival_Sample.No_Arrival) Arrival_Fact.No_Arrival_Fact else if (value == Request_Arrival_Sample.Invalid_R1_AngleA_One |
          value == Request_Arrival_Sample.Invalid_R1_AngleA_Two |
          value == Request_Arrival_Sample.Invalid_R1_AngleB_One |
          value == Request_Arrival_Sample.Invalid_R1_AngleB_Two |
          value == Request_Arrival_Sample.Invalid_R2_AngleA_One |
          value == Request_Arrival_Sample.Invalid_R2_AngleA_Two |
          value == Request_Arrival_Sample.Invalid_R2_AngleB_One |
          value == Request_Arrival_Sample.Invalid_R2_AngleB_Two) Arrival_Fact.Invalid_Arrival else if (value == Request_Arrival_Sample.Valid_R1_AngleA_One) Arrival_Fact.Valid_R1_AngleA_One else if (value == Request_Arrival_Sample.Valid_R1_AngleA_Two) Arrival_Fact.Valid_R1_AngleA_Two else if (value == Request_Arrival_Sample.Valid_R1_AngleB_One) Arrival_Fact.Valid_R1_AngleB_One else if (value == Request_Arrival_Sample.Valid_R1_AngleB_Two) Arrival_Fact.Valid_R1_AngleB_Two else if (value == Request_Arrival_Sample.Valid_R2_AngleA_One) Arrival_Fact.Valid_R2_AngleA_One else if (value == Request_Arrival_Sample.Valid_R2_AngleA_Two) Arrival_Fact.Valid_R2_AngleA_Two else if (value == Request_Arrival_Sample.Valid_R2_AngleB_One) Arrival_Fact.Valid_R2_AngleB_One else Arrival_Fact.Valid_R2_AngleB_Two
  // END FUNCTIONS
}
