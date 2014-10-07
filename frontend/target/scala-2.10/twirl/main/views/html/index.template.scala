
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(original: String, after: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<h1>Original</h1>
    <p>"""),_display_(/*6.9*/original),format.raw/*6.17*/("""</p>
    <h1>After</h1>
    <p>"""),_display_(/*8.9*/after),format.raw/*8.14*/("""</p>

""")))}),format.raw/*10.2*/("""
"""))}
  }

  def render(original:String,after:String): play.twirl.api.HtmlFormat.Appendable = apply(original,after)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (original,after) => apply(original,after)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 07 15:59:25 CDT 2014
                  SOURCE: /Users/mdotson/akka-cluster-example/frontend/app/views/index.scala.html
                  HASH: 0f9814734d8e4635511a735c13458478abff88a5
                  MATRIX: 512->1|633->34|661->37|692->60|731->62|763->68|814->94|842->102|899->134|924->139|961->146
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|27->6|27->6|29->8|29->8|31->10
                  -- GENERATED --
              */
          