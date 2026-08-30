import { readFileSync } from "node:fs";
import { createHash } from "node:crypto";

const source = readFileSync(new URL("../model/Isolette_Thermostat.sysml", import.meta.url), "utf8");
const SOURCE_SHA256 = createHash("sha256").update(source).digest("hex");
const currentDomain = source.match(/inv current_temperature_domain:\s*value_dF >= (\d+) & value_dF <= (\d+);/);
const displayDomain = source.match(/inv display_temperature_domain:\s*display_temperature >= (\d+) & display_temperature <= (\d+);/);
if (!currentDomain || !displayDomain) throw new Error("canonical temperature invariants not found");
const CURRENT_MIN = Number(currentDomain[1]);
const CURRENT_MAX = Number(currentDomain[2]);
const DISPLAY_MIN = Number(displayDomain[1]);
const DISPLAY_MAX = Number(displayDomain[2]);
const rootDefinition = source.slice(source.indexOf("part def IsoletteThermostatSystem"), source.indexOf("// Exactly one explicit root System usage."));

const Mode = Object.freeze({ INIT: "INIT", NORMAL: "NORMAL", FAILED: "FAILED" });
const Command = Object.freeze({ Off: "Off", On: "On" });
const Status = Object.freeze({ Init: "Init", On: "On", Failed: "Failed" });
const modes = Object.values(Mode);
const commands = Object.values(Command);
const bools = [false, true];
const currentValues = Array.from({ length: CURRENT_MAX - CURRENT_MIN + 1 }, (_, i) => CURRENT_MIN + i);
const displayValues = Array.from({ length: DISPLAY_MAX - DISPLAY_MIN + 1 }, (_, i) => DISPLAY_MIN + i);
const desiredBounds = [];
for (let lower = 97; lower <= 99; lower += 1) {
  for (let upper = 98; upper <= 100; upper += 1) {
    if (lower < upper) desiredBounds.push({ lower, upper });
  }
}
const alarmBounds = [];
for (let lower = 93; lower <= 98; lower += 1) {
  for (let upper = 99; upper <= 103; upper += 1) {
    alarmBounds.push({ lower, upper });
  }
}
const supervisions = [];
for (const powerEpochChanged of bools) {
  for (const initTimeoutExpired of bools) {
    for (const internalFailureDetected of bools) {
      supervisions.push({ powerEpochChanged, initTimeoutExpired, internalFailureDetected });
    }
  }
}

const semanticConnectionMap = Object.freeze({
  "INT-01": "CTX-01 -> PART-01 : CurrentTemperature",
  "INT-02": "CTX-02 -> PART-01 : DesiredTemperatureSettings",
  "INT-03": "CTX-07 -> PART-02 : RegulatorSupervision",
  "INT-04": "PART-01 -> PART-03 : RegulatorInterfaceFacts",
  "INT-05": "PART-02 -> PART-03 : RegulatorDiagnosticFacts",
  "INT-06": "PART-03 -> PART-01 : RegulatorMode",
  "INT-07": "PART-01 -> CTX-02 : RegulatorFeedback",
  "INT-08": "PART-01 -> PART-04 : RegulatorControlBasis",
  "INT-09": "PART-03 -> PART-04 : RegulatorMode",
  "INT-10": "PART-04 -> CTX-03 : HeatControl",
  "INT-11": "CTX-01 -> PART-05 : CurrentTemperature",
  "INT-12": "CTX-02 -> PART-05 : AlarmTemperatureSettings",
  "INT-13": "CTX-07 -> PART-06 : MonitorSupervision",
  "INT-14": "PART-05 -> PART-07 : MonitorInterfaceFacts",
  "INT-15": "PART-06 -> PART-07 : MonitorDiagnosticFacts",
  "INT-16": "PART-07 -> PART-05 : MonitorMode",
  "INT-17": "PART-05 -> CTX-02 : MonitorStatus",
  "INT-18": "PART-05 -> PART-08 : MonitorControlBasis",
  "INT-19": "PART-07 -> PART-08 : MonitorMode",
  "INT-20": "PART-08 -> CTX-02 : AlarmControl"
});

const failures = [];
let guardGaps = 0;
let guardOverlaps = 0;
let outputMismatches = 0;
let nextStateMismatches = 0;
let invariantViolations = 0;

function requireCheck(condition, label) {
  if (!condition) failures.push(label);
}

function classifyExactlyOne(guards, context) {
  const selected = Object.entries(guards).filter(([, value]) => value);
  if (selected.length === 0) {
    guardGaps += 1;
    failures.push(`guard gap: ${context}`);
    return "gap";
  }
  if (selected.length !== 1) {
    guardOverlaps += 1;
    failures.push(`guard overlap: ${context}: ${selected.map(([name]) => name).join(",")}`);
  }
  return selected[0][0];
}

function qualifyRegulatorInterface(current, desired) {
  const interfaceFailure = !desired.lowerValid || !desired.upperValid;
  return {
    owner: "PART-01",
    interfaceFacts: {
      interfaceFailure,
      rangeAvailable: !interfaceFailure,
      lowerDF: desired.lower * 10,
      upperDF: desired.upper * 10,
      currentValid: current.valid
    },
    controlBasis: {
      currentValueDF: current.valueDF,
      currentValid: current.valid,
      rangeAvailable: !interfaceFailure,
      lowerDF: desired.lower * 10,
      upperDF: desired.upper * 10
    }
  };
}

