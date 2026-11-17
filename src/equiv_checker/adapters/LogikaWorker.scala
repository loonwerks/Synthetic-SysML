// #Sireum

import org.sireum._
import org.sireum.lang.FrontEnd
import org.sireum.lang.tipe.TypeHierarchy
import org.sireum.logika._
import org.sireum.project.DependencyManager
import org.sireum.proyek.{Analysis, Proyek}

/** Resident, singleton-source Logika executor.
  *
  * The worker reuses only Sireum's parsed-input and type-hierarchy caches.  A
  * fresh reporter and a fresh Logika/SMT transition cache are created for each
  * request.  Every Analysis.run receives exactly one source in `files` and
  * `vfiles`; batching proof sources is deliberately unsupported.
  *
  * Protocol (tab-separated, one line per request):
  *
  *   RUN <id> <valid|sat> <timeout-seconds> <absolute-source> <sha256>
  *   QUIT
  *
  * Results are preceded by Analysis' normal verbose output and terminated by:
  *
  *   GUMBO_LOGIKA_RESULT <id> <code> <verification-ms> <wall-ms>
  *                        <vc-count> <sat-count> <sha256>
  */
object LogikaWorker extends App {

  val ProtocolVersion: String = "1.0.0"

  def config(mode: String, timeoutSeconds: Z): Config = {
    val executables = Smt2Invoke.nameExePathMap(SireumApi.homeOpt.get)
    val solvers =
      Smt2.parseConfigs(executables, F,
        "cvc4,--full-saturate-quant; z3; cvc5,--full-saturate-quant").left ++
        Smt2.parseConfigs(executables, T, "z3").left
    return Config(
      smt2Configs = solvers,
      parCores = 1,
      sat = mode == "sat",
      rlimit = 2000000,
      timeoutInMs = timeoutSeconds * 1000,
      charBitWidth = 32,
      intBitWidth = 0,
      useReal = F,
      logPc = F,
      logRawPc = F,
      logVc = F,
      logVcDirOpt = None(),
      // Merge conditional states when deriving strictpure proof functions.
      // Forcing path splits here makes long Boolean contracts explode even
      // though ordinary splitIf is disabled. All branches remain represented.
      dontSplitPfq = T,
      splitAll = F,
      splitIf = F,
      splitMatch = F,
      splitContract = F,
      simplifiedQuery = F,
      checkInfeasiblePatternMatch = T,
      fpRoundingMode = "RNE",
      smt2Caching = F,
      smt2Seq = F,
      branchPar = Config.BranchPar.Disabled,
      atLinesFresh = F,
      interp = F,
      loopBound = 3,
      callBound = 3,
      interpContracts = F,
      elideEncoding = F,
      rawInscription = F,
      strictPureMode = Config.StrictPureMode.Default,
      transitionCache = F,
      patternExhaustive = T,
      pureFun = F,
      detailedInfo = T,
      satTimeout = mode == "sat",
      isAuto = T,
      background = Config.BackgroundMode.Disabled,
      atRewrite = T,
      searchPc = F,
      rwTrace = T,
      rwMax = 100,
      rwPar = F,
      rwEvalTrace = T,
      branchParPredNum = 2,
      branchParPredComp = 16)
  }

  def main(args: ISZ[String]): Z = {
    if (args.size != 1) {
      eprintln("usage: sireum slang run LogikaWorker.scala <proof-project>")
      return 64
    }
    if (!SireumApi.homeFound || !SireumApi.javaFound || !SireumApi.scalaFound) {
      eprintln("Sireum home, Java, and Scala must be available")
      return 69
    }
    val root = Os.path(args(0)).canon
    val project = Proyek.getProject(SireumApi.homeOpt.get, root, None(), None()) match {
      case Some(value) => value
      case _ =>
        eprintln(s"Could not load Proyek project: $root")
        return 66
    }
    val versions = Proyek.getVersions(project, root, ISZ(), SireumApi.versions.entries) match {
      case Some(value) => value
      case _ =>
        eprintln(s"Could not load Proyek versions: $root")
        return 66
    }
    val dm = DependencyManager(
      project = project,
      versions = versions,
      isJs = F,
      withSource = F,
      withDoc = F,
      javaHome = SireumApi.javaHomeOpt.get,
      scalaHome = SireumApi.scalaHomeOpt.get,
      sireumHome = SireumApi.homeOpt.get,
      cacheOpt = None(),
      proxy = Coursier.Proxy.empty)
    val maps: MBox2[
      HashMap[String, HashMap[String, FrontEnd.Input]],
      HashMap[String, TypeHierarchy]
    ] = MBox2(HashMap.empty, HashMap.empty)

    println(s"GUMBO_LOGIKA_WORKER_READY\t$ProtocolVersion")
    var running = T
    while (running) {
      val line = extension.Console.readLine("")
      val fields = ops.StringOps(line).split((c: C) => c == '\t')
      if (fields.isEmpty || fields(0) == "QUIT") {
        running = F
      } else if (fields.size != 6 || fields(0) != "RUN") {
        println("GUMBO_LOGIKA_PROTOCOL_ERROR\tmalformed-request")
      } else {
        val id = fields(1)
        val mode = fields(2)
        val timeoutOpt = Z(fields(3))
        val source = Os.path(fields(4)).canon
        val sourceHash = fields(5)
        if ((mode != "valid" && mode != "sat") || timeoutOpt.isEmpty ||
          timeoutOpt.get <= 0 || !source.isFile) {
          println(s"GUMBO_LOGIKA_PROTOCOL_ERROR\t$id\tinvalid-request")
        } else {
          val started = extension.Time.currentMillis
          println(s"GUMBO_LOGIKA_BEGIN\t$id\t$mode\t${source.string}")
          val reporter = ReporterImpl.create(F, F, F, T)
          val content = source.read
          val (code, verificationMillis) = Analysis.run(
            root = root,
            outDirName = s"out/equiv-worker-$id",
            project = project,
            dm = dm,
            cacheInput = T,
            cacheTypeHierarchy = T,
            mapBox = maps,
            config = config(mode, timeoutOpt.get),
            cache = NoTransitionSmt2Cache.create,
            files = HashSMap.empty[String, String] + source.string ~> content,
            filesWatched = F,
            vfiles = ISZ(source.string),
            line = 0,
            par = 1,
            strictAliasing = F,
            followSymLink = F,
            all = F,
            verify = T,
            disableOutput = F,
            verbose = T,
            sanityCheck = F,
            plugins = Logika.defaultPlugins,
            skipMethods = ISZ(),
            skipTypes = ISZ(),
            reporter = reporter)
          reporter.printMessages()
          val wallMillis = extension.Time.currentMillis - started
          if (code == 0) {
            println(st"Logika verified! Verification time: ${Smt2Formatter.formatTime(verificationMillis)}, Elapsed time: ${Smt2Formatter.formatTime(wallMillis)}".render)
          } else {
            println(st"Elapsed time: ${Smt2Formatter.formatTime(wallMillis)}".render)
          }
          println(st"GUMBO_LOGIKA_RESULT\t$id\t$code\t$verificationMillis\t$wallMillis\t${reporter.numOfVCs}\t${reporter.numOfSats}\t$sourceHash".render)
        }
      }
    }
    println("GUMBO_LOGIKA_WORKER_STOPPED")
    return 0
  }
}
