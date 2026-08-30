---
seed_id: 20260813T004233Z-factory-dispatch-seed-v1
version: 1
status: frozen
scope: reusable
---

## Source basis

This seed is derived only from the `external/sysml-v2-models` corpus at pinned commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, file `models/SE_Models/Fischertechnik.sysml`. Source facts below describe concepts present in that file; they do not certify that its connections are consistent or executable.

## Domain and purpose

The source depicts a factory context with a Customer, a Manufacturer, and a Supplier. The Manufacturer contains sales, procurement, production scheduling, production, storage, and dispatch capabilities. The recognizable domain purpose is to coordinate commercial demand, acquisition and storage of material, production of a product on an angle-production line, and shipment-related communication. The Customer and Supplier form the external business context; the source does not establish real-world organizational responsibility beyond the names and structure shown.

## Available design vocabulary

All vocabulary in this section is optional design material, not a required interface, allocation, interaction, or behavior.

- Lifecycle vocabulary available from the source includes inquiry, order quotation, order confirmation, sales order, material order, product order, purchase order, material receipt or provision, product production, shipment, and shipping confirmation.
- Capability vocabulary includes sales, procurement, production scheduling, production control, storage, dispatch, and the source's structural production steps of heating, bending, cutting, drilling, grinding, and polishing.
- Observation vocabulary may be drawn from order identifier and amount, product identifier, material identifier, inventory, and process descriptors such as temperature, duration, angle, length, hole location, and grain size. The source does not make all of these values well typed or operationally observable.
- Controlled-outcome vocabulary may be drawn from quotation or confirmation issuance, order creation or forwarding, material or product availability, production release or completion, shipment release, and shipping confirmation. Whether any outcome is controlled, merely observed, or external is a downstream decision.

Designers may introduce queue or capacity bands, availability or readiness predicates, priorities, faults, and recovery concepts when defining a selected system, but none is asserted by the source.

## Candidate system scopes

Choose one coherent single-system boundary rather than treating these alternatives as a combined controller. Examples include:

- a customer-order intake and commercial-response coordinator around inquiry, quotation, confirmation, and sales-order vocabulary;
- a procurement and material-availability coordinator between Manufacturer demand, Storage, and the external Supplier;
- a production-scheduling and production-release coordinator for translating accepted demand into product work;
- a fixed-line production-flow supervisor concerned with progress through the named angle-production steps;
- a storage-to-production material handoff supervisor;
- a finished-product dispatch coordinator covering product availability, shipment, and shipping-confirmation vocabulary;
- a Manufacturer-level order-to-dispatch coordinator, if a Designer explicitly chooses that broader single-system boundary and supplies the missing semantics.

These alternatives permit different-sized downstream systems without committing this seed to a tier, architecture, policy, or executable profile.

## Source limitations and claim boundary

The source comments that `String` could not be resolved, and several simple attributes are untyped; other types and units are not sufficient to infer validated finite domains or physical semantics. Some connections have apparent direction or port-type mismatches. In particular, procurement emits through a material-order port while the Supplier expects a purchase-order port, and purchase-order connections appear duplicated in opposite textual directions. Other connection statements also appear reversed relative to their declared input/output ends.

Shipping-confirmation ownership is ambiguous because both Sales and Dispatch expose confirmation outputs toward the Customer while Sales also declares an unconnected confirmation input. Storage exposes inventory, but that inventory is disconnected and has no source-defined consumer. Several boundary or internal ports likewise do not establish an end-to-end behavior.

The production line fixes a structural sequence from heating through polishing. That structure is not evidence of dynamic routing, dispatch selection, alternate paths, scheduling policy, or exception handling. The source also does not justify availability/readiness rules, priorities, queue or capacity semantics, faults, or recovery behavior.

No design based on this seed may claim source support for throughput, physical process quality, delivery performance, industrial safety, production readiness, certification, or executable behavior. Any causal, timing, quantitative, safety, or performance interpretation beyond the named structural vocabulary must be introduced and labeled downstream as an assumption.
