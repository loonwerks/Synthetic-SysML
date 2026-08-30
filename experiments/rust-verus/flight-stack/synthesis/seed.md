                  APPENDIX B—FLIGHT CONTROL SYSTEM EXAMPLE

This appendix contains a high-level specification for a simplified Flight Control System (FCS).
The purpose of this example is to illustrate how a specification could be allocated to separate
subsystems as discussed in section 2.10. For this reason, the example is only decomposed down
to the Flight Guidance (FG) and Autopilot (AP) Functions. These functions are then further
developed as separate subsystems specifications, which are shown in appendices C and D.
However, detailed behavior and performance requirements are not included.

B.1 SYSTEM OVERVIEW.

The system being specified is a portion of an FCS. The FCS compares the measured Aircraft
Attitude to a Reference Attitude and generates Flight Director (FD) Guidance commands that are
displayed as visible cues, i.e., the FD, on the left and right Primary Flight Displays (PFD). The
Pilot or Copilot can manually fly the aircraft to follow the FD to achieve the Reference Attitude.
The Pilot or Copilot can clear the FD from the PFDs, turn the FD back on, and synchronize the
Reference Attitude to the current Aircraft Attitude.

The FCS also provides an AP Function that the Pilot or Copilot can request. When the AP
Function is engaged, the FCS generates Actuator Commands that will prompt the aircraft control
surfaces to fly the aircraft to the Reference Attitude. While the AP Function is engaged, the
Pilot or Copilot can initiate control wheel steering, which suspends the AP Function, allowing
the Pilot or Copilot to manually fly the aircraft to a new attitude, and then resume the AP
Function using the new attitude as the Reference Attitude.

In addition to the FD, the PFDs also display whether the AP Function is engaged, if the AP
Function has failed, and if the FCS has failed.

B.1.1 SYSTEM CONTEXT.

The operational context of the FCS is shown in figure B-1.




                                               B-1
                               Pilot
                 Pilot                      FD
               Commands


                                                       Left
                   AHS
                                                       PFD
                           Aircraft          FD         FCS     AP
                           Attitude     Guidance       Failed   Status



      FCI        Pilot                                 FCS                Actuator
                Inputs                                                   Commands
                                                                                     CSA


                                             FD         FCS     AP
                                        Guidance       Failed   Status

                                                       Right
                                                       PFD

                Copilot                     FD
               Commands

                                  Copilot
                  Figure B-1. Context Diagram for the Flight Control System

The FCS interacts directly with

•      the Flight Crew Interface (FCI) that supplies the inputs provided by the Pilot and
       Copilot, such as the Display FD, Sync FD, and Engage AP requests.

•      the Altitude Heading System (AHS) that provides the current Aircraft Attitude.

•      the Right and Left PFDs that show the FD Guidance, the AP Status, and the FCS
       Failed indication.

•      the Control Surface Actuators (CSA) that position the aircraft control surfaces
       based on the Actuator Commands.




                                                 B-2
The FCS also interacts indirectly with

•      the Pilot and the Copilot, who view the FD, the AP Status, the FCS Failed indication on
       the PFD and provide the Pilot Inputs via the FCI.

B.1.2 SYSTEM GOALS.

The high-level goals of this system are as follows:

•      G1—Provide guidance to the Pilot and Copilot to allow them to manually fly the aircraft
       to a desired attitude

•      G2—Automatically fly the aircraft to hold at a desired attitude when the AP is engaged

•      G3—Ensure that unsafe aircraft maneuvers are not commanded by the FCS

•      G4—Ensure that aircraft maneuvers that might cause passenger discomfort are not
       commanded by the FCS

•      G5—Keep the cost of manufacturing the FCS as low as possible

•      G6—Keep the cost of operating the FCS as low as possible

B.2 OPERATIONAL CONCEPTS.

The use cases in tables B-1 through B-5 describe how the operators (the Pilot and Copilot)
interact with the FCS.

Refer to table B-1 for use case 1: Pilot or Copilot activates and flies the FD.




                                                B-3
                                   Table B-1. Activating and Flying the FD

                   Describes normal use of the FCS by the Pilot or Copilot when manually
       Purpose
                   flying the aircraft to follow the FD command bars
                       Primary Actor                                     Related Goals
     Pilot or Copilot                                       G1, G3, and G4
                        Precondition                                     Postcondition
     Both FD are cleared                                    Both FD are displayed
     AP Function is disengaged                              AP Function is disengaged
                     Main Success Scenario (Use Case 1)                        Exception Function
                                                    1
     1. Pilot or Copilot requests display of FD.
     2. FCS synchronizes Reference Attitude to current Aircraft               EC 1       B.4.1
     Attitude
     3. Each PFD shows its FD at the Reference Attitude
     4. Pilot or Copilot flies the aircraft to desired attitude
     5. Pilot or Copilot requests synchronization of references2
     6. FCS synchronizes Reference Attitude to current Aircraft               EC 2       B.4.1
     Attitude
     7. Each PFD gradually positions its FD to the new Reference
     Attitude
     8. Pilot or Copilot manually flies aircraft to follow the FD
                                            Exception Case EC 1
     1. FD fails to display due to unsafe attitude of aircraft
     2. Each PFD annunciates unsafe attitude to alert Pilot and
     Copilot
     3. Pilot or Copilot flies aircraft to safe attitude
     4. Return to step 1 of main success scenario
                                            Exception Case EC 2
     1. FCS fails to synchronize due to unsafe attitude                                  B.4.1
     2. Each PFD annunciates unsafe attitude to alert Pilot and
     Copilot
     3. Pilot or Copilot flies the aircraft to safe attitude
     4. Return to step 4 of main success scenario
1
    For example, by pressing the FD switch on the FCP
2
    For example, by pressing the SYNC button on the control yoke




                                                        B-4
Refer to table B-2 for use case 2: Pilot or Copilot clears the FD.

                                          Table B-2. Clearing the FD

Purpose       Describes how Pilot or Copilot turns the FD off
                 Primary Actor                                   Related Goals
