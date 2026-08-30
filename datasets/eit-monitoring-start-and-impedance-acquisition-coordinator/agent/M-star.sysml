package EIT_Acquisition_Coordinator {
  private import HAMR::*;

  enum def MonitoringRequest { enum NoRequest; enum StartMonitoring; enum StopMonitoring; }
  enum def InputStatus { enum Valid; enum Invalid; }
  enum def CalibrationState { enum NotCurrent; enum Current; }
  enum def ImpedanceToken { enum NoToken; enum TokenOne; enum TokenTwo; }
  enum def QualifiedRequest {
    enum InvalidRequest; enum NoQualifiedRequest; enum QualifiedStart; enum QualifiedStop;
  }
  enum def AcquisitionEvidence {
    enum InvalidAcquisitionEvidence; enum CalibrationAbsent; enum ReadyNoToken;
    enum ReadyTokenOne; enum ReadyTokenTwo;
  }
  enum def SessionMode { enum SessionStopped; enum SessionMonitoring; }
  enum def RecoveryPhase { enum Normal; enum AwaitNeutral; enum AwaitFreshRequest; }
  enum def AcquisitionCommand { enum HoldAcquisition; enum CollectImpedance; }
  enum def MonitoringDisposition {
    enum InputFaultDisposition; enum RecoveryDisposition; enum StopAccepted;
    enum StartAccepted; enum StartDenied; enum MonitoringContinued; enum StoppedDisposition;
  }
  enum def ImpedanceDelivery {
    enum Withheld; enum NoTokenAvailable; enum DeliverTokenOne; enum DeliverTokenTwo;
  }
  enum def MonitoringStatus {
    enum Stopped; enum Monitoring; enum CalibrationRequired; enum InputFault; enum RecoveryPending;
  }

  // Every GUMBO-inspected record field is an attribute, not a nested part.
  part def MonitoringRequestSample :> Data {
    attribute request : MonitoringRequest;
    attribute status : InputStatus;
  }
  part def CalibrationSample :> Data {
    attribute calibration : CalibrationState;
    attribute status : InputStatus;
  }
  part def ImpedanceSample :> Data {
    attribute token : ImpedanceToken;
    attribute status : InputStatus;
  }
  part def MonitoringResolution :> Data {
    attribute nextSessionMode : SessionMode;
    attribute nextRecoveryPhase : RecoveryPhase;
    attribute acquisitionCommand : AcquisitionCommand;
    attribute disposition : MonitoringDisposition;
  }

  part def RequestQualification :> Thread {
    port requestSample : DataPort { in :>> type : MonitoringRequestSample; }
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

                        
             
                     
                               
                                                                                            
                                                               
                                                                          
                               
                                                                  
                                                              
                                                                   
                                                                              
                               
                                                                 
                                                              
                                                                         
                                                                          
                               
                                                               
                                                              
                                                                        
                                                                         
       
  }

  part def AcquisitionEvidenceQualification :> Thread {
    port calibrationSample : DataPort { in :>> type : CalibrationSample; }
    port impedanceSample : DataPort { in :>> type : ImpedanceSample; }
    port acquisitionEvidence : DataPort { out :>> type : AcquisitionEvidence; }

                        
             
                     
                                
                                                                                 
                                                                    
                                                            
                                                                                            
                                
                                                                                                        
                                                                  
                                                           
                                                                           
                                                                                   
                                
                                                                                   
                                                                  
                                                           
                                                                         
                                                              
                                                                              
                                
                                                                                     
                                                                  
                                                           
                                                                         
                                                               
                                                                               
                                
                                                                                     
                                                                  
                                                           
                                                                         
                                                               
                                                                               
       
  }

  part def MonitoringDecisionOwner :> Thread {
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    port acquisitionEvidence : DataPort { in :>> type : AcquisitionEvidence; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port monitoringResolution : DataPort { out :>> type : MonitoringResolution; }

                        
           
                          
                                 
                          
                                     

                
                         
                                                                          
                                                    
                         
                                                                            
                                                
                         
                                                                        
                                                                   
                         
                                                                              
                                                                              
                                                                          
                                                                                         
                                                                                       

             
                           
                                                                                            
                                                              
                           
                                                                                               
                                                                  
                            
                                                                                                    
                                                                        
                          
                                                                                              
                                                                                                  

                     
                           
                                                                                   
                                                                        
                                                                                    
                                                                                          
                                                                                    
                                                                                             
                                                                                              

                           
                                                                                    
                                                                        
                                                                                     
                                                               
                                                                      
                                                                                          
                                                                                    
                                                                                             
                                                                                            

                           
                                                                          
                                                                        
                                                                                     
                                                               
                                                                      
                                                                                          
                                                                                         
                                                                                             
                                                                                            

                           
                                                                                     
                                                                        
                                                                                     
                                                                    
                                                                      
                                                                                          
                                                                                         
                                                                                             
                                                                                            

                           
                                                                                    
                                                                        
                                                                                     
                                                                    
                                                                 
                                                                                          
                                                                              
                                                                                             
                                                                                     

                           
                                                                                                  
                                                                        
                                                                                     
                                                                    
                                                                   
                                                                           
                                                                                             
                                                                              
                                                                                              
                                                                                      

                           
                                                                                            
                                                                        
                                                                                     
                                                                    
                                                                   
                                                                           
                                                                                          
                                                                              
                                                                                             
                                                                                    

                           
                                                                
                                                                        
                                                                                     
                                                         
                                                                 
                                                                                          
                                                                              
                                                                                             
                                                                                     

                           
                                                                      
                                                                        
                                                                                     
                                                         
                                                                   
                                                                           
                                                                                             
                                                                              
                                                                                              
                                                                                      

                           
                                                                      
                                                                        
                                                                                     
                                                         
                                                                   
                                                                           
                                                                                          
                                                                              
                                                                                             
                                                                                    

                           
                                                                                          
                                                                        
                                                                                     
                                                         
                                                                       
                                                                
                                                                           
                                                                                             
                                                                              
                                                                                              
                                                                                            

                           
                                                                                   
                                                                        
                                                                                     
                                                         
                                                                       
                                                              
                                                                              
                                                                                          
                                                                              
                                                                                             
                                                                                           
       
  }

  part def ImpedanceDeliveryDerivation :> Thread {
    port monitoringResolution : DataPort { in :>> type : MonitoringResolution; }
    port acquisitionEvidence : DataPort { in :>> type : AcquisitionEvidence; }
    port impedanceDelivery : DataPort { out :>> type : ImpedanceDelivery; }

                        
                
                         
                                                                         
                                                          
             
                     
                               
                                                                                        
                                                                                                 
                                                                      
                               
                                                                                        
                                                                                                   
                                                                                      
                                                                              
                                                                      
                               
                                                                                                            
                                                                                                   
                                                                      
                                                                              
                               
                                                                               
                                                                                                   
                                                                       
                                                                             
                               
                                                                               
                                                                                                   
                                                                       
                                                                             
       
  }

  part def DoctorStatusDerivation :> Thread {
    port monitoringResolution : DataPort { in :>> type : MonitoringResolution; }
    port acquisitionEvidence : DataPort { in :>> type : AcquisitionEvidence; }
    port monitoringStatus : DataPort { out :>> type : MonitoringStatus; }

                        
                
                         
                                                                     
                                                       
             
                     
                             
                                                                                      
                                                                                                   
                                                                      
                             
                                                                                        
                                                                                                    
                                                                                            
                                                                           
                             
                                                                                                               
                                                                                                    
                                                                                             
                                                                                      
                                                                                               
                                                                                 
                                                                               
                             
                                                                                                
                                                                                                    
                                                                                             
                                                                                     
                                                                                             
                                                                               
                                                                                             
                                                                      
                             
                                                                                          
                                                                                                    
                                                                                             
                                                                                     
                                                                                             
                                                                               
                                                                                            
                                                                   
       
  }

  part def EITAcquisitionCoordinationProcess :> Process {
    part requestQualification : RequestQualification;
    part acquisitionEvidenceQualification : AcquisitionEvidenceQualification;
    part monitoringDecisionOwner : MonitoringDecisionOwner;
    part impedanceDeliveryDerivation : ImpedanceDeliveryDerivation;
    part doctorStatusDerivation : DoctorStatusDerivation;

    port monitoringRequest : DataPort { in :>> type : MonitoringRequestSample; }
    port calibrationEvidence : DataPort { in :>> type : CalibrationSample; }
    port impedanceObservation : DataPort { in :>> type : ImpedanceSample; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port impedanceDelivery : DataPort { out :>> type : ImpedanceDelivery; }
    port monitoringStatus : DataPort { out :>> type : MonitoringStatus; }

    connection supportRequestToQualifier : PortConnection connect monitoringRequest to requestQualification.requestSample;
    connection supportCalibrationToQualifier : PortConnection connect calibrationEvidence to acquisitionEvidenceQualification.calibrationSample;
    connection supportImpedanceToQualifier : PortConnection connect impedanceObservation to acquisitionEvidenceQualification.impedanceSample;
    connection qualifiedRequestToDecision : PortConnection connect requestQualification.qualifiedRequest to monitoringDecisionOwner.qualifiedRequest;
    connection acquisitionEvidenceToDecision : PortConnection connect acquisitionEvidenceQualification.acquisitionEvidence to monitoringDecisionOwner.acquisitionEvidence;
    connection supportCommandToProcess : PortConnection connect monitoringDecisionOwner.acquisitionCommand to acquisitionCommand;
    connection resolutionToDelivery : PortConnection connect monitoringDecisionOwner.monitoringResolution to impedanceDeliveryDerivation.monitoringResolution;
    connection evidenceToDelivery : PortConnection connect acquisitionEvidenceQualification.acquisitionEvidence to impedanceDeliveryDerivation.acquisitionEvidence;
    connection supportDeliveryToProcess : PortConnection connect impedanceDeliveryDerivation.impedanceDelivery to impedanceDelivery;
    connection resolutionToStatus : PortConnection connect monitoringDecisionOwner.monitoringResolution to doctorStatusDerivation.monitoringResolution;
    connection evidenceToStatus : PortConnection connect acquisitionEvidenceQualification.acquisitionEvidence to doctorStatusDerivation.acquisitionEvidence;
    connection supportStatusToProcess : PortConnection connect doctorStatusDerivation.monitoringStatus to monitoringStatus;
  }

  part def EITMonitoringAcquisitionCoordinatorSystem :> System {
    part coordinationProcess : EITAcquisitionCoordinationProcess;
    port monitoringRequest : DataPort { in :>> type : MonitoringRequestSample; }
    port calibrationEvidence : DataPort { in :>> type : CalibrationSample; }
    port impedanceObservation : DataPort { in :>> type : ImpedanceSample; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port impedanceDelivery : DataPort { out :>> type : ImpedanceDelivery; }
    port monitoringStatus : DataPort { out :>> type : MonitoringStatus; }

    connection supportBoundaryRequest : PortConnection connect monitoringRequest to coordinationProcess.monitoringRequest;
    connection supportBoundaryCalibration : PortConnection connect calibrationEvidence to coordinationProcess.calibrationEvidence;
    connection supportBoundaryImpedance : PortConnection connect impedanceObservation to coordinationProcess.impedanceObservation;
    connection supportBoundaryCommand : PortConnection connect coordinationProcess.acquisitionCommand to acquisitionCommand;
    connection supportBoundaryDelivery : PortConnection connect coordinationProcess.impedanceDelivery to impedanceDelivery;
    connection supportBoundaryStatus : PortConnection connect coordinationProcess.monitoringStatus to monitoringStatus;
  }

  part eitMonitoringAcquisitionCoordinator : EITMonitoringAcquisitionCoordinatorSystem;
}
