// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f4a6faad6f35_2_Valid {
  @pure def check(
      control_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ControlFrame,
      decision_frame: equiv_shared_0.EIT_Acquisition_Supervisor.DecisionFrame,
      status_frame: equiv_shared_0.EIT_Acquisition_Supervisor.StatusFrame): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_GumboX.inititialize_IEP_Post(control_frame, status_frame))) & T))
  }
}