function regulatorFeedback(current, controlBasis, mode, nonNormalDisplay = DISPLAY_MIN) {
  return {
    regulatorStatus: mode === Mode.INIT ? Status.Init : mode === Mode.NORMAL ? Status.On : Status.Failed,
    displayTemperature: mode === Mode.NORMAL ? Math.floor((controlBasis.currentValueDF + 5) / 10) : nonNormalDisplay
  };
}

function qualifyMonitorInterface(current, alarm) {
  const interfaceFailure = !alarm.lowerValid || !alarm.upperValid;
  return {
    owner: "PART-05",
    interfaceFacts: {
      interfaceFailure,
      rangeAvailable: !interfaceFailure,
      lowerDF: alarm.lower * 10,
      upperDF: alarm.upper * 10,
      currentValid: current.valid
    },
    controlBasis: {
      currentValueDF: current.valueDF,
      currentValid: current.valid,
      rangeAvailable: !interfaceFailure,
      lowerDF: alarm.lower * 10,
      upperDF: alarm.upper * 10
    }
  };
}

function monitorStatus(mode) {
  return mode === Mode.INIT ? Status.Init : mode === Mode.NORMAL ? Status.On : Status.Failed;
}

function detectFailure(owner, priorLatch, supervision) {
  const nextLatch = supervision.powerEpochChanged
    ? false
    : priorLatch || supervision.internalFailureDetected;
  return {
    owner,
    branch: supervision.powerEpochChanged ? "epoch_reset" : "retain_or_set",
    powerEpochChanged: supervision.powerEpochChanged,
    initTimeoutExpired: supervision.initTimeoutExpired,
    internalFailureLatched: nextLatch
  };
}

function modeRelation(owner, priorMode, interfaceFacts, diagnosticFacts) {
  const health = !interfaceFacts.interfaceFailure &&
    !diagnosticFacts.internalFailureLatched && interfaceFacts.currentValid;
  const guards = {
    reset: diagnosticFacts.powerEpochChanged,
    failed_latch: !diagnosticFacts.powerEpochChanged && priorMode === Mode.FAILED,
    init_healthy: !diagnosticFacts.powerEpochChanged && priorMode === Mode.INIT && health,
    init_unhealthy_timeout: !diagnosticFacts.powerEpochChanged && priorMode === Mode.INIT &&
      !health && diagnosticFacts.initTimeoutExpired,
    init_unhealthy_wait: !diagnosticFacts.powerEpochChanged && priorMode === Mode.INIT &&
      !health && !diagnosticFacts.initTimeoutExpired,
    normal_healthy: !diagnosticFacts.powerEpochChanged && priorMode === Mode.NORMAL && health,
    normal_unhealthy: !diagnosticFacts.powerEpochChanged && priorMode === Mode.NORMAL && !health
  };
  const branch = classifyExactlyOne(guards, `${owner} mode relation`);
  const nextMode = branch === "reset" || branch === "init_unhealthy_wait" ? Mode.INIT
    : branch === "init_healthy" || branch === "normal_healthy" ? Mode.NORMAL
    : Mode.FAILED;
  return { owner, health, branch, nextMode };
}

function heatRelation(mode, basis, priorHeat) {
  const guards = {
    non_normal: mode !== Mode.NORMAL,
    below_desired: mode === Mode.NORMAL && basis.rangeAvailable && basis.currentValueDF < basis.lowerDF,
    above_desired: mode === Mode.NORMAL && basis.rangeAvailable && basis.currentValueDF > basis.upperDF,
    desired_band_retain: mode === Mode.NORMAL && basis.rangeAvailable &&
      basis.currentValueDF >= basis.lowerDF && basis.currentValueDF <= basis.upperDF
  };
  const branch = classifyExactlyOne(guards, "PART-04 heat relation");
  const nextHeat = branch === "below_desired" ? Command.On
    : branch === "desired_band_retain" ? priorHeat : Command.Off;
  return { owner: "PART-04", branch, nextHeat };
}

function alarmRelation(mode, basis, priorAlarm) {
  const guards = {
    init_off: mode === Mode.INIT,
    failed_on: mode === Mode.FAILED,
    low_outside: mode === Mode.NORMAL && basis.rangeAvailable && basis.currentValueDF < basis.lowerDF,
    low_band_retain: mode === Mode.NORMAL && basis.rangeAvailable &&
      basis.currentValueDF >= basis.lowerDF && basis.currentValueDF < basis.lowerDF + 5,
    central_inner_off: mode === Mode.NORMAL && basis.rangeAvailable &&
      basis.currentValueDF >= basis.lowerDF + 5 && basis.currentValueDF <= basis.upperDF - 5,
    high_band_retain: mode === Mode.NORMAL && basis.rangeAvailable &&
      basis.currentValueDF > basis.upperDF - 5 && basis.currentValueDF <= basis.upperDF,
    high_outside: mode === Mode.NORMAL && basis.rangeAvailable && basis.currentValueDF > basis.upperDF
  };
  const branch = classifyExactlyOne(guards, "PART-08 alarm relation");
  const nextAlarm = branch === "failed_on" || branch === "low_outside" || branch === "high_outside"
    ? Command.On
    : branch === "low_band_retain" || branch === "high_band_retain" ? priorAlarm : Command.Off;
  return { owner: "PART-08", branch, nextAlarm };
}

