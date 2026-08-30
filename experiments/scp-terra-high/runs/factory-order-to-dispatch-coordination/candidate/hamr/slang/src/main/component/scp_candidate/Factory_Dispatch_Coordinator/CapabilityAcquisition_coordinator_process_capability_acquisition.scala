// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CapabilityAcquisition_coordinator_process_capability_acquisition {

  def initialise(api: CapabilityAcquisition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_supplier_available(F)
    api.put_production_available(F)
    api.put_dispatch_available(F)
  }

  def timeTriggered(api: CapabilityAcquisition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val snapshot: Factory_Dispatch_Coordinator.CapabilitySnapshot = api.get_capability_snapshot().get
    api.put_supplier_available(snapshot.supplier_available)
    api.put_production_available(snapshot.production_available)
    api.put_dispatch_available(snapshot.dispatch_available)
  }

  def finalise(api: CapabilityAcquisition_Operational_Api): Unit = { }
}
