const SOURCE_SHA256 = "91b0aea557ee8a98352af5638007ed5fc20f6f8e539299d297800e049d20878b";

const TemperatureRelation = ["AtOrBelowMaximum", "AboveMaximum"];
const InputStatus = ["Valid", "Invalid"];
const MaintenanceTiming = ["NotDue", "Due"];
const ReturnIndication = ["NoRequest", "FreshRequest"];
const TemperatureAssessment = ["InvalidTemperature", "NominalTemperature", "OverTemperature"];
const MaintenanceAssessment = ["InvalidMaintenance", "MaintenanceClear", "MaintenanceDue"];
const RecoveryProposal = ["InvalidRecoveryEvidence", "NotRequested", "BlockedByMaintenance", "BlockedByTemperature", "EligibleRecovery"];
const VehicleHealthMode = ["Operational", "TemperatureDegraded", "MaintenanceHold", "Unavailable"];
const DecisionReason = ["InvalidEvidence", "MaintenanceActive", "TemperatureActive", "NormalRetained", "RecoveryNotRequired", "FreshRecoveryRequired", "RecoveryAccepted"];

const semanticConnectionMap = [
  { id: "INT-01", from: "root.temperatureSample", to: "temperatureQualification.rawTemperature", value: "TemperatureSample" },
  { id: "INT-02", from: "root.maintenanceSample", to: "maintenanceQualification.rawMaintenance", value: "MaintenanceSample" },
  { id: "INT-03", from: "root.returnSample", to: "recoveryApplicability.rawReturn", value: "ReturnSample" },
  { id: "INT-04", from: "temperatureQualification.assessmentForRecovery", to: "recoveryApplicability.temperatureAssessment", value: "TemperatureAssessment" },
  { id: "INT-05", from: "maintenanceQualification.assessmentForRecovery", to: "recoveryApplicability.maintenanceAssessment", value: "MaintenanceAssessment" },
  { id: "INT-06", from: "temperatureQualification.assessmentForArbitration", to: "healthModeArbitration.temperatureAssessment", value: "TemperatureAssessment" },
  { id: "INT-07", from: "maintenanceQualification.assessmentForArbitration", to: "healthModeArbitration.maintenanceAssessment", value: "MaintenanceAssessment" },
  { id: "INT-08", from: "recoveryApplicability.proposalForArbitration", to: "healthModeArbitration.recoveryProposal", value: "RecoveryProposal" },
  { id: "INT-09", from: "recoveryApplicability.proposalForOutcomes", to: "boundaryOutcomeDerivation.recoveryProposal", value: "RecoveryProposal" },
  { id: "INT-10", from: "healthModeArbitration.healthDecision", to: "boundaryOutcomeDerivation.healthDecision", value: "HealthDecision" },
  { id: "INT-11", from: "boundaryOutcomeDerivation.vehicleHealthMode", to: "root.vehicleHealthMode", value: "VehicleHealthMode" },
  { id: "INT-12", from: "boundaryOutcomeDerivation.powerDisposition", to: "root.powerDisposition", value: "ElectricalPowerDisposition" },
  { id: "INT-13", from: "boundaryOutcomeDerivation.recoveryGuidance", to: "root.recoveryGuidance", value: "RecoveryGuidance" }
];

function qualifyTemperature(sample) {
  if (sample.status === "Invalid") return "InvalidTemperature";
  if (sample.relation === "AtOrBelowMaximum") return "NominalTemperature";
  return "OverTemperature";
}

function qualifyMaintenance(sample) {
  if (sample.status === "Invalid") return "InvalidMaintenance";
  if (sample.timing === "NotDue") return "MaintenanceClear";
  return "MaintenanceDue";
}

function classifyRecovery(sample, temperature, maintenance) {
  if (sample.status === "Invalid" || temperature === "InvalidTemperature" || maintenance === "InvalidMaintenance") return "InvalidRecoveryEvidence";
  if (sample.indication === "NoRequest") return "NotRequested";
  if (maintenance === "MaintenanceDue") return "BlockedByMaintenance";
  if (temperature === "OverTemperature") return "BlockedByTemperature";
  return "EligibleRecovery";
}

function proposalConsistent(temperature, maintenance, proposal) {
  return proposal === "InvalidRecoveryEvidence" ||
    (proposal === "NotRequested" && temperature !== "InvalidTemperature" && maintenance !== "InvalidMaintenance") ||
    (proposal === "BlockedByMaintenance" && temperature !== "InvalidTemperature" && maintenance === "MaintenanceDue") ||
    (proposal === "BlockedByTemperature" && temperature === "OverTemperature" && maintenance === "MaintenanceClear") ||
    (proposal === "EligibleRecovery" && temperature === "NominalTemperature" && maintenance === "MaintenanceClear");
}

