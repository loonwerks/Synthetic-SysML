# Code-generation repair trail

All repairs were made in `rust/model/flight_stack_rust.sysml`; no generated bridge or specification file was edited.

1. Direct Thread children of System were rejected: `Thread ... is not a valid subcomponent of System FlightControlSystem_Instance`. Added one deployment-only Process wrapper per behavior owner.
2. System-name discovery required a curated source path containing the projection and both local library sets. Retained it at `rust/proof/codegen-sourcepath/` as symlinks to workspace files.
3. Microkit required one bound processor: `Model must contain exactly one actual bound processor, found 0`. Added one processor and eight process bindings.
4. Unqualified `Actual_Processor_Binding` was not lowered by the translator. Fully qualifying it as `Deployment_Properties::Actual_Processor_Binding` retained the same binding semantics and enabled lowering.
5. The processor required `Clock_Period` and `Frame_Period`. Added 1 ms and 1000 ms as deployment-only scheduler metadata, explicitly outside FORM-STEP-01 timing claims.
6. GumboX Rust asserted on implicit Sporadic dispatch: `Need to handle sporadic threads: FlightStack::CrewCommandQualifier`. Added uniform Periodic/100 ms deployment metadata to the eight owner threads; this is not a source latency or control-law timing claim.
7. Microkit rejected domain 1: `Domain '1' is reserved`. Shifted the eight deployment domains to 2 through 9 and set `Max_Domain` to 9.
8. Final projection typecheck and Microkit Rust/Verus code generation both exited 0.
