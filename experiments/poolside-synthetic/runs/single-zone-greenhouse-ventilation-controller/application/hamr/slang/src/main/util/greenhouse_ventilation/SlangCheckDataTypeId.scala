// #Sireum

package greenhouse_ventilation

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Temperature_Validity.scala

Fan_Command.scala

Sensor_Fault_Indication.scala

Temperature_Celsius.scala

Upper_Temperature_Limit.scala

Base_Types.scala

Ventilation_Decision_i_control_process_ventilation_decision_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/

@enum object _artDataContent_DataTypeId {
   "_artEmpty_Id"
   "Base_TypesBits_Payload_Id"
   "Base_TypesBoolean_Payload_Id"
   "Base_TypesCharacter_Payload_Id"
   "Base_TypesFloat_32_Payload_Id"
   "Base_TypesFloat_64_Payload_Id"
   "Base_TypesFloat_Payload_Id"
   "Base_TypesInteger_16_Payload_Id"
   "Base_TypesInteger_32_Payload_Id"
   "Base_TypesInteger_64_Payload_Id"
   "Base_TypesInteger_8_Payload_Id"
   "Base_TypesInteger_Payload_Id"
   "Base_TypesString_Payload_Id"
   "Base_TypesUnsigned_16_Payload_Id"
   "Base_TypesUnsigned_32_Payload_Id"
   "Base_TypesUnsigned_64_Payload_Id"
   "Base_TypesUnsigned_8_Payload_Id"
   "Greenhouse_VentilationFan_Command_Payload_Id"
   "Greenhouse_VentilationSensor_Fault_Indication_Payload_Id"
   "Greenhouse_VentilationTemperature_Celsius_Payload_Id"
   "Greenhouse_VentilationTemperature_Validity_Payload_Id"
   "Greenhouse_VentilationUpper_Temperature_Limit_Payload_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS_Id"
   "utilEmptyContainer_Id"
}

@enum object Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_DataTypeId {
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS_Id"
}

@enum object Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_DataTypeId {
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS_Id"
}

@enum object utilContainer_DataTypeId {
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P_Id"
   "Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS_Id"
   "utilEmptyContainer_Id"
}

