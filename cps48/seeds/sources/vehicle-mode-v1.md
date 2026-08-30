# Vehicle operating-mode source brief

Generate one minimal, complexity-neutral reusable seed from pinned corpus
commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, using only
`models/SE_Models/VehicleModel.sysml`.

Preserve the recognizable Vehicle and VehicleController context; start/on/off
and over-temperature/return-to-normal signals; self-test, parking-brake,
temperature-sensing, and power-provision actions; and fuel-command and
electrical-power vocabulary. Offer alternative coherent supervisory scopes
without selecting one.

Record that the vehicle/controller state definitions and several actions are
empty or incomplete, and that the source does not define operational sequencing,
authorization, priorities, fault handling, or recovery. Those decisions and any
finite status or temperature abstraction belong to the downstream Designer.
Exclude torque-law accuracy, fuel economy, vehicle dynamics, quantitative mass
configuration, reliability, road safety, and certification claims.
