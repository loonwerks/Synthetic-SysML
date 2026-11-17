Reconstruct the GUMBO contracts described by N.md in M-star.sysml.

Read GUMBO_SYNTAX.md before editing. It is the syntax reference for the pinned
Sireum toolchain and supplies no task-specific requirements. Encode contracts
as native GUMBO annexes, not comments or string attributes.

N.md is the requirements authority; M-star.sysml is the architectural authority.
Preserve packages, types, ports, instances, connections, containment, and root
names. Add only the GUMBO definitions, state, functions, assumptions, guarantees,
and cases needed to express the requirements. Preserve the source numeric types.
Do not replace requirements with weaker claims or strengthen environmental
assumptions to make guarantees easier. Do not introduce vacuous assumptions.

Work only with the supplied inputs and SysML/AADL library. Do not search for
reference models, benchmark answers, other candidates, or external requirements.
You may use Sireum to parse/type-check your model and repair diagnostics:

  sireum hamr sysml tipe -s .:$SYSML_AADL_LIBRARIES M-star.sysml

This task is contract reconstruction only: do not implement application code,
generate HAMR projects, launch other agents, or alter N.md. Finish with the
complete reconstructed model saved as M-star.sysml. Do not ask for clarification.
No reference-contract or candidate-consensus feedback is available.

Before finishing, confirm native GUMBO annexes are present for all required
behavioral owners and inspect the complete type-check diagnostics. A successful
architecture type-check alone does not establish that contracts were recognized.
