// #Sireum

import org.sireum._
import org.sireum.hamr.codegen.common.symbols.{GclAnnexClauseInfo, GclAnnexLibInfo}
import org.sireum.hamr.ir._
import org.sireum.hamr.sysml.FrontEnd
import org.sireum.hamr.sysml.FrontEnd.Input
import org.sireum.lang.{ast => AST}
import org.sireum.message.{Position, Reporter}

@datatype class SnlResult(val ok: B, val text: String)
@datatype class PublicationUnit(val owner: String,
                                val phase: Option[String],
                                val kind: String,
                                val formalId: String,
                                val scope: Option[String],
                                val heading: String,
                                val posOpt: Option[Position])
@datatype class SnlRendered(val sourceKey: String,
                            val sortKey: String,
                            val text: String,
                            val publicationUnits: ISZ[PublicationUnit])
@datatype class InclusiveBound(val term: AST.Exp, val bound: AST.Exp, val isLower: B)
@datatype class RenderedAction(val ok: B, val verb: String, val complement: String)

/*
 * Audited GUMBO/Sireum ==> structured-English rules and direct FrontEnd CLI.
 *
 * The renderer intentionally consumes resolved GCL and Slang AST values. It does
 * not parse GUMBO text, deserialize an intermediate representation, or use an
 * LLM.  Keep each translation branch explicit and easy to compare with
 * GUMBO_GRAMMAR_COVERAGE.tsv.
 *
 * Slang glossary for readers coming from Java/Python:
 *   - ISZ[T] is an immutable, indexable sequence of T values.
 *   - Option[T] is either Some(value) or None(), so absence is explicit.
 *   - ST is Sireum's structured-text template; `.render` produces a String.
 *   - @pure marks a side-effect-free function; @strictpure is the stricter
 *     compile-time form used for small value helpers.
 *   - `x match { case ... }` is typed pattern matching. Each AST subtype gets
 *     an explicit semantic rule, and the final case returns failure.
 *
 * Pipeline: complete SysML text -> FrontEnd.typeCheck -> resolved GCL/Slang
 * AST -> these rules -> structured English. No source syntax is reparsed. A
 * successfully resolved but unrecognized node stops the whole command before
 * an output file is written; partial semantic translations are more dangerous
 * than a clear failure for downstream equivalence work.
 */
object SnlRules extends App {

  val SireumVersion: String = "4.20260630.386eac9f"
  val HamrSysmlParserVersion: String = "4.20260626.332fb27"
  val SnlStyleVersion: String = "2"
  val PublicationInventorySchema: String = "snl-resolved-publication-inventory-1.0.0"
  val NL: String = "@@SNL_LINE_BREAK@@"
  val OwnerMarker: String = "@@SNL_CONTRACT_OWNER@@"

  @strictpure def success(text: String): SnlResult = SnlResult(T, text)
  @strictpure def failure(text: String): SnlResult = SnlResult(F, text)

  @pure def quote(id: String): String = {
    return st"`$id`".render
  }

  @pure def indent(text: String, prefix: String): String = {
    val separator = st"$NL$prefix".render
    return st"$prefix${ops.StringOps(text).replaceAllLiterally(NL, separator)}".render
  }

  @pure def listItem(text: String, spaces: String): String = {
    val continuation = st"$NL$spaces  ".render
    val continued = ops.StringOps(text).replaceAllLiterally(NL, continuation)
    return st"$spaces- $continued".render
  }

  // Contract prose is placed in a CommonMark block quote. FAA §2.5.7 (p. 33)
  // and §§2.11.1–2.11.2 (pp. 72–73), plus NASA Appendix C.4 (p. 237), keep the
  // requirement statement distinct from rationale and other metadata. The
  // block quote also preserves nested lists in ordinary Markdown previews.
  @pure def quoteLines(text: String): String = {
    val separator = st"$NL> ".render
    val quoted = st"> ${ops.StringOps(text).replaceAllLiterally(NL, separator)}".render
    return ops.StringOps(quoted).replaceAllLiterally(st"$NL> $NL".render, st"$NL>$NL".render)
  }

  @pure def proseBlock(lead: String, body: String): String = {
    if (body.size == 0) return quoteLines(lead)
    val punctuated = if (ops.StringOps(body).endsWith(".") || ops.StringOps(body).endsWith("!") ||
      ops.StringOps(body).endsWith("?")) body else st"$body.".render
    return st"${quoteLines(lead)}$NL>$NL${quoteLines(punctuated)}".render
  }

  // Types are semantic inputs too. FAA §§2.4.1 and 2.5.4 (pp. 23, 30) require
  // type/range/precision/unit definitions for monitored, controlled, and
  // internal variables. Render resolved names and type arguments explicitly.
  @pure def renderType(tipe: AST.Type): SnlResult = {
    tipe match {
      case named: AST.Type.Named =>
        val name = st"${(for (id <- named.name.ids) yield id.value, "::")}".render
        if (named.typeArgs.isEmpty) return success(quote(name))
        var args = ISZ[String]()
        for (arg <- named.typeArgs) {
          val r = renderType(arg)
          if (!r.ok) return r
          args = args :+ r.text
        }
        return success(st"${quote(name)} with type arguments (${(args, ", ")})".render)
      case fun: AST.Type.Fun =>
        var args = ISZ[String]()
        for (arg <- fun.args) {
          val r = renderType(arg)
          if (!r.ok) return r
          args = args :+ r.text
        }
        val ret = renderType(fun.ret)
        if (!ret.ok) return ret
        val mode = if (fun.isByName) "by-name function" else if (fun.isPure) "pure function" else "function"
        return success(st"$mode from (${(args, ", ")}) to ${ret.text}".render)
      case tuple: AST.Type.Tuple =>
        var args = ISZ[String]()
        for (arg <- tuple.args) {
          val r = renderType(arg)
          if (!r.ok) return r
          args = args :+ r.text
        }
        return success(st"tuple of (${(args, ", ")})".render)
      case _ => return failure(st"unsupported resolved Slang type at ${positionText(tipe.posOpt)}".render)
    }
  }

  @pure def positionText(posOpt: Option[Position]): String = {
    posOpt match {
      // Sireum's parser records ANTLR's zero-based charPositionInLine. Lines
      // are already one-based; expose both coordinates as human one-based.
      case Some(pos) => return st"line ${pos.beginLine}, column ${pos.beginColumn + 1}".render
      case _ => return "unknown source position"
    }
  }

