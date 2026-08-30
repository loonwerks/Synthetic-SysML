package Frigate_Threat_Response_Coordinator {
  private import HAMR::*;

  enum def ContactSignature {
    enum NONE;
    enum CONTACT;
  }

  enum def ContactIdentity {
    enum NO_HOSTILE;
    enum HOSTILE;
  }

  enum def ContactSignatureStatus {
    enum VALID;
    enum INVALID;
  }

  enum def IdentityStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DefenseAvailabilityStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DroneReadinessStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DestinationEvidenceStatus {
    enum VALID;
    enum INVALID;
  }

  enum def WarpProgressStatus {
    enum VALID;
    enum INVALID;
  }

  enum def RequestStatus {
    enum VALID;
    enum INVALID;
  }

  enum def AcknowledgmentStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DefenseAvailability {
    enum AVAILABLE;
    enum UNAVAILABLE;
  }

  enum def DroneReadiness {
    enum READY;
    enum NOT_READY;
  }

  enum def DestinationStatus {
    enum IDENTIFIED;
    enum ABSENT;
  }

  enum def WarpProgress {
    enum READY;
    enum IN_PROGRESS;
    enum COMPLETE;
    enum UNAVAILABLE;
  }

  enum def ResponseRequestValue {
    enum OBSERVE;
    enum DEFEND_IF_HOSTILE;
    enum RETREAT;
  }

  enum def AcknowledgmentValue {
    enum NOT_ACKNOWLEDGED;
    enum ACKNOWLEDGED;
  }

  enum def QualifiedThreat {
    enum CLEAR;
    enum SUSPECT;
    enum HOSTILE;
    enum UNKNOWN;
  }

  enum def DefenseCondition {
    enum READY;
    enum UNAVAILABLE;
    enum UNKNOWN;
  }

  enum def RetreatCondition {
    enum AVAILABLE;
    enum UNAVAILABLE;
    enum COMPLETE;
    enum UNKNOWN;
  }

  enum def ResponseCommitment {
    enum OPEN;
    enum DEFENSE_COMMITTED;
    enum RETREAT_COMMITTED;
  }

  enum def DefenseActivation {
    enum STAND_DOWN;
    enum ACTIVATE;
  }

  enum def RetreatNavigationCommand {
    enum HOLD;
    enum RETREAT;
  }

  enum def ResponseDisposition {
    enum OBSERVED;
    enum DEFENSE_ACTIVE;
    enum RETREAT_ACTIVE;
    enum RETREAT_BLOCKED;
    enum RETREAT_COMPLETE;
    enum INPUT_FAULT;
  }

  enum def ReportPriority {
    enum COMMUNICATION_FAULT;
    enum CLOSED;
    enum URGENT;
    enum ROUTINE;
  }

  part def ContactEvidence :> Data {
    attribute signature : ContactSignature;
    attribute signatureStatus : ContactSignatureStatus;
  }

  part def IdentificationEvidence :> Data {
    attribute identity : ContactIdentity;
    attribute identityStatus : IdentityStatus;
  }

  part def DefenseEvidence :> Data {
    attribute defenseAvailable : DefenseAvailability;
    attribute defenseStatus : DefenseAvailabilityStatus;
    attribute droneReadiness : DroneReadiness;
    attribute droneStatus : DroneReadinessStatus;
  }

  part def RetreatNavigationEvidence :> Data {
    attribute destination : DestinationStatus;
    attribute destinationStatus : DestinationEvidenceStatus;
    attribute warpProgress : WarpProgress;
    attribute warpStatus : WarpProgressStatus;
  }

  part def ResponseRequest :> Data {
    attribute request : ResponseRequestValue;
    attribute requestStatus : RequestStatus;
  }

  part def ReportAcknowledgment :> Data {
    attribute acknowledgment : AcknowledgmentValue;
    attribute acknowledgmentStatus : AcknowledgmentStatus;
  }

  part def ResponseRecord :> Data {
    attribute qualifiedThreat : QualifiedThreat;
    attribute disposition : ResponseDisposition;
  }

  part def ThreatReport :> Data {
    attribute qualifiedThreat : QualifiedThreat;
    attribute disposition : ResponseDisposition;
    attribute priority : ReportPriority;
  }

  part def ThreatEvidenceInterpreter :> Thread {
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    port qualifiedThreat : DataPort { out :>> type : QualifiedThreat; }

                        
             
                 
                                     
                                                                                                                    
                                                                                   
                                                                                 
                                                                   
                                                                                   
                                                             
                                                                               
                                                                             
                                                                     
                                                                                 
                                                             
                                                                               
                                                                             
                                                                     
                                                                                    
                                                             
                                                                               
                                                                             
                                                                  
                                                                                    
                                                          
       
  }

  part def DefenseReadinessAssessor :> Thread {
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    port defenseCondition : DataPort { out :>> type : DefenseCondition; }

                        
             
                 
                                     
                                                                                                                     
                                                                                    
                                                                                    
                                                               
                                                                                
                                                                         
                                                                                 
                                                                             
                                                             
                                                                                
                                                                         
                                                                                    
                                                                                   
                                                                  
       
  }

  part def RetreatReadinessAssessor :> Thread {
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    port retreatCondition : DataPort { out :>> type : RetreatCondition; }

                        
             
                 
                                     
                                                                                                                         
                                                                                                  
                                                                                           
                                                               
                                                                                              
                                                                                
                                                                                      
                                                                
                                                                                              
                                                                                
                                                                                     
                                                                             
                                                                                           
                                                                 
                                                                                              
                                                                                
                                                                               
                                                                                  
                                                                                           
                                                                  
       
  }

  part def PrincipalResponseCoordinator :> Thread {
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    port qualifiedThreat : DataPort { in :>> type : QualifiedThreat; }
    port defenseCondition : DataPort { in :>> type : DefenseCondition; }
    port retreatCondition : DataPort { in :>> type : RetreatCondition; }
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    port responseRecord : DataPort { out :>> type : ResponseRecord; }

                        
           
                         
                                                
                         
                                                  

                
                 
                           
                                                                                                                   
                                                           
                                      
                                                               
                                                                       
                                                                       
                                                                          

             
                     
                           
                                                                                                               
                                                               
                                                            
                                                            
                                                                     
                                                                         
                                                                         
                                                                 
                                                                             
                                                                                       
                                                                               
                                                                                       
                                                                  
                                                                      
                                                                                
                                             
                                                                        
                                                                                
                                                                  

                           
                                                                                                                          
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                             
                                                                         
                                                                            
                                                                 
                                                                                
                                                                          
                                                                                
                                             
                                                                                
                                                                  

                           
                                                                                                                                    
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                               
                                                                         
                                                                         
                                                                 
                                                                                 
                                                                          
                                                                                
                                             
                                                                                
                                                                  

                           
                                                                                                                  
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                            
                                                                         
                                                                         
                                                                 
                                                                                  
                                                             
                                                                                
                                             
                                                                                
                                                                  

                           
                                                                                                                                   
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                              
                                                                         
                                               
                                                                                   
                                                            
                                                                   
                                                                         
                                                                            
                                                                 
                                                                                
                                                                          
                                                                                
                                             
                                                                                
                                            

                           
                                                                                                                                         
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                                
                                                                         
                                               
                                                                                   
                                                            
                                                                   
                                                                         
                                                                         
                                                                 
                                                                                 
                                                                          
                                                                                
                                             
                                                                                
                                            

                           
                                                                                                                               
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                                    
                                                                           
                                                 
                                                                                     
                                                              
                                                                       
                                                          
                                                                                 
                                                         
                                                                       
                                                                         
                                                                 
                                                                                
                                                                          
                                       

                           
                                                                                                                   
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                                    
                                                                           
                                                 
                                                                                     
                                                              
                                                                       
                                                               
                                                                                   
                                                            
                                                                         
                                                                         
                                                                 
                                                                          
                                                             
                                                                                
                                             
                                                                                
                                                                  
       
  }

  part def ThreatReportComposer :> Thread {
    port responseRecord : DataPort { in :>> type : ResponseRecord; }
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    port threatReport : DataPort { out :>> type : ThreatReport; }

                        
             
                     
                           
                                                                                                                                
                                                                                             
                                                                                      
                                                                      
                                                                          

                           
                                                                                                          
                                                                                            
                                                                                      
                                                                                      
                                                                      
                                                             

                           
                                                                                                          
                                                                                            
                                                                                           
                                                                              
                                                                                  
                                                                                      
                                                                      
                                                             

                           
                                                                                                                
                                                                                            
                                                                                           
                                                                           
                                                                                 
                                                                                 
                                                                                   
                                                                                      
                                                                      
                                                              
       
  }

  part def ThreatResponseProcess :> Process {
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    port threatReport : DataPort { out :>> type : ThreatReport; }

    part threatEvidenceInterpreter : ThreatEvidenceInterpreter;
    part defenseReadinessAssessor : DefenseReadinessAssessor;
    part retreatReadinessAssessor : RetreatReadinessAssessor;
    part principalResponseCoordinator : PrincipalResponseCoordinator;
    part threatReportComposer : ThreatReportComposer;

    connection int01 : PortConnection connect contactEvidence to threatEvidenceInterpreter.contactEvidence;
    connection int02 : PortConnection connect identificationEvidence to threatEvidenceInterpreter.identificationEvidence;
    connection int03 : PortConnection connect defenseEvidence to defenseReadinessAssessor.defenseEvidence;
    connection int04 : PortConnection connect retreatNavigationEvidence to retreatReadinessAssessor.retreatNavigationEvidence;
    connection int05 : PortConnection connect responseRequest to principalResponseCoordinator.responseRequest;
    connection int06 : PortConnection connect threatEvidenceInterpreter.qualifiedThreat to principalResponseCoordinator.qualifiedThreat;
    connection int07 : PortConnection connect defenseReadinessAssessor.defenseCondition to principalResponseCoordinator.defenseCondition;
    connection int08 : PortConnection connect retreatReadinessAssessor.retreatCondition to principalResponseCoordinator.retreatCondition;
    connection int09 : PortConnection connect principalResponseCoordinator.defenseActivation to defenseActivation;
    connection int10 : PortConnection connect principalResponseCoordinator.retreatNavigationCommand to retreatNavigationCommand;
    connection int11 : PortConnection connect principalResponseCoordinator.responseRecord to threatReportComposer.responseRecord;
    connection int12 : PortConnection connect reportAcknowledgment to threatReportComposer.reportAcknowledgment;
    connection int13 : PortConnection connect threatReportComposer.threatReport to threatReport;
  }

  part def FrigateThreatResponseCoordinator :> System {
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    port threatReport : DataPort { out :>> type : ThreatReport; }

    part threatResponseProcess : ThreatResponseProcess;

    connection supportInt01 : PortConnection connect contactEvidence to threatResponseProcess.contactEvidence;
    connection supportInt02 : PortConnection connect identificationEvidence to threatResponseProcess.identificationEvidence;
    connection supportInt03 : PortConnection connect defenseEvidence to threatResponseProcess.defenseEvidence;
    connection supportInt04 : PortConnection connect retreatNavigationEvidence to threatResponseProcess.retreatNavigationEvidence;
    connection supportInt05 : PortConnection connect responseRequest to threatResponseProcess.responseRequest;
    connection supportInt12 : PortConnection connect reportAcknowledgment to threatResponseProcess.reportAcknowledgment;
    connection supportInt09 : PortConnection connect threatResponseProcess.defenseActivation to defenseActivation;
    connection supportInt10 : PortConnection connect threatResponseProcess.retreatNavigationCommand to retreatNavigationCommand;
    connection supportInt13 : PortConnection connect threatResponseProcess.threatReport to threatReport;
  }

  part frigateThreatResponseCoordinator : FrigateThreatResponseCoordinator;
}