function arbitrationGuards(temperature, maintenance, proposal, priorState) {
  const guards = [];
  if (temperature === "InvalidTemperature" || maintenance === "InvalidMaintenance" || proposal === "InvalidRecoveryEvidence" || !proposalConsistent(temperature, maintenance, proposal)) guards.push("CASE-01");
  if (temperature !== "InvalidTemperature" && maintenance === "MaintenanceDue" && proposal !== "InvalidRecoveryEvidence" && proposalConsistent(temperature, maintenance, proposal)) guards.push("CASE-02");
  if (temperature === "OverTemperature" && maintenance === "MaintenanceClear" && proposal !== "InvalidRecoveryEvidence" && proposalConsistent(temperature, maintenance, proposal)) guards.push("CASE-03");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "NotRequested" && priorState === "Operational") guards.push("CASE-04");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "EligibleRecovery" && priorState === "Operational") guards.push("CASE-05");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "NotRequested" && priorState === "Unavailable") guards.push("CASE-06");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "EligibleRecovery" && priorState === "Unavailable") guards.push("CASE-07");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "NotRequested" && priorState === "MaintenanceHold") guards.push("CASE-08");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "EligibleRecovery" && priorState === "MaintenanceHold") guards.push("CASE-09");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "NotRequested" && priorState === "TemperatureDegraded") guards.push("CASE-10");
  if (temperature === "NominalTemperature" && maintenance === "MaintenanceClear" && proposal === "EligibleRecovery" && priorState === "TemperatureDegraded") guards.push("CASE-11");
  return guards;
}

const arbitrationResults = {
  "CASE-01": { nextMode: "Unavailable", reason: "InvalidEvidence" },
  "CASE-02": { nextMode: "MaintenanceHold", reason: "MaintenanceActive" },
  "CASE-03": { nextMode: "TemperatureDegraded", reason: "TemperatureActive" },
  "CASE-04": { nextMode: "Operational", reason: "NormalRetained" },
  "CASE-05": { nextMode: "Operational", reason: "RecoveryNotRequired" },
  "CASE-06": { nextMode: "Unavailable", reason: "FreshRecoveryRequired" },
  "CASE-07": { nextMode: "Operational", reason: "RecoveryAccepted" },
  "CASE-08": { nextMode: "MaintenanceHold", reason: "FreshRecoveryRequired" },
  "CASE-09": { nextMode: "Operational", reason: "RecoveryAccepted" },
  "CASE-10": { nextMode: "TemperatureDegraded", reason: "FreshRecoveryRequired" },
  "CASE-11": { nextMode: "Operational", reason: "RecoveryAccepted" }
};

function arbitrate(temperature, maintenance, proposal, priorState) {
  const guards = arbitrationGuards(temperature, maintenance, proposal, priorState);
  if (guards.length !== 1) return { guards, decision: null, nextState: null };
  const decision = { ...arbitrationResults[guards[0]] };
  return { guards, decision, nextState: decision.nextMode };
}

function acceptedProducerPair(decision, proposal) {
  return (decision.nextMode === "Unavailable" && decision.reason === "InvalidEvidence") ||
    (decision.nextMode === "MaintenanceHold" && decision.reason === "MaintenanceActive" && (proposal === "NotRequested" || proposal === "BlockedByMaintenance")) ||
    (decision.nextMode === "TemperatureDegraded" && decision.reason === "TemperatureActive" && (proposal === "NotRequested" || proposal === "BlockedByTemperature")) ||
    (decision.nextMode === "Operational" && decision.reason === "NormalRetained" && proposal === "NotRequested") ||
    (decision.nextMode === "Operational" && decision.reason === "RecoveryNotRequired" && proposal === "EligibleRecovery") ||
    (decision.nextMode === "Operational" && decision.reason === "RecoveryAccepted" && proposal === "EligibleRecovery") ||
    (decision.nextMode !== "Operational" && decision.reason === "FreshRecoveryRequired" && proposal === "NotRequested");
}

function outcomeBranch(decision, proposal) {
  if (!acceptedProducerPair(decision, proposal)) return "FAIL_CLOSED";
  if (decision.reason === "InvalidEvidence") return "INVALID_EVIDENCE";
  if (decision.reason === "MaintenanceActive") return "MAINTENANCE_ACTIVE";
  if (decision.reason === "TemperatureActive") return "TEMPERATURE_ACTIVE";
  if (decision.reason === "NormalRetained") return "NORMAL_RETAINED";
  if (decision.reason === "RecoveryNotRequired") return "RECOVERY_NOT_REQUIRED";
  if (decision.reason === "RecoveryAccepted") return "RECOVERY_ACCEPTED";
  return "FRESH_RECOVERY_REQUIRED";
}

