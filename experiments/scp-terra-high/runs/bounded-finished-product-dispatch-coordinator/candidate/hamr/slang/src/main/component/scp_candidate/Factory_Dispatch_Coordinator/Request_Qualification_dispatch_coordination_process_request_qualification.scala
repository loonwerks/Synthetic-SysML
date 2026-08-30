// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

object Request_Qualification_dispatch_coordination_process_request_qualification {
  def initialise(api: Request_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_arrival_fact(Arrival_Fact.No_Arrival_Fact)
  }

  def timeTriggered(api: Request_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val fact: Arrival_Fact.Type = qualify(api.get_request_arrival().get)
    api.put_arrival_fact(fact)
  }

  def qualify(value: Request_Arrival_Sample.Type): Arrival_Fact.Type = {
    value match {
      case Request_Arrival_Sample.No_Arrival => return Arrival_Fact.No_Arrival_Fact
      case Request_Arrival_Sample.Invalid_R1_AngleA_One => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Invalid_R1_AngleA_Two => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Invalid_R1_AngleB_One => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Invalid_R1_AngleB_Two => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Invalid_R2_AngleA_One => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Invalid_R2_AngleA_Two => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Invalid_R2_AngleB_One => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Invalid_R2_AngleB_Two => return Arrival_Fact.Invalid_Arrival
      case Request_Arrival_Sample.Valid_R1_AngleA_One => return Arrival_Fact.Valid_R1_AngleA_One
      case Request_Arrival_Sample.Valid_R1_AngleA_Two => return Arrival_Fact.Valid_R1_AngleA_Two
      case Request_Arrival_Sample.Valid_R1_AngleB_One => return Arrival_Fact.Valid_R1_AngleB_One
      case Request_Arrival_Sample.Valid_R1_AngleB_Two => return Arrival_Fact.Valid_R1_AngleB_Two
      case Request_Arrival_Sample.Valid_R2_AngleA_One => return Arrival_Fact.Valid_R2_AngleA_One
      case Request_Arrival_Sample.Valid_R2_AngleA_Two => return Arrival_Fact.Valid_R2_AngleA_Two
      case Request_Arrival_Sample.Valid_R2_AngleB_One => return Arrival_Fact.Valid_R2_AngleB_One
      case Request_Arrival_Sample.Valid_R2_AngleB_Two => return Arrival_Fact.Valid_R2_AngleB_Two
    }
  }

  def finalise(api: Request_Qualification_Operational_Api): Unit = { }
}
