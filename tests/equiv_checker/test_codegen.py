from pathlib import Path
import hashlib
import json
import tempfile
import unittest

from equiv_checker.codegen import (
    CandidateInvariantRewrite,
    CommandRun,
    GeneratedRoot,
    NeutralCarrierAttestation,
    create_replay_project,
    create_shared_replay_project,
    disable_unused_container_adapters,
    merge_generated_projects,
    stage_input,
    validate_semantic_export,
)


class CodegenTest(unittest.TestCase):
    def test_unused_container_convenience_method_does_not_block_direct_contract(self):
        with tempfile.TemporaryDirectory() as temporary:
            source = Path(temporary) / "C_GumboX.scala"
            direct = (
                "@strictpure def inititialize_IEP_Post(input: Z, output: Z): B = "
                "input == output"
            )
            source.write_text(
                "package p\n"
                "import org.sireum._\n"
                "object C_GumboX {\n"
                f"  {direct}\n"
                "  @strictpure def inititialize_IEP_Post_Container(post: Post): B =\n"
                "    inititialize_IEP_Post(post.input, post.output)\n"
                "  /** The next contract marker must not be removed. */\n"
                "  @strictpure def compute_CEP_Post(input: Z, output: Z): B = "
                "input == output\n"
                "}\n",
                encoding="utf-8",
            )
            records = disable_unused_container_adapters(source)
            rendered = source.read_text(encoding="utf-8")
            self.assertEqual(
                ["inititialize_IEP_Post_Container"],
                [record.method_name for record in records],
            )
            self.assertIn(direct, rendered)
            self.assertIn("The next contract marker must not be removed", rendered)
            self.assertIn("@strictpure def compute_CEP_Post", rendered)
            self.assertIn(
                "inititialize_IEP_Post_Container(post: Post): B =\n    {\n      T\n    }",
                rendered,
            )
            self.assertNotIn("post.input", rendered)

    def test_used_container_convenience_method_is_never_removed(self):
        with tempfile.TemporaryDirectory() as temporary:
            source = Path(temporary) / "C_GumboX.scala"
            source.write_text(
                "package p\n"
                "import org.sireum._\n"
                "object C_GumboX {\n"
                "  @strictpure def inititialize_IEP_Post(input: Z): B = "
                "inititialize_IEP_Post_Container(input)\n"
                "  @strictpure def inititialize_IEP_Post_Container(post: Z): B = T\n"
                "}\n",
                encoding="utf-8",
            )
            with self.assertRaisesRegex(
                ValueError, "contract calls a container convenience method"
            ):
                disable_unused_container_adapters(source)

    def test_shared_replay_uses_one_carrier_and_two_contract_objects(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            oracle = root / "oracle"
            candidate = root / "candidate"
            oracle_data = oracle / "src/main/data/equiv_shared_0/P/D.scala"
            candidate_data = candidate / "src/main/data/equiv_candidate_0/P/D.scala"
            oracle_bridge = oracle / "src/main/bridge/equiv_shared_0/P/C_GumboX.scala"
            candidate_bridge = candidate / "src/main/bridge/equiv_candidate_0/P/C_GumboX.scala"
            oracle_data.parent.mkdir(parents=True)
            candidate_data.parent.mkdir(parents=True)
            oracle_bridge.parent.mkdir(parents=True)
            candidate_bridge.parent.mkdir(parents=True)
            oracle_data.write_text(
                """package equiv_shared_0.P
import org.sireum._
object D { @strictpure def D_Inv_D(value: D): B = value.x >= 0 }
@datatype class D(val x: Z)
""",
                encoding="utf-8",
            )
            candidate_data.write_text(
                """package equiv_candidate_0.P
import org.sireum._
object D { @strictpure def D_Inv_D(value: D): B = value.x > 0 }
@datatype class D(val x: Z)
""",
                encoding="utf-8",
            )
            oracle_bridge.write_text(
                """package equiv_shared_0.P
import org.sireum._
object C_GumboX { @strictpure def compute_CEP_Post(value: D): B = P.D.D_Inv_D(value) }
""",
                encoding="utf-8",
            )
            candidate_bridge.write_text(
                """package equiv_candidate_0.P
import org.sireum._
object C_GumboX { @strictpure def compute_CEP_Post(value: D): B = P.D.D_Inv_D(value) }
""",
                encoding="utf-8",
            )
            replay = create_shared_replay_project(
                oracle_project=oracle,
                candidate_project=candidate,
                oracle_package="equiv_shared_0",
                candidate_package="equiv_candidate_0",
                destination=root / "replay",
                required_neutral_sources=(),
                neutralizations=(),
                candidate_invariants=(
                    CandidateInvariantRewrite(
                        candidate_data,
                        "equiv_candidate_0.P.D",
                        "D_Inv_D",
                    ),
                ),
            )
            sources = list((replay.project / "src/main").rglob("*.scala"))
            rendered = "\n".join(path.read_text(encoding="utf-8") for path in sources)
            self.assertEqual(1, rendered.count("@datatype class D"))
            self.assertIn("object D_Candidate", rendered)
            self.assertIn("D_Inv_D_Candidate", rendered)
            self.assertIn("object C_Candidate_GumboX", rendered)
            self.assertIn("P.D_Candidate.D_Inv_D_Candidate(value)", rendered)
            self.assertNotIn("package equiv_candidate_0", rendered)

    def test_shared_replay_allows_a_certified_contract_absent_candidate(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            oracle = root / "oracle"
            candidate = root / "candidate"
            oracle_data = oracle / "src/main/data/equiv_shared_0/P/D.scala"
            oracle_data.parent.mkdir(parents=True)
            candidate.mkdir()
            oracle_data.write_text(
                "package equiv_shared_0.P\n@datatype class D(val x: Z)\n",
                encoding="utf-8",
            )
            replay = create_shared_replay_project(
                oracle_project=oracle,
                candidate_project=candidate,
                oracle_package="equiv_shared_0",
                candidate_package="equiv_candidate_0",
                destination=root / "replay",
                required_neutral_sources=(),
                neutralizations=(),
                candidate_invariants=(),
            )
            self.assertTrue(
                (replay.project / "src/main/data/equiv_shared_0/P/D.scala").is_file()
            )
            self.assertFalse(
                any(replay.project.rglob("*_Candidate_GumboX.scala"))
            )

    def test_shared_replay_keeps_oracle_and_candidate_helpers_separate(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            oracle = root / "oracle"
            candidate = root / "candidate"
            oracle_helper = oracle / "src/main/component/equiv_shared_0/P/C.scala"
            candidate_helper = candidate / "src/main/component/equiv_candidate_0/P/C.scala"
            oracle_bridge = oracle / "src/main/bridge/equiv_shared_0/P/C_GumboX.scala"
            candidate_bridge = candidate / "src/main/bridge/equiv_candidate_0/P/C_GumboX.scala"
            for path in (oracle_helper, candidate_helper, oracle_bridge, candidate_bridge):
                path.parent.mkdir(parents=True, exist_ok=True)
            oracle_helper.write_text(
                "package equiv_shared_0.P\nobject C { @strictpure def ok(x: Z): B = x >= 0 }\n",
                encoding="utf-8",
            )
            candidate_helper.write_text(
                "package equiv_candidate_0.P\nobject C { @strictpure def ok(x: Z): B = x > 0 }\n",
                encoding="utf-8",
            )
            oracle_bridge.write_text(
                "package equiv_shared_0.P\nobject C_GumboX { @strictpure def compute_CEP_Post(x: Z): B = C.ok(x) }\n",
                encoding="utf-8",
            )
            candidate_bridge.write_text(
                "package equiv_candidate_0.P\nobject C_GumboX { @strictpure def compute_CEP_Post(x: Z): B = C.ok(x) }\n",
                encoding="utf-8",
            )
            replay = create_shared_replay_project(
                oracle_project=oracle,
                candidate_project=candidate,
                oracle_package="equiv_shared_0",
                candidate_package="equiv_candidate_0",
                destination=root / "replay",
                required_neutral_sources=(),
                neutralizations=(),
                candidate_invariants=(),
            )
            rendered = "\n".join(
                path.read_text(encoding="utf-8")
                for path in (replay.project / "src/main").rglob("*.scala")
            )
            self.assertIn("object C {", rendered)
            self.assertIn("object C_Candidate {", rendered)
            self.assertIn("C.ok(x)", rendered)
            self.assertIn("C_Candidate.ok(x)", rendered)
            self.assertNotIn("package equiv_candidate_0", rendered)

    def test_stage_input_does_not_copy_generated_cache(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            source = root / "source"
            source.mkdir()
            (source / "M.sysml").write_text("package M {}\n", encoding="utf-8")
            (source / ".slang").mkdir()
            (source / ".slang" / "generated.json").write_text("{}", encoding="utf-8")
            staged, model = stage_input(source, root / "staged")
            self.assertTrue(model.is_file())
            self.assertFalse((staged / ".slang").exists())

    def test_merge_rejects_different_common_runtime(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            oracle = root / "oracle" / "src" / "main" / "art"
            candidate = root / "candidate" / "src" / "main" / "art"
            oracle.mkdir(parents=True)
            candidate.mkdir(parents=True)
            (oracle / "Runtime.scala").write_text("oracle", encoding="utf-8")
            (candidate / "Runtime.scala").write_text("candidate", encoding="utf-8")
            with self.assertRaisesRegex(ValueError, "common sources differ"):
                merge_generated_projects(root / "oracle", root / "candidate")

    def _semantic_export(self, root: Path) -> GeneratedRoot:
        package = "equiv_oracle_0"
        resources = {
            f"src/main/bridge/{package}/Owner_GumboX.scala": (
                "gumbox", True, "object Owner_GumboX {}\n"
            ),
            f"src/main/data/{package}/Owner_Containers.scala": (
                "container", True, "object Owner_Containers {}\n"
            ),
            "src/main/art/art/DataContent.scala": (
                "art-data-content", False, "package art\n@sig trait DataContent\n"
            ),
            "bin/project.cmd": ("project", False, "project\n"),
            "versions.properties": (
                "project-metadata", True, "org.sireum.version.sireum=master-SNAPSHOT\n"
            ),
        }
        manifest_resources = []
        for relative, (role, native, content) in resources.items():
            target = root / relative
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_text(content, encoding="utf-8")
            manifest_resources.append(
                {
                    "path": relative,
                    "role": role,
                    "sha256": hashlib.sha256(target.read_bytes()).hexdigest(),
                    "native_resource": native,
                }
            )
        manifest = {
            "schema": "equiv-checker-gumbo-semantic-export",
            "version": 1,
            "model": "/tmp/Model.sysml",
            "root": "Example::Root",
            "package": package,
            "elapsed_seconds": 0.5,
            "resources": manifest_resources,
            "rejected_resource_counts": {"architecture": 2},
        }
        (root / "semantic-export.json").write_text(
            json.dumps(manifest), encoding="utf-8"
        )
        return GeneratedRoot(
            root="Example::Root",
            package_name=package,
            project=root,
            manifest=root / "semantic-export.json",
            run=CommandRun(("sireum",), "PASSED", 0, ""),
        )

    def test_semantic_export_manifest_is_a_hash_bound_allowlist(self):
        with tempfile.TemporaryDirectory() as temporary:
            generated = self._semantic_export(Path(temporary))
            manifest = validate_semantic_export(generated)
            self.assertEqual(5, len(manifest["resources"]))
            gumbox = generated.project / (
                "src/main/bridge/equiv_oracle_0/Owner_GumboX.scala"
            )
            gumbox.write_text("tampered\n", encoding="utf-8")
            with self.assertRaisesRegex(ValueError, "hash mismatch"):
                validate_semantic_export(generated)

    def test_semantic_export_rejects_unlisted_or_disallowed_resources(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            generated = self._semantic_export(root)
            extra = root / "src/main/component/Architecture.scala"
            extra.parent.mkdir(parents=True)
            extra.write_text("architecture\n", encoding="utf-8")
            with self.assertRaisesRegex(ValueError, "manifest/file mismatch"):
                validate_semantic_export(generated)

            extra.unlink()
            manifest = json.loads(generated.manifest.read_text(encoding="utf-8"))
            manifest["resources"][0]["role"] = "architecture"
            generated.manifest.write_text(json.dumps(manifest), encoding="utf-8")
            with self.assertRaisesRegex(ValueError, "disallowed semantic resource role"):
                validate_semantic_export(generated)

    def test_semantic_export_rejects_symlinks(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            generated = self._semantic_export(root)
            (root / "src/main/data/equiv_oracle_0/linked.scala").symlink_to(
                root / "src/main/data/equiv_oracle_0/Owner_Containers.scala"
            )
            with self.assertRaisesRegex(ValueError, "contains a symlink"):
                validate_semantic_export(generated)

    def test_semantic_export_rejects_path_escape_and_allows_datatype_only_root(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            generated = self._semantic_export(root)
            manifest = json.loads(generated.manifest.read_text(encoding="utf-8"))
            manifest["resources"][0]["path"] = "../leak.scala"
            generated.manifest.write_text(json.dumps(manifest), encoding="utf-8")
            with self.assertRaisesRegex(ValueError, "unsafe or duplicate"):
                validate_semantic_export(generated)

        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            generated = self._semantic_export(root)
            manifest = json.loads(generated.manifest.read_text(encoding="utf-8"))
            gumbox = next(
                item for item in manifest["resources"] if item["role"] == "gumbox"
            )
            (root / gumbox["path"]).unlink()
            manifest["resources"].remove(gumbox)
            generated.manifest.write_text(json.dumps(manifest), encoding="utf-8")
            validated = validate_semantic_export(generated)
            self.assertFalse(
                any(item["role"] == "gumbox" for item in validated["resources"])
            )

    def test_replay_project_is_isolated_and_uses_configured_bridge_root(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            oracle = root / "oracle"
            candidate = root / "candidate"
            for project, package in ((oracle, "o"), (candidate, "c")):
                (project / "src/main" / package).mkdir(parents=True)
                (project / "src/main" / package / "Generated.scala").write_text(
                    f"package {package}\n", encoding="utf-8"
                )
                (project / "bin").mkdir()
                (project / "bin/project.cmd").write_text("project", encoding="utf-8")
            proof = root / "Proof.scala"
            proof.write_text("package proof\n", encoding="utf-8")
            replay = create_replay_project(
                oracle_project=oracle,
                candidate_project=candidate,
                destination=root / "replay",
                required_neutral_sources=(),
                neutralizations=(),
                proof_sources=(proof,),
            )
            self.assertTrue((replay.project / "src/main/c/Generated.scala").is_file())
            self.assertIn("src/main/bridge/equiv_checker/proofs", str(replay.proof_sources[0]))

    def test_required_neutral_carrier_cannot_be_omitted_or_hash_swapped(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            oracle = root / "oracle"
            candidate = root / "candidate"
            original = oracle / "src/main/data/D.scala"
            neutral = root / "neutral.scala"
            original.parent.mkdir(parents=True)
            original.write_text("original invariant", encoding="utf-8")
            neutral.write_text("neutral carrier", encoding="utf-8")
            (candidate / "src/main/data").mkdir(parents=True)
            (candidate / "src/main/data/C.scala").write_text("candidate", encoding="utf-8")
            with self.assertRaisesRegex(ValueError, "neutralization is missing"):
                create_replay_project(
                    oracle_project=oracle,
                    candidate_project=candidate,
                    destination=root / "missing",
                    required_neutral_sources=(original,),
                    neutralizations=(),
                )

            attestation = NeutralCarrierAttestation(
                side="oracle",
                generated_source=original,
                neutral_source=neutral,
                source_sha256=hashlib.sha256(original.read_bytes()).hexdigest(),
                neutral_sha256="0" * 64,
                structural_verified=True,
                preserved_predicate_sha256=(("D_Inv_D", "1" * 64),),
            )
            with self.assertRaisesRegex(ValueError, "not declared as required"):
                create_replay_project(
                    oracle_project=oracle,
                    candidate_project=candidate,
                    destination=root / "extra",
                    required_neutral_sources=(),
                    neutralizations=(attestation,),
                )
            with self.assertRaisesRegex(ValueError, "hash does not match attestation"):
                create_replay_project(
                    oracle_project=oracle,
                    candidate_project=candidate,
                    destination=root / "swapped",
                    required_neutral_sources=(original,),
                    neutralizations=(attestation,),
                )
            valid = NeutralCarrierAttestation(
                side="oracle",
                generated_source=original,
                neutral_source=neutral,
                source_sha256=hashlib.sha256(original.read_bytes()).hexdigest(),
                neutral_sha256=hashlib.sha256(neutral.read_bytes()).hexdigest(),
                structural_verified=True,
                preserved_predicate_sha256=(("D_Inv_D", "1" * 64),),
            )
            replay = create_replay_project(
                oracle_project=oracle,
                candidate_project=candidate,
                destination=root / "verified",
                required_neutral_sources=(original,),
                neutralizations=(valid,),
            )
            self.assertEqual(1, len(replay.neutralization_records))
            replacement = replay.neutralization_records[0]
            self.assertEqual(replacement.neutral_sha256, replacement.staged_sha256)
            self.assertEqual(neutral.read_bytes(), replacement.staged_source.read_bytes())


if __name__ == "__main__":
    unittest.main()
