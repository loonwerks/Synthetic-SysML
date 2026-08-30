# Drone logical-model source brief

Generate one reusable, complexity-neutral seed from the pinned GfSE corpus commit
`ebbb0c39f4813b059e0bf14270ec58618aa012ca`, using only
`models/SE_Models/DroneModelLogical.sysml`.

Preserve the source-grounded off/standby/charging/ready/flying lifecycle;
battery-capacity indication and low-battery notification; charger, power,
flight-control, navigation, communication, sensing, and landing-gear
capabilities and its example product configurations.

Record the embedded configuration inconsistency: it selects a six-engine count
and body, a four-engine flight controller, and four explicit engine connections.
Engine count must not become a synthesized requirement or policy premise.

The seed must stay minimal: source basis, domain and purpose, available design
vocabulary, several alternative single-system scopes, and source limitations or
claim boundaries. It must not choose a complexity tier, exact finite domains,
responsibility decomposition, interactions, priority, state, recovery, contracts,
or scenarios. Treat launch as entering flight and stop-flight as leaving flight
only when explicitly declared downstream. Do not claim corpus-grounded
return-to-home or landing control. Exclude flight dynamics, endurance, physical
battery behavior, real timing, and safety claims.
