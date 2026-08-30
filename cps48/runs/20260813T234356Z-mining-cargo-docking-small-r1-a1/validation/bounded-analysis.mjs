const SOURCE_SHA256 = "9644e38a4e8771374232945758e5e1b80bdcdd6478e14d923fa12908058fe0d6";

const phases = ["Idle", "TransferOutstanding", "AwaitingReceipt"];
const states = [
  { phase: "Idle", rearm: false },
  { phase: "Idle", rearm: true },
  { phase: "TransferOutstanding", rearm: false },
  { phase: "AwaitingReceipt", rearm: false }
];
const requestEvents = ["NoRequest", "OffloadRequested"];
const dockingValues = ["NotDocked", "Docked"];
const shipValues = ["Idle", "InProgress", "Complete", "Failed"];
const warehouseValues = ["NoReceipt", "ReceiptConfirmed", "ReceiptRejected"];
const statuses = ["Valid", "Invalid"];
const caseIds = Array.from({ length: 12 }, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`);

const semanticConnectionMap = Object.freeze({
  "INT-01": "root.offloadRequest -> requestQualification.requestSample",
  "INT-02": "requestQualification.qualifiedRequest -> transferDecisionOwner.qualifiedRequest",
  "INT-03": "root.dockingStatus -> dockingAssessmentOwner.dockingSample",
  "INT-04": "dockingAssessmentOwner.dockingAssessment -> transferDecisionOwner.dockingAssessment",
  "INT-05": "root.shipProgress -> shipProgressQualification.shipSample",
  "INT-06": "shipProgressQualification.qualifiedShipProgress -> transferDecisionOwner.qualifiedShipProgress",
  "INT-07": "root.warehouseReceipt -> warehouseEvidenceQualification.warehouseSample",
  "INT-08": "warehouseEvidenceQualification.qualifiedWarehouseEvidence -> transferDecisionOwner.qualifiedWarehouseEvidence",
  "INT-09": "transferDecisionOwner.commandResolution -> transferCommandDerivation.resolution",
  "INT-10": "transferDecisionOwner.reportResolution -> transferReportDerivation.resolution",
  "INT-11": "transferCommandDerivation.command -> root.cargoTransferCommand",
  "INT-12": "transferReportDerivation.supervisorStatus -> root.transferSupervisorStatus",
  "INT-13": "transferReportDerivation.verificationFinding -> root.transferVerificationFinding"
});

function requestContract(sample) {
  if (sample.status === "Invalid") return "InvalidRequest";
  return sample.requestEvent === "OffloadRequested" ? "QualifiedOffloadRequest" : "NoQualifiedRequest";
}
function requestOracle(requestEvent, status) {
  return status !== "Valid" ? "InvalidRequest" :
    requestEvent === "NoRequest" ? "NoQualifiedRequest" : "QualifiedOffloadRequest";
}
function dockingContract(sample) {
  if (sample.status === "Invalid") return "InvalidDocking";
  return sample.docking === "Docked" ? "DockedAssessment" : "NotDockedAssessment";
}
function dockingOracle(docking, status) {
  return status !== "Valid" ? "InvalidDocking" :
    docking === "NotDocked" ? "NotDockedAssessment" : "DockedAssessment";
}
function shipContract(sample) {
  if (sample.status === "Invalid") return "InvalidShipProgress";
  return ({ Idle: "ShipIdle", InProgress: "ShipInProgress", Complete: "ShipComplete", Failed: "ShipFailed" })[sample.progress];
}
function shipOracle(progress, status) {
  if (status !== "Valid") return "InvalidShipProgress";
  switch (progress) {
    case "Idle": return "ShipIdle";
    case "InProgress": return "ShipInProgress";
    case "Complete": return "ShipComplete";
    case "Failed": return "ShipFailed";
  }
}
function warehouseContract(sample) {
  if (sample.status === "Invalid") return "InvalidWarehouseEvidence";
  if (sample.receipt === "ReceiptConfirmed") return "QualifiedReceiptConfirmed";
  if (sample.receipt === "ReceiptRejected") return "QualifiedReceiptRejected";
  return "NoQualifiedReceipt";
}
function warehouseOracle(receipt, status) {
  if (status !== "Valid") return "InvalidWarehouseEvidence";
  switch (receipt) {
    case "NoReceipt": return "NoQualifiedReceipt";
    case "ReceiptConfirmed": return "QualifiedReceiptConfirmed";
    case "ReceiptRejected": return "QualifiedReceiptRejected";
  }
}

function rawGuards(state, delivered) {
  const { request, docking, ship, warehouse } = delivered;
  const invalid = request === "InvalidRequest" || docking === "InvalidDocking" ||
    ship === "InvalidShipProgress" || warehouse === "InvalidWarehouseEvidence";
  const neutral = request === "NoQualifiedRequest" && ship === "ShipIdle" && warehouse === "NoQualifiedReceipt";
  const active = state.phase === "TransferOutstanding" || state.phase === "AwaitingReceipt";
  const activeFault = active && (
    docking === "NotDockedAssessment" || ship === "ShipFailed" || warehouse === "QualifiedReceiptRejected" ||
    (state.phase === "TransferOutstanding" && warehouse === "QualifiedReceiptConfirmed" && ship !== "ShipComplete") ||
    (state.phase === "AwaitingReceipt" && ship === "ShipInProgress")
  );
  return [
    invalid,
    state.rearm && !neutral,
    state.rearm && !invalid && neutral,
    activeFault,
    state.phase === "Idle" && (ship !== "ShipIdle" || warehouse !== "NoQualifiedReceipt"),
    state.phase === "Idle" && request === "QualifiedOffloadRequest" && docking === "DockedAssessment",
    state.phase === "Idle" && request === "QualifiedOffloadRequest" && docking === "NotDockedAssessment",
    state.phase === "TransferOutstanding" && ship === "ShipComplete" && warehouse === "QualifiedReceiptConfirmed",
    state.phase === "TransferOutstanding" && ship === "ShipComplete" && warehouse === "NoQualifiedReceipt",
    state.phase === "AwaitingReceipt" && warehouse === "QualifiedReceiptConfirmed",
    active,
    true
  ];
}

function resolutionFor(caseId, state) {
  switch (caseId) {
    case "CASE-01": return { nextPhase: "Idle", nextRearmRequired: true, disposition: "InputFault" };
    case "CASE-02": return { nextPhase: "Idle", nextRearmRequired: true, disposition: "RearmBlocked" };
    case "CASE-03": return { nextPhase: "Idle", nextRearmRequired: false, disposition: "RearmCleared" };
    case "CASE-04": return { nextPhase: "Idle", nextRearmRequired: true, disposition: "ActiveEvidenceFault" };
    case "CASE-05": return { nextPhase: "Idle", nextRearmRequired: true, disposition: "UnexpectedIdleEvidence" };
    case "CASE-06": return { nextPhase: "TransferOutstanding", nextRearmRequired: false, disposition: "BeginAccepted" };
    case "CASE-07": return { nextPhase: "Idle", nextRearmRequired: true, disposition: "BeginDenied" };
    case "CASE-08": return { nextPhase: "Idle", nextRearmRequired: true, disposition: "VerifiedImmediate" };
    case "CASE-09": return { nextPhase: "AwaitingReceipt", nextRearmRequired: false, disposition: "ReceiptPending" };
    case "CASE-10": return { nextPhase: "Idle", nextRearmRequired: true, disposition: "VerifiedDelayed" };
    case "CASE-11": return { nextPhase: state.phase, nextRearmRequired: false, disposition: "ActiveHolding" };
    case "CASE-12": return { nextPhase: "Idle", nextRearmRequired: false, disposition: "IdleHolding" };
  }
}

function decisionContract(state, delivered) {
  const raw = rawGuards(state, delivered);
  const effective = raw.map((guard, i) => guard && raw.slice(0, i).every(v => !v));
  const selected = effective.flatMap((v, i) => v ? [caseIds[i]] : []);
  return { raw, effective, selected, resolution: selected.length === 1 ? resolutionFor(selected[0], state) : null };
}

function decisionOracle(state, q) {
  const invalid = q.request === "InvalidRequest" || q.docking === "InvalidDocking" ||
    q.ship === "InvalidShipProgress" || q.warehouse === "InvalidWarehouseEvidence";
  const neutral = q.request === "NoQualifiedRequest" && q.ship === "ShipIdle" && q.warehouse === "NoQualifiedReceipt";
  let id;
  if (invalid) id = "CASE-01";
  else if (state.rearm && !neutral) id = "CASE-02";
  else if (state.rearm && neutral) id = "CASE-03";
  else if ((state.phase === "TransferOutstanding" || state.phase === "AwaitingReceipt") &&
    (q.docking === "NotDockedAssessment" || q.ship === "ShipFailed" || q.warehouse === "QualifiedReceiptRejected" ||
     (state.phase === "TransferOutstanding" && q.warehouse === "QualifiedReceiptConfirmed" && q.ship !== "ShipComplete") ||
     (state.phase === "AwaitingReceipt" && q.ship === "ShipInProgress"))) id = "CASE-04";
  else if (state.phase === "Idle" && (q.ship !== "ShipIdle" || q.warehouse !== "NoQualifiedReceipt")) id = "CASE-05";
  else if (state.phase === "Idle" && q.request === "QualifiedOffloadRequest" && q.docking === "DockedAssessment") id = "CASE-06";
  else if (state.phase === "Idle" && q.request === "QualifiedOffloadRequest" && q.docking === "NotDockedAssessment") id = "CASE-07";
  else if (state.phase === "TransferOutstanding" && q.ship === "ShipComplete" && q.warehouse === "QualifiedReceiptConfirmed") id = "CASE-08";
  else if (state.phase === "TransferOutstanding" && q.ship === "ShipComplete" && q.warehouse === "NoQualifiedReceipt") id = "CASE-09";
  else if (state.phase === "AwaitingReceipt" && q.warehouse === "QualifiedReceiptConfirmed") id = "CASE-10";
  else if (state.phase === "TransferOutstanding" || state.phase === "AwaitingReceipt") id = "CASE-11";
  else id = "CASE-12";
  return { id, resolution: resolutionFor(id, state) };
}

function commandContract(resolutionFromInt09) {
  return resolutionFromInt09.disposition === "BeginAccepted" ? "BeginOffload" : "Hold";
}
function commandOracle(disposition) {
  return disposition === "BeginAccepted" ? "BeginOffload" : "Hold";
}
function reportContract(resolutionFromInt10) {
  const d = resolutionFromInt10.disposition;
  let status;
  if (d === "InputFault") status = "InputFault";
  else if (d === "RearmBlocked") status = "AwaitingNeutral";
  else if (d === "RearmCleared" || d === "IdleHolding") status = "Ready";
  else if (d === "ActiveEvidenceFault") status = "EvidenceFault";
  else if (d === "UnexpectedIdleEvidence") status = "UnexpectedEvidence";
  else if (d === "BeginAccepted") status = "TransferStarted";
  else if (d === "BeginDenied") status = "NotDocked";
  else if (d === "VerifiedImmediate" || d === "VerifiedDelayed") status = "TransferVerified";
  else if (d === "ReceiptPending") status = "AwaitingReceipt";
  else status = resolutionFromInt10.nextPhase === "TransferOutstanding" ? "TransferActive" : "AwaitingReceipt";
  const finding = d === "ActiveEvidenceFault" || d === "UnexpectedIdleEvidence" ? "Rejected" :
    d === "VerifiedImmediate" || d === "VerifiedDelayed" ? "Verified" : "NotEstablished";
  return { status, finding };
}
function reportOracle(resolution) {
  const byDisposition = {
    InputFault: ["InputFault", "NotEstablished"], RearmBlocked: ["AwaitingNeutral", "NotEstablished"],
    RearmCleared: ["Ready", "NotEstablished"], ActiveEvidenceFault: ["EvidenceFault", "Rejected"],
    UnexpectedIdleEvidence: ["UnexpectedEvidence", "Rejected"], BeginAccepted: ["TransferStarted", "NotEstablished"],
    BeginDenied: ["NotDocked", "NotEstablished"], VerifiedImmediate: ["TransferVerified", "Verified"],
    ReceiptPending: ["AwaitingReceipt", "NotEstablished"], VerifiedDelayed: ["TransferVerified", "Verified"],
    IdleHolding: ["Ready", "NotEstablished"]
  };
  const pair = resolution.disposition === "ActiveHolding" ?
    [resolution.nextPhase === "TransferOutstanding" ? "TransferActive" : "AwaitingReceipt", "NotEstablished"] :
    byDisposition[resolution.disposition];
  return { status: pair[0], finding: pair[1] };
}

function same(a, b) { return JSON.stringify(a) === JSON.stringify(b); }

function compose(state, raw) {
  const produced = {
    request: requestContract(raw.request),
    docking: dockingContract(raw.docking),
    ship: shipContract(raw.ship),
    warehouse: warehouseContract(raw.warehouse)
  };
  const deliveredToDecision = {
    request: produced.request,
    docking: produced.docking,
    ship: produced.ship,
    warehouse: produced.warehouse
  };
  const decision = decisionContract(state, deliveredToDecision);
  if (decision.selected.length !== 1) return { produced, deliveredToDecision, decision };
  const commandResolutionFromInt09 = { ...decision.resolution };
  const reportResolutionFromInt10 = { ...decision.resolution };
  const command = commandContract(commandResolutionFromInt09);
  const reports = reportContract(reportResolutionFromInt10);
  return { produced, deliveredToDecision, decision, commandResolutionFromInt09, reportResolutionFromInt10, command, reports };
}

let snapshots = 0;
let partitionGaps = 0;
let effectivePartitionOverlaps = 0;
let rawGuardOverlapSnapshots = 0;
let qualificationMismatches = 0;
let stateMismatches = 0;
let requiredOutputMismatches = 0;
let invariantViolations = 0;
const partitionCounts = Object.fromEntries(caseIds.map(id => [id, 0]));
const witnesses = Object.fromEntries(caseIds.map(id => [id, null]));
const canonicalGuardMismatchCounts = Object.fromEntries(caseIds.map(id => [id, 0]));
const ownerMismatchCounts = {
  requestQualification: 0, dockingAssessmentOwner: 0, shipProgressQualification: 0,
  warehouseEvidenceQualification: 0, transferDecisionOwner: 0,
  transferCommandDerivation: 0, transferReportDerivation: 0
};

for (const state of states) for (const requestEvent of requestEvents) for (const requestStatus of statuses)
for (const docking of dockingValues) for (const dockingStatus of statuses)
for (const progress of shipValues) for (const shipStatus of statuses)
for (const receipt of warehouseValues) for (const warehouseStatus of statuses) {
  snapshots++;
  const raw = {
    request: { requestEvent, status: requestStatus }, docking: { docking, status: dockingStatus },
    ship: { progress, status: shipStatus }, warehouse: { receipt, status: warehouseStatus }
  };
  const composed = compose(state, raw);
  const expectedQ = {
    request: requestOracle(requestEvent, requestStatus), docking: dockingOracle(docking, dockingStatus),
    ship: shipOracle(progress, shipStatus), warehouse: warehouseOracle(receipt, warehouseStatus)
  };
  for (const key of ["request", "docking", "ship", "warehouse"]) {
    if (composed.produced[key] !== expectedQ[key]) {
      qualificationMismatches++;
      const owner = ({ request: "requestQualification", docking: "dockingAssessmentOwner", ship: "shipProgressQualification", warehouse: "warehouseEvidenceQualification" })[key];
      ownerMismatchCounts[owner]++;
    }
  }
  const selectedCount = composed.decision.selected.length;
  if (selectedCount === 0) partitionGaps++;
  if (selectedCount > 1) effectivePartitionOverlaps++;
  if (composed.decision.raw.filter(Boolean).length > 1) rawGuardOverlapSnapshots++;
  if (selectedCount !== 1) continue;
  const id = composed.decision.selected[0];
  partitionCounts[id]++;
  if (witnesses[id] === null) witnesses[id] = { state, raw };
  const oracleDecision = decisionOracle(state, expectedQ);
  for (let i = 0; i < caseIds.length; i++) {
    const analyzerEffectiveGuard = oracleDecision.id === caseIds[i];
    if (composed.decision.effective[i] !== analyzerEffectiveGuard) canonicalGuardMismatchCounts[caseIds[i]]++;
  }
  if (id !== oracleDecision.id || !same(composed.decision.resolution, oracleDecision.resolution)) {
    stateMismatches++;
    ownerMismatchCounts.transferDecisionOwner++;
  }
  const expectedCommand = commandOracle(oracleDecision.resolution.disposition);
  const expectedReports = reportOracle(oracleDecision.resolution);
  if (composed.command !== expectedCommand) {
    requiredOutputMismatches++;
    ownerMismatchCounts.transferCommandDerivation++;
  }
  if (!same(composed.reports, expectedReports)) {
    requiredOutputMismatches++;
    ownerMismatchCounts.transferReportDerivation++;
  }
  if (composed.decision.resolution.nextRearmRequired && composed.decision.resolution.nextPhase !== "Idle") invariantViolations++;
}

function sample(requestEvent = "NoRequest", requestStatus = "Valid", docking = "Docked", dockingStatus = "Valid",
                progress = "Idle", shipStatus = "Valid", receipt = "NoReceipt", warehouseStatus = "Valid") {
  return {
    request: { requestEvent, status: requestStatus }, docking: { docking, status: dockingStatus },
    ship: { progress, status: shipStatus }, warehouse: { receipt, status: warehouseStatus }
  };
}
function runTrace(traceId, initialState, steps) {
  let state = { ...initialState };
  const observedSteps = [];
  let passed = true;
  for (let i = 0; i < steps.length; i++) {
    const specification = steps[i];
    const observed = compose(state, specification.input);
    const observedCase = observed.decision.selected.length === 1 ? observed.decision.selected[0] : "PARTITION_ERROR";
    const ok = observedCase === specification.expectedCase;
    passed = passed && ok;
    observedSteps.push({
      step: i + 1, pre_state: state, input: specification.input,
      expected_case: specification.expectedCase, observed_case: observedCase,
      observed_outputs: observed.command ? {
        command: observed.command, status: observed.reports.status, finding: observed.reports.finding
      } : null,
      observed_next_state: observed.decision.resolution ? {
        phase: observed.decision.resolution.nextPhase, rearm: observed.decision.resolution.nextRearmRequired
      } : null,
      passed: ok
    });
    if (observed.decision.resolution) state = {
      phase: observed.decision.resolution.nextPhase,
      rearm: observed.decision.resolution.nextRearmRequired
    };
  }
  return { trace_id: traceId, status: passed ? "passed" : "failed", steps: observedSteps };
}
const step = (expectedCase, input) => ({ expectedCase, input });
const idle = { phase: "Idle", rearm: false };
const outstanding = { phase: "TransferOutstanding", rearm: false };
const awaiting = { phase: "AwaitingReceipt", rearm: false };

const scn01 = [runTrace("SCN-01-delayed-verification", idle, [
  step("CASE-12", sample()), step("CASE-06", sample("OffloadRequested")),
  step("CASE-11", sample("NoRequest", "Valid", "Docked", "Valid", "InProgress")),
  step("CASE-09", sample("NoRequest", "Valid", "Docked", "Valid", "Complete")),
  step("CASE-11", sample()),
  step("CASE-10", sample("NoRequest", "Valid", "Docked", "Valid", "Idle", "Valid", "ReceiptConfirmed"))
])];
const scn02 = [runTrace("SCN-02-docking-boundary-immediate", idle, [
  step("CASE-07", sample("OffloadRequested", "Valid", "NotDocked")),
  step("CASE-02", sample("OffloadRequested")), step("CASE-03", sample()),
  step("CASE-06", sample("OffloadRequested")),
  step("CASE-08", sample("NoRequest", "Valid", "Docked", "Valid", "Complete", "Valid", "ReceiptConfirmed"))
])];
const scn03 = [
  runTrace("SCN-03-idle-evidence-then-docking-loss", idle, [
    step("CASE-05", sample("NoRequest", "Valid", "Docked", "Valid", "Complete")),
    step("CASE-03", sample()), step("CASE-06", sample("OffloadRequested")),
    step("CASE-04", sample("NoRequest", "Valid", "NotDocked", "Valid", "InProgress"))
  ]),
  runTrace("SCN-03-ship-failure", idle, [step("CASE-06", sample("OffloadRequested")), step("CASE-04", sample("NoRequest", "Valid", "Docked", "Valid", "Failed"))]),
  runTrace("SCN-03-warehouse-rejection", idle, [step("CASE-06", sample("OffloadRequested")), step("CASE-04", sample("NoRequest", "Valid", "Docked", "Valid", "InProgress", "Valid", "ReceiptRejected"))]),
  runTrace("SCN-03-premature-confirmation", idle, [step("CASE-06", sample("OffloadRequested")), step("CASE-04", sample("NoRequest", "Valid", "Docked", "Valid", "InProgress", "Valid", "ReceiptConfirmed"))]),
  runTrace("SCN-03-progress-regression", idle, [
    step("CASE-06", sample("OffloadRequested")), step("CASE-09", sample("NoRequest", "Valid", "Docked", "Valid", "Complete")),
    step("CASE-04", sample("NoRequest", "Valid", "Docked", "Valid", "InProgress"))
  ])
];
const invalidPatterns = [
  ["request", ["Invalid", "Valid", "Valid", "Valid"]],
  ["docking", ["Valid", "Invalid", "Valid", "Valid"]],
  ["ship", ["Valid", "Valid", "Invalid", "Valid"]],
  ["warehouse", ["Valid", "Valid", "Valid", "Invalid"]],
  ["request-docking-pair", ["Invalid", "Invalid", "Valid", "Valid"]],
  ["ship-warehouse-pair", ["Valid", "Valid", "Invalid", "Invalid"]],
  ["all-four", ["Invalid", "Invalid", "Invalid", "Invalid"]]
];
const scn04 = [];
for (const [phaseName, phaseState] of [["idle", idle], ["outstanding", outstanding], ["awaiting", awaiting]]) {
  for (const [patternName, s] of invalidPatterns) {
    scn04.push(runTrace(`SCN-04-${phaseName}-${patternName}`, phaseState, [
      step("CASE-01", sample("OffloadRequested", s[0], "Docked", s[1], "Complete", s[2], "ReceiptConfirmed", s[3]))
    ]));
  }
}
const scn05 = [
  runTrace("SCN-05-retained-request-then-fresh-accepted", idle, [
    step("CASE-01", sample("OffloadRequested", "Invalid")),
    step("CASE-02", sample("OffloadRequested")), step("CASE-03", sample()),
    step("CASE-12", sample()), step("CASE-06", sample("OffloadRequested"))
  ]),
  runTrace("SCN-05-retained-evidence-then-fresh-denied", outstanding, [
    step("CASE-04", sample("NoRequest", "Valid", "NotDocked", "Valid", "Failed")),
    step("CASE-02", sample("NoRequest", "Valid", "Docked", "Valid", "InProgress")),
    step("CASE-03", sample()), step("CASE-07", sample("OffloadRequested", "Valid", "NotDocked"))
  ])
];

const scenarioFamilies = [
  { scenario_id: "SCN-01", family: "nominal delayed verification", traces: scn01 },
  { scenario_id: "SCN-02", family: "docking boundary and immediate verification", traces: scn02 },
  { scenario_id: "SCN-03", family: "evidence applicability and priority", traces: scn03 },
  { scenario_id: "SCN-04", family: "invalid and fault entry", traces: scn04 },
  { scenario_id: "SCN-05", family: "recovery and fresh-request behavior", traces: scn05 }
].map(f => ({ ...f, status: f.traces.every(t => t.status === "passed") ? "passed" : "failed" }));
const scenarioFailures = scenarioFamilies.reduce((n, f) => n + f.traces.filter(t => t.status !== "passed").length, 0);

const ownershipTemplate = [
  {
    usage: "requestQualification", claimed_roles: ["applicability"],
    assigned_inputs: ["requestQualification.requestSample"],
    owner_local_facts: ["validity-aware three-valued request qualification"],
    contract_cases: ["QUAL_REQ_TOTAL"], analyzer_checks: ["request qualification four-pair total relation"]
  },
  {
    usage: "dockingAssessmentOwner", claimed_roles: ["applicability"],
    assigned_inputs: ["dockingAssessmentOwner.dockingSample"],
    owner_local_facts: ["validity-aware three-valued docking assessment"],
    contract_cases: ["QUAL_DOCK_TOTAL"], analyzer_checks: ["docking assessment four-pair total relation"]
  },
  {
    usage: "shipProgressQualification", claimed_roles: ["applicability"],
    assigned_inputs: ["shipProgressQualification.shipSample"],
    owner_local_facts: ["validity-aware five-valued ship-progress qualification"],
    contract_cases: ["QUAL_SHIP_TOTAL"], analyzer_checks: ["ship qualification eight-pair total relation"]
  },
  {
    usage: "warehouseEvidenceQualification", claimed_roles: ["applicability"],
    assigned_inputs: ["warehouseEvidenceQualification.warehouseSample"],
    owner_local_facts: ["validity-aware four-valued warehouse-evidence qualification"],
    contract_cases: ["QUAL_WAREHOUSE_TOTAL"], analyzer_checks: ["warehouse qualification six-pair total relation"]
  },
  {
    usage: "transferDecisionOwner", claimed_roles: ["decision"],
    assigned_inputs: [
      "transferDecisionOwner.qualifiedRequest", "transferDecisionOwner.dockingAssessment",
      "transferDecisionOwner.qualifiedShipProgress", "transferDecisionOwner.qualifiedWarehouseEvidence",
      "transferDecisionOwner.In(transferPhase)", "transferDecisionOwner.In(rearmRequired)"
    ],
    owner_local_facts: ["ordered twelve-way disposition", "next transfer phase", "next rearm obligation"],
    contract_cases: caseIds,
    analyzer_checks: ["decision twelve-case effective partition", "decision next-state and invariant preservation"]
  },
  {
    usage: "transferCommandDerivation", claimed_roles: ["proposal"],
    assigned_inputs: ["transferCommandDerivation.resolution"],
    owner_local_facts: ["twelve-to-two transfer-command classification"],
    contract_cases: ["COMMAND_TOTAL"], analyzer_checks: ["command derivation total relation through INT-09"]
  },
  {
    usage: "transferReportDerivation", claimed_roles: ["proposal"],
    assigned_inputs: ["transferReportDerivation.resolution"],
    owner_local_facts: ["disposition-and-phase status classification", "three-valued finding classification"],
    contract_cases: ["REPORT_TOTAL"], analyzer_checks: ["status and finding total relation through INT-10"]
  }
];
const ownerKey = {
  requestQualification: "requestQualification", dockingAssessmentOwner: "dockingAssessmentOwner",
  shipProgressQualification: "shipProgressQualification", warehouseEvidenceQualification: "warehouseEvidenceQualification",
  transferDecisionOwner: "transferDecisionOwner", transferCommandDerivation: "transferCommandDerivation",
  transferReportDerivation: "transferReportDerivation"
};
const ownershipAudit = ownershipTemplate.map(entry => ({
  ...entry,
  mismatches: ownerMismatchCounts[ownerKey[entry.usage]],
  passed: ownerMismatchCounts[ownerKey[entry.usage]] === 0 && scenarioFailures === 0
}));

const guardCrosscheck = caseIds.map((id, i) => ({
  case_id: id,
  canonical_predecessor_exclusions: i,
  analyzer_predecessor_exclusions: i,
  finite_domain_mismatches: canonicalGuardMismatchCounts[id],
  matched: canonicalGuardMismatchCounts[id] === 0
}));
const allPassed = snapshots === 3072 && partitionGaps === 0 && effectivePartitionOverlaps === 0 &&
  qualificationMismatches === 0 && stateMismatches === 0 && requiredOutputMismatches === 0 &&
  invariantViolations === 0 && Object.values(partitionCounts).every(n => n > 0) &&
  Object.values(canonicalGuardMismatchCounts).every(n => n === 0) &&
  scenarioFailures === 0 && ownershipAudit.every(o => o.passed);

const result = {
  status: allPassed ? "passed" : "failed",
  passed: allPassed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Deterministic exhaustive evidence over the seed's 3,072 finite admissible snapshots and named scenario traces only; not formal, compositional, unbounded, executable, physical-performance, safety, certification, or generated-code evidence.",
  semantic_connection_map: semanticConnectionMap,
  domain: {
    invariant_satisfying_pre_states: states.length,
    request_pairs: requestEvents.length * statuses.length,
    docking_pairs: dockingValues.length * statuses.length,
    ship_pairs: shipValues.length * statuses.length,
    warehouse_pairs: warehouseValues.length * statuses.length,
    expected_snapshots: 3072,
    enumerated_snapshots: snapshots
  },
  partition_counts: partitionCounts,
  partition_gaps: partitionGaps,
  effective_partition_overlaps: effectivePartitionOverlaps,
  raw_guard_overlap_snapshots: rawGuardOverlapSnapshots,
  qualification_mismatches: qualificationMismatches,
  state_mismatches: stateMismatches,
  required_output_mismatches: requiredOutputMismatches,
  invariant_violations: invariantViolations,
  case_witnesses: witnesses,
  canonical_guard_crosscheck: guardCrosscheck,
  invariant_checks: {
    "INVAR-01": invariantViolations === 0,
    "NEUTRAL-01": scenarioFailures === 0,
    "FRESH-01": scenarioFailures === 0,
    "PRIORITY-01": partitionGaps === 0 && effectivePartitionOverlaps === 0,
    "OUTPUT-01": requiredOutputMismatches === 0
  },
  scenario_family_count: scenarioFamilies.length,
  scenario_failures: scenarioFailures,
  scenario_families: scenarioFamilies,
  ownership_audit: ownershipAudit
};

process.stdout.write(JSON.stringify(result));
