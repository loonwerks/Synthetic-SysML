# Repository visualization guide

This directory is the review entry point for the 48 seed-derived synthetic benchmarks and their GPT-5.6 Terra High and Poolside Spec-Code-Proof (SCP) runs. The suite retains 49 figures: 16 about dataset construction/publication, 25 Terra exploratory figures, 3 Poolside campaign figures, and 5 paired Poolside–Terra cactus plots. Every reported statistic uses the same 48 systems.

The most important result is a separation between *candidate gate qualification* and *semantic recovery*. From small to hard, designed complexity rises sharply and Terra equivalence falls from 9/16 to 2/16, yet candidates clearing every SCP gate rise from 12/16 to 14/16. Gate qualification therefore shows that a downstream candidate is operationally well-formed and verifiable, not that it reconstructed the hidden formal ground truth.

Exact aggregate values are in [REPORT_STATS.md](REPORT_STATS.md). Paired cactus statistics are in [scp-comparison/STATS.md](scp-comparison/STATS.md).

## Scope, provenance, and interpretation rules

- The reporting corpus is exactly the 48 canonical CPS-48 instances: 8 source families × 3 designed tiers × 2 deliberately diverse replicates. Legacy exploratory systems are not part of the migrated corpus or any figure.
- The two replicates in each campaign cell are intentionally different subsystem selections, not repeated measurements of an identical model. Replicate plots measure diversity/stability across same-domain, same-tier alternatives.
- Dataset-generation fields come from the source paths recorded in [`datasets/README.md`](../datasets/README.md), their `metrics.json`, `agent-token-usage.json`, and the published `M-star.sysml`, `N.md`, and oracle.
- Terra fields come from [`experiments/scp-terra-high/summary/retry-ledger.json`](../experiments/scp-terra-high/summary/retry-ledger.json), per-candidate gate/result/verification/timing artifacts under `experiments/scp-terra-high/runs/`, and [token-usage-recovered.json](scp-terra-high/token-usage-recovered.json). Poolside fields come from its restored run/trajectory metadata and formal-comparison results under `experiments/poolside-synthetic/`.
- “Equivalent,” “candidate weaker,” and related labels are formal-ground-truth comparison verdicts. “Gate-qualified” means that the downstream candidate cleared every configured operational gate; it does not mean semantic equivalence.
- Comparative total tokens are provider-reported input plus output for both systems. Cached/cache-read input is a subset of input, and Terra reasoning output is a subset of output, so these subsets are not added again.
- Checker stage charts exclude the duplicative `backend-total` event; resident requests and retries are combined as proof requests. Gate-failure counts are nonexclusive.
- All relationships are descriptive for these 48 artifacts. Scatterplots and correlations do not establish causality or population-level statistical significance.

## Reproduction

From the repository root:

```bash
python3 plots/make_all_plots.py
```

The command regenerates the repository-local analysis table, the plotting-script outputs, and the aggregate statistics. NumPy and Matplotlib are the non-standard-library dependencies. The orchestrator creates and removes a temporary Matplotlib cache automatically.

The auditable joined table is [analysis-data.json](analysis-data.json); [build_analysis_data.py](build_analysis_data.py) documents every derived field. Presentation helpers live in [plot_style.py](plot_style.py). Category scripts are [dataset-generation/make_plots.py](dataset-generation/make_plots.py), [scp-terra-high/make_exploratory_plots.py](scp-terra-high/make_exploratory_plots.py), [poolside-synthetic/make_cactus_plots.py](poolside-synthetic/make_cactus_plots.py), [poolside-synthetic/make_outcome_overview.py](poolside-synthetic/make_outcome_overview.py), and [scp-comparison/make_cactus_plots.py](scp-comparison/make_cactus_plots.py).

## Dataset generation and publication

### Campaign design and complexity

