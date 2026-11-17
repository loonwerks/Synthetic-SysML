- Run the following verification steps in order. 

Step 1- Validate the untouched semantic model and prepare a fresh executable projection:

    ./tools/prepare_executable_candidate.sh M-star.sysml executable

Expected behavior:

- The untouched `M-star.sysml` passes model-level Logika.
- A non-normative periodic projection is generated under `executable/`.
- HAMR JVM/Slang artifacts are generated under `executable/hamr/slang`.
- The command prints the generated application allowlist and exact next command.

Step 2- Implement only generated application components under the printed application root.
Do not edit the semantic candidate, staged projection, generated bridge/API/data/runtime/project
files, or validation manifests.

Step 3- Verify every generated component entrypoint:

    ./executable/run-logika.sh ./executable/hamr/slang ./executable/proof

The semantic candidate remains `M-star.sysml`; never substitute the executable projection for
hidden semantic scoring.

- VERY IMPORTANT: After applying a step, if it fails or produces any error messages, explain the errors, suggest a repair plan, and wait for my approval before continuing.
 
- Also, if approved by user, if it Fails → For this test plan, keep the application logic in slang and the SysML v2 specification unchanged. Modify only the GUMBO contracts (following Gumbo_FSE_agent_Plan.md), then return to Step 1 of this plan above, (i.e. rerun sireum_verification_plan.md

- If it succeeds and there are more steps, move to the next step. If the final step succeeds, report the verification status from Logika and ask me what to do next.

-----------------------------------------------------------------------
Notes & Guardrails
-----------------------------------------------------------------------
- Do NOT edit HAMR-generated contract blocks
- Place all application logic in developer regions
- Regeneration relies on delimiters to safely update contracts

