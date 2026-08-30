// #Sireum

import org.sireum._
import org.sireum.hamr.codegen.arsit.Arsit
import org.sireum.hamr.codegen.arsit.plugin.ArsitPlugin
import org.sireum.hamr.codegen.arsit.gcl.GumboGen
import org.sireum.hamr.codegen.arsit.util.{ArsitOptions, ArsitPlatform, IpcMechanism}
import org.sireum.hamr.codegen.common.containers.{ExternalResource, InternalResource, Resource}
import org.sireum.hamr.codegen.common.symbols.{GclAnnexClauseInfo, GclAnnexLibInfo}
import org.sireum.hamr.codegen.common.util.{HamrCli, ModelUtil, NameUtil}
import org.sireum.hamr.ir.GclSubclause
import org.sireum.hamr.sysml.FrontEnd
import org.sireum.hamr.sysml.FrontEnd.Input
import org.sireum.message.Reporter

@datatype class GumboSemanticAccepted(val content: String, val role: String, val nativeResource: B)

/** Export the native HAMR/GumboX semantic slice needed by the equivalence checker.
  *
  * This is deliberately a wrapper around public Sireum APIs.  FrontEnd.typeCheck
  * remains the SysML/GUMBO parser and resolver, ModelUtil.resolve performs the
  * package-specific native lowering, and Arsit supplies the authoritative source
  * resources.  Arsit currently computes more resources in memory than this slice
  * needs; this adapter never writes those rejected resources.
  *
  * Native resources are copied byte-for-byte from InternalResource.content.  The
  * only adapter-authored files are the minimal art.DataContent carrier and Proyek
  * project definition, and both are identified as non-native in the manifest.
  */
object GumboSemanticExport extends App {

  val Schema: String = "equiv-checker-gumbo-semantic-export"
  val Version: Z = 2

  val DataContent: String =
    """// #Sireum
      |
      |package art
      |
      |import org.sireum._
      |
      |@sig trait DataContent
      |
      |@datatype class Empty extends art.DataContent
      |""".stripMargin

  val Project: String =
    """::/*#! 2> /dev/null                                   #
      |@ 2>/dev/null # 2>nul & echo off & goto BOF           #
      |if [ -z "${SIREUM_HOME}" ]; then                      #
      |  echo "Please set SIREUM_HOME env var"               #
      |  exit -1                                             #
      |fi                                                    #
      |exec "${SIREUM_HOME}/bin/sireum" slang run "$0" "$@"  #
      |:BOF
      |setlocal
      |if not defined SIREUM_HOME (
      |  echo Please set SIREUM_HOME env var
      |  exit /B -1
      |)
      |"%SIREUM_HOME%\bin\sireum.bat" slang run %0 %*
      |exit /B %errorlevel%
      |::!#*/
      |// #Sireum
      |
      |import org.sireum._
      |import org.sireum.project.{Module, Project, Target}
      |
      |val home: Os.Path = Os.slashDir.up.canon
      |val semantic: Module = Module(
      |  id = "gumbo-semantic-export",
      |  basePath = (home / "src").string,
      |  subPathOpt = None(),
      |  deps = ISZ(),
      |  targets = ISZ(Target.Jvm),
      |  ivyDeps = ISZ("org.sireum.kekinian::library:"),
      |  sources = for (d <- ISZ("art", "bridge", "component", "data")) yield (Os.path("main") / d).string,
      |  resources = ISZ(),
      |  testSources = ISZ(),
      |  testResources = ISZ(),
      |  publishInfoOpt = None())
      |
      |println(project.JSON.fromProject(Project.empty + semantic, T))
      |""".stripMargin

  @pure def q(s: String): String = Json.Printer.printString(s).render

  @pure def collectSysml(path: Os.Path): ISZ[Os.Path] = {
    if (path.isFile && path.ext == "sysml") return ISZ(path.canon)
    if (!path.isDir) return ISZ()
    var files = ISZ[Os.Path]()
    for (file <- Os.Path.walk(path, T, T, p => p.ext == string"sysml")) {
      files = files :+ file.canon
    }
    return ops.ISZOps(files).sortWith((a, b) => a.string <= b.string)
  }

  @pure def sha256(content: String): String = {
    val digest = _root_.java.security.MessageDigest.getInstance("SHA-256".value)
      .digest(content.value.getBytes("UTF-8".value))
    val bytes = ISZ((for (d <- digest) yield U8(d)).toSeq: _*)
    val result = ops.StringOps(st"${(bytes, "")}".render).toLower
    assert(result.size == 64)
    return result
  }