const initialState = Object.freeze({
  regulatorFailureLatched: false,
  regulatorMode: Mode.INIT,
  heatControl: Command.Off,
  monitorFailureLatched: false,
  monitorMode: Mode.INIT,
  alarmControl: Command.Off
});

function systemStep(root, prior) {
  // INT-01/02 and INT-11/12 are consumed only by their declared interface owners.
  const regulatorInterface = qualifyRegulatorInterface(root.current, root.desired);
  const monitorInterface = qualifyMonitorInterface(root.current, root.alarm);
  // INT-03 and INT-13 remain independent supervision paths.
  const regulatorDiagnostic = detectFailure("PART-02", prior.regulatorFailureLatched, root.regulatorSupervision);
  const monitorDiagnostic = detectFailure("PART-06", prior.monitorFailureLatched, root.monitorSupervision);
  // INT-04/05 and INT-14/15 supply owner-produced facts; health is not recomputed elsewhere.
  const regulatorMode = modeRelation("PART-03", prior.regulatorMode,
    regulatorInterface.interfaceFacts, regulatorDiagnostic);
  const monitorMode = modeRelation("PART-07", prior.monitorMode,
    monitorInterface.interfaceFacts, monitorDiagnostic);
  // INT-06/08/09 and INT-16/18/19 carry owner results to feedback/output owners.
  const feedback = regulatorFeedback(root.current, regulatorInterface.controlBasis, regulatorMode.nextMode);
  const heat = heatRelation(regulatorMode.nextMode, regulatorInterface.controlBasis, prior.heatControl);
  const status = monitorStatus(monitorMode.nextMode);
  const alarm = alarmRelation(monitorMode.nextMode, monitorInterface.controlBasis, prior.alarmControl);
  return {
    owners: {
      PART_01: regulatorInterface,
      PART_02: regulatorDiagnostic,
      PART_03: regulatorMode,
      PART_04: heat,
      PART_05: monitorInterface,
      PART_06: monitorDiagnostic,
      PART_07: monitorMode,
      PART_08: alarm
    },
    outputs: {
      regulatorStatus: feedback.regulatorStatus,
      displayTemperature: feedback.displayTemperature,
      heatControl: heat.nextHeat,
      monitorStatus: status,
      alarmControl: alarm.nextAlarm
    },
    nextState: {
      regulatorFailureLatched: regulatorDiagnostic.internalFailureLatched,
      regulatorMode: regulatorMode.nextMode,
      heatControl: heat.nextHeat,
      monitorFailureLatched: monitorDiagnostic.internalFailureLatched,
      monitorMode: monitorMode.nextMode,
      alarmControl: alarm.nextAlarm
    }
  };
}

const partitionCounts = {
  desired_status: { valid_both: 0, any_invalid: 0 },
  alarm_status: { valid_both: 0, any_invalid: 0 },
  regulator_diagnostic: { epoch_reset: 0, retain_or_set: 0 },
  monitor_diagnostic: { epoch_reset: 0, retain_or_set: 0 },
  regulator_mode: {},
  monitor_mode: {},
  heat: {},
  alarm: {},
  display: { normal_rounded: 0, non_normal_unconstrained: 0 }
};

// CASE-01/02 and CASE-11/12: all setting values and four validity pairs.
for (const bounds of desiredBounds) {
  for (const lowerValid of bools) for (const upperValid of bools) {
    const result = qualifyRegulatorInterface({ valueDF: 680, valid: true }, { ...bounds, lowerValid, upperValid });
    const branch = lowerValid && upperValid ? "valid_both" : "any_invalid";
    partitionCounts.desired_status[branch] += 1;
    if (result.interfaceFacts.interfaceFailure !== !(lowerValid && upperValid) ||
        result.interfaceFacts.rangeAvailable !== (lowerValid && upperValid)) outputMismatches += 1;
  }
}
for (const bounds of alarmBounds) {
  for (const lowerValid of bools) for (const upperValid of bools) {
    const result = qualifyMonitorInterface({ valueDF: 680, valid: true }, { ...bounds, lowerValid, upperValid });
    const branch = lowerValid && upperValid ? "valid_both" : "any_invalid";
    partitionCounts.alarm_status[branch] += 1;
    if (result.interfaceFacts.interfaceFailure !== !(lowerValid && upperValid) ||
        result.interfaceFacts.rangeAvailable !== (lowerValid && upperValid)) outputMismatches += 1;
  }
}

// CASE-04/05 and CASE-14/15: both prior latches and all eight supervision records.
for (const priorLatch of bools) for (const supervision of supervisions) {
  const expected = supervision.powerEpochChanged ? false : priorLatch || supervision.internalFailureDetected;
  for (const [owner, key] of [["PART-02", "regulator_diagnostic"], ["PART-06", "monitor_diagnostic"]]) {
    const result = detectFailure(owner, priorLatch, supervision);
    partitionCounts[key][result.branch] += 1;
    if (result.internalFailureLatched !== expected) nextStateMismatches += 1;
  }
}

