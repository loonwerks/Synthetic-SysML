const SOURCE = Object.freeze({
  path: "model/HVAC_Energy_Interface_Supervisor.sysml",
  sha256: "324230a6acbba3a2a9805173a3a56f8e028ac94334de66db322b55ac8456a6b7"
});

const DOMAIN = Object.freeze({
  climateRequest: ["Off", "Regulate"],
  thermalRelation: ["Below", "Within", "Above", "Unknown"],
  defrostRequest: ["Off", "On"],
  glazingCondition: ["Clear", "Obscured", "Unknown"],
  electricalState: ["Ready", "Constrained", "Unavailable", "Unknown"],
  powerEnvelope: ["Normal", "Reduced", "None", "Unknown"],
  engineHeat: ["Available", "Unavailable", "Unknown"],
  freshRequest: ["Absent", "Present"],
  fanPreference: ["Auto", "Low", "High", "Unknown"],
  recoveryState: ["Armed", "Inhibited"]
});

const SEMANTIC_CONNECTION_MAP = Object.freeze({
  "INT-01": "root.climateRequest -> comfortDemandQualifier.climateRequest",
  "INT-02": "root.thermalRelation -> comfortDemandQualifier.thermalRelation",
  "INT-03": "root.defrostRequest -> visibilityDemandQualifier.defrostRequest",
  "INT-04": "root.glazingCondition -> visibilityDemandQualifier.glazingCondition",
  "INT-05": "root.energyContext -> energyCapabilityQualifier.energyContext",
  "INT-06": "root.freshRequest -> recoveryAuthority.freshRequest",
  "INT-07": "root.fanPreference -> actuationCommandCoordinator.fanPreference",
  "INT-08": "comfortDemandQualifier.comfortDemand -> servicePriorityArbiter.comfortDemand",
  "INT-09": "visibilityDemandQualifier.visibilityDemand -> servicePriorityArbiter.visibilityDemand",
  "INT-10": "energyCapabilityQualifier.energyCapability -> recoveryAuthority.energyCapability",
  "INT-11": "recoveryAuthority.recoveryDecision -> servicePriorityArbiter.recoveryDecision",
  "INT-12": "servicePriorityArbiter.serviceSelection -> resourceAllocationDecision.serviceSelection",
  "INT-13": "energyCapabilityQualifier.energyCapability -> resourceAllocationDecision.energyCapability",
  "INT-14": "resourceAllocationDecision.resourceGrant -> actuationCommandCoordinator.resourceGrant",
  "INT-15": "servicePriorityArbiter.serviceSelection -> actuationCommandCoordinator.serviceSelection",
  "INT-16": "actuationCommandCoordinator.actuationDisposition -> supervisoryStatusComposer.actuationDisposition",
  "INT-17": "servicePriorityArbiter.serviceSelection -> supervisoryStatusComposer.serviceSelection",
  "INT-18": "resourceAllocationDecision.resourceGrant -> supervisoryStatusComposer.resourceGrant",
  "INT-19": "recoveryAuthority.recoveryDecision -> supervisoryStatusComposer.recoveryDecision",
  "INT-20": "actuationCommandCoordinator.plantCommand -> root.plantCommand",
  "INT-21": "supervisoryStatusComposer.supervisorStatus -> root.supervisorStatus"
});

