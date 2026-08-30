// #Sireum
// @formatter:off

// This file is auto-generated from Threat_Value.scala, Threat_Status.scala, Cargo_Band.scala, Cargo_Status.scala, Capacitor_Band.scala, Capacitor_Status.scala, Operator_Request.scala, Request_Status.scala, Mining_Availability.scala, Mining_Availability_Status.scala, Defense_Availability.scala, Defense_Availability_Status.scala, Retreat_Availability.scala, Retreat_Availability_Status.scala, Service_Progress.scala, Service_Progress_Status.scala, Mining_Command.scala, Defense_Command.scala, Movement_Service_Command.scala, Operational_Phase.scala, Input_Fault.scala, Threat_Observation.scala, Cargo_Observation.scala, Capacitor_Observation.scala, Request_Observation.scala, Mining_Availability_Observation.scala, Defense_Availability_Observation.scala, Retreat_Availability_Observation.scala, Service_Progress_Observation.scala, Base_Types.scala, Threat_Qualification_supervisor_process_threat_qualification_Containers.scala, Resource_Qualification_supervisor_process_resource_qualification_Containers.scala, Request_Availability_Qualification_supervisor_process_request_availability_qualification_Containers.scala, Principal_Decision_Owner_supervisor_process_principal_decision_owner_Containers.scala, Mining_Command_Delivery_supervisor_process_mining_command_delivery_Containers.scala, Defense_Command_Delivery_supervisor_process_defense_command_delivery_Containers.scala, Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package mining_threat_retreat_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Mining_Threat_Retreat_SupervisorThreat_Value_Payload: Z = -32

    val Mining_Threat_Retreat_SupervisorThreat_Status_Payload: Z = -31

    val Mining_Threat_Retreat_SupervisorCargo_Band_Payload: Z = -30

    val Mining_Threat_Retreat_SupervisorCargo_Status_Payload: Z = -29

    val Mining_Threat_Retreat_SupervisorCapacitor_Band_Payload: Z = -28

    val Mining_Threat_Retreat_SupervisorCapacitor_Status_Payload: Z = -27

    val Mining_Threat_Retreat_SupervisorOperator_Request_Payload: Z = -26

    val Mining_Threat_Retreat_SupervisorRequest_Status_Payload: Z = -25

    val Mining_Threat_Retreat_SupervisorMining_Availability_Payload: Z = -24

    val Mining_Threat_Retreat_SupervisorMining_Availability_Status_Payload: Z = -23

    val Mining_Threat_Retreat_SupervisorDefense_Availability_Payload: Z = -22

    val Mining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload: Z = -21

    val Mining_Threat_Retreat_SupervisorRetreat_Availability_Payload: Z = -20

    val Mining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload: Z = -19

    val Mining_Threat_Retreat_SupervisorService_Progress_Payload: Z = -18

    val Mining_Threat_Retreat_SupervisorService_Progress_Status_Payload: Z = -17

    val Mining_Threat_Retreat_SupervisorMining_Command_Payload: Z = -16

    val Mining_Threat_Retreat_SupervisorDefense_Command_Payload: Z = -15

    val Mining_Threat_Retreat_SupervisorMovement_Service_Command_Payload: Z = -14

    val Mining_Threat_Retreat_SupervisorOperational_Phase_Payload: Z = -13

    val Mining_Threat_Retreat_SupervisorInput_Fault_Payload: Z = -12

    val Mining_Threat_Retreat_SupervisorThreat_Observation: Z = -11

    val Mining_Threat_Retreat_SupervisorThreat_Observation_Payload: Z = -10

    val Mining_Threat_Retreat_SupervisorCargo_Observation: Z = -9

    val Mining_Threat_Retreat_SupervisorCargo_Observation_Payload: Z = -8

    val Mining_Threat_Retreat_SupervisorCapacitor_Observation: Z = -7

    val Mining_Threat_Retreat_SupervisorCapacitor_Observation_Payload: Z = -6

    val Mining_Threat_Retreat_SupervisorRequest_Observation: Z = -5

    val Mining_Threat_Retreat_SupervisorRequest_Observation_Payload: Z = -4

    val Mining_Threat_Retreat_SupervisorMining_Availability_Observation: Z = -3

    val Mining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload: Z = -2

    val Mining_Threat_Retreat_SupervisorDefense_Availability_Observation: Z = -1

    val Mining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload: Z = 0

    val Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation: Z = 1

    val Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload: Z = 2

    val Mining_Threat_Retreat_SupervisorService_Progress_Observation: Z = 3

    val Mining_Threat_Retreat_SupervisorService_Progress_Observation_Payload: Z = 4

    val Base_TypesBoolean_Payload: Z = 5

    val Base_TypesInteger_Payload: Z = 6

    val Base_TypesInteger_8_Payload: Z = 7

    val Base_TypesInteger_16_Payload: Z = 8

    val Base_TypesInteger_32_Payload: Z = 9

    val Base_TypesInteger_64_Payload: Z = 10

    val Base_TypesUnsigned_8_Payload: Z = 11

    val Base_TypesUnsigned_16_Payload: Z = 12

    val Base_TypesUnsigned_32_Payload: Z = 13

    val Base_TypesUnsigned_64_Payload: Z = 14

    val Base_TypesFloat_Payload: Z = 15

    val Base_TypesFloat_32_Payload: Z = 16

    val Base_TypesFloat_64_Payload: Z = 17

    val Base_TypesCharacter_Payload: Z = 18

    val Base_TypesString_Payload: Z = 19

    val Base_TypesBits_Payload: Z = 20

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P: Z = 21

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS: Z = 22

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P: Z = 23

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS: Z = 24

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P: Z = 25

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS: Z = 26

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P: Z = 27

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS: Z = 28

    val Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P: Z = 29

    val Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS: Z = 30

    val Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P: Z = 31

    val Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS: Z = 32

    val Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P: Z = 33

    val Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS: Z = 34

    val Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P: Z = 35

    val Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS: Z = 36

    val Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P: Z = 37

    val Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS: Z = 38

    val Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P: Z = 39

    val Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS: Z = 40

    val Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P: Z = 41

    val Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS: Z = 42

    val Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P: Z = 43

    val Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS: Z = 44

    val Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P: Z = 45

    val Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS: Z = 46

    val Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P: Z = 47

    val Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS: Z = 48

    val utilEmptyContainer: Z = 49

    val _artEmpty: Z = 50

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeMining_Threat_Retreat_SupervisorThreat_ValueType(o: Mining_Threat_Retreat_Supervisor.Threat_Value.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Value_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Value_Payload)
      writeMining_Threat_Retreat_SupervisorThreat_ValueType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_StatusType(o: Mining_Threat_Retreat_Supervisor.Threat_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Status_Payload)
      writeMining_Threat_Retreat_SupervisorThreat_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorCargo_BandType(o: Mining_Threat_Retreat_Supervisor.Cargo_Band.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorCargo_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Band_Payload)
      writeMining_Threat_Retreat_SupervisorCargo_BandType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorCargo_StatusType(o: Mining_Threat_Retreat_Supervisor.Cargo_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorCargo_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Status_Payload)
      writeMining_Threat_Retreat_SupervisorCargo_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorCapacitor_BandType(o: Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Band_Payload)
      writeMining_Threat_Retreat_SupervisorCapacitor_BandType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorCapacitor_StatusType(o: Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Status_Payload)
      writeMining_Threat_Retreat_SupervisorCapacitor_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorOperator_RequestType(o: Mining_Threat_Retreat_Supervisor.Operator_Request.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorOperator_Request_Payload(o: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorOperator_Request_Payload)
      writeMining_Threat_Retreat_SupervisorOperator_RequestType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_StatusType(o: Mining_Threat_Retreat_Supervisor.Request_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Status_Payload)
      writeMining_Threat_Retreat_SupervisorRequest_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMining_AvailabilityType(o: Mining_Threat_Retreat_Supervisor.Mining_Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Payload)
      writeMining_Threat_Retreat_SupervisorMining_AvailabilityType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Availability_StatusType(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Status_Payload)
      writeMining_Threat_Retreat_SupervisorMining_Availability_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_AvailabilityType(o: Mining_Threat_Retreat_Supervisor.Defense_Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Payload)
      writeMining_Threat_Retreat_SupervisorDefense_AvailabilityType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Payload)
      writeMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorService_ProgressType(o: Mining_Threat_Retreat_Supervisor.Service_Progress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorService_Progress_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Payload)
      writeMining_Threat_Retreat_SupervisorService_ProgressType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorService_Progress_StatusType(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Status_Payload)
      writeMining_Threat_Retreat_SupervisorService_Progress_StatusType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMining_CommandType(o: Mining_Threat_Retreat_Supervisor.Mining_Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Payload)
      writeMining_Threat_Retreat_SupervisorMining_CommandType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_CommandType(o: Mining_Threat_Retreat_Supervisor.Defense_Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Payload)
      writeMining_Threat_Retreat_SupervisorDefense_CommandType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Payload)
      writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorOperational_PhaseType(o: Mining_Threat_Retreat_Supervisor.Operational_Phase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorOperational_Phase_Payload)
      writeMining_Threat_Retreat_SupervisorOperational_PhaseType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorInput_FaultType(o: Mining_Threat_Retreat_Supervisor.Input_Fault.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Threat_Retreat_SupervisorInput_Fault_Payload(o: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorInput_Fault_Payload)
      writeMining_Threat_Retreat_SupervisorInput_FaultType(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Observation(o: Mining_Threat_Retreat_Supervisor.Threat_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Observation)
      writeMining_Threat_Retreat_SupervisorThreat_ValueType(o.threat)
      writeMining_Threat_Retreat_SupervisorThreat_StatusType(o.threat_status)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorThreat_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorCargo_Observation(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Observation)
      writeMining_Threat_Retreat_SupervisorCargo_BandType(o.cargo_band)
      writeMining_Threat_Retreat_SupervisorCargo_StatusType(o.cargo_status)
    }

    def writeMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorCargo_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Observation)
      writeMining_Threat_Retreat_SupervisorCapacitor_BandType(o.capacitor_band)
      writeMining_Threat_Retreat_SupervisorCapacitor_StatusType(o.capacitor_status)
    }

    def writeMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Observation(o: Mining_Threat_Retreat_Supervisor.Request_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Observation)
      writeMining_Threat_Retreat_SupervisorOperator_RequestType(o.operator_request)
      writeMining_Threat_Retreat_SupervisorRequest_StatusType(o.request_status)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorRequest_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Observation)
      writeMining_Threat_Retreat_SupervisorMining_AvailabilityType(o.mining_available)
      writeMining_Threat_Retreat_SupervisorMining_Availability_StatusType(o.mining_availability_status)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Observation)
      writeMining_Threat_Retreat_SupervisorDefense_AvailabilityType(o.defense_available)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(o.defense_availability_status)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation)
      writeMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(o.retreat_available)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(o.retreat_availability_status)
    }

    def writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorService_Progress_Observation(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Observation)
      writeMining_Threat_Retreat_SupervisorService_ProgressType(o.service_progress)
      writeMining_Threat_Retreat_SupervisorService_Progress_StatusType(o.service_progress_status)
    }

    def writeMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorService_Progress_Observation(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorThreat_Observation(o.api_raw_threat)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorThreat_Observation(o.api_raw_threat)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorThreat_Observation(o.api_qualified_threat)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorThreat_Observation(o.api_qualified_threat)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_raw_capacitor)
      writeMining_Threat_Retreat_SupervisorCargo_Observation(o.api_raw_cargo)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_raw_capacitor)
      writeMining_Threat_Retreat_SupervisorCargo_Observation(o.api_raw_cargo)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_qualified_capacitor)
      writeMining_Threat_Retreat_SupervisorCargo_Observation(o.api_qualified_cargo)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_qualified_capacitor)
      writeMining_Threat_Retreat_SupervisorCargo_Observation(o.api_qualified_cargo)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_raw_defense_availability)
      writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_raw_mining_availability)
      writeMining_Threat_Retreat_SupervisorRequest_Observation(o.api_raw_request)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_raw_retreat_availability)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_raw_defense_availability)
      writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_raw_mining_availability)
      writeMining_Threat_Retreat_SupervisorRequest_Observation(o.api_raw_request)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_raw_retreat_availability)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_qualified_defense_availability)
      writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_qualified_mining_availability)
      writeMining_Threat_Retreat_SupervisorRequest_Observation(o.api_qualified_request)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_qualified_retreat_availability)
    }

    def writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_qualified_defense_availability)
      writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_qualified_mining_availability)
      writeMining_Threat_Retreat_SupervisorRequest_Observation(o.api_qualified_request)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_qualified_retreat_availability)
    }

    def writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_capacitor_input)
      writeMining_Threat_Retreat_SupervisorCargo_Observation(o.api_cargo_input)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_defense_availability_input)
      writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_mining_availability_input)
      writeMining_Threat_Retreat_SupervisorRequest_Observation(o.api_request_input)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_retreat_availability_input)
      writeMining_Threat_Retreat_SupervisorService_Progress_Observation(o.api_service_progress_input)
      writeMining_Threat_Retreat_SupervisorThreat_Observation(o.api_threat_input)
    }

    def writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorOperational_PhaseType(o.In_current_phase)
      writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_capacitor_input)
      writeMining_Threat_Retreat_SupervisorCargo_Observation(o.api_cargo_input)
      writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_defense_availability_input)
      writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_mining_availability_input)
      writeMining_Threat_Retreat_SupervisorRequest_Observation(o.api_request_input)
      writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_retreat_availability_input)
      writeMining_Threat_Retreat_SupervisorService_Progress_Observation(o.api_service_progress_input)
      writeMining_Threat_Retreat_SupervisorThreat_Observation(o.api_threat_input)
    }

    def writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_decision)
      writeMining_Threat_Retreat_SupervisorInput_FaultType(o.api_fault_decision)
      writeMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_decision)
      writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_decision)
      writeMining_Threat_Retreat_SupervisorOperational_PhaseType(o.api_phase_decision)
    }

    def writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorOperational_PhaseType(o.current_phase)
      writeMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_decision)
      writeMining_Threat_Retreat_SupervisorInput_FaultType(o.api_fault_decision)
      writeMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_decision)
      writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_decision)
      writeMining_Threat_Retreat_SupervisorOperational_PhaseType(o.api_phase_decision)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_in)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_in)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_out)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_out)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_in)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_in)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_out)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_out)
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_in)
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_in)
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_out)
    }

    def writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_out)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload => writeMining_Threat_Retreat_SupervisorCargo_Band_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload => writeMining_Threat_Retreat_SupervisorInput_Fault_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload => writeMining_Threat_Retreat_SupervisorCargo_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload => writeMining_Threat_Retreat_SupervisorThreat_Value_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload => writeMining_Threat_Retreat_SupervisorThreat_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload => writeMining_Threat_Retreat_SupervisorMining_Command_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Status_Payload => writeMining_Threat_Retreat_SupervisorRequest_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload => writeMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload => writeMining_Threat_Retreat_SupervisorDefense_Command_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload => writeMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload => writeMining_Threat_Retreat_SupervisorOperator_Request_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload => writeMining_Threat_Retreat_SupervisorService_Progress_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload => writeMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload => writeMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload => writeMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload => writeMining_Threat_Retreat_SupervisorMining_Availability_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload => writeMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload => writeMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload => writeMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload => writeMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload => writeMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload => writeMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload => writeMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload => writeMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload => writeMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload => writeMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload => writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload => writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readMining_Threat_Retreat_SupervisorThreat_ValueType(): Mining_Threat_Retreat_Supervisor.Threat_Value.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Threat_Value.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorThreat_Value_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Value_Payload = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Value_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Value_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Value_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Value_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorThreat_ValueType()
      return Mining_Threat_Retreat_Supervisor.Threat_Value_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorThreat_StatusType(): Mining_Threat_Retreat_Supervisor.Threat_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Threat_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorThreat_Status_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorThreat_StatusType()
      return Mining_Threat_Retreat_Supervisor.Threat_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorCargo_BandType(): Mining_Threat_Retreat_Supervisor.Cargo_Band.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Cargo_Band.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorCargo_Band_Payload(): Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload = {
      val r = readMining_Threat_Retreat_SupervisorCargo_Band_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCargo_Band_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Band_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorCargo_BandType()
      return Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorCargo_StatusType(): Mining_Threat_Retreat_Supervisor.Cargo_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Cargo_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorCargo_Status_Payload(): Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorCargo_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCargo_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorCargo_StatusType()
      return Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_BandType(): Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Band.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(): Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload = {
      val r = readMining_Threat_Retreat_SupervisorCapacitor_Band_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_Band_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Band_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorCapacitor_BandType()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_StatusType(): Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(): Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorCapacitor_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorCapacitor_StatusType()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorOperator_RequestType(): Mining_Threat_Retreat_Supervisor.Operator_Request.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Operator_Request.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorOperator_Request_Payload(): Mining_Threat_Retreat_Supervisor.Operator_Request_Payload = {
      val r = readMining_Threat_Retreat_SupervisorOperator_Request_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorOperator_Request_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Operator_Request_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorOperator_Request_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorOperator_RequestType()
      return Mining_Threat_Retreat_Supervisor.Operator_Request_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRequest_StatusType(): Mining_Threat_Retreat_Supervisor.Request_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Request_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorRequest_Status_Payload(): Mining_Threat_Retreat_Supervisor.Request_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRequest_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRequest_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRequest_StatusType()
      return Mining_Threat_Retreat_Supervisor.Request_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMining_AvailabilityType(): Mining_Threat_Retreat_Supervisor.Mining_Availability.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMining_Availability_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMining_AvailabilityType()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_StatusType(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMining_Availability_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMining_Availability_StatusType()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorDefense_AvailabilityType(): Mining_Threat_Retreat_Supervisor.Defense_Availability.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Availability_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorDefense_AvailabilityType()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Availability_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorDefense_Availability_StatusType()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(): Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRetreat_Availability_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRetreat_AvailabilityType()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRetreat_Availability_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorService_ProgressType(): Mining_Threat_Retreat_Supervisor.Service_Progress.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Service_Progress.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_Payload(): Mining_Threat_Retreat_Supervisor.Service_Progress_Payload = {
      val r = readMining_Threat_Retreat_SupervisorService_Progress_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorService_ProgressType()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_StatusType(): Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Status.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(): Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload = {
      val r = readMining_Threat_Retreat_SupervisorService_Progress_Status_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Status_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorService_Progress_StatusType()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMining_CommandType(): Mining_Threat_Retreat_Supervisor.Mining_Command.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Mining_Command.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Command_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMining_Command_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMining_CommandType()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorDefense_CommandType(): Mining_Threat_Retreat_Supervisor.Defense_Command.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Defense_Command.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Command_Payload = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Command_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorDefense_CommandType()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_CommandType(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorOperational_PhaseType(): Mining_Threat_Retreat_Supervisor.Operational_Phase.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Operational_Phase.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorOperational_Phase_Payload(): Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload = {
      val r = readMining_Threat_Retreat_SupervisorOperational_Phase_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorOperational_Phase_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorOperational_Phase_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorOperational_PhaseType()
      return Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorInput_FaultType(): Mining_Threat_Retreat_Supervisor.Input_Fault.Type = {
      val r = reader.readZ()
      return Mining_Threat_Retreat_Supervisor.Input_Fault.byOrdinal(r).get
    }

    def readMining_Threat_Retreat_SupervisorInput_Fault_Payload(): Mining_Threat_Retreat_Supervisor.Input_Fault_Payload = {
      val r = readMining_Threat_Retreat_SupervisorInput_Fault_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorInput_Fault_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Input_Fault_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorInput_Fault_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorInput_FaultType()
      return Mining_Threat_Retreat_Supervisor.Input_Fault_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Observation(): Mining_Threat_Retreat_Supervisor.Threat_Observation = {
      val r = readMining_Threat_Retreat_SupervisorThreat_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Observation)
      }
      val threat = readMining_Threat_Retreat_SupervisorThreat_ValueType()
      val threat_status = readMining_Threat_Retreat_SupervisorThreat_StatusType()
      return Mining_Threat_Retreat_Supervisor.Threat_Observation(threat, threat_status)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorThreat_Observation()
      return Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorCargo_Observation(): Mining_Threat_Retreat_Supervisor.Cargo_Observation = {
      val r = readMining_Threat_Retreat_SupervisorCargo_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCargo_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Observation)
      }
      val cargo_band = readMining_Threat_Retreat_SupervisorCargo_BandType()
      val cargo_status = readMining_Threat_Retreat_SupervisorCargo_StatusType()
      return Mining_Threat_Retreat_Supervisor.Cargo_Observation(cargo_band, cargo_status)
    }

    def readMining_Threat_Retreat_SupervisorCargo_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorCargo_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCargo_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCargo_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorCargo_Observation()
      return Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_Observation(): Mining_Threat_Retreat_Supervisor.Capacitor_Observation = {
      val r = readMining_Threat_Retreat_SupervisorCapacitor_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Observation)
      }
      val capacitor_band = readMining_Threat_Retreat_SupervisorCapacitor_BandType()
      val capacitor_status = readMining_Threat_Retreat_SupervisorCapacitor_StatusType()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Observation(capacitor_band, capacitor_status)
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorCapacitor_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorCapacitor_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorCapacitor_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRequest_Observation(): Mining_Threat_Retreat_Supervisor.Request_Observation = {
      val r = readMining_Threat_Retreat_SupervisorRequest_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRequest_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Observation)
      }
      val operator_request = readMining_Threat_Retreat_SupervisorOperator_RequestType()
      val request_status = readMining_Threat_Retreat_SupervisorRequest_StatusType()
      return Mining_Threat_Retreat_Supervisor.Request_Observation(operator_request, request_status)
    }

    def readMining_Threat_Retreat_SupervisorRequest_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Request_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRequest_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRequest_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRequest_Observation()
      return Mining_Threat_Retreat_Supervisor.Request_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_Observation(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation = {
      val r = readMining_Threat_Retreat_SupervisorMining_Availability_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Observation)
      }
      val mining_available = readMining_Threat_Retreat_SupervisorMining_AvailabilityType()
      val mining_availability_status = readMining_Threat_Retreat_SupervisorMining_Availability_StatusType()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation(mining_available, mining_availability_status)
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMining_Availability_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Availability_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_Observation(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Availability_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Observation)
      }
      val defense_available = readMining_Threat_Retreat_SupervisorDefense_AvailabilityType()
      val defense_availability_status = readMining_Threat_Retreat_SupervisorDefense_Availability_StatusType()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation(defense_available, defense_availability_status)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Availability_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation = {
      val r = readMining_Threat_Retreat_SupervisorRetreat_Availability_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation)
      }
      val retreat_available = readMining_Threat_Retreat_SupervisorRetreat_AvailabilityType()
      val retreat_availability_status = readMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation(retreat_available, retreat_availability_status)
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_Observation(): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation = {
      val r = readMining_Threat_Retreat_SupervisorService_Progress_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Observation)
      }
      val service_progress = readMining_Threat_Retreat_SupervisorService_ProgressType()
      val service_progress_status = readMining_Threat_Retreat_SupervisorService_Progress_StatusType()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Observation(service_progress, service_progress_status)
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorService_Progress_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorService_Progress_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorService_Progress_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorService_Progress_Observation()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P)
      }
      val api_raw_threat = readMining_Threat_Retreat_SupervisorThreat_Observation()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(api_raw_threat)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS)
      }
      val api_raw_threat = readMining_Threat_Retreat_SupervisorThreat_Observation()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(api_raw_threat)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P)
      }
      val api_qualified_threat = readMining_Threat_Retreat_SupervisorThreat_Observation()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(api_qualified_threat)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS)
      }
      val api_qualified_threat = readMining_Threat_Retreat_SupervisorThreat_Observation()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(api_qualified_threat)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P)
      }
      val api_raw_capacitor = readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      val api_raw_cargo = readMining_Threat_Retreat_SupervisorCargo_Observation()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(api_raw_capacitor, api_raw_cargo)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS)
      }
      val api_raw_capacitor = readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      val api_raw_cargo = readMining_Threat_Retreat_SupervisorCargo_Observation()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(api_raw_capacitor, api_raw_cargo)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P)
      }
      val api_qualified_capacitor = readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      val api_qualified_cargo = readMining_Threat_Retreat_SupervisorCargo_Observation()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(api_qualified_capacitor, api_qualified_cargo)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS)
      }
      val api_qualified_capacitor = readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      val api_qualified_cargo = readMining_Threat_Retreat_SupervisorCargo_Observation()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(api_qualified_capacitor, api_qualified_cargo)
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P)
      }
      val api_raw_defense_availability = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      val api_raw_mining_availability = readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      val api_raw_request = readMining_Threat_Retreat_SupervisorRequest_Observation()
      val api_raw_retreat_availability = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(api_raw_defense_availability, api_raw_mining_availability, api_raw_request, api_raw_retreat_availability)
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS)
      }
      val api_raw_defense_availability = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      val api_raw_mining_availability = readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      val api_raw_request = readMining_Threat_Retreat_SupervisorRequest_Observation()
      val api_raw_retreat_availability = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(api_raw_defense_availability, api_raw_mining_availability, api_raw_request, api_raw_retreat_availability)
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P)
      }
      val api_qualified_defense_availability = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      val api_qualified_mining_availability = readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      val api_qualified_request = readMining_Threat_Retreat_SupervisorRequest_Observation()
      val api_qualified_retreat_availability = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(api_qualified_defense_availability, api_qualified_mining_availability, api_qualified_request, api_qualified_retreat_availability)
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS)
      }
      val api_qualified_defense_availability = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      val api_qualified_mining_availability = readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      val api_qualified_request = readMining_Threat_Retreat_SupervisorRequest_Observation()
      val api_qualified_retreat_availability = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(api_qualified_defense_availability, api_qualified_mining_availability, api_qualified_request, api_qualified_retreat_availability)
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P)
      }
      val api_capacitor_input = readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      val api_cargo_input = readMining_Threat_Retreat_SupervisorCargo_Observation()
      val api_defense_availability_input = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      val api_mining_availability_input = readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      val api_request_input = readMining_Threat_Retreat_SupervisorRequest_Observation()
      val api_retreat_availability_input = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      val api_service_progress_input = readMining_Threat_Retreat_SupervisorService_Progress_Observation()
      val api_threat_input = readMining_Threat_Retreat_SupervisorThreat_Observation()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(api_capacitor_input, api_cargo_input, api_defense_availability_input, api_mining_availability_input, api_request_input, api_retreat_availability_input, api_service_progress_input, api_threat_input)
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS)
      }
      val In_current_phase = readMining_Threat_Retreat_SupervisorOperational_PhaseType()
      val api_capacitor_input = readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      val api_cargo_input = readMining_Threat_Retreat_SupervisorCargo_Observation()
      val api_defense_availability_input = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      val api_mining_availability_input = readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      val api_request_input = readMining_Threat_Retreat_SupervisorRequest_Observation()
      val api_retreat_availability_input = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      val api_service_progress_input = readMining_Threat_Retreat_SupervisorService_Progress_Observation()
      val api_threat_input = readMining_Threat_Retreat_SupervisorThreat_Observation()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(In_current_phase, api_capacitor_input, api_cargo_input, api_defense_availability_input, api_mining_availability_input, api_request_input, api_retreat_availability_input, api_service_progress_input, api_threat_input)
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P)
      }
      val api_defense_decision = readMining_Threat_Retreat_SupervisorDefense_CommandType()
      val api_fault_decision = readMining_Threat_Retreat_SupervisorInput_FaultType()
      val api_mining_decision = readMining_Threat_Retreat_SupervisorMining_CommandType()
      val api_movement_service_decision = readMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      val api_phase_decision = readMining_Threat_Retreat_SupervisorOperational_PhaseType()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(api_defense_decision, api_fault_decision, api_mining_decision, api_movement_service_decision, api_phase_decision)
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS)
      }
      val current_phase = readMining_Threat_Retreat_SupervisorOperational_PhaseType()
      val api_defense_decision = readMining_Threat_Retreat_SupervisorDefense_CommandType()
      val api_fault_decision = readMining_Threat_Retreat_SupervisorInput_FaultType()
      val api_mining_decision = readMining_Threat_Retreat_SupervisorMining_CommandType()
      val api_movement_service_decision = readMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      val api_phase_decision = readMining_Threat_Retreat_SupervisorOperational_PhaseType()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(current_phase, api_defense_decision, api_fault_decision, api_mining_decision, api_movement_service_decision, api_phase_decision)
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P)
      }
      val api_mining_in = readMining_Threat_Retreat_SupervisorMining_CommandType()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(api_mining_in)
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS)
      }
      val api_mining_in = readMining_Threat_Retreat_SupervisorMining_CommandType()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(api_mining_in)
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P)
      }
      val api_mining_out = readMining_Threat_Retreat_SupervisorMining_CommandType()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(api_mining_out)
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS)
      }
      val api_mining_out = readMining_Threat_Retreat_SupervisorMining_CommandType()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(api_mining_out)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P)
      }
      val api_defense_in = readMining_Threat_Retreat_SupervisorDefense_CommandType()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(api_defense_in)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS)
      }
      val api_defense_in = readMining_Threat_Retreat_SupervisorDefense_CommandType()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(api_defense_in)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P)
      }
      val api_defense_out = readMining_Threat_Retreat_SupervisorDefense_CommandType()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(api_defense_out)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS)
      }
      val api_defense_out = readMining_Threat_Retreat_SupervisorDefense_CommandType()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(api_defense_out)
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P)
      }
      val api_movement_service_in = readMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(api_movement_service_in)
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS)
      }
      val api_movement_service_in = readMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(api_movement_service_in)
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P)
      }
      val api_movement_service_out = readMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(api_movement_service_out)
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS)
      }
      val api_movement_service_out = readMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(api_movement_service_out)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorCargo_Band_Payload => val r = readMining_Threat_Retreat_SupervisorCargo_Band_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorInput_Fault_Payload => val r = readMining_Threat_Retreat_SupervisorInput_Fault_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorCargo_Status_Payload => val r = readMining_Threat_Retreat_SupervisorCargo_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Value_Payload => val r = readMining_Threat_Retreat_SupervisorThreat_Value_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Status_Payload => val r = readMining_Threat_Retreat_SupervisorThreat_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Payload => val r = readMining_Threat_Retreat_SupervisorMining_Command_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Status_Payload => val r = readMining_Threat_Retreat_SupervisorRequest_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorCapacitor_Band_Payload => val r = readMining_Threat_Retreat_SupervisorCapacitor_Band_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Payload => val r = readMining_Threat_Retreat_SupervisorDefense_Command_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorCapacitor_Status_Payload => val r = readMining_Threat_Retreat_SupervisorCapacitor_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorOperator_Request_Payload => val r = readMining_Threat_Retreat_SupervisorOperator_Request_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorService_Progress_Payload => val r = readMining_Threat_Retreat_SupervisorService_Progress_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorOperational_Phase_Payload => val r = readMining_Threat_Retreat_SupervisorOperational_Phase_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorCargo_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorCargo_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorThreat_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Payload => val r = readMining_Threat_Retreat_SupervisorMining_Availability_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorRequest_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Payload => val r = readMining_Threat_Retreat_SupervisorDefense_Availability_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Payload => val r = readMining_Threat_Retreat_SupervisorRetreat_Availability_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorCapacitor_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorCapacitor_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorService_Progress_Status_Payload => val r = readMining_Threat_Retreat_SupervisorService_Progress_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Payload => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Status_Payload => val r = readMining_Threat_Retreat_SupervisorMining_Availability_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload => val r = readMining_Threat_Retreat_SupervisorDefense_Availability_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload => val r = readMining_Threat_Retreat_SupervisorRetreat_Availability_Status_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorService_Progress_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorService_Progress_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorMining_Availability_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorDefense_Availability_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Value_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Value_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Value_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Value_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Value_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Value_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Value_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Value_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCargo_Band_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCargo_Band_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Band_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorCargo_Band_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCargo_Band_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCargo_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCargo_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorCargo_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCargo_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorCapacitor_Band_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCapacitor_Band_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorCapacitor_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCapacitor_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorOperator_Request_Payload(o: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorOperator_Request_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorOperator_Request_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Operator_Request_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorOperator_Request_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Operator_Request_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorOperator_Request_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorOperator_Request_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Availability_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Availability_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Availability_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Availability_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Availability_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRetreat_Availability_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRetreat_Availability_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorService_Progress_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Service_Progress_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorService_Progress_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorService_Progress_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorService_Progress_Status_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorService_Progress_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Command_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Command_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Command_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Command_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Command_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Command_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Command_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Command_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorOperational_Phase_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorOperational_Phase_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorOperational_Phase_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorOperational_Phase_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorInput_Fault_Payload(o: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorInput_Fault_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorInput_Fault_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Input_Fault_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorInput_Fault_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Input_Fault_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorInput_Fault_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorInput_Fault_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Observation(o: Mining_Threat_Retreat_Supervisor.Threat_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Observation(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCargo_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCargo_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Cargo_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Cargo_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorCargo_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCargo_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCargo_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorCargo_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCargo_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Observation(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCapacitor_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Capacitor_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorCapacitor_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCapacitor_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Observation(o: Mining_Threat_Retreat_Supervisor.Request_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Availability_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Availability_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Availability_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Observation(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorService_Progress_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorService_Progress_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorService_Progress_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}