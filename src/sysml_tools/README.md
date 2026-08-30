# Shared Sireum SysML tooling

`gumbo.py` is the repository-wide bridge for locating and erasing GUMBO
members. `tools/SysmlGumboSpans.java` asks Sireum's generated HAMR SysML parser
for exact `RuleTextualRepresentationContext` spans whose resolved rule is a
GUMBO library or subclause. Python applies only those certified offsets; it
does not scan owners, balance braces, index contracts with regular expressions,
or create reconstruction anchors.

The same bridge is used by dataset construction and equivalence-checker model
gates. The only subsequent presentation transform removes full-line `@trace`
and `@generated-support` comments. Contract-free models are reparsed and
type-checked with Sireum, and their resolved contract-erased AIR must match the
oracle projection.
