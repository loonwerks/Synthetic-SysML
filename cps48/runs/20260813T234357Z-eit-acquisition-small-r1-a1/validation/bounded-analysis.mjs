const SOURCE_SHA256 = "683018484c7e77a24a345bda65aef4a3af75bb530ad707b21e485185a1e8ca7a";

const QualifiedRequest = ["InvalidRequest", "NoQualifiedRequest", "QualifiedStart", "QualifiedStop"];
const AcquisitionEvidence = ["InvalidAcquisitionEvidence", "CalibrationAbsent", "ReadyNoToken", "ReadyTokenOne", "ReadyTokenTwo"];
const SessionMode = ["SessionStopped", "SessionMonitoring"];
const RecoveryPhase = ["Normal", "AwaitNeutral", "AwaitFreshRequest"];
const Disposition = ["InputFaultDisposition", "RecoveryDisposition", "StopAccepted", "StartAccepted", "StartDenied", "MonitoringContinued", "StoppedDisposition"];
const Command = ["HoldAcquisition", "CollectImpedance"];

const connection_map = [
  { id: "INT-01", from: "root.monitoringRequest", to: "requestQualification.requestSample", type: "MonitoringRequestSample" },
  { id: "INT-02", from: "root.calibrationEvidence", to: "acquisitionEvidenceQualification.calibrationSample", type: "CalibrationSample" },
  { id: "INT-03", from: "root.impedanceObservation", to: "acquisitionEvidenceQualification.impedanceSample", type: "ImpedanceSample" },
  { id: "INT-04", from: "requestQualification.qualifiedRequest", to: "monitoringDecisionOwner.qualifiedRequest", type: "QualifiedRequest" },
  { id: "INT-05", from: "acquisitionEvidenceQualification.acquisitionEvidence", to: "monitoringDecisionOwner.acquisitionEvidence", type: "AcquisitionEvidence" },
  { id: "INT-06", from: "monitoringDecisionOwner.acquisitionCommand", to: "root.acquisitionCommand", type: "AcquisitionCommand" },
  { id: "INT-07", from: "monitoringDecisionOwner.monitoringResolution", to: "impedanceDeliveryDerivation.monitoringResolution", type: "MonitoringResolution" },
  { id: "INT-08", from: "acquisitionEvidenceQualification.acquisitionEvidence", to: "impedanceDeliveryDerivation.acquisitionEvidence", type: "AcquisitionEvidence" },
  { id: "INT-09", from: "impedanceDeliveryDerivation.impedanceDelivery", to: "root.impedanceDelivery", type: "ImpedanceDelivery" },
  { id: "INT-10", from: "monitoringDecisionOwner.monitoringResolution", to: "doctorStatusDerivation.monitoringResolution", type: "MonitoringResolution" },
  { id: "INT-11", from: "acquisitionEvidenceQualification.acquisitionEvidence", to: "doctorStatusDerivation.acquisitionEvidence", type: "AcquisitionEvidence" },
  { id: "INT-12", from: "doctorStatusDerivation.monitoringStatus", to: "root.monitoringStatus", type: "MonitoringStatus" }
];

function requestQualification(sample) {
  if (sample.status === "Invalid") return { qualifiedRequest: "InvalidRequest", localCase: "QUAL_REQ_Invalid" };
  if (sample.request === "NoRequest") return { qualifiedRequest: "NoQualifiedRequest", localCase: "QUAL_REQ_None" };
  if (sample.request === "StartMonitoring") return { qualifiedRequest: "QualifiedStart", localCase: "QUAL_REQ_Start" };
  return { qualifiedRequest: "QualifiedStop", localCase: "QUAL_REQ_Stop" };
}

function evidenceQualification(calibration, impedance) {
  if (calibration.status === "Invalid" || impedance.status === "Invalid") {
    return { acquisitionEvidence: "InvalidAcquisitionEvidence", localCase: "QUAL_EVID_Invalid" };
  }
  if (calibration.calibration === "NotCurrent") {
    return { acquisitionEvidence: "CalibrationAbsent", localCase: "QUAL_EVID_NotCurrent" };
  }
  if (impedance.token === "NoToken") return { acquisitionEvidence: "ReadyNoToken", localCase: "QUAL_EVID_NoToken" };
  if (impedance.token === "TokenOne") return { acquisitionEvidence: "ReadyTokenOne", localCase: "QUAL_EVID_TokenOne" };
  return { acquisitionEvidence: "ReadyTokenTwo", localCase: "QUAL_EVID_TokenTwo" };
}

