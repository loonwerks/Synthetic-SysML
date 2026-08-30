import { readFileSync } from "node:fs";
import { createHash } from "node:crypto";

const SOURCE_SHA256 = "21424fafbfd58b33998929b314423608434264eee9b94f2327f51b06074ba657";
const CANONICAL_SOURCE_URL = new URL("../model/flight_stack.sysml", import.meta.url);
const canonicalSource = readFileSync(CANONICAL_SOURCE_URL, "utf8");
const observedSourceSha256 = createHash("sha256").update(canonicalSource).digest("hex");

const Mode = Object.freeze({ Off: "Off", SyncPending: "SyncPending", On: "On", CWS: "CWS", CwsSuspended: "CwsSuspended", Failed: "Failed" });
const AttitudeClass = Object.freeze({ Invalid: "Invalid", Unsafe: "Unsafe", Safe: "Safe" });
const FdState = Object.freeze({ Cleared: "Cleared", Displayed: "Displayed" });
const ApStatus = Object.freeze({ Failed: 0, Off: 1, On: 2 });

const clamp = (v, low, high) => Math.max(low, Math.min(high, v));
const deepCopy = (v) => JSON.parse(JSON.stringify(v));
const fullyDefined = (value) => value !== undefined && value !== null &&
  (typeof value !== "object" || Object.values(value).every(fullyDefined));

function qualifyCrew(c) {
  const invalidAuthority = !c.engageApStatus || !c.cwsStatus;
  const fdAction = c.displayFdStatus ? (c.displayFdWanted ? "Display" : "Clear") : "None";
  const syncRequested = c.syncFdStatus && c.syncFd;
  const conflict = c.engageApStatus && !c.engageApWanted &&
    ((c.cwsStatus && c.cwsHeld) || (c.syncFdStatus && c.syncFd) ||
      (c.displayFdStatus && c.displayFdWanted));
  return {
    fd: { fdAction, syncRequested, commandConflict: conflict },
    ap: {
      apAction: invalidAuthority ? "ForceDisengage" : (c.engageApWanted ? "Engage" : "Disengage"),
      cwsAction: invalidAuthority ? "ForceDisengage" : (c.cwsHeld ? "Hold" : "Release"),
      commandConflict: conflict
    },
    case: invalidAuthority || !c.displayFdStatus || !c.syncFdStatus ? "CASE-CMD-02" : "CASE-CMD-01"
  };
}

function qualifyAttitude(a) {
  if (!a.rollStatus || !a.pitchStatus) {
    return { classification: AttitudeClass.Invalid, rollTenthDeg: 0, pitchTenthDeg: 0, case: "CASE-ATT-02" };
  }
  const safe = a.rollTenthDeg >= -450 && a.rollTenthDeg <= 450 && a.pitchTenthDeg >= -450 && a.pitchTenthDeg <= 450;
  return {
    classification: safe ? AttitudeClass.Safe : AttitudeClass.Unsafe,
    rollTenthDeg: a.rollTenthDeg,
    pitchTenthDeg: a.pitchTenthDeg,
    case: safe ? "CASE-ATT-01" : "CASE-ATT-02"
  };
}

function referenceManager(prior, fd, attitude, apRequest, activeClearInhibit, initializing = false) {
  if (initializing) {
    return { referenceRoll: 0, referencePitch: 0, referenceValid: false, fdState: FdState.Cleared, case: "CASE-REF-01" };
  }
  if (attitude.classification === AttitudeClass.Invalid) {
    return { referenceRoll: prior.referenceRoll, referencePitch: prior.referencePitch, referenceValid: false, fdState: FdState.Cleared, case: "CASE-REF-01" };
  }
  const synchronize = attitude.classification === AttitudeClass.Safe &&
    !fd.commandConflict && (fd.syncRequested || fd.fdAction === "Display" || apRequest === "Requested");
  let next = { ...prior };
  let selectedCase = "CASE-REF-03";
  if (synchronize) {
    next.referenceRoll = attitude.rollTenthDeg;
    next.referencePitch = attitude.pitchTenthDeg;
    next.referenceValid = true;
    selectedCase = "CASE-REF-02";
  }
  if (fd.commandConflict || (fd.fdAction === "Clear" && !activeClearInhibit)) next.fdState = FdState.Cleared;
  if (!fd.commandConflict && fd.fdAction === "Display" && attitude.classification === AttitudeClass.Safe) next.fdState = FdState.Displayed;
  return { ...next, case: selectedCase };
}

function fdGuidanceHealth(attitude, ref) {
  const usable = ref.referenceValid && attitude.classification === AttitudeClass.Safe;
  if (usable) {
    const roll = clamp(ref.referenceRoll - attitude.rollTenthDeg, -450, 450);
    const pitch = clamp(ref.referencePitch - attitude.pitchTenthDeg, -450, 450);
    const on = ref.fdState === FdState.Displayed;
    return {
      fd: { leftRollGuidance: roll, rightRollGuidance: roll, leftPitchGuidance: pitch, rightPitchGuidance: pitch, leftFdOn: on, rightFdOn: on },
      health: { leftFcsFailed: false, rightFcsFailed: false, leftUnsafeAttitude: false, rightUnsafeAttitude: false },
      case: "CASE-FD-01"
    };
  }
  const failed = !ref.referenceValid || attitude.classification === AttitudeClass.Invalid;
  const unsafe = attitude.classification === AttitudeClass.Unsafe;
  return {
    fd: { leftRollGuidance: 0, rightRollGuidance: 0, leftPitchGuidance: 0, rightPitchGuidance: 0, leftFdOn: false, rightFdOn: false },
    health: { leftFcsFailed: failed, rightFcsFailed: failed, leftUnsafeAttitude: unsafe, rightUnsafeAttitude: unsafe },
    case: "CASE-FD-02"
  };
}

function apGuidanceGenerator(attitude, ref) {
  const available = ref.referenceValid && attitude.classification === AttitudeClass.Safe && ref.fdState === FdState.Displayed;
  return available
    ? { rollGuidance: ref.referenceRoll, pitchGuidance: ref.referencePitch, guidanceValid: true, case: "CASE-APG-01" }
    : { rollGuidance: 0, pitchGuidance: 0, guidanceValid: false, case: "CASE-APG-02" };
}

function apObservables(mode, cwsHeld, initializing = false) {
  if (initializing) return { pairedApStatus: { leftStatus: ApStatus.Off, rightStatus: ApStatus.Off }, apGuidanceRequest: "Invalid", apActiveClearInhibit: false, actuationAuthority: false };
  const status = mode === Mode.Failed ? ApStatus.Failed : (mode === Mode.On || mode === Mode.CWS ? ApStatus.On : ApStatus.Off);
  return {
    pairedApStatus: { leftStatus: status, rightStatus: status },
    apGuidanceRequest: mode === Mode.SyncPending || mode === Mode.CWS || (mode === Mode.CwsSuspended && cwsHeld) ? "Requested" : "NotRequested",
    apActiveClearInhibit: mode === Mode.SyncPending || mode === Mode.On || mode === Mode.CWS,
    actuationAuthority: mode === Mode.On
  };
}

