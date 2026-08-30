// #Sireum

import org.sireum._
import org.sireum.hamr.codegen.common.symbols._
import org.sireum.hamr.codegen.common.types._
import org.sireum.hamr.codegen.common.util.NameUtil
import org.sireum.hamr.ir._
import org.sireum.hamr.sysml.FrontEnd
import org.sireum.hamr.sysml.FrontEnd.Input
import org.sireum.message.{Position, Reporter}

/** Emit a versioned inventory from resolved SysML/GUMBO structures.
  *
  * FrontEnd.typeCheck is the semantic authority.  Source scanning is used only
  * to attach immediately preceding `// @trace` comments to already-resolved
  * clauses; it never discovers contracts, owners, components, or types.
  */
object GumboInventory extends App {

  // schema_version is retained for the deployed 0.1 reader.  New readers use
  // InventorySchemaVersion, whose major version covers the expanded fields.
  val SchemaVersion: String = "0.1.0"
  val InventorySchemaVersion: String = "2.0.0"
  val SireumVersion: String = "4.20260630.386eac9f"

  @pure def sourceLines(content: String): ISZ[String] = {
    val chars = conversions.String.toCis(content)
    var lines = ISZ[String]()
    var start: Z = 0
    var i: Z = 0
    while (i < chars.size) {
      if (chars(i) == '\n') {
        lines = lines :+ ops.StringOps.substring(chars, start, i)
        start = i + 1
      }
      i = i + 1
    }
    return lines :+ ops.StringOps.substring(chars, start, chars.size)
  }

  // Metadata only: attach the immediately preceding contiguous // block.
  def traceIds(posOpt: Option[Position]): ISZ[String] = {
    posOpt match {
      case Some(pos) if pos.uriOpt.nonEmpty =>
        val source = Os.Path.fromUri(pos.uriOpt.get)
        if (!source.isFile) return ISZ()
        val lines = sourceLines(source.read)
        var index = pos.beginLine - 2
        var block = ISZ[String]()
        while (index >= 0 && index < lines.size) {
          val line = ops.StringOps(lines(index)).trim
          if (!ops.StringOps(line).startsWith("//")) index = -1
          else {
            block = line +: block
            index = index - 1
          }
        }
        var ids = ISZ[String]()
        for (line <- block) {
          val tokens = ops.StringOps(line).split((c: C) => c == ' ' || c == '\t')
          var afterTrace = F
          for (token <- tokens if token.size > 0) {
            if (token == "@trace") afterTrace = T
            else if (afterTrace && !ops.ISZOps(ids).contains(token)) ids = ids :+ token
          }
        }
        return ids
      case _ => return ISZ()
    }
  }

  @pure def q(s: String): String = Json.Printer.printString(s).render

  @pure def jsonStrings(values: ISZ[String]): String =
    st"[${(for (value <- values) yield q(value), ",")}]".render

  @pure def jsonZs(values: ISZ[Z]): String =
    st"[${(for (value <- values) yield value.string, ",")}]".render

  @pure def positionJson(posOpt: Option[Position]): String = {
    posOpt match {
      case Some(pos) =>
        val uri = pos.uriOpt match {
          case Some(value) => value
          case _ => ""
        }
        return st"{\"uri\":${q(uri)},\"line\":${pos.beginLine},\"column\":${pos.beginColumn},\"offset\":${pos.offset}}".render
      case _ => return "null"
    }
  }

  @pure def record(owner: ISZ[String], phase: String, kind: String, id: String,
                   posOpt: Option[Position], scope: Option[String], supported: B,
                   unsupportedReason: Option[String]): String = {
    val ownerText = st"${(owner, "::")}".render
    val scopeJson = scope match {
      case Some(value) => q(value)
      case _ => "null"
    }
    val reasonJson = unsupportedReason match {
      case Some(value) => q(value)
      case _ => "null"
    }
    return st"{\"owner\":${q(ownerText)},\"phase\":${q(phase)},\"kind\":${q(kind)},\"clause_id\":${q(id)},\"id\":${q(id)},\"scope\":$scopeJson,\"trace_ids\":${jsonStrings(traceIds(posOpt))},\"source\":${positionJson(posOpt)},\"supported\":$supported,\"unsupported_reason\":$reasonJson}".render
  }

