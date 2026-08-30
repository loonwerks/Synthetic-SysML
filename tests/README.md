# Tests and regression fixtures

The package-oriented test directories mirror the active code under `src/`.
Run the Python suites from the repository root with:

```bash
for suite in equiv_checker publisher snl_parser synthesizer; do
  PYTHONPATH=src python3 -m unittest discover -s "tests/$suite" -v
done
```

`regressions/logika-symbolic-branches/` is a self-contained Sireum/Logika
reproducer containing four minimized symbolic-branch failures observed during
the equivalence-checking campaign. It is retained as toolchain regression
evidence and is not part of Python unit-test discovery.