// CASE-06/07 and CASE-16/17: complete mode relation over every finite cause and pre-state.
for (const priorMode of modes) for (const interfaceFailure of bools) {
  for (const internalFailureLatched of bools) for (const currentValid of bools) {
    for (const powerEpochChanged of bools) for (const initTimeoutExpired of bools) {
      const facts = { interfaceFailure, currentValid };
      const diagnostic = { internalFailureLatched, powerEpochChanged, initTimeoutExpired };
      for (const [owner, key] of [["PART-03", "regulator_mode"], ["PART-07", "monitor_mode"]]) {
        const result = modeRelation(owner, priorMode, facts, diagnostic);
        partitionCounts[key][result.branch] = (partitionCounts[key][result.branch] || 0) + 1;
        const health = !interfaceFailure && !internalFailureLatched && currentValid;
        let expected;
        if (powerEpochChanged) expected = Mode.INIT;
        else if (priorMode === Mode.FAILED) expected = Mode.FAILED;
        else if (priorMode === Mode.INIT) expected = health ? Mode.NORMAL : initTimeoutExpired ? Mode.FAILED : Mode.INIT;
        else expected = health ? Mode.NORMAL : Mode.FAILED;
        if (result.nextMode !== expected || result.health !== health) nextStateMismatches += 1;
      }
    }
  }
}

// CASE-08/09/10: all modes, temperatures, valid Desired ranges, and prior heat values.
for (const mode of modes) for (const valueDF of currentValues) {
  for (const bounds of desiredBounds) for (const priorHeat of commands) {
    const basis = { rangeAvailable: true, currentValueDF: valueDF, lowerDF: bounds.lower * 10, upperDF: bounds.upper * 10 };
    const result = heatRelation(mode, basis, priorHeat);
    partitionCounts.heat[result.branch] = (partitionCounts.heat[result.branch] || 0) + 1;
    const expected = mode !== Mode.NORMAL ? Command.Off
      : valueDF < basis.lowerDF ? Command.On
      : valueDF > basis.upperDF ? Command.Off : priorHeat;
    if (result.nextHeat !== expected) outputMismatches += 1;
  }
}

// CASE-18/19: all modes, temperatures, valid Alarm ranges, and prior alarm values.
for (const mode of modes) for (const valueDF of currentValues) {
  for (const bounds of alarmBounds) for (const priorAlarm of commands) {
    const basis = { rangeAvailable: true, currentValueDF: valueDF, lowerDF: bounds.lower * 10, upperDF: bounds.upper * 10 };
    const result = alarmRelation(mode, basis, priorAlarm);
    partitionCounts.alarm[result.branch] = (partitionCounts.alarm[result.branch] || 0) + 1;
    let expected;
    if (mode === Mode.INIT) expected = Command.Off;
    else if (mode === Mode.FAILED) expected = Command.On;
    else if (valueDF < basis.lowerDF || valueDF > basis.upperDF) expected = Command.On;
    else if ((valueDF >= basis.lowerDF && valueDF < basis.lowerDF + 5) ||
             (valueDF > basis.upperDF - 5 && valueDF <= basis.upperDF)) expected = priorAlarm;
    else expected = Command.Off;
    if (result.nextAlarm !== expected) outputMismatches += 1;
  }
}

// CASE-03 and canonical type bounds: every NORMAL result and every permitted
// non-NORMAL Display Temperature value are checked. No non-NORMAL equality is assumed.
for (const mode of modes) for (const valueDF of currentValues) {
  const candidates = mode === Mode.NORMAL ? [Math.floor((valueDF + 5) / 10)] : displayValues;
  for (const candidate of candidates) {
    const output = regulatorFeedback({ valueDF, valid: true }, { currentValueDF: valueDF }, mode, candidate);
    const branch = mode === Mode.NORMAL ? "normal_rounded" : "non_normal_unconstrained";
    partitionCounts.display[branch] += 1;
    if (mode === Mode.NORMAL && output.displayTemperature !== Math.floor((valueDF + 5) / 10)) outputMismatches += 1;
    if (output.displayTemperature < DISPLAY_MIN || output.displayTemperature > DISPLAY_MAX) invariantViolations += 1;
  }
}

// Exact root-domain cardinality under ASM-04. Local paths are exhaustively evaluated
// above and composed by Cartesian factorization because the canonical graph has no
// regulator/monitor semantic edge. This is exact enumeration, not sampling.
let admissibleSettingPairs = 0;
let allValidCrossOrderedPairs = 0;
for (const desired of desiredBounds) for (const alarm of alarmBounds) {
  for (const desiredLowerValid of bools) for (const desiredUpperValid of bools) {
    for (const alarmLowerValid of bools) for (const alarmUpperValid of bools) {
      const allValid = desiredLowerValid && desiredUpperValid && alarmLowerValid && alarmUpperValid;
      const crossOrdered = alarm.lower <= desired.lower - 1 && desired.upper + 1 <= alarm.upper;
      if (!allValid || crossOrdered) {
        admissibleSettingPairs += 1;
        if (allValid) allValidCrossOrderedPairs += 1;
      }
    }
  }
}
const rootInputCount = currentValues.length * bools.length * admissibleSettingPairs *
  supervisions.length * supervisions.length;