function apEngagementManager(priorMode, ap, attitude, incomingGuidance, initializing = false) {
  if (initializing) {
    return { nextMode: Mode.Off, ...apObservables(Mode.Off, false, true), case: "CASE-AP-01" };
  }
  const cls = attitude.classification;
  const forced = ap.apAction === "ForceDisengage" || ap.cwsAction === "ForceDisengage" || cls === AttitudeClass.Invalid;
  const activeGuidanceFault = priorMode !== Mode.Off && cls === AttitudeClass.Safe && !incomingGuidance.guidanceValid;
  const disengage = ap.commandConflict || ap.apAction === "Disengage";
  const hold = ap.cwsAction === "Hold";
  const release = ap.cwsAction === "Release";
  let nextMode = priorMode;
  let selectedCase;

  if (priorMode === Mode.Failed) {
    nextMode = disengage && ap.cwsAction !== "ForceDisengage" && cls === AttitudeClass.Safe && incomingGuidance.guidanceValid ? Mode.Off : Mode.Failed;
    selectedCase = "CASE-AP-06";
  } else if (forced || activeGuidanceFault) {
    nextMode = Mode.Failed;
    selectedCase = priorMode === Mode.Off ? "CASE-AP-01" : priorMode === Mode.SyncPending ? "CASE-AP-02" : priorMode === Mode.On ? "CASE-AP-05" : "CASE-AP-04";
  } else if (disengage) {
    nextMode = Mode.Off;
    selectedCase = priorMode === Mode.SyncPending ? "CASE-AP-02" : priorMode === Mode.On ? "CASE-AP-05" : (priorMode === Mode.CWS || priorMode === Mode.CwsSuspended) ? "CASE-AP-04" : "CASE-AP-01";
  } else if (priorMode === Mode.Off) {
    nextMode = ap.apAction === "Engage" && cls === AttitudeClass.Safe && incomingGuidance.guidanceValid ? Mode.SyncPending : Mode.Off;
    selectedCase = "CASE-AP-01";
  } else if (priorMode === Mode.SyncPending) {
    nextMode = cls === AttitudeClass.Unsafe ? Mode.Off : incomingGuidance.guidanceValid ? Mode.On : Mode.Failed;
    selectedCase = "CASE-AP-02";
  } else if (priorMode === Mode.On) {
    nextMode = cls === AttitudeClass.Unsafe ? Mode.Off : !incomingGuidance.guidanceValid ? Mode.Failed : hold ? Mode.CWS : Mode.On;
    selectedCase = hold && cls === AttitudeClass.Safe ? "CASE-AP-03" : "CASE-AP-05";
  } else if (priorMode === Mode.CWS) {
    nextMode = cls === AttitudeClass.Unsafe ? (hold ? Mode.CwsSuspended : Mode.Off) : release ? Mode.On : Mode.CWS;
    selectedCase = "CASE-AP-04";
  } else {
    nextMode = cls === AttitudeClass.Unsafe ? (hold ? Mode.CwsSuspended : Mode.Off) : release ? Mode.Off : Mode.CwsSuspended;
    selectedCase = "CASE-AP-04";
  }
  return { nextMode, ...apObservables(nextMode, hold), case: selectedCase };
}

function apContractSelections(priorMode, ap, attitudeClass, guidanceValid) {
  const invalid = ap.apAction === "ForceDisengage" || ap.cwsAction === "ForceDisengage" || attitudeClass === AttitudeClass.Invalid;
  const activeFault = invalid || (priorMode !== Mode.Off && attitudeClass === AttitudeClass.Safe && !guidanceValid);
  const disengage = ap.commandConflict || ap.apAction === "Disengage";
  const safe = attitudeClass === AttitudeClass.Safe;
  const unsafe = attitudeClass === AttitudeClass.Unsafe;
  const hold = ap.cwsAction === "Hold";
  const release = ap.cwsAction === "Release";
  const selected = [];
  const cases = [];
  const add = (caseId, branch, guard, result) => { if (guard) selected.push({ caseId, branch, result }); };

  if (priorMode === Mode.Off) {
    cases.push("CASE-AP-01");
    add("CASE-AP-01", "fault", invalid, Mode.Failed);
    add("CASE-AP-01", "disengage", !invalid && disengage, Mode.Off);
    add("CASE-AP-01", "unsafe", !invalid && !disengage && unsafe, Mode.Off);
    add("CASE-AP-01", "engage", !invalid && !disengage && safe && ap.apAction === "Engage" && guidanceValid, Mode.SyncPending);
    add("CASE-AP-01", "retention", !invalid && !disengage && safe && !(ap.apAction === "Engage" && guidanceValid), Mode.Off);
  } else if (priorMode === Mode.SyncPending) {
    cases.push("CASE-AP-02");
    add("CASE-AP-02", "fault", activeFault, Mode.Failed);
    add("CASE-AP-02", "disengage", !activeFault && disengage, Mode.Off);
    add("CASE-AP-02", "unsafe", !activeFault && !disengage && unsafe, Mode.Off);
    add("CASE-AP-02", "complete", !activeFault && !disengage && safe && guidanceValid, Mode.On);
  } else if (priorMode === Mode.On) {
    const cwsEntry = !activeFault && !disengage && hold && safe && guidanceValid;
    if (cwsEntry) {
      cases.push("CASE-AP-03");
      add("CASE-AP-03", "cws_entry", true, Mode.CWS);
    } else {
      cases.push("CASE-AP-05");
      add("CASE-AP-05", "fault", activeFault, Mode.Failed);
      add("CASE-AP-05", "disengage", !activeFault && disengage, Mode.Off);
      add("CASE-AP-05", "unsafe", !activeFault && !disengage && unsafe, Mode.Off);
      add("CASE-AP-05", "retention", !activeFault && !disengage && safe && guidanceValid, Mode.On);
    }
  } else if (priorMode === Mode.CWS || priorMode === Mode.CwsSuspended) {
    cases.push("CASE-AP-04");
    add("CASE-AP-04", "fault", activeFault, Mode.Failed);
    add("CASE-AP-04", "disengage", !activeFault && disengage, Mode.Off);
    add("CASE-AP-04", "unsafe_hold", !activeFault && !disengage && unsafe && hold, Mode.CwsSuspended);
    add("CASE-AP-04", "unsafe_not_held", !activeFault && !disengage && unsafe && !hold, Mode.Off);
    add("CASE-AP-04", "cws_release", priorMode === Mode.CWS && !activeFault && !disengage && safe && guidanceValid && release, Mode.On);
    add("CASE-AP-04", "cws_retention", priorMode === Mode.CWS && !activeFault && !disengage && safe && guidanceValid && !release, Mode.CWS);
    add("CASE-AP-04", "suspended_release", priorMode === Mode.CwsSuspended && !activeFault && !disengage && safe && guidanceValid && release, Mode.Off);
    add("CASE-AP-04", "suspended_retention", priorMode === Mode.CwsSuspended && !activeFault && !disengage && safe && guidanceValid && !release, Mode.CwsSuspended);
  } else {
    cases.push("CASE-AP-06");
    const recover = disengage && ap.cwsAction !== "ForceDisengage" && safe && guidanceValid;
    add("CASE-AP-06", "recovery", recover, Mode.Off);
    add("CASE-AP-06", "latched", !recover, Mode.Failed);
  }
  return { cases, selected };
}

function actuatorRateProposer(guidance, attitude) {
  const valid = guidance.guidanceValid && attitude.classification === AttitudeClass.Safe;
  const rate = (error) => error < -1 ? -50 : error > 1 ? 50 : 0;
  return valid
    ? { rollRate: rate(guidance.rollGuidance - attitude.rollTenthDeg), pitchRate: rate(guidance.pitchGuidance - attitude.pitchTenthDeg), proposalValid: true, case: "CASE-PROP-01" }
    : { rollRate: 0, pitchRate: 0, proposalValid: false, case: "CASE-PROP-01" };
}

function actuatorSafetyGate(authority, proposal) {
  return authority && proposal.proposalValid
    ? { rollRateTenthDegPerSec: proposal.rollRate, pitchRateTenthDegPerSec: proposal.pitchRate, apOn: true, case: "CASE-GATE-01" }
    : { rollRateTenthDegPerSec: 0, pitchRateTenthDegPerSec: 0, apOn: false, case: "CASE-GATE-02" };
}

const semanticConnections = Object.freeze({
  "INT-FCS-01": ["CrewCommandQualifier.fdDisposition", "ReferenceManager.fdDisposition"],
  "INT-FCS-02": ["CrewCommandQualifier.apDisposition", "ApEngagementManager.apDisposition"],
  "INT-FCS-03": ["AttitudeSafetyQualifier.qualifiedAttitude", "ApEngagementManager.qualifiedAttitude"],
  "INT-FGS-01": ["AttitudeSafetyQualifier.qualifiedAttitude", "ReferenceManager.qualifiedAttitude"],
  "INT-FGS-02": ["AttitudeSafetyQualifier.qualifiedAttitude", "FdGuidanceHealthGenerator.qualifiedAttitude"],
  "INT-FGS-03": ["ReferenceManager.referenceAndFdState", "FdGuidanceHealthGenerator.referenceAndFdState"],
  "INT-FGS-04": ["AttitudeSafetyQualifier.qualifiedAttitude", "ApGuidanceGenerator.qualifiedAttitude"],
  "INT-FGS-05": ["ReferenceManager.referenceAndFdState", "ApGuidanceGenerator.referenceAndFdState"],
  "INT-CROSS-01": ["ApGuidanceGenerator.apGuidance", "ApEngagementManager.apGuidance"],
  "INT-CROSS-02A": ["ApEngagementManager.apGuidanceRequest", "ReferenceManager.apGuidanceRequest"],
  "INT-CROSS-02B": ["ApEngagementManager.apActiveClearInhibit", "ReferenceManager.apActiveClearInhibit"],
  "INT-CROSS-03": ["ApGuidanceGenerator.apGuidance", "ActuatorRateProposer.apGuidance"],
  "INT-APS-01": ["AttitudeSafetyQualifier.qualifiedAttitude", "ActuatorRateProposer.qualifiedAttitude"],
  "INT-APS-02": ["ApEngagementManager.actuationAuthority", "ActuatorSafetyGate.actuationAuthority"],
  "INT-APS-03": ["ActuatorRateProposer.proposedRates", "ActuatorSafetyGate.proposedRates"]
});