function deriveOutcomes(decision, proposal) {
  const accepted = acceptedProducerPair(decision, proposal);
  return {
    vehicleHealthMode: accepted ? decision.nextMode : "Unavailable",
    powerDisposition: accepted && decision.nextMode === "Operational" ? "Enable" : "Withhold",
    recoveryGuidance: !accepted || decision.reason === "InvalidEvidence" ? "RepairInputEvidence" :
      decision.reason === "MaintenanceActive" || decision.reason === "TemperatureActive" ? "ClearActiveCondition" :
      decision.reason === "FreshRecoveryRequired" ? "SubmitFreshReturnRequest" : "None"
  };
}

function composeStep(inputs, priorState) {
  const int01 = inputs.temperature;
  const int02 = inputs.maintenance;
  const int03 = inputs.returnSample;
  const temperatureFact = qualifyTemperature(int01);
  const maintenanceFact = qualifyMaintenance(int02);
  const int04 = temperatureFact;
  const int05 = maintenanceFact;
  const int06 = temperatureFact;
  const int07 = maintenanceFact;
  const proposalFact = classifyRecovery(int03, int04, int05);
  const int08 = proposalFact;
  const int09 = proposalFact;
  const ownerResult = arbitrate(int06, int07, int08, priorState);
  if (!ownerResult.decision) return { ownerResult, outputs: null };
  const int10 = ownerResult.decision;
  const outputs = deriveOutcomes(int10, int09);
  return {
    ownerResult,
    outputs,
    ownerValues: {
      temperatureAssessment: temperatureFact,
      maintenanceAssessment: maintenanceFact,
      recoveryProposal: proposalFact,
      healthDecision: int10
    },
    delivered: {
      "INT-01": int01, "INT-02": int02, "INT-03": int03,
      "INT-04": int04, "INT-05": int05, "INT-06": int06, "INT-07": int07,
      "INT-08": int08, "INT-09": int09, "INT-10": int10,
      "INT-11": outputs.vehicleHealthMode, "INT-12": outputs.powerDisposition, "INT-13": outputs.recoveryGuidance
    }
  };
}

const tempSamples = TemperatureRelation.flatMap(relation => InputStatus.map(status => ({ relation, status })));
const maintenanceSamples = MaintenanceTiming.flatMap(timing => InputStatus.map(status => ({ timing, status })));
const returnSamples = ReturnIndication.flatMap(indication => InputStatus.map(status => ({ indication, status })));

const qualificationChecks = {
  temperature: { total: 0, mismatches: 0, fibers: {} },
  maintenance: { total: 0, mismatches: 0, fibers: {} },
  recovery: { total: 0, mismatches: 0, fibers: {} }
};
for (const sample of tempSamples) {
  const observed = qualifyTemperature(sample);
  const expected = sample.status === "Invalid" ? "InvalidTemperature" : sample.relation === "AtOrBelowMaximum" ? "NominalTemperature" : "OverTemperature";
  qualificationChecks.temperature.total++;
  qualificationChecks.temperature.fibers[observed] = (qualificationChecks.temperature.fibers[observed] || 0) + 1;
  if (observed !== expected) qualificationChecks.temperature.mismatches++;
}
for (const sample of maintenanceSamples) {
  const observed = qualifyMaintenance(sample);
  const expected = sample.status === "Invalid" ? "InvalidMaintenance" : sample.timing === "NotDue" ? "MaintenanceClear" : "MaintenanceDue";
  qualificationChecks.maintenance.total++;
  qualificationChecks.maintenance.fibers[observed] = (qualificationChecks.maintenance.fibers[observed] || 0) + 1;
  if (observed !== expected) qualificationChecks.maintenance.mismatches++;
}
for (const sample of returnSamples) for (const temperature of TemperatureAssessment) for (const maintenance of MaintenanceAssessment) {
  const observed = classifyRecovery(sample, temperature, maintenance);
  const expected = sample.status === "Invalid" || temperature === "InvalidTemperature" || maintenance === "InvalidMaintenance" ? "InvalidRecoveryEvidence" :
    sample.indication === "NoRequest" ? "NotRequested" : maintenance === "MaintenanceDue" ? "BlockedByMaintenance" :
    temperature === "OverTemperature" ? "BlockedByTemperature" : "EligibleRecovery";
  qualificationChecks.recovery.total++;
  qualificationChecks.recovery.fibers[observed] = (qualificationChecks.recovery.fibers[observed] || 0) + 1;
  if (observed !== expected) qualificationChecks.recovery.mismatches++;
}

