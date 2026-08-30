// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ac6f6908f611_Oracle_Assumption_Satisfiable {
  @pure def check(
      temperature: equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius,
      upper_limit: equiv_shared_0.Greenhouse_Ventilation.Upper_Temperature_Limit,
      validity: equiv_shared_0.Greenhouse_Ventilation.Temperature_Validity.Type): Unit = {
    Contract(Requires(equiv_shared_0.Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_GumboX.compute_CEP_Pre(temperature, upper_limit, validity)))
  }
}
