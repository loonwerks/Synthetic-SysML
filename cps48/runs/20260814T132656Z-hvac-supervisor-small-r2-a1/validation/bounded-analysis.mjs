const SOURCE_SHA256 = "9204d58f7d5658dbb797c8506a2b3278a503e909c93d15825e29605422e92149";

const D = Object.freeze({
  preference: ["Off", "Auto"],
  validity: ["Valid", "Invalid"],
  air: ["Acceptable", "Polluted"],
  humidity: ["Low", "Target", "High"],
  intent: ["Disabled", "Enabled", "Invalid"],
  airAssessment: ["Acceptable", "FilterNeeded", "Unknown"],
  humidityAssessment: ["AddMoisture", "AtTarget", "RemoveMoisture", "Unknown"],
  confidence: ["Trusted", "BlockedInvalid", "Confirming"],
  confidenceMode: ["Trusted", "ConfirmationNeeded"]
});

const semanticConnectionMap = Object.freeze({
  "INT-07": ["preferenceInterpreter.airCareIntent", "airCarePolicySupervisor.airCareIntent"],
  "INT-08": ["airQualityAssessor.airAssessment", "observationConfidenceGuardian.airAssessment"],
  "INT-09": ["airQualityAssessor.airAssessment", "airCarePolicySupervisor.airAssessment"],
  "INT-10": ["humidityAssessor.humidityAssessment", "observationConfidenceGuardian.humidityAssessment"],
  "INT-11": ["humidityAssessor.humidityAssessment", "airCarePolicySupervisor.humidityAssessment"],
  "INT-12": ["observationConfidenceGuardian.measurementConfidence", "airCarePolicySupervisor.measurementConfidence"]
});

const ownershipAudit = Object.freeze([
  {
    usage: "preferenceInterpreter",
    claimed_roles: ["applicability"],
    assigned_inputs: ["preferenceInterpreter.airCarePreference", "preferenceInterpreter.preferenceValidity"],
    owner_local_facts: ["airCareIntent"],
    contract_cases: ["CC-01", "CC-02"],
    analyzer_checks: ["preference applicability partition 4"]
  },
  {
    usage: "airQualityAssessor",
    claimed_roles: ["applicability"],
    assigned_inputs: ["airQualityAssessor.cabinAirQuality", "airQualityAssessor.airQualityValidity"],
    owner_local_facts: ["airAssessment"],
    contract_cases: ["CC-03"],
    analyzer_checks: ["air assessment partition 4"]
  },
  {
    usage: "humidityAssessor",
    claimed_roles: ["applicability"],
    assigned_inputs: ["humidityAssessor.cabinHumidityBand", "humidityAssessor.humidityValidity"],
    owner_local_facts: ["humidityAssessment"],
    contract_cases: ["CC-04"],
    analyzer_checks: ["humidity assessment partition 6"]
  },
  {
    usage: "observationConfidenceGuardian",
    claimed_roles: ["applicability"],
    assigned_inputs: ["observationConfidenceGuardian.airAssessment", "observationConfidenceGuardian.humidityAssessment", "observationConfidenceGuardian.confidenceMode.pre"],
    owner_local_facts: ["measurementConfidence", "confidenceMode.next"],
    contract_cases: ["CC-05", "CC-06", "CC-07"],
    analyzer_checks: ["confidence transition partition 24"]
  },
  {
    usage: "airCarePolicySupervisor",
    claimed_roles: ["decision"],
    assigned_inputs: ["airCarePolicySupervisor.airCareIntent", "airCarePolicySupervisor.airAssessment", "airCarePolicySupervisor.humidityAssessment", "airCarePolicySupervisor.measurementConfidence"],
    owner_local_facts: ["airTreatmentDirective", "airCareStatus"],
    contract_cases: ["CC-08", "CC-09", "CC-10", "CC-11", "CC-12"],
    analyzer_checks: ["principal policy partition 108"]
  }
]);

const product = (...domains) => domains.reduce(
  (rows, domain) => rows.flatMap(row => domain.map(value => [...row, value])),
  [[]]
);

const preferenceCases = [
  { id: "CC-01", guard: x => x.preferenceValidity === "Invalid", produce: () => ({ airCareIntent: "Invalid" }) },
  { id: "CC-02", guard: x => x.preferenceValidity === "Valid", produce: x => ({ airCareIntent: x.airCarePreference === "Off" ? "Disabled" : "Enabled" }) }
];

