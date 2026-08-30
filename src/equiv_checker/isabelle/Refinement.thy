theory Refinement
  imports Main
begin

section \<open>Assume/guarantee contracts over input/output behaviors\<close>

text \<open>
  This theory gives a deliberately small semantic core for the contracts used by
  the equivalence checker.  It does not model scheduling, interference, or AADL
  execution.  A contract describes one observation of a component: an input
  value and a possible output value.

  The type variables are intentionally abstract.  A generated theory may use a
  record containing all input ports for @{typ 'i}, and another record containing
  all output ports for @{typ 'o}.
\<close>

type_synonym 'i Assume = "'i \<Rightarrow> bool"

type_synonym ('i, 'o) Guarantee = "'i \<Rightarrow> 'o \<Rightarrow> bool"

type_synonym ('i, 'o) Contract = "'i Assume \<times> ('i, 'o) Guarantee"

text \<open>
  An implementation is represented extensionally by the input/output behaviors
  it may exhibit.  This relation accommodates deterministic and nondeterministic
  implementations.  Totality is not built into this type: whether a promised
  output exists is captured separately by a realizability predicate below.
\<close>

type_synonym ('i, 'o) Implementation =
  "'i \<Rightarrow> 'o \<Rightarrow> bool"


subsection \<open>Selectors and satisfaction\<close>

definition assumption_of :: "('i, 'o) Contract \<Rightarrow> 'i Assume" where
  "assumption_of C = fst C"

definition guarantee_of ::
  "('i, 'o) Contract \<Rightarrow> ('i, 'o) Guarantee" where
  "guarantee_of C = snd C"

lemma assumption_of_pair [simp]:
  "assumption_of (A, G) = A"
  by (simp add: assumption_of_def)

lemma guarantee_of_pair [simp]:
  "guarantee_of (A, G) = G"
  by (simp add: guarantee_of_def)

text \<open>
  A concrete behavior satisfies a contract when the guarantee holds whenever
  the assumption holds.  If the environment violates the assumption, the
  contract deliberately imposes no constraint on the output.
\<close>

definition satisfies :: "'i \<Rightarrow> 'o \<Rightarrow> ('i, 'o) Contract \<Rightarrow> bool"
  where "satisfies input output C = ((assumption_of C) input \<longrightarrow> (guarantee_of C) input output)"

text \<open>
  An implementation satisfies a contract if every behavior it can produce
  satisfies the contract.  This is the usual demonic reading of
  nondeterminism: all possible implementation outputs must be permitted.
\<close>

definition implements :: "('i, 'o) Implementation \<Rightarrow> ('i, 'o) Contract \<Rightarrow> bool" where
  "implements M C = (\<forall>input output. M input output \<longrightarrow> satisfies input output C)"



subsection \<open>ISOLETTE Manage Alarm example\<close>

text \<open>
  We use an actual GUMBO compute case rather than an invented controller.
  The source is
  \<^verbatim>\<open>external/inspecta-scp/scp_demo_artifacts/isolette_io/Monitor.sysml\<close>:

    \<^item> lines 336--353 declare the @{text Manage_Alarm_i} thread and its ports;
    \<^item> lines 355--357 declare its GUMBO block and state variable;
    \<^item> lines 157--160 give the interface-level alarm-range assumptions; and
    \<^item> lines 365--369 contain the case @{text REQ_MA_2} itself.

  The English requirement at lines 365--366 says that, in NORMAL mode, a
  temperature outside the alarm interval causes the alarm control to be On.
  Its GUMBO assumption is at lines 366--368 and its guarantee is at line 369.

  The concrete SysML fields have been projected to precisely the values read or
  written by this case.  Temperatures are represented by mathematical integers
  here.  The source uses @{text "Base_Types::Integer_32"}; this example performs
  only comparisons, so signed overflow does not arise.  A production AIR
  translation must nevertheless give the source integer type its exact
  semantics.
\<close>

datatype Monitor_Mode =
    Init_Monitor_Mode
  | Normal_Monitor_Mode
  | Failed_Monitor_Mode

datatype On_Off = Onn | Off

record Manage_Alarm_Input =
  ma_monitor_mode :: Monitor_Mode
  ma_current_temp :: int
  ma_lower_alarm_temp :: int
  ma_upper_alarm_temp :: int

record Manage_Alarm_Output =
  ma_alarm_control :: On_Off

text \<open>
  The following predicate is the conjunction of the three compute-level
  constraints used as the environmental context for @{text REQ_MA_2}:

    \<^item> @{text Figure_A_7}, lines 448--451;
    \<^item> @{text Table_A_12_LowerAlarmTemp}, lines 453--456; and
    \<^item> @{text Table_A_12_UpperAlarmTemp}, lines 458--461.

  The numeric bounds come from the same repository-relative source, lines
  157--160.  We guard each interface constraint by NORMAL mode so that this
  reusable context is active precisely when the case assumption applies.
\<close>

definition req_ma_compute_context :: "Manage_Alarm_Input \<Rightarrow> bool" where
  "req_ma_compute_context input \<longleftrightarrow>
     (ma_monitor_mode input = Normal_Monitor_Mode \<longrightarrow>
        ma_lower_alarm_temp input \<le> ma_upper_alarm_temp input) \<and>
     (ma_monitor_mode input = Normal_Monitor_Mode \<longrightarrow>
        96 \<le> ma_lower_alarm_temp input \<and> ma_lower_alarm_temp input \<le> 101) \<and>
     (ma_monitor_mode input = Normal_Monitor_Mode \<longrightarrow>
        97 \<le> ma_upper_alarm_temp input \<and> ma_upper_alarm_temp input \<le> 102)"

text \<open>
  This is the local case assumption from @{text Monitor.sysml}, lines 366--368.
\<close>

definition req_ma_2_case_assumption :: "Manage_Alarm_Input \<Rightarrow> bool" where
  "req_ma_2_case_assumption input \<longleftrightarrow>
     ma_monitor_mode input = Normal_Monitor_Mode \<and>
       (ma_current_temp input < ma_lower_alarm_temp input \<or>
        ma_current_temp input > ma_upper_alarm_temp input)"

text \<open>
  The assumption of the effective case contract contains both the enclosing
  compute context and the local case guard.  Keeping these predicates separate
  preserves source attribution while their conjunction states the actual
  condition under which this case's promise is required.
\<close>

definition req_ma_2_assumption :: "Manage_Alarm_Input Assume" where
  "req_ma_2_assumption input \<longleftrightarrow>
     req_ma_compute_context input \<and> req_ma_2_case_assumption input"

text \<open>
  This is the guarantee at @{text Monitor.sysml}, line 369.
\<close>

definition req_ma_2_guarantee ::
  "(Manage_Alarm_Input, Manage_Alarm_Output) Guarantee" where
  "req_ma_2_guarantee input output \<longleftrightarrow>
     ma_alarm_control output = Onn"

definition req_ma_2_contract ::
  "(Manage_Alarm_Input, Manage_Alarm_Output) Contract" where
  "req_ma_2_contract = (req_ma_2_assumption, req_ma_2_guarantee)"

text \<open>
  Once the NORMAL-mode case guard is known, the effective assumption exposes
  the interval facts inherited from the compute context.  This lemma is also a
  check that the transcription above has not dropped those enclosing clauses.
\<close>

lemma req_ma_2_assumption_expanded:
  "req_ma_2_assumption input \<longleftrightarrow>
     ma_monitor_mode input = Normal_Monitor_Mode \<and>
     96 \<le> ma_lower_alarm_temp input \<and>
     ma_lower_alarm_temp input \<le> 101 \<and>
     97 \<le> ma_upper_alarm_temp input \<and>
     ma_upper_alarm_temp input \<le> 102 \<and>
     ma_lower_alarm_temp input \<le> ma_upper_alarm_temp input \<and>
       (ma_current_temp input < ma_lower_alarm_temp input \<or>
        ma_current_temp input > ma_upper_alarm_temp input)"
  by (auto simp: req_ma_2_assumption_def req_ma_compute_context_def
                 req_ma_2_case_assumption_def)

lemma req_ma_2_on_output_satisfies:
  "satisfies input
     \<lparr>ma_alarm_control = Onn\<rparr>
     req_ma_2_contract"
  by (simp add: req_ma_2_contract_def req_ma_2_guarantee_def satisfies_def)

text \<open>
  Conversely, if the effective assumption is false, the case imposes no output
  constraint at all.  This is the concrete ISOLETTE instance of the ``don't
  care outside A'' behavior that saturation makes explicit as @{text "\<not>A \<or> G"}.
\<close>

lemma req_ma_2_unconstrained_outside_assumption:
  assumes "\<not> req_ma_2_assumption input"
  shows "satisfies input output req_ma_2_contract"
  using assms
  by (simp add: req_ma_2_contract_def satisfies_def)



subsection \<open>Saturation\<close>

text \<open>
  A guarantee is saturated by explicitly admitting every behavior outside the
  assumption.  Thus @{text "saturated_guarantee C input output"} is exactly the
  set-of-behaviors interpretation of the implication
  @{term "assumption_of C input \<longrightarrow> guarantee_of C input output"}.

  Saturation gives each contract its conventional behavioral form
  @{text "\<not>A \<union> G"}.  It is important for refinement: raw guarantees may differ
  outside their assumptions even though those differences are semantically
  irrelevant.
\<close>

definition saturated_guarantee ::
  "('i, 'o) Contract \<Rightarrow> ('i, 'o) Guarantee" where
  "saturated_guarantee C input output \<longleftrightarrow>
     (\<not> assumption_of C input \<or> guarantee_of C input output)"

definition saturate ::
  "('i, 'o) Contract \<Rightarrow> ('i, 'o) Contract" where
  "saturate C = (assumption_of C, saturated_guarantee C)"

text \<open>
  For the ISOLETTE case, saturation says precisely this: either the effective
  @{text REQ_MA_2} trigger does not hold, or the alarm command is On.  It changes
  no obligation on inputs for which the case applies; it only makes the behavior
  outside that case explicit.
\<close>

lemma req_ma_2_saturated_guarantee:
  "saturated_guarantee req_ma_2_contract input output \<longleftrightarrow>
     (\<not> req_ma_2_assumption input \<or>
      ma_alarm_control output = Onn)"
  by (simp add: saturated_guarantee_def req_ma_2_contract_def
                req_ma_2_guarantee_def)

lemma req_ma_2_saturated_inside_assumption:
  assumes "req_ma_2_assumption input"
  shows "saturated_guarantee req_ma_2_contract input output \<longleftrightarrow>
         ma_alarm_control output = Onn"
  using assms by (simp add: req_ma_2_saturated_guarantee)

lemma req_ma_2_saturated_outside_assumption:
  assumes "\<not> req_ma_2_assumption input"
  shows "saturated_guarantee req_ma_2_contract input output"
  using assms by (simp add: req_ma_2_saturated_guarantee)

lemma satisfies_iff_saturated_guarantee:
  "satisfies input output C \<longleftrightarrow>
     saturated_guarantee C input output"
  unfolding satisfies_def saturated_guarantee_def by argo

lemma saturate_idempotent [simp]:
  "saturate (saturate C) = saturate C"
  by (cases C)
     (auto simp: saturate_def saturated_guarantee_def
                 assumption_of_def guarantee_of_def fun_eq_iff)

lemma implements_saturate [simp]:
  "implements M (saturate C) \<longleftrightarrow> implements M C"
  unfolding implements_def satisfies_def saturate_def saturated_guarantee_def by auto


subsection \<open>Contract refinement\<close>

text \<open>
  @{text "refines C D"} reads ``C refines D''.  In the checker, C is the
  candidate and D is the oracle.

  The definition has the standard contract-algebra direction:

    \<^item> every environment admitted by D is also admitted by C; and
    \<^item> every saturated behavior permitted by C is permitted by D.

  Hence a refinement accepts at least the original environments while allowing
  no additional implementation behavior.  The second condition compares
  saturated rather than raw guarantees so that behavior outside an assumption
  remains irrelevant.
\<close>

definition refines ::
  "('i, 'o) Contract \<Rightarrow> ('i, 'o) Contract \<Rightarrow> bool" where
  "refines C D \<longleftrightarrow>
     (\<forall>input. assumption_of D input \<longrightarrow> assumption_of C input) \<and>
     (\<forall>input output. saturated_guarantee C input output \<longrightarrow>
                     saturated_guarantee D input output)"

text \<open>
  These are the two verification conditions used by the current oracle
  methodology.  They are stated separately so generated theories can expose
  exactly the proof obligations reported by the checker.
\<close>

definition refinement_vcs ::
  "('i, 'o) Contract \<Rightarrow> ('i, 'o) Contract \<Rightarrow> bool" where
  "refinement_vcs C D \<longleftrightarrow>
     (\<forall>input. assumption_of D input \<longrightarrow> assumption_of C input) \<and>
     (\<forall>input output. (assumption_of D input \<and> guarantee_of C input output) \<longrightarrow>
                      guarantee_of D input output)"

text \<open>
  This is the central correspondence theorem.  It shows that the two concrete
  checker obligations are neither an approximation nor an independent
  definition: together they are equivalent to standard refinement by inclusion
  of saturated contract behaviors.
\<close>

theorem refines_iff_refinement_vcs:
  "refines C D \<longleftrightarrow> refinement_vcs C D"
  unfolding refines_def refinement_vcs_def saturated_guarantee_def
  by blast

lemma refinesI:
  assumes assumption:
    "\<And>input. assumption_of D input \<Longrightarrow> assumption_of C input"
  assumes guarantee:
    "\<And>input output.
       assumption_of D input \<Longrightarrow>
       guarantee_of C input output \<Longrightarrow>
       guarantee_of D input output"
  shows "refines C D"
  using assms
  by (simp add: refines_iff_refinement_vcs refinement_vcs_def)

lemma refines_assumptionD:
  assumes "refines C D"
      and "assumption_of D input"
  shows "assumption_of C input"
  using assms
  by (auto simp: refines_iff_refinement_vcs refinement_vcs_def)

lemma refines_guaranteeD:
  assumes "refines C D"
      and "assumption_of D input"
      and "guarantee_of C input output"
  shows "guarantee_of D input output"
  using assms
  by (auto simp: refines_iff_refinement_vcs refinement_vcs_def)

(*lemma refinesE:
  assumes "refines C D"
  obtains
    assumption:
      "\<And>input. assumption_of D input \<Longrightarrow> assumption_of C input"
    and guarantee:
      "\<And>input output.
         assumption_of D input \<Longrightarrow>
         guarantee_of C input output \<Longrightarrow>
         guarantee_of D input output"
  using assms
  by (auto simp: refines_iff_refinement_vcs refinement_vcs_def)*)

lemma refines_refl [simp]:
  "refines C C"
  by (simp add: refines_def)

lemma refines_trans:
  assumes "refines C D"
      and "refines D E"
  shows "refines C E"
  using assms
  unfolding refines_iff_refinement_vcs refinement_vcs_def
  by blast

text \<open>
  Refinement has its intended substitutability meaning: any implementation of
  the stronger candidate contract C is also an implementation of the oracle
  contract D.  Notice that the proof needs both refinement obligations.  D's
  assumption first establishes C's assumption, after which C's guarantee can be
  strengthened to D's guarantee.
\<close>

theorem refines_preserves_implementations:
  assumes "refines C D"
      and "implements M C"
  shows "implements M D"
  using assms
  unfolding implements_def satisfies_def
  by (auto simp: refines_iff_refinement_vcs refinement_vcs_def)


subsection \<open>Contract equivalence\<close>

text \<open>
  Two contracts are equivalent when each refines the other.  This retains both
  sides of contract semantics: they admit the same environments and impose the
  same saturated behavioral constraint.  Equality of raw guarantees is neither
  required nor desirable outside the common assumption.
\<close>

definition contract_equiv ::
  "('i, 'o) Contract \<Rightarrow> ('i, 'o) Contract \<Rightarrow> bool" where
  "contract_equiv C D \<longleftrightarrow> refines C D \<and> refines D C"

lemma contract_equivI:
  assumes "refines C D" and "refines D C"
  shows "contract_equiv C D"
  using assms by (simp add: contract_equiv_def)

lemma contract_equivD1:
  "contract_equiv C D \<Longrightarrow> refines C D"
  by (simp add: contract_equiv_def)

lemma contract_equivD2:
  "contract_equiv C D \<Longrightarrow> refines D C"
  by (simp add: contract_equiv_def)

lemma contract_equiv_refl [simp]:
  "contract_equiv C C"
  by (simp add: contract_equiv_def)

lemma contract_equiv_sym:
  "contract_equiv C D \<Longrightarrow> contract_equiv D C"
  by (simp add: contract_equiv_def conj_commute)

lemma contract_equiv_trans:
  assumes "contract_equiv C D"
      and "contract_equiv D E"
  shows "contract_equiv C E"
  using assms refines_trans
  using contract_equiv_def by blast
  

lemma contract_equiv_iff:
  "contract_equiv C D \<longleftrightarrow>
     (\<forall>input. assumption_of C input \<longleftrightarrow> assumption_of D input) \<and>
     (\<forall>input output.
        saturated_guarantee C input output \<longleftrightarrow>
        saturated_guarantee D input output)"
  unfolding contract_equiv_def refines_def
  by blast


section \<open>Health and realizability\<close>

text \<open>
  Health is deliberately not part of refinement.  Refinement compares the
  meaning of two contracts; health rejects specifications that are unusable even
  when their refinement relation is mathematically well-defined.

  The first check rules out a vacuous contract whose assumption admits no input.
  The second is pointwise realizability: every admitted input has at least one
  permitted output.  Pointwise realizability is stronger and more useful than
  merely requiring one input/output witness.
\<close>

definition assumption_satisfiable :: "('i, 'o) Contract \<Rightarrow> bool" where
  "assumption_satisfiable C \<longleftrightarrow>
     (\<exists>input. assumption_of C input)"

definition realizable :: "('i, 'o) Contract \<Rightarrow> bool" where
  "realizable C \<longleftrightarrow>
     (\<forall>input. assumption_of C input \<longrightarrow>
        (\<exists>output. guarantee_of C input output))"

definition healthy :: "('i, 'o) Contract \<Rightarrow> bool" where
  "healthy C \<longleftrightarrow> assumption_satisfiable C \<and> realizable C"

lemma healthy_assumption_satisfiableD:
  "healthy C \<Longrightarrow> assumption_satisfiable C"
  by (simp add: healthy_def)

lemma healthy_realizableD:
  "healthy C \<Longrightarrow> realizable C"
  by (simp add: healthy_def)

lemma assumption_satisfiable_saturate [simp]:
  "assumption_satisfiable (saturate C) \<longleftrightarrow>
     assumption_satisfiable C"
  by (simp add: assumption_satisfiable_def saturate_def)

lemma realizable_saturate [simp]:
  "realizable (saturate C) \<longleftrightarrow> realizable C"
  by (auto simp: realizable_def saturate_def saturated_guarantee_def)

lemma healthy_saturate [simp]:
  "healthy (saturate C) \<longleftrightarrow> healthy C"
  by (simp add: healthy_def)

text \<open>
  @{text "input_enabled M C"} says that implementation M actually offers an
  output for every input admitted by C.  It is separate from @{const implements}
  because a pure safety relation does not itself express progress or totality.
\<close>

definition input_enabled ::
  "('i, 'o) Implementation \<Rightarrow> ('i, 'o) Contract \<Rightarrow> bool" where
  "input_enabled M C \<longleftrightarrow>
     (\<forall>input. assumption_of C input \<longrightarrow>
        (\<exists>output. M input output))"

text \<open>
  The pointwise definition of realizability has an operational witness: a
  contract is realizable exactly when some input-enabled implementation
  satisfies it.  In the forward direction, the guarantee relation itself is
  such an implementation.
\<close>

theorem realizable_iff_input_enabled_implementation:
  "realizable C \<longleftrightarrow>
     (\<exists>M. implements M C \<and> input_enabled M C)"
proof
  assume "realizable C"
  then show "\<exists>M. implements M C \<and> input_enabled M C"
    by (rule_tac x="guarantee_of C" in exI)
       (auto simp: implements_def satisfies_def input_enabled_def realizable_def)
next
  assume "\<exists>M. implements M C \<and> input_enabled M C"
  then show "realizable C"
    by (metis implements_def input_enabled_def realizable_def satisfies_def)
qed


end