| Plot | Research question and why it matters | What it shows and how to interpret it | Caveat |
|---|---|---|---|
| [Corpus design grid](dataset-generation/corpus-design-grid.png) | Did corpus construction actually cover each intended domain/tier/replicate cell? Balanced coverage is required before tier comparisons are credible. | Every one of the 24 domain × tier cells contains two distinct replicates. The reported corpus is exactly balanced. | Replicates are deliberately different systems, not repeated samples of one artifact. |
| [Complexity by tier](dataset-generation/complexity-by-tier.png) | Did “small/medium/hard” create measurable structural and behavioral separation? | All four declared measures—usages, interactions, contract cases, and scenarios—step upward strongly. Medians are 5/8/14 usages, 13/21/34.5 interactions, 12/20/29 cases, and 5/7.5/10 scenarios. | These measures were part of campaign design, so separation validates construction rather than independently discovering difficulty. |
| [Complexity correlations](dataset-generation/complexity-metric-correlations.png) | Are the four complexity measures capturing unrelated dimensions or one dominant tier signal? | Pairwise correlations are 0.95–0.97. The campaign makes them move together strongly, so models with more components also tend to have more interactions, cases, and scenarios. | High correlation is partly induced by the three designed tiers; it does not prove the concepts are semantically identical. |
| [Topology versus contract cases](dataset-generation/topology-vs-contract-cases.png) | Can architectural connectivity and behavioral case burden diverge within a tier? | Tier clusters are clear, but within-tier spread and outliers show that similar interaction counts need not imply identical case counts. Bubble size adds semantic-usage context. | The strong tier design dominates the global relationship. |
| [Formal clauses by domain and tier](dataset-generation/formal-clauses-by-domain-tier.png) | Does the same designed tier impose the same published contract burden in every domain? | No. Hard-tier means range substantially by family, and mining-cargo medium is especially clause-heavy. Tier and domain both matter to what the agent must reconstruct. | Each cell is the mean of only two intentionally diverse replicates. |
| [Replicate complexity diversity](dataset-generation/replicate-complexity-diversity.png) | How different are the two alternatives inside each balanced campaign cell? | Same-cell pairs often differ in usages/interactions and sometimes cases/scenarios; differences are generally smaller in hard-tier structural metrics but hard scenarios can still diverge. | A zero quantitative delta does not imply semantic sameness; the qualitative diversity audit found all 24 pairs substantively different. |

### Generation cost and workflow

| Plot | Research question and why it matters | What it shows and how to interpret it | Caveat |
|---|---|---|---|
| [Generation time by tier](dataset-generation/generation-time-by-tier.png) | Does designed difficulty increase end-to-end construction time? | Median time rises from 99 minutes (small) to about 160 minutes (medium/hard), but one medium outlier exceeds 1,000 minutes. The log scale keeps the typical runs visible. | Elapsed time includes harness gaps; timing is complete for all 48 reported instances. |
| [Generation time by role](dataset-generation/generation-time-by-role.png) | Which agent role consumes construction time? | Model generation/review is the largest median role for all tiers (31–51 minutes), with designer and visualization each material rather than negligible. | Stacked bars add medians computed independently, so their total is a typical decomposition, not a literal median end-to-end run. |
| [Generation tokens by tier](dataset-generation/generation-tokens-by-tier.png) | How does context cost scale with designed difficulty? | Median accepted-run usage rises from 24.9M to 31.2M to 39.7M tokens. Dispersion and a medium outlier show tier is not the only cost driver. | Provider totals count cached input in input; they are workload counters, not billing estimates. |
| [Generation tokens by role](dataset-generation/generation-tokens-by-role.png) | Which stages dominate context consumption? | Model and visualization roles dominate median tokens; designer cost also rises with tier. Visualization/review is a first-class construction cost. | The arithmetic stack combines independently computed role medians. |
| [Generation cache utilization](dataset-generation/generation-cache-utilization.png) | Are very large context totals mostly fresh input or reused context? | Roughly 94–97% of generation input is cached, with larger runs generally still highly cached. High totals reflect repeated large-context stages. | Cache share says nothing about semantic reuse quality or monetary price. |
| [Repeated-stage burden](dataset-generation/generation-repeat-stage-burden.png) | How often did accepted artifacts require repeated agent stages? | Only 2–3 runs per tier had no repeated stage; medium runs show the largest 6+ repeat bucket. Acceptance commonly followed iteration rather than a single straight pass. | A repeated stage can reflect repair, review, or visualization iteration; it is not automatically a model failure. |
| [Generation cost relationships](dataset-generation/generation-cost-relationships.png) | Are final clause count and total tokens enough to explain construction cost? | More clauses loosely associate with more tokens, while elapsed time has substantial spread at similar token totals. Artifact size, agent iteration, and harness behavior all contribute. | The extreme timing outlier influences the time relationship; no causal model is fitted. |

