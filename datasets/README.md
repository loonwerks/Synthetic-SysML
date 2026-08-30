# Sireum-authoritative SCP datasets

This corpus contains 48 contract-reconstruction instances published from the canonical CPS campaign. Sireum-rendered SNL publishes 145 function definitions and 2274 resolved formal clauses.

Each instance exposes only `agent/M-star.sysml` and `agent/N.md` to the agent.
Each instance contains its evaluator-owned `evaluator/oracle.sysml`.
The repository evaluator in `scripts/evaluate.sh` evaluates any instance by
directory name. Run it as `scripts/evaluate.sh <semantic-name> CANDIDATE.sysml`.

| Directory | Source run | Source model |
|---|---|---|
| `battery-evidence-and-charge-qualification-supervisor` | `cps48/runs/20260813T155231Z-drone-governor-medium-r2-a1` | `cps48/runs/20260813T155231Z-drone-governor-medium-r2-a1/model/Battery_Evidence_Charge_Qualification_Supervisor.sysml` |
| `battery-evidence-and-charging-qualification-supervisor` | `cps48/runs/20260813T155231Z-drone-governor-hard-r2-a1` | `cps48/runs/20260813T155231Z-drone-governor-hard-r2-a1/model/Drone_Battery_Charge_Qualification_Supervisor.sysml` |
| `battery-status-assessment-service-for-drone-control` | `cps48/runs/20260814T132656Z-fire-observation-sortie-small-r2-a1` | `cps48/runs/20260814T132656Z-fire-observation-sortie-small-r2-a1/model/Battery_Status_Assessment_Service.sysml` |
| `bounded-finished-product-dispatch-coordinator` | `cps48/runs/20260813T142826Z-factory-dispatch-small-r2-a1` | `cps48/runs/20260813T142826Z-factory-dispatch-small-r2-a1/model/Factory_Dispatch_Coordinator.sysml` |
| `cabin-air-care-preference-and-condition-supervisor` | `cps48/runs/20260814T132656Z-hvac-supervisor-medium-r2-a1` | `cps48/runs/20260814T132656Z-hvac-supervisor-medium-r2-a1/model/Cabin_Air_Treatment_Supervisor.sysml` |
| `cabin-air-quality-and-humidity-supervisor-hard` | `cps48/runs/20260814T132656Z-hvac-supervisor-hard-r2-a1` | `cps48/runs/20260814T132656Z-hvac-supervisor-hard-r2-a1/model/Cabin_Air_Quality_Humidity_Supervisor.sysml` |
| `cabin-air-quality-and-humidity-supervisor-small` | `cps48/runs/20260814T132656Z-hvac-supervisor-small-r2-a1` | `cps48/runs/20260814T132656Z-hvac-supervisor-small-r2-a1/model/Cabin_Air_Care_Supervisor.sysml` |
| `docked-service-access-lifecycle-supervisor` | `cps48/runs/20260814T132655Z-mining-cargo-docking-medium-r2-a1` | `cps48/runs/20260814T132655Z-mining-cargo-docking-medium-r2-a1/model/Docked_Service_Access_Lifecycle_Supervisor.sysml` |
| `docking-and-service-access-supervisor` | `cps48/runs/20260814T132655Z-mining-cargo-docking-hard-r2-a1` | `cps48/runs/20260814T132655Z-mining-cargo-docking-hard-r2-a1/model/Docking_Access_Supervisor.sysml` |
| `drone-lifecycle-governor` | `cps48/runs/20260812T160223Z-drone-governor-medium-r1-a1` | `cps48/runs/20260812T160223Z-drone-governor-medium-r1-a1/model/Drone_Lifecycle_Governor.sysml` |
| `eit-acquisition-session-coordinator` | `cps48/runs/20260813T234357Z-eit-acquisition-medium-r1-a1` | `cps48/runs/20260813T234357Z-eit-acquisition-medium-r1-a1/model/EIT_Acquisition_Session_Coordinator.sysml` |
| `eit-image-availability-and-review-support-coordinator-hard` | `cps48/runs/20260814T132656Z-eit-acquisition-hard-r2-a1` | `cps48/runs/20260814T132656Z-eit-acquisition-hard-r2-a1/model/EIT_Image_Availability_Coordinator.sysml` |
| `eit-image-availability-and-review-support-coordinator-small` | `cps48/runs/20260814T132656Z-eit-acquisition-small-r2-a1` | `cps48/runs/20260814T132656Z-eit-acquisition-small-r2-a1/model/EIT_Image_Availability_Coordinator.sysml` |
| `eit-image-review-availability-coordinator` | `cps48/runs/20260814T132656Z-eit-acquisition-medium-r2-a1` | `cps48/runs/20260814T132656Z-eit-acquisition-medium-r2-a1/model/EIT_Image_Review_Availability_Coordinator.sysml` |
| `eit-monitoring-and-acquisition-supervisor` | `cps48/runs/20260813T234357Z-eit-acquisition-hard-r1-a1` | `cps48/runs/20260813T234357Z-eit-acquisition-hard-r1-a1/model/EIT_Acquisition_Supervisor.sysml` |
| `eit-monitoring-start-and-impedance-acquisition-coordinator` | `cps48/runs/20260813T234357Z-eit-acquisition-small-r1-a1` | `cps48/runs/20260813T234357Z-eit-acquisition-small-r1-a1/model/EIT_Acquisition_Coordinator.sysml` |
| `energy-and-interface-aware-cabin-climate-supervisor` | `cps48/runs/20260813T234357Z-hvac-supervisor-medium-r1-a1` | `cps48/runs/20260813T234357Z-hvac-supervisor-medium-r1-a1/model/HVAC_Energy_Interface_Supervisor.sysml` |
| `factory-material-continuity-coordinator` | `cps48/runs/20260813T155228Z-factory-dispatch-hard-r2-a1` | `cps48/runs/20260813T155228Z-factory-dispatch-hard-r2-a1/model/Factory_Material_Continuity_Coordinator.sysml` |
| `factory-order-to-dispatch-coordination` | `cps48/runs/20260813T013430Z-factory-dispatch-hard-r1-a1` | `cps48/runs/20260813T013430Z-factory-dispatch-hard-r1-a1/model/Factory_Dispatch_Coordinator.sysml` |
| `finished-product-dispatch-coordinator` | `cps48/runs/20260813T013430Z-factory-dispatch-medium-r1-a1` | `cps48/runs/20260813T013430Z-factory-dispatch-medium-r1-a1/model/Factory_Dispatch_Coordinator.sysml` |
| `fixed-line-production-flow-supervisor` | `cps48/runs/20260813T155228Z-factory-dispatch-medium-r2-a1` | `cps48/runs/20260813T155228Z-factory-dispatch-medium-r2-a1/model/factory_flow_supervisor.sysml` |
| `forest-observation-eligibility-supervisor` | `cps48/runs/20260813T234357Z-fire-observation-sortie-small-r1-a1` | `cps48/runs/20260813T234357Z-fire-observation-sortie-small-r1-a1/model/Forest_Observation_Eligibility_Supervisor.sysml` |
| `frigate-threat-evidence-and-egress-response-supervisor` | `cps48/runs/20260813T195936Z-mining-threat-retreat-medium-r2-a1` | `cps48/runs/20260813T195936Z-mining-threat-retreat-medium-r2-a1/model/Frigate_Threat_Egress_Supervisor.sysml` |
| `frigate-threat-evidence-and-protective-departure-coordination` | `cps48/runs/20260813T195936Z-mining-threat-retreat-hard-r2-a1` | `cps48/runs/20260813T195936Z-mining-threat-retreat-hard-r2-a1/model/Frigate_Threat_Response_Coordinator.sysml` |
| `frigate-threat-response-coordination-system` | `cps48/runs/20260813T195936Z-mining-threat-retreat-small-r2-a1` | `cps48/runs/20260813T195936Z-mining-threat-retreat-small-r2-a1/model/Frigate_Threat_Response_Coordinator.sysml` |
| `logical-drone-lifecycle-and-energy-governor` | `cps48/runs/20260812T160223Z-drone-governor-hard-r1-a1` | `cps48/runs/20260812T160223Z-drone-governor-hard-r1-a1/model/Drone_Lifecycle_Energy_Governor.sysml` |
| `mining-frigate-threat-defense-and-retreat-supervisor` | `cps48/runs/20260811T213611Z-mining-threat-retreat-small-r1-a2` | `cps48/runs/20260811T213611Z-mining-threat-retreat-small-r1-a2/model/Mining_Threat_Retreat_Supervisor.sysml` |
| `mining-frigate-threat-retreat-and-service-supervision` | `cps48/runs/20260812T045125Z-mining-threat-retreat-hard-r1-a7` | `cps48/runs/20260812T045125Z-mining-threat-retreat-hard-r1-a7/model/Mining_Threat_Retreat_Supervision.sysml` |
| `mining-threat-response-and-retreat-supervisor` | `cps48/runs/20260812T003016Z-mining-threat-retreat-medium-r1-a4` | `cps48/runs/20260812T003016Z-mining-threat-retreat-medium-r1-a4/model/Mining_Threat_Retreat_Supervisor.sysml` |
| `navigation-and-obstacle-awareness-use-supervisor` | `cps48/runs/20260814T132656Z-fire-observation-sortie-medium-r2-a1` | `cps48/runs/20260814T132656Z-fire-observation-sortie-medium-r2-a1/model/Navigation_Obstacle_Awareness_Use_Supervisor.sysml` |
| `observation-acquisition-and-radio-delivery-coordinator` | `cps48/runs/20260813T234357Z-fire-observation-sortie-medium-r1-a1` | `cps48/runs/20260813T234357Z-fire-observation-sortie-medium-r1-a1/model/Observation_Acquisition_Radio_Delivery_Coordinator.sysml` |
| `observation-sortie-eligibility-supervisor` | `cps48/runs/20260813T234357Z-fire-observation-sortie-hard-r1-a1` | `cps48/runs/20260813T234357Z-fire-observation-sortie-hard-r1-a1/model/Observation_Sortie_Eligibility_Supervisor.sysml` |
| `ore-hold-mining-guard-supervisor` | `cps48/runs/20260814T132655Z-mining-cargo-docking-small-r2-a1` | `cps48/runs/20260814T132655Z-mining-cargo-docking-small-r2-a1/model/Ore_Hold_Mining_Guard_Supervisor.sysml` |
| `power-and-propulsion-availability-supervisor` | `cps48/runs/20260814T132656Z-fire-observation-sortie-hard-r2-a1` | `cps48/runs/20260814T132656Z-fire-observation-sortie-hard-r2-a1/model/Power_Propulsion_Availability_Supervisor.sysml` |
| `protected-start-and-power-enablement-supervisor` | `cps48/runs/20260813T234355Z-vehicle-mode-hard-r1-a1` | `cps48/runs/20260813T234355Z-vehicle-mode-hard-r1-a1/model/Protected_Start_Power_Supervisor.sysml` |
| `small-drone-battery-charge-qualification-supervisor` | `cps48/runs/20260813T155231Z-drone-governor-small-r2-a1` | `cps48/runs/20260813T155231Z-drone-governor-small-r2-a1/model/Drone_Battery_Charge_Supervisor.sysml` |
| `small-drone-lifecycle-governor` | `cps48/runs/20260812T160223Z-drone-governor-small-r1-a1` | `cps48/runs/20260812T160223Z-drone-governor-small-r1-a1/model/Drone_Lifecycle_Governor.sysml` |
| `small-finished-product-dispatch-coordinator` | `cps48/runs/20260813T013430Z-factory-dispatch-small-r1-a1` | `cps48/runs/20260813T013430Z-factory-dispatch-small-r1-a1/model/Factory_Dispatch_Coordinator.sysml` |
| `small-station-cargo-transfer-verification-supervisor` | `cps48/runs/20260813T234356Z-mining-cargo-docking-small-r1-a1` | `cps48/runs/20260813T234356Z-mining-cargo-docking-small-r1-a1/model/Mining_Cargo_Transfer_Supervisor.sysml` |
| `station-cargo-transfer-evidence-coordinator` | `cps48/runs/20260813T234356Z-mining-cargo-docking-hard-r1-a1` | `cps48/runs/20260813T234356Z-mining-cargo-docking-hard-r1-a1/model/Mining_Cargo_Transfer_Evidence_Coordinator.sysml` |
| `station-cargo-transfer-verification-supervisor` | `cps48/runs/20260813T234356Z-mining-cargo-docking-medium-r1-a1` | `cps48/runs/20260813T234356Z-mining-cargo-docking-medium-r1-a1/model/Station_Cargo_Transfer_Verification_Supervisor.sysml` |
| `vehicle-controller-operating-mode-and-parking-brake-coordinator` | `cps48/runs/20260814T132657Z-vehicle-mode-hard-r2-a1` | `cps48/runs/20260814T132657Z-vehicle-mode-hard-r2-a1/model/Vehicle_Controller_Operating_Mode_Coordinator.sysml` |
| `vehicle-controller-operating-mode-coordinator-medium` | `cps48/runs/20260814T132657Z-vehicle-mode-medium-r2-a1` | `cps48/runs/20260814T132657Z-vehicle-mode-medium-r2-a1/model/Vehicle_Mode_Coordinator.sysml` |
| `vehicle-controller-operating-mode-coordinator-small` | `cps48/runs/20260814T132657Z-vehicle-mode-small-r2-a1` | `cps48/runs/20260814T132657Z-vehicle-mode-small-r2-a1/model/Vehicle_Controller_Mode_Coordinator.sysml` |
| `vehicle-start-readiness-and-recovery-supervisor` | `cps48/runs/20260813T234355Z-vehicle-mode-medium-r1-a1` | `cps48/runs/20260813T234355Z-vehicle-mode-medium-r1-a1/model/Vehicle_Start_Readiness_Recovery_Supervisor.sysml` |
| `vehicle-temperature-and-health-supervisor` | `cps48/runs/20260813T234355Z-vehicle-mode-small-r1-a1` | `cps48/runs/20260813T234355Z-vehicle-mode-small-r1-a1/model/Vehicle_Temperature_Health_Supervisor.sysml` |
| `visibility-priority-whole-cabin-hvac-supervisor` | `cps48/runs/20260813T234357Z-hvac-supervisor-hard-r1-a1` | `cps48/runs/20260813T234357Z-hvac-supervisor-hard-r1-a1/model/HVAC_Visibility_Priority_Supervisor.sysml` |
| `windshield-defrost-request-supervisor` | `cps48/runs/20260813T234357Z-hvac-supervisor-small-r1-a1` | `cps48/runs/20260813T234357Z-hvac-supervisor-small-r1-a1/model/Windshield_Defrost_Request_Supervisor.sysml` |