const canonicalConnectionEndpoints = Object.freeze({
  "INT-FCS-01": ["crewCommandQualifier.fdDisposition", "referenceManager.fdDisposition"],
  "INT-FCS-02": ["crewCommandQualifier.apDisposition", "apEngagementManager.apDisposition"],
  "INT-FCS-03": ["attitudeSafetyQualifier.qualifiedAttitude", "apEngagementManager.qualifiedAttitude"],
  "INT-FGS-01": ["attitudeSafetyQualifier.qualifiedAttitude", "referenceManager.qualifiedAttitude"],
  "INT-FGS-02": ["attitudeSafetyQualifier.qualifiedAttitude", "fdGuidanceHealthGenerator.qualifiedAttitude"],
  "INT-FGS-03": ["referenceManager.referenceAndFdState", "fdGuidanceHealthGenerator.referenceAndFdState"],
  "INT-FGS-04": ["attitudeSafetyQualifier.qualifiedAttitude", "apGuidanceGenerator.qualifiedAttitude"],
  "INT-FGS-05": ["referenceManager.referenceAndFdState", "apGuidanceGenerator.referenceAndFdState"],
  "INT-CROSS-01": ["apGuidanceGenerator.apGuidance", "apEngagementManager.apGuidance"],
  "INT-CROSS-02A": ["apEngagementManager.apGuidanceRequest", "referenceManager.apGuidanceRequest"],
  "INT-CROSS-02B": ["apEngagementManager.apActiveClearInhibit", "referenceManager.apActiveClearInhibit"],
  "INT-CROSS-03": ["apGuidanceGenerator.apGuidance", "actuatorRateProposer.apGuidance"],
  "INT-APS-01": ["attitudeSafetyQualifier.qualifiedAttitude", "actuatorRateProposer.qualifiedAttitude"],
  "INT-APS-02": ["apEngagementManager.actuationAuthority", "actuatorSafetyGate.actuationAuthority"],
  "INT-APS-03": ["actuatorRateProposer.proposedRates", "actuatorSafetyGate.proposedRates"]
});

const ownerContractCases = Object.freeze({
  crewCommandQualifier: ["CASE-CMD-01", "CASE-CMD-02"],
  attitudeSafetyQualifier: ["CASE-ATT-01", "CASE-ATT-02"],
  referenceManager: ["CASE-REF-01", "CASE-REF-02", "CASE-REF-03"],
  fdGuidanceHealthGenerator: ["CASE-FD-01", "CASE-FD-02"],
  apGuidanceGenerator: ["CASE-APG-01", "CASE-APG-02"],
  apEngagementManager: ["CASE-AP-01", "CASE-AP-02", "CASE-AP-03", "CASE-AP-04", "CASE-AP-05", "CASE-AP-06"],
  actuatorRateProposer: ["CASE-PROP-01"],
  actuatorSafetyGate: ["CASE-GATE-01", "CASE-GATE-02"]
});

const ownerDefinitions = Object.freeze({
  crewCommandQualifier: "CrewCommandQualifier",
  attitudeSafetyQualifier: "AttitudeSafetyQualifier",
  referenceManager: "ReferenceManager",
  fdGuidanceHealthGenerator: "FdGuidanceHealthGenerator",
  apGuidanceGenerator: "ApGuidanceGenerator",
  apEngagementManager: "ApEngagementManager",
  actuatorRateProposer: "ActuatorRateProposer",
  actuatorSafetyGate: "ActuatorSafetyGate"
});

const expectedCanonicalRelationSha256 = Object.freeze({
  "CASE-CMD-01": "de8caf4fd8c570d8317fdafc0c3cd1c42e83194c318d375cc82c012f01729574",
  "CASE-CMD-02": "1eddb042e98ec063911dc3dd1e4a88bb501847ccc1a202179446d1037f65c71f",
  "CASE-ATT-01": "1efa5231a9d88c239d6b86a77cb862f2d1e21a48af99a70fd8e0bcc0bf2479e5",
  "CASE-ATT-02": "0b4dacd5b912bb242abc8496af47c26f0a59ca2c53f78df9ab2eebf5ec5b1e9c",
  "CASE-REF-01": "6d6d46f45a75be90db8d78b1d8b2f50a6dda3877a4c6b67babfb5d2705994f8d",
  "CASE-REF-02": "87f57b8ec676be8815af0501883008dfdf8c3738ba260c0cd8b6dc6fae7261ea",
  "CASE-REF-03": "f25c4543988732bb6f1cd5dc2499f9e27e6f75f219312ef7ef063aa3923289e7",
  "CASE-FD-01": "bc8b4c35290bc274dda4857dcb7b0c3997ef3d71764207c55a5458d41e6c368d",
  "CASE-FD-02": "854ae15ba758bb5549ffd525488bd8a59a9e02cbf220ae2185d1577ceee2847c",
  "CASE-APG-01": "4a00d7f0a9f170a52094c33383ed224f077d5bb9b4ef2975c782921371c3704f",
  "CASE-APG-02": "17779bfd8e6ec392635062a4aa7a70c184aedf3960d7d557b4eecd641a91371d",
  "CASE-AP-01": "1d1a3bd7995fb2a239cb7ff2b88d8f4f57b5800b1750beca06d3f7a45a01de8c",
  "CASE-AP-02": "b796039928b7ae20f9132bb94a2383f86bad483e7b7d9cf9defbc32662042f2b",
  "CASE-AP-03": "112377c0236baa8e6079874e1a143fbf28e7830f7c2dae59b277a04c12660094",
  "CASE-AP-04": "6544b4bc011e1756711fd8da79738ac187a6a0148c258291bfb5f85903d2f98e",
  "CASE-AP-05": "b91f55acb5960d797a6d626dc913a0ca03c27ad19cb7234fd406824f3e8bf5c5",
  "CASE-AP-06": "9662f1b3c9c353fef931c25f51f81c87d10f8ad06ef135989aa77a45332ceb32",
  "CASE-PROP-01": "30a4cbaf5ea2fff877693d057c096e592848b1f2c69aabdbfbcd890009adf48d",
  "CASE-GATE-01": "f51184b7e3c2a620c1228fdc42a1f71c28f8de62a017b0020bde12cfdef864a8",
  "CASE-GATE-02": "418d16e259de55792f85ab0334c131090d62a30cce4d91c81be27bd53508ec61"
});

const escapeRegExp = (value) => value.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
const relationText = (caseId) => {
  const gumboId = caseId.replaceAll("-", "_");
  const start = canonicalSource.indexOf(`def ${gumboId}(`);
  if (start < 0) return "";
  const end = canonicalSource.indexOf(";", start);
  return end < 0 ? "" : canonicalSource.slice(start, end + 1).replace(/\s+/g, " ").trim();
};
const canonicalRelationAudit = Object.entries(expectedCanonicalRelationSha256).map(([caseId, expected]) => {
  const observed = createHash("sha256").update(relationText(caseId)).digest("hex");
  return { case_id: caseId, expected_sha256: expected, observed_sha256: observed, passed: observed === expected };
});
const canonicalRelationPass = Object.fromEntries(canonicalRelationAudit.map((record) => [record.case_id, record.passed]));

