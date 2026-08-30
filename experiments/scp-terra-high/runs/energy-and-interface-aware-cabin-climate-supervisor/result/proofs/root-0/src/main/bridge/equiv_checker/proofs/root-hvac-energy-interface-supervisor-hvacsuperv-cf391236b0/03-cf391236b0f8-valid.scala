// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cf391236b0f8_3_Valid {
  @pure def check(
      climaterequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ClimateRequest.Type,
      comfortdemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Type,
      thermalrelation: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ThermalRelation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
