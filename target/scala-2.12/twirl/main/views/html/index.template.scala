
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emps: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home", emps)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
	"""),format.raw/*3.2*/("""<h1>Hello world!</h1>
""")))}))
      }
    }
  }

  def render(emps:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(emps)

  def f:((models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (emps) => apply(emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 10 21:30:04 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/index.scala.html
                  HASH: 306bb9d98e3025d5bc0fbb02c762b9476d53fc09
                  MATRIX: 963->1|1086->32|1112->50|1150->51|1178->53
                  LINES: 28->1|33->2|33->2|33->2|34->3
                  -- GENERATED --
              */
          