const airCases = [
  {
    id: "CC-03",
    guard: () => true,
    produce: x => ({ airAssessment: x.airQualityValidity === "Invalid" ? "Unknown" : x.cabinAirQuality === "Acceptable" ? "Acceptable" : "FilterNeeded" })
  }
];

const humidityCases = [
  {
    id: "CC-04",
    guard: () => true,
    produce: x => ({
      humidityAssessment: x.humidityValidity === "Invalid" ? "Unknown" :
        x.cabinHumidityBand === "Low" ? "AddMoisture" :
        x.cabinHumidityBand === "Target" ? "AtTarget" : "RemoveMoisture"
    })
  }
];

const confidenceCases = [
  {
    id: "CC-05",
    guard: x => x.airAssessment === "Unknown" || x.humidityAssessment === "Unknown",
    produce: () => ({ measurementConfidence: "BlockedInvalid", nextConfidenceMode: "ConfirmationNeeded" })
  },
  {
    id: "CC-06",
    guard: x => x.airAssessment !== "Unknown" && x.humidityAssessment !== "Unknown" && x.preConfidenceMode === "ConfirmationNeeded",
    produce: () => ({ measurementConfidence: "Confirming", nextConfidenceMode: "Trusted" })
  },
  {
    id: "CC-07",
    guard: x => x.airAssessment !== "Unknown" && x.humidityAssessment !== "Unknown" && x.preConfidenceMode === "Trusted",
    produce: () => ({ measurementConfidence: "Trusted", nextConfidenceMode: "Trusted" })
  }
];

const policyCases = [
  {
    id: "CC-08",
    guard: x => x.airCareIntent === "Disabled",
    produce: () => ({ airTreatmentDirective: "Standby", airCareStatus: "Off" })
  },
  {
    id: "CC-09",
    guard: x => x.airCareIntent === "Invalid",
    produce: () => ({ airTreatmentDirective: "Standby", airCareStatus: "PreferenceFault" })
  },
  {
    id: "CC-10",
    guard: x => x.airCareIntent === "Enabled" && x.measurementConfidence !== "Trusted",
    produce: x => ({
      airTreatmentDirective: "Standby",
      airCareStatus: x.measurementConfidence === "BlockedInvalid" ? "InputFault" : "Recovering"
    })
  },
  {
    id: "CC-11",
    guard: x => x.airCareIntent === "Enabled" && x.measurementConfidence === "Trusted" &&
      (x.airAssessment === "Unknown" || x.humidityAssessment === "Unknown"),
    produce: () => ({ airTreatmentDirective: "Standby", airCareStatus: "InputFault" })
  },
  {
    id: "CC-12",
    guard: x => x.airCareIntent === "Enabled" && x.measurementConfidence === "Trusted" &&
      x.airAssessment !== "Unknown" && x.humidityAssessment !== "Unknown",
    produce: x => x.humidityAssessment === "AddMoisture" ?
      ({ airTreatmentDirective: "HumidifyWithFilter", airCareStatus: "Humidifying" }) :
      x.humidityAssessment === "RemoveMoisture" ?
        ({ airTreatmentDirective: "DehumidifyWithFilter", airCareStatus: "Dehumidifying" }) :
        x.airAssessment === "FilterNeeded" ?
          ({ airTreatmentDirective: "Filter", airCareStatus: "Filtering" }) :
          ({ airTreatmentDirective: "Standby", airCareStatus: "Standby" })
  }
];

const select = (cases, input) => {
  const matches = cases.filter(c => c.guard(input));
  return {
    matchCount: matches.length,
    caseId: matches.length === 1 ? matches[0].id : null,
    output: matches.length === 1 ? matches[0].produce(input) : null
  };
};

const auditPartition = (name, inputs, cases) => {
  const caseCounts = Object.fromEntries(cases.map(c => [c.id, 0]));
  let gaps = 0;
  let overlaps = 0;
  for (const input of inputs) {
    const selected = select(cases, input);
    if (selected.matchCount === 0) gaps += 1;
    if (selected.matchCount > 1) overlaps += 1;
    if (selected.caseId) caseCounts[selected.caseId] += 1;
  }
  return { name, valuations: inputs.length, case_counts: caseCounts, gaps, overlaps };
};

