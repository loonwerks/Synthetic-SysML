---
seed_id: 20260813T233941Z-hvac-supervisor-seed-v1
version: 1
status: frozen
scope: reusable
---

## Source basis

This seed uses only the `external/sysml-v2-models` corpus at pinned commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, file `models/SE_Models/HVACSystemRequirements.sysml`. The file is an automotive HVAC requirement catalog. No other corpus model contributes evidence.

## Domain and purpose

The domain is cabin-environment supervision in an automobile. The source names a vehicle user who chooses temperature, fan speed, and other preferences through an interface accessible from the dashboard or central console. External context includes the cabin, windshield and windows, the vehicle electrical system that supplies power and control signals, and the engine as a possible waste-heat source.

The source-grounded purpose is to support temperature regulation, cooling, heating, defrosting, cabin-air filtration and humidity control, user access, and attention to HVAC power consumption. A Designer may choose a narrower or broader single-system boundary within that envelope.

## Available design vocabulary

All vocabulary below is optional design material, not a mandatory interface, behavior, allocation, or complete feature set.

- Lifecycle vocabulary: user setting or input, a recognized need for cooling or heating, defrost activation, regulation or air-quality control, and evaluation or testing. The source defines no lifecycle model, so a Designer may use, refine, or omit these cues.
- Capability vocabulary: regulate cabin temperature; cool; heat; defrost the windshield and windows; filter pollutants; control humidity; accept temperature, fan-speed, and preference inputs; draw electrical power and receive control signals; use engine waste heat; and support verification or user evaluation.
- Observation vocabulary: requested and actual temperature, cooling or heating temperature, defrost duration, filtration efficiency, humidity, user-interaction count, response duration, power consumption, electrical-interface status, heating efficiency, test status, and user-feedback score. The source does not establish how these observations are obtained or validated.
- Controlled-outcome vocabulary: cabin temperature moves toward a selected setting, cooling or heating is provided when needed, glazing is defrosted when activated, air is filtered and humidity maintained, preferences are accepted through an accessible interface, and power use is constrained. A downstream Designer decides which outcomes are controlled, observed, or outside the selected boundary.

## Candidate system scopes

Select one coherent single-system scope; these alternatives are not components of a mandatory combined controller.

- A cabin-temperature supervisor concerned with user settings, observed cabin temperature, and selected heating or cooling outcomes.
- A defrost supervisor concerned with activation, windshield and window defrosting, and whatever progress observation a Designer can justify.
- A cabin air-quality supervisor concerned with filtration and humidity observations and their controlled outcomes.
- A user-facing HVAC command coordinator bounded around dashboard or central-console access, temperature and fan preferences, and selected HVAC outcomes.
- An energy- and interface-aware HVAC supervisor concerned with power consumption, electrical-interface status, engine heat vocabulary, and selected climate outcomes.
- A whole-cabin HVAC supervisor spanning temperature, defrost, air quality, humidity, user access, and vehicle energy context within one explicitly chosen boundary.

## Source limitations and claim boundary

The source is a catalog of requirement definitions with quantitative placeholders, not an architecture, executable control policy, or validated specification. It defines no sensors or sensor validity, modes, arbitration, priority, command authority, fault handling, or recovery. It also does not establish component ownership, interfaces beyond broad electrical and engine references, causal interactions, or a finite abstraction.

Several prose claims and formal constraints do not align precisely. A stated response threshold, service-life and distance targets, and a noise threshold are represented formally only through unspecified symbolic bounds. “Minimize” power is represented as staying below an unspecified maximum. “Intuitive” access and user satisfaction are reduced to interaction-count or feedback-score placeholders. Pollutant removal has no pollutant observation, the engine interface is represented only by heating efficiency, and testing, glossary, and reference-document entries are presence-style placeholders. These are source limitations, not policies to complete in this seed.

No claim may be made from this seed about long-horizon reliability, subjective comfort or usability, acoustics, real HVAC thermodynamics or physical performance, exact response time, exact energy use, automotive safety, regulatory compliance, certification, or production readiness. Exact domains, interfaces, ownership, interactions, architecture, policies, priorities, state semantics, recovery protocols, contracts, and scenarios require downstream assumptions and design decisions.
