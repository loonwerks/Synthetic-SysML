# GUMBO syntax profile for SCP experiments

Profile ID: `gumbo-syntax-sireum-20260630-v1`

This document is a tool-language reference, not a requirements-to-contract
strategy. It describes concrete syntax accepted by the pinned experiment
toolchain:

- Sireum `4.20260630.386eac9f`
- `hamr-sysml-parser` `4.20260626.332fb27`

The natural-language specification `N.md` determines what behavior to encode.
The SysML model determines names, ports, types, containment, and connections.
Nothing in this guide determines a requirement, threshold, predicate, case,
output value, state variable, or component allocation.

## Annex delimiters and order

Place a component contract inside the owning SysML declaration:

```sysml
language "GUMBO" /*{
  state
    saved_value: Package::Type;

  functions
    @strictpure def helper(x: Package::Type): Base_Types::Boolean :=
      <expression>;

  invariants
    inv invariant_id "optional description":
      <Boolean expression>;

  integration
    assume assumption_id "optional description":
      <Boolean expression>;
    guarantee integration_guarantee_id "optional description":
      <Boolean expression>;

  initialize
    modifies saved_value;
    guarantee initialization_id "optional description":
      <Boolean expression>;

  compute
    modifies saved_value;
    assume compute_assumption_id "optional description":
      <Boolean expression>;
    guarantee compute_guarantee_id "optional description":
      <Boolean expression>;

    compute_cases
      case case_id "optional description":
        assume <Boolean guard>;
        guarantee <Boolean obligation>;
}*/
```

Sections are optional. Preserve the relative order shown when more than one is
present. Do not emit an empty GUMBO annex: the pinned front end currently fails
before resolution on an empty component annex.

For a datatype invariant, the exact section and declaration keywords are
plural `invariants` and singular `inv`:

```sysml
part def Value :> Data {
  part field: Base_Types::Integer_32;

  language "GUMBO" /*{
    invariants
      inv value_range:
        -10 [s32] <= field & field <= 10 [s32];
  }*/
}
```

Do not substitute `invariant` for `inv`.

## Named clauses and cases

A named clause has an identifier, an optional quoted descriptor, a colon, a
Boolean expression, and a terminating semicolon:

```sysml
assume input_is_valid "optional prose":
  <Boolean expression>;

guarantee output_is_safe:
  <Boolean expression>;
```

A compute case groups one anonymous guard and one anonymous obligation:

```sysml
compute_cases
  case nominal_case:
    assume <Boolean guard>;
    guarantee <Boolean obligation>;
```

The guard may be omitted for an unguarded case. The guarantee is required.
Use machine diagnostics rather than inventing syntax when a construct is
uncertain.

## Trace annotations used by the evaluator

When `N.md` assigns a public requirement ID, attach it with a line comment in
the contiguous comment block immediately above the declaration:

```sysml
invariants
  // @trace REQ-001
  inv input_range:
    <Boolean expression>;

compute
  compute_cases
    // @trace REQ-002 REQ-003
    case combined_case:
      assume <Boolean guard>;
      guarantee <Boolean obligation>;
```

The comment must be inside the GUMBO annex and immediately precede the `inv`,
`assume`, `guarantee`, or `case`; only contiguous `//` comment lines may occur
between the annotation and declaration. A comment above `language "GUMBO"`
does not attach to a resolved clause.

Trace annotations are metadata. They do not change the contract formula.

## Names, selections, enums, and calls

- Use model identifiers exactly as declared.
- Qualify package types with `::`, such as `Package::Record_Type`.
- Select record fields and ports with `.`, such as `sample.value`.
- Use the enum spelling resolved by the model, such as
  `Mode_Type.Active` or `Package::Mode_Type.Active`.
- Invoke a declared pure GUMBO function positionally:
  `within_range(value, lower, upper)`.
- Parenthesize mixed Boolean expressions when precedence is not obvious.

## Operators

The pinned front end supports these commonly used expression forms:

```text
Boolean:       &   |   ^   and   or   xor   not
Implication:   implies
Equality:      ==   !=
Relations:     <   <=   >   >=
Arithmetic:    +   -   *   /   %
Unary:         +x   -x   ~x   not x
Conditional:   if <condition> ? <value> else <value>
```

Use the spellings already accepted by the model and verify them with `hamr
sysml tipe`. Unsupported SysML expression alternatives must not be replaced by
vacuous formulas.

## Numeric literals

Literal families are part of the type. For a `Base_Types::Integer_32`
expression, annotate every integer constant as S32, including negative values:

```sysml
0 [s32]
42 [s32]
-20 [s32]
```

The pinned front end also recognizes signed `S8/S16/S32/S64`, bounded
mathematical `Z8/Z16/Z32/Z64`, natural `N` and `N8/N16/N32/N64`, unsigned
`U1` through `U64`, floating-point `F32/F64`, and real `R` families. Select a
family from the model-declared type; do not infer one from the prose alone.

## State and pure functions

State declarations name a type but do not supply an initializer:

```sysml
state
  previous_mode: Package::Mode;
```

Function bodies are expressions:

```sysml
functions
  @strictpure def is_acceptable(x: Base_Types::Integer_32): Base_Types::Boolean :=
    0 [s32] <= x;
```

The pinned front end supports `@strictpure`, `@pure`, and `@spec` functions.
Use state or a helper function only when required by `N.md`; their presence in
this grammar reference is not a recommendation to introduce them.

## Handler syntax

Event-driven contracts may place clauses under a port handler:

```sysml
compute
  handle trigger_port:
    modifies saved_value;
    guarantee handler_obligation:
      <Boolean expression>;
```

The pinned resolver has known provenance limitations for some port-event
operations. Treat `HasEvent`, `MustSend`, `NoSend`, and related constructs as
tool-version-sensitive and accept them only after `hamr sysml tipe` succeeds.

## Completion checks for contract reconstruction

Use the native `language "GUMBO" /*{ ... }*/` form above. Comments and
SysML string attributes containing formulas are not native contracts. A model
can type-check while carrying no native contracts. Confirm every required
behavioral owner has its native annex and inspect the full type-check output,
not only the process exit code. Never treat a successful architecture-only
type-check as contract coverage. This guide supplies syntax, not requirements;
N.md remains the behavioral authority.
