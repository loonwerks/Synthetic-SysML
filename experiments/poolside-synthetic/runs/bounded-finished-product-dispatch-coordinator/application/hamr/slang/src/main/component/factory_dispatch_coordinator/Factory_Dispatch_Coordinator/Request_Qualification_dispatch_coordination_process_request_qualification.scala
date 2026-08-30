// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualification_dispatch_coordination_process_request_qualification {

  def initialise(api: Request_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.arrival_fact == Arrival_Fact.No_Arrival_Fact
      )
    )
    api.put_arrival_fact(Factory_Dispatch_Coordinator.Arrival_Fact.No_Arrival_Fact)
  }

  def timeTriggered(api: Request_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case QUAL_NO_ARRIVAL
        (api.request_arrival == Request_Arrival_Sample.No_Arrival) ___>: (api.arrival_fact == Arrival_Fact.No_Arrival_Fact),
        // case QUAL_INVALID_ARRIVAL
        (api.request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_One |
          api.request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_Two |
          api.request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_One |
          api.request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_Two |
          api.request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_One |
          api.request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_Two |
          api.request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_One |
          api.request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_Two) ___>: (api.arrival_fact == Arrival_Fact.Invalid_Arrival),
        // case QUAL_VALID_ARRIVAL
        (api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_One |
          api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_Two |
          api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_One |
          api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_Two |
          api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_One |
          api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_Two |
          api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_One |
          api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_Two) ___>: (api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_One ___>:
          api.arrival_fact == Arrival_Fact.Valid_R1_AngleA_One &
            api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_Two ___>:
            api.arrival_fact == Arrival_Fact.Valid_R1_AngleA_Two &
              api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_One ___>:
              api.arrival_fact == Arrival_Fact.Valid_R1_AngleB_One &
                api.request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_Two ___>:
                api.arrival_fact == Arrival_Fact.Valid_R1_AngleB_Two &
                  api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_One ___>:
                  api.arrival_fact == Arrival_Fact.Valid_R2_AngleA_One &
                    api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_Two ___>:
                    api.arrival_fact == Arrival_Fact.Valid_R2_AngleA_Two &
                      api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_One ___>:
                      api.arrival_fact == Arrival_Fact.Valid_R2_AngleB_One &
                        api.request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_Two ___>:
                        api.arrival_fact == Arrival_Fact.Valid_R2_AngleB_Two)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request_arrival = api.get_request_arrival().get

    if (request_arrival == Request_Arrival_Sample.No_Arrival) {
      api.put_arrival_fact(Arrival_Fact.No_Arrival_Fact)
    } else if (request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_One |
               request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_Two |
               request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_One |
               request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_Two |
               request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_One |
               request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_Two |
               request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_One |
               request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_Two) {
      api.put_arrival_fact(Arrival_Fact.Invalid_Arrival)
    } else if (request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_One) {
      api.put_arrival_fact(Arrival_Fact.Valid_R1_AngleA_One)
    } else if (request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_Two) {
      api.put_arrival_fact(Arrival_Fact.Valid_R1_AngleA_Two)
    } else if (request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_One) {
      api.put_arrival_fact(Arrival_Fact.Valid_R1_AngleB_One)
    } else if (request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_Two) {
      api.put_arrival_fact(Arrival_Fact.Valid_R1_AngleB_Two)
    } else if (request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_One) {
      api.put_arrival_fact(Arrival_Fact.Valid_R2_AngleA_One)
    } else if (request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_Two) {
      api.put_arrival_fact(Arrival_Fact.Valid_R2_AngleA_Two)
    } else if (request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_One) {
      api.put_arrival_fact(Arrival_Fact.Valid_R2_AngleB_One)
    } else {
      api.put_arrival_fact(Arrival_Fact.Valid_R2_AngleB_Two)
    }
  }

  def finalise(api: Request_Qualification_Operational_Api): Unit = { }
}
