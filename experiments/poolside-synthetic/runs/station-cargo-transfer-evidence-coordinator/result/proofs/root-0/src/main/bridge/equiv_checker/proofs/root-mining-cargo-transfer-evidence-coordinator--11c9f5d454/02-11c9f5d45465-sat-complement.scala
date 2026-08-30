// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_11c9f5d45465_2_Complement {
  @pure def check(
      dock_context: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type,
      dock_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_GumboX.compute_CEP_Post(dock_context, dock_facts))) & T)))
  }
}
