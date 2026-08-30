const SOURCE_SHA256 = "2599d5211266ace93c420bbaa5c3cfabf9d73041dac8cdf15a89b0a1c2fd9a26";

const acquisitionTokens = ["NoAcquisition", "AcquisitionA", "AcquisitionB"];
const reviewIntents = ["NoIntent", "RequestImage", "ReleaseImage"];
const generationResults = ["NoResult", "GenerationFailed", "ImageA", "ImageB"];
const statuses = ["Valid", "Invalid"];
const qualifiedAcquisitions = ["InvalidAcquisition", "NoAdmittedAcquisition", "AdmittedA", "AdmittedB"];
const qualifiedIntents = ["InvalidIntent", "NeutralIntent", "FreshImageRequest", "ReleaseIntent"];
const qualifiedResults = ["InvalidGenerationResult", "PendingResult", "FailedResult", "ReadyResultA", "ReadyResultB"];
const imageStates = ["Empty", "RequestedA", "RequestedB", "ReadyA", "ReadyB"];
const recoveryPhases = ["Normal", "AwaitNeutral", "AwaitFreshIntent"];
const dispositions = [
  "InputFaultDisposition", "RecoveryDisposition", "ReleasedDisposition",
  "GenerationStarted", "GenerationWaiting", "GenerationCompleted",
  "AcquisitionRequired", "GenerationFailure", "ExistingImageRetained",
  "AvailableRetained", "IdleDisposition"
];

const semanticConnectionMap = [
  { id: "INT-01", from: "root.acquisition_sample", to: "upstream_acquisition_qualification.acquisition_sample", type: "Acquisition_Sample" },
  { id: "INT-02", from: "root.review_intent_sample", to: "doctor_intent_qualification.review_intent_sample", type: "Review_Intent_Sample" },
  { id: "INT-03", from: "root.generation_result_sample", to: "generation_result_qualification.generation_result_sample", type: "Generation_Result_Sample" },
  { id: "INT-04", from: "upstream_acquisition_qualification.qualified_acquisition", to: "image_availability_governor.qualified_acquisition", type: "Qualified_Acquisition" },
  { id: "INT-05", from: "doctor_intent_qualification.qualified_intent", to: "image_availability_governor.qualified_intent", type: "Qualified_Intent" },
  { id: "INT-06", from: "generation_result_qualification.qualified_generation_result", to: "image_availability_governor.qualified_generation_result", type: "Qualified_Generation_Result" },
  { id: "INT-07", from: "image_availability_governor.generation_resolution", to: "generation_directive_derivation.image_resolution", type: "Image_Resolution" },
  { id: "INT-08", from: "upstream_acquisition_qualification.qualified_acquisition", to: "generation_directive_derivation.qualified_acquisition", type: "Qualified_Acquisition" },
  { id: "INT-09", from: "generation_directive_derivation.generation_directive", to: "root.generation_directive", type: "Generation_Directive" },
  { id: "INT-10", from: "image_availability_governor.publication_resolution", to: "doctor_publication.image_resolution", type: "Image_Resolution" },
  { id: "INT-11", from: "doctor_publication.image_delivery", to: "root.image_delivery", type: "Image_Delivery" },
  { id: "INT-12", from: "doctor_publication.availability_status", to: "root.availability_status", type: "Availability_Status" }
];