  // Metadata only: scan the contiguous // comment block immediately before a
  // resolved node's one-based beginLine. This never parses GUMBO syntax.
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
    lines = lines :+ ops.StringOps.substring(chars, start, chars.size)
    return lines
  }

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
          if (!ops.StringOps(line).startsWith("//")) {
            index = -1
          } else {
            block = line +: block
            index = index - 1
          }
        }
        var ids = ISZ[String]()
        for (line <- block) {
          val tokens = ops.StringOps(line).split((c: C) => c == ' ' || c == '\t')
          var afterTrace = F
          for (token <- tokens if token.size > 0) {
            if (token == "@trace") {
              afterTrace = T
            } else if (afterTrace && !ops.ISZOps(ids).contains(token)) {
              ids = ids :+ token
            }
          }
        }
        return ids
      case _ => return ISZ()
    }
  }

  def tracesLine(posOpt: Option[Position]): Option[String] = {
    // NASA Table 4.2-2 (p. 69) and Appendix C.4 (p. 238) require traceability
    // metadata. These are authored outbound links; reverse coverage remains an
    // explicit adjacent-audit item rather than an inferred renderer claim.
    val ids = traceIds(posOpt)
    if (ids.isEmpty) return None()
    return Some(st"- Trace IDs: ${(for (id <- ids) yield quote(id), ", ")}".render)
  }

  // GUMBO feature reference / AST.Exp.Ident ==> `identifier`
  // GUMBO feature chain / AST.Exp.Select      ==> `receiver.member`
  // Exact, consistent names follow FAA §2.8.1 (p. 47) and NASA Appendices C.2
  // and C.4 (pp. 236, 238).
  @pure def referencePath(exp: AST.Exp): SnlResult = {
    exp match {
      case ident: AST.Exp.Ident => return success(ident.id.value)
      case select: AST.Exp.Select =>
        if (select.targs.nonEmpty) {
          return failure(st"a typed selection is not a plain reference at ${positionText(select.posOpt)}".render)
        }
        select.receiverOpt match {
          // GclResolver injects this exact leading receiver for component
          // ports. It is not part of the authored GUMBO reference.
          case Some(ident: AST.Exp.Ident) if ident.id.value == "api" && ident.resOpt.isEmpty && ident.typedOpt.isEmpty =>
            return success(select.id.value)
          // NASA SP-2016-6105 Rev. 2 Appendix C.4 (p. 237) rejects
          // indefinite references such as "this". The resolved node carries no
          // owner/type label here, so fail closed instead of inventing one.
          case Some(_: AST.Exp.This) =>
            return failure(st"unresolved 'this' receiver cannot be named unambiguously at ${positionText(select.posOpt)}".render)
          case Some(receiver) =>
            val rr = referencePath(receiver)
            if (!rr.ok) return rr
            return success(st"${rr.text}.${select.id.value}".render)
          case _ => return success(select.id.value)
        }
      case _ => return failure(st"expected a resolved reference at ${positionText(exp.posOpt)}; received ${exp.prettyST.render}".render)
    }
  }

  // GUMBO literal / resolved Slang literal ==> an unambiguous English value.
  @pure def renderLiteral(exp: AST.Exp): SnlResult = {
    exp match {
      case lit: AST.Exp.LitB => return success(if (lit.value) "true" else "false")
      case lit: AST.Exp.LitC => return success(st"character ${lit.prettyST.render}".render)
      case lit: AST.Exp.LitZ => return success(lit.value.string)
      case lit: AST.Exp.LitF32 => return success(st"${lit.value} [F32]".render)
      case lit: AST.Exp.LitF64 => return success(st"${lit.value} [F64]".render)
      case lit: AST.Exp.LitR => return success(st"${lit.value} [R]".render)
      case lit: AST.Exp.LitString => return success(st"string ${lit.prettyST.render}".render)
      case si: AST.Exp.StringInterpolate =>
        if (si.args.nonEmpty || si.lits.size != 1) {
          return failure(st"unsupported interpolated literal at ${positionText(si.posOpt)}".render)
        }
        val value = si.lits(0).value
        val kind: String = si.prefix match {
          case string"s8" => "S8"
          case string"s16" => "S16"
          case string"s32" => "S32"
          case string"s64" => "S64"
          case string"u8" => "U8"
          case string"u16" => "U16"
          case string"u32" => "U32"
          case string"u64" => "U64"
          case string"z8" => "Z8"
          case string"z16" => "Z16"
          case string"z32" => "Z32"
          case string"z64" => "Z64"
          case string"n" => "N"
          case string"n8" => "N8"
          case string"n16" => "N16"
          case string"n32" => "N32"
          case string"n64" => "N64"
          case x =>
            if (ops.StringOps(x).startsWith("u") && x.size > 1) {
              val width = ops.StringOps(x).substring(1, x.size)
              Z(width) match {
                case Some(bits) if bits >= 1 && bits <= 64 =>
                  return success(st"$value [U$width]".render)
                case _ =>
              }
            }
            return failure(st"unsupported literal interpolator '$x' at ${positionText(si.posOpt)}".render)
        }
        return success(st"$value [$kind]".render)
      case _ => return failure(st"not a supported resolved literal at ${positionText(exp.posOpt)}".render)
    }
  }

  @pure def renderArguments(args: ISZ[AST.Exp]): SnlResult = {
    var rendered = ISZ[String]()
    for (arg <- args) {
      val r = renderValue(arg)
      if (!r.ok) return r
      rendered = rendered :+ r.text
    }
    return success(st"${(rendered, ", ")}".render)
  }

  @pure def renderValue(exp: AST.Exp): SnlResult = {
    return if (isBoolean(exp) || isResolvedBooleanValue(exp) ||
      isPredicateValueShape(exp)) renderExp(exp) else renderTerm(exp)
  }

  @pure def renderPortOperation(invoke: AST.Exp.Invoke): SnlResult = {
    var args = ISZ[String]()
    for (arg <- invoke.args) {
      val r = renderValue(arg)
      if (!r.ok) return r
      args = args :+ r.text
    }
    invoke.ident.id.value match {
      case string"uif__HasEvent" if args.size == 1 =>
        return success(st"an event is present on ${args(0)}".render)
      case string"uif__MaySend" if args.size == 1 =>
        return success(st"sending on ${args(0)} is permitted but not required".render)
      case string"uif__MustSend" if args.size == 1 =>
        return success(st"an event must be sent on ${args(0)}".render)
      case string"uif__MustSendWithExpectedValue" if args.size == 2 =>
        return success(st"the value ${args(1)} must be sent on ${args(0)}".render)
      case string"uif__NoSend" if args.size == 1 =>
        return success(st"no event may be sent on ${args(0)}".render)
      case x => return failure(st"invalid resolved port operation '$x' arity at ${positionText(invoke.posOpt)}".render)
    }
  }

  /** Render a port predicate as an action complement after the contract owner
    * and its single normative "shall". NASA §4.2.1.2.3 (p. 68) and Appendix
    * C.2 (pp. 235–236) call for an active responsible product plus one action;
    * Appendix C.3 (p. 236) favors positive wording. This avoids constructions
    * such as "shall ensure ... must" without changing the resolved operation.
    */
  @pure def renderPortOutcome(invoke: AST.Exp.Invoke): SnlResult = {
    var args = ISZ[String]()
    for (arg <- invoke.args) {
      val r = renderValue(arg)
      if (!r.ok) return r
      args = args :+ r.text
    }
    invoke.ident.id.value match {
      case string"uif__HasEvent" if args.size == 1 => return success(st"accept an event on ${args(0)}".render)
      case string"uif__MaySend" if args.size == 1 => return success(st"permit, but not require, an event on ${args(0)}".render)
      case string"uif__MustSend" if args.size == 1 => return success(st"send an event on ${args(0)}".render)
      case string"uif__MustSendWithExpectedValue" if args.size == 2 => return success(st"send ${args(1)} on ${args(0)}".render)
      case string"uif__NoSend" if args.size == 1 => return success(st"send no event on ${args(0)}".render)
      case x => return failure(st"invalid resolved port operation '$x' arity at ${positionText(invoke.posOpt)}".render)
    }
  }

  // The GCL builder uses unresolved, receiver-less `uif__*` invocations as an
  // internal staging form before GclResolver rewrites valid port operations.
  // Authored functions with the same text have method resolution metadata and
  // must remain ordinary invocations.
  @strictpure def isSyntheticPortOperation(invoke: AST.Exp.Invoke): B = {
    return invoke.receiverOpt.isEmpty && invoke.ident.resOpt.isEmpty && invoke.typedOpt.isEmpty &&
      ops.ISZOps(ISZ("uif__HasEvent", "uif__MaySend", "uif__MustSend", "uif__MustSendWithExpectedValue", "uif__NoSend")).contains(invoke.ident.id.value)
  }

  // GclResolver lowers HasEvent/MustSend/NoSend to Option.nonEmpty/isEmpty and
  // expected-value sends to Option.get. The one-argument HasEvent and MustSend
  // spellings become indistinguishable in the resolved AST, so this rule states
  // the exact retained Option semantics without inventing the lost modality.
  @pure def resolvedPortOptionMember(select: AST.Exp.Select): Option[(String, String)] = {
    select.resOpt match {
      case Some(method: AST.ResolvedInfo.Method) if method.owner == ISZ("org", "sireum", "Option") =>
        select.receiverOpt match {
          case Some(port: AST.Exp.Select) =>
            port.receiverOpt match {
              case Some(api: AST.Exp.Ident) if api.id.value == "api" && api.resOpt.isEmpty && api.typedOpt.isEmpty =>
                return Some((port.id.value, select.id.value))
              case _ =>
            }
          case _ =>
        }
      case _ =>
    }
    return None()
  }

  @pure def renderTypeArguments(args: ISZ[AST.Type]): SnlResult = {
    var rendered = ISZ[String]()
    for (arg <- args) {
      val r = renderType(arg)
      if (!r.ok) return r
      rendered = rendered :+ r.text
    }
    return success(st"${(rendered, ", ")}".render)
  }

  // Quantifier bodies are represented as a one-expression Slang function.
  // Reject any future statement-bodied form until it receives its own rule.
  @pure def renderQuantifier(quant: AST.Exp.QuantRange): SnlResult = {
    if (quant.fun.params.size != 1 || quant.fun.params(0).idOpt.isEmpty) {
      return failure(st"range quantifier must have exactly one named variable at ${positionText(quant.posOpt)}".render)
    }
    val body: SnlResult = quant.fun.exp match {
      case statement: AST.Stmt.Expr => renderExp(statement.exp)
      case _ => failure(st"statement-bodied range quantifier is unsupported at ${positionText(quant.fun.posOpt)}".render)
    }
    if (!body.ok) return body
    val lo = renderTerm(quant.lo)
    if (!lo.ok) return lo
    val hi = renderTerm(quant.hi)
    if (!hi.ok) return hi
    val kind = if (quant.isForall) "For every" else "There exists"
    val bound = if (quant.hiExact) "through" else "up to but not including"
    val variable = quote(quant.fun.params(0).idOpt.get.value)
    return success(st"$kind $variable from ${lo.text} $bound ${hi.text}:$NL$NL${body.text}".render)
  }

  // The pinned builder lowers collection#(index) to an invocation whose target
  // resolves as a variable with a nominal collection type. It may also insert
  // an opaque, array-owned coercion method around the index. Require both pieces
  // of resolution provenance before naming this operation or unwrapping it.
  @pure def isResolvedIndexing(invoke: AST.Exp.Invoke): B = {
    if (invoke.args.size != 1 || invoke.ident.typedOpt.isEmpty) return F
    invoke.ident.typedOpt.get match {
      case _: AST.Typed.Name =>
      case _ => return F
    }
    invoke.attr.resOpt match {
      case Some(method: AST.ResolvedInfo.Method) if method.mode == AST.MethodMode.Select && method.owner == ISZ("org", "sireum") && method.id == "IS" => return T
      case _ => return F
    }
  }

  @pure def renderIndexArgument(invoke: AST.Exp.Invoke): SnlResult = {
    val arg = invoke.args(0)
    (invoke.ident.typedOpt.get, arg) match {
      case (collectionType: AST.Typed.Name, conversion: AST.Exp.Invoke) if conversion.receiverOpt.isEmpty && conversion.args.size == 1 =>
        conversion.ident.resOpt match {
          case Some(method: AST.ResolvedInfo.Method) if collectionType.ids == ISZ("org", "sireum", "IS") && collectionType.args.size == 2 =>
            collectionType.args(0) match {
              case indexType: AST.Typed.Name if method.owner :+ "I" == indexType.ids && conversion.typedOpt == Some(indexType) =>
                return renderValue(conversion.args(0))
              case _ =>
            }
          case _ =>
        }
      case _ =>
    }
    return renderValue(arg)
  }

  @pure def renderIndexing(invoke: AST.Exp.Invoke): SnlResult = {
    val index = renderIndexArgument(invoke)
    if (!index.ok) return index
    val collection: SnlResult = invoke.receiverOpt match {
      case Some(api: AST.Exp.Ident) if api.id.value == "api" && api.resOpt.isEmpty && api.typedOpt.isEmpty =>
        success(quote(invoke.ident.id.value))
      case Some(receiver) if invoke.ident.id.value == "apply" =>
        renderTerm(receiver)
      case Some(receiver) =>
        val base = renderTerm(receiver)
        if (!base.ok) return base
        success(st"the member ${quote(invoke.ident.id.value)} of ${base.text}".render)
      case _ => success(quote(invoke.ident.id.value))
    }
    return success(st"the element at index ${index.text} of ${collection.text}".render)
  }

  // GUMBO value expression / resolved Slang term ==> a noun phrase.
  @pure def renderTerm(exp: AST.Exp): SnlResult = {
    exp match {
      case _: AST.Exp.Ident =>
        val r = referencePath(exp)
        if (!r.ok) return r
        return success(quote(r.text))
      case _: AST.Exp.Select =>
        val select = exp.asInstanceOf[AST.Exp.Select]
        if (select.targs.nonEmpty) {
          if (select.id.value != "asInstanceOf" || select.receiverOpt.isEmpty || select.targs.size != 1) {
            return failure(st"unsupported typed selection at ${positionText(select.posOpt)}".render)
          }
          val value = renderValue(select.receiverOpt.get)
          if (!value.ok) return value
          val target = renderType(select.targs(0))
          if (!target.ok) return target
          return success(st"${value.text} cast to ${target.text}".render)
        } else {
          resolvedPortOptionMember(select) match {
            case Some((port, string"nonEmpty")) =>
              return success(st"a value or event is present on port ${quote(port)}".render)
            case Some((port, string"isEmpty")) =>
              return success(st"no value or event is present on port ${quote(port)}".render)
            case Some((port, string"get")) =>
              return success(st"the value present on port ${quote(port)}".render)
            case Some((_, member)) =>
              return failure(st"unsupported resolved port Option member '$member' at ${positionText(select.posOpt)}".render)
            case _ =>
          }
          val r = referencePath(exp)
          if (r.ok) return success(quote(r.text))
          // Resolvers can place semantic wrappers such as Input or a method
          // result beneath a field selection. Preserve that wrapper rather
          // than flattening the selection into a misleading source-like path.
          select.receiverOpt match {
            case Some(receiver) =>
              val base = renderTerm(receiver)
              if (!base.ok) return base
              return success(st"the member ${quote(select.id.value)} of ${base.text}".render)
            case _ => return r
          }
        }
      case _: AST.Exp.LitB => return renderLiteral(exp)
      case _: AST.Exp.LitC => return renderLiteral(exp)
      case _: AST.Exp.LitZ => return renderLiteral(exp)
      case _: AST.Exp.LitF32 => return renderLiteral(exp)
      case _: AST.Exp.LitF64 => return renderLiteral(exp)
      case _: AST.Exp.LitR => return renderLiteral(exp)
      case _: AST.Exp.LitString => return renderLiteral(exp)
      case _: AST.Exp.StringInterpolate => return renderLiteral(exp)
      case unary: AST.Exp.Unary =>
        val operand = renderTerm(unary.exp)
        if (!operand.ok) return operand
        unary.op match {
          case AST.Exp.UnaryOp.Plus => return success(st"the unary-plus value of ${operand.text}".render)
          case AST.Exp.UnaryOp.Minus => return success(st"the arithmetic negation of ${operand.text}".render)
          case AST.Exp.UnaryOp.Complement => return success(st"the bitwise complement of ${operand.text}".render)
          case AST.Exp.UnaryOp.Not => return success(st"the negation of ${operand.text}".render)
        }
      case binary: AST.Exp.Binary =>
        // Resolved AADL Boolean wrappers do not always carry Slang's primitive
        // Boolean marker.  The operator still proves that this nested value is
        // a predicate, so render it through the predicate rules before the
        // arithmetic-only term fallback below.
        if (isPredicateValueShape(binary)) return renderExp(binary)
        val left = renderTerm(binary.left)
        if (!left.ok) return left
        val right = renderTerm(binary.right)
        if (!right.ok) return right
        val noun: String = binary.op match {
          case string"+" => "sum"
          case string"-" => "difference"
          case string"*" => "product"
          case string"/" => "quotient"
          case string"%" => "remainder"
          case x => return failure(st"operator '$x' is not a supported value expression at ${positionText(binary.posOpt)}".render)
        }
        return success(st"the $noun of ${left.text} and ${right.text}".render)
      case invoke: AST.Exp.Invoke =>
        if (isResolvedIndexing(invoke)) return renderIndexing(invoke)
        if (invoke.ident.id.value == "RangeExpression") {
          if (invoke.args.size != 2) return failure(st"resolved range must have two bounds at ${positionText(invoke.posOpt)}".render)
          val lo = renderValue(invoke.args(0))
          if (!lo.ok) return lo
          val hi = renderValue(invoke.args(1))
          if (!hi.ok) return hi
          return success(st"the inclusive range from ${lo.text} through ${hi.text}".render)
        }
        if (isSyntheticPortOperation(invoke)) {
          return renderPortOperation(invoke)
        }
        val args = renderArguments(invoke.args)
        if (!args.ok) return args
        val typeArgs = renderTypeArguments(invoke.targs)
        if (!typeArgs.ok) return typeArgs
        val callee: String = invoke.receiverOpt match {
          case Some(receiver) =>
            val reference = referencePath(receiver)
            if (reference.ok) {
              quote(st"${reference.text}.${invoke.ident.id.value}".render)
            } else {
              val rr = renderTerm(receiver)
              if (!rr.ok) return rr
              st"method ${quote(invoke.ident.id.value)} on ${rr.text}".render
            }
          case _ => quote(invoke.ident.id.value)
        }
        val instantiation: String = if (invoke.targs.isEmpty) "" else st" instantiated with (${typeArgs.text})".render
        val arguments: String = if (invoke.args.isEmpty) "" else st" for (${args.text})".render
        return success(st"the result of $callee$instantiation$arguments".render)
      case in: AST.Exp.Input =>
        val r = renderTerm(in.exp)
        if (!r.ok) return r
        return success(st"the value of ${r.text} on entry".render)
      case old: AST.Exp.Old =>
        val r = renderTerm(old.exp)
        if (!r.ok) return r
        return success(st"the previous value of ${r.text}".render)
      case thiz: AST.Exp.This =>
        return failure(st"unresolved 'this' value cannot be named unambiguously at ${positionText(thiz.posOpt)}".render)
      case result: AST.Exp.Result =>
        result.tipeOpt match {
          case Some(tipe) =>
            val rendered = renderType(tipe)
            if (!rendered.ok) return rendered
            return success(st"the function result of type ${rendered.text}".render)
          case _ => return success("the function result")
        }
      case conditional: AST.Exp.If =>
        val condition = renderExp(conditional.cond)
        if (!condition.ok) return condition
        val whenTrue = renderValue(conditional.thenExp)
        if (!whenTrue.ok) return whenTrue
        val whenFalse = renderValue(conditional.elseExp)
        if (!whenFalse.ok) return whenFalse
        return success(st"the value selected as follows:$NL$NL**If:**$NL$NL${condition.text}$NL$NL**Use:**$NL$NL${whenTrue.text}$NL$NL**Otherwise use:**$NL$NL${whenFalse.text}".render)
      case _ => return failure(st"unsupported resolved Slang term at ${positionText(exp.posOpt)}".render)
    }
  }

  @pure def collectBoolean(exp: AST.Exp, op: String): ISZ[AST.Exp] = {
    exp match {
      case binary: AST.Exp.Binary if binary.op == op =>
        return collectBoolean(binary.left, op) ++ collectBoolean(binary.right, op)
      case _ => return ISZ(exp)
    }
  }

  /** Join already-rendered phrases as ordinary English without changing their
    * order. This is deliberately presentation-only; grouping decisions are
    * still made from the resolved AST before this helper is called. NASA
    * §4.2.1.2.3 (p. 68) and Appendix C.4 (p. 237) support one complete
    * statement with one normative "shall".
    */
  @pure def naturalJoin(items: ISZ[String], conjunction: String): String = {
    if (items.isEmpty) return ""
    if (items.size == 1) return items(0)
    var result = items(0)
    var i: Z = 1
    while (i < items.size) {
      if (i == items.size - 1) {
        val separator = if (items.size == 2) st" $conjunction ".render else st", $conjunction ".render
        result = st"$result$separator${items(i)}".render
      } else {
        result = st"$result, ${items(i)}".render
      }
      i = i + 1
    }
    return result
  }

  @pure def isReference(exp: AST.Exp): B = {
    exp match {
      case _: AST.Exp.Ident => return T
      case select: AST.Exp.Select => return resolvedPortOptionMember(select).isEmpty
      case _ => return F
    }
  }

  @pure def sameExpression(left: AST.Exp, right: AST.Exp): B = {
    if (isReference(left) && isReference(right)) {
      val l = referencePath(left)
      val r = referencePath(right)
      if (l.ok && r.ok && l.text == r.text) return T
    }
    if (left == right) return T
    // Resolved AST occurrences carry distinct source positions. Equality of
    // their fail-closed semantic term renderings is the final conservative
    // check for repeated field selections such as x >= lo & x <= hi.
    val l = renderTerm(left)
    val r = renderTerm(right)
    return l.ok && r.ok && l.text == r.text
  }

  /** Recognize one inclusive comparison without rearranging arithmetic. */
  @pure def inclusiveBound(exp: AST.Exp): Option[InclusiveBound] = {
    exp match {
      case binary: AST.Exp.Binary =>
        binary.op match {
          case string">=" =>
            if (isLiteralNode(binary.left) && !isLiteralNode(binary.right)) {
              return Some(InclusiveBound(binary.right, binary.left, F))
            }
            return Some(InclusiveBound(binary.left, binary.right, T))
          case string"<=" =>
            if (isLiteralNode(binary.left) && !isLiteralNode(binary.right)) {
              return Some(InclusiveBound(binary.right, binary.left, T))
            }
            return Some(InclusiveBound(binary.left, binary.right, F))
          case _ =>
        }
      case _ =>
    }
    return None()
  }

  /** FAA DOT/FAA/AR-08/32 §2.4.1 (p. 23) requires ranges and §2.8.8
    * (p. 50) distinguishes bounds from numeric tolerance. NASA Appendix C.2
    * (p. 236) likewise calls for explicit tolerances. Fold only AST-proven,
    * inclusive bounds on one term; never infer a range from unrelated terms.
    */
  @pure def renderInclusiveRange(exp: AST.Exp): Option[SnlResult] = {
    exp match {
      case binary: AST.Exp.Binary if binary.op == "&" || binary.op == "&&" =>
        (inclusiveBound(binary.left), inclusiveBound(binary.right)) match {
          case (Some(a), Some(b)) if a.isLower != b.isLower && sameExpression(a.term, b.term) =>
            val lower = if (a.isLower) a.bound else b.bound
            val upper = if (a.isLower) b.bound else a.bound
            val term = renderTerm(a.term)
            if (!term.ok) return Some(term)
            val lo = renderTerm(lower)
            if (!lo.ok) return Some(lo)
            val hi = renderTerm(upper)
            if (!hi.ok) return Some(hi)
            return Some(success(st"${term.text} is between ${lo.text} and ${hi.text}, inclusive".render))
          case _ =>
        }
      case _ =>
    }
    return None()
  }

  /** Conditions describe applicability; evaluation order is semantic metadata,
    * not part of the normative English sentence.
    */
  @pure def renderCondition(exp: AST.Exp): SnlResult = {
    renderInclusiveRange(exp) match {
      case Some(r) => return r
      case _ =>
    }
    return if (isNaturalPredicate(exp)) renderNaturalPredicate(exp) else renderExp(exp)
  }

  /** Keep the action verb separate from its complement. This avoids brittle
    * string surgery when one formal clause coordinates actions such as setting
    * and retaining values. FAA DOT/FAA/AR-08/32 §2.8.2 (p. 47) puts the
    * affected value and required change after the applicability condition;
    * NASA SP-2016-6105 Rev. 2 Appendix C.2/C.4 (pp. 236–237) favors one active
    * subject/action statement.
    */
  @pure def renderAssignmentAction(binary: AST.Exp.Binary): Option[RenderedAction] = {
    if (binary.op != "==" || !isReference(binary.left)) return None()
    val target = renderTerm(binary.left)
    if (!target.ok) return Some(RenderedAction(F, target.text, ""))
    binary.right match {
      case old: AST.Exp.Old if sameExpression(binary.left, old.exp) =>
        return Some(RenderedAction(T, "retain", st"the previous value of ${target.text}".render))
      case in: AST.Exp.Input if sameExpression(binary.left, in.exp) =>
        return Some(RenderedAction(T, "preserve", st"the value of ${target.text} on entry".render))
      case _ =>
    }
    // AADL Boolean ports and record fields can retain a resolved named Boolean
    // wrapper instead of Slang's primitive-B marker.  Treat those resolved
    // values exactly like primitive Booleans here so a Boolean predicate can
    // be the assigned value without being sent through the term renderer.
    if (isResolvedBooleanValue(binary.left) || isResolvedBooleanValue(binary.right) ||
      isPredicateValueShape(binary.right)) {
      binary.right match {
        case _: AST.Exp.LitB =>
        case _ =>
          val predicate = renderCondition(binary.right)
          if (!predicate.ok) return Some(RenderedAction(F, predicate.text, ""))
          return Some(RenderedAction(T, "set", st"${target.text} to true exactly when ${predicate.text}".render))
      }
    }
    val value = renderTerm(binary.right)
    if (!value.ok) return None()
    return Some(RenderedAction(T, "set", st"${target.text} to ${value.text}".render))
  }

  @pure def renderAssignment(binary: AST.Exp.Binary): Option[SnlResult] = {
    renderAssignmentAction(binary) match {
      case Some(action) if action.ok => return Some(success(st"${action.verb} ${action.complement}".render))
      case Some(action) => return Some(failure(action.verb))
      case _ => return None()
    }
  }

  @pure def renderAssignmentGroup(exp: AST.Exp): Option[SnlResult] = {
    exp match {
      case binary: AST.Exp.Binary if binary.op == "&" || binary.op == "&&" =>
        var actions = ISZ[RenderedAction]()
        for (child <- collectBoolean(binary, binary.op)) {
          child match {
            case equality: AST.Exp.Binary =>
              renderAssignmentAction(equality) match {
                case Some(action) if action.ok => actions = actions :+ action
                case _ => return None()
              }
            case _ => return None()
          }
        }
        if (actions.isEmpty) return None()
        var sameVerb = T
        for (action <- actions if action.verb != actions(0).verb) sameVerb = F
        if (sameVerb) {
          return Some(success(st"${actions(0).verb} ${naturalJoin(for (action <- actions) yield action.complement, "and")}".render))
        }
        return Some(success(naturalJoin(for (action <- actions) yield st"${action.verb} ${action.complement}".render, "and")))
      case _ => return None()
    }
  }

  /** Recognize `(controlled == value) == predicate` as a Boolean equivalence.
    * The nested equality proves both the controlled reference and the value;
    * no direction is inferred from an arbitrary Boolean formula.
    */
  @pure def renderBooleanEquivalenceOutcome(exp: AST.Exp): Option[SnlResult] = {
    exp match {
      case outer: AST.Exp.Binary if outer.op == "==" =>
        outer.left match {
          case assignment: AST.Exp.Binary if assignment.op == "==" && isReference(assignment.left) &&
            !isBoolean(assignment.right) =>
            val target = renderTerm(assignment.left)
            if (!target.ok) return Some(target)
            val value = renderTerm(assignment.right)
            if (!value.ok) return Some(value)
            val predicate = renderCondition(outer.right)
            if (!predicate.ok) return Some(predicate)
            return Some(success(st"set ${target.text} to ${value.text} exactly when ${predicate.text}".render))
          case _ =>
        }
      case _ =>
    }
    return None()
  }

  @pure def isDirectOutcome(exp: AST.Exp): B = {
    if (renderBooleanEquivalenceOutcome(exp).nonEmpty || renderAssignmentGroup(exp).nonEmpty) return T
    exp match {
      case binary: AST.Exp.Binary => return renderAssignment(binary).nonEmpty
      case invoke: AST.Exp.Invoke => return isSyntheticPortOperation(invoke)
      case _ => return F
    }
  }

  /** Outcome rendering introduces an action only when the resolved AST proves
    * an equality with a reference on its left. Other formulas remain explicit
    * constraints, preserving their logical meaning. This active, one-"shall"
    * shape follows NASA SP-2016-6105 Rev. 2 §4.2.1.2.3 and Appendix C.2–C.4;
    * placing a case condition first follows FAA DOT/FAA/AR-08/32
    * §§2.8.1–2.8.2 (p. 47).
    */
  @pure def renderOutcome(exp: AST.Exp): SnlResult = {
    renderBooleanEquivalenceOutcome(exp) match {
      case Some(r) => return r
      case _ =>
    }
    renderAssignmentGroup(exp) match {
      case Some(r) => return r
      case _ =>
    }
    exp match {
      case binary: AST.Exp.Binary =>
        renderAssignment(binary) match {
          case Some(r) => return r
          case _ =>
        }
      case invoke: AST.Exp.Invoke if isSyntheticPortOperation(invoke) => return renderPortOutcome(invoke)
      case _ =>
    }
    val predicate = renderCondition(exp)
    if (!predicate.ok) return predicate
    // "Maintain" implies temporal persistence that an arbitrary Boolean
    // postcondition does not prove. Use a neutral result constraint instead.
    return success(st"produce a result for which ${predicate.text}".render)
  }

  @pure def containsShortCircuit(exp: AST.Exp): B = {
    exp match {
      case binary: AST.Exp.Binary =>
        return binary.op == "&&" || binary.op == "||" || binary.op == "___>:" ||
          containsShortCircuit(binary.left) || containsShortCircuit(binary.right)
      case unary: AST.Exp.Unary => return containsShortCircuit(unary.exp)
      case conditional: AST.Exp.If =>
        return containsShortCircuit(conditional.cond) || containsShortCircuit(conditional.thenExp) ||
          containsShortCircuit(conditional.elseExp)
      case _ => return F
    }
  }

  @pure def semanticMetadata(exp: AST.Exp): ISZ[String] = {
    var result = ISZ[String]()
    semanticStatus(exp) match {
      case Some(status) => result = result :+ st"- Semantic status: $status".render
      case _ =>
    }
    if (containsShortCircuit(exp)) {
      result = result :+ "- Semantic note: Boolean operands use left-to-right short-circuit evaluation."
    }
    return result
  }

  /** Report only statuses proven by the local resolved AST. In particular,
    * Boolean self-comparisons are safe to classify; this deliberately avoids
    * extending the rule to floating-point values, for which NaN would make a
    * superficially identical equality non-tautological.
    */
  @pure def semanticStatus(exp: AST.Exp): Option[String] = {
    exp match {
      case lit: AST.Exp.LitB => return Some(if (lit.value) "tautology" else "contradiction")
      case binary: AST.Exp.Binary =>
        (binary.left, binary.right) match {
          case (left: AST.Exp.LitB, right: AST.Exp.LitB) =>
            val value: Option[B] = binary.op match {
              case string"&" => Some(left.value && right.value)
              case string"&&" => Some(left.value && right.value)
              case string"|" => Some(left.value || right.value)
              case string"||" => Some(left.value || right.value)
              case string"|^" => Some(left.value != right.value)
              case string"==" => Some(left.value == right.value)
              case string"!=" => Some(left.value != right.value)
              case string"__>:" => Some(!left.value || right.value)
              case string"___>:" => Some(!left.value || right.value)
              case _ => None()
            }
            value match {
              case Some(result) => return Some(if (result) "tautology" else "contradiction")
              case _ =>
            }
          case _ =>
        }
        if (isResolvedBooleanValue(binary.left) && sameExpression(binary.left, binary.right)) {
          binary.op match {
            case string"==" => return Some("tautology")
            case string"!=" => return Some("contradiction")
            case _ =>
          }
        }
      case _ =>
    }
    return None()
  }

  /** AADL Boolean features can retain a named Boolean wrapper rather than
    * Slang's primitive-B marker. Follow only resolved type arguments/names;
    * do not guess from an identifier's spelling.
    */
  @pure def typedContainsBoolean(tipe: AST.Typed): B = {
    tipe match {
      case name: AST.Typed.Name =>
        for (id <- name.ids if id == "Boolean" || id == "B") return T
        for (arg <- name.args if typedContainsBoolean(arg)) return T
      case _ =>
    }
    return F
  }

  @pure def isResolvedBooleanValue(exp: AST.Exp): B = {
    if (isBoolean(exp)) return T
    exp.typedOpt match {
      case Some(tipe) => return typedContainsBoolean(tipe)
      case _ => return F
    }
  }

  /** NASA SP-2016-6105 Rev. 2 Appendix C.4 asks whether each requirement
    * contains one thought. Preserve the source ID and coordinated action, but
    * surface multiple AST-proven assignments for engineering review instead
    * of silently splitting or renumbering the formal clause.
    */
  @pure def qualityMetadata(exp: AST.Exp): ISZ[String] = {
    renderAssignmentGroup(exp) match {
      case Some(r) if r.ok =>
        exp match {
          case binary: AST.Exp.Binary if binary.op == "&" || binary.op == "&&" =>
            val count = collectBoolean(binary, binary.op).size
            if (count > 1) {
              return ISZ(st"- Quality note: The source clause coordinates $count assignments under one formal identifier; review whether it expresses one verifiable thought.".render)
            }
          case _ =>
        }
      case _ =>
    }
    return ISZ()
  }

  @pure def appendUnique(lines: ISZ[String], additions: ISZ[String]): ISZ[String] = {
    var result = lines
    for (line <- additions if !ops.ISZOps(result).contains(line)) {
      result = result :+ line
    }
    return result
  }

  @pure def caseSemanticMetadata(statement: GclCaseStatement): ISZ[String] = {
    statement.assumes match {
      case Some(guard) if semanticStatus(guard) == Some("contradiction") =>
        var unreachable = ISZ("- Semantic status: unreachable")
        if (containsShortCircuit(guard) || containsShortCircuit(statement.guarantees)) {
          unreachable = unreachable :+ "- Semantic note: Boolean operands use left-to-right short-circuit evaluation."
        }
        return appendUnique(unreachable, qualityMetadata(statement.guarantees))
      case _ =>
    }
    var result = appendUnique(semanticMetadata(statement.guarantees), qualityMetadata(statement.guarantees))
    val guardHasShortCircuit: B = statement.assumes match {
      case Some(guard) => containsShortCircuit(guard)
      case _ => F
    }
    if (guardHasShortCircuit && !containsShortCircuit(statement.guarantees)) {
      result = result :+ "- Semantic note: Boolean operands use left-to-right short-circuit evaluation."
    }
    return result
  }

  @pure def metadataText(lines: ISZ[String]): Option[String] = {
    if (lines.isEmpty) return None()
    return Some(st"${(lines, NL)}".render)
  }

  @pure def isBooleanGroup(exp: AST.Exp): B = {
    exp match {
      case binary: AST.Exp.Binary =>
        return binary.op == "&" || binary.op == "&&" ||
          binary.op == "|" || binary.op == "||"
      case _ => return F
    }
  }

  @strictpure def isBooleanLiteral(exp: AST.Exp): B = exp match {
    case _: AST.Exp.LitB => T
    case _ => F
  }

  /** collectBoolean has already flattened every child using op. Any Boolean
    * group that remains below it therefore uses a different operator and needs
    * the structured rendering to keep that grouping visible.
    */
  @pure def isNaturalBooleanGroup(exp: AST.Exp, op: String): B = {
    for (child <- collectBoolean(exp, op)) {
      if (isBooleanGroup(child) || !isNaturalPredicate(child)) return F
    }
    return T
  }

  /** True when a predicate can be stated inline without hiding Boolean
    * grouping. More complicated shapes keep the explicit structured fallback.
    */
  @pure def isNaturalPredicate(exp: AST.Exp): B = {
    exp match {
      case binary: AST.Exp.Binary =>
        binary.op match {
          case string"&" => return isNaturalBooleanGroup(binary, "&")
          case string"&&" => return isNaturalBooleanGroup(binary, "&&")
          case string"|" => return isNaturalBooleanGroup(binary, "|")
          case string"||" => return isNaturalBooleanGroup(binary, "||")
          case string"__>:" => return isNaturalPredicate(binary.left) && isNaturalPredicate(binary.right)
          case string"___>:" => return isNaturalPredicate(binary.left) && isNaturalPredicate(binary.right)
          case string"|^" => return isCompactBooleanOperand(binary.left) && isCompactBooleanOperand(binary.right)
          case string"==" =>
            if (isBooleanLiteral(binary.left) || isBooleanLiteral(binary.right)) return T
            if ((isBoolean(binary.left) && isBoolean(binary.right)) ||
              isResolvedPredicateTerm(binary.left) || isResolvedPredicateTerm(binary.right)) {
              return isCompactBooleanOperand(binary.left) && isCompactBooleanOperand(binary.right)
            }
            return T
          case string"!=" =>
            if (isBooleanLiteral(binary.left) || isBooleanLiteral(binary.right)) return T
            if ((isBoolean(binary.left) && isBoolean(binary.right)) ||
              isResolvedPredicateTerm(binary.left) || isResolvedPredicateTerm(binary.right)) {
              return isCompactBooleanOperand(binary.left) && isCompactBooleanOperand(binary.right)
            }
            return T
          case string"===" => return T
          case string"=!=" => return T
          case string"<" => return T
          case string"<=" => return T
          case string">" => return T
          case string">=" => return T
          case _ => return F
        }
      case unary: AST.Exp.Unary if unary.op == AST.Exp.UnaryOp.Not => return isNaturalPredicate(unary.exp)
      case _: AST.Exp.LitB => return T
      case _: AST.Exp.Ident => return T
      case _: AST.Exp.Select => return T
      case invoke: AST.Exp.Invoke => return isSyntheticPortOperation(invoke) || invoke.args.isEmpty
      case _: AST.Exp.Input => return T
      case _: AST.Exp.Old => return T
      case _: AST.Exp.Result => return T
      case _: AST.Exp.This => return T
      case _ => return F
    }
  }

  /** Render the common predicate shapes as one grammatical phrase. Callers
    * must first establish isNaturalPredicate(exp); the final failure keeps that
    * contract executable if a future edit lets an unsafe shape through.
    */
  @pure def renderNaturalPredicate(exp: AST.Exp): SnlResult = {
    exp match {
      case binary: AST.Exp.Binary if binary.op == "&" || binary.op == "&&" || binary.op == "|" || binary.op == "||" =>
        val children = collectBoolean(binary, binary.op)
        var rendered = ISZ[String]()
        for (child <- children) {
          val r = renderNaturalPredicate(child)
          if (!r.ok) return r
          rendered = rendered :+ r.text
        }
        val conjunction = if (binary.op == "&" || binary.op == "&&") "and" else "or"
        val phrase = naturalJoin(rendered, conjunction)
        return success(phrase)
      case binary: AST.Exp.Binary if binary.op == "__>:" || binary.op == "___>:" =>
        val condition = renderNaturalPredicate(binary.left)
        if (!condition.ok) return condition
        val result = renderNaturalPredicate(binary.right)
        if (!result.ok) return result
        return success(st"if ${condition.text}, then ${result.text}".render)
      case unary: AST.Exp.Unary if unary.op == AST.Exp.UnaryOp.Not =>
        unary.exp match {
          case _: AST.Exp.Ident => return renderExp(unary)
          case select: AST.Exp.Select if !isResolvedPredicateTerm(select) =>
            return renderExp(unary)
          case lit: AST.Exp.LitB => return success(if (lit.value) "false" else "true")
          case _ =>
            val operand = renderNaturalPredicate(unary.exp)
            if (!operand.ok) return operand
            return success(st"it is not the case that ${operand.text}".render)
        }
      case _ =>
        if (!isNaturalPredicate(exp)) {
          return failure(st"predicate is not safe for inline prose at ${positionText(exp.posOpt)}".render)
        }
        return renderExp(exp)
    }
  }

  /** Prefer a sentence-ready predicate for common formulas and retain the
    * existing explicit grouping for shapes that cannot be stated inline safely.
    */
  @pure def renderClausePredicate(exp: AST.Exp): SnlResult = {
    return if (isNaturalPredicate(exp)) renderNaturalPredicate(exp) else renderExp(exp)
  }

  @pure def renderBooleanGroup(exp: AST.Exp, op: String, heading: String): SnlResult = {
    var items = ISZ[String]()
    for (child <- collectBoolean(exp, op)) {
      val r = renderExp(child)
      if (!r.ok) return r
      val continuation = st"$NL    ".render
      items = items :+ ops.StringOps(r.text).replaceAllLiterally(NL, continuation)
    }
    val separator = st"$NL  - ".render
    return success(st"$heading:$NL$NL  - ${(items, separator)}".render)
  }

  @strictpure def isLiteralNode(exp: AST.Exp): B = {
    exp match {
      case _: AST.Exp.LitB => return T
      case _: AST.Exp.LitC => return T
      case _: AST.Exp.LitZ => return T
      case _: AST.Exp.LitF32 => return T
      case _: AST.Exp.LitF64 => return T
      case _: AST.Exp.LitR => return T
      case _: AST.Exp.LitString => return T
      case _: AST.Exp.StringInterpolate => return T
      case _ => return F
    }
  }

  @pure def renderRelation(binary: AST.Exp.Binary, phrase: String): SnlResult = {
    val left = renderTerm(binary.left)
    if (!left.ok) return left
    val right = renderTerm(binary.right)
    if (!right.ok) return right
    // Prefer the named value as the grammatical subject when a literal was
    // authored on the left. This is logically identical and follows the FAA
    // examples' "variable is within a bound" reading order (FAA §§2.8.1–2.8.2,
    // p. 47).
    if (isLiteralNode(binary.left) && !isLiteralNode(binary.right)) {
      val reversed: String = phrase match {
        case string"is below" => "exceeds"
        case string"is at most" => "is at least"
        case string"exceeds" => "is below"
        case string"is at least" => "is at most"
        case _ => ""
      }
      if (reversed.size > 0) return success(st"${right.text} $reversed ${left.text}".render)
    }
    return success(st"${left.text} $phrase ${right.text}".render)
  }

  @strictpure def isBoolean(exp: AST.Exp): B = exp.typedOpt == AST.Typed.bOpt

  /** Some resolved AADL Boolean assignment values retain wrapper typing on
    * both sides, while their expression node still proves a Boolean result.
    * Recognize only syntactic predicate-producing forms; the typechecked
    * equality containing the value then proves that its target is compatible.
    */
  @pure def isPredicateValueShape(exp: AST.Exp): B = {
    exp match {
      case binary: AST.Exp.Binary =>
        binary.op match {
          case string"&" => return T
          case string"&&" => return T
          case string"|" => return T
          case string"||" => return T
          case string"|^" => return T
          case string"==" => return T
          case string"!=" => return T
          case string"===" => return T
          case string"=!=" => return T
          case string"<" => return T
          case string"<=" => return T
          case string">" => return T
          case string">=" => return T
          case string"__>:" => return T
          case string"___>:" => return T
          case _ => return F
        }
      case unary: AST.Exp.Unary => return unary.op == AST.Exp.UnaryOp.Not
      case _: AST.Exp.LitB => return T
      case _: AST.Exp.QuantRange => return T
      case _ => return F
    }
  }

  @pure def isResolvedPredicateTerm(exp: AST.Exp): B = {
    exp match {
      case select: AST.Exp.Select =>
        resolvedPortOptionMember(select) match {
          case Some((_, string"nonEmpty")) => return T
          case Some((_, string"isEmpty")) => return T
          case _ => return F
        }
      case invoke: AST.Exp.Invoke if isSyntheticPortOperation(invoke) => return T
      case _ => return F
    }
  }

  @pure def isCompactBooleanOperand(exp: AST.Exp): B = {
    exp match {
      case _: AST.Exp.Ident => return T
      case select: AST.Exp.Select =>
        // Option.nonEmpty/isEmpty already render as complete presence
        // predicates. They cannot safely be embedded as noun phrases in a
        // compact comparison.
        resolvedPortOptionMember(select) match {
          case Some((_, _)) => return F
          case _ => return T
        }
      case _: AST.Exp.LitB => return T
      case _: AST.Exp.Input => return T
      case _: AST.Exp.Old => return T
      case _: AST.Exp.Result => return T
      case _: AST.Exp.This => return T
      case _ => return F
    }
  }

  @pure def renderTruthComparison(binary: AST.Exp.Binary, same: B): SnlResult = {
    (binary.left, binary.right) match {
      case (literal: AST.Exp.LitB, other) =>
        val rendered = renderExp(other)
        if (!rendered.ok) return rendered
        val agrees = if (same) literal.value else !literal.value
        return if (agrees) rendered else success(st"it is not the case that ${rendered.text}".render)
      case (other, literal: AST.Exp.LitB) =>
        val rendered = renderExp(other)
        if (!rendered.ok) return rendered
        val agrees = if (same) literal.value else !literal.value
        return if (agrees) rendered else success(st"it is not the case that ${rendered.text}".render)
      case _ =>
    }
    if (isCompactBooleanOperand(binary.left) && isCompactBooleanOperand(binary.right)) {
      val leftTerm = renderTerm(binary.left)
      if (!leftTerm.ok) return leftTerm
      val rightTerm = renderTerm(binary.right)
      if (!rightTerm.ok) return rightTerm
      // NASA Appendix C.4 (p. 237) calls for explicit, unambiguous wording.
      if (same) return success(st"${leftTerm.text} is true exactly when ${rightTerm.text} is true".render)
      return success(st"exactly one of ${leftTerm.text} and ${rightTerm.text} is true".render)
    }
    val left = renderExp(binary.left)
    if (!left.ok) return left
    val right = renderExp(binary.right)
    if (!right.ok) return right
    val relation = if (same) "The first condition holds exactly when the second condition holds" else
      "Exactly one of the following conditions holds"
    return success(st"$relation:$NL$NL**First condition:**$NL$NL${left.text}$NL$NL**Second condition:**$NL$NL${right.text}".render)
  }

  @pure def renderImplication(binary: AST.Exp.Binary, shortCircuit: B): SnlResult = {
    val left = renderExp(binary.left)
    if (!left.ok) return left
    val right = renderExp(binary.right)
    if (!right.ok) return right
    return success(st"**If:**$NL$NL${left.text}$NL$NL**Then:**$NL$NL${right.text}".render)
  }

  // GUMBO/Sireum expression pattern ==> canonical structured English.
  @pure def renderExp(exp: AST.Exp): SnlResult = {
    exp match {
      case binary: AST.Exp.Binary =>
        binary.op match {
          case string"&" => return renderBooleanGroup(binary, "&", "All of the following conditions hold")
          case string"&&" => return renderBooleanGroup(binary, "&&", "All of the following conditions hold")
          case string"|" => return renderBooleanGroup(binary, "|", "At least one of the following conditions holds")
          case string"||" => return renderBooleanGroup(binary, "||", "At least one of the following conditions holds")
          case string"|^" => return renderTruthComparison(binary, F)
          case string"==" =>
            if ((isBoolean(binary.left) && isBoolean(binary.right)) ||
              isResolvedPredicateTerm(binary.left) || isResolvedPredicateTerm(binary.right)) {
              return renderTruthComparison(binary, T)
            }
            return renderRelation(binary, "is")
          case string"!=" =>
            if ((isBoolean(binary.left) && isBoolean(binary.right)) ||
              isResolvedPredicateTerm(binary.left) || isResolvedPredicateTerm(binary.right)) {
              return renderTruthComparison(binary, F)
            }
            return renderRelation(binary, "is not")
          case string"===" => return renderRelation(binary, "is identical to")
          case string"=!=" => return renderRelation(binary, "is not identical to")
          case string"<" => return renderRelation(binary, "is below")
          case string"<=" => return renderRelation(binary, "is at most")
          case string">" => return renderRelation(binary, "exceeds")
          case string">=" => return renderRelation(binary, "is at least")
          case string"__>:" => return renderImplication(binary, F)
          case string"___>:" => return renderImplication(binary, T)
          case string"+" => return renderTerm(binary)
          case string"-" => return renderTerm(binary)
          case string"*" => return renderTerm(binary)
          case string"/" => return renderTerm(binary)
          case string"%" => return renderTerm(binary)
          case x => return failure(st"unsupported resolved binary operator '$x' at ${positionText(binary.posOpt)}".render)
        }
      case unary: AST.Exp.Unary if unary.op == AST.Exp.UnaryOp.Not =>
        unary.exp match {
          case _: AST.Exp.Ident =>
            val term = renderTerm(unary.exp)
            if (!term.ok) return term
            return success(st"${term.text} is false".render)
          case select: AST.Exp.Select if !isResolvedPredicateTerm(select) =>
            val term = renderTerm(select)
            if (!term.ok) return term
            return success(st"${term.text} is false".render)
          case _ =>
        }
        val r = renderExp(unary.exp)
        if (!r.ok) return r
        return success(st"It is not the case that:$NL$NL${r.text}".render)
      case conditional: AST.Exp.If =>
        val c = renderExp(conditional.cond)
        if (!c.ok) return c
        val t = renderExp(conditional.thenExp)
        if (!t.ok) return t
        val e = renderExp(conditional.elseExp)
        if (!e.ok) return e
        return success(st"**If:**$NL$NL${c.text}$NL$NL**Then:**$NL$NL${t.text}$NL$NL**Otherwise:**$NL$NL${e.text}".render)
      case lit: AST.Exp.LitB => return success(if (lit.value) "true" else "false")
      case _: AST.Exp.Ident =>
        val r = renderTerm(exp)
        if (!r.ok) return r
        return success(st"${r.text} is true".render)
      case _: AST.Exp.Select =>
        val select = exp.asInstanceOf[AST.Exp.Select]
        val r = renderTerm(exp)
        if (!r.ok) return r
        resolvedPortOptionMember(select) match {
          case Some((_, string"nonEmpty")) => return r
          case Some((_, string"isEmpty")) => return r
          case _ =>
        }
        return success(st"${r.text} is true".render)
      case _: AST.Exp.Invoke =>
        val invoke = exp.asInstanceOf[AST.Exp.Invoke]
        val r = renderTerm(exp)
        if (!r.ok) return r
        if (isSyntheticPortOperation(invoke)) {
          return r
        }
        return success(st"${r.text} is true".render)
      case quant: AST.Exp.QuantRange => return renderQuantifier(quant)
      case _: AST.Exp.Input =>
        val r = renderTerm(exp)
        if (!r.ok) return r
        return success(st"${r.text} is true".render)
      case _: AST.Exp.Old =>
        val r = renderTerm(exp)
        if (!r.ok) return r
        return success(st"${r.text} is true".render)
      case _: AST.Exp.Result =>
        val r = renderTerm(exp)
        if (!r.ok) return r
        return success(st"${r.text} is true".render)
      case _: AST.Exp.This =>
        val r = renderTerm(exp)
        if (!r.ok) return r
        return success(st"${r.text} is true".render)
      case _ => return failure(st"unsupported resolved Slang predicate at ${positionText(exp.posOpt)}".render)
    }
  }

  // Resolved descriptors can retain Slang structured-text margin bars and
  // source indentation. Fold that presentation residue into one prose line;
  // the descriptor remains metadata and no contract expression is reparsed.
  @pure def normalizeDescriptor(text: String): String = {
    var words = ISZ[String]()
    for (rawLine <- sourceLines(text)) {
      var line = ops.StringOps(rawLine).trim
      if (ops.StringOps(line).startsWith("|")) {
        line = ops.StringOps(ops.StringOps(line).substring(1, line.size)).trim
      }
      for (word <- ops.StringOps(line).split((c: C) => c == ' ' || c == '\t' || c == '\r') if word.size > 0) {
        words = words :+ word
      }
    }
    return st"${(words, " ")}".render
  }

  @pure def descriptionLine(descriptor: Option[String]): Option[String] = {
    descriptor match {
      // FAA DOT/FAA/AR-08/32 §2.5.7 (p. 33) and §§2.11.1–2.11.2
      // (pp. 72–73) keep rationale separate from the requirement. A GUMBO
      // descriptor is authored text, not evidence that intent or rationale has
      // been established, so label it without upgrading its authority.
      case Some(text) => return Some(st"- Authored description: ${normalizeDescriptor(text)}".render)
      case _ => return None()
    }
  }

  /** A GUMBO phase is contract-evaluation scope, not proof of an externally
    * distinguishable system mode. FAA §2.7.3 (p. 45) reserves modes for
    * externally visible discontinuities; NASA Appendix C.2/C.4 (pp. 236–237)
    * requires requirements to remain at the correct abstraction level.
    */
  @pure def phaseScope(name: String): String = {
    val label: String = name match {
      case string"COMPUTE" => "compute"
      case string"INITIALIZATION" => "initialization"
      case string"INTEGRATION" => "integration"
      case _ => halt(st"unexpected contract phase: $name")
    }
    return st"During contract evaluation for the $label phase".render
  }

  @pure def scoped(scopeOpt: Option[String], text: String): String = {
    scopeOpt match {
      case Some(scope) => return st"$scope, $text".render
      case _ => return text
    }
  }

  // At a clause boundary, spell out constant predicates as their contract
  // effect. Nested Boolean literals remain simply `true`/`false` so function
  // arguments and compound expressions retain their exact structure.
  @pure def topLevelPredicateText(exp: AST.Exp, rendered: String): String = {
    exp match {
      case lit: AST.Exp.LitB if lit.value => return "No additional constraint is imposed because the predicate is true."
      case _: AST.Exp.LitB => return "The predicate is false and therefore cannot be satisfied."
      case _ => return rendered
    }
  }

  // GUMBO functions resolve to Slang method signatures, contracts, and (when
  // present) a single return expression. Sections stay explicit because
  // requires and guarantees have different logical polarity downstream.
  @pure def renderMethodSignature(sig: AST.MethodSig): SnlResult = {
    var parts = ISZ[String]()
    if (sig.typeParams.nonEmpty) {
      var params = ISZ[String]()
      for (param <- sig.typeParams) {
        val kind: String = param.kind match {
          case AST.Typed.VarKind.Immutable => "immutable"
          case AST.Typed.VarKind.Mutable => "mutable"
          case AST.Typed.VarKind.Index => "index"
        }
        params = params :+ st"${quote(param.id.value)} ($kind)".render
      }
      parts = parts :+ st"- Type parameters: ${(params, ", ")}".render
    }
    for (param <- sig.params) {
      val tipe = renderType(param.tipe)
      if (!tipe.ok) return tipe
      parts = parts :+ st"- Input ${quote(param.id.value)} has type ${tipe.text}.".render
    }
    val returns = renderType(sig.returnType)
    if (!returns.ok) return returns
    parts = parts :+ st"- Result type: ${returns.text}.".render
    return success(st"${(parts, NL)}".render)
  }

  @pure def renderAccesses(kind: String, refs: ISZ[AST.Exp.Ref]): SnlResult = {
    if (refs.isEmpty) return success("")
    var rendered = ISZ[String]()
    for (ref <- refs) {
      val r = referencePath(ref.asExp)
      if (!r.ok) return r
      rendered = rendered :+ quote(r.text)
    }
    return success(st"- $kind: ${(rendered, ", ")}".render)
  }

  @pure def renderClaims(kind: String, claims: ISZ[AST.Exp]): SnlResult = {
    if (claims.isEmpty) return success("")
    var rendered = ISZ[String]()
    for (claim <- claims) {
      val r = renderExp(claim)
      if (!r.ok) return r
      rendered = rendered :+ listItem(r.text, "")
    }
    return success(st"**$kind:**$NL$NL${(rendered, NL)}".render)
  }

  @pure def renderMethodContract(contract: AST.MethodContract): SnlResult = {
    contract match {
      case simple: AST.MethodContract.Simple =>
        var parts = ISZ[String]()
        val reads = renderAccesses("Reads", simple.reads)
        if (!reads.ok) return reads
        if (reads.text.size > 0) parts = parts :+ reads.text
        val requires = renderClaims("Preconditions", simple.requires)
        if (!requires.ok) return requires
        if (requires.text.size > 0) parts = parts :+ requires.text
        val modifies = renderAccesses("May modify", simple.modifies)
        if (!modifies.ok) return modifies
        if (modifies.text.size > 0) parts = parts :+ modifies.text
        val ensures = renderClaims("Postconditions", simple.ensures)
        if (!ensures.ok) return ensures
        if (ensures.text.size > 0) parts = parts :+ ensures.text
        if (simple.infoFlows.nonEmpty) {
          return failure(st"resolved function information-flow contract is unsupported at ${positionText(simple.attr.posOpt)}".render)
        }
        return success(st"${(parts, st"$NL$NL".render)}".render)
      case cases: AST.MethodContract.Cases =>
        return failure(st"resolved method contract cases are outside the accepted GUMBO function grammar at ${positionText(cases.attr.posOpt)}".render)
    }
  }

  @pure def renderMethodBody(bodyOpt: Option[AST.Body], posOpt: Option[Position]): SnlResult = {
    // NASA Appendix C.1 (p. 235) separates definitions/facts from normative
    // shall-statements. Function bodies therefore use definitional "returns".
    bodyOpt match {
      case Some(AST.Body(ISZ(AST.Stmt.Return(Some(exp), _)))) =>
        val r = if (isBoolean(exp)) renderClausePredicate(exp) else renderTerm(exp)
        if (!r.ok) return r
        val text = if (isBoolean(exp)) st"The function returns true exactly when ${r.text}.".render
        else st"The function returns ${r.text}.".render
        return success(quoteLines(text))
      case Some(_) => return failure(st"resolved GUMBO function body is not a single return expression at ${positionText(posOpt)}".render)
      case _ => return success("")
    }
  }

  def renderMethod(method: GclMethod): SnlResult = {
    val signature = renderMethodSignature(method.sig)
    if (!signature.ok) return signature
    var purity = "Specification only"
    var contract = success("")
    var body = success("")
    method match {
      case _: GclSpecMethod =>
      case concrete: GclBodyMethod =>
        purity = concrete.method.purity match {
          case AST.Purity.Impure => "Impure"
          case AST.Purity.Pure => "Pure"
          case AST.Purity.Memoize => "Memoized"
          case AST.Purity.StrictPure => "Strictly pure"
          case AST.Purity.Abs => "Abstract"
        }
        contract = renderMethodContract(concrete.method.mcontract)
        if (!contract.ok) return contract
        body = renderMethodBody(concrete.method.bodyOpt, concrete.posOpt)
        if (!body.ok) return body
    }
    var semanticSections = ISZ[String]()
    if (contract.text.size > 0) semanticSections = semanticSections :+ contract.text
    if (body.text.size > 0) semanticSections = semanticSections :+ body.text
    val semanticSeparator = st"$NL$NL".render
    val semanticText: Option[String] =
      if (semanticSections.nonEmpty) Some(st"$NL${(semanticSections, semanticSeparator)}".render)
      else None()
    return success(
      st"""### Function ${quote(method.id)}
          |${tracesLine(method.posOpt)}
          |- Source: ${positionText(method.posOpt)}
          |- Function category: $purity
          |${signature.text}
          |$semanticText""".render)
  }

  def renderNamedClause(heading: String, kind: String, id: String, descriptor: Option[String],
                        exp: AST.Exp, posOpt: Option[Position], scopeOpt: Option[String]): SnlResult = {
    val r: SnlResult = kind match {
      case string"GUARANTEE" => renderOutcome(exp)
      case _ => renderCondition(exp)
    }
    if (!r.ok) return r
    val constraint = renderCondition(exp)
    if (!constraint.ok) return constraint
    val displayKind: String = kind match {
      case string"INVARIANT" => "Invariant"
      case string"ASSUMPTION" => "Assumption"
      case string"GUARANTEE" => "Guarantee"
      case _ => halt(st"unexpected named clause kind: $kind")
    }
    val prose: String = exp match {
      case _ if semanticStatus(exp) == Some("tautology") =>
        val text = scopeOpt match {
          case Some(_) => scoped(scopeOpt, "the resolved formula is always true and imposes no behavioral restriction.")
          case _ => "The resolved formula is always true and imposes no behavioral restriction."
        }
        quoteLines(text)
      case _ if semanticStatus(exp) == Some("contradiction") =>
        val text = scopeOpt match {
          case Some(_) => scoped(scopeOpt, "the resolved formula is always false and cannot be satisfied.")
          case _ => "The resolved formula is always false and cannot be satisfied."
        }
        quoteLines(text)
      case _ if isNaturalPredicate(exp) || (kind == "GUARANTEE" && isDirectOutcome(exp)) =>
        val text: String = kind match {
          case string"INVARIANT" => scoped(scopeOpt, st"Every value of $OwnerMarker shall meet the condition that ${r.text}.".render)
          case string"ASSUMPTION" => scoped(scopeOpt, st"Environmental assumption for $OwnerMarker: ${r.text}.".render)
          case string"GUARANTEE" => scoped(scopeOpt, st"$OwnerMarker shall ${r.text}.".render)
          case _ => halt(st"unexpected named clause kind: $kind")
        }
        quoteLines(text)
      case _ =>
        val lead: String = kind match {
          case string"INVARIANT" => scoped(scopeOpt, st"Every value of $OwnerMarker shall meet all of the following conditions:".render)
          case string"ASSUMPTION" => scoped(scopeOpt, st"Environmental assumptions for $OwnerMarker include all of the following conditions:".render)
          case string"GUARANTEE" => scoped(scopeOpt, st"$OwnerMarker shall produce a result for which all of the following conditions hold:".render)
          case _ => halt(st"unexpected named clause kind: $kind")
        }
        proseBlock(lead, topLevelPredicateText(exp, constraint.text))
    }
    return success(
      st"""$heading $displayKind ${quote(id)}
          |${descriptionLine(descriptor)}
          |${tracesLine(posOpt)}
          |- Source: ${positionText(posOpt)}
          |${metadataText(appendUnique(semanticMetadata(exp), qualityMetadata(exp)))}
          |
          |$prose""".render)
  }

  def renderSpecAt(heading: String, spec: GclSpec, scopeOpt: Option[String]): SnlResult = {
    spec match {
      case invariant: GclInvariant => return renderNamedClause(heading, "INVARIANT", invariant.id, invariant.descriptor, invariant.exp, invariant.posOpt, scopeOpt)
      case assume: GclAssume => return renderNamedClause(heading, "ASSUMPTION", assume.id, assume.descriptor, assume.exp, assume.posOpt, scopeOpt)
      case guarantee: GclGuarantee => return renderNamedClause(heading, "GUARANTEE", guarantee.id, guarantee.descriptor, guarantee.exp, guarantee.posOpt, scopeOpt)
    }
  }

  def renderSpecAt(heading: String, spec: GclSpec): SnlResult = renderSpecAt(heading, spec, None())

  def renderSpec(spec: GclSpec): SnlResult = {
    return renderSpecAt("####", spec)
  }

  def renderCaseAt(heading: String, statement: GclCaseStatement, eventContext: Option[String]): SnlResult = {
    val guarantee = renderOutcome(statement.guarantees)
    if (!guarantee.ok) return guarantee
    val guaranteeConstraint = renderCondition(statement.guarantees)
    if (!guaranteeConstraint.ok) return guaranteeConstraint
    val scopeLead: String = eventContext match {
      case Some(port) => st"${phaseScope("COMPUTE")}, when handling an event on $port".render
      case _ => phaseScope("COMPUTE")
    }
    val prose: String = statement.assumes match {
      case Some(guard) =>
        val condition = renderCondition(guard)
        if (!condition.ok) return condition
        (guard, statement.guarantees) match {
          case (_, _) if semanticStatus(guard) == Some("contradiction") =>
            quoteLines(st"$scopeLead, the false guard prevents the case from applying.".render)
          case (_, _) if semanticStatus(statement.guarantees) == Some("tautology") =>
            if (semanticStatus(guard) == Some("tautology")) {
              quoteLines(st"$scopeLead, $OwnerMarker has no additional obligation because the required result is always true.".render)
            } else {
              quoteLines(st"$scopeLead, if ${condition.text}, $OwnerMarker has no additional obligation because the required result is always true.".render)
            }
          case (_, _) if semanticStatus(statement.guarantees) == Some("contradiction") =>
            if (semanticStatus(guard) == Some("tautology")) {
              quoteLines(st"$scopeLead, $OwnerMarker cannot meet the obligation because the required result is always false.".render)
            } else {
              quoteLines(st"$scopeLead, if ${condition.text}, $OwnerMarker cannot meet the obligation because the required result is always false.".render)
            }
          case (_, _) if semanticStatus(guard) == Some("tautology") &&
            (isNaturalPredicate(statement.guarantees) || isDirectOutcome(statement.guarantees)) =>
            val lead = st"$scopeLead, $OwnerMarker shall".render
            quoteLines(st"$lead ${guarantee.text}.".render)
          case _ if isNaturalPredicate(guard) && (isNaturalPredicate(statement.guarantees) || isDirectOutcome(statement.guarantees)) =>
            val prefix = st"$scopeLead, if".render
            quoteLines(st"$prefix ${condition.text}, $OwnerMarker shall ${guarantee.text}.".render)
          case _ =>
            // FAA §2.8.2 (p. 47) states applicability before the affected
            // variable change. Applicability is not itself an obligation.
            val lead = st"$scopeLead, case ${quote(statement.id)} applies under all of the following conditions:".render
            st"${proseBlock(lead, topLevelPredicateText(guard, condition.text))}$NL$NL${proseBlock(st"When all applicability conditions are met, $OwnerMarker shall produce a result for which all of the following conditions hold:".render, topLevelPredicateText(statement.guarantees, guaranteeConstraint.text))}".render
        }
      case _ =>
        statement.guarantees match {
          case _ if semanticStatus(statement.guarantees) == Some("tautology") =>
            quoteLines(st"$scopeLead, $OwnerMarker has no additional obligation because the required result is always true.".render)
          case _ if semanticStatus(statement.guarantees) == Some("contradiction") =>
            quoteLines(st"$scopeLead, $OwnerMarker cannot meet the obligation because the required result is always false.".render)
          case _ if isNaturalPredicate(statement.guarantees) || isDirectOutcome(statement.guarantees) =>
            val lead = st"$scopeLead, $OwnerMarker shall".render
            quoteLines(st"$lead ${guarantee.text}.".render)
          case _ =>
            proseBlock(st"$scopeLead, $OwnerMarker shall produce a result for which all of the following conditions hold:".render,
              topLevelPredicateText(statement.guarantees, guaranteeConstraint.text))
        }
    }
    return success(
      st"""$heading Case ${quote(statement.id)}
          |${descriptionLine(statement.descriptor)}
          |${tracesLine(statement.posOpt)}
          |- Source: ${positionText(statement.posOpt)}
          |${metadataText(caseSemanticMetadata(statement))}
          |
          |$prose""".render)
  }

  def renderCase(statement: GclCaseStatement): SnlResult = {
    return renderCaseAt("####", statement, None())
  }

  // A handler is a compute-phase contract specialized to one dispatch port.
  // Keep its nested clauses scoped so identical guarantee text on two ports is
  // not mistaken for the same obligation.
  def renderHandler(handler: GclHandle): SnlResult = {
    val port = renderTerm(handler.port)
    if (!port.ok) return port
    var parts = ISZ[String]()
    if (handler.modifies.nonEmpty) {
      val r = renderModifies(handler.modifies)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (spec <- handler.assumes) {
      val r = renderSpecAt("#####", spec, Some(st"${phaseScope("COMPUTE")}, when handling an event on ${port.text}".render))
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (spec <- handler.guarantees) {
      val r = renderSpecAt("#####", spec, Some(st"${phaseScope("COMPUTE")}, when handling an event on ${port.text}".render))
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (statement <- handler.cases) {
      val r = renderCaseAt("#####", statement, Some(port.text))
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    val separator = st"$NL$NL".render
    return success(
      st"""#### Handler for ${port.text}
          |${tracesLine(handler.posOpt)}
          |- Source: ${positionText(handler.posOpt)}
          |${if (parts.nonEmpty) Some(st"$NL${(parts, separator)}".render) else Some(proseBlock("No handler clauses are defined.", ""))}""".render)
  }

  @pure def renderName(name: Name): String = st"${(name.name, ".")}".render

  // Composition schema rendering makes serial order and parallel split/join
  // structure visually distinct; those operators generate different proof
  // obligations even when they contain the same component occurrences.
  @pure def renderSchemaElement(element: GclSchemaElement): SnlResult = {
    element match {
      case component: GclSchemaComponentRef =>
        val occurrence = component.occurrenceLabelOpt match {
          case Some(label) => st" as occurrence ${quote(label)}".render
          case _ => ""
        }
        return success(st"Dispatch ${quote(renderName(component.component))}$occurrence".render)
      case label: GclSchemaLabel => return success(st"Label ${quote(label.id)}".render)
      case split: GclSchemaSplitJoin =>
        var branches = ISZ[String]()
        var i: Z = 1
        for (branch <- split.branches) {
          val r = renderSchemaSequence(branch)
          if (!r.ok) return r
          branches = branches :+ st"  - Branch $i, in order:$NL${indent(r.text, "    ")}".render
          i = i + 1
        }
        val separator = st"$NL".render
        return success(st"Parallel split/join:$NL${(branches, separator)}".render)
    }
  }

  @pure def renderSchemaSequence(sequence: GclSchemaSequence): SnlResult = {
    var elements = ISZ[String]()
    for (element <- sequence.elements) {
      val r = renderSchemaElement(element)
      if (!r.ok) return r
      elements = elements :+ listItem(r.text, "")
    }
    return success(st"${(elements, NL)}".render)
  }

  @pure def renderSchemaPoint(point: GclSchemaPoint): String = {
    point match {
      case _: GclPointStart => return "at cycle start"
      case _: GclPointEnd => return "at cycle end"
      case at: GclPointAt => return st"at label ${quote(at.label)}".render
      case before: GclPointBefore => return st"before occurrence ${quote(before.occurrence)}".render
      case after: GclPointAfter => return st"after occurrence ${quote(after.occurrence)}".render
    }
  }

  def renderPropertyBinding(binding: GclPropertyBinding): SnlResult = {
    // GclResolver has already flattened inherited properties and conjoined
    // same-point assertions. The formula is therefore effective, not merely
    // local. Upstream retains only the first contributor's source metadata;
    // that provenance limitation is recorded in the coverage ledger.
    val assertion = renderExp(binding.exp)
    if (!assertion.ok) return assertion
    return success(
      st"""##### Effective binding ${renderSchemaPoint(binding.point)}
          |${descriptionLine(binding.descriptor)}
          |${tracesLine(binding.posOpt)}
          |- Source: ${positionText(binding.posOpt)}
          |
          |${proseBlock("**Effective constraint.** The resolved composition binding requires:", assertion.text)}""".render)
  }

  def renderCompositionProperty(property: GclCompositionProperty): SnlResult = {
    var bindings = ISZ[String]()
    for (binding <- property.bindings) {
      val r = renderPropertyBinding(binding)
      if (!r.ok) return r
      bindings = bindings :+ r.text
    }
    val kind = if (property.isAbstract) "Abstract property" else "Property"
    val parents: Option[String] =
      if (property.parents.isEmpty) None()
      else Some(st"- Specializes: ${(for (parent <- property.parents) yield quote(parent), ", ")}".render)
    val bindingSeparator = st"$NL$NL".render
    val bindingText: Option[String] =
      if (bindings.nonEmpty) Some(st"$NL${(bindings, bindingSeparator)}".render)
      else Some(st"$NL${proseBlock("No bindings are defined.", "")}".render)
    return success(
      st"""#### $kind ${quote(property.id)}
          |${descriptionLine(property.descriptor)}
          |$parents
          |${tracesLine(property.posOpt)}
          |- Source: ${positionText(property.posOpt)}
          |$bindingText""".render)
  }

  def renderComposition(composition: GclComposition): SnlResult = {
    var parts = ISZ[String]()
    if (composition.componentAliases.nonEmpty) {
      val aliases = for (alias <- composition.componentAliases) yield
        st"- ${quote(alias.id)} denotes component ${quote(renderName(alias.componentPath))}.".render
      parts = parts :+ st"Component aliases:$NL$NL${(aliases, NL)}".render
    }
    if (composition.portAliases.nonEmpty) {
      val aliases = for (alias <- composition.portAliases) yield
        st"- ${quote(alias.id)} denotes port ${quote(renderName(alias.portPath))}.".render
      parts = parts :+ st"Port aliases:$NL$NL${(aliases, NL)}".render
    }
    if (composition.stateVarAliases.nonEmpty) {
      val aliases = for (alias <- composition.stateVarAliases) yield
        st"- ${quote(alias.id)} denotes state variable ${quote(renderName(alias.stateVarPath))}.".render
      parts = parts :+ st"State-variable aliases:$NL$NL${(aliases, NL)}".render
    }
    var schema = ISZ[String]()
    for (element <- composition.schema) {
      val r = renderSchemaElement(element)
      if (!r.ok) return r
      schema = schema :+ listItem(r.text, "")
    }
    parts = parts :+ st"Dispatch schema, in order:$NL$NL${(schema, NL)}".render
    for (property <- composition.properties) {
      val r = renderCompositionProperty(property)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    val separator = st"$NL$NL".render
    return success(
      st"""### Composition ${quote(composition.id)}
          |${tracesLine(composition.posOpt)}
          |- Source: ${positionText(composition.posOpt)}
          |
          |${(parts, separator)}""".render)
  }

  def renderFlow(flow: InfoFlowClause): SnlResult = {
    var from = ISZ[String]()
    var to = ISZ[String]()
    for (exp <- flow.from) {
      val r = renderTerm(exp)
      if (!r.ok) return r
      from = from :+ r.text
    }
    for (exp <- flow.to) {
      val r = renderTerm(exp)
      if (!r.ok) return r
      to = to :+ r.text
    }
    return success(
      st"""#### Information flow ${quote(flow.id)}
          |${descriptionLine(flow.descriptor)}
          |${tracesLine(flow.posOpt)}
          |- Source values: ${(from, ", ")}
          |- Destination values: ${(to, ", ")}""".render)
  }

  @pure def renderModifies(modifies: ISZ[AST.Exp]): SnlResult = {
    // Keep this as formal access metadata, not system behavior: FAA §2.2.5
    // (pp. 11–12) and NASA Appendices C.2/C.4 (pp. 236–237) warn against
    // leaking implementation detail into the wrong requirement level.
    var values = ISZ[String]()
    for (exp <- modifies) {
      val r = renderTerm(exp)
      if (!r.ok) return r
      values = values :+ r.text
    }
    return success(st"May modify: ${(values, ", ")}".render)
  }

  @pure def renderPhase(name: String, parts: ISZ[String]): SnlResult = {
    val title: String = name match {
      case string"COMPUTE" => "Compute"
      case string"INITIALIZATION" => "Initialization"
      case string"INTEGRATION" => "Integration"
      case _ => halt(st"unexpected contract phase: $name")
    }
    if (parts.isEmpty) return success(st"### $title phase${NL}No contract clauses are defined.".render)
    val separator = st"$NL$NL".render
    return success(st"### $title phase$NL${(parts, separator)}".render)
  }

  def renderCompute(compute: GclCompute): SnlResult = {
    var parts = ISZ[String]()
    if (compute.modifies.nonEmpty) {
      val r = renderModifies(compute.modifies)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (spec <- compute.assumes) {
      val r = renderSpecAt("####", spec, Some(phaseScope("COMPUTE")))
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (spec <- compute.guarantees) {
      val r = renderSpecAt("####", spec, Some(phaseScope("COMPUTE")))
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (statement <- compute.cases) {
      val r = renderCase(statement)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (handler <- compute.handlers) {
      val r = renderHandler(handler)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (flow <- compute.flows) {
      val r = renderFlow(flow)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    return renderPhase("COMPUTE", parts)
  }

  @pure def publicationSpecKind(spec: GclSpec): String = {
    spec match {
      case _: GclInvariant => return "Invariant"
      case _: GclAssume => return "Assumption"
      case _: GclGuarantee => return "Guarantee"
    }
  }

  @pure def publicationHeading(depth: Z, kind: String, id: String): String = {
    // Stable source IDs follow FAA §2.8.10 (p. 51), NASA Table 4.2-2 (p. 69),
    // Appendix C.4 (p. 238), and Appendix D (p. 240).
    val prefix: String = depth match {
      case z"3" => "###"
      case z"4" => "####"
      case z"5" => "#####"
      case _ => halt(st"unexpected publication heading depth: $depth")
    }
    return st"$prefix $kind ${quote(id)}".render
  }

  @pure def publicationSpec(owner: String, phase: Option[String], depth: Z,
                            scope: Option[String], spec: GclSpec): PublicationUnit = {
    val kind = publicationSpecKind(spec)
    return PublicationUnit(owner, phase, kind, spec.id, scope,
      publicationHeading(depth, kind, spec.id), spec.posOpt)
  }

  @pure def publicationCase(owner: String, phase: String, depth: Z,
                            scope: Option[String], statement: GclCaseStatement): PublicationUnit = {
    return PublicationUnit(owner, Some(phase), "Case", statement.id, scope,
      publicationHeading(depth, "Case", statement.id), statement.posOpt)
  }

  /** Collect the named clauses that publication profile 1 can expose.
    *
    * This is a second, structural walk over the same resolved GCL values used by
    * the renderer. It deliberately does not consult GUMBO source text or the
    * dataset's conservative navigation index.
    */
  def collectPublicationUnits(owner: ISZ[String], annex: GclSubclause): ISZ[PublicationUnit] = {
    val ownerText = st"${(owner, "::")}".render
    var units = ISZ[PublicationUnit]()
    for (invariant <- annex.invariants) {
      units = units :+ publicationSpec(ownerText, None(), 3, None(), invariant)
    }
    annex.integration match {
      case Some(integration) =>
        for (spec <- integration.specs) {
          units = units :+ publicationSpec(ownerText, Some("integration"), 4, None(), spec)
        }
      case _ =>
    }
    annex.initializes match {
      case Some(initialize) =>
        for (guarantee <- initialize.guarantees) {
          units = units :+ publicationSpec(ownerText, Some("initialization"), 4, None(), guarantee)
        }
      case _ =>
    }
    annex.compute match {
      case Some(compute) =>
        for (assume <- compute.assumes) {
          units = units :+ publicationSpec(ownerText, Some("compute"), 4, None(), assume)
        }
        for (guarantee <- compute.guarantees) {
          units = units :+ publicationSpec(ownerText, Some("compute"), 4, None(), guarantee)
        }
        for (statement <- compute.cases) {
          units = units :+ publicationCase(ownerText, "compute", 4, None(), statement)
        }
        for (handler <- compute.handlers) {
          val scope = Some(st"handler at ${positionText(handler.posOpt)}".render)
          for (assume <- handler.assumes) {
            units = units :+ publicationSpec(ownerText, Some("compute-handler"), 5, scope, assume)
          }
          for (guarantee <- handler.guarantees) {
            units = units :+ publicationSpec(ownerText, Some("compute-handler"), 5, scope, guarantee)
          }
          for (statement <- handler.cases) {
            units = units :+ publicationCase(ownerText, "compute-handler", 5, scope, statement)
          }
        }
      case _ =>
    }
    return units
  }

  @pure def isPublicationHeading(line: String): B = {
    val prefixes = ISZ("### Invariant `", "### Assumption `", "### Guarantee `", "### Case `",
      "#### Invariant `", "#### Assumption `", "#### Guarantee `", "#### Case `",
      "##### Invariant `", "##### Assumption `", "##### Guarantee `", "##### Case `")
    for (prefix <- prefixes if ops.StringOps(line).startsWith(prefix)) return T
    return F
  }

  @pure def proseWords(text: String): ISZ[String] = {
    var result = ISZ[String]()
    val lower = ops.StringOps(text).toLower
    for (word <- ops.StringOps(lower).split((c: C) =>
      !((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) if word.size > 0) {
      result = result :+ word
    }
    return result
  }

  @pure def proseOutsideCodeSpans(text: String): String = {
    var result = ""
    var outside = T
    for (part <- ops.StringOps(text).split((c: C) => c == '`')) {
      if (outside) result = st"$result $part".render
      outside = !outside
    }
    return result
  }

  /** Apply mechanically decidable portions of NASA Appendix C.1/C.3/C.4
    * (pp. 235–239): complete punctuation, one normative "shall", no competing
    * normative modal, no "and/or", no indefinite demonstrative, and no listed
    * unverifiable modifier. Semantic quality such as completeness or
    * feasibility remains explicitly outside this lexical check.
    */
  def verifyPublicationProse(text: String, units: ISZ[PublicationUnit]): SnlResult = {
    val lines = sourceLines(ops.StringOps(text).replaceAllLiterally(NL, "\n"))
    val banned = ISZ("should", "will", "must", "this", "these", "those", "its",
      "flexible", "easy", "sufficient", "safe", "adequate", "accommodate",
      "usable", "appropriate", "fast", "portable", "small", "large", "maximize",
      "minimize", "robust", "quickly", "easily", "clearly")
    val bannedPhrases = ISZ("as appropriate", "etc.", "and/or", "but not limited to",
      "ad hoc", "user-friendly", "when required", "if required", "light-weight")
    for (unit <- units) {
      var inSection = F
      var prose = ISZ[String]()
      var hasStatus = F
      for (line <- lines) {
        if (line == unit.heading) {
          inSection = T
        } else if (inSection && isPublicationHeading(line)) {
          inSection = F
        } else if (inSection && ops.StringOps(line).startsWith("- Semantic status:")) {
          hasStatus = T
        } else if (inSection && ops.StringOps(line).startsWith(">")) {
          val content = ops.StringOps(ops.StringOps(line).substring(1, line.size)).trim
          if (content.size > 0) prose = prose :+ content
        }
      }
      if (prose.isEmpty) return failure(st"publication unit ${unit.heading} has no prose for style validation".render)
      val joined = st"${(prose, " ")}".render
      val lexical = ops.StringOps(proseOutsideCodeSpans(joined)).toLower
      val last = prose(prose.size - 1)
      if (!(ops.StringOps(last).endsWith(".") || ops.StringOps(last).endsWith("!") ||
        ops.StringOps(last).endsWith("?"))) {
        return failure(st"publication unit ${unit.heading} does not end as a complete sentence".render)
      }
      for (phrase <- bannedPhrases if ops.StringOps(lexical).contains(phrase)) {
        return failure(st"publication unit ${unit.heading} contains prohibited prose phrase '$phrase'".render)
      }
      val words = proseWords(lexical)
      var shallCount: Z = 0
      for (word <- words) {
        if (word == "shall") shallCount = shallCount + 1
        if (ops.ISZOps(banned).contains(word)) {
          return failure(st"publication unit ${unit.heading} contains prohibited prose word '$word'".render)
        }
      }
      val expectedShall: Z = if (unit.kind == "Assumption" || hasStatus) 0 else 1
      if (shallCount != expectedShall) {
        return failure(st"publication unit ${unit.heading} contains $shallCount normative 'shall' token(s); expected $expectedShall".render)
      }
    }
    return success(text)
  }

  /** Prove that prose and native resolved-tree inventory correspond exactly.
    * FAA §2.8.10 (p. 51), NASA Table 4.2-2 (p. 69), Appendix C.4 (p. 238),
    * and Appendix D (p. 240) all depend on stable, unique identifiers.
    */
  def verifyPublicationRendering(text: String, units: ISZ[PublicationUnit]): SnlResult = {
    val uniqueIdCheck = verifyGlobalPublicationIds(units)
    if (!uniqueIdCheck.ok) return uniqueIdCheck
    val lines = sourceLines(ops.StringOps(text).replaceAllLiterally(NL, "\n"))
    var renderedCount: Z = 0
    for (line <- lines if isPublicationHeading(line)) renderedCount = renderedCount + 1
    if (renderedCount != units.size) {
      return failure(st"resolved publication inventory has ${units.size} unit(s), but rendered prose has $renderedCount named clause heading(s)".render)
    }
    var checked = Set.empty[String]
    for (unit <- units if !checked.contains(unit.heading)) {
      checked = checked + unit.heading
      var expected: Z = 0
      var actual: Z = 0
      for (candidate <- units if candidate.heading == unit.heading) expected = expected + 1
      for (line <- lines if line == unit.heading) actual = actual + 1
      if (actual != expected) {
        return failure(st"resolved publication unit ${unit.heading} occurs $expected time(s) in the inventory but $actual time(s) in rendered prose".render)
      }
    }
    return verifyPublicationProse(text, units)
  }

  def verifyGlobalPublicationIds(units: ISZ[PublicationUnit]): SnlResult = {
    var seen = Set.empty[String]
    for (unit <- units) {
      if (seen.contains(unit.formalId)) {
        return failure(st"formal identifier ${quote(unit.formalId)} is not globally unique; direct SNL/SysML joins require one publication unit per identifier".render)
      }
      seen = seen + unit.formalId
    }
    return success("")
  }

  @pure def jsonQuote(value: String): String = Json.Printer.printString(value).render

  @pure def jsonStrings(values: ISZ[String]): String = {
    return st"[${(for (value <- values) yield jsonQuote(value), ", ")}]".render
  }

  @pure def jsonOption(value: Option[String]): String = {
    value match {
      case Some(text) => return jsonQuote(text)
      case _ => return "null"
    }
  }

  @pure def definitiveSourceUri(pos: Position): Option[String] = {
    pos.uriOpt match {
      case Some(uri) =>
        val source = Os.Path.fromUri(uri).canon.value
        val workspace = Os.cwd.canon.value
        val prefix = st"$workspace/".render
        if (ops.StringOps(source).startsWith(prefix)) {
          val relative = ops.StringOps(source).substring(prefix.size, source.size)
          return Some(st"workspace:$relative".render)
        }
        return Some(uri)
      case _ => return None()
    }
  }

  @pure def publicationPositionJson(posOpt: Option[Position]): String = {
    posOpt match {
      case Some(pos) =>
        // NASA Appendix D (p. 240) requires a definitive source, not only a
        // coordinate that is ambiguous without its document.
        return st"{\"uri\": ${jsonOption(definitiveSourceUri(pos))}, \"line\": ${pos.beginLine}, \"column\": ${pos.beginColumn + 1}}".render
      case _ => return "null"
    }
  }

  def publicationUnitJson(ordinal: Z, unit: PublicationUnit): String = {
    return st"""{"ordinal": $ordinal, "owner": ${jsonQuote(unit.owner)}, "phase": ${jsonOption(unit.phase)}, "kind": ${jsonQuote(unit.kind)}, "formal_id": ${jsonQuote(unit.formalId)}, "scope": ${jsonOption(unit.scope)}, "source": ${publicationPositionJson(unit.posOpt)}, "trace_ids": ${jsonStrings(traceIds(unit.posOpt))}}""".render
  }

  def renderPublicationInventory(units: ISZ[PublicationUnit]): String = {
    var records = ISZ[String]()
    var ordinal: Z = 1
    for (unit <- units) {
      records = records :+ publicationUnitJson(ordinal, unit)
      ordinal = ordinal + 1
    }
    var traceCount: Z = 0
    var sourceUriCount: Z = 0
    for (unit <- units) {
      if (traceIds(unit.posOpt).nonEmpty) traceCount = traceCount + 1
      unit.posOpt match {
        case Some(pos) if pos.uriOpt.nonEmpty => sourceUriCount = sourceUriCount + 1
        case _ =>
      }
    }
    return st"""{
               |  "schema_version": ${jsonQuote(PublicationInventorySchema)},
               |  "snl_style_version": ${jsonQuote(SnlStyleVersion)},
               |  "sireum_version": ${jsonQuote(SireumVersion)},
               |  "hamr_sysml_parser_version": ${jsonQuote(HamrSysmlParserVersion)},
               |  "semantic_authority": "Sireum FrontEnd.typeCheck / resolved GclAnnexClauseInfo",
               |  "publication_scope": "named invariant, assumption, guarantee, and case clauses",
               |  "render_assertion": {"status": "passed", "record_count": ${units.size}, "each_record_rendered_exactly_once": true},
               |  "quality_audit": {
               |    "schema_version": "snl-requirements-quality-audit-1.0.0",
               |    "automated_checks": {"global_formal_id_uniqueness": "passed", "generated_prose_style": "passed", "definitive_source_uri_count": $sourceUriCount, "trace_annotated_record_count": $traceCount},
               |    "engineering_review": {"cross_clause_completeness": "not_assessed", "conflicts_and_duplicates": "not_assessed", "explicit_dont_care_coverage": "not_assessed", "units_precision_tolerance_latency": "not_assessed", "rationale_coverage": "not_assessed", "verification_metadata": "not_assessed", "bidirectional_trace_coverage": "not_assessed", "abstraction_level": "not_assessed"},
               |    "basis": "FAA DOT/FAA/AR-08/32 sections 2.4.1, 2.5.6-2.5.7, 2.8.3-2.8.10, and 2.11; NASA SP-2016-6105 Rev. 2 Table 4.2-2 and Appendices C-D"
               |  },
               |  "records": [
               |    ${(records, ",\n")}
               |  ]
               |}
               |""".render
  }

  def renderAnnex(owner: ISZ[String], annex: GclSubclause): SnlResult = {
    var parts = ISZ[String]()
    if (annex.state.nonEmpty) {
      val states = for (state <- annex.state) yield st"State ${quote(state.name)} has type ${quote(state.classifier)}.".render
      parts = parts ++ states
    }
    for (method <- annex.methods) {
      val r = renderMethod(method)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    for (invariant <- annex.invariants) {
      val r = renderSpecAt("###", invariant)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    annex.integration match {
      case Some(integration) =>
        var integrationParts = ISZ[String]()
        for (spec <- integration.specs) {
          val r = renderSpecAt("####", spec, Some(phaseScope("INTEGRATION")))
          if (!r.ok) return r
          integrationParts = integrationParts :+ r.text
        }
        val phase = renderPhase("INTEGRATION", integrationParts)
        if (!phase.ok) return phase
        parts = parts :+ phase.text
      case _ =>
    }
    annex.initializes match {
      case Some(initialize) =>
        var initializeParts = ISZ[String]()
        if (initialize.modifies.nonEmpty) {
          val r = renderModifies(initialize.modifies)
          if (!r.ok) return r
          initializeParts = initializeParts :+ r.text
        }
        for (guarantee <- initialize.guarantees) {
          val r = renderSpecAt("####", guarantee, Some(phaseScope("INITIALIZATION")))
          if (!r.ok) return r
          initializeParts = initializeParts :+ r.text
        }
        for (flow <- initialize.flows) {
          val r = renderFlow(flow)
          if (!r.ok) return r
          initializeParts = initializeParts :+ r.text
        }
        val phase = renderPhase("INITIALIZATION", initializeParts)
        if (!phase.ok) return phase
        parts = parts :+ phase.text
      case _ =>
    }
    annex.compute match {
      case Some(compute) =>
        val r = renderCompute(compute)
        if (!r.ok) return r
        if (r.text.size > 0) parts = parts :+ r.text
      case _ =>
    }
    for (composition <- annex.compositions) {
      val r = renderComposition(composition)
      if (!r.ok) return r
      parts = parts :+ r.text
    }
    if (parts.isEmpty) {
      return failure(st"resolved empty GUMBO annex for ${(owner, "::")}".render)
    }
    val ownerLabel = if (owner.nonEmpty) quote(owner(owner.size - 1)) else quote(st"${(owner, "::")}".render)
    val renderedAnnex =
      st"""## Contract owner ${quote(st"${(owner, "::")}".render)}
          |- Source: ${positionText(annex.posOpt)}
          |
          |${(parts, "\n\n")}""".render
    return success(ops.StringOps(renderedAnnex).replaceAllLiterally(OwnerMarker, ownerLabel))
  }

  def renderLibrary(name: ISZ[String], annex: GclLib): SnlResult = {
    var methods = ISZ[String]()
    for (method <- annex.methods) {
      val r = renderMethod(method)
      if (!r.ok) return r
      methods = methods :+ r.text
    }
    if (methods.isEmpty) return failure(st"resolved empty GUMBO library ${(name, "::")}".render)
    return success(
      st"""## Contract library ${quote(st"${(name, "::")}".render)}
          |- Source: ${positionText(annex.posOpt)}
          |
          |${(methods, "\n\n")}""".render)
  }

  @pure def annexSourceKey(owner: ISZ[String], annex: GclSubclause): String = {
    val offset: Z = annex.posOpt match {
      case Some(pos) => pos.offset
      case _ => -1
    }
    val uri: String = annex.posOpt match {
      case Some(pos) if pos.uriOpt.nonEmpty => pos.uriOpt.get
      case _ => st"owner:${(owner, "::")}".render
    }
    return st"$uri:$offset".render
  }

  @pure def collectSysml(path: Os.Path): ISZ[Os.Path] = {
    if (path.isFile) return ISZ(path.canon)
    if (!path.isDir) return ISZ()
    var files = ISZ[Os.Path]()
    for (file <- Os.Path.walk(path, T, T, p => p.ext == string"sysml")) {
      files = files :+ file.canon
    }
    return ops.ISZOps(files).sortWith((a, b) => a.string <= b.string)
  }

  @pure def defaultLibrary(): Option[Os.Path] = {
    Os.env("SYSML_AADL_LIBRARIES") match {
      case Some(value) => return Some(Os.path(value))
      case _ =>
    }
    val candidate = Os.cwd / "external/sysml-aadl-libraries"
    if (candidate.isDir) return Some(candidate)
    return None()
  }

  def usage(): Unit = {
    eprintln(st"usage: sireum slang run src/snl_parser/SnlRules.scala (--model <file-or-dir> [--library <external/sysml-aadl-libraries>] [--inventory-output <inventory.json>] (--output <snl.md> | --stdout) | --audit-fail-closed)".render)
  }

  def main(args: ISZ[String]): Z = {
    var modelOpt: Option[Os.Path] = None()
    var libraryOpt: Option[Os.Path] = None()
    var outputOpt: Option[Os.Path] = None()
    var inventoryOutputOpt: Option[Os.Path] = None()
    var stdout = F
    var auditFailClosed = F
    var i: Z = 0
    while (i < args.size) {
      args(i) match {
        case string"--model" if i + 1 < args.size =>
          modelOpt = Some(Os.path(args(i + 1)))
          i = i + 2
        case string"--library" if i + 1 < args.size =>
          libraryOpt = Some(Os.path(args(i + 1)))
          i = i + 2
        case string"--output" if i + 1 < args.size =>
          outputOpt = Some(Os.path(args(i + 1)))
          i = i + 2
        case string"--inventory-output" if i + 1 < args.size =>
          inventoryOutputOpt = Some(Os.path(args(i + 1)))
          i = i + 2
        case string"--stdout" =>
          stdout = T
          i = i + 1
        case string"--audit-fail-closed" =>
          auditFailClosed = T
          i = i + 1
        case string"--help" =>
          usage()
          return 0
        case arg =>
          eprintln(st"unexpected or incomplete argument: $arg".render)
          usage()
          return 64
      }
    }
    if (auditFailClosed) {
      if (args.size != 1) {
        usage()
        return 64
      }
      // Tuple expressions are valid Slang AST nodes but are not a proven
      // output of the pinned GUMBO front end. This deliberate unknown node
      // makes fail-closed behavior executable without inventing SysML syntax.
      val r = renderExp(AST.Exp.Tuple(ISZ(), AST.TypedAttr(None(), None())))
      if (r.ok) {
        eprintln("SNL fail-closed audit unexpectedly rendered an unknown node")
        return 1
      }
      eprintln(st"SNL fail-closed audit: ${r.text}".render)
      return 3
    }
    if (modelOpt.isEmpty || (outputOpt.isEmpty && !stdout) || (outputOpt.nonEmpty && stdout)) {
      usage()
      return 64
    }
    if (outputOpt.nonEmpty && inventoryOutputOpt.nonEmpty && outputOpt.get.canon == inventoryOutputOpt.get.canon) {
      eprintln("--output and --inventory-output must name different files")
      return 64
    }
    if (libraryOpt.isEmpty) libraryOpt = defaultLibrary()
    if (libraryOpt.isEmpty) {
      eprintln("no SysML AADL library found; pass --library or set SYSML_AADL_LIBRARIES")
      return 66
    }

    val modelFiles = collectSysml(modelOpt.get)
    val libraryFiles = collectSysml(libraryOpt.get)
    if (modelFiles.isEmpty) {
      eprintln(st"no .sysml input files found under ${modelOpt.get}".render)
      return 66
    }
    if (libraryFiles.isEmpty) {
      eprintln(st"no .sysml library files found under ${libraryOpt.get}".render)
      return 66
    }

    var inputs = ISZ[Input]()
    for (file <- libraryFiles ++ modelFiles) {
      inputs = inputs :+ Input(content = file.read, fileUri = Some(file.toUri))
    }
    val reporter = Reporter.create
    val (_, modelElements, _) = FrontEnd.typeCheck(par = 0, inputs = inputs, store = Map.empty, reporter = reporter)
    if (reporter.hasError) {
      reporter.printMessages()
      eprintln("SNL rendering stopped because Sireum parsing/resolution/typechecking failed")
      return 2
    }

    var seen = Set.empty[String]
    var rendered = ISZ[SnlRendered]()

    // Annex libraries live outside annexClauseInfos, so they require their own
    // explicit walk. Deduplication is necessary because FrontEnd model elements
    // can share a symbol table containing the same resolved library.
    for (model <- modelElements; info <- model.symbolTable.annexLibInfos) {
      info match {
        case GclAnnexLibInfo(annex, name, _) if annex.methods.nonEmpty =>
          val offset: Z = annex.posOpt match {
            case Some(pos) => pos.offset
            case _ => -1
          }
          val sourceKey = st"library:${(name, "::")}:$offset".render
          if (!seen.contains(sourceKey)) {
            seen = seen + sourceKey
            val r = renderLibrary(name, annex)
            if (!r.ok) {
              eprintln(st"SNL rendering stopped: ${r.text}".render)
              return 3
            }
            rendered = rendered :+ SnlRendered(sourceKey, st"0:${(name, "::")}:$offset".render, r.text, ISZ())
          }
        case _ =>
      }
    }

    for (model <- modelElements; entry <- model.symbolTable.annexClauseInfos.entries; info <- entry._2) {
      info match {
        case GclAnnexClauseInfo(annex, _) =>
          val owner: ISZ[String] = model.symbolTable.componentMap.get(entry._1) match {
            case Some(component) => component.classifier
            case _ => entry._1
          }
          val sourceKey = st"${(owner, "::")}:${annexSourceKey(owner, annex)}".render
          if (!seen.contains(sourceKey)) {
            seen = seen + sourceKey
            val r = renderAnnex(owner, annex)
            if (!r.ok) {
              eprintln(st"SNL rendering stopped: ${r.text}".render)
              return 3
            }
            val publicationUnits = collectPublicationUnits(owner, annex)
            val publicationCheck = verifyPublicationRendering(r.text, publicationUnits)
            if (!publicationCheck.ok) {
              eprintln(st"SNL rendering stopped: ${publicationCheck.text}".render)
              return 3
            }
            rendered = rendered :+ SnlRendered(sourceKey, st"1:${(owner, "::")}:${sourceKey}".render,
              r.text, publicationUnits)
          }
        case _ =>
      }
    }
    if (rendered.isEmpty) {
      eprintln("SNL rendering stopped: the typechecked model contains no resolved GUMBO annexes")
      return 3
    }
    rendered = ops.ISZOps(rendered).sortWith((a, b) => a.sortKey <= b.sortKey)
    val documentWithMarkers =
      st"""# Structured natural-language view of resolved GUMBO
          |
          |- `SNL_STYLE_VERSION`: `$SnlStyleVersion`
          |- `SIREUM_VERSION`: `$SireumVersion`
          |- `HAMR_SYSML_PARSER_VERSION`: `$HamrSysmlParserVersion`
          |- `SEMANTIC_INPUT`: `FrontEnd.typeCheck` → `GclAnnexClauseInfo` / Slang AST
          |- `TRACE_ATTACHMENT`: immediately preceding contiguous `//` comment block
          |- `NUMERIC_LITERAL_NOTATION`: `value [family]`; exact family semantics are documented in `README.md`
          |- `COVERAGE`: all executable families successfully resolved by the pinned FrontEnd; see `GUMBO_GRAMMAR_COVERAGE.tsv` for upstream gaps and defensive-only rules
          |
          |${(for (r <- rendered) yield r.text, "\n\n")}
          |""".render
    val document = ops.StringOps(documentWithMarkers).replaceAllLiterally(NL, "\n")
    var publicationUnits = ISZ[PublicationUnit]()
    for (r <- rendered) publicationUnits = publicationUnits ++ r.publicationUnits
    val globalIdCheck = verifyGlobalPublicationIds(publicationUnits)
    if (!globalIdCheck.ok) {
      eprintln(st"SNL rendering stopped: ${globalIdCheck.text}".render)
      return 3
    }
    outputOpt match {
      case Some(output) =>
        output.up.mkdirAll()
        output.writeOver(document)
        println(st"Wrote ${output.canon}".render)
      case _ => println(document)
    }
    inventoryOutputOpt match {
      case Some(output) =>
        output.up.mkdirAll()
        output.writeOver(renderPublicationInventory(publicationUnits))
        println(st"Wrote ${output.canon}".render)
      case _ =>
    }
    return 0
  }
}