const OWNERSHIP_AUDIT = Object.freeze([
  {
    usage: "comfortDemandQualifier",
    claimed_roles: ["applicability"],
    assigned_inputs: ["climateRequest", "thermalRelation"],
    owner_local_facts: ["comfortDemand"],
    contract_cases: ["QUAL-01"],
    analyzer_checks: ["comfort-owner-qualification"]
  },
  {
    usage: "visibilityDemandQualifier",
    claimed_roles: ["applicability"],
    assigned_inputs: ["defrostRequest", "glazingCondition"],
    owner_local_facts: ["visibilityDemand"],
    contract_cases: ["QUAL-02"],
    analyzer_checks: ["visibility-owner-qualification"]
  },
  {
    usage: "energyCapabilityQualifier",
    claimed_roles: ["applicability"],
    assigned_inputs: ["energyContext.electricalState", "energyContext.powerEnvelope", "energyContext.engineHeat"],
    owner_local_facts: ["energyCapability"],
    contract_cases: ["QUAL-03"],
    analyzer_checks: ["energy-owner-qualification"]
  },
  {
    usage: "recoveryAuthority",
    claimed_roles: ["decision"],
    assigned_inputs: ["recoveryState", "energyCapability", "freshRequest"],
    owner_local_facts: ["nextRecoveryState", "recoveryDecision"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05"],
    analyzer_checks: ["recovery-owner-partition"]
  },
  {
    usage: "servicePriorityArbiter",
    claimed_roles: ["decision"],
    assigned_inputs: ["comfortDemand", "visibilityDemand", "recoveryDecision"],
    owner_local_facts: ["serviceSelection.service", "serviceSelection.reason"],
    contract_cases: ["CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12"],
    analyzer_checks: ["priority-owner-partition", "defrost-over-comfort-conflict"]
  },
  {
    usage: "resourceAllocationDecision",
    claimed_roles: ["decision"],
    assigned_inputs: ["serviceSelection.service", "energyCapability"],
    owner_local_facts: ["resourceGrant"],
    contract_cases: ["CASE-13", "CASE-14", "CASE-15", "CASE-16"],
    analyzer_checks: ["allocation-owner-partition", "reduced-capability-downgrade"]
  },
  {
    usage: "actuationCommandCoordinator",
    claimed_roles: ["decision"],
    assigned_inputs: ["serviceSelection.service", "resourceGrant", "fanPreference"],
    owner_local_facts: ["plantCommand", "actuationDisposition"],
    contract_cases: ["CASE-17", "CASE-18", "CASE-19", "CASE-20"],
    analyzer_checks: ["command-owner-partition", "quiescent-fault-output"]
  },
  {
    usage: "supervisoryStatusComposer",
    claimed_roles: ["decision"],
    assigned_inputs: ["recoveryDecision", "serviceSelection.service", "serviceSelection.reason", "resourceGrant", "actuationDisposition"],
    owner_local_facts: ["supervisorStatus"],
    contract_cases: ["STAT-01"],
    analyzer_checks: ["status-owner-composition"]
  }
]);

const usable = capability => capability !== "Invalid" && capability !== "None";
const permitted = decision => decision === "Permit" || decision === "PermitRecovered";
const same = (left, right) => JSON.stringify(left) === JSON.stringify(right);
const quiescent = command => command.thermalService === "Off" && command.airPath === "Off" && command.blower === "Off";

function contractComfort(climateRequest, thermalRelation) {
  if (climateRequest === "Off") return { fact: "None", branch: "QUAL-01-OFF" };
  return { fact: ({ Unknown: "Invalid", Below: "Heat", Within: "Hold", Above: "Cool" })[thermalRelation], branch: `QUAL-01-${thermalRelation.toUpperCase()}` };
}

function oracleComfort(climateRequest, thermalRelation) {
  const table = {
    Off: { Below: "None", Within: "None", Above: "None", Unknown: "None" },
    Regulate: { Below: "Heat", Within: "Hold", Above: "Cool", Unknown: "Invalid" }
  };
  return table[climateRequest][thermalRelation];
}

function comfortGuardCount(climateRequest, thermalRelation) {
  return [
    climateRequest === "Off",
    climateRequest === "Regulate" && thermalRelation === "Unknown",
    climateRequest === "Regulate" && thermalRelation === "Below",
    climateRequest === "Regulate" && thermalRelation === "Within",
    climateRequest === "Regulate" && thermalRelation === "Above"
  ].filter(Boolean).length;
}

function contractVisibility(defrostRequest, glazingCondition) {
  if (glazingCondition === "Unknown") return { fact: "Invalid", branch: "QUAL-02-INVALID" };
  if (defrostRequest === "On" || glazingCondition === "Obscured") return { fact: "Required", branch: "QUAL-02-REQUIRED" };
  return { fact: "None", branch: "QUAL-02-NONE" };
}

function oracleVisibility(defrostRequest, glazingCondition) {
  if (glazingCondition === "Unknown") return "Invalid";
  return defrostRequest === "On" || glazingCondition === "Obscured" ? "Required" : "None";
}

function visibilityGuardCount(defrostRequest, glazingCondition) {
  return [
    glazingCondition === "Unknown",
    glazingCondition !== "Unknown" && (defrostRequest === "On" || glazingCondition === "Obscured"),
    defrostRequest === "Off" && glazingCondition === "Clear"
  ].filter(Boolean).length;
}

function contractEnergy(energyContext) {
  const { electricalState, powerEnvelope, engineHeat } = energyContext;
  if (electricalState === "Unknown" || powerEnvelope === "Unknown" || engineHeat === "Unknown") return { fact: "Invalid", branch: "QUAL-03-INVALID" };
  if (electricalState === "Unavailable" || powerEnvelope === "None") return { fact: "None", branch: "QUAL-03-NONE" };
  if (electricalState === "Ready" && powerEnvelope === "Normal") return { fact: "Full", branch: "QUAL-03-FULL" };
  return { fact: engineHeat === "Available" ? "ReducedHeat" : "ReducedElectric", branch: engineHeat === "Available" ? "QUAL-03-REDUCED-HEAT" : "QUAL-03-REDUCED-ELECTRIC" };
}

function oracleEnergy(energyContext) {
  const values = Object.values(energyContext);
  if (values.includes("Unknown")) return "Invalid";
  if (energyContext.electricalState === "Unavailable" || energyContext.powerEnvelope === "None") return "None";
  if (energyContext.electricalState === "Ready" && energyContext.powerEnvelope === "Normal") return "Full";
  return energyContext.engineHeat === "Available" ? "ReducedHeat" : "ReducedElectric";
}

function energyGuardCount(energyContext) {
  const { electricalState, powerEnvelope, engineHeat } = energyContext;
  const known = electricalState !== "Unknown" && powerEnvelope !== "Unknown" && engineHeat !== "Unknown";
  const available = electricalState !== "Unavailable" && powerEnvelope !== "None";
  const full = electricalState === "Ready" && powerEnvelope === "Normal";
  return [
    !known,
    known && !available,
    known && available && full,
    known && available && !full && engineHeat === "Available",
    known && available && !full && engineHeat === "Unavailable"
  ].filter(Boolean).length;
}

function recoveryMatches(previousState, capability, freshRequest) {
  return [
    ["CASE-01", capability === "Invalid"],
    ["CASE-02", capability === "None"],
    ["CASE-03", previousState === "Inhibited" && usable(capability) && freshRequest === "Absent"],
    ["CASE-04", previousState === "Inhibited" && usable(capability) && freshRequest === "Present"],
    ["CASE-05", previousState === "Armed" && usable(capability)]
  ].filter(([, match]) => match).map(([id]) => id);
}

function contractRecovery(previousState, capability, freshRequest) {
  const caseId = recoveryMatches(previousState, capability, freshRequest)[0];
  if (caseId === "CASE-01") return { caseId, nextState: "Inhibited", decision: "BlockEnergyInvalid" };
  if (caseId === "CASE-02") return { caseId, nextState: "Inhibited", decision: "BlockEnergyUnavailable" };
  if (caseId === "CASE-03") return { caseId, nextState: "Inhibited", decision: "BlockAwaitFresh" };
  if (caseId === "CASE-04") return { caseId, nextState: "Armed", decision: "PermitRecovered" };
  return { caseId, nextState: "Armed", decision: "Permit" };
}

function oracleRecovery(previousState, capability, freshRequest) {
  if (capability === "Invalid") return { nextState: "Inhibited", decision: "BlockEnergyInvalid" };
  if (capability === "None") return { nextState: "Inhibited", decision: "BlockEnergyUnavailable" };
  if (previousState === "Armed") return { nextState: "Armed", decision: "Permit" };
  return freshRequest === "Present"
    ? { nextState: "Armed", decision: "PermitRecovered" }
    : { nextState: "Inhibited", decision: "BlockAwaitFresh" };
}

function priorityMatches(comfortDemand, visibilityDemand, recoveryDecision) {
  return [
    ["CASE-06", !permitted(recoveryDecision)],
    ["CASE-07", permitted(recoveryDecision) && (comfortDemand === "Invalid" || visibilityDemand === "Invalid")],
    ["CASE-08", permitted(recoveryDecision) && comfortDemand !== "Invalid" && visibilityDemand === "Required"],
    ["CASE-09", permitted(recoveryDecision) && visibilityDemand === "None" && comfortDemand === "Heat"],
    ["CASE-10", permitted(recoveryDecision) && visibilityDemand === "None" && comfortDemand === "Cool"],
    ["CASE-11", permitted(recoveryDecision) && visibilityDemand === "None" && comfortDemand === "Hold"],
    ["CASE-12", permitted(recoveryDecision) && visibilityDemand === "None" && comfortDemand === "None"]
  ].filter(([, match]) => match).map(([id]) => id);
}

function contractPriority(comfortDemand, visibilityDemand, recoveryDecision) {
  const caseId = priorityMatches(comfortDemand, visibilityDemand, recoveryDecision)[0];
  if (caseId === "CASE-06") return { caseId, service: "Off", reason: recoveryDecision };
  if (caseId === "CASE-07") return { caseId, service: "Off", reason: "InvalidDemand" };
  if (caseId === "CASE-08") return { caseId, service: "Defrost", reason: "SelectedDefrost" };
  if (caseId === "CASE-09") return { caseId, service: "Heat", reason: "SelectedHeat" };
  if (caseId === "CASE-10") return { caseId, service: "Cool", reason: "SelectedCool" };
  if (caseId === "CASE-11") return { caseId, service: "Off", reason: "TemperatureHold" };
  return { caseId, service: "Off", reason: "UserOff" };
}

function oraclePriority(comfortDemand, visibilityDemand, recoveryDecision) {
  if (!permitted(recoveryDecision)) return { service: "Off", reason: recoveryDecision };
  if (comfortDemand === "Invalid" || visibilityDemand === "Invalid") return { service: "Off", reason: "InvalidDemand" };
  if (visibilityDemand === "Required") return { service: "Defrost", reason: "SelectedDefrost" };
  const table = {
    Heat: { service: "Heat", reason: "SelectedHeat" },
    Cool: { service: "Cool", reason: "SelectedCool" },
    Hold: { service: "Off", reason: "TemperatureHold" },
    None: { service: "Off", reason: "UserOff" }
  };
  return table[comfortDemand];
}

function allocationMatches(selection) {
  return [
    ["CASE-13", selection.service === "Off"],
    ["CASE-14", selection.service === "Defrost"],
    ["CASE-15", selection.service === "Heat"],
    ["CASE-16", selection.service === "Cool"]
  ].filter(([, match]) => match).map(([id]) => id);
}

function contractAllocation(selection, capability) {
  const caseId = allocationMatches(selection)[0];
  if (caseId === "CASE-13") return { caseId, grant: "Off" };
  if (caseId === "CASE-14") return { caseId, grant: ({ Full: "FullThermal", ReducedHeat: "EconomyHeat", ReducedElectric: "VentOnly", None: "Off", Invalid: "Off" })[capability] };
  if (caseId === "CASE-15") return { caseId, grant: ({ Full: "FullThermal", ReducedHeat: "EconomyHeat", ReducedElectric: "Denied", None: "Off", Invalid: "Off" })[capability] };
  return { caseId, grant: ({ Full: "FullThermal", ReducedHeat: "Denied", ReducedElectric: "Denied", None: "Off", Invalid: "Off" })[capability] };
}

function oracleAllocation(selection, capability) {
  const table = {
    Off: { Full: "Off", ReducedHeat: "Off", ReducedElectric: "Off", None: "Off", Invalid: "Off" },
    Defrost: { Full: "FullThermal", ReducedHeat: "EconomyHeat", ReducedElectric: "VentOnly", None: "Off", Invalid: "Off" },
    Heat: { Full: "FullThermal", ReducedHeat: "EconomyHeat", ReducedElectric: "Denied", None: "Off", Invalid: "Off" },
    Cool: { Full: "FullThermal", ReducedHeat: "Denied", ReducedElectric: "Denied", None: "Off", Invalid: "Off" }
  };
  return table[selection.service][capability];
}

function compatible(service, grant) {
  return (service === "Heat" && (grant === "FullThermal" || grant === "EconomyHeat")) ||
    (service === "Cool" && grant === "FullThermal") ||
    (service === "Defrost" && (grant === "FullThermal" || grant === "EconomyHeat" || grant === "VentOnly"));
}

function actuationMatches(selection, grant, fanPreference) {
  const invalidCombination = selection.service !== "Off" && !compatible(selection.service, grant);
  return [
    ["CASE-17", selection.service === "Off" || grant === "Off" || grant === "Denied" || invalidCombination],
    ["CASE-18", selection.service !== "Off" && compatible(selection.service, grant) && fanPreference === "Unknown"],
    ["CASE-19", (selection.service === "Heat" || selection.service === "Cool") && compatible(selection.service, grant) && fanPreference !== "Unknown"],
    ["CASE-20", selection.service === "Defrost" && compatible(selection.service, grant) && fanPreference !== "Unknown"]
  ].filter(([, match]) => match).map(([id]) => id);
}

function contractActuation(selection, grant, fanPreference) {
  const caseId = actuationMatches(selection, grant, fanPreference)[0];
  const off = { thermalService: "Off", airPath: "Off", blower: "Off" };
  if (caseId === "CASE-17") {
    const disposition = selection.service === "Off" ? "Quiescent" : grant === "Denied" ? "Denied" : "Inconsistent";
    return { caseId, command: off, disposition };
  }
  if (caseId === "CASE-18") return { caseId, command: off, disposition: "InputFault" };
  if (caseId === "CASE-19") {
    const blower = grant === "EconomyHeat" || fanPreference === "Auto" || fanPreference === "Low" ? "Low" : "High";
    return {
      caseId,
      command: { thermalService: selection.service, airPath: "Cabin", blower },
      disposition: grant === "FullThermal" ? "Active" : "LimitedActive"
    };
  }
  const thermalService = grant === "VentOnly" ? "Off" : "Heat";
  const blower = grant === "FullThermal" && fanPreference !== "Low" ? "High" : "Low";
  return {
    caseId,
    command: { thermalService, airPath: "Glazing", blower },
    disposition: grant === "FullThermal" ? "Active" : "LimitedActive"
  };
}

function oracleActuation(selection, grant, fanPreference) {
  const off = { command: { thermalService: "Off", airPath: "Off", blower: "Off" } };
  if (selection.service === "Off") return { ...off, disposition: "Quiescent" };
  if (grant === "Denied") return { ...off, disposition: "Denied" };
  if (!compatible(selection.service, grant)) return { ...off, disposition: "Inconsistent" };
  if (fanPreference === "Unknown") return { ...off, disposition: "InputFault" };
  if (selection.service === "Defrost") {
    return {
      command: {
        thermalService: grant === "VentOnly" ? "Off" : "Heat",
        airPath: "Glazing",
        blower: grant === "FullThermal" && fanPreference !== "Low" ? "High" : "Low"
      },
      disposition: grant === "FullThermal" ? "Active" : "LimitedActive"
    };
  }
  return {
    command: {
      thermalService: selection.service,
      airPath: "Cabin",
      blower: grant === "EconomyHeat" || fanPreference !== "High" ? "Low" : "High"
    },
    disposition: grant === "FullThermal" ? "Active" : "LimitedActive"
  };
}

function contractStatus(recoveryDecision, selection, grant, disposition) {
  if (disposition === "InputFault" || disposition === "Inconsistent" || selection.reason === "InvalidDemand" || recoveryDecision === "BlockEnergyInvalid") return "InputFault";
  if (recoveryDecision === "BlockEnergyUnavailable" || recoveryDecision === "BlockAwaitFresh") return "Inhibited";
  if (selection.reason === "UserOff") return "Inactive";
  if (selection.reason === "TemperatureHold") return "Holding";
  if (grant === "Denied" || grant === "EconomyHeat" || grant === "VentOnly") return "Limited";
  return ({ Heat: "HeatingRequested", Cool: "CoolingRequested", Defrost: "DefrostRequested" })[selection.service];
}

function oracleStatus(recoveryDecision, selection, grant, disposition) {
  const fault = ["InputFault", "Inconsistent"].includes(disposition) || selection.reason === "InvalidDemand" || recoveryDecision === "BlockEnergyInvalid";
  if (fault) return "InputFault";
  const table = {
    BlockEnergyUnavailable: "Inhibited",
    BlockAwaitFresh: "Inhibited",
    UserOff: "Inactive",
    TemperatureHold: "Holding"
  };
  if (table[recoveryDecision]) return table[recoveryDecision];
  if (table[selection.reason]) return table[selection.reason];
  if (["Denied", "EconomyHeat", "VentOnly"].includes(grant)) return "Limited";
  return ({ Heat: "HeatingRequested", Cool: "CoolingRequested", Defrost: "DefrostRequested" })[selection.service];
}

function statusGuardCount(recoveryDecision, selection, grant, disposition) {
  const fault = disposition === "InputFault" || disposition === "Inconsistent" || selection.reason === "InvalidDemand" || recoveryDecision === "BlockEnergyInvalid";
  return [
    fault,
    !fault && (recoveryDecision === "BlockEnergyUnavailable" || recoveryDecision === "BlockAwaitFresh"),
    !fault && permitted(recoveryDecision) && selection.reason === "UserOff",
    !fault && permitted(recoveryDecision) && selection.reason === "TemperatureHold",
    !fault && permitted(recoveryDecision) && selection.reason !== "UserOff" && selection.reason !== "TemperatureHold" && ["Denied", "EconomyHeat", "VentOnly"].includes(grant),
    disposition === "Active" && grant === "FullThermal" && selection.service === "Heat",
    disposition === "Active" && grant === "FullThermal" && selection.service === "Cool",
    disposition === "Active" && grant === "FullThermal" && selection.service === "Defrost"
  ].filter(Boolean).length;
}

function compose(previousState, input) {
  const comfort = contractComfort(input.climateRequest, input.thermalRelation);
  const visibility = contractVisibility(input.defrostRequest, input.glazingCondition);
  const energy = contractEnergy(input.energyContext);

  const energyToRecovery = energy.fact;
  const energyToAllocation = energy.fact;
  const recovery = contractRecovery(previousState, energyToRecovery, input.freshRequest);
  const recoveryToPriority = recovery.decision;
  const recoveryToStatus = recovery.decision;
  const selection = contractPriority(comfort.fact, visibility.fact, recoveryToPriority);
  const selectionToAllocation = selection;
  const selectionToActuation = selection;
  const selectionToStatus = selection;
  const allocation = contractAllocation(selectionToAllocation, energyToAllocation);
  const grantToActuation = allocation.grant;
  const grantToStatus = allocation.grant;
  const actuation = contractActuation(selectionToActuation, grantToActuation, input.fanPreference);
  const dispositionToStatus = actuation.disposition;
  const status = contractStatus(recoveryToStatus, selectionToStatus, grantToStatus, dispositionToStatus);

  return {
    nextState: recovery.nextState,
    owners: { comfort, visibility, energy, recovery, selection, allocation, actuation, status },
    outputs: { plantCommand: actuation.command, supervisorStatus: status },
    publicationEqualities: {
      energyCapability: energyToRecovery === energyToAllocation,
      recoveryDecision: recoveryToPriority === recoveryToStatus,
      serviceSelection: same(selectionToAllocation, selectionToActuation) && same(selectionToActuation, selectionToStatus),
      resourceGrant: grantToActuation === grantToStatus
    }
  };
}

const partitionOwners = ["comfort", "visibility", "energy", "recovery", "priority", "allocation", "actuation", "status"];
const partitionCounts = Object.fromEntries(partitionOwners.map(owner => [owner, {}]));
const caseWitnesses = {};
const gaps = [];
const overlaps = [];
const requiredOutputMismatches = [];
const violationCounts = {
  stale_replay: 0,
  priority: 0,
  nonquiescent_fault: 0,
  contradictory_command: 0,
  missing_assignment: 0,
  publication_equality: 0
};
const checkExecutions = Object.fromEntries(OWNERSHIP_AUDIT.flatMap(entry => entry.analyzer_checks).map(name => [name, 0]));
let snapshots = 0;

function recordPartition(owner, names, witness) {
  if (names.length === 0) gaps.push({ owner, witness });
  if (names.length > 1) overlaps.push({ owner, branches: names, witness });
  for (const name of names) {
    partitionCounts[owner][name] = (partitionCounts[owner][name] || 0) + 1;
    if (!caseWitnesses[name]) caseWitnesses[name] = witness;
  }
}

function mismatch(owner, witness, expected, observed) {
  if (requiredOutputMismatches.length < 32) requiredOutputMismatches.push({ owner, witness, expected, observed });
}

for (const climateRequest of DOMAIN.climateRequest)
for (const thermalRelation of DOMAIN.thermalRelation)
for (const defrostRequest of DOMAIN.defrostRequest)
for (const glazingCondition of DOMAIN.glazingCondition)
for (const electricalState of DOMAIN.electricalState)
for (const powerEnvelope of DOMAIN.powerEnvelope)
for (const engineHeat of DOMAIN.engineHeat)
for (const freshRequest of DOMAIN.freshRequest)
for (const fanPreference of DOMAIN.fanPreference)
for (const previousState of DOMAIN.recoveryState) {
  snapshots += 1;
  const energyContext = { electricalState, powerEnvelope, engineHeat };
  const input = { climateRequest, thermalRelation, defrostRequest, glazingCondition, energyContext, freshRequest, fanPreference };
  const witness = { previousState, ...input };
  const result = compose(previousState, input);
  const { comfort, visibility, energy, recovery, selection, allocation, actuation, status } = result.owners;

  recordPartition("comfort", comfortGuardCount(climateRequest, thermalRelation) === 1 ? [comfort.branch] : [], witness);
  recordPartition("visibility", visibilityGuardCount(defrostRequest, glazingCondition) === 1 ? [visibility.branch] : [], witness);
  recordPartition("energy", energyGuardCount(energyContext) === 1 ? [energy.branch] : [], witness);
  recordPartition("recovery", recoveryMatches(previousState, energy.fact, freshRequest), witness);
  recordPartition("priority", priorityMatches(comfort.fact, visibility.fact, recovery.decision), witness);
  recordPartition("allocation", allocationMatches(selection), witness);
  recordPartition("actuation", actuationMatches(selection, allocation.grant, fanPreference), witness);
  const statusCount = statusGuardCount(recovery.decision, selection, allocation.grant, actuation.disposition);
  recordPartition("status", statusCount === 1 ? [`STAT-01-${status}`] : [], witness);

  checkExecutions["comfort-owner-qualification"] += 1;
  checkExecutions["visibility-owner-qualification"] += 1;
  checkExecutions["energy-owner-qualification"] += 1;
  checkExecutions["recovery-owner-partition"] += 1;
  checkExecutions["priority-owner-partition"] += 1;
  checkExecutions["allocation-owner-partition"] += 1;
  checkExecutions["command-owner-partition"] += 1;
  checkExecutions["status-owner-composition"] += 1;

  if (comfort.fact !== oracleComfort(climateRequest, thermalRelation)) mismatch("comfortDemandQualifier", witness, oracleComfort(climateRequest, thermalRelation), comfort.fact);
  if (visibility.fact !== oracleVisibility(defrostRequest, glazingCondition)) mismatch("visibilityDemandQualifier", witness, oracleVisibility(defrostRequest, glazingCondition), visibility.fact);
  if (energy.fact !== oracleEnergy(energyContext)) mismatch("energyCapabilityQualifier", witness, oracleEnergy(energyContext), energy.fact);
  const expectedRecovery = oracleRecovery(previousState, energy.fact, freshRequest);
  if (!same({ nextState: recovery.nextState, decision: recovery.decision }, expectedRecovery)) mismatch("recoveryAuthority", witness, expectedRecovery, recovery);
  const expectedSelection = oraclePriority(comfort.fact, visibility.fact, recovery.decision);
  if (!same({ service: selection.service, reason: selection.reason }, expectedSelection)) mismatch("servicePriorityArbiter", witness, expectedSelection, selection);
  const expectedGrant = oracleAllocation(selection, energy.fact);
  if (allocation.grant !== expectedGrant) mismatch("resourceAllocationDecision", witness, expectedGrant, allocation.grant);
  const expectedActuation = oracleActuation(selection, allocation.grant, fanPreference);
  if (!same({ command: actuation.command, disposition: actuation.disposition }, expectedActuation)) mismatch("actuationCommandCoordinator", witness, expectedActuation, actuation);
  const expectedStatus = oracleStatus(recovery.decision, selection, allocation.grant, actuation.disposition);
  if (status !== expectedStatus) mismatch("supervisoryStatusComposer", witness, expectedStatus, status);

  if (visibility.fact === "Required" && (comfort.fact === "Heat" || comfort.fact === "Cool") && permitted(recovery.decision)) {
    checkExecutions["defrost-over-comfort-conflict"] += 1;
    if (selection.service !== "Defrost") violationCounts.priority += 1;
  }
  if ((energy.fact === "ReducedHeat" || energy.fact === "ReducedElectric") && selection.service !== "Off") checkExecutions["reduced-capability-downgrade"] += 1;
  if ((actuation.disposition === "InputFault" || actuation.disposition === "Inconsistent") && !quiescent(actuation.command)) violationCounts.nonquiescent_fault += 1;
  checkExecutions["quiescent-fault-output"] += 1;
  if (previousState === "Inhibited" && usable(energy.fact) && freshRequest === "Absent" && (recovery.nextState !== "Inhibited" || !quiescent(actuation.command))) violationCounts.stale_replay += 1;
  if (!result.outputs.plantCommand || !result.outputs.supervisorStatus) violationCounts.missing_assignment += 1;
  if (result.outputs.plantCommand.thermalService !== "Off" && !["Heat", "Cool"].includes(result.outputs.plantCommand.thermalService)) violationCounts.contradictory_command += 1;
  if (!Object.values(result.publicationEqualities).every(Boolean)) violationCounts.publication_equality += 1;
}

function fullEnergy() {
  return { electricalState: "Ready", powerEnvelope: "Normal", engineHeat: "Unavailable" };
}

function reducedHeatEnergy() {
  return { electricalState: "Constrained", powerEnvelope: "Reduced", engineHeat: "Available" };
}

function reducedElectricEnergy() {
  return { electricalState: "Constrained", powerEnvelope: "Reduced", engineHeat: "Unavailable" };
}

function baseInput(overrides = {}) {
  return {
    climateRequest: "Regulate",
    thermalRelation: "Below",
    defrostRequest: "Off",
    glazingCondition: "Clear",
    energyContext: fullEnergy(),
    freshRequest: "Absent",
    fanPreference: "Auto",
    ...overrides
  };
}

function executeTrace(initialState, inputs, expected) {
  let state = initialState;
  const steps = [];
  let passed = true;
  for (let index = 0; index < inputs.length; index += 1) {
    const input = inputs[index];
    const observed = compose(state, input);
    const cases = [observed.owners.recovery.caseId, observed.owners.selection.caseId, observed.owners.allocation.caseId, observed.owners.actuation.caseId];
    const stepExpected = expected[index];
    const observedSummary = {
      cases,
      nextState: observed.nextState,
      recoveryDecision: observed.owners.recovery.decision,
      comfortDemand: observed.owners.comfort.fact,
      visibilityDemand: observed.owners.visibility.fact,
      energyCapability: observed.owners.energy.fact,
      service: observed.owners.selection.service,
      resourceGrant: observed.owners.allocation.grant,
      actuationDisposition: observed.owners.actuation.disposition,
      plantCommand: observed.outputs.plantCommand,
      supervisorStatus: observed.outputs.supervisorStatus
    };
    const stepPassed = Object.entries(stepExpected).every(([key, value]) => same(observedSummary[key], value));
    passed = passed && stepPassed;
    steps.push({ step: index + 1, previousState: state, boundaryInputs: input, expected: stepExpected, observed: observedSummary, passed: stepPassed });
    state = observed.nextState;
  }
  return { passed, steps };
}

const scenarioTraces = [
  {
    scenario_id: "SCN-01",
    family: "initial activation",
    traces: [executeTrace("Inhibited", [
      baseInput({ freshRequest: "Absent" }),
      baseInput({ freshRequest: "Present" })
    ], [
      { cases: ["CASE-03", "CASE-06", "CASE-13", "CASE-17"], nextState: "Inhibited", supervisorStatus: "Inhibited" },
      { cases: ["CASE-04", "CASE-09", "CASE-15", "CASE-19"], nextState: "Armed", service: "Heat", supervisorStatus: "HeatingRequested" }
    ])]
  },
  {
    scenario_id: "SCN-02",
    family: "nominal thermal cycle",
    traces: [executeTrace("Armed", [
      baseInput({ thermalRelation: "Below" }),
      baseInput({ thermalRelation: "Within" }),
      baseInput({ thermalRelation: "Above" })
    ], [
      { cases: ["CASE-05", "CASE-09", "CASE-15", "CASE-19"], supervisorStatus: "HeatingRequested" },
      { cases: ["CASE-05", "CASE-11", "CASE-13", "CASE-17"], supervisorStatus: "Holding", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } },
      { cases: ["CASE-05", "CASE-10", "CASE-16", "CASE-19"], supervisorStatus: "CoolingRequested" }
    ])]
  },
  {
    scenario_id: "SCN-03",
    family: "defrost priority and release",
    traces: [executeTrace("Armed", [
      baseInput({ thermalRelation: "Above", glazingCondition: "Obscured" }),
      baseInput({ thermalRelation: "Above", glazingCondition: "Clear", defrostRequest: "Off" })
    ], [
      { cases: ["CASE-05", "CASE-08", "CASE-14", "CASE-20"], service: "Defrost", supervisorStatus: "DefrostRequested" },
      { cases: ["CASE-05", "CASE-10", "CASE-16", "CASE-19"], service: "Cool", supervisorStatus: "CoolingRequested" }
    ])]
  },
  {
    scenario_id: "SCN-04",
    family: "reduced allocation",
    traces: [
      executeTrace("Armed", [baseInput({ defrostRequest: "On", energyContext: reducedHeatEnergy() })], [{ cases: ["CASE-05", "CASE-08", "CASE-14", "CASE-20"], resourceGrant: "EconomyHeat", supervisorStatus: "Limited" }]),
      executeTrace("Armed", [baseInput({ defrostRequest: "On", energyContext: reducedElectricEnergy() })], [{ cases: ["CASE-05", "CASE-08", "CASE-14", "CASE-20"], resourceGrant: "VentOnly", supervisorStatus: "Limited" }]),
      executeTrace("Armed", [baseInput({ energyContext: reducedElectricEnergy() })], [{ cases: ["CASE-05", "CASE-09", "CASE-15", "CASE-17"], resourceGrant: "Denied", supervisorStatus: "Limited" }]),
      executeTrace("Armed", [baseInput({ thermalRelation: "Above", energyContext: reducedHeatEnergy() })], [{ cases: ["CASE-05", "CASE-10", "CASE-16", "CASE-17"], resourceGrant: "Denied", supervisorStatus: "Limited" }])
    ]
  },
  {
    scenario_id: "SCN-05",
    family: "energy-loss inhibition",
    traces: [executeTrace("Armed", [
      baseInput({ thermalRelation: "Below" }),
      baseInput({ energyContext: { electricalState: "Unavailable", powerEnvelope: "Normal", engineHeat: "Unavailable" } }),
      baseInput({ energyContext: fullEnergy(), freshRequest: "Absent" })
    ], [
      { cases: ["CASE-05", "CASE-09", "CASE-15", "CASE-19"], supervisorStatus: "HeatingRequested" },
      { cases: ["CASE-02", "CASE-06", "CASE-13", "CASE-17"], nextState: "Inhibited", supervisorStatus: "Inhibited", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } },
      { cases: ["CASE-03", "CASE-06", "CASE-13", "CASE-17"], nextState: "Inhibited", supervisorStatus: "Inhibited", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } }
    ])]
  },
  {
    scenario_id: "SCN-06",
    family: "fresh-request recovery",
    traces: [executeTrace("Inhibited", [
      baseInput({ energyContext: { electricalState: "Unavailable", powerEnvelope: "Normal", engineHeat: "Unavailable" }, freshRequest: "Present" }),
      baseInput({ energyContext: fullEnergy(), freshRequest: "Absent" }),
      baseInput({ energyContext: fullEnergy(), freshRequest: "Present", thermalRelation: "Above" })
    ], [
      { cases: ["CASE-02", "CASE-06", "CASE-13", "CASE-17"], nextState: "Inhibited" },
      { cases: ["CASE-03", "CASE-06", "CASE-13", "CASE-17"], nextState: "Inhibited" },
      { cases: ["CASE-04", "CASE-10", "CASE-16", "CASE-19"], nextState: "Armed", recoveryDecision: "PermitRecovered", supervisorStatus: "CoolingRequested" }
    ])]
  },
  {
    scenario_id: "SCN-07",
    family: "invalid-input suppression",
    traces: [
      executeTrace("Armed", [baseInput({ thermalRelation: "Unknown" })], [{ cases: ["CASE-05", "CASE-07", "CASE-13", "CASE-17"], supervisorStatus: "InputFault", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } }]),
      executeTrace("Armed", [baseInput({ glazingCondition: "Unknown" })], [{ cases: ["CASE-05", "CASE-07", "CASE-13", "CASE-17"], supervisorStatus: "InputFault", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } }]),
      executeTrace("Armed", [baseInput({ energyContext: { electricalState: "Ready", powerEnvelope: "Unknown", engineHeat: "Unavailable" } })], [{ cases: ["CASE-01", "CASE-06", "CASE-13", "CASE-17"], supervisorStatus: "InputFault", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } }]),
      executeTrace("Armed", [baseInput({ fanPreference: "Unknown" })], [{ cases: ["CASE-05", "CASE-09", "CASE-15", "CASE-18"], supervisorStatus: "InputFault", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } }])
    ]
  },
  {
    scenario_id: "SCN-08",
    family: "user-off and fan boundary",
    traces: [
      executeTrace("Armed", [baseInput({ climateRequest: "Off", thermalRelation: "Unknown", fanPreference: "Unknown" })], [{ cases: ["CASE-05", "CASE-12", "CASE-13", "CASE-17"], supervisorStatus: "Inactive", plantCommand: { thermalService: "Off", airPath: "Off", blower: "Off" } }]),
      executeTrace("Armed", [baseInput({ fanPreference: "Low" }), baseInput({ fanPreference: "High" }), baseInput({ fanPreference: "Auto" })], [
        { cases: ["CASE-05", "CASE-09", "CASE-15", "CASE-19"], plantCommand: { thermalService: "Heat", airPath: "Cabin", blower: "Low" } },
        { cases: ["CASE-05", "CASE-09", "CASE-15", "CASE-19"], plantCommand: { thermalService: "Heat", airPath: "Cabin", blower: "High" } },
        { cases: ["CASE-05", "CASE-09", "CASE-15", "CASE-19"], plantCommand: { thermalService: "Heat", airPath: "Cabin", blower: "Low" } }
      ])
    ]
  }
];