const ownerBlock = (definition) => {
  const start = canonicalSource.indexOf(`part def ${definition} :> Abstract`);
  if (start < 0) return "";
  const end = canonicalSource.indexOf("\n  part def ", start + 1);
  return canonicalSource.slice(start, end < 0 ? canonicalSource.length : end);
};
const canonicalOwnerBindingAudit = Object.entries(ownerContractCases).map(([usage, contractCases]) => {
  const block = ownerBlock(ownerDefinitions[usage]);
  const passed = contractCases.every((caseId) => {
    const gumboId = caseId.replaceAll("-", "_");
    return block.includes(`assert constraint ${gumboId}`) &&
      block.includes(`GUMBO__Library::${gumboId}(`) && canonicalRelationPass[caseId] === true;
  });
  return { usage, owner_definition: ownerDefinitions[usage], contract_cases: contractCases, passed };
});
const canonicalOwnerBindingPass = Object.fromEntries(canonicalOwnerBindingAudit.map((record) => [record.usage, record.passed]));

const normalizedOwnerBlock = (definition) => ownerBlock(definition).replace(/\s+/g, " ");
const occurrenceCount = (text, token) => text.split(token).length - 1;
const referenceOwnerBlock = normalizedOwnerBlock("ReferenceManager");
const apOwnerBlock = normalizedOwnerBlock("ApEngagementManager");
const canonicalStateBindingAudit = [
  {
    usage: "referenceManager",
    checks: ["single_owner_initializing", "single_owner_prior_state", "shared_next_output", "all_cases_share_state", "initialization_guards", "conflict_consumed"],
    passed: occurrenceCount(referenceOwnerBlock, "attribute initializing : Base_Types::Boolean;") === 1 &&
      occurrenceCount(referenceOwnerBlock, "attribute priorReferenceAndFdState : ReferenceAndFdState;") === 1 &&
      ["CASE_REF_01", "CASE_REF_02", "CASE_REF_03"].every((id) =>
        referenceOwnerBlock.includes(`GUMBO__Library::${id}( initializing,`) &&
        referenceOwnerBlock.includes("priorReferenceAndFdState, referenceAndFdState)")) &&
      relationText("CASE-REF-02").includes("not initializing") &&
      relationText("CASE-REF-03").includes("not initializing") &&
      relationText("CASE-REF-02").includes("fd.commandConflict") &&
      relationText("CASE-REF-03").includes("fd.commandConflict")
  },
  {
    usage: "apEngagementManager",
    checks: ["single_owner_initializing", "single_owner_prior_mode", "shared_next_mode", "all_cases_share_state", "initialization_guards", "conflict_consumed"],
    passed: occurrenceCount(apOwnerBlock, "attribute initializing : Base_Types::Boolean;") === 1 &&
      occurrenceCount(apOwnerBlock, "attribute priorMode : ApModeValue;") === 1 &&
      occurrenceCount(apOwnerBlock, "attribute apMode : ApModeValue;") === 1 &&
      ["CASE_AP_01", "CASE_AP_02", "CASE_AP_03", "CASE_AP_04", "CASE_AP_05", "CASE_AP_06"].every((id) =>
        apOwnerBlock.includes(`GUMBO__Library::${id}( initializing, priorMode,`) &&
        apOwnerBlock.includes("apMode, pairedApStatus, apGuidanceRequest, apActiveClearInhibit, actuationAuthority)")) &&
      ["CASE-AP-02", "CASE-AP-03", "CASE-AP-04", "CASE-AP-05", "CASE-AP-06"].every((id) =>
        relationText(id).includes("not initializing")) &&
      canonicalSource.includes("ap.commandConflict | ap.apAction == FlightStack::ApAction.Disengage") &&
      ["CASE-AP-01", "CASE-AP-02", "CASE-AP-03", "CASE-AP-04", "CASE-AP-05", "CASE-AP-06"].every((id) =>
        relationText(id).includes("apDisengageSelected(ap)"))
  }
];
const canonicalStateBindingPass = Object.fromEntries(canonicalStateBindingAudit.map((record) => [record.usage, record.passed]));
const allCanonicalStateBindingsPass = canonicalStateBindingAudit.every((record) => record.passed === true);

const canonicalConnectionAudit = Object.entries(canonicalConnectionEndpoints).map(([id, [source, destination]]) => {
  const connectionName = id.toLowerCase().replaceAll("-", "_");
  const pattern = new RegExp(`connection\\s+${escapeRegExp(connectionName)}\\s*:[^;]*connect\\s+${escapeRegExp(source)}\\s+to\\s+${escapeRegExp(destination)}\\s*;`);
  return { interaction_id: id, source, destination, passed: pattern.test(canonicalSource) };
});
const allCanonicalRelationsPass = canonicalRelationAudit.every((record) => record.passed === true);
const allCanonicalOwnerBindingsPass = canonicalOwnerBindingAudit.every((record) => record.passed === true);
const allCanonicalConnectionsPass = canonicalConnectionAudit.length === 15 && canonicalConnectionAudit.every((record) => record.passed === true);

function initialState() {
  return { reference: { referenceRoll: 0, referencePitch: 0, referenceValid: false, fdState: FdState.Cleared }, apMode: Mode.Off };
}

function step(prior, crew, rawAttitude) {
  const crewQualified = qualifyCrew(crew);
  const attitude = qualifyAttitude(rawAttitude);
  const incomingGuidance = apGuidanceGenerator(attitude, prior.reference);
  const ap = apEngagementManager(prior.apMode, crewQualified.ap, attitude, incomingGuidance);
  const reference = referenceManager(prior.reference, crewQualified.fd, attitude, ap.apGuidanceRequest, ap.apActiveClearInhibit);
  const fdHealth = fdGuidanceHealth(attitude, reference);
  const guidance = apGuidanceGenerator(attitude, reference);
  const proposal = actuatorRateProposer(guidance, attitude);
  const actuator = actuatorSafetyGate(ap.actuationAuthority, proposal);
  return {
    state: { reference: { referenceRoll: reference.referenceRoll, referencePitch: reference.referencePitch, referenceValid: reference.referenceValid, fdState: reference.fdState }, apMode: ap.nextMode },
    owners: { crewQualified, attitude, reference, fdHealth, guidance, ap, proposal, actuator },
    outputs: { pairedFdGuidance: fdHealth.fd, pairedFcsIndications: fdHealth.health, pairedApStatus: ap.pairedApStatus, actuatorCommand: actuator }
  };
}

function crew(overrides = {}) {
  return { displayFdWanted: true, displayFdStatus: true, syncFd: false, syncFdStatus: true, engageApWanted: true, engageApStatus: true, cwsHeld: false, cwsStatus: true, ...overrides };
}
function attitude(roll, pitch, valid = true) { return { rollTenthDeg: roll, rollStatus: valid, pitchTenthDeg: pitch, pitchStatus: valid }; }
function traceSteps(start, specs) {
  let state = deepCopy(start);
  return specs.map((spec, index) => {
    const observed = step(state, spec.crew, spec.attitude);
    state = observed.state;
    return { step: index + 1, input: { crew: spec.crew, attitude: spec.attitude }, expected_case: spec.expected, observed: { state: observed.state, outputs: observed.outputs, owner_cases: Object.fromEntries(Object.entries(observed.owners).filter(([, v]) => v && v.case).map(([k, v]) => [k, v.case])) } };
  });
}

