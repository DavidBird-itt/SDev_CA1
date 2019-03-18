
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", emps)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    <!-- Display errors -->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),format.raw/*10.17*/("""e.message<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.55*/("""
    """),_display_(/*15.6*/if(flash.containsKey("error"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
        """),format.raw/*16.9*/("""<div class="alert alert-success">
            """),_display_(/*17.14*/flash/*17.19*/.get("error")),format.raw/*17.32*/("""
        """),format.raw/*18.9*/("""</div>
    """)))}),format.raw/*19.6*/("""

    """),format.raw/*21.5*/("""<!-- Displaying the form itself -->
    """),_display_(/*22.6*/helper/*22.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*22.76*/ {_display_(Seq[Any](format.raw/*22.78*/("""
        """),format.raw/*23.37*/("""
        """),_display_(/*24.10*/CSRF/*24.14*/.formField),format.raw/*24.24*/("""

        """),format.raw/*26.9*/("""<div class="form-group">
            """),_display_(/*27.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*28.72*/("""
        """),format.raw/*29.9*/("""</div>
        <div class="form-group">
            """),_display_(/*31.14*/inputPassword(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.75*/("""
        """),format.raw/*33.9*/("""</div>

        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn primary">
        </div>

    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""


    
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,emps)

  def f:((Form[models.users.Login],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,emps) => apply(loginForm,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 19:14:21 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/login.scala.html
                  HASH: da4cbba526efb0c61fc6072e3604e0946af49b15
                  MATRIX: 989->1|1129->70|1173->87|1200->89|1227->108|1266->110|1297->115|1372->165|1409->194|1448->196|1483->205|1554->250|1601->282|1640->284|1685->301|1744->329|1780->338|1820->348|1853->403|1885->409|1924->439|1964->441|2000->450|2074->497|2088->502|2122->515|2158->524|2200->536|2233->542|2300->583|2315->589|2388->653|2428->655|2465->692|2502->702|2515->706|2546->716|2583->726|2648->764|2785->880|2821->889|2901->942|3048->1068|3084->1077|3250->1213|3279->1231
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|53->22|53->22|53->22|53->22|54->23|55->24|55->24|55->24|57->26|58->27|59->28|60->29|62->31|63->32|64->33|70->39|70->39
                  -- GENERATED --
              */
          