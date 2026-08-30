// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d06d11213d49_Oracle_Pointwise_Realizable {
  @pure def check(
      glazingobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.GlazingObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Unavailable)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.None)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Preventive)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Urgent)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Absent, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Unavailable)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Absent, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.None)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Absent, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Preventive)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Absent, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Urgent)))))
  }
}