  def collectSpec(records: ISZ[String], owner: ISZ[String], phase: String,
                  spec: GclSpec, scope: Option[String], supported: B,
                  unsupportedReason: Option[String]): ISZ[String] = {
    val kind: String = spec match {
      case _: GclInvariant => "invariant"
      case _: GclAssume => "assumption"
      case _: GclGuarantee => "guarantee"
    }
    return records :+ record(owner, phase, kind, spec.id, spec.posOpt, scope,
      supported, unsupportedReason)
  }

  @pure def sourceObject(owner: ISZ[String], phase: String): String =
    st"${(owner, "::")}::GUMBO::$phase".render

  @pure def ownerRecord(owner: ISZ[String], phase: String, posOpt: Option[Position],
                        assumptions: Z, guarantees: Z, cases: Z, contributors: Z,
                        reasons: ISZ[String]): String = {
    val classifier = st"${(owner, "::")}".render
    return st"{\"classifier\":${q(classifier)},\"phase\":${q(phase)},\"source_object\":${q(sourceObject(owner, phase))},\"source\":${positionJson(posOpt)},\"assumption_count\":$assumptions,\"guarantee_count\":$guarantees,\"case_count\":$cases,\"contributor_count\":$contributors,\"supported\":${reasons.isEmpty},\"unsupported_reasons\":${jsonStrings(reasons)}}".render
  }

  @pure def stateRecord(owner: ISZ[String], state: GclStateVar): String = {
    val classifier = st"${(owner, "::")}".render
    return st"{\"classifier\":${q(classifier)},\"name\":${q(state.name)},\"qualified_type\":${q(state.classifier)},\"source\":${positionJson(state.posOpt)}}".render
  }

  @pure def footprintRecord(owner: ISZ[String], phase: String,
                            modifies: ISZ[org.sireum.lang.ast.Exp]): String = {
    val classifier = st"${(owner, "::")}".render
    val targets = for (modify <- modifies) yield modify.prettyST.render
    return st"{\"classifier\":${q(classifier)},\"phase\":${q(phase)},\"restricted\":${modifies.nonEmpty},\"targets\":${jsonStrings(targets)}}".render
  }

  def addGap(gaps: ISZ[String], owner: ISZ[String], gap: String): ISZ[String] = {
    val value = st"${(owner, "::")}:$gap".render
    return if (ops.ISZOps(gaps).contains(value)) gaps else gaps :+ value
  }