### Publication boundary—the actual benchmark seen by SCP

| Plot | Research question and why it matters | What it shows and how to interpret it | Caveat |
|---|---|---|---|
| [Synthetic model statistics](dataset-generation/published-benchmark-size.png) | How do architectural topology, SNL specification length, and executable contract volume vary with designed difficulty? | The three panels report M* ports plus connections, words in the SNL specification, and actual GUMBO `guarantee` declarations in the oracle. All are structural quantities rather than source-line proxies and expose distinct dimensions of system size. | Ports plus connections measure interface/wiring footprint, not behavioral subtlety. A GUMBO contract is counted once per `guarantee` declaration, including guarantees nested inside compute cases. |
| [Publication transformation](dataset-generation/publication-transformation.png) | Does publishing more formal behavior mean both more erased oracle code and more natural-language explanation? | Clause count tracks oracle lines removed from M* fairly closely, while N word count is noisier. Publication systematically removes behavior and re-expresses it, but prose expansion varies. | Erased lines are a textual delta; formatting and multiline clauses affect it. |
| [Published requirement composition](dataset-generation/published-requirement-composition.png) | Are harder prompts merely longer context, or do they contain more behavioral obligations? | Context statements grow modestly, while formal clauses drive most of the increase; functions and state declarations add smaller specialized burdens. | Bars stack per-tier means of heterogeneous item types to show composition, not semantic weights. |

## SCP Terra High experiments

### Overall outcomes and reliability

| Plot | Research question and why it matters | What it shows and how to interpret it | Caveat |
|---|---|---|---|
| [Outcome overview](scp-terra-high/outcome-overview.png) | How do formal verdicts differ by downstream candidate gate status? | Of 48 Terra candidates, 38 clear all gates: 11 equivalent, 21 weaker, 3 incomparable, 2 inconclusive, and 1 invalid input. The 10 that do not clear all gates contain 5 equivalent, 4 weaker, and 1 incomparable candidate. | Gate status describes the generated candidate artifact—not experiment execution, benchmark validity, or evaluator health. Every candidate was formally compared. |
| [Gate status versus equivalence](scp-terra-high/acceptance-vs-equivalence.png) | How exactly do operational qualification and semantic recovery intersect? | Twenty-one weaker candidates clear all gates versus 11 equivalent candidates; 5 equivalent candidates do not clear every gate. Operational verifiability and semantic agreement overlap imperfectly. | One invalid-input candidate clears the operational gates because comparison-input validity is a separate concern. |
| [Verdict by designed tier](scp-terra-high/verdict-by-designed-tier.png) | Does formal reconstruction degrade with designed difficulty? | Equivalent counts fall 9 → 5 → 2, while weaker counts rise 5 → 7 → 12. This is the clearest tier-sensitive SCP result. | Tier co-varies with all four complexity measures, so the plot cannot identify which feature causes the shift. |
| [Gate qualification by designed tier](scp-terra-high/acceptance-by-designed-tier.png) | Do harder instances produce fewer candidates that clear every SCP gate? | No: qualified counts are 12/16, 12/16, and 14/16. Hard models are less often equivalent but not less often operationally qualified. | With 16 instances per tier, small count differences should not be treated as precise population rates. |
| [Domain/tier/replicate outcome map](scp-terra-high/domain-tier-replicate-outcomes.png) | Where are verdicts and accept failures concentrated across the balanced design? | Small cells contain most equivalence; hard cells are dominated by weaker verdicts. Same-cell replicates often disagree, and white × marks show accept failures are scattered rather than confined to one verdict. | Colors are categorical; there is no ordinal distance between verdict colors. |
| [Replicate outcome stability](scp-terra-high/replicate-outcome-stability.png) | How stable is formal outcome across diverse alternatives in the same domain/tier cell? | Thirteen of 24 pairs lie on the equivalent/equivalent or weaker/weaker diagonal; all five “other” replicate-1 outcomes pair with a weaker replicate 2. System selection within a tier materially affects the result. | Replicates are deliberately diverse, so disagreement is not stochastic instability of identical inputs. |
| [Controller timeout outcomes](scp-terra-high/controller-timeout-outcomes.png) | Does the one-hour controller kill eliminate useful outputs? | The 11 timeout runs still yield 5 equivalent, 3 weaker, 2 incomparable, and 1 inconclusive verdict. A timeout marks controller completion state, not absence of a checkable candidate. | Token counters for killed turns are last persisted totals and may omit a final unpersisted interval. |
| [Accept-gate failure profile](scp-terra-high/accept-gate-failure-profile.png) | Which operational gate is the bottleneck? | Typecheck has 0 failures, codegen 1, and both component/integration Logika appear in all 10 failed acceptance records. Proof gates, not parsing, dominate rejection. | Counts are nonexclusive; component and integration failures often occur in the same run. |