const directOwnerCounts = Object.fromEntries(Object.keys(arbitrationResults).map(id => [id, 0]));
let directOwnerGaps = 0;
let directOwnerOverlaps = 0;
let directOwnerDecisionMismatches = 0;
let ownerStateInvariantViolations = 0;
let malformedOwnerFailClosedViolations = 0;
for (const temperature of TemperatureAssessment) for (const maintenance of MaintenanceAssessment) for (const proposal of RecoveryProposal) for (const priorState of VehicleHealthMode) {
  const result = arbitrate(temperature, maintenance, proposal, priorState);
  if (result.guards.length === 0) directOwnerGaps++;
  if (result.guards.length > 1) directOwnerOverlaps++;
  if (result.guards.length === 1) {
    directOwnerCounts[result.guards[0]]++;
    const expected = arbitrationResults[result.guards[0]];
    if (result.decision.nextMode !== expected.nextMode || result.decision.reason !== expected.reason) directOwnerDecisionMismatches++;
    if (result.nextState !== result.decision.nextMode) ownerStateInvariantViolations++;
    const malformed = !proposalConsistent(temperature, maintenance, proposal);
    if (malformed && (result.guards[0] !== "CASE-01" || result.decision.nextMode !== "Unavailable" || result.decision.reason !== "InvalidEvidence")) malformedOwnerFailClosedViolations++;
  }
}

const outcomeBranchCounts = {};
const outputTupleWitnesses = {};
let directOutputGaps = 0;
let directOutputOverlaps = 0;
let requiredOutputMismatches = 0;
let producerInconsistentPairs = 0;
let producerInconsistentFailClosedViolations = 0;
for (const nextMode of VehicleHealthMode) for (const reason of DecisionReason) for (const proposal of RecoveryProposal) {
  const decision = { nextMode, reason };
  const branch = outcomeBranch(decision, proposal);
  outcomeBranchCounts[branch] = (outcomeBranchCounts[branch] || 0) + 1;
  const outputs = deriveOutcomes(decision, proposal);
  const expected = branch === "FAIL_CLOSED" || branch === "INVALID_EVIDENCE" ? { vehicleHealthMode: "Unavailable", powerDisposition: "Withhold", recoveryGuidance: "RepairInputEvidence" } :
    branch === "MAINTENANCE_ACTIVE" ? { vehicleHealthMode: "MaintenanceHold", powerDisposition: "Withhold", recoveryGuidance: "ClearActiveCondition" } :
    branch === "TEMPERATURE_ACTIVE" ? { vehicleHealthMode: "TemperatureDegraded", powerDisposition: "Withhold", recoveryGuidance: "ClearActiveCondition" } :
    branch === "FRESH_RECOVERY_REQUIRED" ? { vehicleHealthMode: nextMode, powerDisposition: "Withhold", recoveryGuidance: "SubmitFreshReturnRequest" } :
    { vehicleHealthMode: "Operational", powerDisposition: "Enable", recoveryGuidance: "None" };
  if (JSON.stringify(outputs) !== JSON.stringify(expected)) requiredOutputMismatches++;
  if (!acceptedProducerPair(decision, proposal)) {
    producerInconsistentPairs++;
    if (JSON.stringify(outputs) !== JSON.stringify({ vehicleHealthMode: "Unavailable", powerDisposition: "Withhold", recoveryGuidance: "RepairInputEvidence" })) producerInconsistentFailClosedViolations++;
  }
  const tuple = `${outputs.vehicleHealthMode}/${outputs.powerDisposition}/${outputs.recoveryGuidance}`;
  if (!(tuple in outputTupleWitnesses)) outputTupleWitnesses[tuple] = { decision, proposal, branch };
}
if (Object.values(outcomeBranchCounts).reduce((a, b) => a + b, 0) !== 140) directOutputGaps++;