Pilot or Copilot                                  G1, G2, and G3
                  Precondition                                    Postcondition
Both FD are displayed                             Both FD are cleared
                                                  AP Function is disengaged
               Main Success Scenario (Use Case 2)                    Exception     Function
                                                1
1. Pilot or Copilot requests clearing of the FD                                   B.4.1
2. Each PFD clears its FD                                           EC 1
                                     Exception Case 1 (EC 1)
1. FD fails to clear because AP Function is engaged                               B.4.2
2. Pilot or Copilot requests disengagement of the AP Function2
3. AP disengages                                                                  B.4.2
4. Return to step 1 of main success scenario
1
    For example, by pressing the FD switch on the FCP
2
    For example, by pressing the AP switch on the FCP




                                                        B-5
Refer to table B-3 for use case 3: Pilot or Copilot engages AP Function.

                                Table B-3. Engaging the AP Function

                Describes the engagement of the AP Function by the Pilot or Copilot when
   Purpose      the FD is displayed
                     Primary Actor                                      Related Goals
  Pilot or Copilot                                         G2 and G3
                   Precondition                                         Postcondition
  Both FD are displayed                                    Both FD are displayed
  AP Function is disengaged                                AP Function is engaged

                 Main Success Scenario (Use Case 3)                         Exception   Function
  1. Pilot or Copilot flies aircraft to the desired attitude
  2. Pilot or Copilot requests AP engagement*
  3. FCS synchronizes Reference Attitude with Aircraft Attitude             EC 1        B.4.1
  4. Each PFD positions its FD to the new Reference Attitude
  5. FCS engages AP Function                                                EC 2        B.4.2
  6. Each PFD annunciates AP engagement to Pilot and Copilot
  7. AP Function generates Actuator Commands to hold aircraft at                        B.4.2
     Reference Attitude
                                       Exception Case 1 (EC 1)
  1. FCS fails to synchronize due to unsafe attitude                                    B.4.1
  2. Each PFD annunciates unsafe attitude to alert Pilot and
  Copilot
  3. Pilot or Copilot flies aircraft to safe attitude
  4. Return to step 2 of main success scenario
                                       Exception Case 2 (EC 2)
  1. AP Function fails to engage due to AP Function failure                             B.4.2
  2. Each PFD annunciates AP failure to alert Pilot and Copilot
  3. Pilot or Copilot flies aircraft manually

*For example, by pressing the AP switch on the FCP




                                                     B-6
Refer to table B-4 for use case 4: Pilot or Copilot initiates control wheel steering.

                              Table B-4. Initiating Control Wheel Steering

              Describes how the Pilot or Copilot flies the aircraft to a new attitude when the AP
    Purpose
              is engaged
                  Primary Actor                                      Related Goals
Pilot or Copilot                                  G2, G3, and G4
                   Precondition                                      Postcondition
Both FD are displayed                             Both FDs are displayed
AP Function is engaged                            AP Function is engaged
                Main Success Scenario (Use Case 4)                           Exception   Function
Pilot or Copilot requests control wheel steering1
AP Function decouples2 from CSA                                                          B.4.2
Each PFD annunciates AP Function is decoupled
FCS starts continuous synchronization of Reference Attitude to                           B.4.1
Aircraft Attitude
Pilot or Copilot flies the aircraft to desired attitude                      EC 1
Pilot or Copilot cancels control wheel steering3
FCS stops synchronization of Reference Attitude                                          B.4.1
AP Function couples to CSA                                                               B.4.2
Each PFD annunciates AP Function is coupled
AP Function gradually steers aircraft to new Reference Attitude
                                       Exception Case 1 (EC 1)
AP Function disengages due to unsafe attitude of aircraft                                B.4.2
Each PFD annunciates unsafe attitude to alert Pilot and Copilot
FCS stops synchronization of Reference Attitude                                          B.4.1
Pilot or Copilot flies the aircraft to safe attitude
FCS resumes synchronization of Reference Attitude                                        B.4.1
Pilot or Copilot cancels control wheel steering
FCS stops synchronization of Reference Attitude                                          B.4.1
1
  For example, by pressing and holding the SYNC button on the control yoke
2
  Temporarily disconnects AP from the CSA without disengaging the AP
3
  For example, by releasing the SYNC button on the control yoke




                                                      B-7
Refer to table B-5 for use case 5: pilot or copilot disengages the AP Function.

                                Table B-5. Disengaging the AP Function

 Purpose      Describes how Pilot or Copilot disengages the AP Function
                 Primary Actor                                   Related Goals
Pilot or Copilot                                  G2
                  Precondition                                    Postcondition
Both FD are displayed                             Both FD are displayed
AP Function is engaged                            AP Function is disengaged
               Main Success Scenario (Use Case 5)                    Exception           Function
                                                           *
Pilot or Copilot requests disengagement of the AP Function                              B.4.2
FCS disengages the AP Function                                      EC1
Each PFD annunciates disengagement of the AP Function

*For example, by pressing the AP switch on the FCP

B.3 EXTERNAL ENTITIES.

The following sections describe the external entities with which the FCS directly interacts—the
FCI, the AHS, the CSA, and the left and right PFD. The monitored and controlled variables
associated with each entity are listed along with any environmental assumptions made about the
entity.

B.3.1 FLIGHT CREW INTERFACE.

The FCI provides the inputs from the Pilot and the Copilot that affect the behavior of the FCS.
The monitored variables are shown in table B-6. No environmental assumptions are made.

                    Table B-6. Flight Control System Monitored Variables for FCI

         Name           Type          Range          Units              Physical Interpretation
  Pilot Inputs                                               Commands provided by Pilot or Copilot
     Display FD       Boolean    False, True                 Command to display or clear the FD to
                      Status     ●Invalid, Valid             the Pilot and Copilot
     Sync FD          Boolean    False, True                 Command to set Reference Attitude to
                      Status     ●Invalid, Valid             current Aircraft Attitude
     Engage AP        Boolean    False, True                 Command to activate or deactivate the
                      Status     ●Invalid, Valid             AP Function

    ● denotes initial value




                                                     B-8