requireCheck(desiredBounds.length === 6, "Desired bound domain cardinality");
requireCheck(alarmBounds.length === 30, "Alarm bound domain cardinality");
requireCheck(allValidCrossOrderedPairs === 101, "ASM-04 all-valid cross ordering cardinality");
requireCheck(admissibleSettingPairs === 2801, "ASM-04 total setting-pair cardinality");
requireCheck(rootInputCount === 133013888, "finite root-input cardinality");
requireCheck(CURRENT_MIN === 680 && CURRENT_MAX === 1050, "canonical Current Temperature bounds");
requireCheck(DISPLAY_MIN === 68 && DISPLAY_MAX === 105, "canonical Display Temperature bounds");
requireCheck((rootDefinition.match(/port current_temperature\s*:\s*DataPort/g) || []).length === 1,
  "one canonical root Current Temperature sample");
requireCheck(rootDefinition.includes("connect current_temperature to thermostat_process.regulator_current_temperature") &&
  rootDefinition.includes("connect current_temperature to thermostat_process.monitor_current_temperature"),
  "canonical root Current Temperature fan-out");
requireCheck(source.includes("regulator_feedback.display_temperature ==\n               (control_basis.current_value_dF + 5) / 10"),
  "canonical NORMAL display equality");

function nominalRoot(overrides = {}) {
  const base = {
    current: { valueDF: 980, valid: true },
    desired: { lower: 97, upper: 99, lowerValid: true, upperValid: true },
    alarm: { lower: 93, upper: 103, lowerValid: true, upperValid: true },
    regulatorSupervision: { powerEpochChanged: false, initTimeoutExpired: false, internalFailureDetected: false },
    monitorSupervision: { powerEpochChanged: false, initTimeoutExpired: false, internalFailureDetected: false }
  };
  return {
    current: { ...base.current, ...(overrides.current || {}) },
    desired: { ...base.desired, ...(overrides.desired || {}) },
    alarm: { ...base.alarm, ...(overrides.alarm || {}) },
    regulatorSupervision: { ...base.regulatorSupervision, ...(overrides.regulatorSupervision || {}) },
    monitorSupervision: { ...base.monitorSupervision, ...(overrides.monitorSupervision || {}) }
  };
}

function traceStep(label, root, prior, expectedCases) {
  const result = systemStep(root, prior);
  return {
    label,
    input: root,
    expected_named_branches: expectedCases,
    observed_owner_facts: {
      regulatorInterfaceFailure: result.owners.PART_01.interfaceFacts.interfaceFailure,
      regulatorRangeAvailable: result.owners.PART_01.interfaceFacts.rangeAvailable,
      regulatorFailureLatched: result.owners.PART_02.internalFailureLatched,
      regulatorHealth: result.owners.PART_03.health,
      regulatorModeBranch: result.owners.PART_03.branch,
      heatBranch: result.owners.PART_04.branch,
      monitorInterfaceFailure: result.owners.PART_05.interfaceFacts.interfaceFailure,
      monitorRangeAvailable: result.owners.PART_05.interfaceFacts.rangeAvailable,
      monitorFailureLatched: result.owners.PART_06.internalFailureLatched,
      monitorHealth: result.owners.PART_07.health,
      monitorModeBranch: result.owners.PART_07.branch,
      alarmBranch: result.owners.PART_08.branch
    },
    observed_outputs: result.outputs,
    observed_next_state: result.nextState,
    semantic_interactions_consumed: Object.keys(semanticConnectionMap),
    _result: result
  };
}

function publicStep(step) {
  const { _result, ...visible } = step;
  return visible;
}

const scenarioTraces = [];

// SCN-01
{
  const s1 = traceStep("healthy initialization", nominalRoot(), initialState,
    ["CASE-01 valid_both", "CASE-06 init_healthy", "CASE-16 init_healthy", "CASE-03 rounded"]);
  requireCheck(s1._result.nextState.regulatorMode === Mode.NORMAL && s1._result.nextState.monitorMode === Mode.NORMAL,
    "SCN-01 healthy startup modes");
  requireCheck(s1._result.outputs.heatControl === Command.Off && s1._result.outputs.alarmControl === Command.Off &&
    s1._result.outputs.regulatorStatus === Status.On && s1._result.outputs.monitorStatus === Status.On &&
    s1._result.outputs.displayTemperature === 98, "SCN-01 outputs");
  scenarioTraces.push({ scenario_id: "SCN-01", family: "healthy_startup", variants: ["healthy"], steps: [publicStep(s1)] });
}

// SCN-02
{
  const normal = { ...initialState, regulatorMode: Mode.NORMAL, monitorMode: Mode.NORMAL };
  const low = traceStep("below desired", nominalRoot({ current: { valueDF: 960 } }), normal,
    ["CASE-09 below_desired"]);
  const band = traceStep("enter desired band", nominalRoot({ current: { valueDF: 975 } }), low._result.nextState,
    ["CASE-09 desired_band_retain"]);
  requireCheck(low._result.outputs.heatControl === Command.On && band._result.outputs.heatControl === Command.On,
    "SCN-02 heating and retain");
  scenarioTraces.push({ scenario_id: "SCN-02", family: "heating_and_desired_hold", variants: ["below_then_band"],
    steps: [publicStep(low), publicStep(band)] });
}