  def collectAnnex(owner: ISZ[String], annex: GclSubclause):
      (ISZ[String], ISZ[String], ISZ[String]) = {
    var records = ISZ[String]()
    var owners = ISZ[String]()
    var gaps = ISZ[String]()
    var sharedReasons = ISZ[String]()

    if (annex.compositions.nonEmpty) sharedReasons = sharedReasons :+ "composition"
    for (reason <- sharedReasons) gaps = addGap(gaps, owner, reason)

    if (annex.invariants.nonEmpty) {
      for (invariant <- annex.invariants) {
        records = collectSpec(records, owner, "datatype-invariant", invariant,
          None(), T, None())
      }
      owners = owners :+ ownerRecord(owner, "datatype-invariant", annex.posOpt,
        0, annex.invariants.size, 0, annex.methods.size, sharedReasons)
    }

    annex.integration match {
      case Some(integration) =>
        var assumptions: Z = 0
        var guarantees: Z = 0
        for (spec <- integration.specs) {
          spec match {
            case _: GclAssume => assumptions = assumptions + 1
            case _: GclGuarantee => guarantees = guarantees + 1
            case _ =>
          }
          records = collectSpec(records, owner, "integration", spec, None(), F,
            Some("integration-constraints"))
        }
        val reasons = sharedReasons :+ "integration-constraints"
        gaps = addGap(gaps, owner, "integration-constraints")
        owners = owners :+ ownerRecord(owner, "integration", integration.posOpt,
          assumptions, guarantees, 0, annex.methods.size, reasons)
      case _ =>
    }

    annex.initializes match {
      case Some(initialize) =>
        var reasons = sharedReasons
        for (guarantee <- initialize.guarantees) {
          records = collectSpec(records, owner, "initialize", guarantee, None(), T, None())
        }
        if (initialize.flows.nonEmpty) reasons = reasons :+ "initialize-flows"
        for (reason <- reasons) gaps = addGap(gaps, owner, reason)
        owners = owners :+ ownerRecord(owner, "initialize", initialize.posOpt,
          0, initialize.guarantees.size, 0, annex.methods.size, reasons)
      case _ =>
    }

    annex.compute match {
      case Some(compute) =>
        var reasons = sharedReasons
        for (assume <- compute.assumes) {
          records = collectSpec(records, owner, "compute", assume, None(), T, None())
        }
        for (guarantee <- compute.guarantees) {
          records = collectSpec(records, owner, "compute", guarantee, None(), T, None())
        }
        for (statement <- compute.cases) {
          records = records :+ record(owner, "compute", "case", statement.id,
            statement.posOpt, None(), T, None())
        }
        for (handler <- compute.handlers) {
          val scope = Some(handler.port.prettyST.render)
          for (assume <- handler.assumes) {
            records = collectSpec(records, owner, "compute-handler", assume, scope,
              F, Some("compute-handler"))
          }
          for (guarantee <- handler.guarantees) {
            records = collectSpec(records, owner, "compute-handler", guarantee, scope,
              F, Some("compute-handler"))
          }
          for (statement <- handler.cases) {
            records = records :+ record(owner, "compute-handler", "case",
              statement.id, statement.posOpt, scope, F, Some("compute-handler"))
          }
          if (!ops.ISZOps(reasons).contains("compute-handler")) {
            reasons = reasons :+ "compute-handler"
          }
        }
        if (compute.flows.nonEmpty) reasons = reasons :+ "compute-flows"
        for (reason <- reasons) gaps = addGap(gaps, owner, reason)
        owners = owners :+ ownerRecord(owner, "compute", compute.posOpt,
          compute.assumes.size, compute.guarantees.size, compute.cases.size,
          annex.methods.size, reasons)
      case _ =>
    }
    return (records, owners, gaps)
  }

  @pure def componentCategory(c: AadlComponent): String = c.component.category.string

  @pure def directionRole(direction: Direction.Type): String = {
    direction match {
      case Direction.In => return "input"
      case Direction.Out => return "output"
      case Direction.InOut => return "input"
      case Direction.None => return "value"
    }
  }

  @pure def featureUnsupportedReason(feature: AadlFeature): Option[String] = {
    feature match {
      case port: AadlPort if port.direction == Direction.InOut =>
        return Some("inout-port")
      case port: AadlPort if port.direction == Direction.None =>
        return Some("directionless-port")
      case port: AadlPort if port.isEvent =>
        return Some("event-port")
      case _: AadlPort => return None()
      case _: AadlParameter => return Some("subprogram-parameter")
      case _: AadlAccessFeature => return Some("access-feature")
      case _: AadlFeatureTODO => return Some("unresolved-feature")
      case _ => return Some("unsupported-feature")
    }
  }

  @pure def observationJson(feature: AadlFeature): Option[String] = {
    feature match {
      case port: AadlPort =>
        val qtype: String = port match {
          case data: AadlFeatureData => data.aadlType.name
          case _ => "art::Empty"
        }
        return Some(st"{\"name\":${q(port.identifier)},\"role\":${q(directionRole(port.direction))},\"qualified_type\":${q(qtype)}}".render)
      case _ => return None()
    }
  }