function buildScenarios() {
  const displayedOff = { reference: { referenceRoll: 100, referencePitch: -50, referenceValid: true, fdState: FdState.Displayed }, apMode: Mode.Off };
  const displayedOn = { reference: { referenceRoll: 100, referencePitch: -50, referenceValid: true, fdState: FdState.Displayed }, apMode: Mode.On };
  return {
    "SCN-FD-01": traceSteps(initialState(), [
      { crew: crew(), attitude: attitude(100, -50), expected: ["CASE-REF-02", "CASE-FD-01"] },
      { crew: crew({ displayFdStatus: false, engageApWanted: false }), attitude: attitude(120, -40), expected: ["CASE-REF-03", "CASE-FD-01"] },
      { crew: crew({ displayFdStatus: false, syncFd: true, engageApWanted: false }), attitude: attitude(120, -40), expected: ["CASE-REF-03", "CASE-FD-01"] }
    ]),
    "SCN-FD-02": traceSteps(displayedOn, [
      { crew: crew({ displayFdWanted: false }), attitude: attitude(100, -50), expected: ["CASE-REF-03", "CASE-AP-05"] },
      { crew: crew({ displayFdWanted: false, engageApWanted: false }), attitude: attitude(100, -50), expected: ["CASE-AP-05", "CASE-GATE-02"] },
      { crew: crew({ displayFdWanted: false, engageApWanted: false }), attitude: attitude(100, -50), expected: ["CASE-REF-03", "CASE-FD-01"] }
    ]),
    "SCN-AP-01": traceSteps(displayedOff, [
      { crew: crew(), attitude: attitude(100, -50), expected: ["CASE-AP-01", "SyncPending"] },
      { crew: crew({ displayFdStatus: false }), attitude: attitude(100, -50), expected: ["CASE-AP-02", "On"] }
    ]),
    "SCN-CWS-01": traceSteps(displayedOn, [
      { crew: crew({ cwsHeld: true }), attitude: attitude(110, -40), expected: ["CASE-AP-03", "CWS"] },
      { crew: crew({ cwsHeld: false }), attitude: attitude(110, -40), expected: ["CASE-AP-04", "On"] }
    ]),
    "SCN-OFF-01": traceSteps(displayedOn, [
      { crew: crew({ engageApWanted: false }), attitude: attitude(100, -50), expected: ["CASE-AP-05", "Off", "CASE-GATE-02"] }
    ]),
    "SCN-SAFE-01": traceSteps(displayedOn, [
      { crew: crew(), attitude: attitude(451, 0), expected: ["CASE-ATT-02", "CASE-AP-05", "Off"] },
      { crew: crew({ engageApWanted: false }), attitude: attitude(450, 0), expected: ["CASE-ATT-01", "Off"] }
    ]),
    "SCN-INV-01": traceSteps(displayedOn, [
      { crew: crew(), attitude: attitude(100, -50, false), expected: ["CASE-ATT-02", "Failed", "CASE-FD-02", "CASE-GATE-02"] },
      { crew: crew(), attitude: attitude(100, -50), expected: ["CASE-REF-02", "CASE-AP-06", "Failed"] },
      { crew: crew({ engageApWanted: false, displayFdStatus: false }), attitude: attitude(100, -50), expected: ["CASE-AP-06", "Off"] }
    ]),
    "SCN-FAIL-01": traceSteps(displayedOn, [
      { crew: crew({ engageApStatus: false }), attitude: attitude(100, -50), expected: ["CASE-CMD-02", "Failed"] },
      { crew: crew({ engageApWanted: false, displayFdStatus: false }), attitude: attitude(100, -50), expected: ["CASE-AP-06", "Off"] },
      { crew: crew(), attitude: attitude(100, -50), expected: ["CASE-AP-01", "SyncPending"] },
      { crew: crew({ displayFdStatus: false }), attitude: attitude(100, -50), expected: ["CASE-AP-02", "On"] }
    ])
  };
}

function mixedStatusPriorityOracles() {
  const prior = {
    reference: { referenceRoll: 100, referencePitch: -50, referenceValid: true, fdState: FdState.Displayed },
    apMode: Mode.On
  };
  const cases = [
    {
      name: "valid_disengage_with_valid_sync_and_invalid_display",
      crew: crew({ displayFdStatus: false, syncFd: true, engageApWanted: false })
    },
    {
      name: "valid_disengage_with_valid_display_and_invalid_sync",
      crew: crew({ syncFdStatus: false, engageApWanted: false })
    },
    {
      name: "valid_disengage_with_valid_held_cws_and_invalid_sync",
      crew: crew({ displayFdWanted: false, syncFdStatus: false, engageApWanted: false, cwsHeld: true })
    }
  ];
  return cases.map(({ name, crew: rawCrew }) => {
    const observed = step(prior, rawCrew, attitude(120, -40));
    const passed = observed.owners.crewQualified.case === "CASE-CMD-02" &&
      observed.owners.crewQualified.fd.commandConflict === true &&
      observed.owners.crewQualified.ap.commandConflict === true &&
      observed.owners.crewQualified.ap.apAction === "Disengage" &&
      observed.state.apMode === Mode.Off && observed.owners.ap.actuationAuthority === false &&
      observed.state.reference.referenceRoll === 100 &&
      observed.state.reference.referencePitch === -50 &&
      observed.state.reference.referenceValid === true &&
      observed.state.reference.fdState === FdState.Cleared &&
      observed.outputs.pairedFdGuidance.leftRollGuidance === -20 &&
      observed.outputs.pairedFdGuidance.rightRollGuidance === -20 &&
      observed.outputs.pairedFdGuidance.leftPitchGuidance === -10 &&
      observed.outputs.pairedFdGuidance.rightPitchGuidance === -10 &&
      observed.outputs.pairedFdGuidance.leftFdOn === false &&
      observed.outputs.pairedFdGuidance.rightFdOn === false;
    return {
      oracle: name,
      expected: "explicit disengage dominates; reference is retained; FD is cleared",
      observed: {
        fdDisposition: observed.owners.crewQualified.fd,
        apDisposition: observed.owners.crewQualified.ap,
        apMode: observed.state.apMode,
        referenceAndFdState: observed.state.reference,
        pairedFdGuidance: observed.outputs.pairedFdGuidance
      },
      passed
    };
  });
}

