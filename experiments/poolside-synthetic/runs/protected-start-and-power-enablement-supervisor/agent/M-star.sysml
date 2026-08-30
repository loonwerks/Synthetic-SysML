// Canonical final source: retained architecture plus approved GUMBO behavior.
package Protected_Start_Power_Supervisor {
  private import HAMR::*;

  // Closed finite boundary and policy domains.
  enum def Validity { enum Valid; enum Invalid; }
  enum def Command { enum None; enum Start; enum Off; enum EnterMaintenance; enum ReturnToNormal; }
  enum def PedalCondition { enum Pressed; enum Released; }
  enum def TemperatureBand { enum Nominal; enum Elevated; enum OverLimit; }
  enum def SupplyAvailability { enum Available; enum Unavailable; }
  enum def ParkingBrakeCondition { enum Applied; enum Released; }
  enum def SelfTestProgress { enum Idle; enum Running; enum Passed; enum Failed; }
  enum def QualifiedTemperature { enum InvalidEvidence; enum Nominal; enum Elevated; enum OverLimit; }
  enum def ThermalState { enum Blocked; enum Confirming; enum Clear; }
  enum def SelfTestState { enum Untested; enum Testing; enum Passed; enum Failed; }
  enum def Session { enum Off; enum Arming; enum On; enum Degraded; enum Maintenance; }
  enum def RearmState { enum Blocked; enum Confirming; enum Ready; }
  enum def Notice { enum FaultAttention; enum RecoveryRequired; enum RecoveryConfirming; enum Maintenance; enum Starting; enum Enabled; enum Off; }
  enum def SessionCause {
    enum CurrentFault; enum FreshRecoveryAccepted; enum RecoveryPending;
    enum OffAccepted; enum MaintenanceAccepted; enum StartAccepted;
    enum StartRejected; enum EnableCompleted; enum EnableAborted;
    enum OnSustained; enum ReadinessWithdrawn; enum NoApplicableRequest;
  }
  enum def FuelDisposition { enum Inhibit; enum Enable; }
  enum def ElectricalDisposition { enum Isolate; enum Provide; }
  enum def ParkingBrakeDisposition { enum Apply; enum Release; }

  // Every field below is an attribute because final GUMBO inspects it.
  part def CommandReport :> Data {
    attribute command : Command;
    attribute status : Validity;
  }
  part def BrakePedalReport :> Data {
    attribute condition : PedalCondition;
    attribute status : Validity;
  }
  part def TemperatureReport :> Data {
    attribute band : TemperatureBand;
    attribute status : Validity;
  }
  part def ElectricalPowerReport :> Data {
    attribute availability : SupplyAvailability;
    attribute status : Validity;
  }
  part def ParkingBrakeReport :> Data {
    attribute condition : ParkingBrakeCondition;
    attribute status : Validity;
  }
  part def SelfTestReport :> Data {
    attribute progress : SelfTestProgress;
    attribute status : Validity;
  }
  part def QualifiedCommandFacts :> Data {
    attribute command : Command;
    attribute selfTestResetRequested : Base_Types::Boolean;
  }
  part def QualifiedPedalFacts :> Data {
    attribute pedalStartCondition : Base_Types::Boolean;
  }
  part def QualifiedSupplyFacts :> Data {
    attribute supplyUsable : Base_Types::Boolean;
  }
  part def QualifiedParkingBrakeFacts :> Data {
    attribute brakeAppliedEvidence : Base_Types::Boolean;
  }
  part def ThermalStateFacts :> Data {
    attribute thermalState : ThermalState;
    attribute thermalClear : Base_Types::Boolean;
  }
  part def SelfTestStateFacts :> Data {
    attribute selfTestState : SelfTestState;
    attribute selfTestPassed : Base_Types::Boolean;
  }
  part def StartRestraintFact :> Data {
    attribute startRestraintSatisfied : Base_Types::Boolean;
  }
  part def ReadinessFacts :> Data {
    attribute startReady : Base_Types::Boolean;
    attribute sustainReady : Base_Types::Boolean;
  }
  part def ExactFaultSummary :> Data {
    attribute commandFault : Base_Types::Boolean;
    attribute pedalFault : Base_Types::Boolean;
    attribute thermalFault : Base_Types::Boolean;
    attribute supplyFault : Base_Types::Boolean;
    attribute parkingBrakeFault : Base_Types::Boolean;
    attribute selfTestFault : Base_Types::Boolean;
    attribute anyFault : Base_Types::Boolean;
  }
  part def RearmStateFacts :> Data {
    attribute rearmState : RearmState;
  }
  part def RecoveryPermitFact :> Data {
    attribute recoveryPermit : Base_Types::Boolean;
  }
  part def SessionDecisionFacts :> Data {
    attribute session : Session;
    attribute cause : SessionCause;
  }
  part def ActuationDisposition :> Data {
    attribute fuel : FuelDisposition;
    attribute electricalPower : ElectricalDisposition;
    attribute parkingBrake : ParkingBrakeDisposition;
  }
  part def SupervisoryStatus :> Data {
    attribute session : Session;
    attribute startReady : Base_Types::Boolean;
    attribute sustainReady : Base_Types::Boolean;
    attribute rearmState : RearmState;
    attribute notice : Notice;
    attribute commandFault : Base_Types::Boolean;
    attribute pedalFault : Base_Types::Boolean;
    attribute thermalFault : Base_Types::Boolean;
    attribute supplyFault : Base_Types::Boolean;
    attribute parkingBrakeFault : Base_Types::Boolean;
    attribute selfTestFault : Base_Types::Boolean;
    attribute anyFault : Base_Types::Boolean;
  }

  part def CommandQualificationOwner :> Thread {
    port command_report : DataPort { in :>> type : CommandReport; }
    port qualified_command_facts : DataPort { out :>> type : QualifiedCommandFacts; }
    port command_fault : DataPort { out :>> type : Base_Types::Boolean; }

  language "GUMBO" /*{
    initialize
      guarantee INITIAL_COMMAND_QUALIFICATION "command is None, selfTestResetRequested false, command fault false initially":
        (qualified_command_facts.command == Command.None) &
        (qualified_command_facts.selfTestResetRequested == F) &
        (command_fault == F);

    compute
      modifies qualified_command_facts, command_fault;
      guarantee COMMAND_QUALIFICATION_TOTAL "qualified command facts per command report status":
        ((command_report.status == Validity.Valid) & (qualified_command_facts.command == command_report.command) | (command_report.status == Validity.Invalid) & (qualified_command_facts.command == Command.None)) &
        (qualified_command_facts.selfTestResetRequested == ((command_report.status == Validity.Valid) & (command_report.command == Command.Off) | (command_report.status == Validity.Valid) & (command_report.command == Command.EnterMaintenance))) &
        (command_fault == (command_report.status == Validity.Invalid));
  }*/

                        
                
                        
                                                
                                                           
                                                                                   
             
                         
                                              
                                                       
                                                              
                                                     
                                                                         
                                                            
                                                      
                                                     
                                                                     
                                                                         
       
  }
  part def BrakePedalQualificationOwner :> Thread {
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    port qualified_pedal_facts : DataPort { out :>> type : QualifiedPedalFacts; }
    port pedal_fault : DataPort { out :>> type : Base_Types::Boolean; }

  language "GUMBO" /*{
    integration
      assume pedalStartCondition "brake pedal report is a current snapshot of TYPE-02":
        (brake_pedal_report.status == Validity.Valid) | (brake_pedal_report.status == Validity.Invalid);

    initialize
      guarantee INITIAL_PEDAL_QUALIFICATION "pedalStartCondition and pedal fault are false initially":
        (qualified_pedal_facts.pedalStartCondition == F) &
        (pedal_fault == F);

    compute
      modifies qualified_pedal_facts, pedal_fault;
      guarantee PEDAL_QUALIFICATION_TOTAL "qualified pedal facts per brake pedal report status and condition":
        (qualified_pedal_facts.pedalStartCondition == ((brake_pedal_report.status == Validity.Valid) & (brake_pedal_report.condition == PedalCondition.Pressed))) &
        (pedal_fault == (brake_pedal_report.status == Validity.Invalid));
  }*/

                        
                                              
                                                                            
             
                         
                                            
                                                       
                                                          
                                                                       
                                                                           
       
  }
  part def TemperatureQualificationOwner :> Thread {
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    port qualified_temperature : DataPort { out :>> type : QualifiedTemperature; }

  language "GUMBO" /*{
    initialize
      guarantee INITIAL_TEMPERATURE_QUALIFICATION "qualified temperature is InvalidEvidence initially":
        qualified_temperature == QualifiedTemperature.InvalidEvidence;

    compute
      modifies qualified_temperature;
      guarantee TEMPERATURE_QUALIFICATION_TOTAL "qualified temperature per temperature report status and band":
        ((temperature_report.status == Validity.Invalid) & (qualified_temperature == QualifiedTemperature.InvalidEvidence)) |
        ((temperature_report.status == Validity.Valid) & (temperature_report.band == TemperatureBand.Nominal) & (qualified_temperature == QualifiedTemperature.Nominal)) |
        ((temperature_report.status == Validity.Valid) & (temperature_report.band == TemperatureBand.Elevated) & (qualified_temperature == QualifiedTemperature.Elevated)) |
        ((temperature_report.status == Validity.Valid) & (temperature_report.band == TemperatureBand.OverLimit) & (qualified_temperature == QualifiedTemperature.OverLimit));
  }*/

                        
                
                        
                                                    
                                                                        
             
                         
                                                  
                                                           
                                                                            
                                                         
                                                                
                                                                    
                                                         
                                                                 
                                                                     
                                                         
                                                                  
                                                                      
       
  }
  part def ElectricalSupplyQualificationOwner :> Thread {
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    port qualified_supply_facts : DataPort { out :>> type : QualifiedSupplyFacts; }
    port supply_fault : DataPort { out :>> type : Base_Types::Boolean; }

  language "GUMBO" /*{
    initialize
      guarantee INITIAL_SUPPLY_QUALIFICATION "supplyUsable false and supply fault false initially":
        (qualified_supply_facts.supplyUsable == F) &
        (supply_fault == F);

    compute
      modifies qualified_supply_facts, supply_fault;
      guarantee SUPPLY_QUALIFICATION_TOTAL "qualified supply facts per electrical power report status and availability":
        (qualified_supply_facts.supplyUsable == ((electrical_power_report.status == Validity.Valid) & (electrical_power_report.availability == SupplyAvailability.Available))) &
        (supply_fault == (electrical_power_report.status == Validity.Invalid));
  }*/

                        
                
                        
                                               
                                                                       
             
                         
                                             
                                                 
                                                               
                                                                                     
                                                                                 
       
  }
  part def ParkingBrakeQualificationOwner :> Thread {
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    port qualified_parking_brake_facts : DataPort { out :>> type : QualifiedParkingBrakeFacts; }
    port parking_brake_fault : DataPort { out :>> type : Base_Types::Boolean; }

  language "GUMBO" /*{
    initialize
      guarantee INITIAL_PARKING_BRAKE_QUALIFICATION "brakeAppliedEvidence false and parking brake fault false initially":
        (qualified_parking_brake_facts.brakeAppliedEvidence == F) &
        (parking_brake_fault == F);

    compute
      modifies qualified_parking_brake_facts, parking_brake_fault;
      guarantee PARKING_BRAKE_QUALIFICATION_TOTAL "qualified parking brake facts per parking brake report status and condition":
        (qualified_parking_brake_facts.brakeAppliedEvidence == ((parking_brake_report.status == Validity.Valid) & (parking_brake_report.condition == ParkingBrakeCondition.Applied))) &
        (parking_brake_fault == (parking_brake_report.status == Validity.Invalid));
  }*/

                        
                                                      
                                                                   
                                   
             
                         
                                                    
                                                                
                                                            
                                                                                
                                                                                     
       
  }
  part def ThermalClearanceStateOwner :> Thread {
    port qualified_temperature : DataPort { in :>> type : QualifiedTemperature; }
    port thermal_state_facts : DataPort { out :>> type : ThermalStateFacts; }
    port thermal_fault : DataPort { out :>> type : Base_Types::Boolean; }

  language "GUMBO" /*{
    state
      thermalMemory : ThermalState;

    initialize
      modifies thermalMemory;
      guarantee INITIAL_THERMAL_BLOCKED "thermal memory Blocked, thermalState Blocked, thermalClear false, thermalFault false initially":
        (thermalMemory == ThermalState.Blocked) &
        (thermal_state_facts.thermalState == ThermalState.Blocked) &
        (thermal_state_facts.thermalClear == F) &
        (thermal_fault == F);

    compute
      modifies thermalMemory, thermal_state_facts, thermal_fault;
      guarantee THERMAL_OUTPUT_COHERENCE "thermalState tracks thermalMemory and thermalClear iff thermalMemory is Clear":
        (thermal_state_facts.thermalState == thermalMemory) &
        (thermal_state_facts.thermalClear == (thermalMemory == ThermalState.Clear));
      compute_cases
      case THERMAL_BLOCK_CURRENT_FAULT "InvalidEvidence or OverLimit forces Blocked with thermal fault":
        assume (qualified_temperature == QualifiedTemperature.InvalidEvidence) | (qualified_temperature == QualifiedTemperature.OverLimit);
        guarantee (thermalMemory == ThermalState.Blocked) &
          (thermal_state_facts.thermalClear == F) &
          (thermal_fault == T);
      case THERMAL_ELEVATED_RESET_BLOCKED "Elevated forces Blocked without thermal fault":
        assume qualified_temperature == QualifiedTemperature.Elevated;
        guarantee (thermalMemory == ThermalState.Blocked) &
          (thermal_state_facts.thermalClear == F) &
          (thermal_fault == F);
      case THERMAL_FIRST_NOMINAL "Nominal from Blocked moves to Confirming without thermal fault":
        assume (qualified_temperature == QualifiedTemperature.Nominal) & (In(thermalMemory) == ThermalState.Blocked);
        guarantee (thermalMemory == ThermalState.Confirming) &
          (thermal_state_facts.thermalClear == F) &
          (thermal_fault == F);
      case THERMAL_SECOND_NOMINAL "Nominal from Confirming moves to Clear":
        assume (qualified_temperature == QualifiedTemperature.Nominal) & (In(thermalMemory) == ThermalState.Confirming);
        guarantee (thermalMemory == ThermalState.Clear) &
          (thermal_state_facts.thermalClear == T) &
          (thermal_fault == F);
      case THERMAL_CLEAR_RETENTION "Nominal from Clear retains Clear":
        assume (qualified_temperature == QualifiedTemperature.Nominal) & (In(thermalMemory) == ThermalState.Clear);
        guarantee (thermalMemory == ThermalState.Clear) &
          (thermal_state_facts.thermalClear == T) &
          (thermal_fault == F);
  }*/

                        
           
                         
                                    
                
                               
                        
                                          
                                                 
                                                                    
                                                                     
             
                               
                         
                                           
                                                             
                                                                                      
                     
                                 
                                           
                                                                                  
                                                                      
                                                             
                                                                         
                                 
                                              
                                                                          
                                                             
                                                                         
                                 
                                     
                                                                          
                                                        
                                                                
                                                                         
                                 
                                      
                                                                          
                                                           
                                                           
                                                                         
                                 
                                       
                                                                          
                                                      
                                                           
                                                                         
       
  }
  part def SelfTestCampaignStateOwner :> Thread {
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    port self_test_state_facts : DataPort { out :>> type : SelfTestStateFacts; }
    port self_test_fault : DataPort { out :>> type : Base_Types::Boolean; }

  language "GUMBO" /*{
    state
      selfTestMemory : SelfTestState;

    initialize
      modifies selfTestMemory;
      guarantee INITIAL_SELF_TEST_UNTESTED "self test memory Untested, selfTestState Untested, selfTestPassed false, self test fault false initially":
        (selfTestMemory == SelfTestState.Untested) &
        (self_test_state_facts.selfTestState == SelfTestState.Untested) &
        (self_test_state_facts.selfTestPassed == F) &
        (self_test_fault == F);

    compute
      modifies selfTestMemory, self_test_state_facts, self_test_fault;
      guarantee SELF_TEST_OUTPUT_COHERENCE "selfTestState tracks selfTestMemory and selfTestPassed iff selfTestMemory is Passed":
        (self_test_state_facts.selfTestState == selfTestMemory) &
        (self_test_state_facts.selfTestPassed == (selfTestMemory == SelfTestState.Passed));
      compute_cases
      case SELF_TEST_FAILURE_DOMINATES "Invalid report or Failed progress forces Failed memory and fault":
        assume (self_test_report.status == Validity.Invalid) | ((self_test_report.status == Validity.Valid) & (self_test_report.progress == SelfTestProgress.Failed));
        guarantee (selfTestMemory == SelfTestState.Failed) &
          (self_test_state_facts.selfTestPassed == F) &
          (self_test_fault == T);
      case SELF_TEST_VALID_RESET "Valid non-failed report with reset requested returns to Untested":
        assume (self_test_report.status == Validity.Valid) & (self_test_report.progress != SelfTestProgress.Failed) & (qualified_command_facts.selfTestResetRequested == T);
        guarantee (selfTestMemory == SelfTestState.Untested) &
          (self_test_state_facts.selfTestPassed == F) &
          (self_test_fault == F);
      case SELF_TEST_START_RUNNING "Valid non-failed report, reset not requested, Start, Running from Untested enters Testing":
        assume (self_test_report.status == Validity.Valid) & (self_test_report.progress != SelfTestProgress.Failed) & (qualified_command_facts.selfTestResetRequested == F) & (In(selfTestMemory) == SelfTestState.Untested) & (qualified_command_facts.command == Command.Start) & (self_test_report.progress == SelfTestProgress.Running);
        guarantee (selfTestMemory == SelfTestState.Testing) &
          (self_test_state_facts.selfTestPassed == F) &
          (self_test_fault == F);
      case SELF_TEST_FRESH_START_PASS "Valid non-failed report, reset not requested, Start, Passed from Untested enters Passed":
        assume (self_test_report.status == Validity.Valid) & (self_test_report.progress != SelfTestProgress.Failed) & (qualified_command_facts.selfTestResetRequested == F) & (In(selfTestMemory) == SelfTestState.Untested) & (qualified_command_facts.command == Command.Start) & (self_test_report.progress == SelfTestProgress.Passed);
        guarantee (selfTestMemory == SelfTestState.Passed) &
          (self_test_state_facts.selfTestPassed == T) &
          (self_test_fault == F);
      case SELF_TEST_RUNNING_TO_PASS "Valid non-failed report, reset not requested, Passed from Testing enters Passed":
        assume (self_test_report.status == Validity.Valid) & (self_test_report.progress != SelfTestProgress.Failed) & (qualified_command_facts.selfTestResetRequested == F) & (In(selfTestMemory) == SelfTestState.Testing) & (self_test_report.progress == SelfTestProgress.Passed);
        guarantee (selfTestMemory == SelfTestState.Passed) &
          (self_test_state_facts.selfTestPassed == T) &
          (self_test_fault == F);
      case SELF_TEST_PASS_RETENTION "Valid non-failed report, reset not requested, Passed retained":
        assume (self_test_report.status == Validity.Valid) & (self_test_report.progress != SelfTestProgress.Failed) & (qualified_command_facts.selfTestResetRequested == F) & (In(selfTestMemory) == SelfTestState.Passed);
        guarantee (selfTestMemory == SelfTestState.Passed) &
          (self_test_state_facts.selfTestPassed == T) &
          (self_test_fault == F);
      case SELF_TEST_OTHER_RETENTION "Valid non-failed report, reset not requested, retains memory otherwise":
        assume (self_test_report.status == Validity.Valid) & (self_test_report.progress != SelfTestProgress.Failed) & (qualified_command_facts.selfTestResetRequested == F) & (
          ((In(selfTestMemory) == SelfTestState.Untested) & ((qualified_command_facts.command != Command.Start) | ((self_test_report.progress != SelfTestProgress.Running) & (self_test_report.progress != SelfTestProgress.Passed)))) |
          ((In(selfTestMemory) == SelfTestState.Testing) & (self_test_report.progress != SelfTestProgress.Passed)) |
          (In(selfTestMemory) == SelfTestState.Failed)
        );
        guarantee (selfTestMemory == In(selfTestMemory)) &
          (self_test_state_facts.selfTestPassed == F) &
          (self_test_fault == (In(selfTestMemory) == SelfTestState.Failed));
  }*/

                        
           
                         
                                      
                
                                
                        
                                             
                                                    
                                                                         
                                                                           
             
                                
                         
                                             
                                                                 
                                                                                             
                     
                                
                                           
                                                                
                                                          
                                                                     
                                                              
                                                                               
                                
                                     
                                                              
                                                                    
                                                             
                                                                
                                                                               
                                
                                       
                                                              
                                                                    
                                                                   
                                                            
                                                                
                                                                    
                                                               
                                                                               
                                
                                          
                                                              
                                                                    
                                                                   
                                                            
                                                                
                                                                   
                                                              
                                                                               
                                
                                         
                                                              
                                                                    
                                                                   
                                                           
                                                                   
                                                              
                                                                               
                                
                                        
                                                              
                                                                    
                                                                   
                                                         
                                                              
                                                                               
                                
                                         
                                                              
                                                                    
                                                                   
                                                              
                                                                   
                                                                         
                                                                           
                                                             
                                                                       
                                                           
                                                            
                                                         
                                                                            
       
  }
  part def StartRestraintDecisionOwner :> Thread {
    port qualified_pedal_facts : DataPort { in :>> type : QualifiedPedalFacts; }
    port qualified_parking_brake_facts : DataPort { in :>> type : QualifiedParkingBrakeFacts; }
    port start_restraint_fact : DataPort { out :>> type : StartRestraintFact; }

  language "GUMBO" /*{
    initialize
      guarantee INITIAL_RESTRAINT_UNSATISFIED "start restraint not satisfied initially":
        start_restraint_fact.startRestraintSatisfied == F;

    compute
      modifies start_restraint_fact;
      guarantee START_RESTRAINT_DECISION "start restraint satisfied iff qualified pedal and parking brake evidence both hold":
        (start_restraint_fact.startRestraintSatisfied == (qualified_pedal_facts.pedalStartCondition & qualified_parking_brake_facts.brakeAppliedEvidence));
  }*/

                        
                
                        
                                                
                                                            
             
                         
                                           
                                                          
                                                        
                                                                  
       
  }
  part def ReadinessCompositionOwner :> Thread {
    port qualified_supply_facts : DataPort { in :>> type : QualifiedSupplyFacts; }
    port thermal_state_facts : DataPort { in :>> type : ThermalStateFacts; }
    port self_test_state_facts : DataPort { in :>> type : SelfTestStateFacts; }
    port start_restraint_fact : DataPort { in :>> type : StartRestraintFact; }
    port readiness_facts : DataPort { out :>> type : ReadinessFacts; }

  language "GUMBO" /*{
    initialize
      guarantee INITIAL_NOT_READY "startReady false and sustainReady false initially":
        (readiness_facts.startReady == F) &
        (readiness_facts.sustainReady == F);

    compute
      modifies readiness_facts;
      guarantee READINESS_COMPOSITION "startReady and sustainReady from supply, thermal, self-test, and start restraint evidence":
        (readiness_facts.startReady == (qualified_supply_facts.supplyUsable & thermal_state_facts.thermalClear & self_test_state_facts.selfTestPassed & start_restraint_fact.startRestraintSatisfied)) &
        (readiness_facts.sustainReady == (qualified_supply_facts.supplyUsable & thermal_state_facts.thermalClear & self_test_state_facts.selfTestPassed));
  }*/

                        
                
                        
                                    
                                                                              
             
                         
                                        
                                        
                                                  
                                               
                                                   
                                                             
                                          
                                                  
                                               
                                                    
       
  }
  part def OperatingSessionStatePriorityOwner :> Thread {
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port recovery_permit_fact : DataPort { in :>> type : RecoveryPermitFact; }
    port session_decision_facts : DataPort { out :>> type : SessionDecisionFacts; }

                        
           
                         
                               
                
                               
                        
                                      
                                        
                                                         
                                                                           
             
                               
                                
                                           
                                                          
                     
                                   
                                     
                                                
                                                         
                                                                        
                                   
                                               
                                                      
                                                     
                                                  
                                                    
                                                                                 
                                   
                                          
                                                      
                                                     
                                                       
                                                         
                                                                           
                                   
                                    
                                                      
                                                     
                                                             
                                                    
                                                                       
                                   
                                            
                                                      
                                                     
                                                                          
                                                            
                                                                               
                                   
                                      
                                                      
                                                 
                                                          
                                                                
                                         
                                                       
                                                                         
                                   
                                      
                                                      
                                                 
                                                          
                                                                
                                              
                                                          
                                                                         
                                   
                                        
                                                      
                                                   
                                                              
                                                                           
                                           
                                                   
                                                                           
                                   
                                      
                                                      
                                                   
                                                              
                                                                           
                                                
                                                    
                                                                         
                                   
                                    
                                                      
                                               
                                                              
                                                                           
                                           
                                                   
                                                                       
                                   
                                           
                                                      
                                               
                                                              
                                                                           
                                                
                                                         
                                                                              
                                   
                                             
                                                      
                                                 
                                                          
                                                                
                                                                          
                                                          
                                                                               
       
  }
  part def FaultVectorCompositionOwner :> Thread {
    port command_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port pedal_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port thermal_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port supply_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port parking_brake_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port self_test_fault : DataPort { in :>> type : Base_Types::Boolean; }
    port exact_fault_summary : DataPort { out :>> type : ExactFaultSummary; }

  language "GUMBO" /*{
    initialize
      guarantee INITIAL_FAULT_VECTOR_CLEAR "exact fault summary fields are false initially":
        (exact_fault_summary.commandFault == F) &
        (exact_fault_summary.pedalFault == F) &
        (exact_fault_summary.thermalFault == F) &
        (exact_fault_summary.supplyFault == F) &
        (exact_fault_summary.parkingBrakeFault == F) &
        (exact_fault_summary.selfTestFault == F) &
        (exact_fault_summary.anyFault == F);

    compute
      modifies exact_fault_summary;
      guarantee EXACT_FAULT_VECTOR_AND_OR "exact fault summary mirrors each fault and anyFault is their OR":
        (exact_fault_summary.commandFault == command_fault) &
        (exact_fault_summary.pedalFault == pedal_fault) &
        (exact_fault_summary.thermalFault == thermal_fault) &
        (exact_fault_summary.supplyFault == supply_fault) &
        (exact_fault_summary.parkingBrakeFault == parking_brake_fault) &
        (exact_fault_summary.selfTestFault == self_test_fault) &
        (exact_fault_summary.anyFault == (command_fault | pedal_fault | thermal_fault | supply_fault | parking_brake_fault | self_test_fault));
  }*/

                        
                
                        
                                             
                                                 
                                               
                                                 
                                                
                                                      
                                                  
                                            
             
                              
                                            
                                                             
                                                         
                                                             
                                                           
                                                                        
                                                                
                                          
                                                                         
                                                     
       
  }
  part def RearmQualificationStateOwner :> Thread {
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port rearm_state_facts : DataPort { out :>> type : RearmStateFacts; }
    port recovery_permit_fact : DataPort { out :>> type : RecoveryPermitFact; }

  language "GUMBO" /*{
    state
      rearmMemory : RearmState;

    initialize
      modifies rearmMemory;
      guarantee INITIAL_REARM_BLOCKED "rearm memory Blocked, rearmState Blocked, recovery permit true initially":
        (rearmMemory == RearmState.Blocked) &
        (rearm_state_facts.rearmState == RearmState.Blocked) &
        (recovery_permit_fact.recoveryPermit == T);

    compute
      modifies rearmMemory, rearm_state_facts, recovery_permit_fact;
      guarantee REARM_OUTPUT_COHERENCE "rearmState tracks rearmMemory":
        rearm_state_facts.rearmState == rearmMemory;
      compute_cases
      case REARM_CURRENT_FAULT "anyFault forces rearm Blocked with recovery permit":
        assume exact_fault_summary.anyFault == T;
        guarantee (rearmMemory == RearmState.Blocked) &
          (recovery_permit_fact.recoveryPermit == T);
      case REARM_NOT_SUSTAIN_READY "no fault and not sustainReady forces rearm Blocked with recovery permit":
        assume (exact_fault_summary.anyFault == F) & (readiness_facts.sustainReady == F);
        guarantee (rearmMemory == RearmState.Blocked) &
          (recovery_permit_fact.recoveryPermit == T);
      case REARM_FIRST_CLEAN_SNAPSHOT "no fault, sustainReady, Blocked on entry to Confirming with recovery permit":
        assume (exact_fault_summary.anyFault == F) & (readiness_facts.sustainReady == T) & (In(rearmMemory) == RearmState.Blocked);
        guarantee (rearmMemory == RearmState.Confirming) &
          (recovery_permit_fact.recoveryPermit == T);
      case REARM_SECOND_CLEAN_SNAPSHOT "no fault, sustainReady, Confirming on entry to Ready with recovery permit":
        assume (exact_fault_summary.anyFault == F) & (readiness_facts.sustainReady == T) & (In(rearmMemory) == RearmState.Confirming);
        guarantee (rearmMemory == RearmState.Ready) &
          (recovery_permit_fact.recoveryPermit == T);
      case REARM_READY_FRESH_REQUEST "no fault, sustainReady, Ready on entry retains Ready, recovery permit iff ReturnToNormal":
        assume (exact_fault_summary.anyFault == F) & (readiness_facts.sustainReady == T) & (In(rearmMemory) == RearmState.Ready);
        guarantee (rearmMemory == RearmState.Ready) &
          (recovery_permit_fact.recoveryPermit == (qualified_command_facts.command == Command.ReturnToNormal));
  }*/

                        
           
                         
                                
                
                             
                        
                                        
                                             
                                                              
                                                   
             
                             
                         
                                         
                                                      
                     
                                 
                                   
                                                
                                                         
                                                       
                                 
                                       
                                                                                         
                                                         
                                                       
                                 
                                          
                                                                                     
                                                    
                                                            
                                                       
                                 
                                           
                                                                                     
                                                       
                                                       
                                                       
                                 
                                         
                                                                                     
                                                  
                                                       
                                                     
                                                                             
       
  }
  part def ActuationCompositionOwner :> Thread {
    port session_decision_facts : DataPort { in :>> type : SessionDecisionFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }

                        
                
                        
                                         
                                                                 
                                                                                  
                                                                              
             
                            
                                              
                                          
                                                                   
                                                                                    
                                                                                  
                                               
                                                          
                                                                  
                                                                                    
                                                                                    
                                               
                                                               
                                                                     
                                                                   
                                                                                    
                                                                                  
                                               
                                                            
                                                                  
                                                                   
                                                                                    
                                                                                  
       
  }
  part def SupervisoryStatusNoticeOwner :> Thread {
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    port rearm_state_facts : DataPort { in :>> type : RearmStateFacts; }
    port session_decision_facts : DataPort { in :>> type : SessionDecisionFacts; }
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

                        
                
                        
                                              
                                                     
                                                                                     
                                                               
                                                   
                                                                                     
                                                                                      
                                                                                             
                                           
             
                             
                                               
                                                                        
                                                                       
                                                                           
                                                                         
                                                                               
                                                                           
                                                                               
                                                                             
                                                                                         
                                                                                 
                                                                      
                               
                                                    
                                          
                                                                 
                                               
                                                                
                                                                   
                                                                     
                                               
                                                                
                                                                   
                                                                   
                                               
                                                                   
                                                              
                                               
                                                              
                                                           
                                               
                                                          
                                                          
                                               
                                                           
                                                      
       
  }

  part def ProtectedStartPowerProcess :> Process {
    port command_report : DataPort { in :>> type : CommandReport; }
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

    // Fourteen sibling semantic usages in approved order.
    part command_qualification_owner : CommandQualificationOwner;
    part brake_pedal_qualification_owner : BrakePedalQualificationOwner;
    part temperature_qualification_owner : TemperatureQualificationOwner;
    part electrical_supply_qualification_owner : ElectricalSupplyQualificationOwner;
    part parking_brake_qualification_owner : ParkingBrakeQualificationOwner;
    part thermal_clearance_state_owner : ThermalClearanceStateOwner;
    part self_test_campaign_state_owner : SelfTestCampaignStateOwner;
    part start_restraint_decision_owner : StartRestraintDecisionOwner;
    part readiness_composition_owner : ReadinessCompositionOwner;
    part operating_session_state_priority_owner : OperatingSessionStatePriorityOwner;
    part fault_vector_composition_owner : FaultVectorCompositionOwner;
    part rearm_qualification_state_owner : RearmQualificationStateOwner;
    part actuation_composition_owner : ActuationCompositionOwner;
    part supervisory_status_notice_owner : SupervisoryStatusNoticeOwner;

    // Exact thirty-five semantic interactions.
    connection int01 : PortConnection connect command_report to command_qualification_owner.command_report;
    connection int02 : PortConnection connect brake_pedal_report to brake_pedal_qualification_owner.brake_pedal_report;
    connection int03 : PortConnection connect temperature_report to temperature_qualification_owner.temperature_report;
    connection int04 : PortConnection connect electrical_power_report to electrical_supply_qualification_owner.electrical_power_report;
    connection int05 : PortConnection connect parking_brake_report to parking_brake_qualification_owner.parking_brake_report;
    connection int06 : PortConnection connect self_test_report to self_test_campaign_state_owner.self_test_report;
    connection int07 : PortConnection connect command_qualification_owner.qualified_command_facts to self_test_campaign_state_owner.qualified_command_facts;
    connection int08 : PortConnection connect command_qualification_owner.qualified_command_facts to operating_session_state_priority_owner.qualified_command_facts;
    connection int09 : PortConnection connect command_qualification_owner.qualified_command_facts to rearm_qualification_state_owner.qualified_command_facts;
    connection int10 : PortConnection connect command_qualification_owner.command_fault to fault_vector_composition_owner.command_fault;
    connection int11 : PortConnection connect brake_pedal_qualification_owner.qualified_pedal_facts to start_restraint_decision_owner.qualified_pedal_facts;
    connection int12 : PortConnection connect brake_pedal_qualification_owner.pedal_fault to fault_vector_composition_owner.pedal_fault;
    connection int13 : PortConnection connect temperature_qualification_owner.qualified_temperature to thermal_clearance_state_owner.qualified_temperature;
    connection int14 : PortConnection connect electrical_supply_qualification_owner.qualified_supply_facts to readiness_composition_owner.qualified_supply_facts;
    connection int15 : PortConnection connect electrical_supply_qualification_owner.supply_fault to fault_vector_composition_owner.supply_fault;
    connection int16 : PortConnection connect parking_brake_qualification_owner.qualified_parking_brake_facts to start_restraint_decision_owner.qualified_parking_brake_facts;
    connection int17 : PortConnection connect parking_brake_qualification_owner.parking_brake_fault to fault_vector_composition_owner.parking_brake_fault;
    connection int18 : PortConnection connect thermal_clearance_state_owner.thermal_state_facts to readiness_composition_owner.thermal_state_facts;
    connection int19 : PortConnection connect thermal_clearance_state_owner.thermal_fault to fault_vector_composition_owner.thermal_fault;
    connection int20 : PortConnection connect self_test_campaign_state_owner.self_test_state_facts to readiness_composition_owner.self_test_state_facts;
    connection int21 : PortConnection connect self_test_campaign_state_owner.self_test_fault to fault_vector_composition_owner.self_test_fault;
    connection int22 : PortConnection connect start_restraint_decision_owner.start_restraint_fact to readiness_composition_owner.start_restraint_fact;
    connection int23 : PortConnection connect readiness_composition_owner.readiness_facts to operating_session_state_priority_owner.readiness_facts;
    connection int24 : PortConnection connect readiness_composition_owner.readiness_facts to rearm_qualification_state_owner.readiness_facts;
    connection int25 : PortConnection connect readiness_composition_owner.readiness_facts to supervisory_status_notice_owner.readiness_facts;
    connection int26 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to operating_session_state_priority_owner.exact_fault_summary;
    connection int27 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to rearm_qualification_state_owner.exact_fault_summary;
    connection int28 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to actuation_composition_owner.exact_fault_summary;
    connection int29 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to supervisory_status_notice_owner.exact_fault_summary;
    connection int30 : PortConnection connect rearm_qualification_state_owner.recovery_permit_fact to operating_session_state_priority_owner.recovery_permit_fact;
    connection int31 : PortConnection connect rearm_qualification_state_owner.rearm_state_facts to supervisory_status_notice_owner.rearm_state_facts;
    connection int32 : PortConnection connect operating_session_state_priority_owner.session_decision_facts to actuation_composition_owner.session_decision_facts;
    connection int33 : PortConnection connect operating_session_state_priority_owner.session_decision_facts to supervisory_status_notice_owner.session_decision_facts;
    connection int34 : PortConnection connect actuation_composition_owner.actuation_disposition to actuation_disposition;
    connection int35 : PortConnection connect supervisory_status_notice_owner.supervisory_status to supervisory_status;
  }

  part def ProtectedStartPowerSupervisorSystem :> System {
    port command_report : DataPort { in :>> type : CommandReport; }
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

    part protected_start_power_process : ProtectedStartPowerProcess;

    connection support01 : PortConnection connect command_report to protected_start_power_process.command_report;
    connection support02 : PortConnection connect brake_pedal_report to protected_start_power_process.brake_pedal_report;
    connection support03 : PortConnection connect temperature_report to protected_start_power_process.temperature_report;
    connection support04 : PortConnection connect electrical_power_report to protected_start_power_process.electrical_power_report;
    connection support05 : PortConnection connect parking_brake_report to protected_start_power_process.parking_brake_report;
    connection support06 : PortConnection connect self_test_report to protected_start_power_process.self_test_report;
    connection support07 : PortConnection connect protected_start_power_process.actuation_disposition to actuation_disposition;
    connection support08 : PortConnection connect protected_start_power_process.supervisory_status to supervisory_status;
  }

  // Exactly one explicit root System usage.
  part protected_start_power_supervisor : ProtectedStartPowerSupervisorSystem;
}
