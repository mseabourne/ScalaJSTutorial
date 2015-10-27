package tutorial.webapp

import org.scalajs.dom;
import dom.document;
import scala.scalajs.js.JSApp;

def appendPar(targetNode: dom.Node, text: String): Unit = {
	val parNode = document.createElement("p")
	val textNode = document.createTextNode(text)
	parNode.appendChild(textNode)
	targetNode.appendChild(parNode)
}

object TutorialApp extends JSApp {
	def main() : Unit = {
		appendPar(document.body, "Hello world via scala!");
	}

}