### SCP resource behavior

| Plot | Research question and why it matters | What it shows and how to interpret it | Caveat |
|---|---|---|---|
| [Elapsed time by tier](scp-terra-high/elapsed-time-by-tier.png) | Does designed tier predict runtime? | Medium has the highest median (50.7 min); hard falls to 40.5 min and small is 41.1 min. Tier does not monotonically determine runtime. | The 60-minute controller cutoff censors the upper tail. |
| [Elapsed time by verdict](scp-terra-high/elapsed-time-by-verdict.png) | Do formal outcomes separate by runtime? | Medians overlap: equivalent 42.7, weaker 44.8, incomparable 50.8, and inconclusive 45.8 minutes. Runtime alone does not classify semantic outcome. | Small incomparable/inconclusive groups make their boxes unstable. |
| [Total tokens by tier](scp-terra-high/total-tokens-by-tier.png) | Does designed tier predict Terra token demand? | Median input-plus-output usage is 7.8M small, 10.0M medium, and 7.3M hard. Token demand is not monotonic in designed complexity. | Provider counters measure processed volume, not price or independent semantic work. |
| [Total tokens by verdict](scp-terra-high/total-tokens-by-verdict.png) | Does consuming more context improve formal outcome? | Equivalent and weaker distributions overlap; medians are 10.7M equivalent, 7.3M weaker, and 10.0M incomparable. More tokens do not guarantee equivalence. | Group size differs sharply, especially for invalid/inconclusive outcomes. |
| [Tokens versus elapsed time](scp-terra-high/tokens-vs-elapsed-time.png) | Are tokens a reliable proxy for wall-clock demand? | The relationship is positive but broad; at the 60-minute cutoff token totals range widely. Time and token budgets expose different bottlenecks. | Edge styling encodes candidate gate status; verdict color remains the primary category. |
| [Token composition by verdict](scp-terra-high/token-composition-by-verdict.png) | Which token channels dominate telemetry by outcome? | Input and cached input dominate every median stack; output and reasoning are visually small. | The composition panel deliberately displays overlapping provider channels; its stacks are not the non-overlapping comparative total. |
| [Cache and reasoning relationships](scp-terra-high/cache-and-reasoning-relationships.png) | Is cache share stable, and does reasoning output scale with output? | Cache share rises predictably with input volume and mostly lies around 95–99%; reasoning output grows with output but varies substantially at a given output count. | Provider semantics define reasoning as a subset of output. |
| [Highest-resource runs](scp-terra-high/highest-resource-runs.png) | Which individual instances dominate tails that averages can hide? | The vehicle-mode medium instance dominates Terra input-plus-output usage (~37.6M), while many different verdicts hit 60 minutes. Token and time outlier lists are not the same. | Labels are shortened for readability; exact identifiers remain in `analysis-data.json`. |

