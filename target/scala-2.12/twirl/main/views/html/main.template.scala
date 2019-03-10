
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.Employee,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, emps: models.users.Employee)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
		<title>EMP """),_display_(/*5.15*/pagename),format.raw/*5.23*/("""</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<style>

		</style>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*19.60*/routes/*19.66*/.HomeController.index()),format.raw/*19.89*/("""">CA1</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li """),_display_(/*22.34*/if(pagename== "Home")/*22.55*/{_display_(Seq[Any](format.raw/*22.56*/("""class="active"""")))}),format.raw/*22.71*/("""><a href=""""),_display_(/*22.82*/routes/*22.88*/.HomeController.index()),format.raw/*22.111*/("""">Home</a></li>
                            <li """),_display_(/*23.34*/if(pagename== "Database")/*23.59*/{_display_(Seq[Any](format.raw/*23.60*/("""class="active"""")))}),format.raw/*23.75*/("""><a href=""""),_display_(/*23.86*/routes/*23.92*/.HomeController.databaseTest()),format.raw/*23.122*/("""">Database Test</a></li>
                            <li """),_display_(/*24.34*/if(pagename== "Login")/*24.56*/{_display_(Seq[Any](format.raw/*24.57*/("""class="active"""")))}),format.raw/*24.72*/("""><a href=""""),_display_(/*24.83*/routes/*24.89*/.LoginController.login()),format.raw/*24.113*/("""">Login</a></li>
                        </ul>
                    </div>
                </nav>
        """),_display_(/*28.10*/content),format.raw/*28.17*/("""
    """),format.raw/*29.5*/("""</body>
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("javascripts/main.js")),format.raw/*30.65*/(""""></script>
</html>"""))
      }
    }
  }

  def render(pagename:String,emps:models.users.Employee,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,emps)(content)

  def f:((String,models.users.Employee) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,emps) => (content) => apply(pagename,emps)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 10 21:30:04 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/main.scala.html
                  HASH: b11100f897de330ec1c55575901f99337acb6a3b
                  MATRIX: 974->1|1130->64|1201->109|1229->117|1804->665|1819->671|1863->694|2016->820|2046->841|2085->842|2131->857|2169->868|2184->874|2229->897|2305->946|2339->971|2378->972|2424->987|2462->998|2477->1004|2529->1034|2614->1092|2645->1114|2684->1115|2730->1130|2768->1141|2783->1147|2829->1171|2962->1277|2990->1284|3022->1289|3075->1315|3090->1321|3151->1361
                  LINES: 28->1|33->2|36->5|36->5|50->19|50->19|50->19|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|59->28|59->28|60->29|61->30|61->30|61->30
                  -- GENERATED --
              */
          