function exhaustiveChecks() {
  const commandCounts = {
    total: 0, "CASE-CMD-01": 0, "CASE-CMD-02": 0, command_conflict: 0,
    gaps: 0, overlaps: 0, output_mismatches: 0
  };
  const bits = [false, true];
  for (const displayFdWanted of bits) for (const displayFdStatus of bits)
  for (const syncFd of bits) for (const syncFdStatus of bits)
  for (const engageApWanted of bits) for (const engageApStatus of bits)
  for (const cwsHeld of bits) for (const cwsStatus of bits) {
    const q = qualifyCrew({ displayFdWanted, displayFdStatus, syncFd, syncFdStatus, engageApWanted, engageApStatus, cwsHeld, cwsStatus });
    commandCounts.total++;
    commandCounts[q.case]++;
    if (q.fd.commandConflict && q.ap.commandConflict) commandCounts.command_conflict++;
    if (!q.fd || !q.ap) commandCounts.gaps++;
    if (!q.ap.apAction || !q.ap.cwsAction || !q.fd.fdAction) commandCounts.gaps++;
    const invalidAuthority = !engageApStatus || !cwsStatus;
    const expected = {
      fd: {
        fdAction: displayFdStatus ? (displayFdWanted ? "Display" : "Clear") : "None",
        syncRequested: syncFdStatus && syncFd,
        commandConflict: engageApStatus && !engageApWanted &&
          ((cwsStatus && cwsHeld) || (syncFdStatus && syncFd) ||
            (displayFdStatus && displayFdWanted))
      },
      ap: {
        apAction: invalidAuthority ? "ForceDisengage" : (engageApWanted ? "Engage" : "Disengage"),
        cwsAction: invalidAuthority ? "ForceDisengage" : (cwsHeld ? "Hold" : "Release")
      }
    };
    expected.ap.commandConflict = expected.fd.commandConflict;
    if (JSON.stringify(q.fd) !== JSON.stringify(expected.fd) ||
        JSON.stringify(q.ap) !== JSON.stringify(expected.ap)) commandCounts.output_mismatches++;
  }

  const referencePartition = {
    total: 0, gaps: 0, output_mismatches: 0, initialization_mismatches: 0,
    command_conflict_observations: 0, command_conflict_effect_mismatches: 0
  };
  const fdActions = ["None", "Display", "Clear"];
  const requests = ["Invalid", "NotRequested", "Requested"];
  const referencePriors = [
    { referenceRoll: 0, referencePitch: 0, referenceValid: false, fdState: FdState.Cleared },
    { referenceRoll: -450, referencePitch: 450, referenceValid: true, fdState: FdState.Cleared },
    { referenceRoll: 450, referencePitch: -450, referenceValid: true, fdState: FdState.Displayed }
  ];
  const representativeAttitudes = [
    { classification: AttitudeClass.Invalid, rollTenthDeg: 0, pitchTenthDeg: 0 },
    { classification: AttitudeClass.Unsafe, rollTenthDeg: 451, pitchTenthDeg: 0 },
    { classification: AttitudeClass.Safe, rollTenthDeg: 100, pitchTenthDeg: -50 }
  ];
  for (const prior of referencePriors) for (const fdAction of fdActions) for (const syncRequested of bits)
  for (const qualifiedAttitude of representativeAttitudes) for (const apRequest of requests)
  for (const activeClearInhibit of bits) for (const commandConflict of bits) {
    const fd = { fdAction, syncRequested, commandConflict };
    const observed = referenceManager(prior, fd, qualifiedAttitude, apRequest, activeClearInhibit);
    referencePartition.total++;
    if (!fullyDefined(observed)) referencePartition.gaps++;
    let expected;
    if (qualifiedAttitude.classification === AttitudeClass.Invalid) {
      expected = { ...prior, referenceValid: false, fdState: FdState.Cleared };
    } else {
      expected = { ...prior };
      const synchronize = qualifiedAttitude.classification === AttitudeClass.Safe &&
        !commandConflict && (syncRequested || fdAction === "Display" || apRequest === "Requested");
      if (synchronize) expected = { ...expected, referenceRoll: qualifiedAttitude.rollTenthDeg,
        referencePitch: qualifiedAttitude.pitchTenthDeg, referenceValid: true };
      if (commandConflict || (fdAction === "Clear" && !activeClearInhibit)) expected.fdState = FdState.Cleared;
      if (!commandConflict && fdAction === "Display" && qualifiedAttitude.classification === AttitudeClass.Safe) expected.fdState = FdState.Displayed;
    }
    const observedState = { referenceRoll: observed.referenceRoll, referencePitch: observed.referencePitch,
      referenceValid: observed.referenceValid, fdState: observed.fdState };
    if (JSON.stringify(observedState) !== JSON.stringify(expected)) referencePartition.output_mismatches++;
    if (commandConflict && qualifiedAttitude.classification !== AttitudeClass.Invalid) {
      referencePartition.command_conflict_observations++;
      if (observed.fdState !== FdState.Cleared) referencePartition.command_conflict_effect_mismatches++;
    }
  }
  const expectedInitialReference = { referenceRoll: 0, referencePitch: 0, referenceValid: false, fdState: FdState.Cleared };
  for (const prior of referencePriors) for (const qualifiedAttitude of representativeAttitudes) {
    const observed = referenceManager(prior,
      { fdAction: "Display", syncRequested: true, commandConflict: false }, qualifiedAttitude,
      "Requested", true, true);
    const observedState = { referenceRoll: observed.referenceRoll, referencePitch: observed.referencePitch,
      referenceValid: observed.referenceValid, fdState: observed.fdState };
    if (JSON.stringify(observedState) !== JSON.stringify(expectedInitialReference) || observed.case !== "CASE-REF-01") {
      referencePartition.initialization_mismatches++;
    }
  }

  const apObservablePartition = {
    total: 0, gaps: 0, post_initial_invalid_requests: 0, output_mismatches: 0,
    initialization_mismatches: 0
  };
  for (const mode of Object.values(Mode)) for (const cwsHeld of bits) {
    const observed = apObservables(mode, cwsHeld, false);
    apObservablePartition.total++;
    if (!fullyDefined(observed)) apObservablePartition.gaps++;
    if (observed.apGuidanceRequest === "Invalid") apObservablePartition.post_initial_invalid_requests++;
    const expectedRequest = mode === Mode.SyncPending || mode === Mode.CWS ||
      (mode === Mode.CwsSuspended && cwsHeld) ? "Requested" : "NotRequested";
    if (observed.apGuidanceRequest !== expectedRequest) apObservablePartition.output_mismatches++;
  }
  for (const priorMode of Object.values(Mode)) {
    const observed = apEngagementManager(priorMode,
      { apAction: "ForceDisengage", cwsAction: "ForceDisengage", commandConflict: true },
      { classification: AttitudeClass.Invalid, rollTenthDeg: 0, pitchTenthDeg: 0 },
      { rollGuidance: 0, pitchGuidance: 0, guidanceValid: false }, true);
    const expected = { nextMode: Mode.Off, pairedApStatus: { leftStatus: ApStatus.Off, rightStatus: ApStatus.Off },
      apGuidanceRequest: "Invalid", apActiveClearInhibit: false, actuationAuthority: false, case: "CASE-AP-01" };
    if (JSON.stringify(observed) !== JSON.stringify(expected)) apObservablePartition.initialization_mismatches++;
  }

  const axisCounts = { total: 0, invalid: 0, safe: 0, unsafe: 0 };
  for (const status of bits) for (let value = -1800; value <= 1799; value++) {
    axisCounts.total++;
    if (!status) axisCounts.invalid++;
    else if (value >= -450 && value <= 450) axisCounts.safe++;
    else axisCounts.unsafe++;
  }
  const attitudeCounts = {
    total: axisCounts.total ** 2,
    Invalid: axisCounts.total ** 2 - (axisCounts.safe + axisCounts.unsafe) ** 2,
    Safe: axisCounts.safe ** 2,
    Unsafe: (axisCounts.safe + axisCounts.unsafe) ** 2 - axisCounts.safe ** 2,
    gaps: 0,
    overlaps: 0
  };

  const apTransition = {
    total: 0,
    case_activation_counts: Object.fromEntries(["CASE-AP-01", "CASE-AP-02", "CASE-AP-03", "CASE-AP-04", "CASE-AP-05", "CASE-AP-06"].map((id) => [id, 0])),
    branch_activation_counts: {},
    result_counts: Object.fromEntries(Object.values(Mode).map((mode) => [mode, 0])),
    gaps: 0,
    overlaps: 0,
    contradictions: 0,
    case_partition_errors: 0,
    implementation_mismatches: 0
  };
  const apActions = ["None", "Engage", "Disengage", "ForceDisengage"];
  const cwsActions = ["None", "Hold", "Release", "ForceDisengage"];
  for (const priorMode of Object.values(Mode)) for (const apAction of apActions)
  for (const cwsAction of cwsActions) for (const classification of Object.values(AttitudeClass))
  for (const guidanceValid of bits) for (const commandConflict of bits) {
    const ap = { apAction, cwsAction, commandConflict };
    const contract = apContractSelections(priorMode, ap, classification, guidanceValid);
    const implementation = apEngagementManager(
      priorMode, ap,
      { classification, rollTenthDeg: 0, pitchTenthDeg: 0 },
      { rollGuidance: 0, pitchGuidance: 0, guidanceValid });
    apTransition.total++;
    if (contract.cases.length !== 1) apTransition.case_partition_errors++;
    for (const caseId of contract.cases) apTransition.case_activation_counts[caseId]++;
    if (contract.selected.length === 0) apTransition.gaps++;
    if (contract.selected.length > 1) apTransition.overlaps++;
    const distinctResults = new Set(contract.selected.map((entry) => entry.result));
    if (distinctResults.size > 1) apTransition.contradictions++;
    for (const entry of contract.selected) {
      const key = `${entry.caseId}:${entry.branch}`;
      apTransition.branch_activation_counts[key] = (apTransition.branch_activation_counts[key] || 0) + 1;
    }
    if (distinctResults.size === 1) {
      const expected = contract.selected[0].result;
      apTransition.result_counts[expected]++;
      if (implementation.nextMode !== expected || implementation.case !== contract.cases[0]) {
        apTransition.implementation_mismatches++;
      }
    }
  }

  const requiredAxisValues = [-1800, -451, -450, -449, -2, -1, 0, 1, 2, 449, 450, 451, 1799];
  const priorRefs = [
    { referenceRoll: 0, referencePitch: 0, referenceValid: false, fdState: FdState.Cleared },
    { referenceRoll: -450, referencePitch: 450, referenceValid: true, fdState: FdState.Cleared },
    { referenceRoll: 0, referencePitch: 0, referenceValid: true, fdState: FdState.Displayed },
    { referenceRoll: 450, referencePitch: -450, referenceValid: true, fdState: FdState.Displayed }
  ];
  let composed = 0;
  let requiredOutputMismatches = 0;
  let incompleteOwnerObservations = 0;
  const invariantViolations = { actuation_without_authority: 0, actuator_out_of_range: 0, paired_pfd_disagreement: 0, failed_to_on: 0, invalid_input_engagement: 0, attitude_guidance_disagreement: 0 };
  const representativeCrew = [];
  for (let mask = 0; mask < 256; mask++) representativeCrew.push({
    displayFdWanted: !!(mask & 1), displayFdStatus: !!(mask & 2), syncFd: !!(mask & 4), syncFdStatus: !!(mask & 8),
    engageApWanted: !!(mask & 16), engageApStatus: !!(mask & 32), cwsHeld: !!(mask & 64), cwsStatus: !!(mask & 128)
  });
  for (const c of representativeCrew) for (const apMode of Object.values(Mode)) for (const reference of priorRefs)
  for (const roll of requiredAxisValues) for (const pitch of requiredAxisValues) for (const valid of bits) {
    const prior = { reference, apMode };
    const observed = step(prior, c, attitude(roll, pitch, valid));
    composed++;
    if (!fullyDefined(observed.owners) || !fullyDefined(observed.outputs) || !fullyDefined(observed.state)) incompleteOwnerObservations++;
    const out = observed.outputs;
    const auth = observed.owners.ap.actuationAuthority;
    if (out.actuatorCommand.apOn && !auth) invariantViolations.actuation_without_authority++;
    if (Math.abs(out.actuatorCommand.rollRateTenthDegPerSec) > 200 || Math.abs(out.actuatorCommand.pitchRateTenthDegPerSec) > 200) invariantViolations.actuator_out_of_range++;
    if (out.pairedFdGuidance.leftRollGuidance !== out.pairedFdGuidance.rightRollGuidance || out.pairedFdGuidance.leftPitchGuidance !== out.pairedFdGuidance.rightPitchGuidance || out.pairedFdGuidance.leftFdOn !== out.pairedFdGuidance.rightFdOn || out.pairedFcsIndications.leftFcsFailed !== out.pairedFcsIndications.rightFcsFailed || out.pairedFcsIndications.leftUnsafeAttitude !== out.pairedFcsIndications.rightUnsafeAttitude || out.pairedApStatus.leftStatus !== out.pairedApStatus.rightStatus) invariantViolations.paired_pfd_disagreement++;
    if (apMode === Mode.Failed && observed.state.apMode === Mode.On) invariantViolations.failed_to_on++;
    if (!valid && observed.owners.ap.actuationAuthority) invariantViolations.invalid_input_engagement++;
    if (observed.owners.attitude.classification !== AttitudeClass.Safe && observed.owners.guidance.guidanceValid) invariantViolations.attitude_guidance_disagreement++;
    const gateExpectedOn = auth && observed.owners.proposal.proposalValid;
    if (out.actuatorCommand.apOn !== gateExpectedOn) requiredOutputMismatches++;
  }
  return { commandCounts, referencePartition, apObservablePartition, axisCounts, attitudeCounts, apTransition,
    composedRepresentativeObservations: composed, incompleteOwnerObservations, requiredAxisValues,
    requiredOutputMismatches, invariantViolations };
}