  @pure def rootJson(root: AadlComponent, aadlTypes: AadlTypes): String = {
    var typeNames = ISZ[String]()
    for (entry <- aadlTypes.typeMap.entries) typeNames = typeNames :+ entry._1
    typeNames = ops.ISZOps(typeNames).sortWith((a, b) => a <= b)
    return st"{\"instance_path\":${q(root.pathAsString("::"))},\"classifier\":${q(root.classifierAsString)},\"category\":${q(componentCategory(root))},\"type_names\":${jsonStrings(typeNames)}}".render
  }

  @pure def componentJson(rootClassifier: String, rootInstancePath: String,
                          component: AadlComponent): String = {
    var observations = ISZ[String]()
    var reasons = ISZ[String]()
    for (feature <- component.features) {
      observationJson(feature) match {
        case Some(value) => observations = observations :+ value
        case _ =>
      }
      featureUnsupportedReason(feature) match {
        case Some(reason) if !ops.ISZOps(reasons).contains(reason) =>
          reasons = reasons :+ reason
        case _ =>
      }
    }
    // This is the exact base-package-relative object identity used by the
    // installed Arsit GumboX generator.  A caller-supplied codegen base package
    // is the only omitted prefix.
    val names = NameUtil.getAirNameProvider(component.component, "")
    val gumboxObject = s"${names.aadlPackage}.${names.componentSingletonType}_GumboX"
    return st"{\"root\":${q(rootClassifier)},\"root_instance_path\":${q(rootInstancePath)},\"instance_path\":${q(component.pathAsString("::"))},\"classifier\":${q(component.classifierAsString)},\"category\":${q(componentCategory(component))},\"source\":${positionJson(component.posOpt)},\"gumbox_object\":${q(gumboxObject)},\"gumbox_naming_authority\":\"NameUtil.getAirNameProvider(component, basePackage).componentSingletonType\",\"observations\":[${(observations, ",")}],\"supported\":${reasons.isEmpty},\"unsupported_reasons\":${jsonStrings(reasons)}}".render
  }

  @pure def typeJson(aadlType: AadlType): String = {
    var kind = "unknown"
    var fields = ISZ[String]()
    var literals = ISZ[String]()
    var elementType: Option[String] = None()
    var dimensions = ISZ[Z]()
    var arrayKind: Option[String] = None()
    var supported = T
    var reason: Option[String] = None()
    aadlType match {
      case t: EnumType =>
        kind = "enum"
        literals = t.values
      case t: RecordType =>
        kind = "record"
        for (entry <- t.fields.entries) {
          fields = fields :+ st"{\"name\":${q(entry._1)},\"qualified_type\":${q(entry._2.name)}}".render
        }
      case t: ArrayType =>
        kind = "bounded-sequence"
        elementType = Some(t.baseType.name)
        dimensions = t.dimensions
        arrayKind = Some(t.kind.string)
        if (t.kind == ArraySizeKind.Unbounded || t.dimensions.size != 1) {
          supported = F
          reason = Some("unbounded or multidimensional array")
        }
      case _: BaseType => kind = "scalar"
      case _: BitType => kind = "scalar"
      case _: TODOType =>
        kind = "unknown"
        supported = F
        reason = Some("unresolved AADL datatype")
      case _ =>
        supported = F
        reason = Some("unsupported AADL datatype")
    }
    val elementJson = elementType match {
      case Some(value) => q(value)
      case _ => "null"
    }
    val arrayKindJson = arrayKind match {
      case Some(value) => q(value)
      case _ => "null"
    }
    val reasonJson = reason match {
      case Some(value) => q(value)
      case _ => "null"
    }
    return st"{\"qualified_name\":${q(aadlType.name)},\"kind\":${q(kind)},\"fields\":[${(fields, ",")}],\"literals\":${jsonStrings(literals)},\"element_type\":$elementJson,\"dimensions\":${jsonZs(dimensions)},\"array_size_kind\":$arrayKindJson,\"supported\":$supported,\"unsupported_reason\":$reasonJson}".render
  }