const scenarioFailures = scenarioTraces.flatMap(scenario => scenario.traces.map((trace, index) => ({ scenario_id: scenario.scenario_id, trace: index + 1, passed: trace.passed }))).filter(item => !item.passed);
const expectedCases = Array.from({ length: 20 }, (_, index) => `CASE-${String(index + 1).padStart(2, "0")}`);
const missingCaseWitnesses = expectedCases.filter(caseId => !caseWitnesses[caseId]);
const ownershipChecksNotExecuted = Object.entries(checkExecutions).filter(([, count]) => count === 0).map(([name]) => name);
const invariantChecks = {
  exact_snapshot_count: snapshots === 36864,
  all_local_partitions_total: gaps.length === 0,
  all_local_partitions_exclusive: overlaps.length === 0,
  all_owner_relations_match: requiredOutputMismatches.length === 0,
  every_counted_case_reachable: missingCaseWitnesses.length === 0,
  stale_request_not_replayed: violationCounts.stale_replay === 0,
  defrost_priority_preserved: violationCounts.priority === 0,
  faults_and_inconsistency_quiescent: violationCounts.nonquiescent_fault === 0,
  complete_required_outputs: violationCounts.missing_assignment === 0,
  command_tuple_noncontradictory: violationCounts.contradictory_command === 0,
  publications_equal_at_all_consumers: violationCounts.publication_equality === 0,
  exact_semantic_connection_inventory: Object.keys(SEMANTIC_CONNECTION_MAP).length === 21,
  every_ownership_check_executed: ownershipChecksNotExecuted.length === 0,
  all_scenario_traces_passed: scenarioFailures.length === 0,
  exact_scenario_family_count: scenarioTraces.length === 8
};

