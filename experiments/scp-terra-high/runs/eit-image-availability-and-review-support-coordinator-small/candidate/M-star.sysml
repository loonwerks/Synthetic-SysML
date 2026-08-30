package EIT_Image_Availability_Coordinator {

  private import HAMR::*;

  enum def Acquisition_Token {
    enum NoAcquisition;
    enum AcquisitionA;
    enum AcquisitionB;
  }

  enum def Review_Intent {
    enum NoIntent;
    enum RequestImage;
    enum ReleaseImage;
  }

  enum def Generation_Result {
    enum NoResult;
    enum GenerationFailed;
    enum ImageA;
    enum ImageB;
  }

  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Generation_Directive {
    enum HoldGeneration;
    enum GenerateFromA;
    enum GenerateFromB;
  }

  enum def Image_Delivery {
    enum Withheld;
    enum DeliverImageA;
    enum DeliverImageB;
  }

  enum def Availability_Status {
    enum NoImageAvailable;
    enum GenerationPending;
    enum ImageAvailable;
    enum UpstreamAcquisitionRequired;
    enum GenerationFailedStatus;
    enum InputFault;
    enum RecoveryPending;
  }

  enum def Qualified_Acquisition {
    enum InvalidAcquisition;
    enum NoAdmittedAcquisition;
    enum AdmittedA;
    enum AdmittedB;
  }

  enum def Qualified_Intent {
    enum InvalidIntent;
    enum NeutralIntent;
    enum FreshImageRequest;
    enum ReleaseIntent;
  }

  enum def Qualified_Generation_Result {
    enum InvalidGenerationResult;
    enum PendingResult;
    enum FailedResult;
    enum ReadyResultA;
    enum ReadyResultB;
  }

  enum def Image_State {
    enum Empty;
    enum RequestedA;
    enum RequestedB;
    enum ReadyA;
    enum ReadyB;
  }

  enum def Recovery_Phase {
    enum Normal;
    enum AwaitNeutral;
    enum AwaitFreshIntent;
  }

  enum def Resolution_Disposition {
    enum InputFaultDisposition;
    enum RecoveryDisposition;
    enum ReleasedDisposition;
    enum GenerationStarted;
    enum GenerationWaiting;
    enum GenerationCompleted;
    enum AcquisitionRequired;
    enum GenerationFailure;
    enum ExistingImageRetained;
    enum AvailableRetained;
    enum IdleDisposition;
  }

  // Every record field later inspected by GUMBO is an attribute member.
  part def Acquisition_Sample :> Data {
    attribute token : Acquisition_Token;
    attribute status : Input_Status;
  }

  part def Review_Intent_Sample :> Data {
    attribute intent : Review_Intent;
    attribute status : Input_Status;
  }

  part def Generation_Result_Sample :> Data {
    attribute result : Generation_Result;
    attribute status : Input_Status;
  }

  part def Image_Resolution :> Data {
    attribute next_image_state : Image_State;
    attribute next_recovery_phase : Recovery_Phase;
    attribute disposition : Resolution_Disposition;
  }

  part def Upstream_Acquisition_Qualification :> Thread {
    port acquisition_sample : DataPort { in :>> type : Acquisition_Sample; }
    port qualified_acquisition : DataPort { out :>> type : Qualified_Acquisition; }

                        
               
                             
                                                                                    
                                                                                             
                                                                                                               
                                                                                                  
                                               

                
                         
                                                                                                                                     
                                                                            

             
                             
                                                                                                                                       
                                                                           
       
  }

  part def Doctor_Intent_Qualification :> Thread {
    port review_intent_sample : DataPort { in :>> type : Review_Intent_Sample; }
    port qualified_intent : DataPort { out :>> type : Qualified_Intent; }

                        
               
                                
                                                                            
                                                                                   
                                                                                          
                                                                                                  
                                              

                
                         
                                                                                                                           
                                                             

             
                                
                                                                                                                             
                                                                   
       
  }

  part def Generation_Result_Qualification :> Thread {
    port generation_result_sample : DataPort { in :>> type : Generation_Result_Sample; }
    port qualified_generation_result : DataPort { out :>> type : Qualified_Generation_Result; }

                        
               
                                
                                                                                           
                                                                                                        
                                                                                                         
                                                                                                                
                                                                                                      
                                                        

                
                         
                                                                                                                                      
                                                                                             

             
                                
                                                                                                                                        
                                                                                  
       
  }

  part def Image_Availability_Governor :> Thread {
    port qualified_acquisition : DataPort { in :>> type : Qualified_Acquisition; }
    port qualified_intent : DataPort { in :>> type : Qualified_Intent; }
    port qualified_generation_result : DataPort { in :>> type : Qualified_Generation_Result; }
    port generation_resolution : DataPort { out :>> type : Image_Resolution; }
    port publication_resolution : DataPort { out :>> type : Image_Resolution; }

                        
                        
           
                          
                                 
                          
                                       

               
                          
                                                                    
                                                                            

                          
                                                                                                               
                                                                                                      
                                                                                                     

                          
                                                                                                                    
                                                                                          
                                            

                          
                                                                                                                        
                                                               
                                                               
                                                                
                                                     

                         
                                                             
                                                   
                                                              
                                                                         
                                                                   
                                                    
                                                                         
                                                     

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                              

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                              

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                                  

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                                  

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                                      

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                        

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                         
                                                                                       

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                         
                                            

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                         
                                                                                        

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                             
                                                                                            

                         
                                                                                       
                                                                                      
                                                                            
                                                                     
                                                                                         
                                                                                            

                                
                                                                               
                                                                                     
                                                                                          
                                 

                             
                                                                                        
                                                                                       
                                                                     
                                                                                       
                                                                               
                                                                                                                              
                                                                                                                              
                                                                                              
                                                                               
                                                                                                                   
                                                                                                                                
                                                                                                                                
                                                      
                                                                                                                                         
                                                                                                                                         
                         

                             
                                                                                        
                                                                                       
                                                                        
                                                                                                 
                                                                                                                                        
                                                                                         
                                                                                                                                            
                                     

                             
                                                                                              
                                                                                             
                                                                                      
                                                                                                                  
                                                                                                        
                                                                                                                                                       
                                                                                                                                                       
                                                                                                                                                                         
                                                                                                          
                                                                                                        
                                                                                                                                          
                                                                                                 
                                                                                     
                                                                                                                                                                       
                                                                                                                                               
                                                                                                            
                                                                                            
                                                      

                
                         
                                                                                                                               
                                            
                                                   
                                                                       
                                                                              
                                                                                       
                                                                        
                                                                               
                                                                                       

             
                           
                                                                                                                                
                                                                                                                                                    
                                                                                                                                                       
                                                                 
                                                                       
                                                                                                                                                                                
                                                                  
                                                                        
                                                                                  

                          
                                                                                              
                                                                                     

                     
                           
                                                                                                                                                
                                                                                                                        
                                                                                                        
                                                                                                        

                           
                                                                                                                                     
                                                                                                                                            
                                                                                                        
                                                                                                      

                           
                                                                                                                          
                                                                                                                                            
                                                                                                            
                                                                                                      

                           
                                                                                                                  
                                                                                                                                            
                                                                                                            
                                                                                                      

                           
                                                                                             
                                                                                                                                            
                                                                                                  
                                                                                                      

                           
                                                                                                                                               
                                                                                                                                            
                                                                                                                       
                                                          
                                                                                                                                              
                                                                        

                           
                                                                                                                                   
                                                                                                                                            
                                                                                                  
                                                                                                      

                           
                                                                                                                                   
                                                                                                                                            
                                                                                                  
                                                                                                    

                           
                                                                                                                
                                                                                                                                            
                                    
                                                                                                                      
                                                               
                                                                                                      

                           
                                                                                                                    
                                                                                                                                            
                                                                                                
                                                                                                    

                           
                                                                                                                                                   
                                                                                                                                            
                                    
                                                                                                              
                                                                                                                   
                                                
                                                               
                                                          
                                                                                       
                                                                                                                                
                                                                                                                   
                                                                            

                           
                                                                                                                      
                                                                                                                                            
                                                                                                
                                                          
                                                                                                          
                                                                        
       
  }

  part def Generation_Directive_Derivation :> Thread {
    port image_resolution : DataPort { in :>> type : Image_Resolution; }
    port qualified_acquisition : DataPort { in :>> type : Qualified_Acquisition; }
    port generation_directive : DataPort { out :>> type : Generation_Directive; }

                        
               
                              
                                                       
                                                                                      
                                                                                  
                                                                                                 
                                                                                       
                                                                                                      
                                                   

                
                         
                                                                                                    
                                                                      

             
                              
                                                                                                                                   
                                                                                         
       
  }

  part def Doctor_Publication :> Thread {
    port image_resolution : DataPort { in :>> type : Image_Resolution; }
    port image_delivery : DataPort { out :>> type : Image_Delivery; }
    port availability_status : DataPort { out :>> type : Availability_Status; }

                        
               
                                
                                                                         
                                                                                              
                                                                                                   
                                       

                                
                                                                            
                                                                                                                     
                                                                                                                             
                                                                                       
                                                                                                                             
                                                                                         
                                                                                           
                                                                                                                          
                                                                                                                                         
                                                                                                                                  
                                                    

                
                         
                                                                                                             
                                                     
                                                                      

             
                                
                                                                                                                                                       
                                                            
                                                              
       
  }

  part def Image_Availability_Process :> Process {
    part upstream_acquisition_qualification : Upstream_Acquisition_Qualification;
    part doctor_intent_qualification : Doctor_Intent_Qualification;
    part generation_result_qualification : Generation_Result_Qualification;
    part image_availability_governor : Image_Availability_Governor;
    part generation_directive_derivation : Generation_Directive_Derivation;
    part doctor_publication : Doctor_Publication;

    port acquisition_sample : DataPort { in :>> type : Acquisition_Sample; }
    port review_intent_sample : DataPort { in :>> type : Review_Intent_Sample; }
    port generation_result_sample : DataPort { in :>> type : Generation_Result_Sample; }
    port generation_directive : DataPort { out :>> type : Generation_Directive; }
    port image_delivery : DataPort { out :>> type : Image_Delivery; }
    port availability_status : DataPort { out :>> type : Availability_Status; }

    connection support_acquisition_to_qualification : PortConnection
      connect acquisition_sample to upstream_acquisition_qualification.acquisition_sample;
    connection support_intent_to_qualification : PortConnection
      connect review_intent_sample to doctor_intent_qualification.review_intent_sample;
    connection support_result_to_qualification : PortConnection
      connect generation_result_sample to generation_result_qualification.generation_result_sample;
    connection qualified_acquisition_to_governor : PortConnection
      connect upstream_acquisition_qualification.qualified_acquisition to image_availability_governor.qualified_acquisition;
    connection qualified_intent_to_governor : PortConnection
      connect doctor_intent_qualification.qualified_intent to image_availability_governor.qualified_intent;
    connection qualified_result_to_governor : PortConnection
      connect generation_result_qualification.qualified_generation_result to image_availability_governor.qualified_generation_result;
    connection governor_resolution_to_directive : PortConnection
      connect image_availability_governor.generation_resolution to generation_directive_derivation.image_resolution;
    connection acquisition_target_to_directive : PortConnection
      connect upstream_acquisition_qualification.qualified_acquisition to generation_directive_derivation.qualified_acquisition;
    connection support_directive_to_process : PortConnection
      connect generation_directive_derivation.generation_directive to generation_directive;
    connection governor_resolution_to_publication : PortConnection
      connect image_availability_governor.publication_resolution to doctor_publication.image_resolution;
    connection support_delivery_to_process : PortConnection
      connect doctor_publication.image_delivery to image_delivery;
    connection support_status_to_process : PortConnection
      connect doctor_publication.availability_status to availability_status;
  }

  part def EIT_Image_Availability_System :> System {
    part image_availability_process : Image_Availability_Process;

    port acquisition_sample : DataPort { in :>> type : Acquisition_Sample; }
    port review_intent_sample : DataPort { in :>> type : Review_Intent_Sample; }
    port generation_result_sample : DataPort { in :>> type : Generation_Result_Sample; }
    port generation_directive : DataPort { out :>> type : Generation_Directive; }
    port image_delivery : DataPort { out :>> type : Image_Delivery; }
    port availability_status : DataPort { out :>> type : Availability_Status; }

    connection support_boundary_acquisition : PortConnection
      connect acquisition_sample to image_availability_process.acquisition_sample;
    connection support_boundary_intent : PortConnection
      connect review_intent_sample to image_availability_process.review_intent_sample;
    connection support_boundary_result : PortConnection
      connect generation_result_sample to image_availability_process.generation_result_sample;
    connection support_boundary_directive : PortConnection
      connect image_availability_process.generation_directive to generation_directive;
    connection support_boundary_delivery : PortConnection
      connect image_availability_process.image_delivery to image_delivery;
    connection support_boundary_status : PortConnection
      connect image_availability_process.availability_status to availability_status;
  }

  part eit_image_availability_coordinator : EIT_Image_Availability_System;
}