  @pure def roleFor(relative: String, isDatatype: B): Option[String] = {
    if (relative == "versions.properties") return Some("project-metadata")
    if (ops.StringOps(relative).endsWith("_GumboX.scala") &&
        ops.StringOps(relative).startsWith("src/main/bridge/")) return Some("gumbox")
    if (isDatatype && ops.StringOps(relative).startsWith("src/main/data/")) {
      if (ops.StringOps(relative).endsWith("_Containers.scala") ||
          ops.StringOps(relative).endsWith("/Container.scala")) return Some("container")
      return Some("datatype")
    }
    return None()
  }

  @pure def rejectedRole(relative: String, external: B): String = {
    if (external) return "external"
    if (ops.StringOps(relative).startsWith("src/main/architecture/")) return "architecture"
    if (ops.StringOps(relative).startsWith("src/main/component/")) return "component"
    if (ops.StringOps(relative).startsWith("src/main/bridge/")) return "bridge_non_gumbox"
    if (ops.StringOps(relative).startsWith("src/test/")) return "test"
    if (ops.StringOps(relative).startsWith("bin/") || relative == "versions.properties") return "build"
    return "other"
  }

  def increment(counts: HashSMap[String, Z], key: String): HashSMap[String, Z] = {
    val old = counts.get(key).getOrElse(0)
    return counts + key ~> (old + 1)
  }

  @pure def relativePath(base: Os.Path, dst: String): Option[String] = {
    val prefix = s"${base.canon.value}/"
    if (!ops.StringOps(dst).startsWith(prefix)) return None()
    return Some(ops.StringOps(dst).substring(prefix.size, dst.size))
  }

  def reporterFailure(reporter: Reporter, marker: String): Z = {
    reporter.printMessages()
    eprintln(s"GUMBO_SEMANTIC_EXPORT_RESULT=$marker")
    return 2
  }

  @pure def hasFunctions(model: ModelUtil.ModelElements): B = {
    for (entry <- model.symbolTable.annexClauseInfos.entries; info <- entry._2) {
      info match {
        case GclAnnexClauseInfo(annex, _) if annex.methods.nonEmpty => return T
        case _ =>
      }
    }
    for (info <- model.symbolTable.annexLibInfos) {
      info match {
        case GclAnnexLibInfo(annex, _, _) if annex.methods.nonEmpty => return T
        case _ =>
      }
    }
    return F
  }

  def codegenOptions(packageName: String): HamrCli.CodegenOption =
    HamrCli.CodegenOption(
      help = "", args = ISZ(), msgpack = F, verbose = F, runtimeMonitoring = F,
      platform = HamrCli.CodegenHamrPlatform.JVM, outputDir = None(), parseableMessages = F,
      slangOutputDir = None(), packageName = Some(packageName), noProyekIve = T,
      noEmbedArt = T, devicesAsThreads = F, genSbtMill = F, slangAuxCodeDirs = ISZ(),
      slangOutputCDir = None(), excludeComponentImpl = T, bitWidth = 64,
      maxStringSize = 100, maxArraySize = 100, runTranspiler = F,
      scheduling = HamrCli.CodegenScheduling.Domain, verusAttributeSyntax = F,
      sel4OutputDir = None(), sel4AuxCodeDirs = ISZ(), workspaceRootDir = None(),
      strictAadlMode = F, ros2OutputWorkspaceDir = None(), ros2Dir = None(),
      ros2NodesLanguage = HamrCli.CodegenNodesCodeLanguage.Cpp,
      ros2LaunchLanguage = HamrCli.CodegenLaunchCodeLanguage.Xml,
      invertTopicBinding = F, experimentalOptions = ISZ())

  def arsitOptions(output: Os.Path, packageName: String): ArsitOptions =
    ArsitOptions(
      slangOutputDir = output, packageName = packageName, noEmbedArt = T,
      bless = F, verbose = F, runtimeMonitoring = F, devicesAsThreads = F,
      genSbtMill = F, ipc = IpcMechanism.SharedMemory, auxCodeDirs = ISZ(),
      outputSharedCDir = output / ".unused-c",
      outputPlatformCDir = output / ".unused-platform-c", excludeImpl = T,
      platform = ArsitPlatform.JVM, bitWidth = 64, maxStringSize = 100,
      maxArraySize = 100, pathSeparator = ops.StringOps(Os.fileSep).first,
      experimentalOptions = ISZ(), runSlangCheck = F)