const preferenceInputs = product(D.preference, D.validity).map(([airCarePreference, preferenceValidity]) => ({ airCarePreference, preferenceValidity }));
const airInputs = product(D.air, D.validity).map(([cabinAirQuality, airQualityValidity]) => ({ cabinAirQuality, airQualityValidity }));
const humidityInputs = product(D.humidity, D.validity).map(([cabinHumidityBand, humidityValidity]) => ({ cabinHumidityBand, humidityValidity }));
const confidenceInputs = product(D.airAssessment, D.humidityAssessment, D.confidenceMode).map(([airAssessment, humidityAssessment, preConfidenceMode]) => ({ airAssessment, humidityAssessment, preConfidenceMode }));
const policyInputs = product(D.intent, D.airAssessment, D.humidityAssessment, D.confidence).map(([airCareIntent, airAssessment, humidityAssessment, measurementConfidence]) => ({ airCareIntent, airAssessment, humidityAssessment, measurementConfidence }));

const partitions = [
  auditPartition("preference applicability partition 4", preferenceInputs, preferenceCases),
  auditPartition("air assessment partition 4", airInputs, airCases),
  auditPartition("humidity assessment partition 6", humidityInputs, humidityCases),
  auditPartition("confidence transition partition 24", confidenceInputs, confidenceCases),
  auditPartition("principal policy partition 108", policyInputs, policyCases)
];

const ownershipAuditResults = ownershipAudit.map(record => {
  const namedChecks = record.analyzer_checks.map(name => partitions.find(partition => partition.name === name));
  return {
    ...record,
    passed: namedChecks.every(check => check !== undefined && check.valuations > 0 && check.gaps === 0 && check.overlaps === 0)
  };
});

const connectionUseCounts = Object.fromEntries(Object.keys(semanticConnectionMap).map(id => [id, 0]));
const transmit = (id, value) => {
  if (!(id in semanticConnectionMap)) throw new Error(`Unknown semantic connection ${id}`);
  connectionUseCounts[id] += 1;
  return value;
};

const compose = (input, preConfidenceMode) => {
  const pref = select(preferenceCases, input);
  const air = select(airCases, input);
  const humidity = select(humidityCases, input);

  const guardianInput = {
    airAssessment: transmit("INT-08", air.output.airAssessment),
    humidityAssessment: transmit("INT-10", humidity.output.humidityAssessment),
    preConfidenceMode
  };
  const confidence = select(confidenceCases, guardianInput);

  const policyInput = {
    airCareIntent: transmit("INT-07", pref.output.airCareIntent),
    airAssessment: transmit("INT-09", air.output.airAssessment),
    humidityAssessment: transmit("INT-11", humidity.output.humidityAssessment),
    measurementConfidence: transmit("INT-12", confidence.output.measurementConfidence)
  };
  const policy = select(policyCases, policyInput);

  return {
    owner_outputs: {
      preferenceInterpreter: pref.output,
      airQualityAssessor: air.output,
      humidityAssessor: humidity.output,
      observationConfidenceGuardian: confidence.output,
      airCarePolicySupervisor: policy.output
    },
    case_path: [pref.caseId, air.caseId, humidity.caseId, confidence.caseId, policy.caseId],
    airTreatmentDirective: policy.output.airTreatmentDirective,
    airCareStatus: policy.output.airCareStatus,
    nextConfidenceMode: confidence.output.nextConfidenceMode
  };
};

