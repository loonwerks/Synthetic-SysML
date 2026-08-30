# Drone lifecycle Rust/Verus proof of concept

This experiment records the complete handoff:

```text
domain seed -> system abstract -> SysML/GUMBO -> HAMR Rust -> Verus
```

All five generated targets pass with 46 application obligations and zero
errors.

1. [`synthesis/seed.md`](synthesis/seed.md)
2. [`synthesis/system-abstract.md`](synthesis/system-abstract.md)
3. [`synthesis/design-selection.md`](synthesis/design-selection.md)
4. [`synthesis/model/Drone_Lifecycle_Governor.sysml`](synthesis/model/Drone_Lifecycle_Governor.sysml)
5. [`rust/contract-audit.md`](rust/contract-audit.md)
6. [`rust/model/Drone_Lifecycle_Governor.sysml`](rust/model/Drone_Lifecycle_Governor.sysml)
7. [`rust/application-report.md`](rust/application-report.md)
8. [`proof/verification.md`](proof/verification.md)

The complete generated project is [`rust/hamr/`](rust/hamr/). Static views are
under [`visualization/`](visualization/), and the accepted synthesis view is
[`synthesis/visualization/system-overview.svg`](synthesis/visualization/system-overview.svg).
