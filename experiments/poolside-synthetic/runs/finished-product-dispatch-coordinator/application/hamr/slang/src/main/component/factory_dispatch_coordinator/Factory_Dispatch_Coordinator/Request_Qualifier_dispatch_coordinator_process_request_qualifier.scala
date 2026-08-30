// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualifier_dispatch_coordinator_process_request_qualifier {

  def initialise(api: Request_Qualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    val fact = Factory_Dispatch_Coordinator.Qualified_Request_Fact(
      assessment = Factory_Dispatch_Coordinator.Admission_Assessment.NoRequest,
      request_id = Factory_Dispatch_Coordinator.Request_Id.None,
      product_id = Factory_Dispatch_Coordinator.Product_Id.None,
      amount = Factory_Dispatch_Coordinator.Dispatch_Amount.A0,
      freshness = Factory_Dispatch_Coordinator.Request_Freshness.Fresh)
    api.put_inventory_request_fact(fact)
    api.put_priority_admission(Factory_Dispatch_Coordinator.Admission_Assessment.NoRequest)
    api.put_arbiter_request_fact(fact)
  }

  def timeTriggered(api: Request_Qualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REQUEST_FACT_AGREEMENT
        //   publish request facts
        api.inventory_request_fact.assessment == api.priority_admission &
          api.arbiter_request_fact.assessment == api.priority_admission &
          api.inventory_request_fact.request_id == api.request.request_id &
          api.inventory_request_fact.product_id == api.request.product_id &
          api.inventory_request_fact.amount == api.request.amount &
          api.inventory_request_fact.freshness == api.request.freshness &
          api.arbiter_request_fact.request_id == api.request.request_id &
          api.arbiter_request_fact.product_id == api.request.product_id &
          api.arbiter_request_fact.amount == api.request.amount &
          api.arbiter_request_fact.freshness == api.request.freshness,
        // case REQUEST_NONE
        //   no request
        (api.request.request_id == Request_Id.None &
          api.request.product_id == Product_Id.None &
          api.request.amount == Dispatch_Amount.A0) ___>: (api.priority_admission == Admission_Assessment.NoRequest),
        // case REQUEST_MALFORMED
        (!(api.request.request_id == Request_Id.None &
          api.request.product_id == Product_Id.None &
          api.request.amount == Dispatch_Amount.A0) &
          (api.request.request_id == Request_Id.None |
            api.request.product_id == Product_Id.None |
            api.request.amount == Dispatch_Amount.A0)) ___>: (api.priority_admission == Admission_Assessment.Malformed),
        // case REQUEST_REPEATED
        (api.request.request_id != Request_Id.None &
          api.request.product_id != Product_Id.None &
          api.request.amount != Dispatch_Amount.A0 &
          api.request.freshness == Request_Freshness.Repeated) ___>: (api.priority_admission == Admission_Assessment.Repeated),
        // case REQUEST_ADMISSIBLE
        (api.request.request_id != Request_Id.None &
          api.request.product_id != Product_Id.None &
          api.request.amount != Dispatch_Amount.A0 &
          api.request.freshness == Request_Freshness.Fresh) ___>: (api.priority_admission == Admission_Assessment.AdmissibleFresh)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_request: Option[Factory_Dispatch_Coordinator.Raw_Dispatch_Request] = api.get_request()
    api.logInfo(s"Received on data port request: ${apiUsage_request}")

    val request = api.get_request().get

    val priorityAdmission: Factory_Dispatch_Coordinator.Admission_Assessment.Type =
      if (request.request_id == Request_Id.None &
          request.product_id == Product_Id.None &
          request.amount == Dispatch_Amount.A0) {
        Admission_Assessment.NoRequest
      } else if (request.request_id == Request_Id.None |
                 request.product_id == Product_Id.None |
                 request.amount == Dispatch_Amount.A0) {
        Admission_Assessment.Malformed
      } else if (request.freshness == Request_Freshness.Repeated) {
        Admission_Assessment.Repeated
      } else {
        Admission_Assessment.AdmissibleFresh
      }

    val fact = Factory_Dispatch_Coordinator.Qualified_Request_Fact(
      assessment = priorityAdmission,
      request_id = request.request_id,
      product_id = request.product_id,
      amount = request.amount,
      freshness = request.freshness)
    api.put_inventory_request_fact(fact)
    api.put_priority_admission(priorityAdmission)
    api.put_arbiter_request_fact(fact)
  }

  def finalise(api: Request_Qualifier_Operational_Api): Unit = { }
}
