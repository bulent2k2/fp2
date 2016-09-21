package week4

import huffman._

object exprs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(148); 

  val sampleTree = makeCodeTree(
    makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
    Leaf('t', 2));System.out.println("""sampleTree  : week4.Fork = """ + $show(sampleTree ))}


}
