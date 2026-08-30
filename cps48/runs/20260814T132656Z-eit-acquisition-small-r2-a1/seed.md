---
seed_id: eit-acquisition-seed-20260813t233941z
version: 1
status: frozen
scope: reusable
---

## Source basis

This seed uses only `external/sysml-v2-models/models/SE_Models/EIT_System_Use_Cases.sysml` from corpus commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, as assigned by `cps48/seeds/sources/eit-acquisition-v1.md`.

The source defines actors named `Doctor`, `EngineerTechnician`, `Patient`, and `EITSystem`; six named use cases; associations between selected actors and use cases; and an `EITSystemBoundary` that includes all six use cases. No other corpus example contributes evidence to this seed.

## Domain and purpose

The domain is EIT acquisition and imaging support around a patient wearing an electrode belt. The source vocabulary spans applying the belt, calibrating the system, starting monitoring, collecting impedance data, generating EIT images, and analyzing those images. This provides a domain envelope for choosing a system that supports some coherent part of that work.

The recognizable people in the external context are a Doctor, an EngineerTechnician, and a Patient. The source associates the Doctor with starting monitoring and analyzing EIT images, the EngineerTechnician with applying the electrode belt and calibrating the system, and the EITSystem actor with collecting impedance data and generating EIT images. The Patient is declared as an actor but has no use-case association.

## Available design vocabulary

All vocabulary below is optional design material, not a required interface, sequence, allocation, or success rule. A Designer may select only the terms appropriate to one chosen scope.

- Lifecycle vocabulary: electrode-belt application, system calibration, monitoring start, impedance-data collection, EIT-image generation, and EIT-image analysis.
- Capability vocabulary: apply an electrode belt, calibrate a system, start monitoring, collect impedance data, generate EIT images, and support analysis of EIT images.
- Observation vocabulary: monitoring activity, impedance data, EIT images, and the participation of the named actors. The source does not define representations, values, timestamps, quality measures, or validity indicators for these observations.
- Controlled-outcome vocabulary: belt applied, calibration performed, monitoring started, impedance data collected, EIT images generated, or image analysis performed. These are optional plain-language derivatives of the use-case names; the source supplies no completion, readiness, acceptance, or correctness semantics.

## Candidate system scopes

Each candidate is an independent single-system boundary, not a component that must be combined with the others:

- An electrode-belt preparation and calibration support system centered on the EngineerTechnician, with the Patient only as declared external context.
- A monitoring-start and impedance-acquisition system using the Doctor, monitoring, and impedance-data vocabulary.
- An impedance-to-EIT-image generation system centered on collection and image generation, while leaving human preparation and clinical review outside its boundary.
- An EIT image-analysis support system centered on making generated images available for Doctor analysis, without treating analysis as automated diagnosis.

The Designer may instead choose another coherent subset of the six source use cases, but must state its own system boundary and treatment of the source's `EITSystem` actor rather than assuming that the source already fixes those decisions.

## Source limitations and claim boundary

The source provides actor/use-case associations, not sequencing, interaction flow, data types, readiness or validity semantics, authorization policy, fault behavior, recovery behavior, or a finite abstraction. Association does not establish exclusive responsibility, invocation rights, ownership, or ordering.

There are two boundary ambiguities to preserve. `EITSystem` is declared as an actor while a separately declared `EITSystemBoundary` contains all six use cases, and the source does not explain whether those names denote the same system, an external system, or different viewpoints. The Patient is declared but never associated with a use case, so patient participation, sensing, consent, and control behavior are unspecified.

Any diagnosis, treatment, image-quality conclusion, patient-outcome claim, electrical-safety claim, medical-device efficacy claim, regulatory compliance claim, certification claim, or production-readiness claim is unsupported. Downstream Designers must introduce and label any assumptions needed for their selected scope; they must not attribute those assumptions to this source.