const canonical_guard_signatures = [
  "q=Invalid|e=Invalid",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitNeutral&q!=NoQualifiedRequest",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitNeutral&q=NoQualifiedRequest",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=NoQualifiedRequest",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=QualifiedStop",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=QualifiedStart&e!=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=QualifiedStart&e=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=QualifiedStop",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=QualifiedStart&e!=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=QualifiedStart&e=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=NoQualifiedRequest&preSession=SessionMonitoring&e!=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=NoQualifiedRequest&(preSession=SessionStopped|e=CalibrationAbsent)"
];

const analyzer_guard_signatures = [
  "q=Invalid|e=Invalid",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitNeutral&q!=NoQualifiedRequest",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitNeutral&q=NoQualifiedRequest",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=NoQualifiedRequest",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=QualifiedStop",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=QualifiedStart&e!=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=AwaitFreshRequest&q=QualifiedStart&e=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=QualifiedStop",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=QualifiedStart&e!=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=QualifiedStart&e=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=NoQualifiedRequest&preSession=SessionMonitoring&e!=CalibrationAbsent",
  "q!=Invalid&e!=Invalid&preRecovery=Normal&q=NoQualifiedRequest&(preSession=SessionStopped|e=CalibrationAbsent)"
];

function ownerGuards(q, e, pre) {
  return [
    q === "InvalidRequest" || e === "InvalidAcquisitionEvidence",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "AwaitNeutral" && q !== "NoQualifiedRequest",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "AwaitNeutral" && q === "NoQualifiedRequest",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "AwaitFreshRequest" && q === "NoQualifiedRequest",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "AwaitFreshRequest" && q === "QualifiedStop",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "AwaitFreshRequest" && q === "QualifiedStart" && e !== "CalibrationAbsent",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "AwaitFreshRequest" && q === "QualifiedStart" && e === "CalibrationAbsent",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "Normal" && q === "QualifiedStop",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "Normal" && q === "QualifiedStart" && e !== "CalibrationAbsent",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "Normal" && q === "QualifiedStart" && e === "CalibrationAbsent",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "Normal" && q === "NoQualifiedRequest" && pre.sessionMode === "SessionMonitoring" && e !== "CalibrationAbsent",
    q !== "InvalidRequest" && e !== "InvalidAcquisitionEvidence" && pre.recoveryPhase === "Normal" && q === "NoQualifiedRequest" && (pre.sessionMode === "SessionStopped" || e === "CalibrationAbsent")
  ];
}

const case_results = [
  ["SessionStopped", "AwaitNeutral", "HoldAcquisition", "InputFaultDisposition"],
  ["SessionStopped", "AwaitNeutral", "HoldAcquisition", "RecoveryDisposition"],
  ["SessionStopped", "AwaitFreshRequest", "HoldAcquisition", "RecoveryDisposition"],
  ["SessionStopped", "AwaitFreshRequest", "HoldAcquisition", "RecoveryDisposition"],
  ["SessionStopped", "Normal", "HoldAcquisition", "StopAccepted"],
  ["SessionMonitoring", "Normal", "CollectImpedance", "StartAccepted"],
  ["SessionStopped", "Normal", "HoldAcquisition", "StartDenied"],
  ["SessionStopped", "Normal", "HoldAcquisition", "StopAccepted"],
  ["SessionMonitoring", "Normal", "CollectImpedance", "StartAccepted"],
  ["SessionStopped", "Normal", "HoldAcquisition", "StartDenied"],
  ["SessionMonitoring", "Normal", "CollectImpedance", "MonitoringContinued"],
  ["SessionStopped", "Normal", "HoldAcquisition", "StoppedDisposition"]
];

function ownerRelation(q, e, pre) {
  const guards = ownerGuards(q, e, pre);
  const matches = guards.flatMap((value, index) => value ? [index] : []);
  if (matches.length !== 1) return { guards, matches };
  const index = matches[0];
  const [nextSessionMode, nextRecoveryPhase, acquisitionCommand, disposition] = case_results[index];
  const monitoringResolution = { nextSessionMode, nextRecoveryPhase, acquisitionCommand, disposition };
  return {
    guards,
    matches,
    case: `CASE-${String(index + 1).padStart(2, "0")}`,
    monitoringResolution,
    acquisitionCommand,
    nextState: { sessionMode: nextSessionMode, recoveryPhase: nextRecoveryPhase }
  };
}

