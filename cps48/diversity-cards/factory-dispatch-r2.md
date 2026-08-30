# Factory domain — replicate 2 diversity card

The accepted replicate-1 systems coordinate finished-product/order-to-dispatch
work, and the accepted replicate-2 Small system uses a stateful request registry
plus dispatch arbiter to release and retry finished-product shipments.

Replicate-2 Medium and Hard must not synthesize another finished-product
dispatch coordinator, order-to-dispatch orchestrator, shipment registry, or a
renamed/elaborated version of those systems. Select a different primary
controlled purpose grounded by the seed: procurement/material-availability
coordination, production scheduling/flow coordination, or commercial
inquiry/quotation response coordination. Dispatch may appear only as external
context or a downstream boundary event, not as the organizing state machine or
principal controlled action.

Explain why the selected system is not an extension or repartitioning of the
dispatch baselines and identify at least two genuine differences among boundary,
state ownership, interaction topology, priority policy, and recovery policy.
