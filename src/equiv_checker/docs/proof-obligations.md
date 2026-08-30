# GUMBO contract-equivalence proof obligations

This note defines the eight verification conditions (VCs) used to compare one
resolved GUMBO contract unit from an oracle model with the corresponding unit
from a candidate model. A unit is an owner/phase pair, such as a datatype
invariant, a component initialization contract, or a component compute
contract. GumboX first combines all clauses belonging to that unit; clause
names and clause-by-clause matching do not determine equivalence.

## Notation

For a single unit, write:

```text
Oracle:    (A*, G*)
Candidate: (A,  G)
```

`A*` and `A` are the oracle and candidate assumptions over their respective
input or pre-state values. `G*` and `G` are their composite guarantees over
input/pre-state and output/post-state values. A missing assumption is `true`.

The contract-erased model gate first proves that both inputs have the same
resolved SysML model. The checker then generates one canonical datatype
namespace from that fixed model and compiles both native GumboX contract sets
against those shared carriers. Consequently, both sides quantify over the same
input `x` and output `y`; no cross-namespace value relation is required.

## Four bidirectional-refinement VCs

The first direction asks whether the candidate refines the oracle:

```text
VC 1 — Candidate accepts every oracle-permitted environment

For all shared-model inputs x:
  A*(x) implies A(x)

Compact form:
  A* -> A
```

```text
VC 2 — Candidate behavior satisfies the oracle promise

For all shared-model inputs x and outputs y:
  (A*(x) and G(x, y)) implies G*(x, y)

Compact form:
  A* and G -> G*
```

The reverse direction asks whether the oracle refines the candidate:

```text
VC 3 — Oracle accepts every candidate-permitted environment

For all shared-model inputs x:
  A(x) implies A*(x)

Compact form:
  A -> A*
```

```text
VC 4 — Oracle behavior satisfies the candidate promise

For all shared-model inputs x and outputs y:
  (A(x) and G*(x, y)) implies G(x, y)

Compact form:
  A and G* -> G
```

VCs 1 and 2 establish candidate-to-oracle refinement. VCs 3 and 4 establish
oracle-to-candidate refinement. When all four hold, the contracts are mutually
refining, subject to the health conditions below.

## Four health VCs

The remaining checks prevent a formally valid implication from being accepted
only because an assumption or guarantee is empty.

```text
VC 5 — Oracle assumption satisfiable

There exists a shared-model input x such that:
  A*(x)
```

```text
VC 6 — Oracle guarantee pointwise realizable

For every shared-model input x:
  A*(x) implies that there exists an output y such that G*(x, y)
```

```text
VC 7 — Candidate assumption satisfiable

There exists a shared-model input x such that:
  A(x)
```

```text
VC 8 — Candidate guarantee pointwise realizable

For every shared-model input x:
  A(x) implies that there exists an output y such that G(x, y)
```

Pointwise realizability is stronger than merely finding one satisfying
input/output pair: every permitted input must admit at least one output that
meets the guarantee. The current checker discharges this obligation by
enumerating supported finite output domains. If it cannot soundly construct
that domain, it reports the health check as unsupported rather than silently
claiming realizability.

## How to read the result

```text
VCs 1–4 valid and VCs 5–8 healthy
  => the unit is equivalent.

VCs 1–2 valid but VCs 3–4 not both valid
  => the candidate refines (is stronger than) the oracle.

VCs 3–4 valid but VCs 1–2 not both valid
  => the candidate is weaker than the oracle.

Neither refinement direction valid
  => the contracts are incomparable.

Unsupported health reasoning, timeout, or tool failure
  => inconclusive or error, never equivalent by default.
```

A failed validity implication is classified semantically only after the
checker verifies that its negation is satisfiable. This distinguishes a real
counterexample from an unsupported proof or tool failure.

## Special cases

For a datatype invariant, there is no separate environmental assumption, so
`A* = A = true`; the meaningful refinement checks are implication between the
two invariant predicates. For a contract with no explicit compute assumption,
the same simplification occurs. A unit still receives all four health checks so
that equivalence cannot be obtained from an empty contract domain.

Across a complete model comparison, these eight VCs are generated independently
for every matched contract-bearing owner/phase unit. The overall result is
`EQUIVALENT` only when every required unit comparison is equivalent and model
and semantic-coverage gates have also passed.
