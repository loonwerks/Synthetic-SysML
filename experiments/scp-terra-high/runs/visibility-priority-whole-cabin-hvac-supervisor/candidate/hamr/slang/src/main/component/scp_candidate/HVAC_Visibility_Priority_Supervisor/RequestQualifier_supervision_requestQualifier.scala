// #Sireum

package scp_candidate.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualifier_supervision_requestQualifier {

  def initialise(api: RequestQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_REQUEST_SAFE
        api.qualifiedTarget.requestClass == RequestClass.Invalid
        // END INITIALIZES ENSURES
      )
    )
    val target: QualifiedTarget = QualifiedTarget(RequestClass.Invalid, ThermalBand.Neutral)
    val request: QualifiedRequest = QualifiedRequest(RequestClass.Invalid, Arrival.Held, EnableIntent.Off, FanIntent.Low)
    api.put_qualifiedTarget(target)
    api.put_qualifiedRequest(request)
  }

  def timeTriggered(api: RequestQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val request: UserClimateRequest = api.get_userRequest().get
    val requestClass: RequestClass.Type =
      if (request.validity == Validity.Invalid) RequestClass.Invalid
      else if (request.defrost == DefrostIntent.Requested) RequestClass.Defrost
      else if (request.enabled == EnableIntent.Off) RequestClass.Off
      else RequestClass.Comfort
    api.put_qualifiedTarget(QualifiedTarget(requestClass, request.target))
    api.put_qualifiedRequest(QualifiedRequest(requestClass, request.arrival, request.enabled, request.fan))
  }

  def finalise(api: RequestQualifier_Operational_Api): Unit = { }
}
