// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1380831503ea_Oracle_Pointwise_Realizable {
  @pure def check(
      cabinobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CabinThermalObservation,
      qualifiedtarget: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedTarget): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.Unavailable, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid))) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.Unavailable, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Invalid))) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.Heat, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid))) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.Heat, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Invalid))) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.None, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid))) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.None, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Invalid))) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.Cool, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid))) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment(need = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeed.Cool, observationInvalid = equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Invalid))))))
  }
}