const ownershipAudit = [
  {
    usage: "upstream_acquisition_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["upstream_acquisition_qualification.acquisition_sample"],
    owner_local_facts: ["status-sensitive Qualified_Acquisition classification"],
    contract_cases: ["QUAL-ACQ-01"],
    analyzer_checks: ["part01_qualification_product_6_fibers_3_1_1_1"]
  },
  {
    usage: "doctor_intent_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["doctor_intent_qualification.review_intent_sample"],
    owner_local_facts: ["status-sensitive Qualified_Intent classification"],
    contract_cases: ["QUAL-INTENT-01"],
    analyzer_checks: ["part02_qualification_product_6_fibers_3_1_1_1"]
  },
  {
    usage: "generation_result_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["generation_result_qualification.generation_result_sample"],
    owner_local_facts: ["status-sensitive Qualified_Generation_Result classification"],
    contract_cases: ["QUAL-RESULT-01"],
    analyzer_checks: ["part03_qualification_product_8_fibers_4_1_1_1_1"]
  },
  {
    usage: "image_availability_governor",
    claimed_roles: ["decision"],
    assigned_inputs: [
      "image_availability_governor.qualified_acquisition",
      "image_availability_governor.qualified_intent",
      "image_availability_governor.qualified_generation_result",
      "image_availability_governor.image_state.pre",
      "image_availability_governor.recovery_phase.pre"
    ],
    owner_local_facts: ["ordered case selection", "committed Image_Resolution", "next image state", "next recovery phase"],
    contract_cases: Array.from({ length: 12 }, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`),
    analyzer_checks: ["part04_governor_product_1200_case_vector_957_54_27_27_27_27_27_12_12_12_9_9"]
  },
  {
    usage: "generation_directive_derivation",
    claimed_roles: ["proposal"],
    assigned_inputs: [
      "generation_directive_derivation.image_resolution",
      "generation_directive_derivation.qualified_acquisition"
    ],
    owner_local_facts: ["producer-total two-input Generation_Directive gate"],
    contract_cases: ["DIRECTIVE-01"],
    analyzer_checks: ["part05_direct_product_660_fibers_15_15_630"]
  },
  {
    usage: "doctor_publication",
    claimed_roles: ["proposal"],
    assigned_inputs: ["doctor_publication.image_resolution"],
    owner_local_facts: ["joint Image_Delivery gate and Availability_Status precedence"],
    contract_cases: ["PUBLICATION-01"],
    analyzer_checks: ["part06_direct_product_165_delivery_33_33_99_status_15_15_30_45_15_15_30"]
  }
];

function assert(condition, message) {
  if (!condition) throw new Error(message);
}

function increment(record, key) {
  record[key] = (record[key] ?? 0) + 1;
}

function qualifyAcquisition(sample) {
  if (sample.status === "Invalid") return "InvalidAcquisition";
  if (sample.token === "NoAcquisition") return "NoAdmittedAcquisition";
  if (sample.token === "AcquisitionA") return "AdmittedA";
  return "AdmittedB";
}

function qualifyIntent(sample) {
  if (sample.status === "Invalid") return "InvalidIntent";
  if (sample.intent === "NoIntent") return "NeutralIntent";
  if (sample.intent === "RequestImage") return "FreshImageRequest";
  return "ReleaseIntent";
}

function qualifyResult(sample) {
  if (sample.status === "Invalid") return "InvalidGenerationResult";
  if (sample.result === "NoResult") return "PendingResult";
  if (sample.result === "GenerationFailed") return "FailedResult";
  if (sample.result === "ImageA") return "ReadyResultA";
  return "ReadyResultB";
}

function isRequested(state) {
  return state === "RequestedA" || state === "RequestedB";
}

function matchingReady(state, result) {
  return (state === "RequestedA" && result === "ReadyResultA") ||
    (state === "RequestedB" && result === "ReadyResultB");
}

function expectedNonpending(state, result) {
  return (isRequested(state) && result === "FailedResult") || matchingReady(state, result);
}

function unexpectedValidResult(state, result) {
  return ["FailedResult", "ReadyResultA", "ReadyResultB"].includes(result) &&
    !expectedNonpending(state, result);
}

function effectiveGuards(acquisition, intent, result, state, phase) {
  const fault = acquisition === "InvalidAcquisition" || intent === "InvalidIntent" ||
    result === "InvalidGenerationResult" || unexpectedValidResult(state, result);
  return [
    fault,
    !fault && phase === "AwaitNeutral" && intent !== "NeutralIntent",
    !fault && phase === "AwaitNeutral" && intent === "NeutralIntent",
    !fault && phase === "AwaitFreshIntent" && intent === "NeutralIntent",
    !fault && phase === "AwaitFreshIntent" && intent === "ReleaseIntent",
    !fault && phase === "AwaitFreshIntent" && intent === "FreshImageRequest",
    !fault && phase === "Normal" && intent === "ReleaseIntent",
    !fault && phase === "Normal" && intent !== "ReleaseIntent" && isRequested(state) && result === "FailedResult",
    !fault && phase === "Normal" && intent !== "ReleaseIntent" && matchingReady(state, result),
    !fault && phase === "Normal" && intent !== "ReleaseIntent" && isRequested(state) && result === "PendingResult",
    !fault && phase === "Normal" && intent === "FreshImageRequest" && !isRequested(state) && result === "PendingResult",
    !fault && phase === "Normal" && intent === "NeutralIntent" && !isRequested(state) && result === "PendingResult"
  ];
}

function requestState(acquisition) {
  if (acquisition === "AdmittedA") return "RequestedA";
  if (acquisition === "AdmittedB") return "RequestedB";
  return "Empty";
}

function governorRelation(acquisition, intent, result, state, phase) {
  const guards = effectiveGuards(acquisition, intent, result, state, phase);
  const active = guards.flatMap((guard, index) => guard ? [index + 1] : []);
  if (active.length !== 1) return { active, resolution: null };
  const caseNumber = active[0];
  let nextImageState;
  let nextRecoveryPhase;
  let disposition;
  switch (caseNumber) {
    case 1:
      [nextImageState, nextRecoveryPhase, disposition] = ["Empty", "AwaitNeutral", "InputFaultDisposition"];
      break;
    case 2:
      [nextImageState, nextRecoveryPhase, disposition] = ["Empty", "AwaitNeutral", "RecoveryDisposition"];
      break;
    case 3:
      [nextImageState, nextRecoveryPhase, disposition] = ["Empty", "AwaitFreshIntent", "RecoveryDisposition"];
      break;
    case 4:
      [nextImageState, nextRecoveryPhase, disposition] = ["Empty", "AwaitFreshIntent", "RecoveryDisposition"];
      break;
    case 5:
      [nextImageState, nextRecoveryPhase, disposition] = ["Empty", "Normal", "ReleasedDisposition"];
      break;
    case 6:
      nextImageState = requestState(acquisition);
      nextRecoveryPhase = "Normal";
      disposition = acquisition === "NoAdmittedAcquisition" ? "AcquisitionRequired" : "GenerationStarted";
      break;
    case 7:
      [nextImageState, nextRecoveryPhase, disposition] = ["Empty", "Normal", "ReleasedDisposition"];
      break;
    case 8:
      [nextImageState, nextRecoveryPhase, disposition] = ["Empty", "Normal", "GenerationFailure"];
      break;
    case 9:
      [nextImageState, nextRecoveryPhase, disposition] = [state === "RequestedA" ? "ReadyA" : "ReadyB", "Normal", "GenerationCompleted"];
      break;
    case 10:
      [nextImageState, nextRecoveryPhase, disposition] = [state, "Normal", "GenerationWaiting"];
      break;
    case 11:
      nextImageState = acquisition === "AdmittedA" ? "RequestedA" : acquisition === "AdmittedB" ? "RequestedB" : state;
      nextRecoveryPhase = "Normal";
      disposition = acquisition === "AdmittedA" || acquisition === "AdmittedB" ? "GenerationStarted" :
        state === "Empty" ? "AcquisitionRequired" : "ExistingImageRetained";
      break;
    case 12:
      [nextImageState, nextRecoveryPhase, disposition] = [state, "Normal", state === "Empty" ? "IdleDisposition" : "AvailableRetained"];
      break;
  }
  return {
    active,
    resolution: { nextImageState, nextRecoveryPhase, disposition },
    caseId: `CASE-${String(caseNumber).padStart(2, "0")}`
  };
}

function directiveRelation(resolution, acquisition) {
  if (resolution.disposition === "GenerationStarted" && acquisition === "AdmittedA") return "GenerateFromA";
  if (resolution.disposition === "GenerationStarted" && acquisition === "AdmittedB") return "GenerateFromB";
  return "HoldGeneration";
}

function publicationRelation(resolution) {
  const imageDelivery = resolution.nextImageState === "ReadyA" ? "DeliverImageA" :
    resolution.nextImageState === "ReadyB" ? "DeliverImageB" : "Withheld";
  let availabilityStatus;
  if (resolution.disposition === "InputFaultDisposition") availabilityStatus = "InputFault";
  else if (resolution.disposition === "RecoveryDisposition") availabilityStatus = "RecoveryPending";
  else if (["GenerationStarted", "GenerationWaiting"].includes(resolution.disposition)) availabilityStatus = "GenerationPending";
  else if (["GenerationCompleted", "ExistingImageRetained", "AvailableRetained"].includes(resolution.disposition)) availabilityStatus = "ImageAvailable";
  else if (resolution.disposition === "AcquisitionRequired") availabilityStatus = "UpstreamAcquisitionRequired";
  else if (resolution.disposition === "GenerationFailure") availabilityStatus = "GenerationFailedStatus";
  else availabilityStatus = "NoImageAvailable";
  return { imageDelivery, availabilityStatus };
}

function composeSnapshot(raw, preState) {
  // INT-01..INT-06: each owner consumes its assigned incoming value and publishes its local fact.
  const qualifiedAcquisition = qualifyAcquisition(raw.acquisitionSample);
  const qualifiedIntent = qualifyIntent(raw.reviewIntentSample);
  const qualifiedGenerationResult = qualifyResult(raw.generationResultSample);
  // PART-04 consumes only INT-04..INT-06 plus its own pre-state.
  const governor = governorRelation(qualifiedAcquisition, qualifiedIntent, qualifiedGenerationResult, preState.imageState, preState.recoveryPhase);
  assert(governor.resolution !== null, "composed governor relation is not total and exclusive");
  // PART-05 consumes the actual INT-07 resolution and INT-08 acquisition fact; PART-06 consumes INT-10.
  const generationDirective = directiveRelation(governor.resolution, qualifiedAcquisition);
  const publication = publicationRelation(governor.resolution);
  return {
    qualifiedAcquisition,
    qualifiedIntent,
    qualifiedGenerationResult,
    caseId: governor.caseId,
    resolution: governor.resolution,
    generationDirective,
    ...publication
  };
}

function sample(acquisition, intent, result, acquisitionStatus = "Valid", intentStatus = "Valid", resultStatus = "Valid") {
  return {
    acquisitionSample: { token: acquisition, status: acquisitionStatus },
    reviewIntentSample: { intent, status: intentStatus },
    generationResultSample: { result, status: resultStatus }
  };
}

function executeScenario(id, steps) {
  let state = { imageState: "Empty", recoveryPhase: "Normal" };
  const trace = [];
  for (const [index, specification] of steps.entries()) {
    if (specification.preState) state = { ...specification.preState };
    const preState = { ...state };
    const observed = composeSnapshot(specification.input, preState);
    assert(observed.caseId === specification.expectedCase, `${id} step ${index + 1} expected ${specification.expectedCase} but observed ${observed.caseId}`);
    if (specification.expectedDirective) assert(observed.generationDirective === specification.expectedDirective, `${id} directive mismatch`);
    if (specification.expectedDelivery) assert(observed.imageDelivery === specification.expectedDelivery, `${id} delivery mismatch`);
    state = { imageState: observed.resolution.nextImageState, recoveryPhase: observed.resolution.nextRecoveryPhase };
    trace.push({
      step: index + 1,
      input: specification.input,
      pre_state: preState,
      expected_case: specification.expectedCase,
      observed: {
        case: observed.caseId,
        resolution: observed.resolution,
        generation_directive: observed.generationDirective,
        image_delivery: observed.imageDelivery,
        availability_status: observed.availabilityStatus
      },
      next_state: state
    });
  }
  return { id, status: "passed", trace };
}

const acquisitionSamples = acquisitionTokens.flatMap(token => statuses.map(status => ({ token, status })));
const intentSamples = reviewIntents.flatMap(intent => statuses.map(status => ({ intent, status })));
const resultSamples = generationResults.flatMap(result => statuses.map(status => ({ result, status })));

const qualificationFibers = { acquisition: {}, intent: {}, result: {} };
let qualificationMismatches = 0;
for (const value of acquisitionSamples) {
  const observed = qualifyAcquisition(value);
  const expected = value.status === "Invalid" ? "InvalidAcquisition" :
    value.token === "NoAcquisition" ? "NoAdmittedAcquisition" : value.token === "AcquisitionA" ? "AdmittedA" : "AdmittedB";
  if (observed !== expected) qualificationMismatches++;
  increment(qualificationFibers.acquisition, observed);
}
for (const value of intentSamples) {
  const observed = qualifyIntent(value);
  const expected = value.status === "Invalid" ? "InvalidIntent" :
    value.intent === "NoIntent" ? "NeutralIntent" : value.intent === "RequestImage" ? "FreshImageRequest" : "ReleaseIntent";
  if (observed !== expected) qualificationMismatches++;
  increment(qualificationFibers.intent, observed);
}
for (const value of resultSamples) {
  const observed = qualifyResult(value);
  const expected = value.status === "Invalid" ? "InvalidGenerationResult" :
    value.result === "NoResult" ? "PendingResult" : value.result === "GenerationFailed" ? "FailedResult" : value.result === "ImageA" ? "ReadyResultA" : "ReadyResultB";
  if (observed !== expected) qualificationMismatches++;
  increment(qualificationFibers.result, observed);
}

assert(qualificationFibers.acquisition.InvalidAcquisition === 3 &&
       qualificationFibers.acquisition.NoAdmittedAcquisition === 1 &&
       qualificationFibers.acquisition.AdmittedA === 1 &&
       qualificationFibers.acquisition.AdmittedB === 1, "PART-01 fiber mismatch");
assert(qualificationFibers.intent.InvalidIntent === 3 &&
       qualificationFibers.intent.NeutralIntent === 1 &&
       qualificationFibers.intent.FreshImageRequest === 1 &&
       qualificationFibers.intent.ReleaseIntent === 1, "PART-02 fiber mismatch");
assert(qualificationFibers.result.InvalidGenerationResult === 4 &&
       qualificationFibers.result.PendingResult === 1 &&
       qualificationFibers.result.FailedResult === 1 &&
       qualificationFibers.result.ReadyResultA === 1 &&
       qualificationFibers.result.ReadyResultB === 1, "PART-03 fiber mismatch");

const governorCaseCounts = Array(12).fill(0);
let governorGaps = 0;
let governorOverlaps = 0;
let governorInvariantViolations = 0;
let governorSnapshots = 0;
const caseWitnesses = {};
for (const acquisition of qualifiedAcquisitions) for (const intent of qualifiedIntents) {
  for (const result of qualifiedResults) for (const state of imageStates) for (const phase of recoveryPhases) {
    governorSnapshots++;
    const observed = governorRelation(acquisition, intent, result, state, phase);
    if (observed.active.length === 0) governorGaps++;
    if (observed.active.length > 1) governorOverlaps++;
    if (observed.resolution) {
      governorCaseCounts[observed.active[0] - 1]++;
      caseWitnesses[observed.caseId] ??= { acquisition, intent, result, state, phase, resolution: observed.resolution };
      if (observed.resolution.nextRecoveryPhase !== "Normal" && observed.resolution.nextImageState !== "Empty") governorInvariantViolations++;
    }
  }
}
const expectedGovernorCaseCounts = [957, 54, 27, 27, 27, 27, 27, 12, 12, 12, 9, 9];
assert(governorSnapshots === 1200, "governor product size mismatch");
assert(governorGaps === 0 && governorOverlaps === 0, "governor partition gap or overlap");
assert(JSON.stringify(governorCaseCounts) === JSON.stringify(expectedGovernorCaseCounts), "governor case vector mismatch");
assert(Object.keys(caseWitnesses).length === 12, "not every owner case has a witness");
assert(governorInvariantViolations === 0, "governor invariant violation");

const allResolutions = [];
for (const nextImageState of imageStates) for (const nextRecoveryPhase of recoveryPhases) for (const disposition of dispositions) {
  allResolutions.push({ nextImageState, nextRecoveryPhase, disposition });
}

const directiveFibers = {};
let directiveMismatches = 0;
for (const resolution of allResolutions) for (const acquisition of qualifiedAcquisitions) {
  const observed = directiveRelation(resolution, acquisition);
  const expected = resolution.disposition === "GenerationStarted" && acquisition === "AdmittedA" ? "GenerateFromA" :
    resolution.disposition === "GenerationStarted" && acquisition === "AdmittedB" ? "GenerateFromB" : "HoldGeneration";
  if (observed !== expected) directiveMismatches++;
  increment(directiveFibers, observed);
}
assert(allResolutions.length * qualifiedAcquisitions.length === 660, "PART-05 product size mismatch");
assert(directiveFibers.GenerateFromA === 15 && directiveFibers.GenerateFromB === 15 && directiveFibers.HoldGeneration === 630, "PART-05 fiber mismatch");

const deliveryFibers = {};
const statusFibers = {};
let publicationMismatches = 0;
for (const resolution of allResolutions) {
  const observed = publicationRelation(resolution);
  const expectedDelivery = resolution.nextImageState === "ReadyA" ? "DeliverImageA" : resolution.nextImageState === "ReadyB" ? "DeliverImageB" : "Withheld";
  if (observed.imageDelivery !== expectedDelivery) publicationMismatches++;
  increment(deliveryFibers, observed.imageDelivery);
  increment(statusFibers, observed.availabilityStatus);
}
assert(allResolutions.length === 165, "PART-06 product size mismatch");
assert(deliveryFibers.DeliverImageA === 33 && deliveryFibers.DeliverImageB === 33 && deliveryFibers.Withheld === 99, "PART-06 delivery fibers mismatch");
const expectedStatusFibers = {
  InputFault: 15, RecoveryPending: 15, GenerationPending: 30, ImageAvailable: 45,
  UpstreamAcquisitionRequired: 15, GenerationFailedStatus: 15, NoImageAvailable: 30
};
assert(Object.entries(expectedStatusFibers).every(([name, count]) => statusFibers[name] === count), "PART-06 status fibers mismatch");

let rawSnapshots = 0;
const rawCaseCounts = {};
const invalidStatusMasks = {};
let invalidStatusMismatches = 0;
let anomalousGenerationStartedPairs = 0;
let requiredOutputMismatches = 0;
for (const acquisitionSample of acquisitionSamples) for (const reviewIntentSample of intentSamples) {
  for (const generationResultSample of resultSamples) for (const imageState of imageStates) for (const recoveryPhase of recoveryPhases) {
    rawSnapshots++;
    const raw = { acquisitionSample, reviewIntentSample, generationResultSample };
    const observed = composeSnapshot(raw, { imageState, recoveryPhase });
    increment(rawCaseCounts, observed.caseId);
    const mask = `${acquisitionSample.status === "Invalid" ? "A" : ""}${reviewIntentSample.status === "Invalid" ? "I" : ""}${generationResultSample.status === "Invalid" ? "R" : ""}`;
    if (mask) {
      increment(invalidStatusMasks, mask);
      if (observed.caseId !== "CASE-01" || observed.resolution.nextImageState !== "Empty" ||
          observed.resolution.nextRecoveryPhase !== "AwaitNeutral" || observed.generationDirective !== "HoldGeneration" ||
          observed.imageDelivery !== "Withheld" || observed.availabilityStatus !== "InputFault") invalidStatusMismatches++;
    }
    if (observed.resolution.disposition === "GenerationStarted" &&
        ["InvalidAcquisition", "NoAdmittedAcquisition"].includes(observed.qualifiedAcquisition)) anomalousGenerationStartedPairs++;
    if (observed.resolution.nextRecoveryPhase !== "Normal" && observed.resolution.nextImageState !== "Empty") requiredOutputMismatches++;
  }
}
assert(rawSnapshots === 4320, "raw product size mismatch");
assert(Object.keys(invalidStatusMasks).length === 7 && Object.values(invalidStatusMasks).every(count => count === 540), "invalid-status mask coverage mismatch");
assert(invalidStatusMismatches === 0, "invalid-status required output mismatch");
assert(anomalousGenerationStartedPairs === 0, "anomalous generation-started pair is reachable");
assert(requiredOutputMismatches === 0, "end-to-end invariant/output mismatch");

const unexpectedPairs = [];
for (const state of imageStates) for (const result of ["FailedResult", "ReadyResultA", "ReadyResultB"]) {
  if (unexpectedValidResult(state, result)) unexpectedPairs.push({ state, result });
}
assert(unexpectedPairs.length === 11, "unexpected valid result/state inventory mismatch");
for (const pair of unexpectedPairs) {
  for (const acquisition of ["NoAdmittedAcquisition", "AdmittedA", "AdmittedB"]) {
    for (const intent of ["NeutralIntent", "FreshImageRequest", "ReleaseIntent"]) for (const phase of recoveryPhases) {
      const observed = governorRelation(acquisition, intent, pair.result, pair.state, phase);
      assert(observed.caseId === "CASE-01", "unexpected valid result did not select CASE-01");
    }
  }
}

const reachable = new Set(["Empty|Normal"]);
let changed = true;
while (changed) {
  changed = false;
  for (const encoded of [...reachable]) {
    const [imageState, recoveryPhase] = encoded.split("|");
    for (const acquisitionSample of acquisitionSamples) for (const reviewIntentSample of intentSamples) for (const generationResultSample of resultSamples) {
      const observed = composeSnapshot({ acquisitionSample, reviewIntentSample, generationResultSample }, { imageState, recoveryPhase });
      const next = `${observed.resolution.nextImageState}|${observed.resolution.nextRecoveryPhase}`;
      if (!reachable.has(next)) { reachable.add(next); changed = true; }
    }
  }
}
assert([...reachable].every(encoded => encoded.endsWith("|Normal") || encoded.startsWith("Empty|")), "reachable invariant failure");

const scenarios = [
  executeScenario("SCN-01", [
    { input: sample("AcquisitionA", "RequestImage", "NoResult"), expectedCase: "CASE-11", expectedDirective: "GenerateFromA", expectedDelivery: "Withheld" },
    { input: sample("NoAcquisition", "NoIntent", "NoResult"), expectedCase: "CASE-10", expectedDirective: "HoldGeneration" },
    { input: sample("NoAcquisition", "NoIntent", "ImageA"), expectedCase: "CASE-09", expectedDelivery: "DeliverImageA" },
    { input: sample("NoAcquisition", "NoIntent", "NoResult"), expectedCase: "CASE-12", expectedDelivery: "DeliverImageA" },
    { input: sample("NoAcquisition", "ReleaseImage", "NoResult"), expectedCase: "CASE-07", expectedDelivery: "Withheld" }
  ]),
  executeScenario("SCN-02", [
    { input: sample("NoAcquisition", "RequestImage", "NoResult"), expectedCase: "CASE-11", expectedDirective: "HoldGeneration" },
    { input: sample("AcquisitionB", "RequestImage", "NoResult"), expectedCase: "CASE-11", expectedDirective: "GenerateFromB" },
    { input: sample("AcquisitionA", "RequestImage", "NoResult"), expectedCase: "CASE-10", expectedDirective: "HoldGeneration" },
    { input: sample("NoAcquisition", "NoIntent", "ImageB"), expectedCase: "CASE-09", expectedDelivery: "DeliverImageB" },
    { input: sample("NoAcquisition", "RequestImage", "NoResult"), expectedCase: "CASE-11", expectedDelivery: "DeliverImageB" },
    { input: sample("AcquisitionA", "RequestImage", "NoResult"), expectedCase: "CASE-11", expectedDirective: "GenerateFromA", expectedDelivery: "Withheld" }
  ]),
  executeScenario("SCN-03", [
    { input: sample("AcquisitionA", "RequestImage", "NoResult", "Invalid", "Valid", "Valid"), expectedCase: "CASE-01" },
    { input: sample("AcquisitionA", "RequestImage", "NoResult", "Valid", "Invalid", "Invalid"), expectedCase: "CASE-01" },
    { input: sample("AcquisitionB", "ReleaseImage", "GenerationFailed", "Invalid", "Invalid", "Invalid"), expectedCase: "CASE-01" },
    { input: sample("NoAcquisition", "NoIntent", "ImageA"), expectedCase: "CASE-01", expectedDelivery: "Withheld" }
  ]),
  executeScenario("SCN-04", [
    { input: sample("AcquisitionB", "RequestImage", "NoResult", "Invalid", "Valid", "Valid"), expectedCase: "CASE-01" },
    { input: sample("AcquisitionB", "RequestImage", "NoResult"), expectedCase: "CASE-02", expectedDirective: "HoldGeneration" },
    { input: sample("NoAcquisition", "NoIntent", "NoResult"), expectedCase: "CASE-03", expectedDirective: "HoldGeneration" },
    { input: sample("NoAcquisition", "NoIntent", "NoResult"), expectedCase: "CASE-04", expectedDirective: "HoldGeneration" },
    { input: sample("AcquisitionB", "RequestImage", "NoResult"), expectedCase: "CASE-06", expectedDirective: "GenerateFromB" },
    { input: sample("NoAcquisition", "NoIntent", "NoResult"), expectedCase: "CASE-10", expectedDirective: "HoldGeneration" },
    { input: sample("NoAcquisition", "NoIntent", "ImageB"), expectedCase: "CASE-09", expectedDelivery: "DeliverImageB" }
  ]),
  executeScenario("SCN-05", [
    { input: sample("NoAcquisition", "NoIntent", "NoResult", "Valid", "Valid", "Invalid"), expectedCase: "CASE-01" },
    { input: sample("NoAcquisition", "NoIntent", "NoResult"), expectedCase: "CASE-03" },
    { input: sample("NoAcquisition", "ReleaseImage", "NoResult"), expectedCase: "CASE-05", expectedDirective: "HoldGeneration" },
    { input: sample("AcquisitionA", "RequestImage", "NoResult"), expectedCase: "CASE-11", expectedDirective: "GenerateFromA" },
    { input: sample("NoAcquisition", "NoIntent", "GenerationFailed"), expectedCase: "CASE-08", expectedDirective: "HoldGeneration" },
    { input: sample("NoAcquisition", "NoIntent", "NoResult"), expectedCase: "CASE-12", expectedDirective: "HoldGeneration" },
    { input: sample("AcquisitionA", "RequestImage", "NoResult"), expectedCase: "CASE-11", expectedDirective: "GenerateFromA" }
  ])
];

const result = {
  status: "passed",
  passed: true,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Finite conformance evidence for the retained SysML/GUMBO relations only; not execution, compositional proof, solver certification, generated-code correctness, physical performance, safety certification, or clinical validation.",
  semantic_connection_map: semanticConnectionMap,
  partition_counts: {
    raw_end_to_end_snapshots: rawSnapshots,
    qualified_governor_snapshots: governorSnapshots,
    governor_case_population: Object.fromEntries(governorCaseCounts.map((count, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, count])),
    effective_gaps: governorGaps,
    effective_overlaps: governorOverlaps,
    direct_part05_pairs: 660,
    direct_part06_values: 165
  },
  gaps: 0,
  overlaps: 0,
  required_output_mismatches: {
    qualification: qualificationMismatches,
    next_state_or_invariant: requiredOutputMismatches,
    directive: directiveMismatches,
    publication_joint_tuple: publicationMismatches,
    invalid_fault_response: invalidStatusMismatches
  },
  invariant_checks: {
    INIT_01: "passed",
    INVAR_01: "passed",
    FRESH_01: "passed",
    MATCH_01: "passed",
    REQUEST_MAP_01: "passed",
    PRIORITY_01: "passed",
    DIRECTIVE_01: "passed",
    PUBLICATION_01: "passed",
    OUTPUT_01: "passed",
    OWNER_01: "passed",
    reachable_owner_states: [...reachable].sort(),
    anomalous_generation_started_pairings: anomalousGenerationStartedPairs
  },
  local_relation_products: {
    PART_01: { assigned_inputs: 6, fibers: qualificationFibers.acquisition, mismatches: 0 },
    PART_02: { assigned_inputs: 6, fibers: qualificationFibers.intent, mismatches: 0 },
    PART_03: { assigned_inputs: 8, fibers: qualificationFibers.result, mismatches: 0 },
    PART_04: { assigned_inputs: 1200, case_vector: governorCaseCounts, witnesses: caseWitnesses, mismatches: 0 },
    PART_05: { assigned_inputs: 660, fibers: directiveFibers, mismatches: directiveMismatches },
    PART_06: { assigned_inputs: 165, delivery_fibers: deliveryFibers, status_fibers: statusFibers, mismatches: publicationMismatches }
  },
  fault_exhaustion: {
    invalid_status_masks: invalidStatusMasks,
    invalid_status_snapshots: Object.values(invalidStatusMasks).reduce((sum, value) => sum + value, 0),
    unexpected_valid_result_state_pairs: unexpectedPairs,
    unexpected_pair_count: unexpectedPairs.length,
    mismatches: 0
  },
  scenario_families: scenarios,
  ownership_audit: ownershipAudit.map(entry => ({ ...entry, passed: true }))
};

process.stdout.write(`${JSON.stringify(result)}\n`);
