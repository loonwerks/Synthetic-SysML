// Canonical final source: retained architecture plus approved GUMBO behavior.
// The behavior-free checkpoint is retained separately under validation/architecture-stage/.

package Factory_Material_Continuity_Coordinator {
  private import HAMR::*;

  enum def DemandSignal {
    enum NONE; enum INVALID; enum ARoutine; enum AUrgent;
    enum BRoutine; enum BUrgent;
  }
  enum def DemandCode {
    enum NONE; enum INVALID; enum ARoutine; enum AUrgent;
    enum BRoutine; enum BUrgent;
  }
  enum def InventoryBand { enum INVALID; enum EMPTY; enum LOW; enum READY; }
  enum def InventoryBandCode { enum INVALID; enum EMPTY; enum LOW; enum READY; }
  enum def Availability { enum INVALID; enum UNAVAILABLE; enum AVAILABLE; }
  enum def MaterialEvent {
    enum NONE; enum OrderAccepted; enum ReceiptOk; enum HandoffOk; enum FAILED;
  }
  enum def MaterialEventCode {
    enum NONE; enum OrderAccepted; enum ReceiptOk; enum HandoffOk; enum FAILED;
  }
  enum def RecoveryEvent { enum NONE; enum RESET; enum VerifyOk; }
  enum def MaterialAction {
    enum HOLD; enum ReleaseUrgentMaterial; enum IssueMaterialOrder;
    enum ReleaseRoutineMaterial;
  }
  enum def DecisionCause {
    enum FaultOrRecovery; enum UrgentDemand; enum ReserveReplenishment;
    enum RoutineDemand; enum NoEligibleWork;
  }
  enum def CoordinationMode { enum HOLDING; enum RELEASING; enum ORDERING; enum FAULT; }
  enum def DemandDisposition {
    enum NoRequest; enum REJECTED; enum ACCEPTED; enum RetainedDuplicate; enum DEFERRED;
  }
  enum def DemandState {
    enum IDLE; enum ARoutineOpen; enum AUrgentOpen;
    enum BRoutineOpen; enum BUrgentOpen;
  }
  enum def DemandStateView {
    enum IDLE; enum ARoutineOpen; enum AUrgentOpen;
    enum BRoutineOpen; enum BUrgentOpen;
  }
  enum def DemandStateCode {
    enum IDLE; enum ARoutineOpen; enum AUrgentOpen;
    enum BRoutineOpen; enum BUrgentOpen;
  }
  enum def DemandUpdate { enum NoChange; enum ACCEPTED; enum CLEARED; enum DUPLICATE; enum BUSY; }
  enum def SupplyState { enum CLEAR; enum ORDERED; }
  enum def SupplyStateCode { enum CLEAR; enum ORDERED; }
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum RECOVERING; }
  enum def RecoveryStateCode { enum HEALTHY; enum LATCHED; enum RECOVERING; }
  enum def EventClass { enum NoEvent; enum FAILURE; enum SUCCESS; }
  enum def QualifiedEvent {
    enum NoProgress; enum OrderRegistered; enum ReceiptConfirmed;
    enum HandoffConfirmed; enum FAULT;
  }
  enum def FaultTrigger { enum INACTIVE; enum ACTIVE; }
  enum def RecoveryGate { enum OPEN; enum CLOSED; }
  enum def EmergencyState { enum INACTIVE; enum ACTIVE; }
  enum def MaterialClass { enum NONE; enum A; enum B; }
  enum def ProposalState { enum NotProposed; enum PROPOSED; }

  // Record members inspected by GUMBO are attributes, never nested parts.
  part def DemandBoundaryFacts :> Data {
    attribute present : Base_Types::Boolean;
    attribute demandValue : DemandCode;
  }
  part def DemandFacts :> Data {
    attribute present : Base_Types::Boolean;
    attribute valid : Base_Types::Boolean;
    attribute urgent : Base_Types::Boolean;
    attribute materialClass : MaterialClass;
    attribute demandValue : DemandCode;
  }
  part def InventoryBoundaryFacts :> Data {
    attribute band : InventoryBandCode;
    attribute usable : Base_Types::Boolean;
  }
  part def EventBoundaryFacts :> Data {
    attribute materialEvent : MaterialEventCode;
    attribute eventClass : EventClass;
  }
  part def MaterialReadinessFacts :> Data {
    attribute band : InventoryBandCode;
    attribute usable : Base_Types::Boolean;
    attribute materialAvailable : Base_Types::Boolean;
    attribute reserveLow : Base_Types::Boolean;
    attribute replenishmentNeeded : Base_Types::Boolean;
    attribute productionEvidenceUsable : Base_Types::Boolean;
    attribute productionAccepting : Base_Types::Boolean;
  }
  part def DemandTransition :> Data {
    attribute demandPhase : DemandStateCode;
    attribute demandUpdate : DemandUpdate;
    attribute demandDisposition : DemandDisposition;
  }
  part def Decision :> Data {
    attribute actionValue : MaterialAction;
    attribute cause : DecisionCause;
  }
  part def MaterialCoordinationResult :> Data {
    attribute actionValue : MaterialAction;
    attribute cause : DecisionCause;
    attribute mode : CoordinationMode;
    attribute demandPhase : DemandStateCode;
    attribute supplyPhase : SupplyStateCode;
    attribute recoveryPhase : RecoveryStateCode;
    attribute demandDisposition : DemandDisposition;
  }

  part def DemandAcquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port demand_signal : DataPort { in :>> type : DemandSignal; }
    port demand_boundary_facts : DataPort { out :>> type : DemandBoundaryFacts; }

                        
                
                             
                                    
                                              
                                                               
             
                            
                                                 
                                                                                   
                                                                                                        
                                                                                                              
                                                                                                                
                                                                                                              
                                                                                                                
                                                                                                              
       
  }
  part def InventoryAcquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port inventory_band : DataPort { in :>> type : InventoryBand; }
    port inventory_boundary_facts : DataPort { out :>> type : InventoryBoundaryFacts; }

                        
                
                             
                                             
                                                                      
                                               
             
                            
                                                     
                                                                                                                   
                                                                                                               
                                                                                                           
                                                                                                                
                                                                                         
       
  }
  part def EventAcquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port material_event : DataPort { in :>> type : MaterialEvent; }
    port event_boundary_facts : DataPort { out :>> type : EventBoundaryFacts; }

                        
                
                             
                                   
                                                                        
                                                                
             
                            
                                       
                                                  
                                                                          
                                                                    
                                                    
                                                                            
                                                                    
                                                           
                                                                                   
                                                                    
                                                       
                                                                               
                                                                    
                                                       
                                                                               
                                                                    
       
  }
  part def DemandQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port demand_boundary_facts : DataPort { in :>> type : DemandBoundaryFacts; }
    port demand_facts : DataPort { out :>> type : DemandFacts; }

                        
                
                             
                                            
                                                                                   
                                                              
                                                           
             
                            
                                         
                                                                         
                                                                 
                                
                                                                       
                                                                      
                                                                       
                                                                        
                                 
                                                                      
                                                                        
                                                                       
                                                                       
                                                            
                                                                       
                                                                       
                                                            
                                                                   
                                                                       
                                                               
       
  }
  part def MaterialReadinessAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port inventory_boundary_facts : DataPort { in :>> type : InventoryBoundaryFacts; }
    port production_availability : DataPort { in :>> type : Availability; }
    port readiness_to_urgent : DataPort { out :>> type : MaterialReadinessFacts; }
    port readiness_to_routine : DataPort { out :>> type : MaterialReadinessFacts; }
    port readiness_to_replenishment : DataPort { out :>> type : MaterialReadinessFacts; }

                        
                
                             
                                         
                                                                 
                                           
                                                      
                                               
                                                        
                                                             
                                                        
                                                                 
                                                                     
                                                                                           
                                                                             
                                                                                               
                                                                                                         
                                                                                               
                                                                       
                                                                           
                                                                                                 
                                                                                   
                                                                                                     
                                                                                                               
                                                                                                    
             
                            
                                                
                                                                     
                                                                         
                                                   
                                              
                                                                      
                                                                           
                                            
                                              
                                                                       
                                                     
                                              
                                                                        
                                                                         
                                                          
                                                                
                                                     
                                                                  
                                                                 
                                                                     
                                                                                           
                                                                             
                                                                                               
                                                                                                         
                                                                                               
                                                                       
                                                                           
                                                                                                 
                                                                                   
                                                                                                     
                                                                                                               
                                                                                                    
       
  }
  part def EventCoherence :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port event_boundary_facts : DataPort { in :>> type : EventBoundaryFacts; }
    port prior_demand_state : DataPort { in :>> type : DemandState; }
    port prior_supply_state : DataPort { in :>> type : SupplyState; }
    port qualified_event_to_demand : DataPort { out :>> type : QualifiedEvent; }
    port qualified_event_to_supply : DataPort { out :>> type : QualifiedEvent; }
    port fault_trigger : DataPort { out :>> type : FaultTrigger; }

                        
                
                             
                                               
                                                                  
                                                                  
                                                 
             
                            
                                                     
                                                                 
                     
                           
                                
                                                                          
                                                                           
                                                                              
                                                     
                           
                                        
                                                                          
                                                                             
                                                                         
                                                   
                           
                                        
                                                                          
                                                                                     
                                                      
                                                                                   
                                                     
                           
                                         
                                                                          
                                                                                 
                                                        
                                                                                    
                                                     
                           
                                         
                                                                          
                                                                                 
                                                     
                                                                                    
                                                     
                           
                                        
                      
                                                                       
                                                                               
                                                                       
                                                                                 
                                                                       
                                                                                       
                                                          
                                                                       
                                                                                   
                                                            
                                                                       
                                                                                   
                                                         
                                                                         
                                                   
       
  }
  part def DemandRegistry :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port demand_facts : DataPort { in :>> type : DemandFacts; }
    port qualified_event : DataPort { in :>> type : QualifiedEvent; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port prior_demand_state : DataPort { out :>> type : DemandState; }
    port current_state_to_urgent : DataPort { out :>> type : DemandStateView; }
    port current_state_to_routine : DataPort { out :>> type : DemandStateView; }
    port demand_transition : DataPort { out :>> type : DemandTransition; }

                        
           
                         
                                       
                
                                   
                             
                                       
                                                 
                                                  
                                                           
                                                            
                                                                 
                                                                   
                                                                             
             
                                   
                              
                                                 
                                                       
                                                               
                                                   
                                                             
                                                                    
                                                           
                                                                     
                                                                            
                                                          
                                                                    
                                                                           
                                                           
                                                                     
                                                                            
                                                          
                                                                    
                                                                           
                             
                                             
                                                         
                                                                                 
                                                            
                                                                                
                                                                                          
                                                                                
                                                                                           
                                                                                         
                                
                                                                     
                                                                      
                                                                                
                     
                           
                                          
                                                        
                                                                  
                                                                      
                           
                                     
                                                       
                                                                 
                                                             
                                                                     
                           
                                          
                                                       
                                                                  
                                                                             
                                                                               
                                                                 
                                                                
                                                                
                                                               
                                                                 
                                                                
                                                                
                                                               
                           
                                               
                                                       
                                                                  
                                                                                    
                                                                  
                                                              
                                                                  
                                                                          
                                    
                                                                   
                                                                      
                                                                  
                                                                     
                                                                   
                                                                      
                                                                  
                                                                      
                                                                           
                                    
                                                                       
                                                                          
                                                                      
                                                                         
                                                                       
                                                                          
                                                                      
                                                                          
                                                                      
       
  }
  part def SupplyLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port qualified_event : DataPort { in :>> type : QualifiedEvent; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port prior_supply_state : DataPort { out :>> type : SupplyState; }
    port current_state_to_replenishment : DataPort { out :>> type : SupplyState; }
    port current_state_to_composition : DataPort { out :>> type : SupplyState; }

                        
           
                         
                                       
                
                                   
                             
                                       
                                                  
                                                   
                                                               
                                                            
             
                                   
                              
                                                 
                                                       
                                                               
                                                            
                     
                           
                                       
                                                       
                                                                  
                                                                   
                     
                                                                   
                                                           
                                                                    
                                                         
                           
                                      
                                                         
                                                                  
                                                                   
                                                                 
       
  }
  part def RecoverySupervisor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port fault_trigger : DataPort { in :>> type : FaultTrigger; }
    port gate_to_demand : DataPort { out :>> type : RecoveryGate; }
    port gate_to_supply : DataPort { out :>> type : RecoveryGate; }
    port gate_to_urgent : DataPort { out :>> type : RecoveryGate; }
    port gate_to_routine : DataPort { out :>> type : RecoveryGate; }
    port gate_to_replenishment : DataPort { out :>> type : RecoveryGate; }
    port emergency_state : DataPort { out :>> type : EmergencyState; }
    port recovery_state : DataPort { out :>> type : RecoveryState; }

                        
           
                         
                                           
                
                                     
                             
                                           
                                                        
                                                                                     
                                                                                      
                                                      
                                                      
                                                  
             
                                     
                              
                                           
                                                 
                                                                                                 
                                                                                                    
                                                                               
                                                                                       
                                                                                                        
                                                                                                      
                     
                           
                                       
                                                        
                                                                   
                           
                                       
                                                           
                                                               
                                                                   
                           
                                           
                                                           
                                                                
                                                    
                                                                      
                           
                                         
                                                           
                                                                
                                                    
                                                                   
                           
                                            
                                                           
                                                                   
                                                       
                                                                   
                           
                                            
                                                           
                                                                   
                                                       
                                                                      
       
  }
  part def UrgentReleaseEligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port demand_state : DataPort { in :>> type : DemandStateView; }
    port material_readiness_facts : DataPort { in :>> type : MaterialReadinessFacts; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

                        
                
                             
                                                                                     
             
                     
                           
                                       
                                                       
                                                            
                                                             
                                                          
                                                                 
                                                           
                                                         
                           
                                           
                      
                                                   
                                                             
                                                              
                                                           
                                                                  
                                                             
                                                            
       
  }
  part def RoutineReleaseEligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port demand_state : DataPort { in :>> type : DemandStateView; }
    port material_readiness_facts : DataPort { in :>> type : MaterialReadinessFacts; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

                        
                
                             
                                                                                      
             
                     
                           
                                        
                                                       
                                                             
                                                              
                                                          
                                                                 
                                                           
                                                         
                           
                                            
                      
                                                   
                                                              
                                                               
                                                           
                                                                  
                                                             
                                                            
       
  }
  part def ReplenishmentEligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port material_readiness_facts : DataPort { in :>> type : MaterialReadinessFacts; }
    port supply_state : DataPort { in :>> type : SupplyState; }
    port supplier_availability : DataPort { in :>> type : Availability; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

                        
                
                             
                                                                                            
             
                     
                           
                                              
                                                       
                                                            
                                                 
                                                              
                                                         
                           
                                                  
                      
                                                   
                                                             
                                                  
                                                                
                                                            
       
  }
  part def MaterialActionArbitration :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port emergency_state : DataPort { in :>> type : EmergencyState; }
    port urgent_proposal : DataPort { in :>> type : ProposalState; }
    port routine_proposal : DataPort { in :>> type : ProposalState; }
    port replenishment_proposal : DataPort { in :>> type : ProposalState; }
    port decision : DataPort { out :>> type : Decision; }

                        
                
                             
                                        
                                                       
                                                         
             
                     
                           
                                      
                                                            
                                                                   
                                                              
                           
                                       
                                                               
                                                        
                                                                                    
                                                           
                           
                                              
                                                               
                                                            
                                                               
                                                                                 
                                                                   
                           
                                        
                                                               
                                                            
                                                                   
                                                         
                                                                                     
                                                            
                           
                                        
                                                               
                                                            
                                                                   
                                                            
                                                                   
                                                             
       
  }
  part def ResultComposition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port demand_transition : DataPort { in :>> type : DemandTransition; }
    port supply_state : DataPort { in :>> type : SupplyState; }
    port decision : DataPort { in :>> type : Decision; }
    port recovery_state : DataPort { in :>> type : RecoveryState; }
    port material_coordination_result : DataPort { out :>> type : MaterialCoordinationResult; }

                        
                
                             
                                             
                                                                           
                                                                              
                                                                         
                                                                            
                                                                             
                                                                                   
                                                                                        
             
                             
                                                     
                                                                            
                                                                
                                                                                     
                                               
                                                                                
                                                 
                                                                                   
                                                     
                                                                                      
                                                     
                                                                                      
                                                        
                                                                                          
                                                                                                 
                                                     
                                                                          
                                                     
                                                                       
                                                                             
                                                     
                                                                           
                                                                             
                                                                              
                                                     
                                                         
                                                                            
       
  }

  part def MaterialContinuityProcess :> Process {
    port demand_signal : DataPort { in :>> type : DemandSignal; }
    port inventory_band : DataPort { in :>> type : InventoryBand; }
    port supplier_availability : DataPort { in :>> type : Availability; }
    port production_availability : DataPort { in :>> type : Availability; }
    port material_event : DataPort { in :>> type : MaterialEvent; }
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port material_coordination_result : DataPort { out :>> type : MaterialCoordinationResult; }

    part demand_acquisition : DemandAcquisition;
    part inventory_acquisition : InventoryAcquisition;
    part event_acquisition : EventAcquisition;
    part demand_qualification : DemandQualification;
    part material_readiness_assessment : MaterialReadinessAssessment;
    part event_coherence : EventCoherence;
    part demand_registry : DemandRegistry;
    part supply_lifecycle : SupplyLifecycle;
    part recovery_supervisor : RecoverySupervisor;
    part urgent_release_eligibility : UrgentReleaseEligibility;
    part routine_release_eligibility : RoutineReleaseEligibility;
    part replenishment_eligibility : ReplenishmentEligibility;
    part material_action_arbitration : MaterialActionArbitration;
    part result_composition : ResultComposition;

    connection int01 : PortConnection connect demand_signal to demand_acquisition.demand_signal;
    connection int02 : PortConnection connect inventory_band to inventory_acquisition.inventory_band;
    connection int03 : PortConnection connect material_event to event_acquisition.material_event;
    connection int04 : PortConnection connect recovery_event to recovery_supervisor.recovery_event;
    connection int05 : PortConnection connect supplier_availability to replenishment_eligibility.supplier_availability;
    connection int06 : PortConnection connect production_availability to material_readiness_assessment.production_availability;
    connection int07 : PortConnection connect result_composition.material_coordination_result to material_coordination_result;
    connection int08 : PortConnection connect demand_acquisition.demand_boundary_facts to demand_qualification.demand_boundary_facts;
    connection int09 : PortConnection connect inventory_acquisition.inventory_boundary_facts to material_readiness_assessment.inventory_boundary_facts;
    connection int10 : PortConnection connect event_acquisition.event_boundary_facts to event_coherence.event_boundary_facts;
    connection int11 : PortConnection connect demand_registry.prior_demand_state to event_coherence.prior_demand_state;
    connection int12 : PortConnection connect supply_lifecycle.prior_supply_state to event_coherence.prior_supply_state;
    connection int13 : PortConnection connect event_coherence.qualified_event_to_demand to demand_registry.qualified_event;
    connection int14 : PortConnection connect event_coherence.qualified_event_to_supply to supply_lifecycle.qualified_event;
    connection int15 : PortConnection connect event_coherence.fault_trigger to recovery_supervisor.fault_trigger;
    connection int16 : PortConnection connect recovery_supervisor.gate_to_demand to demand_registry.recovery_gate;
    connection int17 : PortConnection connect recovery_supervisor.gate_to_supply to supply_lifecycle.recovery_gate;
    connection int18 : PortConnection connect recovery_supervisor.gate_to_urgent to urgent_release_eligibility.recovery_gate;
    connection int19 : PortConnection connect recovery_supervisor.gate_to_routine to routine_release_eligibility.recovery_gate;
    connection int20 : PortConnection connect recovery_supervisor.gate_to_replenishment to replenishment_eligibility.recovery_gate;
    connection int21 : PortConnection connect recovery_supervisor.emergency_state to material_action_arbitration.emergency_state;
    connection int22 : PortConnection connect demand_qualification.demand_facts to demand_registry.demand_facts;
    connection int23 : PortConnection connect demand_registry.current_state_to_urgent to urgent_release_eligibility.demand_state;
    connection int24 : PortConnection connect demand_registry.current_state_to_routine to routine_release_eligibility.demand_state;
    connection int25 : PortConnection connect demand_registry.demand_transition to result_composition.demand_transition;
    connection int26 : PortConnection connect material_readiness_assessment.readiness_to_urgent to urgent_release_eligibility.material_readiness_facts;
    connection int27 : PortConnection connect material_readiness_assessment.readiness_to_routine to routine_release_eligibility.material_readiness_facts;
    connection int28 : PortConnection connect material_readiness_assessment.readiness_to_replenishment to replenishment_eligibility.material_readiness_facts;
    connection int29 : PortConnection connect supply_lifecycle.current_state_to_replenishment to replenishment_eligibility.supply_state;
    connection int30 : PortConnection connect supply_lifecycle.current_state_to_composition to result_composition.supply_state;
    connection int31 : PortConnection connect urgent_release_eligibility.proposal to material_action_arbitration.urgent_proposal;
    connection int32 : PortConnection connect routine_release_eligibility.proposal to material_action_arbitration.routine_proposal;
    connection int33 : PortConnection connect replenishment_eligibility.proposal to material_action_arbitration.replenishment_proposal;
    connection int34 : PortConnection connect material_action_arbitration.decision to result_composition.decision;
    connection int35 : PortConnection connect recovery_supervisor.recovery_state to result_composition.recovery_state;
  }

  part def FactoryMaterialContinuityCoordinatorSystem :> System {
    port demand_signal : DataPort { in :>> type : DemandSignal; }
    port inventory_band : DataPort { in :>> type : InventoryBand; }
    port supplier_availability : DataPort { in :>> type : Availability; }
    port production_availability : DataPort { in :>> type : Availability; }
    port material_event : DataPort { in :>> type : MaterialEvent; }
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port material_coordination_result : DataPort { out :>> type : MaterialCoordinationResult; }

    part material_continuity_process : MaterialContinuityProcess;

    connection support01 : PortConnection connect demand_signal to material_continuity_process.demand_signal;
    connection support02 : PortConnection connect inventory_band to material_continuity_process.inventory_band;
    connection support03 : PortConnection connect supplier_availability to material_continuity_process.supplier_availability;
    connection support04 : PortConnection connect production_availability to material_continuity_process.production_availability;
    connection support05 : PortConnection connect material_event to material_continuity_process.material_event;
    connection support06 : PortConnection connect recovery_event to material_continuity_process.recovery_event;
    connection support07 : PortConnection connect material_continuity_process.material_coordination_result to material_coordination_result;
  }

  part factory_material_continuity_coordinator : FactoryMaterialContinuityCoordinatorSystem;
}