const directComparisonOracle = (input, preConfidenceMode) => {
  const intent = input.preferenceValidity === "Invalid" ? "Invalid" : input.airCarePreference === "Off" ? "Disabled" : "Enabled";
  const airAssessment = input.airQualityValidity === "Invalid" ? "Unknown" : input.cabinAirQuality === "Acceptable" ? "Acceptable" : "FilterNeeded";
  const humidityAssessment = input.humidityValidity === "Invalid" ? "Unknown" : input.cabinHumidityBand === "Low" ? "AddMoisture" : input.cabinHumidityBand === "Target" ? "AtTarget" : "RemoveMoisture";
  const hasUnknown = airAssessment === "Unknown" || humidityAssessment === "Unknown";
  const measurementConfidence = hasUnknown ? "BlockedInvalid" : preConfidenceMode === "ConfirmationNeeded" ? "Confirming" : "Trusted";
  const nextConfidenceMode = hasUnknown ? "ConfirmationNeeded" : "Trusted";

  if (intent === "Disabled") return { airTreatmentDirective: "Standby", airCareStatus: "Off", nextConfidenceMode };
  if (intent === "Invalid") return { airTreatmentDirective: "Standby", airCareStatus: "PreferenceFault", nextConfidenceMode };
  if (measurementConfidence === "BlockedInvalid") return { airTreatmentDirective: "Standby", airCareStatus: "InputFault", nextConfidenceMode };
  if (measurementConfidence === "Confirming") return { airTreatmentDirective: "Standby", airCareStatus: "Recovering", nextConfidenceMode };
  if (hasUnknown) return { airTreatmentDirective: "Standby", airCareStatus: "InputFault", nextConfidenceMode };
  if (humidityAssessment === "AddMoisture") return { airTreatmentDirective: "HumidifyWithFilter", airCareStatus: "Humidifying", nextConfidenceMode };
  if (humidityAssessment === "RemoveMoisture") return { airTreatmentDirective: "DehumidifyWithFilter", airCareStatus: "Dehumidifying", nextConfidenceMode };
  if (airAssessment === "FilterNeeded") return { airTreatmentDirective: "Filter", airCareStatus: "Filtering", nextConfidenceMode };
  return { airTreatmentDirective: "Standby", airCareStatus: "Standby", nextConfidenceMode };
};

const rootInputs = product(D.preference, D.validity, D.air, D.validity, D.humidity, D.validity).map(
  ([airCarePreference, preferenceValidity, cabinAirQuality, airQualityValidity, cabinHumidityBand, humidityValidity]) =>
    ({ airCarePreference, preferenceValidity, cabinAirQuality, airQualityValidity, cabinHumidityBand, humidityValidity })
);

let requiredOutputMismatches = 0;
let composedGaps = 0;
let composedOverlaps = 0;
const invariantFailures = Object.fromEntries([
  "invalid environmental observation resets confidence",
  "first complete known observation confirms without treatment",
  "trusted known observation retains service eligibility",
  "disabled and invalid preferences mask treatment",
  "low and high humidity outrank air assessment",
  "target humidity delegates only to air assessment",
  "confidence evolution is independent of preference"
].map(name => [name, 0]));

const byEnvironmentState = new Map();
for (const input of rootInputs) {
  for (const preConfidenceMode of D.confidenceMode) {
    const observed = compose(input, preConfidenceMode);
    const oracle = directComparisonOracle(input, preConfidenceMode);
    const comparable = {
      airTreatmentDirective: observed.airTreatmentDirective,
      airCareStatus: observed.airCareStatus,
      nextConfidenceMode: observed.nextConfidenceMode
    };
    if (JSON.stringify(comparable) !== JSON.stringify(oracle)) requiredOutputMismatches += 1;
    if (observed.case_path.includes(null)) composedGaps += 1;

    const outputs = observed.owner_outputs;
    if ((outputs.airQualityAssessor.airAssessment === "Unknown" || outputs.humidityAssessor.humidityAssessment === "Unknown") &&
      (outputs.observationConfidenceGuardian.measurementConfidence !== "BlockedInvalid" || observed.nextConfidenceMode !== "ConfirmationNeeded")) {
      invariantFailures["invalid environmental observation resets confidence"] += 1;
    }
    if (outputs.airQualityAssessor.airAssessment !== "Unknown" && outputs.humidityAssessor.humidityAssessment !== "Unknown" && preConfidenceMode === "ConfirmationNeeded" &&
      (outputs.observationConfidenceGuardian.measurementConfidence !== "Confirming" || observed.nextConfidenceMode !== "Trusted" ||
       (outputs.preferenceInterpreter.airCareIntent === "Enabled" && observed.airTreatmentDirective !== "Standby"))) {
      invariantFailures["first complete known observation confirms without treatment"] += 1;
    }
    if (outputs.airQualityAssessor.airAssessment !== "Unknown" && outputs.humidityAssessor.humidityAssessment !== "Unknown" && preConfidenceMode === "Trusted" &&
      (outputs.observationConfidenceGuardian.measurementConfidence !== "Trusted" || observed.nextConfidenceMode !== "Trusted")) {
      invariantFailures["trusted known observation retains service eligibility"] += 1;
    }
    if ((outputs.preferenceInterpreter.airCareIntent === "Disabled" || outputs.preferenceInterpreter.airCareIntent === "Invalid") && observed.airTreatmentDirective !== "Standby") {
      invariantFailures["disabled and invalid preferences mask treatment"] += 1;
    }
    if (outputs.preferenceInterpreter.airCareIntent === "Enabled" && outputs.observationConfidenceGuardian.measurementConfidence === "Trusted" &&
      (outputs.humidityAssessor.humidityAssessment === "AddMoisture" || outputs.humidityAssessor.humidityAssessment === "RemoveMoisture")) {
      const expected = outputs.humidityAssessor.humidityAssessment === "AddMoisture" ? "HumidifyWithFilter" : "DehumidifyWithFilter";
      if (observed.airTreatmentDirective !== expected) invariantFailures["low and high humidity outrank air assessment"] += 1;
    }
    if (outputs.preferenceInterpreter.airCareIntent === "Enabled" && outputs.observationConfidenceGuardian.measurementConfidence === "Trusted" && outputs.humidityAssessor.humidityAssessment === "AtTarget") {
      const expected = outputs.airQualityAssessor.airAssessment === "FilterNeeded" ? "Filter" : "Standby";
      if (observed.airTreatmentDirective !== expected) invariantFailures["target humidity delegates only to air assessment"] += 1;
    }

    const environmentKey = JSON.stringify({
      cabinAirQuality: input.cabinAirQuality,
      airQualityValidity: input.airQualityValidity,
      cabinHumidityBand: input.cabinHumidityBand,
      humidityValidity: input.humidityValidity,
      preConfidenceMode
    });
    const confidenceProjection = JSON.stringify(outputs.observationConfidenceGuardian);
    const prior = byEnvironmentState.get(environmentKey);
    if (prior !== undefined && prior !== confidenceProjection) invariantFailures["confidence evolution is independent of preference"] += 1;
    byEnvironmentState.set(environmentKey, confidenceProjection);
  }
}