B.3.2 ATTITUDE HEADING SYSTEM.

The AHS provides the current Aircraft Attitude to the FCS. The monitored variables are shown
in table B-7.

         Table B-7. Flight Control System Monitored Variables for Altitude Heading System

           Name        Type               Range           Units            Physical Interpretation
     Aircraft Attitude                                             Current attitude of the aircraft
        Aircraft Roll Real             [-180.0..179.9]   Degrees   Current roll angle of the aircraft:
                                                                   • 0° indicates wings level
                                                                   • -X° indicates X° bank to the left
                              Status   ●Invalid, Valid             • +X° indicates X° bank to the right
         Aircraft             Real     [-180.0..179.9]   Degrees   Current pitch angle of the aircraft:
         Pitch                                                     • 0° indicates level flight
                                                                   • -X° indicates X° nose up
                                                                   • +X° indicates X° nose down
                              Status   ●Invalid, Valid

    ● denotes initial value

The following environmental assumptions are made:

•         EA-AHS-1: The Aircraft Roll will range between -180.0° to +179.9°, inclusive.
          Rationale: The AHS will provide true roll of the aircraft, which can take on any value in
          the full range of motion of the aircraft.

•         EA-AHS-2: The Aircraft Roll will be sensed to an accuracy of ±0.1°.
          Rationale: This accuracy is needed to ensure that the displayed aircraft attitude moves
          smoothly on the PFD and to ensure the FCS computes the Actuator Commands and FD
          Guidance commands with the necessary accuracy.

•         EA-AHS-3: The Aircraft Pitch will range between -180.0° to +179.9°, inclusive.
          Rationale: The AHS will provide true pitch of the aircraft, which can take on any value
          in the full range of motion of the aircraft.

•         EA-AHS-4: The Aircraft Pitch will be sensed to an accuracy of ±0.1°.
          Rationale: This accuracy is needed to ensure that displayed aircraft attitude moves
          smoothly on the PFD and to ensure the FCS computes the Actuator Commands and FD
          Guidance commands with the necessary accuracy.




                                                         B-9
B.3.3 CONTROL SURFACE ACTUATORS.

The CSA positions the aircraft control surfaces based on the Actuator Commands generated by
the FCS to hold the aircraft to the Reference Attitude. The controlled variables are shown in
table B-8.

     Table B-8. Flight Control System Controlled Variables for Controlled Surface Actuators

    Name      Type           Range         Units                 Physical Interpretation
Actuator Commands                                             Commanded Actuator Rates
 Roll       Real          [-20.0..20.0] ° surface/    Commanded rate of roll actuator:
 Actuator                                second       • 0 → no change of control surfaces
                                                      • -X → left wing down.
                                                      • +X → right wing down
    Pitch      Real       [-20.0..20.0] ° surface/    Commanded rate of pitch actuator:
    Actuator                             second       • 0 → no change of control surfaces
                                                      • -X → nose up
                                                      • +X → nose down
    AP On      Boolean    False, True                 Indication whether the AP Function is on
                                                      and the Actuator Commands will be used

The following environmental assumptions are made:

•       EA-CSA-1: The Roll Actuator rate will range between -20.0 to +20.0° surface/second,
        inclusive.
        Rationale: Specified by aircraft manufacturer as the range necessary to adequately
        control the aircraft.

•       EA-CSA-2: The Roll Actuator rate will be set to a resolution of 0.1° surface/second.
        Rationale: Controllability analysis shows that a resolution of 0.1° surface/second is
        necessary to maintain control of the aircraft.

•       EA-CSA-3: The Pitch Actuator rate will range between -20.0 to +20.0° surface/second,
        inclusive.
        Rationale: Specified by aircraft manufacturer as the range necessary to adequately
        control the aircraft.

•       EA-CSA-4: The Pitch Actuator rate will be set to a resolution of 0.1° surface/second.
        Rationale: Controllability analysis shows that a resolution of 0.1° surface/second is
        necessary to maintain aircraft control.




                                              B-10
 B.3.4 PRIMARY FLIGHT DISPLAY.

 The Left and Right PFD shows the FD, FCS Failed indication, and the AP Status.                The
 controlled variables are shown in table B-9.

                  Table B-9. Flight Control System Controlled Variables for PFD

       Name               Type         Range           Units           Physical Interpretation
FD Guidance                                                        Guidance Commands for FD
  Roll Guidance        Real          [-45.0..45.0]    Degrees   Desired roll angle of the aircraft:
                                                                • 0° indicates wings level
                                                                • -X° indicates X° bank to the left
                                                                • +X° indicates X° bank to the
                                                                        right
     Pitch Guidance    Real          [-45.0..45.0]    Degrees   Desired pitch angle of the aircraft:
                                                                • 0° indicates level flight
                                                                • -X° indicates X° nose up
                                                                • +X° indicates X° nose down
     FD On             Boolean       False, True                Indication if FD is to be displayed:
                                                                • False → Do not display FD
                                                                • True → Display FD
FCS Failed             Boolean       False, True                Indication if FCS is failed:
                                                                • False → FCS is functioning
                                                                • True → FCS is failed
AP Status              Enumerated   Failed, Off, On             Status of AP Function:
                                                                • Failed → AP Function is failed
                                                                • Off → AP Function is off
                                                                • On       → AP Function is on

 The following environmental assumptions are made:

 •        EA-PFD-1: The Roll Guidance will range between -45.0° to +45.0°, inclusive.
          Rationale:   Specified by aircraft manufacturer as the maximum range for the Roll
          Guidance.

 •        EA-PFD-2: The Roll Guidance will be set in tenths of a degree.
          Rationale: This resolution is necessary to achieve smooth movement of the FD during
          control wheel steering.

 •        EA-PFD-3: The Pitch Guidance will range between -45.0° to +45.0°, inclusive.
          Rationale:   Specified by aircraft manufacturer as the maximum range for the Pitch
          Guidance.




                                               B-11