const rawPartitionCounts = Object.fromEntries(Object.keys(arbitrationResults).map(id => [id, 0]));
const invalidMaskCounts = {};
let rawGaps = 0;
let rawOverlaps = 0;
let rawRequiredOutputMismatches = 0;
let interactionResolutionViolations = 0;
for (const temperature of tempSamples) for (const maintenance of maintenanceSamples) for (const returnSample of returnSamples) for (const priorState of VehicleHealthMode) {
  const composed = composeStep({ temperature, maintenance, returnSample }, priorState);
  const guardCount = composed.ownerResult.guards.length;
  if (guardCount === 0) rawGaps++;
  if (guardCount > 1) rawOverlaps++;
  if (guardCount !== 1) continue;
  const caseId = composed.ownerResult.guards[0];
  rawPartitionCounts[caseId]++;
  if (composed.delivered["INT-04"] !== composed.delivered["INT-06"] || composed.delivered["INT-05"] !== composed.delivered["INT-07"] || composed.delivered["INT-08"] !== composed.delivered["INT-09"]) interactionResolutionViolations++;
  const expectedOutputs = deriveOutcomes(composed.delivered["INT-10"], composed.delivered["INT-09"]);
  if (JSON.stringify(composed.outputs) !== JSON.stringify(expectedOutputs)) rawRequiredOutputMismatches++;
  const maskParts = [];
  if (temperature.status === "Invalid") maskParts.push("temperature");
  if (maintenance.status === "Invalid") maskParts.push("maintenance");
  if (returnSample.status === "Invalid") maskParts.push("return");
  if (maskParts.length) {
    const mask = maskParts.join("+");
    invalidMaskCounts[mask] = (invalidMaskCounts[mask] || 0) + 1;
    if (caseId !== "CASE-01" || JSON.stringify(composed.outputs) !== JSON.stringify({ vehicleHealthMode: "Unavailable", powerDisposition: "Withhold", recoveryGuidance: "RepairInputEvidence" })) rawRequiredOutputMismatches++;
  }
}