### Reconstruction size and benchmark predictors

| Plot | Research question and why it matters | What it shows and how to interpret it | Caveat |
|---|---|---|---|
| [Candidate edit size by verdict](scp-terra-high/candidate-edit-size-by-verdict.png) | Does adding more code/contract text produce a better match? | Equivalent candidates tend to add hundreds of nonblank lines; many weaker candidates have near-zero net additions, though there are large weaker outliers. Edit magnitude is informative but insufficient. | Net line delta does not measure semantic change and can hide replacement or refactoring. |
| [Generation complexity versus SCP outcome](scp-terra-high/generation-complexity-vs-scp-outcome.png) | Which declared complexity measures distinguish equivalent from weaker runs? | Weaker instances are higher on all four measures than equivalent instances, consistent with the tier verdict shift. “Other” usually lies between or overlaps. | The measures are highly correlated, so separate panels are not independent evidence. |
| [Benchmark size versus SCP resources](scp-terra-high/benchmark-size-vs-scp-resources.png) | Does the number of published formal clauses explain reconstruction cost? | Clause count has weak/non-monotonic relationships with both runtime and tokens; similarly sized specifications can have very different costs. | Clause count ignores expression complexity, architecture, and agent trajectory. |
| [Generation cost versus SCP cost](scp-terra-high/generation-cost-vs-scp-cost.png) | Are expensive-to-create benchmarks also expensive to reconstruct? | Neither generation tokens nor generation time cleanly predicts SCP cost. Construction workflow cost and reconstruction difficulty are distinct. | The time panel uses a log x-axis because one generation run is an extreme outlier. |

### Equivalence-checker and proof behavior

| Plot | Research question and why it matters | What it shows and how to interpret it | Caveat |
|---|---|---|---|
| [Compared units by verdict](scp-terra-high/compared-units-by-verdict.png) | Do non-equivalent results involve broader contract comparison? | Equivalent median is 10 units versus 18.5 weaker and 16 for incomparable/inconclusive. Broader systems expose more opportunities for mismatch. | Unit count depends on model decomposition and checker inventory rules. |
| [Proof count by verdict](scp-terra-high/proof-count-by-verdict.png) | How many obligations does the checker generate for each result? | Equivalent median is 53 proofs, weaker 92.5, incomparable 140. Non-equivalent/broader comparisons generally produce more proof work. | The invalid-input run creates no proofs and is shown as zero. |
| [Proof count versus verifier time](scp-terra-high/proof-count-vs-verifier-time.png) | Is checker cost determined simply by obligation count? | Cost generally rises with count, but runs with similar counts span large time ranges; individual hard obligations and retries matter. | Verifier-reported seconds are summed and may reflect parallelism differently from wall time. |
| [Proof outcome composition](scp-terra-high/proof-outcome-composition.png) | What mixtures of VERIFIED/REJECTED/SAT/timeout outcomes underlie each verdict? | Equivalent proofs are ~90% verified; weaker/incomparable have larger rejected and SAT shares. Verdicts emerge from a profile, not one binary proof. | Shares aggregate all proofs, so runs with more obligations contribute more weight. |
| [Checker stage cost by verdict](scp-terra-high/checker-stage-cost-by-verdict.png) | Where does checker time accumulate? | Proof requests/retries dominate. Inconclusive median cost is especially high; inventory/model/export overheads are small relative to proof work. | Bars stack per-stage medians; `backend-total` is excluded to prevent double counting. |