•      EA-PFD-4: The Pitch Guidance will be set in tenths of a degree.
       Rationale: This resolution is necessary to achieve smooth movement of the FD during
       control wheel steering.

B.4 FLIGHT CONTROL SYSTEM FUNCTIONS.

This section describes the main functions provided by the FCS.

The high-level requirements for the FCS Function are:

•      REQ-FCS-1: The FCS shall generate the FD Guidance commands.
       Rationale: This is a primary function of the FCS. The PFD uses the FD Guidance
       commands to position the FD to show the Pilot and Copilot how to fly the aircraft to the
       Reference Attitude.

•      REQ-FCS-2: The FCS shall set the Reference Attitude.
       Rationale: The FCS sets the Reference Attitude when the Pilot or Copilot requests the
       FCS to synchronize the Reference Attitude to the current attitude or to engage the AP
       Function.

•      REQ-FCS-3: The FCS shall set FCS Failed status to indicate if the FCS Function has
       failed.
       Rationale: If the FCS has failed, the FD must be cleared and the Pilot and Copilot
       notified that the FCS Function has failed. This is typically indicated by the PFD.

•      REQ-FCS-4: The FCS shall generate the Actuator Commands.
       Rationale: This is a primary function of the FCS. The CSA use the Actuator Commands
       to fly the aircraft to the Reference Attitude when the AP Function is on.

•      REQ-FCS-5: The FCS shall set the AP Status to indicate the current status of the AP
       Function.
       Rationale: The current status of the AP Function must be displayed to the Pilot and
       Copilot to ensure they know when the AP Function is controlling the aircraft.

Refer to figure B-2 for the FCS functions.




                                             B-12
                       Figure B-2. Flight Control System Function Diagram

 For the internal variables for the FCS refer to table B-10.

                       Table B-10. Flight Control System Internal Variables

        Name               Type          Range          Units           Physical Interpretation
AP Guidance                                                         Guidance Commands for AP
 Roll Guidance            Real        [-45.0..45.0] Degrees     Desired roll angle of the aircraft:
                                                                • 0° indicates wings level
                                                                • -X° indicates X° bank to the left
                                                                • +X° indicates X° bank to the right
 Pitch Guidance           Real        [-45.0..45.0] Degrees     Desired pitch angle of the aircraft:
                                                                • 0° indicates level flight
                                                                • -X° indicates X° nose up
                                                                • +X° indicates X° nose down
 Guidance Valid           Boolean     False, True               Indicates if the AP guidance is valid
                                                                and can be used
AP Guidance Request       Boolean     False, True               Request for valid AP guidance

 B.4.1 FLIGHT GUIDANCE FUNCTION.

 The FG Function compares the measured Aircraft Attitude to a Reference Attitude and generates
 FD Guidance commands that are displayed as visible cues on the FD and AP Guidance
 commands that are used by the AP Function.

 The high-level requirements for the FG Function are:

 •      REQ-FG-1: The FG Function shall generate the FD Guidance commands.
        Rationale: A primary function of the FG is to provide the FD Guidance commands for
        the FCS Function.




                                                 B-13
•      REQ-FG-2: The FG Function shall set the Reference Attitude.
       Rationale: The FG Function sets the Reference Attitude when it is requested to
       synchronize the Reference Attitude to the current attitude (either by the Pilot, Copilot, or
       the AP Function).

•      REQ-FG-3: The FG Function shall generate the AP Guidance commands.
       Rationale: A primary function of the FG Function is to provide the AP Guidance
       commands for the FCS Function.

•      REQ-FG-4: The FG Function shall set the FCS Failed indication.
       Rationale: The FCS Function is split between the FG Function and the AP Function.
       The AP Function status is indicated independently to the Pilot and Copilot on the PFD.
       As a result, the status of the FCS Function (FCS Failed) is set by the FG Function.

B.4.2 AUTOPILOT FUNCTION.

The AP Function generates Actuator Commands from the AP Guidance commands provided by
the FG Function. The Actuator Commands are used by CSA to fly the aircraft to the attitude
specified by the AP Guidance commands.

The high-level requirements for the AP Function are:

•      REQ-AP-1: The AP Function shall generate the Actuator Commands.
       Rationale: The primary function of the AP is to generate the Actuator Commands for the
       FCS Function.

•      REQ-AP-2: The AP Function shall set the AP Status to indicate its status.
       Rationale: The AP Function is responsible for providing its current status to the FCS
       Function.

•      REQ-AP-3: The AP Function shall generate the AP Guidance Request.
       Rationale: The AP Guidance Request calls for the FG Function to synchronize its
       Reference Attitude to produce an acceptable AP Guidance command.




                                              B-14
                 APPENDIX C—FLIGHT GUIDANCE SYSTEM EXAMPLE

This appendix contains a high-level specification for a simplified Flight Guidance System
(FGS). The purpose of this example is to illustrate how a specification could be allocated to
separate subsystems, as discussed in section 2.10. It expands the Flight Guidance (FG) Function
of the Flight Control System (FCS) specified in appendix B into a separate subsystem
specification that could be given to a subcontractor. As such, it contains only the subset of the
information from the FCS specification relevant to the FGS subsystem. This specification would
be used as a starting point to be completed by the FCS contractor and the FGS subcontractor
prior to developing the FGS. Further functional decomposition and definition of the detailed
behavior and performance requirements would be needed to complete this specification.

C.1 SYSTEM OVERVIEW.

The system being specified is a portion of a FGS. The FGS compares the measured Aircraft
Attitude to a Reference Attitude and generates Flight Director (FD) Guidance commands that are
displayed as visible cues, i.e., the FD, on the Left and Right Primary Flight Displays (PFD). The
Pilot or Copilot can manually fly the aircraft to follow the FD to hold the Reference Attitude.
The Pilot or Copilot can also clear the FD from the PFDs, turn the FD back on, and synchronize
the Reference Attitude to the current Aircraft Attitude.