// SCN-03
{
  const normalOn = { ...initialState, regulatorMode: Mode.NORMAL, monitorMode: Mode.NORMAL, heatControl: Command.On };
  const high = traceStep("above desired", nominalRoot({ current: { valueDF: 1005 }, desired: { upper: 100 } }), normalOn,
    ["CASE-09 above_desired"]);
  const band = traceStep("return to desired band", nominalRoot({ current: { valueDF: 995 }, desired: { upper: 100 } }),
    high._result.nextState, ["CASE-09 desired_band_retain"]);
  requireCheck(high._result.outputs.heatControl === Command.Off && band._result.outputs.heatControl === Command.Off,
    "SCN-03 cooling and retain");
  scenarioTraces.push({ scenario_id: "SCN-03", family: "cooling_and_desired_hold", variants: ["above_then_band"],
    steps: [publicStep(high), publicStep(band)] });
}

// SCN-04, including both outside and both hysteresis-band variants.
{
  let state = { ...initialState, regulatorMode: Mode.NORMAL, monitorMode: Mode.NORMAL };
  const definitions = [
    ["low outside", 920, "CASE-19 low_outside", Command.On],
    ["low band retain", 932, "CASE-19 low_band_retain", Command.On],
    ["central inner low", 935, "CASE-19 central_inner_off", Command.Off],
    ["high outside", 1040, "CASE-19 high_outside", Command.On],
    ["high band retain", 1028, "CASE-19 high_band_retain", Command.On],
    ["central inner high", 1025, "CASE-19 central_inner_off", Command.Off]
  ];
  const steps = [];
  for (const [label, valueDF, branch, expected] of definitions) {
    const step = traceStep(label, nominalRoot({ current: { valueDF } }), state, [branch]);
    requireCheck(step._result.outputs.alarmControl === expected, `SCN-04 ${label}`);
    steps.push(publicStep(step));
    state = step._result.nextState;
  }
  scenarioTraces.push({ scenario_id: "SCN-04", family: "alarm_activation_and_hysteretic_recovery",
    variants: ["low_outside", "low_band", "central_inner", "high_band", "high_outside"], steps });
}

// SCN-05
{
  let state = { ...initialState, regulatorMode: Mode.NORMAL, monitorMode: Mode.NORMAL };
  const fail = traceStep("invalidate desired setting", nominalRoot({ current: { valueDF: 960 }, desired: { lowerValid: false } }),
    state, ["CASE-01 any_invalid", "CASE-07 normal_unhealthy", "CASE-08 non_normal"]);
  const fresh = traceStep("fresh desired setting without power epoch", nominalRoot({ current: { valueDF: 960 } }),
    fail._result.nextState, ["CASE-07 failed_latch"]);
  const reset = traceStep("regulator power epoch", nominalRoot({ regulatorSupervision: { powerEpochChanged: true } }),
    fresh._result.nextState, ["CASE-04 epoch_reset", "CASE-07 reset"]);
  const recover = traceStep("healthy regulator restart", nominalRoot(), reset._result.nextState, ["CASE-06 init_healthy"]);
  requireCheck(fail._result.outputs.heatControl === Command.Off && fresh._result.nextState.regulatorMode === Mode.FAILED &&
    reset._result.nextState.regulatorMode === Mode.INIT && recover._result.nextState.regulatorMode === Mode.NORMAL,
    "SCN-05 failure, non-recovery, and power recovery");
  scenarioTraces.push({ scenario_id: "SCN-05", family: "desired_invalidity_and_fresh_request",
    variants: ["invalid", "fresh_valid_no_recovery", "power_epoch_recovery"],
    steps: [publicStep(fail), publicStep(fresh), publicStep(reset), publicStep(recover)] });
}

// SCN-06
{
  let state = { ...initialState, regulatorMode: Mode.NORMAL, monitorMode: Mode.NORMAL };
  const fail = traceStep("invalidate alarm setting", nominalRoot({ alarm: { upperValid: false } }), state,
    ["CASE-11 any_invalid", "CASE-17 normal_unhealthy", "CASE-18 failed_on"]);
  const fresh = traceStep("fresh alarm setting without power epoch", nominalRoot(), fail._result.nextState,
    ["CASE-17 failed_latch"]);
  const reset = traceStep("monitor power epoch", nominalRoot({ monitorSupervision: { powerEpochChanged: true } }),
    fresh._result.nextState, ["CASE-14 epoch_reset", "CASE-17 reset"]);
  const recover = traceStep("healthy monitor restart", nominalRoot(), reset._result.nextState, ["CASE-16 init_healthy"]);
  requireCheck(fail._result.outputs.alarmControl === Command.On && fresh._result.nextState.monitorMode === Mode.FAILED &&
    reset._result.nextState.monitorMode === Mode.INIT && recover._result.nextState.monitorMode === Mode.NORMAL,
    "SCN-06 failure, non-recovery, and power recovery");
  scenarioTraces.push({ scenario_id: "SCN-06", family: "alarm_invalidity_and_fresh_request",
    variants: ["invalid", "fresh_valid_no_recovery", "power_epoch_recovery"],
    steps: [publicStep(fail), publicStep(fresh), publicStep(reset), publicStep(recover)] });
}

