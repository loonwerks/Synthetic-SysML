// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ac6f6908f611_Candidate_Pointwise_Realizable {
  @pure def check(
      temperature: equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius,
      upper_limit: equiv_shared_0.Greenhouse_Ventilation.Upper_Temperature_Limit,
      validity: equiv_shared_0.Greenhouse_Ventilation.Temperature_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_Candidate_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Greenhouse_Ventilation.Fan_Command.On, equiv_shared_0.Greenhouse_Ventilation.Sensor_Fault_Indication.Clear)) |
        (equiv_shared_0.Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_Candidate_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Greenhouse_Ventilation.Fan_Command.On, equiv_shared_0.Greenhouse_Ventilation.Sensor_Fault_Indication.Asserted)) |
        (equiv_shared_0.Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_Candidate_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Greenhouse_Ventilation.Fan_Command.Off, equiv_shared_0.Greenhouse_Ventilation.Sensor_Fault_Indication.Clear)) |
        (equiv_shared_0.Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_Candidate_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Greenhouse_Ventilation.Fan_Command.Off, equiv_shared_0.Greenhouse_Ventilation.Sensor_Fault_Indication.Asserted)))))
  }
}