The FGS also generates Autopilot (AP) Guidance commands that are used by an AP system to
move the aircraft control surfaces to follow the AP guidance. At any time, the Pilot or Copilot
can initiate control wheel steering, which instructs the AP to decouple from the Control Surface
Actuators (CSA), allowing the Pilot or Copilot to manually fly the aircraft to a new attitude that
is then followed by the AP.

C.1.1 SYSTEM CONTEXT.

The operational context of the FGS is shown in figure C-1.




                                               C-1
                                   Pilot
                  Pilot                             Command
                Commands                              Bars


                                               FD Guidance    Left
                                  AHS
                                                              PFD
                                                FGS Failed
                               Aircraft
                               Attitude

                                                    AP
                                                  Guidance
                 Pilot            FGS                                   Actuator
       FCI      Inputs                                         AP                    CSA
                                                                       Commands
                                                    AP
                                                  Guidance
                                                  Request


                                                FGS Failed
                                                              Right
                                               FD Guidance    PFD

                 Copilot                            Command
                Commands                              Bars

                                   Copilot

                           Figure C-1. Context Diagram for the FGS

The FGS interacts directly with

•      the Flight Crew Interface (FCI) that supplies the inputs provided by the Pilot and Copilot,
       such as the Display FD and Sync FD commands.

•      the Attitude Heading System (AHS) that provides the current Aircraft Attitude.

•      the AP that translates the AP Guidance commands generated by the FGS to the Actuator
       Commands. The AP also sends AP Guidance Request commands to the FGS to request
       valid AP Guidance commands.

•      the Right and Left PFDs that use the FD Guidance commands to position the command
       bars and display the FGS Failed indicator to the Pilot and Copilot.




                                              C-2
The FGS also interacts indirectly with:

•      the aircraft CSA that are moved by the Actuator Commands generated by the AP.

•      the Pilot and the Copilot, who view the command bars displayed on the FD, the FGS
       Failed status on the PFD, and provide the Pilot Inputs via the FCI.

C.1.2 SYSTEM GOALS.

The high-level goals of this system are as follows:

•      G1—Provide guidance to the Pilot and Copilot to allow them to manually fly the aircraft
       to a desired attitude

•      G2—Provide guidance to the AP to allow it to automatically fly the aircraft to hold to a
       desired attitude

•      G3—Ensure that unsafe aircraft maneuvers are not commanded by the FGS

•      G4—Ensure that aircraft maneuvers that might cause passenger discomfort are not
       commanded by the FGS

•      G5—Keep the cost of manufacturing the FGS as low as possible

•      G6—Keep the cost of operating the FGS as low as possible

C.2 OPERATION/AL CONCEPTS.

The operational concepts of the FGS are provided here. This may consist of use cases that
describe how the FGS interacts with the flight crew and other systems, such as the AP, or
whatever other information the contractor and subcontractor agree on.

C.3 EXTERN/AL ENTITIES.

The following sections describe the external entities with which the FGS directly interacts—the
FCI, the AHS, the AP, and the Left and Right PFD.

C.3.1 FLIGHT CREW INTERFACE.

The FCI provides the inputs from the Pilot and the Copilot that affect the behavior of the FGS.
The monitored variables are shown in table C-1.




                                               C-3
                               Table C-1. The FGS Monitored Variables for FCI

      Name              Type          Range            Units                 Physical Interpretation
Pilot Inputs                                                      Commands Provided by Pilot or Copilot
   Display         Boolean           False, True                  Command to display or clear the FD
   FD              Status          ●Invalid, Valid
     Sync FD       Boolean           False, True                  Command to set the Reference Attitude to
                   Status          ●Invalid, Valid                current Aircraft Attitude

● denotes initial value

No environmental assumptions are made.

C.3.2 ATTITUDE HEADING SYSTEM.

The AHS provides the current Aircraft Attitude to the FGS. The monitored variables are shown
in table C-2.

                               Table C-2. The FGS Monitored Variables for AHS

          Name             Type          Range            Units                  Physical Interpretation
    Aircraft Attitude                                                 Current Attitude of the Aircraft
      Aircraft Roll       Real       [-180.0..179.9]    Degrees       Current roll angle of the aircraft:
                                                                      • 0° indicates wings level
                                                                      • -X° indicates X° bank to the left
                                                                      • +X° indicates X° bank to the right
                          Status     ●Invalid, Valid
      Aircraft Pitch      Real       [-180.0..179.0]    Degrees       Current pitch angle of the aircraft:
                                                                      • 0° indicates level flight
                                                                      • -X° indicates X° nose up
                                                                      • +X° indicates X° nose down
                          Status     ●Invalid, Valid

● denotes initial value

The following environmental assumptions are made:

•         EA-AHS-1: The Aircraft Roll will range between -180.0° to +179.9°, inclusive.
          Rationale: The AHS will provide true roll of the aircraft, which can take on any value in
          the full range of motion of the aircraft.




                                                         C-4
•        EA-AHS-2: The Aircraft Roll will be sensed to an accuracy of ±0.1°.
         Rationale: This accuracy is needed to ensure that the displayed Aircraft Attitude moves
         smoothly on the PFD and to ensure the FGS computes the AP Guidance and FD
         Guidance commands with the necessary accuracy.

•        EA-AHS-3: The Aircraft Pitch will range between -180.0° to +179.9°, inclusive.
         Rationale: The AHS will provide true pitch of the aircraft, which can take on any value
         in the full range of motion of the aircraft.

•        EA-AHS-4: The Aircraft Pitch will be sensed to an accuracy of ±0.1°.
         Rationale: This accuracy is needed to ensure that the displayed Aircraft Attitude moves
         smoothly on the PFD and to ensure the FGS computes the AP Guidance and FD
         Guidance commands with the necessary accuracy.

C.3.3 AUTOPILOT.

