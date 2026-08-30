// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Availability_Assessment_dispatch_coordination_process_availability_assessment {

  def initialise(api: Availability_Assessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_AVAILABILITY_INVALID
        api.availability_assessment == Availability_Assessment_Value.Invalid_Availability
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_availability_assessment(Factory_Dispatch_Coordinator.Availability_Assessment_Value.Invalid_Availability)
  }

  def timeTriggered(api: Availability_Assessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        Availability_Assessment_dispatch_coordination_process_availability_assessment_GumboX.compute_CEP_Post(
          api.raw_availability, api.availability_assessment)
      )
    )
    val sample: Product_Availability_Sample = api.get_raw_availability().get
    val assessment: Availability_Assessment_Value.Type = sample.status match {
      case Input_Status.Invalid => Availability_Assessment_Value.Invalid_Availability
      case Input_Status.Valid =>
        sample.availability match {
          case Product_Availability.Unavailable => Availability_Assessment_Value.Product_Unavailable
          case Product_Availability.Available => Availability_Assessment_Value.Product_Available
        }
    }
    api.put_availability_assessment(assessment)
  }

  def finalise(api: Availability_Assessment_Operational_Api): Unit = { }
}
