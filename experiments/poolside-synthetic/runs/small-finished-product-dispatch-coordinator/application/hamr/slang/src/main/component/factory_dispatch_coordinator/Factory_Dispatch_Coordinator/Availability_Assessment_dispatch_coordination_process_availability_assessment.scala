// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Availability_Assessment_dispatch_coordination_process_availability_assessment {

  def initialise(api: Availability_Assessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_AVAILABILITY_INVALID
        api.availability_assessment == Availability_Assessment_Value.Invalid_Availability
      )
    )

    api.put_availability_assessment(Factory_Dispatch_Coordinator.Availability_Assessment_Value.Invalid_Availability)
  }

  def timeTriggered(api: Availability_Assessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case AVAILABILITY_INVALID
        //   availability assessment is invalid when raw availability status is invalid
        (api.raw_availability.status == Input_Status.Invalid) ___>: (api.availability_assessment == Availability_Assessment_Value.Invalid_Availability),
        // case PRODUCT_UNAVAILABLE
        //   availability assessment is product unavailable when raw availability is valid and unavailable
        (api.raw_availability.status == Input_Status.Valid &
          api.raw_availability.availability == Product_Availability.Unavailable) ___>: (api.availability_assessment == Availability_Assessment_Value.Product_Unavailable),
        // case PRODUCT_AVAILABLE
        //   availability assessment is product available when raw availability is valid and available
        (api.raw_availability.status == Input_Status.Valid &
          api.raw_availability.availability == Product_Availability.Available) ___>: (api.availability_assessment == Availability_Assessment_Value.Product_Available)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val raw = api.get_raw_availability().get
    val assessment: Availability_Assessment_Value.Type =
      if (raw.status == Input_Status.Invalid) {
        Availability_Assessment_Value.Invalid_Availability
      } else if (raw.availability == Product_Availability.Unavailable) {
        Availability_Assessment_Value.Product_Unavailable
      } else {
        Availability_Assessment_Value.Product_Available
      }
    api.put_availability_assessment(assessment)
  }

  def finalise(api: Availability_Assessment_Operational_Api): Unit = { }
}