The AP translates the guidance commands generated by the FGS into Actuator Commands that
will move the aircraft’s control surfaces to achieve the commanded changes about the lateral and
vertical axes. The monitored and controlled variables are shown in tables C-3 and C-4,
respectively.

                              Table C-3. The FGS Monitored Variables for AP

        Name             Type          Range           Units           Physical Interpretation
    AP Guidance         Boolean       False, True              Indication from the AP requesting
    Request                                                    the FGS resynchronize the
                                                               Reference Attitude and provide valid
                                                               guidance to the AP
                        Status      ●Invalid, Valid

    ● denotes initial value




                                                      C-5
                       Table C-4. The FGS Controlled Variables for AP

        Name          Type        Range        Units            Physical Interpretation
    AP Guidance                                         Guidance commands for AP
     Roll           Real       [-45.0..45.0] Degrees    Desired roll angle of the aircraft:
     Guidance                                           • 0° indicates wings level
                                                        • -X° indicates X° bank to the left
                                                        • +X° indicates X° bank to the right
     Pitch          Real       [-45.0..45.0] Degrees    Desired pitch angle of the aircraft:
     Guidance                                           • 0° indicates level flight
                                                        • -X° indicates X° nose up
                                                        • +X° indicates X° nose down
     Guidance       Boolean     False, True             Indicates if the Roll Guidance and
     Valid                                              Pitch Guidance are valid for use by
                                                        the AP:
                                                        • False → Invalid, do not use
                                                        • True → Valid


The following environmental assumptions are made:

•       EA-AP-1: The Roll Guidance will range between -45.0° to +45.0°, inclusive.
        Rationale: This is specified by the aircraft manufacturer as the maximum range for the
        Roll Guidance.

•       EA-AP-2: The Roll Guidance will be set in tenths of a degree.
        Rationale: This resolution is necessary to achieve smooth movement of the aircraft
        during control wheel steering.

•       EA-PFD-3: The Pitch Guidance will range between -45.0° to +45.0°, inclusive.
        Rationale: This is specified by the aircraft manufacturer as the maximum range for the
        Pitch Guidance.

•       EA-AP-4: The Pitch Guidance will be set in tenths of a degree.
        Rationale: This resolution is necessary to achieve smooth movement of the aircraft
        during control wheel steering.

C.3.4 PRIMARY FLIGHT DISPLAY.

The Left and Right PFD show the FD and the FGS Failed status. The controlled variables are
shown in table C-5.




                                              C-6
                        Table C-5. The FGS Controlled Variables for PFD

         Name         Type        Range        Units             Physical Interpretation
    FD Guidance                                         Guidance Commands for FD
      Roll          Real       [-45.0..45.0] Degrees    Desired roll angle of the aircraft:
      Guidance                                          • 0° indicates wings level
                                                        • -X° indicates X° bank to the left
                                                        • +X° indicates X° bank to the right
     Pitch          Real       [-45.0..45.0] Degrees    Desired pitch angle of the aircraft:
     Guidance                                           • 0° indicates level flight
                                                        • -X° indicates X° nose up
                                                        • +X° indicates X° nose down
     FD On          Boolean     False, True             Indication if FD is to be displayed:
                                                        • False → Do not display FD
                                                        • True → Display FD
    FGS Failed      Boolean     False, True             Indication if FGS is failed:
                                                        • False → FGS is functioning
                                                        • True → FGS is failed


The following environmental assumptions are made:

•        EA-PFD-1: The Roll Guidance will range between -45.0° to +45.0°, inclusive.
         Rationale: This is specified by the aircraft manufacturer as the maximum range for the
         Roll Guidance.

•        EA-PFD-2: The Roll Guidance will be set in tenths of a degree.
         Rationale: This resolution is necessary to achieve smooth movement of the FD during
         control wheel steering.

•        EA-PFD-3: The Pitch Guidance will range between -45.0° to +45.0°, inclusive.
         Rationale: This is specified by the aircraft manufacturer as the maximum range for the
         Pitch Guidance.

•        EA-PFD-4: The Pitch Guidance will be set in tenths of a degree.
         Rationale: This resolution is necessary to achieve smooth movement of the FD during
         control wheel steering.

C.4 FLIGHT GUIDANCE SYSTEM FUNCTIONS.

The FGS compares the measured Aircraft Attitude to a Reference Attitude and generates FD
guidance commands that are displayed as visible cues on the FD and AP Guidance commands
that are used by the AP Function.



                                               C-7
The high-level requirements for the FGS Function are as follows:

•      REQ-FGS-1: The FGS shall generate the FD Guidance commands.
       Rationale: A primary function of the FGS is to generate the FD guidance commands for
       the FCS.

•      REQ-FGS-2: The FGS shall set the Reference Attitude.
       Rationale: The FGS sets the Reference Attitude when it is requested to synchronize the
       Reference Attitude to the current attitude (either by the pilot, copilot, or AP).

•      REQ-FGS-3: The FGS shall generate the AP Guidance commands.
       Rationale: A primary function of the FGS is to generate the AP Guidance commands for
       the FCS.

•      REQ-FGS-4: The FGS Function shall set the FCS Failed status.
       Rationale: The FCS is split between the FGS and the AP. The status of the AP is
       indicated independently to the Pilot and Copilot on the PFD. As a result, the status of the
       FCS (FCS Failed) is set by the FGS.




                                              C-8
                           APPENDIX D—AUTOPILOT EXAMPLE

This appendix contains a high-level specification for a simplified Autopilot (AP). The purpose
of this example is to illustrate how a specification could be allocated to separate subsystems, as
discussed in section 2.10. It expands the AP Function of the Flight Control System (FCS)
specified in appendix B.4.2 into a separate subsystem specification that could be given to a
subcontractor. As such, it contains only the subset of the information from the FCS specification
relevant to the AP subsystem. This specification would be used as a starting point to be
completed by the FCS contractor and the AP subcontractor prior to development of the AP
system. Further functional decomposition and definition of the detailed requirements would be
needed to complete this specification.

D.1 SYSTEM OVERVIEW.

