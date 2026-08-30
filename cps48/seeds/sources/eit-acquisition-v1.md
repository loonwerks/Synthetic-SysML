# EIT acquisition source brief

Generate one minimal, complexity-neutral reusable seed from pinned corpus
commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, using only
`models/SE_Models/EIT_System_Use_Cases.sysml`.

Preserve the Doctor, EngineerTechnician, Patient, and EITSystem actors and the
electrode-belt application, monitoring, calibration, impedance-data collection,
EIT-image generation, and image-analysis use-case vocabulary. Offer alternative
coherent single-system scopes without selecting one.

Record that the source provides actor/use-case associations but no sequencing,
data types, readiness or validity semantics, authorization policy, fault model,
or recovery behavior. Those decisions and any finite abstraction belong to the
downstream Designer. Exclude diagnosis, treatment, image quality, patient
outcomes, electrical safety, and medical-device efficacy or compliance claims.
