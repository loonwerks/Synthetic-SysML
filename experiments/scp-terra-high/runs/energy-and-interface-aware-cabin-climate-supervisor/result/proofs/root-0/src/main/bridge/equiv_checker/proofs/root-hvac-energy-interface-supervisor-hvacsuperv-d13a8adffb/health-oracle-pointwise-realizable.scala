// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d13a8adffb3f_Oracle_Pointwise_Realizable {
  @pure def check(
      actuationdisposition: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type,
      recoverydecision: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type,
      resourcegrant: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inactive)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.Holding)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.HeatingRequested)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.CoolingRequested)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.DefrostRequested)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.Limited)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.compute_CEP_Post(actuationdisposition, recoverydecision, resourcegrant, serviceselection, equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.InputFault)))))
  }
}
