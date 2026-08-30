import assert from "node:assert/strict";
import path from "node:path";
import test from "node:test";

import {
  createExportMetadata,
  defaultMetadataPath,
  diagramHealthState,
  exportSessionState,
  resolveMetadataPath,
  serializeExportMetadata,
  traceabilityState,
} from "../src/export-metadata.js";

const artifact = new TextEncoder().encode("<svg/>");

test("builds a deterministic export sidecar with an absolute artifact identity", () => {
  const first = createExportMetadata({
    artifactPath: "artifacts/isolette.svg",
    format: "svg",
    bytes: artifact,
    requestedView: "faa-a1",
    requestedRoot: "def:Isolette::Root",
    session: {
      root: "/models/isolette",
      libraryRoots: ["/models/libraries"],
      revision: 17,
      parseStatus: "valid",
      validation: { status: "valid", revision: 17 },
    },
    diagramHealth: {
      overlapCount: 0,
      nodeCount: 9,
      fidelity: {
        state: "validated",
        label: "Validated by Sireum",
        summary: "Supported-subset validation succeeded.",
        scope: "aadl-oriented-subset",
      },
    },
    traceability: {
      available: true,
      relativePath: "run/system-abstract.md",
      anchorCount: 4,
      taggedElementCount: 3,
      traceAssociationCount: 5,
      referencedTraceIds: ["PART-01"],
      unresolvedTraceIds: [],
      duplicateAnchorIds: [],
    },
  });
  const second = createExportMetadata({
    artifactPath: "artifacts/isolette.svg",
    format: "svg",
    bytes: artifact,
    requestedView: "faa-a1",
    requestedRoot: "def:Isolette::Root",
    session: {
      root: "/models/isolette",
      libraryRoots: ["/models/libraries"],
      revision: 17,
      parseStatus: "valid",
      validation: { revision: 17, status: "valid" },
    },
    diagramHealth: {
      fidelity: {
        scope: "aadl-oriented-subset",
        summary: "Supported-subset validation succeeded.",
        label: "Validated by Sireum",
        state: "validated",
      },
      nodeCount: 9,
      overlapCount: 0,
    },
    traceability: {
      available: true,
      relativePath: "run/system-abstract.md",
      anchorCount: 4,
      taggedElementCount: 3,
      traceAssociationCount: 5,
      referencedTraceIds: ["PART-01"],
      unresolvedTraceIds: [],
      duplicateAnchorIds: [],
    },
  });

  assert.equal(first.schemaVersion, 1);
  assert.equal(path.isAbsolute(first.artifact.path), true);
  assert.equal(first.artifact.format, "svg");
  assert.equal(first.artifact.bytes, 6);
  assert.equal(
    first.artifact.sha256,
    "d4dc56669143034f31aa309635d4113d9ad76a02b1739da22c965ed2049be9e6",
  );
  assert.deepEqual(first.request, { view: "faa-a1", root: "def:Isolette::Root" });
  assert.equal(serializeExportMetadata(first), serializeExportMetadata(second));
  assert.equal(serializeExportMetadata(first).endsWith("\n"), true);
});

test("defaults the metadata path to the absolute artifact path plus .json", () => {
  const expectedArtifact = path.resolve("output/model.png");
  assert.equal(defaultMetadataPath("output/model.png"), `${expectedArtifact}.json`);
  assert.equal(
    resolveMetadataPath("output/model.png", "metadata/model.json", false),
    path.resolve("metadata/model.json"),
  );
  assert.equal(resolveMetadataPath("output/model.png", "ignored.json", true), null);
  assert.equal(resolveMetadataPath("output/model.png", undefined, false, "png"), null);
  assert.throws(
    () => resolveMetadataPath("output/model.png", "output/model.png", false),
    /must not overwrite/u,
  );
});

test("validates and narrows agent API session and health responses without a server", () => {
  const validation = { status: "not-run", message: "Not requested" };
  assert.deepEqual(
    exportSessionState({
      root: "/models/isolette",
      libraryRoots: ["/models/libraries"],
      revision: 3,
      parseStatus: "valid",
      validation,
      ignoredVolatileField: "not copied",
    }),
    {
      root: "/models/isolette",
      libraryRoots: ["/models/libraries"],
      revision: 3,
      parseStatus: "valid",
      validation,
    },
  );
  assert.deepEqual(diagramHealthState({
    nodeCount: 9,
    crossingCount: 1,
    fidelity: { state: "local", scope: "aadl-oriented-subset" },
  }), {
    nodeCount: 9,
    crossingCount: 1,
    fidelity: { state: "local", scope: "aadl-oriented-subset" },
  });
  assert.throws(
    () => exportSessionState({ root: "/models", libraryRoots: [], revision: "3" }),
    /revision.*integer/u,
  );
  assert.throws(() => diagramHealthState([]), /must be an object/u);
  assert.deepEqual(traceabilityState(null), {
    available: false,
    relativePath: null,
    anchorCount: 0,
    taggedElementCount: 0,
    traceAssociationCount: 0,
    referencedTraceIds: [],
    unresolvedTraceIds: [],
    duplicateAnchorIds: [],
  });
  assert.deepEqual(
    traceabilityState({
      relativePath: "run/system-abstract.md",
      anchors: [{ id: "PART-01" }],
      taggedElementCount: 3,
      traceAssociationCount: 5,
      referencedTraceIds: ["PART-01", "MON-99"],
      unresolvedTraceIds: ["MON-99"],
      duplicateAnchorIds: [],
    }),
    {
      available: true,
      relativePath: "run/system-abstract.md",
      anchorCount: 1,
      taggedElementCount: 3,
      traceAssociationCount: 5,
      referencedTraceIds: ["PART-01", "MON-99"],
      unresolvedTraceIds: ["MON-99"],
      duplicateAnchorIds: [],
    },
  );
});