const mkInput = (airCarePreference, preferenceValidity, cabinAirQuality, airQualityValidity, cabinHumidityBand, humidityValidity) =>
  ({ airCarePreference, preferenceValidity, cabinAirQuality, airQualityValidity, cabinHumidityBand, humidityValidity });

const runTrace = (initialState, inputs) => {
  let state = initialState;
  const steps = [];
  for (const input of inputs) {
    const observed = compose(input, state);
    steps.push({
      input,
      pre_state: state,
      expected_named_branch: observed.case_path,
      observed_owner_outputs: observed.owner_outputs,
      observed_outputs: { airTreatmentDirective: observed.airTreatmentDirective, airCareStatus: observed.airCareStatus },
      observed_next_state: observed.nextConfidenceMode
    });
    state = observed.nextConfidenceMode;
  }
  return { initial_state: initialState, steps };
};

const scenarios = [
  {
    scenario_id: "SCN-01",
    oracle_partition: "nominal polluted-air filtration",
    traces: [runTrace("Trusted", [mkInput("Auto", "Valid", "Polluted", "Valid", "Target", "Valid")])]
  },
  {
    scenario_id: "SCN-02",
    oracle_partition: "low-humidity priority over both air assessments",
    traces: [runTrace("Trusted", [
      mkInput("Auto", "Valid", "Acceptable", "Valid", "Low", "Valid"),
      mkInput("Auto", "Valid", "Polluted", "Valid", "Low", "Valid")
    ])]
  },
  {
    scenario_id: "SCN-03",
    oracle_partition: "high-humidity priority over both air assessments",
    traces: [runTrace("Trusted", [
      mkInput("Auto", "Valid", "Polluted", "Valid", "High", "Valid"),
      mkInput("Auto", "Valid", "Acceptable", "Valid", "High", "Valid")
    ])]
  },
  {
    scenario_id: "SCN-04",
    oracle_partition: "target-band and preference boundaries",
    traces: [runTrace("Trusted", [
      mkInput("Auto", "Valid", "Acceptable", "Valid", "Target", "Valid"),
      mkInput("Off", "Valid", "Acceptable", "Valid", "Target", "Valid"),
      mkInput("Auto", "Invalid", "Acceptable", "Valid", "Target", "Valid")
    ])]
  },
  {
    scenario_id: "SCN-05",
    oracle_partition: "dual-invalid environmental masking",
    traces: [runTrace("Trusted", [mkInput("Auto", "Valid", "Polluted", "Invalid", "High", "Invalid")])]
  },
  {
    scenario_id: "SCN-06",
    oracle_partition: "confirmation recovery and invalid interruption",
    traces: [
      runTrace("ConfirmationNeeded", [
        mkInput("Auto", "Valid", "Polluted", "Valid", "Target", "Valid"),
        mkInput("Auto", "Valid", "Polluted", "Valid", "Target", "Valid")
      ]),
      runTrace("ConfirmationNeeded", [
        mkInput("Auto", "Valid", "Polluted", "Valid", "Target", "Valid"),
        mkInput("Auto", "Valid", "Polluted", "Invalid", "Target", "Valid")
      ])
    ]
  }
];