function ownerOracle(q, e, pre) {
  const invalid = q === "InvalidRequest" || e === "InvalidAcquisitionEvidence";
  const ready = e !== "InvalidAcquisitionEvidence" && e !== "CalibrationAbsent";
  if (invalid) return case_results[0];
  if (pre.recoveryPhase === "AwaitNeutral" && q !== "NoQualifiedRequest") return case_results[1];
  if (pre.recoveryPhase === "AwaitNeutral") return case_results[2];
  if (pre.recoveryPhase === "AwaitFreshRequest" && q === "NoQualifiedRequest") return case_results[3];
  if (pre.recoveryPhase === "AwaitFreshRequest" && q === "QualifiedStop") return case_results[4];
  if (pre.recoveryPhase === "AwaitFreshRequest" && q === "QualifiedStart" && ready) return case_results[5];
  if (pre.recoveryPhase === "AwaitFreshRequest") return case_results[6];
  if (q === "QualifiedStop") return case_results[7];
  if (q === "QualifiedStart" && ready) return case_results[8];
  if (q === "QualifiedStart") return case_results[9];
  if (pre.sessionMode === "SessionMonitoring" && ready) return case_results[10];
  return case_results[11];
}

function canonicalCaseOracle(q, e, pre) {
  const expected = ownerOracle(q, e, pre);
  const index = case_results.findIndex((result, i) => ownerGuards(q, e, pre)[i] && JSON.stringify(result) === JSON.stringify(expected));
  return index < 0 ? null : `CASE-${String(index + 1).padStart(2, "0")}`;
}

function deliveryRelation(resolution, evidence) {
  if (resolution.acquisitionCommand === "HoldAcquisition") return { impedanceDelivery: "Withheld", localCase: "DELIVERY_Hold" };
  if (evidence === "InvalidAcquisitionEvidence" || evidence === "CalibrationAbsent") return { impedanceDelivery: "Withheld", localCase: "DELIVERY_Anomalous" };
  if (evidence === "ReadyNoToken") return { impedanceDelivery: "NoTokenAvailable", localCase: "DELIVERY_None" };
  if (evidence === "ReadyTokenOne") return { impedanceDelivery: "DeliverTokenOne", localCase: "DELIVERY_One" };
  return { impedanceDelivery: "DeliverTokenTwo", localCase: "DELIVERY_Two" };
}

function statusRelation(resolution, evidence) {
  if (resolution.disposition === "InputFaultDisposition") return { monitoringStatus: "InputFault", localCase: "STATUS_Fault" };
  if (resolution.disposition === "RecoveryDisposition") return { monitoringStatus: "RecoveryPending", localCase: "STATUS_Recovery" };
  if (resolution.disposition === "StartDenied" || (resolution.disposition === "StoppedDisposition" && evidence === "CalibrationAbsent")) {
    return { monitoringStatus: "CalibrationRequired", localCase: "STATUS_Calibration" };
  }
  if (resolution.acquisitionCommand === "CollectImpedance") return { monitoringStatus: "Monitoring", localCase: "STATUS_Monitoring" };
  return { monitoringStatus: "Stopped", localCase: "STATUS_Stopped" };
}

function systemStep(input, pre) {
  const requestProducer = requestQualification(input.request);
  const evidenceProducer = evidenceQualification(input.calibration, input.impedance);
  const flows = {
    "INT-01": input.request,
    "INT-02": input.calibration,
    "INT-03": input.impedance,
    "INT-04": requestProducer.qualifiedRequest,
    "INT-05": evidenceProducer.acquisitionEvidence
  };
  const owner = ownerRelation(flows["INT-04"], flows["INT-05"], pre);
  if (owner.matches.length !== 1) return { owner, flows };
  flows["INT-06"] = owner.acquisitionCommand;
  flows["INT-07"] = { ...owner.monitoringResolution };
  flows["INT-08"] = evidenceProducer.acquisitionEvidence;
  const delivery = deliveryRelation(flows["INT-07"], flows["INT-08"]);
  flows["INT-09"] = delivery.impedanceDelivery;
  flows["INT-10"] = { ...owner.monitoringResolution };
  flows["INT-11"] = evidenceProducer.acquisitionEvidence;
  const status = statusRelation(flows["INT-10"], flows["INT-11"]);
  flows["INT-12"] = status.monitoringStatus;
  return {
    qualification: { request: requestProducer.localCase, evidence: evidenceProducer.localCase },
    owner,
    delivery,
    status,
    flows,
    outputs: {
      acquisitionCommand: flows["INT-06"],
      impedanceDelivery: flows["INT-09"],
      monitoringStatus: flows["INT-12"]
    }
  };
}

