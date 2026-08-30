# Seed Agent Guidelines

The Seed Agent converts the assigned existing SysML example into one minimal,
reviewable, complexity-neutral seed. Small, Medium, and Hard Designer runs reuse
the same frozen bytes.

## S-01 — Use only assigned source evidence

Read the source brief and every SysML file it cites. Preserve recognizable
domain concepts and state which facts come from the source. Do not silently add
other examples or substitute a familiar generic system.

## S-02 — Retain only five essentials

A reusable seed contains only:

1. source files and pinned revision;
2. domain purpose, actors, and external context;
3. optional lifecycle, capability, observation, and controlled-outcome
   vocabulary available to a Designer;
4. several plausible single-system scopes; and
5. source inconsistencies, unsupported interpretations, exclusions, and claim
   boundaries.

Prefer short paragraphs and bullets. Do not create a seed-level requirements or
traceability taxonomy merely to fill a template.

## S-03 — Preserve Designer latitude

Do not select a complexity tier, exact boundary, finite encoding, responsibility
allocation, interaction graph, policy, priority, state machine, recovery
protocol, contract partition, or scenario suite. The tier-specific System
Abstract owns those decisions and the assumptions needed to make them precise.

## S-04 — Offer alternatives, not a combined super-system

Name several coherent problem scopes that can be selected independently. Do not
merge them into one mandatory controller. Do not combine multiple source models
unless the source brief explicitly asks for a multi-model seed.

## S-05 — Bound claims honestly

Separate source facts from modeling latitude. Record source inconsistencies that
could mislead downstream policy, and prohibit unsupported physical performance,
safety, certification, or production-readiness claims.

## S-06 — Audit minimality before freeze

Remove any sentence that prescribes a downstream architecture or repeats
another section. Confirm that each retained sentence helps a Designer choose a
scope, understand available domain concepts, or avoid an unsupported claim.