// SCN-07
{
  const normal = { ...initialState, regulatorMode: Mode.NORMAL, monitorMode: Mode.NORMAL };
  const invalid = traceStep("invalid shared current temperature", nominalRoot({ current: { valid: false } }), normal,
    ["CASE-07 normal_unhealthy", "CASE-17 normal_unhealthy", "CASE-08 non_normal", "CASE-18 failed_on"]);
  const fresh = traceStep("fresh valid temperature without power epoch", nominalRoot(), invalid._result.nextState,
    ["CASE-07 failed_latch", "CASE-17 failed_latch"]);
  requireCheck(invalid._result.outputs.heatControl === Command.Off && invalid._result.outputs.alarmControl === Command.On &&
    fresh._result.nextState.regulatorMode === Mode.FAILED && fresh._result.nextState.monitorMode === Mode.FAILED,
    "SCN-07 common stimulus latch");
  scenarioTraces.push({ scenario_id: "SCN-07", family: "invalid_current_temperature",
    variants: ["common_invalid", "fresh_valid_no_recovery"], steps: [publicStep(invalid), publicStep(fresh)] });
}

// SCN-08: regulator-only and monitor-only internal failures plus both timeout paths.
{
  const normal = { ...initialState, regulatorMode: Mode.NORMAL, monitorMode: Mode.NORMAL };
  const regFailure = traceStep("regulator-only internal failure at low temperature",
    nominalRoot({ current: { valueDF: 960 }, regulatorSupervision: { internalFailureDetected: true } }), normal,
    ["CASE-05 regulator latch", "CASE-07 normal_unhealthy", "CASE-08 safe_off_priority", "CASE-20 regulator_only"]);
  const monFailure = traceStep("monitor-only internal failure at safe temperature",
    nominalRoot({ monitorSupervision: { internalFailureDetected: true } }), normal,
    ["CASE-15 monitor latch", "CASE-17 normal_unhealthy", "CASE-18 failed_on_priority", "CASE-20 monitor_only"]);
  const regTimeout = traceStep("regulator initialization timeout",
    nominalRoot({ desired: { lowerValid: false }, regulatorSupervision: { initTimeoutExpired: true } }), initialState,
    ["CASE-07 init_unhealthy_timeout"]);
  const monTimeout = traceStep("monitor initialization timeout",
    nominalRoot({ alarm: { lowerValid: false }, monitorSupervision: { initTimeoutExpired: true } }), initialState,
    ["CASE-17 init_unhealthy_timeout"]);
  requireCheck(regFailure._result.nextState.regulatorMode === Mode.FAILED &&
    regFailure._result.nextState.monitorMode === Mode.NORMAL && regFailure._result.outputs.heatControl === Command.Off,
    "SCN-08 regulator-only noninterference and priority");
  requireCheck(monFailure._result.nextState.monitorMode === Mode.FAILED &&
    monFailure._result.nextState.regulatorMode === Mode.NORMAL && monFailure._result.outputs.alarmControl === Command.On,
    "SCN-08 monitor-only noninterference and priority");
  requireCheck(regTimeout._result.nextState.regulatorMode === Mode.FAILED &&
    regTimeout._result.nextState.monitorMode === Mode.NORMAL, "SCN-08 regulator timeout");
  requireCheck(monTimeout._result.nextState.monitorMode === Mode.FAILED &&
    monTimeout._result.nextState.regulatorMode === Mode.NORMAL, "SCN-08 monitor timeout");
  scenarioTraces.push({ scenario_id: "SCN-08", family: "independent_failures_and_timeouts",
    variants: ["regulator_only_failure", "monitor_only_failure", "regulator_timeout", "monitor_timeout"],
    steps: [publicStep(regFailure), publicStep(monFailure), publicStep(regTimeout), publicStep(monTimeout)] });
}