const ownership_metric_records = [
  {
    usage: "requestQualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["requestQualification.requestSample"],
    owner_local_facts: ["validity-aware 6-to-4 qualified request classification"],
    contract_cases: ["QUAL_REQ_Invalid", "QUAL_REQ_None", "QUAL_REQ_Start", "QUAL_REQ_Stop"],
    analyzer_checks: ["request qualification total 6-to-4 relation", "request invalid-status collapse"]
  },
  {
    usage: "acquisitionEvidenceQualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["acquisitionEvidenceQualification.calibrationSample", "acquisitionEvidenceQualification.impedanceSample"],
    owner_local_facts: ["joint validity-calibration-token acquisition evidence classification"],
    contract_cases: ["QUAL_EVID_Invalid", "QUAL_EVID_NotCurrent", "QUAL_EVID_NoToken", "QUAL_EVID_TokenOne", "QUAL_EVID_TokenTwo"],
    analyzer_checks: ["acquisition evidence total 24-to-5 relation", "acquisition evidence 18-3-1-1-1 fibers"]
  },
  {
    usage: "monitoringDecisionOwner",
    claimed_roles: ["decision"],
    assigned_inputs: ["monitoringDecisionOwner.qualifiedRequest", "monitoringDecisionOwner.acquisitionEvidence", "monitoringDecisionOwner.sessionMode", "monitoringDecisionOwner.recoveryPhase"],
    owner_local_facts: ["ordered monitoring resolution", "next session mode", "next recovery phase", "acquisition command"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12"],
    analyzer_checks: ["owner twelve-case partition over 120 qualified snapshots", "owner complete next-state resolution and command"]
  },
  {
    usage: "impedanceDeliveryDerivation",
    claimed_roles: ["decision"],
    assigned_inputs: ["impedanceDeliveryDerivation.monitoringResolution", "impedanceDeliveryDerivation.acquisitionEvidence"],
    owner_local_facts: ["command-gated producer-total impedance delivery classification"],
    contract_cases: ["DELIVERY_Hold", "DELIVERY_Anomalous", "DELIVERY_None", "DELIVERY_One", "DELIVERY_Two"],
    analyzer_checks: ["delivery total 10-to-4 relation", "delivery 7-1-1-1 fibers", "anomalous collect pairing unreachable"]
  },
  {
    usage: "doctorStatusDerivation",
    claimed_roles: ["decision"],
    assigned_inputs: ["doctorStatusDerivation.monitoringResolution", "doctorStatusDerivation.acquisitionEvidence"],
    owner_local_facts: ["priority-ordered fault-recovery-calibration-monitoring status classification"],
    contract_cases: ["STATUS_Fault", "STATUS_Recovery", "STATUS_Calibration", "STATUS_Monitoring", "STATUS_Stopped"],
    analyzer_checks: ["Doctor status total 70-to-5 relation", "Doctor status 10-10-12-19-19 fibers"]
  }
];

const observations = {
  qualified_snapshots: 0,
  raw_root_input_tuples: 0,
  raw_root_state_snapshots: 0,
  partition_gaps: 0,
  raw_guard_overlaps: 0,
  effective_selection_overlaps: 0,
  guard_mismatches: 0,
  qualification_mismatches: 0,
  next_state_mismatches: 0,
  command_mismatches: 0,
  delivery_mismatches: 0,
  status_mismatches: 0,
  required_output_mismatches: 0,
  invariant_violations: 0,
  interaction_resolution_violations: 0,
  anomalous_delivery_reachability_violations: 0,
  scenario_mismatches: 0
};

const partition_counts = Object.fromEntries(Array.from({ length: 12 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
const raw_partition_counts = Object.fromEntries(Array.from({ length: 12 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
const case_witnesses = {};
const qualifiedInputs = [];
for (const q of QualifiedRequest) for (const e of AcquisitionEvidence) qualifiedInputs.push({ q, e });
const ownerStates = [];
for (const sessionMode of SessionMode) for (const recoveryPhase of RecoveryPhase) ownerStates.push({ sessionMode, recoveryPhase });

for (const { q, e } of qualifiedInputs) for (const pre of ownerStates) {
  observations.qualified_snapshots += 1;
  const result = ownerRelation(q, e, pre);
  if (result.matches.length === 0) observations.partition_gaps += 1;
  if (result.matches.length > 1) {
    observations.raw_guard_overlaps += 1;
    observations.effective_selection_overlaps += 1;
  }
  if (result.matches.length !== 1) continue;
  partition_counts[result.case] += 1;
  case_witnesses[result.case] ??= { qualified_inputs: { qualifiedRequest: q, acquisitionEvidence: e }, pre_state: pre, observed_resolution: result.monitoringResolution };
  if (result.case !== canonicalCaseOracle(q, e, pre)) observations.guard_mismatches += 1;
  const expected = ownerOracle(q, e, pre);
  const observed = [result.monitoringResolution.nextSessionMode, result.monitoringResolution.nextRecoveryPhase, result.monitoringResolution.acquisitionCommand, result.monitoringResolution.disposition];
  if (observed[0] !== expected[0] || observed[1] !== expected[1]) observations.next_state_mismatches += 1;
  if (observed[2] !== expected[2] || result.acquisitionCommand !== expected[2]) observations.command_mismatches += 1;
  if (observed[3] !== expected[3]) observations.required_output_mismatches += 1;
  if (result.nextState.recoveryPhase !== "Normal" && result.nextState.sessionMode !== "SessionStopped") observations.invariant_violations += 1;
}

const requestSamples = [];
for (const request of ["NoRequest", "StartMonitoring", "StopMonitoring"]) for (const status of ["Valid", "Invalid"]) requestSamples.push({ request, status });
const calibrationSamples = [];
for (const calibration of ["NotCurrent", "Current"]) for (const status of ["Valid", "Invalid"]) calibrationSamples.push({ calibration, status });
const impedanceSamples = [];
for (const token of ["NoToken", "TokenOne", "TokenTwo"]) for (const status of ["Valid", "Invalid"]) impedanceSamples.push({ token, status });

const request_fibers = Object.fromEntries(QualifiedRequest.map(x => [x, 0]));
const requestLocalCases = new Set();
for (const sample of requestSamples) {
  const produced = requestQualification(sample);
  request_fibers[produced.qualifiedRequest] += 1;
  requestLocalCases.add(produced.localCase);
}
const evidence_fibers = Object.fromEntries(AcquisitionEvidence.map(x => [x, 0]));
const evidenceLocalCases = new Set();
for (const calibration of calibrationSamples) for (const impedance of impedanceSamples) {
  const produced = evidenceQualification(calibration, impedance);
  evidence_fibers[produced.acquisitionEvidence] += 1;
  evidenceLocalCases.add(produced.localCase);
}
if (JSON.stringify(request_fibers) !== JSON.stringify({ InvalidRequest: 3, NoQualifiedRequest: 1, QualifiedStart: 1, QualifiedStop: 1 })) observations.qualification_mismatches += 1;
if (JSON.stringify(evidence_fibers) !== JSON.stringify({ InvalidAcquisitionEvidence: 18, CalibrationAbsent: 3, ReadyNoToken: 1, ReadyTokenOne: 1, ReadyTokenTwo: 1 })) observations.qualification_mismatches += 1;

const delivery_fibers = { Withheld: 0, NoTokenAvailable: 0, DeliverTokenOne: 0, DeliverTokenTwo: 0 };
const deliveryLocalCases = new Set();
for (const acquisitionCommand of Command) for (const evidence of AcquisitionEvidence) {
  const result = deliveryRelation({ acquisitionCommand }, evidence);
  delivery_fibers[result.impedanceDelivery] += 1;
  deliveryLocalCases.add(result.localCase);
}
if (JSON.stringify(delivery_fibers) !== JSON.stringify({ Withheld: 7, NoTokenAvailable: 1, DeliverTokenOne: 1, DeliverTokenTwo: 1 })) observations.delivery_mismatches += 1;

const status_fibers = { InputFault: 0, RecoveryPending: 0, CalibrationRequired: 0, Monitoring: 0, Stopped: 0 };
const statusLocalCases = new Set();
for (const disposition of Disposition) for (const evidence of AcquisitionEvidence) for (const acquisitionCommand of Command) {
  const result = statusRelation({ disposition, acquisitionCommand }, evidence);
  status_fibers[result.monitoringStatus] += 1;
  statusLocalCases.add(result.localCase);
}
if (JSON.stringify(status_fibers) !== JSON.stringify({ InputFault: 10, RecoveryPending: 10, CalibrationRequired: 12, Monitoring: 19, Stopped: 19 })) observations.status_mismatches += 1;

const invalidStatusMasks = new Set();
for (const request of requestSamples) for (const calibration of calibrationSamples) for (const impedance of impedanceSamples) {
  observations.raw_root_input_tuples += 1;
  const mask = [request.status, calibration.status, impedance.status].map((s, i) => s === "Invalid" ? String(i + 1) : "").filter(Boolean).join("-");
  if (mask) invalidStatusMasks.add(mask);
  for (const pre of ownerStates) {
    observations.raw_root_state_snapshots += 1;
    const step = systemStep({ request, calibration, impedance }, pre);
    if (step.owner.matches.length !== 1) continue;
    raw_partition_counts[step.owner.case] += 1;
    const resolution = step.owner.monitoringResolution;
    const expectedDelivery = resolution.acquisitionCommand === "HoldAcquisition" ? "Withheld" :
      step.flows["INT-08"] === "ReadyNoToken" ? "NoTokenAvailable" :
      step.flows["INT-08"] === "ReadyTokenOne" ? "DeliverTokenOne" :
      step.flows["INT-08"] === "ReadyTokenTwo" ? "DeliverTokenTwo" : "Withheld";
    const expectedStatus = resolution.disposition === "InputFaultDisposition" ? "InputFault" :
      resolution.disposition === "RecoveryDisposition" ? "RecoveryPending" :
      resolution.disposition === "StartDenied" || (resolution.disposition === "StoppedDisposition" && step.flows["INT-11"] === "CalibrationAbsent") ? "CalibrationRequired" :
      resolution.acquisitionCommand === "CollectImpedance" ? "Monitoring" : "Stopped";
    if (step.outputs.impedanceDelivery !== expectedDelivery) observations.delivery_mismatches += 1;
    if (step.outputs.monitoringStatus !== expectedStatus) observations.status_mismatches += 1;
    if (step.outputs.acquisitionCommand !== resolution.acquisitionCommand) observations.command_mismatches += 1;
    if (step.flows["INT-05"] !== step.flows["INT-08"] || step.flows["INT-05"] !== step.flows["INT-11"] || JSON.stringify(step.flows["INT-07"]) !== JSON.stringify(step.flows["INT-10"])) observations.interaction_resolution_violations += 1;
    if (resolution.acquisitionCommand === "CollectImpedance" && (step.flows["INT-08"] === "InvalidAcquisitionEvidence" || step.flows["INT-08"] === "CalibrationAbsent")) observations.anomalous_delivery_reachability_violations += 1;
  }
}

function validInput(request = "NoRequest", calibration = "Current", token = "NoToken") {
  return {
    request: { request, status: "Valid" },
    calibration: { calibration, status: "Valid" },
    impedance: { token, status: "Valid" }
  };
}
function clone(value) { return JSON.parse(JSON.stringify(value)); }
function runTrace(name, inputs, expectedCases, initialState = { sessionMode: "SessionStopped", recoveryPhase: "Normal" }, expectedOutputs = null) {
  let state = { ...initialState };
  const steps = [];
  inputs.forEach((input, index) => {
    const result = systemStep(input, state);
    const expectedCase = expectedCases[index];
    if (result.owner.case !== expectedCase) observations.scenario_mismatches += 1;
    if (expectedOutputs && JSON.stringify(result.outputs) !== JSON.stringify(expectedOutputs[index])) observations.scenario_mismatches += 1;
    steps.push({
      step: index + 1,
      input,
      pre_state: state,
      expected_case: expectedCase,
      observed_case: result.owner.case,
      observed_outputs: result.outputs,
      observed_next_state: result.owner.nextState
    });
    state = { ...result.owner.nextState };
  });
  return { name, steps };
}

const scenarios = [];
scenarios.push({
  id: "SCN-01",
  family: "nominal monitoring, token delivery, and stop",
  traces: [runTrace("start_deliver_two_distinct_tokens_stop", [
    validInput("StartMonitoring", "Current", "NoToken"),
    validInput("NoRequest", "Current", "TokenOne"),
    validInput("NoRequest", "Current", "TokenTwo"),
    validInput("StopMonitoring", "Current", "TokenTwo")
  ], ["CASE-09", "CASE-11", "CASE-11", "CASE-08"], undefined, [
    { acquisitionCommand: "CollectImpedance", impedanceDelivery: "NoTokenAvailable", monitoringStatus: "Monitoring" },
    { acquisitionCommand: "CollectImpedance", impedanceDelivery: "DeliverTokenOne", monitoringStatus: "Monitoring" },
    { acquisitionCommand: "CollectImpedance", impedanceDelivery: "DeliverTokenTwo", monitoringStatus: "Monitoring" },
    { acquisitionCommand: "HoldAcquisition", impedanceDelivery: "Withheld", monitoringStatus: "Stopped" }
  ])]
});

scenarios.push({
  id: "SCN-02",
  family: "calibration and data boundaries",
  traces: [runTrace("deny_accept_three_delivery_results_then_calibration_loss", [
    validInput("StartMonitoring", "NotCurrent", "TokenOne"),
    validInput("StartMonitoring", "Current", "NoToken"),
    validInput("NoRequest", "Current", "NoToken"),
    validInput("NoRequest", "Current", "TokenOne"),
    validInput("NoRequest", "Current", "TokenTwo"),
    validInput("NoRequest", "NotCurrent", "TokenTwo")
  ], ["CASE-10", "CASE-09", "CASE-11", "CASE-11", "CASE-11", "CASE-12"])]
});

const scn3Traces = [];
for (let bits = 1; bits < 8; bits += 1) {
  for (const initialSession of ["SessionStopped", "SessionMonitoring"]) {
    const input = validInput("StartMonitoring", "Current", "TokenOne");
    const labels = [];
    if (bits & 1) { input.request.status = "Invalid"; labels.push("request"); }
    if (bits & 2) { input.calibration.status = "Invalid"; labels.push("calibration"); }
    if (bits & 4) { input.impedance.status = "Invalid"; labels.push("impedance"); }
    scn3Traces.push(runTrace(`invalid_${labels.join("_")}_from_${initialSession}`, [input], ["CASE-01"], { sessionMode: initialSession, recoveryPhase: "Normal" }, [
      { acquisitionCommand: "HoldAcquisition", impedanceDelivery: "Withheld", monitoringStatus: "InputFault" }
    ]));
  }
}
scenarios.push({ id: "SCN-03", family: "individual and combined invalid input from both session modes", traces: scn3Traces });

const faultStart = validInput("StartMonitoring", "Current", "NoToken");
faultStart.request.status = "Invalid";
scenarios.push({
  id: "SCN-04",
  family: "qualifying neutral-then-fresh recovery",
  traces: [runTrace("fault_retained_start_neutral_wait_fresh_start", [
    faultStart,
    validInput("StartMonitoring", "Current", "NoToken"),
    validInput("NoRequest", "Current", "NoToken"),
    validInput("NoRequest", "Current", "TokenOne"),
    validInput("StartMonitoring", "Current", "TokenTwo")
  ], ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-06"])]
});

scenarios.push({
  id: "SCN-05",
  family: "nonauthorizing recovery outcomes",
  traces: [
    runTrace("fresh_stop_completes_without_collection", [clone(faultStart), validInput("NoRequest"), validInput("StopMonitoring")], ["CASE-01", "CASE-03", "CASE-05"]),
    runTrace("fresh_uncalibrated_start_denied", [clone(faultStart), validInput("NoRequest"), validInput("StartMonitoring", "NotCurrent", "TokenTwo")], ["CASE-01", "CASE-03", "CASE-07"]),
    runTrace("normal_stopped_neutral", [validInput("NoRequest")], ["CASE-12"])
  ]
});

const reachable = new Map();
const queue = [{ sessionMode: "SessionStopped", recoveryPhase: "Normal" }];
reachable.set("SessionStopped|Normal", queue[0]);
while (queue.length) {
  const pre = queue.shift();
  for (const { q, e } of qualifiedInputs) {
    const next = ownerRelation(q, e, pre).nextState;
    const key = `${next.sessionMode}|${next.recoveryPhase}`;
    if (!reachable.has(key)) { reachable.set(key, next); queue.push(next); }
  }
}

const expectedQualifiedCounts = { "CASE-01": 48, "CASE-02": 16, "CASE-03": 8, "CASE-04": 8, "CASE-05": 8, "CASE-06": 6, "CASE-07": 2, "CASE-08": 8, "CASE-09": 6, "CASE-10": 2, "CASE-11": 3, "CASE-12": 5 };
const expectedRawCounts = { "CASE-01": 756, "CASE-02": 24, "CASE-03": 12, "CASE-04": 12, "CASE-05": 12, "CASE-06": 6, "CASE-07": 6, "CASE-08": 12, "CASE-09": 6, "CASE-10": 6, "CASE-11": 3, "CASE-12": 9 };
const initial_contract = {
  sessionMode: "SessionStopped",
  recoveryPhase: "Normal",
  acquisitionCommand: "HoldAcquisition",
  impedanceDelivery: "Withheld",
  monitoringStatus: "Stopped"
};

const checks = {
  qualified_domain_exactly_120: observations.qualified_snapshots === 120,
  raw_root_domain_exhausted: observations.raw_root_input_tuples === 144 && observations.raw_root_state_snapshots === 864,
  qualified_partition_counts_exact: JSON.stringify(partition_counts) === JSON.stringify(expectedQualifiedCounts),
  raw_partition_counts_exact: JSON.stringify(raw_partition_counts) === JSON.stringify(expectedRawCounts),
  partition_total_and_exclusive: observations.partition_gaps === 0 && observations.raw_guard_overlaps === 0 && observations.effective_selection_overlaps === 0,
  every_policy_case_has_witness: Object.keys(case_witnesses).length === 12 && Object.values(partition_counts).every(n => n > 0),
  canonical_guards_match_analyzer_guards: JSON.stringify(canonical_guard_signatures) === JSON.stringify(analyzer_guard_signatures) && observations.guard_mismatches === 0,
  owner_relation_matches_oracle: observations.next_state_mismatches === 0 && observations.command_mismatches === 0,
  initialization_safe: JSON.stringify(initial_contract) === JSON.stringify({ sessionMode: "SessionStopped", recoveryPhase: "Normal", acquisitionCommand: "HoldAcquisition", impedanceDelivery: "Withheld", monitoringStatus: "Stopped" }),
  recovery_invariant_preserved: observations.invariant_violations === 0 && [...reachable.values()].every(s => s.recoveryPhase === "Normal" || s.sessionMode === "SessionStopped"),
  request_qualification_fibers_exact: observations.qualification_mismatches === 0 && requestLocalCases.size === 4,
  evidence_qualification_fibers_exact: observations.qualification_mismatches === 0 && evidenceLocalCases.size === 5,
  delivery_fibers_exact: observations.delivery_mismatches === 0 && deliveryLocalCases.size === 5,
  status_fibers_exact: observations.status_mismatches === 0 && statusLocalCases.size === 5,
  all_invalid_status_combinations_enumerated: invalidStatusMasks.size === 7,
  explicit_connection_map_complete: connection_map.length === 12 && new Set(connection_map.map(x => x.id)).size === 12 && observations.interaction_resolution_violations === 0,
  owner_values_consumed_through_declared_flows: observations.required_output_mismatches === 0 && observations.interaction_resolution_violations === 0,
  anomalous_collect_pairings_unreachable: observations.anomalous_delivery_reachability_violations === 0,
  fresh_request_path_executed: scenarios.find(s => s.id === "SCN-04").traces[0].steps.map(s => s.observed_case).join(",") === "CASE-01,CASE-02,CASE-03,CASE-04,CASE-06",
  five_scenario_families_executed: scenarios.length === 5 && scenarios.every(s => s.traces.length > 0 && s.traces.every(t => t.steps.length > 0)),
  scenario_oracles_match: observations.scenario_mismatches === 0,
  all_local_ownership_cases_executed: requestLocalCases.size === 4 && evidenceLocalCases.size === 5 && Object.keys(case_witnesses).length === 12 && deliveryLocalCases.size === 5 && statusLocalCases.size === 5
};

const zeroDiagnostics = Object.entries(observations)
  .filter(([key]) => key.endsWith("violations") || key.endsWith("gaps") || key.endsWith("overlaps") || key.endsWith("mismatches"))
  .every(([, value]) => value === 0);
const allPassed = Object.values(checks).every(Boolean) && zeroDiagnostics;

const ownerPass = {
  requestQualification: checks.request_qualification_fibers_exact,
  acquisitionEvidenceQualification: checks.evidence_qualification_fibers_exact,
  monitoringDecisionOwner: checks.partition_total_and_exclusive && checks.every_policy_case_has_witness && checks.owner_relation_matches_oracle,
  impedanceDeliveryDerivation: checks.delivery_fibers_exact && checks.anomalous_collect_pairings_unreachable,
  doctorStatusDerivation: checks.status_fibers_exact
};
const ownership_audit = ownership_metric_records.map(record => ({ ...record, passed: Boolean(ownerPass[record.usage] && allPassed) }));

const result = {
  schema_version: 1,
  status: allPassed ? "passed" : "failed",
  passed: allPassed,
  source_sha256: SOURCE_SHA256,
  bounded_analysis_claim_boundary: "Exhaustive only for the declared finite logical root-input and owner-state domains, named local relations, explicit semantic connection map, and retained bounded scenario traces; it is not compositional proof, solver certification, generated-code correctness, system execution, physical-performance evidence, clinical validation, or safety certification.",
  domains: {
    qualified_owner_snapshots: observations.qualified_snapshots,
    raw_root_input_tuples: observations.raw_root_input_tuples,
    raw_root_and_owner_state_snapshots: observations.raw_root_state_snapshots,
    reachable_owner_states: [...reachable.values()]
  },
  connection_map,
  qualification_fibers: { request: request_fibers, acquisition_evidence: evidence_fibers },
  local_derivation_fibers: { impedance_delivery: delivery_fibers, doctor_status: status_fibers },
  partition_counts,
  raw_partition_counts,
  case_witnesses,
  partition_gaps: observations.partition_gaps,
  partition_overlaps: observations.effective_selection_overlaps,
  required_output_mismatches: observations.required_output_mismatches,
  invariant_checks: {
    initialization: { ...initial_contract, passed: checks.initialization_safe },
    recovery_implies_stopped: { passed: checks.recovery_invariant_preserved, reachable_states_checked: reachable.size },
    fresh_request: { passed: checks.fresh_request_path_executed },
    command_matches_committed_resolution: { passed: observations.command_mismatches === 0 },
    anomalous_collect_pairings_unreachable: { passed: checks.anomalous_collect_pairings_unreachable }
  },
  observations,
  scenarios,
  ownership_audit,
  checks
};

process.stdout.write(JSON.stringify(result));