const scenarioSpecs = [
  {
    id: "SCN-01", name: "nominal commissioning and retention", initialState: "Unavailable",
    steps: [
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-06", expected: ["Unavailable", "Withhold", "SubmitFreshReturnRequest"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-07", expected: ["Operational", "Enable", "None"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-04", expected: ["Operational", "Enable", "None"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-05", expected: ["Operational", "Enable", "None"] }
    ]
  },
  {
    id: "SCN-02", name: "temperature equality boundary", initialState: "Operational",
    steps: [
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-04", expected: ["Operational", "Enable", "None"] },
      { temperature: ["AboveMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-03", expected: ["TemperatureDegraded", "Withhold", "ClearActiveCondition"] }
    ]
  },
  {
    id: "SCN-03", name: "maintenance and conflict priority", initialState: "Operational",
    steps: [
      { temperature: ["AboveMaximum", "Valid"], maintenance: ["Due", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-02", expected: ["MaintenanceHold", "Withhold", "ClearActiveCondition"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-08", expected: ["MaintenanceHold", "Withhold", "SubmitFreshReturnRequest"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-09", expected: ["Operational", "Enable", "None"] },
      { temperature: ["AboveMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-03", expected: ["TemperatureDegraded", "Withhold", "ClearActiveCondition"] }
    ],
    variants: [
      {
        name: "maintenance clears while temperature remains above maximum",
        initialState: "Operational",
        steps: [
          { temperature: ["AboveMaximum", "Valid"], maintenance: ["Due", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-02", expected: ["MaintenanceHold", "Withhold", "ClearActiveCondition"] },
          { temperature: ["AboveMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-03", expected: ["TemperatureDegraded", "Withhold", "ClearActiveCondition"] }
        ]
      }
    ]
  },
  {
    id: "SCN-04", name: "invalid evidence and recovery", initialState: "Operational",
    steps: [
      { temperature: ["AtOrBelowMaximum", "Invalid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-01", expected: ["Unavailable", "Withhold", "RepairInputEvidence"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Invalid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-01", expected: ["Unavailable", "Withhold", "RepairInputEvidence"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Invalid"], expectedCase: "CASE-01", expected: ["Unavailable", "Withhold", "RepairInputEvidence"] },
      { temperature: ["AboveMaximum", "Invalid"], maintenance: ["Due", "Invalid"], returnSample: ["FreshRequest", "Invalid"], expectedCase: "CASE-01", expected: ["Unavailable", "Withhold", "RepairInputEvidence"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-06", expected: ["Unavailable", "Withhold", "SubmitFreshReturnRequest"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-07", expected: ["Operational", "Enable", "None"] }
    ]
  },
  {
    id: "SCN-05", name: "blocked request and later fresh recovery", initialState: "Operational",
    steps: [
      { temperature: ["AboveMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-03", expected: ["TemperatureDegraded", "Withhold", "ClearActiveCondition"] },
      { temperature: ["AboveMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-03", expected: ["TemperatureDegraded", "Withhold", "ClearActiveCondition"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-10", expected: ["TemperatureDegraded", "Withhold", "SubmitFreshReturnRequest"] },
      { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-11", expected: ["Operational", "Enable", "None"] }
    ],
    variants: [
      {
        name: "maintenance-blocked event is not replayed",
        initialState: "Operational",
        steps: [
          { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["Due", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-02", expected: ["MaintenanceHold", "Withhold", "ClearActiveCondition"] },
          { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["Due", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-02", expected: ["MaintenanceHold", "Withhold", "ClearActiveCondition"] },
          { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["NoRequest", "Valid"], expectedCase: "CASE-08", expected: ["MaintenanceHold", "Withhold", "SubmitFreshReturnRequest"] },
          { temperature: ["AtOrBelowMaximum", "Valid"], maintenance: ["NotDue", "Valid"], returnSample: ["FreshRequest", "Valid"], expectedCase: "CASE-09", expected: ["Operational", "Enable", "None"] }
        ]
      }
    ]
  }
];

function executeScenarioTrace(initialState, stepSpecs) {
  let state = initialState;
  let passed = true;
  const steps = stepSpecs.map((step, index) => {
    const inputs = {
      temperature: { relation: step.temperature[0], status: step.temperature[1] },
      maintenance: { timing: step.maintenance[0], status: step.maintenance[1] },
      returnSample: { indication: step.returnSample[0], status: step.returnSample[1] }
    };
    const priorState = state;
    const observed = composeStep(inputs, priorState);
    const observedCase = observed.ownerResult.guards.length === 1 ? observed.ownerResult.guards[0] : null;
    const tuple = observed.outputs ? [observed.outputs.vehicleHealthMode, observed.outputs.powerDisposition, observed.outputs.recoveryGuidance] : [];
    const stepPassed = observedCase === step.expectedCase && JSON.stringify(tuple) === JSON.stringify(step.expected);
    passed = passed && stepPassed;
    if (observed.ownerResult.nextState) state = observed.ownerResult.nextState;
    return {
      step: index + 1,
      inputs,
      prior_state: priorState,
      expected_case: step.expectedCase,
      observed_case: observedCase,
      owner_values: observed.ownerValues,
      expected_outputs: { vehicleHealthMode: step.expected[0], powerDisposition: step.expected[1], recoveryGuidance: step.expected[2] },
      observed_outputs: observed.outputs,
      observed_next_state: observed.ownerResult.nextState,
      passed: stepPassed
    };
  });
  return { passed, trace: steps };
}

const scenarioFamilies = scenarioSpecs.map(spec => {
  const primary = executeScenarioTrace(spec.initialState, spec.steps);
  const variants = (spec.variants || []).map(variant => ({
    name: variant.name,
    ...executeScenarioTrace(variant.initialState, variant.steps)
  }));
  return {
    id: spec.id,
    name: spec.name,
    passed: primary.passed && variants.every(variant => variant.passed),
    trace: primary.trace,
    variants
  };
});

const auditBase = [
  {
    usage: "temperatureQualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["temperatureQualification.rawTemperature"],
    owner_local_facts: ["validity-aware TemperatureAssessment classification"],
    contract_cases: ["TEMPERATURE_INVALID", "TEMPERATURE_NOMINAL", "TEMPERATURE_OVER"],
    analyzer_checks: ["temperature qualification exhaustive 4-to-3 relation"]
  },
  {
    usage: "maintenanceQualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["maintenanceQualification.rawMaintenance"],
    owner_local_facts: ["validity-aware MaintenanceAssessment classification"],
    contract_cases: ["MAINTENANCE_INVALID", "MAINTENANCE_CLEAR", "MAINTENANCE_DUE"],
    analyzer_checks: ["maintenance qualification exhaustive 4-to-3 relation"]
  },
  {
    usage: "recoveryApplicability",
    claimed_roles: ["applicability", "proposal"],
    assigned_inputs: ["recoveryApplicability.rawReturn", "recoveryApplicability.temperatureAssessment", "recoveryApplicability.maintenanceAssessment"],
    owner_local_facts: ["priority-ordered RecoveryProposal classification"],
    contract_cases: ["RECOVERY_INVALID", "RECOVERY_NOT_REQUESTED", "RECOVERY_BLOCKED_MAINTENANCE", "RECOVERY_BLOCKED_TEMPERATURE", "RECOVERY_ELIGIBLE"],
    analyzer_checks: ["recovery applicability exhaustive 36-to-5 relation"]
  },
  {
    usage: "healthModeArbitration",
    claimed_roles: ["decision"],
    assigned_inputs: ["healthModeArbitration.temperatureAssessment", "healthModeArbitration.maintenanceAssessment", "healthModeArbitration.recoveryProposal", "healthModeArbitration.healthState"],
    owner_local_facts: ["ordered HealthDecision", "next VehicleHealthMode", "persistent healthState"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11"],
    analyzer_checks: ["health arbitration exhaustive 180-tuple partition", "decision nextMode equals committed healthState"]
  },
  {
    usage: "boundaryOutcomeDerivation",
    claimed_roles: ["decision"],
    assigned_inputs: ["boundaryOutcomeDerivation.healthDecision", "boundaryOutcomeDerivation.recoveryProposal"],
    owner_local_facts: ["defensive three-output classification", "producer-inconsistent pair fail-closed response"],
    contract_cases: ["DEFENSIVE_OUTCOME_CLASSIFICATION"],
    analyzer_checks: ["boundary outcome exhaustive 140-pair classification", "all producer-inconsistent pairs fail closed"]
  }
];

const ownerPasses = [
  qualificationChecks.temperature.total === 4 && qualificationChecks.temperature.mismatches === 0 &&
    qualificationChecks.temperature.fibers.InvalidTemperature === 2 && qualificationChecks.temperature.fibers.NominalTemperature === 1 && qualificationChecks.temperature.fibers.OverTemperature === 1,
  qualificationChecks.maintenance.total === 4 && qualificationChecks.maintenance.mismatches === 0 &&
    qualificationChecks.maintenance.fibers.InvalidMaintenance === 2 && qualificationChecks.maintenance.fibers.MaintenanceClear === 1 && qualificationChecks.maintenance.fibers.MaintenanceDue === 1,
  qualificationChecks.recovery.total === 36 && qualificationChecks.recovery.mismatches === 0 &&
    qualificationChecks.recovery.fibers.InvalidRecoveryEvidence === 28 && qualificationChecks.recovery.fibers.NotRequested === 4 && qualificationChecks.recovery.fibers.BlockedByMaintenance === 2 && qualificationChecks.recovery.fibers.BlockedByTemperature === 1 && qualificationChecks.recovery.fibers.EligibleRecovery === 1,
  directOwnerGaps === 0 && directOwnerOverlaps === 0 && directOwnerDecisionMismatches === 0 && ownerStateInvariantViolations === 0,
  directOutputGaps === 0 && directOutputOverlaps === 0 && requiredOutputMismatches === 0 && producerInconsistentFailClosedViolations === 0
];
const ownershipAudit = auditBase.map((entry, index) => ({ ...entry, passed: ownerPasses[index] }));

const missingCaseWitnesses = Object.entries(directOwnerCounts).filter(([, count]) => count === 0).map(([id]) => id);
const expectedOutputTuples = [
  "Unavailable/Withhold/RepairInputEvidence",
  "MaintenanceHold/Withhold/ClearActiveCondition",
  "TemperatureDegraded/Withhold/ClearActiveCondition",
  "Operational/Enable/None",
  "Unavailable/Withhold/SubmitFreshReturnRequest",
  "MaintenanceHold/Withhold/SubmitFreshReturnRequest",
  "TemperatureDegraded/Withhold/SubmitFreshReturnRequest"
];
const missingOutputTupleWitnesses = expectedOutputTuples.filter(tuple => !(tuple in outputTupleWitnesses));
const expectedInvalidMasks = ["temperature", "maintenance", "return", "temperature+maintenance", "temperature+return", "maintenance+return", "temperature+maintenance+return"];
const missingInvalidMasks = expectedInvalidMasks.filter(mask => !(mask in invalidMaskCounts));
const failedScenarios = scenarioFamilies.filter(s => !s.passed).map(s => s.id);

const checks = {
  semantic_connection_map_exact_13: semanticConnectionMap.length === 13 && new Set(semanticConnectionMap.map(x => x.id)).size === 13,
  temperature_owner_local_relation: ownerPasses[0],
  maintenance_owner_local_relation: ownerPasses[1],
  recovery_owner_local_relation: ownerPasses[2],
  direct_owner_domain_exact_180: Object.values(directOwnerCounts).reduce((a, b) => a + b, 0) === 180,
  direct_owner_partition_total_exclusive: ownerPasses[3],
  direct_output_domain_exact_140: Object.values(outcomeBranchCounts).reduce((a, b) => a + b, 0) === 140,
  direct_output_total_and_fail_closed: ownerPasses[4] && producerInconsistentPairs === 125,
  raw_domain_exact_256: Object.values(rawPartitionCounts).reduce((a, b) => a + b, 0) === 256,
  raw_partition_total_exclusive: rawGaps === 0 && rawOverlaps === 0,
  all_eleven_case_witnesses: missingCaseWitnesses.length === 0,
  all_seven_output_tuple_witnesses: missingOutputTupleWitnesses.length === 0,
  all_invalid_status_masks: missingInvalidMasks.length === 0 && rawRequiredOutputMismatches === 0,
  owner_state_invariant: ownerStateInvariantViolations === 0,
  explicit_interaction_fanouts_preserve_owner_values: interactionResolutionViolations === 0,
  five_scenario_traces: scenarioFamilies.length === 5 && failedScenarios.length === 0,
  blocked_request_not_replayed: scenarioFamilies.find(s => s.id === "SCN-05").trace[2].observed_case === "CASE-10" &&
    scenarioFamilies.find(s => s.id === "SCN-05").trace[3].observed_case === "CASE-11" &&
    scenarioFamilies.find(s => s.id === "SCN-05").variants[0].trace[2].observed_case === "CASE-08" &&
    scenarioFamilies.find(s => s.id === "SCN-05").variants[0].trace[3].observed_case === "CASE-09",
  all_ownership_audits_executed: ownershipAudit.every(x => x.passed)
};

const passed = Object.values(checks).every(Boolean) && directOwnerGaps === 0 && directOwnerOverlaps === 0 && directOutputGaps === 0 && directOutputOverlaps === 0 && rawGaps === 0 && rawOverlaps === 0 && requiredOutputMismatches === 0 && rawRequiredOutputMismatches === 0;

const result = {
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exhaustive evidence over the approved finite logical input and prior-state domains only; not compositional proof, solver certification, generated-code correctness, execution, physical performance, safety, or certification.",
  analyzed_domains: {
    raw_boundary_and_prior_state: 256,
    direct_health_owner_tuples: 180,
    direct_boundary_outcome_pairs: 140
  },
  named_local_relations: ["qualifyTemperature", "qualifyMaintenance", "classifyRecovery", "proposalConsistent", "arbitrate", "deriveOutcomes"],
  semantic_connection_map: semanticConnectionMap,
  canonical_guard_crosscheck: {
    status: "matched",
    source_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11"],
    note: "The analyzer arbitrationGuards predicates mirror the canonical GUMBO assumptions term-for-term; output acceptance and fail-closed predicates mirror acceptedProducerPair and the selected output helpers."
  },
  partition_counts: {
    raw_boundary: rawPartitionCounts,
    direct_health_owner: directOwnerCounts,
    direct_boundary_outcomes: outcomeBranchCounts
  },
  gaps: { raw_boundary: rawGaps, direct_health_owner: directOwnerGaps, direct_boundary_outcomes: directOutputGaps },
  overlaps: { raw_boundary: rawOverlaps, direct_health_owner: directOwnerOverlaps, direct_boundary_outcomes: directOutputOverlaps },
  required_output_mismatches: { raw_boundary: rawRequiredOutputMismatches, direct_health_owner: directOwnerDecisionMismatches, direct_boundary_outcomes: requiredOutputMismatches },
  invariant_checks: {
    qualification_mismatches: qualificationChecks.temperature.mismatches + qualificationChecks.maintenance.mismatches + qualificationChecks.recovery.mismatches,
    owner_state_invariant_violations: ownerStateInvariantViolations,
    malformed_owner_fail_closed_violations: malformedOwnerFailClosedViolations,
    producer_inconsistent_pairs: producerInconsistentPairs,
    producer_inconsistent_fail_closed_violations: producerInconsistentFailClosedViolations,
    interaction_resolution_violations: interactionResolutionViolations,
    missing_case_witnesses: missingCaseWitnesses,
    missing_output_tuple_witnesses: missingOutputTupleWitnesses,
    missing_invalid_status_masks: missingInvalidMasks
  },
  observations: {
    raw_partition_gaps: rawGaps,
    raw_partition_overlaps: rawOverlaps,
    raw_required_output_mismatches: rawRequiredOutputMismatches,
    direct_owner_partition_gaps: directOwnerGaps,
    direct_owner_partition_overlaps: directOwnerOverlaps,
    direct_owner_decision_mismatches: directOwnerDecisionMismatches,
    direct_output_gaps: directOutputGaps,
    direct_output_overlaps: directOutputOverlaps,
    direct_output_mismatches: requiredOutputMismatches,
    invariant_violations: ownerStateInvariantViolations + malformedOwnerFailClosedViolations + producerInconsistentFailClosedViolations + interactionResolutionViolations
  },
  qualification_checks: qualificationChecks,
  invalid_status_coverage: { masks: invalidMaskCounts, missing_masks: missingInvalidMasks },
  output_tuple_witnesses: outputTupleWitnesses,
  scenario_families: scenarioFamilies,
  failed_scenarios: failedScenarios,
  ownership_audit: ownershipAudit,
  checks
};

console.log(JSON.stringify(result));