const checks = exhaustiveChecks();
const scenarios = buildScenarios();
const mixedStatusPriorityAudit = mixedStatusPriorityOracles();
const allMixedStatusPriorityOraclesPass = mixedStatusPriorityAudit.every((record) => record.passed === true);
const scenarioCounts = Object.fromEntries(Object.entries(scenarios).map(([id, traces]) => [id, traces.length]));
const scenarioOracleMismatches = [];
for (const [scenarioId, traces] of Object.entries(scenarios)) {
  for (const trace of traces) {
    const observedText = JSON.stringify(trace.observed);
    for (const expectedToken of trace.expected_case) {
      if (!observedText.includes(expectedToken)) scenarioOracleMismatches.push({ scenario_id: scenarioId, step: trace.step, expected: expectedToken });
    }
  }
}
const ownerCaseSets = Object.fromEntries(
  ["crewQualified", "attitude", "reference", "fdHealth", "guidance", "ap", "proposal", "actuator"]
    .map((owner) => [owner, new Set()])
);
for (const traces of Object.values(scenarios)) {
  for (const trace of traces) {
    for (const [owner, caseId] of Object.entries(trace.observed.owner_cases)) {
      ownerCaseSets[owner].add(caseId);
    }
  }
}
const ownershipSpecifications = [
  {
    usage: "crewCommandQualifier",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-BND-01"],
    owner_local_facts: ["multi-field validity, conflict, and command-priority disposition"],
    contract_cases: ["CASE-CMD-01", "CASE-CMD-02"],
    analyzer_checks: ["crew_owner_cases_execute"],
    passed: canonicalOwnerBindingPass.crewCommandQualifier === true && checks.commandCounts.gaps === 0 &&
      checks.commandCounts.output_mismatches === 0 && ["CASE-CMD-01", "CASE-CMD-02"].every((id) => ownerCaseSets.crewQualified.has(id))
  },
  {
    usage: "attitudeSafetyQualifier",
    claimed_roles: ["applicability", "decision"],
    assigned_inputs: ["INT-BND-02"],
    owner_local_facts: ["Invalid/Unsafe/Safe classification from two statuses and two axes"],
    contract_cases: ["CASE-ATT-01", "CASE-ATT-02"],
    analyzer_checks: ["attitude_owner_cases_execute"],
    passed: canonicalOwnerBindingPass.attitudeSafetyQualifier === true && checks.attitudeCounts.gaps === 0 &&
      ["CASE-ATT-01", "CASE-ATT-02"].every((id) => ownerCaseSets.attitude.has(id))
  },
  {
    usage: "referenceManager",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-FCS-01", "INT-FGS-01", "INT-CROSS-02A", "INT-CROSS-02B"],
    owner_local_facts: ["next Reference Attitude validity/value and FD requested state under priority"],
    contract_cases: ["CASE-REF-01", "CASE-REF-02", "CASE-REF-03"],
    analyzer_checks: ["reference_owner_cases_execute"],
    passed: canonicalOwnerBindingPass.referenceManager === true && canonicalStateBindingPass.referenceManager === true &&
      checks.referencePartition.gaps === 0 &&
      checks.referencePartition.output_mismatches === 0 && checks.referencePartition.initialization_mismatches === 0 &&
      checks.referencePartition.command_conflict_observations > 0 &&
      checks.referencePartition.command_conflict_effect_mismatches === 0 &&
      ["CASE-REF-01", "CASE-REF-02", "CASE-REF-03"].every((id) => ownerCaseSets.reference.has(id))
  },
  {
    usage: "fdGuidanceHealthGenerator",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-FGS-02", "INT-FGS-03"],
    owner_local_facts: ["saturated paired FD errors, paired visibility, failure, and unsafe annunciation"],
    contract_cases: ["CASE-FD-01", "CASE-FD-02"],
    analyzer_checks: ["fd_health_owner_cases_execute"],
    passed: canonicalOwnerBindingPass.fdGuidanceHealthGenerator === true &&
      ["CASE-FD-01", "CASE-FD-02"].every((id) => ownerCaseSets.fdHealth.has(id))
  },
  {
    usage: "apGuidanceGenerator",
    claimed_roles: ["applicability", "decision"],
    assigned_inputs: ["INT-FGS-04", "INT-FGS-05"],
    owner_local_facts: ["multi-input AP-guidance applicability and desired-attitude guidance"],
    contract_cases: ["CASE-APG-01", "CASE-APG-02"],
    analyzer_checks: ["ap_guidance_owner_cases_execute"],
    passed: canonicalOwnerBindingPass.apGuidanceGenerator === true &&
      ["CASE-APG-01", "CASE-APG-02"].every((id) => ownerCaseSets.guidance.has(id))
  },
  {
    usage: "apEngagementManager",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-FCS-02", "INT-FCS-03", "INT-CROSS-01"],
    owner_local_facts: ["six-mode next state, paired status, synchronization request, clear inhibition, and authority"],
    contract_cases: ["CASE-AP-01", "CASE-AP-02", "CASE-AP-03", "CASE-AP-04", "CASE-AP-05", "CASE-AP-06"],
    analyzer_checks: ["ap_transition_owner_cases_execute"],
    passed: canonicalOwnerBindingPass.apEngagementManager === true && canonicalStateBindingPass.apEngagementManager === true &&
      checks.apObservablePartition.gaps === 0 && checks.apObservablePartition.post_initial_invalid_requests === 0 &&
      checks.apObservablePartition.output_mismatches === 0 && checks.apObservablePartition.initialization_mismatches === 0 &&
      checks.apTransition.gaps === 0 && checks.apTransition.overlaps === 0 &&
      checks.apTransition.implementation_mismatches === 0 &&
      ["CASE-AP-01", "CASE-AP-02", "CASE-AP-03", "CASE-AP-04", "CASE-AP-05", "CASE-AP-06"].every((id) => ownerCaseSets.ap.has(id))
  },
  {
    usage: "actuatorRateProposer",
    claimed_roles: ["proposal", "decision"],
    assigned_inputs: ["INT-CROSS-03", "INT-APS-01"],
    owner_local_facts: ["independent three-level roll and pitch rate proposals from guidance error"],
    contract_cases: ["CASE-PROP-01"],
    analyzer_checks: ["actuator_proposal_owner_case_executes"],
    passed: canonicalOwnerBindingPass.actuatorRateProposer === true &&
      ownerCaseSets.proposal.has("CASE-PROP-01") && checks.requiredOutputMismatches === 0
  },
  {
    usage: "actuatorSafetyGate",
    claimed_roles: ["decision"],
    assigned_inputs: ["INT-APS-02", "INT-APS-03"],
    owner_local_facts: ["complementary final publish/inhibit authority decision"],
    contract_cases: ["CASE-GATE-01", "CASE-GATE-02"],
    analyzer_checks: ["actuator_gate_owner_cases_execute"],
    passed: canonicalOwnerBindingPass.actuatorSafetyGate === true &&
      ["CASE-GATE-01", "CASE-GATE-02"].every((id) => ownerCaseSets.actuator.has(id)) &&
      checks.invariantViolations.actuation_without_authority === 0
  }
];
const ownershipAudit = ownershipSpecifications.map(({ passed, ...record }) => ({ ...record, passed }));
const allOwnershipChecksPass = ownershipAudit.every((record) => record.passed === true);
const allInvariantChecksPass = Object.values(checks.invariantViolations).every((v) => v === 0);
const nonvacuityChecks = {
  qualified_command_conflict_executes: checks.commandCounts.command_conflict > 0,
  command_conflict_affects_downstream_partition: checks.referencePartition.command_conflict_observations > 0 &&
    checks.referencePartition.command_conflict_effect_mismatches === 0,
  mixed_status_disengagement_priority_executes: allMixedStatusPriorityOraclesPass,
  all_ap_cases_execute: Object.values(checks.apTransition.case_activation_counts).every((count) => count > 0),
  all_scenario_owner_cases_execute: ownershipAudit.every((record) => record.passed === true)
};
const analyzerEquivalenceChecks = {
  crew_relation_matches: checks.commandCounts.output_mismatches === 0,
  reference_relation_matches: checks.referencePartition.output_mismatches === 0,
  ap_relation_matches: checks.apTransition.implementation_mismatches === 0,
  initialization_relations_match: checks.referencePartition.initialization_mismatches === 0 &&
    checks.apObservablePartition.initialization_mismatches === 0,
  canonical_state_bindings_match: allCanonicalStateBindingsPass
};
const allNonvacuityChecksPass = Object.values(nonvacuityChecks).every((passed) => passed === true);
const allAnalyzerEquivalenceChecksPass = Object.values(analyzerEquivalenceChecks).every((passed) => passed === true);
const result = {
  status: observedSourceSha256 === SOURCE_SHA256 && allCanonicalRelationsPass &&
    allCanonicalOwnerBindingsPass && allCanonicalStateBindingsPass && allCanonicalConnectionsPass &&
    checks.commandCounts.gaps === 0 && checks.commandCounts.output_mismatches === 0 &&
    checks.referencePartition.gaps === 0 && checks.referencePartition.output_mismatches === 0 &&
    checks.referencePartition.initialization_mismatches === 0 &&
    checks.apObservablePartition.gaps === 0 && checks.apObservablePartition.post_initial_invalid_requests === 0 &&
    checks.apObservablePartition.output_mismatches === 0 && checks.apObservablePartition.initialization_mismatches === 0 &&
    checks.attitudeCounts.gaps === 0 &&
    checks.apTransition.gaps === 0 && checks.apTransition.overlaps === 0 &&
    checks.apTransition.contradictions === 0 && checks.apTransition.case_partition_errors === 0 &&
    checks.apTransition.implementation_mismatches === 0 && checks.requiredOutputMismatches === 0 &&
    checks.incompleteOwnerObservations === 0 && allInvariantChecksPass && allOwnershipChecksPass &&
    allNonvacuityChecksPass && allAnalyzerEquivalenceChecksPass &&
    allMixedStatusPriorityOraclesPass &&
    scenarioOracleMismatches.length === 0 && Object.keys(scenarios).length === 8 ? "passed" : "failed",
  source_sha256: SOURCE_SHA256,
  canonical_source_sha256: SOURCE_SHA256,
  ownership_audit: ownershipAudit,
  checks: {
    source_hash_matches: observedSourceSha256 === SOURCE_SHA256,
    canonical_relations_passed: allCanonicalRelationsPass,
    canonical_owner_bindings_passed: allCanonicalOwnerBindingsPass,
    canonical_state_bindings_passed: allCanonicalStateBindingsPass,
    canonical_connections_passed: allCanonicalConnectionsPass,
    ownership_records_passed: allOwnershipChecksPass,
    nonvacuity_checks_passed: allNonvacuityChecksPass,
    analyzer_equivalence_checks_passed: allAnalyzerEquivalenceChecksPass
  },
  canonical_relation_audit: canonicalRelationAudit,
  canonical_owner_binding_audit: canonicalOwnerBindingAudit,
  canonical_state_binding_audit: canonicalStateBindingAudit,
  canonical_connection_audit: canonicalConnectionAudit,
  semantic_connection_map: semanticConnections,
  partition_counts: {
    crew: checks.commandCounts,
    reference_and_fd_state: checks.referencePartition,
    ap_observables: checks.apObservablePartition,
    attitude_axis: checks.axisCounts,
    attitude_pair: checks.attitudeCounts,
    ap_transition: checks.apTransition,
    composed_representative_observations: checks.composedRepresentativeObservations,
    incomplete_owner_observations: checks.incompleteOwnerObservations
  },
  gaps: checks.commandCounts.gaps + checks.referencePartition.gaps + checks.apObservablePartition.gaps +
    checks.attitudeCounts.gaps + checks.apTransition.gaps + checks.incompleteOwnerObservations,
  overlaps: checks.commandCounts.overlaps + checks.attitudeCounts.overlaps + checks.apTransition.overlaps,
  required_output_mismatches: checks.requiredOutputMismatches,
  invariant_checks: checks.invariantViolations,
  nonvacuity_checks: nonvacuityChecks,
  analyzer_equivalence_checks: analyzerEquivalenceChecks,
  mixed_status_priority_audit: mixedStatusPriorityAudit,
  canonical_guard_crosscheck: {
    status_encoding: { Invalid: false, Valid: true },
    ap_status_encoding: { Failed: 0, Off: 1, On: 2 },
    safe_inclusive: [-450, 450],
    fd_saturation_inclusive: [-450, 450],
    proposal_deadband_inclusive: [-1, 1],
    proposal_levels: [-50, 0, 50],
    raw_axis_endpoints: [-1800, 1799],
    sampled_required_axis_values: checks.requiredAxisValues,
    owner_case_ids: ["CASE-CMD-01", "CASE-CMD-02", "CASE-ATT-01", "CASE-ATT-02", "CASE-REF-01", "CASE-REF-02", "CASE-REF-03", "CASE-FD-01", "CASE-FD-02", "CASE-APG-01", "CASE-APG-02", "CASE-AP-01", "CASE-AP-02", "CASE-AP-03", "CASE-AP-04", "CASE-AP-05", "CASE-AP-06", "CASE-PROP-01", "CASE-GATE-01", "CASE-GATE-02"]
  },
  scenario_trace_counts: scenarioCounts,
  scenario_oracle_mismatches: scenarioOracleMismatches,
  scenario_traces: scenarios,
  bounded_analysis_claim_boundary: "Deterministic finite logical-observation analysis only. Before finite execution, the analyzer verifies the canonical source hash, all 20 canonical relation-body fingerprints and owner-local bindings, the shared Reference/AP state and initialization bindings, and the exact 15 owner-to-owner connection endpoints. Crew Boolean/status space is enumerated exhaustively. The 51,840,000 two-axis attitude/status inputs are exhausted by exact Cartesian factoring of independently enumerated 7,200-element axis domains; all numeric policy breakpoints are then composed with every crew class, all six AP modes, both reference-valid classes, and both FD states on retained representatives. Qualified command-conflict, initialization, nonvacuity, and analyzer-equivalence checks execute explicitly. This is not compositional proof, solver certification, generated-code evidence, execution evidence, a timing or physical-performance claim, or safety certification."
};

process.stdout.write(JSON.stringify(result));
