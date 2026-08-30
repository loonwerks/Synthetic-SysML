---
seed_id: 20260813T233941Z-vehicle-mode-seed-v1
version: 1
status: frozen
scope: reusable
---

## Source basis

This seed uses only the `external/sysml-v2-models` corpus at pinned commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, file `models/SE_Models/VehicleModel.sysml`. The source is a general vehicle example containing a `Vehicle`, embedded `VehicleController`, illustrative configurations, actions, and partial state usages. No other corpus example contributes evidence.

## Domain and purpose

The recognizable domain is supervision of a vehicle's operating and health context. The source-named participants are the Vehicle and its VehicleController software. A Road and vehicle-to-road boundary provide external physical context. An initiating or operating actor is represented only indirectly by start, on, off, and brake-pedal inputs; the source does not identify a driver, operator, or other command authority.

The reusable purpose is to let a Designer choose one vehicle or controller supervisory boundary involving lifecycle, health, readiness, or power-related concerns. The source's drivetrain and configuration material supplies context, not a required system decomposition.

## Available design vocabulary

All vocabulary below is optional design material, not a mandatory interface, allocation, interaction, policy, or complete feature set.

- Lifecycle vocabulary: start, on, and off signals; starting, on, and off concepts; and maintenance, degraded, and return-to-normal concepts.
- Capability vocabulary: perform self-test, apply parking brake, sense temperature, and provide power.
- Observation vocabulary: brake-pedal condition, sensed temperature, an over-temperature indication relative to a maximum-temperature concept, maintenance-time context, electrical power, and receipt of start/on/off or return-to-normal indications.
- Controlled-outcome vocabulary: fuel command, electrical-power disposition, power provision, parking-brake application, and vehicle or controller mode disposition. A Designer chooses which are controlled, observed, or outside the selected boundary.

The source also names vehicle-to-road and drivetrain concepts. They may remain external context and do not require a Designer to model torque flow or vehicle dynamics.

## Candidate system scopes

Select one coherent single-system scope; these alternatives are not components that must be combined.

- A vehicle operating-mode supervisor concerned with selected start, on, and off indications and selected readiness or power outcomes.
- A controller-mode coordinator that treats the Vehicle as its environment and chooses which source-named indications and outcomes cross the boundary.
- A temperature and health supervisor concerned with sensing, over-temperature, maintenance, degraded condition, and return-to-normal vocabulary.
- A start-readiness supervisor concerned with selected brake-pedal, self-test, and start-related vocabulary.
- A vehicle power-enablement supervisor concerned with fuel-command, electrical-power, and power-provision vocabulary while leaving drivetrain physics outside the system.

## Source limitations and claim boundary

`VehicleStates` and `ControllerStates` are empty definitions; behavior appears only in one illustrative configuration. `PerformSelfTest` and `ApplyParkingBrake` are empty action definitions, `SenseTemperature` provides only an output, and the source does not define the effects or completion meaning of these actions. The electrical-power analysis package is also empty.

The vehicle and controller views do not form a complete, consistent protocol. The source distinguishes `VehicleOffSignal` from `OffSignal`, sends `OverTemp` toward the controller without defining a controller response, and does not establish who originates the lifecycle or return-to-normal indications. Its partial state usages are examples, not evidence of complete operational sequencing, authorization, priority, fault handling, or recovery.

Any exact status set, temperature abstraction, threshold interpretation, responsibility allocation, or causal meaning must be supplied and labeled by the downstream Designer. The source does not support claims about torque-law accuracy, fuel economy, vehicle dynamics, quantitative mass configuration, reliability, road safety, certification, or production readiness. It also does not validate physical timing, performance, or safety consequences of any selected supervisory behavior.