  def writeResource(output: Os.Path, relative: String, content: String): Unit = {
    val target = output / relative
    target.up.mkdirAll()
    target.writeOver(content)
    if (relative == "bin/project.cmd") target.setExecutable(T)
  }

  def emit(modelArg: String, libraryArg: String, root: String,
           packageName: String, outputArg: String): Z = {
    val started = _root_.java.lang.System.nanoTime()
    val modelPath = Os.path(modelArg)
    val output = Os.path(outputArg)
    val modelFiles = collectSysml(modelPath)
    val libraryFiles = collectSysml(Os.path(libraryArg))
    if (modelFiles.isEmpty || libraryFiles.isEmpty) {
      eprintln("model and library inputs must contain .sysml files")
      return 66
    }
    if (output.exists && output.list.nonEmpty) {
      eprintln(s"refusing non-empty semantic export directory: ${output.canon}")
      return 73
    }

    var inputs = ISZ[Input]()
    for (file <- libraryFiles ++ modelFiles) {
      inputs = inputs :+ Input(content = file.read, fileUri = Some(file.toUri))
    }
    val reporter = Reporter.create
    val (_, models, initialStore) = FrontEnd.typeCheck(
      par = 0, inputs = inputs, store = Map.empty, reporter = reporter)
    if (reporter.hasError) return reporterFailure(reporter, "INVALID_INPUT")

    var selected: Option[ModelUtil.ModelElements] = None()
    for (model <- models if model.symbolTable.rootSystem.classifierAsString == root) {
      if (selected.nonEmpty) {
        eprintln(s"root classifier is ambiguous: $root")
        return 65
      }
      selected = Some(model)
    }
    if (selected.isEmpty) {
      eprintln(s"resolved root classifier was not found: $root")
      return 65
    }
    // Re-resolve using the requested package.  Calling Arsit directly after this
    // avoids CodeGen's redundant resolution and all write/sergen/slangcheck hooks.
    val resolvedResult = ModelUtil.resolve(selected.get.model,
      selected.get.model.components(0).identifier.pos,
      packageName, codegenOptions(packageName), initialStore, reporter)
    if (reporter.hasError || resolvedResult._1.isEmpty) {
      return reporterFailure(reporter, "NATIVE_RESOLUTION_FAILED")
    }
    val resolved = resolvedResult._1.get
    val generated = Arsit.run(resolved.model, arsitOptions(output, packageName),
      resolved.types, resolved.symbolTable, ArsitPlugin.gumboEnhancedPlugins,
      resolvedResult._2, reporter)._1
    if (reporter.hasError) return reporterFailure(reporter, "NATIVE_GENERATION_FAILED")

    var accepted = HashSMap.empty[String, GumboSemanticAccepted]
    var rejected = HashSMap.empty[String, Z]
    for (resource <- generated.resources) {
      resource match {
        case native: InternalResource =>
          relativePath(output, native.dstPath) match {
            case Some(relative) =>
              roleFor(relative, native.isDatatype) match {
                case Some(role) =>
                  val content = native.content.render
                  accepted.get(relative) match {
                    case Some(old) =>
                      if (old.content != content) {
                        eprintln(s"conflicting native resources for $relative")
                        return 4
                      }
                    case _ => accepted = accepted + relative ~> GumboSemanticAccepted(content, role, T)
                  }
                case _ =>
                  if (native.isDatatype) {
                    eprintln(s"gumbo-semantic-support-resource: $relative")
                    return 4
                  }
                  rejected = increment(rejected, rejectedRole(relative, F))
              }
            case _ =>
              eprintln(s"native resource escaped semantic output root: ${native.dstPath}")
              return 4
          }
        case external: ExternalResource =>
          rejected = increment(rejected, rejectedRole(external.dstPath, T))
        case _ => rejected = increment(rejected, "config")
      }
    }

    // Component-local GUMBO helpers normally live in generated application
    // objects together with operational method stubs.  Regenerate only the
    // helper block, using the same native GumboGen routine, under the exact
    // object identity referenced by GumboX.
    for (entry <- resolved.symbolTable.annexClauseInfos.entries; info <- entry._2) {
      info match {
        case GclAnnexClauseInfo(annex, gclSymbolTable) if annex.methods.nonEmpty =>
          resolved.symbolTable.componentMap.get(entry._1) match {
            case Some(component) =>
              val names = NameUtil.getAirNameProvider(component.component, packageName)
              val helperResult = GumboGen.processSubclauseFunctions(
                annex.methods, gclSymbolTable, resolved.symbolTable, resolved.types,
                packageName, resolvedResult._2)
              val helperImports = for (value <- helperResult._3) yield st"import $value"
              val helperContent =
                st"""// #Sireum
                    |
                    |package ${names.packageName}
                    |
                    |import org.sireum._
                    |import ${packageName}._
                    |${(helperImports, "\n")}
                    |
                    |object ${names.componentSingletonType} {
                    |  ${helperResult._1}
                    |}
                    |""".render
              val relative = s"src/main/component/${names.packagePath}/${names.componentSingletonType}.scala"
              accepted.get(relative) match {
                case Some(old) if old.content != helperContent =>
                  eprintln(s"conflicting helper carriers for $relative")
                  return 4
                case _ =>
                  accepted = accepted + relative ~>
                    GumboSemanticAccepted(helperContent, "gumbo-helper-carrier", F)
              }
            case _ =>
              eprintln(st"helper owner is not a resolved component: ${(entry._1, "::")}".render)
              return 4
          }
        case _ =>
      }
    }

    if (accepted.isEmpty) {
      eprintln("native semantic resource set is empty")
      return 4
    }

    accepted = accepted + "src/main/art/art/DataContent.scala" ~> GumboSemanticAccepted(DataContent, "art-data-content", F)
    accepted = accepted + "bin/project.cmd" ~> GumboSemanticAccepted(Project, "project", F)
    output.mkdirAll()

    var resourceJson = ISZ[String]()
    val entries = ops.ISZOps(accepted.entries).sortWith((a, b) => a._1 <= b._1)
    for (entry <- entries) {
      val relative = entry._1
      val content = entry._2.content
      val role = entry._2.role
      val native = entry._2.nativeResource
      writeResource(output, relative, content)
      resourceJson = resourceJson :+
        st"{\"path\":${q(relative)},\"role\":${q(role)},\"sha256\":${q(sha256(content))},\"native_resource\":$native}".render
    }

    val countKeys = ISZ("architecture", "component", "bridge_non_gumbox", "test",
      "build", "external", "config", "other")
    var countJson = ISZ[String]()
    for (key <- countKeys) countJson = countJson :+ st"${q(key)}:${rejected.get(key).getOrElse(0)}".render
    val elapsedMillis = (_root_.java.lang.System.nanoTime() - started) / 1000000L
    val elapsedSeconds: R = R(elapsedMillis) / r"1000.0"
    val manifest =
      st"""{
          |  "schema": ${q(Schema)},
          |  "version": $Version,
          |  "model": ${q(modelPath.canon.value)},
          |  "root": ${q(root)},
          |  "package": ${q(packageName)},
          |  "elapsed_seconds": $elapsedSeconds,
          |  "resources": [${(resourceJson, ",")}],
          |  "rejected_resource_counts": {${(countJson, ",")}}
          |}
          |""".render
    (output / "semantic-export.json").writeOver(manifest)
    var rejectedTotal: Z = 0
    for (count <- rejected.values) rejectedTotal = rejectedTotal + count
    println(s"GUMBO_SEMANTIC_EXPORT_RESULT=OK output=${output.canon} native=${accepted.size - 2} rejected=$rejectedTotal")
    return 0
  }

  def usage(): Unit = eprintln("usage: sireum slang run src/equiv_checker/adapters/GumboSemanticExport.scala <model-file-or-dir> <library-dir> <root-classifier> <package-name> <output-dir> | --batch <library-dir> <model> <root> <package> <output> [<model> <root> <package> <output>]*")

  def main(args: ISZ[String]): Z = {
    if (args.size == 5 && args(0) != "--batch") {
      return emit(args(0), args(1), args(2), args(3), args(4))
    }
    if (args.size < 6 || args(0) != "--batch" || (args.size - 2) % 4 != 0) {
      usage()
      return 64
    }
    val library = args(1)
    var index: Z = 2
    while (index < args.size) {
      val result = emit(args(index), library, args(index + 1), args(index + 2), args(index + 3))
      if (result != 0) return result
      index = index + 4
    }
    return 0
  }
}
