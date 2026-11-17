// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualifier_supervision_requestQualifier {

  def initialise(api: RequestQualifier_Initialization_Api): Unit = {
    api.put_qualifiedTarget(HVAC_Visibility_Priority_Supervisor.QualifiedTarget(
      HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid,
      HVAC_Visibility_Priority_Supervisor.ThermalBand.Neutral))
    api.put_qualifiedRequest(HVAC_Visibility_Priority_Supervisor.QualifiedRequest(
      HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid,
      HVAC_Visibility_Priority_Supervisor.Arrival.Held,
      HVAC_Visibility_Priority_Supervisor.EnableIntent.Off,
      HVAC_Visibility_Priority_Supervisor.FanIntent.Low))
  }

  def timeTriggered(api: RequestQualifier_Operational_Api): Unit = {
    api.get_userRequest() match {
      case Some(request) =>
        val requestClass =
          if (request.validity != HVAC_Visibility_Priority_Supervisor.Validity.Valid)
            HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid
          else if (request.defrost == HVAC_Visibility_Priority_Supervisor.DefrostIntent.Requested)
            HVAC_Visibility_Priority_Supervisor.RequestClass.Defrost
          else if (request.enabled == HVAC_Visibility_Priority_Supervisor.EnableIntent.Off)
            HVAC_Visibility_Priority_Supervisor.RequestClass.Off
          else HVAC_Visibility_Priority_Supervisor.RequestClass.Comfort
        api.put_qualifiedTarget(HVAC_Visibility_Priority_Supervisor.QualifiedTarget(requestClass, request.target))
        api.put_qualifiedRequest(HVAC_Visibility_Priority_Supervisor.QualifiedRequest(
          requestClass, request.arrival, request.enabled, request.fan))
      case _ =>
        api.put_qualifiedTarget(HVAC_Visibility_Priority_Supervisor.QualifiedTarget(
          HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid,
          HVAC_Visibility_Priority_Supervisor.ThermalBand.Neutral))
        api.put_qualifiedRequest(HVAC_Visibility_Priority_Supervisor.QualifiedRequest(
          HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid,
          HVAC_Visibility_Priority_Supervisor.Arrival.Held,
          HVAC_Visibility_Priority_Supervisor.EnableIntent.Off,
          HVAC_Visibility_Priority_Supervisor.FanIntent.Low))
    }
  }

  def finalise(api: RequestQualifier_Operational_Api): Unit = { }
}