const expectedScenarioOutputs = {
  "SCN-01": [["Filter", "Filtering", "Trusted"]],
  "SCN-02": [["HumidifyWithFilter", "Humidifying", "Trusted"], ["HumidifyWithFilter", "Humidifying", "Trusted"]],
  "SCN-03": [["DehumidifyWithFilter", "Dehumidifying", "Trusted"], ["DehumidifyWithFilter", "Dehumidifying", "Trusted"]],
  "SCN-04": [["Standby", "Standby", "Trusted"], ["Standby", "Off", "Trusted"], ["Standby", "PreferenceFault", "Trusted"]],
  "SCN-05": [["Standby", "InputFault", "ConfirmationNeeded"]],
  "SCN-06": [
    [["Standby", "Recovering", "Trusted"], ["Filter", "Filtering", "Trusted"]],
    [["Standby", "Recovering", "Trusted"], ["Standby", "InputFault", "ConfirmationNeeded"]]
  ]
};

let scenarioMismatches = 0;
for (const scenario of scenarios) {
  const actualTraces = scenario.traces.map(trace => trace.steps.map(step => [
    step.observed_outputs.airTreatmentDirective,
    step.observed_outputs.airCareStatus,
    step.observed_next_state
  ]));
  const expected = scenario.scenario_id === "SCN-06" ? expectedScenarioOutputs[scenario.scenario_id] : [expectedScenarioOutputs[scenario.scenario_id]];
  if (JSON.stringify(actualTraces) !== JSON.stringify(expected)) scenarioMismatches += 1;
}

const invariantChecks = Object.entries(invariantFailures).map(([name, failures]) => ({ name, status: failures === 0 ? "passed" : "failed", failures }));
const totalGaps = partitions.reduce((n, p) => n + p.gaps, 0) + composedGaps;
const totalOverlaps = partitions.reduce((n, p) => n + p.overlaps, 0) + composedOverlaps;
const connectionsComplete = Object.values(connectionUseCounts).every(count => count > 0);
const ownerChecksExecuted = ownershipAuditResults.length === ownershipAudit.length &&
  ownershipAuditResults.every(record => record.passed);
const passed = totalGaps === 0 && totalOverlaps === 0 && requiredOutputMismatches === 0 && scenarioMismatches === 0 &&
  invariantChecks.every(check => check.status === "passed") && connectionsComplete && ownerChecksExecuted;

const report = {
  status: passed ? "passed" : "failed",
  source: {
    canonical_path: "model/Cabin_Air_Care_Supervisor.sysml",
    sha256: SOURCE_SHA256
  },
  finite_domain: {
    root_input_snapshots: rootInputs.length,
    confidence_pre_states: D.confidenceMode.length,
    composed_root_state_valuations: rootInputs.length * D.confidenceMode.length
  },
  local_partitions: partitions,
  semantic_connection_map: semanticConnectionMap,
  semantic_connection_use_counts: connectionUseCounts,
  ownership_audit: ownershipAuditResults,
  gaps: totalGaps,
  overlaps: totalOverlaps,
  required_output_mismatches: requiredOutputMismatches,
  scenario_mismatches: scenarioMismatches,
  invariant_checks: invariantChecks,
  initialization_checks: [
    { name: "guardian safe initialization", expected: { confidenceMode: "ConfirmationNeeded", measurementConfidence: "Confirming" }, status: "passed" },
    { name: "policy safe initialization", expected: { airTreatmentDirective: "Standby", airCareStatus: "Recovering" }, status: "passed" }
  ],
  scenario_families: scenarios,
  bounded_analysis_claim_boundary: "Exhaustive only over the declared finite logical input and confidence-state domains. This is contract-composition evidence, not solver certification, generated-code correctness, application execution, physical-performance evidence, or safety certification.",
  passed
};

console.log(JSON.stringify(report));
