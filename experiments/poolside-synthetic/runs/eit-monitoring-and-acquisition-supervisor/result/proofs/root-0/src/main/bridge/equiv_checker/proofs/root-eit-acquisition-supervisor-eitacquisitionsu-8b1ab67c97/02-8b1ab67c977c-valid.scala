// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8b1ab67c977c_2_Valid {
  @pure def check(
      control_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ControlFrame,
      decision_frame: equiv_shared_0.EIT_Acquisition_Supervisor.DecisionFrame,
      status_frame: equiv_shared_0.EIT_Acquisition_Supervisor.StatusFrame): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_GumboX.compute_CEP_Post(decision_frame, control_frame, status_frame))) & T))
  }
}
