// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_507e91f63fa8_Oracle_Pointwise_Realizable {
  @pure def check(
      raw_request: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Request_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.No_Request)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Switch_On)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Switch_Off)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Begin_Charge)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.End_Charge)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Activate)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Deactivate)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Begin_Flight)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.End_Flight)))))
  }
}
