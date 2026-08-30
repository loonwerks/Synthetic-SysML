# Vehicle start-readiness Rust/Verus run

This run uses the accepted
[`vehicle-start-readiness-and-recovery-supervisor`](../../../datasets/vehicle-start-readiness-and-recovery-supervisor/)
dataset and projects its eight behavior owners to HAMR Microkit Rust. The final
proof sweep reports 80 owner obligations and zero errors.

- Dataset oracle: [`../../../datasets/vehicle-start-readiness-and-recovery-supervisor/evaluator/oracle.sysml`](../../../datasets/vehicle-start-readiness-and-recovery-supervisor/evaluator/oracle.sysml)
- Rust deployment model: [`rust/model/oracle_rust.sysml`](rust/model/oracle_rust.sysml)
- Complete HAMR output: [`rust/hamr/`](rust/hamr/)
- First and final proof sweeps: [`rust/proof/`](rust/proof/)

The generated tree includes both of its original HAMR/Microkit structures and
has not been flattened or filtered.