The system being specified is a simple AP. The AP accepts AP Guidance commands from the
Flight Guidance System (FGS) and generates Actuator Commands to move the aircraft control
surfaces to track the reference attitude maintained by the FGS. The Pilot or Copilot can engage
the AP any time the aircraft is in a safe attitude. Prior to engagement, the AP will request the
FGS to resynchronize the AP Guidance to the current Aircraft Attitude. While the AP is
engaged, the Pilot or Copilot can initiate control wheel steering, which will decouple the AP
from the Control Surface Actuators (CSA), allowing the Pilot or Copilot to manually fly the
aircraft to a new attitude. Upon completion of control wheel steering, the AP will recouple to
the CSA and track the new Reference Attitude. The Pilot or Copilot can request the AP to
disengage at anytime.

The current status of the AP is displayed on the Left and Right primary flight display (PFD).

D.1.1 SYSTEM CONTEXT.

The operational context of the AP is shown in figure D-1.




                                               D-1
                                  Pilot
                  Pilot                             Command
                Commands                              Bars


                                                                     Left
                                                        AHS
                                                                     PFD
                                                        Aircraft
                                                        Attitude
                                                                   AP Status
                                         AP
                                       Guidance
                 Pilot     FGS                           AP         Actuator
       FCI      Inputs                                             Commands
                                                                                    CSA
                                         AP
                                       Guidance
                                       Request
                                                                   AP Status


                           Engage AP
                                                                     Right
                                                                     PFD

                 Copilot                          Command
                Commands                            Bars

                                  Copilot
                     Figure D-1. Context Diagram for the Autopilot System
The AP interacts directly with

•      the Flight Crew Interface (FCI), which provides the Engage AP command initiated by the
       Pilot or Copilot.

•      the Attitude Heading System (AHS), which provides current attitude of the aircraft.

•      the FGS, which provides the AP Guidance commands used by the AP to generate the
       Actuator Commands. The AP also sends AP Guidance Request commands to the FGS to
       request the AP Guidance be synchronized to the current Aircraft Attitude.

•      the Right and Left PFDs, which display the AP Status.

The AP also interacts indirectly with

•      the Pilot and the Copilot, who initiate the Engage AP command and view the AP Status
       displayed on the PFD.




                                                  D-2
D.1.2 SYSTEM GOALS.

The high-level goals of this system are as follows:

•        G1—Generate the Actuator Commands to hold the aircraft to the attitude provided by the
         FGS

•        G2—Ensure unsafe aircraft maneuvers are not commanded by the AP

•        G3—Ensure aircraft maneuvers that could cause passenger discomfort are not
         commanded by the AP

•        G4—Keep the cost of manufacturing the AP as low as possible

•        G5—Keep the cost of operating the AP as low as possible

D.2. OPERATION/AL CONCEPTS.

The operational concepts of the AP are provided here. This could consist of use cases that
describe how the AP system interacts with the flight crew and other systems, such as the FGS, or
whatever other information the contractor and subcontractor agree on.

D.3 EXTERN/AL ENTITIES.

The following sections describe the external entities with which the AP directly interacts—the
FCI, AHS, FGS, the Left and Right PFD, and the CSA.

D.3.1 FLIGHT CREW INTERFACE.

The FCI provides the inputs from the Pilot and the Copilot that affect the behavior of the AP.
The monitored variables are shown in table D-1.

                              Table D-1. The AP Monitored Variables for FCI

       Name             Type         Range          Units           Physical Interpretation
    Engage AP         Boolean       False, True             Command to engage or disengage the AP
                      Status      ●Invalid, Valid

    ● denotes initial value

No environmental assumptions are made.




                                                    D-3
D.3.2 ATTITUDE HEADING SYSTEM.

The AHS provides the current Aircraft Attitude to the AP. The monitored variables are shown in
table D-2.

                            Table D-2. Autopilot Monitored Variables for AHS

           Name            Type       Range           Units              Physical Interpretation
    Aircraft Attitude                                          Current Attitude of the Aircraft
     Aircraft Roll        Real     [-180.0..179.9]   Degrees   Current roll angle of the aircraft:
                                                               • 0° indicates wings level
                                                               • -X° indicates X° bank to the left
                                                               • +X° indicates X° bank to the right
                          Status   ●Invalid, Valid
     Aircraft Pitch       Real     [-180.0..179.9]   Degrees   Current pitch angle of the aircraft:
                                                               • 0° indicates level fligh
                                                               • -X° indicates X° nose up
                                                               • +X° indicates X° nose down
                          Status   ●Invalid, Valid

● denotes initial value

The following environmental assumptions are made:

•         EA-AHS-1: The Aircraft Roll will range between -180.0° to +179.9°, inclusive.
          Rationale: The AHS will provide true roll of the aircraft, which can take on any value in
          the full range of motion of the aircraft.

•         EA-AHS-2: The aircraft roll will be sensed to an accuracy of ±0.1°.
          Rationale: This accuracy is needed to ensure that the displayed Aircraft Attitude moves
          smoothly on the PFD and to ensure the FGS computes the AP Guidance and FD
          Guidance commands with the necessary accuracy.

•         EA-AHS-3: The Aircraft Pitch will range between -180.0° to +179.9°, inclusive.
          Rationale: The AHS will provide true pitch of the aircraft, which can take on any value
          in the full range of motion of the aircraft.

•         EA-AHS-4: The Aircraft Pitch will be sensed to an accuracy of ±0.1°.
          Rationale: This accuracy is needed to ensure that displayed Aircraft Attitude moves
          smoothly on the PFD and to ensure the FGS computes the AP Guidance and FD
          Guidance commands with the necessary accuracy.




                                                     D-4
D.3.3 FLIGHT GUIDANCE SYSTEM.