## Poolside synthetic campaign

| Plot | What it shows |
|---|---|
| [Wall-clock success cactus](poolside-synthetic/cactus-wallclock.svg) | Cumulative campaign successes at the two- and three-hour cutoffs by active wall-clock time. |
| [Output-token success cactus](poolside-synthetic/cactus-output-tokens.svg) | The same cumulative successes by Poolside output-token usage. |
| [Outcome overview](poolside-synthetic/outcome-overview.svg) | Formal-ground-truth verdict composition split by whether the Poolside candidate cleared all gates. |

## Poolside–Terra cactus comparison

Each cactus asks: “At this resource budget, how many downstream candidates have reached this milestone?” Color encodes gate-qualified total/equivalent/weaker/incomparable; solid lines are Terra and dashed lines are Poolside. There are no point markers, and straight interpolation connects observed order statistics. The dotted reference is the full campaign, N=48.

The verdict curves are restricted to gate-qualified candidates. Terra has 38 qualified candidates—11 equivalent, 21 weaker, 3 incomparable, 2 inconclusive, and 1 invalid input. Poolside has 11—2 equivalent, 5 weaker, 0 incomparable, and 4 inconclusive. Unresolved candidates remain in each gray total but are omitted from the three resolved-verdict curves.

| Plot | Why this budget matters | Interpretation and caveat |
|---|---|---|
| [Elapsed time](scp-comparison/cactus-elapsed-time.svg) | Compares time-to-qualified/semantic yield under the systems' actual configured budgets. | Terra reaches 38 qualified candidates by its 60-minute cutoff; Poolside reaches 11 by 180 minutes. Vertical labels expose the unequal cutoffs. Poolside upper-bound timing records are plotted conservatively at their upper bounds. |
| [Input tokens](scp-comparison/cactus-input-tokens.svg) | Compares gross context processed before each milestone. | Terra accrues qualified and resolved outcomes faster over most of the shared range. The exact shared cutoff is 37,537,467 input tokens. Provider tokenization and orchestration differ. |
| [Cached/cache-read input tokens](scp-comparison/cactus-cached-input-tokens.svg) | Compares reusable-context volume exposed by both providers. | Terra cached input and Poolside cache-read input are treated as corresponding telemetry; the shared cutoff is 37,033,216. Cache semantics may not be perfectly identical across providers. |
| [Output tokens](scp-comparison/cactus-output-tokens.svg) | Compares generated-token demand, where the systems differ most visibly in scale. | Poolside's qualified tail reaches 251,844 output tokens versus Terra's 39,877. Poolside has no separate reasoning-output counter. |
| [Comparable total tokens](scp-comparison/cactus-total-tokens.svg) | Provides one non-overlapping provider-total comparison. | Total is input plus output for both systems; cached and reasoning subsets are not added again. The shared cutoff is 37,566,841. |

### Presentation language for candidate gate status

Before presenting the outcome overview, establish that every one of the 48 downstream autoformalization attempts was evaluated. The two independent axes are (1) whether the generated candidate clears typecheck, code generation, component Logika, and integration Logika, and (2) its semantic relation to formal ground truth. The figure partitions candidate artifacts, not experiment health or evaluator success.

Recommended spoken transition: “All 48 autoformalization attempts were evaluated. This split does not represent experiment success or failure; it partitions the generated candidate models by whether they cleared all executable SCP gates. Within each partition, we then show the candidate's semantic relation to formal ground truth.”

Use “gate-qualified candidate,” “candidate cleared all gates,” and “candidate did not clear all gates.” Avoid “experiment failed,” “failed run,” “our failure,” and unqualified “success/failure.”

## Visual quality audit

All 49 final figures were rendered at readable resolution. The changed outcome, publication-size, and paired cactus figures were visually inspected individually; the cactus audit corrected zero-count labeling, legend placement, endpoint visibility, common-axis cutoffs, and configured-timeout annotations.