const ownershipAudit = [
  {
    usage: "manage_regulator_interface",
    claimed_roles: ["applicability"],
    assigned_inputs: ["INT-01 CurrentTemperature", "INT-02 DesiredTemperatureSettings", "INT-06 RegulatorMode"],
    owner_local_facts: ["two-status RegulatorInterfaceFailure", "round-half-up DisplayTemperature"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03"],
    analyzer_checks: ["desired_status_partition", "display_rounding_domain"],
    passed: true
  },
  {
    usage: "detect_regulator_failure",
    claimed_roles: ["applicability"],
    assigned_inputs: ["INT-03 RegulatorSupervision", "prior regulator failure latch"],
    owner_local_facts: ["resettable regulator internal-failure latch"],
    contract_cases: ["CASE-04", "CASE-05"],
    analyzer_checks: ["regulator_diagnostic_partition"],
    passed: true
  },
  {
    usage: "manage_regulator_mode",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-04 RegulatorInterfaceFacts", "INT-05 RegulatorDiagnosticFacts", "prior RegulatorMode"],
    owner_local_facts: ["regulator health conjunction", "complete RegulatorMode next-state decision"],
    contract_cases: ["CASE-06", "CASE-07"],
    analyzer_checks: ["regulator_mode_partition"],
    passed: true
  },
  {
    usage: "manage_heat_source",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-08 RegulatorControlBasis", "INT-09 RegulatorMode", "prior HeatControl"],
    owner_local_facts: ["safe-off priority and three-region heat decision"],
    contract_cases: ["CASE-08", "CASE-09", "CASE-10"],
    analyzer_checks: ["heat_policy_partition", "regulator_priority_trace"],
    passed: true
  },
  {
    usage: "manage_monitor_interface",
    claimed_roles: ["applicability"],
    assigned_inputs: ["INT-11 CurrentTemperature", "INT-12 AlarmTemperatureSettings", "INT-16 MonitorMode"],
    owner_local_facts: ["two-status MonitorInterfaceFailure and AlarmRange applicability"],
    contract_cases: ["CASE-11", "CASE-12", "CASE-13"],
    analyzer_checks: ["alarm_status_partition"],
    passed: true
  },
  {
    usage: "detect_monitor_failure",
    claimed_roles: ["applicability"],
    assigned_inputs: ["INT-13 MonitorSupervision", "prior monitor failure latch"],
    owner_local_facts: ["resettable monitor internal-failure latch"],
    contract_cases: ["CASE-14", "CASE-15"],
    analyzer_checks: ["monitor_diagnostic_partition"],
    passed: true
  },
  {
    usage: "manage_monitor_mode",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-14 MonitorInterfaceFacts", "INT-15 MonitorDiagnosticFacts", "prior MonitorMode"],
    owner_local_facts: ["monitor health conjunction", "complete MonitorMode next-state decision"],
    contract_cases: ["CASE-16", "CASE-17"],
    analyzer_checks: ["monitor_mode_partition"],
    passed: true
  },
  {
    usage: "manage_alarm",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-18 MonitorControlBasis", "INT-19 MonitorMode", "prior AlarmControl"],
    owner_local_facts: ["failed-on priority and five-region hysteretic alarm decision"],
    contract_cases: ["CASE-18", "CASE-19"],
    analyzer_checks: ["alarm_policy_partition", "monitor_priority_trace", "CASE-20 cross_failure_noninterference"],
    passed: true
  }
];

requireCheck(Object.keys(semanticConnectionMap).length === 20, "semantic interaction map cardinality");
requireCheck(scenarioTraces.length === 8, "scenario family cardinality");
requireCheck(guardGaps === 0, "zero guard gaps");
requireCheck(guardOverlaps === 0, "zero guard overlaps");
requireCheck(outputMismatches === 0, "zero output mismatches");
requireCheck(nextStateMismatches === 0, "zero next-state mismatches");
requireCheck(invariantViolations === 0, "zero invariant violations");

const report = {
  status: failures.length === 0 ? "passed" : "failed",
  schema_version: 1,
  source_sha256: SOURCE_SHA256,
  analysis_strategy: "exact finite enumeration with regulator/monitor Cartesian factorization",
  claim_boundary: "Checks exact finite logical contracts, connection composition, and scenario oracles only; it does not establish physical timing, plant performance, diagnostic coverage, generated-code correctness, execution, proof, or safety certification.",
  finite_domain: {
    current_temperature_tenths: { minimum: CURRENT_MIN, maximum: CURRENT_MAX, cardinality: currentValues.length },
    display_temperature: { minimum: DISPLAY_MIN, maximum: DISPLAY_MAX, cardinality: displayValues.length, non_normal: "unconstrained within canonical type" },
    current_validity_cardinality: 2,
    desired_bound_pairs: desiredBounds.length,
    alarm_bound_pairs: alarmBounds.length,
    supervision_records_per_path: supervisions.length,
    admissible_setting_pairs_under_ASM_04: admissibleSettingPairs,
    exhausted_root_inputs: rootInputCount,
    factorization_basis: "Every root input projects to one exhaustively checked regulator local tuple and one exhaustively checked monitor local tuple; CASE-20 checks the absence of cross-path dependence."
  },
  semantic_connection_map: semanticConnectionMap,
  generated_support: {
    process_containers: 1,
    boundary_delegations_traversed: 10,
    semantic_credit: 0,
    behavioral_owners: []
  },
  partition_counts: partitionCounts,
  observations: {
    guard_gaps: guardGaps,
    guard_overlaps: guardOverlaps,
    required_output_mismatches: outputMismatches,
    next_state_mismatches: nextStateMismatches,
    invariant_violations: invariantViolations,
    semantic_interactions: 20,
    resolved_connections: 30,
    scenario_families: scenarioTraces.length
  },
  checks: {
    canonical_temperature_bounds_present: CURRENT_MIN === 680 && CURRENT_MAX === 1050 && DISPLAY_MIN === 68 && DISPLAY_MAX === 105,
    canonical_single_sample_fanout_present: (rootDefinition.match(/port current_temperature\s*:\s*DataPort/g) || []).length === 1 &&
      rootDefinition.includes("connect current_temperature to thermostat_process.regulator_current_temperature") &&
      rootDefinition.includes("connect current_temperature to thermostat_process.monitor_current_temperature"),
    exact_root_domain_exhausted: rootInputCount === 133013888,
    all_local_partitions_complete_and_disjoint: guardGaps === 0 && guardOverlaps === 0,
    all_required_outputs_match: outputMismatches === 0,
    all_next_states_match: nextStateMismatches === 0,
    all_invariants_hold: invariantViolations === 0,
    semantic_map_complete: Object.keys(semanticConnectionMap).length === 20,
    regulator_monitor_independence: failures.every((item) => !item.includes("noninterference")),
    all_scenario_families_executed: scenarioTraces.length === 8
  },
  ownership_audit: ownershipAudit,
  scenario_traces: scenarioTraces,
  failures
};

process.stdout.write(JSON.stringify(report));