const passed = Object.values(invariantChecks).every(Boolean);
const result = {
  status: passed ? "passed" : "failed",
  passed,
  source: SOURCE,
  claim_boundary: "Exhaustive conformance only for the approved finite 36,864-snapshot abstraction and listed ordered traces; not compositional proof, solver certification, generated-code correctness, execution, physical HVAC performance, automotive safety, or certification.",
  domain: {
    expected_snapshots: 36864,
    enumerated_snapshots: snapshots,
    factorization: "2 climate * 4 thermal * 2 defrost * 3 glazing * 48 energy * 2 fresh * 4 fan * 2 prior recovery state"
  },
  semantic_connection_map: SEMANTIC_CONNECTION_MAP,
  partition_counts: partitionCounts,
  gaps,
  overlaps,
  required_output_mismatches: requiredOutputMismatches,
  violation_counts: violationCounts,
  invariant_checks: invariantChecks,
  missing_case_witnesses: missingCaseWitnesses,
  case_witnesses: caseWitnesses,
  ownership_audit: OWNERSHIP_AUDIT.map(entry => ({ ...entry, passed: entry.analyzer_checks.every(name => checkExecutions[name] > 0), executed: entry.analyzer_checks.every(name => checkExecutions[name] > 0), execution_counts: Object.fromEntries(entry.analyzer_checks.map(name => [name, checkExecutions[name]])) })),
  scenario_family_count: scenarioTraces.length,
  scenario_traces: scenarioTraces,
  scenario_failures: scenarioFailures
};

console.log(JSON.stringify(result));