The FGS provides the guidance commands that the AP uses to generate actuator commands.
The monitored and controlled variables are shown in tables D-3 and D-4, respectively.

                              Table D-3. Autopilot Monitored Variables for FGS

      Name                  Type        Range           Units               Physical Interpretation
 AP Guidance                                                     Guidance Commands for AP
  Roll Guidance           Real        [-45.0..45.0]    Degrees   Desired roll angle of the aircraft:
                                                                 • 0° indicates wings level
                                                                 • -X° indicates X° bank to the left
                                                                 • +X° indicates X° bank to the right
                          Status     ●Invalid, Valid
    Pitch                 Real        [-45.0..45.0]    Degrees   Desired pitch angle of the aircraft:
    Guidance                                                     • 0° indicates level flight
                                                                 • -X° indicates X° nose up
                                                                 • +X° indicates X° nose down
                          Status     ●Invalid, Valid
    Guidance              Boolean      False, True               Indicates if the Roll Guidance and Pitch
    Valid                                                        Guidance are valid for use by the AP:
                                                                 • False → Invalid, do not use
                                                                 • True → Valid
                          Status     ●Invalid, Valid

● denotes initial value

                              Table D-4. Autopilot Controlled Variables for FGS

     Name                  Type         Range           Units             Physical Interpretation
AP Guidance               Boolean      False, True               Request to the FGS to resynchronize
Request                                                          the Reference Attitude and provide
                                                                 valid guidance to the AP.

The following environmental assumptions are made:

•        EA-FGS-1: The Roll Guidance will range between -45.0° to +45.0°, inclusive.
         Rationale: This is specified by the aircraft manufacturer as the maximum range for the
         Roll Guidance.

•        EA-FGS-2: The Roll Guidance will be set in tenths of a degree.
         Rationale: This resolution is necessary to achieve smooth movement of the aircraft
         during control wheel steering.



                                                       D-5
•      EA-FGS-3: The Pitch Guidance will range between -45.0° to +45.0°, inclusive.
       Rationale: This is specified by the aircraft manufacturer as the maximum range for the
       Pitch Guidance.

•      EA-FGS-4: The Pitch Guidance will be set in tenths of a degree.
       Rationale: This resolution is necessary to achieve smooth movement of the aircraft
       during control wheel steering.

D.3.4 PRIMARY FLIGHT DISPLAY.

The Left and Right PFD shows the AP Status. The controlled variables are shown in table D-5.

                          Table D-5. Autopilot Controlled Variables for PFD

         Name          Type           Range     Units           Physical Interpretation
      AP Status     Enumerated        Failed,           Status of AP Function:
                                       Off,              • Failed → AP Function is failed
                                        On               • Off → AP Function is off
                                                         • On → AP Function is on
                    Latency             0.1       sec
                    Tolerance           N/A

    N/A = nonapplicable

No environmental assumptions are made.

D.3.5 CONTROL SURFACE ACTUATORS.

The CSA position the aircraft control surfaces, based on the Actuator Commands generated by
the FCS to hold the aircraft to the Reference Attitude. The controlled variables are shown in
table D-6.




                                                D-6
                          Table D-6. Autopilot Controlled Variables for CSA

     Name       Type              Range         Units              Physical Interpretation
Actuator Commands                                        Commanded Actuator Rates
 Roll         Real              [-20.0..20.0]   degree   Commanded rate of Roll Actuator:
 Actuator                                      surface   • 0 → no change of control surfaces
                                              per second • -X → left wing down
                                                         • +X → right wing down
    Pitch          Real         [-20.0..20.0]   degree   Commanded rate of Pitch Actuator:
    Actuator                                   surface   • 0 → no change of control surfaces
                                              per second • -X → nose up
                                                         • +X → nose down
    AP On          Boolean       False, True             Indication whether the AP Function is
                                                         on and the Actuator Commands will be
                                                         used

The following environmental assumptions are made:

•        EA-CSA-1: The Roll Actuator rate will range between -20.0 to +20.0° surface/second,
         inclusive.
         Rationale: This is specified by the aircraft manufacturer as the range necessary to
         adequately control the aircraft.

•        EA-CSA-2: The Roll Actuator rate will be set to a resolution of 0.1° surface/second.
         Rationale: A controllability analysis shows that a resolution of 0.1° surface/second is
         necessary to maintain control of the aircraft.

•        EA-CSA-3: The Pitch Actuator rate will range between -20.0 to +20.0° surface/second,
         inclusive.
         Rationale: This is specified by the aircraft manufacturer as the range necessary to
         adequately control the aircraft.

•        EA-CSA-4: The Pitch Actuator rate will be set to a resolution of 0.1° surface/second.
         Rationale: A controllability analysis shows that a resolution of 0.1° surface/second is
         necessary to maintain control of the aircraft.

D.4 AUTOPILOT FUNCTIONS.

The AP generates Actuator Commands from the AP Guidance commands provided by the FG
Function. The actuator commands are used by CSA to fly the aircraft to the attitude specified by
the AP Guidance commands.




                                                D-7
The high-level requirements for the AP system are as follows:

•      REQ-APS-1: The AP system shall generate the Actuator Commands.
       Rationale: The primary function of the AP is to generate the Actuator Commands for the
       FCS.

•      REQ-APS-2: The AP shall set the AP Status to indicate its status.
       Rationale: The AP is responsible for providing its current status to the FCS.

•      REQ-APS-3: The AP shall generate the AP Guidance Request.
       Rationale: The AP Guidance Request calls for the FGS to synchronize its reference
       Attitude to produce an acceptable AP Guidance command.




                                              D-8

---
source_id: faa-flight-stack-appendices-b-c-d
source_kind: human-curated-handbook-appendices
status: frozen
pdf_sha256: b4949561cb04d46f718a16e2cc1486c0bd5a26c15778e3567c464466c24731df
pdf_pages: 117-146
---

# Designer source instructions

This is not a generated domain seed. It is the verbatim, layout-preserving text
extracted from Appendices B, C, and D of the FAA Requirements Engineering
Management Handbook: Flight Control System, Flight Guidance System, and
Autopilot. Treat the handbook prose and numbered requirements as authoritative.

Create a bounded, implementation-independent System Abstract covering the
allocation chain across all three systems. Preserve normative natural-language
requirements mostly verbatim; add unique `@trace` IDs and only the type/domain
precision necessary for SysML/GUMBO and executable Rust/Verus realization.
Clearly label any required formalization choice that is not stated by the
appendices. Do not consult or infer from any prior FCS, FGS, or Autopilot model.

---
