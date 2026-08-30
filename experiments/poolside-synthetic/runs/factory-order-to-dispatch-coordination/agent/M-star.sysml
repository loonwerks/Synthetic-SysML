package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  interface def BoundaryExposure {
    end outer : DataPort;
    end inner : ~DataPort;
  }

  enum def FreshRequest {
    enum NONE;
    enum INVALID;
    enum VALID_STANDARD;
    enum VALID_EXPEDITE;
  }

  enum def MaterialBand {
    enum INVALID;
    enum SHORT;
    enum READY;
  }

  enum def ProductBand {
    enum INVALID;
    enum ABSENT;
    enum AVAILABLE;
  }

  enum def ExecutionOutcome {
    enum NONE;
    enum QUOTE_OK;
    enum MATERIAL_OK;
    enum PRODUCTION_OK;
    enum DISPATCH_OK;
    enum FAILED;
  }

  enum def RecoveryEvent {
    enum NONE;
    enum RESET;
    enum VERIFY_OK;
  }

  enum def DispatchAction {
    enum HOLD;
    enum ISSUE_QUOTE;
    enum ORDER_MATERIAL;
    enum RELEASE_PRODUCTION;
    enum RELEASE_DISPATCH;
  }

  enum def SelectedCause {
    enum FAULT_OR_RECOVERY;
    enum DISPATCH_PRIORITY;
    enum PRODUCTION_PRIORITY;
    enum PROCUREMENT_PRIORITY;
    enum QUOTE_AVAILABLE;
    enum NO_ELIGIBLE_WORK;
  }

  enum def Mode {
    enum HOLDING;
    enum QUOTING;
    enum PROCURING;
    enum PRODUCING;
    enum DISPATCHING;
    enum FAULT;
  }

  enum def OrderState {
    enum IDLE;
    enum OPEN;
  }

  enum def RecoveryState {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  enum def RequestDisposition {
    enum NO_REQUEST;
    enum REJECTED;
    enum QUOTED;
    enum DEFERRED;
  }

  enum def OutcomeEventClass {
    enum NO_EVENT;
    enum FAILURE;
    enum SUCCESS;
  }

  enum def QualifiedOutcome {
    enum NO_PROGRESS;
    enum QUOTE_ACCEPTED;
    enum MATERIAL_CONFIRMED;
    enum PRODUCTION_COMPLETED;
    enum DISPATCH_COMPLETED;
    enum FAULT;
  }

  enum def RecoveryGate {
    enum OPEN;
    enum CLOSED;
  }

  enum def EmergencyState {
    enum INACTIVE;
    enum ACTIVE;
  }

  enum def ProposalState {
    enum NOT_PROPOSED;
    enum PROPOSED;
  }

  enum def OrderStatusValue {
    enum IDLE;
    enum OPEN;
  }

  enum def RecoveryStatusValue {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  enum def PublishedAction {
    enum HOLD;
    enum ISSUE_QUOTE;
    enum ORDER_MATERIAL;
    enum RELEASE_PRODUCTION;
    enum RELEASE_DISPATCH;
  }

  enum def PublishedOrderState {
    enum IDLE;
    enum OPEN;
  }

  enum def PublishedRecoveryState {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  // All record fields inspected by GUMBO are attributes.
  part def InventorySnapshot :> Data {
    attribute material_band : MaterialBand;
    attribute product_band : ProductBand;
  }

  part def CapabilitySnapshot :> Data {
    attribute supplier_available : Base_Types::Boolean;
    attribute production_available : Base_Types::Boolean;
    attribute dispatch_available : Base_Types::Boolean;
  }

  part def RequestBoundaryFacts :> Data {
    attribute fresh_request : FreshRequest;
    attribute request_present : Base_Types::Boolean;
  }

  part def MaterialBoundaryFacts :> Data {
    attribute material_band : MaterialBand;
    attribute material_usable : Base_Types::Boolean;
  }

  part def ProductBoundaryFacts :> Data {
    attribute product_band : ProductBand;
    attribute product_usable : Base_Types::Boolean;
  }

  part def OutcomeBoundaryFacts :> Data {
    attribute execution_outcome : ExecutionOutcome;
    attribute event_class : OutcomeEventClass;
  }

  part def RequestFacts :> Data {
    attribute fresh_request : FreshRequest;
    attribute request_present : Base_Types::Boolean;
    attribute request_valid : Base_Types::Boolean;
    attribute request_expedited : Base_Types::Boolean;
  }

  part def StockFacts :> Data {
    attribute material_band : MaterialBand;
    attribute material_usable : Base_Types::Boolean;
    attribute material_shortage : Base_Types::Boolean;
    attribute material_ready : Base_Types::Boolean;
    attribute product_band : ProductBand;
    attribute product_usable : Base_Types::Boolean;
    attribute product_available : Base_Types::Boolean;
  }

  part def DispatchStatusRecord :> Data {
    attribute order_phase : OrderStatusValue;
    attribute recovery_phase : RecoveryStatusValue;
    attribute mode : Mode;
    attribute selected_cause : SelectedCause;
  }

  part def DispatchPublicResult :> Data {
    attribute selected_cause : SelectedCause;
    attribute mode : Mode;
    attribute published_order : PublishedOrderState;
    attribute published_recovery : PublishedRecoveryState;
    attribute request_disposition : RequestDisposition;
    attribute published_action : PublishedAction;
  }

  part def CustomerRequestAcquisition :> Thread {
    port fresh_request : DataPort { in :>> type : FreshRequest; }
    port request_boundary_facts : DataPort { out :>> type : RequestBoundaryFacts; }

                        
                
                             
                                                                                                           
                                                                     
                                                      

             
                            
                                                                                                   
                                                                
                            
                                                                                                 
                                                                                              
                                                                                             
       
  }

  part def InventoryAcquisition :> Thread {
    port inventory_snapshot : DataPort { in :>> type : InventorySnapshot; }
    port material_boundary_facts : DataPort { out :>> type : MaterialBoundaryFacts; }
    port product_boundary_facts : DataPort { out :>> type : ProductBoundaryFacts; }

                        
                
                             
                                                                                                         
                                                                         
                                                        
                                                                      
                                                     

             
                              
                                                                                         
                                                                                     
                                                                                 
                              
                                                                                                                 
                                                                                                                     
                                                                                                                    
                              
                                                                                                               
                                                                                                                 
                                                                                                                
       
  }

  part def CapabilityAcquisition :> Thread {
    port capability_snapshot : DataPort { in :>> type : CapabilitySnapshot; }
    port supplier_available : DataPort { out :>> type : Base_Types::Boolean; }
    port production_available : DataPort { out :>> type : Base_Types::Boolean; }
    port dispatch_available : DataPort { out :>> type : Base_Types::Boolean; }
  }

  part def ExecutionOutcomeAcquisition :> Thread {
    port execution_outcome : DataPort { in :>> type : ExecutionOutcome; }
    port outcome_boundary_facts : DataPort { out :>> type : OutcomeBoundaryFacts; }

                        
                
                             
                                                                                                            
                                                                             
                                                                           

             
                     
                              
                                                                                                   
                                                              
                                                                                     
                                                                                       
                              
                                                                                                   
                                                                
                                                                                     
                                                                                      
                              
                                                                                                       
                                                               
                                                                
                                                                                     
                                                                                      
       
  }

  part def RequestQualification :> Thread {
    port request_boundary_facts : DataPort { in :>> type : RequestBoundaryFacts; }
    port request_facts : DataPort { out :>> type : RequestFacts; }

                        
                
                             
                                                                                                                         
                                                            
                                              
                                            
                                               

             
                            
                                                                                                                   
                                                                               
                                                                                  
                            
                                                                                                                
                                             
                                                                                 
                                                                                   
                                             
                                                                                
                                                                                
                            
                                                                                                            
                                                                                                                        
                                                                                                                       
       
  }

  part def StockAssessment :> Thread {
    port material_boundary_facts : DataPort { in :>> type : MaterialBoundaryFacts; }
    port product_boundary_facts : DataPort { in :>> type : ProductBoundaryFacts; }
    port stock_facts : DataPort { out :>> type : StockFacts; }

                        
                
                             
                                                                                                               
                                                             
                                            
                                              
                                           
                                                           
                                           
                                             

             
                              
                                                                                                                              
                                                                              
                                                                                  
                                                                           
                                                                              
                              
                                                                                                     
                                               
                                                         
                                                                         
                                               
                                                          
                                                                          
                              
                                                                                                       
                                            
                                                         
                                                                         
                                            
                                                          
                                                                          
                              
                                                                                                                
                                               
                                                       
                                                                          
                                               
                                                        
                                                                           
       
  }

  part def OutcomeQualification :> Thread {
    port outcome_boundary_facts : DataPort { in :>> type : OutcomeBoundaryFacts; }
    port prior_order_state : DataPort { in :>> type : OrderState; }
    port qualified_outcome : DataPort { out :>> type : QualifiedOutcome; }

                        
                
                             
                                                                                               
                                                            

             
                     
                           
                                                                                           
                                                                                     
                                                                                     
                                                                        
                           
                                                                                                                    
                                                                                    
                                                                                     
                                                                                             
                                                             
                                                                                                 
                                                                                                   
                                                                                                  
                                                              
                                                                  
                           
                                                                                
                                                                                    
                                                                                          
                                                        
                                                                           
                           
                                                                                           
                                                                                    
                                                                                             
                                                        
                                                                               
                           
                                                                                                 
                                                                                    
                                                                                               
                                                        
                                                                                 
                           
                                                                                           
                                                                                    
                                                                                             
                                                        
                                                                               
       
  }

  part def RecoveryControl :> Thread {
    port qualified_outcome : DataPort { in :>> type : QualifiedOutcome; }
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port recovery_gate : DataPort { out :>> type : RecoveryGate; }
    port emergency_state : DataPort { out :>> type : EmergencyState; }
    port recovery_state : DataPort { out :>> type : RecoveryState; }

                        
                       
           
                                         

                
                             
                                                                                                             
                                                      
                                                   
                                              
                                                     

             
                          
                                                                                                         
                                               
                                                        
                                                
                                                         
                                                        
                                                  
                                                       

                     
                           
                                                                                              
                                                               
                                                                  
                                                               
                                                            
                                                               
                           
                                                                                                                    
                                                                
                                                                  
                                                                  
                                                               
                                                          
                                                                 
                           
                                                                                                            
                                                                
                                                                   
                                                         
                                                                     
                                                                  
                                                            
                                                               
                           
                                                                                             
                                                                
                                                                   
                                                         
                                                                  
                                                               
                                                            
                                                               
                           
                                                                                                   
                                                                
                                                                      
                                                             
                                                                  
                                                               
                                                          
                                                                 
                           
                                                                                                   
                                                                
                                                                      
                                                             
                                                                     
                                                                  
                                                            
                                                               
       
  }

  part def OrderLifecycle :> Thread {
    port qualified_outcome : DataPort { in :>> type : QualifiedOutcome; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port prior_order_state : DataPort { out :>> type : OrderState; }
    port order_state : DataPort { out :>> type : OrderState; }

                        
                       
           
                                   

                
                             
                                                                                                              
                                             
                                                
                                         

             
                             
                                                                                                                                                    
                                                   
                                        

                     
                           
                                                                                                   
                                                       
                                                                     
                                                                                               
                           
                                                                                                                   
                                                        
                                                                                               
                           
                                                                                                          
                                                       
                                                                        
                                                                                         
                           
                                                                                                       
                                                       
                                                                            
                                                                                         
                           
                                                                                                         
                                                       
                                                                              
                                                                                         
                           
                                                                                                                  
                                                       
                                                                            
                                                                                         
       
  }

  part def QuotationEligibility :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

                        
                
                             
                                                                                                                      
             
                     
                           
                                                                                                               
                                                       
                                                   
                                                    
                                                         
                           
                                                                                         
                                                       
                                                   
                                                    
                                                             
       
  }

  part def ProcurementEligibility :> Thread {
    port stock_facts : DataPort { in :>> type : StockFacts; }
    port supplier_available : DataPort { in :>> type : Base_Types::Boolean; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

                        
                
                             
                                                                                                                          
             
                     
                           
                                                                                                                                    
                                                       
                                                   
                                                     
                                                       
                                           
                                                         
                           
                                                                                             
                                                       
                                                   
                                                     
                                                       
                                           
                                                             
       
  }

  part def ProductionEligibility :> Thread {
    port stock_facts : DataPort { in :>> type : StockFacts; }
    port production_available : DataPort { in :>> type : Base_Types::Boolean; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

                        
                
                             
                                                                                                                        
             
                     
                           
                                                                                                                                     
                                                       
                                                   
                                                     
                                                    
                                             
                                                         
                           
                                                                                           
                                                       
                                                   
                                                     
                                                    
                                             
                                                             
       
  }

  part def DispatchEligibility :> Thread {
    port stock_facts : DataPort { in :>> type : StockFacts; }
    port dispatch_available : DataPort { in :>> type : Base_Types::Boolean; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

                        
                
                             
                                                                                                                    
             
                     
                           
                                                                                                                                          
                                                       
                                                   
                                                    
                                                       
                                           
                                                         
                           
                                                                                       
                                                       
                                                   
                                                    
                                                       
                                           
                                                             
       
  }

  part def ActionArbitration :> Thread {
    port emergency_state : DataPort { in :>> type : EmergencyState; }
    port quotation_proposal : DataPort { in :>> type : ProposalState; }
    port procurement_proposal : DataPort { in :>> type : ProposalState; }
    port production_proposal : DataPort { in :>> type : ProposalState; }
    port dispatch_proposal : DataPort { in :>> type : ProposalState; }
    port selected_action : DataPort { out :>> type : DispatchAction; }

                        
                
                             
                                                                                                                
             
                     
                           
                                                                                          
                                                            
                                                             
                           
                                                                                                    
                                                               
                                                               
                                                                         
                           
                                                                                                    
                                                               
                                                                    
                                                                 
                                                                           
                           
                                                                                                                 
                                                               
                                                                    
                                                                      
                                                                  
                                                                       
                           
                                                                                                   
                                                               
                                                                    
                                                                      
                                                                       
                                                                
                                                                    
                           
                                                                                    
                                                               
                                                                    
                                                                      
                                                                       
                                                                    
                                                             
       
  }

  part def StatusDerivation :> Thread {
    port selected_action : DataPort { in :>> type : DispatchAction; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_state : DataPort { in :>> type : RecoveryState; }
    port status_record : DataPort { out :>> type : DispatchStatusRecord; }

                        
                
                             
                                                                           
                                             
                             
                                                                                      
                                                                         
                             
                                                                          
                                                             
                             
                                                                                   
                                                                      

             
                             
                                                                                     
                                                                                                 
                                                                                                
                             
                                                                                           
                                                                                                                   
                                                                                                                   
                                                                                                                        

                     
                               
                                                                                                  
                                                           
                                                        
                                                                                      
                               
                                                                           
                                                                                                           
                                                          
                                                                                    
                               
                                                                                             
                                                                                                              
                                                            
                                                                                         
                               
                                                                                                
                                                                                                                  
                                                            
                                                                                        
                               
                                                                                              
                                                                                                                
                                                              
                                                                                      
                               
                                                                             
                                                                                                    
                                                          
                                                                                     
       
  }

  part def PublicComposition :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port selected_action : DataPort { in :>> type : DispatchAction; }
    port status_record : DataPort { in :>> type : DispatchStatusRecord; }
    port public_result : DataPort { out :>> type : DispatchPublicResult; }

                        
                
                             
                                                                            
                                                                 
                             
                                                                                      
                                                                         
                             
                                                                           
                                             
                             
                                                                          
                                                                    
                             
                                                                                   
                                                                             
                             
                                                                                            
                                                                             

             
                             
                                                                                                
                                                                                                             
                                                                                                                           
                                                                                                                                 
                                                                                                                                         
                                                                                                                                    
                             
                                                                                            
                                                                       
                             
                                                                                          
                                                   
                             
                                                                                            
                                                                                                                            
                                                                                                                           
                             
                                                                                                  
                                                                                                                                              
                                                                                                                                              
                                                                                                                                                   

                     
                           
                                                                                                 
                                                                    
                                                                                         
                           
                                                                                                
                                                                       
                                                                                       
                           
                                                                                        
                                                     
                                                                 
                                                                                     
                           
                                                                                                 
                                                     
                                                                 
                                                                                       
       
  }

  part def FactoryDispatchCoordinatorProcess :> Process {
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port inventorySnapshot : DataPort { in :>> type : InventorySnapshot; }
    port capabilitySnapshot : DataPort { in :>> type : CapabilitySnapshot; }
    port executionOutcome : DataPort { in :>> type : ExecutionOutcome; }
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port publicResult : DataPort { out :>> type : DispatchPublicResult; }

    part customer_request_acquisition : CustomerRequestAcquisition;
    part inventory_acquisition : InventoryAcquisition;
    part capability_acquisition : CapabilityAcquisition;
    part execution_outcome_acquisition : ExecutionOutcomeAcquisition;
    part request_qualification : RequestQualification;
    part stock_assessment : StockAssessment;
    part outcome_qualification : OutcomeQualification;
    part recovery_control : RecoveryControl;
    part order_lifecycle : OrderLifecycle;
    part quotation_eligibility : QuotationEligibility;
    part procurement_eligibility : ProcurementEligibility;
    part production_eligibility : ProductionEligibility;
    part dispatch_eligibility : DispatchEligibility;
    part action_arbitration : ActionArbitration;
    part status_derivation : StatusDerivation;
    part public_composition : PublicComposition;

    connection boundary_fresh_request : PortConnection connect freshRequest to customer_request_acquisition.fresh_request;
    connection boundary_inventory_snapshot : PortConnection connect inventorySnapshot to inventory_acquisition.inventory_snapshot;
    connection boundary_capability_snapshot : PortConnection connect capabilitySnapshot to capability_acquisition.capability_snapshot;
    connection boundary_execution_outcome : PortConnection connect executionOutcome to execution_outcome_acquisition.execution_outcome;
    connection boundary_recovery_event : PortConnection connect recoveryEvent to recovery_control.recovery_event;
    connection boundary_public_result : PortConnection connect public_composition.public_result to publicResult;

    connection request_boundary_to_qualification : PortConnection connect customer_request_acquisition.request_boundary_facts to request_qualification.request_boundary_facts;
    connection material_boundary_to_stock : PortConnection connect inventory_acquisition.material_boundary_facts to stock_assessment.material_boundary_facts;
    connection product_boundary_to_stock : PortConnection connect inventory_acquisition.product_boundary_facts to stock_assessment.product_boundary_facts;
    connection supplier_availability_route : PortConnection connect capability_acquisition.supplier_available to procurement_eligibility.supplier_available;
    connection production_availability_route : PortConnection connect capability_acquisition.production_available to production_eligibility.production_available;
    connection dispatch_availability_route : PortConnection connect capability_acquisition.dispatch_available to dispatch_eligibility.dispatch_available;
    connection outcome_boundary_to_qualification : PortConnection connect execution_outcome_acquisition.outcome_boundary_facts to outcome_qualification.outcome_boundary_facts;
    connection request_facts_to_quotation : PortConnection connect request_qualification.request_facts to quotation_eligibility.request_facts;
    connection request_facts_to_composition : PortConnection connect request_qualification.request_facts to public_composition.request_facts;
    connection stock_facts_to_procurement : PortConnection connect stock_assessment.stock_facts to procurement_eligibility.stock_facts;
    connection stock_facts_to_production : PortConnection connect stock_assessment.stock_facts to production_eligibility.stock_facts;
    connection stock_facts_to_dispatch : PortConnection connect stock_assessment.stock_facts to dispatch_eligibility.stock_facts;
    connection qualified_outcome_to_recovery : PortConnection connect outcome_qualification.qualified_outcome to recovery_control.qualified_outcome;
    connection qualified_outcome_to_lifecycle : PortConnection connect outcome_qualification.qualified_outcome to order_lifecycle.qualified_outcome;
    connection recovery_gate_to_lifecycle : PortConnection connect recovery_control.recovery_gate to order_lifecycle.recovery_gate;
    connection recovery_gate_to_quotation : PortConnection connect recovery_control.recovery_gate to quotation_eligibility.recovery_gate;
    connection recovery_gate_to_procurement : PortConnection connect recovery_control.recovery_gate to procurement_eligibility.recovery_gate;
    connection recovery_gate_to_production : PortConnection connect recovery_control.recovery_gate to production_eligibility.recovery_gate;
    connection recovery_gate_to_dispatch : PortConnection connect recovery_control.recovery_gate to dispatch_eligibility.recovery_gate;
    connection emergency_to_arbitration : PortConnection connect recovery_control.emergency_state to action_arbitration.emergency_state;
    connection recovery_state_to_status : PortConnection connect recovery_control.recovery_state to status_derivation.recovery_state;
    connection prior_order_to_outcome : PortConnection connect order_lifecycle.prior_order_state to outcome_qualification.prior_order_state;
    connection current_order_to_quotation : PortConnection connect order_lifecycle.order_state to quotation_eligibility.order_state;
    connection current_order_to_procurement : PortConnection connect order_lifecycle.order_state to procurement_eligibility.order_state;
    connection current_order_to_production : PortConnection connect order_lifecycle.order_state to production_eligibility.order_state;
    connection current_order_to_dispatch : PortConnection connect order_lifecycle.order_state to dispatch_eligibility.order_state;
    connection current_order_to_status : PortConnection connect order_lifecycle.order_state to status_derivation.order_state;
    connection quotation_proposal_to_arbitration : PortConnection connect quotation_eligibility.proposal to action_arbitration.quotation_proposal;
    connection procurement_proposal_to_arbitration : PortConnection connect procurement_eligibility.proposal to action_arbitration.procurement_proposal;
    connection production_proposal_to_arbitration : PortConnection connect production_eligibility.proposal to action_arbitration.production_proposal;
    connection dispatch_proposal_to_arbitration : PortConnection connect dispatch_eligibility.proposal to action_arbitration.dispatch_proposal;
    connection selected_action_to_status : PortConnection connect action_arbitration.selected_action to status_derivation.selected_action;
    connection status_to_composition : PortConnection connect status_derivation.status_record to public_composition.status_record;
    connection selected_action_to_composition : PortConnection connect action_arbitration.selected_action to public_composition.selected_action;
  }

  part def FactoryDispatchCoordinatorSystem :> System {
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port inventorySnapshot : DataPort { in :>> type : InventorySnapshot; }
    port capabilitySnapshot : DataPort { in :>> type : CapabilitySnapshot; }
    port executionOutcome : DataPort { in :>> type : ExecutionOutcome; }
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port publicResult : DataPort { out :>> type : DispatchPublicResult; }

    part coordinator_process : FactoryDispatchCoordinatorProcess;

    interface expose_fresh_request : BoundaryExposure connect
      outer ::> freshRequest to inner ::> coordinator_process.fresh_request;
    interface expose_inventory_snapshot : BoundaryExposure connect
      outer ::> inventorySnapshot to inner ::> coordinator_process.inventorySnapshot;
    interface expose_capability_snapshot : BoundaryExposure connect
      outer ::> capabilitySnapshot to inner ::> coordinator_process.capabilitySnapshot;
    interface expose_execution_outcome : BoundaryExposure connect
      outer ::> executionOutcome to inner ::> coordinator_process.execution_outcome;
    interface expose_recovery_event : BoundaryExposure connect
      outer ::> recoveryEvent to inner ::> coordinator_process.recoveryEvent;
    interface expose_public_result : BoundaryExposure connect
      outer ::> coordinator_process.publicResult to inner ::> publicResult;
  }

  part factory_dispatch_coordinator : FactoryDispatchCoordinatorSystem;
}