  @pure def collectSysml(path: Os.Path): ISZ[Os.Path] = {
    if (path.isFile && path.ext == "sysml") return ISZ(path.canon)
    if (!path.isDir) return ISZ()
    var files = ISZ[Os.Path]()
    for (file <- Os.Path.walk(path, T, T, p => p.ext == string"sysml")) {
      files = files :+ file.canon
    }
    return ops.ISZOps(files).sortWith((a, b) => a.string <= b.string)
  }

  def usage(): Unit = eprintln("usage: sireum slang run scripts/analysis/GumboInventory.scala <model-file-or-dir> <library-dir> <output.json> | --batch <library-dir> <model-1> <output-1> [<model-N> <output-N>]*")

  def emit(modelArg: String, libraryArg: String, outputArg: String): Z = {
    val modelFiles = collectSysml(Os.path(modelArg))
    val libraryFiles = collectSysml(Os.path(libraryArg))
    if (modelFiles.isEmpty || libraryFiles.isEmpty) {
      eprintln("model and library inputs must contain .sysml files")
      return 66
    }
    var inputs = ISZ[Input]()
    for (file <- libraryFiles ++ modelFiles) {
      inputs = inputs :+ Input(content = file.read, fileUri = Some(file.toUri))
    }
    val reporter = Reporter.create
    val (_, modelElements, _) = FrontEnd.typeCheck(par = 0, inputs = inputs,
      store = Map.empty, reporter = reporter)
    if (reporter.hasError) {
      reporter.printMessages()
      eprintln("GUMBO_INVENTORY_RESULT=INVALID_INPUT")
      return 2
    }

    var roots = ISZ[String]()
    var seenRoots = Set.empty[String]
    var instances = ISZ[String]()
    var seenInstances = Set.empty[String]
    var types = ISZ[String]()
    var resolvedModels = ISZ[String]()
    var seenTypes = Set.empty[String]
    var gaps = ISZ[String]()
    for (model <- modelElements) {
      val rootInstancePath = model.symbolTable.rootSystem.pathAsString("::")
      val rootClassifier = model.symbolTable.rootSystem.classifierAsString
      val rootKey = s"$rootClassifier:$rootInstancePath"
      if (!seenRoots.contains(rootKey)) {
        seenRoots = seenRoots + rootKey
        roots = roots :+ rootJson(model.symbolTable.rootSystem, model.types)
      }
      for (entry <- model.symbolTable.componentMap.entries) {
        val componentPath = entry._2.pathAsString("::")
        val instanceKey = s"$rootClassifier:$rootInstancePath:$componentPath"
        if (!seenInstances.contains(instanceKey)) {
          seenInstances = seenInstances + instanceKey
          instances = instances :+ componentJson(rootClassifier, rootInstancePath, entry._2)
          for (feature <- entry._2.features) {
            featureUnsupportedReason(feature) match {
              case Some(reason) =>
                val gap = s"$instanceKey:$reason"
                if (!ops.ISZOps(gaps).contains(gap)) gaps = gaps :+ gap
              case _ =>
            }
          }
        }
      }
      for (entry <- model.types.typeMap.entries if !seenTypes.contains(entry._1)) {
        seenTypes = seenTypes + entry._1
        types = types :+ typeJson(entry._2)
        entry._2 match {
          case t: ArrayType if t.kind == ArraySizeKind.Unbounded || t.dimensions.size != 1 =>
            gaps = gaps :+ s"type:${entry._1}:unbounded-or-multidimensional-array"
          case _: TODOType => gaps = gaps :+ s"type:${entry._1}:unresolved-datatype"
          case _: EnumType =>
          case _: RecordType =>
          case _: ArrayType =>
          case _: BaseType =>
          case _: BitType =>
          case _ => gaps = gaps :+ s"type:${entry._1}:unsupported-datatype"
        }
      }
      resolvedModels = resolvedModels :+ org.sireum.hamr.ir.JSON.fromAadl(model.model, T)
    }

    var seenAnnex = Set.empty[String]
    var records = ISZ[String]()
    var contractOwners = ISZ[String]()
    var stateDeclarations = ISZ[String]()
    var writeFootprints = ISZ[String]()
    for (model <- modelElements; entry <- model.symbolTable.annexClauseInfos.entries; info <- entry._2) {
      info match {
        case GclAnnexClauseInfo(annex, _) =>
          val owner: ISZ[String] = model.symbolTable.componentMap.get(entry._1) match {
            case Some(component) => component.classifier
            case _ => entry._1
          }
          val sourceKey = st"${(owner, "::")}:${positionJson(annex.posOpt)}".render
          if (!seenAnnex.contains(sourceKey)) {
            seenAnnex = seenAnnex + sourceKey
            for (state <- annex.state) {
              stateDeclarations = stateDeclarations :+ stateRecord(owner, state)
            }
            annex.initializes match {
              case Some(initialize) =>
                writeFootprints = writeFootprints :+
                  footprintRecord(owner, "initialize", initialize.modifies)
              case _ =>
            }
            annex.compute match {
              case Some(compute) =>
                writeFootprints = writeFootprints :+
                  footprintRecord(owner, "compute", compute.modifies)
              case _ =>
            }
            val result = collectAnnex(owner, annex)
            records = records ++ result._1
            contractOwners = contractOwners ++ result._2
            for (gap <- result._3 if !ops.ISZOps(gaps).contains(gap)) gaps = gaps :+ gap
          }
        case _ =>
      }
    }
    var supportedCount: Z = 0
    for (record <- records if !ops.StringOps(record).contains("\"supported\":false")) {
      supportedCount = supportedCount + 1
    }
    val json =
      st"""{
          |  "schema_version": ${q(SchemaVersion)},
          |  "inventory_schema_version": ${q(InventorySchemaVersion)},
          |  "semantic_authority": "Sireum FrontEnd.typeCheck / resolved AIR and GclAnnexClauseInfo",
          |  "sireum_version": ${q(SireumVersion)},
          |  "roots": [${(roots, ",")}],
          |  "instances": [${(instances, ",")}],
          |  "types": [${(types, ",")}],
          |  "contract_owners": [${(contractOwners, ",")}],
          |  "state_declarations": [${(stateDeclarations, ",")}],
          |  "write_footprints": [${(writeFootprints, ",")}],
          |  "records": [${(records, ",")}],
          |  "declared_clause_count": ${records.size},
          |  "supported_clause_count": $supportedCount,
          |  "coverage_gaps": ${jsonStrings(gaps)},
          |  "first_slice_coverage_gaps": ${jsonStrings(gaps)},
          |  "resolved_models": [${(resolvedModels, ",")}]
          |}
          |""".render
    val output = Os.path(outputArg)
    output.up.mkdirAll()
    output.writeOver(json)
    println(st"Wrote ${output.canon}".render)
    return 0
  }

  def main(args: ISZ[String]): Z = {
    if (args.size == 3 && args(0) != "--batch") {
      return emit(args(0), args(1), args(2))
    }
    if (args.size < 4 || args(0) != "--batch" || (args.size - 2) % 2 != 0) {
      usage()
      return 64
    }
    val library = args(1)
    var index: Z = 2
    while (index < args.size) {
      val code = emit(args(index), library, args(index + 1))
      if (code != 0) return code
      index = index + 2
    }
    return 0
  }
}
